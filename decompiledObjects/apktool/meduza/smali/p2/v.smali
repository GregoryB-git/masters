.class public final synthetic Lp2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p5, p0, Lp2/v;->a:I

    iput-object p1, p0, Lp2/v;->b:Ljava/lang/Object;

    iput-object p2, p0, Lp2/v;->c:Ljava/lang/Object;

    iput-object p3, p0, Lp2/v;->d:Ljava/lang/Object;

    iput-object p4, p0, Lp2/v;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lp2/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_1

    .line 7
    :pswitch_0
    iget-object v0, p0, Lp2/v;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lv3/z0$a;

    .line 10
    .line 11
    iget-object v1, p0, Lp2/v;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Landroid/util/Pair;

    .line 14
    .line 15
    iget-object v2, p0, Lp2/v;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lz4/n;

    .line 18
    .line 19
    iget-object v3, p0, Lp2/v;->e:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Lz4/q;

    .line 22
    .line 23
    iget-object v0, v0, Lv3/z0$a;->b:Lv3/z0;

    .line 24
    .line 25
    iget-object v0, v0, Lv3/z0;->h:Lw3/a;

    .line 26
    .line 27
    iget-object v4, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Lz4/t$b;

    .line 38
    .line 39
    invoke-interface {v0, v4, v1, v2, v3}, Lz4/w;->M(ILz4/t$b;Lz4/n;Lz4/q;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_1
    iget-object v0, p0, Lp2/v;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Ljava/util/List;

    .line 46
    .line 47
    iget-object v1, p0, Lp2/v;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Lx2/l;

    .line 50
    .line 51
    iget-object v2, p0, Lp2/v;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Landroidx/work/a;

    .line 54
    .line 55
    iget-object v3, p0, Lp2/v;->e:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, Landroidx/work/impl/WorkDatabase;

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_0

    .line 68
    .line 69
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, Lp2/t;

    .line 74
    .line 75
    iget-object v6, v1, Lx2/l;->a:Ljava/lang/String;

    .line 76
    .line 77
    invoke-interface {v5, v6}, Lp2/t;->c(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    invoke-static {v2, v3, v0}, Lp2/w;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :goto_1
    iget-object v0, p0, Lp2/v;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, Lz4/w$a;

    .line 88
    .line 89
    iget-object v1, p0, Lp2/v;->c:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v1, Lz4/w;

    .line 92
    .line 93
    iget-object v2, p0, Lp2/v;->d:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v2, Lz4/n;

    .line 96
    .line 97
    iget-object v3, p0, Lp2/v;->e:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v3, Lz4/q;

    .line 100
    .line 101
    iget v4, v0, Lz4/w$a;->a:I

    .line 102
    .line 103
    iget-object v0, v0, Lz4/w$a;->b:Lz4/t$b;

    .line 104
    .line 105
    invoke-interface {v1, v4, v0, v2, v3}, Lz4/w;->n0(ILz4/t$b;Lz4/n;Lz4/q;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
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
