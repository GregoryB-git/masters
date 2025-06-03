.class public final Le7/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Le7/a1;


# direct methods
.method public constructor <init>(Le7/a1;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput p2, p0, Le7/c1;->a:I

    iput-object p3, p0, Le7/c1;->b:Ljava/lang/String;

    iput-object p4, p0, Le7/c1;->c:Ljava/lang/Object;

    iput-object p5, p0, Le7/c1;->d:Ljava/lang/Object;

    iput-object p6, p0, Le7/c1;->e:Ljava/lang/Object;

    iput-object p1, p0, Le7/c1;->f:Le7/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    iget-object v0, p0, Le7/c1;->f:Le7/a1;

    .line 2
    .line 3
    iget-object v0, v0, Ld2/q;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Le7/j2;

    .line 6
    .line 7
    invoke-virtual {v0}, Le7/j2;->j()Le7/l1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-boolean v1, v0, Le7/d3;->c:Z

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Le7/c1;->f:Le7/a1;

    .line 16
    .line 17
    const/4 v1, 0x6

    .line 18
    const-string v2, "Persisted config not initialized. Not logging error/warn"

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Le7/a1;->s(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v1, p0, Le7/c1;->f:Le7/a1;

    .line 25
    .line 26
    iget-char v2, v1, Le7/a1;->d:C

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    const/4 v4, 0x0

    .line 30
    if-nez v2, :cond_6

    .line 31
    .line 32
    invoke-virtual {v1}, Ld2/q;->h()Le7/h;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v2, v1, Le7/h;->f:Ljava/lang/Boolean;

    .line 37
    .line 38
    if-nez v2, :cond_4

    .line 39
    .line 40
    monitor-enter v1

    .line 41
    :try_start_0
    iget-object v2, v1, Le7/h;->f:Ljava/lang/Boolean;

    .line 42
    .line 43
    if-nez v2, :cond_3

    .line 44
    .line 45
    invoke-virtual {v1}, Ld2/q;->zza()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {}, Lv6/f;->a()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    .line 60
    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    move v2, v3

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move v2, v4

    .line 72
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    iput-object v2, v1, Le7/h;->f:Ljava/lang/Boolean;

    .line 77
    .line 78
    :cond_2
    iget-object v2, v1, Le7/h;->f:Ljava/lang/Boolean;

    .line 79
    .line 80
    if-nez v2, :cond_3

    .line 81
    .line 82
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 83
    .line 84
    iput-object v2, v1, Le7/h;->f:Ljava/lang/Boolean;

    .line 85
    .line 86
    invoke-virtual {v1}, Ld2/q;->zzj()Le7/a1;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    iget-object v2, v2, Le7/a1;->o:Le7/b1;

    .line 91
    .line 92
    const-string v5, "My process not in the list of running processes"

    .line 93
    .line 94
    invoke-virtual {v2, v5}, Le7/b1;->b(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    monitor-exit v1

    .line 98
    goto :goto_1

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    throw v0

    .line 102
    :cond_4
    :goto_1
    iget-object v1, v1, Le7/h;->f:Ljava/lang/Boolean;

    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_5

    .line 109
    .line 110
    iget-object v1, p0, Le7/c1;->f:Le7/a1;

    .line 111
    .line 112
    const/16 v2, 0x43

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_5
    iget-object v1, p0, Le7/c1;->f:Le7/a1;

    .line 116
    .line 117
    const/16 v2, 0x63

    .line 118
    .line 119
    :goto_2
    iput-char v2, v1, Le7/a1;->d:C

    .line 120
    .line 121
    :cond_6
    iget-object v1, p0, Le7/c1;->f:Le7/a1;

    .line 122
    .line 123
    iget-wide v5, v1, Le7/a1;->e:J

    .line 124
    .line 125
    const-wide/16 v7, 0x0

    .line 126
    .line 127
    cmp-long v2, v5, v7

    .line 128
    .line 129
    if-gez v2, :cond_7

    .line 130
    .line 131
    const-wide/32 v5, 0x1bd5a

    .line 132
    .line 133
    .line 134
    iput-wide v5, v1, Le7/a1;->e:J

    .line 135
    .line 136
    :cond_7
    const-string v1, "01VDIWEA?"

    .line 137
    .line 138
    iget v2, p0, Le7/c1;->a:I

    .line 139
    .line 140
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    iget-object v2, p0, Le7/c1;->f:Le7/a1;

    .line 145
    .line 146
    iget-char v5, v2, Le7/a1;->d:C

    .line 147
    .line 148
    iget-wide v9, v2, Le7/a1;->e:J

    .line 149
    .line 150
    iget-object v2, p0, Le7/c1;->b:Ljava/lang/String;

    .line 151
    .line 152
    iget-object v6, p0, Le7/c1;->c:Ljava/lang/Object;

    .line 153
    .line 154
    iget-object v11, p0, Le7/c1;->d:Ljava/lang/Object;

    .line 155
    .line 156
    iget-object v12, p0, Le7/c1;->e:Ljava/lang/Object;

    .line 157
    .line 158
    invoke-static {v3, v2, v6, v11, v12}, Le7/a1;->r(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    new-instance v6, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string v11, "2"

    .line 165
    .line 166
    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v6, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v1, ":"

    .line 179
    .line 180
    invoke-static {v6, v1, v2}, Lg;->f(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    const/16 v5, 0x400

    .line 189
    .line 190
    if-le v2, v5, :cond_8

    .line 191
    .line 192
    iget-object v1, p0, Le7/c1;->b:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v1, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    :cond_8
    iget-object v0, v0, Le7/l1;->o:Le7/p1;

    .line 199
    .line 200
    if-eqz v0, :cond_e

    .line 201
    .line 202
    iget-object v2, v0, Le7/p1;->e:Le7/l1;

    .line 203
    .line 204
    invoke-virtual {v2}, Ld2/q;->l()V

    .line 205
    .line 206
    .line 207
    iget-object v2, v0, Le7/p1;->e:Le7/l1;

    .line 208
    .line 209
    invoke-virtual {v2}, Le7/l1;->v()Landroid/content/SharedPreferences;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    iget-object v5, v0, Le7/p1;->a:Ljava/lang/String;

    .line 214
    .line 215
    invoke-interface {v2, v5, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 216
    .line 217
    .line 218
    move-result-wide v5

    .line 219
    cmp-long v2, v5, v7

    .line 220
    .line 221
    if-nez v2, :cond_9

    .line 222
    .line 223
    invoke-virtual {v0}, Le7/p1;->a()V

    .line 224
    .line 225
    .line 226
    :cond_9
    if-nez v1, :cond_a

    .line 227
    .line 228
    const-string v1, ""

    .line 229
    .line 230
    :cond_a
    iget-object v2, v0, Le7/p1;->e:Le7/l1;

    .line 231
    .line 232
    invoke-virtual {v2}, Le7/l1;->v()Landroid/content/SharedPreferences;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    iget-object v5, v0, Le7/p1;->b:Ljava/lang/String;

    .line 237
    .line 238
    invoke-interface {v2, v5, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 239
    .line 240
    .line 241
    move-result-wide v5

    .line 242
    cmp-long v2, v5, v7

    .line 243
    .line 244
    const-wide/16 v7, 0x1

    .line 245
    .line 246
    if-gtz v2, :cond_b

    .line 247
    .line 248
    iget-object v2, v0, Le7/p1;->e:Le7/l1;

    .line 249
    .line 250
    invoke-virtual {v2}, Le7/l1;->v()Landroid/content/SharedPreferences;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    iget-object v3, v0, Le7/p1;->c:Ljava/lang/String;

    .line 259
    .line 260
    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 261
    .line 262
    .line 263
    iget-object v0, v0, Le7/p1;->b:Ljava/lang/String;

    .line 264
    .line 265
    invoke-interface {v2, v0, v7, v8}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 266
    .line 267
    .line 268
    goto :goto_4

    .line 269
    :cond_b
    iget-object v2, v0, Le7/p1;->e:Le7/l1;

    .line 270
    .line 271
    invoke-virtual {v2}, Ld2/q;->k()Le7/r6;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    invoke-virtual {v2}, Le7/r6;->C0()Ljava/security/SecureRandom;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-virtual {v2}, Ljava/util/Random;->nextLong()J

    .line 280
    .line 281
    .line 282
    move-result-wide v9

    .line 283
    const-wide v11, 0x7fffffffffffffffL

    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    and-long/2addr v9, v11

    .line 289
    add-long/2addr v5, v7

    .line 290
    div-long/2addr v11, v5

    .line 291
    cmp-long v2, v9, v11

    .line 292
    .line 293
    if-gez v2, :cond_c

    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_c
    move v3, v4

    .line 297
    :goto_3
    iget-object v2, v0, Le7/p1;->e:Le7/l1;

    .line 298
    .line 299
    invoke-virtual {v2}, Le7/l1;->v()Landroid/content/SharedPreferences;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    if-eqz v3, :cond_d

    .line 308
    .line 309
    iget-object v3, v0, Le7/p1;->c:Ljava/lang/String;

    .line 310
    .line 311
    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 312
    .line 313
    .line 314
    :cond_d
    iget-object v0, v0, Le7/p1;->b:Ljava/lang/String;

    .line 315
    .line 316
    invoke-interface {v2, v0, v5, v6}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 317
    .line 318
    .line 319
    :goto_4
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 320
    .line 321
    .line 322
    :cond_e
    return-void
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
