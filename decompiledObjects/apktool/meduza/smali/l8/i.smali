.class public final Ll8/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll8/i$a;,
        Ll8/i$b;
    }
.end annotation


# static fields
.field public static final o:Ljava/util/logging/Logger;


# instance fields
.field public final a:Ljava/io/RandomAccessFile;

.field public b:I

.field public c:I

.field public d:Ll8/i$a;

.field public e:Ll8/i$a;

.field public final f:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Ll8/i;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ll8/i;->o:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 14

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x10

    .line 5
    .line 6
    new-array v1, v0, [B

    .line 7
    .line 8
    iput-object v1, p0, Ll8/i;->f:[B

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const-string v3, "rwd"

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x4

    .line 18
    const-wide/16 v6, 0x0

    .line 19
    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    new-instance v2, Ljava/io/File;

    .line 23
    .line 24
    new-instance v8, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v9, ".tmp"

    .line 37
    .line 38
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    invoke-direct {v2, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    new-instance v8, Ljava/io/RandomAccessFile;

    .line 49
    .line 50
    invoke-direct {v8, v2, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-wide/16 v9, 0x1000

    .line 54
    .line 55
    :try_start_0
    invoke-virtual {v8, v9, v10}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v8, v6, v7}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 59
    .line 60
    .line 61
    new-array v0, v0, [B

    .line 62
    .line 63
    new-array v9, v5, [I

    .line 64
    .line 65
    const/16 v10, 0x1000

    .line 66
    .line 67
    aput v10, v9, v4

    .line 68
    .line 69
    const/4 v10, 0x1

    .line 70
    aput v4, v9, v10

    .line 71
    .line 72
    const/4 v10, 0x2

    .line 73
    aput v4, v9, v10

    .line 74
    .line 75
    const/4 v10, 0x3

    .line 76
    aput v4, v9, v10

    .line 77
    .line 78
    move v10, v4

    .line 79
    move v11, v10

    .line 80
    :goto_0
    if-ge v10, v5, :cond_0

    .line 81
    .line 82
    aget v5, v9, v10

    .line 83
    .line 84
    shr-int/lit8 v12, v5, 0x18

    .line 85
    .line 86
    int-to-byte v12, v12

    .line 87
    aput-byte v12, v0, v11

    .line 88
    .line 89
    add-int/lit8 v12, v11, 0x1

    .line 90
    .line 91
    shr-int/lit8 v13, v5, 0x10

    .line 92
    .line 93
    int-to-byte v13, v13

    .line 94
    aput-byte v13, v0, v12

    .line 95
    .line 96
    add-int/lit8 v12, v11, 0x2

    .line 97
    .line 98
    shr-int/lit8 v13, v5, 0x8

    .line 99
    .line 100
    int-to-byte v13, v13

    .line 101
    aput-byte v13, v0, v12

    .line 102
    .line 103
    add-int/lit8 v12, v11, 0x3

    .line 104
    .line 105
    int-to-byte v5, v5

    .line 106
    aput-byte v5, v0, v12

    .line 107
    .line 108
    add-int/lit8 v11, v11, 0x4

    .line 109
    .line 110
    add-int/lit8 v10, v10, 0x1

    .line 111
    .line 112
    const/4 v5, 0x4

    .line 113
    goto :goto_0

    .line 114
    :cond_0
    invoke-virtual {v8, v0}, Ljava/io/RandomAccessFile;->write([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    .line 116
    .line 117
    invoke-virtual {v8}, Ljava/io/RandomAccessFile;->close()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_1

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 128
    .line 129
    const-string v0, "Rename failed!"

    .line 130
    .line 131
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw p1

    .line 135
    :catchall_0
    move-exception p1

    .line 136
    invoke-virtual {v8}, Ljava/io/RandomAccessFile;->close()V

    .line 137
    .line 138
    .line 139
    throw p1

    .line 140
    :cond_2
    :goto_1
    new-instance v0, Ljava/io/RandomAccessFile;

    .line 141
    .line 142
    invoke-direct {v0, p1, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iput-object v0, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    .line 146
    .line 147
    invoke-virtual {v0, v6, v7}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 151
    .line 152
    .line 153
    invoke-static {v1, v4}, Ll8/i;->H([BI)I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    iput p1, p0, Ll8/i;->b:I

    .line 158
    .line 159
    int-to-long v2, p1

    .line 160
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->length()J

    .line 161
    .line 162
    .line 163
    move-result-wide v4

    .line 164
    cmp-long p1, v2, v4

    .line 165
    .line 166
    if-gtz p1, :cond_3

    .line 167
    .line 168
    const/4 p1, 0x4

    .line 169
    invoke-static {v1, p1}, Ll8/i;->H([BI)I

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    iput p1, p0, Ll8/i;->c:I

    .line 174
    .line 175
    const/16 p1, 0x8

    .line 176
    .line 177
    invoke-static {v1, p1}, Ll8/i;->H([BI)I

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    const/16 v0, 0xc

    .line 182
    .line 183
    invoke-static {v1, v0}, Ll8/i;->H([BI)I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    invoke-virtual {p0, p1}, Ll8/i;->C(I)Ll8/i$a;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    iput-object p1, p0, Ll8/i;->d:Ll8/i$a;

    .line 192
    .line 193
    invoke-virtual {p0, v0}, Ll8/i;->C(I)Ll8/i$a;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    iput-object p1, p0, Ll8/i;->e:Ll8/i$a;

    .line 198
    .line 199
    return-void

    .line 200
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 201
    .line 202
    const-string v1, "File is truncated. Expected length: "

    .line 203
    .line 204
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    iget v2, p0, Ll8/i;->b:I

    .line 209
    .line 210
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v2, ", Actual length: "

    .line 214
    .line 215
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->length()J

    .line 219
    .line 220
    .line 221
    move-result-wide v2

    .line 222
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw p1
    .line 233
.end method

.method public static H([BI)I
    .locals 2

    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x3

    aget-byte p0, p0, p1

    and-int/lit16 p0, p0, 0xff

    add-int/2addr v0, p0

    return v0
.end method


# virtual methods
.method public final C(I)Ll8/i$a;
    .locals 3

    if-nez p1, :cond_0

    sget-object p1, Ll8/i$a;->c:Ll8/i$a;

    return-object p1

    :cond_0
    iget-object v0, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    new-instance v0, Ll8/i$a;

    iget-object v1, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v1

    invoke-direct {v0, p1, v1}, Ll8/i$a;-><init>(II)V

    return-object v0
.end method

.method public final declared-synchronized I()V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    :try_start_1
    iget v0, p0, Ll8/i;->c:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    move v3, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v3, v1

    .line 12
    :goto_0
    :try_start_2
    monitor-exit p0

    .line 13
    if-nez v3, :cond_3

    .line 14
    .line 15
    if-ne v0, v2, :cond_2

    .line 16
    .line 17
    monitor-enter p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 18
    const/16 v0, 0x1000

    .line 19
    .line 20
    :try_start_3
    invoke-virtual {p0, v0, v1, v1, v1}, Ll8/i;->h0(IIII)V

    .line 21
    .line 22
    .line 23
    iput v1, p0, Ll8/i;->c:I

    .line 24
    .line 25
    sget-object v1, Ll8/i$a;->c:Ll8/i$a;

    .line 26
    .line 27
    iput-object v1, p0, Ll8/i;->d:Ll8/i$a;

    .line 28
    .line 29
    iput-object v1, p0, Ll8/i;->e:Ll8/i$a;

    .line 30
    .line 31
    iget v1, p0, Ll8/i;->b:I

    .line 32
    .line 33
    if-le v1, v0, :cond_1

    .line 34
    .line 35
    iget-object v1, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    .line 36
    .line 37
    int-to-long v3, v0

    .line 38
    invoke-virtual {v1, v3, v4}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1, v2}, Ljava/nio/channels/FileChannel;->force(Z)V

    .line 48
    .line 49
    .line 50
    :cond_1
    iput v0, p0, Ll8/i;->b:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 51
    .line 52
    :try_start_4
    monitor-exit p0

    .line 53
    goto :goto_1

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    monitor-exit p0

    .line 56
    throw v0

    .line 57
    :cond_2
    iget-object v0, p0, Ll8/i;->d:Ll8/i$a;

    .line 58
    .line 59
    iget v3, v0, Ll8/i$a;->a:I

    .line 60
    .line 61
    const/4 v4, 0x4

    .line 62
    add-int/2addr v3, v4

    .line 63
    iget v0, v0, Ll8/i$a;->b:I

    .line 64
    .line 65
    add-int/2addr v3, v0

    .line 66
    invoke-virtual {p0, v3}, Ll8/i;->c0(I)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v3, p0, Ll8/i;->f:[B

    .line 71
    .line 72
    invoke-virtual {p0, v0, v3, v1, v4}, Ll8/i;->M(I[BII)V

    .line 73
    .line 74
    .line 75
    iget-object v3, p0, Ll8/i;->f:[B

    .line 76
    .line 77
    invoke-static {v3, v1}, Ll8/i;->H([BI)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    iget v3, p0, Ll8/i;->b:I

    .line 82
    .line 83
    iget v4, p0, Ll8/i;->c:I

    .line 84
    .line 85
    sub-int/2addr v4, v2

    .line 86
    iget-object v5, p0, Ll8/i;->e:Ll8/i$a;

    .line 87
    .line 88
    iget v5, v5, Ll8/i$a;->a:I

    .line 89
    .line 90
    invoke-virtual {p0, v3, v4, v0, v5}, Ll8/i;->h0(IIII)V

    .line 91
    .line 92
    .line 93
    iget v3, p0, Ll8/i;->c:I

    .line 94
    .line 95
    sub-int/2addr v3, v2

    .line 96
    iput v3, p0, Ll8/i;->c:I

    .line 97
    .line 98
    new-instance v2, Ll8/i$a;

    .line 99
    .line 100
    invoke-direct {v2, v0, v1}, Ll8/i$a;-><init>(II)V

    .line 101
    .line 102
    .line 103
    iput-object v2, p0, Ll8/i;->d:Ll8/i$a;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 104
    .line 105
    :goto_1
    monitor-exit p0

    .line 106
    return-void

    .line 107
    :cond_3
    :try_start_5
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 108
    .line 109
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 110
    .line 111
    .line 112
    throw v0

    .line 113
    :catchall_1
    move-exception v0

    .line 114
    goto :goto_2

    .line 115
    :catchall_2
    move-exception v0

    .line 116
    monitor-exit p0

    .line 117
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 118
    :goto_2
    monitor-exit p0

    .line 119
    throw v0
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

.method public final M(I[BII)V
    .locals 4

    invoke-virtual {p0, p1}, Ll8/i;->c0(I)I

    move-result p1

    add-int v0, p1, p4

    iget v1, p0, Ll8/i;->b:I

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object p1, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    goto :goto_0

    :cond_0
    sub-int/2addr v1, p1

    iget-object v0, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    int-to-long v2, p1

    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object p1, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {p1, p2, p3, v1}, Ljava/io/RandomAccessFile;->readFully([BII)V

    iget-object p1, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    const-wide/16 v2, 0x10

    invoke-virtual {p1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object p1, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    add-int/2addr p3, v1

    sub-int/2addr p4, v1

    :goto_0
    invoke-virtual {p1, p2, p3, p4}, Ljava/io/RandomAccessFile;->readFully([BII)V

    return-void
.end method

.method public final Q(I[BI)V
    .locals 5

    invoke-virtual {p0, p1}, Ll8/i;->c0(I)I

    move-result p1

    add-int v0, p1, p3

    iget v1, p0, Ll8/i;->b:I

    const/4 v2, 0x0

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    int-to-long v3, p1

    invoke-virtual {v0, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object p1, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    goto :goto_0

    :cond_0
    sub-int/2addr v1, p1

    iget-object v0, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    int-to-long v3, p1

    invoke-virtual {v0, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object p1, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {p1, p2, v2, v1}, Ljava/io/RandomAccessFile;->write([BII)V

    iget-object p1, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    const-wide/16 v3, 0x10

    invoke-virtual {p1, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object p1, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    add-int/2addr v2, v1

    sub-int/2addr p3, v1

    :goto_0
    invoke-virtual {p1, p2, v2, p3}, Ljava/io/RandomAccessFile;->write([BII)V

    return-void
.end method

.method public final b0()I
    .locals 4

    iget v0, p0, Ll8/i;->c:I

    const/16 v1, 0x10

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Ll8/i;->e:Ll8/i$a;

    iget v2, v0, Ll8/i$a;->a:I

    iget-object v3, p0, Ll8/i;->d:Ll8/i$a;

    iget v3, v3, Ll8/i$a;->a:I

    if-lt v2, v3, :cond_1

    sub-int/2addr v2, v3

    add-int/lit8 v2, v2, 0x4

    iget v0, v0, Ll8/i$a;->b:I

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    return v2

    :cond_1
    add-int/lit8 v2, v2, 0x4

    iget v0, v0, Ll8/i$a;->b:I

    add-int/2addr v2, v0

    iget v0, p0, Ll8/i;->b:I

    add-int/2addr v2, v0

    sub-int/2addr v2, v3

    return v2
.end method

.method public final c0(I)I
    .locals 1

    iget v0, p0, Ll8/i;->b:I

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, 0x10

    sub-int/2addr p1, v0

    :goto_0
    return p1
.end method

.method public final declared-synchronized close()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final f([B)V
    .locals 9

    .line 1
    array-length v0, p1

    .line 2
    monitor-enter p0

    .line 3
    or-int/lit8 v1, v0, 0x0

    .line 4
    .line 5
    if-ltz v1, :cond_4

    .line 6
    .line 7
    :try_start_0
    array-length v1, p1

    .line 8
    const/4 v2, 0x0

    .line 9
    sub-int/2addr v1, v2

    .line 10
    if-gt v0, v1, :cond_4

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ll8/i;->g(I)V

    .line 13
    .line 14
    .line 15
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    :try_start_1
    iget v1, p0, Ll8/i;->c:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    move v1, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v1, v2

    .line 24
    :goto_0
    :try_start_2
    monitor-exit p0

    .line 25
    const/4 v4, 0x4

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    const/16 v5, 0x10

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    iget-object v5, p0, Ll8/i;->e:Ll8/i$a;

    .line 32
    .line 33
    iget v6, v5, Ll8/i$a;->a:I

    .line 34
    .line 35
    add-int/2addr v6, v4

    .line 36
    iget v5, v5, Ll8/i$a;->b:I

    .line 37
    .line 38
    add-int/2addr v6, v5

    .line 39
    invoke-virtual {p0, v6}, Ll8/i;->c0(I)I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    :goto_1
    new-instance v6, Ll8/i$a;

    .line 44
    .line 45
    invoke-direct {v6, v5, v0}, Ll8/i$a;-><init>(II)V

    .line 46
    .line 47
    .line 48
    iget-object v7, p0, Ll8/i;->f:[B

    .line 49
    .line 50
    shr-int/lit8 v8, v0, 0x18

    .line 51
    .line 52
    int-to-byte v8, v8

    .line 53
    aput-byte v8, v7, v2

    .line 54
    .line 55
    shr-int/lit8 v2, v0, 0x10

    .line 56
    .line 57
    int-to-byte v2, v2

    .line 58
    aput-byte v2, v7, v3

    .line 59
    .line 60
    const/4 v2, 0x2

    .line 61
    shr-int/lit8 v8, v0, 0x8

    .line 62
    .line 63
    int-to-byte v8, v8

    .line 64
    aput-byte v8, v7, v2

    .line 65
    .line 66
    const/4 v2, 0x3

    .line 67
    int-to-byte v8, v0

    .line 68
    aput-byte v8, v7, v2

    .line 69
    .line 70
    invoke-virtual {p0, v5, v7, v4}, Ll8/i;->Q(I[BI)V

    .line 71
    .line 72
    .line 73
    add-int/lit8 v2, v5, 0x4

    .line 74
    .line 75
    invoke-virtual {p0, v2, p1, v0}, Ll8/i;->Q(I[BI)V

    .line 76
    .line 77
    .line 78
    if-eqz v1, :cond_2

    .line 79
    .line 80
    move p1, v5

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    iget-object p1, p0, Ll8/i;->d:Ll8/i$a;

    .line 83
    .line 84
    iget p1, p1, Ll8/i$a;->a:I

    .line 85
    .line 86
    :goto_2
    iget v0, p0, Ll8/i;->b:I

    .line 87
    .line 88
    iget v2, p0, Ll8/i;->c:I

    .line 89
    .line 90
    add-int/2addr v2, v3

    .line 91
    invoke-virtual {p0, v0, v2, p1, v5}, Ll8/i;->h0(IIII)V

    .line 92
    .line 93
    .line 94
    iput-object v6, p0, Ll8/i;->e:Ll8/i$a;

    .line 95
    .line 96
    iget p1, p0, Ll8/i;->c:I

    .line 97
    .line 98
    add-int/2addr p1, v3

    .line 99
    iput p1, p0, Ll8/i;->c:I

    .line 100
    .line 101
    if-eqz v1, :cond_3

    .line 102
    .line 103
    iput-object v6, p0, Ll8/i;->d:Ll8/i$a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 104
    .line 105
    :cond_3
    monitor-exit p0

    .line 106
    return-void

    .line 107
    :catchall_0
    move-exception p1

    .line 108
    :try_start_3
    monitor-exit p0

    .line 109
    throw p1

    .line 110
    :cond_4
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 111
    .line 112
    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 113
    .line 114
    .line 115
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 116
    :catchall_1
    move-exception p1

    .line 117
    monitor-exit p0

    .line 118
    throw p1
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
.end method

.method public final g(I)V
    .locals 10

    .line 1
    add-int/lit8 p1, p1, 0x4

    .line 2
    .line 3
    iget v0, p0, Ll8/i;->b:I

    .line 4
    .line 5
    invoke-virtual {p0}, Ll8/i;->b0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    if-lt v0, p1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget v1, p0, Ll8/i;->b:I

    .line 14
    .line 15
    :cond_1
    add-int/2addr v0, v1

    .line 16
    const/4 v2, 0x1

    .line 17
    shl-int/2addr v1, v2

    .line 18
    if-lt v0, p1, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    .line 21
    .line 22
    int-to-long v3, v1

    .line 23
    invoke-virtual {p1, v3, v4}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v2}, Ljava/nio/channels/FileChannel;->force(Z)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Ll8/i;->e:Ll8/i$a;

    .line 36
    .line 37
    iget v0, p1, Ll8/i$a;->a:I

    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x4

    .line 40
    .line 41
    iget p1, p1, Ll8/i$a;->b:I

    .line 42
    .line 43
    add-int/2addr v0, p1

    .line 44
    invoke-virtual {p0, v0}, Ll8/i;->c0(I)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iget-object v0, p0, Ll8/i;->d:Ll8/i$a;

    .line 49
    .line 50
    iget v0, v0, Ll8/i$a;->a:I

    .line 51
    .line 52
    if-ge p1, v0, :cond_3

    .line 53
    .line 54
    iget-object v0, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    iget v0, p0, Ll8/i;->b:I

    .line 61
    .line 62
    int-to-long v2, v0

    .line 63
    invoke-virtual {v7, v2, v3}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 64
    .line 65
    .line 66
    add-int/lit8 p1, p1, -0x4

    .line 67
    .line 68
    const-wide/16 v3, 0x10

    .line 69
    .line 70
    int-to-long v8, p1

    .line 71
    move-object v2, v7

    .line 72
    move-wide v5, v8

    .line 73
    invoke-virtual/range {v2 .. v7}, Ljava/nio/channels/FileChannel;->transferTo(JJLjava/nio/channels/WritableByteChannel;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v2

    .line 77
    cmp-long p1, v2, v8

    .line 78
    .line 79
    if-nez p1, :cond_2

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 83
    .line 84
    const-string v0, "Copied insufficient number of bytes!"

    .line 85
    .line 86
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :cond_3
    :goto_0
    iget-object p1, p0, Ll8/i;->e:Ll8/i$a;

    .line 91
    .line 92
    iget p1, p1, Ll8/i$a;->a:I

    .line 93
    .line 94
    iget-object v0, p0, Ll8/i;->d:Ll8/i$a;

    .line 95
    .line 96
    iget v0, v0, Ll8/i$a;->a:I

    .line 97
    .line 98
    if-ge p1, v0, :cond_4

    .line 99
    .line 100
    iget v2, p0, Ll8/i;->b:I

    .line 101
    .line 102
    add-int/2addr v2, p1

    .line 103
    add-int/lit8 v2, v2, -0x10

    .line 104
    .line 105
    iget p1, p0, Ll8/i;->c:I

    .line 106
    .line 107
    invoke-virtual {p0, v1, p1, v0, v2}, Ll8/i;->h0(IIII)V

    .line 108
    .line 109
    .line 110
    new-instance p1, Ll8/i$a;

    .line 111
    .line 112
    iget-object v0, p0, Ll8/i;->e:Ll8/i$a;

    .line 113
    .line 114
    iget v0, v0, Ll8/i$a;->b:I

    .line 115
    .line 116
    invoke-direct {p1, v2, v0}, Ll8/i$a;-><init>(II)V

    .line 117
    .line 118
    .line 119
    iput-object p1, p0, Ll8/i;->e:Ll8/i$a;

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_4
    iget v2, p0, Ll8/i;->c:I

    .line 123
    .line 124
    invoke-virtual {p0, v1, v2, v0, p1}, Ll8/i;->h0(IIII)V

    .line 125
    .line 126
    .line 127
    :goto_1
    iput v1, p0, Ll8/i;->b:I

    .line 128
    .line 129
    return-void
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
.end method

.method public final h0(IIII)V
    .locals 4

    .line 1
    iget-object v0, p0, Ll8/i;->f:[B

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    new-array v2, v1, [I

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    aput p1, v2, v3

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    aput p2, v2, p1

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    aput p3, v2, p1

    .line 14
    .line 15
    const/4 p1, 0x3

    .line 16
    aput p4, v2, p1

    .line 17
    .line 18
    move p1, v3

    .line 19
    :goto_0
    if-ge v3, v1, :cond_0

    .line 20
    .line 21
    aget p2, v2, v3

    .line 22
    .line 23
    shr-int/lit8 p3, p2, 0x18

    .line 24
    .line 25
    int-to-byte p3, p3

    .line 26
    aput-byte p3, v0, p1

    .line 27
    .line 28
    add-int/lit8 p3, p1, 0x1

    .line 29
    .line 30
    shr-int/lit8 p4, p2, 0x10

    .line 31
    .line 32
    int-to-byte p4, p4

    .line 33
    aput-byte p4, v0, p3

    .line 34
    .line 35
    add-int/lit8 p3, p1, 0x2

    .line 36
    .line 37
    shr-int/lit8 p4, p2, 0x8

    .line 38
    .line 39
    int-to-byte p4, p4

    .line 40
    aput-byte p4, v0, p3

    .line 41
    .line 42
    add-int/lit8 p3, p1, 0x3

    .line 43
    .line 44
    int-to-byte p2, p2

    .line 45
    aput-byte p2, v0, p3

    .line 46
    .line 47
    add-int/2addr p1, v1

    .line 48
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iget-object p1, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    .line 52
    .line 53
    const-wide/16 p2, 0x0

    .line 54
    .line 55
    invoke-virtual {p1, p2, p3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    .line 59
    .line 60
    iget-object p2, p0, Ll8/i;->f:[B

    .line 61
    .line 62
    invoke-virtual {p1, p2}, Ljava/io/RandomAccessFile;->write([B)V

    .line 63
    .line 64
    .line 65
    return-void
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
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Ll8/i;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x5b

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, "fileLength="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v1, p0, Ll8/i;->b:I

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", size="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget v1, p0, Ll8/i;->c:I

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", first="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Ll8/i;->d:Ll8/i$a;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", last="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Ll8/i;->e:Ll8/i$a;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, ", element lengths=["

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    :try_start_1
    iget-object v1, p0, Ll8/i;->d:Ll8/i$a;

    .line 67
    .line 68
    iget v1, v1, Ll8/i$a;->a:I

    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    const/4 v3, 0x1

    .line 72
    move v4, v2

    .line 73
    :goto_0
    iget v5, p0, Ll8/i;->c:I

    .line 74
    .line 75
    if-ge v4, v5, :cond_1

    .line 76
    .line 77
    invoke-virtual {p0, v1}, Ll8/i;->C(I)Ll8/i$a;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    new-instance v5, Ll8/i$b;

    .line 82
    .line 83
    invoke-direct {v5, p0, v1}, Ll8/i$b;-><init>(Ll8/i;Ll8/i$a;)V

    .line 84
    .line 85
    .line 86
    iget v5, v1, Ll8/i$a;->b:I

    .line 87
    .line 88
    if-eqz v3, :cond_0

    .line 89
    .line 90
    move v3, v2

    .line 91
    goto :goto_1

    .line 92
    :cond_0
    const-string v6, ", "

    .line 93
    .line 94
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    :goto_1
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    iget v5, v1, Ll8/i$a;->a:I

    .line 101
    .line 102
    add-int/lit8 v5, v5, 0x4

    .line 103
    .line 104
    iget v1, v1, Ll8/i$a;->b:I

    .line 105
    .line 106
    add-int/2addr v5, v1

    .line 107
    invoke-virtual {p0, v5}, Ll8/i;->c0(I)I

    .line 108
    .line 109
    .line 110
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    add-int/lit8 v4, v4, 0x1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_1
    :try_start_2
    monitor-exit p0

    .line 115
    goto :goto_2

    .line 116
    :catchall_0
    move-exception v1

    .line 117
    monitor-exit p0

    .line 118
    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 119
    :catch_0
    move-exception v1

    .line 120
    sget-object v2, Ll8/i;->o:Ljava/util/logging/Logger;

    .line 121
    .line 122
    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 123
    .line 124
    const-string v4, "read error"

    .line 125
    .line 126
    invoke-virtual {v2, v3, v4, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    :goto_2
    const-string v1, "]]"

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    return-object v0
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
