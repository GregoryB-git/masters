.class public final LZ0/h$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LF0/T;

.field public final b:LZ0/u;

.field public final c:Lg0/z;

.field public d:LZ0/v;

.field public e:LZ0/d;

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public final j:Lg0/z;

.field public final k:Lg0/z;

.field public l:Z


# direct methods
.method public constructor <init>(LF0/T;LZ0/v;LZ0/d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ0/h$b;->a:LF0/T;

    .line 5
    .line 6
    iput-object p2, p0, LZ0/h$b;->d:LZ0/v;

    .line 7
    .line 8
    iput-object p3, p0, LZ0/h$b;->e:LZ0/d;

    .line 9
    .line 10
    new-instance p1, LZ0/u;

    .line 11
    .line 12
    invoke-direct {p1}, LZ0/u;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LZ0/h$b;->b:LZ0/u;

    .line 16
    .line 17
    new-instance p1, Lg0/z;

    .line 18
    .line 19
    invoke-direct {p1}, Lg0/z;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, LZ0/h$b;->c:Lg0/z;

    .line 23
    .line 24
    new-instance p1, Lg0/z;

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    invoke-direct {p1, v0}, Lg0/z;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, LZ0/h$b;->j:Lg0/z;

    .line 31
    .line 32
    new-instance p1, Lg0/z;

    .line 33
    .line 34
    invoke-direct {p1}, Lg0/z;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, LZ0/h$b;->k:Lg0/z;

    .line 38
    .line 39
    invoke-virtual {p0, p2, p3}, LZ0/h$b;->j(LZ0/v;LZ0/d;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static synthetic a(LZ0/h$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LZ0/h$b;->l:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic b(LZ0/h$b;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, LZ0/h$b;->l:Z

    .line 2
    .line 3
    return p1
.end method


# virtual methods
.method public c()I
    .locals 2

    .line 1
    iget-boolean v0, p0, LZ0/h$b;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LZ0/h$b;->d:LZ0/v;

    .line 6
    .line 7
    iget-object v0, v0, LZ0/v;->g:[I

    .line 8
    .line 9
    iget v1, p0, LZ0/h$b;->f:I

    .line 10
    .line 11
    aget v0, v0, v1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, LZ0/h$b;->b:LZ0/u;

    .line 15
    .line 16
    iget-object v0, v0, LZ0/u;->k:[Z

    .line 17
    .line 18
    iget v1, p0, LZ0/h$b;->f:I

    .line 19
    .line 20
    aget-boolean v0, v0, v1

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    :goto_0
    invoke-virtual {p0}, LZ0/h$b;->g()LZ0/t;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/high16 v1, 0x40000000    # 2.0f

    .line 34
    .line 35
    or-int/2addr v0, v1

    .line 36
    :cond_2
    return v0
.end method

.method public d()J
    .locals 3

    .line 1
    iget-boolean v0, p0, LZ0/h$b;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LZ0/h$b;->d:LZ0/v;

    .line 6
    .line 7
    iget-object v0, v0, LZ0/v;->c:[J

    .line 8
    .line 9
    iget v1, p0, LZ0/h$b;->f:I

    .line 10
    .line 11
    aget-wide v1, v0, v1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, LZ0/h$b;->b:LZ0/u;

    .line 15
    .line 16
    iget-object v0, v0, LZ0/u;->g:[J

    .line 17
    .line 18
    iget v1, p0, LZ0/h$b;->h:I

    .line 19
    .line 20
    aget-wide v1, v0, v1

    .line 21
    .line 22
    :goto_0
    return-wide v1
.end method

.method public e()J
    .locals 3

    .line 1
    iget-boolean v0, p0, LZ0/h$b;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LZ0/h$b;->d:LZ0/v;

    .line 6
    .line 7
    iget-object v0, v0, LZ0/v;->f:[J

    .line 8
    .line 9
    iget v1, p0, LZ0/h$b;->f:I

    .line 10
    .line 11
    aget-wide v1, v0, v1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, LZ0/h$b;->b:LZ0/u;

    .line 15
    .line 16
    iget v1, p0, LZ0/h$b;->f:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, LZ0/u;->c(I)J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    :goto_0
    return-wide v1
.end method

.method public f()I
    .locals 2

    .line 1
    iget-boolean v0, p0, LZ0/h$b;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LZ0/h$b;->d:LZ0/v;

    .line 6
    .line 7
    iget-object v0, v0, LZ0/v;->d:[I

    .line 8
    .line 9
    iget v1, p0, LZ0/h$b;->f:I

    .line 10
    .line 11
    aget v0, v0, v1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, LZ0/h$b;->b:LZ0/u;

    .line 15
    .line 16
    iget-object v0, v0, LZ0/u;->i:[I

    .line 17
    .line 18
    iget v1, p0, LZ0/h$b;->f:I

    .line 19
    .line 20
    aget v0, v0, v1

    .line 21
    .line 22
    :goto_0
    return v0
.end method

.method public g()LZ0/t;
    .locals 3

    .line 1
    iget-boolean v0, p0, LZ0/h$b;->l:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    iget-object v0, p0, LZ0/h$b;->b:LZ0/u;

    .line 8
    .line 9
    iget-object v0, v0, LZ0/u;->a:LZ0/d;

    .line 10
    .line 11
    invoke-static {v0}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, LZ0/d;

    .line 16
    .line 17
    iget v0, v0, LZ0/d;->a:I

    .line 18
    .line 19
    iget-object v2, p0, LZ0/h$b;->b:LZ0/u;

    .line 20
    .line 21
    iget-object v2, v2, LZ0/u;->n:LZ0/t;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object v2, p0, LZ0/h$b;->d:LZ0/v;

    .line 27
    .line 28
    iget-object v2, v2, LZ0/v;->a:LZ0/s;

    .line 29
    .line 30
    invoke-virtual {v2, v0}, LZ0/s;->a(I)LZ0/t;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    :goto_0
    if-eqz v2, :cond_2

    .line 35
    .line 36
    iget-boolean v0, v2, LZ0/t;->a:Z

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    move-object v1, v2

    .line 41
    :cond_2
    return-object v1
.end method

.method public h()Z
    .locals 5

    .line 1
    iget v0, p0, LZ0/h$b;->f:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, LZ0/h$b;->f:I

    .line 6
    .line 7
    iget-boolean v0, p0, LZ0/h$b;->l:Z

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    iget v0, p0, LZ0/h$b;->g:I

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    iput v0, p0, LZ0/h$b;->g:I

    .line 17
    .line 18
    iget-object v3, p0, LZ0/h$b;->b:LZ0/u;

    .line 19
    .line 20
    iget-object v3, v3, LZ0/u;->h:[I

    .line 21
    .line 22
    iget v4, p0, LZ0/h$b;->h:I

    .line 23
    .line 24
    aget v3, v3, v4

    .line 25
    .line 26
    if-ne v0, v3, :cond_1

    .line 27
    .line 28
    add-int/2addr v4, v1

    .line 29
    iput v4, p0, LZ0/h$b;->h:I

    .line 30
    .line 31
    iput v2, p0, LZ0/h$b;->g:I

    .line 32
    .line 33
    return v2

    .line 34
    :cond_1
    return v1
.end method

.method public i(II)I
    .locals 10

    .line 1
    invoke-virtual {p0}, LZ0/h$b;->g()LZ0/t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget v2, v0, LZ0/t;->d:I

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, LZ0/h$b;->b:LZ0/u;

    .line 14
    .line 15
    iget-object v0, v0, LZ0/u;->o:Lg0/z;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget-object v0, v0, LZ0/t;->e:[B

    .line 19
    .line 20
    invoke-static {v0}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, [B

    .line 25
    .line 26
    iget-object v2, p0, LZ0/h$b;->k:Lg0/z;

    .line 27
    .line 28
    array-length v3, v0

    .line 29
    invoke-virtual {v2, v0, v3}, Lg0/z;->R([BI)V

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, LZ0/h$b;->k:Lg0/z;

    .line 33
    .line 34
    array-length v0, v0

    .line 35
    move-object v9, v2

    .line 36
    move v2, v0

    .line 37
    move-object v0, v9

    .line 38
    :goto_0
    iget-object v3, p0, LZ0/h$b;->b:LZ0/u;

    .line 39
    .line 40
    iget v4, p0, LZ0/h$b;->f:I

    .line 41
    .line 42
    invoke-virtual {v3, v4}, LZ0/u;->g(I)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    const/4 v4, 0x1

    .line 47
    if-nez v3, :cond_3

    .line 48
    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move v5, v1

    .line 53
    goto :goto_2

    .line 54
    :cond_3
    :goto_1
    move v5, v4

    .line 55
    :goto_2
    iget-object v6, p0, LZ0/h$b;->j:Lg0/z;

    .line 56
    .line 57
    invoke-virtual {v6}, Lg0/z;->e()[B

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    if-eqz v5, :cond_4

    .line 62
    .line 63
    const/16 v7, 0x80

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    move v7, v1

    .line 67
    :goto_3
    or-int/2addr v7, v2

    .line 68
    int-to-byte v7, v7

    .line 69
    aput-byte v7, v6, v1

    .line 70
    .line 71
    iget-object v6, p0, LZ0/h$b;->j:Lg0/z;

    .line 72
    .line 73
    invoke-virtual {v6, v1}, Lg0/z;->T(I)V

    .line 74
    .line 75
    .line 76
    iget-object v6, p0, LZ0/h$b;->a:LF0/T;

    .line 77
    .line 78
    iget-object v7, p0, LZ0/h$b;->j:Lg0/z;

    .line 79
    .line 80
    invoke-interface {v6, v7, v4, v4}, LF0/T;->a(Lg0/z;II)V

    .line 81
    .line 82
    .line 83
    iget-object v6, p0, LZ0/h$b;->a:LF0/T;

    .line 84
    .line 85
    invoke-interface {v6, v0, v2, v4}, LF0/T;->a(Lg0/z;II)V

    .line 86
    .line 87
    .line 88
    if-nez v5, :cond_5

    .line 89
    .line 90
    add-int/2addr v2, v4

    .line 91
    return v2

    .line 92
    :cond_5
    const/4 v0, 0x6

    .line 93
    const/4 v5, 0x3

    .line 94
    const/4 v6, 0x2

    .line 95
    const/16 v7, 0x8

    .line 96
    .line 97
    if-nez v3, :cond_6

    .line 98
    .line 99
    iget-object v3, p0, LZ0/h$b;->c:Lg0/z;

    .line 100
    .line 101
    invoke-virtual {v3, v7}, Lg0/z;->P(I)V

    .line 102
    .line 103
    .line 104
    iget-object v3, p0, LZ0/h$b;->c:Lg0/z;

    .line 105
    .line 106
    invoke-virtual {v3}, Lg0/z;->e()[B

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    aput-byte v1, v3, v1

    .line 111
    .line 112
    aput-byte v4, v3, v4

    .line 113
    .line 114
    shr-int/lit8 v1, p2, 0x8

    .line 115
    .line 116
    and-int/lit16 v1, v1, 0xff

    .line 117
    .line 118
    int-to-byte v1, v1

    .line 119
    aput-byte v1, v3, v6

    .line 120
    .line 121
    and-int/lit16 p2, p2, 0xff

    .line 122
    .line 123
    int-to-byte p2, p2

    .line 124
    aput-byte p2, v3, v5

    .line 125
    .line 126
    shr-int/lit8 p2, p1, 0x18

    .line 127
    .line 128
    and-int/lit16 p2, p2, 0xff

    .line 129
    .line 130
    int-to-byte p2, p2

    .line 131
    const/4 v1, 0x4

    .line 132
    aput-byte p2, v3, v1

    .line 133
    .line 134
    shr-int/lit8 p2, p1, 0x10

    .line 135
    .line 136
    and-int/lit16 p2, p2, 0xff

    .line 137
    .line 138
    int-to-byte p2, p2

    .line 139
    const/4 v1, 0x5

    .line 140
    aput-byte p2, v3, v1

    .line 141
    .line 142
    shr-int/lit8 p2, p1, 0x8

    .line 143
    .line 144
    and-int/lit16 p2, p2, 0xff

    .line 145
    .line 146
    int-to-byte p2, p2

    .line 147
    aput-byte p2, v3, v0

    .line 148
    .line 149
    and-int/lit16 p1, p1, 0xff

    .line 150
    .line 151
    int-to-byte p1, p1

    .line 152
    const/4 p2, 0x7

    .line 153
    aput-byte p1, v3, p2

    .line 154
    .line 155
    iget-object p1, p0, LZ0/h$b;->a:LF0/T;

    .line 156
    .line 157
    iget-object p2, p0, LZ0/h$b;->c:Lg0/z;

    .line 158
    .line 159
    invoke-interface {p1, p2, v7, v4}, LF0/T;->a(Lg0/z;II)V

    .line 160
    .line 161
    .line 162
    add-int/lit8 v2, v2, 0x9

    .line 163
    .line 164
    return v2

    .line 165
    :cond_6
    iget-object p1, p0, LZ0/h$b;->b:LZ0/u;

    .line 166
    .line 167
    iget-object p1, p1, LZ0/u;->o:Lg0/z;

    .line 168
    .line 169
    invoke-virtual {p1}, Lg0/z;->M()I

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    const/4 v8, -0x2

    .line 174
    invoke-virtual {p1, v8}, Lg0/z;->U(I)V

    .line 175
    .line 176
    .line 177
    mul-int/2addr v3, v0

    .line 178
    add-int/2addr v3, v6

    .line 179
    if-eqz p2, :cond_7

    .line 180
    .line 181
    iget-object v0, p0, LZ0/h$b;->c:Lg0/z;

    .line 182
    .line 183
    invoke-virtual {v0, v3}, Lg0/z;->P(I)V

    .line 184
    .line 185
    .line 186
    iget-object v0, p0, LZ0/h$b;->c:Lg0/z;

    .line 187
    .line 188
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {p1, v0, v1, v3}, Lg0/z;->l([BII)V

    .line 193
    .line 194
    .line 195
    aget-byte p1, v0, v6

    .line 196
    .line 197
    and-int/lit16 p1, p1, 0xff

    .line 198
    .line 199
    shl-int/2addr p1, v7

    .line 200
    aget-byte v1, v0, v5

    .line 201
    .line 202
    and-int/lit16 v1, v1, 0xff

    .line 203
    .line 204
    or-int/2addr p1, v1

    .line 205
    add-int/2addr p1, p2

    .line 206
    shr-int/lit8 p2, p1, 0x8

    .line 207
    .line 208
    and-int/lit16 p2, p2, 0xff

    .line 209
    .line 210
    int-to-byte p2, p2

    .line 211
    aput-byte p2, v0, v6

    .line 212
    .line 213
    and-int/lit16 p1, p1, 0xff

    .line 214
    .line 215
    int-to-byte p1, p1

    .line 216
    aput-byte p1, v0, v5

    .line 217
    .line 218
    iget-object p1, p0, LZ0/h$b;->c:Lg0/z;

    .line 219
    .line 220
    :cond_7
    iget-object p2, p0, LZ0/h$b;->a:LF0/T;

    .line 221
    .line 222
    invoke-interface {p2, p1, v3, v4}, LF0/T;->a(Lg0/z;II)V

    .line 223
    .line 224
    .line 225
    add-int/2addr v2, v4

    .line 226
    add-int/2addr v2, v3

    .line 227
    return v2
.end method

.method public j(LZ0/v;LZ0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LZ0/h$b;->d:LZ0/v;

    .line 2
    .line 3
    iput-object p2, p0, LZ0/h$b;->e:LZ0/d;

    .line 4
    .line 5
    iget-object p2, p0, LZ0/h$b;->a:LF0/T;

    .line 6
    .line 7
    iget-object p1, p1, LZ0/v;->a:LZ0/s;

    .line 8
    .line 9
    iget-object p1, p1, LZ0/s;->f:Ld0/q;

    .line 10
    .line 11
    invoke-interface {p2, p1}, LF0/T;->d(Ld0/q;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, LZ0/h$b;->k()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public k()V
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/h$b;->b:LZ0/u;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ0/u;->f()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, LZ0/h$b;->f:I

    .line 8
    .line 9
    iput v0, p0, LZ0/h$b;->h:I

    .line 10
    .line 11
    iput v0, p0, LZ0/h$b;->g:I

    .line 12
    .line 13
    iput v0, p0, LZ0/h$b;->i:I

    .line 14
    .line 15
    iput-boolean v0, p0, LZ0/h$b;->l:Z

    .line 16
    .line 17
    return-void
.end method

.method public l(J)V
    .locals 3

    .line 1
    iget v0, p0, LZ0/h$b;->f:I

    .line 2
    .line 3
    :goto_0
    iget-object v1, p0, LZ0/h$b;->b:LZ0/u;

    .line 4
    .line 5
    iget v2, v1, LZ0/u;->f:I

    .line 6
    .line 7
    if-ge v0, v2, :cond_1

    .line 8
    .line 9
    invoke-virtual {v1, v0}, LZ0/u;->c(I)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    cmp-long v1, v1, p1

    .line 14
    .line 15
    if-gtz v1, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, LZ0/h$b;->b:LZ0/u;

    .line 18
    .line 19
    iget-object v1, v1, LZ0/u;->k:[Z

    .line 20
    .line 21
    aget-boolean v1, v1, v0

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iput v0, p0, LZ0/h$b;->i:I

    .line 26
    .line 27
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-void
.end method

.method public m()V
    .locals 3

    .line 1
    invoke-virtual {p0}, LZ0/h$b;->g()LZ0/t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, p0, LZ0/h$b;->b:LZ0/u;

    .line 9
    .line 10
    iget-object v1, v1, LZ0/u;->o:Lg0/z;

    .line 11
    .line 12
    iget v0, v0, LZ0/t;->d:I

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lg0/z;->U(I)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, LZ0/h$b;->b:LZ0/u;

    .line 20
    .line 21
    iget v2, p0, LZ0/h$b;->f:I

    .line 22
    .line 23
    invoke-virtual {v0, v2}, LZ0/u;->g(I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {v1}, Lg0/z;->M()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    mul-int/lit8 v0, v0, 0x6

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Lg0/z;->U(I)V

    .line 36
    .line 37
    .line 38
    :cond_2
    return-void
.end method

.method public n(Ld0/m;)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/h$b;->d:LZ0/v;

    .line 2
    .line 3
    iget-object v0, v0, LZ0/v;->a:LZ0/s;

    .line 4
    .line 5
    iget-object v1, p0, LZ0/h$b;->b:LZ0/u;

    .line 6
    .line 7
    iget-object v1, v1, LZ0/u;->a:LZ0/d;

    .line 8
    .line 9
    invoke-static {v1}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, LZ0/d;

    .line 14
    .line 15
    iget v1, v1, LZ0/d;->a:I

    .line 16
    .line 17
    invoke-virtual {v0, v1}, LZ0/s;->a(I)LZ0/t;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, v0, LZ0/t;->b:Ljava/lang/String;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    :goto_0
    invoke-virtual {p1, v0}, Ld0/m;->c(Ljava/lang/String;)Ld0/m;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, p0, LZ0/h$b;->d:LZ0/v;

    .line 32
    .line 33
    iget-object v0, v0, LZ0/v;->a:LZ0/s;

    .line 34
    .line 35
    iget-object v0, v0, LZ0/s;->f:Ld0/q;

    .line 36
    .line 37
    invoke-virtual {v0}, Ld0/q;->a()Ld0/q$b;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0, p1}, Ld0/q$b;->U(Ld0/m;)Ld0/q$b;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Ld0/q$b;->K()Ld0/q;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object v0, p0, LZ0/h$b;->a:LF0/T;

    .line 50
    .line 51
    invoke-interface {v0, p1}, LF0/T;->d(Ld0/q;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method
