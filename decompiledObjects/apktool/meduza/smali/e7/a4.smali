.class public final Le7/a4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public synthetic b:Le7/k3;


# direct methods
.method public synthetic constructor <init>(Le7/k3;I)V
    .locals 0

    iput p2, p0, Le7/a4;->a:I

    iput-object p1, p0, Le7/a4;->b:Le7/k3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Le7/a4;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto/16 :goto_5

    .line 7
    .line 8
    :pswitch_0
    iget-object v0, p0, Le7/a4;->b:Le7/k3;

    .line 9
    .line 10
    iget-object v0, v0, Le7/k3;->A:Le7/w6;

    .line 11
    .line 12
    iget-object v1, v0, Le7/w6;->a:Le7/j2;

    .line 13
    .line 14
    invoke-virtual {v1}, Le7/j2;->zzl()Le7/e2;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Le7/e2;->l()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Le7/w6;->b()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    goto/16 :goto_4

    .line 28
    .line 29
    :cond_0
    invoke-virtual {v0}, Le7/w6;->c()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const-wide/16 v2, 0x1

    .line 34
    .line 35
    const-string v4, "_cc"

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget-object v1, v0, Le7/w6;->a:Le7/j2;

    .line 41
    .line 42
    invoke-virtual {v1}, Le7/j2;->j()Le7/l1;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-object v1, v1, Le7/l1;->G:Le7/r1;

    .line 47
    .line 48
    invoke-virtual {v1, v5}, Le7/r1;->b(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v1, Landroid/os/Bundle;

    .line 52
    .line 53
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 54
    .line 55
    .line 56
    const-string v5, "(not set)"

    .line 57
    .line 58
    const-string v6, "source"

    .line 59
    .line 60
    invoke-virtual {v1, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v6, "medium"

    .line 64
    .line 65
    invoke-virtual {v1, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v5, "_cis"

    .line 69
    .line 70
    const-string v6, "intent"

    .line 71
    .line 72
    invoke-virtual {v1, v5, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v4, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 76
    .line 77
    .line 78
    iget-object v2, v0, Le7/w6;->a:Le7/j2;

    .line 79
    .line 80
    invoke-virtual {v2}, Le7/j2;->k()Le7/k3;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    const-string v3, "auto"

    .line 85
    .line 86
    const-string v4, "_cmpx"

    .line 87
    .line 88
    invoke-virtual {v2, v3, v4, v1}, Le7/k3;->Q(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_3

    .line 92
    .line 93
    :cond_1
    iget-object v1, v0, Le7/w6;->a:Le7/j2;

    .line 94
    .line 95
    invoke-virtual {v1}, Le7/j2;->j()Le7/l1;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iget-object v1, v1, Le7/l1;->G:Le7/r1;

    .line 100
    .line 101
    invoke-virtual {v1}, Le7/r1;->a()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eqz v6, :cond_2

    .line 110
    .line 111
    iget-object v1, v0, Le7/w6;->a:Le7/j2;

    .line 112
    .line 113
    invoke-virtual {v1}, Le7/j2;->zzj()Le7/a1;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iget-object v1, v1, Le7/a1;->p:Le7/b1;

    .line 118
    .line 119
    const-string v2, "Cache still valid but referrer not found"

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Le7/b1;->b(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_2
    iget-object v6, v0, Le7/w6;->a:Le7/j2;

    .line 126
    .line 127
    invoke-virtual {v6}, Le7/j2;->j()Le7/l1;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    iget-object v6, v6, Le7/l1;->H:Le7/q1;

    .line 132
    .line 133
    invoke-virtual {v6}, Le7/q1;->a()J

    .line 134
    .line 135
    .line 136
    move-result-wide v6

    .line 137
    const-wide/32 v8, 0x36ee80

    .line 138
    .line 139
    .line 140
    div-long/2addr v6, v8

    .line 141
    sub-long/2addr v6, v2

    .line 142
    mul-long/2addr v6, v8

    .line 143
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    new-instance v2, Landroid/os/Bundle;

    .line 148
    .line 149
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 150
    .line 151
    .line 152
    new-instance v3, Landroid/util/Pair;

    .line 153
    .line 154
    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    invoke-direct {v3, v8, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v9

    .line 173
    if-eqz v9, :cond_3

    .line 174
    .line 175
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    check-cast v9, Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {v1, v9}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    invoke-virtual {v2, v9, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    goto :goto_0

    .line 189
    :cond_3
    iget-object v1, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v1, Landroid/os/Bundle;

    .line 192
    .line 193
    invoke-virtual {v1, v4, v6, v7}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 194
    .line 195
    .line 196
    iget-object v1, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 197
    .line 198
    if-nez v1, :cond_4

    .line 199
    .line 200
    const-string v1, "app"

    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_4
    check-cast v1, Ljava/lang/String;

    .line 204
    .line 205
    :goto_1
    iget-object v2, v0, Le7/w6;->a:Le7/j2;

    .line 206
    .line 207
    invoke-virtual {v2}, Le7/j2;->k()Le7/k3;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v3, Landroid/os/Bundle;

    .line 214
    .line 215
    const-string v4, "_cmp"

    .line 216
    .line 217
    invoke-virtual {v2, v1, v4, v3}, Le7/k3;->Q(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 218
    .line 219
    .line 220
    :goto_2
    iget-object v1, v0, Le7/w6;->a:Le7/j2;

    .line 221
    .line 222
    invoke-virtual {v1}, Le7/j2;->j()Le7/l1;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    iget-object v1, v1, Le7/l1;->G:Le7/r1;

    .line 227
    .line 228
    invoke-virtual {v1, v5}, Le7/r1;->b(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    :goto_3
    iget-object v0, v0, Le7/w6;->a:Le7/j2;

    .line 232
    .line 233
    invoke-virtual {v0}, Le7/j2;->j()Le7/l1;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    iget-object v0, v0, Le7/l1;->H:Le7/q1;

    .line 238
    .line 239
    const-wide/16 v1, 0x0

    .line 240
    .line 241
    invoke-virtual {v0, v1, v2}, Le7/q1;->b(J)V

    .line 242
    .line 243
    .line 244
    :goto_4
    return-void

    .line 245
    :goto_5
    iget-object v0, p0, Le7/a4;->b:Le7/k3;

    .line 246
    .line 247
    invoke-virtual {v0}, Le7/k3;->L()V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
