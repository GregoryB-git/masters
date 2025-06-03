.class public final Li9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lm9/e0;


# direct methods
.method public constructor <init>(Lm9/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li9/i;->a:Lm9/e0;

    return-void
.end method

.method public static a(Lia/a;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lia/a;->I()Lma/a0$d;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lia/a$b;

    .line 25
    .line 26
    invoke-virtual {v1}, Lia/a$b;->J()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-static {v2}, Lj9/l;->t(Ljava/lang/String;)Lj9/l;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1}, Lia/a$b;->L()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const/4 v4, 0x2

    .line 39
    invoke-static {v3, v4}, Lq0/g;->b(II)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    const/4 v4, 0x3

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    invoke-virtual {v1}, Lia/a$b;->K()Lia/a$b$c;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    sget-object v3, Lia/a$b$c;->c:Lia/a$b$c;

    .line 52
    .line 53
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    const/4 v4, 0x1

    .line 60
    :cond_1
    :goto_1
    new-instance v1, Lj9/d;

    .line 61
    .line 62
    invoke-direct {v1, v2, v4}, Lj9/d;-><init>(Lj9/l;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    return-object v0
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method


# virtual methods
.method public final b(Ll9/a;)Lj9/m;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ll9/a;->L()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lq0/g;->c(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x2

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq v0, v2, :cond_1

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ll9/a;->O()Ll9/d;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object v0, p0, Li9/i;->a:Lm9/e0;

    .line 22
    .line 23
    invoke-virtual {p1}, Ll9/d;->J()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0, v2}, Lm9/e0;->b(Ljava/lang/String;)Lj9/i;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v2, p0, Li9/i;->a:Lm9/e0;

    .line 32
    .line 33
    invoke-virtual {p1}, Ll9/d;->K()Lma/n1;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lm9/e0;->f(Lma/n1;)Lj9/q;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    new-instance v2, Lj9/m;

    .line 45
    .line 46
    invoke-direct {v2, v0}, Lj9/m;-><init>(Lj9/i;)V

    .line 47
    .line 48
    .line 49
    iput-object p1, v2, Lj9/m;->d:Lj9/q;

    .line 50
    .line 51
    const/4 p1, 0x4

    .line 52
    iput p1, v2, Lj9/m;->c:I

    .line 53
    .line 54
    new-instance p1, Lj9/n;

    .line 55
    .line 56
    invoke-direct {p1}, Lj9/n;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, v2, Lj9/m;->f:Lj9/n;

    .line 60
    .line 61
    iput v1, v2, Lj9/m;->g:I

    .line 62
    .line 63
    return-object v2

    .line 64
    :cond_0
    new-array v0, v2, [Ljava/lang/Object;

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    aput-object p1, v0, v1

    .line 68
    .line 69
    const-string p1, "Unknown MaybeDocument %s"

    .line 70
    .line 71
    invoke-static {p1, v0}, Lx6/b;->T(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    const/4 p1, 0x0

    .line 75
    throw p1

    .line 76
    :cond_1
    invoke-virtual {p1}, Ll9/a;->K()Lka/k;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p1}, Ll9/a;->M()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    iget-object v2, p0, Li9/i;->a:Lm9/e0;

    .line 85
    .line 86
    invoke-virtual {v0}, Lka/k;->L()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v2, v3}, Lm9/e0;->b(Ljava/lang/String;)Lj9/i;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    iget-object v3, p0, Li9/i;->a:Lm9/e0;

    .line 95
    .line 96
    invoke-virtual {v0}, Lka/k;->M()Lma/n1;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-static {v4}, Lm9/e0;->f(Lma/n1;)Lj9/q;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {v0}, Lka/k;->K()Ljava/util/Map;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v0}, Lj9/n;->e(Ljava/util/Map;)Lj9/n;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    new-instance v4, Lj9/m;

    .line 116
    .line 117
    invoke-direct {v4, v2}, Lj9/m;-><init>(Lj9/i;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4, v3, v0}, Lj9/m;->k(Lj9/q;Lj9/n;)V

    .line 121
    .line 122
    .line 123
    if-eqz p1, :cond_2

    .line 124
    .line 125
    iput v1, v4, Lj9/m;->g:I

    .line 126
    .line 127
    :cond_2
    return-object v4

    .line 128
    :cond_3
    invoke-virtual {p1}, Ll9/a;->N()Ll9/b;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {p1}, Ll9/a;->M()Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    iget-object v2, p0, Li9/i;->a:Lm9/e0;

    .line 137
    .line 138
    invoke-virtual {v0}, Ll9/b;->J()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-virtual {v2, v3}, Lm9/e0;->b(Ljava/lang/String;)Lj9/i;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    iget-object v3, p0, Li9/i;->a:Lm9/e0;

    .line 147
    .line 148
    invoke-virtual {v0}, Ll9/b;->K()Lma/n1;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-static {v0}, Lm9/e0;->f(Lma/n1;)Lj9/q;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {v2, v0}, Lj9/m;->n(Lj9/i;Lj9/q;)Lj9/m;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    if-eqz p1, :cond_4

    .line 164
    .line 165
    iput v1, v0, Lj9/m;->g:I

    .line 166
    .line 167
    :cond_4
    return-object v0
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
.end method

.method public final c(Ll9/e;)Lk9/g;
    .locals 11

    .line 1
    invoke-virtual {p1}, Ll9/e;->M()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Li9/i;->a:Lm9/e0;

    .line 6
    .line 7
    invoke-virtual {p1}, Ll9/e;->N()Lma/n1;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v1, Lu7/m;

    .line 15
    .line 16
    invoke-virtual {v2}, Lma/n1;->K()J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    invoke-virtual {v2}, Lma/n1;->J()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-direct {v1, v2, v3, v4}, Lu7/m;-><init>(IJ)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ll9/e;->L()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    new-instance v3, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    move v5, v4

    .line 38
    :goto_0
    if-ge v5, v2, :cond_0

    .line 39
    .line 40
    iget-object v6, p0, Li9/i;->a:Lm9/e0;

    .line 41
    .line 42
    invoke-virtual {p1, v5}, Ll9/e;->K(I)Lka/e0;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-virtual {v6, v7}, Lm9/e0;->c(Lka/e0;)Lk9/f;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    add-int/lit8 v5, v5, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {p1}, Ll9/e;->P()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 63
    .line 64
    .line 65
    move v5, v4

    .line 66
    :goto_1
    invoke-virtual {p1}, Ll9/e;->P()I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-ge v5, v6, :cond_4

    .line 71
    .line 72
    invoke-virtual {p1, v5}, Ll9/e;->O(I)Lka/e0;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    add-int/lit8 v7, v5, 0x1

    .line 77
    .line 78
    invoke-virtual {p1}, Ll9/e;->P()I

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    const/4 v9, 0x1

    .line 83
    if-ge v7, v8, :cond_1

    .line 84
    .line 85
    invoke-virtual {p1, v7}, Ll9/e;->O(I)Lka/e0;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    invoke-virtual {v8}, Lka/e0;->V()Z

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    if-eqz v8, :cond_1

    .line 94
    .line 95
    move v8, v9

    .line 96
    goto :goto_2

    .line 97
    :cond_1
    move v8, v4

    .line 98
    :goto_2
    if-eqz v8, :cond_3

    .line 99
    .line 100
    invoke-virtual {p1, v5}, Ll9/e;->O(I)Lka/e0;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-virtual {v5}, Lka/e0;->W()Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    new-array v8, v4, [Ljava/lang/Object;

    .line 109
    .line 110
    const-string v10, "TransformMutation should be preceded by a patch or set mutation"

    .line 111
    .line 112
    invoke-static {v10, v5, v8}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v6}, Lka/e0;->Z(Lka/e0;)Lka/e0$a;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-virtual {p1, v7}, Ll9/e;->O(I)Lka/e0;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    invoke-virtual {v6}, Lka/e0;->P()Lka/p;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-virtual {v6}, Lka/p;->H()Lma/a0$d;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    if-eqz v8, :cond_2

    .line 140
    .line 141
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    check-cast v8, Lka/p$b;

    .line 146
    .line 147
    invoke-virtual {v5}, Lma/w$a;->m()V

    .line 148
    .line 149
    .line 150
    iget-object v10, v5, Lma/w$a;->b:Lma/w;

    .line 151
    .line 152
    check-cast v10, Lka/e0;

    .line 153
    .line 154
    invoke-static {v10, v8}, Lka/e0;->H(Lka/e0;Lka/p$b;)V

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_2
    iget-object v6, p0, Li9/i;->a:Lm9/e0;

    .line 159
    .line 160
    invoke-virtual {v5}, Lma/w$a;->k()Lma/w;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    check-cast v5, Lka/e0;

    .line 165
    .line 166
    invoke-virtual {v6, v5}, Lm9/e0;->c(Lka/e0;)Lk9/f;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move v5, v7

    .line 174
    goto :goto_4

    .line 175
    :cond_3
    iget-object v7, p0, Li9/i;->a:Lm9/e0;

    .line 176
    .line 177
    invoke-virtual {v7, v6}, Lm9/e0;->c(Lka/e0;)Lk9/f;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    :goto_4
    add-int/2addr v5, v9

    .line 185
    goto :goto_1

    .line 186
    :cond_4
    new-instance p1, Lk9/g;

    .line 187
    .line 188
    invoke-direct {p1, v0, v1, v3, v2}, Lk9/g;-><init>(ILu7/m;Ljava/util/ArrayList;Ljava/util/List;)V

    .line 189
    .line 190
    .line 191
    return-object p1
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

.method public final d(Ll9/c;)Li9/m1;
    .locals 12

    .line 1
    invoke-virtual {p1}, Ll9/c;->U()I

    .line 2
    .line 3
    .line 4
    move-result v2

    .line 5
    iget-object v0, p0, Li9/i;->a:Lm9/e0;

    .line 6
    .line 7
    invoke-virtual {p1}, Ll9/c;->T()Lma/n1;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Lm9/e0;->f(Lma/n1;)Lj9/q;

    .line 15
    .line 16
    .line 17
    move-result-object v6

    .line 18
    iget-object v0, p0, Li9/i;->a:Lm9/e0;

    .line 19
    .line 20
    invoke-virtual {p1}, Ll9/c;->P()Lma/n1;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lm9/e0;->f(Lma/n1;)Lj9/q;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    invoke-virtual {p1}, Ll9/c;->S()Lma/h;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    invoke-virtual {p1}, Ll9/c;->Q()J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    invoke-virtual {p1}, Ll9/c;->V()Ll9/c$b;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    const/4 v5, 0x1

    .line 51
    const/4 v9, 0x0

    .line 52
    if-ne v0, v5, :cond_2

    .line 53
    .line 54
    iget-object v0, p0, Li9/i;->a:Lm9/e0;

    .line 55
    .line 56
    invoke-virtual {p1}, Ll9/c;->O()Lka/a0$b;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Lka/a0$b;->J()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-ne v0, v5, :cond_0

    .line 68
    .line 69
    move v10, v5

    .line 70
    goto :goto_0

    .line 71
    :cond_0
    move v10, v9

    .line 72
    :goto_0
    new-array v11, v5, [Ljava/lang/Object;

    .line 73
    .line 74
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    aput-object v0, v11, v9

    .line 79
    .line 80
    const-string v0, "DocumentsTarget contained other than 1 document %d"

    .line 81
    .line 82
    invoke-static {v0, v10, v11}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Lka/a0$b;->I()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-static {p1}, Lj9/o;->t(Ljava/lang/String;)Lj9/o;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1}, Lm9/e0;->q(Lj9/o;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    new-array v5, v5, [Ljava/lang/Object;

    .line 98
    .line 99
    aput-object p1, v5, v9

    .line 100
    .line 101
    const-string v9, "Tried to deserialize invalid key %s"

    .line 102
    .line 103
    invoke-static {v9, v0, v5}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Lj9/e;->q()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    const/4 v5, 0x4

    .line 111
    if-ne v0, v5, :cond_1

    .line 112
    .line 113
    sget-object p1, Lj9/o;->b:Lj9/o;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_1
    invoke-static {p1}, Lm9/e0;->p(Lj9/o;)Lj9/o;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    :goto_1
    new-instance v0, Lg9/f0;

    .line 121
    .line 122
    invoke-direct {v0, p1, v1}, Lg9/f0;-><init>(Lj9/o;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lg9/f0;->i()Lg9/k0;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    goto :goto_2

    .line 130
    :cond_2
    new-array v0, v5, [Ljava/lang/Object;

    .line 131
    .line 132
    invoke-virtual {p1}, Ll9/c;->V()Ll9/c$b;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    aput-object p1, v0, v9

    .line 137
    .line 138
    const-string p1, "Unknown targetType %d"

    .line 139
    .line 140
    invoke-static {p1, v0}, Lx6/b;->T(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    throw v1

    .line 144
    :cond_3
    iget-object v0, p0, Li9/i;->a:Lm9/e0;

    .line 145
    .line 146
    invoke-virtual {p1}, Ll9/c;->R()Lka/a0$c;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Lka/a0$c;->J()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {p1}, Lka/a0$c;->K()Lka/z;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-static {v0, p1}, Lm9/e0;->e(Ljava/lang/String;Lka/z;)Lg9/k0;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    :goto_2
    move-object v1, p1

    .line 166
    new-instance p1, Li9/m1;

    .line 167
    .line 168
    sget-object v5, Li9/e0;->a:Li9/e0;

    .line 169
    .line 170
    const/4 v9, 0x0

    .line 171
    move-object v0, p1

    .line 172
    invoke-direct/range {v0 .. v9}, Li9/m1;-><init>(Lg9/k0;IJLi9/e0;Lj9/q;Lj9/q;Lma/h;Ljava/lang/Integer;)V

    .line 173
    .line 174
    .line 175
    return-object p1
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
.end method

.method public final e(Lj9/g;)Ll9/a;
    .locals 4

    .line 1
    invoke-static {}, Ll9/a;->P()Ll9/a$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1}, Lj9/g;->h()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {}, Ll9/b;->L()Ll9/b$a;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, Li9/i;->a:Lm9/e0;

    .line 16
    .line 17
    invoke-interface {p1}, Lj9/g;->getKey()Lj9/i;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v2, v3}, Lm9/e0;->j(Lj9/i;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1}, Lma/w$a;->m()V

    .line 26
    .line 27
    .line 28
    iget-object v3, v1, Lma/w$a;->b:Lma/w;

    .line 29
    .line 30
    check-cast v3, Ll9/b;

    .line 31
    .line 32
    invoke-static {v3, v2}, Ll9/b;->G(Ll9/b;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v2, p0, Li9/i;->a:Lm9/e0;

    .line 36
    .line 37
    invoke-interface {p1}, Lj9/g;->j()Lj9/q;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    iget-object v3, v3, Lj9/q;->a:Lu7/m;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {v3}, Lm9/e0;->n(Lu7/m;)Lma/n1;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v1}, Lma/w$a;->m()V

    .line 51
    .line 52
    .line 53
    iget-object v3, v1, Lma/w$a;->b:Lma/w;

    .line 54
    .line 55
    check-cast v3, Ll9/b;

    .line 56
    .line 57
    invoke-static {v3, v2}, Ll9/b;->H(Ll9/b;Lma/n1;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Lma/w$a;->k()Lma/w;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Ll9/b;

    .line 65
    .line 66
    invoke-virtual {v0}, Lma/w$a;->m()V

    .line 67
    .line 68
    .line 69
    iget-object v2, v0, Lma/w$a;->b:Lma/w;

    .line 70
    .line 71
    check-cast v2, Ll9/a;

    .line 72
    .line 73
    invoke-static {v2, v1}, Ll9/a;->H(Ll9/a;Ll9/b;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_0

    .line 77
    .line 78
    :cond_0
    invoke-interface {p1}, Lj9/g;->b()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_1

    .line 83
    .line 84
    invoke-static {}, Lka/k;->N()Lka/k$a;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iget-object v2, p0, Li9/i;->a:Lm9/e0;

    .line 89
    .line 90
    invoke-interface {p1}, Lj9/g;->getKey()Lj9/i;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {v2, v3}, Lm9/e0;->j(Lj9/i;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v1}, Lma/w$a;->m()V

    .line 99
    .line 100
    .line 101
    iget-object v3, v1, Lma/w$a;->b:Lma/w;

    .line 102
    .line 103
    check-cast v3, Lka/k;

    .line 104
    .line 105
    invoke-static {v3, v2}, Lka/k;->G(Lka/k;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {p1}, Lj9/g;->getData()Lj9/n;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v2}, Lj9/n;->b()Lka/d0;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {v2}, Lka/d0;->Y()Lka/u;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v2}, Lka/u;->J()Ljava/util/Map;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v1}, Lma/w$a;->m()V

    .line 125
    .line 126
    .line 127
    iget-object v3, v1, Lma/w$a;->b:Lma/w;

    .line 128
    .line 129
    check-cast v3, Lka/k;

    .line 130
    .line 131
    invoke-static {v3}, Lka/k;->H(Lka/k;)Lma/m0;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-virtual {v3, v2}, Lma/m0;->putAll(Ljava/util/Map;)V

    .line 136
    .line 137
    .line 138
    invoke-interface {p1}, Lj9/g;->j()Lj9/q;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    iget-object v2, v2, Lj9/q;->a:Lu7/m;

    .line 143
    .line 144
    iget-object v3, p0, Li9/i;->a:Lm9/e0;

    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-static {v2}, Lm9/e0;->n(Lu7/m;)Lma/n1;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual {v1}, Lma/w$a;->m()V

    .line 154
    .line 155
    .line 156
    iget-object v3, v1, Lma/w$a;->b:Lma/w;

    .line 157
    .line 158
    check-cast v3, Lka/k;

    .line 159
    .line 160
    invoke-static {v3, v2}, Lka/k;->I(Lka/k;Lma/n1;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1}, Lma/w$a;->k()Lma/w;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    check-cast v1, Lka/k;

    .line 168
    .line 169
    invoke-virtual {v0}, Lma/w$a;->m()V

    .line 170
    .line 171
    .line 172
    iget-object v2, v0, Lma/w$a;->b:Lma/w;

    .line 173
    .line 174
    check-cast v2, Ll9/a;

    .line 175
    .line 176
    invoke-static {v2, v1}, Ll9/a;->I(Ll9/a;Lka/k;)V

    .line 177
    .line 178
    .line 179
    goto :goto_0

    .line 180
    :cond_1
    invoke-interface {p1}, Lj9/g;->i()Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-eqz v1, :cond_2

    .line 185
    .line 186
    invoke-static {}, Ll9/d;->L()Ll9/d$a;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    iget-object v2, p0, Li9/i;->a:Lm9/e0;

    .line 191
    .line 192
    invoke-interface {p1}, Lj9/g;->getKey()Lj9/i;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v2, v3}, Lm9/e0;->j(Lj9/i;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-virtual {v1}, Lma/w$a;->m()V

    .line 201
    .line 202
    .line 203
    iget-object v3, v1, Lma/w$a;->b:Lma/w;

    .line 204
    .line 205
    check-cast v3, Ll9/d;

    .line 206
    .line 207
    invoke-static {v3, v2}, Ll9/d;->G(Ll9/d;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    iget-object v2, p0, Li9/i;->a:Lm9/e0;

    .line 211
    .line 212
    invoke-interface {p1}, Lj9/g;->j()Lj9/q;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    iget-object v3, v3, Lj9/q;->a:Lu7/m;

    .line 217
    .line 218
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-static {v3}, Lm9/e0;->n(Lu7/m;)Lma/n1;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    invoke-virtual {v1}, Lma/w$a;->m()V

    .line 226
    .line 227
    .line 228
    iget-object v3, v1, Lma/w$a;->b:Lma/w;

    .line 229
    .line 230
    check-cast v3, Ll9/d;

    .line 231
    .line 232
    invoke-static {v3, v2}, Ll9/d;->H(Ll9/d;Lma/n1;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1}, Lma/w$a;->k()Lma/w;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    check-cast v1, Ll9/d;

    .line 240
    .line 241
    invoke-virtual {v0}, Lma/w$a;->m()V

    .line 242
    .line 243
    .line 244
    iget-object v2, v0, Lma/w$a;->b:Lma/w;

    .line 245
    .line 246
    check-cast v2, Ll9/a;

    .line 247
    .line 248
    invoke-static {v2, v1}, Ll9/a;->J(Ll9/a;Ll9/d;)V

    .line 249
    .line 250
    .line 251
    :goto_0
    invoke-interface {p1}, Lj9/g;->c()Z

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    invoke-virtual {v0}, Lma/w$a;->m()V

    .line 256
    .line 257
    .line 258
    iget-object v1, v0, Lma/w$a;->b:Lma/w;

    .line 259
    .line 260
    check-cast v1, Ll9/a;

    .line 261
    .line 262
    invoke-static {v1, p1}, Ll9/a;->G(Ll9/a;Z)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0}, Lma/w$a;->k()Lma/w;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    check-cast p1, Ll9/a;

    .line 270
    .line 271
    return-object p1

    .line 272
    :cond_2
    const/4 v0, 0x1

    .line 273
    new-array v0, v0, [Ljava/lang/Object;

    .line 274
    .line 275
    const/4 v1, 0x0

    .line 276
    aput-object p1, v0, v1

    .line 277
    .line 278
    const-string p1, "Cannot encode invalid document %s"

    .line 279
    .line 280
    invoke-static {p1, v0}, Lx6/b;->T(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    const/4 p1, 0x0

    .line 284
    throw p1
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
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
.end method

.method public final f(Lk9/g;)Ll9/e;
    .locals 4

    .line 1
    invoke-static {}, Ll9/e;->Q()Ll9/e$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p1, Lk9/g;->a:I

    .line 6
    .line 7
    invoke-virtual {v0}, Lma/w$a;->m()V

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Lma/w$a;->b:Lma/w;

    .line 11
    .line 12
    check-cast v2, Ll9/e;

    .line 13
    .line 14
    invoke-static {v2, v1}, Ll9/e;->G(Ll9/e;I)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Li9/i;->a:Lm9/e0;

    .line 18
    .line 19
    iget-object v2, p1, Lk9/g;->b:Lu7/m;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {v2}, Lm9/e0;->n(Lu7/m;)Lma/n1;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0}, Lma/w$a;->m()V

    .line 29
    .line 30
    .line 31
    iget-object v2, v0, Lma/w$a;->b:Lma/w;

    .line 32
    .line 33
    check-cast v2, Ll9/e;

    .line 34
    .line 35
    invoke-static {v2, v1}, Ll9/e;->J(Ll9/e;Lma/n1;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p1, Lk9/g;->c:Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Lk9/f;

    .line 55
    .line 56
    iget-object v3, p0, Li9/i;->a:Lm9/e0;

    .line 57
    .line 58
    invoke-virtual {v3, v2}, Lm9/e0;->k(Lk9/f;)Lka/e0;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v0}, Lma/w$a;->m()V

    .line 63
    .line 64
    .line 65
    iget-object v3, v0, Lma/w$a;->b:Lma/w;

    .line 66
    .line 67
    check-cast v3, Ll9/e;

    .line 68
    .line 69
    invoke-static {v3, v2}, Ll9/e;->H(Ll9/e;Lka/e0;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    iget-object p1, p1, Lk9/g;->d:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_1

    .line 84
    .line 85
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Lk9/f;

    .line 90
    .line 91
    iget-object v2, p0, Li9/i;->a:Lm9/e0;

    .line 92
    .line 93
    invoke-virtual {v2, v1}, Lm9/e0;->k(Lk9/f;)Lka/e0;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v0}, Lma/w$a;->m()V

    .line 98
    .line 99
    .line 100
    iget-object v2, v0, Lma/w$a;->b:Lma/w;

    .line 101
    .line 102
    check-cast v2, Ll9/e;

    .line 103
    .line 104
    invoke-static {v2, v1}, Ll9/e;->I(Ll9/e;Lka/e0;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_1
    invoke-virtual {v0}, Lma/w$a;->k()Lma/w;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    check-cast p1, Ll9/e;

    .line 113
    .line 114
    return-object p1
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
.end method

.method public final g(Li9/m1;)Ll9/c;
    .locals 4

    .line 1
    sget-object v0, Li9/e0;->a:Li9/e0;

    .line 2
    .line 3
    iget-object v1, p1, Li9/m1;->d:Li9/e0;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x2

    .line 10
    new-array v2, v2, [Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    aput-object v0, v2, v3

    .line 14
    .line 15
    iget-object v0, p1, Li9/m1;->d:Li9/e0;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    aput-object v0, v2, v3

    .line 19
    .line 20
    const-string v0, "Only queries with purpose %s may be stored, got %s"

    .line 21
    .line 22
    invoke-static {v0, v1, v2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Ll9/c;->W()Ll9/c$a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget v1, p1, Li9/m1;->b:I

    .line 30
    .line 31
    invoke-virtual {v0}, Lma/w$a;->m()V

    .line 32
    .line 33
    .line 34
    iget-object v2, v0, Lma/w$a;->b:Lma/w;

    .line 35
    .line 36
    check-cast v2, Ll9/c;

    .line 37
    .line 38
    invoke-static {v2, v1}, Ll9/c;->K(Ll9/c;I)V

    .line 39
    .line 40
    .line 41
    iget-wide v1, p1, Li9/m1;->c:J

    .line 42
    .line 43
    invoke-virtual {v0}, Lma/w$a;->m()V

    .line 44
    .line 45
    .line 46
    iget-object v3, v0, Lma/w$a;->b:Lma/w;

    .line 47
    .line 48
    check-cast v3, Ll9/c;

    .line 49
    .line 50
    invoke-static {v3, v1, v2}, Ll9/c;->N(Ll9/c;J)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Li9/i;->a:Lm9/e0;

    .line 54
    .line 55
    iget-object v2, p1, Li9/m1;->f:Lj9/q;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object v1, v2, Lj9/q;->a:Lu7/m;

    .line 61
    .line 62
    invoke-static {v1}, Lm9/e0;->n(Lu7/m;)Lma/n1;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v0}, Lma/w$a;->m()V

    .line 67
    .line 68
    .line 69
    iget-object v2, v0, Lma/w$a;->b:Lma/w;

    .line 70
    .line 71
    check-cast v2, Ll9/c;

    .line 72
    .line 73
    invoke-static {v2, v1}, Ll9/c;->I(Ll9/c;Lma/n1;)V

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, Li9/i;->a:Lm9/e0;

    .line 77
    .line 78
    iget-object v2, p1, Li9/m1;->e:Lj9/q;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iget-object v1, v2, Lj9/q;->a:Lu7/m;

    .line 84
    .line 85
    invoke-static {v1}, Lm9/e0;->n(Lu7/m;)Lma/n1;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v0}, Lma/w$a;->m()V

    .line 90
    .line 91
    .line 92
    iget-object v2, v0, Lma/w$a;->b:Lma/w;

    .line 93
    .line 94
    check-cast v2, Ll9/c;

    .line 95
    .line 96
    invoke-static {v2, v1}, Ll9/c;->L(Ll9/c;Lma/n1;)V

    .line 97
    .line 98
    .line 99
    iget-object v1, p1, Li9/m1;->g:Lma/h;

    .line 100
    .line 101
    invoke-virtual {v0}, Lma/w$a;->m()V

    .line 102
    .line 103
    .line 104
    iget-object v2, v0, Lma/w$a;->b:Lma/w;

    .line 105
    .line 106
    check-cast v2, Ll9/c;

    .line 107
    .line 108
    invoke-static {v2, v1}, Ll9/c;->M(Ll9/c;Lma/h;)V

    .line 109
    .line 110
    .line 111
    iget-object p1, p1, Li9/m1;->a:Lg9/k0;

    .line 112
    .line 113
    invoke-virtual {p1}, Lg9/k0;->e()Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_0

    .line 118
    .line 119
    iget-object v1, p0, Li9/i;->a:Lm9/e0;

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-static {}, Lka/a0$b;->K()Lka/a0$b$a;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    iget-object p1, p1, Lg9/k0;->d:Lj9/o;

    .line 129
    .line 130
    iget-object v1, v1, Lm9/e0;->a:Lj9/f;

    .line 131
    .line 132
    invoke-static {v1, p1}, Lm9/e0;->m(Lj9/f;Lj9/o;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {v2}, Lma/w$a;->m()V

    .line 137
    .line 138
    .line 139
    iget-object v1, v2, Lma/w$a;->b:Lma/w;

    .line 140
    .line 141
    check-cast v1, Lka/a0$b;

    .line 142
    .line 143
    invoke-static {v1, p1}, Lka/a0$b;->G(Lka/a0$b;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2}, Lma/w$a;->k()Lma/w;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    check-cast p1, Lka/a0$b;

    .line 151
    .line 152
    invoke-virtual {v0}, Lma/w$a;->m()V

    .line 153
    .line 154
    .line 155
    iget-object v1, v0, Lma/w$a;->b:Lma/w;

    .line 156
    .line 157
    check-cast v1, Ll9/c;

    .line 158
    .line 159
    invoke-static {v1, p1}, Ll9/c;->H(Ll9/c;Lka/a0$b;)V

    .line 160
    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_0
    iget-object v1, p0, Li9/i;->a:Lm9/e0;

    .line 164
    .line 165
    invoke-virtual {v1, p1}, Lm9/e0;->l(Lg9/k0;)Lka/a0$c;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {v0}, Lma/w$a;->m()V

    .line 170
    .line 171
    .line 172
    iget-object v1, v0, Lma/w$a;->b:Lma/w;

    .line 173
    .line 174
    check-cast v1, Ll9/c;

    .line 175
    .line 176
    invoke-static {v1, p1}, Ll9/c;->G(Ll9/c;Lka/a0$c;)V

    .line 177
    .line 178
    .line 179
    :goto_0
    invoke-virtual {v0}, Lma/w$a;->k()Lma/w;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    check-cast p1, Ll9/c;

    .line 184
    .line 185
    return-object p1
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
