.class public final Lib/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:[C


# direct methods
.method public constructor <init>(Ljavax/security/auth/x500/X500Principal;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "RFC2253"

    invoke-virtual {p1, v0}, Ljavax/security/auth/x500/X500Principal;->getName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lib/c;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iput p1, p0, Lib/c;->b:I

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 9

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    iget v1, p0, Lib/c;->b:I

    .line 4
    .line 5
    const-string v2, "Malformed DN: "

    .line 6
    .line 7
    if-ge v0, v1, :cond_6

    .line 8
    .line 9
    iget-object v1, p0, Lib/c;->g:[C

    .line 10
    .line 11
    aget-char p1, v1, p1

    .line 12
    .line 13
    const/16 v3, 0x46

    .line 14
    .line 15
    const/16 v4, 0x66

    .line 16
    .line 17
    const/16 v5, 0x41

    .line 18
    .line 19
    const/16 v6, 0x39

    .line 20
    .line 21
    const/16 v7, 0x61

    .line 22
    .line 23
    const/16 v8, 0x30

    .line 24
    .line 25
    if-lt p1, v8, :cond_0

    .line 26
    .line 27
    if-gt p1, v6, :cond_0

    .line 28
    .line 29
    sub-int/2addr p1, v8

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    if-lt p1, v7, :cond_1

    .line 32
    .line 33
    if-gt p1, v4, :cond_1

    .line 34
    .line 35
    add-int/lit8 p1, p1, -0x57

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    if-lt p1, v5, :cond_5

    .line 39
    .line 40
    if-gt p1, v3, :cond_5

    .line 41
    .line 42
    add-int/lit8 p1, p1, -0x37

    .line 43
    .line 44
    :goto_0
    aget-char v0, v1, v0

    .line 45
    .line 46
    if-lt v0, v8, :cond_2

    .line 47
    .line 48
    if-gt v0, v6, :cond_2

    .line 49
    .line 50
    sub-int/2addr v0, v8

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    if-lt v0, v7, :cond_3

    .line 53
    .line 54
    if-gt v0, v4, :cond_3

    .line 55
    .line 56
    add-int/lit8 v0, v0, -0x57

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    if-lt v0, v5, :cond_4

    .line 60
    .line 61
    if-gt v0, v3, :cond_4

    .line 62
    .line 63
    add-int/lit8 v0, v0, -0x37

    .line 64
    .line 65
    :goto_1
    shl-int/lit8 p1, p1, 0x4

    .line 66
    .line 67
    add-int/2addr p1, v0

    .line 68
    return p1

    .line 69
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    invoke-static {v2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object v1, p0, Lib/c;->a:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 89
    .line 90
    invoke-static {v2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget-object v1, p0, Lib/c;->a:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p1

    .line 107
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 108
    .line 109
    invoke-static {v2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iget-object v1, p0, Lib/c;->a:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p1
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

.method public final b()C
    .locals 9

    .line 1
    iget v0, p0, Lib/c;->c:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Lib/c;->c:I

    .line 6
    .line 7
    iget v2, p0, Lib/c;->b:I

    .line 8
    .line 9
    if-eq v0, v2, :cond_8

    .line 10
    .line 11
    iget-object v2, p0, Lib/c;->g:[C

    .line 12
    .line 13
    aget-char v2, v2, v0

    .line 14
    .line 15
    const/16 v3, 0x20

    .line 16
    .line 17
    if-eq v2, v3, :cond_7

    .line 18
    .line 19
    const/16 v3, 0x25

    .line 20
    .line 21
    if-eq v2, v3, :cond_7

    .line 22
    .line 23
    const/16 v3, 0x5c

    .line 24
    .line 25
    if-eq v2, v3, :cond_7

    .line 26
    .line 27
    const/16 v4, 0x5f

    .line 28
    .line 29
    if-eq v2, v4, :cond_7

    .line 30
    .line 31
    const/16 v4, 0x22

    .line 32
    .line 33
    if-eq v2, v4, :cond_7

    .line 34
    .line 35
    const/16 v4, 0x23

    .line 36
    .line 37
    if-eq v2, v4, :cond_7

    .line 38
    .line 39
    packed-switch v2, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    packed-switch v2, :pswitch_data_1

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lib/c;->a(I)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget v2, p0, Lib/c;->c:I

    .line 50
    .line 51
    add-int/2addr v2, v1

    .line 52
    iput v2, p0, Lib/c;->c:I

    .line 53
    .line 54
    const/16 v2, 0x80

    .line 55
    .line 56
    const/16 v4, 0x3f

    .line 57
    .line 58
    if-ge v0, v2, :cond_0

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_0
    const/16 v5, 0xc0

    .line 62
    .line 63
    if-lt v0, v5, :cond_6

    .line 64
    .line 65
    const/16 v5, 0xf7

    .line 66
    .line 67
    if-gt v0, v5, :cond_6

    .line 68
    .line 69
    const/16 v5, 0xdf

    .line 70
    .line 71
    if-gt v0, v5, :cond_1

    .line 72
    .line 73
    and-int/lit8 v0, v0, 0x1f

    .line 74
    .line 75
    move v5, v1

    .line 76
    goto :goto_0

    .line 77
    :cond_1
    const/16 v5, 0xef

    .line 78
    .line 79
    if-gt v0, v5, :cond_2

    .line 80
    .line 81
    const/4 v5, 0x2

    .line 82
    and-int/lit8 v0, v0, 0xf

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    const/4 v5, 0x3

    .line 86
    and-int/lit8 v0, v0, 0x7

    .line 87
    .line 88
    :goto_0
    const/4 v6, 0x0

    .line 89
    :goto_1
    if-ge v6, v5, :cond_5

    .line 90
    .line 91
    iget v7, p0, Lib/c;->c:I

    .line 92
    .line 93
    add-int/2addr v7, v1

    .line 94
    iput v7, p0, Lib/c;->c:I

    .line 95
    .line 96
    iget v8, p0, Lib/c;->b:I

    .line 97
    .line 98
    if-eq v7, v8, :cond_6

    .line 99
    .line 100
    iget-object v8, p0, Lib/c;->g:[C

    .line 101
    .line 102
    aget-char v8, v8, v7

    .line 103
    .line 104
    if-eq v8, v3, :cond_3

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 108
    .line 109
    iput v7, p0, Lib/c;->c:I

    .line 110
    .line 111
    invoke-virtual {p0, v7}, Lib/c;->a(I)I

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    iget v8, p0, Lib/c;->c:I

    .line 116
    .line 117
    add-int/2addr v8, v1

    .line 118
    iput v8, p0, Lib/c;->c:I

    .line 119
    .line 120
    and-int/lit16 v8, v7, 0xc0

    .line 121
    .line 122
    if-eq v8, v2, :cond_4

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_4
    shl-int/lit8 v0, v0, 0x6

    .line 126
    .line 127
    and-int/lit8 v7, v7, 0x3f

    .line 128
    .line 129
    add-int/2addr v0, v7

    .line 130
    add-int/lit8 v6, v6, 0x1

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_5
    :goto_2
    int-to-char v4, v0

    .line 134
    :cond_6
    :goto_3
    return v4

    .line 135
    :cond_7
    :pswitch_0
    return v2

    .line 136
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 137
    .line 138
    const-string v1, "Unexpected end of DN: "

    .line 139
    .line 140
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    iget-object v2, p0, Lib/c;->a:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw v0

    .line 157
    :pswitch_data_0
    .packed-switch 0x2a
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x3b
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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

.method public final c()Ljava/lang/String;
    .locals 6

    .line 1
    :goto_0
    iget v0, p0, Lib/c;->c:I

    .line 2
    .line 3
    iget v1, p0, Lib/c;->b:I

    .line 4
    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    iget-object v3, p0, Lib/c;->g:[C

    .line 10
    .line 11
    aget-char v3, v3, v0

    .line 12
    .line 13
    if-ne v3, v2, :cond_0

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    iput v0, p0, Lib/c;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-ne v0, v1, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    return-object v0

    .line 24
    :cond_1
    iput v0, p0, Lib/c;->d:I

    .line 25
    .line 26
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    iput v0, p0, Lib/c;->c:I

    .line 29
    .line 30
    iget v0, p0, Lib/c;->c:I

    .line 31
    .line 32
    iget v1, p0, Lib/c;->b:I

    .line 33
    .line 34
    const/16 v3, 0x3d

    .line 35
    .line 36
    if-ge v0, v1, :cond_2

    .line 37
    .line 38
    iget-object v4, p0, Lib/c;->g:[C

    .line 39
    .line 40
    aget-char v4, v4, v0

    .line 41
    .line 42
    if-eq v4, v3, :cond_2

    .line 43
    .line 44
    if-eq v4, v2, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const-string v4, "Unexpected end of DN: "

    .line 48
    .line 49
    if-ge v0, v1, :cond_b

    .line 50
    .line 51
    iput v0, p0, Lib/c;->e:I

    .line 52
    .line 53
    iget-object v1, p0, Lib/c;->g:[C

    .line 54
    .line 55
    aget-char v0, v1, v0

    .line 56
    .line 57
    if-ne v0, v2, :cond_5

    .line 58
    .line 59
    :goto_2
    iget v0, p0, Lib/c;->c:I

    .line 60
    .line 61
    iget v1, p0, Lib/c;->b:I

    .line 62
    .line 63
    if-ge v0, v1, :cond_3

    .line 64
    .line 65
    iget-object v5, p0, Lib/c;->g:[C

    .line 66
    .line 67
    aget-char v5, v5, v0

    .line 68
    .line 69
    if-eq v5, v3, :cond_3

    .line 70
    .line 71
    if-ne v5, v2, :cond_3

    .line 72
    .line 73
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    iput v0, p0, Lib/c;->c:I

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    iget-object v5, p0, Lib/c;->g:[C

    .line 79
    .line 80
    aget-char v5, v5, v0

    .line 81
    .line 82
    if-ne v5, v3, :cond_4

    .line 83
    .line 84
    if-eq v0, v1, :cond_4

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    invoke-static {v4}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    iget-object v2, p0, Lib/c;->a:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v0

    .line 106
    :cond_5
    :goto_3
    iget v0, p0, Lib/c;->c:I

    .line 107
    .line 108
    :goto_4
    add-int/lit8 v0, v0, 0x1

    .line 109
    .line 110
    iput v0, p0, Lib/c;->c:I

    .line 111
    .line 112
    iget v0, p0, Lib/c;->c:I

    .line 113
    .line 114
    iget v1, p0, Lib/c;->b:I

    .line 115
    .line 116
    if-ge v0, v1, :cond_6

    .line 117
    .line 118
    iget-object v1, p0, Lib/c;->g:[C

    .line 119
    .line 120
    aget-char v1, v1, v0

    .line 121
    .line 122
    if-ne v1, v2, :cond_6

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_6
    iget v0, p0, Lib/c;->e:I

    .line 126
    .line 127
    iget v1, p0, Lib/c;->d:I

    .line 128
    .line 129
    sub-int v2, v0, v1

    .line 130
    .line 131
    const/4 v3, 0x4

    .line 132
    if-le v2, v3, :cond_a

    .line 133
    .line 134
    iget-object v2, p0, Lib/c;->g:[C

    .line 135
    .line 136
    add-int/lit8 v4, v1, 0x3

    .line 137
    .line 138
    aget-char v4, v2, v4

    .line 139
    .line 140
    const/16 v5, 0x2e

    .line 141
    .line 142
    if-ne v4, v5, :cond_a

    .line 143
    .line 144
    aget-char v4, v2, v1

    .line 145
    .line 146
    const/16 v5, 0x4f

    .line 147
    .line 148
    if-eq v4, v5, :cond_7

    .line 149
    .line 150
    const/16 v5, 0x6f

    .line 151
    .line 152
    if-ne v4, v5, :cond_a

    .line 153
    .line 154
    :cond_7
    add-int/lit8 v4, v1, 0x1

    .line 155
    .line 156
    aget-char v4, v2, v4

    .line 157
    .line 158
    const/16 v5, 0x49

    .line 159
    .line 160
    if-eq v4, v5, :cond_8

    .line 161
    .line 162
    add-int/lit8 v4, v1, 0x1

    .line 163
    .line 164
    aget-char v4, v2, v4

    .line 165
    .line 166
    const/16 v5, 0x69

    .line 167
    .line 168
    if-ne v4, v5, :cond_a

    .line 169
    .line 170
    :cond_8
    add-int/lit8 v4, v1, 0x2

    .line 171
    .line 172
    aget-char v4, v2, v4

    .line 173
    .line 174
    const/16 v5, 0x44

    .line 175
    .line 176
    if-eq v4, v5, :cond_9

    .line 177
    .line 178
    add-int/lit8 v4, v1, 0x2

    .line 179
    .line 180
    aget-char v2, v2, v4

    .line 181
    .line 182
    const/16 v4, 0x64

    .line 183
    .line 184
    if-ne v2, v4, :cond_a

    .line 185
    .line 186
    :cond_9
    add-int/2addr v1, v3

    .line 187
    iput v1, p0, Lib/c;->d:I

    .line 188
    .line 189
    :cond_a
    new-instance v1, Ljava/lang/String;

    .line 190
    .line 191
    iget-object v2, p0, Lib/c;->g:[C

    .line 192
    .line 193
    iget v3, p0, Lib/c;->d:I

    .line 194
    .line 195
    sub-int/2addr v0, v3

    .line 196
    invoke-direct {v1, v2, v3, v0}, Ljava/lang/String;-><init>([CII)V

    .line 197
    .line 198
    .line 199
    return-object v1

    .line 200
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 201
    .line 202
    invoke-static {v4}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    iget-object v2, p0, Lib/c;->a:Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    throw v0
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
