.class public final LR2/g5;
.super LR2/C5;
.source "SourceFile"


# instance fields
.field public final d:Ljava/util/Map;

.field public final e:LR2/q2;

.field public final f:LR2/q2;

.field public final g:LR2/q2;

.field public final h:LR2/q2;

.field public final i:LR2/q2;


# direct methods
.method public constructor <init>(LR2/D5;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, LR2/C5;-><init>(LR2/D5;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LR2/g5;->d:Ljava/util/Map;

    .line 10
    .line 11
    new-instance p1, LR2/q2;

    .line 12
    .line 13
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const-string v1, "last_delete_stale"

    .line 21
    .line 22
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    invoke-direct {p1, v0, v1, v2, v3}, LR2/q2;-><init>(LR2/l2;Ljava/lang/String;J)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, LR2/g5;->e:LR2/q2;

    .line 28
    .line 29
    new-instance p1, LR2/q2;

    .line 30
    .line 31
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const-string v1, "backoff"

    .line 39
    .line 40
    invoke-direct {p1, v0, v1, v2, v3}, LR2/q2;-><init>(LR2/l2;Ljava/lang/String;J)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, LR2/g5;->f:LR2/q2;

    .line 44
    .line 45
    new-instance p1, LR2/q2;

    .line 46
    .line 47
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const-string v1, "last_upload"

    .line 55
    .line 56
    invoke-direct {p1, v0, v1, v2, v3}, LR2/q2;-><init>(LR2/l2;Ljava/lang/String;J)V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, LR2/g5;->g:LR2/q2;

    .line 60
    .line 61
    new-instance p1, LR2/q2;

    .line 62
    .line 63
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    const-string v1, "last_upload_attempt"

    .line 71
    .line 72
    invoke-direct {p1, v0, v1, v2, v3}, LR2/q2;-><init>(LR2/l2;Ljava/lang/String;J)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, LR2/g5;->h:LR2/q2;

    .line 76
    .line 77
    new-instance p1, LR2/q2;

    .line 78
    .line 79
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    const-string v1, "midnight_offset"

    .line 87
    .line 88
    invoke-direct {p1, v0, v1, v2, v3}, LR2/q2;-><init>(LR2/l2;Ljava/lang/String;J)V

    .line 89
    .line 90
    .line 91
    iput-object p1, p0, LR2/g5;->i:LR2/q2;

    .line 92
    .line 93
    return-void
.end method

.method private final y(Ljava/lang/String;)Landroid/util/Pair;
    .locals 11

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LR2/m3;->b()LE2/e;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, LE2/e;->b()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    iget-object v3, p0, LR2/g5;->d:Ljava/util/Map;

    .line 15
    .line 16
    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, LR2/f5;

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    iget-wide v4, v3, LR2/f5;->c:J

    .line 25
    .line 26
    cmp-long v4, v1, v4

    .line 27
    .line 28
    if-gez v4, :cond_0

    .line 29
    .line 30
    new-instance p1, Landroid/util/Pair;

    .line 31
    .line 32
    iget-object v0, v3, LR2/f5;->a:Ljava/lang/String;

    .line 33
    .line 34
    iget-boolean v1, v3, LR2/f5;->b:Z

    .line 35
    .line 36
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-direct {p1, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_0
    const/4 v4, 0x1

    .line 45
    invoke-static {v4}, Ls2/a;->b(Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v4, p1}, LR2/g;->C(Ljava/lang/String;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    add-long/2addr v4, v1

    .line 57
    const/4 v6, 0x0

    .line 58
    :try_start_0
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    sget-object v8, LR2/K;->d:LR2/P1;

    .line 63
    .line 64
    invoke-virtual {v7, p1, v8}, LR2/g;->x(Ljava/lang/String;LR2/P1;)J

    .line 65
    .line 66
    .line 67
    move-result-wide v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    const-wide/16 v9, 0x0

    .line 69
    .line 70
    cmp-long v9, v7, v9

    .line 71
    .line 72
    if-lez v9, :cond_2

    .line 73
    .line 74
    :try_start_1
    invoke-virtual {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    invoke-static {v9}, Ls2/a;->a(Landroid/content/Context;)Ls2/a$a;

    .line 79
    .line 80
    .line 81
    move-result-object v1
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 82
    goto :goto_0

    .line 83
    :catch_0
    move-exception v1

    .line 84
    goto :goto_1

    .line 85
    :catch_1
    if-eqz v3, :cond_1

    .line 86
    .line 87
    :try_start_2
    iget-wide v9, v3, LR2/f5;->c:J

    .line 88
    .line 89
    add-long/2addr v9, v7

    .line 90
    cmp-long v1, v1, v9

    .line 91
    .line 92
    if-gez v1, :cond_1

    .line 93
    .line 94
    new-instance v1, Landroid/util/Pair;

    .line 95
    .line 96
    iget-object v2, v3, LR2/f5;->a:Ljava/lang/String;

    .line 97
    .line 98
    iget-boolean v3, v3, LR2/f5;->b:Z

    .line 99
    .line 100
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-direct {v1, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    return-object v1

    .line 108
    :cond_1
    const/4 v1, 0x0

    .line 109
    goto :goto_0

    .line 110
    :cond_2
    invoke-virtual {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-static {v1}, Ls2/a;->a(Landroid/content/Context;)Ls2/a$a;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    :goto_0
    if-nez v1, :cond_3

    .line 119
    .line 120
    new-instance v1, Landroid/util/Pair;

    .line 121
    .line 122
    const-string v2, "00000000-0000-0000-0000-000000000000"

    .line 123
    .line 124
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 125
    .line 126
    invoke-direct {v1, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    return-object v1

    .line 130
    :cond_3
    invoke-virtual {v1}, Ls2/a$a;->a()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    if-eqz v2, :cond_4

    .line 135
    .line 136
    new-instance v3, LR2/f5;

    .line 137
    .line 138
    invoke-virtual {v1}, Ls2/a$a;->b()Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    invoke-direct {v3, v2, v1, v4, v5}, LR2/f5;-><init>(Ljava/lang/String;ZJ)V

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_4
    new-instance v3, LR2/f5;

    .line 147
    .line 148
    invoke-virtual {v1}, Ls2/a$a;->b()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    invoke-direct {v3, v0, v1, v4, v5}, LR2/f5;-><init>(Ljava/lang/String;ZJ)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :goto_1
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-virtual {v2}, LR2/Y1;->F()LR2/a2;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    const-string v3, "Unable to get advertising id"

    .line 165
    .line 166
    invoke-virtual {v2, v3, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    new-instance v3, LR2/f5;

    .line 170
    .line 171
    invoke-direct {v3, v0, v6, v4, v5}, LR2/f5;-><init>(Ljava/lang/String;ZJ)V

    .line 172
    .line 173
    .line 174
    :goto_2
    iget-object v0, p0, LR2/g5;->d:Ljava/util/Map;

    .line 175
    .line 176
    invoke-interface {v0, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    invoke-static {v6}, Ls2/a;->b(Z)V

    .line 180
    .line 181
    .line 182
    new-instance p1, Landroid/util/Pair;

    .line 183
    .line 184
    iget-object v0, v3, LR2/f5;->a:Ljava/lang/String;

    .line 185
    .line 186
    iget-boolean v1, v3, LR2/f5;->b:Z

    .line 187
    .line 188
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-direct {p1, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    return-object p1
.end method


# virtual methods
.method public final A(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 3
    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1}, LR2/g5;->y(Ljava/lang/String;)Landroid/util/Pair;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p1, "00000000-0000-0000-0000-000000000000"

    .line 17
    .line 18
    :goto_0
    invoke-static {}, LR2/S5;->T0()Ljava/security/MessageDigest;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    if-nez p2, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    return-object p1

    .line 26
    :cond_1
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 27
    .line 28
    new-instance v2, Ljava/math/BigInteger;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p2, p1}, Ljava/security/MessageDigest;->digest([B)[B

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-direct {v2, v0, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 39
    .line 40
    .line 41
    new-array p1, v0, [Ljava/lang/Object;

    .line 42
    .line 43
    const/4 p2, 0x0

    .line 44
    aput-object v2, p1, p2

    .line 45
    .line 46
    const-string p2, "%032X"

    .line 47
    .line 48
    invoke-static {v1, p2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1
.end method

.method public final bridge synthetic a()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic b()LE2/e;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->b()LE2/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic d()LR2/f;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->d()LR2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic e()LR2/G2;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic f()LR2/g;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->f()LR2/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic g()LR2/C;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->g()LR2/C;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic h()LR2/X1;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->h()LR2/X1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic i()LR2/l2;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->i()LR2/l2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic j()LR2/Y1;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->j()LR2/Y1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic k()LR2/S5;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->k()LR2/S5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic l()V
    .locals 0

    .line 1
    invoke-super {p0}, LR2/m3;->l()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final bridge synthetic m()V
    .locals 0

    .line 1
    invoke-super {p0}, LR2/m3;->m()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final bridge synthetic n()V
    .locals 0

    .line 1
    invoke-super {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final bridge synthetic o()LR2/N5;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/z5;->o()LR2/N5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic p()LR2/b6;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/z5;->p()LR2/b6;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic q()LR2/p;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/z5;->q()LR2/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic r()LR2/x2;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/z5;->r()LR2/x2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic s()LR2/g5;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/z5;->s()LR2/g5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic t()LR2/B5;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/z5;->t()LR2/B5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final x()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final z(Ljava/lang/String;LR2/q3;)Landroid/util/Pair;
    .locals 1

    .line 1
    invoke-virtual {p2}, LR2/q3;->x()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1}, LR2/g5;->y(Ljava/lang/String;)Landroid/util/Pair;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    new-instance p1, Landroid/util/Pair;

    .line 13
    .line 14
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    .line 16
    const-string v0, ""

    .line 17
    .line 18
    invoke-direct {p1, v0, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object p1
.end method
