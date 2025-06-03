.class public final Li9/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/f0;
.implements Li9/p;


# instance fields
.field public final a:Li9/y0;

.field public b:Lg9/a0;

.field public c:J

.field public final d:Li9/q;

.field public e:Ll3/l;


# direct methods
.method public constructor <init>(Li9/y0;Li9/q$b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Li9/v0;->c:J

    iput-object p1, p0, Li9/v0;->a:Li9/y0;

    new-instance p1, Li9/q;

    invoke-direct {p1, p0, p2}, Li9/q;-><init>(Li9/p;Li9/q$b;)V

    iput-object p1, p0, Li9/v0;->d:Li9/q;

    return-void
.end method


# virtual methods
.method public final a(Ln9/d;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln9/d<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Li9/v0;->a:Li9/y0;

    .line 2
    .line 3
    const-string v1, "select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Li9/y0;->H(Ljava/lang/String;)Li9/y0$d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast p1, Li9/m;

    .line 10
    .line 11
    invoke-virtual {v0}, Li9/y0$d;->e()Landroid/database/Cursor;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {p1, v2}, Ln9/d;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catchall_1
    move-exception v0

    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    :goto_1
    throw p1
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
.end method

.method public final b(JLandroid/util/SparseArray;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroid/util/SparseArray<",
            "*>;)I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Li9/v0;->a:Li9/y0;

    .line 2
    .line 3
    iget-object v0, v0, Li9/y0;->d:Li9/j1;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    new-array v2, v1, [I

    .line 7
    .line 8
    iget-object v3, v0, Li9/j1;->a:Li9/y0;

    .line 9
    .line 10
    const-string v4, "SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?"

    .line 11
    .line 12
    invoke-virtual {v3, v4}, Li9/y0;->H(Ljava/lang/String;)Li9/y0$d;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    new-array v4, v1, [Ljava/lang/Object;

    .line 17
    .line 18
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const/4 p2, 0x0

    .line 23
    aput-object p1, v4, p2

    .line 24
    .line 25
    invoke-virtual {v3, v4}, Li9/y0$d;->a([Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    new-instance p1, Li9/s0;

    .line 29
    .line 30
    invoke-direct {p1, v0, p3, v2, v1}, Li9/s0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, p1}, Li9/y0$d;->d(Ln9/d;)I

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Li9/j1;->m()V

    .line 37
    .line 38
    .line 39
    aget p1, v2, p2

    .line 40
    .line 41
    return p1
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
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
.end method

.method public final c(Lj9/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Li9/v0;->p(Lj9/i;)V

    return-void
.end method

.method public final d()V
    .locals 5

    iget-wide v0, p0, Li9/v0;->c:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v4, "Committing a transaction without having started one"

    invoke-static {v4, v0, v1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    iput-wide v2, p0, Li9/v0;->c:J

    return-void
.end method

.method public final e(Lj9/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Li9/v0;->p(Lj9/i;)V

    return-void
.end method

.method public final f()V
    .locals 5

    .line 1
    iget-wide v0, p0, Li9/v0;->c:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v1

    .line 13
    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    .line 14
    .line 15
    const-string v2, "Starting a transaction without committing the previous one"

    .line 16
    .line 17
    invoke-static {v2, v0, v1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Li9/v0;->b:Lg9/a0;

    .line 21
    .line 22
    iget-wide v1, v0, Lg9/a0;->a:J

    .line 23
    .line 24
    const-wide/16 v3, 0x1

    .line 25
    .line 26
    add-long/2addr v1, v3

    .line 27
    iput-wide v1, v0, Lg9/a0;->a:J

    .line 28
    .line 29
    iput-wide v1, p0, Li9/v0;->c:J

    .line 30
    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
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

.method public final g(Li9/l;)V
    .locals 4

    .line 1
    iget-object v0, p0, Li9/v0;->a:Li9/y0;

    .line 2
    .line 3
    iget-object v0, v0, Li9/y0;->d:Li9/j1;

    .line 4
    .line 5
    iget-object v1, v0, Li9/j1;->a:Li9/y0;

    .line 6
    .line 7
    const-string v2, "SELECT target_proto FROM targets"

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Li9/y0;->H(Ljava/lang/String;)Li9/y0$d;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Li9/i1;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v2, v3, v0, p1}, Li9/i1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Li9/y0$d;->d(Ln9/d;)I

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
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
.end method

.method public final h()J
    .locals 4

    iget-wide v0, p0, Li9/v0;->c:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Attempting to get a sequence number outside of a transaction"

    invoke-static {v2, v0, v1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    iget-wide v0, p0, Li9/v0;->c:J

    return-wide v0
.end method

.method public final i()J
    .locals 5

    .line 1
    iget-object v0, p0, Li9/v0;->a:Li9/y0;

    .line 2
    .line 3
    iget-object v1, v0, Li9/y0;->d:Li9/j1;

    .line 4
    .line 5
    iget-wide v1, v1, Li9/j1;->f:J

    .line 6
    .line 7
    const-string v3, "SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)"

    .line 8
    .line 9
    invoke-virtual {v0, v3}, Li9/y0;->H(Ljava/lang/String;)Li9/y0$d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v3, Ld9/q;

    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    invoke-direct {v3, v4}, Ld9/q;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v3}, Li9/y0$d;->c(Ln9/i;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/Long;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    add-long/2addr v3, v1

    .line 30
    return-wide v3
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
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

.method public final j(J)I
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [I

    .line 3
    .line 4
    new-instance v2, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    new-array v3, v0, [Lj9/o;

    .line 10
    .line 11
    sget-object v4, Lj9/o;->b:Lj9/o;

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    aput-object v4, v3, v5

    .line 15
    .line 16
    :goto_0
    move v4, v0

    .line 17
    :goto_1
    if-eqz v4, :cond_1

    .line 18
    .line 19
    iget-object v4, p0, Li9/v0;->a:Li9/y0;

    .line 20
    .line 21
    const-string v6, "select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? AND path > ? LIMIT ?"

    .line 22
    .line 23
    invoke-virtual {v4, v6}, Li9/y0;->H(Ljava/lang/String;)Li9/y0$d;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    const/4 v6, 0x3

    .line 28
    new-array v6, v6, [Ljava/lang/Object;

    .line 29
    .line 30
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    aput-object v7, v6, v5

    .line 35
    .line 36
    aget-object v7, v3, v5

    .line 37
    .line 38
    invoke-static {v7}, Lp2/m0;->A(Lj9/e;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    aput-object v7, v6, v0

    .line 43
    .line 44
    const/4 v7, 0x2

    .line 45
    const/16 v8, 0x64

    .line 46
    .line 47
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    aput-object v9, v6, v7

    .line 52
    .line 53
    invoke-virtual {v4, v6}, Li9/y0$d;->a([Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance v6, Li9/u0;

    .line 57
    .line 58
    invoke-direct {v6, p0, v1, v2, v3}, Li9/u0;-><init>(Li9/v0;[ILjava/util/ArrayList;[Lj9/o;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4, v6}, Li9/y0$d;->d(Ln9/d;)I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-ne v4, v8, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    move v4, v5

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    iget-object p1, p0, Li9/v0;->a:Li9/y0;

    .line 71
    .line 72
    iget-object p1, p1, Li9/y0;->f:Li9/b1;

    .line 73
    .line 74
    invoke-virtual {p1, v2}, Li9/b1;->b(Ljava/util/ArrayList;)V

    .line 75
    .line 76
    .line 77
    aget p1, v1, v5

    .line 78
    .line 79
    return p1
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
.end method

.method public final k(Lj9/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Li9/v0;->p(Lj9/i;)V

    return-void
.end method

.method public final l()J
    .locals 5

    .line 1
    iget-object v0, p0, Li9/v0;->a:Li9/y0;

    .line 2
    .line 3
    const-string v1, "PRAGMA page_count"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Li9/y0;->H(Ljava/lang/String;)Li9/y0$d;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ld9/r;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-direct {v2, v3}, Ld9/r;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Li9/y0$d;->c(Ln9/i;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/Long;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    const-string v3, "PRAGMA page_size"

    .line 26
    .line 27
    invoke-virtual {v0, v3}, Li9/y0;->H(Ljava/lang/String;)Li9/y0$d;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v3, Ld9/q;

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    invoke-direct {v3, v4}, Ld9/q;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, Li9/y0$d;->c(Ln9/i;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/lang/Long;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    mul-long/2addr v3, v1

    .line 48
    return-wide v3
    .line 49
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

.method public final m(Ll3/l;)V
    .locals 0

    iput-object p1, p0, Li9/v0;->e:Ll3/l;

    return-void
.end method

.method public final n(Lj9/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Li9/v0;->p(Lj9/i;)V

    return-void
.end method

.method public final o(Li9/m1;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Li9/v0;->h()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p1, v0, v1}, Li9/m1;->b(J)Li9/m1;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Li9/v0;->a:Li9/y0;

    .line 10
    .line 11
    iget-object v0, v0, Li9/y0;->d:Li9/j1;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Li9/j1;->h(Li9/m1;)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
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
.end method

.method public final p(Lj9/i;)V
    .locals 4

    .line 1
    iget-object p1, p1, Lj9/i;->a:Lj9/o;

    .line 2
    .line 3
    invoke-static {p1}, Lp2/m0;->A(Lj9/e;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Li9/v0;->a:Li9/y0;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    new-array v1, v1, [Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aput-object p1, v1, v2

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    invoke-virtual {p0}, Li9/v0;->h()J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    aput-object v2, v1, p1

    .line 25
    .line 26
    const-string p1, "INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)"

    .line 27
    .line 28
    invoke-virtual {v0, p1, v1}, Li9/y0;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
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
.end method
