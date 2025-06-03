.class public final Lv3/r1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv3/r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final A:Ljava/lang/Object;

.field public static final B:Lv3/o0;

.field public static final C:Ljava/lang/String;

.field public static final D:Ljava/lang/String;

.field public static final E:Ljava/lang/String;

.field public static final F:Ljava/lang/String;

.field public static final G:Ljava/lang/String;

.field public static final H:Ljava/lang/String;

.field public static final I:Ljava/lang/String;

.field public static final J:Ljava/lang/String;

.field public static final K:Ljava/lang/String;

.field public static final L:Ljava/lang/String;

.field public static final M:Ljava/lang/String;

.field public static final N:Ljava/lang/String;

.field public static final O:Ljava/lang/String;

.field public static final z:Ljava/lang/Object;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public c:Lv3/o0;

.field public d:Ljava/lang/Object;

.field public e:J

.field public f:J

.field public o:J

.field public p:Z

.field public q:Z

.field public r:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public s:Lv3/o0$e;

.field public t:Z

.field public u:J

.field public v:J

.field public w:I

.field public x:I

.field public y:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lv3/r1$c;->z:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lv3/r1$c;->A:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v0, Lv3/o0$a;

    .line 16
    .line 17
    invoke-direct {v0}, Lv3/o0$a;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v1, "com.google.android.exoplayer2.Timeline"

    .line 21
    .line 22
    iput-object v1, v0, Lv3/o0$a;->a:Ljava/lang/String;

    .line 23
    .line 24
    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 25
    .line 26
    iput-object v1, v0, Lv3/o0$a;->b:Landroid/net/Uri;

    .line 27
    .line 28
    invoke-virtual {v0}, Lv3/o0$a;->a()Lv3/o0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lv3/r1$c;->B:Lv3/o0;

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lv3/r1$c;->C:Ljava/lang/String;

    .line 40
    .line 41
    const/4 v0, 0x2

    .line 42
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lv3/r1$c;->D:Ljava/lang/String;

    .line 47
    .line 48
    const/4 v0, 0x3

    .line 49
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lv3/r1$c;->E:Ljava/lang/String;

    .line 54
    .line 55
    const/4 v0, 0x4

    .line 56
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sput-object v0, Lv3/r1$c;->F:Ljava/lang/String;

    .line 61
    .line 62
    const/4 v0, 0x5

    .line 63
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, Lv3/r1$c;->G:Ljava/lang/String;

    .line 68
    .line 69
    const/4 v0, 0x6

    .line 70
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sput-object v0, Lv3/r1$c;->H:Ljava/lang/String;

    .line 75
    .line 76
    const/4 v0, 0x7

    .line 77
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sput-object v0, Lv3/r1$c;->I:Ljava/lang/String;

    .line 82
    .line 83
    const/16 v0, 0x8

    .line 84
    .line 85
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, Lv3/r1$c;->J:Ljava/lang/String;

    .line 90
    .line 91
    const/16 v0, 0x9

    .line 92
    .line 93
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    sput-object v0, Lv3/r1$c;->K:Ljava/lang/String;

    .line 98
    .line 99
    const/16 v0, 0xa

    .line 100
    .line 101
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    sput-object v1, Lv3/r1$c;->L:Ljava/lang/String;

    .line 106
    .line 107
    const/16 v1, 0xb

    .line 108
    .line 109
    invoke-static {v1}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    sput-object v1, Lv3/r1$c;->M:Ljava/lang/String;

    .line 114
    .line 115
    const/16 v1, 0xc

    .line 116
    .line 117
    invoke-static {v1}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    sput-object v1, Lv3/r1$c;->N:Ljava/lang/String;

    .line 122
    .line 123
    const/16 v1, 0xd

    .line 124
    .line 125
    invoke-static {v1}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    sput-object v1, Lv3/r1$c;->O:Ljava/lang/String;

    .line 130
    .line 131
    new-instance v1, Lr3/j;

    .line 132
    .line 133
    invoke-direct {v1, v0}, Lr3/j;-><init>(I)V

    .line 134
    .line 135
    .line 136
    return-void
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

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lv3/r1$c;->z:Ljava/lang/Object;

    iput-object v0, p0, Lv3/r1$c;->a:Ljava/lang/Object;

    sget-object v0, Lv3/r1$c;->B:Lv3/o0;

    iput-object v0, p0, Lv3/r1$c;->c:Lv3/o0;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    iget-boolean v0, p0, Lv3/r1$c;->r:Z

    iget-object v1, p0, Lv3/r1$c;->s:Lv3/o0$e;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    if-ne v0, v1, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    invoke-static {v0}, Lx6/b;->H(Z)V

    iget-object v0, p0, Lv3/r1$c;->s:Lv3/o0$e;

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    move v2, v3

    :goto_2
    return v2
.end method

.method public final b(Ljava/lang/Object;Lv3/o0;Ljava/lang/Object;JJJZZLv3/o0$e;JJIIJ)V
    .locals 5

    move-object v0, p0

    move-object v1, p2

    move-object/from16 v2, p12

    move-object v3, p1

    iput-object v3, v0, Lv3/r1$c;->a:Ljava/lang/Object;

    if-eqz v1, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    sget-object v3, Lv3/r1$c;->B:Lv3/o0;

    :goto_0
    iput-object v3, v0, Lv3/r1$c;->c:Lv3/o0;

    if-eqz v1, :cond_1

    iget-object v1, v1, Lv3/o0;->b:Lv3/o0$g;

    if-eqz v1, :cond_1

    iget-object v1, v1, Lv3/o0$f;->g:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    iput-object v1, v0, Lv3/r1$c;->b:Ljava/lang/Object;

    move-object v1, p3

    iput-object v1, v0, Lv3/r1$c;->d:Ljava/lang/Object;

    move-wide v3, p4

    iput-wide v3, v0, Lv3/r1$c;->e:J

    move-wide v3, p6

    iput-wide v3, v0, Lv3/r1$c;->f:J

    move-wide v3, p8

    iput-wide v3, v0, Lv3/r1$c;->o:J

    move v1, p10

    iput-boolean v1, v0, Lv3/r1$c;->p:Z

    move/from16 v1, p11

    iput-boolean v1, v0, Lv3/r1$c;->q:Z

    const/4 v1, 0x0

    if-eqz v2, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    move v3, v1

    :goto_2
    iput-boolean v3, v0, Lv3/r1$c;->r:Z

    iput-object v2, v0, Lv3/r1$c;->s:Lv3/o0$e;

    move-wide/from16 v2, p13

    iput-wide v2, v0, Lv3/r1$c;->u:J

    move-wide/from16 v2, p15

    iput-wide v2, v0, Lv3/r1$c;->v:J

    move/from16 v2, p17

    iput v2, v0, Lv3/r1$c;->w:I

    move/from16 v2, p18

    iput v2, v0, Lv3/r1$c;->x:I

    move-wide/from16 v2, p19

    iput-wide v2, v0, Lv3/r1$c;->y:J

    iput-boolean v1, v0, Lv3/r1$c;->t:Z

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lv3/r1$c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_1

    :cond_1
    check-cast p1, Lv3/r1$c;

    iget-object v2, p0, Lv3/r1$c;->a:Ljava/lang/Object;

    iget-object v3, p1, Lv3/r1$c;->a:Ljava/lang/Object;

    invoke-static {v2, v3}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lv3/r1$c;->c:Lv3/o0;

    iget-object v3, p1, Lv3/r1$c;->c:Lv3/o0;

    invoke-static {v2, v3}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lv3/r1$c;->d:Ljava/lang/Object;

    iget-object v3, p1, Lv3/r1$c;->d:Ljava/lang/Object;

    invoke-static {v2, v3}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lv3/r1$c;->s:Lv3/o0$e;

    iget-object v3, p1, Lv3/r1$c;->s:Lv3/o0$e;

    invoke-static {v2, v3}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-wide v2, p0, Lv3/r1$c;->e:J

    iget-wide v4, p1, Lv3/r1$c;->e:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lv3/r1$c;->f:J

    iget-wide v4, p1, Lv3/r1$c;->f:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lv3/r1$c;->o:J

    iget-wide v4, p1, Lv3/r1$c;->o:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-boolean v2, p0, Lv3/r1$c;->p:Z

    iget-boolean v3, p1, Lv3/r1$c;->p:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lv3/r1$c;->q:Z

    iget-boolean v3, p1, Lv3/r1$c;->q:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lv3/r1$c;->t:Z

    iget-boolean v3, p1, Lv3/r1$c;->t:Z

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lv3/r1$c;->u:J

    iget-wide v4, p1, Lv3/r1$c;->u:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lv3/r1$c;->v:J

    iget-wide v4, p1, Lv3/r1$c;->v:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget v2, p0, Lv3/r1$c;->w:I

    iget v3, p1, Lv3/r1$c;->w:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lv3/r1$c;->x:I

    iget v3, p1, Lv3/r1$c;->x:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lv3/r1$c;->y:J

    iget-wide v4, p1, Lv3/r1$c;->y:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 6

    iget-object v0, p0, Lv3/r1$c;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0xd9

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lv3/r1$c;->c:Lv3/o0;

    invoke-virtual {v1}, Lv3/o0;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lv3/r1$c;->d:Ljava/lang/Object;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lv3/r1$c;->s:Lv3/o0$e;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lv3/o0$e;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lv3/r1$c;->e:J

    const/16 v0, 0x20

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lv3/r1$c;->f:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lv3/r1$c;->o:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v2, p0, Lv3/r1$c;->p:Z

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v2, p0, Lv3/r1$c;->q:Z

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v2, p0, Lv3/r1$c;->t:Z

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lv3/r1$c;->u:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lv3/r1$c;->v:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget v2, p0, Lv3/r1$c;->w:I

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget v2, p0, Lv3/r1$c;->x:I

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lv3/r1$c;->y:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v0, v2

    add-int/2addr v1, v0

    return v1
.end method
