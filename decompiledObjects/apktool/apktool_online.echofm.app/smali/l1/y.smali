.class public final Ll1/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll1/K;


# instance fields
.field public final a:Ll1/m;

.field public final b:Lg0/y;

.field public c:I

.field public d:I

.field public e:Lg0/E;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:Z

.field public l:J


# direct methods
.method public constructor <init>(Ll1/m;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll1/y;->a:Ll1/m;

    .line 5
    .line 6
    new-instance p1, Lg0/y;

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    invoke-direct {p1, v0}, Lg0/y;-><init>([B)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ll1/y;->b:Lg0/y;

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput p1, p0, Ll1/y;->c:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public a(Lg0/z;I)V
    .locals 8

    .line 1
    iget-object v0, p0, Ll1/y;->e:Lg0/E;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    and-int/lit8 v0, p2, 0x1

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    const/4 v2, 0x3

    .line 10
    const/4 v3, 0x2

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    iget v0, p0, Ll1/y;->c:I

    .line 16
    .line 17
    if-eqz v0, :cond_4

    .line 18
    .line 19
    if-eq v0, v5, :cond_4

    .line 20
    .line 21
    const-string v6, "PesReader"

    .line 22
    .line 23
    if-eq v0, v3, :cond_3

    .line 24
    .line 25
    if-ne v0, v2, :cond_2

    .line 26
    .line 27
    iget v0, p0, Ll1/y;->j:I

    .line 28
    .line 29
    if-eq v0, v1, :cond_0

    .line 30
    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v7, "Unexpected start indicator: expected "

    .line 37
    .line 38
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget v7, p0, Ll1/y;->j:I

    .line 42
    .line 43
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v7, " more bytes"

    .line 47
    .line 48
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v6, v0}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    invoke-virtual {p1}, Lg0/z;->g()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_1

    .line 63
    .line 64
    move v0, v5

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    move v0, v4

    .line 67
    :goto_0
    iget-object v6, p0, Ll1/y;->a:Ll1/m;

    .line 68
    .line 69
    invoke-interface {v6, v0}, Ll1/m;->c(Z)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 76
    .line 77
    .line 78
    throw p1

    .line 79
    :cond_3
    const-string v0, "Unexpected start indicator reading extended header"

    .line 80
    .line 81
    invoke-static {v6, v0}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    :goto_1
    invoke-virtual {p0, v5}, Ll1/y;->h(I)V

    .line 85
    .line 86
    .line 87
    :cond_5
    :goto_2
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-lez v0, :cond_e

    .line 92
    .line 93
    iget v0, p0, Ll1/y;->c:I

    .line 94
    .line 95
    if-eqz v0, :cond_d

    .line 96
    .line 97
    if-eq v0, v5, :cond_b

    .line 98
    .line 99
    if-eq v0, v3, :cond_9

    .line 100
    .line 101
    if-ne v0, v2, :cond_8

    .line 102
    .line 103
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    iget v6, p0, Ll1/y;->j:I

    .line 108
    .line 109
    if-ne v6, v1, :cond_6

    .line 110
    .line 111
    move v6, v4

    .line 112
    goto :goto_3

    .line 113
    :cond_6
    sub-int v6, v0, v6

    .line 114
    .line 115
    :goto_3
    if-lez v6, :cond_7

    .line 116
    .line 117
    sub-int/2addr v0, v6

    .line 118
    invoke-virtual {p1}, Lg0/z;->f()I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    add-int/2addr v6, v0

    .line 123
    invoke-virtual {p1, v6}, Lg0/z;->S(I)V

    .line 124
    .line 125
    .line 126
    :cond_7
    iget-object v6, p0, Ll1/y;->a:Ll1/m;

    .line 127
    .line 128
    invoke-interface {v6, p1}, Ll1/m;->a(Lg0/z;)V

    .line 129
    .line 130
    .line 131
    iget v6, p0, Ll1/y;->j:I

    .line 132
    .line 133
    if-eq v6, v1, :cond_5

    .line 134
    .line 135
    sub-int/2addr v6, v0

    .line 136
    iput v6, p0, Ll1/y;->j:I

    .line 137
    .line 138
    if-nez v6, :cond_5

    .line 139
    .line 140
    iget-object v0, p0, Ll1/y;->a:Ll1/m;

    .line 141
    .line 142
    invoke-interface {v0, v4}, Ll1/m;->c(Z)V

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 147
    .line 148
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 149
    .line 150
    .line 151
    throw p1

    .line 152
    :cond_9
    const/16 v0, 0xa

    .line 153
    .line 154
    iget v6, p0, Ll1/y;->i:I

    .line 155
    .line 156
    invoke-static {v0, v6}, Ljava/lang/Math;->min(II)I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    iget-object v6, p0, Ll1/y;->b:Lg0/y;

    .line 161
    .line 162
    iget-object v6, v6, Lg0/y;->a:[B

    .line 163
    .line 164
    invoke-virtual {p0, p1, v6, v0}, Ll1/y;->e(Lg0/z;[BI)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_5

    .line 169
    .line 170
    const/4 v0, 0x0

    .line 171
    iget v6, p0, Ll1/y;->i:I

    .line 172
    .line 173
    invoke-virtual {p0, p1, v0, v6}, Ll1/y;->e(Lg0/z;[BI)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-eqz v0, :cond_5

    .line 178
    .line 179
    invoke-virtual {p0}, Ll1/y;->g()V

    .line 180
    .line 181
    .line 182
    iget-boolean v0, p0, Ll1/y;->k:Z

    .line 183
    .line 184
    if-eqz v0, :cond_a

    .line 185
    .line 186
    const/4 v0, 0x4

    .line 187
    goto :goto_4

    .line 188
    :cond_a
    move v0, v4

    .line 189
    :goto_4
    or-int/2addr p2, v0

    .line 190
    iget-object v0, p0, Ll1/y;->a:Ll1/m;

    .line 191
    .line 192
    iget-wide v6, p0, Ll1/y;->l:J

    .line 193
    .line 194
    invoke-interface {v0, v6, v7, p2}, Ll1/m;->d(JI)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0, v2}, Ll1/y;->h(I)V

    .line 198
    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_b
    iget-object v0, p0, Ll1/y;->b:Lg0/y;

    .line 202
    .line 203
    iget-object v0, v0, Lg0/y;->a:[B

    .line 204
    .line 205
    const/16 v6, 0x9

    .line 206
    .line 207
    invoke-virtual {p0, p1, v0, v6}, Ll1/y;->e(Lg0/z;[BI)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_5

    .line 212
    .line 213
    invoke-virtual {p0}, Ll1/y;->f()Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-eqz v0, :cond_c

    .line 218
    .line 219
    move v0, v3

    .line 220
    goto :goto_5

    .line 221
    :cond_c
    move v0, v4

    .line 222
    :goto_5
    invoke-virtual {p0, v0}, Ll1/y;->h(I)V

    .line 223
    .line 224
    .line 225
    goto/16 :goto_2

    .line 226
    .line 227
    :cond_d
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    invoke-virtual {p1, v0}, Lg0/z;->U(I)V

    .line 232
    .line 233
    .line 234
    goto/16 :goto_2

    .line 235
    .line 236
    :cond_e
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ll1/y;->c:I

    .line 3
    .line 4
    iput v0, p0, Ll1/y;->d:I

    .line 5
    .line 6
    iput-boolean v0, p0, Ll1/y;->h:Z

    .line 7
    .line 8
    iget-object v0, p0, Ll1/y;->a:Ll1/m;

    .line 9
    .line 10
    invoke-interface {v0}, Ll1/m;->b()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public c(Lg0/E;LF0/t;Ll1/K$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll1/y;->e:Lg0/E;

    .line 2
    .line 3
    iget-object p1, p0, Ll1/y;->a:Ll1/m;

    .line 4
    .line 5
    invoke-interface {p1, p2, p3}, Ll1/m;->e(LF0/t;Ll1/K$d;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d(Z)Z
    .locals 2

    .line 1
    iget v0, p0, Ll1/y;->c:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    iget v0, p0, Ll1/y;->j:I

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Ll1/y;->a:Ll1/m;

    .line 14
    .line 15
    instance-of p1, p1, Ll1/n;

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    :cond_0
    const/4 p1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 p1, 0x0

    .line 22
    :goto_0
    return p1
.end method

.method public final e(Lg0/z;[BI)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Ll1/y;->d:I

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
    const/4 v1, 0x1

    .line 14
    if-gtz v0, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    if-nez p2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lg0/z;->U(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget v2, p0, Ll1/y;->d:I

    .line 24
    .line 25
    invoke-virtual {p1, p2, v2, v0}, Lg0/z;->l([BII)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget p1, p0, Ll1/y;->d:I

    .line 29
    .line 30
    add-int/2addr p1, v0

    .line 31
    iput p1, p0, Ll1/y;->d:I

    .line 32
    .line 33
    if-ne p1, p3, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    const/4 v1, 0x0

    .line 37
    :goto_1
    return v1
.end method

.method public final f()Z
    .locals 7

    .line 1
    iget-object v0, p0, Ll1/y;->b:Lg0/y;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lg0/y;->p(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Ll1/y;->b:Lg0/y;

    .line 8
    .line 9
    const/16 v2, 0x18

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Lg0/y;->h(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const-string v2, "PesReader"

    .line 16
    .line 17
    const/4 v3, -0x1

    .line 18
    const/4 v4, 0x1

    .line 19
    if-eq v0, v4, :cond_0

    .line 20
    .line 21
    new-instance v4, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v5, "Unexpected start code prefix: "

    .line 27
    .line 28
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v2, v0}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iput v3, p0, Ll1/y;->j:I

    .line 42
    .line 43
    return v1

    .line 44
    :cond_0
    iget-object v0, p0, Ll1/y;->b:Lg0/y;

    .line 45
    .line 46
    const/16 v1, 0x8

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lg0/y;->r(I)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Ll1/y;->b:Lg0/y;

    .line 52
    .line 53
    const/16 v5, 0x10

    .line 54
    .line 55
    invoke-virtual {v0, v5}, Lg0/y;->h(I)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object v5, p0, Ll1/y;->b:Lg0/y;

    .line 60
    .line 61
    const/4 v6, 0x5

    .line 62
    invoke-virtual {v5, v6}, Lg0/y;->r(I)V

    .line 63
    .line 64
    .line 65
    iget-object v5, p0, Ll1/y;->b:Lg0/y;

    .line 66
    .line 67
    invoke-virtual {v5}, Lg0/y;->g()Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    iput-boolean v5, p0, Ll1/y;->k:Z

    .line 72
    .line 73
    iget-object v5, p0, Ll1/y;->b:Lg0/y;

    .line 74
    .line 75
    const/4 v6, 0x2

    .line 76
    invoke-virtual {v5, v6}, Lg0/y;->r(I)V

    .line 77
    .line 78
    .line 79
    iget-object v5, p0, Ll1/y;->b:Lg0/y;

    .line 80
    .line 81
    invoke-virtual {v5}, Lg0/y;->g()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    iput-boolean v5, p0, Ll1/y;->f:Z

    .line 86
    .line 87
    iget-object v5, p0, Ll1/y;->b:Lg0/y;

    .line 88
    .line 89
    invoke-virtual {v5}, Lg0/y;->g()Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    iput-boolean v5, p0, Ll1/y;->g:Z

    .line 94
    .line 95
    iget-object v5, p0, Ll1/y;->b:Lg0/y;

    .line 96
    .line 97
    const/4 v6, 0x6

    .line 98
    invoke-virtual {v5, v6}, Lg0/y;->r(I)V

    .line 99
    .line 100
    .line 101
    iget-object v5, p0, Ll1/y;->b:Lg0/y;

    .line 102
    .line 103
    invoke-virtual {v5, v1}, Lg0/y;->h(I)I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    iput v1, p0, Ll1/y;->i:I

    .line 108
    .line 109
    if-nez v0, :cond_1

    .line 110
    .line 111
    :goto_0
    iput v3, p0, Ll1/y;->j:I

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    add-int/lit8 v0, v0, -0x3

    .line 115
    .line 116
    sub-int/2addr v0, v1

    .line 117
    iput v0, p0, Ll1/y;->j:I

    .line 118
    .line 119
    if-gez v0, :cond_2

    .line 120
    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 124
    .line 125
    .line 126
    const-string v1, "Found negative packet payload size: "

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    iget v1, p0, Ll1/y;->j:I

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {v2, v0}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_2
    :goto_1
    return v4
.end method

.method public final g()V
    .locals 10

    .line 1
    iget-object v0, p0, Ll1/y;->b:Lg0/y;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lg0/y;->p(I)V

    .line 5
    .line 6
    .line 7
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    iput-wide v0, p0, Ll1/y;->l:J

    .line 13
    .line 14
    iget-boolean v0, p0, Ll1/y;->f:Z

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Ll1/y;->b:Lg0/y;

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    invoke-virtual {v0, v1}, Lg0/y;->r(I)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Ll1/y;->b:Lg0/y;

    .line 25
    .line 26
    const/4 v2, 0x3

    .line 27
    invoke-virtual {v0, v2}, Lg0/y;->h(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    int-to-long v3, v0

    .line 32
    const/16 v0, 0x1e

    .line 33
    .line 34
    shl-long/2addr v3, v0

    .line 35
    iget-object v5, p0, Ll1/y;->b:Lg0/y;

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    invoke-virtual {v5, v6}, Lg0/y;->r(I)V

    .line 39
    .line 40
    .line 41
    iget-object v5, p0, Ll1/y;->b:Lg0/y;

    .line 42
    .line 43
    const/16 v7, 0xf

    .line 44
    .line 45
    invoke-virtual {v5, v7}, Lg0/y;->h(I)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    shl-int/2addr v5, v7

    .line 50
    int-to-long v8, v5

    .line 51
    or-long/2addr v3, v8

    .line 52
    iget-object v5, p0, Ll1/y;->b:Lg0/y;

    .line 53
    .line 54
    invoke-virtual {v5, v6}, Lg0/y;->r(I)V

    .line 55
    .line 56
    .line 57
    iget-object v5, p0, Ll1/y;->b:Lg0/y;

    .line 58
    .line 59
    invoke-virtual {v5, v7}, Lg0/y;->h(I)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    int-to-long v8, v5

    .line 64
    or-long/2addr v3, v8

    .line 65
    iget-object v5, p0, Ll1/y;->b:Lg0/y;

    .line 66
    .line 67
    invoke-virtual {v5, v6}, Lg0/y;->r(I)V

    .line 68
    .line 69
    .line 70
    iget-boolean v5, p0, Ll1/y;->h:Z

    .line 71
    .line 72
    if-nez v5, :cond_0

    .line 73
    .line 74
    iget-boolean v5, p0, Ll1/y;->g:Z

    .line 75
    .line 76
    if-eqz v5, :cond_0

    .line 77
    .line 78
    iget-object v5, p0, Ll1/y;->b:Lg0/y;

    .line 79
    .line 80
    invoke-virtual {v5, v1}, Lg0/y;->r(I)V

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, Ll1/y;->b:Lg0/y;

    .line 84
    .line 85
    invoke-virtual {v1, v2}, Lg0/y;->h(I)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    int-to-long v1, v1

    .line 90
    shl-long v0, v1, v0

    .line 91
    .line 92
    iget-object v2, p0, Ll1/y;->b:Lg0/y;

    .line 93
    .line 94
    invoke-virtual {v2, v6}, Lg0/y;->r(I)V

    .line 95
    .line 96
    .line 97
    iget-object v2, p0, Ll1/y;->b:Lg0/y;

    .line 98
    .line 99
    invoke-virtual {v2, v7}, Lg0/y;->h(I)I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    shl-int/2addr v2, v7

    .line 104
    int-to-long v8, v2

    .line 105
    or-long/2addr v0, v8

    .line 106
    iget-object v2, p0, Ll1/y;->b:Lg0/y;

    .line 107
    .line 108
    invoke-virtual {v2, v6}, Lg0/y;->r(I)V

    .line 109
    .line 110
    .line 111
    iget-object v2, p0, Ll1/y;->b:Lg0/y;

    .line 112
    .line 113
    invoke-virtual {v2, v7}, Lg0/y;->h(I)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    int-to-long v7, v2

    .line 118
    or-long/2addr v0, v7

    .line 119
    iget-object v2, p0, Ll1/y;->b:Lg0/y;

    .line 120
    .line 121
    invoke-virtual {v2, v6}, Lg0/y;->r(I)V

    .line 122
    .line 123
    .line 124
    iget-object v2, p0, Ll1/y;->e:Lg0/E;

    .line 125
    .line 126
    invoke-virtual {v2, v0, v1}, Lg0/E;->b(J)J

    .line 127
    .line 128
    .line 129
    iput-boolean v6, p0, Ll1/y;->h:Z

    .line 130
    .line 131
    :cond_0
    iget-object v0, p0, Ll1/y;->e:Lg0/E;

    .line 132
    .line 133
    invoke-virtual {v0, v3, v4}, Lg0/E;->b(J)J

    .line 134
    .line 135
    .line 136
    move-result-wide v0

    .line 137
    iput-wide v0, p0, Ll1/y;->l:J

    .line 138
    .line 139
    :cond_1
    return-void
.end method

.method public final h(I)V
    .locals 0

    .line 1
    iput p1, p0, Ll1/y;->c:I

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput p1, p0, Ll1/y;->d:I

    .line 5
    .line 6
    return-void
.end method
