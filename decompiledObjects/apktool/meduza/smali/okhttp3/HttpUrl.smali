.class public final Lokhttp3/HttpUrl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/HttpUrl$Builder;
    }
.end annotation


# static fields
.field public static final j:[C


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lokhttp3/HttpUrl;->j:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public constructor <init>(Lokhttp3/HttpUrl$Builder;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lokhttp3/HttpUrl$Builder;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object v0, p0, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v0, p1, Lokhttp3/HttpUrl$Builder;->b:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static {v2, v1, v0, v2}, Lokhttp3/HttpUrl;->j(IILjava/lang/String;Z)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lokhttp3/HttpUrl;->b:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v0, p1, Lokhttp3/HttpUrl$Builder;->c:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-static {v2, v1, v0, v2}, Lokhttp3/HttpUrl;->j(IILjava/lang/String;Z)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lokhttp3/HttpUrl;->c:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v0, p1, Lokhttp3/HttpUrl$Builder;->d:Ljava/lang/String;

    .line 34
    .line 35
    iput-object v0, p0, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 36
    .line 37
    iget v0, p1, Lokhttp3/HttpUrl$Builder;->e:I

    .line 38
    .line 39
    const/4 v1, -0x1

    .line 40
    if-eq v0, v1, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object v0, p1, Lokhttp3/HttpUrl$Builder;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0}, Lokhttp3/HttpUrl;->c(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    :goto_0
    iput v0, p0, Lokhttp3/HttpUrl;->e:I

    .line 50
    .line 51
    iget-object v0, p1, Lokhttp3/HttpUrl$Builder;->f:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-static {v0, v2}, Lokhttp3/HttpUrl;->k(Ljava/util/List;Z)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Lokhttp3/HttpUrl;->f:Ljava/util/List;

    .line 58
    .line 59
    iget-object v0, p1, Lokhttp3/HttpUrl$Builder;->g:Ljava/util/ArrayList;

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    const/4 v3, 0x1

    .line 65
    invoke-static {v0, v3}, Lokhttp3/HttpUrl;->k(Ljava/util/List;Z)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    move-object v0, v1

    .line 71
    :goto_1
    iput-object v0, p0, Lokhttp3/HttpUrl;->g:Ljava/util/List;

    .line 72
    .line 73
    iget-object v0, p1, Lokhttp3/HttpUrl$Builder;->h:Ljava/lang/String;

    .line 74
    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-static {v2, v1, v0, v2}, Lokhttp3/HttpUrl;->j(IILjava/lang/String;Z)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :cond_2
    iput-object v1, p0, Lokhttp3/HttpUrl;->h:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {p1}, Lokhttp3/HttpUrl$Builder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iput-object p1, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    .line 92
    .line 93
    return-void
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
.end method

.method public static a(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p1

    .line 8
    .line 9
    :goto_0
    if-ge v3, v1, :cond_d

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/lang/String;->codePointAt(I)I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const/16 v5, 0x7f

    .line 16
    .line 17
    const/16 v6, 0x25

    .line 18
    .line 19
    const/16 v7, 0x2b

    .line 20
    .line 21
    const/16 v8, 0x20

    .line 22
    .line 23
    const/16 v9, 0x80

    .line 24
    .line 25
    const/4 v10, -0x1

    .line 26
    if-lt v4, v8, :cond_3

    .line 27
    .line 28
    if-eq v4, v5, :cond_3

    .line 29
    .line 30
    if-lt v4, v9, :cond_0

    .line 31
    .line 32
    if-nez p7, :cond_3

    .line 33
    .line 34
    :cond_0
    invoke-virtual {v2, v4}, Ljava/lang/String;->indexOf(I)I

    .line 35
    .line 36
    .line 37
    move-result v11

    .line 38
    if-ne v11, v10, :cond_3

    .line 39
    .line 40
    if-ne v4, v6, :cond_1

    .line 41
    .line 42
    if-eqz p4, :cond_3

    .line 43
    .line 44
    if-eqz p5, :cond_1

    .line 45
    .line 46
    invoke-static {v3, v1, v0}, Lokhttp3/HttpUrl;->l(IILjava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v11

    .line 50
    if-eqz v11, :cond_3

    .line 51
    .line 52
    :cond_1
    if-ne v4, v7, :cond_2

    .line 53
    .line 54
    if-eqz p6, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    invoke-static {v4}, Ljava/lang/Character;->charCount(I)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    add-int/2addr v3, v4

    .line 62
    goto :goto_0

    .line 63
    :cond_3
    :goto_1
    new-instance v4, Lxc/f;

    .line 64
    .line 65
    invoke-direct {v4}, Lxc/f;-><init>()V

    .line 66
    .line 67
    .line 68
    move/from16 v11, p1

    .line 69
    .line 70
    invoke-virtual {v4, v11, v3, v0}, Lxc/f;->G0(IILjava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 v11, 0x0

    .line 74
    :goto_2
    if-ge v3, v1, :cond_c

    .line 75
    .line 76
    invoke-virtual {v0, v3}, Ljava/lang/String;->codePointAt(I)I

    .line 77
    .line 78
    .line 79
    move-result v12

    .line 80
    if-eqz p4, :cond_4

    .line 81
    .line 82
    const/16 v13, 0x9

    .line 83
    .line 84
    if-eq v12, v13, :cond_b

    .line 85
    .line 86
    const/16 v13, 0xa

    .line 87
    .line 88
    if-eq v12, v13, :cond_b

    .line 89
    .line 90
    const/16 v13, 0xc

    .line 91
    .line 92
    if-eq v12, v13, :cond_b

    .line 93
    .line 94
    const/16 v13, 0xd

    .line 95
    .line 96
    if-ne v12, v13, :cond_4

    .line 97
    .line 98
    goto :goto_6

    .line 99
    :cond_4
    if-ne v12, v7, :cond_6

    .line 100
    .line 101
    if-eqz p6, :cond_6

    .line 102
    .line 103
    if-eqz p4, :cond_5

    .line 104
    .line 105
    const-string v13, "+"

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_5
    const-string v13, "%2B"

    .line 109
    .line 110
    :goto_3
    invoke-virtual {v4, v13}, Lxc/f;->H0(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_6

    .line 114
    :cond_6
    if-lt v12, v8, :cond_9

    .line 115
    .line 116
    if-eq v12, v5, :cond_9

    .line 117
    .line 118
    if-lt v12, v9, :cond_7

    .line 119
    .line 120
    if-nez p7, :cond_9

    .line 121
    .line 122
    :cond_7
    invoke-virtual {v2, v12}, Ljava/lang/String;->indexOf(I)I

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    if-ne v13, v10, :cond_9

    .line 127
    .line 128
    if-ne v12, v6, :cond_8

    .line 129
    .line 130
    if-eqz p4, :cond_9

    .line 131
    .line 132
    if-eqz p5, :cond_8

    .line 133
    .line 134
    invoke-static {v3, v1, v0}, Lokhttp3/HttpUrl;->l(IILjava/lang/String;)Z

    .line 135
    .line 136
    .line 137
    move-result v13

    .line 138
    if-nez v13, :cond_8

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_8
    invoke-virtual {v4, v12}, Lxc/f;->I0(I)V

    .line 142
    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_9
    :goto_4
    if-nez v11, :cond_a

    .line 146
    .line 147
    new-instance v11, Lxc/f;

    .line 148
    .line 149
    invoke-direct {v11}, Lxc/f;-><init>()V

    .line 150
    .line 151
    .line 152
    :cond_a
    invoke-virtual {v11, v12}, Lxc/f;->I0(I)V

    .line 153
    .line 154
    .line 155
    :goto_5
    invoke-virtual {v11}, Lxc/f;->v()Z

    .line 156
    .line 157
    .line 158
    move-result v13

    .line 159
    if-nez v13, :cond_b

    .line 160
    .line 161
    invoke-virtual {v11}, Lxc/f;->readByte()B

    .line 162
    .line 163
    .line 164
    move-result v13

    .line 165
    and-int/lit16 v13, v13, 0xff

    .line 166
    .line 167
    invoke-virtual {v4, v6}, Lxc/f;->B0(I)V

    .line 168
    .line 169
    .line 170
    sget-object v14, Lokhttp3/HttpUrl;->j:[C

    .line 171
    .line 172
    shr-int/lit8 v15, v13, 0x4

    .line 173
    .line 174
    and-int/lit8 v15, v15, 0xf

    .line 175
    .line 176
    aget-char v15, v14, v15

    .line 177
    .line 178
    invoke-virtual {v4, v15}, Lxc/f;->B0(I)V

    .line 179
    .line 180
    .line 181
    and-int/lit8 v13, v13, 0xf

    .line 182
    .line 183
    aget-char v13, v14, v13

    .line 184
    .line 185
    invoke-virtual {v4, v13}, Lxc/f;->B0(I)V

    .line 186
    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_b
    :goto_6
    invoke-static {v12}, Ljava/lang/Character;->charCount(I)I

    .line 190
    .line 191
    .line 192
    move-result v12

    .line 193
    add-int/2addr v3, v12

    .line 194
    goto :goto_2

    .line 195
    :cond_c
    invoke-virtual {v4}, Lxc/f;->k0()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    return-object v0

    .line 200
    :cond_d
    move/from16 v11, p1

    .line 201
    .line 202
    invoke-virtual/range {p0 .. p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    return-object v0
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
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;ZZZZ)Ljava/lang/String;
    .locals 8

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v1, 0x0

    move-object v0, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    invoke-static/range {v0 .. v7}, Lokhttp3/HttpUrl;->a(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/String;)I
    .locals 1

    const-string v0, "http"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 p0, 0x50

    return p0

    :cond_0
    const-string v0, "https"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/16 p0, 0x1bb

    return p0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static i(Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    add-int/lit8 v3, v1, 0x1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-lez v1, :cond_0

    const/16 v4, 0x26

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v3, :cond_1

    const/16 v2, 0x3d

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static j(IILjava/lang/String;Z)Ljava/lang/String;
    .locals 8

    .line 1
    move v0, p0

    .line 2
    :goto_0
    if-ge v0, p1, :cond_5

    .line 3
    .line 4
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/16 v2, 0x2b

    .line 9
    .line 10
    const/16 v3, 0x25

    .line 11
    .line 12
    if-eq v1, v3, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    :goto_1
    new-instance v1, Lxc/f;

    .line 23
    .line 24
    invoke-direct {v1}, Lxc/f;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p0, v0, p2}, Lxc/f;->G0(IILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_2
    if-ge v0, p1, :cond_4

    .line 31
    .line 32
    invoke-virtual {p2, v0}, Ljava/lang/String;->codePointAt(I)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-ne p0, v3, :cond_2

    .line 37
    .line 38
    add-int/lit8 v4, v0, 0x2

    .line 39
    .line 40
    if-ge v4, p1, :cond_2

    .line 41
    .line 42
    add-int/lit8 v5, v0, 0x1

    .line 43
    .line 44
    invoke-virtual {p2, v5}, Ljava/lang/String;->charAt(I)C

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    invoke-static {v5}, Lokhttp3/internal/Util;->g(C)I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    invoke-virtual {p2, v4}, Ljava/lang/String;->charAt(I)C

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    invoke-static {v6}, Lokhttp3/internal/Util;->g(C)I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    const/4 v7, -0x1

    .line 61
    if-eq v5, v7, :cond_3

    .line 62
    .line 63
    if-eq v6, v7, :cond_3

    .line 64
    .line 65
    shl-int/lit8 v0, v5, 0x4

    .line 66
    .line 67
    add-int/2addr v0, v6

    .line 68
    invoke-virtual {v1, v0}, Lxc/f;->B0(I)V

    .line 69
    .line 70
    .line 71
    move v0, v4

    .line 72
    goto :goto_3

    .line 73
    :cond_2
    if-ne p0, v2, :cond_3

    .line 74
    .line 75
    if-eqz p3, :cond_3

    .line 76
    .line 77
    const/16 v4, 0x20

    .line 78
    .line 79
    invoke-virtual {v1, v4}, Lxc/f;->B0(I)V

    .line 80
    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    invoke-virtual {v1, p0}, Lxc/f;->I0(I)V

    .line 84
    .line 85
    .line 86
    :goto_3
    invoke-static {p0}, Ljava/lang/Character;->charCount(I)I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    add-int/2addr v0, p0

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    invoke-virtual {v1}, Lxc/f;->k0()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :cond_5
    invoke-virtual {p2, p0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0
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

.method public static k(Ljava/util/List;Z)Ljava/util/List;
    .locals 6

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    if-ge v3, v0, :cond_1

    .line 13
    .line 14
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    invoke-static {v2, v5, v4, p1}, Lokhttp3/HttpUrl;->j(IILjava/lang/String;Z)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    const/4 v4, 0x0

    .line 32
    :goto_1
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
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

.method public static l(IILjava/lang/String;)Z
    .locals 3

    add-int/lit8 v0, p0, 0x2

    const/4 v1, 0x1

    if-ge v0, p1, :cond_0

    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 v2, 0x25

    if-ne p1, v2, :cond_0

    add-int/2addr p0, v1

    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-static {p0}, Lokhttp3/internal/Util;->g(C)I

    move-result p0

    const/4 p1, -0x1

    if-eq p0, p1, :cond_0

    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-static {p0}, Lokhttp3/internal/Util;->g(C)I

    move-result p0

    if-eq p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static m(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-gt v1, v2, :cond_3

    const/16 v2, 0x26

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    :cond_0
    const/16 v4, 0x3d

    invoke-virtual {p0, v4, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    if-eq v4, v3, :cond_2

    if-le v4, v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {p0, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    :goto_1
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lokhttp3/HttpUrl;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    iget-object v0, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    const/16 v1, 0x3a

    iget-object v2, p0, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x3

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    const/16 v2, 0x40

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    iget-object v2, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    iget-object v1, p0, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x3

    const/16 v2, 0x2f

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    iget-object v1, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const-string v3, "?#"

    invoke-static {v1, v0, v2, v3}, Lokhttp3/internal/Util;->j(Ljava/lang/String;IILjava/lang/String;)I

    move-result v1

    iget-object v2, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lokhttp3/HttpUrl;

    if-eqz v0, :cond_0

    check-cast p1, Lokhttp3/HttpUrl;

    iget-object p1, p1, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    iget-object v0, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final f()Ljava/util/ArrayList;
    .locals 6

    iget-object v0, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    iget-object v1, p0, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x3

    const/16 v2, 0x2f

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    iget-object v1, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const-string v4, "?#"

    invoke-static {v1, v0, v3, v4}, Lokhttp3/internal/Util;->j(Ljava/lang/String;IILjava/lang/String;)I

    move-result v1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    if-ge v0, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    iget-object v4, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    invoke-static {v4, v0, v1, v2}, Lokhttp3/internal/Util;->i(Ljava/lang/String;IIC)I

    move-result v4

    iget-object v5, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    invoke-virtual {v5, v0, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v0, v4

    goto :goto_0

    :cond_0
    return-object v3
.end method

.method public final g()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lokhttp3/HttpUrl;->g:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x23

    invoke-static {v1, v0, v2, v3}, Lokhttp3/internal/Util;->i(Ljava/lang/String;IIC)I

    move-result v1

    iget-object v2, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lokhttp3/HttpUrl;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    iget-object v0, p0, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    iget-object v1, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const-string v3, ":@"

    invoke-static {v1, v0, v2, v3}, Lokhttp3/internal/Util;->j(Ljava/lang/String;IILjava/lang/String;)I

    move-result v1

    iget-object v2, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final n()Ljava/net/URI;
    .locals 11

    .line 1
    new-instance v0, Lokhttp3/HttpUrl$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/HttpUrl$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v1, v0, Lokhttp3/HttpUrl$Builder;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p0}, Lokhttp3/HttpUrl;->h()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-object v1, v0, Lokhttp3/HttpUrl$Builder;->b:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0}, Lokhttp3/HttpUrl;->d()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iput-object v1, v0, Lokhttp3/HttpUrl$Builder;->c:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v1, p0, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 23
    .line 24
    iput-object v1, v0, Lokhttp3/HttpUrl$Builder;->d:Ljava/lang/String;

    .line 25
    .line 26
    iget v1, p0, Lokhttp3/HttpUrl;->e:I

    .line 27
    .line 28
    iget-object v2, p0, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v2}, Lokhttp3/HttpUrl;->c(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eq v1, v2, :cond_0

    .line 35
    .line 36
    iget v1, p0, Lokhttp3/HttpUrl;->e:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v1, -0x1

    .line 40
    :goto_0
    iput v1, v0, Lokhttp3/HttpUrl$Builder;->e:I

    .line 41
    .line 42
    iget-object v1, v0, Lokhttp3/HttpUrl$Builder;->f:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 45
    .line 46
    .line 47
    iget-object v1, v0, Lokhttp3/HttpUrl$Builder;->f:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {p0}, Lokhttp3/HttpUrl;->f()Ljava/util/ArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lokhttp3/HttpUrl;->g()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    const/4 v1, 0x0

    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    const/4 v5, 0x1

    .line 64
    const/4 v6, 0x0

    .line 65
    const/4 v7, 0x1

    .line 66
    const/4 v8, 0x1

    .line 67
    const-string v4, " \"\'<>#"

    .line 68
    .line 69
    invoke-static/range {v3 .. v8}, Lokhttp3/HttpUrl;->b(Ljava/lang/String;Ljava/lang/String;ZZZZ)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v2}, Lokhttp3/HttpUrl;->m(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    goto :goto_1

    .line 78
    :cond_1
    move-object v2, v1

    .line 79
    :goto_1
    iput-object v2, v0, Lokhttp3/HttpUrl$Builder;->g:Ljava/util/ArrayList;

    .line 80
    .line 81
    iget-object v2, p0, Lokhttp3/HttpUrl;->h:Ljava/lang/String;

    .line 82
    .line 83
    if-nez v2, :cond_2

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    iget-object v1, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    .line 87
    .line 88
    const/16 v2, 0x23

    .line 89
    .line 90
    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    add-int/lit8 v1, v1, 0x1

    .line 95
    .line 96
    iget-object v2, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {v2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    :goto_2
    iput-object v1, v0, Lokhttp3/HttpUrl$Builder;->h:Ljava/lang/String;

    .line 103
    .line 104
    iget-object v1, v0, Lokhttp3/HttpUrl$Builder;->f:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    const/4 v2, 0x0

    .line 111
    move v3, v2

    .line 112
    :goto_3
    if-ge v3, v1, :cond_3

    .line 113
    .line 114
    iget-object v4, v0, Lokhttp3/HttpUrl$Builder;->f:Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    move-object v5, v4

    .line 121
    check-cast v5, Ljava/lang/String;

    .line 122
    .line 123
    iget-object v4, v0, Lokhttp3/HttpUrl$Builder;->f:Ljava/util/ArrayList;

    .line 124
    .line 125
    const/4 v7, 0x1

    .line 126
    const/4 v8, 0x1

    .line 127
    const/4 v9, 0x0

    .line 128
    const/4 v10, 0x1

    .line 129
    const-string v6, "[]"

    .line 130
    .line 131
    invoke-static/range {v5 .. v10}, Lokhttp3/HttpUrl;->b(Ljava/lang/String;Ljava/lang/String;ZZZZ)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    invoke-virtual {v4, v3, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    add-int/lit8 v3, v3, 0x1

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_3
    iget-object v1, v0, Lokhttp3/HttpUrl$Builder;->g:Ljava/util/ArrayList;

    .line 142
    .line 143
    if-eqz v1, :cond_5

    .line 144
    .line 145
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    :goto_4
    if-ge v2, v1, :cond_5

    .line 150
    .line 151
    iget-object v3, v0, Lokhttp3/HttpUrl$Builder;->g:Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    move-object v4, v3

    .line 158
    check-cast v4, Ljava/lang/String;

    .line 159
    .line 160
    if-eqz v4, :cond_4

    .line 161
    .line 162
    iget-object v3, v0, Lokhttp3/HttpUrl$Builder;->g:Ljava/util/ArrayList;

    .line 163
    .line 164
    const/4 v6, 0x1

    .line 165
    const/4 v7, 0x1

    .line 166
    const/4 v8, 0x1

    .line 167
    const/4 v9, 0x1

    .line 168
    const-string v5, "\\^`{|}"

    .line 169
    .line 170
    invoke-static/range {v4 .. v9}, Lokhttp3/HttpUrl;->b(Ljava/lang/String;Ljava/lang/String;ZZZZ)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-interface {v3, v2, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_5
    iget-object v3, v0, Lokhttp3/HttpUrl$Builder;->h:Ljava/lang/String;

    .line 181
    .line 182
    if-eqz v3, :cond_6

    .line 183
    .line 184
    const/4 v5, 0x1

    .line 185
    const/4 v6, 0x1

    .line 186
    const/4 v7, 0x0

    .line 187
    const/4 v8, 0x0

    .line 188
    const-string v4, " \"#<>\\^`{|}"

    .line 189
    .line 190
    invoke-static/range {v3 .. v8}, Lokhttp3/HttpUrl;->b(Ljava/lang/String;Ljava/lang/String;ZZZZ)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    iput-object v1, v0, Lokhttp3/HttpUrl$Builder;->h:Ljava/lang/String;

    .line 195
    .line 196
    :cond_6
    invoke-virtual {v0}, Lokhttp3/HttpUrl$Builder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    :try_start_0
    new-instance v1, Ljava/net/URI;

    .line 201
    .line 202
    invoke-direct {v1, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    .line 204
    .line 205
    return-object v1

    .line 206
    :catch_0
    move-exception v1

    .line 207
    :try_start_1
    const-string v2, "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]"

    .line 208
    .line 209
    const-string v3, ""

    .line 210
    .line 211
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-static {v0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    .line 216
    .line 217
    .line 218
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 219
    return-object v0

    .line 220
    :catch_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 221
    .line 222
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

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

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    return-object v0
.end method
