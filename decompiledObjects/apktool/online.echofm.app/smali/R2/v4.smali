.class public final LR2/v4;
.super LR2/f1;
.source "SourceFile"


# instance fields
.field public volatile c:LR2/w4;

.field public volatile d:LR2/w4;

.field public e:LR2/w4;

.field public final f:Ljava/util/Map;

.field public g:Landroid/app/Activity;

.field public volatile h:Z

.field public volatile i:LR2/w4;

.field public j:LR2/w4;

.field public k:Z

.field public final l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LR2/N2;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LR2/f1;-><init>(LR2/N2;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LR2/v4;->l:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, LR2/v4;->f:Ljava/util/Map;

    .line 17
    .line 18
    return-void
.end method

.method public static bridge synthetic B(LR2/v4;)LR2/w4;
    .locals 0

    .line 1
    iget-object p0, p0, LR2/v4;->j:LR2/w4;

    .line 2
    .line 3
    return-object p0
.end method

.method public static bridge synthetic E(LR2/v4;LR2/w4;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, LR2/v4;->j:LR2/w4;

    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic F(LR2/v4;LR2/w4;LR2/w4;JZLandroid/os/Bundle;)V
    .locals 7

    .line 1
    const/4 v6, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-wide v3, p3

    .line 6
    move v5, p5

    .line 7
    invoke-virtual/range {v0 .. v6}, LR2/v4;->I(LR2/w4;LR2/w4;JZLandroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static bridge synthetic G(LR2/v4;LR2/w4;ZJ)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, p3, p4}, LR2/v4;->J(LR2/w4;ZJ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static synthetic H(LR2/v4;Landroid/os/Bundle;LR2/w4;LR2/w4;J)V
    .locals 13

    .line 1
    move-object v3, p1

    .line 2
    if-eqz v3, :cond_0

    .line 3
    .line 4
    const-string v0, "screen_name"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "screen_class"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v1, 0x0

    .line 21
    const-string v2, "screen_view"

    .line 22
    .line 23
    move-object v3, p1

    .line 24
    invoke-virtual/range {v0 .. v5}, LR2/S5;->F(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;Z)Landroid/os/Bundle;

    .line 25
    .line 26
    .line 27
    move-result-object v12

    .line 28
    const/4 v11, 0x1

    .line 29
    move-object v6, p0

    .line 30
    move-object v7, p2

    .line 31
    move-object/from16 v8, p3

    .line 32
    .line 33
    move-wide/from16 v9, p4

    .line 34
    .line 35
    invoke-virtual/range {v6 .. v12}, LR2/v4;->I(LR2/w4;LR2/w4;JZLandroid/os/Bundle;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final C(Z)LR2/w4;
    .locals 0

    .line 1
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 5
    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, LR2/v4;->e:LR2/w4;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object p1, p0, LR2/v4;->e:LR2/w4;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_1
    iget-object p1, p0, LR2/v4;->j:LR2/w4;

    .line 18
    .line 19
    return-object p1
.end method

.method public final D(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-object p2

    .line 8
    :cond_0
    const-string p2, "\\."

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    array-length p2, p1

    .line 15
    if-lez p2, :cond_1

    .line 16
    .line 17
    array-length p2, p1

    .line 18
    add-int/lit8 p2, p2, -0x1

    .line 19
    .line 20
    aget-object p1, p1, p2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const-string p1, ""

    .line 24
    .line 25
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, v1}, LR2/g;->t(Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-le p2, v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-virtual {p2, v1}, LR2/g;->t(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-virtual {p1, v0, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :cond_2
    return-object p1
.end method

.method public final I(LR2/w4;LR2/w4;JZLandroid/os/Bundle;)V
    .locals 15

    .line 1
    move-object v0, p0

    .line 2
    move-object/from16 v1, p1

    .line 3
    .line 4
    move-object/from16 v2, p2

    .line 5
    .line 6
    move-wide/from16 v3, p3

    .line 7
    .line 8
    move-object/from16 v5, p6

    .line 9
    .line 10
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 11
    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x1

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iget-wide v8, v2, LR2/w4;->c:J

    .line 18
    .line 19
    iget-wide v10, v1, LR2/w4;->c:J

    .line 20
    .line 21
    cmp-long v8, v8, v10

    .line 22
    .line 23
    if-nez v8, :cond_1

    .line 24
    .line 25
    iget-object v8, v2, LR2/w4;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v9, v1, LR2/w4;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v8, v9}, LR2/y4;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    if-eqz v8, :cond_1

    .line 34
    .line 35
    iget-object v8, v2, LR2/w4;->a:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v9, v1, LR2/w4;->a:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v8, v9}, LR2/y4;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-nez v8, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v8, v6

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :goto_0
    move v8, v7

    .line 49
    :goto_1
    if-eqz p5, :cond_2

    .line 50
    .line 51
    iget-object v9, v0, LR2/v4;->e:LR2/w4;

    .line 52
    .line 53
    if-eqz v9, :cond_2

    .line 54
    .line 55
    move v6, v7

    .line 56
    :cond_2
    if-eqz v8, :cond_b

    .line 57
    .line 58
    new-instance v8, Landroid/os/Bundle;

    .line 59
    .line 60
    if-eqz v5, :cond_3

    .line 61
    .line 62
    invoke-direct {v8, v5}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 63
    .line 64
    .line 65
    :goto_2
    move-object v14, v8

    .line 66
    goto :goto_3

    .line 67
    :cond_3
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :goto_3
    invoke-static {v1, v14, v7}, LR2/S5;->L(LR2/w4;Landroid/os/Bundle;Z)V

    .line 72
    .line 73
    .line 74
    if-eqz v2, :cond_6

    .line 75
    .line 76
    iget-object v5, v2, LR2/w4;->a:Ljava/lang/String;

    .line 77
    .line 78
    if-eqz v5, :cond_4

    .line 79
    .line 80
    const-string v8, "_pn"

    .line 81
    .line 82
    invoke-virtual {v14, v8, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_4
    iget-object v5, v2, LR2/w4;->b:Ljava/lang/String;

    .line 86
    .line 87
    if-eqz v5, :cond_5

    .line 88
    .line 89
    const-string v8, "_pc"

    .line 90
    .line 91
    invoke-virtual {v14, v8, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :cond_5
    const-string v5, "_pi"

    .line 95
    .line 96
    iget-wide v8, v2, LR2/w4;->c:J

    .line 97
    .line 98
    invoke-virtual {v14, v5, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 99
    .line 100
    .line 101
    :cond_6
    const-wide/16 v8, 0x0

    .line 102
    .line 103
    if-eqz v6, :cond_7

    .line 104
    .line 105
    invoke-virtual {p0}, LR2/G1;->u()LR2/l5;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    iget-object v2, v2, LR2/l5;->f:LR2/r5;

    .line 110
    .line 111
    invoke-virtual {v2, v3, v4}, LR2/r5;->a(J)J

    .line 112
    .line 113
    .line 114
    move-result-wide v10

    .line 115
    cmp-long v2, v10, v8

    .line 116
    .line 117
    if-lez v2, :cond_7

    .line 118
    .line 119
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v2, v14, v10, v11}, LR2/S5;->P(Landroid/os/Bundle;J)V

    .line 124
    .line 125
    .line 126
    :cond_7
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v2}, LR2/g;->Q()Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-nez v2, :cond_8

    .line 135
    .line 136
    const-string v2, "_mst"

    .line 137
    .line 138
    const-wide/16 v10, 0x1

    .line 139
    .line 140
    invoke-virtual {v14, v2, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 141
    .line 142
    .line 143
    :cond_8
    iget-boolean v2, v1, LR2/w4;->e:Z

    .line 144
    .line 145
    if-eqz v2, :cond_9

    .line 146
    .line 147
    const-string v2, "app"

    .line 148
    .line 149
    :goto_4
    move-object v10, v2

    .line 150
    goto :goto_5

    .line 151
    :cond_9
    const-string v2, "auto"

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :goto_5
    invoke-virtual {p0}, LR2/m3;->b()LE2/e;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-interface {v2}, LE2/e;->a()J

    .line 159
    .line 160
    .line 161
    move-result-wide v11

    .line 162
    iget-boolean v2, v1, LR2/w4;->e:Z

    .line 163
    .line 164
    move-wide/from16 p5, v11

    .line 165
    .line 166
    if-eqz v2, :cond_a

    .line 167
    .line 168
    iget-wide v11, v1, LR2/w4;->f:J

    .line 169
    .line 170
    cmp-long v2, v11, v8

    .line 171
    .line 172
    if-eqz v2, :cond_a

    .line 173
    .line 174
    move-wide v12, v11

    .line 175
    goto :goto_6

    .line 176
    :cond_a
    move-wide/from16 v12, p5

    .line 177
    .line 178
    :goto_6
    invoke-virtual {p0}, LR2/G1;->r()LR2/C3;

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    const-string v11, "_vs"

    .line 183
    .line 184
    invoke-virtual/range {v9 .. v14}, LR2/C3;->U(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V

    .line 185
    .line 186
    .line 187
    :cond_b
    if-eqz v6, :cond_c

    .line 188
    .line 189
    iget-object v2, v0, LR2/v4;->e:LR2/w4;

    .line 190
    .line 191
    invoke-virtual {p0, v2, v7, v3, v4}, LR2/v4;->J(LR2/w4;ZJ)V

    .line 192
    .line 193
    .line 194
    :cond_c
    iput-object v1, v0, LR2/v4;->e:LR2/w4;

    .line 195
    .line 196
    iget-boolean v2, v1, LR2/w4;->e:Z

    .line 197
    .line 198
    if-eqz v2, :cond_d

    .line 199
    .line 200
    iput-object v1, v0, LR2/v4;->j:LR2/w4;

    .line 201
    .line 202
    :cond_d
    invoke-virtual {p0}, LR2/G1;->t()LR2/D4;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {v2, v1}, LR2/D4;->G(LR2/w4;)V

    .line 207
    .line 208
    .line 209
    return-void
.end method

.method public final J(LR2/w4;ZJ)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LR2/G1;->o()LR2/B;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LR2/m3;->b()LE2/e;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, LE2/e;->b()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-virtual {v0, v1, v2}, LR2/B;->v(J)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-boolean v1, p1, LR2/w4;->d:Z

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v1, v0

    .line 26
    :goto_0
    invoke-virtual {p0}, LR2/G1;->u()LR2/l5;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2, v1, p2, p3, p4}, LR2/l5;->E(ZZJ)Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iput-boolean v0, p1, LR2/w4;->d:Z

    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public final K(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget-object v0, p0, LR2/v4;->l:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LR2/v4;->g:Landroid/app/Activity;

    .line 5
    .line 6
    if-ne p1, v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-object v1, p0, LR2/v4;->g:Landroid/app/Activity;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, LR2/g;->Q()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget-object v0, p0, LR2/v4;->f:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw p1
.end method

.method public final L(Landroid/app/Activity;LR2/w4;Z)V
    .locals 16

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    iget-object v1, v7, LR2/v4;->c:LR2/w4;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v7, LR2/v4;->d:LR2/w4;

    .line 10
    .line 11
    :goto_0
    move-object v3, v1

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    iget-object v1, v7, LR2/v4;->c:LR2/w4;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :goto_1
    iget-object v1, v0, LR2/w4;->b:Ljava/lang/String;

    .line 17
    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "Activity"

    .line 27
    .line 28
    invoke-virtual {v7, v1, v2}, LR2/v4;->D(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :goto_2
    move-object v10, v1

    .line 33
    goto :goto_3

    .line 34
    :cond_1
    const/4 v1, 0x0

    .line 35
    goto :goto_2

    .line 36
    :goto_3
    new-instance v1, LR2/w4;

    .line 37
    .line 38
    iget-object v9, v0, LR2/w4;->a:Ljava/lang/String;

    .line 39
    .line 40
    iget-wide v11, v0, LR2/w4;->c:J

    .line 41
    .line 42
    iget-boolean v13, v0, LR2/w4;->e:Z

    .line 43
    .line 44
    iget-wide v14, v0, LR2/w4;->f:J

    .line 45
    .line 46
    move-object v8, v1

    .line 47
    invoke-direct/range {v8 .. v15}, LR2/w4;-><init>(Ljava/lang/String;Ljava/lang/String;JZJ)V

    .line 48
    .line 49
    .line 50
    move-object v2, v1

    .line 51
    goto :goto_4

    .line 52
    :cond_2
    move-object v2, v0

    .line 53
    :goto_4
    iget-object v0, v7, LR2/v4;->c:LR2/w4;

    .line 54
    .line 55
    iput-object v0, v7, LR2/v4;->d:LR2/w4;

    .line 56
    .line 57
    iput-object v2, v7, LR2/v4;->c:LR2/w4;

    .line 58
    .line 59
    invoke-virtual/range {p0 .. p0}, LR2/m3;->b()LE2/e;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-interface {v0}, LE2/e;->b()J

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    invoke-virtual/range {p0 .. p0}, LR2/m3;->e()LR2/G2;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    new-instance v9, LR2/A4;

    .line 72
    .line 73
    move-object v0, v9

    .line 74
    move-object/from16 v1, p0

    .line 75
    .line 76
    move/from16 v6, p3

    .line 77
    .line 78
    invoke-direct/range {v0 .. v6}, LR2/A4;-><init>(LR2/v4;LR2/w4;LR2/w4;JZ)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v8, v9}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public final M(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/g;->Q()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    if-nez p2, :cond_1

    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    const-string v0, "com.google.app_measurement.screen_service"

    .line 16
    .line 17
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    if-nez p2, :cond_2

    .line 22
    .line 23
    return-void

    .line 24
    :cond_2
    new-instance v0, LR2/w4;

    .line 25
    .line 26
    const-string v1, "name"

    .line 27
    .line 28
    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "referrer_name"

    .line 33
    .line 34
    invoke-virtual {p2, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v3, "id"

    .line 39
    .line 40
    invoke-virtual {p2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    invoke-direct {v0, v1, v2, v3, v4}, LR2/w4;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 45
    .line 46
    .line 47
    iget-object p2, p0, LR2/v4;->f:Ljava/util/Map;

    .line 48
    .line 49
    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final N(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/g;->Q()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, LR2/Y1;->M()LR2/a2;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string p2, "setCurrentScreen cannot be called while screen reporting is disabled."

    .line 20
    .line 21
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object v0, p0, LR2/v4;->c:LR2/w4;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, LR2/Y1;->M()LR2/a2;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string p2, "setCurrentScreen cannot be called while no activity active"

    .line 38
    .line 39
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    iget-object v1, p0, LR2/v4;->f:Ljava/util/Map;

    .line 44
    .line 45
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-nez v1, :cond_2

    .line 50
    .line 51
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, LR2/Y1;->M()LR2/a2;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string p2, "setCurrentScreen must be called with an activity in the activity lifecycle"

    .line 60
    .line 61
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    if-nez p3, :cond_3

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    const-string v1, "Activity"

    .line 72
    .line 73
    invoke-virtual {p0, p3, v1}, LR2/v4;->D(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    :cond_3
    iget-object v1, v0, LR2/w4;->b:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v1, p3}, LR2/y4;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    iget-object v0, v0, LR2/w4;->a:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {v0, p2}, LR2/y4;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v1, :cond_4

    .line 90
    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1}, LR2/Y1;->M()LR2/a2;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    const-string p2, "setCurrentScreen cannot be called with the same class and name"

    .line 102
    .line 103
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_4
    const/4 v0, 0x0

    .line 108
    if-eqz p2, :cond_6

    .line 109
    .line 110
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-lez v1, :cond_5

    .line 115
    .line 116
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v2, v0}, LR2/g;->t(Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-le v1, v2, :cond_6

    .line 129
    .line 130
    :cond_5
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p1}, LR2/Y1;->M()LR2/a2;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    const-string p3, "Invalid screen name length in setCurrentScreen. Length"

    .line 147
    .line 148
    invoke-virtual {p1, p3, p2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_6
    if-eqz p3, :cond_8

    .line 153
    .line 154
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-lez v1, :cond_7

    .line 159
    .line 160
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v2, v0}, LR2/g;->t(Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-le v1, v0, :cond_8

    .line 173
    .line 174
    :cond_7
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-virtual {p1}, LR2/Y1;->M()LR2/a2;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 183
    .line 184
    .line 185
    move-result p2

    .line 186
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    const-string p3, "Invalid class name length in setCurrentScreen. Length"

    .line 191
    .line 192
    invoke-virtual {p1, p3, p2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_8
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    if-nez p2, :cond_9

    .line 205
    .line 206
    const-string v1, "null"

    .line 207
    .line 208
    goto :goto_0

    .line 209
    :cond_9
    move-object v1, p2

    .line 210
    :goto_0
    const-string v2, "Setting current screen to name, class"

    .line 211
    .line 212
    invoke-virtual {v0, v2, v1, p3}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    new-instance v0, LR2/w4;

    .line 216
    .line 217
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-virtual {v1}, LR2/S5;->P0()J

    .line 222
    .line 223
    .line 224
    move-result-wide v1

    .line 225
    invoke-direct {v0, p2, p3, v1, v2}, LR2/w4;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 226
    .line 227
    .line 228
    iget-object p2, p0, LR2/v4;->f:Ljava/util/Map;

    .line 229
    .line 230
    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    const/4 p2, 0x1

    .line 234
    invoke-virtual {p0, p1, v0, p2}, LR2/v4;->L(Landroid/app/Activity;LR2/w4;Z)V

    .line 235
    .line 236
    .line 237
    return-void
.end method

.method public final O(Landroid/os/Bundle;J)V
    .locals 12

    .line 1
    iget-object v0, p0, LR2/v4;->l:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, LR2/v4;->k:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, LR2/Y1;->M()LR2/a2;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string p2, "Cannot log screen view event when the app is in the background."

    .line 17
    .line 18
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    monitor-exit v0

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto/16 :goto_5

    .line 25
    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    if-eqz p1, :cond_5

    .line 28
    .line 29
    const-string v2, "screen_name"

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-lez v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v4, v1}, LR2/g;->t(Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-le v3, v4, :cond_2

    .line 56
    .line 57
    :cond_1
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, LR2/Y1;->M()LR2/a2;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const-string p2, "Invalid screen name length for screen view. Length"

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result p3

    .line 71
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    invoke-virtual {p1, p2, p3}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    monitor-exit v0

    .line 79
    return-void

    .line 80
    :cond_2
    const-string v3, "screen_class"

    .line 81
    .line 82
    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    if-eqz v3, :cond_4

    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-lez v4, :cond_3

    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-virtual {v5, v1}, LR2/g;->t(Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-le v4, v1, :cond_4

    .line 107
    .line 108
    :cond_3
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p1}, LR2/Y1;->M()LR2/a2;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    const-string p2, "Invalid screen class length for screen view. Length"

    .line 117
    .line 118
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 119
    .line 120
    .line 121
    move-result p3

    .line 122
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object p3

    .line 126
    invoke-virtual {p1, p2, p3}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    monitor-exit v0

    .line 130
    return-void

    .line 131
    :cond_4
    move-object v1, v3

    .line 132
    move-object v3, v2

    .line 133
    goto :goto_0

    .line 134
    :cond_5
    move-object v3, v1

    .line 135
    :goto_0
    if-nez v1, :cond_7

    .line 136
    .line 137
    iget-object v1, p0, LR2/v4;->g:Landroid/app/Activity;

    .line 138
    .line 139
    if-eqz v1, :cond_6

    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    const-string v2, "Activity"

    .line 146
    .line 147
    invoke-virtual {p0, v1, v2}, LR2/v4;->D(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    goto :goto_1

    .line 152
    :cond_6
    const-string v1, "Activity"

    .line 153
    .line 154
    :cond_7
    :goto_1
    move-object v4, v1

    .line 155
    iget-object v1, p0, LR2/v4;->c:LR2/w4;

    .line 156
    .line 157
    iget-boolean v2, p0, LR2/v4;->h:Z

    .line 158
    .line 159
    if-eqz v2, :cond_8

    .line 160
    .line 161
    if-eqz v1, :cond_8

    .line 162
    .line 163
    const/4 v2, 0x0

    .line 164
    iput-boolean v2, p0, LR2/v4;->h:Z

    .line 165
    .line 166
    iget-object v2, v1, LR2/w4;->b:Ljava/lang/String;

    .line 167
    .line 168
    invoke-static {v2, v4}, LR2/y4;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    iget-object v1, v1, LR2/w4;->a:Ljava/lang/String;

    .line 173
    .line 174
    invoke-static {v1, v3}, LR2/y4;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v2, :cond_8

    .line 179
    .line 180
    if-eqz v1, :cond_8

    .line 181
    .line 182
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-virtual {p1}, LR2/Y1;->M()LR2/a2;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    const-string p2, "Ignoring call to log screen view event with duplicate parameters."

    .line 191
    .line 192
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    monitor-exit v0

    .line 196
    return-void

    .line 197
    :cond_8
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    const-string v1, "Logging screen view with name, class"

    .line 207
    .line 208
    if-nez v3, :cond_9

    .line 209
    .line 210
    const-string v2, "null"

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_9
    move-object v2, v3

    .line 214
    :goto_2
    if-nez v4, :cond_a

    .line 215
    .line 216
    const-string v5, "null"

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_a
    move-object v5, v4

    .line 220
    :goto_3
    invoke-virtual {v0, v1, v2, v5}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    iget-object v0, p0, LR2/v4;->c:LR2/w4;

    .line 224
    .line 225
    if-nez v0, :cond_b

    .line 226
    .line 227
    iget-object v0, p0, LR2/v4;->d:LR2/w4;

    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_b
    iget-object v0, p0, LR2/v4;->c:LR2/w4;

    .line 231
    .line 232
    :goto_4
    new-instance v1, LR2/w4;

    .line 233
    .line 234
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-virtual {v2}, LR2/S5;->P0()J

    .line 239
    .line 240
    .line 241
    move-result-wide v5

    .line 242
    const/4 v7, 0x1

    .line 243
    move-object v2, v1

    .line 244
    move-wide v8, p2

    .line 245
    invoke-direct/range {v2 .. v9}, LR2/w4;-><init>(Ljava/lang/String;Ljava/lang/String;JZJ)V

    .line 246
    .line 247
    .line 248
    iput-object v1, p0, LR2/v4;->c:LR2/w4;

    .line 249
    .line 250
    iput-object v0, p0, LR2/v4;->d:LR2/w4;

    .line 251
    .line 252
    iput-object v1, p0, LR2/v4;->i:LR2/w4;

    .line 253
    .line 254
    invoke-virtual {p0}, LR2/m3;->b()LE2/e;

    .line 255
    .line 256
    .line 257
    move-result-object p2

    .line 258
    invoke-interface {p2}, LE2/e;->b()J

    .line 259
    .line 260
    .line 261
    move-result-wide v10

    .line 262
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 263
    .line 264
    .line 265
    move-result-object p2

    .line 266
    new-instance p3, LR2/x4;

    .line 267
    .line 268
    move-object v5, p3

    .line 269
    move-object v6, p0

    .line 270
    move-object v7, p1

    .line 271
    move-object v8, v1

    .line 272
    move-object v9, v0

    .line 273
    invoke-direct/range {v5 .. v11}, LR2/x4;-><init>(LR2/v4;Landroid/os/Bundle;LR2/w4;LR2/w4;J)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {p2, p3}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 277
    .line 278
    .line 279
    return-void

    .line 280
    :goto_5
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 281
    throw p1
.end method

.method public final P()LR2/w4;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/v4;->c:LR2/w4;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Q(Landroid/app/Activity;)V
    .locals 4

    .line 1
    iget-object v0, p0, LR2/v4;->l:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-boolean v1, p0, LR2/v4;->k:Z

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, LR2/v4;->h:Z

    .line 9
    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    invoke-virtual {p0}, LR2/m3;->b()LE2/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, LE2/e;->b()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, LR2/g;->Q()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    iput-object v3, p0, LR2/v4;->c:LR2/w4;

    .line 31
    .line 32
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v2, LR2/C4;

    .line 37
    .line 38
    invoke-direct {v2, p0, v0, v1}, LR2/C4;-><init>(LR2/v4;J)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v2}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    invoke-virtual {p0, p1}, LR2/v4;->T(Landroid/app/Activity;)LR2/w4;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object v2, p0, LR2/v4;->c:LR2/w4;

    .line 50
    .line 51
    iput-object v2, p0, LR2/v4;->d:LR2/w4;

    .line 52
    .line 53
    iput-object v3, p0, LR2/v4;->c:LR2/w4;

    .line 54
    .line 55
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    new-instance v3, LR2/B4;

    .line 60
    .line 61
    invoke-direct {v3, p0, p1, v0, v1}, LR2/B4;-><init>(LR2/v4;LR2/w4;J)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v3}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :catchall_0
    move-exception p1

    .line 69
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    throw p1
.end method

.method public final R(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/g;->Q()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    if-nez p2, :cond_1

    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    iget-object v0, p0, LR2/v4;->f:Ljava/util/Map;

    .line 16
    .line 17
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, LR2/w4;

    .line 22
    .line 23
    if-nez p1, :cond_2

    .line 24
    .line 25
    return-void

    .line 26
    :cond_2
    new-instance v0, Landroid/os/Bundle;

    .line 27
    .line 28
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v1, "id"

    .line 32
    .line 33
    iget-wide v2, p1, LR2/w4;->c:J

    .line 34
    .line 35
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 36
    .line 37
    .line 38
    const-string v1, "name"

    .line 39
    .line 40
    iget-object v2, p1, LR2/w4;->a:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string v1, "referrer_name"

    .line 46
    .line 47
    iget-object p1, p1, LR2/w4;->b:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string p1, "com.google.app_measurement.screen_service"

    .line 53
    .line 54
    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final S(Landroid/app/Activity;)V
    .locals 4

    .line 1
    iget-object v0, p0, LR2/v4;->l:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, LR2/v4;->k:Z

    .line 6
    .line 7
    iget-object v1, p0, LR2/v4;->g:Landroid/app/Activity;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eq p1, v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, LR2/v4;->l:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    :try_start_1
    iput-object p1, p0, LR2/v4;->g:Landroid/app/Activity;

    .line 16
    .line 17
    iput-boolean v2, p0, LR2/v4;->h:Z

    .line 18
    .line 19
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    :try_start_2
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, LR2/g;->Q()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    iput-object v1, p0, LR2/v4;->i:LR2/w4;

    .line 32
    .line 33
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    new-instance v3, LR2/E4;

    .line 38
    .line 39
    invoke-direct {v3, p0}, LR2/E4;-><init>(LR2/v4;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v3}, LR2/G2;->D(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_1

    .line 48
    :catchall_1
    move-exception p1

    .line 49
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 50
    :try_start_4
    throw p1

    .line 51
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 52
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, LR2/g;->Q()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    iget-object p1, p0, LR2/v4;->i:LR2/w4;

    .line 63
    .line 64
    iput-object p1, p0, LR2/v4;->c:LR2/w4;

    .line 65
    .line 66
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance v0, LR2/z4;

    .line 71
    .line 72
    invoke-direct {v0, p0}, LR2/z4;-><init>(LR2/v4;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v0}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_1
    invoke-virtual {p0, p1}, LR2/v4;->T(Landroid/app/Activity;)LR2/w4;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p0, p1, v0, v2}, LR2/v4;->L(Landroid/app/Activity;LR2/w4;Z)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, LR2/G1;->o()LR2/B;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1}, LR2/m3;->b()LE2/e;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-interface {v0}, LE2/e;->b()J

    .line 95
    .line 96
    .line 97
    move-result-wide v0

    .line 98
    invoke-virtual {p1}, LR2/m3;->e()LR2/G2;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    new-instance v3, LR2/d0;

    .line 103
    .line 104
    invoke-direct {v3, p1, v0, v1}, LR2/d0;-><init>(LR2/B;J)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v3}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :goto_1
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 112
    throw p1
.end method

.method public final T(Landroid/app/Activity;)LR2/w4;
    .locals 5

    .line 1
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LR2/v4;->f:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, LR2/w4;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "Activity"

    .line 19
    .line 20
    invoke-virtual {p0, v0, v1}, LR2/v4;->D(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, LR2/w4;

    .line 25
    .line 26
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, LR2/S5;->P0()J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v1, v4, v0, v2, v3}, LR2/w4;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, LR2/v4;->f:Ljava/util/Map;

    .line 39
    .line 40
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-object v0, v1

    .line 44
    :cond_0
    iget-object p1, p0, LR2/v4;->i:LR2/w4;

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    iget-object p1, p0, LR2/v4;->i:LR2/w4;

    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_1
    return-object v0
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
    invoke-super {p0}, LR2/G1;->l()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final bridge synthetic m()V
    .locals 0

    .line 1
    invoke-super {p0}, LR2/G1;->m()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final bridge synthetic n()V
    .locals 0

    .line 1
    invoke-super {p0}, LR2/G1;->n()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final bridge synthetic o()LR2/B;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->o()LR2/B;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic p()LR2/S1;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->p()LR2/S1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic q()LR2/V1;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->q()LR2/V1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic r()LR2/C3;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->r()LR2/C3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic s()LR2/v4;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->s()LR2/v4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic t()LR2/D4;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->t()LR2/D4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic u()LR2/l5;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->u()LR2/l5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
