.class public final Lhb/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/e2$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhb/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:Lhb/e;


# direct methods
.method public constructor <init>(Lhb/e;)V
    .locals 0

    iput-object p1, p0, Lhb/e$c;->a:Lhb/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lhb/e$d;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lhb/e$c;->a:Lhb/e;

    .line 4
    .line 5
    iget-wide v2, v0, Lhb/e;->h:J

    .line 6
    .line 7
    const-wide v4, 0x7fffffffffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long v2, v2, v4

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    move v10, v3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v2, 0x0

    .line 20
    move v10, v2

    .line 21
    :goto_0
    new-instance v2, Lhb/e$d;

    .line 22
    .line 23
    iget-object v5, v0, Lhb/e;->c:Lgb/j3;

    .line 24
    .line 25
    iget-object v6, v0, Lhb/e;->d:Lgb/j3;

    .line 26
    .line 27
    iget v4, v0, Lhb/e;->g:I

    .line 28
    .line 29
    invoke-static {v4}, Lq0/g;->c(I)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_2

    .line 34
    .line 35
    if-ne v4, v3, :cond_1

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    :goto_1
    move-object v7, v3

    .line 39
    goto :goto_2

    .line 40
    :cond_1
    new-instance v2, Ljava/lang/RuntimeException;

    .line 41
    .line 42
    const-string v3, "Unknown negotiation type: "

    .line 43
    .line 44
    invoke-static {v3}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iget v0, v0, Lhb/e;->g:I

    .line 49
    .line 50
    invoke-static {v0}, Lg;->p(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v2

    .line 65
    :cond_2
    :try_start_0
    iget-object v3, v0, Lhb/e;->e:Ljavax/net/ssl/SSLSocketFactory;

    .line 66
    .line 67
    if-nez v3, :cond_3

    .line 68
    .line 69
    const-string v3, "Default"

    .line 70
    .line 71
    sget-object v4, Lib/i;->d:Lib/i;

    .line 72
    .line 73
    iget-object v4, v4, Lib/i;->a:Ljava/security/Provider;

    .line 74
    .line 75
    invoke-static {v3, v4}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/net/ssl/SSLContext;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v3}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    iput-object v3, v0, Lhb/e;->e:Ljavax/net/ssl/SSLSocketFactory;

    .line 84
    .line 85
    :cond_3
    iget-object v3, v0, Lhb/e;->e:Ljavax/net/ssl/SSLSocketFactory;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :goto_2
    iget-object v8, v0, Lhb/e;->f:Lib/b;

    .line 89
    .line 90
    iget v9, v0, Lhb/e;->k:I

    .line 91
    .line 92
    iget-wide v11, v0, Lhb/e;->h:J

    .line 93
    .line 94
    iget-wide v13, v0, Lhb/e;->i:J

    .line 95
    .line 96
    iget v15, v0, Lhb/e;->j:I

    .line 97
    .line 98
    iget v3, v0, Lhb/e;->l:I

    .line 99
    .line 100
    iget-object v0, v0, Lhb/e;->b:Lgb/r3$a;

    .line 101
    .line 102
    move-object v4, v2

    .line 103
    move/from16 v16, v3

    .line 104
    .line 105
    move-object/from16 v17, v0

    .line 106
    .line 107
    invoke-direct/range {v4 .. v17}, Lhb/e$d;-><init>(Lgb/j3;Lgb/j3;Ljavax/net/ssl/SSLSocketFactory;Lib/b;IZJJIILgb/r3$a;)V

    .line 108
    .line 109
    .line 110
    return-object v2

    .line 111
    :catch_0
    move-exception v0

    .line 112
    new-instance v2, Ljava/lang/RuntimeException;

    .line 113
    .line 114
    const-string v3, "TLS Provider failure"

    .line 115
    .line 116
    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    throw v2
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
