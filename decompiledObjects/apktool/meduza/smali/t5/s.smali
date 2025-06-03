.class public final Lt5/s;
.super Lt5/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt5/s$b;,
        Lt5/s$a;
    }
.end annotation


# instance fields
.field public final e:Z

.field public final f:I

.field public final g:I

.field public final h:Ljava/lang/String;

.field public final i:Lt5/a0;

.field public final j:Lt5/a0;

.field public final k:Z

.field public l:Ln7/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln7/j<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public m:Ljava/net/HttpURLConnection;

.field public n:Ljava/io/InputStream;

.field public o:Z

.field public p:I

.field public q:J

.field public r:J


# direct methods
.method public constructor <init>(Ljava/lang/String;IIZLt5/a0;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lt5/f;-><init>(Z)V

    iput-object p1, p0, Lt5/s;->h:Ljava/lang/String;

    iput p2, p0, Lt5/s;->f:I

    iput p3, p0, Lt5/s;->g:I

    iput-boolean p4, p0, Lt5/s;->e:Z

    iput-object p5, p0, Lt5/s;->i:Lt5/a0;

    const/4 p1, 0x0

    iput-object p1, p0, Lt5/s;->l:Ln7/j;

    new-instance p1, Lt5/a0;

    invoke-direct {p1}, Lt5/a0;-><init>()V

    iput-object p1, p0, Lt5/s;->j:Lt5/a0;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lt5/s;->k:Z

    return-void
.end method

.method public static w(Ljava/net/HttpURLConnection;J)V
    .locals 2

    .line 1
    if-eqz p0, :cond_4

    .line 2
    .line 3
    sget v0, Lv5/e0;->a:I

    .line 4
    .line 5
    const/16 v1, 0x13

    .line 6
    .line 7
    if-lt v0, v1, :cond_4

    .line 8
    .line 9
    const/16 v1, 0x14

    .line 10
    .line 11
    if-le v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-wide/16 v0, -0x1

    .line 19
    .line 20
    cmp-long v0, p1, v0

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    const/4 p2, -0x1

    .line 29
    if-ne p1, p2, :cond_2

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    const-wide/16 v0, 0x800

    .line 33
    .line 34
    cmp-long p1, p1, v0

    .line 35
    .line 36
    if-gtz p1, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-string p2, "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"

    .line 48
    .line 49
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-nez p2, :cond_3

    .line 54
    .line 55
    const-string p2, "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"

    .line 56
    .line 57
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    const-string p2, "unexpectedEndOfInput"

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    new-array v1, v0, [Ljava/lang/Class;

    .line 78
    .line 79
    invoke-virtual {p1, p2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const/4 p2, 0x1

    .line 84
    invoke-virtual {p1, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 85
    .line 86
    .line 87
    new-array p2, v0, [Ljava/lang/Object;

    .line 88
    .line 89
    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    .line 91
    .line 92
    :catch_0
    :cond_4
    :goto_0
    return-void
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


# virtual methods
.method public final a(Lt5/n;)J
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    iput-wide v2, v1, Lt5/s;->r:J

    .line 8
    .line 9
    iput-wide v2, v1, Lt5/s;->q:J

    .line 10
    .line 11
    invoke-virtual/range {p0 .. p1}, Lt5/f;->q(Lt5/n;)V

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    :try_start_0
    invoke-virtual/range {p0 .. p1}, Lt5/s;->v(Lt5/n;)Ljava/net/HttpURLConnection;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    iput-object v5, v1, Lt5/s;->m:Ljava/net/HttpURLConnection;

    .line 20
    .line 21
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    iput v6, v1, Lt5/s;->p:I

    .line 26
    .line 27
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5

    .line 28
    .line 29
    .line 30
    iget v6, v1, Lt5/s;->p:I

    .line 31
    .line 32
    const-string v7, "Content-Range"

    .line 33
    .line 34
    const/16 v8, 0xc8

    .line 35
    .line 36
    const-wide/16 v9, -0x1

    .line 37
    .line 38
    if-lt v6, v8, :cond_c

    .line 39
    .line 40
    const/16 v11, 0x12b

    .line 41
    .line 42
    if-le v6, v11, :cond_0

    .line 43
    .line 44
    goto/16 :goto_5

    .line 45
    .line 46
    :cond_0
    invoke-virtual {v5}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    iget-object v11, v1, Lt5/s;->l:Ln7/j;

    .line 51
    .line 52
    if-eqz v11, :cond_2

    .line 53
    .line 54
    invoke-interface {v11, v6}, Ln7/j;->apply(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    if-eqz v11, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lt5/s;->s()V

    .line 62
    .line 63
    .line 64
    new-instance v0, Lt5/y;

    .line 65
    .line 66
    invoke-direct {v0, v6}, Lt5/y;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :cond_2
    :goto_0
    iget v6, v1, Lt5/s;->p:I

    .line 71
    .line 72
    if-ne v6, v8, :cond_3

    .line 73
    .line 74
    iget-wide v11, v0, Lt5/n;->f:J

    .line 75
    .line 76
    cmp-long v6, v11, v2

    .line 77
    .line 78
    if-eqz v6, :cond_3

    .line 79
    .line 80
    move-wide v2, v11

    .line 81
    :cond_3
    const-string v6, "Content-Encoding"

    .line 82
    .line 83
    invoke-virtual {v5, v6}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    const-string v8, "gzip"

    .line 88
    .line 89
    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-nez v6, :cond_9

    .line 94
    .line 95
    iget-wide v11, v0, Lt5/n;->g:J

    .line 96
    .line 97
    cmp-long v8, v11, v9

    .line 98
    .line 99
    if-eqz v8, :cond_4

    .line 100
    .line 101
    iput-wide v11, v1, Lt5/s;->q:J

    .line 102
    .line 103
    goto/16 :goto_4

    .line 104
    .line 105
    :cond_4
    const-string v8, "Content-Length"

    .line 106
    .line 107
    invoke-virtual {v5, v8}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    invoke-virtual {v5, v7}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    sget-object v9, Lt5/b0;->a:Ljava/util/regex/Pattern;

    .line 116
    .line 117
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    const-string v10, "]"

    .line 122
    .line 123
    const-string v11, "HttpUtil"

    .line 124
    .line 125
    if-nez v9, :cond_5

    .line 126
    .line 127
    :try_start_1
    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 128
    .line 129
    .line 130
    move-result-wide v12
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 131
    goto :goto_1

    .line 132
    :catch_0
    new-instance v9, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    .line 136
    .line 137
    const-string v12, "Unexpected Content-Length ["

    .line 138
    .line 139
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    invoke-static {v11, v9}, Lv5/m;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    :cond_5
    const-wide/16 v12, -0x1

    .line 156
    .line 157
    :goto_1
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 158
    .line 159
    .line 160
    move-result v9

    .line 161
    if-nez v9, :cond_7

    .line 162
    .line 163
    sget-object v9, Lt5/b0;->a:Ljava/util/regex/Pattern;

    .line 164
    .line 165
    invoke-virtual {v9, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    invoke-virtual {v9}, Ljava/util/regex/Matcher;->matches()Z

    .line 170
    .line 171
    .line 172
    move-result v14

    .line 173
    if-eqz v14, :cond_7

    .line 174
    .line 175
    const/4 v14, 0x2

    .line 176
    :try_start_2
    invoke-virtual {v9, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v14

    .line 180
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-static {v14}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 184
    .line 185
    .line 186
    move-result-wide v14

    .line 187
    invoke-virtual {v9, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 195
    .line 196
    .line 197
    move-result-wide v16

    .line 198
    sub-long v14, v14, v16

    .line 199
    .line 200
    const-wide/16 v16, 0x1

    .line 201
    .line 202
    add-long v14, v14, v16

    .line 203
    .line 204
    const-wide/16 v16, 0x0

    .line 205
    .line 206
    cmp-long v4, v12, v16

    .line 207
    .line 208
    if-gez v4, :cond_6

    .line 209
    .line 210
    move-wide v12, v14

    .line 211
    goto :goto_2

    .line 212
    :cond_6
    cmp-long v4, v12, v14

    .line 213
    .line 214
    if-eqz v4, :cond_7

    .line 215
    .line 216
    new-instance v4, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 219
    .line 220
    .line 221
    const-string v9, "Inconsistent headers ["

    .line 222
    .line 223
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    const-string v8, "] ["

    .line 230
    .line 231
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    invoke-static {v11, v4}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->max(JJ)J

    .line 248
    .line 249
    .line 250
    move-result-wide v12
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 251
    goto :goto_2

    .line 252
    :catch_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 255
    .line 256
    .line 257
    const-string v8, "Unexpected Content-Range ["

    .line 258
    .line 259
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    invoke-static {v11, v4}, Lv5/m;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    :cond_7
    :goto_2
    const-wide/16 v7, -0x1

    .line 276
    .line 277
    cmp-long v4, v12, v7

    .line 278
    .line 279
    if-eqz v4, :cond_8

    .line 280
    .line 281
    sub-long/2addr v12, v2

    .line 282
    goto :goto_3

    .line 283
    :cond_8
    const-wide/16 v12, -0x1

    .line 284
    .line 285
    :goto_3
    iput-wide v12, v1, Lt5/s;->q:J

    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_9
    iget-wide v7, v0, Lt5/n;->g:J

    .line 289
    .line 290
    iput-wide v7, v1, Lt5/s;->q:J

    .line 291
    .line 292
    :goto_4
    const/16 v4, 0x7d0

    .line 293
    .line 294
    :try_start_3
    invoke-virtual {v5}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    iput-object v5, v1, Lt5/s;->n:Ljava/io/InputStream;

    .line 299
    .line 300
    if-eqz v6, :cond_a

    .line 301
    .line 302
    new-instance v5, Ljava/util/zip/GZIPInputStream;

    .line 303
    .line 304
    iget-object v6, v1, Lt5/s;->n:Ljava/io/InputStream;

    .line 305
    .line 306
    invoke-direct {v5, v6}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 307
    .line 308
    .line 309
    iput-object v5, v1, Lt5/s;->n:Ljava/io/InputStream;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 310
    .line 311
    :cond_a
    const/4 v5, 0x1

    .line 312
    iput-boolean v5, v1, Lt5/s;->o:Z

    .line 313
    .line 314
    invoke-virtual/range {p0 .. p1}, Lt5/f;->r(Lt5/n;)V

    .line 315
    .line 316
    .line 317
    :try_start_4
    invoke-virtual {v1, v2, v3}, Lt5/s;->x(J)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 318
    .line 319
    .line 320
    iget-wide v2, v1, Lt5/s;->q:J

    .line 321
    .line 322
    return-wide v2

    .line 323
    :catch_2
    move-exception v0

    .line 324
    move-object v2, v0

    .line 325
    invoke-virtual/range {p0 .. p0}, Lt5/s;->s()V

    .line 326
    .line 327
    .line 328
    instance-of v0, v2, Lt5/x;

    .line 329
    .line 330
    if-eqz v0, :cond_b

    .line 331
    .line 332
    move-object v0, v2

    .line 333
    check-cast v0, Lt5/x;

    .line 334
    .line 335
    throw v0

    .line 336
    :cond_b
    new-instance v0, Lt5/x;

    .line 337
    .line 338
    const/4 v3, 0x1

    .line 339
    invoke-direct {v0, v2, v4, v3}, Lt5/x;-><init>(Ljava/io/IOException;II)V

    .line 340
    .line 341
    .line 342
    throw v0

    .line 343
    :catch_3
    move-exception v0

    .line 344
    const/4 v2, 0x1

    .line 345
    invoke-virtual/range {p0 .. p0}, Lt5/s;->s()V

    .line 346
    .line 347
    .line 348
    new-instance v3, Lt5/x;

    .line 349
    .line 350
    invoke-direct {v3, v0, v4, v2}, Lt5/x;-><init>(Ljava/io/IOException;II)V

    .line 351
    .line 352
    .line 353
    throw v3

    .line 354
    :cond_c
    :goto_5
    invoke-virtual {v5}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    iget v6, v1, Lt5/s;->p:I

    .line 359
    .line 360
    const/16 v8, 0x1a0

    .line 361
    .line 362
    if-ne v6, v8, :cond_10

    .line 363
    .line 364
    invoke-virtual {v5, v7}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v6

    .line 368
    sget-object v7, Lt5/b0;->a:Ljava/util/regex/Pattern;

    .line 369
    .line 370
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 371
    .line 372
    .line 373
    move-result v7

    .line 374
    if-eqz v7, :cond_d

    .line 375
    .line 376
    goto :goto_6

    .line 377
    :cond_d
    sget-object v7, Lt5/b0;->b:Ljava/util/regex/Pattern;

    .line 378
    .line 379
    invoke-virtual {v7, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 380
    .line 381
    .line 382
    move-result-object v6

    .line 383
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    .line 384
    .line 385
    .line 386
    move-result v7

    .line 387
    if-eqz v7, :cond_e

    .line 388
    .line 389
    const/4 v7, 0x1

    .line 390
    invoke-virtual {v6, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v6

    .line 394
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 398
    .line 399
    .line 400
    move-result-wide v9

    .line 401
    goto :goto_7

    .line 402
    :cond_e
    :goto_6
    const/4 v7, 0x1

    .line 403
    const-wide/16 v9, -0x1

    .line 404
    .line 405
    :goto_7
    iget-wide v11, v0, Lt5/n;->f:J

    .line 406
    .line 407
    cmp-long v6, v11, v9

    .line 408
    .line 409
    if-nez v6, :cond_10

    .line 410
    .line 411
    iput-boolean v7, v1, Lt5/s;->o:Z

    .line 412
    .line 413
    invoke-virtual/range {p0 .. p1}, Lt5/f;->r(Lt5/n;)V

    .line 414
    .line 415
    .line 416
    iget-wide v4, v0, Lt5/n;->g:J

    .line 417
    .line 418
    const-wide/16 v6, -0x1

    .line 419
    .line 420
    cmp-long v0, v4, v6

    .line 421
    .line 422
    if-eqz v0, :cond_f

    .line 423
    .line 424
    move-wide v2, v4

    .line 425
    :cond_f
    return-wide v2

    .line 426
    :cond_10
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    if-eqz v0, :cond_12

    .line 431
    .line 432
    :try_start_5
    sget v2, Lv5/e0;->a:I

    .line 433
    .line 434
    const/16 v2, 0x1000

    .line 435
    .line 436
    new-array v2, v2, [B

    .line 437
    .line 438
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 439
    .line 440
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 441
    .line 442
    .line 443
    :goto_8
    invoke-virtual {v0, v2}, Ljava/io/InputStream;->read([B)I

    .line 444
    .line 445
    .line 446
    move-result v5

    .line 447
    const/4 v6, -0x1

    .line 448
    if-eq v5, v6, :cond_11

    .line 449
    .line 450
    const/4 v6, 0x0

    .line 451
    invoke-virtual {v3, v2, v6, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 452
    .line 453
    .line 454
    goto :goto_8

    .line 455
    :cond_11
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 456
    .line 457
    .line 458
    goto :goto_9

    .line 459
    :cond_12
    sget v0, Lv5/e0;->a:I
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 460
    .line 461
    goto :goto_9

    .line 462
    :catch_4
    sget v0, Lv5/e0;->a:I

    .line 463
    .line 464
    :goto_9
    invoke-virtual/range {p0 .. p0}, Lt5/s;->s()V

    .line 465
    .line 466
    .line 467
    iget v0, v1, Lt5/s;->p:I

    .line 468
    .line 469
    if-ne v0, v8, :cond_13

    .line 470
    .line 471
    new-instance v0, Lt5/l;

    .line 472
    .line 473
    const/16 v2, 0x7d8

    .line 474
    .line 475
    invoke-direct {v0, v2}, Lt5/l;-><init>(I)V

    .line 476
    .line 477
    .line 478
    goto :goto_a

    .line 479
    :cond_13
    const/4 v0, 0x0

    .line 480
    :goto_a
    new-instance v2, Lt5/z;

    .line 481
    .line 482
    iget v3, v1, Lt5/s;->p:I

    .line 483
    .line 484
    invoke-direct {v2, v3, v0, v4}, Lt5/z;-><init>(ILt5/l;Ljava/util/Map;)V

    .line 485
    .line 486
    .line 487
    throw v2

    .line 488
    :catch_5
    move-exception v0

    .line 489
    invoke-virtual/range {p0 .. p0}, Lt5/s;->s()V

    .line 490
    .line 491
    .line 492
    const/4 v2, 0x1

    .line 493
    invoke-static {v0, v2}, Lt5/x;->a(Ljava/io/IOException;I)Lt5/x;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    throw v0
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
.end method

.method public final close()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lt5/s;->n:Ljava/io/InputStream;

    if-eqz v2, :cond_1

    iget-wide v3, p0, Lt5/s;->q:J

    const-wide/16 v5, -0x1

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v5, p0, Lt5/s;->r:J

    sub-long v5, v3, v5

    :goto_0
    iget-object v3, p0, Lt5/s;->m:Ljava/net/HttpURLConnection;

    invoke-static {v3, v5, v6}, Lt5/s;->w(Ljava/net/HttpURLConnection;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v2

    :try_start_2
    new-instance v3, Lt5/x;

    sget v4, Lv5/e0;->a:I

    const/16 v4, 0x7d0

    const/4 v5, 0x3

    invoke-direct {v3, v2, v4, v5}, Lt5/x;-><init>(Ljava/io/IOException;II)V

    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    :goto_1
    iput-object v1, p0, Lt5/s;->n:Ljava/io/InputStream;

    invoke-virtual {p0}, Lt5/s;->s()V

    iget-boolean v1, p0, Lt5/s;->o:Z

    if-eqz v1, :cond_2

    iput-boolean v0, p0, Lt5/s;->o:Z

    invoke-virtual {p0}, Lt5/f;->p()V

    :cond_2
    return-void

    :catchall_0
    move-exception v2

    iput-object v1, p0, Lt5/s;->n:Ljava/io/InputStream;

    invoke-virtual {p0}, Lt5/s;->s()V

    iget-boolean v1, p0, Lt5/s;->o:Z

    if-eqz v1, :cond_3

    iput-boolean v0, p0, Lt5/s;->o:Z

    invoke-virtual {p0}, Lt5/f;->p()V

    :cond_3
    throw v2
.end method

.method public final h()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lt5/s;->m:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lo7/m0;->o:Lo7/m0;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v1, Lt5/s$b;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-direct {v1, v0}, Lt5/s$b;-><init>(Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    return-object v1
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final l()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lt5/s;->m:Ljava/net/HttpURLConnection;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final read([BII)I
    .locals 6

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_1

    .line 5
    :cond_0
    :try_start_0
    iget-wide v0, p0, Lt5/s;->q:J

    .line 6
    .line 7
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    iget-wide v4, p0, Lt5/s;->r:J

    .line 15
    .line 16
    sub-long/2addr v0, v4

    .line 17
    const-wide/16 v4, 0x0

    .line 18
    .line 19
    cmp-long v2, v0, v4

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    int-to-long v4, p3

    .line 25
    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    long-to-int p3, v0

    .line 30
    :cond_2
    iget-object v0, p0, Lt5/s;->n:Ljava/io/InputStream;

    .line 31
    .line 32
    sget v1, Lv5/e0;->a:I

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-ne p1, v3, :cond_3

    .line 39
    .line 40
    :goto_0
    move p1, v3

    .line 41
    goto :goto_1

    .line 42
    :cond_3
    iget-wide p2, p0, Lt5/s;->r:J

    .line 43
    .line 44
    int-to-long v0, p1

    .line 45
    add-long/2addr p2, v0

    .line 46
    iput-wide p2, p0, Lt5/s;->r:J

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lt5/f;->o(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    :goto_1
    return p1

    .line 52
    :catch_0
    move-exception p1

    .line 53
    sget p2, Lv5/e0;->a:I

    .line 54
    .line 55
    const/4 p2, 0x2

    .line 56
    invoke-static {p1, p2}, Lt5/x;->a(Ljava/io/IOException;I)Lt5/x;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    throw p1
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
.end method

.method public final s()V
    .locals 3

    iget-object v0, p0, Lt5/s;->m:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "DefaultHttpDataSource"

    const-string v2, "Unexpected error while disconnecting"

    invoke-static {v1, v2, v0}, Lv5/m;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lt5/s;->m:Ljava/net/HttpURLConnection;

    :cond_0
    return-void
.end method

.method public final t(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;
    .locals 3

    .line 1
    const/16 v0, 0x7d1

    .line 2
    .line 3
    if-eqz p2, :cond_4

    .line 4
    .line 5
    :try_start_0
    new-instance v1, Ljava/net/URL;

    .line 6
    .line 7
    invoke-direct {v1, p1, p2}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    const-string v2, "https"

    .line 15
    .line 16
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    const-string v2, "http"

    .line 23
    .line 24
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance p1, Lt5/x;

    .line 32
    .line 33
    const-string v1, "Unsupported protocol redirect: "

    .line 34
    .line 35
    invoke-static {v1, p2}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-direct {p1, p2, v0}, Lt5/x;-><init>(Ljava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :cond_1
    :goto_0
    iget-boolean v2, p0, Lt5/s;->e:Z

    .line 44
    .line 45
    if-nez v2, :cond_3

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    new-instance v1, Lt5/x;

    .line 59
    .line 60
    const-string v2, "Disallowed cross-protocol redirect ("

    .line 61
    .line 62
    invoke-static {v2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p1, " to "

    .line 74
    .line 75
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string p1, ")"

    .line 82
    .line 83
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-direct {v1, p1, v0}, Lt5/x;-><init>(Ljava/lang/String;I)V

    .line 91
    .line 92
    .line 93
    throw v1

    .line 94
    :cond_3
    :goto_1
    return-object v1

    .line 95
    :catch_0
    move-exception p1

    .line 96
    new-instance p2, Lt5/x;

    .line 97
    .line 98
    const/4 v1, 0x1

    .line 99
    invoke-direct {p2, p1, v0, v1}, Lt5/x;-><init>(Ljava/io/IOException;II)V

    .line 100
    .line 101
    .line 102
    throw p2

    .line 103
    :cond_4
    new-instance p1, Lt5/x;

    .line 104
    .line 105
    const-string p2, "Null location redirect"

    .line 106
    .line 107
    invoke-direct {p1, p2, v0}, Lt5/x;-><init>(Ljava/lang/String;I)V

    .line 108
    .line 109
    .line 110
    throw p1
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final u(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URL;",
            "I[BJJZZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/net/HttpURLConnection;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 6
    .line 7
    iget v0, p0, Lt5/s;->f:I

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 10
    .line 11
    .line 12
    iget v0, p0, Lt5/s;->g:I

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lt5/s;->i:Lt5/a0;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    monitor-enter v1

    .line 27
    :try_start_0
    iget-object v2, v1, Lt5/a0;->b:Ljava/util/Map;

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    new-instance v2, Ljava/util/HashMap;

    .line 32
    .line 33
    iget-object v3, v1, Lt5/a0;->a:Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iput-object v2, v1, Lt5/a0;->b:Ljava/util/Map;

    .line 43
    .line 44
    :cond_0
    iget-object v2, v1, Lt5/a0;->b:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    monitor-exit v1

    .line 47
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    monitor-exit v1

    .line 53
    throw p1

    .line 54
    :cond_1
    :goto_0
    iget-object v1, p0, Lt5/s;->j:Lt5/a0;

    .line 55
    .line 56
    monitor-enter v1

    .line 57
    :try_start_1
    iget-object v2, v1, Lt5/a0;->b:Ljava/util/Map;

    .line 58
    .line 59
    if-nez v2, :cond_2

    .line 60
    .line 61
    new-instance v2, Ljava/util/HashMap;

    .line 62
    .line 63
    iget-object v3, v1, Lt5/a0;->a:Ljava/util/HashMap;

    .line 64
    .line 65
    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iput-object v2, v1, Lt5/a0;->b:Ljava/util/Map;

    .line 73
    .line 74
    :cond_2
    iget-object v2, v1, Lt5/a0;->b:Ljava/util/Map;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 75
    .line 76
    monitor-exit v1

    .line 77
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p10}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object p10

    .line 87
    invoke-interface {p10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object p10

    .line 91
    :goto_1
    invoke-interface {p10}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    invoke-interface {p10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Ljava/util/Map$Entry;

    .line 102
    .line 103
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    check-cast v1, Ljava/lang/String;

    .line 108
    .line 109
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {p1, v1, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    sget-object p10, Lt5/b0;->a:Ljava/util/regex/Pattern;

    .line 120
    .line 121
    const-wide/16 v0, 0x0

    .line 122
    .line 123
    cmp-long p10, p4, v0

    .line 124
    .line 125
    const-wide/16 v0, -0x1

    .line 126
    .line 127
    if-nez p10, :cond_4

    .line 128
    .line 129
    cmp-long p10, p6, v0

    .line 130
    .line 131
    if-nez p10, :cond_4

    .line 132
    .line 133
    const/4 p4, 0x0

    .line 134
    goto :goto_2

    .line 135
    :cond_4
    new-instance p10, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {p10}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
    .line 139
    .line 140
    const-string v2, "bytes="

    .line 141
    .line 142
    invoke-virtual {p10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p10, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v2, "-"

    .line 149
    .line 150
    invoke-virtual {p10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    cmp-long v0, p6, v0

    .line 154
    .line 155
    if-eqz v0, :cond_5

    .line 156
    .line 157
    add-long/2addr p4, p6

    .line 158
    const-wide/16 p6, 0x1

    .line 159
    .line 160
    sub-long/2addr p4, p6

    .line 161
    invoke-virtual {p10, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    :cond_5
    invoke-virtual {p10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p4

    .line 168
    :goto_2
    if-eqz p4, :cond_6

    .line 169
    .line 170
    const-string p5, "Range"

    .line 171
    .line 172
    invoke-virtual {p1, p5, p4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    :cond_6
    iget-object p4, p0, Lt5/s;->h:Ljava/lang/String;

    .line 176
    .line 177
    if-eqz p4, :cond_7

    .line 178
    .line 179
    const-string p5, "User-Agent"

    .line 180
    .line 181
    invoke-virtual {p1, p5, p4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    :cond_7
    if-eqz p8, :cond_8

    .line 185
    .line 186
    const-string p4, "gzip"

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_8
    const-string p4, "identity"

    .line 190
    .line 191
    :goto_3
    const-string p5, "Accept-Encoding"

    .line 192
    .line 193
    invoke-virtual {p1, p5, p4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, p9}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 197
    .line 198
    .line 199
    const/4 p4, 0x1

    .line 200
    if-eqz p3, :cond_9

    .line 201
    .line 202
    move p5, p4

    .line 203
    goto :goto_4

    .line 204
    :cond_9
    const/4 p5, 0x0

    .line 205
    :goto_4
    invoke-virtual {p1, p5}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 206
    .line 207
    .line 208
    sget p5, Lt5/n;->k:I

    .line 209
    .line 210
    if-eq p2, p4, :cond_c

    .line 211
    .line 212
    const/4 p4, 0x2

    .line 213
    if-eq p2, p4, :cond_b

    .line 214
    .line 215
    const/4 p4, 0x3

    .line 216
    if-ne p2, p4, :cond_a

    .line 217
    .line 218
    const-string p2, "HEAD"

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 222
    .line 223
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 224
    .line 225
    .line 226
    throw p1

    .line 227
    :cond_b
    const-string p2, "POST"

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_c
    const-string p2, "GET"

    .line 231
    .line 232
    :goto_5
    invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    if-eqz p3, :cond_d

    .line 236
    .line 237
    array-length p2, p3

    .line 238
    invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 245
    .line 246
    .line 247
    move-result-object p2

    .line 248
    invoke-virtual {p2, p3}, Ljava/io/OutputStream;->write([B)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V

    .line 252
    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_d
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 256
    .line 257
    .line 258
    :goto_6
    return-object p1

    .line 259
    :catchall_1
    move-exception p1

    .line 260
    monitor-exit v1

    .line 261
    throw p1
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
.end method

.method public final v(Lt5/n;)Ljava/net/HttpURLConnection;
    .locals 25

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    move-object/from16 v12, p1

    .line 4
    .line 5
    new-instance v1, Ljava/net/URL;

    .line 6
    .line 7
    iget-object v0, v12, Lt5/n;->a:Landroid/net/Uri;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-direct {v1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget v2, v12, Lt5/n;->c:I

    .line 17
    .line 18
    iget-object v3, v12, Lt5/n;->d:[B

    .line 19
    .line 20
    iget-wide v13, v12, Lt5/n;->f:J

    .line 21
    .line 22
    iget-wide v9, v12, Lt5/n;->g:J

    .line 23
    .line 24
    iget v0, v12, Lt5/n;->i:I

    .line 25
    .line 26
    const/4 v15, 0x1

    .line 27
    and-int/2addr v0, v15

    .line 28
    const/16 v16, 0x0

    .line 29
    .line 30
    if-ne v0, v15, :cond_0

    .line 31
    .line 32
    move/from16 v17, v15

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move/from16 v17, v16

    .line 36
    .line 37
    :goto_0
    iget-boolean v0, v11, Lt5/s;->e:Z

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    iget-boolean v0, v11, Lt5/s;->k:Z

    .line 42
    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    const/4 v15, 0x1

    .line 46
    iget-object v12, v12, Lt5/n;->e:Ljava/util/Map;

    .line 47
    .line 48
    move-object/from16 v0, p0

    .line 49
    .line 50
    move-wide v4, v13

    .line 51
    move-wide v6, v9

    .line 52
    move/from16 v8, v17

    .line 53
    .line 54
    move v9, v15

    .line 55
    move-object v10, v12

    .line 56
    invoke-virtual/range {v0 .. v10}, Lt5/s;->u(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    return-object v0

    .line 61
    :cond_1
    move-object v8, v1

    .line 62
    move v6, v2

    .line 63
    move-object/from16 v18, v3

    .line 64
    .line 65
    move/from16 v0, v16

    .line 66
    .line 67
    :goto_1
    add-int/lit8 v7, v0, 0x1

    .line 68
    .line 69
    const/16 v1, 0x14

    .line 70
    .line 71
    if-gt v0, v1, :cond_9

    .line 72
    .line 73
    const/16 v19, 0x0

    .line 74
    .line 75
    iget-object v4, v12, Lt5/n;->e:Ljava/util/Map;

    .line 76
    .line 77
    move-object/from16 v0, p0

    .line 78
    .line 79
    move-object v1, v8

    .line 80
    move v2, v6

    .line 81
    move-object/from16 v3, v18

    .line 82
    .line 83
    move-object/from16 v20, v4

    .line 84
    .line 85
    move-wide v4, v13

    .line 86
    move v12, v6

    .line 87
    move/from16 v21, v7

    .line 88
    .line 89
    move-wide v6, v9

    .line 90
    move-object/from16 v22, v8

    .line 91
    .line 92
    move/from16 v8, v17

    .line 93
    .line 94
    move-wide/from16 v23, v9

    .line 95
    .line 96
    move/from16 v9, v19

    .line 97
    .line 98
    move-object/from16 v10, v20

    .line 99
    .line 100
    invoke-virtual/range {v0 .. v10}, Lt5/s;->u(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    const-string v2, "Location"

    .line 109
    .line 110
    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    const/16 v3, 0x12f

    .line 115
    .line 116
    const/16 v4, 0x12d

    .line 117
    .line 118
    const/16 v5, 0x12c

    .line 119
    .line 120
    const/16 v6, 0x12e

    .line 121
    .line 122
    if-eq v12, v15, :cond_2

    .line 123
    .line 124
    const/4 v7, 0x3

    .line 125
    if-ne v12, v7, :cond_3

    .line 126
    .line 127
    :cond_2
    if-eq v1, v5, :cond_8

    .line 128
    .line 129
    if-eq v1, v4, :cond_8

    .line 130
    .line 131
    if-eq v1, v6, :cond_8

    .line 132
    .line 133
    if-eq v1, v3, :cond_8

    .line 134
    .line 135
    const/16 v7, 0x133

    .line 136
    .line 137
    if-eq v1, v7, :cond_8

    .line 138
    .line 139
    const/16 v7, 0x134

    .line 140
    .line 141
    if-ne v1, v7, :cond_3

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_3
    const/4 v7, 0x2

    .line 145
    if-ne v12, v7, :cond_7

    .line 146
    .line 147
    if-eq v1, v5, :cond_4

    .line 148
    .line 149
    if-eq v1, v4, :cond_4

    .line 150
    .line 151
    if-eq v1, v6, :cond_4

    .line 152
    .line 153
    if-ne v1, v3, :cond_7

    .line 154
    .line 155
    :cond_4
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 156
    .line 157
    .line 158
    iget-boolean v0, v11, Lt5/s;->k:Z

    .line 159
    .line 160
    if-eqz v0, :cond_5

    .line 161
    .line 162
    if-ne v1, v6, :cond_5

    .line 163
    .line 164
    move v0, v15

    .line 165
    goto :goto_2

    .line 166
    :cond_5
    move/from16 v0, v16

    .line 167
    .line 168
    :goto_2
    if-nez v0, :cond_6

    .line 169
    .line 170
    const/16 v18, 0x0

    .line 171
    .line 172
    move v6, v15

    .line 173
    goto :goto_3

    .line 174
    :cond_6
    move v6, v12

    .line 175
    :goto_3
    move-object/from16 v1, v22

    .line 176
    .line 177
    invoke-virtual {v11, v1, v2}, Lt5/s;->t(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    move-object v8, v0

    .line 182
    goto :goto_5

    .line 183
    :cond_7
    return-object v0

    .line 184
    :cond_8
    :goto_4
    move-object/from16 v1, v22

    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v11, v1, v2}, Lt5/s;->t(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    move-object v8, v0

    .line 194
    move v6, v12

    .line 195
    :goto_5
    move-object/from16 v12, p1

    .line 196
    .line 197
    move/from16 v0, v21

    .line 198
    .line 199
    move-wide/from16 v9, v23

    .line 200
    .line 201
    goto/16 :goto_1

    .line 202
    .line 203
    :cond_9
    move/from16 v21, v7

    .line 204
    .line 205
    new-instance v0, Lt5/x;

    .line 206
    .line 207
    new-instance v1, Ljava/net/NoRouteToHostException;

    .line 208
    .line 209
    const-string v2, "Too many redirects: "

    .line 210
    .line 211
    move/from16 v3, v21

    .line 212
    .line 213
    invoke-static {v2, v3}, Lf;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-direct {v1, v2}, Ljava/net/NoRouteToHostException;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    const/16 v2, 0x7d1

    .line 221
    .line 222
    invoke-direct {v0, v1, v2, v15}, Lt5/x;-><init>(Ljava/io/IOException;II)V

    .line 223
    .line 224
    .line 225
    throw v0
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method

.method public final x(J)V
    .locals 7

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    return-void

    :cond_0
    const/16 v2, 0x1000

    new-array v3, v2, [B

    :goto_0
    cmp-long v4, p1, v0

    if-lez v4, :cond_3

    int-to-long v4, v2

    invoke-static {p1, p2, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v4, v4

    iget-object v5, p0, Lt5/s;->n:Ljava/io/InputStream;

    sget v6, Lv5/e0;->a:I

    const/4 v6, 0x0

    invoke-virtual {v5, v3, v6, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v5

    const/4 v6, 0x1

    if-nez v5, :cond_2

    const/4 v5, -0x1

    if-eq v4, v5, :cond_1

    int-to-long v5, v4

    sub-long/2addr p1, v5

    invoke-virtual {p0, v4}, Lt5/f;->o(I)V

    goto :goto_0

    :cond_1
    new-instance p1, Lt5/x;

    invoke-direct {p1}, Lt5/x;-><init>()V

    throw p1

    :cond_2
    new-instance p1, Lt5/x;

    new-instance p2, Ljava/io/InterruptedIOException;

    invoke-direct {p2}, Ljava/io/InterruptedIOException;-><init>()V

    const/16 v0, 0x7d0

    invoke-direct {p1, p2, v0, v6}, Lt5/x;-><init>(Ljava/io/IOException;II)V

    throw p1

    :cond_3
    return-void
.end method
