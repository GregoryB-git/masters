.class public final LH0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH0/b$c;,
        LH0/b$b;
    }
.end annotation


# instance fields
.field public final a:Lg0/z;

.field public final b:LH0/b$c;

.field public final c:Z

.field public final d:Lc1/t$a;

.field public e:I

.field public f:LF0/t;

.field public g:LH0/c;

.field public h:J

.field public i:[LH0/e;

.field public j:J

.field public k:LH0/e;

.field public l:I

.field public m:J

.field public n:J

.field public o:I

.field public p:Z


# direct methods
.method public constructor <init>(ILc1/t$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LH0/b;->d:Lc1/t$a;

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    and-int/2addr p1, p2

    .line 8
    const/4 v0, 0x0

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move p2, v0

    .line 13
    :goto_0
    iput-boolean p2, p0, LH0/b;->c:Z

    .line 14
    .line 15
    new-instance p1, Lg0/z;

    .line 16
    .line 17
    const/16 p2, 0xc

    .line 18
    .line 19
    invoke-direct {p1, p2}, Lg0/z;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, LH0/b;->a:Lg0/z;

    .line 23
    .line 24
    new-instance p1, LH0/b$c;

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-direct {p1, p2}, LH0/b$c;-><init>(LH0/b$a;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, LH0/b;->b:LH0/b$c;

    .line 31
    .line 32
    new-instance p1, LF0/J;

    .line 33
    .line 34
    invoke-direct {p1}, LF0/J;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, LH0/b;->f:LF0/t;

    .line 38
    .line 39
    new-array p1, v0, [LH0/e;

    .line 40
    .line 41
    iput-object p1, p0, LH0/b;->i:[LH0/e;

    .line 42
    .line 43
    const-wide/16 p1, -0x1

    .line 44
    .line 45
    iput-wide p1, p0, LH0/b;->m:J

    .line 46
    .line 47
    iput-wide p1, p0, LH0/b;->n:J

    .line 48
    .line 49
    const/4 p1, -0x1

    .line 50
    iput p1, p0, LH0/b;->l:I

    .line 51
    .line 52
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    iput-wide p1, p0, LH0/b;->h:J

    .line 58
    .line 59
    return-void
.end method

.method public static synthetic c(LH0/b;)[LH0/e;
    .locals 0

    .line 1
    iget-object p0, p0, LH0/b;->i:[LH0/e;

    .line 2
    .line 3
    return-object p0
.end method

.method public static f(LF0/s;)V
    .locals 4

    .line 1
    invoke-interface {p0}, LF0/s;->p()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    and-long/2addr v0, v2

    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-interface {p0, v0}, LF0/s;->i(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method


# virtual methods
.method public a(JJ)V
    .locals 3

    .line 1
    const-wide/16 p3, -0x1

    .line 2
    .line 3
    iput-wide p3, p0, LH0/b;->j:J

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    iput-object p3, p0, LH0/b;->k:LH0/e;

    .line 7
    .line 8
    iget-object p3, p0, LH0/b;->i:[LH0/e;

    .line 9
    .line 10
    array-length p4, p3

    .line 11
    const/4 v0, 0x0

    .line 12
    move v1, v0

    .line 13
    :goto_0
    if-ge v1, p4, :cond_0

    .line 14
    .line 15
    aget-object v2, p3, v1

    .line 16
    .line 17
    invoke-virtual {v2, p1, p2}, LH0/e;->o(J)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-wide/16 p3, 0x0

    .line 24
    .line 25
    cmp-long p1, p1, p3

    .line 26
    .line 27
    if-nez p1, :cond_2

    .line 28
    .line 29
    iget-object p1, p0, LH0/b;->i:[LH0/e;

    .line 30
    .line 31
    array-length p1, p1

    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    iput v0, p0, LH0/b;->e:I

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    const/4 p1, 0x3

    .line 38
    iput p1, p0, LH0/b;->e:I

    .line 39
    .line 40
    :goto_1
    return-void

    .line 41
    :cond_2
    const/4 p1, 0x6

    .line 42
    iput p1, p0, LH0/b;->e:I

    .line 43
    .line 44
    return-void
.end method

.method public b(LF0/t;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LH0/b;->e:I

    .line 3
    .line 4
    iget-boolean v0, p0, LH0/b;->c:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lc1/v;

    .line 9
    .line 10
    iget-object v1, p0, LH0/b;->d:Lc1/t$a;

    .line 11
    .line 12
    invoke-direct {v0, p1, v1}, Lc1/v;-><init>(LF0/t;Lc1/t$a;)V

    .line 13
    .line 14
    .line 15
    move-object p1, v0

    .line 16
    :cond_0
    iput-object p1, p0, LH0/b;->f:LF0/t;

    .line 17
    .line 18
    const-wide/16 v0, -0x1

    .line 19
    .line 20
    iput-wide v0, p0, LH0/b;->j:J

    .line 21
    .line 22
    return-void
.end method

.method public synthetic d()LF0/r;
    .locals 1

    .line 1
    invoke-static {p0}, LF0/q;->b(LF0/r;)LF0/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public e(LF0/s;)Z
    .locals 3

    .line 1
    iget-object v0, p0, LH0/b;->a:Lg0/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0xc

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-interface {p1, v0, v2, v1}, LF0/s;->n([BII)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, LH0/b;->a:Lg0/z;

    .line 14
    .line 15
    invoke-virtual {p1, v2}, Lg0/z;->T(I)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, LH0/b;->a:Lg0/z;

    .line 19
    .line 20
    invoke-virtual {p1}, Lg0/z;->t()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const v0, 0x46464952

    .line 25
    .line 26
    .line 27
    if-eq p1, v0, :cond_0

    .line 28
    .line 29
    return v2

    .line 30
    :cond_0
    iget-object p1, p0, LH0/b;->a:Lg0/z;

    .line 31
    .line 32
    const/4 v0, 0x4

    .line 33
    invoke-virtual {p1, v0}, Lg0/z;->U(I)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, LH0/b;->a:Lg0/z;

    .line 37
    .line 38
    invoke-virtual {p1}, Lg0/z;->t()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    const v0, 0x20495641

    .line 43
    .line 44
    .line 45
    if-ne p1, v0, :cond_1

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    :cond_1
    return v2
.end method

.method public synthetic g()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {p0}, LF0/q;->a(LF0/r;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final h(I)LH0/e;
    .locals 5

    .line 1
    iget-object v0, p0, LH0/b;->i:[LH0/e;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3, p1}, LH0/e;->j(I)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    return-object v3

    .line 16
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    return-object p1
.end method

.method public i(LF0/s;LF0/L;)I
    .locals 12

    .line 1
    invoke-virtual {p0, p1, p2}, LH0/b;->o(LF0/s;LF0/L;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    iget p2, p0, LH0/b;->e:I

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x4

    .line 13
    const/4 v3, 0x6

    .line 14
    const/16 v4, 0xc

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    packed-switch p2, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    new-instance p1, Ljava/lang/AssertionError;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :pswitch_0
    invoke-virtual {p0, p1}, LH0/b;->n(LF0/s;)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :pswitch_1
    new-instance p2, Lg0/z;

    .line 32
    .line 33
    iget v0, p0, LH0/b;->o:I

    .line 34
    .line 35
    invoke-direct {p2, v0}, Lg0/z;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Lg0/z;->e()[B

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget v1, p0, LH0/b;->o:I

    .line 43
    .line 44
    invoke-interface {p1, v0, v5, v1}, LF0/s;->readFully([BII)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p2}, LH0/b;->k(Lg0/z;)V

    .line 48
    .line 49
    .line 50
    iput v3, p0, LH0/b;->e:I

    .line 51
    .line 52
    iget-wide p1, p0, LH0/b;->m:J

    .line 53
    .line 54
    iput-wide p1, p0, LH0/b;->j:J

    .line 55
    .line 56
    return v5

    .line 57
    :pswitch_2
    iget-object p2, p0, LH0/b;->a:Lg0/z;

    .line 58
    .line 59
    invoke-virtual {p2}, Lg0/z;->e()[B

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    const/16 v0, 0x8

    .line 64
    .line 65
    invoke-interface {p1, p2, v5, v0}, LF0/s;->readFully([BII)V

    .line 66
    .line 67
    .line 68
    iget-object p2, p0, LH0/b;->a:Lg0/z;

    .line 69
    .line 70
    invoke-virtual {p2, v5}, Lg0/z;->T(I)V

    .line 71
    .line 72
    .line 73
    iget-object p2, p0, LH0/b;->a:Lg0/z;

    .line 74
    .line 75
    invoke-virtual {p2}, Lg0/z;->t()I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    iget-object v0, p0, LH0/b;->a:Lg0/z;

    .line 80
    .line 81
    invoke-virtual {v0}, Lg0/z;->t()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    const v1, 0x31786469

    .line 86
    .line 87
    .line 88
    if-ne p2, v1, :cond_1

    .line 89
    .line 90
    const/4 p1, 0x5

    .line 91
    iput p1, p0, LH0/b;->e:I

    .line 92
    .line 93
    iput v0, p0, LH0/b;->o:I

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    invoke-interface {p1}, LF0/s;->p()J

    .line 97
    .line 98
    .line 99
    move-result-wide p1

    .line 100
    int-to-long v0, v0

    .line 101
    add-long/2addr p1, v0

    .line 102
    iput-wide p1, p0, LH0/b;->j:J

    .line 103
    .line 104
    :goto_0
    return v5

    .line 105
    :pswitch_3
    iget-wide v6, p0, LH0/b;->m:J

    .line 106
    .line 107
    const-wide/16 v8, -0x1

    .line 108
    .line 109
    cmp-long p2, v6, v8

    .line 110
    .line 111
    if-eqz p2, :cond_2

    .line 112
    .line 113
    invoke-interface {p1}, LF0/s;->p()J

    .line 114
    .line 115
    .line 116
    move-result-wide v6

    .line 117
    iget-wide v8, p0, LH0/b;->m:J

    .line 118
    .line 119
    cmp-long p2, v6, v8

    .line 120
    .line 121
    if-eqz p2, :cond_2

    .line 122
    .line 123
    iput-wide v8, p0, LH0/b;->j:J

    .line 124
    .line 125
    return v5

    .line 126
    :cond_2
    iget-object p2, p0, LH0/b;->a:Lg0/z;

    .line 127
    .line 128
    invoke-virtual {p2}, Lg0/z;->e()[B

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-interface {p1, p2, v5, v4}, LF0/s;->n([BII)V

    .line 133
    .line 134
    .line 135
    invoke-interface {p1}, LF0/s;->h()V

    .line 136
    .line 137
    .line 138
    iget-object p2, p0, LH0/b;->a:Lg0/z;

    .line 139
    .line 140
    invoke-virtual {p2, v5}, Lg0/z;->T(I)V

    .line 141
    .line 142
    .line 143
    iget-object p2, p0, LH0/b;->b:LH0/b$c;

    .line 144
    .line 145
    iget-object v1, p0, LH0/b;->a:Lg0/z;

    .line 146
    .line 147
    invoke-virtual {p2, v1}, LH0/b$c;->a(Lg0/z;)V

    .line 148
    .line 149
    .line 150
    iget-object p2, p0, LH0/b;->a:Lg0/z;

    .line 151
    .line 152
    invoke-virtual {p2}, Lg0/z;->t()I

    .line 153
    .line 154
    .line 155
    move-result p2

    .line 156
    iget-object v1, p0, LH0/b;->b:LH0/b$c;

    .line 157
    .line 158
    iget v1, v1, LH0/b$c;->a:I

    .line 159
    .line 160
    const v6, 0x46464952

    .line 161
    .line 162
    .line 163
    if-ne v1, v6, :cond_3

    .line 164
    .line 165
    invoke-interface {p1, v4}, LF0/s;->i(I)V

    .line 166
    .line 167
    .line 168
    return v5

    .line 169
    :cond_3
    const v4, 0x5453494c

    .line 170
    .line 171
    .line 172
    const-wide/16 v6, 0x8

    .line 173
    .line 174
    if-ne v1, v4, :cond_7

    .line 175
    .line 176
    const v1, 0x69766f6d

    .line 177
    .line 178
    .line 179
    if-eq p2, v1, :cond_4

    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_4
    invoke-interface {p1}, LF0/s;->p()J

    .line 183
    .line 184
    .line 185
    move-result-wide v8

    .line 186
    iput-wide v8, p0, LH0/b;->m:J

    .line 187
    .line 188
    iget-object p2, p0, LH0/b;->b:LH0/b$c;

    .line 189
    .line 190
    iget p2, p2, LH0/b$c;->b:I

    .line 191
    .line 192
    int-to-long v10, p2

    .line 193
    add-long/2addr v8, v10

    .line 194
    add-long/2addr v8, v6

    .line 195
    iput-wide v8, p0, LH0/b;->n:J

    .line 196
    .line 197
    iget-boolean p2, p0, LH0/b;->p:Z

    .line 198
    .line 199
    if-nez p2, :cond_6

    .line 200
    .line 201
    iget-object p2, p0, LH0/b;->g:LH0/c;

    .line 202
    .line 203
    invoke-static {p2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    check-cast p2, LH0/c;

    .line 208
    .line 209
    invoke-virtual {p2}, LH0/c;->b()Z

    .line 210
    .line 211
    .line 212
    move-result p2

    .line 213
    if-eqz p2, :cond_5

    .line 214
    .line 215
    iput v2, p0, LH0/b;->e:I

    .line 216
    .line 217
    iget-wide p1, p0, LH0/b;->n:J

    .line 218
    .line 219
    iput-wide p1, p0, LH0/b;->j:J

    .line 220
    .line 221
    return v5

    .line 222
    :cond_5
    iget-object p2, p0, LH0/b;->f:LF0/t;

    .line 223
    .line 224
    new-instance v1, LF0/M$b;

    .line 225
    .line 226
    iget-wide v6, p0, LH0/b;->h:J

    .line 227
    .line 228
    invoke-direct {v1, v6, v7}, LF0/M$b;-><init>(J)V

    .line 229
    .line 230
    .line 231
    invoke-interface {p2, v1}, LF0/t;->e(LF0/M;)V

    .line 232
    .line 233
    .line 234
    iput-boolean v0, p0, LH0/b;->p:Z

    .line 235
    .line 236
    :cond_6
    invoke-interface {p1}, LF0/s;->p()J

    .line 237
    .line 238
    .line 239
    move-result-wide p1

    .line 240
    const-wide/16 v0, 0xc

    .line 241
    .line 242
    add-long/2addr p1, v0

    .line 243
    iput-wide p1, p0, LH0/b;->j:J

    .line 244
    .line 245
    iput v3, p0, LH0/b;->e:I

    .line 246
    .line 247
    return v5

    .line 248
    :cond_7
    :goto_1
    invoke-interface {p1}, LF0/s;->p()J

    .line 249
    .line 250
    .line 251
    move-result-wide p1

    .line 252
    iget-object v0, p0, LH0/b;->b:LH0/b$c;

    .line 253
    .line 254
    iget v0, v0, LH0/b$c;->b:I

    .line 255
    .line 256
    int-to-long v0, v0

    .line 257
    add-long/2addr p1, v0

    .line 258
    add-long/2addr p1, v6

    .line 259
    iput-wide p1, p0, LH0/b;->j:J

    .line 260
    .line 261
    return v5

    .line 262
    :pswitch_4
    iget p2, p0, LH0/b;->l:I

    .line 263
    .line 264
    sub-int/2addr p2, v2

    .line 265
    new-instance v0, Lg0/z;

    .line 266
    .line 267
    invoke-direct {v0, p2}, Lg0/z;-><init>(I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    invoke-interface {p1, v1, v5, p2}, LF0/s;->readFully([BII)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {p0, v0}, LH0/b;->j(Lg0/z;)V

    .line 278
    .line 279
    .line 280
    const/4 p1, 0x3

    .line 281
    iput p1, p0, LH0/b;->e:I

    .line 282
    .line 283
    return v5

    .line 284
    :pswitch_5
    iget-object p2, p0, LH0/b;->a:Lg0/z;

    .line 285
    .line 286
    invoke-virtual {p2}, Lg0/z;->e()[B

    .line 287
    .line 288
    .line 289
    move-result-object p2

    .line 290
    invoke-interface {p1, p2, v5, v4}, LF0/s;->readFully([BII)V

    .line 291
    .line 292
    .line 293
    iget-object p1, p0, LH0/b;->a:Lg0/z;

    .line 294
    .line 295
    invoke-virtual {p1, v5}, Lg0/z;->T(I)V

    .line 296
    .line 297
    .line 298
    iget-object p1, p0, LH0/b;->b:LH0/b$c;

    .line 299
    .line 300
    iget-object p2, p0, LH0/b;->a:Lg0/z;

    .line 301
    .line 302
    invoke-virtual {p1, p2}, LH0/b$c;->b(Lg0/z;)V

    .line 303
    .line 304
    .line 305
    iget-object p1, p0, LH0/b;->b:LH0/b$c;

    .line 306
    .line 307
    iget p2, p1, LH0/b$c;->c:I

    .line 308
    .line 309
    const v0, 0x6c726468

    .line 310
    .line 311
    .line 312
    if-ne p2, v0, :cond_8

    .line 313
    .line 314
    iget p1, p1, LH0/b$c;->b:I

    .line 315
    .line 316
    iput p1, p0, LH0/b;->l:I

    .line 317
    .line 318
    const/4 p1, 0x2

    .line 319
    iput p1, p0, LH0/b;->e:I

    .line 320
    .line 321
    return v5

    .line 322
    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    .line 323
    .line 324
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 325
    .line 326
    .line 327
    const-string p2, "hdrl expected, found: "

    .line 328
    .line 329
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    iget-object p2, p0, LH0/b;->b:LH0/b$c;

    .line 333
    .line 334
    iget p2, p2, LH0/b$c;->c:I

    .line 335
    .line 336
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    invoke-static {p1, v1}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 344
    .line 345
    .line 346
    move-result-object p1

    .line 347
    throw p1

    .line 348
    :pswitch_6
    invoke-virtual {p0, p1}, LH0/b;->e(LF0/s;)Z

    .line 349
    .line 350
    .line 351
    move-result p2

    .line 352
    if-eqz p2, :cond_9

    .line 353
    .line 354
    invoke-interface {p1, v4}, LF0/s;->i(I)V

    .line 355
    .line 356
    .line 357
    iput v0, p0, LH0/b;->e:I

    .line 358
    .line 359
    return v5

    .line 360
    :cond_9
    const-string p1, "AVI Header List not found"

    .line 361
    .line 362
    invoke-static {p1, v1}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    throw p1

    .line 367
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

.method public final j(Lg0/z;)V
    .locals 6

    .line 1
    const v0, 0x6c726468

    .line 2
    .line 3
    .line 4
    invoke-static {v0, p1}, LH0/f;->d(ILg0/z;)LH0/f;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, LH0/f;->a()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-ne v1, v0, :cond_4

    .line 14
    .line 15
    const-class v0, LH0/c;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, LH0/f;->c(Ljava/lang/Class;)LH0/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, LH0/c;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    iput-object v0, p0, LH0/b;->g:LH0/c;

    .line 26
    .line 27
    iget v1, v0, LH0/c;->c:I

    .line 28
    .line 29
    int-to-long v1, v1

    .line 30
    iget v0, v0, LH0/c;->a:I

    .line 31
    .line 32
    int-to-long v3, v0

    .line 33
    mul-long/2addr v1, v3

    .line 34
    iput-wide v1, p0, LH0/b;->h:J

    .line 35
    .line 36
    new-instance v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iget-object p1, p1, LH0/f;->a:LX2/v;

    .line 42
    .line 43
    invoke-virtual {p1}, LX2/v;->q()LX2/g0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const/4 v1, 0x0

    .line 48
    move v2, v1

    .line 49
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, LH0/a;

    .line 60
    .line 61
    invoke-interface {v3}, LH0/a;->a()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    const v5, 0x6c727473

    .line 66
    .line 67
    .line 68
    if-ne v4, v5, :cond_0

    .line 69
    .line 70
    check-cast v3, LH0/f;

    .line 71
    .line 72
    add-int/lit8 v4, v2, 0x1

    .line 73
    .line 74
    invoke-virtual {p0, v3, v2}, LH0/b;->m(LH0/f;I)LH0/e;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    if-eqz v2, :cond_1

    .line 79
    .line 80
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    :cond_1
    move v2, v4

    .line 84
    goto :goto_0

    .line 85
    :cond_2
    new-array p1, v1, [LH0/e;

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, [LH0/e;

    .line 92
    .line 93
    iput-object p1, p0, LH0/b;->i:[LH0/e;

    .line 94
    .line 95
    iget-object p1, p0, LH0/b;->f:LF0/t;

    .line 96
    .line 97
    invoke-interface {p1}, LF0/t;->j()V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_3
    const-string p1, "AviHeader not found"

    .line 102
    .line 103
    invoke-static {p1, v2}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    throw p1

    .line 108
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string v1, "Unexpected header list type "

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, LH0/f;->a()I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {p1, v2}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    throw p1
.end method

.method public final k(Lg0/z;)V
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, LH0/b;->l(Lg0/z;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    :goto_0
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v3, 0x10

    .line 10
    .line 11
    if-lt v2, v3, :cond_2

    .line 12
    .line 13
    invoke-virtual {p1}, Lg0/z;->t()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {p1}, Lg0/z;->t()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-virtual {p1}, Lg0/z;->t()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    int-to-long v5, v5

    .line 26
    add-long/2addr v5, v0

    .line 27
    invoke-virtual {p1}, Lg0/z;->t()I

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v2}, LH0/b;->h(I)LH0/e;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    and-int/2addr v4, v3

    .line 38
    if-ne v4, v3, :cond_1

    .line 39
    .line 40
    invoke-virtual {v2, v5, v6}, LH0/e;->b(J)V

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {v2}, LH0/e;->k()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    iget-object p1, p0, LH0/b;->i:[LH0/e;

    .line 48
    .line 49
    array-length v0, p1

    .line 50
    const/4 v1, 0x0

    .line 51
    :goto_1
    if-ge v1, v0, :cond_3

    .line 52
    .line 53
    aget-object v2, p1, v1

    .line 54
    .line 55
    invoke-virtual {v2}, LH0/e;->c()V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    const/4 p1, 0x1

    .line 62
    iput-boolean p1, p0, LH0/b;->p:Z

    .line 63
    .line 64
    iget-object p1, p0, LH0/b;->f:LF0/t;

    .line 65
    .line 66
    new-instance v0, LH0/b$b;

    .line 67
    .line 68
    iget-wide v1, p0, LH0/b;->h:J

    .line 69
    .line 70
    invoke-direct {v0, p0, v1, v2}, LH0/b$b;-><init>(LH0/b;J)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p1, v0}, LF0/t;->e(LF0/M;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final l(Lg0/z;)J
    .locals 8

    .line 1
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x10

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    return-wide v2

    .line 12
    :cond_0
    invoke-virtual {p1}, Lg0/z;->f()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v1, 0x8

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Lg0/z;->U(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lg0/z;->t()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    int-to-long v4, v1

    .line 26
    iget-wide v6, p0, LH0/b;->m:J

    .line 27
    .line 28
    cmp-long v1, v4, v6

    .line 29
    .line 30
    if-lez v1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const-wide/16 v1, 0x8

    .line 34
    .line 35
    add-long v2, v6, v1

    .line 36
    .line 37
    :goto_0
    invoke-virtual {p1, v0}, Lg0/z;->T(I)V

    .line 38
    .line 39
    .line 40
    return-wide v2
.end method

.method public final m(LH0/f;I)LH0/e;
    .locals 13

    .line 1
    const-class v0, LH0/d;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LH0/f;->c(Ljava/lang/Class;)LH0/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LH0/d;

    .line 8
    .line 9
    const-class v1, LH0/g;

    .line 10
    .line 11
    invoke-virtual {p1, v1}, LH0/f;->c(Ljava/lang/Class;)LH0/a;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, LH0/g;

    .line 16
    .line 17
    const-string v2, "AviExtractor"

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const-string p1, "Missing Stream Header"

    .line 23
    .line 24
    :goto_0
    invoke-static {v2, p1}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v3

    .line 28
    :cond_0
    if-nez v1, :cond_1

    .line 29
    .line 30
    const-string p1, "Missing Stream Format"

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v0}, LH0/d;->b()J

    .line 34
    .line 35
    .line 36
    move-result-wide v11

    .line 37
    iget-object v1, v1, LH0/g;->a:Ld0/q;

    .line 38
    .line 39
    invoke-virtual {v1}, Ld0/q;->a()Ld0/q$b;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2, p2}, Ld0/q$b;->Z(I)Ld0/q$b;

    .line 44
    .line 45
    .line 46
    iget v4, v0, LH0/d;->f:I

    .line 47
    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    invoke-virtual {v2, v4}, Ld0/q$b;->f0(I)Ld0/q$b;

    .line 51
    .line 52
    .line 53
    :cond_2
    const-class v4, LH0/h;

    .line 54
    .line 55
    invoke-virtual {p1, v4}, LH0/f;->c(Ljava/lang/Class;)LH0/a;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, LH0/h;

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    iget-object p1, p1, LH0/h;->a:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v2, p1}, Ld0/q$b;->c0(Ljava/lang/String;)Ld0/q$b;

    .line 66
    .line 67
    .line 68
    :cond_3
    iget-object p1, v1, Ld0/q;->n:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {p1}, Ld0/z;->k(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    const/4 p1, 0x1

    .line 75
    if-eq v6, p1, :cond_5

    .line 76
    .line 77
    const/4 p1, 0x2

    .line 78
    if-ne v6, p1, :cond_4

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    return-object v3

    .line 82
    :cond_5
    :goto_1
    iget-object p1, p0, LH0/b;->f:LF0/t;

    .line 83
    .line 84
    invoke-interface {p1, p2, v6}, LF0/t;->a(II)LF0/T;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    invoke-virtual {v2}, Ld0/q$b;->K()Ld0/q;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-interface {v10, p1}, LF0/T;->d(Ld0/q;)V

    .line 93
    .line 94
    .line 95
    new-instance p1, LH0/e;

    .line 96
    .line 97
    iget v9, v0, LH0/d;->e:I

    .line 98
    .line 99
    move-object v4, p1

    .line 100
    move v5, p2

    .line 101
    move-wide v7, v11

    .line 102
    invoke-direct/range {v4 .. v10}, LH0/e;-><init>(IIJILF0/T;)V

    .line 103
    .line 104
    .line 105
    iput-wide v11, p0, LH0/b;->h:J

    .line 106
    .line 107
    return-object p1
.end method

.method public final n(LF0/s;)I
    .locals 7

    .line 1
    invoke-interface {p1}, LF0/s;->p()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, LH0/b;->n:J

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    const/4 p1, -0x1

    .line 12
    return p1

    .line 13
    :cond_0
    iget-object v0, p0, LH0/b;->k:LH0/e;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, p1}, LH0/e;->m(LF0/s;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_6

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    iput-object p1, p0, LH0/b;->k:LH0/e;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {p1}, LH0/b;->f(LF0/s;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, LH0/b;->a:Lg0/z;

    .line 32
    .line 33
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/16 v2, 0xc

    .line 38
    .line 39
    invoke-interface {p1, v0, v1, v2}, LF0/s;->n([BII)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, LH0/b;->a:Lg0/z;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lg0/z;->T(I)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, LH0/b;->a:Lg0/z;

    .line 48
    .line 49
    invoke-virtual {v0}, Lg0/z;->t()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const v3, 0x5453494c

    .line 54
    .line 55
    .line 56
    const/16 v4, 0x8

    .line 57
    .line 58
    if-ne v0, v3, :cond_3

    .line 59
    .line 60
    iget-object v0, p0, LH0/b;->a:Lg0/z;

    .line 61
    .line 62
    invoke-virtual {v0, v4}, Lg0/z;->T(I)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, LH0/b;->a:Lg0/z;

    .line 66
    .line 67
    invoke-virtual {v0}, Lg0/z;->t()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const v3, 0x69766f6d

    .line 72
    .line 73
    .line 74
    if-ne v0, v3, :cond_2

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    move v2, v4

    .line 78
    :goto_0
    invoke-interface {p1, v2}, LF0/s;->i(I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p1}, LF0/s;->h()V

    .line 82
    .line 83
    .line 84
    return v1

    .line 85
    :cond_3
    iget-object v2, p0, LH0/b;->a:Lg0/z;

    .line 86
    .line 87
    invoke-virtual {v2}, Lg0/z;->t()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    const v3, 0x4b4e554a    # 1.352225E7f

    .line 92
    .line 93
    .line 94
    if-ne v0, v3, :cond_4

    .line 95
    .line 96
    invoke-interface {p1}, LF0/s;->p()J

    .line 97
    .line 98
    .line 99
    move-result-wide v3

    .line 100
    int-to-long v5, v2

    .line 101
    add-long/2addr v3, v5

    .line 102
    const-wide/16 v5, 0x8

    .line 103
    .line 104
    add-long/2addr v3, v5

    .line 105
    iput-wide v3, p0, LH0/b;->j:J

    .line 106
    .line 107
    return v1

    .line 108
    :cond_4
    invoke-interface {p1, v4}, LF0/s;->i(I)V

    .line 109
    .line 110
    .line 111
    invoke-interface {p1}, LF0/s;->h()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v0}, LH0/b;->h(I)LH0/e;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    if-nez v0, :cond_5

    .line 119
    .line 120
    invoke-interface {p1}, LF0/s;->p()J

    .line 121
    .line 122
    .line 123
    move-result-wide v3

    .line 124
    int-to-long v5, v2

    .line 125
    add-long/2addr v3, v5

    .line 126
    iput-wide v3, p0, LH0/b;->j:J

    .line 127
    .line 128
    return v1

    .line 129
    :cond_5
    invoke-virtual {v0, v2}, LH0/e;->n(I)V

    .line 130
    .line 131
    .line 132
    iput-object v0, p0, LH0/b;->k:LH0/e;

    .line 133
    .line 134
    :cond_6
    :goto_1
    return v1
.end method

.method public final o(LF0/s;LF0/L;)Z
    .locals 8

    .line 1
    iget-wide v0, p0, LH0/b;->j:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-interface {p1}, LF0/s;->p()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-wide v4, p0, LH0/b;->j:J

    .line 14
    .line 15
    cmp-long v6, v4, v0

    .line 16
    .line 17
    if-ltz v6, :cond_1

    .line 18
    .line 19
    const-wide/32 v6, 0x40000

    .line 20
    .line 21
    .line 22
    add-long/2addr v6, v0

    .line 23
    cmp-long v6, v4, v6

    .line 24
    .line 25
    if-lez v6, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sub-long/2addr v4, v0

    .line 29
    long-to-int p2, v4

    .line 30
    invoke-interface {p1, p2}, LF0/s;->i(I)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :goto_0
    iput-wide v4, p2, LF0/L;->a:J

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 39
    :goto_2
    iput-wide v2, p0, LH0/b;->j:J

    .line 40
    .line 41
    return p1
.end method

.method public release()V
    .locals 0

    .line 1
    return-void
.end method
