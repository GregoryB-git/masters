.class public Lcom/ryanheise/audioservice/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ryanheise/audioservice/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Landroid/app/Activity;

.field public final c:LE5/c;

.field public final d:LE5/k;

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(LE5/c;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/ryanheise/audioservice/a$d;->c:LE5/c;

    .line 5
    .line 6
    new-instance v0, LE5/k;

    .line 7
    .line 8
    const-string v1, "com.ryanheise.audio_service.client.methods"

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, LE5/k;-><init>(LE5/c;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/ryanheise/audioservice/a$d;->d:LE5/k;

    .line 14
    .line 15
    invoke-virtual {v0, p0}, LE5/k;->e(LE5/k$c;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static synthetic a(Lcom/ryanheise/audioservice/a$d;)Landroid/app/Activity;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ryanheise/audioservice/a$d;->b:Landroid/app/Activity;

    return-object p0
.end method

.method public static synthetic b(Lcom/ryanheise/audioservice/a$d;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/ryanheise/audioservice/a$d;->d(Landroid/app/Activity;)V

    return-void
.end method

.method public static synthetic c(Lcom/ryanheise/audioservice/a$d;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/ryanheise/audioservice/a$d;->e(Landroid/content/Context;)V

    return-void
.end method

.method private d(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ryanheise/audioservice/a$d;->b:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final e(Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ryanheise/audioservice/a$d;->a:Landroid/content/Context;

    return-void
.end method

.method public f(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ryanheise/audioservice/a$d;->f:Z

    return-void
.end method

.method public g(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ryanheise/audioservice/a$d;->e:Z

    return-void
.end method

.method public h()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/a$d;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getFlags()I

    move-result v0

    const/high16 v1, 0x100000

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onMethodCall(LE5/j;LE5/k$d;)V
    .locals 6

    .line 1
    const-string v0, "artDownscaleHeight"

    .line 2
    .line 3
    const-string v1, "artDownscaleWidth"

    .line 4
    .line 5
    const-string v2, "notificationColor"

    .line 6
    .line 7
    :try_start_0
    iget-boolean v3, p0, Lcom/ryanheise/audioservice/a$d;->e:Z

    .line 8
    .line 9
    if-nez v3, :cond_a

    .line 10
    .line 11
    iget-object v3, p1, LE5/j;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    const v5, -0x2ff29d1a

    .line 18
    .line 19
    .line 20
    if-eq v4, v5, :cond_0

    .line 21
    .line 22
    goto/16 :goto_4

    .line 23
    .line 24
    :cond_0
    const-string v4, "configure"

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_b

    .line 31
    .line 32
    iget-boolean v3, p0, Lcom/ryanheise/audioservice/a$d;->f:Z

    .line 33
    .line 34
    if-nez v3, :cond_9

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    invoke-static {v3}, Lcom/ryanheise/audioservice/a;->d(Z)Z

    .line 38
    .line 39
    .line 40
    iget-object p1, p1, LE5/j;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Ljava/util/Map;

    .line 43
    .line 44
    const-string v3, "config"

    .line 45
    .line 46
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Ljava/util/Map;

    .line 51
    .line 52
    new-instance v3, Ll5/h;

    .line 53
    .line 54
    iget-object v4, p0, Lcom/ryanheise/audioservice/a$d;->a:Landroid/content/Context;

    .line 55
    .line 56
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-direct {v3, v4}, Ll5/h;-><init>(Landroid/content/Context;)V

    .line 61
    .line 62
    .line 63
    const-string v4, "androidNotificationClickStartsActivity"

    .line 64
    .line 65
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    check-cast v4, Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    iput-boolean v4, v3, Ll5/h;->i:Z

    .line 76
    .line 77
    const-string v4, "androidNotificationOngoing"

    .line 78
    .line 79
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    check-cast v4, Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    iput-boolean v4, v3, Ll5/h;->j:Z

    .line 90
    .line 91
    const-string v4, "androidResumeOnClick"

    .line 92
    .line 93
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    check-cast v4, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    iput-boolean v4, v3, Ll5/h;->b:Z

    .line 104
    .line 105
    const-string v4, "androidNotificationChannelId"

    .line 106
    .line 107
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    check-cast v4, Ljava/lang/String;

    .line 112
    .line 113
    iput-object v4, v3, Ll5/h;->c:Ljava/lang/String;

    .line 114
    .line 115
    const-string v4, "androidNotificationChannelName"

    .line 116
    .line 117
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    check-cast v4, Ljava/lang/String;

    .line 122
    .line 123
    iput-object v4, v3, Ll5/h;->d:Ljava/lang/String;

    .line 124
    .line 125
    const-string v4, "androidNotificationChannelDescription"

    .line 126
    .line 127
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    check-cast v4, Ljava/lang/String;

    .line 132
    .line 133
    iput-object v4, v3, Ll5/h;->e:Ljava/lang/String;

    .line 134
    .line 135
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    const/4 v5, -0x1

    .line 140
    if-nez v4, :cond_1

    .line 141
    .line 142
    move v2, v5

    .line 143
    goto :goto_0

    .line 144
    :cond_1
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-static {v2}, Lcom/ryanheise/audioservice/a;->C(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    :goto_0
    iput v2, v3, Ll5/h;->f:I

    .line 157
    .line 158
    const-string v2, "androidNotificationIcon"

    .line 159
    .line 160
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    check-cast v2, Ljava/lang/String;

    .line 165
    .line 166
    iput-object v2, v3, Ll5/h;->g:Ljava/lang/String;

    .line 167
    .line 168
    const-string v2, "androidShowNotificationBadge"

    .line 169
    .line 170
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    check-cast v2, Ljava/lang/Boolean;

    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    iput-boolean v2, v3, Ll5/h;->h:Z

    .line 181
    .line 182
    const-string v2, "androidStopForegroundOnPause"

    .line 183
    .line 184
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    check-cast v2, Ljava/lang/Boolean;

    .line 189
    .line 190
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    iput-boolean v2, v3, Ll5/h;->k:Z

    .line 195
    .line 196
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    if-eqz v2, :cond_2

    .line 201
    .line 202
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    check-cast v1, Ljava/lang/Integer;

    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    goto :goto_1

    .line 213
    :catch_0
    move-exception p1

    .line 214
    goto/16 :goto_3

    .line 215
    .line 216
    :cond_2
    move v1, v5

    .line 217
    :goto_1
    iput v1, v3, Ll5/h;->l:I

    .line 218
    .line 219
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    if-eqz v1, :cond_3

    .line 224
    .line 225
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    check-cast v0, Ljava/lang/Integer;

    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    :cond_3
    iput v5, v3, Ll5/h;->m:I

    .line 236
    .line 237
    const-string v0, "androidBrowsableRootExtras"

    .line 238
    .line 239
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    check-cast p1, Ljava/util/Map;

    .line 244
    .line 245
    invoke-virtual {v3, p1}, Ll5/h;->c(Ljava/util/Map;)V

    .line 246
    .line 247
    .line 248
    iget-object p1, p0, Lcom/ryanheise/audioservice/a$d;->b:Landroid/app/Activity;

    .line 249
    .line 250
    if-eqz p1, :cond_4

    .line 251
    .line 252
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    iput-object p1, v3, Ll5/h;->n:Ljava/lang/String;

    .line 261
    .line 262
    :cond_4
    invoke-virtual {v3}, Ll5/h;->b()V

    .line 263
    .line 264
    .line 265
    sget-object p1, Lcom/ryanheise/audioservice/AudioService;->R:Lcom/ryanheise/audioservice/AudioService;

    .line 266
    .line 267
    if-eqz p1, :cond_5

    .line 268
    .line 269
    invoke-virtual {p1, v3}, Lcom/ryanheise/audioservice/AudioService;->B(Ll5/h;)V

    .line 270
    .line 271
    .line 272
    :cond_5
    invoke-static {p0}, Lcom/ryanheise/audioservice/a;->q(Lcom/ryanheise/audioservice/a$d;)Lcom/ryanheise/audioservice/a$d;

    .line 273
    .line 274
    .line 275
    invoke-static {}, Lcom/ryanheise/audioservice/a;->e()Lcom/ryanheise/audioservice/a$c;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    if-nez p1, :cond_6

    .line 280
    .line 281
    new-instance p1, Lcom/ryanheise/audioservice/a$c;

    .line 282
    .line 283
    iget-object v0, p0, Lcom/ryanheise/audioservice/a$d;->c:LE5/c;

    .line 284
    .line 285
    invoke-direct {p1, v0}, Lcom/ryanheise/audioservice/a$c;-><init>(LE5/c;)V

    .line 286
    .line 287
    .line 288
    invoke-static {p1}, Lcom/ryanheise/audioservice/a;->f(Lcom/ryanheise/audioservice/a$c;)Lcom/ryanheise/audioservice/a$c;

    .line 289
    .line 290
    .line 291
    invoke-static {}, Lcom/ryanheise/audioservice/a;->e()Lcom/ryanheise/audioservice/a$c;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioService;->Q(Lcom/ryanheise/audioservice/AudioService$e;)V

    .line 296
    .line 297
    .line 298
    goto :goto_2

    .line 299
    :cond_6
    invoke-static {}, Lcom/ryanheise/audioservice/a;->e()Lcom/ryanheise/audioservice/a$c;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    iget-object p1, p1, Lcom/ryanheise/audioservice/a$c;->a:LE5/c;

    .line 304
    .line 305
    iget-object v0, p0, Lcom/ryanheise/audioservice/a$d;->c:LE5/c;

    .line 306
    .line 307
    if-eq p1, v0, :cond_7

    .line 308
    .line 309
    invoke-static {}, Lcom/ryanheise/audioservice/a;->e()Lcom/ryanheise/audioservice/a$c;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    iget-object v0, p0, Lcom/ryanheise/audioservice/a$d;->c:LE5/c;

    .line 314
    .line 315
    invoke-virtual {p1, v0}, Lcom/ryanheise/audioservice/a$c;->a0(LE5/c;)V

    .line 316
    .line 317
    .line 318
    :cond_7
    invoke-static {}, Lcom/ryanheise/audioservice/a;->e()Lcom/ryanheise/audioservice/a$c;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    invoke-virtual {p1}, Lcom/ryanheise/audioservice/a$c;->T()V

    .line 323
    .line 324
    .line 325
    :goto_2
    invoke-static {}, Lcom/ryanheise/audioservice/a;->n()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    if-eqz p1, :cond_8

    .line 330
    .line 331
    const/4 p1, 0x0

    .line 332
    new-array p1, p1, [Ljava/lang/Object;

    .line 333
    .line 334
    invoke-static {p1}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    goto :goto_4

    .line 342
    :cond_8
    invoke-static {p2}, Lcom/ryanheise/audioservice/a;->t(LE5/k$d;)LE5/k$d;

    .line 343
    .line 344
    .line 345
    goto :goto_4

    .line 346
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 347
    .line 348
    const-string v0, "Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README."

    .line 349
    .line 350
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    throw p1

    .line 354
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 355
    .line 356
    const-string v0, "The Activity class declared in your AndroidManifest.xml is wrong or has not provided the correct FlutterEngine. Please see the README for instructions."

    .line 357
    .line 358
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 362
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 363
    .line 364
    .line 365
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    const/4 v0, 0x0

    .line 370
    invoke-interface {p2, p1, v0, v0}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    :cond_b
    :goto_4
    return-void
.end method
