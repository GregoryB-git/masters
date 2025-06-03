.class public final Lv6/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/reflect/Method;

.field public static final b:Ljava/lang/reflect/Method;

.field public static c:Ljava/lang/Boolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    .line 1
    const-class v0, Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "add"

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    :try_start_0
    const-class v5, Landroid/os/WorkSource;

    .line 12
    .line 13
    new-array v6, v3, [Ljava/lang/Class;

    .line 14
    .line 15
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    aput-object v7, v6, v2

    .line 18
    .line 19
    invoke-virtual {v5, v1, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-object v5, v4

    .line 25
    :goto_0
    sput-object v5, Lv6/i;->a:Ljava/lang/reflect/Method;

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    :try_start_1
    const-class v6, Landroid/os/WorkSource;

    .line 29
    .line 30
    new-array v7, v5, [Ljava/lang/Class;

    .line 31
    .line 32
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 33
    .line 34
    aput-object v8, v7, v2

    .line 35
    .line 36
    aput-object v0, v7, v3

    .line 37
    .line 38
    invoke-virtual {v6, v1, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 39
    .line 40
    .line 41
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 42
    goto :goto_1

    .line 43
    :catch_1
    move-object v1, v4

    .line 44
    :goto_1
    sput-object v1, Lv6/i;->b:Ljava/lang/reflect/Method;

    .line 45
    .line 46
    :try_start_2
    const-class v1, Landroid/os/WorkSource;

    .line 47
    .line 48
    const-string v6, "size"

    .line 49
    .line 50
    new-array v7, v2, [Ljava/lang/Class;

    .line 51
    .line 52
    invoke-virtual {v1, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 53
    .line 54
    .line 55
    :catch_2
    :try_start_3
    const-class v1, Landroid/os/WorkSource;

    .line 56
    .line 57
    const-string v6, "get"

    .line 58
    .line 59
    new-array v7, v3, [Ljava/lang/Class;

    .line 60
    .line 61
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 62
    .line 63
    aput-object v8, v7, v2

    .line 64
    .line 65
    invoke-virtual {v1, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 66
    .line 67
    .line 68
    :catch_3
    :try_start_4
    const-class v1, Landroid/os/WorkSource;

    .line 69
    .line 70
    const-string v6, "getName"

    .line 71
    .line 72
    new-array v7, v3, [Ljava/lang/Class;

    .line 73
    .line 74
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 75
    .line 76
    aput-object v8, v7, v2

    .line 77
    .line 78
    invoke-virtual {v1, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 79
    .line 80
    .line 81
    :catch_4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 82
    .line 83
    const/16 v6, 0x1c

    .line 84
    .line 85
    if-lt v1, v6, :cond_0

    .line 86
    .line 87
    move v1, v3

    .line 88
    goto :goto_2

    .line 89
    :cond_0
    move v1, v2

    .line 90
    :goto_2
    const-string v7, "WorkSourceUtil"

    .line 91
    .line 92
    if-eqz v1, :cond_1

    .line 93
    .line 94
    :try_start_5
    const-class v1, Landroid/os/WorkSource;

    .line 95
    .line 96
    const-string v8, "createWorkChain"

    .line 97
    .line 98
    new-array v9, v2, [Ljava/lang/Class;

    .line 99
    .line 100
    invoke-virtual {v1, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :catch_5
    move-exception v1

    .line 105
    const-string v8, "Missing WorkChain API createWorkChain"

    .line 106
    .line 107
    invoke-static {v7, v8, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 108
    .line 109
    .line 110
    :cond_1
    :goto_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 111
    .line 112
    if-lt v1, v6, :cond_2

    .line 113
    .line 114
    move v1, v3

    .line 115
    goto :goto_4

    .line 116
    :cond_2
    move v1, v2

    .line 117
    :goto_4
    if-eqz v1, :cond_3

    .line 118
    .line 119
    :try_start_6
    const-string v1, "android.os.WorkSource$WorkChain"

    .line 120
    .line 121
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    const-string v8, "addNode"

    .line 126
    .line 127
    new-array v5, v5, [Ljava/lang/Class;

    .line 128
    .line 129
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 130
    .line 131
    aput-object v9, v5, v2

    .line 132
    .line 133
    aput-object v0, v5, v3

    .line 134
    .line 135
    invoke-virtual {v1, v8, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    .line 136
    .line 137
    .line 138
    goto :goto_5

    .line 139
    :catch_6
    move-exception v0

    .line 140
    const-string v1, "Missing WorkChain class"

    .line 141
    .line 142
    invoke-static {v7, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 143
    .line 144
    .line 145
    :cond_3
    :goto_5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 146
    .line 147
    if-lt v0, v6, :cond_4

    .line 148
    .line 149
    move v0, v3

    .line 150
    goto :goto_6

    .line 151
    :cond_4
    move v0, v2

    .line 152
    :goto_6
    if-eqz v0, :cond_5

    .line 153
    .line 154
    :try_start_7
    const-class v0, Landroid/os/WorkSource;

    .line 155
    .line 156
    const-string v1, "isEmpty"

    .line 157
    .line 158
    new-array v2, v2, [Ljava/lang/Class;

    .line 159
    .line 160
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    .line 165
    .line 166
    .line 167
    :catch_7
    :cond_5
    sput-object v4, Lv6/i;->c:Ljava/lang/Boolean;

    .line 168
    .line 169
    return-void
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
