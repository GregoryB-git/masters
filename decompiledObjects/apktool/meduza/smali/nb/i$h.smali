.class public final Lnb/i$h;
.super Lnb/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnb/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnb/i$h$a;
    }
.end annotation


# instance fields
.field public final a:Leb/k0$i;

.field public b:Lnb/i$a;

.field public c:Z

.field public d:Leb/o;

.field public e:Leb/k0$k;

.field public final f:Leb/d;

.field public final synthetic g:Lnb/i;


# direct methods
.method public constructor <init>(Lnb/i;Leb/k0$b;Lnb/g;)V
    .locals 5

    .line 1
    iput-object p1, p0, Lnb/i$h;->g:Lnb/i;

    .line 2
    .line 3
    invoke-direct {p0}, Lnb/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object p1, Leb/k0;->b:Leb/a$b;

    .line 7
    .line 8
    invoke-virtual {p2}, Leb/k0$b;->a()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Leb/k0$k;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iput-object p1, p0, Lnb/i$h;->e:Leb/k0$k;

    .line 17
    .line 18
    new-instance v0, Lnb/i$h$a;

    .line 19
    .line 20
    invoke-direct {v0, p0, p1}, Lnb/i$h$a;-><init>(Lnb/i$h;Leb/k0$k;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, Leb/k0$b$a;

    .line 24
    .line 25
    invoke-direct {p1}, Leb/k0$b$a;-><init>()V

    .line 26
    .line 27
    .line 28
    iget-object v1, p2, Leb/k0$b;->a:Ljava/util/List;

    .line 29
    .line 30
    invoke-virtual {p1, v1}, Leb/k0$b$a;->b(Ljava/util/List;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p2, Leb/k0$b;->b:Leb/a;

    .line 34
    .line 35
    const-string v2, "attrs"

    .line 36
    .line 37
    invoke-static {v1, v2}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iput-object v1, p1, Leb/k0$b$a;->b:Leb/a;

    .line 41
    .line 42
    iget-object p2, p2, Leb/k0$b;->c:[[Ljava/lang/Object;

    .line 43
    .line 44
    array-length v1, p2

    .line 45
    const/4 v2, 0x2

    .line 46
    new-array v3, v2, [I

    .line 47
    .line 48
    const/4 v4, 0x1

    .line 49
    aput v2, v3, v4

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    aput v1, v3, v2

    .line 53
    .line 54
    const-class v1, Ljava/lang/Object;

    .line 55
    .line 56
    invoke-static {v1, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, [[Ljava/lang/Object;

    .line 61
    .line 62
    iput-object v1, p1, Leb/k0$b$a;->c:[[Ljava/lang/Object;

    .line 63
    .line 64
    array-length v3, p2

    .line 65
    invoke-static {p2, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v0}, Leb/k0$b$a;->a(Leb/k0$k;)V

    .line 69
    .line 70
    .line 71
    new-instance p2, Leb/k0$b;

    .line 72
    .line 73
    iget-object v0, p1, Leb/k0$b$a;->a:Ljava/util/List;

    .line 74
    .line 75
    iget-object v1, p1, Leb/k0$b$a;->b:Leb/a;

    .line 76
    .line 77
    iget-object p1, p1, Leb/k0$b$a;->c:[[Ljava/lang/Object;

    .line 78
    .line 79
    invoke-direct {p2, v0, v1, p1}, Leb/k0$b;-><init>(Ljava/util/List;Leb/a;[[Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_0
    invoke-virtual {p3, p2}, Lnb/g;->a(Leb/k0$b;)Leb/k0$i;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, p0, Lnb/i$h;->a:Leb/k0$i;

    .line 87
    .line 88
    invoke-virtual {p1}, Leb/k0$i;->d()Leb/d;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iput-object p1, p0, Lnb/i$h;->f:Leb/d;

    .line 93
    .line 94
    return-void
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


# virtual methods
.method public final c()Leb/a;
    .locals 5

    .line 1
    iget-object v0, p0, Lnb/i$h;->b:Lnb/i$a;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lnb/i$h;->a:Leb/k0$i;

    .line 6
    .line 7
    invoke-virtual {v0}, Leb/k0$i;->c()Leb/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v1, Lnb/i;->n:Leb/a$b;

    .line 15
    .line 16
    iget-object v2, p0, Lnb/i$h;->b:Lnb/i$a;

    .line 17
    .line 18
    new-instance v3, Ljava/util/IdentityHashMap;

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    invoke-direct {v3, v4}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v1, v2}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    iget-object v0, v0, Leb/a;->a:Ljava/util/IdentityHashMap;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->entrySet()Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Ljava/util/Map$Entry;

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v3, v2}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_0

    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Leb/a$b;

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v3, v2, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    new-instance v0, Leb/a;

    .line 74
    .line 75
    invoke-direct {v0, v3}, Leb/a;-><init>(Ljava/util/IdentityHashMap;)V

    .line 76
    .line 77
    .line 78
    return-object v0

    .line 79
    :cond_2
    iget-object v0, p0, Lnb/i$h;->a:Leb/k0$i;

    .line 80
    .line 81
    invoke-virtual {v0}, Leb/k0$i;->c()Leb/a;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0
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
.end method

.method public final g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lnb/i$h;->b:Lnb/i$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Lnb/i$h;->b:Lnb/i$a;

    .line 7
    .line 8
    iget-object v0, v0, Lnb/i$a;->f:Ljava/util/HashSet;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-super {p0}, Lnb/d;->g()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
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

.method public final h(Leb/k0$k;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnb/i$h;->e:Leb/k0$k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lnb/i$h;->j()Leb/k0$i;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Leb/k0$i;->h(Leb/k0$k;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iput-object p1, p0, Lnb/i$h;->e:Leb/k0$k;

    .line 14
    .line 15
    new-instance v0, Lnb/i$h$a;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1}, Lnb/i$h$a;-><init>(Lnb/i$h;Leb/k0$k;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lnb/i$h;->j()Leb/k0$i;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1, v0}, Leb/k0$i;->h(Leb/k0$k;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void
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
.end method

.method public final i(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Leb/u;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnb/d;->b()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lnb/i;->g(Ljava/util/List;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-static {p1}, Lnb/i;->g(Ljava/util/List;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lnb/i$h;->g:Lnb/i;

    .line 20
    .line 21
    iget-object v0, v0, Lnb/i;->f:Lnb/i$b;

    .line 22
    .line 23
    iget-object v3, p0, Lnb/i$h;->b:Lnb/i$a;

    .line 24
    .line 25
    invoke-virtual {v0, v3}, Lo7/p;->containsValue(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Lnb/i$h;->b:Lnb/i$a;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lnb/i$h;->b:Lnb/i$a;

    .line 37
    .line 38
    iget-object v0, v0, Lnb/i$a;->f:Ljava/util/HashSet;

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Leb/u;

    .line 48
    .line 49
    iget-object v0, v0, Leb/u;->a:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Ljava/net/SocketAddress;

    .line 56
    .line 57
    iget-object v1, p0, Lnb/i$h;->g:Lnb/i;

    .line 58
    .line 59
    iget-object v1, v1, Lnb/i;->f:Lnb/i$b;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Lo7/p;->containsKey(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_3

    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :cond_1
    invoke-virtual {p0}, Lnb/d;->b()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0}, Lnb/i;->g(Ljava/util/List;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    invoke-static {p1}, Lnb/i;->g(Ljava/util/List;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_2

    .line 84
    .line 85
    iget-object v0, p0, Lnb/i$h;->g:Lnb/i;

    .line 86
    .line 87
    iget-object v0, v0, Lnb/i;->f:Lnb/i$b;

    .line 88
    .line 89
    invoke-virtual {p0}, Leb/k0$i;->a()Leb/u;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    iget-object v3, v3, Leb/u;->a:Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v0, v3}, Lo7/p;->containsKey(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_3

    .line 104
    .line 105
    iget-object v0, p0, Lnb/i$h;->g:Lnb/i;

    .line 106
    .line 107
    iget-object v0, v0, Lnb/i;->f:Lnb/i$b;

    .line 108
    .line 109
    invoke-virtual {p0}, Leb/k0$i;->a()Leb/u;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    iget-object v3, v3, Leb/u;->a:Ljava/util/List;

    .line 114
    .line 115
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v0, v2}, Lo7/p;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, Lnb/i$a;

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iput-object v1, p0, Lnb/i$h;->b:Lnb/i$a;

    .line 129
    .line 130
    iget-object v1, v0, Lnb/i$a;->f:Ljava/util/HashSet;

    .line 131
    .line 132
    invoke-virtual {v1, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    iget-object v1, v0, Lnb/i$a;->b:Lnb/i$a$a;

    .line 136
    .line 137
    iget-object v2, v1, Lnb/i$a$a;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 138
    .line 139
    const-wide/16 v3, 0x0

    .line 140
    .line 141
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 142
    .line 143
    .line 144
    iget-object v1, v1, Lnb/i$a$a;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 145
    .line 146
    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 147
    .line 148
    .line 149
    iget-object v0, v0, Lnb/i$a;->c:Lnb/i$a$a;

    .line 150
    .line 151
    iget-object v1, v0, Lnb/i$a$a;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 152
    .line 153
    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 154
    .line 155
    .line 156
    iget-object v0, v0, Lnb/i$a$a;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 157
    .line 158
    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_2
    invoke-virtual {p0}, Lnb/d;->b()Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-static {v0}, Lnb/i;->g(Ljava/util/List;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-nez v0, :cond_3

    .line 171
    .line 172
    invoke-static {p1}, Lnb/i;->g(Ljava/util/List;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_3

    .line 177
    .line 178
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    check-cast v0, Leb/u;

    .line 183
    .line 184
    iget-object v0, v0, Leb/u;->a:Ljava/util/List;

    .line 185
    .line 186
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    check-cast v0, Ljava/net/SocketAddress;

    .line 191
    .line 192
    iget-object v1, p0, Lnb/i$h;->g:Lnb/i;

    .line 193
    .line 194
    iget-object v1, v1, Lnb/i;->f:Lnb/i$b;

    .line 195
    .line 196
    invoke-virtual {v1, v0}, Lo7/p;->containsKey(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    if-eqz v1, :cond_3

    .line 201
    .line 202
    :goto_0
    iget-object v1, p0, Lnb/i$h;->g:Lnb/i;

    .line 203
    .line 204
    iget-object v1, v1, Lnb/i;->f:Lnb/i$b;

    .line 205
    .line 206
    invoke-virtual {v1, v0}, Lo7/p;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    check-cast v0, Lnb/i$a;

    .line 211
    .line 212
    invoke-virtual {v0, p0}, Lnb/i$a;->a(Lnb/i$h;)V

    .line 213
    .line 214
    .line 215
    :cond_3
    :goto_1
    iget-object v0, p0, Lnb/i$h;->a:Leb/k0$i;

    .line 216
    .line 217
    invoke-virtual {v0, p1}, Leb/k0$i;->i(Ljava/util/List;)V

    .line 218
    .line 219
    .line 220
    return-void
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

.method public final j()Leb/k0$i;
    .locals 1

    iget-object v0, p0, Lnb/i$h;->a:Leb/k0$i;

    return-object v0
.end method

.method public final k()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lnb/i$h;->c:Z

    .line 3
    .line 4
    iget-object v1, p0, Lnb/i$h;->e:Leb/k0$k;

    .line 5
    .line 6
    sget-object v2, Leb/e1;->n:Leb/e1;

    .line 7
    .line 8
    invoke-virtual {v2}, Leb/e1;->e()Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    xor-int/2addr v3, v0

    .line 13
    const-string v4, "The error status must not be OK"

    .line 14
    .line 15
    invoke-static {v4, v3}, Lx6/b;->s(Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    new-instance v3, Leb/o;

    .line 19
    .line 20
    sget-object v4, Leb/n;->c:Leb/n;

    .line 21
    .line 22
    invoke-direct {v3, v4, v2}, Leb/o;-><init>(Leb/n;Leb/e1;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v1, v3}, Leb/k0$k;->a(Leb/o;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lnb/i$h;->f:Leb/d;

    .line 29
    .line 30
    sget-object v2, Leb/d$a;->b:Leb/d$a;

    .line 31
    .line 32
    new-array v0, v0, [Ljava/lang/Object;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    aput-object p0, v0, v3

    .line 36
    .line 37
    const-string v3, "Subchannel ejected: {0}"

    .line 38
    .line 39
    invoke-virtual {v1, v2, v3, v0}, Leb/d;->b(Leb/d$a;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "OutlierDetectionSubchannel{addresses="

    .line 2
    .line 3
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lnb/i$h;->a:Leb/k0$i;

    .line 8
    .line 9
    invoke-virtual {v1}, Leb/k0$i;->b()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x7d

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
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
