.class public final Lcom/google/android/recaptcha/internal/zzec;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzcn;


# instance fields
.field private final zza:Lcom/google/android/recaptcha/internal/zzdt;

.field private final zzb:Lcom/google/android/recaptcha/internal/zzek;

.field private zzc:Lnc/r;

.field private zzd:Lcom/google/android/recaptcha/internal/zzbd;

.field private zze:Lcom/google/android/recaptcha/internal/zzsc;

.field private zzf:Lcom/google/android/recaptcha/internal/zzcm;

.field private final zzg:Lcom/google/android/recaptcha/internal/zzbi;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzdt;Lcom/google/android/recaptcha/internal/zzbi;Lcom/google/android/recaptcha/internal/zzek;Lcom/google/android/recaptcha/internal/zzbo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzec;->zza:Lcom/google/android/recaptcha/internal/zzdt;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzec;->zzg:Lcom/google/android/recaptcha/internal/zzbi;

    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzec;->zzb:Lcom/google/android/recaptcha/internal/zzek;

    invoke-static {}, Lb/z;->b()Lnc/s;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzec;->zzc:Lnc/r;

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzcm;->zzd()Lcom/google/android/recaptcha/internal/zzcl;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzec;->zzf:Lcom/google/android/recaptcha/internal/zzcm;

    return-void
.end method

.method public static final synthetic zzc(Lcom/google/android/recaptcha/internal/zzec;)Lcom/google/android/recaptcha/internal/zzdt;
    .locals 0

    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzec;->zza:Lcom/google/android/recaptcha/internal/zzdt;

    return-object p0
.end method

.method public static final synthetic zzd(Lcom/google/android/recaptcha/internal/zzec;)Lcom/google/android/recaptcha/internal/zzek;
    .locals 0

    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzec;->zzb:Lcom/google/android/recaptcha/internal/zzek;

    return-object p0
.end method

.method public static final synthetic zze(Lcom/google/android/recaptcha/internal/zzec;Ldc/l;Lub/e;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzec;->zzl(Ldc/l;Lub/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic zzf(Lcom/google/android/recaptcha/internal/zzec;JLub/e;)Ljava/lang/Object;
    .locals 0

    const-wide/16 p1, 0x0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/recaptcha/internal/zzec;->zzm(JLub/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic zzg(Lcom/google/android/recaptcha/internal/zzec;)Lnc/r;
    .locals 0

    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzec;->zzc:Lnc/r;

    return-object p0
.end method

.method public static final synthetic zzh(Lcom/google/android/recaptcha/internal/zzec;Lcom/google/android/recaptcha/internal/zzsc;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzec;->zze:Lcom/google/android/recaptcha/internal/zzsc;

    return-void
.end method

.method public static final synthetic zzi(Lcom/google/android/recaptcha/internal/zzec;Lcom/google/android/recaptcha/internal/zzbd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzec;->zzd:Lcom/google/android/recaptcha/internal/zzbd;

    return-void
.end method

.method public static final synthetic zzj(Lcom/google/android/recaptcha/internal/zzec;Lcom/google/android/recaptcha/internal/zzcm;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzec;->zzf:Lcom/google/android/recaptcha/internal/zzcm;

    return-void
.end method

.method public static final synthetic zzk(Lcom/google/android/recaptcha/internal/zzec;Ljava/lang/Exception;)Z
    .locals 0

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzec;->zzo(Ljava/lang/Exception;)Z

    move-result p0

    return p0
.end method

.method private final zzl(Ldc/l;Lub/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lcom/google/android/recaptcha/internal/zzdv;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/google/android/recaptcha/internal/zzdv;

    iget v1, v0, Lcom/google/android/recaptcha/internal/zzdv;->zzc:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/google/android/recaptcha/internal/zzdv;->zzc:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/recaptcha/internal/zzdv;

    invoke-direct {v0, p0, p2}, Lcom/google/android/recaptcha/internal/zzdv;-><init>(Lcom/google/android/recaptcha/internal/zzec;Lub/e;)V

    :goto_0
    iget-object p2, v0, Lcom/google/android/recaptcha/internal/zzdv;->zza:Ljava/lang/Object;

    sget-object v1, Lvb/a;->a:Lvb/a;

    iget v2, v0, Lcom/google/android/recaptcha/internal/zzdv;->zzc:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/google/android/recaptcha/internal/zzdv;->zzd:Lcom/google/android/recaptcha/internal/zzbn;

    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V

    new-instance p2, Lcom/google/android/recaptcha/internal/zzbn;

    invoke-direct {p2}, Lcom/google/android/recaptcha/internal/zzbn;-><init>()V

    iput-object p2, v0, Lcom/google/android/recaptcha/internal/zzdv;->zzd:Lcom/google/android/recaptcha/internal/zzbn;

    iput v3, v0, Lcom/google/android/recaptcha/internal/zzdv;->zzc:I

    invoke-interface {p1, v0}, Ldc/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eq p1, v1, :cond_3

    move-object p1, p2

    :goto_1
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzbn;->zzc()V

    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzbn;->zza(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide p1

    new-instance v0, Ljava/lang/Long;

    invoke-direct {v0, p1, p2}, Ljava/lang/Long;-><init>(J)V

    return-object v0

    :cond_3
    return-object v1
.end method

.method private final zzm(JLub/e;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lcom/google/android/recaptcha/internal/zzdw;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/google/android/recaptcha/internal/zzdw;

    .line 7
    .line 8
    iget v1, v0, Lcom/google/android/recaptcha/internal/zzdw;->zzd:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/google/android/recaptcha/internal/zzdw;->zzd:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/google/android/recaptcha/internal/zzdw;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/google/android/recaptcha/internal/zzdw;-><init>(Lcom/google/android/recaptcha/internal/zzec;Lub/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/google/android/recaptcha/internal/zzdw;->zzb:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lvb/a;->a:Lvb/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/google/android/recaptcha/internal/zzdw;->zzd:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    iget-wide p1, v0, Lcom/google/android/recaptcha/internal/zzdw;->zza:J

    .line 41
    .line 42
    iget-object v0, v0, Lcom/google/android/recaptcha/internal/zzdw;->zze:Lcom/google/android/recaptcha/internal/zzec;

    .line 43
    .line 44
    :try_start_0
    invoke-static {p3}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :catch_0
    move-exception p1

    .line 49
    goto :goto_3

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_2
    iget-wide p1, v0, Lcom/google/android/recaptcha/internal/zzdw;->zza:J

    .line 59
    .line 60
    iget-object v2, v0, Lcom/google/android/recaptcha/internal/zzdw;->zze:Lcom/google/android/recaptcha/internal/zzec;

    .line 61
    .line 62
    invoke-static {p3}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-static {p3}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iput-object p0, v0, Lcom/google/android/recaptcha/internal/zzdw;->zze:Lcom/google/android/recaptcha/internal/zzec;

    .line 70
    .line 71
    iput-wide p1, v0, Lcom/google/android/recaptcha/internal/zzdw;->zza:J

    .line 72
    .line 73
    iput v4, v0, Lcom/google/android/recaptcha/internal/zzdw;->zzd:I

    .line 74
    .line 75
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/recaptcha/internal/zzec;->zzn(JLub/e;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    if-eq p3, v1, :cond_a

    .line 80
    .line 81
    move-object v2, p0

    .line 82
    :goto_1
    :try_start_1
    new-instance p3, Lcom/google/android/recaptcha/internal/zzdy;

    .line 83
    .line 84
    invoke-direct {p3, p1, p2, v2, v5}, Lcom/google/android/recaptcha/internal/zzdy;-><init>(JLcom/google/android/recaptcha/internal/zzec;Lub/e;)V

    .line 85
    .line 86
    .line 87
    iput-object v2, v0, Lcom/google/android/recaptcha/internal/zzdw;->zze:Lcom/google/android/recaptcha/internal/zzec;

    .line 88
    .line 89
    iput-wide p1, v0, Lcom/google/android/recaptcha/internal/zzdw;->zza:J

    .line 90
    .line 91
    iput v3, v0, Lcom/google/android/recaptcha/internal/zzdw;->zzd:I

    .line 92
    .line 93
    invoke-direct {v2, p3, v0}, Lcom/google/android/recaptcha/internal/zzec;->zzl(Ldc/l;Lub/e;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 97
    if-eq p3, v1, :cond_a

    .line 98
    .line 99
    move-object v0, v2

    .line 100
    :goto_2
    :try_start_2
    check-cast p3, Ljava/lang/Number;

    .line 101
    .line 102
    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    .line 103
    .line 104
    .line 105
    move-result-wide v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 106
    sub-long/2addr p1, v1

    .line 107
    const-wide/16 v1, 0x1f4

    .line 108
    .line 109
    cmp-long p3, p1, v1

    .line 110
    .line 111
    if-ltz p3, :cond_4

    .line 112
    .line 113
    new-instance p3, Ljava/lang/Long;

    .line 114
    .line 115
    invoke-direct {p3, p1, p2}, Ljava/lang/Long;-><init>(J)V

    .line 116
    .line 117
    .line 118
    return-object p3

    .line 119
    :cond_4
    :try_start_3
    new-instance p1, Lcom/google/android/recaptcha/internal/zzbd;

    .line 120
    .line 121
    sget-object p2, Lcom/google/android/recaptcha/internal/zzbb;->zzc:Lcom/google/android/recaptcha/internal/zzbb;

    .line 122
    .line 123
    sget-object p3, Lcom/google/android/recaptcha/internal/zzba;->zzar:Lcom/google/android/recaptcha/internal/zzba;

    .line 124
    .line 125
    invoke-direct {p1, p2, p3, v5}, Lcom/google/android/recaptcha/internal/zzbd;-><init>(Lcom/google/android/recaptcha/internal/zzbb;Lcom/google/android/recaptcha/internal/zzba;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 129
    :catch_1
    move-exception p1

    .line 130
    move-object v0, v2

    .line 131
    :goto_3
    instance-of p2, p1, Lcom/google/android/recaptcha/internal/zzbd;

    .line 132
    .line 133
    if-eqz p2, :cond_5

    .line 134
    .line 135
    move-object v5, p1

    .line 136
    check-cast v5, Lcom/google/android/recaptcha/internal/zzbd;

    .line 137
    .line 138
    :cond_5
    if-nez v5, :cond_6

    .line 139
    .line 140
    new-instance v5, Lcom/google/android/recaptcha/internal/zzbd;

    .line 141
    .line 142
    sget-object p2, Lcom/google/android/recaptcha/internal/zzbb;->zzc:Lcom/google/android/recaptcha/internal/zzbb;

    .line 143
    .line 144
    sget-object p3, Lcom/google/android/recaptcha/internal/zzba;->zzar:Lcom/google/android/recaptcha/internal/zzba;

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-direct {v5, p2, p3, p1}, Lcom/google/android/recaptcha/internal/zzbd;-><init>(Lcom/google/android/recaptcha/internal/zzbb;Lcom/google/android/recaptcha/internal/zzba;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :cond_6
    iget-object p1, v0, Lcom/google/android/recaptcha/internal/zzec;->zzf:Lcom/google/android/recaptcha/internal/zzcm;

    .line 154
    .line 155
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzcm;->zza()Lcom/google/android/recaptcha/internal/zzci;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    invoke-static {p1, p2}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-nez p1, :cond_8

    .line 164
    .line 165
    iget-object p1, v0, Lcom/google/android/recaptcha/internal/zzec;->zzf:Lcom/google/android/recaptcha/internal/zzcm;

    .line 166
    .line 167
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzcm;->zzc()Lcom/google/android/recaptcha/internal/zzck;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    invoke-static {p1, p2}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    if-eqz p1, :cond_7

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_7
    throw v5

    .line 179
    :cond_8
    :goto_4
    iget-object p1, v0, Lcom/google/android/recaptcha/internal/zzec;->zzd:Lcom/google/android/recaptcha/internal/zzbd;

    .line 180
    .line 181
    if-eqz p1, :cond_9

    .line 182
    .line 183
    move-object v5, p1

    .line 184
    :cond_9
    throw v5

    .line 185
    :cond_a
    return-object v1
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

.method private final zzn(JLub/e;)Ljava/lang/Object;
    .locals 8

    iget-object p3, p0, Lcom/google/android/recaptcha/internal/zzec;->zzf:Lcom/google/android/recaptcha/internal/zzcm;

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzcm;->zzb()Lcom/google/android/recaptcha/internal/zzcj;

    move-result-object v0

    invoke-static {p3, v0}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    iget-object p3, p0, Lcom/google/android/recaptcha/internal/zzec;->zzf:Lcom/google/android/recaptcha/internal/zzcm;

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzcm;->zzc()Lcom/google/android/recaptcha/internal/zzck;

    move-result-object v0

    invoke-static {p3, v0}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lcom/google/android/recaptcha/internal/zzec;->zzf:Lcom/google/android/recaptcha/internal/zzcm;

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzcm;->zza()Lcom/google/android/recaptcha/internal/zzci;

    move-result-object v0

    invoke-static {p3, v0}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/recaptcha/internal/zzec;->zzd:Lcom/google/android/recaptcha/internal/zzbd;

    invoke-static {p3}, Lcom/google/android/recaptcha/internal/zzec;->zzo(Ljava/lang/Exception;)Z

    move-result p3

    if-nez p3, :cond_1

    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1

    :cond_1
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzcm;->zzc()Lcom/google/android/recaptcha/internal/zzck;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzec;->zzf:Lcom/google/android/recaptcha/internal/zzcm;

    const/4 p3, 0x0

    invoke-static {}, Lb/z;->b()Lnc/s;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/recaptcha/internal/zzec;->zzc:Lnc/r;

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzec;->zzg:Lcom/google/android/recaptcha/internal/zzbi;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzbi;->zza()Lnc/d0;

    move-result-object v6

    new-instance v7, Lcom/google/android/recaptcha/internal/zzeb;

    const/4 v5, 0x0

    move-object v0, v7

    move-object v1, p0

    move-wide v3, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/recaptcha/internal/zzeb;-><init>(Lcom/google/android/recaptcha/internal/zzec;Lnc/r;JLub/e;)V

    const/4 p1, 0x3

    invoke-static {v6, p3, v7, p1}, Lx6/b;->g0(Lnc/d0;Ltc/b;Ldc/p;I)Lnc/z1;

    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1

    :cond_2
    :goto_0
    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method

.method private static final zzo(Ljava/lang/Exception;)Z
    .locals 3

    instance-of v0, p0, Lcom/google/android/recaptcha/internal/zzbd;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    check-cast p0, Lcom/google/android/recaptcha/internal/zzbd;

    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzbd;->zzb()Lcom/google/android/recaptcha/internal/zzbb;

    move-result-object v0

    sget-object v2, Lcom/google/android/recaptcha/internal/zzbb;->zzd:Lcom/google/android/recaptcha/internal/zzbb;

    invoke-static {v0, v2}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzbd;->zzb()Lcom/google/android/recaptcha/internal/zzbb;

    move-result-object v0

    sget-object v2, Lcom/google/android/recaptcha/internal/zzbb;->zze:Lcom/google/android/recaptcha/internal/zzbb;

    invoke-static {v0, v2}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzbd;->zzb()Lcom/google/android/recaptcha/internal/zzbb;

    move-result-object p0

    sget-object v0, Lcom/google/android/recaptcha/internal/zzbb;->zzf:Lcom/google/android/recaptcha/internal/zzbb;

    invoke-static {p0, v0}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    return v1

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    return v1
.end method


# virtual methods
.method public final zza(Ljava/lang/String;Lcom/google/android/recaptcha/RecaptchaAction;JLub/e;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p5

    instance-of v2, v0, Lcom/google/android/recaptcha/internal/zzdu;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/google/android/recaptcha/internal/zzdu;

    iget v3, v2, Lcom/google/android/recaptcha/internal/zzdu;->zzd:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/google/android/recaptcha/internal/zzdu;->zzd:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/google/android/recaptcha/internal/zzdu;

    invoke-direct {v2, v1, v0}, Lcom/google/android/recaptcha/internal/zzdu;-><init>(Lcom/google/android/recaptcha/internal/zzec;Lub/e;)V

    :goto_0
    move-object v8, v2

    iget-object v0, v8, Lcom/google/android/recaptcha/internal/zzdu;->zzb:Ljava/lang/Object;

    sget-object v2, Lvb/a;->a:Lvb/a;

    iget v3, v8, Lcom/google/android/recaptcha/internal/zzdu;->zzd:I

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v3, :cond_4

    if-eq v3, v6, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v2, v8, Lcom/google/android/recaptcha/internal/zzdu;->zzf:Ljava/lang/String;

    iget-object v3, v8, Lcom/google/android/recaptcha/internal/zzdu;->zze:Lcom/google/android/recaptcha/internal/zzec;

    :try_start_0
    invoke-static {v0}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/android/recaptcha/internal/zzbd; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-wide v5, v8, Lcom/google/android/recaptcha/internal/zzdu;->zza:D

    iget-object v3, v8, Lcom/google/android/recaptcha/internal/zzdu;->zzg:Lcom/google/android/recaptcha/RecaptchaAction;

    iget-object v7, v8, Lcom/google/android/recaptcha/internal/zzdu;->zzf:Ljava/lang/String;

    iget-object v9, v8, Lcom/google/android/recaptcha/internal/zzdu;->zze:Lcom/google/android/recaptcha/internal/zzec;

    :try_start_1
    invoke-static {v0}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/android/recaptcha/internal/zzbd; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v10, v9

    move-object v9, v7

    goto :goto_2

    :cond_3
    iget-object v3, v8, Lcom/google/android/recaptcha/internal/zzdu;->zzg:Lcom/google/android/recaptcha/RecaptchaAction;

    iget-object v6, v8, Lcom/google/android/recaptcha/internal/zzdu;->zzf:Ljava/lang/String;

    iget-object v7, v8, Lcom/google/android/recaptcha/internal/zzdu;->zze:Lcom/google/android/recaptcha/internal/zzec;

    :try_start_2
    invoke-static {v0}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Lcom/google/android/recaptcha/internal/zzbd; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-object v15, v6

    move-object v6, v0

    move-object v0, v15

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lrb/f;->b(Ljava/lang/Object;)V

    :try_start_3
    iput-object v1, v8, Lcom/google/android/recaptcha/internal/zzdu;->zze:Lcom/google/android/recaptcha/internal/zzec;

    move-object/from16 v0, p1

    iput-object v0, v8, Lcom/google/android/recaptcha/internal/zzdu;->zzf:Ljava/lang/String;

    move-object/from16 v3, p2

    iput-object v3, v8, Lcom/google/android/recaptcha/internal/zzdu;->zzg:Lcom/google/android/recaptcha/RecaptchaAction;

    iput v6, v8, Lcom/google/android/recaptcha/internal/zzdu;->zzd:I

    move-wide/from16 v6, p3

    invoke-direct {v1, v6, v7, v8}, Lcom/google/android/recaptcha/internal/zzec;->zzm(JLub/e;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v2, :cond_5

    return-object v2

    :cond_5
    move-object v7, v1

    :goto_1
    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    move-result-wide v9

    long-to-double v9, v9

    iget-object v6, v7, Lcom/google/android/recaptcha/internal/zzec;->zza:Lcom/google/android/recaptcha/internal/zzdt;

    const-wide v11, 0x3fdccccccccccccdL    # 0.45

    mul-double/2addr v11, v9

    iput-object v7, v8, Lcom/google/android/recaptcha/internal/zzdu;->zze:Lcom/google/android/recaptcha/internal/zzec;

    iput-object v0, v8, Lcom/google/android/recaptcha/internal/zzdu;->zzf:Ljava/lang/String;

    iput-object v3, v8, Lcom/google/android/recaptcha/internal/zzdu;->zzg:Lcom/google/android/recaptcha/RecaptchaAction;

    const-wide v13, 0x3fe199999999999aL    # 0.55

    mul-double/2addr v9, v13

    iput-wide v9, v8, Lcom/google/android/recaptcha/internal/zzdu;->zza:D

    iput v5, v8, Lcom/google/android/recaptcha/internal/zzdu;->zzd:I

    double-to-long v11, v11

    invoke-virtual {v6, v0, v11, v12, v8}, Lcom/google/android/recaptcha/internal/zzdt;->zzl(Ljava/lang/String;JLub/e;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, v2, :cond_7

    move-wide v15, v9

    move-object v9, v0

    move-object v0, v5

    move-object v10, v7

    move-wide v5, v15

    :goto_2
    check-cast v0, Lcom/google/android/recaptcha/internal/zzsi;

    iget-object v7, v10, Lcom/google/android/recaptcha/internal/zzec;->zza:Lcom/google/android/recaptcha/internal/zzdt;

    iget-object v11, v10, Lcom/google/android/recaptcha/internal/zzec;->zze:Lcom/google/android/recaptcha/internal/zzsc;

    const/4 v12, 0x0

    if-nez v11, :cond_6

    move-object v11, v12

    :cond_6
    invoke-virtual {v7, v3, v0, v11}, Lcom/google/android/recaptcha/internal/zzdt;->zzi(Lcom/google/android/recaptcha/RecaptchaAction;Lcom/google/android/recaptcha/internal/zzsi;Lcom/google/android/recaptcha/internal/zzsc;)Lcom/google/android/recaptcha/internal/zzsp;

    move-result-object v0

    iget-object v3, v10, Lcom/google/android/recaptcha/internal/zzec;->zza:Lcom/google/android/recaptcha/internal/zzdt;

    double-to-long v6, v5

    iput-object v10, v8, Lcom/google/android/recaptcha/internal/zzdu;->zze:Lcom/google/android/recaptcha/internal/zzec;

    iput-object v9, v8, Lcom/google/android/recaptcha/internal/zzdu;->zzf:Ljava/lang/String;

    iput-object v12, v8, Lcom/google/android/recaptcha/internal/zzdu;->zzg:Lcom/google/android/recaptcha/RecaptchaAction;

    iput v4, v8, Lcom/google/android/recaptcha/internal/zzdu;->zzd:I

    move-object v4, v0

    move-object v5, v9

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/recaptcha/internal/zzdt;->zzm(Lcom/google/android/recaptcha/internal/zzsp;Ljava/lang/String;JLub/e;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, v2, :cond_7

    move-object v2, v9

    move-object v3, v10

    :goto_3
    check-cast v0, Lcom/google/android/recaptcha/internal/zzsr;

    iget-object v3, v3, Lcom/google/android/recaptcha/internal/zzec;->zza:Lcom/google/android/recaptcha/internal/zzdt;

    invoke-virtual {v3, v2, v0}, Lcom/google/android/recaptcha/internal/zzdt;->zzq(Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzsr;)V

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzsr;->zzj()Ljava/lang/String;

    move-result-object v0
    :try_end_3
    .catch Lcom/google/android/recaptcha/internal/zzbd; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    return-object v0

    :cond_7
    return-object v2

    :catch_0
    move-exception v0

    new-instance v2, Lcom/google/android/recaptcha/internal/zzbd;

    sget-object v3, Lcom/google/android/recaptcha/internal/zzbb;->zzb:Lcom/google/android/recaptcha/internal/zzbb;

    sget-object v4, Lcom/google/android/recaptcha/internal/zzba;->zzay:Lcom/google/android/recaptcha/internal/zzba;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v4, v0}, Lcom/google/android/recaptcha/internal/zzbd;-><init>(Lcom/google/android/recaptcha/internal/zzbb;Lcom/google/android/recaptcha/internal/zzba;Ljava/lang/String;)V

    throw v2

    :catch_1
    move-exception v0

    throw v0
.end method

.method public final zzb(JLub/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/recaptcha/internal/zzec;->zzn(JLub/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lvb/a;->a:Lvb/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method
