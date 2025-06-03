.class public final Lx2/s$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx2/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lo2/o$b;

.field public final c:Landroidx/work/c;

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:Lo2/c;

.field public final h:I

.field public i:I

.field public j:J

.field public k:J

.field public l:I

.field public final m:I

.field public final n:J

.field public final o:I

.field public final p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/work/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lo2/o$b;Landroidx/work/c;JJJLo2/c;IIJJIIJILjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 5

    move-object v0, p0

    move-object v1, p1

    move/from16 v2, p12

    const-string v3, "id"

    invoke-static {p1, v3}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "backoffPolicy"

    invoke-static {v2, v3}, La0/j;->p(ILjava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lx2/s$c;->a:Ljava/lang/String;

    move-object v1, p2

    iput-object v1, v0, Lx2/s$c;->b:Lo2/o$b;

    move-object v1, p3

    iput-object v1, v0, Lx2/s$c;->c:Landroidx/work/c;

    move-wide v3, p4

    iput-wide v3, v0, Lx2/s$c;->d:J

    move-wide v3, p6

    iput-wide v3, v0, Lx2/s$c;->e:J

    move-wide v3, p8

    iput-wide v3, v0, Lx2/s$c;->f:J

    move-object v1, p10

    iput-object v1, v0, Lx2/s$c;->g:Lo2/c;

    move/from16 v1, p11

    iput v1, v0, Lx2/s$c;->h:I

    iput v2, v0, Lx2/s$c;->i:I

    move-wide/from16 v1, p13

    iput-wide v1, v0, Lx2/s$c;->j:J

    move-wide/from16 v1, p15

    iput-wide v1, v0, Lx2/s$c;->k:J

    move/from16 v1, p17

    iput v1, v0, Lx2/s$c;->l:I

    move/from16 v1, p18

    iput v1, v0, Lx2/s$c;->m:I

    move-wide/from16 v1, p19

    iput-wide v1, v0, Lx2/s$c;->n:J

    move/from16 v1, p21

    iput v1, v0, Lx2/s$c;->o:I

    move-object/from16 v1, p22

    iput-object v1, v0, Lx2/s$c;->p:Ljava/util/List;

    move-object/from16 v1, p23

    iput-object v1, v0, Lx2/s$c;->q:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()Lo2/o;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lx2/s$c;->q:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    xor-int/2addr v1, v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v1, v0, Lx2/s$c;->q:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroidx/work/c;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object v1, Landroidx/work/c;->c:Landroidx/work/c;

    .line 24
    .line 25
    :goto_0
    move-object v9, v1

    .line 26
    new-instance v1, Lo2/o;

    .line 27
    .line 28
    iget-object v4, v0, Lx2/s$c;->a:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v4}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    const-string v4, "fromString(id)"

    .line 35
    .line 36
    invoke-static {v5, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v6, v0, Lx2/s$c;->b:Lo2/o$b;

    .line 40
    .line 41
    new-instance v7, Ljava/util/HashSet;

    .line 42
    .line 43
    iget-object v4, v0, Lx2/s$c;->p:Ljava/util/List;

    .line 44
    .line 45
    invoke-direct {v7, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 46
    .line 47
    .line 48
    iget-object v8, v0, Lx2/s$c;->c:Landroidx/work/c;

    .line 49
    .line 50
    const-string v4, "progress"

    .line 51
    .line 52
    invoke-static {v9, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget v4, v0, Lx2/s$c;->h:I

    .line 56
    .line 57
    iget v15, v0, Lx2/s$c;->m:I

    .line 58
    .line 59
    iget-object v13, v0, Lx2/s$c;->g:Lo2/c;

    .line 60
    .line 61
    iget-wide v11, v0, Lx2/s$c;->d:J

    .line 62
    .line 63
    iget-wide v2, v0, Lx2/s$c;->e:J

    .line 64
    .line 65
    const-wide/16 v16, 0x0

    .line 66
    .line 67
    cmp-long v16, v2, v16

    .line 68
    .line 69
    if-eqz v16, :cond_1

    .line 70
    .line 71
    new-instance v10, Lo2/o$a;

    .line 72
    .line 73
    move/from16 v18, v15

    .line 74
    .line 75
    iget-wide v14, v0, Lx2/s$c;->f:J

    .line 76
    .line 77
    invoke-direct {v10, v2, v3, v14, v15}, Lo2/o$a;-><init>(JJ)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    move/from16 v18, v15

    .line 82
    .line 83
    const/4 v10, 0x0

    .line 84
    :goto_1
    move-object/from16 v27, v10

    .line 85
    .line 86
    iget-object v10, v0, Lx2/s$c;->b:Lo2/o$b;

    .line 87
    .line 88
    sget-object v14, Lo2/o$b;->a:Lo2/o$b;

    .line 89
    .line 90
    if-ne v10, v14, :cond_4

    .line 91
    .line 92
    sget-object v15, Lx2/s;->x:Ljava/lang/String;

    .line 93
    .line 94
    if-ne v10, v14, :cond_2

    .line 95
    .line 96
    if-lez v4, :cond_2

    .line 97
    .line 98
    const/4 v10, 0x1

    .line 99
    goto :goto_2

    .line 100
    :cond_2
    const/4 v10, 0x0

    .line 101
    :goto_2
    iget v14, v0, Lx2/s$c;->i:I

    .line 102
    .line 103
    move-object/from16 v29, v8

    .line 104
    .line 105
    move-object/from16 v28, v9

    .line 106
    .line 107
    iget-wide v8, v0, Lx2/s$c;->j:J

    .line 108
    .line 109
    move-object/from16 v30, v6

    .line 110
    .line 111
    move-object/from16 v31, v7

    .line 112
    .line 113
    iget-wide v6, v0, Lx2/s$c;->k:J

    .line 114
    .line 115
    iget v15, v0, Lx2/s$c;->l:I

    .line 116
    .line 117
    if-eqz v16, :cond_3

    .line 118
    .line 119
    move-wide/from16 v16, v11

    .line 120
    .line 121
    const/16 v19, 0x1

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_3
    move-wide/from16 v16, v11

    .line 125
    .line 126
    const/16 v19, 0x0

    .line 127
    .line 128
    :goto_3
    iget-wide v11, v0, Lx2/s$c;->f:J

    .line 129
    .line 130
    move-wide/from16 v21, v11

    .line 131
    .line 132
    iget-wide v11, v0, Lx2/s$c;->n:J

    .line 133
    .line 134
    move-wide/from16 v25, v11

    .line 135
    .line 136
    move-wide/from16 v32, v16

    .line 137
    .line 138
    move v11, v4

    .line 139
    move v12, v14

    .line 140
    move-object/from16 v34, v13

    .line 141
    .line 142
    move-wide v13, v8

    .line 143
    move v8, v15

    .line 144
    move/from16 v35, v18

    .line 145
    .line 146
    move-wide v15, v6

    .line 147
    move/from16 v17, v8

    .line 148
    .line 149
    move/from16 v18, v19

    .line 150
    .line 151
    move-wide/from16 v19, v32

    .line 152
    .line 153
    move-wide/from16 v23, v2

    .line 154
    .line 155
    invoke-static/range {v10 .. v26}, Lx2/s$a;->a(ZIIJJIZJJJJ)J

    .line 156
    .line 157
    .line 158
    move-result-wide v2

    .line 159
    goto :goto_4

    .line 160
    :cond_4
    move-object/from16 v30, v6

    .line 161
    .line 162
    move-object/from16 v31, v7

    .line 163
    .line 164
    move-object/from16 v29, v8

    .line 165
    .line 166
    move-object/from16 v28, v9

    .line 167
    .line 168
    move-wide/from16 v32, v11

    .line 169
    .line 170
    move-object/from16 v34, v13

    .line 171
    .line 172
    move/from16 v35, v18

    .line 173
    .line 174
    const-wide v2, 0x7fffffffffffffffL

    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    :goto_4
    move-wide/from16 v16, v2

    .line 180
    .line 181
    iget v2, v0, Lx2/s$c;->o:I

    .line 182
    .line 183
    move v3, v4

    .line 184
    move-object v4, v1

    .line 185
    move-object/from16 v6, v30

    .line 186
    .line 187
    move-object/from16 v7, v31

    .line 188
    .line 189
    move-object/from16 v8, v29

    .line 190
    .line 191
    move-object/from16 v9, v28

    .line 192
    .line 193
    move v10, v3

    .line 194
    move/from16 v11, v35

    .line 195
    .line 196
    move-object/from16 v12, v34

    .line 197
    .line 198
    move-wide/from16 v13, v32

    .line 199
    .line 200
    move-object/from16 v15, v27

    .line 201
    .line 202
    move/from16 v18, v2

    .line 203
    .line 204
    invoke-direct/range {v4 .. v18}, Lo2/o;-><init>(Ljava/util/UUID;Lo2/o$b;Ljava/util/HashSet;Landroidx/work/c;Landroidx/work/c;IILo2/c;JLo2/o$a;JI)V

    .line 205
    .line 206
    .line 207
    return-object v1
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lx2/s$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lx2/s$c;

    iget-object v1, p0, Lx2/s$c;->a:Ljava/lang/String;

    iget-object v3, p1, Lx2/s$c;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lx2/s$c;->b:Lo2/o$b;

    iget-object v3, p1, Lx2/s$c;->b:Lo2/o$b;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lx2/s$c;->c:Landroidx/work/c;

    iget-object v3, p1, Lx2/s$c;->c:Landroidx/work/c;

    invoke-static {v1, v3}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lx2/s$c;->d:J

    iget-wide v5, p1, Lx2/s$c;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lx2/s$c;->e:J

    iget-wide v5, p1, Lx2/s$c;->e:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lx2/s$c;->f:J

    iget-wide v5, p1, Lx2/s$c;->f:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lx2/s$c;->g:Lo2/c;

    iget-object v3, p1, Lx2/s$c;->g:Lo2/c;

    invoke-static {v1, v3}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lx2/s$c;->h:I

    iget v3, p1, Lx2/s$c;->h:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lx2/s$c;->i:I

    iget v3, p1, Lx2/s$c;->i:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-wide v3, p0, Lx2/s$c;->j:J

    iget-wide v5, p1, Lx2/s$c;->j:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget-wide v3, p0, Lx2/s$c;->k:J

    iget-wide v5, p1, Lx2/s$c;->k:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lx2/s$c;->l:I

    iget v3, p1, Lx2/s$c;->l:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lx2/s$c;->m:I

    iget v3, p1, Lx2/s$c;->m:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-wide v3, p0, Lx2/s$c;->n:J

    iget-wide v5, p1, Lx2/s$c;->n:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lx2/s$c;->o:I

    iget v3, p1, Lx2/s$c;->o:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lx2/s$c;->p:Ljava/util/List;

    iget-object v3, p1, Lx2/s$c;->p:Ljava/util/List;

    invoke-static {v1, v3}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lx2/s$c;->q:Ljava/util/List;

    iget-object p1, p1, Lx2/s$c;->q:Ljava/util/List;

    invoke-static {v1, p1}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    return v2

    :cond_12
    return v0
.end method

.method public final hashCode()I
    .locals 6

    iget-object v0, p0, Lx2/s$c;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lx2/s$c;->b:Lo2/o$b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lx2/s$c;->c:Landroidx/work/c;

    invoke-virtual {v0}, Landroidx/work/c;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lx2/s$c;->d:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lx2/s$c;->e:J

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lx2/s$c;->f:J

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lx2/s$c;->g:Lo2/c;

    invoke-virtual {v1}, Lo2/c;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lx2/s$c;->h:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lx2/s$c;->i:I

    invoke-static {v0}, Lq0/g;->c(I)I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lx2/s$c;->j:J

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lx2/s$c;->k:J

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lx2/s$c;->l:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lx2/s$c;->m:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lx2/s$c;->n:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lx2/s$c;->o:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lx2/s$c;->p:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lx2/s$c;->q:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "WorkInfoPojo(id="

    .line 2
    .line 3
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lx2/s$c;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v1, ", state="

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lx2/s$c;->b:Lo2/o$b;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, ", output="

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lx2/s$c;->c:Landroidx/work/c;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, ", initialDelay="

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget-wide v1, p0, Lx2/s$c;->d:J

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", intervalDuration="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-wide v1, p0, Lx2/s$c;->e:J

    .line 48
    .line 49
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, ", flexDuration="

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-wide v1, p0, Lx2/s$c;->f:J

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, ", constraints="

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lx2/s$c;->g:Lo2/c;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v1, ", runAttemptCount="

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    iget v1, p0, Lx2/s$c;->h:I

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, ", backoffPolicy="

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget v1, p0, Lx2/s$c;->i:I

    .line 88
    .line 89
    invoke-static {v1}, Lf;->t(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v1, ", backoffDelayDuration="

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    iget-wide v1, p0, Lx2/s$c;->j:J

    .line 102
    .line 103
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v1, ", lastEnqueueTime="

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    iget-wide v1, p0, Lx2/s$c;->k:J

    .line 112
    .line 113
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v1, ", periodCount="

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    iget v1, p0, Lx2/s$c;->l:I

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v1, ", generation="

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    iget v1, p0, Lx2/s$c;->m:I

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string v1, ", nextScheduleTimeOverride="

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    iget-wide v1, p0, Lx2/s$c;->n:J

    .line 142
    .line 143
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v1, ", stopReason="

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    iget v1, p0, Lx2/s$c;->o:I

    .line 152
    .line 153
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const-string v1, ", tags="

    .line 157
    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    iget-object v1, p0, Lx2/s$c;->p:Ljava/util/List;

    .line 162
    .line 163
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v1, ", progress="

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    iget-object v1, p0, Lx2/s$c;->q:Ljava/util/List;

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const/16 v1, 0x29

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    return-object v0
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
