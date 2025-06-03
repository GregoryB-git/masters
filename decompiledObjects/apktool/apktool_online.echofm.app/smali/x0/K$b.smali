.class public final Lx0/K$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB0/n$e;
.implements Lx0/q$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final a:J

.field public final b:Landroid/net/Uri;

.field public final c:Li0/x;

.field public final d:Lx0/F;

.field public final e:LF0/t;

.field public final f:Lg0/f;

.field public final g:LF0/L;

.field public volatile h:Z

.field public i:Z

.field public j:J

.field public k:Li0/k;

.field public l:LF0/T;

.field public m:Z

.field public final synthetic n:Lx0/K;


# direct methods
.method public constructor <init>(Lx0/K;Landroid/net/Uri;Li0/g;Lx0/F;LF0/t;Lg0/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx0/K$b;->n:Lx0/K;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lx0/K$b;->b:Landroid/net/Uri;

    .line 7
    .line 8
    new-instance p1, Li0/x;

    .line 9
    .line 10
    invoke-direct {p1, p3}, Li0/x;-><init>(Li0/g;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lx0/K$b;->c:Li0/x;

    .line 14
    .line 15
    iput-object p4, p0, Lx0/K$b;->d:Lx0/F;

    .line 16
    .line 17
    iput-object p5, p0, Lx0/K$b;->e:LF0/t;

    .line 18
    .line 19
    iput-object p6, p0, Lx0/K$b;->f:Lg0/f;

    .line 20
    .line 21
    new-instance p1, LF0/L;

    .line 22
    .line 23
    invoke-direct {p1}, LF0/L;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lx0/K$b;->g:LF0/L;

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, p0, Lx0/K$b;->i:Z

    .line 30
    .line 31
    invoke-static {}, Lx0/r;->a()J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    iput-wide p1, p0, Lx0/K$b;->a:J

    .line 36
    .line 37
    const-wide/16 p1, 0x0

    .line 38
    .line 39
    invoke-virtual {p0, p1, p2}, Lx0/K$b;->i(J)Li0/k;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Lx0/K$b;->k:Li0/k;

    .line 44
    .line 45
    return-void
.end method

.method public static synthetic d(Lx0/K$b;)Li0/x;
    .locals 0

    .line 1
    iget-object p0, p0, Lx0/K$b;->c:Li0/x;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic e(Lx0/K$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lx0/K$b;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic f(Lx0/K$b;)Li0/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lx0/K$b;->k:Li0/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic g(Lx0/K$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lx0/K$b;->j:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic h(Lx0/K$b;JJ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lx0/K$b;->j(JJ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lg0/z;)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lx0/K$b;->m:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-wide v2, p0, Lx0/K$b;->j:J

    .line 7
    .line 8
    :goto_0
    move-wide v5, v2

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget-object v0, p0, Lx0/K$b;->n:Lx0/K;

    .line 11
    .line 12
    invoke-static {v0, v1}, Lx0/K;->C(Lx0/K;Z)J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    iget-wide v4, p0, Lx0/K$b;->j:J

    .line 17
    .line 18
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    goto :goto_0

    .line 23
    :goto_1
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    iget-object v0, p0, Lx0/K$b;->l:LF0/T;

    .line 28
    .line 29
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    move-object v4, v0

    .line 34
    check-cast v4, LF0/T;

    .line 35
    .line 36
    invoke-interface {v4, p1, v8}, LF0/T;->e(Lg0/z;I)V

    .line 37
    .line 38
    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v10, 0x0

    .line 41
    const/4 v7, 0x1

    .line 42
    invoke-interface/range {v4 .. v10}, LF0/T;->b(JIIILF0/T$a;)V

    .line 43
    .line 44
    .line 45
    iput-boolean v1, p0, Lx0/K$b;->m:Z

    .line 46
    .line 47
    return-void
.end method

.method public b()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    move v2, v0

    .line 5
    :goto_0
    if-nez v2, :cond_c

    .line 6
    .line 7
    iget-boolean v3, v1, Lx0/K$b;->h:Z

    .line 8
    .line 9
    if-nez v3, :cond_c

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const-wide/16 v4, -0x1

    .line 13
    .line 14
    :try_start_0
    iget-object v6, v1, Lx0/K$b;->g:LF0/L;

    .line 15
    .line 16
    iget-wide v13, v6, LF0/L;->a:J

    .line 17
    .line 18
    invoke-virtual {v1, v13, v14}, Lx0/K$b;->i(J)Li0/k;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    iput-object v6, v1, Lx0/K$b;->k:Li0/k;

    .line 23
    .line 24
    iget-object v7, v1, Lx0/K$b;->c:Li0/x;

    .line 25
    .line 26
    invoke-virtual {v7, v6}, Li0/x;->e(Li0/k;)J

    .line 27
    .line 28
    .line 29
    move-result-wide v6

    .line 30
    iget-boolean v8, v1, Lx0/K$b;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    if-eqz v8, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    iget-object v0, v1, Lx0/K$b;->d:Lx0/F;

    .line 38
    .line 39
    invoke-interface {v0}, Lx0/F;->d()J

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    cmp-long v0, v2, v4

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    iget-object v0, v1, Lx0/K$b;->g:LF0/L;

    .line 48
    .line 49
    iget-object v2, v1, Lx0/K$b;->d:Lx0/F;

    .line 50
    .line 51
    invoke-interface {v2}, Lx0/F;->d()J

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    iput-wide v2, v0, LF0/L;->a:J

    .line 56
    .line 57
    :cond_1
    :goto_1
    iget-object v0, v1, Lx0/K$b;->c:Li0/x;

    .line 58
    .line 59
    invoke-static {v0}, Li0/j;->a(Li0/g;)V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_6

    .line 63
    .line 64
    :cond_2
    cmp-long v8, v6, v4

    .line 65
    .line 66
    if-eqz v8, :cond_3

    .line 67
    .line 68
    add-long/2addr v6, v13

    .line 69
    :try_start_1
    iget-object v8, v1, Lx0/K$b;->n:Lx0/K;

    .line 70
    .line 71
    invoke-static {v8}, Lx0/K;->G(Lx0/K;)V

    .line 72
    .line 73
    .line 74
    :cond_3
    move-wide v15, v6

    .line 75
    goto :goto_2

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    goto/16 :goto_5

    .line 78
    .line 79
    :goto_2
    iget-object v6, v1, Lx0/K$b;->n:Lx0/K;

    .line 80
    .line 81
    iget-object v7, v1, Lx0/K$b;->c:Li0/x;

    .line 82
    .line 83
    invoke-virtual {v7}, Li0/x;->g()Ljava/util/Map;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-static {v7}, LS0/b;->a(Ljava/util/Map;)LS0/b;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-static {v6, v7}, Lx0/K;->I(Lx0/K;LS0/b;)LS0/b;

    .line 92
    .line 93
    .line 94
    iget-object v6, v1, Lx0/K$b;->c:Li0/x;

    .line 95
    .line 96
    iget-object v7, v1, Lx0/K$b;->n:Lx0/K;

    .line 97
    .line 98
    invoke-static {v7}, Lx0/K;->H(Lx0/K;)LS0/b;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    if-eqz v7, :cond_4

    .line 103
    .line 104
    iget-object v7, v1, Lx0/K$b;->n:Lx0/K;

    .line 105
    .line 106
    invoke-static {v7}, Lx0/K;->H(Lx0/K;)LS0/b;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    iget v7, v7, LS0/b;->t:I

    .line 111
    .line 112
    const/4 v8, -0x1

    .line 113
    if-eq v7, v8, :cond_4

    .line 114
    .line 115
    new-instance v6, Lx0/q;

    .line 116
    .line 117
    iget-object v7, v1, Lx0/K$b;->c:Li0/x;

    .line 118
    .line 119
    iget-object v8, v1, Lx0/K$b;->n:Lx0/K;

    .line 120
    .line 121
    invoke-static {v8}, Lx0/K;->H(Lx0/K;)LS0/b;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    iget v8, v8, LS0/b;->t:I

    .line 126
    .line 127
    invoke-direct {v6, v7, v8, v1}, Lx0/q;-><init>(Li0/g;ILx0/q$a;)V

    .line 128
    .line 129
    .line 130
    iget-object v7, v1, Lx0/K$b;->n:Lx0/K;

    .line 131
    .line 132
    invoke-virtual {v7}, Lx0/K;->P()LF0/T;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    iput-object v7, v1, Lx0/K$b;->l:LF0/T;

    .line 137
    .line 138
    invoke-static {}, Lx0/K;->J()Ld0/q;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    invoke-interface {v7, v8}, LF0/T;->d(Ld0/q;)V

    .line 143
    .line 144
    .line 145
    :cond_4
    move-object v8, v6

    .line 146
    iget-object v7, v1, Lx0/K$b;->d:Lx0/F;

    .line 147
    .line 148
    iget-object v9, v1, Lx0/K$b;->b:Landroid/net/Uri;

    .line 149
    .line 150
    iget-object v6, v1, Lx0/K$b;->c:Li0/x;

    .line 151
    .line 152
    invoke-virtual {v6}, Li0/x;->g()Ljava/util/Map;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    iget-object v6, v1, Lx0/K$b;->e:LF0/t;

    .line 157
    .line 158
    move-wide v11, v13

    .line 159
    move-wide v4, v13

    .line 160
    move-wide v13, v15

    .line 161
    move-object v15, v6

    .line 162
    invoke-interface/range {v7 .. v15}, Lx0/F;->b(Ld0/i;Landroid/net/Uri;Ljava/util/Map;JJLF0/t;)V

    .line 163
    .line 164
    .line 165
    iget-object v6, v1, Lx0/K$b;->n:Lx0/K;

    .line 166
    .line 167
    invoke-static {v6}, Lx0/K;->H(Lx0/K;)LS0/b;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    if-eqz v6, :cond_5

    .line 172
    .line 173
    iget-object v6, v1, Lx0/K$b;->d:Lx0/F;

    .line 174
    .line 175
    invoke-interface {v6}, Lx0/F;->e()V

    .line 176
    .line 177
    .line 178
    :cond_5
    iget-boolean v6, v1, Lx0/K$b;->i:Z

    .line 179
    .line 180
    if-eqz v6, :cond_6

    .line 181
    .line 182
    iget-object v6, v1, Lx0/K$b;->d:Lx0/F;

    .line 183
    .line 184
    iget-wide v7, v1, Lx0/K$b;->j:J

    .line 185
    .line 186
    invoke-interface {v6, v4, v5, v7, v8}, Lx0/F;->a(JJ)V

    .line 187
    .line 188
    .line 189
    iput-boolean v0, v1, Lx0/K$b;->i:Z

    .line 190
    .line 191
    :cond_6
    :goto_3
    move-wide v13, v4

    .line 192
    :cond_7
    if-nez v2, :cond_8

    .line 193
    .line 194
    iget-boolean v4, v1, Lx0/K$b;->h:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 195
    .line 196
    if-nez v4, :cond_8

    .line 197
    .line 198
    :try_start_2
    iget-object v4, v1, Lx0/K$b;->f:Lg0/f;

    .line 199
    .line 200
    invoke-virtual {v4}, Lg0/f;->a()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 201
    .line 202
    .line 203
    :try_start_3
    iget-object v4, v1, Lx0/K$b;->d:Lx0/F;

    .line 204
    .line 205
    iget-object v5, v1, Lx0/K$b;->g:LF0/L;

    .line 206
    .line 207
    invoke-interface {v4, v5}, Lx0/F;->c(LF0/L;)I

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    iget-object v4, v1, Lx0/K$b;->d:Lx0/F;

    .line 212
    .line 213
    invoke-interface {v4}, Lx0/F;->d()J

    .line 214
    .line 215
    .line 216
    move-result-wide v4

    .line 217
    iget-object v6, v1, Lx0/K$b;->n:Lx0/K;

    .line 218
    .line 219
    invoke-static {v6}, Lx0/K;->z(Lx0/K;)J

    .line 220
    .line 221
    .line 222
    move-result-wide v6

    .line 223
    add-long/2addr v6, v13

    .line 224
    cmp-long v6, v4, v6

    .line 225
    .line 226
    if-lez v6, :cond_7

    .line 227
    .line 228
    iget-object v6, v1, Lx0/K$b;->f:Lg0/f;

    .line 229
    .line 230
    invoke-virtual {v6}, Lg0/f;->c()Z

    .line 231
    .line 232
    .line 233
    iget-object v6, v1, Lx0/K$b;->n:Lx0/K;

    .line 234
    .line 235
    invoke-static {v6}, Lx0/K;->B(Lx0/K;)Landroid/os/Handler;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    iget-object v7, v1, Lx0/K$b;->n:Lx0/K;

    .line 240
    .line 241
    invoke-static {v7}, Lx0/K;->A(Lx0/K;)Ljava/lang/Runnable;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 246
    .line 247
    .line 248
    goto :goto_3

    .line 249
    :catch_0
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 250
    .line 251
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 252
    .line 253
    .line 254
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 255
    :cond_8
    if-ne v2, v3, :cond_9

    .line 256
    .line 257
    move v2, v0

    .line 258
    goto :goto_4

    .line 259
    :cond_9
    iget-object v3, v1, Lx0/K$b;->d:Lx0/F;

    .line 260
    .line 261
    invoke-interface {v3}, Lx0/F;->d()J

    .line 262
    .line 263
    .line 264
    move-result-wide v3

    .line 265
    const-wide/16 v5, -0x1

    .line 266
    .line 267
    cmp-long v3, v3, v5

    .line 268
    .line 269
    if-eqz v3, :cond_a

    .line 270
    .line 271
    iget-object v3, v1, Lx0/K$b;->g:LF0/L;

    .line 272
    .line 273
    iget-object v4, v1, Lx0/K$b;->d:Lx0/F;

    .line 274
    .line 275
    invoke-interface {v4}, Lx0/F;->d()J

    .line 276
    .line 277
    .line 278
    move-result-wide v4

    .line 279
    iput-wide v4, v3, LF0/L;->a:J

    .line 280
    .line 281
    :cond_a
    :goto_4
    iget-object v3, v1, Lx0/K$b;->c:Li0/x;

    .line 282
    .line 283
    invoke-static {v3}, Li0/j;->a(Li0/g;)V

    .line 284
    .line 285
    .line 286
    goto/16 :goto_0

    .line 287
    .line 288
    :goto_5
    if-eq v2, v3, :cond_b

    .line 289
    .line 290
    iget-object v2, v1, Lx0/K$b;->d:Lx0/F;

    .line 291
    .line 292
    invoke-interface {v2}, Lx0/F;->d()J

    .line 293
    .line 294
    .line 295
    move-result-wide v2

    .line 296
    const-wide/16 v4, -0x1

    .line 297
    .line 298
    cmp-long v2, v2, v4

    .line 299
    .line 300
    if-eqz v2, :cond_b

    .line 301
    .line 302
    iget-object v2, v1, Lx0/K$b;->g:LF0/L;

    .line 303
    .line 304
    iget-object v3, v1, Lx0/K$b;->d:Lx0/F;

    .line 305
    .line 306
    invoke-interface {v3}, Lx0/F;->d()J

    .line 307
    .line 308
    .line 309
    move-result-wide v3

    .line 310
    iput-wide v3, v2, LF0/L;->a:J

    .line 311
    .line 312
    :cond_b
    iget-object v2, v1, Lx0/K$b;->c:Li0/x;

    .line 313
    .line 314
    invoke-static {v2}, Li0/j;->a(Li0/g;)V

    .line 315
    .line 316
    .line 317
    throw v0

    .line 318
    :cond_c
    :goto_6
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lx0/K$b;->h:Z

    .line 3
    .line 4
    return-void
.end method

.method public final i(J)Li0/k;
    .locals 2

    .line 1
    new-instance v0, Li0/k$b;

    .line 2
    .line 3
    invoke-direct {v0}, Li0/k$b;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lx0/K$b;->b:Landroid/net/Uri;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Li0/k$b;->i(Landroid/net/Uri;)Li0/k$b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1, p2}, Li0/k$b;->h(J)Li0/k$b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p2, p0, Lx0/K$b;->n:Lx0/K;

    .line 17
    .line 18
    invoke-static {p2}, Lx0/K;->E(Lx0/K;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p1, p2}, Li0/k$b;->f(Ljava/lang/String;)Li0/k$b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 p2, 0x6

    .line 27
    invoke-virtual {p1, p2}, Li0/k$b;->b(I)Li0/k$b;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {}, Lx0/K;->D()Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, Li0/k$b;->e(Ljava/util/Map;)Li0/k$b;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Li0/k$b;->a()Li0/k;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1
.end method

.method public final j(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/K$b;->g:LF0/L;

    .line 2
    .line 3
    iput-wide p1, v0, LF0/L;->a:J

    .line 4
    .line 5
    iput-wide p3, p0, Lx0/K$b;->j:J

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lx0/K$b;->i:Z

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lx0/K$b;->m:Z

    .line 12
    .line 13
    return-void
.end method
