.class public final Lx7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo7/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/x<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lo7/l0;

.field public static final c:Lo7/l0;

.field public static final d:Lo7/l0;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    .line 1
    const-string v0, "_ac"

    .line 2
    .line 3
    const-string v1, "campaign_details"

    .line 4
    .line 5
    const-string v2, "_ug"

    .line 6
    .line 7
    const-string v3, "_iapx"

    .line 8
    .line 9
    const-string v4, "_exp_set"

    .line 10
    .line 11
    const-string v5, "_exp_clear"

    .line 12
    .line 13
    const-string v6, "_exp_activate"

    .line 14
    .line 15
    const-string v7, "_exp_timeout"

    .line 16
    .line 17
    const-string v8, "_exp_expire"

    .line 18
    .line 19
    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget v1, Lo7/x;->c:I

    .line 24
    .line 25
    const/16 v1, 0xf

    .line 26
    .line 27
    new-array v2, v1, [Ljava/lang/Object;

    .line 28
    .line 29
    const-string v3, "_in"

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    aput-object v3, v2, v4

    .line 33
    .line 34
    const-string v3, "_xa"

    .line 35
    .line 36
    const/4 v5, 0x1

    .line 37
    aput-object v3, v2, v5

    .line 38
    .line 39
    const-string v3, "_xu"

    .line 40
    .line 41
    const/4 v6, 0x2

    .line 42
    aput-object v3, v2, v6

    .line 43
    .line 44
    const-string v3, "_aq"

    .line 45
    .line 46
    const/4 v7, 0x3

    .line 47
    aput-object v3, v2, v7

    .line 48
    .line 49
    const-string v3, "_aa"

    .line 50
    .line 51
    const/4 v8, 0x4

    .line 52
    aput-object v3, v2, v8

    .line 53
    .line 54
    const-string v3, "_ai"

    .line 55
    .line 56
    const/4 v9, 0x5

    .line 57
    aput-object v3, v2, v9

    .line 58
    .line 59
    const/4 v3, 0x6

    .line 60
    const/16 v10, 0x9

    .line 61
    .line 62
    invoke-static {v0, v4, v2, v3, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 63
    .line 64
    .line 65
    invoke-static {v1, v2}, Lo7/x;->p(I[Ljava/lang/Object;)Lo7/x;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, Lx7/b;->a:Lo7/x;

    .line 70
    .line 71
    sget-object v0, Lo7/t;->b:Lo7/t$b;

    .line 72
    .line 73
    const/4 v0, 0x7

    .line 74
    new-array v2, v0, [Ljava/lang/Object;

    .line 75
    .line 76
    const-string v10, "_e"

    .line 77
    .line 78
    aput-object v10, v2, v4

    .line 79
    .line 80
    const-string v10, "_f"

    .line 81
    .line 82
    aput-object v10, v2, v5

    .line 83
    .line 84
    const-string v10, "_iap"

    .line 85
    .line 86
    aput-object v10, v2, v6

    .line 87
    .line 88
    const-string v10, "_s"

    .line 89
    .line 90
    aput-object v10, v2, v7

    .line 91
    .line 92
    const-string v10, "_au"

    .line 93
    .line 94
    aput-object v10, v2, v8

    .line 95
    .line 96
    const-string v8, "_ui"

    .line 97
    .line 98
    aput-object v8, v2, v9

    .line 99
    .line 100
    const-string v8, "_cd"

    .line 101
    .line 102
    aput-object v8, v2, v3

    .line 103
    .line 104
    invoke-static {v0, v2}, Lx6/b;->w(I[Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v0, v2}, Lo7/t;->o(I[Ljava/lang/Object;)Lo7/l0;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sput-object v0, Lx7/b;->b:Lo7/l0;

    .line 112
    .line 113
    new-array v0, v7, [Ljava/lang/Object;

    .line 114
    .line 115
    const-string v2, "auto"

    .line 116
    .line 117
    aput-object v2, v0, v4

    .line 118
    .line 119
    const-string v2, "app"

    .line 120
    .line 121
    aput-object v2, v0, v5

    .line 122
    .line 123
    const-string v2, "am"

    .line 124
    .line 125
    aput-object v2, v0, v6

    .line 126
    .line 127
    invoke-static {v7, v0}, Lx6/b;->w(I[Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v7, v0}, Lo7/t;->o(I[Ljava/lang/Object;)Lo7/l0;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    sput-object v0, Lx7/b;->c:Lo7/l0;

    .line 135
    .line 136
    const-string v0, "_r"

    .line 137
    .line 138
    const-string v2, "_dbg"

    .line 139
    .line 140
    invoke-static {v0, v2}, Lo7/t;->u(Ljava/lang/Object;Ljava/lang/Object;)Lo7/l0;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    sput-object v0, Lx7/b;->d:Lo7/l0;

    .line 145
    .line 146
    new-instance v0, Lo7/t$a;

    .line 147
    .line 148
    invoke-direct {v0}, Lo7/t$a;-><init>()V

    .line 149
    .line 150
    .line 151
    sget-object v2, Lp2/m0;->a:[Ljava/lang/String;

    .line 152
    .line 153
    invoke-static {v1, v2}, Lx6/b;->w(I[Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    iget v3, v0, Lo7/r$a;->b:I

    .line 157
    .line 158
    add-int/2addr v3, v1

    .line 159
    invoke-virtual {v0, v3}, Lo7/r$a;->b(I)V

    .line 160
    .line 161
    .line 162
    iget-object v3, v0, Lo7/r$a;->a:[Ljava/lang/Object;

    .line 163
    .line 164
    iget v5, v0, Lo7/r$a;->b:I

    .line 165
    .line 166
    invoke-static {v2, v4, v3, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 167
    .line 168
    .line 169
    iget v2, v0, Lo7/r$a;->b:I

    .line 170
    .line 171
    add-int/2addr v2, v1

    .line 172
    iput v2, v0, Lo7/r$a;->b:I

    .line 173
    .line 174
    sget-object v2, Lp2/m0;->b:[Ljava/lang/String;

    .line 175
    .line 176
    invoke-static {v1, v2}, Lx6/b;->w(I[Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    iget v3, v0, Lo7/r$a;->b:I

    .line 180
    .line 181
    add-int/2addr v3, v1

    .line 182
    invoke-virtual {v0, v3}, Lo7/r$a;->b(I)V

    .line 183
    .line 184
    .line 185
    iget-object v3, v0, Lo7/r$a;->a:[Ljava/lang/Object;

    .line 186
    .line 187
    iget v5, v0, Lo7/r$a;->b:I

    .line 188
    .line 189
    invoke-static {v2, v4, v3, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 190
    .line 191
    .line 192
    iget v2, v0, Lo7/r$a;->b:I

    .line 193
    .line 194
    add-int/2addr v2, v1

    .line 195
    iput v2, v0, Lo7/r$a;->b:I

    .line 196
    .line 197
    invoke-virtual {v0}, Lo7/t$a;->e()Lo7/l0;

    .line 198
    .line 199
    .line 200
    const-string v0, "^_ltv_[A-Z]{3}$"

    .line 201
    .line 202
    const-string v1, "^_cc[1-5]{1}$"

    .line 203
    .line 204
    invoke-static {v0, v1}, Lo7/t;->u(Ljava/lang/Object;Ljava/lang/Object;)Lo7/l0;

    .line 205
    .line 206
    .line 207
    return-void
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
