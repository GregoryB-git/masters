.class public final Lm8/h$a;
.super Lm8/f0$e$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:J

.field public e:Ljava/lang/Long;

.field public f:Z

.field public g:Lm8/f0$e$a;

.field public h:Lm8/f0$e$f;

.field public i:Lm8/f0$e$e;

.field public j:Lm8/f0$e$c;

.field public k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm8/f0$e$d;",
            ">;"
        }
    .end annotation
.end field

.field public l:I

.field public m:B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lm8/f0$e$b;-><init>()V

    return-void
.end method

.method public constructor <init>(Lm8/f0$e;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lm8/f0$e$b;-><init>()V

    invoke-virtual {p1}, Lm8/f0$e;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lm8/h$a;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lm8/f0$e;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lm8/h$a;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lm8/f0$e;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lm8/h$a;->c:Ljava/lang/String;

    invoke-virtual {p1}, Lm8/f0$e;->j()J

    move-result-wide v0

    iput-wide v0, p0, Lm8/h$a;->d:J

    invoke-virtual {p1}, Lm8/f0$e;->d()Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lm8/h$a;->e:Ljava/lang/Long;

    invoke-virtual {p1}, Lm8/f0$e;->l()Z

    move-result v0

    iput-boolean v0, p0, Lm8/h$a;->f:Z

    invoke-virtual {p1}, Lm8/f0$e;->a()Lm8/f0$e$a;

    move-result-object v0

    iput-object v0, p0, Lm8/h$a;->g:Lm8/f0$e$a;

    invoke-virtual {p1}, Lm8/f0$e;->k()Lm8/f0$e$f;

    move-result-object v0

    iput-object v0, p0, Lm8/h$a;->h:Lm8/f0$e$f;

    invoke-virtual {p1}, Lm8/f0$e;->i()Lm8/f0$e$e;

    move-result-object v0

    iput-object v0, p0, Lm8/h$a;->i:Lm8/f0$e$e;

    invoke-virtual {p1}, Lm8/f0$e;->c()Lm8/f0$e$c;

    move-result-object v0

    iput-object v0, p0, Lm8/h$a;->j:Lm8/f0$e$c;

    invoke-virtual {p1}, Lm8/f0$e;->e()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lm8/h$a;->k:Ljava/util/List;

    invoke-virtual {p1}, Lm8/f0$e;->g()I

    move-result p1

    iput p1, p0, Lm8/h$a;->l:I

    const/4 p1, 0x7

    iput-byte p1, p0, Lm8/h$a;->m:B

    return-void
.end method


# virtual methods
.method public final a()Lm8/h;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lm8/h$a;->m:B

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    if-ne v1, v2, :cond_1

    .line 7
    .line 8
    iget-object v4, v0, Lm8/h$a;->a:Ljava/lang/String;

    .line 9
    .line 10
    if-eqz v4, :cond_1

    .line 11
    .line 12
    iget-object v5, v0, Lm8/h$a;->b:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v5, :cond_1

    .line 15
    .line 16
    iget-object v11, v0, Lm8/h$a;->g:Lm8/f0$e$a;

    .line 17
    .line 18
    if-nez v11, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v1, Lm8/h;

    .line 22
    .line 23
    iget-object v6, v0, Lm8/h$a;->c:Ljava/lang/String;

    .line 24
    .line 25
    iget-wide v7, v0, Lm8/h$a;->d:J

    .line 26
    .line 27
    iget-object v9, v0, Lm8/h$a;->e:Ljava/lang/Long;

    .line 28
    .line 29
    iget-boolean v10, v0, Lm8/h$a;->f:Z

    .line 30
    .line 31
    iget-object v12, v0, Lm8/h$a;->h:Lm8/f0$e$f;

    .line 32
    .line 33
    iget-object v13, v0, Lm8/h$a;->i:Lm8/f0$e$e;

    .line 34
    .line 35
    iget-object v14, v0, Lm8/h$a;->j:Lm8/f0$e$c;

    .line 36
    .line 37
    iget-object v15, v0, Lm8/h$a;->k:Ljava/util/List;

    .line 38
    .line 39
    iget v2, v0, Lm8/h$a;->l:I

    .line 40
    .line 41
    move-object v3, v1

    .line 42
    move/from16 v16, v2

    .line 43
    .line 44
    invoke-direct/range {v3 .. v16}, Lm8/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ZLm8/f0$e$a;Lm8/f0$e$f;Lm8/f0$e$e;Lm8/f0$e$c;Ljava/util/List;I)V

    .line 45
    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_1
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    iget-object v2, v0, Lm8/h$a;->a:Ljava/lang/String;

    .line 54
    .line 55
    if-nez v2, :cond_2

    .line 56
    .line 57
    const-string v2, " generator"

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    :cond_2
    iget-object v2, v0, Lm8/h$a;->b:Ljava/lang/String;

    .line 63
    .line 64
    if-nez v2, :cond_3

    .line 65
    .line 66
    const-string v2, " identifier"

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    :cond_3
    iget-byte v2, v0, Lm8/h$a;->m:B

    .line 72
    .line 73
    and-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    if-nez v2, :cond_4

    .line 76
    .line 77
    const-string v2, " startedAt"

    .line 78
    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    :cond_4
    iget-byte v2, v0, Lm8/h$a;->m:B

    .line 83
    .line 84
    and-int/lit8 v2, v2, 0x2

    .line 85
    .line 86
    if-nez v2, :cond_5

    .line 87
    .line 88
    const-string v2, " crashed"

    .line 89
    .line 90
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    :cond_5
    iget-object v2, v0, Lm8/h$a;->g:Lm8/f0$e$a;

    .line 94
    .line 95
    if-nez v2, :cond_6

    .line 96
    .line 97
    const-string v2, " app"

    .line 98
    .line 99
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    :cond_6
    iget-byte v2, v0, Lm8/h$a;->m:B

    .line 103
    .line 104
    and-int/lit8 v2, v2, 0x4

    .line 105
    .line 106
    if-nez v2, :cond_7

    .line 107
    .line 108
    const-string v2, " generatorType"

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    :cond_7
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 114
    .line 115
    const-string v3, "Missing required properties:"

    .line 116
    .line 117
    invoke-static {v3, v1}, La0/j;->l(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v2
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
