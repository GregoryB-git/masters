.class public final Le7/y2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Le7/k6;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Le7/k6;I)V
    .locals 0

    iput p3, p0, Le7/y2;->a:I

    iput-object p2, p0, Le7/y2;->b:Le7/k6;

    iput-object p1, p0, Le7/y2;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Le7/y2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Le7/y2;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzig;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 12
    .line 13
    invoke-virtual {v0}, Le7/i6;->c0()V

    .line 14
    .line 15
    .line 16
    new-instance v0, Le7/n;

    .line 17
    .line 18
    iget-object v1, p0, Le7/y2;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzig;

    .line 21
    .line 22
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 23
    .line 24
    iget-object v2, p0, Le7/y2;->b:Le7/k6;

    .line 25
    .line 26
    iget-object v2, v2, Le7/k6;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Le7/i6;->c(Ljava/lang/String;)Landroid/os/Bundle;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-direct {v0, v1}, Le7/n;-><init>(Landroid/os/Bundle;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :goto_0
    iget-object v0, p0, Le7/y2;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Le7/i6;

    .line 39
    .line 40
    iget-object v1, p0, Le7/y2;->b:Le7/k6;

    .line 41
    .line 42
    iget-object v1, v1, Le7/k6;->a:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Le7/i6;->H(Ljava/lang/String;)Le7/e3;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Le7/e3;->p()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    iget-object v0, p0, Le7/y2;->b:Le7/k6;

    .line 58
    .line 59
    iget-object v0, v0, Le7/k6;->C:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v0}, Le7/e3;->l(Ljava/lang/String;)Le7/e3;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Le7/e3;->p()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_0

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_0
    iget-object v0, p0, Le7/y2;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Le7/i6;

    .line 75
    .line 76
    iget-object v1, p0, Le7/y2;->b:Le7/k6;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Le7/i6;->e(Le7/k6;)Le7/k1;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Le7/k1;->g()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    goto :goto_2

    .line 87
    :cond_1
    :goto_1
    iget-object v0, p0, Le7/y2;->c:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Le7/i6;

    .line 90
    .line 91
    invoke-virtual {v0}, Le7/i6;->zzj()Le7/a1;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iget-object v0, v0, Le7/a1;->w:Le7/b1;

    .line 96
    .line 97
    const-string v1, "Analytics storage consent denied. Returning null app instance id"

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Le7/b1;->b(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    :goto_2
    return-object v0

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 106
    .line 107
    .line 108
    .line 109
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
