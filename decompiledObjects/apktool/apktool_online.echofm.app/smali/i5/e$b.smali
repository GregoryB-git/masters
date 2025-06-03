.class public Li5/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li5/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final o:LE5/j;

.field public final p:LE5/k$d;

.field public final synthetic q:Li5/e;


# direct methods
.method public constructor <init>(Li5/e;LE5/j;LE5/k$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li5/e$b;->q:Li5/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Li5/e$b;->o:LE5/j;

    .line 7
    .line 8
    iput-object p3, p0, Li5/e$b;->p:LE5/k$d;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/io/StringWriter;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/io/PrintWriter;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Li5/e$b;->p:LE5/k$d;

    .line 15
    .line 16
    iget-object v1, p0, Li5/e$b;->o:LE5/j;

    .line 17
    .line 18
    iget-object v1, v1, LE5/j;->a:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "Exception encountered"

    .line 25
    .line 26
    invoke-interface {p1, v2, v1, v0}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public run()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Li5/e$b;->q:Li5/e;

    .line 3
    .line 4
    invoke-static {v1}, Li5/e;->a(Li5/e;)Li5/a;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v2, p0, Li5/e$b;->o:LE5/j;

    .line 9
    .line 10
    iget-object v2, v2, LE5/j;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Ljava/util/Map;

    .line 13
    .line 14
    const-string v3, "options"

    .line 15
    .line 16
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ljava/util/Map;

    .line 21
    .line 22
    iput-object v2, v1, Li5/a;->e:Ljava/util/Map;

    .line 23
    .line 24
    iget-object v1, p0, Li5/e$b;->q:Li5/e;

    .line 25
    .line 26
    invoke-static {v1}, Li5/e;->a(Li5/e;)Li5/a;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Li5/a;->g()Z

    .line 31
    .line 32
    .line 33
    move-result v1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 34
    :try_start_1
    iget-object v2, p0, Li5/e$b;->o:LE5/j;

    .line 35
    .line 36
    iget-object v2, v2, LE5/j;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const/4 v4, 0x4

    .line 43
    const/4 v5, 0x5

    .line 44
    const/4 v6, 0x1

    .line 45
    const/4 v7, 0x3

    .line 46
    const/4 v8, 0x2

    .line 47
    sparse-switch v3, :sswitch_data_0

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :sswitch_0
    const-string v0, "readAll"

    .line 52
    .line 53
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    move v0, v8

    .line 60
    goto :goto_1

    .line 61
    :catch_0
    move-exception v0

    .line 62
    goto/16 :goto_4

    .line 63
    .line 64
    :catch_1
    move-exception v0

    .line 65
    goto/16 :goto_5

    .line 66
    .line 67
    :sswitch_1
    const-string v0, "containsKey"

    .line 68
    .line 69
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_0

    .line 74
    .line 75
    move v0, v7

    .line 76
    goto :goto_1

    .line 77
    :sswitch_2
    const-string v3, "write"

    .line 78
    .line 79
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_0

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :sswitch_3
    const-string v0, "read"

    .line 87
    .line 88
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_0

    .line 93
    .line 94
    move v0, v6

    .line 95
    goto :goto_1

    .line 96
    :sswitch_4
    const-string v0, "deleteAll"

    .line 97
    .line 98
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_0

    .line 103
    .line 104
    move v0, v5

    .line 105
    goto :goto_1

    .line 106
    :sswitch_5
    const-string v0, "delete"

    .line 107
    .line 108
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_0

    .line 113
    .line 114
    move v0, v4

    .line 115
    goto :goto_1

    .line 116
    :cond_0
    :goto_0
    const/4 v0, -0x1

    .line 117
    :goto_1
    const/4 v2, 0x0

    .line 118
    if-eqz v0, :cond_7

    .line 119
    .line 120
    if-eq v0, v6, :cond_5

    .line 121
    .line 122
    if-eq v0, v8, :cond_4

    .line 123
    .line 124
    if-eq v0, v7, :cond_3

    .line 125
    .line 126
    if-eq v0, v4, :cond_2

    .line 127
    .line 128
    if-eq v0, v5, :cond_1

    .line 129
    .line 130
    iget-object v0, p0, Li5/e$b;->p:LE5/k$d;

    .line 131
    .line 132
    invoke-interface {v0}, LE5/k$d;->c()V

    .line 133
    .line 134
    .line 135
    goto/16 :goto_6

    .line 136
    .line 137
    :cond_1
    iget-object v0, p0, Li5/e$b;->q:Li5/e;

    .line 138
    .line 139
    invoke-static {v0}, Li5/e;->a(Li5/e;)Li5/a;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0}, Li5/a;->e()V

    .line 144
    .line 145
    .line 146
    iget-object v0, p0, Li5/e$b;->p:LE5/k$d;

    .line 147
    .line 148
    :goto_2
    invoke-interface {v0, v2}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    goto/16 :goto_6

    .line 152
    .line 153
    :cond_2
    iget-object v0, p0, Li5/e$b;->q:Li5/e;

    .line 154
    .line 155
    iget-object v3, p0, Li5/e$b;->o:LE5/j;

    .line 156
    .line 157
    invoke-static {v0, v3}, Li5/e;->b(Li5/e;LE5/j;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iget-object v3, p0, Li5/e$b;->q:Li5/e;

    .line 162
    .line 163
    invoke-static {v3}, Li5/e;->a(Li5/e;)Li5/a;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-virtual {v3, v0}, Li5/a;->d(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    iget-object v0, p0, Li5/e$b;->p:LE5/k$d;

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_3
    iget-object v0, p0, Li5/e$b;->q:Li5/e;

    .line 174
    .line 175
    iget-object v2, p0, Li5/e$b;->o:LE5/j;

    .line 176
    .line 177
    invoke-static {v0, v2}, Li5/e;->b(Li5/e;LE5/j;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    iget-object v2, p0, Li5/e$b;->q:Li5/e;

    .line 182
    .line 183
    invoke-static {v2}, Li5/e;->a(Li5/e;)Li5/a;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-virtual {v2, v0}, Li5/a;->b(Ljava/lang/String;)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    iget-object v2, p0, Li5/e$b;->p:LE5/k$d;

    .line 192
    .line 193
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    :goto_3
    invoke-interface {v2, v0}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    goto/16 :goto_6

    .line 201
    .line 202
    :cond_4
    iget-object v0, p0, Li5/e$b;->p:LE5/k$d;

    .line 203
    .line 204
    iget-object v2, p0, Li5/e$b;->q:Li5/e;

    .line 205
    .line 206
    invoke-static {v2}, Li5/e;->a(Li5/e;)Li5/a;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-virtual {v2}, Li5/a;->m()Ljava/util/Map;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    goto :goto_2

    .line 215
    :cond_5
    iget-object v0, p0, Li5/e$b;->q:Li5/e;

    .line 216
    .line 217
    iget-object v3, p0, Li5/e$b;->o:LE5/j;

    .line 218
    .line 219
    invoke-static {v0, v3}, Li5/e;->b(Li5/e;LE5/j;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    iget-object v3, p0, Li5/e$b;->q:Li5/e;

    .line 224
    .line 225
    invoke-static {v3}, Li5/e;->a(Li5/e;)Li5/a;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    invoke-virtual {v3, v0}, Li5/a;->b(Ljava/lang/String;)Z

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    if-eqz v3, :cond_6

    .line 234
    .line 235
    iget-object v2, p0, Li5/e$b;->q:Li5/e;

    .line 236
    .line 237
    invoke-static {v2}, Li5/e;->a(Li5/e;)Li5/a;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    invoke-virtual {v2, v0}, Li5/a;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    iget-object v2, p0, Li5/e$b;->p:LE5/k$d;

    .line 246
    .line 247
    goto :goto_3

    .line 248
    :cond_6
    iget-object v0, p0, Li5/e$b;->p:LE5/k$d;

    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_7
    iget-object v0, p0, Li5/e$b;->q:Li5/e;

    .line 252
    .line 253
    iget-object v3, p0, Li5/e$b;->o:LE5/j;

    .line 254
    .line 255
    invoke-static {v0, v3}, Li5/e;->b(Li5/e;LE5/j;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    iget-object v3, p0, Li5/e$b;->q:Li5/e;

    .line 260
    .line 261
    iget-object v4, p0, Li5/e$b;->o:LE5/j;

    .line 262
    .line 263
    invoke-static {v3, v4}, Li5/e;->c(Li5/e;LE5/j;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    if-eqz v3, :cond_8

    .line 268
    .line 269
    iget-object v4, p0, Li5/e$b;->q:Li5/e;

    .line 270
    .line 271
    invoke-static {v4}, Li5/e;->a(Li5/e;)Li5/a;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    invoke-virtual {v4, v0, v3}, Li5/a;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    iget-object v0, p0, Li5/e$b;->p:LE5/k$d;

    .line 279
    .line 280
    goto/16 :goto_2

    .line 281
    .line 282
    :cond_8
    iget-object v0, p0, Li5/e$b;->p:LE5/k$d;

    .line 283
    .line 284
    const-string v3, "null"

    .line 285
    .line 286
    invoke-interface {v0, v3, v2, v2}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 287
    .line 288
    .line 289
    goto :goto_6

    .line 290
    :catch_2
    move-exception v1

    .line 291
    move-object v9, v1

    .line 292
    move v1, v0

    .line 293
    move-object v0, v9

    .line 294
    :goto_4
    if-eqz v1, :cond_9

    .line 295
    .line 296
    :try_start_2
    iget-object v0, p0, Li5/e$b;->q:Li5/e;

    .line 297
    .line 298
    invoke-static {v0}, Li5/e;->a(Li5/e;)Li5/a;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-virtual {v0}, Li5/a;->e()V

    .line 303
    .line 304
    .line 305
    iget-object v0, p0, Li5/e$b;->p:LE5/k$d;

    .line 306
    .line 307
    const-string v1, "Data has been reset"

    .line 308
    .line 309
    invoke-interface {v0, v1}, LE5/k$d;->a(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 310
    .line 311
    .line 312
    goto :goto_6

    .line 313
    :catch_3
    move-exception v0

    .line 314
    :cond_9
    invoke-virtual {p0, v0}, Li5/e$b;->a(Ljava/lang/Exception;)V

    .line 315
    .line 316
    .line 317
    goto :goto_6

    .line 318
    :goto_5
    const-string v1, "Creating sharedPrefs"

    .line 319
    .line 320
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 325
    .line 326
    .line 327
    :goto_6
    return-void

    .line 328
    nop

    .line 329
    :sswitch_data_0
    .sparse-switch
        -0x4f997a55 -> :sswitch_5
        -0x1561e80a -> :sswitch_4
        0x355996 -> :sswitch_3
        0x6c257df -> :sswitch_2
        0xc6607c0 -> :sswitch_1
        0x4065382b -> :sswitch_0
    .end sparse-switch
.end method
