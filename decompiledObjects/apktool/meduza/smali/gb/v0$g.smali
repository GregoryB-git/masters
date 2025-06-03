.class public final enum Lgb/v0$g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/v0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lgb/v0$g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lgb/v0$g;

.field public static final d:[Lgb/v0$g;

.field public static final synthetic e:[Lgb/v0$g;


# instance fields
.field public final a:I

.field public final b:Leb/e1;


# direct methods
.method public static constructor <clinit>()V
    .locals 17

    .line 1
    new-instance v0, Lgb/v0$g;

    .line 2
    .line 3
    sget-object v1, Leb/e1;->n:Leb/e1;

    .line 4
    .line 5
    const-string v2, "NO_ERROR"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v3, v1}, Lgb/v0$g;-><init>(Ljava/lang/String;IILeb/e1;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lgb/v0$g;

    .line 12
    .line 13
    sget-object v4, Leb/e1;->m:Leb/e1;

    .line 14
    .line 15
    const-string v5, "PROTOCOL_ERROR"

    .line 16
    .line 17
    const/4 v6, 0x1

    .line 18
    invoke-direct {v2, v5, v6, v6, v4}, Lgb/v0$g;-><init>(Ljava/lang/String;IILeb/e1;)V

    .line 19
    .line 20
    .line 21
    new-instance v5, Lgb/v0$g;

    .line 22
    .line 23
    const-string v7, "INTERNAL_ERROR"

    .line 24
    .line 25
    const/4 v8, 0x2

    .line 26
    invoke-direct {v5, v7, v8, v8, v4}, Lgb/v0$g;-><init>(Ljava/lang/String;IILeb/e1;)V

    .line 27
    .line 28
    .line 29
    sput-object v5, Lgb/v0$g;->c:Lgb/v0$g;

    .line 30
    .line 31
    new-instance v7, Lgb/v0$g;

    .line 32
    .line 33
    const-string v9, "FLOW_CONTROL_ERROR"

    .line 34
    .line 35
    const/4 v10, 0x3

    .line 36
    invoke-direct {v7, v9, v10, v10, v4}, Lgb/v0$g;-><init>(Ljava/lang/String;IILeb/e1;)V

    .line 37
    .line 38
    .line 39
    new-instance v9, Lgb/v0$g;

    .line 40
    .line 41
    const-string v11, "SETTINGS_TIMEOUT"

    .line 42
    .line 43
    const/4 v12, 0x4

    .line 44
    invoke-direct {v9, v11, v12, v12, v4}, Lgb/v0$g;-><init>(Ljava/lang/String;IILeb/e1;)V

    .line 45
    .line 46
    .line 47
    new-instance v11, Lgb/v0$g;

    .line 48
    .line 49
    const-string v13, "STREAM_CLOSED"

    .line 50
    .line 51
    const/4 v14, 0x5

    .line 52
    invoke-direct {v11, v13, v14, v14, v4}, Lgb/v0$g;-><init>(Ljava/lang/String;IILeb/e1;)V

    .line 53
    .line 54
    .line 55
    new-instance v13, Lgb/v0$g;

    .line 56
    .line 57
    const-string v15, "FRAME_SIZE_ERROR"

    .line 58
    .line 59
    const/4 v14, 0x6

    .line 60
    invoke-direct {v13, v15, v14, v14, v4}, Lgb/v0$g;-><init>(Ljava/lang/String;IILeb/e1;)V

    .line 61
    .line 62
    .line 63
    new-instance v15, Lgb/v0$g;

    .line 64
    .line 65
    const-string v14, "REFUSED_STREAM"

    .line 66
    .line 67
    const/4 v12, 0x7

    .line 68
    invoke-direct {v15, v14, v12, v12, v1}, Lgb/v0$g;-><init>(Ljava/lang/String;IILeb/e1;)V

    .line 69
    .line 70
    .line 71
    new-instance v1, Lgb/v0$g;

    .line 72
    .line 73
    sget-object v14, Leb/e1;->f:Leb/e1;

    .line 74
    .line 75
    const-string v12, "CANCEL"

    .line 76
    .line 77
    const/16 v10, 0x8

    .line 78
    .line 79
    invoke-direct {v1, v12, v10, v10, v14}, Lgb/v0$g;-><init>(Ljava/lang/String;IILeb/e1;)V

    .line 80
    .line 81
    .line 82
    new-instance v12, Lgb/v0$g;

    .line 83
    .line 84
    const-string v14, "COMPRESSION_ERROR"

    .line 85
    .line 86
    const/16 v10, 0x9

    .line 87
    .line 88
    invoke-direct {v12, v14, v10, v10, v4}, Lgb/v0$g;-><init>(Ljava/lang/String;IILeb/e1;)V

    .line 89
    .line 90
    .line 91
    new-instance v14, Lgb/v0$g;

    .line 92
    .line 93
    const-string v10, "CONNECT_ERROR"

    .line 94
    .line 95
    const/16 v8, 0xa

    .line 96
    .line 97
    invoke-direct {v14, v10, v8, v8, v4}, Lgb/v0$g;-><init>(Ljava/lang/String;IILeb/e1;)V

    .line 98
    .line 99
    .line 100
    new-instance v4, Lgb/v0$g;

    .line 101
    .line 102
    sget-object v10, Leb/e1;->k:Leb/e1;

    .line 103
    .line 104
    const-string v8, "Bandwidth exhausted"

    .line 105
    .line 106
    invoke-virtual {v10, v8}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    const-string v10, "ENHANCE_YOUR_CALM"

    .line 111
    .line 112
    const/16 v6, 0xb

    .line 113
    .line 114
    invoke-direct {v4, v10, v6, v6, v8}, Lgb/v0$g;-><init>(Ljava/lang/String;IILeb/e1;)V

    .line 115
    .line 116
    .line 117
    new-instance v8, Lgb/v0$g;

    .line 118
    .line 119
    sget-object v10, Leb/e1;->i:Leb/e1;

    .line 120
    .line 121
    const-string v6, "Permission denied as protocol is not secure enough to call"

    .line 122
    .line 123
    invoke-virtual {v10, v6}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    const-string v10, "INADEQUATE_SECURITY"

    .line 128
    .line 129
    const/16 v3, 0xc

    .line 130
    .line 131
    invoke-direct {v8, v10, v3, v3, v6}, Lgb/v0$g;-><init>(Ljava/lang/String;IILeb/e1;)V

    .line 132
    .line 133
    .line 134
    new-instance v6, Lgb/v0$g;

    .line 135
    .line 136
    sget-object v10, Leb/e1;->g:Leb/e1;

    .line 137
    .line 138
    const-string v3, "HTTP_1_1_REQUIRED"

    .line 139
    .line 140
    move-object/from16 v16, v8

    .line 141
    .line 142
    const/16 v8, 0xd

    .line 143
    .line 144
    invoke-direct {v6, v3, v8, v8, v10}, Lgb/v0$g;-><init>(Ljava/lang/String;IILeb/e1;)V

    .line 145
    .line 146
    .line 147
    const/16 v3, 0xe

    .line 148
    .line 149
    new-array v3, v3, [Lgb/v0$g;

    .line 150
    .line 151
    const/4 v10, 0x0

    .line 152
    aput-object v0, v3, v10

    .line 153
    .line 154
    const/4 v0, 0x1

    .line 155
    aput-object v2, v3, v0

    .line 156
    .line 157
    const/4 v0, 0x2

    .line 158
    aput-object v5, v3, v0

    .line 159
    .line 160
    const/4 v0, 0x3

    .line 161
    aput-object v7, v3, v0

    .line 162
    .line 163
    const/4 v0, 0x4

    .line 164
    aput-object v9, v3, v0

    .line 165
    .line 166
    const/4 v0, 0x5

    .line 167
    aput-object v11, v3, v0

    .line 168
    .line 169
    const/4 v0, 0x6

    .line 170
    aput-object v13, v3, v0

    .line 171
    .line 172
    const/4 v0, 0x7

    .line 173
    aput-object v15, v3, v0

    .line 174
    .line 175
    const/16 v0, 0x8

    .line 176
    .line 177
    aput-object v1, v3, v0

    .line 178
    .line 179
    const/16 v0, 0x9

    .line 180
    .line 181
    aput-object v12, v3, v0

    .line 182
    .line 183
    const/16 v0, 0xa

    .line 184
    .line 185
    aput-object v14, v3, v0

    .line 186
    .line 187
    const/16 v0, 0xb

    .line 188
    .line 189
    aput-object v4, v3, v0

    .line 190
    .line 191
    const/16 v0, 0xc

    .line 192
    .line 193
    aput-object v16, v3, v0

    .line 194
    .line 195
    aput-object v6, v3, v8

    .line 196
    .line 197
    sput-object v3, Lgb/v0$g;->e:[Lgb/v0$g;

    .line 198
    .line 199
    invoke-static {}, Lgb/v0$g;->values()[Lgb/v0$g;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    array-length v1, v0

    .line 204
    add-int/lit8 v1, v1, -0x1

    .line 205
    .line 206
    aget-object v1, v0, v1

    .line 207
    .line 208
    iget v1, v1, Lgb/v0$g;->a:I

    .line 209
    .line 210
    int-to-long v1, v1

    .line 211
    long-to-int v1, v1

    .line 212
    const/4 v2, 0x1

    .line 213
    add-int/2addr v1, v2

    .line 214
    new-array v1, v1, [Lgb/v0$g;

    .line 215
    .line 216
    array-length v2, v0

    .line 217
    move v3, v10

    .line 218
    :goto_0
    if-ge v3, v2, :cond_0

    .line 219
    .line 220
    aget-object v4, v0, v3

    .line 221
    .line 222
    iget v5, v4, Lgb/v0$g;->a:I

    .line 223
    .line 224
    int-to-long v5, v5

    .line 225
    long-to-int v5, v5

    .line 226
    aput-object v4, v1, v5

    .line 227
    .line 228
    add-int/lit8 v3, v3, 0x1

    .line 229
    .line 230
    goto :goto_0

    .line 231
    :cond_0
    sput-object v1, Lgb/v0$g;->d:[Lgb/v0$g;

    .line 232
    .line 233
    return-void
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

.method public constructor <init>(Ljava/lang/String;IILeb/e1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Leb/e1;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lgb/v0$g;->a:I

    .line 5
    .line 6
    const-string p1, "HTTP/2 error code: "

    .line 7
    .line 8
    invoke-static {p1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object p2, p4, Leb/e1;->b:Ljava/lang/String;

    .line 24
    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    const-string p2, " ("

    .line 28
    .line 29
    invoke-static {p1, p2}, Lg;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object p2, p4, Leb/e1;->b:Ljava/lang/String;

    .line 34
    .line 35
    const-string p3, ")"

    .line 36
    .line 37
    invoke-static {p1, p2, p3}, Lg;->f(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :cond_0
    invoke-virtual {p4, p1}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lgb/v0$g;->b:Leb/e1;

    .line 46
    .line 47
    return-void
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

.method public static valueOf(Ljava/lang/String;)Lgb/v0$g;
    .locals 1

    const-class v0, Lgb/v0$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgb/v0$g;

    return-object p0
.end method

.method public static values()[Lgb/v0$g;
    .locals 1

    sget-object v0, Lgb/v0$g;->e:[Lgb/v0$g;

    invoke-virtual {v0}, [Lgb/v0$g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgb/v0$g;

    return-object v0
.end method
