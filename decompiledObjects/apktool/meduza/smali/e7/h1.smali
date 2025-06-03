.class public final Le7/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Ljava/net/URL;

.field public final b:[B

.field public final c:Le7/f1;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic f:Le7/g1;


# direct methods
.method public constructor <init>(Le7/g1;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Le7/f1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/net/URL;",
            "[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Le7/f1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Le7/h1;->f:Le7/g1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p3}, Lm6/j;->i(Ljava/lang/Object;)V

    iput-object p3, p0, Le7/h1;->a:Ljava/net/URL;

    iput-object p4, p0, Le7/h1;->b:[B

    iput-object p6, p0, Le7/h1;->c:Le7/f1;

    iput-object p2, p0, Le7/h1;->d:Ljava/lang/String;

    iput-object p5, p0, Le7/h1;->e:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .line 1
    const-string v1, "Error closing HTTP compressed POST connection output stream. appId"

    .line 2
    .line 3
    iget-object v0, p0, Le7/h1;->f:Le7/g1;

    .line 4
    .line 5
    iget-object v0, v0, Ld2/q;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Le7/j2;

    .line 8
    .line 9
    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Le7/e2;->x()V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    :try_start_0
    iget-object v0, p0, Le7/h1;->a:Ljava/net/URL;

    .line 19
    .line 20
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzda;->zza()Lcom/google/android/gms/internal/measurement/zzda;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const-string v5, "client-measurement"

    .line 25
    .line 26
    invoke-virtual {v4, v0, v5}, Lcom/google/android/gms/internal/measurement/zzda;->zza(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URLConnection;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    instance-of v4, v0, Ljava/net/HttpURLConnection;

    .line 31
    .line 32
    if-eqz v4, :cond_2

    .line 33
    .line 34
    move-object v4, v0

    .line 35
    check-cast v4, Ljava/net/HttpURLConnection;

    .line 36
    .line 37
    invoke-virtual {v4, v2}, Ljava/net/URLConnection;->setDefaultUseCaches(Z)V

    .line 38
    .line 39
    .line 40
    const v0, 0xea60

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 44
    .line 45
    .line 46
    const v0, 0xee48

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v2}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    invoke-virtual {v4, v0}, Ljava/net/URLConnection;->setDoInput(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 57
    .line 58
    .line 59
    :try_start_1
    iget-object v5, p0, Le7/h1;->e:Ljava/util/Map;

    .line 60
    .line 61
    if-eqz v5, :cond_0

    .line 62
    .line 63
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_0

    .line 76
    .line 77
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    check-cast v6, Ljava/util/Map$Entry;

    .line 82
    .line 83
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    check-cast v7, Ljava/lang/String;

    .line 88
    .line 89
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    check-cast v6, Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v4, v7, v6}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    iget-object v5, p0, Le7/h1;->b:[B

    .line 100
    .line 101
    if-eqz v5, :cond_1

    .line 102
    .line 103
    iget-object v5, p0, Le7/h1;->f:Le7/g1;

    .line 104
    .line 105
    invoke-virtual {v5}, Le7/z5;->m()Le7/o6;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    iget-object v6, p0, Le7/h1;->b:[B

    .line 110
    .line 111
    invoke-virtual {v5, v6}, Le7/o6;->V([B)[B

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    iget-object v6, p0, Le7/h1;->f:Le7/g1;

    .line 116
    .line 117
    invoke-virtual {v6}, Ld2/q;->zzj()Le7/a1;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    iget-object v6, v6, Le7/a1;->w:Le7/b1;

    .line 122
    .line 123
    const-string v7, "Uploading data. size"

    .line 124
    .line 125
    array-length v8, v5

    .line 126
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    invoke-virtual {v6, v7, v8}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4, v0}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 134
    .line 135
    .line 136
    const-string v0, "Content-Encoding"

    .line 137
    .line 138
    const-string v6, "gzip"

    .line 139
    .line 140
    invoke-virtual {v4, v0, v6}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    array-length v0, v5

    .line 144
    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4}, Ljava/net/URLConnection;->connect()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v4}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 151
    .line 152
    .line 153
    move-result-object v6
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 154
    :try_start_2
    invoke-virtual {v6, v5}, Ljava/io/OutputStream;->write([B)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :catchall_0
    move-exception v0

    .line 162
    move-object v9, v3

    .line 163
    move-object v3, v6

    .line 164
    move v6, v2

    .line 165
    goto :goto_4

    .line 166
    :catch_0
    move-exception v0

    .line 167
    move-object v9, v0

    .line 168
    move v8, v2

    .line 169
    move-object v11, v3

    .line 170
    move-object v3, v6

    .line 171
    goto/16 :goto_8

    .line 172
    .line 173
    :cond_1
    :goto_1
    :try_start_3
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 174
    .line 175
    .line 176
    move-result v10
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 177
    :try_start_4
    invoke-virtual {v4}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 178
    .line 179
    .line 180
    move-result-object v13
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 181
    :try_start_5
    invoke-static {v4}, Le7/g1;->t(Ljava/net/HttpURLConnection;)[B

    .line 182
    .line 183
    .line 184
    move-result-object v12
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 185
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 186
    .line 187
    .line 188
    iget-object v0, p0, Le7/h1;->f:Le7/g1;

    .line 189
    .line 190
    invoke-virtual {v0}, Ld2/q;->zzl()Le7/e2;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    new-instance v1, Le7/i1;

    .line 195
    .line 196
    iget-object v8, p0, Le7/h1;->d:Ljava/lang/String;

    .line 197
    .line 198
    iget-object v9, p0, Le7/h1;->c:Le7/f1;

    .line 199
    .line 200
    const/4 v11, 0x0

    .line 201
    move-object v7, v1

    .line 202
    invoke-direct/range {v7 .. v13}, Le7/i1;-><init>(Ljava/lang/String;Le7/f1;ILjava/io/IOException;[BLjava/util/Map;)V

    .line 203
    .line 204
    .line 205
    goto/16 :goto_a

    .line 206
    .line 207
    :catchall_1
    move-exception v0

    .line 208
    move-object v2, v0

    .line 209
    move v6, v10

    .line 210
    move-object v9, v13

    .line 211
    goto :goto_5

    .line 212
    :catch_1
    move-exception v0

    .line 213
    move v2, v10

    .line 214
    goto :goto_7

    .line 215
    :catchall_2
    move-exception v0

    .line 216
    move v2, v10

    .line 217
    goto :goto_2

    .line 218
    :catch_2
    move-exception v0

    .line 219
    move v2, v10

    .line 220
    goto :goto_3

    .line 221
    :catchall_3
    move-exception v0

    .line 222
    :goto_2
    move v6, v2

    .line 223
    move-object v9, v3

    .line 224
    goto :goto_4

    .line 225
    :catch_3
    move-exception v0

    .line 226
    :goto_3
    move-object v13, v3

    .line 227
    goto :goto_7

    .line 228
    :cond_2
    :try_start_6
    new-instance v0, Ljava/io/IOException;

    .line 229
    .line 230
    const-string v4, "Failed to obtain HTTP connection"

    .line 231
    .line 232
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw v0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 236
    :catchall_4
    move-exception v0

    .line 237
    move v6, v2

    .line 238
    move-object v4, v3

    .line 239
    move-object v9, v4

    .line 240
    :goto_4
    move-object v2, v0

    .line 241
    :goto_5
    if-eqz v3, :cond_3

    .line 242
    .line 243
    :try_start_7
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    .line 244
    .line 245
    .line 246
    goto :goto_6

    .line 247
    :catch_4
    move-exception v0

    .line 248
    move-object v3, v0

    .line 249
    iget-object v0, p0, Le7/h1;->f:Le7/g1;

    .line 250
    .line 251
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 256
    .line 257
    iget-object v5, p0, Le7/h1;->d:Ljava/lang/String;

    .line 258
    .line 259
    invoke-static {v5}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    invoke-virtual {v0, v1, v5, v3}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    :cond_3
    :goto_6
    if-eqz v4, :cond_4

    .line 267
    .line 268
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 269
    .line 270
    .line 271
    :cond_4
    iget-object v0, p0, Le7/h1;->f:Le7/g1;

    .line 272
    .line 273
    invoke-virtual {v0}, Ld2/q;->zzl()Le7/e2;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    new-instance v1, Le7/i1;

    .line 278
    .line 279
    iget-object v4, p0, Le7/h1;->d:Ljava/lang/String;

    .line 280
    .line 281
    iget-object v5, p0, Le7/h1;->c:Le7/f1;

    .line 282
    .line 283
    const/4 v7, 0x0

    .line 284
    const/4 v8, 0x0

    .line 285
    move-object v3, v1

    .line 286
    invoke-direct/range {v3 .. v9}, Le7/i1;-><init>(Ljava/lang/String;Le7/f1;ILjava/io/IOException;[BLjava/util/Map;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, v1}, Le7/e2;->u(Ljava/lang/Runnable;)V

    .line 290
    .line 291
    .line 292
    throw v2

    .line 293
    :catch_5
    move-exception v0

    .line 294
    move-object v4, v3

    .line 295
    move-object v13, v4

    .line 296
    :goto_7
    move-object v9, v0

    .line 297
    move v8, v2

    .line 298
    move-object v11, v13

    .line 299
    :goto_8
    if-eqz v3, :cond_5

    .line 300
    .line 301
    :try_start_8
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    .line 302
    .line 303
    .line 304
    goto :goto_9

    .line 305
    :catch_6
    move-exception v0

    .line 306
    move-object v2, v0

    .line 307
    iget-object v0, p0, Le7/h1;->f:Le7/g1;

    .line 308
    .line 309
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 314
    .line 315
    iget-object v3, p0, Le7/h1;->d:Ljava/lang/String;

    .line 316
    .line 317
    invoke-static {v3}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    invoke-virtual {v0, v1, v3, v2}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    :cond_5
    :goto_9
    if-eqz v4, :cond_6

    .line 325
    .line 326
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 327
    .line 328
    .line 329
    :cond_6
    iget-object v0, p0, Le7/h1;->f:Le7/g1;

    .line 330
    .line 331
    invoke-virtual {v0}, Ld2/q;->zzl()Le7/e2;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    new-instance v1, Le7/i1;

    .line 336
    .line 337
    iget-object v6, p0, Le7/h1;->d:Ljava/lang/String;

    .line 338
    .line 339
    iget-object v7, p0, Le7/h1;->c:Le7/f1;

    .line 340
    .line 341
    const/4 v10, 0x0

    .line 342
    move-object v5, v1

    .line 343
    invoke-direct/range {v5 .. v11}, Le7/i1;-><init>(Ljava/lang/String;Le7/f1;ILjava/io/IOException;[BLjava/util/Map;)V

    .line 344
    .line 345
    .line 346
    :goto_a
    invoke-virtual {v0, v1}, Le7/e2;->u(Ljava/lang/Runnable;)V

    .line 347
    .line 348
    .line 349
    return-void
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
