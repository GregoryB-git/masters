.class public final La/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq1/a;
.implements Le7/l0;


# instance fields
.field public a:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, La/a;->a:I

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, La/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lu1/c;)V
    .locals 1

    const-string v0, "UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0"

    invoke-virtual {p1, v0}, Lu1/c;->m(Ljava/lang/String;)V

    return-void
.end method

.method public zza()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, La/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto/16 :goto_0

    .line 7
    .line 8
    :pswitch_0
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpl;->zze()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :pswitch_1
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 20
    .line 21
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzog;->zzc()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :pswitch_2
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 31
    .line 32
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznv;->zza()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    long-to-int v0, v0

    .line 37
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :pswitch_3
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 43
    .line 44
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoh;->zzd()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0

    .line 53
    :pswitch_4
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 54
    .line 55
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoz;->zza()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0

    .line 64
    :pswitch_5
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 65
    .line 66
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznu;->zzo()J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    long-to-int v0, v0

    .line 71
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0

    .line 76
    :pswitch_6
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 77
    .line 78
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznu;->zzai()J

    .line 79
    .line 80
    .line 81
    move-result-wide v0

    .line 82
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    :pswitch_7
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 88
    .line 89
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznu;->zzbm()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    return-object v0

    .line 94
    :pswitch_8
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 95
    .line 96
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznu;->zzbi()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    return-object v0

    .line 101
    :pswitch_9
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 102
    .line 103
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznu;->zzq()J

    .line 104
    .line 105
    .line 106
    move-result-wide v0

    .line 107
    long-to-int v0, v0

    .line 108
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    return-object v0

    .line 113
    :pswitch_a
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 114
    .line 115
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznu;->zzc()J

    .line 116
    .line 117
    .line 118
    move-result-wide v0

    .line 119
    long-to-int v0, v0

    .line 120
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    return-object v0

    .line 125
    :pswitch_b
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 126
    .line 127
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznu;->zzj()J

    .line 128
    .line 129
    .line 130
    move-result-wide v0

    .line 131
    long-to-int v0, v0

    .line 132
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    return-object v0

    .line 137
    :pswitch_c
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 138
    .line 139
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzot;->zza()D

    .line 140
    .line 141
    .line 142
    move-result-wide v0

    .line 143
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    return-object v0

    .line 148
    :pswitch_d
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 149
    .line 150
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznp;->zzb()Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    return-object v0

    .line 159
    :pswitch_e
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 160
    .line 161
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznu;->zzm()J

    .line 162
    .line 163
    .line 164
    move-result-wide v0

    .line 165
    long-to-int v0, v0

    .line 166
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    return-object v0

    .line 171
    :pswitch_f
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 172
    .line 173
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznu;->zzav()J

    .line 174
    .line 175
    .line 176
    move-result-wide v0

    .line 177
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    return-object v0

    .line 182
    :pswitch_10
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 183
    .line 184
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznu;->zzam()J

    .line 185
    .line 186
    .line 187
    move-result-wide v0

    .line 188
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    return-object v0

    .line 193
    :pswitch_11
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 194
    .line 195
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznu;->zzs()J

    .line 196
    .line 197
    .line 198
    move-result-wide v0

    .line 199
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    return-object v0

    .line 204
    :pswitch_12
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 205
    .line 206
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznu;->zzba()J

    .line 207
    .line 208
    .line 209
    move-result-wide v0

    .line 210
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    return-object v0

    .line 215
    :pswitch_13
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 216
    .line 217
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznu;->zzab()J

    .line 218
    .line 219
    .line 220
    move-result-wide v0

    .line 221
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    return-object v0

    .line 226
    :pswitch_14
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 227
    .line 228
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznu;->zzae()J

    .line 229
    .line 230
    .line 231
    move-result-wide v0

    .line 232
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    return-object v0

    .line 237
    :pswitch_15
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 238
    .line 239
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzob;->zzb()Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    return-object v0

    .line 248
    :pswitch_16
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 249
    .line 250
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznu;->zzaw()J

    .line 251
    .line 252
    .line 253
    move-result-wide v0

    .line 254
    long-to-int v0, v0

    .line 255
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    return-object v0

    .line 260
    :pswitch_17
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 261
    .line 262
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznu;->zzat()J

    .line 263
    .line 264
    .line 265
    move-result-wide v0

    .line 266
    long-to-int v0, v0

    .line 267
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    return-object v0

    .line 272
    :pswitch_18
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 273
    .line 274
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoy;->zzb()Z

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    return-object v0

    .line 283
    :pswitch_19
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 284
    .line 285
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoy;->zzk()Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    return-object v0

    .line 294
    :pswitch_1a
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoy;->zze()Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    return-object v0

    .line 303
    :goto_0
    sget-object v0, Le7/h0;->a:Ljava/util/List;

    .line 304
    .line 305
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpl;->zza()Z

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    return-object v0

    .line 314
    nop

    .line 315
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
