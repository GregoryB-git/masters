.class public final Lcom/ryanheise/audioservice/b$b;
.super Landroid/support/v4/media/MediaBrowserCompat$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ryanheise/audioservice/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/ryanheise/audioservice/b;


# direct methods
.method public constructor <init>(Lcom/ryanheise/audioservice/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ryanheise/audioservice/b$b;->c:Lcom/ryanheise/audioservice/b;

    invoke-direct {p0}, Landroid/support/v4/media/MediaBrowserCompat$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Lcom/ryanheise/audioservice/b;->u:Landroid/support/v4/media/MediaBrowserCompat;

    .line 2
    .line 3
    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat;->a:Landroid/support/v4/media/MediaBrowserCompat$e;

    .line 4
    .line 5
    iget-object v1, v0, Landroid/support/v4/media/MediaBrowserCompat$d;->h:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    iget-object v1, v0, Landroid/support/v4/media/MediaBrowserCompat$d;->b:Landroid/media/browse/MediaBrowser;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/media/browse/MediaBrowser;->getSessionToken()Landroid/media/session/MediaSession$Token;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    new-instance v3, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 19
    .line 20
    invoke-direct {v3, v1, v2, v2}, Landroid/support/v4/media/session/MediaSessionCompat$Token;-><init>(Ljava/lang/Object;Landroid/support/v4/media/session/IMediaSession;Lb2/e;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v3, v2

    .line 25
    :goto_0
    iput-object v3, v0, Landroid/support/v4/media/MediaBrowserCompat$d;->h:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 26
    .line 27
    :cond_1
    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$d;->h:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 28
    .line 29
    new-instance v1, Landroid/support/v4/media/session/MediaControllerCompat;

    .line 30
    .line 31
    iget-object v3, p0, Lcom/ryanheise/audioservice/b$b;->c:Lcom/ryanheise/audioservice/b;

    .line 32
    .line 33
    iget-object v3, v3, Lcom/ryanheise/audioservice/b;->a:Landroid/content/Context;

    .line 34
    .line 35
    invoke-direct {v1, v3, v0}, Landroid/support/v4/media/session/MediaControllerCompat;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    .line 36
    .line 37
    .line 38
    sput-object v1, Lcom/ryanheise/audioservice/b;->v:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 39
    .line 40
    sget-object v0, Lcom/ryanheise/audioservice/b;->p:Lcom/ryanheise/audioservice/b$d;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    iget-object v0, v0, Lcom/ryanheise/audioservice/b$d;->b:Landroid/app/Activity;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move-object v0, v2

    .line 48
    :goto_1
    if-eqz v0, :cond_3

    .line 49
    .line 50
    sget-object v1, Lcom/ryanheise/audioservice/b;->v:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 51
    .line 52
    invoke-static {v0, v1}, Landroid/support/v4/media/session/MediaControllerCompat;->b(Landroid/app/Activity;Landroid/support/v4/media/session/MediaControllerCompat;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    sget-object v0, Lcom/ryanheise/audioservice/b;->v:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 56
    .line 57
    sget-object v1, Lcom/ryanheise/audioservice/b;->w:Lcom/ryanheise/audioservice/b$a;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaControllerCompat;->a(Lcom/ryanheise/audioservice/b$a;)V

    .line 60
    .line 61
    .line 62
    sget-object v0, Lcom/ryanheise/audioservice/b;->s:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 63
    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    new-array v1, v1, [Ljava/lang/Object;

    .line 68
    .line 69
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-interface {v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    sput-object v2, Lcom/ryanheise/audioservice/b;->s:Lio/flutter/plugin/common/MethodChannel$Result;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .line 78
    :cond_4
    return-void

    .line 79
    :catch_0
    move-exception v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 81
    .line 82
    .line 83
    new-instance v1, Ljava/lang/RuntimeException;

    .line 84
    .line 85
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    throw v1
    .line 89
    .line 90
    .line 91
    .line 92
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

.method public final b()V
    .locals 3

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/b;->s:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v1, "Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README."

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-interface {v0, v1, v2, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/b$b;->c:Lcom/ryanheise/audioservice/b;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/ryanheise/audioservice/b;->e:Lcom/ryanheise/audioservice/b$d;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    iput-boolean v1, v0, Lcom/ryanheise/audioservice/b$d;->e:Z

    .line 18
    .line 19
    :goto_0
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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

.method public final c()V
    .locals 2

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "### UNHANDLED: onConnectionSuspended"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method
