.class public final synthetic Le7/l2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public synthetic b:Le7/k6;

.field public synthetic c:Lcom/google/android/gms/measurement/internal/zzig;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/zzig;Le7/k6;I)V
    .locals 0

    iput p3, p0, Le7/l2;->a:I

    iput-object p1, p0, Le7/l2;->c:Lcom/google/android/gms/measurement/internal/zzig;

    iput-object p2, p0, Le7/l2;->b:Le7/k6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Le7/l2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Le7/l2;->c:Lcom/google/android/gms/measurement/internal/zzig;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 10
    .line 11
    invoke-virtual {v0}, Le7/i6;->c0()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Le7/l2;->c:Lcom/google/android/gms/measurement/internal/zzig;

    .line 15
    .line 16
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 17
    .line 18
    iget-object v1, p0, Le7/l2;->b:Le7/k6;

    .line 19
    .line 20
    invoke-static {v0}, La0/j;->q(Le7/i6;)V

    .line 21
    .line 22
    .line 23
    iget-object v2, v1, Le7/k6;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v2}, Lm6/j;->e(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Le7/i6;->e(Le7/k6;)Le7/k1;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_1
    iget-object v0, p0, Le7/l2;->c:Lcom/google/android/gms/measurement/internal/zzig;

    .line 33
    .line 34
    iget-object v1, p0, Le7/l2;->b:Le7/k6;

    .line 35
    .line 36
    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/zzig;->zza(Lcom/google/android/gms/measurement/internal/zzig;Le7/k6;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :goto_0
    iget-object v0, p0, Le7/l2;->c:Lcom/google/android/gms/measurement/internal/zzig;

    .line 41
    .line 42
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 43
    .line 44
    invoke-virtual {v0}, Le7/i6;->c0()V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Le7/l2;->c:Lcom/google/android/gms/measurement/internal/zzig;

    .line 48
    .line 49
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 50
    .line 51
    iget-object v1, p0, Le7/l2;->b:Le7/k6;

    .line 52
    .line 53
    const-string v2, "app_id=?"

    .line 54
    .line 55
    iget-object v3, v0, Le7/i6;->G:Ljava/util/ArrayList;

    .line 56
    .line 57
    if-eqz v3, :cond_0

    .line 58
    .line 59
    new-instance v3, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object v3, v0, Le7/i6;->H:Ljava/util/ArrayList;

    .line 65
    .line 66
    iget-object v4, v0, Le7/i6;->G:Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 69
    .line 70
    .line 71
    :cond_0
    iget-object v3, v0, Le7/i6;->c:Le7/o;

    .line 72
    .line 73
    invoke-static {v3}, Le7/i6;->q(Le7/h6;)V

    .line 74
    .line 75
    .line 76
    iget-object v4, v1, Le7/k6;->a:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v4}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v4}, Lm6/j;->e(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3}, Ld2/q;->l()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Le7/h6;->p()V

    .line 88
    .line 89
    .line 90
    :try_start_0
    invoke-virtual {v3}, Le7/o;->s()Landroid/database/sqlite/SQLiteDatabase;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    const/4 v6, 0x1

    .line 95
    new-array v6, v6, [Ljava/lang/String;

    .line 96
    .line 97
    const/4 v7, 0x0

    .line 98
    aput-object v4, v6, v7

    .line 99
    .line 100
    const-string v8, "apps"

    .line 101
    .line 102
    invoke-virtual {v5, v8, v2, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    add-int/2addr v8, v7

    .line 107
    const-string v7, "events"

    .line 108
    .line 109
    invoke-virtual {v5, v7, v2, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    add-int/2addr v8, v7

    .line 114
    const-string v7, "events_snapshot"

    .line 115
    .line 116
    invoke-virtual {v5, v7, v2, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    add-int/2addr v8, v7

    .line 121
    const-string v7, "user_attributes"

    .line 122
    .line 123
    invoke-virtual {v5, v7, v2, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    add-int/2addr v8, v7

    .line 128
    const-string v7, "conditional_properties"

    .line 129
    .line 130
    invoke-virtual {v5, v7, v2, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    add-int/2addr v8, v7

    .line 135
    const-string v7, "raw_events"

    .line 136
    .line 137
    invoke-virtual {v5, v7, v2, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    add-int/2addr v8, v7

    .line 142
    const-string v7, "raw_events_metadata"

    .line 143
    .line 144
    invoke-virtual {v5, v7, v2, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    add-int/2addr v8, v7

    .line 149
    const-string v7, "queue"

    .line 150
    .line 151
    invoke-virtual {v5, v7, v2, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 152
    .line 153
    .line 154
    move-result v7

    .line 155
    add-int/2addr v8, v7

    .line 156
    const-string v7, "audience_filter_values"

    .line 157
    .line 158
    invoke-virtual {v5, v7, v2, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 159
    .line 160
    .line 161
    move-result v7

    .line 162
    add-int/2addr v8, v7

    .line 163
    const-string v7, "main_event_params"

    .line 164
    .line 165
    invoke-virtual {v5, v7, v2, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    add-int/2addr v8, v7

    .line 170
    const-string v7, "default_event_params"

    .line 171
    .line 172
    invoke-virtual {v5, v7, v2, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    add-int/2addr v8, v7

    .line 177
    const-string v7, "trigger_uris"

    .line 178
    .line 179
    invoke-virtual {v5, v7, v2, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    add-int/2addr v8, v7

    .line 184
    const-string v7, "upload_queue"

    .line 185
    .line 186
    invoke-virtual {v5, v7, v2, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    add-int/2addr v8, v2

    .line 191
    if-lez v8, :cond_1

    .line 192
    .line 193
    invoke-virtual {v3}, Ld2/q;->zzj()Le7/a1;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    iget-object v2, v2, Le7/a1;->w:Le7/b1;

    .line 198
    .line 199
    const-string v5, "Reset analytics data. app, records"

    .line 200
    .line 201
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    invoke-virtual {v2, v5, v4, v6}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 206
    .line 207
    .line 208
    goto :goto_1

    .line 209
    :catch_0
    move-exception v2

    .line 210
    invoke-virtual {v3}, Ld2/q;->zzj()Le7/a1;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    iget-object v3, v3, Le7/a1;->o:Le7/b1;

    .line 215
    .line 216
    invoke-static {v4}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    const-string v5, "Error resetting analytics data. appId, error"

    .line 221
    .line 222
    invoke-virtual {v3, v5, v4, v2}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    :cond_1
    :goto_1
    iget-boolean v2, v1, Le7/k6;->p:Z

    .line 226
    .line 227
    if-eqz v2, :cond_2

    .line 228
    .line 229
    invoke-virtual {v0, v1}, Le7/i6;->Q(Le7/k6;)V

    .line 230
    .line 231
    .line 232
    :cond_2
    return-void

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
