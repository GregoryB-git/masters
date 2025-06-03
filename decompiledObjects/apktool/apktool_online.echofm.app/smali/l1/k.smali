.class public final Ll1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll1/m;


# instance fields
.field public final a:Lg0/z;

.field public final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public e:Ljava/lang/String;

.field public f:LF0/T;

.field public g:I

.field public h:I

.field public i:I

.field public j:J

.field public k:Ld0/q;

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:J


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lg0/z;

    .line 5
    .line 6
    new-array p3, p3, [B

    .line 7
    .line 8
    invoke-direct {v0, p3}, Lg0/z;-><init>([B)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ll1/k;->a:Lg0/z;

    .line 12
    .line 13
    const/4 p3, 0x0

    .line 14
    iput p3, p0, Ll1/k;->g:I

    .line 15
    .line 16
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    iput-wide v0, p0, Ll1/k;->p:J

    .line 22
    .line 23
    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 24
    .line 25
    invoke-direct {p3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p3, p0, Ll1/k;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 29
    .line 30
    const/4 p3, -0x1

    .line 31
    iput p3, p0, Ll1/k;->n:I

    .line 32
    .line 33
    iput p3, p0, Ll1/k;->o:I

    .line 34
    .line 35
    iput-object p1, p0, Ll1/k;->c:Ljava/lang/String;

    .line 36
    .line 37
    iput p2, p0, Ll1/k;->d:I

    .line 38
    .line 39
    return-void
.end method

.method private f(Lg0/z;[BI)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Ll1/k;->h:I

    .line 6
    .line 7
    sub-int v1, p3, v1

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Ll1/k;->h:I

    .line 14
    .line 15
    invoke-virtual {p1, p2, v1, v0}, Lg0/z;->l([BII)V

    .line 16
    .line 17
    .line 18
    iget p1, p0, Ll1/k;->h:I

    .line 19
    .line 20
    add-int/2addr p1, v0

    .line 21
    iput p1, p0, Ll1/k;->h:I

    .line 22
    .line 23
    if-ne p1, p3, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    :goto_0
    return p1
.end method


# virtual methods
.method public a(Lg0/z;)V
    .locals 13

    .line 1
    iget-object v0, p0, Ll1/k;->f:LF0/T;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-lez v0, :cond_7

    .line 11
    .line 12
    iget v0, p0, Ll1/k;->g:I

    .line 13
    .line 14
    const/4 v1, 0x3

    .line 15
    const/4 v2, 0x4

    .line 16
    const/4 v3, 0x6

    .line 17
    const/4 v4, 0x1

    .line 18
    const/4 v5, 0x0

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :pswitch_0
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget v1, p0, Ll1/k;->l:I

    .line 33
    .line 34
    iget v3, p0, Ll1/k;->h:I

    .line 35
    .line 36
    sub-int/2addr v1, v3

    .line 37
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v1, p0, Ll1/k;->f:LF0/T;

    .line 42
    .line 43
    invoke-interface {v1, p1, v0}, LF0/T;->e(Lg0/z;I)V

    .line 44
    .line 45
    .line 46
    iget v1, p0, Ll1/k;->h:I

    .line 47
    .line 48
    add-int/2addr v1, v0

    .line 49
    iput v1, p0, Ll1/k;->h:I

    .line 50
    .line 51
    iget v0, p0, Ll1/k;->l:I

    .line 52
    .line 53
    if-ne v1, v0, :cond_0

    .line 54
    .line 55
    iget-wide v0, p0, Ll1/k;->p:J

    .line 56
    .line 57
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    cmp-long v0, v0, v6

    .line 63
    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    move v0, v4

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    move v0, v5

    .line 69
    :goto_1
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 70
    .line 71
    .line 72
    iget-object v6, p0, Ll1/k;->f:LF0/T;

    .line 73
    .line 74
    iget-wide v7, p0, Ll1/k;->p:J

    .line 75
    .line 76
    iget v0, p0, Ll1/k;->m:I

    .line 77
    .line 78
    if-ne v0, v2, :cond_2

    .line 79
    .line 80
    move v9, v5

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    move v9, v4

    .line 83
    :goto_2
    iget v10, p0, Ll1/k;->l:I

    .line 84
    .line 85
    const/4 v11, 0x0

    .line 86
    const/4 v12, 0x0

    .line 87
    invoke-interface/range {v6 .. v12}, LF0/T;->b(JIIILF0/T$a;)V

    .line 88
    .line 89
    .line 90
    iget-wide v0, p0, Ll1/k;->p:J

    .line 91
    .line 92
    iget-wide v2, p0, Ll1/k;->j:J

    .line 93
    .line 94
    add-long/2addr v0, v2

    .line 95
    iput-wide v0, p0, Ll1/k;->p:J

    .line 96
    .line 97
    iput v5, p0, Ll1/k;->g:I

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :pswitch_1
    iget-object v0, p0, Ll1/k;->a:Lg0/z;

    .line 101
    .line 102
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget v1, p0, Ll1/k;->o:I

    .line 107
    .line 108
    invoke-direct {p0, p1, v0, v1}, Ll1/k;->f(Lg0/z;[BI)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_0

    .line 113
    .line 114
    invoke-virtual {p0}, Ll1/k;->i()V

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, Ll1/k;->a:Lg0/z;

    .line 118
    .line 119
    invoke-virtual {v0, v5}, Lg0/z;->T(I)V

    .line 120
    .line 121
    .line 122
    iget-object v0, p0, Ll1/k;->f:LF0/T;

    .line 123
    .line 124
    iget-object v1, p0, Ll1/k;->a:Lg0/z;

    .line 125
    .line 126
    iget v2, p0, Ll1/k;->o:I

    .line 127
    .line 128
    :goto_3
    invoke-interface {v0, v1, v2}, LF0/T;->e(Lg0/z;I)V

    .line 129
    .line 130
    .line 131
    :goto_4
    iput v3, p0, Ll1/k;->g:I

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :pswitch_2
    iget-object v0, p0, Ll1/k;->a:Lg0/z;

    .line 135
    .line 136
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-direct {p0, p1, v0, v3}, Ll1/k;->f(Lg0/z;[BI)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_0

    .line 145
    .line 146
    iget-object v0, p0, Ll1/k;->a:Lg0/z;

    .line 147
    .line 148
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0}, LF0/p;->l([B)I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    iput v0, p0, Ll1/k;->o:I

    .line 157
    .line 158
    iget v1, p0, Ll1/k;->h:I

    .line 159
    .line 160
    if-le v1, v0, :cond_3

    .line 161
    .line 162
    sub-int v0, v1, v0

    .line 163
    .line 164
    sub-int/2addr v1, v0

    .line 165
    iput v1, p0, Ll1/k;->h:I

    .line 166
    .line 167
    invoke-virtual {p1}, Lg0/z;->f()I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    sub-int/2addr v1, v0

    .line 172
    invoke-virtual {p1, v1}, Lg0/z;->T(I)V

    .line 173
    .line 174
    .line 175
    :cond_3
    const/4 v0, 0x5

    .line 176
    :goto_5
    iput v0, p0, Ll1/k;->g:I

    .line 177
    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :pswitch_3
    iget-object v0, p0, Ll1/k;->a:Lg0/z;

    .line 181
    .line 182
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    iget v1, p0, Ll1/k;->n:I

    .line 187
    .line 188
    invoke-direct {p0, p1, v0, v1}, Ll1/k;->f(Lg0/z;[BI)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_0

    .line 193
    .line 194
    invoke-virtual {p0}, Ll1/k;->h()V

    .line 195
    .line 196
    .line 197
    iget-object v0, p0, Ll1/k;->a:Lg0/z;

    .line 198
    .line 199
    invoke-virtual {v0, v5}, Lg0/z;->T(I)V

    .line 200
    .line 201
    .line 202
    iget-object v0, p0, Ll1/k;->f:LF0/T;

    .line 203
    .line 204
    iget-object v1, p0, Ll1/k;->a:Lg0/z;

    .line 205
    .line 206
    iget v2, p0, Ll1/k;->n:I

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :pswitch_4
    iget-object v0, p0, Ll1/k;->a:Lg0/z;

    .line 210
    .line 211
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    const/4 v2, 0x7

    .line 216
    invoke-direct {p0, p1, v0, v2}, Ll1/k;->f(Lg0/z;[BI)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_0

    .line 221
    .line 222
    iget-object v0, p0, Ll1/k;->a:Lg0/z;

    .line 223
    .line 224
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-static {v0}, LF0/p;->j([B)I

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    iput v0, p0, Ll1/k;->n:I

    .line 233
    .line 234
    iput v1, p0, Ll1/k;->g:I

    .line 235
    .line 236
    goto/16 :goto_0

    .line 237
    .line 238
    :pswitch_5
    iget-object v0, p0, Ll1/k;->a:Lg0/z;

    .line 239
    .line 240
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    const/16 v1, 0x12

    .line 245
    .line 246
    invoke-direct {p0, p1, v0, v1}, Ll1/k;->f(Lg0/z;[BI)Z

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    if-eqz v0, :cond_0

    .line 251
    .line 252
    invoke-virtual {p0}, Ll1/k;->g()V

    .line 253
    .line 254
    .line 255
    iget-object v0, p0, Ll1/k;->a:Lg0/z;

    .line 256
    .line 257
    invoke-virtual {v0, v5}, Lg0/z;->T(I)V

    .line 258
    .line 259
    .line 260
    iget-object v0, p0, Ll1/k;->f:LF0/T;

    .line 261
    .line 262
    iget-object v2, p0, Ll1/k;->a:Lg0/z;

    .line 263
    .line 264
    invoke-interface {v0, v2, v1}, LF0/T;->e(Lg0/z;I)V

    .line 265
    .line 266
    .line 267
    goto/16 :goto_4

    .line 268
    .line 269
    :pswitch_6
    invoke-virtual {p0, p1}, Ll1/k;->j(Lg0/z;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_0

    .line 274
    .line 275
    iget v0, p0, Ll1/k;->m:I

    .line 276
    .line 277
    if-eq v0, v1, :cond_6

    .line 278
    .line 279
    if-ne v0, v2, :cond_4

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_4
    if-ne v0, v4, :cond_5

    .line 283
    .line 284
    iput v4, p0, Ll1/k;->g:I

    .line 285
    .line 286
    goto/16 :goto_0

    .line 287
    .line 288
    :cond_5
    const/4 v0, 0x2

    .line 289
    goto :goto_5

    .line 290
    :cond_6
    :goto_6
    iput v2, p0, Ll1/k;->g:I

    .line 291
    .line 292
    goto/16 :goto_0

    .line 293
    .line 294
    :cond_7
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ll1/k;->g:I

    .line 3
    .line 4
    iput v0, p0, Ll1/k;->h:I

    .line 5
    .line 6
    iput v0, p0, Ll1/k;->i:I

    .line 7
    .line 8
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v1, p0, Ll1/k;->p:J

    .line 14
    .line 15
    iget-object v1, p0, Ll1/k;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public d(JI)V
    .locals 0

    .line 1
    iput-wide p1, p0, Ll1/k;->p:J

    .line 2
    .line 3
    return-void
.end method

.method public e(LF0/t;Ll1/K$d;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ll1/K$d;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ll1/K$d;->b()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Ll1/k;->e:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p2}, Ll1/K$d;->c()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-interface {p1, p2, v0}, LF0/t;->a(II)LF0/T;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Ll1/k;->f:LF0/T;

    .line 20
    .line 21
    return-void
.end method

.method public final g()V
    .locals 5

    .line 1
    iget-object v0, p0, Ll1/k;->a:Lg0/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Ll1/k;->k:Ld0/q;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Ll1/k;->e:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v2, p0, Ll1/k;->c:Ljava/lang/String;

    .line 14
    .line 15
    iget v3, p0, Ll1/k;->d:I

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-static {v0, v1, v2, v3, v4}, LF0/p;->h([BLjava/lang/String;Ljava/lang/String;ILd0/m;)Ld0/q;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iput-object v1, p0, Ll1/k;->k:Ld0/q;

    .line 23
    .line 24
    iget-object v2, p0, Ll1/k;->f:LF0/T;

    .line 25
    .line 26
    invoke-interface {v2, v1}, LF0/T;->d(Ld0/q;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-static {v0}, LF0/p;->b([B)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iput v1, p0, Ll1/k;->l:I

    .line 34
    .line 35
    invoke-static {v0}, LF0/p;->g([B)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    int-to-long v0, v0

    .line 40
    iget-object v2, p0, Ll1/k;->k:Ld0/q;

    .line 41
    .line 42
    iget v2, v2, Ld0/q;->C:I

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, Lg0/M;->V0(JI)J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    invoke-static {v0, v1}, La3/f;->d(J)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    int-to-long v0, v0

    .line 53
    iput-wide v0, p0, Ll1/k;->j:J

    .line 54
    .line 55
    return-void
.end method

.method public final h()V
    .locals 4

    .line 1
    iget-object v0, p0, Ll1/k;->a:Lg0/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, LF0/p;->i([B)LF0/p$b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Ll1/k;->k(LF0/p$b;)V

    .line 12
    .line 13
    .line 14
    iget v1, v0, LF0/p$b;->d:I

    .line 15
    .line 16
    iput v1, p0, Ll1/k;->l:I

    .line 17
    .line 18
    iget-wide v0, v0, LF0/p$b;->e:J

    .line 19
    .line 20
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmp-long v2, v0, v2

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    const-wide/16 v0, 0x0

    .line 30
    .line 31
    :cond_0
    iput-wide v0, p0, Ll1/k;->j:J

    .line 32
    .line 33
    return-void
.end method

.method public final i()V
    .locals 4

    .line 1
    iget-object v0, p0, Ll1/k;->a:Lg0/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Ll1/k;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    invoke-static {v0, v1}, LF0/p;->k([BLjava/util/concurrent/atomic/AtomicInteger;)LF0/p$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v1, p0, Ll1/k;->m:I

    .line 14
    .line 15
    const/4 v2, 0x3

    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ll1/k;->k(LF0/p$b;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget v1, v0, LF0/p$b;->d:I

    .line 22
    .line 23
    iput v1, p0, Ll1/k;->l:I

    .line 24
    .line 25
    iget-wide v0, v0, LF0/p$b;->e:J

    .line 26
    .line 27
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    cmp-long v2, v0, v2

    .line 33
    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    const-wide/16 v0, 0x0

    .line 37
    .line 38
    :cond_1
    iput-wide v0, p0, Ll1/k;->j:J

    .line 39
    .line 40
    return-void
.end method

.method public final j(Lg0/z;)Z
    .locals 5

    .line 1
    :cond_0
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-lez v0, :cond_1

    .line 7
    .line 8
    iget v0, p0, Ll1/k;->i:I

    .line 9
    .line 10
    shl-int/lit8 v0, v0, 0x8

    .line 11
    .line 12
    iput v0, p0, Ll1/k;->i:I

    .line 13
    .line 14
    invoke-virtual {p1}, Lg0/z;->G()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    or-int/2addr v0, v2

    .line 19
    iput v0, p0, Ll1/k;->i:I

    .line 20
    .line 21
    invoke-static {v0}, LF0/p;->c(I)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iput v0, p0, Ll1/k;->m:I

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object p1, p0, Ll1/k;->a:Lg0/z;

    .line 30
    .line 31
    invoke-virtual {p1}, Lg0/z;->e()[B

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget v0, p0, Ll1/k;->i:I

    .line 36
    .line 37
    shr-int/lit8 v2, v0, 0x18

    .line 38
    .line 39
    and-int/lit16 v2, v2, 0xff

    .line 40
    .line 41
    int-to-byte v2, v2

    .line 42
    aput-byte v2, p1, v1

    .line 43
    .line 44
    shr-int/lit8 v2, v0, 0x10

    .line 45
    .line 46
    and-int/lit16 v2, v2, 0xff

    .line 47
    .line 48
    int-to-byte v2, v2

    .line 49
    const/4 v3, 0x1

    .line 50
    aput-byte v2, p1, v3

    .line 51
    .line 52
    shr-int/lit8 v2, v0, 0x8

    .line 53
    .line 54
    and-int/lit16 v2, v2, 0xff

    .line 55
    .line 56
    int-to-byte v2, v2

    .line 57
    const/4 v4, 0x2

    .line 58
    aput-byte v2, p1, v4

    .line 59
    .line 60
    and-int/lit16 v0, v0, 0xff

    .line 61
    .line 62
    int-to-byte v0, v0

    .line 63
    const/4 v2, 0x3

    .line 64
    aput-byte v0, p1, v2

    .line 65
    .line 66
    const/4 p1, 0x4

    .line 67
    iput p1, p0, Ll1/k;->h:I

    .line 68
    .line 69
    iput v1, p0, Ll1/k;->i:I

    .line 70
    .line 71
    return v3

    .line 72
    :cond_1
    return v1
.end method

.method public final k(LF0/p$b;)V
    .locals 4

    .line 1
    iget v0, p1, LF0/p$b;->b:I

    .line 2
    .line 3
    const v1, -0x7fffffff

    .line 4
    .line 5
    .line 6
    if-eq v0, v1, :cond_3

    .line 7
    .line 8
    iget v1, p1, LF0/p$b;->c:I

    .line 9
    .line 10
    const/4 v2, -0x1

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object v2, p0, Ll1/k;->k:Ld0/q;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget v3, v2, Ld0/q;->B:I

    .line 19
    .line 20
    if-ne v1, v3, :cond_1

    .line 21
    .line 22
    iget v1, v2, Ld0/q;->C:I

    .line 23
    .line 24
    if-ne v0, v1, :cond_1

    .line 25
    .line 26
    iget-object v0, p1, LF0/p$b;->a:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v1, v2, Ld0/q;->n:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1}, Lg0/M;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, Ll1/k;->k:Ld0/q;

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    new-instance v0, Ld0/q$b;

    .line 41
    .line 42
    invoke-direct {v0}, Ld0/q$b;-><init>()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-virtual {v0}, Ld0/q;->a()Ld0/q$b;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :goto_0
    iget-object v1, p0, Ll1/k;->e:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ld0/q$b;->a0(Ljava/lang/String;)Ld0/q$b;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-object v1, p1, LF0/p$b;->a:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget v1, p1, LF0/p$b;->c:I

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ld0/q$b;->N(I)Ld0/q$b;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget p1, p1, LF0/p$b;->b:I

    .line 69
    .line 70
    invoke-virtual {v0, p1}, Ld0/q$b;->p0(I)Ld0/q$b;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget-object v0, p0, Ll1/k;->c:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Ld0/q$b;->e0(Ljava/lang/String;)Ld0/q$b;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iget v0, p0, Ll1/k;->d:I

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Ld0/q$b;->m0(I)Ld0/q$b;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p1}, Ld0/q$b;->K()Ld0/q;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iput-object p1, p0, Ll1/k;->k:Ld0/q;

    .line 91
    .line 92
    iget-object v0, p0, Ll1/k;->f:LF0/T;

    .line 93
    .line 94
    invoke-interface {v0, p1}, LF0/T;->d(Ld0/q;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    :goto_1
    return-void
.end method
