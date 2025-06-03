.class public final Li2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/ClassLoader;

.field public final b:Lf2/b;

.field public final c:Le2/c;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;Lf2/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li2/h;->a:Ljava/lang/ClassLoader;

    iput-object p2, p0, Li2/h;->b:Lf2/b;

    new-instance p2, Le2/c;

    invoke-direct {p2, p1}, Le2/c;-><init>(Ljava/lang/ClassLoader;)V

    iput-object p2, p0, Li2/h;->c:Le2/c;

    return-void
.end method


# virtual methods
.method public final a()Landroidx/window/extensions/layout/WindowLayoutComponent;
    .locals 4

    .line 1
    iget-object v0, p0, Li2/h;->c:Le2/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Le2/a;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Le2/a;-><init>(Le2/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    :try_start_0
    invoke-virtual {v1}, Le2/a;->invoke()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    move v1, v2

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move v1, v3

    .line 19
    :goto_0
    if-eqz v1, :cond_0

    .line 20
    .line 21
    new-instance v1, Le2/b;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Le2/b;-><init>(Le2/c;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "WindowExtensionsProvider#getWindowExtensions is not valid"

    .line 27
    .line 28
    invoke-static {v0, v1}, Lp2/m0;->g0(Ljava/lang/String;Ldc/a;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    move v0, v2

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    move v0, v3

    .line 37
    :goto_1
    if-eqz v0, :cond_1

    .line 38
    .line 39
    new-instance v0, Li2/g;

    .line 40
    .line 41
    invoke-direct {v0, p0}, Li2/g;-><init>(Li2/h;)V

    .line 42
    .line 43
    .line 44
    const-string v1, "WindowExtensions#getWindowLayoutComponent is not valid"

    .line 45
    .line 46
    invoke-static {v1, v0}, Lp2/m0;->g0(Ljava/lang/String;Ldc/a;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    new-instance v0, Li2/d;

    .line 53
    .line 54
    invoke-direct {v0, p0}, Li2/d;-><init>(Li2/h;)V

    .line 55
    .line 56
    .line 57
    const-string v1, "FoldingFeature class is not valid"

    .line 58
    .line 59
    invoke-static {v1, v0}, Lp2/m0;->g0(Ljava/lang/String;Ldc/a;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    move v0, v2

    .line 66
    goto :goto_2

    .line 67
    :cond_1
    move v0, v3

    .line 68
    :goto_2
    if-nez v0, :cond_2

    .line 69
    .line 70
    goto :goto_5

    .line 71
    :cond_2
    sget-object v0, Lf2/d;->a:Lf2/d;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {}, Lf2/d;->a()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-ne v0, v2, :cond_3

    .line 81
    .line 82
    invoke-virtual {p0}, Li2/h;->b()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    goto :goto_5

    .line 87
    :cond_3
    const/4 v1, 0x2

    .line 88
    if-gt v1, v0, :cond_4

    .line 89
    .line 90
    const v1, 0x7fffffff

    .line 91
    .line 92
    .line 93
    if-gt v0, v1, :cond_4

    .line 94
    .line 95
    move v0, v2

    .line 96
    goto :goto_3

    .line 97
    :cond_4
    move v0, v3

    .line 98
    :goto_3
    if-eqz v0, :cond_6

    .line 99
    .line 100
    invoke-virtual {p0}, Li2/h;->b()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_5

    .line 105
    .line 106
    const-string v0, "WindowLayoutComponent#addWindowLayoutInfoListener("

    .line 107
    .line 108
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    const-class v1, Landroid/content/Context;

    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string v1, ", androidx.window.extensions.core.util.function.Consumer) is not valid"

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    new-instance v1, Li2/f;

    .line 131
    .line 132
    invoke-direct {v1, p0}, Li2/f;-><init>(Li2/h;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v0, v1}, Lp2/m0;->g0(Ljava/lang/String;Ldc/a;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_5

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_5
    move v2, v3

    .line 143
    :goto_4
    move v3, v2

    .line 144
    :cond_6
    :goto_5
    const/4 v0, 0x0

    .line 145
    if-eqz v3, :cond_7

    .line 146
    .line 147
    :try_start_1
    invoke-static {}, Landroidx/window/extensions/WindowExtensionsProvider;->getWindowExtensions()Landroidx/window/extensions/WindowExtensions;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-interface {v1}, Landroidx/window/extensions/WindowExtensions;->getWindowLayoutComponent()Landroidx/window/extensions/layout/WindowLayoutComponent;

    .line 152
    .line 153
    .line 154
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_1

    .line 155
    :catch_1
    :cond_7
    return-object v0
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

.method public final b()Z
    .locals 2

    .line 1
    const-string v0, "WindowLayoutComponent#addWindowLayoutInfoListener("

    .line 2
    .line 3
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Landroid/app/Activity;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", java.util.function.Consumer) is not valid"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Li2/e;

    .line 26
    .line 27
    invoke-direct {v1, p0}, Li2/e;-><init>(Li2/h;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lp2/m0;->g0(Ljava/lang/String;Ldc/a;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    return v0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
