.class public final Lf9/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Ljava/nio/charset/Charset;


# instance fields
.field public final a:Lf9/g;

.field public final b:Ljava/io/InputStream;

.field public c:Lf9/e;

.field public d:Ljava/nio/ByteBuffer;

.field public e:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lf9/f;->f:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>(Lf9/g;Ljava/io/InputStream;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf9/f;->a:Lf9/g;

    iput-object p2, p0, Lf9/f;->b:Ljava/io/InputStream;

    new-instance p1, Ljava/io/InputStreamReader;

    invoke-direct {p1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    const/16 p1, 0x400

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lf9/f;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lf9/f;->b:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 7
    .line 8
    const-string v1, "Invalid bundle: "

    .line 9
    .line 10
    invoke-static {v1, p1}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final b()Lf9/e;
    .locals 3

    iget-object v0, p0, Lf9/f;->c:Lf9/e;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lf9/f;->d()Lf9/c;

    move-result-object v0

    instance-of v1, v0, Lf9/e;

    if-eqz v1, :cond_1

    check-cast v0, Lf9/e;

    iput-object v0, p0, Lf9/f;->c:Lf9/e;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lf9/f;->e:J

    return-object v0

    :cond_1
    const-string v0, "Expected first element in bundle to be a metadata object"

    invoke-virtual {p0, v0}, Lf9/f;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final c()Z
    .locals 4

    iget-object v0, p0, Lf9/f;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lf9/f;->b:Ljava/io/InputStream;

    iget-object v1, p0, Lf9/f;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    iget-object v2, p0, Lf9/f;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v2

    iget-object v3, p0, Lf9/f;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    move-result v3

    add-int/2addr v3, v2

    iget-object v2, p0, Lf9/f;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    iget-object v2, p0, Lf9/f;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    :cond_1
    iget-object v0, p0, Lf9/f;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    return v1
.end method

.method public final d()Lf9/c;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    :cond_0
    iget-object v0, v1, Lf9/f;->d:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    move v2, v0

    .line 10
    :goto_0
    :try_start_0
    iget-object v3, v1, Lf9/f;->d:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, -0x1

    .line 17
    if-ge v2, v3, :cond_2

    .line 18
    .line 19
    iget-object v3, v1, Lf9/f;->d:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->get()B

    .line 22
    .line 23
    .line 24
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    const/16 v5, 0x7b

    .line 26
    .line 27
    if-ne v3, v5, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    move v2, v4

    .line 34
    :goto_1
    iget-object v3, v1, Lf9/f;->d:Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    .line 37
    .line 38
    .line 39
    if-ne v2, v4, :cond_3

    .line 40
    .line 41
    invoke-virtual/range {p0 .. p0}, Lf9/f;->c()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_0

    .line 46
    .line 47
    :cond_3
    iget-object v3, v1, Lf9/f;->d:Ljava/nio/ByteBuffer;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    const/4 v5, 0x0

    .line 54
    if-nez v3, :cond_4

    .line 55
    .line 56
    move-object v2, v5

    .line 57
    goto :goto_2

    .line 58
    :cond_4
    if-eq v2, v4, :cond_1a

    .line 59
    .line 60
    new-array v2, v2, [B

    .line 61
    .line 62
    iget-object v3, v1, Lf9/f;->d:Ljava/nio/ByteBuffer;

    .line 63
    .line 64
    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    .line 67
    sget-object v3, Lf9/f;->f:Ljava/nio/charset/Charset;

    .line 68
    .line 69
    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v3, v2}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    :goto_2
    if-nez v2, :cond_5

    .line 82
    .line 83
    return-object v5

    .line 84
    :cond_5
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    .line 89
    .line 90
    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 91
    .line 92
    .line 93
    move v6, v3

    .line 94
    :goto_3
    if-lez v6, :cond_8

    .line 95
    .line 96
    iget-object v7, v1, Lf9/f;->d:Ljava/nio/ByteBuffer;

    .line 97
    .line 98
    invoke-virtual {v7}, Ljava/nio/Buffer;->remaining()I

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-nez v7, :cond_7

    .line 103
    .line 104
    invoke-virtual/range {p0 .. p0}, Lf9/f;->c()Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    if-eqz v7, :cond_6

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_6
    const-string v0, "Reached the end of bundle when more data was expected."

    .line 112
    .line 113
    invoke-virtual {v1, v0}, Lf9/f;->a(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v5

    .line 117
    :cond_7
    :goto_4
    iget-object v7, v1, Lf9/f;->d:Ljava/nio/ByteBuffer;

    .line 118
    .line 119
    invoke-virtual {v7}, Ljava/nio/Buffer;->remaining()I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    iget-object v8, v1, Lf9/f;->d:Ljava/nio/ByteBuffer;

    .line 128
    .line 129
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->array()[B

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    iget-object v9, v1, Lf9/f;->d:Ljava/nio/ByteBuffer;

    .line 134
    .line 135
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    iget-object v10, v1, Lf9/f;->d:Ljava/nio/ByteBuffer;

    .line 140
    .line 141
    invoke-virtual {v10}, Ljava/nio/Buffer;->position()I

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    add-int/2addr v10, v9

    .line 146
    invoke-virtual {v4, v8, v10, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 147
    .line 148
    .line 149
    iget-object v8, v1, Lf9/f;->d:Ljava/nio/ByteBuffer;

    .line 150
    .line 151
    invoke-virtual {v8}, Ljava/nio/Buffer;->position()I

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    add-int/2addr v9, v7

    .line 156
    invoke-virtual {v8, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 157
    .line 158
    .line 159
    sub-int/2addr v6, v7

    .line 160
    goto :goto_3

    .line 161
    :cond_8
    sget-object v6, Lf9/f;->f:Ljava/nio/charset/Charset;

    .line 162
    .line 163
    invoke-virtual {v6}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    invoke-virtual {v4, v7}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    iget-wide v7, v1, Lf9/f;->e:J

    .line 172
    .line 173
    invoke-virtual {v2, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    array-length v2, v2

    .line 178
    add-int/2addr v2, v3

    .line 179
    int-to-long v2, v2

    .line 180
    add-long/2addr v7, v2

    .line 181
    iput-wide v7, v1, Lf9/f;->e:J

    .line 182
    .line 183
    new-instance v2, Lorg/json/JSONObject;

    .line 184
    .line 185
    invoke-direct {v2, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    const-string v3, "metadata"

    .line 189
    .line 190
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    const-string v7, "BundleElement"

    .line 195
    .line 196
    const/4 v8, 0x1

    .line 197
    if-eqz v6, :cond_9

    .line 198
    .line 199
    iget-object v4, v1, Lf9/f;->a:Lf9/g;

    .line 200
    .line 201
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    const-string v3, "id"

    .line 209
    .line 210
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    const-string v3, "version"

    .line 215
    .line 216
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 217
    .line 218
    .line 219
    move-result v11

    .line 220
    const-string v3, "createTime"

    .line 221
    .line 222
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    new-instance v12, Lj9/q;

    .line 227
    .line 228
    invoke-virtual {v4, v3}, Lf9/g;->e(Ljava/lang/Object;)Lu7/m;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-direct {v12, v3}, Lj9/q;-><init>(Lu7/m;)V

    .line 233
    .line 234
    .line 235
    const-string v3, "totalDocuments"

    .line 236
    .line 237
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 238
    .line 239
    .line 240
    move-result v13

    .line 241
    const-string v3, "totalBytes"

    .line 242
    .line 243
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 244
    .line 245
    .line 246
    move-result-wide v14

    .line 247
    new-instance v2, Lf9/e;

    .line 248
    .line 249
    move-object v9, v2

    .line 250
    invoke-direct/range {v9 .. v15}, Lf9/e;-><init>(Ljava/lang/String;ILj9/q;IJ)V

    .line 251
    .line 252
    .line 253
    new-array v0, v0, [Ljava/lang/Object;

    .line 254
    .line 255
    const-string v3, "BundleMetadata element loaded"

    .line 256
    .line 257
    invoke-static {v8, v7, v3, v0}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    goto/16 :goto_e

    .line 261
    .line 262
    :cond_9
    const-string v3, "namedQuery"

    .line 263
    .line 264
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 265
    .line 266
    .line 267
    move-result v6

    .line 268
    const-string v9, "readTime"

    .line 269
    .line 270
    const-string v10, "name"

    .line 271
    .line 272
    if-eqz v6, :cond_16

    .line 273
    .line 274
    iget-object v4, v1, Lf9/f;->a:Lf9/g;

    .line 275
    .line 276
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    const-string v6, "bundledQuery"

    .line 288
    .line 289
    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    const/16 v17, 0x1

    .line 294
    .line 295
    const-string v10, "structuredQuery"

    .line 296
    .line 297
    invoke-virtual {v6, v10}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 298
    .line 299
    .line 300
    move-result-object v10

    .line 301
    const-string v11, "select"

    .line 302
    .line 303
    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 304
    .line 305
    .line 306
    move-result v11

    .line 307
    if-nez v11, :cond_15

    .line 308
    .line 309
    const-string v11, "parent"

    .line 310
    .line 311
    invoke-virtual {v6, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v11

    .line 315
    invoke-virtual {v4, v11}, Lf9/g;->c(Ljava/lang/String;)Lj9/o;

    .line 316
    .line 317
    .line 318
    move-result-object v11

    .line 319
    const-string v12, "from"

    .line 320
    .line 321
    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 322
    .line 323
    .line 324
    move-result-object v12

    .line 325
    invoke-virtual {v12}, Lorg/json/JSONArray;->length()I

    .line 326
    .line 327
    .line 328
    move-result v13

    .line 329
    if-ne v13, v8, :cond_14

    .line 330
    .line 331
    invoke-virtual {v12, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 332
    .line 333
    .line 334
    move-result-object v8

    .line 335
    const-string v12, "allDescendants"

    .line 336
    .line 337
    invoke-virtual {v8, v12, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 338
    .line 339
    .line 340
    move-result v12

    .line 341
    const-string v13, "collectionId"

    .line 342
    .line 343
    invoke-virtual {v8, v13}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v8

    .line 347
    if-eqz v12, :cond_a

    .line 348
    .line 349
    move-object v12, v8

    .line 350
    goto :goto_5

    .line 351
    :cond_a
    invoke-virtual {v11, v8}, Lj9/e;->g(Ljava/lang/String;)Lj9/e;

    .line 352
    .line 353
    .line 354
    move-result-object v8

    .line 355
    check-cast v8, Lj9/o;

    .line 356
    .line 357
    move-object v12, v5

    .line 358
    move-object v11, v8

    .line 359
    :goto_5
    const-string v5, "where"

    .line 360
    .line 361
    invoke-virtual {v10, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    new-instance v13, Ljava/util/ArrayList;

    .line 366
    .line 367
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 368
    .line 369
    .line 370
    if-eqz v5, :cond_b

    .line 371
    .line 372
    invoke-virtual {v4, v13, v5}, Lf9/g;->a(Ljava/util/ArrayList;Lorg/json/JSONObject;)V

    .line 373
    .line 374
    .line 375
    :cond_b
    const-string v5, "orderBy"

    .line 376
    .line 377
    invoke-virtual {v10, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 378
    .line 379
    .line 380
    move-result-object v5

    .line 381
    new-instance v14, Ljava/util/ArrayList;

    .line 382
    .line 383
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 384
    .line 385
    .line 386
    if-eqz v5, :cond_d

    .line 387
    .line 388
    :goto_6
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 389
    .line 390
    .line 391
    move-result v15

    .line 392
    if-ge v0, v15, :cond_d

    .line 393
    .line 394
    invoke-virtual {v5, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 395
    .line 396
    .line 397
    move-result-object v15

    .line 398
    const-string v8, "field"

    .line 399
    .line 400
    invoke-virtual {v15, v8}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 401
    .line 402
    .line 403
    move-result-object v8

    .line 404
    move-object/from16 v18, v5

    .line 405
    .line 406
    const-string v5, "fieldPath"

    .line 407
    .line 408
    invoke-virtual {v8, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v5

    .line 412
    invoke-static {v5}, Lj9/l;->t(Ljava/lang/String;)Lj9/l;

    .line 413
    .line 414
    .line 415
    move-result-object v5

    .line 416
    const-string v8, "ASCENDING"

    .line 417
    .line 418
    const-string v1, "direction"

    .line 419
    .line 420
    invoke-virtual {v15, v1, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    if-eqz v1, :cond_c

    .line 429
    .line 430
    const/4 v1, 0x1

    .line 431
    goto :goto_7

    .line 432
    :cond_c
    const/4 v1, 0x2

    .line 433
    :goto_7
    new-instance v8, Lg9/e0;

    .line 434
    .line 435
    invoke-direct {v8, v1, v5}, Lg9/e0;-><init>(ILj9/l;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    add-int/lit8 v0, v0, 0x1

    .line 442
    .line 443
    move-object/from16 v1, p0

    .line 444
    .line 445
    move-object/from16 v5, v18

    .line 446
    .line 447
    goto :goto_6

    .line 448
    :cond_d
    const-string v0, "startAt"

    .line 449
    .line 450
    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    const-string v1, "before"

    .line 455
    .line 456
    if-eqz v0, :cond_e

    .line 457
    .line 458
    const/4 v5, 0x0

    .line 459
    invoke-virtual {v0, v1, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 460
    .line 461
    .line 462
    move-result v8

    .line 463
    invoke-virtual {v4, v0}, Lf9/g;->d(Lorg/json/JSONObject;)Ljava/util/ArrayList;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    new-instance v15, Lg9/e;

    .line 468
    .line 469
    invoke-direct {v15, v0, v8}, Lg9/e;-><init>(Ljava/util/List;Z)V

    .line 470
    .line 471
    .line 472
    move-object/from16 v18, v15

    .line 473
    .line 474
    goto :goto_8

    .line 475
    :cond_e
    const/4 v5, 0x0

    .line 476
    const/4 v0, 0x0

    .line 477
    move-object/from16 v18, v0

    .line 478
    .line 479
    :goto_8
    const-string v0, "endAt"

    .line 480
    .line 481
    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    if-eqz v0, :cond_f

    .line 486
    .line 487
    invoke-virtual {v0, v1, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 488
    .line 489
    .line 490
    move-result v1

    .line 491
    invoke-virtual {v4, v0}, Lf9/g;->d(Lorg/json/JSONObject;)Ljava/util/ArrayList;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    new-instance v5, Lg9/e;

    .line 496
    .line 497
    xor-int/lit8 v1, v1, 0x1

    .line 498
    .line 499
    invoke-direct {v5, v0, v1}, Lg9/e;-><init>(Ljava/util/List;Z)V

    .line 500
    .line 501
    .line 502
    move-object/from16 v19, v5

    .line 503
    .line 504
    goto :goto_9

    .line 505
    :cond_f
    const/4 v0, 0x0

    .line 506
    move-object/from16 v19, v0

    .line 507
    .line 508
    :goto_9
    const-string v0, "offset"

    .line 509
    .line 510
    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 511
    .line 512
    .line 513
    move-result v0

    .line 514
    if-nez v0, :cond_13

    .line 515
    .line 516
    const-string v0, "limit"

    .line 517
    .line 518
    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    if-eqz v1, :cond_10

    .line 523
    .line 524
    const-string v0, "value"

    .line 525
    .line 526
    const/4 v5, -0x1

    .line 527
    invoke-virtual {v1, v0, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 528
    .line 529
    .line 530
    move-result v0

    .line 531
    goto :goto_a

    .line 532
    :cond_10
    const/4 v1, -0x1

    .line 533
    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 534
    .line 535
    .line 536
    move-result v0

    .line 537
    :goto_a
    const-string v1, "FIRST"

    .line 538
    .line 539
    const-string v5, "limitType"

    .line 540
    .line 541
    invoke-virtual {v6, v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v5

    .line 545
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    move-result v1

    .line 549
    if-eqz v1, :cond_11

    .line 550
    .line 551
    move/from16 v8, v17

    .line 552
    .line 553
    goto :goto_b

    .line 554
    :cond_11
    const-string v1, "LAST"

    .line 555
    .line 556
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    move-result v1

    .line 560
    if-eqz v1, :cond_12

    .line 561
    .line 562
    const/4 v8, 0x2

    .line 563
    :goto_b
    new-instance v1, Lf9/i;

    .line 564
    .line 565
    new-instance v5, Lg9/f0;

    .line 566
    .line 567
    move-object/from16 v20, v7

    .line 568
    .line 569
    int-to-long v6, v0

    .line 570
    move-object v10, v5

    .line 571
    move-wide v15, v6

    .line 572
    invoke-direct/range {v10 .. v19}, Lg9/f0;-><init>(Lj9/o;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILg9/e;Lg9/e;)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v5}, Lg9/f0;->i()Lg9/k0;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    invoke-direct {v1, v0, v8}, Lf9/i;-><init>(Lg9/k0;I)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v2, v9}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    new-instance v2, Lj9/q;

    .line 587
    .line 588
    invoke-virtual {v4, v0}, Lf9/g;->e(Ljava/lang/Object;)Lu7/m;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    invoke-direct {v2, v0}, Lj9/q;-><init>(Lu7/m;)V

    .line 593
    .line 594
    .line 595
    new-instance v0, Lf9/j;

    .line 596
    .line 597
    invoke-direct {v0, v3, v1, v2}, Lf9/j;-><init>(Ljava/lang/String;Lf9/i;Lj9/q;)V

    .line 598
    .line 599
    .line 600
    const-string v1, "Query loaded: "

    .line 601
    .line 602
    invoke-static {v1, v3}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    const/4 v2, 0x0

    .line 607
    new-array v2, v2, [Ljava/lang/Object;

    .line 608
    .line 609
    const/4 v3, 0x1

    .line 610
    move-object/from16 v5, v20

    .line 611
    .line 612
    invoke-static {v3, v5, v1, v2}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 613
    .line 614
    .line 615
    move-object/from16 v1, p0

    .line 616
    .line 617
    :goto_c
    move-object v2, v0

    .line 618
    goto/16 :goto_e

    .line 619
    .line 620
    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 621
    .line 622
    const-string v1, "Invalid limit type for bundle query: "

    .line 623
    .line 624
    invoke-static {v1, v5}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    throw v0

    .line 632
    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 633
    .line 634
    const-string v1, "Queries with offsets are not supported by the Android SDK"

    .line 635
    .line 636
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 637
    .line 638
    .line 639
    throw v0

    .line 640
    :cond_14
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 641
    .line 642
    const-string v1, "Only queries with a single \'from\' clause are supported by the Android SDK"

    .line 643
    .line 644
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    throw v0

    .line 648
    :cond_15
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 649
    .line 650
    const-string v1, "Queries with \'select\' statements are not supported by the Android SDK"

    .line 651
    .line 652
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    throw v0

    .line 656
    :cond_16
    move-object v5, v7

    .line 657
    const-string v0, "documentMetadata"

    .line 658
    .line 659
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 660
    .line 661
    .line 662
    move-result v1

    .line 663
    if-eqz v1, :cond_18

    .line 664
    .line 665
    move-object/from16 v1, p0

    .line 666
    .line 667
    iget-object v3, v1, Lf9/f;->a:Lf9/g;

    .line 668
    .line 669
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 674
    .line 675
    .line 676
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v2

    .line 680
    invoke-virtual {v3, v2}, Lf9/g;->c(Ljava/lang/String;)Lj9/o;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    new-instance v4, Lj9/i;

    .line 685
    .line 686
    invoke-direct {v4, v2}, Lj9/i;-><init>(Lj9/o;)V

    .line 687
    .line 688
    .line 689
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v2

    .line 693
    new-instance v6, Lj9/q;

    .line 694
    .line 695
    invoke-virtual {v3, v2}, Lf9/g;->e(Ljava/lang/Object;)Lu7/m;

    .line 696
    .line 697
    .line 698
    move-result-object v2

    .line 699
    invoke-direct {v6, v2}, Lj9/q;-><init>(Lu7/m;)V

    .line 700
    .line 701
    .line 702
    const-string v2, "exists"

    .line 703
    .line 704
    const/4 v3, 0x0

    .line 705
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 706
    .line 707
    .line 708
    move-result v2

    .line 709
    const-string v3, "queries"

    .line 710
    .line 711
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    new-instance v3, Ljava/util/ArrayList;

    .line 716
    .line 717
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 718
    .line 719
    .line 720
    if-eqz v0, :cond_17

    .line 721
    .line 722
    const/4 v7, 0x0

    .line 723
    :goto_d
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 724
    .line 725
    .line 726
    move-result v8

    .line 727
    if-ge v7, v8, :cond_17

    .line 728
    .line 729
    invoke-virtual {v0, v7}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v8

    .line 733
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 734
    .line 735
    .line 736
    add-int/lit8 v7, v7, 0x1

    .line 737
    .line 738
    goto :goto_d

    .line 739
    :cond_17
    new-instance v0, Lf9/h;

    .line 740
    .line 741
    invoke-direct {v0, v4, v6, v2, v3}, Lf9/h;-><init>(Lj9/i;Lj9/q;ZLjava/util/ArrayList;)V

    .line 742
    .line 743
    .line 744
    new-instance v2, Ljava/lang/StringBuilder;

    .line 745
    .line 746
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 747
    .line 748
    .line 749
    const-string v3, "Document metadata loaded: "

    .line 750
    .line 751
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 752
    .line 753
    .line 754
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 755
    .line 756
    .line 757
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    const/4 v3, 0x0

    .line 762
    new-array v3, v3, [Ljava/lang/Object;

    .line 763
    .line 764
    const/4 v4, 0x1

    .line 765
    invoke-static {v4, v5, v2, v3}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 766
    .line 767
    .line 768
    goto/16 :goto_c

    .line 769
    .line 770
    :cond_18
    move-object/from16 v1, p0

    .line 771
    .line 772
    const-string v0, "document"

    .line 773
    .line 774
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 775
    .line 776
    .line 777
    move-result v3

    .line 778
    if-eqz v3, :cond_19

    .line 779
    .line 780
    iget-object v3, v1, Lf9/f;->a:Lf9/g;

    .line 781
    .line 782
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 787
    .line 788
    .line 789
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v2

    .line 793
    invoke-virtual {v3, v2}, Lf9/g;->c(Ljava/lang/String;)Lj9/o;

    .line 794
    .line 795
    .line 796
    move-result-object v2

    .line 797
    new-instance v4, Lj9/i;

    .line 798
    .line 799
    invoke-direct {v4, v2}, Lj9/i;-><init>(Lj9/o;)V

    .line 800
    .line 801
    .line 802
    const-string v2, "updateTime"

    .line 803
    .line 804
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v2

    .line 808
    new-instance v6, Lj9/q;

    .line 809
    .line 810
    invoke-virtual {v3, v2}, Lf9/g;->e(Ljava/lang/Object;)Lu7/m;

    .line 811
    .line 812
    .line 813
    move-result-object v2

    .line 814
    invoke-direct {v6, v2}, Lj9/q;-><init>(Lu7/m;)V

    .line 815
    .line 816
    .line 817
    invoke-static {}, Lka/d0;->d0()Lka/d0$a;

    .line 818
    .line 819
    .line 820
    move-result-object v2

    .line 821
    const-string v7, "fields"

    .line 822
    .line 823
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    invoke-virtual {v3, v2, v0}, Lf9/g;->b(Lka/d0$a;Lorg/json/JSONObject;)V

    .line 828
    .line 829
    .line 830
    new-instance v0, Lf9/b;

    .line 831
    .line 832
    iget-object v2, v2, Lma/w$a;->b:Lma/w;

    .line 833
    .line 834
    check-cast v2, Lka/d0;

    .line 835
    .line 836
    invoke-virtual {v2}, Lka/d0;->Y()Lka/u;

    .line 837
    .line 838
    .line 839
    move-result-object v2

    .line 840
    invoke-virtual {v2}, Lka/u;->J()Ljava/util/Map;

    .line 841
    .line 842
    .line 843
    move-result-object v2

    .line 844
    invoke-static {v2}, Lj9/n;->e(Ljava/util/Map;)Lj9/n;

    .line 845
    .line 846
    .line 847
    move-result-object v2

    .line 848
    new-instance v3, Lj9/m;

    .line 849
    .line 850
    invoke-direct {v3, v4}, Lj9/m;-><init>(Lj9/i;)V

    .line 851
    .line 852
    .line 853
    invoke-virtual {v3, v6, v2}, Lj9/m;->k(Lj9/q;Lj9/n;)V

    .line 854
    .line 855
    .line 856
    invoke-direct {v0, v3}, Lf9/b;-><init>(Lj9/m;)V

    .line 857
    .line 858
    .line 859
    const-string v2, "Document loaded: "

    .line 860
    .line 861
    invoke-static {v2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 862
    .line 863
    .line 864
    move-result-object v2

    .line 865
    iget-object v3, v0, Lf9/b;->a:Lj9/m;

    .line 866
    .line 867
    iget-object v3, v3, Lj9/m;->b:Lj9/i;

    .line 868
    .line 869
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 870
    .line 871
    .line 872
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    move-result-object v2

    .line 876
    const/4 v3, 0x0

    .line 877
    new-array v3, v3, [Ljava/lang/Object;

    .line 878
    .line 879
    const/4 v4, 0x1

    .line 880
    invoke-static {v4, v5, v2, v3}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 881
    .line 882
    .line 883
    goto/16 :goto_c

    .line 884
    .line 885
    :goto_e
    return-object v2

    .line 886
    :cond_19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 887
    .line 888
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 889
    .line 890
    .line 891
    const-string v2, "Cannot decode unknown Bundle element: "

    .line 892
    .line 893
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 894
    .line 895
    .line 896
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 897
    .line 898
    .line 899
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    invoke-virtual {v1, v0}, Lf9/f;->a(Ljava/lang/String;)V

    .line 904
    .line 905
    .line 906
    const/4 v0, 0x0

    .line 907
    throw v0

    .line 908
    :cond_1a
    const-string v0, "Reached the end of bundle when a length string is expected."

    .line 909
    .line 910
    invoke-virtual {v1, v0}, Lf9/f;->a(Ljava/lang/String;)V

    .line 911
    .line 912
    .line 913
    throw v5

    .line 914
    :catchall_0
    move-exception v0

    .line 915
    iget-object v2, v1, Lf9/f;->d:Ljava/nio/ByteBuffer;

    .line 916
    .line 917
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    .line 918
    .line 919
    .line 920
    throw v0
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
.end method
