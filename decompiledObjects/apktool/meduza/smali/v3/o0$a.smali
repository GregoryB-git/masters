.class public final Lv3/o0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv3/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Landroid/net/Uri;

.field public c:Ljava/lang/String;

.field public d:Lv3/o0$b$a;

.field public e:Lv3/o0$d$a;

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly4/c;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/lang/String;

.field public h:Lo7/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/t<",
            "Lv3/o0$j;",
            ">;"
        }
    .end annotation
.end field

.field public i:Ljava/lang/Object;

.field public j:Lv3/p0;

.field public k:Lv3/o0$e$a;

.field public l:Lv3/o0$h;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lv3/o0$b$a;

    .line 5
    .line 6
    invoke-direct {v0}, Lv3/o0$b$a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lv3/o0$a;->d:Lv3/o0$b$a;

    .line 10
    .line 11
    new-instance v0, Lv3/o0$d$a;

    .line 12
    .line 13
    invoke-direct {v0}, Lv3/o0$d$a;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lv3/o0$a;->e:Lv3/o0$d$a;

    .line 17
    .line 18
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lv3/o0$a;->f:Ljava/util/List;

    .line 23
    .line 24
    sget-object v0, Lo7/l0;->e:Lo7/l0;

    .line 25
    .line 26
    iput-object v0, p0, Lv3/o0$a;->h:Lo7/t;

    .line 27
    .line 28
    new-instance v0, Lv3/o0$e$a;

    .line 29
    .line 30
    invoke-direct {v0}, Lv3/o0$e$a;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lv3/o0$a;->k:Lv3/o0$e$a;

    .line 34
    .line 35
    sget-object v0, Lv3/o0$h;->c:Lv3/o0$h;

    .line 36
    .line 37
    iput-object v0, p0, Lv3/o0$a;->l:Lv3/o0$h;

    .line 38
    .line 39
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method


# virtual methods
.method public final a()Lv3/o0;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lv3/o0$a;->e:Lv3/o0$d$a;

    .line 4
    .line 5
    iget-object v2, v1, Lv3/o0$d$a;->b:Landroid/net/Uri;

    .line 6
    .line 7
    if-eqz v2, :cond_1

    .line 8
    .line 9
    iget-object v1, v1, Lv3/o0$d$a;->a:Ljava/util/UUID;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 17
    :goto_1
    invoke-static {v1}, Lx6/b;->H(Z)V

    .line 18
    .line 19
    .line 20
    iget-object v3, v0, Lv3/o0$a;->b:Landroid/net/Uri;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    if-eqz v3, :cond_3

    .line 24
    .line 25
    new-instance v10, Lv3/o0$g;

    .line 26
    .line 27
    iget-object v4, v0, Lv3/o0$a;->c:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v2, v0, Lv3/o0$a;->e:Lv3/o0$d$a;

    .line 30
    .line 31
    iget-object v5, v2, Lv3/o0$d$a;->a:Ljava/util/UUID;

    .line 32
    .line 33
    if-eqz v5, :cond_2

    .line 34
    .line 35
    new-instance v1, Lv3/o0$d;

    .line 36
    .line 37
    invoke-direct {v1, v2}, Lv3/o0$d;-><init>(Lv3/o0$d$a;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    move-object v5, v1

    .line 41
    iget-object v6, v0, Lv3/o0$a;->f:Ljava/util/List;

    .line 42
    .line 43
    iget-object v7, v0, Lv3/o0$a;->g:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v8, v0, Lv3/o0$a;->h:Lo7/t;

    .line 46
    .line 47
    iget-object v9, v0, Lv3/o0$a;->i:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v2, v10

    .line 50
    invoke-direct/range {v2 .. v9}, Lv3/o0$g;-><init>(Landroid/net/Uri;Ljava/lang/String;Lv3/o0$d;Ljava/util/List;Ljava/lang/String;Lo7/t;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    move-object v14, v10

    .line 54
    goto :goto_2

    .line 55
    :cond_3
    move-object v14, v1

    .line 56
    :goto_2
    new-instance v1, Lv3/o0;

    .line 57
    .line 58
    iget-object v2, v0, Lv3/o0$a;->a:Ljava/lang/String;

    .line 59
    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    const-string v2, ""

    .line 64
    .line 65
    :goto_3
    move-object v12, v2

    .line 66
    iget-object v2, v0, Lv3/o0$a;->d:Lv3/o0$b$a;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance v13, Lv3/o0$c;

    .line 72
    .line 73
    invoke-direct {v13, v2}, Lv3/o0$c;-><init>(Lv3/o0$b$a;)V

    .line 74
    .line 75
    .line 76
    iget-object v2, v0, Lv3/o0$a;->k:Lv3/o0$e$a;

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance v15, Lv3/o0$e;

    .line 82
    .line 83
    iget-wide v4, v2, Lv3/o0$e$a;->a:J

    .line 84
    .line 85
    iget-wide v6, v2, Lv3/o0$e$a;->b:J

    .line 86
    .line 87
    iget-wide v8, v2, Lv3/o0$e$a;->c:J

    .line 88
    .line 89
    iget v10, v2, Lv3/o0$e$a;->d:F

    .line 90
    .line 91
    iget v11, v2, Lv3/o0$e$a;->e:F

    .line 92
    .line 93
    move-object v3, v15

    .line 94
    invoke-direct/range {v3 .. v11}, Lv3/o0$e;-><init>(JJJFF)V

    .line 95
    .line 96
    .line 97
    iget-object v2, v0, Lv3/o0$a;->j:Lv3/p0;

    .line 98
    .line 99
    if-eqz v2, :cond_5

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_5
    sget-object v2, Lv3/p0;->Q:Lv3/p0;

    .line 103
    .line 104
    :goto_4
    move-object/from16 v16, v2

    .line 105
    .line 106
    iget-object v2, v0, Lv3/o0$a;->l:Lv3/o0$h;

    .line 107
    .line 108
    move-object v11, v1

    .line 109
    move-object/from16 v17, v2

    .line 110
    .line 111
    invoke-direct/range {v11 .. v17}, Lv3/o0;-><init>(Ljava/lang/String;Lv3/o0$c;Lv3/o0$g;Lv3/o0$e;Lv3/p0;Lv3/o0$h;)V

    .line 112
    .line 113
    .line 114
    return-object v1
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
