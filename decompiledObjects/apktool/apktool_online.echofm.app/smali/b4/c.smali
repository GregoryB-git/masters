.class public Lb4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb4/d;


# instance fields
.field public final a:Lb4/e;

.field public final b:Ld4/h;

.field public final c:I

.field public final d:Z


# direct methods
.method public constructor <init>(La4/h;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb4/e;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lb4/e;-><init>(La4/h;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lb4/c;->a:Lb4/e;

    .line 10
    .line 11
    invoke-virtual {p1}, La4/h;->d()Ld4/h;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lb4/c;->b:Ld4/h;

    .line 16
    .line 17
    invoke-virtual {p1}, La4/h;->i()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p0, Lb4/c;->c:I

    .line 22
    .line 23
    invoke-virtual {p1}, La4/h;->r()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    xor-int/lit8 p1, p1, 0x1

    .line 28
    .line 29
    iput-boolean p1, p0, Lb4/c;->d:Z

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public a(Ld4/i;Ld4/n;)Ld4/i;
    .locals 0

    .line 1
    return-object p1
.end method

.method public b()Lb4/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lb4/c;->a:Lb4/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb4/e;->b()Lb4/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public c(Ld4/i;Ld4/b;Ld4/n;LV3/k;Lb4/d$a;Lb4/a;)Ld4/i;
    .locals 7

    .line 1
    iget-object v0, p0, Lb4/c;->a:Lb4/e;

    .line 2
    .line 3
    new-instance v1, Ld4/m;

    .line 4
    .line 5
    invoke-direct {v1, p2, p3}, Ld4/m;-><init>(Ld4/b;Ld4/n;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lb4/e;->k(Ld4/m;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-static {}, Ld4/g;->W()Ld4/g;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    :cond_0
    move-object v3, p3

    .line 19
    invoke-virtual {p1}, Ld4/i;->k()Ld4/n;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-interface {p3, p2}, Ld4/n;->v(Ld4/b;)Ld4/n;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    invoke-virtual {p3, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    if-eqz p3, :cond_1

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_1
    invoke-virtual {p1}, Ld4/i;->k()Ld4/n;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    invoke-interface {p3}, Ld4/n;->E()I

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    iget v0, p0, Lb4/c;->c:I

    .line 43
    .line 44
    if-ge p3, v0, :cond_2

    .line 45
    .line 46
    iget-object p3, p0, Lb4/c;->a:Lb4/e;

    .line 47
    .line 48
    invoke-virtual {p3}, Lb4/e;->b()Lb4/d;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    move-object v1, p1

    .line 53
    move-object v2, p2

    .line 54
    move-object v4, p4

    .line 55
    move-object v5, p5

    .line 56
    move-object v6, p6

    .line 57
    invoke-interface/range {v0 .. v6}, Lb4/d;->c(Ld4/i;Ld4/b;Ld4/n;LV3/k;Lb4/d$a;Lb4/a;)Ld4/i;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :cond_2
    move-object v0, p0

    .line 63
    move-object v1, p1

    .line 64
    move-object v2, p2

    .line 65
    move-object v4, p5

    .line 66
    move-object v5, p6

    .line 67
    invoke-virtual/range {v0 .. v5}, Lb4/c;->g(Ld4/i;Ld4/b;Ld4/n;Lb4/d$a;Lb4/a;)Ld4/i;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1
.end method

.method public d()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public e()Ld4/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lb4/c;->b:Ld4/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public f(Ld4/i;Ld4/i;Lb4/a;)Ld4/i;
    .locals 9

    .line 1
    invoke-virtual {p2}, Ld4/i;->k()Ld4/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ld4/n;->B()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_4

    .line 10
    .line 11
    invoke-virtual {p2}, Ld4/i;->k()Ld4/n;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ld4/n;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_0
    invoke-static {}, Ld4/r;->a()Ld4/n;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p2, v0}, Ld4/i;->M(Ld4/n;)Ld4/i;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-boolean v1, p0, Lb4/c;->d:Z

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p2}, Ld4/i;->P()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    iget-object v1, p0, Lb4/c;->a:Lb4/e;

    .line 40
    .line 41
    invoke-virtual {v1}, Lb4/e;->g()Ld4/m;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v3, p0, Lb4/c;->a:Lb4/e;

    .line 46
    .line 47
    invoke-virtual {v3}, Lb4/e;->i()Ld4/m;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    const/4 v4, -0x1

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {p2}, Ld4/i;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    iget-object v1, p0, Lb4/c;->a:Lb4/e;

    .line 58
    .line 59
    invoke-virtual {v1}, Lb4/e;->i()Ld4/m;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iget-object v3, p0, Lb4/c;->a:Lb4/e;

    .line 64
    .line 65
    invoke-virtual {v3}, Lb4/e;->g()Ld4/m;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    move v4, v2

    .line 70
    :goto_0
    const/4 v5, 0x0

    .line 71
    move v6, v5

    .line 72
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eqz v7, :cond_5

    .line 77
    .line 78
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    check-cast v7, Ld4/m;

    .line 83
    .line 84
    if-nez v5, :cond_2

    .line 85
    .line 86
    iget-object v8, p0, Lb4/c;->b:Ld4/h;

    .line 87
    .line 88
    invoke-interface {v8, v1, v7}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    mul-int/2addr v8, v4

    .line 93
    if-gtz v8, :cond_2

    .line 94
    .line 95
    move v5, v2

    .line 96
    :cond_2
    if-eqz v5, :cond_3

    .line 97
    .line 98
    iget v8, p0, Lb4/c;->c:I

    .line 99
    .line 100
    if-ge v6, v8, :cond_3

    .line 101
    .line 102
    iget-object v8, p0, Lb4/c;->b:Ld4/h;

    .line 103
    .line 104
    invoke-interface {v8, v7, v3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    mul-int/2addr v8, v4

    .line 109
    if-gtz v8, :cond_3

    .line 110
    .line 111
    add-int/lit8 v6, v6, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    invoke-virtual {v7}, Ld4/m;->c()Ld4/b;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    invoke-static {}, Ld4/g;->W()Ld4/g;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    invoke-virtual {v0, v7, v8}, Ld4/i;->D(Ld4/b;Ld4/n;)Ld4/i;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    goto :goto_1

    .line 127
    :cond_4
    :goto_2
    invoke-static {}, Ld4/g;->W()Ld4/g;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    iget-object v0, p0, Lb4/c;->b:Ld4/h;

    .line 132
    .line 133
    invoke-static {p2, v0}, Ld4/i;->f(Ld4/n;Ld4/h;)Ld4/i;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    :cond_5
    iget-object p2, p0, Lb4/c;->a:Lb4/e;

    .line 138
    .line 139
    invoke-virtual {p2}, Lb4/e;->b()Lb4/d;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-interface {p2, p1, v0, p3}, Lb4/d;->f(Ld4/i;Ld4/i;Lb4/a;)Ld4/i;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    return-object p1
.end method

.method public final g(Ld4/i;Ld4/b;Ld4/n;Lb4/d$a;Lb4/a;)Ld4/i;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ld4/i;->k()Ld4/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ld4/n;->E()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, Lb4/c;->c:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    move v0, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-static {v0}, LY3/m;->f(Z)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Ld4/m;

    .line 21
    .line 22
    invoke-direct {v0, p2, p3}, Ld4/m;-><init>(Ld4/b;Ld4/n;)V

    .line 23
    .line 24
    .line 25
    iget-boolean v1, p0, Lb4/c;->d:Z

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, Ld4/i;->g()Ld4/m;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {p1}, Ld4/i;->i()Ld4/m;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :goto_1
    iget-object v3, p0, Lb4/c;->a:Lb4/e;

    .line 39
    .line 40
    invoke-virtual {v3, v0}, Lb4/e;->k(Ld4/m;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-virtual {p1}, Ld4/i;->k()Ld4/n;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-interface {v4, p2}, Ld4/n;->Q(Ld4/b;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_a

    .line 53
    .line 54
    invoke-virtual {p1}, Ld4/i;->k()Ld4/n;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-interface {v4, p2}, Ld4/n;->v(Ld4/b;)Ld4/n;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    :cond_2
    :goto_2
    iget-object v5, p0, Lb4/c;->b:Ld4/h;

    .line 63
    .line 64
    iget-boolean v6, p0, Lb4/c;->d:Z

    .line 65
    .line 66
    invoke-interface {p4, v5, v1, v6}, Lb4/d$a;->a(Ld4/h;Ld4/m;Z)Ld4/m;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    invoke-virtual {v1}, Ld4/m;->c()Ld4/b;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-virtual {v5, p2}, Ld4/b;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-nez v5, :cond_2

    .line 81
    .line 82
    invoke-virtual {p1}, Ld4/i;->k()Ld4/n;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-virtual {v1}, Ld4/m;->c()Ld4/b;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-interface {v5, v6}, Ld4/n;->Q(Ld4/b;)Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_3

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    if-nez v1, :cond_4

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_4
    iget-object p4, p0, Lb4/c;->b:Ld4/h;

    .line 101
    .line 102
    iget-boolean v2, p0, Lb4/c;->d:Z

    .line 103
    .line 104
    invoke-virtual {p4, v1, v0, v2}, Ld4/h;->a(Ld4/m;Ld4/m;Z)I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    :goto_3
    if-eqz v3, :cond_6

    .line 109
    .line 110
    invoke-interface {p3}, Ld4/n;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result p4

    .line 114
    if-nez p4, :cond_6

    .line 115
    .line 116
    if-ltz v2, :cond_6

    .line 117
    .line 118
    if-eqz p5, :cond_5

    .line 119
    .line 120
    invoke-static {p2, p3, v4}, La4/c;->e(Ld4/b;Ld4/n;Ld4/n;)La4/c;

    .line 121
    .line 122
    .line 123
    move-result-object p4

    .line 124
    invoke-virtual {p5, p4}, Lb4/a;->b(La4/c;)V

    .line 125
    .line 126
    .line 127
    :cond_5
    invoke-virtual {p1, p2, p3}, Ld4/i;->D(Ld4/b;Ld4/n;)Ld4/i;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    return-object p1

    .line 132
    :cond_6
    if-eqz p5, :cond_7

    .line 133
    .line 134
    invoke-static {p2, v4}, La4/c;->h(Ld4/b;Ld4/n;)La4/c;

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    invoke-virtual {p5, p3}, Lb4/a;->b(La4/c;)V

    .line 139
    .line 140
    .line 141
    :cond_7
    invoke-static {}, Ld4/g;->W()Ld4/g;

    .line 142
    .line 143
    .line 144
    move-result-object p3

    .line 145
    invoke-virtual {p1, p2, p3}, Ld4/i;->D(Ld4/b;Ld4/n;)Ld4/i;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    if-eqz v1, :cond_9

    .line 150
    .line 151
    iget-object p2, p0, Lb4/c;->a:Lb4/e;

    .line 152
    .line 153
    invoke-virtual {p2, v1}, Lb4/e;->k(Ld4/m;)Z

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    if-eqz p2, :cond_9

    .line 158
    .line 159
    if-eqz p5, :cond_8

    .line 160
    .line 161
    invoke-virtual {v1}, Ld4/m;->c()Ld4/b;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    invoke-virtual {v1}, Ld4/m;->d()Ld4/n;

    .line 166
    .line 167
    .line 168
    move-result-object p3

    .line 169
    invoke-static {p2, p3}, La4/c;->c(Ld4/b;Ld4/n;)La4/c;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    invoke-virtual {p5, p2}, Lb4/a;->b(La4/c;)V

    .line 174
    .line 175
    .line 176
    :cond_8
    invoke-virtual {v1}, Ld4/m;->c()Ld4/b;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    invoke-virtual {v1}, Ld4/m;->d()Ld4/n;

    .line 181
    .line 182
    .line 183
    move-result-object p3

    .line 184
    :goto_4
    invoke-virtual {p1, p2, p3}, Ld4/i;->D(Ld4/b;Ld4/n;)Ld4/i;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    :cond_9
    return-object p1

    .line 189
    :cond_a
    invoke-interface {p3}, Ld4/n;->isEmpty()Z

    .line 190
    .line 191
    .line 192
    move-result p4

    .line 193
    if-eqz p4, :cond_b

    .line 194
    .line 195
    return-object p1

    .line 196
    :cond_b
    if-eqz v3, :cond_d

    .line 197
    .line 198
    iget-object p4, p0, Lb4/c;->b:Ld4/h;

    .line 199
    .line 200
    iget-boolean v2, p0, Lb4/c;->d:Z

    .line 201
    .line 202
    invoke-virtual {p4, v1, v0, v2}, Ld4/h;->a(Ld4/m;Ld4/m;Z)I

    .line 203
    .line 204
    .line 205
    move-result p4

    .line 206
    if-ltz p4, :cond_d

    .line 207
    .line 208
    if-eqz p5, :cond_c

    .line 209
    .line 210
    invoke-virtual {v1}, Ld4/m;->c()Ld4/b;

    .line 211
    .line 212
    .line 213
    move-result-object p4

    .line 214
    invoke-virtual {v1}, Ld4/m;->d()Ld4/n;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-static {p4, v0}, La4/c;->h(Ld4/b;Ld4/n;)La4/c;

    .line 219
    .line 220
    .line 221
    move-result-object p4

    .line 222
    invoke-virtual {p5, p4}, Lb4/a;->b(La4/c;)V

    .line 223
    .line 224
    .line 225
    invoke-static {p2, p3}, La4/c;->c(Ld4/b;Ld4/n;)La4/c;

    .line 226
    .line 227
    .line 228
    move-result-object p4

    .line 229
    invoke-virtual {p5, p4}, Lb4/a;->b(La4/c;)V

    .line 230
    .line 231
    .line 232
    :cond_c
    invoke-virtual {p1, p2, p3}, Ld4/i;->D(Ld4/b;Ld4/n;)Ld4/i;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-virtual {v1}, Ld4/m;->c()Ld4/b;

    .line 237
    .line 238
    .line 239
    move-result-object p2

    .line 240
    invoke-static {}, Ld4/g;->W()Ld4/g;

    .line 241
    .line 242
    .line 243
    move-result-object p3

    .line 244
    goto :goto_4

    .line 245
    :cond_d
    return-object p1
.end method
