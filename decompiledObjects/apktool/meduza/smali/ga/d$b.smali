.class public final Lga/d$b;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lga/d;->d(Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwb/i;",
        "Ldc/p<",
        "Lorg/json/JSONObject;",
        "Lub/e<",
        "-",
        "Lrb/h;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lwb/e;
    c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1"
    f = "RemoteSettings.kt"
    l = {
        0x7d,
        0x80,
        0x83,
        0x85,
        0x86,
        0x88
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Lec/s;

.field public b:Lec/s;

.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lga/d;


# direct methods
.method public constructor <init>(Lga/d;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lga/d;",
            "Lub/e<",
            "-",
            "Lga/d$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lga/d$b;->e:Lga/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lub/e;)Lub/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lub/e<",
            "*>;)",
            "Lub/e<",
            "Lrb/h;",
            ">;"
        }
    .end annotation

    new-instance v0, Lga/d$b;

    iget-object v1, p0, Lga/d$b;->e:Lga/d;

    invoke-direct {v0, v1, p2}, Lga/d$b;-><init>(Lga/d;Lub/e;)V

    iput-object p1, v0, Lga/d$b;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lorg/json/JSONObject;

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Lga/d$b;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lga/d$b;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Lga/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    const-string v0, "cache_duration"

    .line 2
    .line 3
    const-string v1, "session_timeout_seconds"

    .line 4
    .line 5
    const-string v2, "sampling_rate"

    .line 6
    .line 7
    const-string v3, "sessions_enabled"

    .line 8
    .line 9
    sget-object v4, Lvb/a;->a:Lvb/a;

    .line 10
    .line 11
    iget v5, p0, Lga/d$b;->c:I

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    packed-switch v5, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :pswitch_0
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_10

    .line 29
    .line 30
    :pswitch_1
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_e

    .line 34
    .line 35
    :pswitch_2
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_b

    .line 39
    .line 40
    :pswitch_3
    iget-object v0, p0, Lga/d$b;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lec/s;

    .line 43
    .line 44
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_9

    .line 48
    .line 49
    :pswitch_4
    iget-object v0, p0, Lga/d$b;->a:Lec/s;

    .line 50
    .line 51
    iget-object v1, p0, Lga/d$b;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Lec/s;

    .line 54
    .line 55
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_7

    .line 59
    .line 60
    :pswitch_5
    iget-object v0, p0, Lga/d$b;->b:Lec/s;

    .line 61
    .line 62
    iget-object v1, p0, Lga/d$b;->a:Lec/s;

    .line 63
    .line 64
    iget-object v2, p0, Lga/d$b;->d:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Lec/s;

    .line 67
    .line 68
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_4

    .line 72
    .line 73
    :pswitch_6
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lga/d$b;->d:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, Lorg/json/JSONObject;

    .line 79
    .line 80
    new-instance v5, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    const-string v7, "Fetched settings: "

    .line 86
    .line 87
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    const-string v7, "SessionConfigFetcher"

    .line 98
    .line 99
    invoke-static {v7, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    new-instance v5, Lec/s;

    .line 103
    .line 104
    invoke-direct {v5}, Lec/s;-><init>()V

    .line 105
    .line 106
    .line 107
    new-instance v8, Lec/s;

    .line 108
    .line 109
    invoke-direct {v8}, Lec/s;-><init>()V

    .line 110
    .line 111
    .line 112
    new-instance v9, Lec/s;

    .line 113
    .line 114
    invoke-direct {v9}, Lec/s;-><init>()V

    .line 115
    .line 116
    .line 117
    const-string v10, "app_quality"

    .line 118
    .line 119
    invoke-virtual {p1, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    if-eqz v11, :cond_3

    .line 124
    .line 125
    invoke-virtual {p1, v10}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    const-string v10, "null cannot be cast to non-null type org.json.JSONObject"

    .line 130
    .line 131
    invoke-static {p1, v10}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    check-cast p1, Lorg/json/JSONObject;

    .line 135
    .line 136
    :try_start_0
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    if-eqz v10, :cond_0

    .line 141
    .line 142
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    check-cast v3, Ljava/lang/Boolean;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_0
    move-object v3, v6

    .line 150
    :goto_0
    :try_start_1
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    if-eqz v10, :cond_1

    .line 155
    .line 156
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    check-cast v2, Ljava/lang/Double;

    .line 161
    .line 162
    iput-object v2, v5, Lec/s;->a:Ljava/lang/Object;

    .line 163
    .line 164
    :cond_1
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    if-eqz v2, :cond_2

    .line 169
    .line 170
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    check-cast v1, Ljava/lang/Integer;

    .line 175
    .line 176
    iput-object v1, v8, Lec/s;->a:Ljava/lang/Object;

    .line 177
    .line 178
    :cond_2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_4

    .line 183
    .line 184
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    check-cast p1, Ljava/lang/Integer;

    .line 189
    .line 190
    iput-object p1, v9, Lec/s;->a:Ljava/lang/Object;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :catch_0
    move-exception p1

    .line 194
    goto :goto_1

    .line 195
    :catch_1
    move-exception p1

    .line 196
    move-object v3, v6

    .line 197
    :goto_1
    const-string v0, "Error parsing the configs remotely fetched: "

    .line 198
    .line 199
    invoke-static {v7, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_3
    move-object v3, v6

    .line 204
    :cond_4
    :goto_2
    if-eqz v3, :cond_7

    .line 205
    .line 206
    iget-object p1, p0, Lga/d$b;->e:Lga/d;

    .line 207
    .line 208
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1}, Lga/d;->e()Lga/i;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    iput-object v5, p0, Lga/d$b;->d:Ljava/lang/Object;

    .line 216
    .line 217
    iput-object v8, p0, Lga/d$b;->a:Lec/s;

    .line 218
    .line 219
    iput-object v9, p0, Lga/d$b;->b:Lec/s;

    .line 220
    .line 221
    const/4 v0, 0x1

    .line 222
    iput v0, p0, Lga/d$b;->c:I

    .line 223
    .line 224
    sget-object v0, Lga/i;->c:Lr0/d$a;

    .line 225
    .line 226
    invoke-virtual {p1, v0, v3, p0}, Lga/i;->c(Lr0/d$a;Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    sget-object v0, Lvb/a;->a:Lvb/a;

    .line 231
    .line 232
    if-ne p1, v0, :cond_5

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_5
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 236
    .line 237
    :goto_3
    if-ne p1, v4, :cond_6

    .line 238
    .line 239
    return-object v4

    .line 240
    :cond_6
    move-object v2, v5

    .line 241
    move-object v1, v8

    .line 242
    move-object v0, v9

    .line 243
    :goto_4
    move-object v9, v0

    .line 244
    move-object v8, v1

    .line 245
    move-object v1, v2

    .line 246
    goto :goto_5

    .line 247
    :cond_7
    move-object v1, v5

    .line 248
    :goto_5
    iget-object p1, v8, Lec/s;->a:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast p1, Ljava/lang/Integer;

    .line 251
    .line 252
    if-eqz p1, :cond_9

    .line 253
    .line 254
    iget-object v0, p0, Lga/d$b;->e:Lga/d;

    .line 255
    .line 256
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0}, Lga/d;->e()Lga/i;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    iget-object v0, v8, Lec/s;->a:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v0, Ljava/lang/Integer;

    .line 266
    .line 267
    iput-object v1, p0, Lga/d$b;->d:Ljava/lang/Object;

    .line 268
    .line 269
    iput-object v9, p0, Lga/d$b;->a:Lec/s;

    .line 270
    .line 271
    iput-object v6, p0, Lga/d$b;->b:Lec/s;

    .line 272
    .line 273
    const/4 v2, 0x2

    .line 274
    iput v2, p0, Lga/d$b;->c:I

    .line 275
    .line 276
    sget-object v2, Lga/i;->e:Lr0/d$a;

    .line 277
    .line 278
    invoke-virtual {p1, v2, v0, p0}, Lga/i;->c(Lr0/d$a;Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    sget-object v0, Lvb/a;->a:Lvb/a;

    .line 283
    .line 284
    if-ne p1, v0, :cond_8

    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_8
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 288
    .line 289
    :goto_6
    if-ne p1, v4, :cond_9

    .line 290
    .line 291
    return-object v4

    .line 292
    :cond_9
    move-object v0, v9

    .line 293
    :goto_7
    iget-object p1, v1, Lec/s;->a:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast p1, Ljava/lang/Double;

    .line 296
    .line 297
    if-eqz p1, :cond_b

    .line 298
    .line 299
    iget-object v2, p0, Lga/d$b;->e:Lga/d;

    .line 300
    .line 301
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2}, Lga/d;->e()Lga/i;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    iget-object v1, v1, Lec/s;->a:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v1, Ljava/lang/Double;

    .line 311
    .line 312
    iput-object v0, p0, Lga/d$b;->d:Ljava/lang/Object;

    .line 313
    .line 314
    iput-object v6, p0, Lga/d$b;->a:Lec/s;

    .line 315
    .line 316
    iput-object v6, p0, Lga/d$b;->b:Lec/s;

    .line 317
    .line 318
    const/4 v2, 0x3

    .line 319
    iput v2, p0, Lga/d$b;->c:I

    .line 320
    .line 321
    sget-object v2, Lga/i;->d:Lr0/d$a;

    .line 322
    .line 323
    invoke-virtual {p1, v2, v1, p0}, Lga/i;->c(Lr0/d$a;Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    sget-object v1, Lvb/a;->a:Lvb/a;

    .line 328
    .line 329
    if-ne p1, v1, :cond_a

    .line 330
    .line 331
    goto :goto_8

    .line 332
    :cond_a
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 333
    .line 334
    :goto_8
    if-ne p1, v4, :cond_b

    .line 335
    .line 336
    return-object v4

    .line 337
    :cond_b
    :goto_9
    iget-object p1, v0, Lec/s;->a:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast p1, Ljava/lang/Integer;

    .line 340
    .line 341
    if-eqz p1, :cond_e

    .line 342
    .line 343
    iget-object v1, p0, Lga/d$b;->e:Lga/d;

    .line 344
    .line 345
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 346
    .line 347
    .line 348
    invoke-virtual {v1}, Lga/d;->e()Lga/i;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    iget-object v0, v0, Lec/s;->a:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v0, Ljava/lang/Integer;

    .line 355
    .line 356
    iput-object v6, p0, Lga/d$b;->d:Ljava/lang/Object;

    .line 357
    .line 358
    iput-object v6, p0, Lga/d$b;->a:Lec/s;

    .line 359
    .line 360
    iput-object v6, p0, Lga/d$b;->b:Lec/s;

    .line 361
    .line 362
    const/4 v1, 0x4

    .line 363
    iput v1, p0, Lga/d$b;->c:I

    .line 364
    .line 365
    sget-object v1, Lga/i;->f:Lr0/d$a;

    .line 366
    .line 367
    invoke-virtual {p1, v1, v0, p0}, Lga/i;->c(Lr0/d$a;Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object p1

    .line 371
    sget-object v0, Lvb/a;->a:Lvb/a;

    .line 372
    .line 373
    if-ne p1, v0, :cond_c

    .line 374
    .line 375
    goto :goto_a

    .line 376
    :cond_c
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 377
    .line 378
    :goto_a
    if-ne p1, v4, :cond_d

    .line 379
    .line 380
    return-object v4

    .line 381
    :cond_d
    :goto_b
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 382
    .line 383
    goto :goto_c

    .line 384
    :cond_e
    move-object p1, v6

    .line 385
    :goto_c
    if-nez p1, :cond_10

    .line 386
    .line 387
    iget-object p1, p0, Lga/d$b;->e:Lga/d;

    .line 388
    .line 389
    invoke-virtual {p1}, Lga/d;->e()Lga/i;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    const v0, 0x15180

    .line 394
    .line 395
    .line 396
    new-instance v1, Ljava/lang/Integer;

    .line 397
    .line 398
    invoke-direct {v1, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 399
    .line 400
    .line 401
    iput-object v6, p0, Lga/d$b;->d:Ljava/lang/Object;

    .line 402
    .line 403
    iput-object v6, p0, Lga/d$b;->a:Lec/s;

    .line 404
    .line 405
    iput-object v6, p0, Lga/d$b;->b:Lec/s;

    .line 406
    .line 407
    const/4 v0, 0x5

    .line 408
    iput v0, p0, Lga/d$b;->c:I

    .line 409
    .line 410
    sget-object v0, Lga/i;->f:Lr0/d$a;

    .line 411
    .line 412
    invoke-virtual {p1, v0, v1, p0}, Lga/i;->c(Lr0/d$a;Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    sget-object v0, Lvb/a;->a:Lvb/a;

    .line 417
    .line 418
    if-ne p1, v0, :cond_f

    .line 419
    .line 420
    goto :goto_d

    .line 421
    :cond_f
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 422
    .line 423
    :goto_d
    if-ne p1, v4, :cond_10

    .line 424
    .line 425
    return-object v4

    .line 426
    :cond_10
    :goto_e
    iget-object p1, p0, Lga/d$b;->e:Lga/d;

    .line 427
    .line 428
    invoke-virtual {p1}, Lga/d;->e()Lga/i;

    .line 429
    .line 430
    .line 431
    move-result-object p1

    .line 432
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 433
    .line 434
    .line 435
    move-result-wide v0

    .line 436
    new-instance v2, Ljava/lang/Long;

    .line 437
    .line 438
    invoke-direct {v2, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 439
    .line 440
    .line 441
    iput-object v6, p0, Lga/d$b;->d:Ljava/lang/Object;

    .line 442
    .line 443
    iput-object v6, p0, Lga/d$b;->a:Lec/s;

    .line 444
    .line 445
    iput-object v6, p0, Lga/d$b;->b:Lec/s;

    .line 446
    .line 447
    const/4 v0, 0x6

    .line 448
    iput v0, p0, Lga/d$b;->c:I

    .line 449
    .line 450
    sget-object v0, Lga/i;->g:Lr0/d$a;

    .line 451
    .line 452
    invoke-virtual {p1, v0, v2, p0}, Lga/i;->c(Lr0/d$a;Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object p1

    .line 456
    sget-object v0, Lvb/a;->a:Lvb/a;

    .line 457
    .line 458
    if-ne p1, v0, :cond_11

    .line 459
    .line 460
    goto :goto_f

    .line 461
    :cond_11
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 462
    .line 463
    :goto_f
    if-ne p1, v4, :cond_12

    .line 464
    .line 465
    return-object v4

    .line 466
    :cond_12
    :goto_10
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 467
    .line 468
    return-object p1

    .line 469
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
.end method
