.class public final Lt6/a$a;
.super Ln6/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        "O:",
        "Ljava/lang/Object;",
        ">",
        "Ln6/a;"
    }
.end annotation


# static fields
.field public static final CREATOR:Lt6/d;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Z

.field public final d:I

.field public final e:Z

.field public final f:Ljava/lang/String;

.field public final o:I

.field public final p:Ljava/lang/Class;

.field public final q:Ljava/lang/String;

.field public r:Lt6/h;

.field public final s:Lt6/a$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt6/d;

    invoke-direct {v0}, Lt6/d;-><init>()V

    sput-object v0, Lt6/a$a;->CREATOR:Lt6/d;

    return-void
.end method

.method public constructor <init>(IIZIZLjava/lang/String;ILjava/lang/String;Ls6/b;)V
    .locals 0

    invoke-direct {p0}, Ln6/a;-><init>()V

    iput p1, p0, Lt6/a$a;->a:I

    iput p2, p0, Lt6/a$a;->b:I

    iput-boolean p3, p0, Lt6/a$a;->c:Z

    iput p4, p0, Lt6/a$a;->d:I

    iput-boolean p5, p0, Lt6/a$a;->e:Z

    iput-object p6, p0, Lt6/a$a;->f:Ljava/lang/String;

    iput p7, p0, Lt6/a$a;->o:I

    const/4 p1, 0x0

    if-nez p8, :cond_0

    iput-object p1, p0, Lt6/a$a;->p:Ljava/lang/Class;

    iput-object p1, p0, Lt6/a$a;->q:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-class p2, Lt6/c;

    iput-object p2, p0, Lt6/a$a;->p:Ljava/lang/Class;

    iput-object p8, p0, Lt6/a$a;->q:Ljava/lang/String;

    :goto_0
    if-nez p9, :cond_1

    iput-object p1, p0, Lt6/a$a;->s:Lt6/a$b;

    return-void

    .line 1
    :cond_1
    iget-object p1, p9, Ls6/b;->b:Ls6/a;

    if-eqz p1, :cond_2

    .line 2
    iput-object p1, p0, Lt6/a$a;->s:Lt6/a$b;

    return-void

    .line 3
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "There was no converter wrapped in this ConverterWrapper."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(IZIZLjava/lang/String;ILjava/lang/Class;)V
    .locals 1

    invoke-direct {p0}, Ln6/a;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lt6/a$a;->a:I

    iput p1, p0, Lt6/a$a;->b:I

    iput-boolean p2, p0, Lt6/a$a;->c:Z

    iput p3, p0, Lt6/a$a;->d:I

    iput-boolean p4, p0, Lt6/a$a;->e:Z

    iput-object p5, p0, Lt6/a$a;->f:Ljava/lang/String;

    iput p6, p0, Lt6/a$a;->o:I

    iput-object p7, p0, Lt6/a$a;->p:Ljava/lang/Class;

    const/4 p1, 0x0

    if-nez p7, :cond_0

    move-object p2, p1

    goto :goto_0

    :cond_0
    invoke-virtual {p7}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Lt6/a$a;->q:Ljava/lang/String;

    iput-object p1, p0, Lt6/a$a;->s:Lt6/a$b;

    return-void
.end method

.method public static D(ILjava/lang/String;)Lt6/a$a;
    .locals 9

    new-instance v8, Lt6/a$a;

    const/4 v3, 0x7

    const/4 v2, 0x1

    const/4 v4, 0x1

    const/4 v7, 0x0

    move-object v0, v8

    move v1, v3

    move-object v5, p1

    move v6, p0

    invoke-direct/range {v0 .. v7}, Lt6/a$a;-><init>(IZIZLjava/lang/String;ILjava/lang/Class;)V

    return-object v8
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lm6/h$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lm6/h$a;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lt6/a$a;->a:I

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "versionCode"

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Lm6/h$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lt6/a$a;->b:I

    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "typeIn"

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lm6/h$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-boolean v1, p0, Lt6/a$a;->c:Z

    .line 29
    .line 30
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "typeInArray"

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Lm6/h$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget v1, p0, Lt6/a$a;->d:I

    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "typeOut"

    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, Lm6/h$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-boolean v1, p0, Lt6/a$a;->e:Z

    .line 51
    .line 52
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const-string v2, "typeOutArray"

    .line 57
    .line 58
    invoke-virtual {v0, v1, v2}, Lm6/h$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lt6/a$a;->f:Ljava/lang/String;

    .line 62
    .line 63
    const-string v2, "outputFieldName"

    .line 64
    .line 65
    invoke-virtual {v0, v1, v2}, Lm6/h$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget v1, p0, Lt6/a$a;->o:I

    .line 69
    .line 70
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const-string v2, "safeParcelFieldId"

    .line 75
    .line 76
    invoke-virtual {v0, v1, v2}, Lm6/h$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Lt6/a$a;->q:Ljava/lang/String;

    .line 80
    .line 81
    if-nez v1, :cond_0

    .line 82
    .line 83
    const/4 v1, 0x0

    .line 84
    :cond_0
    const-string v2, "concreteTypeName"

    .line 85
    .line 86
    invoke-virtual {v0, v1, v2}, Lm6/h$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, Lt6/a$a;->p:Ljava/lang/Class;

    .line 90
    .line 91
    if-eqz v1, :cond_1

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const-string v2, "concreteType.class"

    .line 98
    .line 99
    invoke-virtual {v0, v1, v2}, Lm6/h$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_1
    iget-object v1, p0, Lt6/a$a;->s:Lt6/a$b;

    .line 103
    .line 104
    if-eqz v1, :cond_2

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    const-string v2, "converterName"

    .line 115
    .line 116
    invoke-virtual {v0, v1, v2}, Lm6/h$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :cond_2
    invoke-virtual {v0}, Lm6/h$a;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    return-object v0
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

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    .line 1
    iget v0, p0, Lt6/a$a;->a:I

    .line 2
    .line 3
    const/16 v1, 0x4f45

    .line 4
    .line 5
    invoke-static {v1, p1}, Lb/z;->J(ILandroid/os/Parcel;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-static {p1, v2, v0}, Lb/z;->z(Landroid/os/Parcel;II)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    iget v2, p0, Lt6/a$a;->b:I

    .line 15
    .line 16
    invoke-static {p1, v0, v2}, Lb/z;->z(Landroid/os/Parcel;II)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    iget-boolean v2, p0, Lt6/a$a;->c:Z

    .line 21
    .line 22
    invoke-static {p1, v0, v2}, Lb/z;->t(Landroid/os/Parcel;IZ)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    iget v2, p0, Lt6/a$a;->d:I

    .line 27
    .line 28
    invoke-static {p1, v0, v2}, Lb/z;->z(Landroid/os/Parcel;II)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x5

    .line 32
    iget-boolean v2, p0, Lt6/a$a;->e:Z

    .line 33
    .line 34
    invoke-static {p1, v0, v2}, Lb/z;->t(Landroid/os/Parcel;IZ)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x6

    .line 38
    iget-object v2, p0, Lt6/a$a;->f:Ljava/lang/String;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-static {p1, v0, v2, v3}, Lb/z;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x7

    .line 45
    iget v2, p0, Lt6/a$a;->o:I

    .line 46
    .line 47
    invoke-static {p1, v0, v2}, Lb/z;->z(Landroid/os/Parcel;II)V

    .line 48
    .line 49
    .line 50
    const/16 v0, 0x8

    .line 51
    .line 52
    iget-object v2, p0, Lt6/a$a;->q:Ljava/lang/String;

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    if-nez v2, :cond_0

    .line 56
    .line 57
    move-object v2, v4

    .line 58
    :cond_0
    invoke-static {p1, v0, v2, v3}, Lb/z;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 59
    .line 60
    .line 61
    const/16 v0, 0x9

    .line 62
    .line 63
    iget-object v2, p0, Lt6/a$a;->s:Lt6/a$b;

    .line 64
    .line 65
    if-nez v2, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    instance-of v4, v2, Ls6/a;

    .line 69
    .line 70
    if-eqz v4, :cond_2

    .line 71
    .line 72
    new-instance v4, Ls6/b;

    .line 73
    .line 74
    check-cast v2, Ls6/a;

    .line 75
    .line 76
    invoke-direct {v4, v2}, Ls6/b;-><init>(Ls6/a;)V

    .line 77
    .line 78
    .line 79
    :goto_0
    invoke-static {p1, v0, v4, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 80
    .line 81
    .line 82
    invoke-static {v1, p1}, Lb/z;->L(ILandroid/os/Parcel;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 87
    .line 88
    const-string p2, "Unsupported safe parcelable field converter class."

    .line 89
    .line 90
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p1
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
