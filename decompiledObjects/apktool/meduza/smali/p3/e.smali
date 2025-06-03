.class public final Lp3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm3/b;


# instance fields
.field public final synthetic a:I

.field public final b:Lqb/a;


# direct methods
.method public synthetic constructor <init>(Lqb/a;I)V
    .locals 0

    iput p2, p0, Lp3/e;->a:I

    iput-object p1, p0, Lp3/e;->b:Lqb/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lp3/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto/16 :goto_0

    .line 7
    .line 8
    :pswitch_0
    iget-object v0, p0, Lp3/e;->b:Lqb/a;

    .line 9
    .line 10
    invoke-interface {v0}, Lqb/a;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lt3/a;

    .line 15
    .line 16
    new-instance v1, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    sget-object v2, Lh3/e;->a:Lh3/e;

    .line 22
    .line 23
    new-instance v3, Lq3/c$a;

    .line 24
    .line 25
    invoke-direct {v3}, Lq3/c$a;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const-string v5, "Null flags"

    .line 33
    .line 34
    if-eqz v4, :cond_5

    .line 35
    .line 36
    iput-object v4, v3, Lq3/c$a;->c:Ljava/util/Set;

    .line 37
    .line 38
    const-wide/16 v6, 0x7530

    .line 39
    .line 40
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    iput-object v4, v3, Lq3/c$a;->a:Ljava/lang/Long;

    .line 45
    .line 46
    const-wide/32 v6, 0x5265c00

    .line 47
    .line 48
    .line 49
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    iput-object v4, v3, Lq3/c$a;->b:Ljava/lang/Long;

    .line 54
    .line 55
    invoke-virtual {v3}, Lq3/c$a;->a()Lq3/c;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    sget-object v2, Lh3/e;->c:Lh3/e;

    .line 63
    .line 64
    new-instance v3, Lq3/c$a;

    .line 65
    .line 66
    invoke-direct {v3}, Lq3/c$a;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    if-eqz v4, :cond_4

    .line 74
    .line 75
    iput-object v4, v3, Lq3/c$a;->c:Ljava/util/Set;

    .line 76
    .line 77
    const-wide/16 v8, 0x3e8

    .line 78
    .line 79
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    iput-object v4, v3, Lq3/c$a;->a:Ljava/lang/Long;

    .line 84
    .line 85
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    iput-object v4, v3, Lq3/c$a;->b:Ljava/lang/Long;

    .line 90
    .line 91
    invoke-virtual {v3}, Lq3/c$a;->a()Lq3/c;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    sget-object v2, Lh3/e;->b:Lh3/e;

    .line 99
    .line 100
    new-instance v3, Lq3/c$a;

    .line 101
    .line 102
    invoke-direct {v3}, Lq3/c$a;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    if-eqz v4, :cond_3

    .line 110
    .line 111
    iput-object v4, v3, Lq3/c$a;->c:Ljava/util/Set;

    .line 112
    .line 113
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    iput-object v4, v3, Lq3/c$a;->a:Ljava/lang/Long;

    .line 118
    .line 119
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    iput-object v4, v3, Lq3/c$a;->b:Ljava/lang/Long;

    .line 124
    .line 125
    const/4 v4, 0x1

    .line 126
    new-array v4, v4, [Lq3/e$b;

    .line 127
    .line 128
    const/4 v6, 0x0

    .line 129
    sget-object v7, Lq3/e$b;->b:Lq3/e$b;

    .line 130
    .line 131
    aput-object v7, v4, v6

    .line 132
    .line 133
    new-instance v6, Ljava/util/HashSet;

    .line 134
    .line 135
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-direct {v6, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 140
    .line 141
    .line 142
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    if-eqz v4, :cond_2

    .line 147
    .line 148
    iput-object v4, v3, Lq3/c$a;->c:Ljava/util/Set;

    .line 149
    .line 150
    invoke-virtual {v3}, Lq3/c$a;->a()Lq3/c;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    if-eqz v0, :cond_1

    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    invoke-static {}, Lh3/e;->values()[Lh3/e;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    array-length v3, v3

    .line 172
    if-lt v2, v3, :cond_0

    .line 173
    .line 174
    new-instance v2, Ljava/util/HashMap;

    .line 175
    .line 176
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 177
    .line 178
    .line 179
    new-instance v2, Lq3/b;

    .line 180
    .line 181
    invoke-direct {v2, v0, v1}, Lq3/b;-><init>(Lt3/a;Ljava/util/Map;)V

    .line 182
    .line 183
    .line 184
    return-object v2

    .line 185
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 186
    .line 187
    const-string v1, "Not all priorities have been configured"

    .line 188
    .line 189
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw v0

    .line 193
    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    .line 194
    .line 195
    const-string v1, "missing required property: clock"

    .line 196
    .line 197
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw v0

    .line 201
    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    .line 202
    .line 203
    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw v0

    .line 207
    :cond_3
    new-instance v0, Ljava/lang/NullPointerException;

    .line 208
    .line 209
    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw v0

    .line 213
    :cond_4
    new-instance v0, Ljava/lang/NullPointerException;

    .line 214
    .line 215
    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    throw v0

    .line 219
    :cond_5
    new-instance v0, Ljava/lang/NullPointerException;

    .line 220
    .line 221
    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw v0

    .line 225
    :goto_0
    iget-object v0, p0, Lp3/e;->b:Lqb/a;

    .line 226
    .line 227
    invoke-interface {v0}, Lqb/a;->get()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    check-cast v0, Landroid/content/Context;

    .line 232
    .line 233
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    if-eqz v0, :cond_6

    .line 238
    .line 239
    return-object v0

    .line 240
    :cond_6
    new-instance v0, Ljava/lang/NullPointerException;

    .line 241
    .line 242
    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 243
    .line 244
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    throw v0

    .line 248
    nop

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
