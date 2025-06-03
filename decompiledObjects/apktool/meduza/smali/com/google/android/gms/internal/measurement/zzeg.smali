.class final Lcom/google/android/gms/internal/measurement/zzeg;
.super Lcom/google/android/gms/internal/measurement/zzed$zzb;
.source "SourceFile"


# instance fields
.field private final synthetic zzc:Ljava/lang/String;

.field private final synthetic zzd:Ljava/lang/String;

.field private final synthetic zze:Landroid/content/Context;

.field private final synthetic zzf:Landroid/os/Bundle;

.field private final synthetic zzg:Lcom/google/android/gms/internal/measurement/zzed;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/zzed;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Landroid/os/Bundle;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzeg;->zzc:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzeg;->zzd:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/zzeg;->zze:Landroid/content/Context;

    iput-object p5, p0, Lcom/google/android/gms/internal/measurement/zzeg;->zzf:Landroid/os/Bundle;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzeg;->zzg:Lcom/google/android/gms/internal/measurement/zzed;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzed$zzb;-><init>(Lcom/google/android/gms/internal/measurement/zzed;)V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "com.google.android.gms.measurement.dynamite"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    :try_start_0
    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/zzeg;->zzg:Lcom/google/android/gms/internal/measurement/zzed;

    .line 8
    .line 9
    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzeg;->zzc:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzeg;->zzd:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v4, v5, v6}, Lcom/google/android/gms/internal/measurement/zzed;->zza(Lcom/google/android/gms/internal/measurement/zzed;Ljava/lang/String;Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzeg;->zzd:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/zzeg;->zzc:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzeg;->zzg:Lcom/google/android/gms/internal/measurement/zzed;

    .line 25
    .line 26
    invoke-static {v6}, Lcom/google/android/gms/internal/measurement/zzed;->zzb(Lcom/google/android/gms/internal/measurement/zzed;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    move-object v14, v4

    .line 31
    move-object v15, v5

    .line 32
    move-object v13, v6

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v13, v5

    .line 35
    move-object v14, v13

    .line 36
    move-object v15, v14

    .line 37
    :goto_0
    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/zzeg;->zze:Landroid/content/Context;

    .line 38
    .line 39
    invoke-static {v4}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/zzeg;->zzg:Lcom/google/android/gms/internal/measurement/zzed;

    .line 43
    .line 44
    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzeg;->zze:Landroid/content/Context;

    .line 45
    .line 46
    invoke-virtual {v4, v5, v3}, Lcom/google/android/gms/internal/measurement/zzed;->zza(Landroid/content/Context;Z)Lcom/google/android/gms/internal/measurement/zzdl;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/measurement/zzed;->zza(Lcom/google/android/gms/internal/measurement/zzed;Lcom/google/android/gms/internal/measurement/zzdl;)V

    .line 51
    .line 52
    .line 53
    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/zzeg;->zzg:Lcom/google/android/gms/internal/measurement/zzed;

    .line 54
    .line 55
    invoke-static {v4}, Lcom/google/android/gms/internal/measurement/zzed;->zza(Lcom/google/android/gms/internal/measurement/zzed;)Lcom/google/android/gms/internal/measurement/zzdl;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    if-nez v4, :cond_1

    .line 60
    .line 61
    iget-object v0, v1, Lcom/google/android/gms/internal/measurement/zzeg;->zzg:Lcom/google/android/gms/internal/measurement/zzed;

    .line 62
    .line 63
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzed;->zzb(Lcom/google/android/gms/internal/measurement/zzed;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const-string v4, "Failed to connect to measurement client."

    .line 68
    .line 69
    invoke-static {v0, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_1
    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/zzeg;->zze:Landroid/content/Context;

    .line 74
    .line 75
    invoke-static {v4, v0}, Lcom/google/android/gms/dynamite/DynamiteModule;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzeg;->zze:Landroid/content/Context;

    .line 80
    .line 81
    invoke-static {v5, v0, v2}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Landroid/content/Context;Ljava/lang/String;Z)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-ge v0, v4, :cond_2

    .line 90
    .line 91
    move v12, v3

    .line 92
    goto :goto_1

    .line 93
    :cond_2
    move v12, v2

    .line 94
    :goto_1
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdz;

    .line 95
    .line 96
    const-wide/32 v8, 0x1bd5a

    .line 97
    .line 98
    .line 99
    int-to-long v10, v5

    .line 100
    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/zzeg;->zzf:Landroid/os/Bundle;

    .line 101
    .line 102
    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzeg;->zze:Landroid/content/Context;

    .line 103
    .line 104
    invoke-static {v5}, Le7/f2;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v17

    .line 108
    move-object v7, v0

    .line 109
    move-object/from16 v16, v4

    .line 110
    .line 111
    invoke-direct/range {v7 .. v17}, Lcom/google/android/gms/internal/measurement/zzdz;-><init>(JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/zzeg;->zzg:Lcom/google/android/gms/internal/measurement/zzed;

    .line 115
    .line 116
    invoke-static {v4}, Lcom/google/android/gms/internal/measurement/zzed;->zza(Lcom/google/android/gms/internal/measurement/zzed;)Lcom/google/android/gms/internal/measurement/zzdl;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-static {v4}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzeg;->zze:Landroid/content/Context;

    .line 124
    .line 125
    invoke-static {v5}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    iget-wide v6, v1, Lcom/google/android/gms/internal/measurement/zzed$zzb;->zza:J

    .line 130
    .line 131
    invoke-interface {v4, v5, v0, v6, v7}, Lcom/google/android/gms/internal/measurement/zzdl;->initialize(Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/internal/measurement/zzdz;J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :catch_0
    move-exception v0

    .line 136
    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/zzeg;->zzg:Lcom/google/android/gms/internal/measurement/zzed;

    .line 137
    .line 138
    invoke-static {v4, v0, v3, v2}, Lcom/google/android/gms/internal/measurement/zzed;->zza(Lcom/google/android/gms/internal/measurement/zzed;Ljava/lang/Exception;ZZ)V

    .line 139
    .line 140
    .line 141
    return-void
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
