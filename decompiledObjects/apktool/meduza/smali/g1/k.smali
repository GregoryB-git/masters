.class public final Lg1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg1/c$l;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:Landroid/os/Bundle;

.field public final synthetic f:Lg1/c$k;


# direct methods
.method public constructor <init>(IILandroid/os/Bundle;Lg1/c$k;Lg1/c$m;Ljava/lang/String;)V
    .locals 0

    iput-object p4, p0, Lg1/k;->f:Lg1/c$k;

    iput-object p5, p0, Lg1/k;->a:Lg1/c$l;

    iput-object p6, p0, Lg1/k;->b:Ljava/lang/String;

    iput p1, p0, Lg1/k;->c:I

    iput p2, p0, Lg1/k;->d:I

    iput-object p3, p0, Lg1/k;->e:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-object v0, p0, Lg1/k;->a:Lg1/c$l;

    .line 2
    .line 3
    check-cast v0, Lg1/c$m;

    .line 4
    .line 5
    invoke-virtual {v0}, Lg1/c$m;->a()Landroid/os/IBinder;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lg1/k;->f:Lg1/c$k;

    .line 10
    .line 11
    iget-object v1, v1, Lg1/c$k;->a:Lg1/c;

    .line 12
    .line 13
    iget-object v1, v1, Lg1/c;->d:Lr/b;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lr/h;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    new-instance v1, Lg1/c$c;

    .line 19
    .line 20
    iget-object v2, p0, Lg1/k;->f:Lg1/c$k;

    .line 21
    .line 22
    iget-object v3, v2, Lg1/c$k;->a:Lg1/c;

    .line 23
    .line 24
    iget-object v4, p0, Lg1/k;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget v5, p0, Lg1/k;->c:I

    .line 27
    .line 28
    iget v6, p0, Lg1/k;->d:I

    .line 29
    .line 30
    iget-object v7, p0, Lg1/k;->a:Lg1/c$l;

    .line 31
    .line 32
    move-object v2, v1

    .line 33
    invoke-direct/range {v2 .. v7}, Lg1/c$c;-><init>(Lg1/c;Ljava/lang/String;IILg1/c$l;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lg1/k;->f:Lg1/c$k;

    .line 37
    .line 38
    iget-object v2, v2, Lg1/c$k;->a:Lg1/c;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v2, p0, Lg1/k;->f:Lg1/c$k;

    .line 44
    .line 45
    iget-object v2, v2, Lg1/c$k;->a:Lg1/c;

    .line 46
    .line 47
    iget-object v3, p0, Lg1/k;->e:Landroid/os/Bundle;

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Lg1/c;->b(Landroid/os/Bundle;)Lg1/c$b;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    iput-object v2, v1, Lg1/c$c;->f:Lg1/c$b;

    .line 54
    .line 55
    iget-object v2, p0, Lg1/k;->f:Lg1/c$k;

    .line 56
    .line 57
    iget-object v2, v2, Lg1/c$k;->a:Lg1/c;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v2, v1, Lg1/c$c;->f:Lg1/c$b;

    .line 63
    .line 64
    const/4 v3, 0x2

    .line 65
    const-string v4, "MBServiceCompat"

    .line 66
    .line 67
    if-nez v2, :cond_0

    .line 68
    .line 69
    const-string v0, "No root for client "

    .line 70
    .line 71
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object v1, p0, Lg1/k;->b:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, " from service "

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-class v1, Lg1/k;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    :try_start_0
    iget-object v0, p0, Lg1/k;->a:Lg1/c$l;

    .line 102
    .line 103
    check-cast v0, Lg1/c$m;

    .line 104
    .line 105
    const/4 v1, 0x0

    .line 106
    invoke-virtual {v0, v3, v1}, Lg1/c$m;->c(ILandroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :catch_0
    const-string v0, "Calling onConnectFailed() failed. Ignoring. pkg="

    .line 111
    .line 112
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    iget-object v1, p0, Lg1/k;->b:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_0
    :try_start_1
    iget-object v2, p0, Lg1/k;->f:Lg1/c$k;

    .line 130
    .line 131
    iget-object v2, v2, Lg1/c$k;->a:Lg1/c;

    .line 132
    .line 133
    iget-object v2, v2, Lg1/c;->d:Lr/b;

    .line 134
    .line 135
    invoke-virtual {v2, v0, v1}, Lr/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    const/4 v2, 0x0

    .line 139
    invoke-interface {v0, v1, v2}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    .line 140
    .line 141
    .line 142
    iget-object v2, p0, Lg1/k;->f:Lg1/c$k;

    .line 143
    .line 144
    iget-object v2, v2, Lg1/c$k;->a:Lg1/c;

    .line 145
    .line 146
    iget-object v2, v2, Lg1/c;->f:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 147
    .line 148
    if-eqz v2, :cond_2

    .line 149
    .line 150
    iget-object v5, p0, Lg1/k;->a:Lg1/c$l;

    .line 151
    .line 152
    iget-object v1, v1, Lg1/c$c;->f:Lg1/c$b;

    .line 153
    .line 154
    iget-object v6, v1, Lg1/c$b;->a:Ljava/lang/String;

    .line 155
    .line 156
    iget-object v1, v1, Lg1/c$b;->b:Landroid/os/Bundle;

    .line 157
    .line 158
    check-cast v5, Lg1/c$m;

    .line 159
    .line 160
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    if-nez v1, :cond_1

    .line 164
    .line 165
    new-instance v1, Landroid/os/Bundle;

    .line 166
    .line 167
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 168
    .line 169
    .line 170
    :cond_1
    const-string v7, "extra_service_version"

    .line 171
    .line 172
    invoke-virtual {v1, v7, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 173
    .line 174
    .line 175
    new-instance v3, Landroid/os/Bundle;

    .line 176
    .line 177
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 178
    .line 179
    .line 180
    const-string v7, "data_media_item_id"

    .line 181
    .line 182
    invoke-virtual {v3, v7, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    const-string v6, "data_media_session_token"

    .line 186
    .line 187
    invoke-virtual {v3, v6, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 188
    .line 189
    .line 190
    const-string v2, "data_root_hints"

    .line 191
    .line 192
    invoke-virtual {v3, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 193
    .line 194
    .line 195
    const/4 v1, 0x1

    .line 196
    invoke-virtual {v5, v1, v3}, Lg1/c$m;->c(ILandroid/os/Bundle;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 197
    .line 198
    .line 199
    goto :goto_0

    .line 200
    :catch_1
    const-string v1, "Calling onConnect() failed. Dropping client. pkg="

    .line 201
    .line 202
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    iget-object v2, p0, Lg1/k;->b:Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-static {v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 216
    .line 217
    .line 218
    iget-object v1, p0, Lg1/k;->f:Lg1/c$k;

    .line 219
    .line 220
    iget-object v1, v1, Lg1/c$k;->a:Lg1/c;

    .line 221
    .line 222
    iget-object v1, v1, Lg1/c;->d:Lr/b;

    .line 223
    .line 224
    invoke-virtual {v1, v0}, Lr/h;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    :cond_2
    :goto_0
    return-void
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
