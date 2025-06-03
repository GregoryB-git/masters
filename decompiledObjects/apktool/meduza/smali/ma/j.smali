.class public final Lma/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lma/g1;


# instance fields
.field public final a:Lma/i;

.field public b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(Lma/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lma/j;->d:I

    sget-object v0, Lma/a0;->a:Ljava/nio/charset/Charset;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lma/j;->a:Lma/i;

    iput-object p0, p1, Lma/i;->d:Lma/j;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "input"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static y(I)V
    .locals 0

    and-int/lit8 p0, p0, 0x3

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lma/b0;->g()Lma/b0;

    move-result-object p0

    throw p0
.end method

.method public static z(I)V
    .locals 0

    and-int/lit8 p0, p0, 0x7

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lma/b0;->g()Lma/b0;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public final a()I
    .locals 2

    iget v0, p0, Lma/j;->d:I

    if-eqz v0, :cond_0

    iput v0, p0, Lma/j;->b:I

    const/4 v0, 0x0

    iput v0, p0, Lma/j;->d:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->x()I

    move-result v0

    iput v0, p0, Lma/j;->b:I

    :goto_0
    iget v0, p0, Lma/j;->b:I

    if-eqz v0, :cond_2

    iget v1, p0, Lma/j;->c:I

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    ushr-int/lit8 v0, v0, 0x3

    return v0

    :cond_2
    :goto_1
    const v0, 0x7fffffff

    return v0
.end method

.method public final b(Ljava/lang/Object;Lma/i1;Lma/o;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lma/i1<",
            "TT;>;",
            "Lma/o;",
            ")V"
        }
    .end annotation

    iget v0, p0, Lma/j;->c:I

    iget v1, p0, Lma/j;->b:I

    ushr-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Lma/j;->c:I

    :try_start_0
    invoke-interface {p2, p1, p0, p3}, Lma/i1;->i(Ljava/lang/Object;Lma/g1;Lma/o;)V

    iget p1, p0, Lma/j;->b:I

    iget p2, p0, Lma/j;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    iput v0, p0, Lma/j;->c:I

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, Lma/b0;->g()Lma/b0;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    iput v0, p0, Lma/j;->c:I

    throw p1
.end method

.method public final c(Ljava/lang/Object;Lma/i1;Lma/o;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lma/i1<",
            "TT;>;",
            "Lma/o;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lma/i;->y()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lma/j;->a:Lma/i;

    .line 8
    .line 9
    iget v2, v1, Lma/i;->a:I

    .line 10
    .line 11
    iget v3, v1, Lma/i;->b:I

    .line 12
    .line 13
    if-ge v2, v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lma/i;->h(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, Lma/j;->a:Lma/i;

    .line 20
    .line 21
    iget v2, v1, Lma/i;->a:I

    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    iput v2, v1, Lma/i;->a:I

    .line 26
    .line 27
    invoke-interface {p2, p1, p0, p3}, Lma/i1;->i(Ljava/lang/Object;Lma/g1;Lma/o;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 31
    .line 32
    const/4 p2, 0x0

    .line 33
    invoke-virtual {p1, p2}, Lma/i;->a(I)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 37
    .line 38
    iget p2, p1, Lma/i;->a:I

    .line 39
    .line 40
    add-int/lit8 p2, p2, -0x1

    .line 41
    .line 42
    iput p2, p1, Lma/i;->a:I

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lma/i;->g(I)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    new-instance p1, Lma/b0;

    .line 49
    .line 50
    const-string p2, "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."

    .line 51
    .line 52
    invoke-direct {p1, p2}, Lma/b0;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1
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

.method public final d(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lma/g;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lma/g;

    iget p1, p0, Lma/j;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->y()I

    move-result p1

    iget-object v1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v1}, Lma/i;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->i()Z

    move-result p1

    invoke-virtual {v0, p1}, Lma/g;->h(Z)V

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lma/b0;->d()Lma/b0$a;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->i()Z

    move-result p1

    invoke-virtual {v0, p1}, Lma/g;->h(Z)V

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->x()I

    move-result p1

    iget v1, p0, Lma/j;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lma/j;->d:I

    return-void

    :cond_4
    iget v0, p0, Lma/j;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->y()I

    move-result v0

    iget-object v1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v1}, Lma/i;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->i()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    invoke-virtual {p0, v1}, Lma/j;->v(I)V

    return-void

    :cond_6
    invoke-static {}, Lma/b0;->d()Lma/b0$a;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->i()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->x()I

    move-result v0

    iget v1, p0, Lma/j;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lma/j;->d:I

    return-void
.end method

.method public final e()Lma/h;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lma/j;->w(I)V

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->j()Lma/h$h;

    move-result-object v0

    return-object v0
.end method

.method public final f(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lma/h;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lma/j;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Lma/j;->e()Lma/h;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->x()I

    move-result v0

    iget v1, p0, Lma/j;->b:I

    if-eq v0, v1, :cond_0

    iput v0, p0, Lma/j;->d:I

    return-void

    :cond_2
    invoke-static {}, Lma/b0;->d()Lma/b0$a;

    move-result-object p1

    throw p1
.end method

.method public final g(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lma/m;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Lma/m;

    .line 9
    .line 10
    iget p1, p0, Lma/j;->b:I

    .line 11
    .line 12
    and-int/lit8 p1, p1, 0x7

    .line 13
    .line 14
    if-eq p1, v2, :cond_2

    .line 15
    .line 16
    if-ne p1, v1, :cond_1

    .line 17
    .line 18
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 19
    .line 20
    invoke-virtual {p1}, Lma/i;->y()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-static {p1}, Lma/j;->z(I)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lma/j;->a:Lma/i;

    .line 28
    .line 29
    invoke-virtual {v1}, Lma/i;->d()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v1, p1

    .line 34
    :cond_0
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 35
    .line 36
    invoke-virtual {p1}, Lma/i;->k()D

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    invoke-virtual {v0, v2, v3}, Lma/m;->h(D)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 44
    .line 45
    invoke-virtual {p1}, Lma/i;->d()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-lt p1, v1, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    sget p1, Lma/b0;->c:I

    .line 53
    .line 54
    new-instance p1, Lma/b0$a;

    .line 55
    .line 56
    invoke-direct {p1}, Lma/b0$a;-><init>()V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 61
    .line 62
    invoke-virtual {p1}, Lma/i;->k()D

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    invoke-virtual {v0, v1, v2}, Lma/m;->h(D)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 70
    .line 71
    invoke-virtual {p1}, Lma/i;->e()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 79
    .line 80
    invoke-virtual {p1}, Lma/i;->x()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    iget v1, p0, Lma/j;->b:I

    .line 85
    .line 86
    if-eq p1, v1, :cond_2

    .line 87
    .line 88
    iput p1, p0, Lma/j;->d:I

    .line 89
    .line 90
    return-void

    .line 91
    :cond_4
    iget v0, p0, Lma/j;->b:I

    .line 92
    .line 93
    and-int/lit8 v0, v0, 0x7

    .line 94
    .line 95
    if-eq v0, v2, :cond_7

    .line 96
    .line 97
    if-ne v0, v1, :cond_6

    .line 98
    .line 99
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 100
    .line 101
    invoke-virtual {v0}, Lma/i;->y()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-static {v0}, Lma/j;->z(I)V

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lma/j;->a:Lma/i;

    .line 109
    .line 110
    invoke-virtual {v1}, Lma/i;->d()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    add-int/2addr v1, v0

    .line 115
    :cond_5
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 116
    .line 117
    invoke-virtual {v0}, Lma/i;->k()D

    .line 118
    .line 119
    .line 120
    move-result-wide v2

    .line 121
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 129
    .line 130
    invoke-virtual {v0}, Lma/i;->d()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-lt v0, v1, :cond_5

    .line 135
    .line 136
    :goto_0
    return-void

    .line 137
    :cond_6
    sget p1, Lma/b0;->c:I

    .line 138
    .line 139
    new-instance p1, Lma/b0$a;

    .line 140
    .line 141
    invoke-direct {p1}, Lma/b0$a;-><init>()V

    .line 142
    .line 143
    .line 144
    throw p1

    .line 145
    :cond_7
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 146
    .line 147
    invoke-virtual {v0}, Lma/i;->k()D

    .line 148
    .line 149
    .line 150
    move-result-wide v0

    .line 151
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 159
    .line 160
    invoke-virtual {v0}, Lma/i;->e()Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_8

    .line 165
    .line 166
    return-void

    .line 167
    :cond_8
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 168
    .line 169
    invoke-virtual {v0}, Lma/i;->x()I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    iget v1, p0, Lma/j;->b:I

    .line 174
    .line 175
    if-eq v0, v1, :cond_7

    .line 176
    .line 177
    iput v0, p0, Lma/j;->d:I

    .line 178
    .line 179
    return-void
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
.end method

.method public final h(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lma/z;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lma/z;

    iget p1, p0, Lma/j;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->y()I

    move-result p1

    iget-object v1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v1}, Lma/i;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->l()I

    move-result p1

    invoke-virtual {v0, p1}, Lma/z;->h(I)V

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lma/b0;->d()Lma/b0$a;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->l()I

    move-result p1

    invoke-virtual {v0, p1}, Lma/z;->h(I)V

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->x()I

    move-result p1

    iget v1, p0, Lma/j;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lma/j;->d:I

    return-void

    :cond_4
    iget v0, p0, Lma/j;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->y()I

    move-result v0

    iget-object v1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v1}, Lma/i;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->l()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    invoke-virtual {p0, v1}, Lma/j;->v(I)V

    return-void

    :cond_6
    invoke-static {}, Lma/b0;->d()Lma/b0$a;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->l()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->x()I

    move-result v0

    iget v1, p0, Lma/j;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lma/j;->d:I

    return-void
.end method

.method public final i(Lma/v1;Ljava/lang/Class;Lma/o;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lma/v1;",
            "Ljava/lang/Class<",
            "*>;",
            "Lma/o;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x2

    .line 6
    const/4 v1, 0x5

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    :pswitch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string p2, "unsupported field type."

    .line 15
    .line 16
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :pswitch_1
    invoke-virtual {p0, v3}, Lma/j;->w(I)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 24
    .line 25
    invoke-virtual {p1}, Lma/i;->u()J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :pswitch_2
    invoke-virtual {p0, v3}, Lma/j;->w(I)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 38
    .line 39
    invoke-virtual {p1}, Lma/i;->t()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :pswitch_3
    invoke-virtual {p0, v2}, Lma/j;->w(I)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 52
    .line 53
    invoke-virtual {p1}, Lma/i;->s()J

    .line 54
    .line 55
    .line 56
    move-result-wide p1

    .line 57
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :pswitch_4
    invoke-virtual {p0, v1}, Lma/j;->w(I)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 66
    .line 67
    invoke-virtual {p1}, Lma/i;->r()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    :pswitch_5
    invoke-virtual {p0, v3}, Lma/j;->w(I)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 80
    .line 81
    invoke-virtual {p1}, Lma/i;->l()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    return-object p1

    .line 90
    :pswitch_6
    invoke-virtual {p0, v3}, Lma/j;->w(I)V

    .line 91
    .line 92
    .line 93
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 94
    .line 95
    invoke-virtual {p1}, Lma/i;->y()I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    return-object p1

    .line 104
    :pswitch_7
    invoke-virtual {p0}, Lma/j;->e()Lma/h;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    return-object p1

    .line 109
    :pswitch_8
    invoke-virtual {p0, v0}, Lma/j;->w(I)V

    .line 110
    .line 111
    .line 112
    sget-object p1, Lma/d1;->c:Lma/d1;

    .line 113
    .line 114
    invoke-virtual {p1, p2}, Lma/d1;->a(Ljava/lang/Class;)Lma/i1;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-interface {p1}, Lma/i1;->f()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-virtual {p0, p2, p1, p3}, Lma/j;->c(Ljava/lang/Object;Lma/i1;Lma/o;)V

    .line 123
    .line 124
    .line 125
    invoke-interface {p1, p2}, Lma/i1;->b(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    return-object p2

    .line 129
    :pswitch_9
    invoke-virtual {p0, v0}, Lma/j;->w(I)V

    .line 130
    .line 131
    .line 132
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 133
    .line 134
    invoke-virtual {p1}, Lma/i;->w()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    return-object p1

    .line 139
    :pswitch_a
    invoke-virtual {p0, v3}, Lma/j;->w(I)V

    .line 140
    .line 141
    .line 142
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 143
    .line 144
    invoke-virtual {p1}, Lma/i;->i()Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    return-object p1

    .line 153
    :pswitch_b
    invoke-virtual {p0, v1}, Lma/j;->w(I)V

    .line 154
    .line 155
    .line 156
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 157
    .line 158
    invoke-virtual {p1}, Lma/i;->m()I

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    return-object p1

    .line 167
    :pswitch_c
    invoke-virtual {p0, v2}, Lma/j;->w(I)V

    .line 168
    .line 169
    .line 170
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 171
    .line 172
    invoke-virtual {p1}, Lma/i;->n()J

    .line 173
    .line 174
    .line 175
    move-result-wide p1

    .line 176
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    return-object p1

    .line 181
    :pswitch_d
    invoke-virtual {p0, v3}, Lma/j;->w(I)V

    .line 182
    .line 183
    .line 184
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 185
    .line 186
    invoke-virtual {p1}, Lma/i;->p()I

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    return-object p1

    .line 195
    :pswitch_e
    invoke-virtual {p0, v3}, Lma/j;->w(I)V

    .line 196
    .line 197
    .line 198
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 199
    .line 200
    invoke-virtual {p1}, Lma/i;->z()J

    .line 201
    .line 202
    .line 203
    move-result-wide p1

    .line 204
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    return-object p1

    .line 209
    :pswitch_f
    invoke-virtual {p0, v3}, Lma/j;->w(I)V

    .line 210
    .line 211
    .line 212
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 213
    .line 214
    invoke-virtual {p1}, Lma/i;->q()J

    .line 215
    .line 216
    .line 217
    move-result-wide p1

    .line 218
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    return-object p1

    .line 223
    :pswitch_10
    invoke-virtual {p0, v1}, Lma/j;->w(I)V

    .line 224
    .line 225
    .line 226
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 227
    .line 228
    invoke-virtual {p1}, Lma/i;->o()F

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    return-object p1

    .line 237
    :pswitch_11
    invoke-virtual {p0, v2}, Lma/j;->w(I)V

    .line 238
    .line 239
    .line 240
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 241
    .line 242
    invoke-virtual {p1}, Lma/i;->k()D

    .line 243
    .line 244
    .line 245
    move-result-wide p1

    .line 246
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    return-object p1

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final j(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lma/z;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x2

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Lma/z;

    .line 9
    .line 10
    iget p1, p0, Lma/j;->b:I

    .line 11
    .line 12
    and-int/lit8 p1, p1, 0x7

    .line 13
    .line 14
    if-eq p1, v2, :cond_3

    .line 15
    .line 16
    if-ne p1, v1, :cond_2

    .line 17
    .line 18
    :cond_0
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 19
    .line 20
    invoke-virtual {p1}, Lma/i;->m()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {v0, p1}, Lma/z;->h(I)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 28
    .line 29
    invoke-virtual {p1}, Lma/i;->e()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 37
    .line 38
    invoke-virtual {p1}, Lma/i;->x()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iget v1, p0, Lma/j;->b:I

    .line 43
    .line 44
    if-eq p1, v1, :cond_0

    .line 45
    .line 46
    iput p1, p0, Lma/j;->d:I

    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    sget p1, Lma/b0;->c:I

    .line 50
    .line 51
    new-instance p1, Lma/b0$a;

    .line 52
    .line 53
    invoke-direct {p1}, Lma/b0$a;-><init>()V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_3
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 58
    .line 59
    invoke-virtual {p1}, Lma/i;->y()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-static {p1}, Lma/j;->y(I)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lma/j;->a:Lma/i;

    .line 67
    .line 68
    invoke-virtual {v1}, Lma/i;->d()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    add-int v3, v1, p1

    .line 73
    .line 74
    :cond_4
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 75
    .line 76
    invoke-virtual {p1}, Lma/i;->m()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-virtual {v0, p1}, Lma/z;->h(I)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 84
    .line 85
    invoke-virtual {p1}, Lma/i;->d()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-lt p1, v3, :cond_4

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_5
    iget v0, p0, Lma/j;->b:I

    .line 93
    .line 94
    and-int/lit8 v0, v0, 0x7

    .line 95
    .line 96
    if-eq v0, v2, :cond_9

    .line 97
    .line 98
    if-ne v0, v1, :cond_8

    .line 99
    .line 100
    :cond_6
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 101
    .line 102
    invoke-virtual {v0}, Lma/i;->m()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 114
    .line 115
    invoke-virtual {v0}, Lma/i;->e()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_7

    .line 120
    .line 121
    return-void

    .line 122
    :cond_7
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 123
    .line 124
    invoke-virtual {v0}, Lma/i;->x()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    iget v1, p0, Lma/j;->b:I

    .line 129
    .line 130
    if-eq v0, v1, :cond_6

    .line 131
    .line 132
    iput v0, p0, Lma/j;->d:I

    .line 133
    .line 134
    return-void

    .line 135
    :cond_8
    sget p1, Lma/b0;->c:I

    .line 136
    .line 137
    new-instance p1, Lma/b0$a;

    .line 138
    .line 139
    invoke-direct {p1}, Lma/b0$a;-><init>()V

    .line 140
    .line 141
    .line 142
    throw p1

    .line 143
    :cond_9
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 144
    .line 145
    invoke-virtual {v0}, Lma/i;->y()I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    invoke-static {v0}, Lma/j;->y(I)V

    .line 150
    .line 151
    .line 152
    iget-object v1, p0, Lma/j;->a:Lma/i;

    .line 153
    .line 154
    invoke-virtual {v1}, Lma/i;->d()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    add-int/2addr v1, v0

    .line 159
    :cond_a
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 160
    .line 161
    invoke-virtual {v0}, Lma/i;->m()I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 173
    .line 174
    invoke-virtual {v0}, Lma/i;->d()I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-lt v0, v1, :cond_a

    .line 179
    .line 180
    :goto_0
    return-void
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
.end method

.method public final k(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lma/j0;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Lma/j0;

    .line 9
    .line 10
    iget p1, p0, Lma/j;->b:I

    .line 11
    .line 12
    and-int/lit8 p1, p1, 0x7

    .line 13
    .line 14
    if-eq p1, v2, :cond_2

    .line 15
    .line 16
    if-ne p1, v1, :cond_1

    .line 17
    .line 18
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 19
    .line 20
    invoke-virtual {p1}, Lma/i;->y()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-static {p1}, Lma/j;->z(I)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lma/j;->a:Lma/i;

    .line 28
    .line 29
    invoke-virtual {v1}, Lma/i;->d()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v1, p1

    .line 34
    :cond_0
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 35
    .line 36
    invoke-virtual {p1}, Lma/i;->n()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    invoke-virtual {v0, v2, v3}, Lma/j0;->h(J)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 44
    .line 45
    invoke-virtual {p1}, Lma/i;->d()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-lt p1, v1, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    sget p1, Lma/b0;->c:I

    .line 53
    .line 54
    new-instance p1, Lma/b0$a;

    .line 55
    .line 56
    invoke-direct {p1}, Lma/b0$a;-><init>()V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 61
    .line 62
    invoke-virtual {p1}, Lma/i;->n()J

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    invoke-virtual {v0, v1, v2}, Lma/j0;->h(J)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 70
    .line 71
    invoke-virtual {p1}, Lma/i;->e()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 79
    .line 80
    invoke-virtual {p1}, Lma/i;->x()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    iget v1, p0, Lma/j;->b:I

    .line 85
    .line 86
    if-eq p1, v1, :cond_2

    .line 87
    .line 88
    iput p1, p0, Lma/j;->d:I

    .line 89
    .line 90
    return-void

    .line 91
    :cond_4
    iget v0, p0, Lma/j;->b:I

    .line 92
    .line 93
    and-int/lit8 v0, v0, 0x7

    .line 94
    .line 95
    if-eq v0, v2, :cond_7

    .line 96
    .line 97
    if-ne v0, v1, :cond_6

    .line 98
    .line 99
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 100
    .line 101
    invoke-virtual {v0}, Lma/i;->y()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-static {v0}, Lma/j;->z(I)V

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lma/j;->a:Lma/i;

    .line 109
    .line 110
    invoke-virtual {v1}, Lma/i;->d()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    add-int/2addr v1, v0

    .line 115
    :cond_5
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 116
    .line 117
    invoke-virtual {v0}, Lma/i;->n()J

    .line 118
    .line 119
    .line 120
    move-result-wide v2

    .line 121
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 129
    .line 130
    invoke-virtual {v0}, Lma/i;->d()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-lt v0, v1, :cond_5

    .line 135
    .line 136
    :goto_0
    return-void

    .line 137
    :cond_6
    sget p1, Lma/b0;->c:I

    .line 138
    .line 139
    new-instance p1, Lma/b0$a;

    .line 140
    .line 141
    invoke-direct {p1}, Lma/b0$a;-><init>()V

    .line 142
    .line 143
    .line 144
    throw p1

    .line 145
    :cond_7
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 146
    .line 147
    invoke-virtual {v0}, Lma/i;->n()J

    .line 148
    .line 149
    .line 150
    move-result-wide v0

    .line 151
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 159
    .line 160
    invoke-virtual {v0}, Lma/i;->e()Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_8

    .line 165
    .line 166
    return-void

    .line 167
    :cond_8
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 168
    .line 169
    invoke-virtual {v0}, Lma/i;->x()I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    iget v1, p0, Lma/j;->b:I

    .line 174
    .line 175
    if-eq v0, v1, :cond_7

    .line 176
    .line 177
    iput v0, p0, Lma/j;->d:I

    .line 178
    .line 179
    return-void
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
.end method

.method public final l(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lma/u;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x2

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Lma/u;

    .line 9
    .line 10
    iget p1, p0, Lma/j;->b:I

    .line 11
    .line 12
    and-int/lit8 p1, p1, 0x7

    .line 13
    .line 14
    if-eq p1, v2, :cond_3

    .line 15
    .line 16
    if-ne p1, v1, :cond_2

    .line 17
    .line 18
    :cond_0
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 19
    .line 20
    invoke-virtual {p1}, Lma/i;->o()F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {v0, p1}, Lma/u;->h(F)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 28
    .line 29
    invoke-virtual {p1}, Lma/i;->e()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 37
    .line 38
    invoke-virtual {p1}, Lma/i;->x()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iget v1, p0, Lma/j;->b:I

    .line 43
    .line 44
    if-eq p1, v1, :cond_0

    .line 45
    .line 46
    iput p1, p0, Lma/j;->d:I

    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    sget p1, Lma/b0;->c:I

    .line 50
    .line 51
    new-instance p1, Lma/b0$a;

    .line 52
    .line 53
    invoke-direct {p1}, Lma/b0$a;-><init>()V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_3
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 58
    .line 59
    invoke-virtual {p1}, Lma/i;->y()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-static {p1}, Lma/j;->y(I)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lma/j;->a:Lma/i;

    .line 67
    .line 68
    invoke-virtual {v1}, Lma/i;->d()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    add-int v3, v1, p1

    .line 73
    .line 74
    :cond_4
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 75
    .line 76
    invoke-virtual {p1}, Lma/i;->o()F

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-virtual {v0, p1}, Lma/u;->h(F)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 84
    .line 85
    invoke-virtual {p1}, Lma/i;->d()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-lt p1, v3, :cond_4

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_5
    iget v0, p0, Lma/j;->b:I

    .line 93
    .line 94
    and-int/lit8 v0, v0, 0x7

    .line 95
    .line 96
    if-eq v0, v2, :cond_9

    .line 97
    .line 98
    if-ne v0, v1, :cond_8

    .line 99
    .line 100
    :cond_6
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 101
    .line 102
    invoke-virtual {v0}, Lma/i;->o()F

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 114
    .line 115
    invoke-virtual {v0}, Lma/i;->e()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_7

    .line 120
    .line 121
    return-void

    .line 122
    :cond_7
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 123
    .line 124
    invoke-virtual {v0}, Lma/i;->x()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    iget v1, p0, Lma/j;->b:I

    .line 129
    .line 130
    if-eq v0, v1, :cond_6

    .line 131
    .line 132
    iput v0, p0, Lma/j;->d:I

    .line 133
    .line 134
    return-void

    .line 135
    :cond_8
    sget p1, Lma/b0;->c:I

    .line 136
    .line 137
    new-instance p1, Lma/b0$a;

    .line 138
    .line 139
    invoke-direct {p1}, Lma/b0$a;-><init>()V

    .line 140
    .line 141
    .line 142
    throw p1

    .line 143
    :cond_9
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 144
    .line 145
    invoke-virtual {v0}, Lma/i;->y()I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    invoke-static {v0}, Lma/j;->y(I)V

    .line 150
    .line 151
    .line 152
    iget-object v1, p0, Lma/j;->a:Lma/i;

    .line 153
    .line 154
    invoke-virtual {v1}, Lma/i;->d()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    add-int/2addr v1, v0

    .line 159
    :cond_a
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 160
    .line 161
    invoke-virtual {v0}, Lma/i;->o()F

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 173
    .line 174
    invoke-virtual {v0}, Lma/i;->d()I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-lt v0, v1, :cond_a

    .line 179
    .line 180
    :goto_0
    return-void
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
.end method

.method public final m(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lma/z;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lma/z;

    iget p1, p0, Lma/j;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->y()I

    move-result p1

    iget-object v1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v1}, Lma/i;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->p()I

    move-result p1

    invoke-virtual {v0, p1}, Lma/z;->h(I)V

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lma/b0;->d()Lma/b0$a;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->p()I

    move-result p1

    invoke-virtual {v0, p1}, Lma/z;->h(I)V

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->x()I

    move-result p1

    iget v1, p0, Lma/j;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lma/j;->d:I

    return-void

    :cond_4
    iget v0, p0, Lma/j;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->y()I

    move-result v0

    iget-object v1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v1}, Lma/i;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->p()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    invoke-virtual {p0, v1}, Lma/j;->v(I)V

    return-void

    :cond_6
    invoke-static {}, Lma/b0;->d()Lma/b0$a;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->p()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->x()I

    move-result v0

    iget v1, p0, Lma/j;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lma/j;->d:I

    return-void
.end method

.method public final n(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lma/j0;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lma/j0;

    iget p1, p0, Lma/j;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->y()I

    move-result p1

    iget-object v1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v1}, Lma/i;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->q()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lma/j0;->h(J)V

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lma/b0;->d()Lma/b0$a;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->q()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lma/j0;->h(J)V

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->x()I

    move-result p1

    iget v1, p0, Lma/j;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lma/j;->d:I

    return-void

    :cond_4
    iget v0, p0, Lma/j;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->y()I

    move-result v0

    iget-object v1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v1}, Lma/i;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->q()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    invoke-virtual {p0, v1}, Lma/j;->v(I)V

    return-void

    :cond_6
    invoke-static {}, Lma/b0;->d()Lma/b0$a;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->q()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->x()I

    move-result v0

    iget v1, p0, Lma/j;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lma/j;->d:I

    return-void
.end method

.method public final o(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lma/z;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x2

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Lma/z;

    .line 9
    .line 10
    iget p1, p0, Lma/j;->b:I

    .line 11
    .line 12
    and-int/lit8 p1, p1, 0x7

    .line 13
    .line 14
    if-eq p1, v2, :cond_3

    .line 15
    .line 16
    if-ne p1, v1, :cond_2

    .line 17
    .line 18
    :cond_0
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 19
    .line 20
    invoke-virtual {p1}, Lma/i;->r()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {v0, p1}, Lma/z;->h(I)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 28
    .line 29
    invoke-virtual {p1}, Lma/i;->e()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 37
    .line 38
    invoke-virtual {p1}, Lma/i;->x()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iget v1, p0, Lma/j;->b:I

    .line 43
    .line 44
    if-eq p1, v1, :cond_0

    .line 45
    .line 46
    iput p1, p0, Lma/j;->d:I

    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    sget p1, Lma/b0;->c:I

    .line 50
    .line 51
    new-instance p1, Lma/b0$a;

    .line 52
    .line 53
    invoke-direct {p1}, Lma/b0$a;-><init>()V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_3
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 58
    .line 59
    invoke-virtual {p1}, Lma/i;->y()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-static {p1}, Lma/j;->y(I)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lma/j;->a:Lma/i;

    .line 67
    .line 68
    invoke-virtual {v1}, Lma/i;->d()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    add-int v3, v1, p1

    .line 73
    .line 74
    :cond_4
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 75
    .line 76
    invoke-virtual {p1}, Lma/i;->r()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-virtual {v0, p1}, Lma/z;->h(I)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 84
    .line 85
    invoke-virtual {p1}, Lma/i;->d()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-lt p1, v3, :cond_4

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_5
    iget v0, p0, Lma/j;->b:I

    .line 93
    .line 94
    and-int/lit8 v0, v0, 0x7

    .line 95
    .line 96
    if-eq v0, v2, :cond_9

    .line 97
    .line 98
    if-ne v0, v1, :cond_8

    .line 99
    .line 100
    :cond_6
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 101
    .line 102
    invoke-virtual {v0}, Lma/i;->r()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 114
    .line 115
    invoke-virtual {v0}, Lma/i;->e()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_7

    .line 120
    .line 121
    return-void

    .line 122
    :cond_7
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 123
    .line 124
    invoke-virtual {v0}, Lma/i;->x()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    iget v1, p0, Lma/j;->b:I

    .line 129
    .line 130
    if-eq v0, v1, :cond_6

    .line 131
    .line 132
    iput v0, p0, Lma/j;->d:I

    .line 133
    .line 134
    return-void

    .line 135
    :cond_8
    sget p1, Lma/b0;->c:I

    .line 136
    .line 137
    new-instance p1, Lma/b0$a;

    .line 138
    .line 139
    invoke-direct {p1}, Lma/b0$a;-><init>()V

    .line 140
    .line 141
    .line 142
    throw p1

    .line 143
    :cond_9
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 144
    .line 145
    invoke-virtual {v0}, Lma/i;->y()I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    invoke-static {v0}, Lma/j;->y(I)V

    .line 150
    .line 151
    .line 152
    iget-object v1, p0, Lma/j;->a:Lma/i;

    .line 153
    .line 154
    invoke-virtual {v1}, Lma/i;->d()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    add-int/2addr v1, v0

    .line 159
    :cond_a
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 160
    .line 161
    invoke-virtual {v0}, Lma/i;->r()I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 173
    .line 174
    invoke-virtual {v0}, Lma/i;->d()I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-lt v0, v1, :cond_a

    .line 179
    .line 180
    :goto_0
    return-void
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
.end method

.method public final p(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lma/j0;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Lma/j0;

    .line 9
    .line 10
    iget p1, p0, Lma/j;->b:I

    .line 11
    .line 12
    and-int/lit8 p1, p1, 0x7

    .line 13
    .line 14
    if-eq p1, v2, :cond_2

    .line 15
    .line 16
    if-ne p1, v1, :cond_1

    .line 17
    .line 18
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 19
    .line 20
    invoke-virtual {p1}, Lma/i;->y()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-static {p1}, Lma/j;->z(I)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lma/j;->a:Lma/i;

    .line 28
    .line 29
    invoke-virtual {v1}, Lma/i;->d()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v1, p1

    .line 34
    :cond_0
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 35
    .line 36
    invoke-virtual {p1}, Lma/i;->s()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    invoke-virtual {v0, v2, v3}, Lma/j0;->h(J)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 44
    .line 45
    invoke-virtual {p1}, Lma/i;->d()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-lt p1, v1, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    sget p1, Lma/b0;->c:I

    .line 53
    .line 54
    new-instance p1, Lma/b0$a;

    .line 55
    .line 56
    invoke-direct {p1}, Lma/b0$a;-><init>()V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 61
    .line 62
    invoke-virtual {p1}, Lma/i;->s()J

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    invoke-virtual {v0, v1, v2}, Lma/j0;->h(J)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 70
    .line 71
    invoke-virtual {p1}, Lma/i;->e()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 79
    .line 80
    invoke-virtual {p1}, Lma/i;->x()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    iget v1, p0, Lma/j;->b:I

    .line 85
    .line 86
    if-eq p1, v1, :cond_2

    .line 87
    .line 88
    iput p1, p0, Lma/j;->d:I

    .line 89
    .line 90
    return-void

    .line 91
    :cond_4
    iget v0, p0, Lma/j;->b:I

    .line 92
    .line 93
    and-int/lit8 v0, v0, 0x7

    .line 94
    .line 95
    if-eq v0, v2, :cond_7

    .line 96
    .line 97
    if-ne v0, v1, :cond_6

    .line 98
    .line 99
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 100
    .line 101
    invoke-virtual {v0}, Lma/i;->y()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-static {v0}, Lma/j;->z(I)V

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lma/j;->a:Lma/i;

    .line 109
    .line 110
    invoke-virtual {v1}, Lma/i;->d()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    add-int/2addr v1, v0

    .line 115
    :cond_5
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 116
    .line 117
    invoke-virtual {v0}, Lma/i;->s()J

    .line 118
    .line 119
    .line 120
    move-result-wide v2

    .line 121
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 129
    .line 130
    invoke-virtual {v0}, Lma/i;->d()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-lt v0, v1, :cond_5

    .line 135
    .line 136
    :goto_0
    return-void

    .line 137
    :cond_6
    sget p1, Lma/b0;->c:I

    .line 138
    .line 139
    new-instance p1, Lma/b0$a;

    .line 140
    .line 141
    invoke-direct {p1}, Lma/b0$a;-><init>()V

    .line 142
    .line 143
    .line 144
    throw p1

    .line 145
    :cond_7
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 146
    .line 147
    invoke-virtual {v0}, Lma/i;->s()J

    .line 148
    .line 149
    .line 150
    move-result-wide v0

    .line 151
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 159
    .line 160
    invoke-virtual {v0}, Lma/i;->e()Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_8

    .line 165
    .line 166
    return-void

    .line 167
    :cond_8
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 168
    .line 169
    invoke-virtual {v0}, Lma/i;->x()I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    iget v1, p0, Lma/j;->b:I

    .line 174
    .line 175
    if-eq v0, v1, :cond_7

    .line 176
    .line 177
    iput v0, p0, Lma/j;->d:I

    .line 178
    .line 179
    return-void
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
.end method

.method public final q(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lma/z;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lma/z;

    iget p1, p0, Lma/j;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->y()I

    move-result p1

    iget-object v1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v1}, Lma/i;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->t()I

    move-result p1

    invoke-virtual {v0, p1}, Lma/z;->h(I)V

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lma/b0;->d()Lma/b0$a;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->t()I

    move-result p1

    invoke-virtual {v0, p1}, Lma/z;->h(I)V

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->x()I

    move-result p1

    iget v1, p0, Lma/j;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lma/j;->d:I

    return-void

    :cond_4
    iget v0, p0, Lma/j;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->y()I

    move-result v0

    iget-object v1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v1}, Lma/i;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->t()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    invoke-virtual {p0, v1}, Lma/j;->v(I)V

    return-void

    :cond_6
    invoke-static {}, Lma/b0;->d()Lma/b0$a;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->t()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->x()I

    move-result v0

    iget v1, p0, Lma/j;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lma/j;->d:I

    return-void
.end method

.method public final r(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lma/j0;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lma/j0;

    iget p1, p0, Lma/j;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->y()I

    move-result p1

    iget-object v1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v1}, Lma/i;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->u()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lma/j0;->h(J)V

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lma/b0;->d()Lma/b0$a;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->u()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lma/j0;->h(J)V

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->x()I

    move-result p1

    iget v1, p0, Lma/j;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lma/j;->d:I

    return-void

    :cond_4
    iget v0, p0, Lma/j;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->y()I

    move-result v0

    iget-object v1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v1}, Lma/i;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->u()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    invoke-virtual {p0, v1}, Lma/j;->v(I)V

    return-void

    :cond_6
    invoke-static {}, Lma/b0;->d()Lma/b0$a;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->u()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->x()I

    move-result v0

    iget v1, p0, Lma/j;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lma/j;->d:I

    return-void
.end method

.method public final s(Ljava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    iget v0, p0, Lma/j;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x7

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_5

    .line 7
    .line 8
    instance-of v0, p1, Lma/h0;

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    if-nez p2, :cond_2

    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Lma/h0;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lma/j;->e()Lma/h;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {v0, p1}, Lma/h0;->v(Lma/h;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 25
    .line 26
    invoke-virtual {p1}, Lma/i;->e()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object p1, p0, Lma/j;->a:Lma/i;

    .line 34
    .line 35
    invoke-virtual {p1}, Lma/i;->x()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iget p2, p0, Lma/j;->b:I

    .line 40
    .line 41
    if-eq p1, p2, :cond_0

    .line 42
    .line 43
    iput p1, p0, Lma/j;->d:I

    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    if-eqz p2, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Lma/j;->w(I)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 52
    .line 53
    invoke-virtual {v0}, Lma/i;->w()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-virtual {p0, v1}, Lma/j;->w(I)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 62
    .line 63
    invoke-virtual {v0}, Lma/i;->v()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    :goto_0
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 71
    .line 72
    invoke-virtual {v0}, Lma/i;->e()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    return-void

    .line 79
    :cond_4
    iget-object v0, p0, Lma/j;->a:Lma/i;

    .line 80
    .line 81
    invoke-virtual {v0}, Lma/i;->x()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iget v2, p0, Lma/j;->b:I

    .line 86
    .line 87
    if-eq v0, v2, :cond_2

    .line 88
    .line 89
    iput v0, p0, Lma/j;->d:I

    .line 90
    .line 91
    return-void

    .line 92
    :cond_5
    sget p1, Lma/b0;->c:I

    .line 93
    .line 94
    new-instance p1, Lma/b0$a;

    .line 95
    .line 96
    invoke-direct {p1}, Lma/b0$a;-><init>()V

    .line 97
    .line 98
    .line 99
    throw p1
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

.method public final t(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lma/z;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lma/z;

    iget p1, p0, Lma/j;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->y()I

    move-result p1

    iget-object v1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v1}, Lma/i;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->y()I

    move-result p1

    invoke-virtual {v0, p1}, Lma/z;->h(I)V

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lma/b0;->d()Lma/b0$a;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->y()I

    move-result p1

    invoke-virtual {v0, p1}, Lma/z;->h(I)V

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->x()I

    move-result p1

    iget v1, p0, Lma/j;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lma/j;->d:I

    return-void

    :cond_4
    iget v0, p0, Lma/j;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->y()I

    move-result v0

    iget-object v1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v1}, Lma/i;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->y()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    invoke-virtual {p0, v1}, Lma/j;->v(I)V

    return-void

    :cond_6
    invoke-static {}, Lma/b0;->d()Lma/b0$a;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->y()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->x()I

    move-result v0

    iget v1, p0, Lma/j;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lma/j;->d:I

    return-void
.end method

.method public final u(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lma/j0;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lma/j0;

    iget p1, p0, Lma/j;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->y()I

    move-result p1

    iget-object v1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v1}, Lma/i;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->z()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lma/j0;->h(J)V

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lma/b0;->d()Lma/b0$a;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->z()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lma/j0;->h(J)V

    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {p1}, Lma/i;->x()I

    move-result p1

    iget v1, p0, Lma/j;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lma/j;->d:I

    return-void

    :cond_4
    iget v0, p0, Lma/j;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->y()I

    move-result v0

    iget-object v1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v1}, Lma/i;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->z()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    invoke-virtual {p0, v1}, Lma/j;->v(I)V

    return-void

    :cond_6
    invoke-static {}, Lma/b0;->d()Lma/b0$a;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->z()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->x()I

    move-result v0

    iget v1, p0, Lma/j;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lma/j;->d:I

    return-void
.end method

.method public final v(I)V
    .locals 1

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->d()I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lma/b0;->h()Lma/b0;

    move-result-object p1

    throw p1
.end method

.method public final w(I)V
    .locals 1

    iget v0, p0, Lma/j;->b:I

    and-int/lit8 v0, v0, 0x7

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lma/b0;->d()Lma/b0$a;

    move-result-object p1

    throw p1
.end method

.method public final x()Z
    .locals 2

    iget-object v0, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v0}, Lma/i;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lma/j;->b:I

    iget v1, p0, Lma/j;->c:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lma/j;->a:Lma/i;

    invoke-virtual {v1, v0}, Lma/i;->A(I)Z

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method
