.class public final Le7/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:J

.field public final synthetic c:Le7/o;


# direct methods
.method public constructor <init>(Le7/o;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Le7/r;->c:Le7/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    iput-object p2, p0, Le7/r;->a:Ljava/lang/String;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Le7/r;->b:J

    return-void
.end method

.method public constructor <init>(Le7/o;Ljava/lang/String;J)V
    .locals 2

    iput-object p1, p0, Le7/r;->c:Le7/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    iput-object p2, p0, Le7/r;->a:Ljava/lang/String;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x1

    aput-object p2, v0, p3

    const-string p2, "select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1"

    const-wide/16 p3, -0x1

    .line 1
    invoke-virtual {p1, p2, v0, p3, p4}, Le7/o;->w(Ljava/lang/String;[Ljava/lang/String;J)J

    move-result-wide p1

    .line 2
    iput-wide p1, p0, Le7/r;->b:J

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le7/q;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    new-instance v2, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v6, "app_id = ? and rowid > ?"

    .line 9
    .line 10
    const/4 v12, 0x2

    .line 11
    new-array v7, v12, [Ljava/lang/String;

    .line 12
    .line 13
    iget-object v0, v1, Le7/r;->a:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v13, 0x0

    .line 16
    aput-object v0, v7, v13

    .line 17
    .line 18
    iget-wide v3, v1, Le7/r;->b:J

    .line 19
    .line 20
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v14, 0x1

    .line 25
    aput-object v0, v7, v14

    .line 26
    .line 27
    const/4 v15, 0x0

    .line 28
    :try_start_0
    iget-object v0, v1, Le7/r;->c:Le7/o;

    .line 29
    .line 30
    invoke-virtual {v0}, Le7/o;->s()Landroid/database/sqlite/SQLiteDatabase;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const-string v4, "raw_events"

    .line 35
    .line 36
    const-string v16, "rowid"

    .line 37
    .line 38
    const-string v17, "name"

    .line 39
    .line 40
    const-string v18, "timestamp"

    .line 41
    .line 42
    const-string v19, "metadata_fingerprint"

    .line 43
    .line 44
    const-string v20, "data"

    .line 45
    .line 46
    const-string v21, "realtime"

    .line 47
    .line 48
    filled-new-array/range {v16 .. v21}, [Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    const/4 v8, 0x0

    .line 53
    const/4 v9, 0x0

    .line 54
    const-string v10, "rowid"

    .line 55
    .line 56
    const-string v11, "1000"

    .line 57
    .line 58
    invoke-virtual/range {v3 .. v11}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 59
    .line 60
    .line 61
    move-result-object v15

    .line 62
    invoke-interface {v15}, Landroid/database/Cursor;->moveToFirst()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_0

    .line 67
    .line 68
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v0
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    invoke-interface {v15}, Landroid/database/Cursor;->close()V

    .line 73
    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_0
    :try_start_1
    invoke-interface {v15, v13}, Landroid/database/Cursor;->getLong(I)J

    .line 77
    .line 78
    .line 79
    move-result-wide v4

    .line 80
    const/4 v0, 0x3

    .line 81
    invoke-interface {v15, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 82
    .line 83
    .line 84
    move-result-wide v6

    .line 85
    const/4 v0, 0x5

    .line 86
    invoke-interface {v15, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 87
    .line 88
    .line 89
    move-result-wide v8

    .line 90
    const-wide/16 v10, 0x1

    .line 91
    .line 92
    cmp-long v0, v8, v10

    .line 93
    .line 94
    if-nez v0, :cond_1

    .line 95
    .line 96
    move v8, v14

    .line 97
    goto :goto_0

    .line 98
    :cond_1
    move v8, v13

    .line 99
    :goto_0
    const/4 v0, 0x4

    .line 100
    invoke-interface {v15, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget-wide v9, v1, Le7/r;->b:J

    .line 105
    .line 106
    cmp-long v3, v4, v9

    .line 107
    .line 108
    if-lez v3, :cond_2

    .line 109
    .line 110
    iput-wide v4, v1, Le7/r;->b:J
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    .line 112
    :cond_2
    :try_start_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzgf$zzf;->zze()Lcom/google/android/gms/internal/measurement/zzgf$zzf$zza;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-static {v3, v0}, Le7/o6;->z(Lcom/google/android/gms/internal/measurement/zzkg$zza;[B)Lcom/google/android/gms/internal/measurement/zzlp;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzgf$zzf$zza;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 121
    .line 122
    :try_start_3
    invoke-interface {v15, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    if-eqz v3, :cond_3

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_3
    const-string v3, ""

    .line 130
    .line 131
    :goto_1
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/zzgf$zzf$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgf$zzf$zza;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-interface {v15, v12}, Landroid/database/Cursor;->getLong(I)J

    .line 136
    .line 137
    .line 138
    move-result-wide v9

    .line 139
    invoke-virtual {v3, v9, v10}, Lcom/google/android/gms/internal/measurement/zzgf$zzf$zza;->zzb(J)Lcom/google/android/gms/internal/measurement/zzgf$zzf$zza;

    .line 140
    .line 141
    .line 142
    new-instance v10, Le7/q;

    .line 143
    .line 144
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzkg$zza;->zzaj()Lcom/google/android/gms/internal/measurement/zzlm;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzkg;

    .line 149
    .line 150
    move-object v9, v0

    .line 151
    check-cast v9, Lcom/google/android/gms/internal/measurement/zzgf$zzf;

    .line 152
    .line 153
    move-object v3, v10

    .line 154
    invoke-direct/range {v3 .. v9}, Le7/q;-><init>(JJZLcom/google/android/gms/internal/measurement/zzgf$zzf;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :catchall_0
    move-exception v0

    .line 162
    goto :goto_5

    .line 163
    :catch_0
    move-exception v0

    .line 164
    goto :goto_3

    .line 165
    :catch_1
    move-exception v0

    .line 166
    iget-object v3, v1, Le7/r;->c:Le7/o;

    .line 167
    .line 168
    invoke-virtual {v3}, Ld2/q;->zzj()Le7/a1;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    iget-object v3, v3, Le7/a1;->o:Le7/b1;

    .line 173
    .line 174
    const-string v4, "Data loss. Failed to merge raw event. appId"

    .line 175
    .line 176
    iget-object v5, v1, Le7/r;->a:Ljava/lang/String;

    .line 177
    .line 178
    invoke-static {v5}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-virtual {v3, v4, v5, v0}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    :goto_2
    invoke-interface {v15}, Landroid/database/Cursor;->moveToNext()Z

    .line 186
    .line 187
    .line 188
    move-result v0
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 189
    if-nez v0, :cond_0

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :goto_3
    :try_start_4
    iget-object v3, v1, Le7/r;->c:Le7/o;

    .line 193
    .line 194
    invoke-virtual {v3}, Ld2/q;->zzj()Le7/a1;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    iget-object v3, v3, Le7/a1;->o:Le7/b1;

    .line 199
    .line 200
    const-string v4, "Data loss. Error querying raw events batch. appId"

    .line 201
    .line 202
    iget-object v5, v1, Le7/r;->a:Ljava/lang/String;

    .line 203
    .line 204
    invoke-static {v5}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    invoke-virtual {v3, v4, v5, v0}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 209
    .line 210
    .line 211
    if-eqz v15, :cond_4

    .line 212
    .line 213
    :goto_4
    invoke-interface {v15}, Landroid/database/Cursor;->close()V

    .line 214
    .line 215
    .line 216
    :cond_4
    return-object v2

    .line 217
    :goto_5
    if-eqz v15, :cond_5

    .line 218
    .line 219
    invoke-interface {v15}, Landroid/database/Cursor;->close()V

    .line 220
    .line 221
    .line 222
    :cond_5
    throw v0
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
