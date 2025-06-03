.class public abstract Landroid/support/customtabs/ICustomTabsCallback$Stub;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Landroid/support/customtabs/ICustomTabsCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/customtabs/ICustomTabsCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/customtabs/ICustomTabsCallback$Stub$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    sget-object v0, Landroid/support/customtabs/ICustomTabsCallback;->g:Ljava/lang/String;

    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Landroid/support/customtabs/ICustomTabsCallback;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object v0, Landroid/support/customtabs/ICustomTabsCallback;->g:Ljava/lang/String;

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Landroid/support/customtabs/ICustomTabsCallback;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/support/customtabs/ICustomTabsCallback;

    return-object v0

    :cond_1
    new-instance v0, Landroid/support/customtabs/ICustomTabsCallback$Stub$a;

    invoke-direct {v0, p0}, Landroid/support/customtabs/ICustomTabsCallback$Stub$a;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 10

    .line 1
    sget-object v0, Landroid/support/customtabs/ICustomTabsCallback;->g:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-lt p1, v1, :cond_0

    .line 5
    .line 6
    const v2, 0xffffff

    .line 7
    .line 8
    .line 9
    if-gt p1, v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const v2, 0x5f4e5446

    .line 15
    .line 16
    .line 17
    if-ne p1, v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return v1

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    packed-switch p1, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1

    .line 32
    :pswitch_0
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 33
    .line 34
    invoke-static {p2, p1}, Landroid/support/customtabs/ICustomTabsCallback$a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Landroid/os/Bundle;

    .line 39
    .line 40
    move-object p2, p0

    .line 41
    check-cast p2, Lp/m;

    .line 42
    .line 43
    iget-object p3, p2, Lp/m;->b:Lp/b;

    .line 44
    .line 45
    if-nez p3, :cond_2

    .line 46
    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :cond_2
    iget-object p3, p2, Lp/m;->a:Landroid/os/Handler;

    .line 50
    .line 51
    new-instance p4, Lp/c;

    .line 52
    .line 53
    invoke-direct {p4, p2, p1}, Lp/c;-><init>(Lp/m;Landroid/os/Bundle;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p3, p4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 57
    .line 58
    .line 59
    goto/16 :goto_3

    .line 60
    .line 61
    :pswitch_1
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 62
    .line 63
    invoke-static {p2, p1}, Landroid/support/customtabs/ICustomTabsCallback$a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Landroid/os/Bundle;

    .line 68
    .line 69
    move-object p2, p0

    .line 70
    check-cast p2, Lp/m;

    .line 71
    .line 72
    iget-object p3, p2, Lp/m;->b:Lp/b;

    .line 73
    .line 74
    if-nez p3, :cond_3

    .line 75
    .line 76
    goto/16 :goto_3

    .line 77
    .line 78
    :cond_3
    iget-object p3, p2, Lp/m;->a:Landroid/os/Handler;

    .line 79
    .line 80
    new-instance p4, Lp/l;

    .line 81
    .line 82
    invoke-direct {p4, p2, p1}, Lp/l;-><init>(Lp/m;Landroid/os/Bundle;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3, p4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 86
    .line 87
    .line 88
    goto/16 :goto_3

    .line 89
    .line 90
    :pswitch_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 111
    .line 112
    invoke-static {p2, p1}, Landroid/support/customtabs/ICustomTabsCallback$a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    move-object v9, p1

    .line 117
    check-cast v9, Landroid/os/Bundle;

    .line 118
    .line 119
    move-object v3, p0

    .line 120
    check-cast v3, Lp/m;

    .line 121
    .line 122
    iget-object p1, v3, Lp/m;->b:Lp/b;

    .line 123
    .line 124
    if-nez p1, :cond_4

    .line 125
    .line 126
    goto/16 :goto_3

    .line 127
    .line 128
    :cond_4
    iget-object p1, v3, Lp/m;->a:Landroid/os/Handler;

    .line 129
    .line 130
    new-instance p2, Lp/k;

    .line 131
    .line 132
    move-object v2, p2

    .line 133
    invoke-direct/range {v2 .. v9}, Lp/k;-><init>(Lp/m;IIIIILandroid/os/Bundle;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 137
    .line 138
    .line 139
    goto/16 :goto_3

    .line 140
    .line 141
    :pswitch_3
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 142
    .line 143
    invoke-static {p2, p1}, Landroid/support/customtabs/ICustomTabsCallback$a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    check-cast p1, Landroid/os/Bundle;

    .line 148
    .line 149
    move-object p2, p0

    .line 150
    check-cast p2, Lp/m;

    .line 151
    .line 152
    iget-object p3, p2, Lp/m;->b:Lp/b;

    .line 153
    .line 154
    if-nez p3, :cond_5

    .line 155
    .line 156
    goto/16 :goto_3

    .line 157
    .line 158
    :cond_5
    iget-object p3, p2, Lp/m;->a:Landroid/os/Handler;

    .line 159
    .line 160
    new-instance p4, Lp/j;

    .line 161
    .line 162
    invoke-direct {p4, p2, p1}, Lp/j;-><init>(Lp/m;Landroid/os/Bundle;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p3, p4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 166
    .line 167
    .line 168
    goto/16 :goto_3

    .line 169
    .line 170
    :pswitch_4
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 175
    .line 176
    .line 177
    move-result p3

    .line 178
    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 179
    .line 180
    invoke-static {p2, p4}, Landroid/support/customtabs/ICustomTabsCallback$a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    check-cast p2, Landroid/os/Bundle;

    .line 185
    .line 186
    move-object p4, p0

    .line 187
    check-cast p4, Lp/m;

    .line 188
    .line 189
    iget-object v0, p4, Lp/m;->b:Lp/b;

    .line 190
    .line 191
    if-nez v0, :cond_6

    .line 192
    .line 193
    goto/16 :goto_3

    .line 194
    .line 195
    :cond_6
    iget-object v0, p4, Lp/m;->a:Landroid/os/Handler;

    .line 196
    .line 197
    new-instance v2, Lp/i;

    .line 198
    .line 199
    invoke-direct {v2, p4, p1, p3, p2}, Lp/i;-><init>(Lp/m;IILandroid/os/Bundle;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 203
    .line 204
    .line 205
    goto/16 :goto_3

    .line 206
    .line 207
    :pswitch_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 212
    .line 213
    invoke-static {p2, p4}, Landroid/support/customtabs/ICustomTabsCallback$a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    check-cast p2, Landroid/os/Bundle;

    .line 218
    .line 219
    move-object p4, p0

    .line 220
    check-cast p4, Lp/m;

    .line 221
    .line 222
    iget-object p4, p4, Lp/m;->b:Lp/b;

    .line 223
    .line 224
    if-nez p4, :cond_7

    .line 225
    .line 226
    const/4 p1, 0x0

    .line 227
    goto :goto_0

    .line 228
    :cond_7
    invoke-virtual {p4, p1, p2}, Lp/b;->extraCallbackWithResult(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    :goto_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 233
    .line 234
    .line 235
    if-eqz p1, :cond_8

    .line 236
    .line 237
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1, p3, v1}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    .line 241
    .line 242
    .line 243
    goto/16 :goto_3

    .line 244
    .line 245
    :cond_8
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 246
    .line 247
    .line 248
    goto/16 :goto_3

    .line 249
    .line 250
    :pswitch_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    sget-object p1, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 255
    .line 256
    invoke-static {p2, p1}, Landroid/support/customtabs/ICustomTabsCallback$a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    move-object v5, p1

    .line 261
    check-cast v5, Landroid/net/Uri;

    .line 262
    .line 263
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 264
    .line 265
    .line 266
    move-result p1

    .line 267
    if-eqz p1, :cond_9

    .line 268
    .line 269
    move v6, v1

    .line 270
    goto :goto_1

    .line 271
    :cond_9
    move v6, v0

    .line 272
    :goto_1
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 273
    .line 274
    invoke-static {p2, p1}, Landroid/support/customtabs/ICustomTabsCallback$a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    move-object v7, p1

    .line 279
    check-cast v7, Landroid/os/Bundle;

    .line 280
    .line 281
    move-object v3, p0

    .line 282
    check-cast v3, Lp/m;

    .line 283
    .line 284
    iget-object p1, v3, Lp/m;->b:Lp/b;

    .line 285
    .line 286
    if-nez p1, :cond_a

    .line 287
    .line 288
    goto/16 :goto_3

    .line 289
    .line 290
    :cond_a
    iget-object p1, v3, Lp/m;->a:Landroid/os/Handler;

    .line 291
    .line 292
    new-instance p2, Lp/h;

    .line 293
    .line 294
    move-object v2, p2

    .line 295
    invoke-direct/range {v2 .. v7}, Lp/h;-><init>(Lp/m;ILandroid/net/Uri;ZLandroid/os/Bundle;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 299
    .line 300
    .line 301
    goto/16 :goto_3

    .line 302
    .line 303
    :pswitch_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 308
    .line 309
    invoke-static {p2, p4}, Landroid/support/customtabs/ICustomTabsCallback$a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object p2

    .line 313
    check-cast p2, Landroid/os/Bundle;

    .line 314
    .line 315
    move-object p4, p0

    .line 316
    check-cast p4, Lp/m;

    .line 317
    .line 318
    iget-object v0, p4, Lp/m;->b:Lp/b;

    .line 319
    .line 320
    if-nez v0, :cond_b

    .line 321
    .line 322
    goto :goto_2

    .line 323
    :cond_b
    iget-object v0, p4, Lp/m;->a:Landroid/os/Handler;

    .line 324
    .line 325
    new-instance v2, Lp/g;

    .line 326
    .line 327
    invoke-direct {v2, p4, p1, p2}, Lp/g;-><init>(Lp/m;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 331
    .line 332
    .line 333
    goto :goto_2

    .line 334
    :pswitch_8
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 335
    .line 336
    invoke-static {p2, p1}, Landroid/support/customtabs/ICustomTabsCallback$a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    check-cast p1, Landroid/os/Bundle;

    .line 341
    .line 342
    move-object p2, p0

    .line 343
    check-cast p2, Lp/m;

    .line 344
    .line 345
    iget-object p4, p2, Lp/m;->b:Lp/b;

    .line 346
    .line 347
    if-nez p4, :cond_c

    .line 348
    .line 349
    goto :goto_2

    .line 350
    :cond_c
    iget-object p4, p2, Lp/m;->a:Landroid/os/Handler;

    .line 351
    .line 352
    new-instance v0, Lp/f;

    .line 353
    .line 354
    invoke-direct {v0, p2, p1}, Lp/f;-><init>(Lp/m;Landroid/os/Bundle;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {p4, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 358
    .line 359
    .line 360
    :goto_2
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 361
    .line 362
    .line 363
    goto :goto_3

    .line 364
    :pswitch_9
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object p1

    .line 368
    sget-object p3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 369
    .line 370
    invoke-static {p2, p3}, Landroid/support/customtabs/ICustomTabsCallback$a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object p2

    .line 374
    check-cast p2, Landroid/os/Bundle;

    .line 375
    .line 376
    move-object p3, p0

    .line 377
    check-cast p3, Lp/m;

    .line 378
    .line 379
    iget-object p4, p3, Lp/m;->b:Lp/b;

    .line 380
    .line 381
    if-nez p4, :cond_d

    .line 382
    .line 383
    goto :goto_3

    .line 384
    :cond_d
    iget-object p4, p3, Lp/m;->a:Landroid/os/Handler;

    .line 385
    .line 386
    new-instance v0, Lp/e;

    .line 387
    .line 388
    invoke-direct {v0, p3, p1, p2}, Lp/e;-><init>(Lp/m;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {p4, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 392
    .line 393
    .line 394
    goto :goto_3

    .line 395
    :pswitch_a
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 396
    .line 397
    .line 398
    move-result p1

    .line 399
    sget-object p3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 400
    .line 401
    invoke-static {p2, p3}, Landroid/support/customtabs/ICustomTabsCallback$a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object p2

    .line 405
    check-cast p2, Landroid/os/Bundle;

    .line 406
    .line 407
    move-object p3, p0

    .line 408
    check-cast p3, Lp/m;

    .line 409
    .line 410
    iget-object p4, p3, Lp/m;->b:Lp/b;

    .line 411
    .line 412
    if-nez p4, :cond_e

    .line 413
    .line 414
    goto :goto_3

    .line 415
    :cond_e
    iget-object p4, p3, Lp/m;->a:Landroid/os/Handler;

    .line 416
    .line 417
    new-instance v0, Lp/d;

    .line 418
    .line 419
    invoke-direct {v0, p3, p1, p2}, Lp/d;-><init>(Lp/m;ILandroid/os/Bundle;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {p4, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 423
    .line 424
    .line 425
    :goto_3
    return v1

    .line 426
    nop

    .line 427
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
.end method
