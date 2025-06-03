.class public Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$OnCredentialsListener;
    }
.end annotation


# static fields
.field private static final forceResendingTokens:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lb8/e0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final activityRef:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field public autoRetrievedSmsCodeForTesting:Ljava/lang/String;

.field private eventSink:Lio/flutter/plugin/common/EventChannel$EventSink;

.field public final firebaseAuth:Lcom/google/firebase/auth/FirebaseAuth;

.field public forceResendingToken:Ljava/lang/Integer;

.field public final multiFactorInfo:Lb8/h0;

.field public final multiFactorSession:Lb8/z;

.field public final onCredentialsListener:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$OnCredentialsListener;

.field public final phoneNumber:Ljava/lang/String;

.field public final timeout:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->forceResendingTokens:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$AuthPigeonFirebaseApp;Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonVerifyPhoneNumberRequest;Lb8/z;Lb8/h0;Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$OnCredentialsListener;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->activityRef:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iput-object p4, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->multiFactorSession:Lb8/z;

    iput-object p5, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->multiFactorInfo:Lb8/h0;

    invoke-static {p2}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthPlugin;->getAuthFromPigeon(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$AuthPigeonFirebaseApp;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->firebaseAuth:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {p3}, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonVerifyPhoneNumberRequest;->getPhoneNumber()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->phoneNumber:Ljava/lang/String;

    invoke-virtual {p3}, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonVerifyPhoneNumberRequest;->getTimeout()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    long-to-int p4, p1

    int-to-long v0, p4

    cmp-long p1, p1, v0

    if-nez p1, :cond_3

    iput p4, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->timeout:I

    invoke-virtual {p3}, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonVerifyPhoneNumberRequest;->getAutoRetrievedSmsCodeForTesting()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p3}, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonVerifyPhoneNumberRequest;->getAutoRetrievedSmsCodeForTesting()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->autoRetrievedSmsCodeForTesting:Ljava/lang/String;

    :cond_0
    invoke-virtual {p3}, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonVerifyPhoneNumberRequest;->getForceResendingToken()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p3}, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonVerifyPhoneNumberRequest;->getForceResendingToken()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    long-to-int p3, p1

    int-to-long p4, p3

    cmp-long p1, p1, p4

    if-nez p1, :cond_1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->forceResendingToken:Ljava/lang/Integer;

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    iput-object p6, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->onCredentialsListener:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$OnCredentialsListener;

    return-void

    :cond_3
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public static synthetic access$000(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)Lio/flutter/plugin/common/EventChannel$EventSink;
    .locals 0

    iget-object p0, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->eventSink:Lio/flutter/plugin/common/EventChannel$EventSink;

    return-object p0
.end method

.method public static synthetic access$100()Ljava/util/HashMap;
    .locals 1

    sget-object v0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->forceResendingTokens:Ljava/util/HashMap;

    return-object v0
.end method


# virtual methods
.method public onCancel(Ljava/lang/Object;)V
    .locals 1

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->eventSink:Lio/flutter/plugin/common/EventChannel$EventSink;

    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->activityRef:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 12

    .line 1
    iput-object p2, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->eventSink:Lio/flutter/plugin/common/EventChannel$EventSink;

    .line 2
    .line 3
    new-instance v3, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;

    .line 4
    .line 5
    invoke-direct {v3, p0}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;-><init>(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->autoRetrievedSmsCodeForTesting:Ljava/lang/String;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p2, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->firebaseAuth:Lcom/google/firebase/auth/FirebaseAuth;

    .line 13
    .line 14
    iget-object p2, p2, Lcom/google/firebase/auth/FirebaseAuth;->g:Lc8/f;

    .line 15
    .line 16
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->phoneNumber:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v0, p2, Lc8/f;->a:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p1, p2, Lc8/f;->b:Ljava/lang/String;

    .line 21
    .line 22
    :cond_0
    iget-object v1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->firebaseAuth:Lcom/google/firebase/auth/FirebaseAuth;

    .line 23
    .line 24
    invoke-static {v1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->activityRef:Ljava/util/concurrent/atomic/AtomicReference;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    move-object v6, p1

    .line 34
    check-cast v6, Landroid/app/Activity;

    .line 35
    .line 36
    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->phoneNumber:Ljava/lang/String;

    .line 37
    .line 38
    const/4 p2, 0x0

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    move-object v5, p1

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object v5, p2

    .line 44
    :goto_0
    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->multiFactorSession:Lb8/z;

    .line 45
    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    move-object v8, p1

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move-object v8, p2

    .line 51
    :goto_1
    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->multiFactorInfo:Lb8/h0;

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    move-object v9, p1

    .line 56
    goto :goto_2

    .line 57
    :cond_3
    move-object v9, p2

    .line 58
    :goto_2
    iget p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->timeout:I

    .line 59
    .line 60
    int-to-long v10, p1

    .line 61
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 66
    .line 67
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 70
    .line 71
    .line 72
    move-result-wide v10

    .line 73
    invoke-virtual {v2, v10, v11, v0}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v10

    .line 77
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->forceResendingToken:Ljava/lang/Integer;

    .line 82
    .line 83
    if-eqz p1, :cond_4

    .line 84
    .line 85
    sget-object v0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->forceResendingTokens:Ljava/util/HashMap;

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Lb8/e0;

    .line 92
    .line 93
    if-eqz p1, :cond_4

    .line 94
    .line 95
    move-object v7, p1

    .line 96
    goto :goto_3

    .line 97
    :cond_4
    move-object v7, p2

    .line 98
    :goto_3
    const-string p1, "You must specify an auto-retrieval timeout; please call #setTimeout()"

    .line 99
    .line 100
    invoke-static {v2, p1}, Lm6/j;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iget-object v4, v1, Lcom/google/firebase/auth/FirebaseAuth;->A:Ljava/util/concurrent/Executor;

    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 106
    .line 107
    .line 108
    move-result-wide p1

    .line 109
    const-wide/16 v10, 0x0

    .line 110
    .line 111
    cmp-long p1, p1, v10

    .line 112
    .line 113
    if-ltz p1, :cond_e

    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 116
    .line 117
    .line 118
    move-result-wide p1

    .line 119
    const-wide/16 v10, 0x78

    .line 120
    .line 121
    cmp-long p1, p1, v10

    .line 122
    .line 123
    if-gtz p1, :cond_e

    .line 124
    .line 125
    const/4 p1, 0x0

    .line 126
    const/4 p2, 0x1

    .line 127
    if-nez v8, :cond_5

    .line 128
    .line 129
    move v0, p2

    .line 130
    goto :goto_4

    .line 131
    :cond_5
    move v0, p1

    .line 132
    :goto_4
    const-string v10, "A phoneMultiFactorInfo must be set for second factor sign-in."

    .line 133
    .line 134
    if-eqz v0, :cond_7

    .line 135
    .line 136
    const-string v0, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()"

    .line 137
    .line 138
    invoke-static {v0, v5}, Lm6/j;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    if-nez v9, :cond_6

    .line 142
    .line 143
    move p1, p2

    .line 144
    :cond_6
    invoke-static {v10, p1}, Lm6/j;->a(Ljava/lang/String;Z)V

    .line 145
    .line 146
    .line 147
    goto :goto_9

    .line 148
    :cond_7
    if-eqz v8, :cond_9

    .line 149
    .line 150
    move-object v0, v8

    .line 151
    check-cast v0, Lc8/n;

    .line 152
    .line 153
    iget-object v0, v0, Lc8/n;->a:Ljava/lang/String;

    .line 154
    .line 155
    if-eqz v0, :cond_8

    .line 156
    .line 157
    move v0, p2

    .line 158
    goto :goto_5

    .line 159
    :cond_8
    move v0, p1

    .line 160
    :goto_5
    if-eqz v0, :cond_9

    .line 161
    .line 162
    move v0, p2

    .line 163
    goto :goto_6

    .line 164
    :cond_9
    move v0, p1

    .line 165
    :goto_6
    if-eqz v0, :cond_b

    .line 166
    .line 167
    invoke-static {v5}, Lm6/j;->e(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    if-nez v9, :cond_a

    .line 171
    .line 172
    move p1, p2

    .line 173
    :cond_a
    const-string p2, "Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session."

    .line 174
    .line 175
    goto :goto_8

    .line 176
    :cond_b
    if-eqz v9, :cond_c

    .line 177
    .line 178
    move v0, p2

    .line 179
    goto :goto_7

    .line 180
    :cond_c
    move v0, p1

    .line 181
    :goto_7
    invoke-static {v10, v0}, Lm6/j;->a(Ljava/lang/String;Z)V

    .line 182
    .line 183
    .line 184
    if-nez v5, :cond_d

    .line 185
    .line 186
    move p1, p2

    .line 187
    :cond_d
    const-string p2, "A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead."

    .line 188
    .line 189
    :goto_8
    invoke-static {p2, p1}, Lm6/j;->a(Ljava/lang/String;Z)V

    .line 190
    .line 191
    .line 192
    :goto_9
    new-instance p1, Lb8/d0;

    .line 193
    .line 194
    move-object v0, p1

    .line 195
    invoke-direct/range {v0 .. v9}, Lb8/d0;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/Long;Lb8/f0;Ljava/util/concurrent/Executor;Ljava/lang/String;Landroid/app/Activity;Lb8/e0;Lb8/z;Lb8/h0;)V

    .line 196
    .line 197
    .line 198
    invoke-static {p1}, Lcom/google/firebase/auth/FirebaseAuth;->l(Lb8/d0;)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :cond_e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 203
    .line 204
    const-string p2, "We only support 0-120 seconds for sms-auto-retrieval timeout"

    .line 205
    .line 206
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw p1
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
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
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
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
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
.end method
