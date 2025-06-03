.class public abstract Ld4/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/Object;)Ld4/n;
    .locals 1

    .line 1
    invoke-static {}, Ld4/r;->a()Ld4/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0}, Ld4/o;->b(Ljava/lang/Object;Ld4/n;)Ld4/n;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static b(Ljava/lang/Object;Ld4/n;)Ld4/n;
    .locals 5

    .line 1
    const-string v0, ".value"

    .line 2
    .line 3
    const-string v1, ".priority"

    .line 4
    .line 5
    :try_start_0
    instance-of v2, p0, Ljava/util/Map;

    .line 6
    .line 7
    if-eqz v2, :cond_1

    .line 8
    .line 9
    move-object v2, p0

    .line 10
    check-cast v2, Ljava/util/Map;

    .line 11
    .line 12
    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1}, Ld4/r;->d(Ljava/lang/Object;)Ld4/n;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    goto :goto_0

    .line 27
    :catch_0
    move-exception p0

    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :cond_0
    :goto_0
    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    :cond_1
    if-nez p0, :cond_2

    .line 41
    .line 42
    invoke-static {}, Ld4/g;->W()Ld4/g;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_2
    instance-of v0, p0, Ljava/lang/String;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    new-instance v0, Ld4/t;

    .line 52
    .line 53
    check-cast p0, Ljava/lang/String;

    .line 54
    .line 55
    invoke-direct {v0, p0, p1}, Ld4/t;-><init>(Ljava/lang/String;Ld4/n;)V

    .line 56
    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_3
    instance-of v0, p0, Ljava/lang/Long;

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    new-instance v0, Ld4/l;

    .line 64
    .line 65
    check-cast p0, Ljava/lang/Long;

    .line 66
    .line 67
    invoke-direct {v0, p0, p1}, Ld4/l;-><init>(Ljava/lang/Long;Ld4/n;)V

    .line 68
    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_4
    instance-of v0, p0, Ljava/lang/Integer;

    .line 72
    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    new-instance v0, Ld4/l;

    .line 76
    .line 77
    check-cast p0, Ljava/lang/Integer;

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    int-to-long v1, p0

    .line 84
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-direct {v0, p0, p1}, Ld4/l;-><init>(Ljava/lang/Long;Ld4/n;)V

    .line 89
    .line 90
    .line 91
    return-object v0

    .line 92
    :cond_5
    instance-of v0, p0, Ljava/lang/Double;

    .line 93
    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    new-instance v0, Ld4/f;

    .line 97
    .line 98
    check-cast p0, Ljava/lang/Double;

    .line 99
    .line 100
    invoke-direct {v0, p0, p1}, Ld4/f;-><init>(Ljava/lang/Double;Ld4/n;)V

    .line 101
    .line 102
    .line 103
    return-object v0

    .line 104
    :cond_6
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 105
    .line 106
    if-eqz v0, :cond_7

    .line 107
    .line 108
    new-instance v0, Ld4/a;

    .line 109
    .line 110
    check-cast p0, Ljava/lang/Boolean;

    .line 111
    .line 112
    invoke-direct {v0, p0, p1}, Ld4/a;-><init>(Ljava/lang/Boolean;Ld4/n;)V

    .line 113
    .line 114
    .line 115
    return-object v0

    .line 116
    :cond_7
    instance-of v0, p0, Ljava/util/Map;

    .line 117
    .line 118
    if-nez v0, :cond_9

    .line 119
    .line 120
    instance-of v0, p0, Ljava/util/List;

    .line 121
    .line 122
    if-eqz v0, :cond_8

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_8
    new-instance p1, LQ3/d;

    .line 126
    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    .line 131
    .line 132
    const-string v1, "Failed to parse node with class "

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {p0}, Ljava/lang/Class;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-direct {p1, p0}, LQ3/d;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p1

    .line 156
    :cond_9
    :goto_1
    instance-of v0, p0, Ljava/util/Map;

    .line 157
    .line 158
    if-eqz v0, :cond_c

    .line 159
    .line 160
    check-cast p0, Ljava/util/Map;

    .line 161
    .line 162
    const-string v0, ".sv"

    .line 163
    .line 164
    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_a

    .line 169
    .line 170
    new-instance v0, Ld4/e;

    .line 171
    .line 172
    invoke-direct {v0, p0, p1}, Ld4/e;-><init>(Ljava/util/Map;Ld4/n;)V

    .line 173
    .line 174
    .line 175
    return-object v0

    .line 176
    :cond_a
    new-instance v0, Ljava/util/HashMap;

    .line 177
    .line 178
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 183
    .line 184
    .line 185
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    :cond_b
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    if-eqz v2, :cond_e

    .line 198
    .line 199
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    check-cast v2, Ljava/lang/String;

    .line 204
    .line 205
    const-string v3, "."

    .line 206
    .line 207
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    if-nez v3, :cond_b

    .line 212
    .line 213
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    invoke-static {v3}, Ld4/o;->a(Ljava/lang/Object;)Ld4/n;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    invoke-interface {v3}, Ld4/n;->isEmpty()Z

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    if-nez v4, :cond_b

    .line 226
    .line 227
    invoke-static {v2}, Ld4/b;->j(Ljava/lang/String;)Ld4/b;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_c
    check-cast p0, Ljava/util/List;

    .line 236
    .line 237
    new-instance v0, Ljava/util/HashMap;

    .line 238
    .line 239
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 244
    .line 245
    .line 246
    const/4 v1, 0x0

    .line 247
    :goto_3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    if-ge v1, v2, :cond_e

    .line 252
    .line 253
    new-instance v2, Ljava/lang/StringBuilder;

    .line 254
    .line 255
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 256
    .line 257
    .line 258
    const-string v3, ""

    .line 259
    .line 260
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-static {v3}, Ld4/o;->a(Ljava/lang/Object;)Ld4/n;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    invoke-interface {v3}, Ld4/n;->isEmpty()Z

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    if-nez v4, :cond_d

    .line 283
    .line 284
    invoke-static {v2}, Ld4/b;->j(Ljava/lang/String;)Ld4/b;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    :cond_d
    add-int/lit8 v1, v1, 0x1

    .line 292
    .line 293
    goto :goto_3

    .line 294
    :cond_e
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 295
    .line 296
    .line 297
    move-result p0

    .line 298
    if-eqz p0, :cond_f

    .line 299
    .line 300
    invoke-static {}, Ld4/g;->W()Ld4/g;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    return-object p0

    .line 305
    :cond_f
    sget-object p0, Ld4/c;->r:Ljava/util/Comparator;

    .line 306
    .line 307
    invoke-static {v0, p0}, LS3/c$a;->d(Ljava/util/Map;Ljava/util/Comparator;)LS3/c;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    new-instance v0, Ld4/c;

    .line 312
    .line 313
    invoke-direct {v0, p0, p1}, Ld4/c;-><init>(LS3/c;Ld4/n;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 314
    .line 315
    .line 316
    return-object v0

    .line 317
    :goto_4
    new-instance p1, LQ3/d;

    .line 318
    .line 319
    const-string v0, "Failed to parse node"

    .line 320
    .line 321
    invoke-direct {p1, v0, p0}, LQ3/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 322
    .line 323
    .line 324
    throw p1
.end method

.method public static c(Ld4/b;Ld4/n;Ld4/b;Ld4/n;)I
    .locals 0

    .line 1
    invoke-interface {p1, p3}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    return p1

    .line 8
    :cond_0
    invoke-virtual {p0, p2}, Ld4/b;->h(Ld4/b;)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method
