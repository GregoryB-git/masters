.class public final Lu1/d$c;
.super Lec/j;
.source "SourceFile"

# interfaces
.implements Ldc/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu1/d;-><init>(Landroid/content/Context;Ljava/lang/String;Lt1/c$a;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lec/j;",
        "Ldc/a<",
        "Lu1/d$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lu1/d;


# direct methods
.method public constructor <init>(Lu1/d;)V
    .locals 0

    iput-object p1, p0, Lu1/d$c;->a:Lu1/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lec/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-object v0, p0, Lu1/d$c;->a:Lu1/d;

    .line 2
    .line 3
    iget-object v1, v0, Lu1/d;->b:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-boolean v0, v0, Lu1/d;->d:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/io/File;

    .line 12
    .line 13
    iget-object v1, p0, Lu1/d$c;->a:Lu1/d;

    .line 14
    .line 15
    iget-object v1, v1, Lu1/d;->a:Landroid/content/Context;

    .line 16
    .line 17
    const-string v2, "context"

    .line 18
    .line 19
    invoke-static {v1, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "context.noBackupFilesDir"

    .line 27
    .line 28
    invoke-static {v1, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Lu1/d$c;->a:Lu1/d;

    .line 32
    .line 33
    iget-object v2, v2, Lu1/d;->b:Ljava/lang/String;

    .line 34
    .line 35
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Lu1/d$b;

    .line 39
    .line 40
    iget-object v2, p0, Lu1/d$c;->a:Lu1/d;

    .line 41
    .line 42
    iget-object v4, v2, Lu1/d;->a:Landroid/content/Context;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    new-instance v6, Lu1/d$a;

    .line 49
    .line 50
    invoke-direct {v6}, Lu1/d$a;-><init>()V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lu1/d$c;->a:Lu1/d;

    .line 54
    .line 55
    iget-object v7, v0, Lu1/d;->c:Lt1/c$a;

    .line 56
    .line 57
    iget-boolean v8, v0, Lu1/d;->e:Z

    .line 58
    .line 59
    move-object v3, v1

    .line 60
    invoke-direct/range {v3 .. v8}, Lu1/d$b;-><init>(Landroid/content/Context;Ljava/lang/String;Lu1/d$a;Lt1/c$a;Z)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    new-instance v1, Lu1/d$b;

    .line 65
    .line 66
    iget-object v0, p0, Lu1/d$c;->a:Lu1/d;

    .line 67
    .line 68
    iget-object v10, v0, Lu1/d;->a:Landroid/content/Context;

    .line 69
    .line 70
    iget-object v11, v0, Lu1/d;->b:Ljava/lang/String;

    .line 71
    .line 72
    new-instance v12, Lu1/d$a;

    .line 73
    .line 74
    invoke-direct {v12}, Lu1/d$a;-><init>()V

    .line 75
    .line 76
    .line 77
    iget-object v13, v0, Lu1/d;->c:Lt1/c$a;

    .line 78
    .line 79
    iget-boolean v14, v0, Lu1/d;->e:Z

    .line 80
    .line 81
    move-object v9, v1

    .line 82
    invoke-direct/range {v9 .. v14}, Lu1/d$b;-><init>(Landroid/content/Context;Ljava/lang/String;Lu1/d$a;Lt1/c$a;Z)V

    .line 83
    .line 84
    .line 85
    :goto_0
    iget-object v0, p0, Lu1/d$c;->a:Lu1/d;

    .line 86
    .line 87
    iget-boolean v0, v0, Lu1/d;->o:Z

    .line 88
    .line 89
    invoke-virtual {v1, v0}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    .line 90
    .line 91
    .line 92
    return-object v1
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
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
