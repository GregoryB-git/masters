.class public final Lm8/b$a;
.super Lm8/f0$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Lm8/f0$e;

.field public k:Lm8/f0$d;

.field public l:Lm8/f0$a;

.field public m:B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lm8/f0$b;-><init>()V

    return-void
.end method

.method public constructor <init>(Lm8/f0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lm8/f0$b;-><init>()V

    invoke-virtual {p1}, Lm8/f0;->k()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lm8/b$a;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lm8/f0;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lm8/b$a;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lm8/f0;->j()I

    move-result v0

    iput v0, p0, Lm8/b$a;->c:I

    invoke-virtual {p1}, Lm8/f0;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lm8/b$a;->d:Ljava/lang/String;

    invoke-virtual {p1}, Lm8/f0;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lm8/b$a;->e:Ljava/lang/String;

    invoke-virtual {p1}, Lm8/f0;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lm8/b$a;->f:Ljava/lang/String;

    invoke-virtual {p1}, Lm8/f0;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lm8/b$a;->g:Ljava/lang/String;

    invoke-virtual {p1}, Lm8/f0;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lm8/b$a;->h:Ljava/lang/String;

    invoke-virtual {p1}, Lm8/f0;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lm8/b$a;->i:Ljava/lang/String;

    invoke-virtual {p1}, Lm8/f0;->l()Lm8/f0$e;

    move-result-object v0

    iput-object v0, p0, Lm8/b$a;->j:Lm8/f0$e;

    invoke-virtual {p1}, Lm8/f0;->i()Lm8/f0$d;

    move-result-object v0

    iput-object v0, p0, Lm8/b$a;->k:Lm8/f0$d;

    invoke-virtual {p1}, Lm8/f0;->a()Lm8/f0$a;

    move-result-object p1

    iput-object p1, p0, Lm8/b$a;->l:Lm8/f0$a;

    const/4 p1, 0x1

    iput-byte p1, p0, Lm8/b$a;->m:B

    return-void
.end method


# virtual methods
.method public final a()Lm8/b;
    .locals 15

    .line 1
    iget-byte v0, p0, Lm8/b$a;->m:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lm8/b$a;->a:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lm8/b$a;->b:Ljava/lang/String;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lm8/b$a;->d:Ljava/lang/String;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lm8/b$a;->h:Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lm8/b$a;->i:Ljava/lang/String;

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v0, Lm8/b;

    .line 28
    .line 29
    iget-object v3, p0, Lm8/b$a;->a:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v4, p0, Lm8/b$a;->b:Ljava/lang/String;

    .line 32
    .line 33
    iget v5, p0, Lm8/b$a;->c:I

    .line 34
    .line 35
    iget-object v6, p0, Lm8/b$a;->d:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v7, p0, Lm8/b$a;->e:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v8, p0, Lm8/b$a;->f:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v9, p0, Lm8/b$a;->g:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v10, p0, Lm8/b$a;->h:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v11, p0, Lm8/b$a;->i:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v12, p0, Lm8/b$a;->j:Lm8/f0$e;

    .line 48
    .line 49
    iget-object v13, p0, Lm8/b$a;->k:Lm8/f0$d;

    .line 50
    .line 51
    iget-object v14, p0, Lm8/b$a;->l:Lm8/f0$a;

    .line 52
    .line 53
    move-object v2, v0

    .line 54
    invoke-direct/range {v2 .. v14}, Lm8/b;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm8/f0$e;Lm8/f0$d;Lm8/f0$a;)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    iget-object v2, p0, Lm8/b$a;->a:Ljava/lang/String;

    .line 64
    .line 65
    if-nez v2, :cond_2

    .line 66
    .line 67
    const-string v2, " sdkVersion"

    .line 68
    .line 69
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    :cond_2
    iget-object v2, p0, Lm8/b$a;->b:Ljava/lang/String;

    .line 73
    .line 74
    if-nez v2, :cond_3

    .line 75
    .line 76
    const-string v2, " gmpAppId"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    :cond_3
    iget-byte v2, p0, Lm8/b$a;->m:B

    .line 82
    .line 83
    and-int/2addr v1, v2

    .line 84
    if-nez v1, :cond_4

    .line 85
    .line 86
    const-string v1, " platform"

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    :cond_4
    iget-object v1, p0, Lm8/b$a;->d:Ljava/lang/String;

    .line 92
    .line 93
    if-nez v1, :cond_5

    .line 94
    .line 95
    const-string v1, " installationUuid"

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    :cond_5
    iget-object v1, p0, Lm8/b$a;->h:Ljava/lang/String;

    .line 101
    .line 102
    if-nez v1, :cond_6

    .line 103
    .line 104
    const-string v1, " buildVersion"

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    :cond_6
    iget-object v1, p0, Lm8/b$a;->i:Ljava/lang/String;

    .line 110
    .line 111
    if-nez v1, :cond_7

    .line 112
    .line 113
    const-string v1, " displayVersion"

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 119
    .line 120
    const-string v2, "Missing required properties:"

    .line 121
    .line 122
    invoke-static {v2, v0}, La0/j;->l(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v1
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
