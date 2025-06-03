.class public final Lm9/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/q0$a;


# instance fields
.field public final synthetic a:Lm9/h0;


# direct methods
.method public constructor <init>(Lm9/h0;)V
    .locals 0

    iput-object p1, p0, Lm9/g0;->a:Lm9/h0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lm9/g0;->a:Lm9/h0;

    .line 2
    .line 3
    iget-object v0, v0, Lm9/h0;->j:Lm9/q0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lm9/a;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    new-array v3, v2, [Ljava/lang/Object;

    .line 11
    .line 12
    const-string v4, "Writing handshake requires an opened stream"

    .line 13
    .line 14
    invoke-static {v4, v1, v3}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-boolean v1, v0, Lm9/q0;->u:Z

    .line 18
    .line 19
    xor-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    new-array v2, v2, [Ljava/lang/Object;

    .line 22
    .line 23
    const-string v3, "Handshake already completed"

    .line 24
    .line 25
    invoke-static {v3, v1, v2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lka/f0;->K()Lka/f0$a;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v2, v0, Lm9/q0;->t:Lm9/e0;

    .line 33
    .line 34
    iget-object v2, v2, Lm9/e0;->b:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1}, Lma/w$a;->m()V

    .line 37
    .line 38
    .line 39
    iget-object v3, v1, Lma/w$a;->b:Lma/w;

    .line 40
    .line 41
    check-cast v3, Lka/f0;

    .line 42
    .line 43
    invoke-static {v3, v2}, Lka/f0;->G(Lka/f0;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lma/w$a;->k()Lma/w;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lka/f0;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lm9/a;->i(Lma/w;)V

    .line 53
    .line 54
    .line 55
    return-void
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
.end method

.method public final b(Lj9/q;Ljava/util/ArrayList;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lm9/g0;->a:Lm9/h0;

    .line 2
    .line 3
    iget-object v1, v0, Lm9/h0;->l:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    move-object v3, v1

    .line 10
    check-cast v3, Lk9/g;

    .line 11
    .line 12
    iget-object v1, v0, Lm9/h0;->j:Lm9/q0;

    .line 13
    .line 14
    iget-object v6, v1, Lm9/q0;->v:Lma/h;

    .line 15
    .line 16
    iget-object v1, v3, Lk9/g;->d:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v4, 0x1

    .line 27
    const/4 v5, 0x0

    .line 28
    if-ne v1, v2, :cond_0

    .line 29
    .line 30
    move v1, v4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v1, v5

    .line 33
    :goto_0
    const/4 v2, 0x2

    .line 34
    new-array v2, v2, [Ljava/lang/Object;

    .line 35
    .line 36
    iget-object v7, v3, Lk9/g;->d:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    aput-object v7, v2, v5

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    aput-object v7, v2, v4

    .line 57
    .line 58
    const-string v4, "Mutations sent %d must equal results received %d"

    .line 59
    .line 60
    invoke-static {v4, v1, v2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    sget-object v1, Lj9/h;->a:Lt8/b;

    .line 64
    .line 65
    iget-object v2, v3, Lk9/g;->d:Ljava/util/List;

    .line 66
    .line 67
    move-object v7, v1

    .line 68
    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-ge v5, v1, :cond_1

    .line 73
    .line 74
    invoke-virtual {p2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Lk9/i;

    .line 79
    .line 80
    iget-object v1, v1, Lk9/i;->a:Lj9/q;

    .line 81
    .line 82
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    check-cast v4, Lk9/f;

    .line 87
    .line 88
    iget-object v4, v4, Lk9/f;->a:Lj9/i;

    .line 89
    .line 90
    invoke-virtual {v7, v4, v1}, Lt8/c;->n(Ljava/lang/Object;Ljava/lang/Object;)Lt8/c;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    add-int/lit8 v5, v5, 0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    new-instance v1, Lk9/h;

    .line 98
    .line 99
    move-object v2, v1

    .line 100
    move-object v4, p1

    .line 101
    move-object v5, p2

    .line 102
    invoke-direct/range {v2 .. v7}, Lk9/h;-><init>(Lk9/g;Lj9/q;Ljava/util/ArrayList;Lma/h;Lt8/c;)V

    .line 103
    .line 104
    .line 105
    iget-object p1, v0, Lm9/h0;->b:Lm9/h0$a;

    .line 106
    .line 107
    invoke-interface {p1, v1}, Lm9/h0$a;->a(Lk9/h;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Lm9/h0;->c()V

    .line 111
    .line 112
    .line 113
    return-void
    .line 114
    .line 115
.end method

.method public final c(Leb/e1;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lm9/g0;->a:Lm9/h0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Leb/e1;->e()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lm9/h0;->h()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    xor-int/2addr v1, v2

    .line 19
    new-array v4, v3, [Ljava/lang/Object;

    .line 20
    .line 21
    const-string v5, "Write stream was stopped gracefully while still needed."

    .line 22
    .line 23
    invoke-static {v5, v1, v4}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p1}, Leb/e1;->e()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    iget-object v1, v0, Lm9/h0;->l:Ljava/util/ArrayDeque;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_3

    .line 39
    .line 40
    iget-object v1, v0, Lm9/h0;->j:Lm9/q0;

    .line 41
    .line 42
    iget-boolean v1, v1, Lm9/q0;->u:Z

    .line 43
    .line 44
    const-string v4, "Handling write error with status OK."

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-virtual {p1}, Leb/e1;->e()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    xor-int/2addr v1, v2

    .line 53
    new-array v5, v3, [Ljava/lang/Object;

    .line 54
    .line 55
    invoke-static {v4, v1, v5}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Lm9/j;->d:Ljava/util/HashSet;

    .line 59
    .line 60
    iget-object v1, p1, Leb/e1;->a:Leb/e1$a;

    .line 61
    .line 62
    iget v1, v1, Leb/e1$a;->a:I

    .line 63
    .line 64
    sget-object v4, Lcom/google/firebase/firestore/f$a;->u:Landroid/util/SparseArray;

    .line 65
    .line 66
    sget-object v5, Lcom/google/firebase/firestore/f$a;->d:Lcom/google/firebase/firestore/f$a;

    .line 67
    .line 68
    invoke-virtual {v4, v1, v5}, Landroid/util/SparseArray;->get(ILjava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Lcom/google/firebase/firestore/f$a;

    .line 73
    .line 74
    invoke-static {v1}, Lm9/j;->a(Lcom/google/firebase/firestore/f$a;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_1

    .line 79
    .line 80
    iget-object v1, p1, Leb/e1;->a:Leb/e1$a;

    .line 81
    .line 82
    sget-object v4, Leb/e1$a;->u:Leb/e1$a;

    .line 83
    .line 84
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-nez v1, :cond_1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    move v2, v3

    .line 92
    :goto_0
    if-eqz v2, :cond_3

    .line 93
    .line 94
    iget-object v1, v0, Lm9/h0;->l:Ljava/util/ArrayDeque;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, Lk9/g;

    .line 101
    .line 102
    iget-object v2, v0, Lm9/h0;->j:Lm9/q0;

    .line 103
    .line 104
    invoke-virtual {v2}, Lm9/a;->b()V

    .line 105
    .line 106
    .line 107
    iget-object v2, v0, Lm9/h0;->b:Lm9/h0$a;

    .line 108
    .line 109
    iget v1, v1, Lk9/g;->a:I

    .line 110
    .line 111
    invoke-interface {v2, v1, p1}, Lm9/h0$a;->f(ILeb/e1;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Lm9/h0;->c()V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_2
    invoke-virtual {p1}, Leb/e1;->e()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    xor-int/2addr v1, v2

    .line 123
    new-array v5, v3, [Ljava/lang/Object;

    .line 124
    .line 125
    invoke-static {v4, v1, v5}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    sget-object v1, Lm9/j;->d:Ljava/util/HashSet;

    .line 129
    .line 130
    iget-object v1, p1, Leb/e1;->a:Leb/e1$a;

    .line 131
    .line 132
    iget v1, v1, Leb/e1$a;->a:I

    .line 133
    .line 134
    sget-object v4, Lcom/google/firebase/firestore/f$a;->u:Landroid/util/SparseArray;

    .line 135
    .line 136
    sget-object v5, Lcom/google/firebase/firestore/f$a;->d:Lcom/google/firebase/firestore/f$a;

    .line 137
    .line 138
    invoke-virtual {v4, v1, v5}, Landroid/util/SparseArray;->get(ILjava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    check-cast v1, Lcom/google/firebase/firestore/f$a;

    .line 143
    .line 144
    invoke-static {v1}, Lm9/j;->a(Lcom/google/firebase/firestore/f$a;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_3

    .line 149
    .line 150
    iget-object v1, v0, Lm9/h0;->j:Lm9/q0;

    .line 151
    .line 152
    iget-object v1, v1, Lm9/q0;->v:Lma/h;

    .line 153
    .line 154
    invoke-static {v1}, Ln9/o;->i(Lma/h;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    const/4 v4, 0x2

    .line 159
    new-array v4, v4, [Ljava/lang/Object;

    .line 160
    .line 161
    aput-object v1, v4, v3

    .line 162
    .line 163
    aput-object p1, v4, v2

    .line 164
    .line 165
    const-string p1, "RemoteStore"

    .line 166
    .line 167
    const-string v1, "RemoteStore error before completed handshake; resetting stream token %s: %s"

    .line 168
    .line 169
    invoke-static {v2, p1, v1, v4}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    iget-object p1, v0, Lm9/h0;->j:Lm9/q0;

    .line 173
    .line 174
    sget-object v1, Lm9/q0;->w:Lma/h$h;

    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    iput-object v1, p1, Lm9/q0;->v:Lma/h;

    .line 183
    .line 184
    iget-object p1, v0, Lm9/h0;->c:Li9/n;

    .line 185
    .line 186
    iget-object v2, p1, Li9/n;->a:Le9/a;

    .line 187
    .line 188
    new-instance v4, Lw/g;

    .line 189
    .line 190
    const/16 v5, 0x14

    .line 191
    .line 192
    invoke-direct {v4, v5, p1, v1}, Lw/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    const-string p1, "Set stream token"

    .line 196
    .line 197
    invoke-virtual {v2, p1, v4}, Le9/a;->y(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 198
    .line 199
    .line 200
    :cond_3
    :goto_1
    invoke-virtual {v0}, Lm9/h0;->h()Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    if-eqz p1, :cond_4

    .line 205
    .line 206
    invoke-virtual {v0}, Lm9/h0;->h()Z

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    new-array v1, v3, [Ljava/lang/Object;

    .line 211
    .line 212
    const-string v2, "startWriteStream() called when shouldStartWriteStream() is false."

    .line 213
    .line 214
    invoke-static {v2, p1, v1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    iget-object p1, v0, Lm9/h0;->j:Lm9/q0;

    .line 218
    .line 219
    invoke-virtual {p1}, Lm9/q0;->g()V

    .line 220
    .line 221
    .line 222
    :cond_4
    return-void
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

.method public final d()V
    .locals 6

    .line 1
    iget-object v0, p0, Lm9/g0;->a:Lm9/h0;

    .line 2
    .line 3
    iget-object v1, v0, Lm9/h0;->c:Li9/n;

    .line 4
    .line 5
    iget-object v2, v0, Lm9/h0;->j:Lm9/q0;

    .line 6
    .line 7
    iget-object v2, v2, Lm9/q0;->v:Lma/h;

    .line 8
    .line 9
    iget-object v3, v1, Li9/n;->a:Le9/a;

    .line 10
    .line 11
    new-instance v4, Lw/g;

    .line 12
    .line 13
    const/16 v5, 0x14

    .line 14
    .line 15
    invoke-direct {v4, v5, v1, v2}, Lw/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "Set stream token"

    .line 19
    .line 20
    invoke-virtual {v3, v1, v4}, Le9/a;->y(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, v0, Lm9/h0;->l:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lk9/g;

    .line 40
    .line 41
    iget-object v3, v0, Lm9/h0;->j:Lm9/q0;

    .line 42
    .line 43
    iget-object v2, v2, Lk9/g;->d:Ljava/util/List;

    .line 44
    .line 45
    invoke-virtual {v3, v2}, Lm9/q0;->j(Ljava/util/List;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-void
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
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
.end method
