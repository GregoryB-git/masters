.class public final Lg9/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg9/r0$a;
    }
.end annotation


# instance fields
.field public final a:Lg9/f0;

.field public b:I

.field public c:Z

.field public d:Lj9/j;

.field public e:Lt8/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/e<",
            "Lj9/i;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lt8/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/e<",
            "Lj9/i;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lt8/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/e<",
            "Lj9/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg9/f0;Lt8/e;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg9/f0;",
            "Lt8/e<",
            "Lj9/i;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg9/r0;->a:Lg9/f0;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput v0, p0, Lg9/r0;->b:I

    .line 8
    .line 9
    invoke-virtual {p1}, Lg9/f0;->a()Lg9/f0$a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v1, Lo4/o;

    .line 14
    .line 15
    invoke-direct {v1, p1, v0}, Lo4/o;-><init>(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    new-instance p1, Lj9/j;

    .line 19
    .line 20
    sget-object v0, Lj9/h;->a:Lt8/b;

    .line 21
    .line 22
    new-instance v2, Lt8/e;

    .line 23
    .line 24
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-direct {v2, v3, v1}, Lt8/e;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p1, v0, v2}, Lj9/j;-><init>(Lt8/c;Lt8/e;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lg9/r0;->d:Lj9/j;

    .line 35
    .line 36
    iput-object p2, p0, Lg9/r0;->e:Lt8/e;

    .line 37
    .line 38
    sget-object p1, Lj9/i;->c:Lt8/e;

    .line 39
    .line 40
    iput-object p1, p0, Lg9/r0;->f:Lt8/e;

    .line 41
    .line 42
    iput-object p1, p0, Lg9/r0;->g:Lt8/e;

    .line 43
    .line 44
    return-void
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

.method public static b(Lg9/i;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lg9/i;->a:Lg9/i$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    const/4 v2, 0x3

    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    return v1

    .line 19
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    const-string v1, "Unknown change type: "

    .line 22
    .line 23
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object p0, p0, Lg9/i;->a:Lg9/i$a;

    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_1
    return v1

    .line 41
    :cond_2
    const/4 p0, 0x0

    .line 42
    return p0
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


# virtual methods
.method public final a(Lg9/r0$a;Lm9/k0;Z)Ld5/n;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-boolean v3, v1, Lg9/r0$a;->c:Z

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    xor-int/2addr v3, v4

    .line 11
    const/4 v5, 0x0

    .line 12
    new-array v6, v5, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v7, "Cannot apply changes that need a refill"

    .line 15
    .line 16
    invoke-static {v7, v3, v6}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v11, v0, Lg9/r0;->d:Lj9/j;

    .line 20
    .line 21
    iget-object v3, v1, Lg9/r0$a;->a:Lj9/j;

    .line 22
    .line 23
    iput-object v3, v0, Lg9/r0;->d:Lj9/j;

    .line 24
    .line 25
    iget-object v3, v1, Lg9/r0$a;->d:Lt8/e;

    .line 26
    .line 27
    iput-object v3, v0, Lg9/r0;->g:Lt8/e;

    .line 28
    .line 29
    iget-object v3, v1, Lg9/r0$a;->b:Lg9/j;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v12, Ljava/util/ArrayList;

    .line 35
    .line 36
    iget-object v3, v3, Lg9/j;->a:Ljava/util/TreeMap;

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-direct {v12, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 43
    .line 44
    .line 45
    new-instance v3, Lg9/q0;

    .line 46
    .line 47
    invoke-direct {v3, v0}, Lg9/q0;-><init>(Lg9/r0;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v12, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 51
    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    iget-object v3, v2, Lm9/k0;->c:Lt8/e;

    .line 56
    .line 57
    invoke-virtual {v3}, Lt8/e;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    :goto_0
    move-object v6, v3

    .line 62
    check-cast v6, Lt8/e$a;

    .line 63
    .line 64
    invoke-virtual {v6}, Lt8/e$a;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-eqz v7, :cond_0

    .line 69
    .line 70
    invoke-virtual {v6}, Lt8/e$a;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    check-cast v6, Lj9/i;

    .line 75
    .line 76
    iget-object v7, v0, Lg9/r0;->e:Lt8/e;

    .line 77
    .line 78
    invoke-virtual {v7, v6}, Lt8/e;->a(Ljava/lang/Object;)Lt8/e;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    iput-object v6, v0, Lg9/r0;->e:Lt8/e;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    iget-object v3, v2, Lm9/k0;->d:Lt8/e;

    .line 86
    .line 87
    invoke-virtual {v3}, Lt8/e;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    :goto_1
    move-object v6, v3

    .line 92
    check-cast v6, Lt8/e$a;

    .line 93
    .line 94
    invoke-virtual {v6}, Lt8/e$a;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-eqz v7, :cond_1

    .line 99
    .line 100
    invoke-virtual {v6}, Lt8/e$a;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    check-cast v6, Lj9/i;

    .line 105
    .line 106
    iget-object v7, v0, Lg9/r0;->e:Lt8/e;

    .line 107
    .line 108
    invoke-virtual {v7, v6}, Lt8/e;->contains(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    new-array v8, v4, [Ljava/lang/Object;

    .line 113
    .line 114
    aput-object v6, v8, v5

    .line 115
    .line 116
    const-string v6, "Modified document %s not found in view."

    .line 117
    .line 118
    invoke-static {v6, v7, v8}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_1
    iget-object v3, v2, Lm9/k0;->e:Lt8/e;

    .line 123
    .line 124
    invoke-virtual {v3}, Lt8/e;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    :goto_2
    move-object v6, v3

    .line 129
    check-cast v6, Lt8/e$a;

    .line 130
    .line 131
    invoke-virtual {v6}, Lt8/e$a;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    if-eqz v7, :cond_2

    .line 136
    .line 137
    invoke-virtual {v6}, Lt8/e$a;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    check-cast v6, Lj9/i;

    .line 142
    .line 143
    iget-object v7, v0, Lg9/r0;->e:Lt8/e;

    .line 144
    .line 145
    invoke-virtual {v7, v6}, Lt8/e;->i(Ljava/lang/Object;)Lt8/e;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    iput-object v6, v0, Lg9/r0;->e:Lt8/e;

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_2
    iget-boolean v3, v2, Lm9/k0;->b:Z

    .line 153
    .line 154
    iput-boolean v3, v0, Lg9/r0;->c:Z

    .line 155
    .line 156
    :cond_3
    if-eqz p3, :cond_4

    .line 157
    .line 158
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    goto/16 :goto_8

    .line 163
    .line 164
    :cond_4
    iget-boolean v3, v0, Lg9/r0;->c:Z

    .line 165
    .line 166
    if-nez v3, :cond_5

    .line 167
    .line 168
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    goto/16 :goto_8

    .line 173
    .line 174
    :cond_5
    iget-object v3, v0, Lg9/r0;->f:Lt8/e;

    .line 175
    .line 176
    sget-object v6, Lj9/i;->c:Lt8/e;

    .line 177
    .line 178
    iput-object v6, v0, Lg9/r0;->f:Lt8/e;

    .line 179
    .line 180
    iget-object v6, v0, Lg9/r0;->d:Lj9/j;

    .line 181
    .line 182
    invoke-virtual {v6}, Lj9/j;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    :cond_6
    :goto_3
    move-object v7, v6

    .line 187
    check-cast v7, Lt8/e$a;

    .line 188
    .line 189
    invoke-virtual {v7}, Lt8/e$a;->hasNext()Z

    .line 190
    .line 191
    .line 192
    move-result v8

    .line 193
    if-eqz v8, :cond_a

    .line 194
    .line 195
    invoke-virtual {v7}, Lt8/e$a;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    check-cast v7, Lj9/g;

    .line 200
    .line 201
    invoke-interface {v7}, Lj9/g;->getKey()Lj9/i;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    iget-object v9, v0, Lg9/r0;->e:Lt8/e;

    .line 206
    .line 207
    invoke-virtual {v9, v8}, Lt8/e;->contains(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v9

    .line 211
    if-eqz v9, :cond_7

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_7
    iget-object v9, v0, Lg9/r0;->d:Lj9/j;

    .line 215
    .line 216
    iget-object v9, v9, Lj9/j;->a:Lt8/c;

    .line 217
    .line 218
    invoke-virtual {v9, v8}, Lt8/c;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    check-cast v8, Lj9/g;

    .line 223
    .line 224
    if-nez v8, :cond_8

    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_8
    invoke-interface {v8}, Lj9/g;->d()Z

    .line 228
    .line 229
    .line 230
    move-result v8

    .line 231
    if-eqz v8, :cond_9

    .line 232
    .line 233
    :goto_4
    move v8, v5

    .line 234
    goto :goto_5

    .line 235
    :cond_9
    move v8, v4

    .line 236
    :goto_5
    if-eqz v8, :cond_6

    .line 237
    .line 238
    iget-object v8, v0, Lg9/r0;->f:Lt8/e;

    .line 239
    .line 240
    invoke-interface {v7}, Lj9/g;->getKey()Lj9/i;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    invoke-virtual {v8, v7}, Lt8/e;->a(Ljava/lang/Object;)Lt8/e;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    iput-object v7, v0, Lg9/r0;->f:Lt8/e;

    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_a
    new-instance v6, Ljava/util/ArrayList;

    .line 252
    .line 253
    invoke-virtual {v3}, Lt8/e;->size()I

    .line 254
    .line 255
    .line 256
    move-result v7

    .line 257
    iget-object v8, v0, Lg9/r0;->f:Lt8/e;

    .line 258
    .line 259
    invoke-virtual {v8}, Lt8/e;->size()I

    .line 260
    .line 261
    .line 262
    move-result v8

    .line 263
    add-int/2addr v8, v7

    .line 264
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v3}, Lt8/e;->iterator()Ljava/util/Iterator;

    .line 268
    .line 269
    .line 270
    move-result-object v7

    .line 271
    :cond_b
    :goto_6
    move-object v8, v7

    .line 272
    check-cast v8, Lt8/e$a;

    .line 273
    .line 274
    invoke-virtual {v8}, Lt8/e$a;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result v9

    .line 278
    if-eqz v9, :cond_c

    .line 279
    .line 280
    invoke-virtual {v8}, Lt8/e$a;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v8

    .line 284
    check-cast v8, Lj9/i;

    .line 285
    .line 286
    iget-object v9, v0, Lg9/r0;->f:Lt8/e;

    .line 287
    .line 288
    invoke-virtual {v9, v8}, Lt8/e;->contains(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v9

    .line 292
    if-nez v9, :cond_b

    .line 293
    .line 294
    new-instance v9, Lg9/z;

    .line 295
    .line 296
    sget-object v10, Lg9/z$a;->b:Lg9/z$a;

    .line 297
    .line 298
    invoke-direct {v9, v10, v8}, Lg9/z;-><init>(Lg9/z$a;Lj9/i;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    goto :goto_6

    .line 305
    :cond_c
    iget-object v7, v0, Lg9/r0;->f:Lt8/e;

    .line 306
    .line 307
    invoke-virtual {v7}, Lt8/e;->iterator()Ljava/util/Iterator;

    .line 308
    .line 309
    .line 310
    move-result-object v7

    .line 311
    :cond_d
    :goto_7
    move-object v8, v7

    .line 312
    check-cast v8, Lt8/e$a;

    .line 313
    .line 314
    invoke-virtual {v8}, Lt8/e$a;->hasNext()Z

    .line 315
    .line 316
    .line 317
    move-result v9

    .line 318
    if-eqz v9, :cond_e

    .line 319
    .line 320
    invoke-virtual {v8}, Lt8/e$a;->next()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v8

    .line 324
    check-cast v8, Lj9/i;

    .line 325
    .line 326
    invoke-virtual {v3, v8}, Lt8/e;->contains(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v9

    .line 330
    if-nez v9, :cond_d

    .line 331
    .line 332
    new-instance v9, Lg9/z;

    .line 333
    .line 334
    sget-object v10, Lg9/z$a;->a:Lg9/z$a;

    .line 335
    .line 336
    invoke-direct {v9, v10, v8}, Lg9/z;-><init>(Lg9/z$a;Lj9/i;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    goto :goto_7

    .line 343
    :cond_e
    move-object v3, v6

    .line 344
    :goto_8
    iget-object v6, v0, Lg9/r0;->f:Lt8/e;

    .line 345
    .line 346
    invoke-virtual {v6}, Lt8/e;->size()I

    .line 347
    .line 348
    .line 349
    move-result v6

    .line 350
    if-nez v6, :cond_f

    .line 351
    .line 352
    iget-boolean v6, v0, Lg9/r0;->c:Z

    .line 353
    .line 354
    if-eqz v6, :cond_f

    .line 355
    .line 356
    if-nez p3, :cond_f

    .line 357
    .line 358
    move v6, v4

    .line 359
    goto :goto_9

    .line 360
    :cond_f
    move v6, v5

    .line 361
    :goto_9
    const/4 v7, 0x2

    .line 362
    if-eqz v6, :cond_10

    .line 363
    .line 364
    const/4 v6, 0x3

    .line 365
    goto :goto_a

    .line 366
    :cond_10
    move v6, v7

    .line 367
    :goto_a
    iget v8, v0, Lg9/r0;->b:I

    .line 368
    .line 369
    if-eq v6, v8, :cond_11

    .line 370
    .line 371
    move v15, v4

    .line 372
    goto :goto_b

    .line 373
    :cond_11
    move v15, v5

    .line 374
    :goto_b
    iput v6, v0, Lg9/r0;->b:I

    .line 375
    .line 376
    const/4 v8, 0x0

    .line 377
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 378
    .line 379
    .line 380
    move-result v9

    .line 381
    if-nez v9, :cond_12

    .line 382
    .line 383
    if-eqz v15, :cond_16

    .line 384
    .line 385
    :cond_12
    if-ne v6, v7, :cond_13

    .line 386
    .line 387
    move v13, v4

    .line 388
    goto :goto_c

    .line 389
    :cond_13
    move v13, v5

    .line 390
    :goto_c
    if-nez v2, :cond_14

    .line 391
    .line 392
    goto :goto_d

    .line 393
    :cond_14
    iget-object v2, v2, Lm9/k0;->a:Lma/h;

    .line 394
    .line 395
    invoke-virtual {v2}, Lma/h;->isEmpty()Z

    .line 396
    .line 397
    .line 398
    move-result v2

    .line 399
    if-nez v2, :cond_15

    .line 400
    .line 401
    move/from16 v17, v4

    .line 402
    .line 403
    goto :goto_e

    .line 404
    :cond_15
    :goto_d
    move/from16 v17, v5

    .line 405
    .line 406
    :goto_e
    new-instance v2, Lg9/s0;

    .line 407
    .line 408
    iget-object v9, v0, Lg9/r0;->a:Lg9/f0;

    .line 409
    .line 410
    iget-object v10, v1, Lg9/r0$a;->a:Lj9/j;

    .line 411
    .line 412
    iget-object v14, v1, Lg9/r0$a;->d:Lt8/e;

    .line 413
    .line 414
    const/16 v16, 0x0

    .line 415
    .line 416
    move-object v8, v2

    .line 417
    invoke-direct/range {v8 .. v17}, Lg9/s0;-><init>(Lg9/f0;Lj9/j;Lj9/j;Ljava/util/ArrayList;ZLt8/e;ZZZ)V

    .line 418
    .line 419
    .line 420
    :cond_16
    new-instance v1, Ld5/n;

    .line 421
    .line 422
    invoke-direct {v1, v7, v8, v3}, Ld5/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    return-object v1
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
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
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
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
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
.end method

.method public final c(Lt8/c;Lg9/r0$a;)Lg9/r0$a;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt8/c<",
            "Lj9/i;",
            "Lj9/g;",
            ">;",
            "Lg9/r0$a;",
            ")",
            "Lg9/r0$a;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    sget-object v2, Lg9/i$a;->a:Lg9/i$a;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v3, v1, Lg9/r0$a;->b:Lg9/j;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v3, Lg9/j;

    .line 13
    .line 14
    invoke-direct {v3}, Lg9/j;-><init>()V

    .line 15
    .line 16
    .line 17
    :goto_0
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object v4, v1, Lg9/r0$a;->a:Lj9/j;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    iget-object v4, v0, Lg9/r0;->d:Lj9/j;

    .line 23
    .line 24
    :goto_1
    if-eqz v1, :cond_2

    .line 25
    .line 26
    iget-object v5, v1, Lg9/r0$a;->d:Lt8/e;

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    iget-object v5, v0, Lg9/r0;->g:Lt8/e;

    .line 30
    .line 31
    :goto_2
    iget-object v6, v0, Lg9/r0;->a:Lg9/f0;

    .line 32
    .line 33
    iget v6, v6, Lg9/f0;->i:I

    .line 34
    .line 35
    const/4 v7, 0x1

    .line 36
    invoke-static {v6, v7}, Lq0/g;->b(II)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_3

    .line 41
    .line 42
    invoke-virtual {v4}, Lj9/j;->size()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    int-to-long v9, v6

    .line 47
    iget-object v6, v0, Lg9/r0;->a:Lg9/f0;

    .line 48
    .line 49
    iget-wide v11, v6, Lg9/f0;->h:J

    .line 50
    .line 51
    cmp-long v6, v9, v11

    .line 52
    .line 53
    if-nez v6, :cond_3

    .line 54
    .line 55
    iget-object v6, v4, Lj9/j;->b:Lt8/e;

    .line 56
    .line 57
    iget-object v6, v6, Lt8/e;->a:Lt8/c;

    .line 58
    .line 59
    invoke-virtual {v6}, Lt8/c;->k()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    check-cast v6, Lj9/g;

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    const/4 v6, 0x0

    .line 67
    :goto_3
    iget-object v9, v0, Lg9/r0;->a:Lg9/f0;

    .line 68
    .line 69
    iget v9, v9, Lg9/f0;->i:I

    .line 70
    .line 71
    const/4 v10, 0x2

    .line 72
    invoke-static {v9, v10}, Lq0/g;->b(II)Z

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    if-eqz v9, :cond_4

    .line 77
    .line 78
    invoke-virtual {v4}, Lj9/j;->size()I

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    int-to-long v9, v9

    .line 83
    iget-object v11, v0, Lg9/r0;->a:Lg9/f0;

    .line 84
    .line 85
    iget-wide v11, v11, Lg9/f0;->h:J

    .line 86
    .line 87
    cmp-long v9, v9, v11

    .line 88
    .line 89
    if-nez v9, :cond_4

    .line 90
    .line 91
    iget-object v9, v4, Lj9/j;->b:Lt8/e;

    .line 92
    .line 93
    iget-object v9, v9, Lt8/e;->a:Lt8/c;

    .line 94
    .line 95
    invoke-virtual {v9}, Lt8/c;->l()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    check-cast v9, Lj9/g;

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_4
    const/4 v9, 0x0

    .line 103
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lt8/c;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    move-object v12, v4

    .line 108
    const/4 v13, 0x0

    .line 109
    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v14

    .line 113
    if-eqz v14, :cond_15

    .line 114
    .line 115
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v14

    .line 119
    check-cast v14, Ljava/util/Map$Entry;

    .line 120
    .line 121
    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v15

    .line 125
    check-cast v15, Lj9/i;

    .line 126
    .line 127
    iget-object v8, v4, Lj9/j;->a:Lt8/c;

    .line 128
    .line 129
    invoke-virtual {v8, v15}, Lt8/c;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    check-cast v8, Lj9/g;

    .line 134
    .line 135
    iget-object v11, v0, Lg9/r0;->a:Lg9/f0;

    .line 136
    .line 137
    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v16

    .line 141
    move-object/from16 v7, v16

    .line 142
    .line 143
    check-cast v7, Lj9/g;

    .line 144
    .line 145
    invoke-virtual {v11, v7}, Lg9/f0;->g(Lj9/g;)Z

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    if-eqz v7, :cond_5

    .line 150
    .line 151
    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    check-cast v7, Lj9/g;

    .line 156
    .line 157
    goto :goto_6

    .line 158
    :cond_5
    const/4 v7, 0x0

    .line 159
    :goto_6
    if-eqz v8, :cond_6

    .line 160
    .line 161
    iget-object v11, v0, Lg9/r0;->g:Lt8/e;

    .line 162
    .line 163
    invoke-interface {v8}, Lj9/g;->getKey()Lj9/i;

    .line 164
    .line 165
    .line 166
    move-result-object v14

    .line 167
    invoke-virtual {v11, v14}, Lt8/e;->contains(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    if-eqz v11, :cond_6

    .line 172
    .line 173
    const/4 v11, 0x1

    .line 174
    goto :goto_7

    .line 175
    :cond_6
    const/4 v11, 0x0

    .line 176
    :goto_7
    if-eqz v7, :cond_8

    .line 177
    .line 178
    invoke-interface {v7}, Lj9/g;->d()Z

    .line 179
    .line 180
    .line 181
    move-result v14

    .line 182
    if-nez v14, :cond_7

    .line 183
    .line 184
    iget-object v14, v0, Lg9/r0;->g:Lt8/e;

    .line 185
    .line 186
    move-object/from16 v16, v4

    .line 187
    .line 188
    invoke-interface {v7}, Lj9/g;->getKey()Lj9/i;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-virtual {v14, v4}, Lt8/e;->contains(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    if-eqz v4, :cond_9

    .line 197
    .line 198
    invoke-interface {v7}, Lj9/g;->c()Z

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    if-eqz v4, :cond_9

    .line 203
    .line 204
    goto :goto_8

    .line 205
    :cond_7
    move-object/from16 v16, v4

    .line 206
    .line 207
    :goto_8
    const/4 v4, 0x1

    .line 208
    goto :goto_9

    .line 209
    :cond_8
    move-object/from16 v16, v4

    .line 210
    .line 211
    :cond_9
    const/4 v4, 0x0

    .line 212
    :goto_9
    if-eqz v8, :cond_d

    .line 213
    .line 214
    if-eqz v7, :cond_d

    .line 215
    .line 216
    invoke-interface {v8}, Lj9/g;->getData()Lj9/n;

    .line 217
    .line 218
    .line 219
    move-result-object v14

    .line 220
    move-object/from16 v17, v10

    .line 221
    .line 222
    invoke-interface {v7}, Lj9/g;->getData()Lj9/n;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    invoke-virtual {v14, v10}, Lj9/n;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v10

    .line 230
    if-nez v10, :cond_c

    .line 231
    .line 232
    invoke-interface {v8}, Lj9/g;->d()Z

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    if-eqz v4, :cond_a

    .line 237
    .line 238
    invoke-interface {v7}, Lj9/g;->c()Z

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    if-eqz v4, :cond_a

    .line 243
    .line 244
    invoke-interface {v7}, Lj9/g;->d()Z

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    if-nez v4, :cond_a

    .line 249
    .line 250
    const/4 v4, 0x1

    .line 251
    goto :goto_a

    .line 252
    :cond_a
    const/4 v4, 0x0

    .line 253
    :goto_a
    if-nez v4, :cond_11

    .line 254
    .line 255
    sget-object v4, Lg9/i$a;->c:Lg9/i$a;

    .line 256
    .line 257
    new-instance v8, Lg9/i;

    .line 258
    .line 259
    invoke-direct {v8, v4, v7}, Lg9/i;-><init>(Lg9/i$a;Lj9/g;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v3, v8}, Lg9/j;->a(Lg9/i;)V

    .line 263
    .line 264
    .line 265
    if-eqz v6, :cond_b

    .line 266
    .line 267
    iget-object v4, v0, Lg9/r0;->a:Lg9/f0;

    .line 268
    .line 269
    invoke-virtual {v4}, Lg9/f0;->a()Lg9/f0$a;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    invoke-virtual {v4, v7, v6}, Lg9/f0$a;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    if-gtz v4, :cond_10

    .line 278
    .line 279
    :cond_b
    if-eqz v9, :cond_e

    .line 280
    .line 281
    iget-object v4, v0, Lg9/r0;->a:Lg9/f0;

    .line 282
    .line 283
    invoke-virtual {v4}, Lg9/f0;->a()Lg9/f0$a;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    invoke-virtual {v4, v7, v9}, Lg9/f0$a;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    if-gez v4, :cond_e

    .line 292
    .line 293
    goto :goto_c

    .line 294
    :cond_c
    if-eq v11, v4, :cond_11

    .line 295
    .line 296
    sget-object v4, Lg9/i$a;->d:Lg9/i$a;

    .line 297
    .line 298
    new-instance v8, Lg9/i;

    .line 299
    .line 300
    invoke-direct {v8, v4, v7}, Lg9/i;-><init>(Lg9/i$a;Lj9/g;)V

    .line 301
    .line 302
    .line 303
    goto :goto_b

    .line 304
    :cond_d
    move-object/from16 v17, v10

    .line 305
    .line 306
    if-nez v8, :cond_f

    .line 307
    .line 308
    if-eqz v7, :cond_f

    .line 309
    .line 310
    sget-object v4, Lg9/i$a;->b:Lg9/i$a;

    .line 311
    .line 312
    new-instance v8, Lg9/i;

    .line 313
    .line 314
    invoke-direct {v8, v4, v7}, Lg9/i;-><init>(Lg9/i$a;Lj9/g;)V

    .line 315
    .line 316
    .line 317
    :goto_b
    invoke-virtual {v3, v8}, Lg9/j;->a(Lg9/i;)V

    .line 318
    .line 319
    .line 320
    :cond_e
    const/4 v4, 0x1

    .line 321
    goto :goto_d

    .line 322
    :cond_f
    if-eqz v8, :cond_11

    .line 323
    .line 324
    if-nez v7, :cond_11

    .line 325
    .line 326
    new-instance v4, Lg9/i;

    .line 327
    .line 328
    invoke-direct {v4, v2, v8}, Lg9/i;-><init>(Lg9/i$a;Lj9/g;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3, v4}, Lg9/j;->a(Lg9/i;)V

    .line 332
    .line 333
    .line 334
    if-nez v6, :cond_10

    .line 335
    .line 336
    if-eqz v9, :cond_e

    .line 337
    .line 338
    :cond_10
    :goto_c
    const/4 v4, 0x1

    .line 339
    const/4 v13, 0x1

    .line 340
    goto :goto_d

    .line 341
    :cond_11
    const/4 v4, 0x0

    .line 342
    :goto_d
    if-eqz v4, :cond_14

    .line 343
    .line 344
    if-eqz v7, :cond_13

    .line 345
    .line 346
    invoke-virtual {v12, v7}, Lj9/j;->a(Lj9/g;)Lj9/j;

    .line 347
    .line 348
    .line 349
    move-result-object v12

    .line 350
    invoke-interface {v7}, Lj9/g;->d()Z

    .line 351
    .line 352
    .line 353
    move-result v4

    .line 354
    if-eqz v4, :cond_12

    .line 355
    .line 356
    invoke-interface {v7}, Lj9/g;->getKey()Lj9/i;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    invoke-virtual {v5, v4}, Lt8/e;->a(Ljava/lang/Object;)Lt8/e;

    .line 361
    .line 362
    .line 363
    move-result-object v4

    .line 364
    goto :goto_e

    .line 365
    :cond_12
    invoke-interface {v7}, Lj9/g;->getKey()Lj9/i;

    .line 366
    .line 367
    .line 368
    move-result-object v4

    .line 369
    invoke-virtual {v5, v4}, Lt8/e;->i(Ljava/lang/Object;)Lt8/e;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    goto :goto_e

    .line 374
    :cond_13
    invoke-virtual {v12, v15}, Lj9/j;->h(Lj9/i;)Lj9/j;

    .line 375
    .line 376
    .line 377
    move-result-object v12

    .line 378
    invoke-virtual {v5, v15}, Lt8/e;->i(Ljava/lang/Object;)Lt8/e;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    :goto_e
    move-object v5, v4

    .line 383
    :cond_14
    move-object/from16 v4, v16

    .line 384
    .line 385
    move-object/from16 v10, v17

    .line 386
    .line 387
    const/4 v7, 0x1

    .line 388
    goto/16 :goto_5

    .line 389
    .line 390
    :cond_15
    iget-object v4, v0, Lg9/r0;->a:Lg9/f0;

    .line 391
    .line 392
    iget-wide v6, v4, Lg9/f0;->h:J

    .line 393
    .line 394
    const-wide/16 v8, -0x1

    .line 395
    .line 396
    cmp-long v4, v6, v8

    .line 397
    .line 398
    if-eqz v4, :cond_16

    .line 399
    .line 400
    const/4 v4, 0x1

    .line 401
    goto :goto_f

    .line 402
    :cond_16
    const/4 v4, 0x0

    .line 403
    :goto_f
    if-eqz v4, :cond_18

    .line 404
    .line 405
    invoke-virtual {v12}, Lj9/j;->size()I

    .line 406
    .line 407
    .line 408
    move-result v4

    .line 409
    int-to-long v6, v4

    .line 410
    iget-object v4, v0, Lg9/r0;->a:Lg9/f0;

    .line 411
    .line 412
    iget-wide v8, v4, Lg9/f0;->h:J

    .line 413
    .line 414
    sub-long/2addr v6, v8

    .line 415
    :goto_10
    const-wide/16 v8, 0x0

    .line 416
    .line 417
    cmp-long v4, v6, v8

    .line 418
    .line 419
    if-lez v4, :cond_18

    .line 420
    .line 421
    iget-object v4, v0, Lg9/r0;->a:Lg9/f0;

    .line 422
    .line 423
    iget v4, v4, Lg9/f0;->i:I

    .line 424
    .line 425
    const/4 v8, 0x1

    .line 426
    invoke-static {v4, v8}, Lq0/g;->b(II)Z

    .line 427
    .line 428
    .line 429
    move-result v4

    .line 430
    if-eqz v4, :cond_17

    .line 431
    .line 432
    iget-object v4, v12, Lj9/j;->b:Lt8/e;

    .line 433
    .line 434
    iget-object v4, v4, Lt8/e;->a:Lt8/c;

    .line 435
    .line 436
    invoke-virtual {v4}, Lt8/c;->k()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v4

    .line 440
    check-cast v4, Lj9/g;

    .line 441
    .line 442
    goto :goto_11

    .line 443
    :cond_17
    iget-object v4, v12, Lj9/j;->b:Lt8/e;

    .line 444
    .line 445
    iget-object v4, v4, Lt8/e;->a:Lt8/c;

    .line 446
    .line 447
    invoke-virtual {v4}, Lt8/c;->l()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v4

    .line 451
    check-cast v4, Lj9/g;

    .line 452
    .line 453
    :goto_11
    invoke-interface {v4}, Lj9/g;->getKey()Lj9/i;

    .line 454
    .line 455
    .line 456
    move-result-object v9

    .line 457
    invoke-virtual {v12, v9}, Lj9/j;->h(Lj9/i;)Lj9/j;

    .line 458
    .line 459
    .line 460
    move-result-object v12

    .line 461
    invoke-interface {v4}, Lj9/g;->getKey()Lj9/i;

    .line 462
    .line 463
    .line 464
    move-result-object v9

    .line 465
    invoke-virtual {v5, v9}, Lt8/e;->i(Ljava/lang/Object;)Lt8/e;

    .line 466
    .line 467
    .line 468
    move-result-object v5

    .line 469
    new-instance v9, Lg9/i;

    .line 470
    .line 471
    invoke-direct {v9, v2, v4}, Lg9/i;-><init>(Lg9/i$a;Lj9/g;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v3, v9}, Lg9/j;->a(Lg9/i;)V

    .line 475
    .line 476
    .line 477
    const-wide/16 v9, 0x1

    .line 478
    .line 479
    sub-long/2addr v6, v9

    .line 480
    goto :goto_10

    .line 481
    :cond_18
    const/4 v8, 0x1

    .line 482
    if-eqz v13, :cond_1a

    .line 483
    .line 484
    if-nez v1, :cond_19

    .line 485
    .line 486
    goto :goto_12

    .line 487
    :cond_19
    const/4 v1, 0x0

    .line 488
    const/4 v7, 0x0

    .line 489
    goto :goto_13

    .line 490
    :cond_1a
    :goto_12
    move v7, v8

    .line 491
    const/4 v1, 0x0

    .line 492
    :goto_13
    new-array v1, v1, [Ljava/lang/Object;

    .line 493
    .line 494
    const-string v2, "View was refilled using docs that themselves needed refilling."

    .line 495
    .line 496
    invoke-static {v2, v7, v1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    new-instance v1, Lg9/r0$a;

    .line 500
    .line 501
    invoke-direct {v1, v12, v3, v5, v13}, Lg9/r0$a;-><init>(Lj9/j;Lg9/j;Lt8/e;Z)V

    .line 502
    .line 503
    .line 504
    return-object v1
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
.end method
