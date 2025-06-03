.class public final Le7/v5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Le7/q5;


# direct methods
.method public constructor <init>(Le7/q5;)V
    .locals 0

    iput-object p1, p0, Le7/v5;->a:Le7/q5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Le7/v5;->a:Le7/q5;

    .line 2
    .line 3
    invoke-virtual {v0}, Le7/o0;->l()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le7/v5;->a:Le7/q5;

    .line 7
    .line 8
    invoke-virtual {v0}, Ld2/q;->j()Le7/l1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Le7/v5;->a:Le7/q5;

    .line 13
    .line 14
    invoke-virtual {v1}, Ld2/q;->zzb()Lv6/b;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lb/z;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    invoke-virtual {v0, v1, v2}, Le7/l1;->r(J)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, Le7/v5;->a:Le7/q5;

    .line 34
    .line 35
    invoke-virtual {v0}, Ld2/q;->j()Le7/l1;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v0, v0, Le7/l1;->v:Le7/o1;

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-virtual {v0, v1}, Le7/o1;->a(Z)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 46
    .line 47
    invoke-direct {v0}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 51
    .line 52
    .line 53
    iget v0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 54
    .line 55
    const/16 v1, 0x64

    .line 56
    .line 57
    if-ne v0, v1, :cond_0

    .line 58
    .line 59
    iget-object v0, p0, Le7/v5;->a:Le7/q5;

    .line 60
    .line 61
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v0, v0, Le7/a1;->w:Le7/b1;

    .line 66
    .line 67
    const-string v1, "Detected application was in foreground"

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Le7/b1;->b(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Le7/v5;->a:Le7/q5;

    .line 73
    .line 74
    invoke-virtual {v0}, Ld2/q;->zzb()Lv6/b;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Lb/z;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 84
    .line 85
    .line 86
    move-result-wide v0

    .line 87
    invoke-virtual {p0, v0, v1}, Le7/v5;->c(J)V

    .line 88
    .line 89
    .line 90
    :cond_0
    return-void
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

.method public final b(JZ)V
    .locals 1

    .line 1
    iget-object p3, p0, Le7/v5;->a:Le7/q5;

    .line 2
    .line 3
    invoke-virtual {p3}, Le7/o0;->l()V

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, Le7/v5;->a:Le7/q5;

    .line 7
    .line 8
    invoke-virtual {p3}, Le7/q5;->v()V

    .line 9
    .line 10
    .line 11
    iget-object p3, p0, Le7/v5;->a:Le7/q5;

    .line 12
    .line 13
    invoke-virtual {p3}, Ld2/q;->j()Le7/l1;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-virtual {p3, p1, p2}, Le7/l1;->r(J)Z

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-eqz p3, :cond_0

    .line 22
    .line 23
    iget-object p3, p0, Le7/v5;->a:Le7/q5;

    .line 24
    .line 25
    invoke-virtual {p3}, Ld2/q;->j()Le7/l1;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    iget-object p3, p3, Le7/l1;->v:Le7/o1;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-virtual {p3, v0}, Le7/o1;->a(Z)V

    .line 33
    .line 34
    .line 35
    iget-object p3, p0, Le7/v5;->a:Le7/q5;

    .line 36
    .line 37
    invoke-virtual {p3}, Le7/o0;->m()Le7/t0;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    invoke-virtual {p3}, Le7/t0;->x()V

    .line 42
    .line 43
    .line 44
    :cond_0
    iget-object p3, p0, Le7/v5;->a:Le7/q5;

    .line 45
    .line 46
    invoke-virtual {p3}, Ld2/q;->j()Le7/l1;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    iget-object p3, p3, Le7/l1;->z:Le7/q1;

    .line 51
    .line 52
    invoke-virtual {p3, p1, p2}, Le7/q1;->b(J)V

    .line 53
    .line 54
    .line 55
    iget-object p3, p0, Le7/v5;->a:Le7/q5;

    .line 56
    .line 57
    invoke-virtual {p3}, Ld2/q;->j()Le7/l1;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    iget-object p3, p3, Le7/l1;->v:Le7/o1;

    .line 62
    .line 63
    invoke-virtual {p3}, Le7/o1;->b()Z

    .line 64
    .line 65
    .line 66
    move-result p3

    .line 67
    if-eqz p3, :cond_1

    .line 68
    .line 69
    invoke-virtual {p0, p1, p2}, Le7/v5;->c(J)V

    .line 70
    .line 71
    .line 72
    :cond_1
    return-void
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
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
.end method

.method public final c(J)V
    .locals 9

    .line 1
    iget-object v0, p0, Le7/v5;->a:Le7/q5;

    .line 2
    .line 3
    invoke-virtual {v0}, Le7/o0;->l()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le7/v5;->a:Le7/q5;

    .line 7
    .line 8
    iget-object v0, v0, Ld2/q;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Le7/j2;

    .line 11
    .line 12
    invoke-virtual {v0}, Le7/j2;->d()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, p0, Le7/v5;->a:Le7/q5;

    .line 20
    .line 21
    invoke-virtual {v0}, Ld2/q;->j()Le7/l1;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v0, v0, Le7/l1;->z:Le7/q1;

    .line 26
    .line 27
    invoke-virtual {v0, p1, p2}, Le7/q1;->b(J)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Le7/v5;->a:Le7/q5;

    .line 31
    .line 32
    invoke-virtual {v0}, Ld2/q;->zzb()Lv6/b;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lb/z;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    iget-object v2, p0, Le7/v5;->a:Le7/q5;

    .line 46
    .line 47
    invoke-virtual {v2}, Ld2/q;->zzj()Le7/a1;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iget-object v2, v2, Le7/a1;->w:Le7/b1;

    .line 52
    .line 53
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-string v1, "Session started, time"

    .line 58
    .line 59
    invoke-virtual {v2, v1, v0}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    const-wide/16 v0, 0x3e8

    .line 63
    .line 64
    div-long v0, p1, v0

    .line 65
    .line 66
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v1, p0, Le7/v5;->a:Le7/q5;

    .line 71
    .line 72
    invoke-virtual {v1}, Le7/o0;->o()Le7/k3;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const-string v3, "auto"

    .line 77
    .line 78
    const-string v4, "_sid"

    .line 79
    .line 80
    move-object v5, v0

    .line 81
    move-wide v6, p1

    .line 82
    invoke-virtual/range {v2 .. v7}, Le7/k3;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    .line 83
    .line 84
    .line 85
    iget-object v1, p0, Le7/v5;->a:Le7/q5;

    .line 86
    .line 87
    invoke-virtual {v1}, Ld2/q;->j()Le7/l1;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iget-object v1, v1, Le7/l1;->A:Le7/q1;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 94
    .line 95
    .line 96
    move-result-wide v2

    .line 97
    invoke-virtual {v1, v2, v3}, Le7/q1;->b(J)V

    .line 98
    .line 99
    .line 100
    iget-object v1, p0, Le7/v5;->a:Le7/q5;

    .line 101
    .line 102
    invoke-virtual {v1}, Ld2/q;->j()Le7/l1;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iget-object v1, v1, Le7/l1;->v:Le7/o1;

    .line 107
    .line 108
    const/4 v2, 0x0

    .line 109
    invoke-virtual {v1, v2}, Le7/o1;->a(Z)V

    .line 110
    .line 111
    .line 112
    new-instance v6, Landroid/os/Bundle;

    .line 113
    .line 114
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 118
    .line 119
    .line 120
    move-result-wide v0

    .line 121
    const-string v2, "_sid"

    .line 122
    .line 123
    invoke-virtual {v6, v2, v0, v1}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 124
    .line 125
    .line 126
    iget-object v0, p0, Le7/v5;->a:Le7/q5;

    .line 127
    .line 128
    invoke-virtual {v0}, Le7/o0;->o()Le7/k3;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    const-string v4, "auto"

    .line 133
    .line 134
    const-string v5, "_s"

    .line 135
    .line 136
    move-wide v7, p1

    .line 137
    invoke-virtual/range {v3 .. v8}, Le7/k3;->D(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 138
    .line 139
    .line 140
    iget-object v0, p0, Le7/v5;->a:Le7/q5;

    .line 141
    .line 142
    invoke-virtual {v0}, Ld2/q;->j()Le7/l1;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iget-object v0, v0, Le7/l1;->F:Le7/r1;

    .line 147
    .line 148
    invoke-virtual {v0}, Le7/r1;->a()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-nez v1, :cond_1

    .line 157
    .line 158
    new-instance v5, Landroid/os/Bundle;

    .line 159
    .line 160
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 161
    .line 162
    .line 163
    const-string v1, "_ffr"

    .line 164
    .line 165
    invoke-virtual {v5, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    iget-object v0, p0, Le7/v5;->a:Le7/q5;

    .line 169
    .line 170
    invoke-virtual {v0}, Le7/o0;->o()Le7/k3;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    const-string v3, "auto"

    .line 175
    .line 176
    const-string v4, "_ssr"

    .line 177
    .line 178
    move-wide v6, p1

    .line 179
    invoke-virtual/range {v2 .. v7}, Le7/k3;->D(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 180
    .line 181
    .line 182
    :cond_1
    return-void
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
.end method
