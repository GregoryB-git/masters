.class public abstract Lo2/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo2/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<B:",
        "Lo2/q$a<",
        "TB;*>;W:",
        "Lo2/q;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Z

.field public b:Ljava/util/UUID;

.field public c:Lx2/s;

.field public final d:Ljava/util/LinkedHashSet;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/d;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "randomUUID()"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, v0, Lo2/q$a;->b:Ljava/util/UUID;

    .line 16
    .line 17
    new-instance v1, Lx2/s;

    .line 18
    .line 19
    move-object v3, v1

    .line 20
    iget-object v2, v0, Lo2/q$a;->b:Ljava/util/UUID;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    move-object v4, v2

    .line 27
    const-string v5, "id.toString()"

    .line 28
    .line 29
    invoke-static {v2, v5}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v9, 0x0

    .line 40
    const-wide/16 v10, 0x0

    .line 41
    .line 42
    const-wide/16 v12, 0x0

    .line 43
    .line 44
    const-wide/16 v14, 0x0

    .line 45
    .line 46
    const/16 v16, 0x0

    .line 47
    .line 48
    const/16 v17, 0x0

    .line 49
    .line 50
    const/16 v18, 0x0

    .line 51
    .line 52
    const-wide/16 v19, 0x0

    .line 53
    .line 54
    const-wide/16 v21, 0x0

    .line 55
    .line 56
    const-wide/16 v23, 0x0

    .line 57
    .line 58
    const-wide/16 v25, 0x0

    .line 59
    .line 60
    const/16 v27, 0x0

    .line 61
    .line 62
    const/16 v28, 0x0

    .line 63
    .line 64
    const/16 v29, 0x0

    .line 65
    .line 66
    const-wide/16 v30, 0x0

    .line 67
    .line 68
    const/16 v32, 0x0

    .line 69
    .line 70
    const/16 v33, 0x0

    .line 71
    .line 72
    const v34, 0x7ffffa

    .line 73
    .line 74
    .line 75
    invoke-direct/range {v3 .. v34}, Lx2/s;-><init>(Ljava/lang/String;Lo2/o$b;Ljava/lang/String;Ljava/lang/String;Landroidx/work/c;Landroidx/work/c;JJJLo2/c;IIJJJJZIIJIII)V

    .line 76
    .line 77
    .line 78
    iput-object v1, v0, Lo2/q$a;->c:Lx2/s;

    .line 79
    .line 80
    const/4 v1, 0x1

    .line 81
    new-array v2, v1, [Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    const/4 v4, 0x0

    .line 88
    aput-object v3, v2, v4

    .line 89
    .line 90
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 91
    .line 92
    invoke-static {v1}, Lsb/y;->H0(I)I

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    invoke-direct {v3, v5}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 97
    .line 98
    .line 99
    :goto_0
    if-ge v4, v1, :cond_0

    .line 100
    .line 101
    aget-object v5, v2, v4

    .line 102
    .line 103
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    add-int/lit8 v4, v4, 0x1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_0
    iput-object v3, v0, Lo2/q$a;->d:Ljava/util/LinkedHashSet;

    .line 110
    .line 111
    return-void
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


# virtual methods
.method public final a()Lo2/q;
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TW;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Lo2/q$a;->b()Lo2/l;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v0, Lo2/q$a;->c:Lx2/s;

    .line 8
    .line 9
    iget-object v2, v2, Lx2/s;->j:Lo2/c;

    .line 10
    .line 11
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x1

    .line 15
    const/16 v6, 0x18

    .line 16
    .line 17
    if-lt v3, v6, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2}, Lo2/c;->a()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_2

    .line 24
    .line 25
    :cond_0
    iget-boolean v3, v2, Lo2/c;->d:Z

    .line 26
    .line 27
    if-nez v3, :cond_2

    .line 28
    .line 29
    iget-boolean v3, v2, Lo2/c;->b:Z

    .line 30
    .line 31
    if-nez v3, :cond_2

    .line 32
    .line 33
    iget-boolean v2, v2, Lo2/c;->c:Z

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move v2, v4

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    :goto_0
    move v2, v5

    .line 41
    :goto_1
    iget-object v3, v0, Lo2/q$a;->c:Lx2/s;

    .line 42
    .line 43
    iget-boolean v6, v3, Lx2/s;->q:Z

    .line 44
    .line 45
    if-eqz v6, :cond_6

    .line 46
    .line 47
    xor-int/2addr v2, v5

    .line 48
    if-eqz v2, :cond_5

    .line 49
    .line 50
    iget-wide v2, v3, Lx2/s;->g:J

    .line 51
    .line 52
    const-wide/16 v6, 0x0

    .line 53
    .line 54
    cmp-long v2, v2, v6

    .line 55
    .line 56
    if-gtz v2, :cond_3

    .line 57
    .line 58
    move v4, v5

    .line 59
    :cond_3
    if-eqz v4, :cond_4

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 63
    .line 64
    const-string v2, "Expedited jobs cannot be delayed"

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v1

    .line 74
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 75
    .line 76
    const-string v2, "Expedited jobs only support network and storage constraints"

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v1

    .line 86
    :cond_6
    :goto_2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    const-string v3, "randomUUID()"

    .line 91
    .line 92
    invoke-static {v2, v3}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iput-object v2, v0, Lo2/q$a;->b:Ljava/util/UUID;

    .line 96
    .line 97
    new-instance v3, Lx2/s;

    .line 98
    .line 99
    move-object v4, v3

    .line 100
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    move-object v5, v2

    .line 105
    const-string v6, "id.toString()"

    .line 106
    .line 107
    invoke-static {v2, v6}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-object v2, v0, Lo2/q$a;->c:Lx2/s;

    .line 111
    .line 112
    const-string v6, "other"

    .line 113
    .line 114
    invoke-static {v2, v6}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iget-object v7, v2, Lx2/s;->c:Ljava/lang/String;

    .line 118
    .line 119
    iget-object v6, v2, Lx2/s;->b:Lo2/o$b;

    .line 120
    .line 121
    iget-object v8, v2, Lx2/s;->d:Ljava/lang/String;

    .line 122
    .line 123
    new-instance v10, Landroidx/work/c;

    .line 124
    .line 125
    move-object v9, v10

    .line 126
    iget-object v11, v2, Lx2/s;->e:Landroidx/work/c;

    .line 127
    .line 128
    invoke-direct {v10, v11}, Landroidx/work/c;-><init>(Landroidx/work/c;)V

    .line 129
    .line 130
    .line 131
    new-instance v11, Landroidx/work/c;

    .line 132
    .line 133
    move-object v10, v11

    .line 134
    iget-object v12, v2, Lx2/s;->f:Landroidx/work/c;

    .line 135
    .line 136
    invoke-direct {v11, v12}, Landroidx/work/c;-><init>(Landroidx/work/c;)V

    .line 137
    .line 138
    .line 139
    iget-wide v11, v2, Lx2/s;->g:J

    .line 140
    .line 141
    iget-wide v13, v2, Lx2/s;->h:J

    .line 142
    .line 143
    move-object/from16 v36, v1

    .line 144
    .line 145
    iget-wide v0, v2, Lx2/s;->i:J

    .line 146
    .line 147
    move-wide v15, v0

    .line 148
    new-instance v0, Lo2/c;

    .line 149
    .line 150
    move-object/from16 v17, v0

    .line 151
    .line 152
    iget-object v1, v2, Lx2/s;->j:Lo2/c;

    .line 153
    .line 154
    invoke-direct {v0, v1}, Lo2/c;-><init>(Lo2/c;)V

    .line 155
    .line 156
    .line 157
    iget v0, v2, Lx2/s;->k:I

    .line 158
    .line 159
    move/from16 v18, v0

    .line 160
    .line 161
    iget v0, v2, Lx2/s;->l:I

    .line 162
    .line 163
    move/from16 v19, v0

    .line 164
    .line 165
    iget-wide v0, v2, Lx2/s;->m:J

    .line 166
    .line 167
    move-wide/from16 v20, v0

    .line 168
    .line 169
    iget-wide v0, v2, Lx2/s;->n:J

    .line 170
    .line 171
    move-wide/from16 v22, v0

    .line 172
    .line 173
    iget-wide v0, v2, Lx2/s;->o:J

    .line 174
    .line 175
    move-wide/from16 v24, v0

    .line 176
    .line 177
    iget-wide v0, v2, Lx2/s;->p:J

    .line 178
    .line 179
    move-wide/from16 v26, v0

    .line 180
    .line 181
    iget-boolean v0, v2, Lx2/s;->q:Z

    .line 182
    .line 183
    move/from16 v28, v0

    .line 184
    .line 185
    iget v0, v2, Lx2/s;->r:I

    .line 186
    .line 187
    move/from16 v29, v0

    .line 188
    .line 189
    iget v0, v2, Lx2/s;->s:I

    .line 190
    .line 191
    move/from16 v30, v0

    .line 192
    .line 193
    iget-wide v0, v2, Lx2/s;->u:J

    .line 194
    .line 195
    move-wide/from16 v31, v0

    .line 196
    .line 197
    iget v0, v2, Lx2/s;->v:I

    .line 198
    .line 199
    move/from16 v33, v0

    .line 200
    .line 201
    iget v0, v2, Lx2/s;->w:I

    .line 202
    .line 203
    move/from16 v34, v0

    .line 204
    .line 205
    const/high16 v35, 0x80000

    .line 206
    .line 207
    invoke-direct/range {v4 .. v35}, Lx2/s;-><init>(Ljava/lang/String;Lo2/o$b;Ljava/lang/String;Ljava/lang/String;Landroidx/work/c;Landroidx/work/c;JJJLo2/c;IIJJJJZIIJIII)V

    .line 208
    .line 209
    .line 210
    move-object/from16 v0, p0

    .line 211
    .line 212
    iput-object v3, v0, Lo2/q$a;->c:Lx2/s;

    .line 213
    .line 214
    invoke-virtual/range {p0 .. p0}, Lo2/q$a;->c()Lo2/l$a;

    .line 215
    .line 216
    .line 217
    return-object v36
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

.method public abstract b()Lo2/l;
.end method

.method public abstract c()Lo2/l$a;
.end method
