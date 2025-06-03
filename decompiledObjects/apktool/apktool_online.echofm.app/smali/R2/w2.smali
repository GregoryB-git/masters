.class public final LR2/w2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lcom/google/android/gms/internal/measurement/c0;

.field public final synthetic p:Landroid/content/ServiceConnection;

.field public final synthetic q:LR2/t2;


# direct methods
.method public constructor <init>(LR2/t2;Lcom/google/android/gms/internal/measurement/c0;Landroid/content/ServiceConnection;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/w2;->q:LR2/t2;

    .line 2
    .line 3
    iput-object p2, p0, LR2/w2;->o:Lcom/google/android/gms/internal/measurement/c0;

    .line 4
    .line 5
    iput-object p3, p0, LR2/w2;->p:Landroid/content/ServiceConnection;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LR2/w2;->q:LR2/t2;

    .line 4
    .line 5
    iget-object v2, v1, LR2/t2;->b:LR2/u2;

    .line 6
    .line 7
    invoke-static {v1}, LR2/t2;->a(LR2/t2;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v3, v0, LR2/w2;->o:Lcom/google/android/gms/internal/measurement/c0;

    .line 12
    .line 13
    iget-object v4, v0, LR2/w2;->p:Landroid/content/ServiceConnection;

    .line 14
    .line 15
    invoke-virtual {v2, v1, v3}, LR2/u2;->a(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/c0;)Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v5, v2, LR2/u2;->a:LR2/N2;

    .line 20
    .line 21
    invoke-virtual {v5}, LR2/N2;->e()LR2/G2;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual {v5}, LR2/m3;->n()V

    .line 26
    .line 27
    .line 28
    iget-object v5, v2, LR2/u2;->a:LR2/N2;

    .line 29
    .line 30
    invoke-virtual {v5}, LR2/N2;->Q()V

    .line 31
    .line 32
    .line 33
    if-eqz v3, :cond_9

    .line 34
    .line 35
    const-string v5, "install_begin_timestamp_seconds"

    .line 36
    .line 37
    const-wide/16 v6, 0x0

    .line 38
    .line 39
    invoke-virtual {v3, v5, v6, v7}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 40
    .line 41
    .line 42
    move-result-wide v8

    .line 43
    const-wide/16 v10, 0x3e8

    .line 44
    .line 45
    mul-long/2addr v8, v10

    .line 46
    cmp-long v5, v8, v6

    .line 47
    .line 48
    if-nez v5, :cond_0

    .line 49
    .line 50
    iget-object v1, v2, LR2/u2;->a:LR2/N2;

    .line 51
    .line 52
    invoke-virtual {v1}, LR2/N2;->j()LR2/Y1;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, LR2/Y1;->L()LR2/a2;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const-string v3, "Service response is missing Install Referrer install timestamp"

    .line 61
    .line 62
    :goto_0
    invoke-virtual {v1, v3}, LR2/a2;->a(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_4

    .line 66
    .line 67
    :cond_0
    const-string v5, "install_referrer"

    .line 68
    .line 69
    invoke-virtual {v3, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    if-eqz v5, :cond_8

    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result v12

    .line 79
    if-eqz v12, :cond_1

    .line 80
    .line 81
    goto/16 :goto_3

    .line 82
    .line 83
    :cond_1
    iget-object v12, v2, LR2/u2;->a:LR2/N2;

    .line 84
    .line 85
    invoke-virtual {v12}, LR2/N2;->j()LR2/Y1;

    .line 86
    .line 87
    .line 88
    move-result-object v12

    .line 89
    invoke-virtual {v12}, LR2/Y1;->K()LR2/a2;

    .line 90
    .line 91
    .line 92
    move-result-object v12

    .line 93
    const-string v13, "InstallReferrer API result"

    .line 94
    .line 95
    invoke-virtual {v12, v13, v5}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object v12, v2, LR2/u2;->a:LR2/N2;

    .line 99
    .line 100
    invoke-virtual {v12}, LR2/N2;->L()LR2/S5;

    .line 101
    .line 102
    .line 103
    move-result-object v12

    .line 104
    new-instance v13, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    const-string v14, "?"

    .line 107
    .line 108
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-static {}, Lcom/google/android/gms/internal/measurement/y7;->a()Z

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    if-eqz v13, :cond_2

    .line 127
    .line 128
    iget-object v13, v2, LR2/u2;->a:LR2/N2;

    .line 129
    .line 130
    invoke-virtual {v13}, LR2/N2;->z()LR2/g;

    .line 131
    .line 132
    .line 133
    move-result-object v13

    .line 134
    sget-object v14, LR2/K;->F0:LR2/P1;

    .line 135
    .line 136
    invoke-virtual {v13, v14}, LR2/g;->s(LR2/P1;)Z

    .line 137
    .line 138
    .line 139
    move-result v13

    .line 140
    if-eqz v13, :cond_2

    .line 141
    .line 142
    const/4 v13, 0x1

    .line 143
    goto :goto_1

    .line 144
    :cond_2
    const/4 v13, 0x0

    .line 145
    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/H6;->a()Z

    .line 146
    .line 147
    .line 148
    move-result v14

    .line 149
    if-eqz v14, :cond_3

    .line 150
    .line 151
    iget-object v14, v2, LR2/u2;->a:LR2/N2;

    .line 152
    .line 153
    invoke-virtual {v14}, LR2/N2;->z()LR2/g;

    .line 154
    .line 155
    .line 156
    move-result-object v14

    .line 157
    sget-object v15, LR2/K;->a1:LR2/P1;

    .line 158
    .line 159
    invoke-virtual {v14, v15}, LR2/g;->s(LR2/P1;)Z

    .line 160
    .line 161
    .line 162
    move-result v14

    .line 163
    if-eqz v14, :cond_3

    .line 164
    .line 165
    const/4 v14, 0x1

    .line 166
    goto :goto_2

    .line 167
    :cond_3
    const/4 v14, 0x0

    .line 168
    :goto_2
    invoke-virtual {v12, v5, v13, v14}, LR2/S5;->D(Landroid/net/Uri;ZZ)Landroid/os/Bundle;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    if-nez v5, :cond_4

    .line 173
    .line 174
    iget-object v1, v2, LR2/u2;->a:LR2/N2;

    .line 175
    .line 176
    invoke-virtual {v1}, LR2/N2;->j()LR2/Y1;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    const-string v3, "No campaign params defined in Install Referrer result"

    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_4
    const-string v12, "medium"

    .line 188
    .line 189
    invoke-virtual {v5, v12}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v12

    .line 193
    if-eqz v12, :cond_6

    .line 194
    .line 195
    const-string v13, "(not set)"

    .line 196
    .line 197
    invoke-virtual {v13, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 198
    .line 199
    .line 200
    move-result v13

    .line 201
    if-nez v13, :cond_6

    .line 202
    .line 203
    const-string v13, "organic"

    .line 204
    .line 205
    invoke-virtual {v13, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 206
    .line 207
    .line 208
    move-result v12

    .line 209
    if-nez v12, :cond_6

    .line 210
    .line 211
    const-string v12, "referrer_click_timestamp_seconds"

    .line 212
    .line 213
    invoke-virtual {v3, v12, v6, v7}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 214
    .line 215
    .line 216
    move-result-wide v12

    .line 217
    mul-long/2addr v12, v10

    .line 218
    cmp-long v3, v12, v6

    .line 219
    .line 220
    if-nez v3, :cond_5

    .line 221
    .line 222
    iget-object v1, v2, LR2/u2;->a:LR2/N2;

    .line 223
    .line 224
    invoke-virtual {v1}, LR2/N2;->j()LR2/Y1;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    const-string v3, "Install Referrer is missing click timestamp for ad campaign"

    .line 233
    .line 234
    goto/16 :goto_0

    .line 235
    .line 236
    :cond_5
    const-string v3, "click_timestamp"

    .line 237
    .line 238
    invoke-virtual {v5, v3, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 239
    .line 240
    .line 241
    :cond_6
    iget-object v3, v2, LR2/u2;->a:LR2/N2;

    .line 242
    .line 243
    invoke-virtual {v3}, LR2/N2;->F()LR2/l2;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    iget-object v3, v3, LR2/l2;->f:LR2/q2;

    .line 248
    .line 249
    invoke-virtual {v3}, LR2/q2;->a()J

    .line 250
    .line 251
    .line 252
    move-result-wide v6

    .line 253
    cmp-long v3, v8, v6

    .line 254
    .line 255
    if-nez v3, :cond_7

    .line 256
    .line 257
    iget-object v3, v2, LR2/u2;->a:LR2/N2;

    .line 258
    .line 259
    invoke-virtual {v3}, LR2/N2;->j()LR2/Y1;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    invoke-virtual {v3}, LR2/Y1;->K()LR2/a2;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    const-string v6, "Logging Install Referrer campaign from module while it may have already been logged."

    .line 268
    .line 269
    invoke-virtual {v3, v6}, LR2/a2;->a(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    :cond_7
    iget-object v3, v2, LR2/u2;->a:LR2/N2;

    .line 273
    .line 274
    invoke-virtual {v3}, LR2/N2;->p()Z

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    if-eqz v3, :cond_9

    .line 279
    .line 280
    iget-object v3, v2, LR2/u2;->a:LR2/N2;

    .line 281
    .line 282
    invoke-virtual {v3}, LR2/N2;->F()LR2/l2;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    iget-object v3, v3, LR2/l2;->f:LR2/q2;

    .line 287
    .line 288
    invoke-virtual {v3, v8, v9}, LR2/q2;->b(J)V

    .line 289
    .line 290
    .line 291
    iget-object v3, v2, LR2/u2;->a:LR2/N2;

    .line 292
    .line 293
    invoke-virtual {v3}, LR2/N2;->j()LR2/Y1;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    invoke-virtual {v3}, LR2/Y1;->K()LR2/a2;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    const-string v6, "Logging Install Referrer campaign from gmscore with "

    .line 302
    .line 303
    const-string v7, "referrer API v2"

    .line 304
    .line 305
    invoke-virtual {v3, v6, v7}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    const-string v3, "_cis"

    .line 309
    .line 310
    invoke-virtual {v5, v3, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    iget-object v3, v2, LR2/u2;->a:LR2/N2;

    .line 314
    .line 315
    invoke-virtual {v3}, LR2/N2;->H()LR2/C3;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    const-string v6, "auto"

    .line 320
    .line 321
    const-string v7, "_cmp"

    .line 322
    .line 323
    invoke-virtual {v3, v6, v7, v5, v1}, LR2/C3;->Y(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    goto :goto_4

    .line 327
    :cond_8
    :goto_3
    iget-object v1, v2, LR2/u2;->a:LR2/N2;

    .line 328
    .line 329
    invoke-virtual {v1}, LR2/N2;->j()LR2/Y1;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    const-string v3, "No referrer defined in Install Referrer response"

    .line 338
    .line 339
    goto/16 :goto_0

    .line 340
    .line 341
    :cond_9
    :goto_4
    if-eqz v4, :cond_a

    .line 342
    .line 343
    invoke-static {}, LD2/b;->b()LD2/b;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    iget-object v2, v2, LR2/u2;->a:LR2/N2;

    .line 348
    .line 349
    invoke-virtual {v2}, LR2/N2;->a()Landroid/content/Context;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    invoke-virtual {v1, v2, v4}, LD2/b;->c(Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 354
    .line 355
    .line 356
    :cond_a
    return-void
.end method
