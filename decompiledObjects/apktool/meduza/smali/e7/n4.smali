.class public final Le7/n4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Ljava/net/URL;

.field public final b:[B

.field public final c:Le7/k4;

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

.field public final synthetic f:Le7/l4;


# direct methods
.method public constructor <init>(Le7/l4;Ljava/lang/String;Ljava/net/URL;[BLjava/util/HashMap;Le7/k4;)V
    .locals 0

    iput-object p1, p0, Le7/n4;->f:Le7/l4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    iput-object p3, p0, Le7/n4;->a:Ljava/net/URL;

    iput-object p4, p0, Le7/n4;->b:[B

    iput-object p6, p0, Le7/n4;->c:Le7/k4;

    iput-object p2, p0, Le7/n4;->d:Ljava/lang/String;

    iput-object p5, p0, Le7/n4;->e:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(ILjava/io/IOException;[BLjava/util/Map;)V
    .locals 8

    iget-object v0, p0, Le7/n4;->f:Le7/l4;

    invoke-virtual {v0}, Ld2/q;->zzl()Le7/e2;

    move-result-object v0

    new-instance v7, Le7/m4;

    move-object v1, v7

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Le7/m4;-><init>(Le7/n4;ILjava/io/IOException;[BLjava/util/Map;)V

    invoke-virtual {v0, v7}, Le7/e2;->u(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final run()V
    .locals 9

    .line 1
    const-string v0, "Error closing HTTP compressed POST connection output stream. appId"

    .line 2
    .line 3
    iget-object v1, p0, Le7/n4;->f:Le7/l4;

    .line 4
    .line 5
    iget-object v1, v1, Ld2/q;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Le7/j2;

    .line 8
    .line 9
    invoke-virtual {v1}, Le7/j2;->zzl()Le7/e2;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Le7/e2;->x()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    :try_start_0
    iget-object v3, p0, Le7/n4;->a:Ljava/net/URL;

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
    invoke-virtual {v4, v3, v5}, Lcom/google/android/gms/internal/measurement/zzda;->zza(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URLConnection;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    instance-of v4, v3, Ljava/net/HttpURLConnection;

    .line 31
    .line 32
    if-eqz v4, :cond_2

    .line 33
    .line 34
    check-cast v3, Ljava/net/HttpURLConnection;

    .line 35
    .line 36
    invoke-virtual {v3, v1}, Ljava/net/URLConnection;->setDefaultUseCaches(Z)V

    .line 37
    .line 38
    .line 39
    const v4, 0xea60

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 43
    .line 44
    .line 45
    const v4, 0xee48

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 52
    .line 53
    .line 54
    const/4 v4, 0x1

    .line 55
    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setDoInput(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 56
    .line 57
    .line 58
    :try_start_1
    iget-object v5, p0, Le7/n4;->e:Ljava/util/Map;

    .line 59
    .line 60
    if-eqz v5, :cond_0

    .line 61
    .line 62
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-eqz v6, :cond_0

    .line 75
    .line 76
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    check-cast v6, Ljava/util/Map$Entry;

    .line 81
    .line 82
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    check-cast v7, Ljava/lang/String;

    .line 87
    .line 88
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    check-cast v6, Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v3, v7, v6}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    iget-object v5, p0, Le7/n4;->b:[B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 99
    .line 100
    if-eqz v5, :cond_1

    .line 101
    .line 102
    :try_start_2
    new-instance v6, Ljava/io/ByteArrayOutputStream;

    .line 103
    .line 104
    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 105
    .line 106
    .line 107
    new-instance v7, Ljava/util/zip/GZIPOutputStream;

    .line 108
    .line 109
    invoke-direct {v7, v6}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v7, v5}, Ljava/io/OutputStream;->write([B)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 122
    .line 123
    .line 124
    move-result-object v5
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 125
    :try_start_3
    iget-object v6, p0, Le7/n4;->f:Le7/l4;

    .line 126
    .line 127
    invoke-virtual {v6}, Ld2/q;->zzj()Le7/a1;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    iget-object v6, v6, Le7/a1;->w:Le7/b1;

    .line 132
    .line 133
    const-string v7, "Uploading data. size"

    .line 134
    .line 135
    array-length v8, v5

    .line 136
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    invoke-virtual {v6, v7, v8}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 144
    .line 145
    .line 146
    const-string v4, "Content-Encoding"

    .line 147
    .line 148
    const-string v6, "gzip"

    .line 149
    .line 150
    invoke-virtual {v3, v4, v6}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    array-length v4, v5

    .line 154
    invoke-virtual {v3, v4}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3}, Ljava/net/URLConnection;->connect()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 161
    .line 162
    .line 163
    move-result-object v4
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 164
    :try_start_4
    invoke-virtual {v4, v5}, Ljava/io/OutputStream;->write([B)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :catchall_0
    move-exception v5

    .line 172
    move-object v6, v5

    .line 173
    move-object v5, v2

    .line 174
    goto :goto_3

    .line 175
    :catch_0
    move-exception v5

    .line 176
    move-object v6, v5

    .line 177
    move-object v5, v2

    .line 178
    goto/16 :goto_6

    .line 179
    .line 180
    :catch_1
    move-exception v4

    .line 181
    :try_start_5
    iget-object v5, p0, Le7/n4;->f:Le7/l4;

    .line 182
    .line 183
    invoke-virtual {v5}, Ld2/q;->zzj()Le7/a1;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    iget-object v5, v5, Le7/a1;->o:Le7/b1;

    .line 188
    .line 189
    const-string v6, "Failed to gzip post request content"

    .line 190
    .line 191
    invoke-virtual {v5, v6, v4}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    throw v4

    .line 195
    :cond_1
    :goto_1
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    invoke-virtual {v3}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 200
    .line 201
    .line 202
    move-result-object v4
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 203
    :try_start_6
    invoke-static {v3}, Le7/l4;->p(Ljava/net/HttpURLConnection;)[B

    .line 204
    .line 205
    .line 206
    move-result-object v0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 207
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0, v1, v2, v0, v4}, Le7/n4;->a(ILjava/io/IOException;[BLjava/util/Map;)V

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    :catchall_1
    move-exception v5

    .line 215
    move-object v6, v5

    .line 216
    move-object v5, v4

    .line 217
    move-object v4, v2

    .line 218
    goto :goto_3

    .line 219
    :catch_2
    move-exception v5

    .line 220
    move-object v6, v5

    .line 221
    move-object v5, v4

    .line 222
    move-object v4, v2

    .line 223
    goto :goto_6

    .line 224
    :catchall_2
    move-exception v4

    .line 225
    move-object v5, v4

    .line 226
    goto :goto_2

    .line 227
    :catch_3
    move-exception v4

    .line 228
    move-object v5, v4

    .line 229
    goto :goto_5

    .line 230
    :cond_2
    :try_start_7
    new-instance v3, Ljava/io/IOException;

    .line 231
    .line 232
    const-string v4, "Failed to obtain HTTP connection"

    .line 233
    .line 234
    invoke-direct {v3, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw v3
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 238
    :catchall_3
    move-exception v3

    .line 239
    move-object v5, v3

    .line 240
    move-object v3, v2

    .line 241
    :goto_2
    move-object v4, v2

    .line 242
    move-object v6, v5

    .line 243
    move-object v5, v4

    .line 244
    :goto_3
    if-eqz v4, :cond_3

    .line 245
    .line 246
    :try_start_8
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4

    .line 247
    .line 248
    .line 249
    goto :goto_4

    .line 250
    :catch_4
    move-exception v4

    .line 251
    iget-object v7, p0, Le7/n4;->f:Le7/l4;

    .line 252
    .line 253
    invoke-virtual {v7}, Ld2/q;->zzj()Le7/a1;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    iget-object v7, v7, Le7/a1;->o:Le7/b1;

    .line 258
    .line 259
    iget-object v8, p0, Le7/n4;->d:Ljava/lang/String;

    .line 260
    .line 261
    invoke-static {v8}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    invoke-virtual {v7, v0, v8, v4}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    :cond_3
    :goto_4
    if-eqz v3, :cond_4

    .line 269
    .line 270
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 271
    .line 272
    .line 273
    :cond_4
    invoke-virtual {p0, v1, v2, v2, v5}, Le7/n4;->a(ILjava/io/IOException;[BLjava/util/Map;)V

    .line 274
    .line 275
    .line 276
    throw v6

    .line 277
    :catch_5
    move-exception v3

    .line 278
    move-object v5, v3

    .line 279
    move-object v3, v2

    .line 280
    :goto_5
    move-object v4, v2

    .line 281
    move-object v6, v5

    .line 282
    move-object v5, v4

    .line 283
    :goto_6
    if-eqz v4, :cond_5

    .line 284
    .line 285
    :try_start_9
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    .line 286
    .line 287
    .line 288
    goto :goto_7

    .line 289
    :catch_6
    move-exception v4

    .line 290
    iget-object v7, p0, Le7/n4;->f:Le7/l4;

    .line 291
    .line 292
    invoke-virtual {v7}, Ld2/q;->zzj()Le7/a1;

    .line 293
    .line 294
    .line 295
    move-result-object v7

    .line 296
    iget-object v7, v7, Le7/a1;->o:Le7/b1;

    .line 297
    .line 298
    iget-object v8, p0, Le7/n4;->d:Ljava/lang/String;

    .line 299
    .line 300
    invoke-static {v8}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    .line 301
    .line 302
    .line 303
    move-result-object v8

    .line 304
    invoke-virtual {v7, v0, v8, v4}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    :cond_5
    :goto_7
    if-eqz v3, :cond_6

    .line 308
    .line 309
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 310
    .line 311
    .line 312
    :cond_6
    invoke-virtual {p0, v1, v6, v2, v5}, Le7/n4;->a(ILjava/io/IOException;[BLjava/util/Map;)V

    .line 313
    .line 314
    .line 315
    return-void
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
