.class public final synthetic Lva/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lva/d;

.field public final synthetic c:Lio/flutter/plugin/common/MethodCall;

.field public final synthetic d:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;Lva/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lva/o;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lva/o;->c:Lio/flutter/plugin/common/MethodCall;

    iput-object p2, p0, Lva/o;->d:Lio/flutter/plugin/common/MethodChannel$Result;

    iput-object p3, p0, Lva/o;->b:Lva/d;

    return-void
.end method

.method public synthetic constructor <init>(Lva/d;Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lva/o;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lva/o;->b:Lva/d;

    iput-object p2, p0, Lva/o;->c:Lio/flutter/plugin/common/MethodCall;

    iput-object p3, p0, Lva/o;->d:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    iget v0, p0, Lva/o;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    goto :goto_0

    .line 8
    :pswitch_0
    iget-object v0, p0, Lva/o;->c:Lio/flutter/plugin/common/MethodCall;

    .line 9
    .line 10
    iget-object v2, p0, Lva/o;->d:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 11
    .line 12
    iget-object v3, p0, Lva/o;->b:Lva/d;

    .line 13
    .line 14
    sget-object v4, Lva/s;->c:Ljava/util/HashMap;

    .line 15
    .line 16
    new-instance v4, Lwa/c;

    .line 17
    .line 18
    invoke-direct {v4, v0, v2}, Lwa/c;-><init>(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v0, Lva/b;

    .line 25
    .line 26
    invoke-direct {v0, v3, v4, v1}, Lva/b;-><init>(Lva/d;Lwa/c;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, v4, v0}, Lva/d;->l(Lwa/c;Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :goto_0
    iget-object v0, p0, Lva/o;->b:Lva/d;

    .line 34
    .line 35
    iget-object v2, p0, Lva/o;->c:Lio/flutter/plugin/common/MethodCall;

    .line 36
    .line 37
    iget-object v3, p0, Lva/o;->d:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 38
    .line 39
    sget-object v4, Lva/s;->c:Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 45
    .line 46
    const-string v5, "noResult"

    .line 47
    .line 48
    invoke-virtual {v2, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v4, v5}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 57
    .line 58
    const-string v6, "continueOnError"

    .line 59
    .line 60
    invoke-virtual {v2, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-virtual {v5, v6}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    const-string v6, "operations"

    .line 69
    .line 70
    invoke-virtual {v2, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Ljava/util/List;

    .line 75
    .line 76
    new-instance v6, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    const/4 v8, 0x0

    .line 90
    if-eqz v7, :cond_b

    .line 91
    .line 92
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    check-cast v7, Ljava/util/Map;

    .line 97
    .line 98
    new-instance v9, Lwa/b;

    .line 99
    .line 100
    invoke-direct {v9, v7, v4}, Lwa/b;-><init>(Ljava/util/Map;Z)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v9}, Lwa/b;->d()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 111
    .line 112
    .line 113
    const/4 v10, 0x1

    .line 114
    const/4 v11, -0x1

    .line 115
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 116
    .line 117
    .line 118
    move-result v12

    .line 119
    sparse-switch v12, :sswitch_data_0

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :sswitch_0
    const-string v12, "query"

    .line 124
    .line 125
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v12

    .line 129
    if-nez v12, :cond_1

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_1
    const/4 v11, 0x3

    .line 133
    goto :goto_2

    .line 134
    :sswitch_1
    const-string v12, "update"

    .line 135
    .line 136
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v12

    .line 140
    if-nez v12, :cond_2

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_2
    const/4 v11, 0x2

    .line 144
    goto :goto_2

    .line 145
    :sswitch_2
    const-string v12, "insert"

    .line 146
    .line 147
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v12

    .line 151
    if-nez v12, :cond_3

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_3
    const/4 v11, 0x1

    .line 155
    goto :goto_2

    .line 156
    :sswitch_3
    const-string v12, "execute"

    .line 157
    .line 158
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v12

    .line 162
    if-nez v12, :cond_4

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_4
    const/4 v11, 0x0

    .line 166
    :goto_2
    packed-switch v11, :pswitch_data_1

    .line 167
    .line 168
    .line 169
    const-string v0, "Batch method \'"

    .line 170
    .line 171
    const-string v1, "\' not supported"

    .line 172
    .line 173
    invoke-static {v0, v7, v1}, Lg;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    const-string v1, "bad_param"

    .line 178
    .line 179
    invoke-interface {v3, v1, v0, v8}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_6

    .line 183
    .line 184
    :pswitch_1
    invoke-virtual {v0, v9}, Lva/d;->e(Lm/e;)Z

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    if-eqz v7, :cond_5

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_5
    if-eqz v5, :cond_a

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :pswitch_2
    invoke-virtual {v0, v9}, Lva/d;->f(Lm/e;)Z

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    if-eqz v7, :cond_6

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_6
    if-eqz v5, :cond_a

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :pswitch_3
    invoke-virtual {v0, v9}, Lva/d;->d(Lm/e;)Z

    .line 205
    .line 206
    .line 207
    move-result v7

    .line 208
    if-eqz v7, :cond_7

    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_7
    if-eqz v5, :cond_a

    .line 212
    .line 213
    goto :goto_5

    .line 214
    :pswitch_4
    invoke-virtual {v0, v9}, Lva/d;->g(Lm/e;)Z

    .line 215
    .line 216
    .line 217
    move-result v7

    .line 218
    if-nez v7, :cond_8

    .line 219
    .line 220
    move v10, v1

    .line 221
    goto :goto_3

    .line 222
    :cond_8
    invoke-virtual {v9, v8}, Lwa/a;->a(Ljava/io/Serializable;)V

    .line 223
    .line 224
    .line 225
    :goto_3
    if-eqz v10, :cond_9

    .line 226
    .line 227
    :goto_4
    if-nez v4, :cond_0

    .line 228
    .line 229
    new-instance v7, Ljava/util/HashMap;

    .line 230
    .line 231
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 232
    .line 233
    .line 234
    iget-object v8, v9, Lwa/b;->c:Lwa/b$a;

    .line 235
    .line 236
    iget-object v8, v8, Lwa/b$a;->a:Ljava/lang/Object;

    .line 237
    .line 238
    const-string v9, "result"

    .line 239
    .line 240
    invoke-virtual {v7, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    goto/16 :goto_1

    .line 247
    .line 248
    :cond_9
    if-eqz v5, :cond_a

    .line 249
    .line 250
    :goto_5
    if-nez v4, :cond_0

    .line 251
    .line 252
    new-instance v7, Ljava/util/HashMap;

    .line 253
    .line 254
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 255
    .line 256
    .line 257
    new-instance v8, Ljava/util/HashMap;

    .line 258
    .line 259
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 260
    .line 261
    .line 262
    iget-object v10, v9, Lwa/b;->c:Lwa/b$a;

    .line 263
    .line 264
    iget-object v10, v10, Lwa/b$a;->b:Ljava/lang/String;

    .line 265
    .line 266
    const-string v11, "code"

    .line 267
    .line 268
    invoke-virtual {v8, v11, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    iget-object v10, v9, Lwa/b;->c:Lwa/b$a;

    .line 272
    .line 273
    iget-object v10, v10, Lwa/b$a;->c:Ljava/lang/String;

    .line 274
    .line 275
    const-string v11, "message"

    .line 276
    .line 277
    invoke-virtual {v8, v11, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    iget-object v9, v9, Lwa/b;->c:Lwa/b$a;

    .line 281
    .line 282
    iget-object v9, v9, Lwa/b$a;->d:Ljava/lang/Object;

    .line 283
    .line 284
    const-string v10, "data"

    .line 285
    .line 286
    invoke-virtual {v8, v10, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    const-string v9, "error"

    .line 290
    .line 291
    invoke-virtual {v7, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    goto/16 :goto_1

    .line 298
    .line 299
    :cond_a
    iget-object v0, v9, Lwa/b;->c:Lwa/b$a;

    .line 300
    .line 301
    iget-object v1, v0, Lwa/b$a;->b:Ljava/lang/String;

    .line 302
    .line 303
    iget-object v2, v0, Lwa/b$a;->c:Ljava/lang/String;

    .line 304
    .line 305
    iget-object v0, v0, Lwa/b$a;->d:Ljava/lang/Object;

    .line 306
    .line 307
    invoke-interface {v3, v1, v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    goto :goto_6

    .line 311
    :cond_b
    if-eqz v4, :cond_c

    .line 312
    .line 313
    invoke-interface {v3, v8}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    goto :goto_6

    .line 317
    :cond_c
    invoke-interface {v3, v6}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    :goto_6
    return-void

    .line 321
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    :sswitch_data_0
    .sparse-switch
        -0x4ea7088b -> :sswitch_3
        -0x468f3d47 -> :sswitch_2
        -0x31ffc737 -> :sswitch_1
        0x66f18c8 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
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
