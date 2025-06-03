.class public final LR2/R2;
.super LR2/Q1;
.source "SourceFile"


# instance fields
.field public final b:LR2/D5;

.field public c:Ljava/lang/Boolean;

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>(LR2/D5;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LR2/R2;-><init>(LR2/D5;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(LR2/D5;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LR2/Q1;-><init>()V

    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LR2/R2;->b:LR2/D5;

    const/4 p1, 0x0

    iput-object p1, p0, LR2/R2;->d:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic o(LR2/R2;)LR2/D5;
    .locals 0

    .line 1
    iget-object p0, p0, LR2/R2;->b:LR2/D5;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final D0(LR2/W5;)V
    .locals 2

    .line 1
    iget-object v0, p1, LR2/W5;->o:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, LR2/W5;->o:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p0, v0, v1}, LR2/R2;->a1(Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    new-instance v0, LR2/a3;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1}, LR2/a3;-><init>(LR2/R2;LR2/W5;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, LR2/R2;->v(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final F(LR2/W5;Landroid/os/Bundle;)Ljava/util/List;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, LR2/R2;->c1(LR2/W5;Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p1, LR2/W5;->o:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 11
    .line 12
    invoke-virtual {v0}, LR2/D5;->e()LR2/G2;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, LR2/k3;

    .line 17
    .line 18
    invoke-direct {v1, p0, p1, p2}, LR2/k3;-><init>(LR2/R2;LR2/W5;Landroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, LR2/G2;->w(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    :try_start_0
    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p2, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    return-object p2

    .line 32
    :catch_0
    move-exception p2

    .line 33
    goto :goto_0

    .line 34
    :catch_1
    move-exception p2

    .line 35
    :goto_0
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 36
    .line 37
    invoke-virtual {v0}, LR2/D5;->j()LR2/Y1;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object p1, p1, LR2/W5;->o:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v1, "Failed to get trigger URIs. appId"

    .line 52
    .line 53
    invoke-virtual {v0, v1, p1, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1
.end method

.method public final G(LR2/W5;)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, LR2/R2;->c1(LR2/W5;Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, LR2/D5;->R(LR2/W5;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final I0(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, LR2/V2;

    .line 2
    .line 3
    move-object v0, v7

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p4

    .line 6
    move-object v3, p5

    .line 7
    move-object v4, p3

    .line 8
    move-wide v5, p1

    .line 9
    invoke-direct/range {v0 .. v6}, LR2/V2;-><init>(LR2/R2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v7}, LR2/R2;->v(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final K0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, LR2/R2;->a1(Ljava/lang/String;Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 6
    .line 7
    invoke-virtual {v0}, LR2/D5;->e()LR2/G2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, LR2/b3;

    .line 12
    .line 13
    invoke-direct {v1, p0, p1, p2, p3}, LR2/b3;-><init>(LR2/R2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, LR2/G2;->w(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    return-object p1

    .line 27
    :catch_0
    move-exception p1

    .line 28
    goto :goto_0

    .line 29
    :catch_1
    move-exception p1

    .line 30
    :goto_0
    iget-object p2, p0, LR2/R2;->b:LR2/D5;

    .line 31
    .line 32
    invoke-virtual {p2}, LR2/D5;->j()LR2/Y1;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p2}, LR2/Y1;->G()LR2/a2;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    const-string p3, "Failed to get conditional user properties as"

    .line 41
    .line 42
    invoke-virtual {p2, p3, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1
.end method

.method public final L0(LR2/W5;Z)Ljava/util/List;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, LR2/R2;->c1(LR2/W5;Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p1, LR2/W5;->o:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, LR2/R2;->b:LR2/D5;

    .line 11
    .line 12
    invoke-virtual {v1}, LR2/D5;->e()LR2/G2;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, LR2/j3;

    .line 17
    .line 18
    invoke-direct {v2, p0, v0}, LR2/j3;-><init>(LR2/R2;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, LR2/G2;->w(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/util/List;

    .line 30
    .line 31
    new-instance v1, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, LR2/T5;

    .line 55
    .line 56
    if-nez p2, :cond_1

    .line 57
    .line 58
    iget-object v3, v2, LR2/T5;->c:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v3}, LR2/S5;->H0(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-nez v3, :cond_0

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :catch_0
    move-exception p2

    .line 68
    goto :goto_2

    .line 69
    :catch_1
    move-exception p2

    .line 70
    goto :goto_2

    .line 71
    :cond_1
    :goto_1
    new-instance v3, LR2/R5;

    .line 72
    .line 73
    invoke-direct {v3, v2}, LR2/R5;-><init>(LR2/T5;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    return-object v1

    .line 81
    :goto_2
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 82
    .line 83
    invoke-virtual {v0}, LR2/D5;->j()LR2/Y1;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-object p1, p1, LR2/W5;->o:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    const-string v1, "Failed to get user properties. appId"

    .line 98
    .line 99
    invoke-virtual {v0, v1, p1, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    const/4 p1, 0x0

    .line 103
    return-object p1
.end method

.method public final M0(LR2/I;Ljava/lang/String;)[B
    .locals 9

    .line 1
    invoke-static {p2}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, p2, v0}, LR2/R2;->a1(Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 12
    .line 13
    invoke-virtual {v0}, LR2/D5;->j()LR2/Y1;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, LR2/R2;->b:LR2/D5;

    .line 22
    .line 23
    invoke-virtual {v1}, LR2/D5;->f0()LR2/X1;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v2, p1, LR2/I;->o:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "Log and bundle. event"

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 39
    .line 40
    invoke-virtual {v0}, LR2/D5;->b()LE2/e;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {v0}, LE2/e;->c()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    const-wide/32 v2, 0xf4240

    .line 49
    .line 50
    .line 51
    div-long/2addr v0, v2

    .line 52
    iget-object v4, p0, LR2/R2;->b:LR2/D5;

    .line 53
    .line 54
    invoke-virtual {v4}, LR2/D5;->e()LR2/G2;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    new-instance v5, LR2/h3;

    .line 59
    .line 60
    invoke-direct {v5, p0, p1, p2}, LR2/h3;-><init>(LR2/R2;LR2/I;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v5}, LR2/G2;->B(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    :try_start_0
    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    check-cast v4, [B

    .line 72
    .line 73
    if-nez v4, :cond_0

    .line 74
    .line 75
    iget-object v4, p0, LR2/R2;->b:LR2/D5;

    .line 76
    .line 77
    invoke-virtual {v4}, LR2/D5;->j()LR2/Y1;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v4}, LR2/Y1;->G()LR2/a2;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    const-string v5, "Log and bundle returned null. appId"

    .line 86
    .line 87
    invoke-static {p2}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    invoke-virtual {v4, v5, v6}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    const/4 v4, 0x0

    .line 95
    new-array v4, v4, [B

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :catch_0
    move-exception v0

    .line 99
    goto :goto_1

    .line 100
    :catch_1
    move-exception v0

    .line 101
    goto :goto_1

    .line 102
    :cond_0
    :goto_0
    iget-object v5, p0, LR2/R2;->b:LR2/D5;

    .line 103
    .line 104
    invoke-virtual {v5}, LR2/D5;->b()LE2/e;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-interface {v5}, LE2/e;->c()J

    .line 109
    .line 110
    .line 111
    move-result-wide v5

    .line 112
    div-long/2addr v5, v2

    .line 113
    iget-object v2, p0, LR2/R2;->b:LR2/D5;

    .line 114
    .line 115
    invoke-virtual {v2}, LR2/D5;->j()LR2/Y1;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v2}, LR2/Y1;->F()LR2/a2;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    const-string v3, "Log and bundle processed. event, size, time_ms"

    .line 124
    .line 125
    iget-object v7, p0, LR2/R2;->b:LR2/D5;

    .line 126
    .line 127
    invoke-virtual {v7}, LR2/D5;->f0()LR2/X1;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    iget-object v8, p1, LR2/I;->o:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v7, v8}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    array-length v8, v4

    .line 138
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    sub-long/2addr v5, v0

    .line 143
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v2, v3, v7, v8, v0}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    .line 149
    .line 150
    return-object v4

    .line 151
    :goto_1
    iget-object v1, p0, LR2/R2;->b:LR2/D5;

    .line 152
    .line 153
    invoke-virtual {v1}, LR2/D5;->j()LR2/Y1;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-static {p2}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    iget-object v2, p0, LR2/R2;->b:LR2/D5;

    .line 166
    .line 167
    invoke-virtual {v2}, LR2/D5;->f0()LR2/X1;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    iget-object p1, p1, LR2/I;->o:Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {v2, p1}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    const-string v2, "Failed to log and bundle. appId, event, error"

    .line 178
    .line 179
    invoke-virtual {v1, v2, p2, p1, v0}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    const/4 p1, 0x0

    .line 183
    return-object p1
.end method

.method public final N(LR2/W5;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, LR2/R2;->c1(LR2/W5;Z)V

    .line 3
    .line 4
    .line 5
    new-instance v0, LR2/T2;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, LR2/T2;-><init>(LR2/R2;LR2/W5;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, LR2/R2;->v(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final O0(Landroid/os/Bundle;LR2/W5;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p2, v0}, LR2/R2;->c1(LR2/W5;Z)V

    .line 3
    .line 4
    .line 5
    iget-object p2, p2, LR2/W5;->o:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    new-instance v0, LR2/Q2;

    .line 11
    .line 12
    invoke-direct {v0, p0, p2, p1}, LR2/Q2;-><init>(LR2/R2;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, LR2/R2;->v(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final P0(LR2/W5;)LR2/n;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, LR2/R2;->c1(LR2/W5;Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p1, LR2/W5;->o:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 18
    .line 19
    invoke-virtual {v0}, LR2/D5;->e()LR2/G2;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v2, LR2/c3;

    .line 24
    .line 25
    invoke-direct {v2, p0, p1}, LR2/c3;-><init>(LR2/R2;LR2/W5;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, LR2/G2;->B(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 33
    .line 34
    const-wide/16 v3, 0x2710

    .line 35
    .line 36
    invoke-interface {v0, v3, v4, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, LR2/n;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    return-object v0

    .line 43
    :catch_0
    move-exception v0

    .line 44
    goto :goto_0

    .line 45
    :catch_1
    move-exception v0

    .line 46
    goto :goto_0

    .line 47
    :catch_2
    move-exception v0

    .line 48
    :goto_0
    iget-object v2, p0, LR2/R2;->b:LR2/D5;

    .line 49
    .line 50
    invoke-virtual {v2}, LR2/D5;->j()LR2/Y1;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iget-object p1, p1, LR2/W5;->o:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const-string v3, "Failed to get consent. appId"

    .line 65
    .line 66
    invoke-virtual {v2, v3, p1, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    new-instance p1, LR2/n;

    .line 70
    .line 71
    invoke-direct {p1, v1}, LR2/n;-><init>(Landroid/os/Bundle;)V

    .line 72
    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_0
    new-instance p1, LR2/n;

    .line 76
    .line 77
    invoke-direct {p1, v1}, LR2/n;-><init>(Landroid/os/Bundle;)V

    .line 78
    .line 79
    .line 80
    return-object p1
.end method

.method public final R0(LR2/I;LR2/W5;)V
    .locals 1

    .line 1
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p2, v0}, LR2/R2;->c1(LR2/W5;Z)V

    .line 6
    .line 7
    .line 8
    new-instance v0, LR2/f3;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1, p2}, LR2/f3;-><init>(LR2/R2;LR2/I;LR2/W5;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, LR2/R2;->v(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final S0(LR2/I;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    const/4 p3, 0x1

    .line 8
    invoke-virtual {p0, p2, p3}, LR2/R2;->a1(Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    new-instance p3, LR2/e3;

    .line 12
    .line 13
    invoke-direct {p3, p0, p1, p2}, LR2/e3;-><init>(LR2/R2;LR2/I;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p3}, LR2/R2;->v(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final U0(LR2/W5;)V
    .locals 1

    .line 1
    iget-object v0, p1, LR2/W5;->o:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, LR2/W5;->J:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, LR2/d3;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, LR2/d3;-><init>(LR2/R2;LR2/W5;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, LR2/R2;->b:LR2/D5;

    .line 20
    .line 21
    invoke-virtual {p1}, LR2/D5;->e()LR2/G2;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, LR2/G2;->J()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    iget-object p1, p0, LR2/R2;->b:LR2/D5;

    .line 36
    .line 37
    invoke-virtual {p1}, LR2/D5;->e()LR2/G2;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1, v0}, LR2/G2;->G(Ljava/lang/Runnable;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final V0(Ljava/lang/String;Ljava/lang/String;LR2/W5;)Ljava/util/List;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p3, v0}, LR2/R2;->c1(LR2/W5;Z)V

    .line 3
    .line 4
    .line 5
    iget-object p3, p3, LR2/W5;->o:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p3}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 11
    .line 12
    invoke-virtual {v0}, LR2/D5;->e()LR2/G2;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, LR2/Y2;

    .line 17
    .line 18
    invoke-direct {v1, p0, p3, p1, p2}, LR2/Y2;-><init>(LR2/R2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, LR2/G2;->w(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    return-object p1

    .line 32
    :catch_0
    move-exception p1

    .line 33
    goto :goto_0

    .line 34
    :catch_1
    move-exception p1

    .line 35
    :goto_0
    iget-object p2, p0, LR2/R2;->b:LR2/D5;

    .line 36
    .line 37
    invoke-virtual {p2}, LR2/D5;->j()LR2/Y1;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p2}, LR2/Y1;->G()LR2/a2;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const-string p3, "Failed to get conditional user properties"

    .line 46
    .line 47
    invoke-virtual {p2, p3, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1
.end method

.method public final W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, LR2/R2;->a1(Ljava/lang/String;Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 6
    .line 7
    invoke-virtual {v0}, LR2/D5;->e()LR2/G2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, LR2/Z2;

    .line 12
    .line 13
    invoke-direct {v1, p0, p1, p2, p3}, LR2/Z2;-><init>(LR2/R2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, LR2/G2;->w(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :try_start_0
    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    check-cast p2, Ljava/util/List;

    .line 25
    .line 26
    new-instance p3, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, LR2/T5;

    .line 50
    .line 51
    if-nez p4, :cond_1

    .line 52
    .line 53
    iget-object v1, v0, LR2/T5;->c:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v1}, LR2/S5;->H0(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_0

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catch_0
    move-exception p2

    .line 63
    goto :goto_2

    .line 64
    :catch_1
    move-exception p2

    .line 65
    goto :goto_2

    .line 66
    :cond_1
    :goto_1
    new-instance v1, LR2/R5;

    .line 67
    .line 68
    invoke-direct {v1, v0}, LR2/R5;-><init>(LR2/T5;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    return-object p3

    .line 76
    :goto_2
    iget-object p3, p0, LR2/R2;->b:LR2/D5;

    .line 77
    .line 78
    invoke-virtual {p3}, LR2/D5;->j()LR2/Y1;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    invoke-virtual {p3}, LR2/Y1;->G()LR2/a2;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    const-string p4, "Failed to get user properties as. appId"

    .line 87
    .line 88
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p3, p4, p1, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    return-object p1
.end method

.method public final Z(LR2/R5;LR2/W5;)V
    .locals 1

    .line 1
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p2, v0}, LR2/R2;->c1(LR2/W5;Z)V

    .line 6
    .line 7
    .line 8
    new-instance v0, LR2/g3;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1, p2}, LR2/g3;-><init>(LR2/R2;LR2/R5;LR2/W5;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, LR2/R2;->v(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final synthetic Z0(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/D5;->e0()LR2/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1, p2}, LR2/p;->i0(Ljava/lang/String;Landroid/os/Bundle;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final a1(Ljava/lang/String;Z)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-nez v2, :cond_7

    .line 8
    .line 9
    if-eqz p2, :cond_3

    .line 10
    .line 11
    :try_start_0
    iget-object p2, p0, LR2/R2;->c:Ljava/lang/Boolean;

    .line 12
    .line 13
    if-nez p2, :cond_2

    .line 14
    .line 15
    const-string p2, "com.google.android.gms"

    .line 16
    .line 17
    iget-object v2, p0, LR2/R2;->d:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-nez p2, :cond_1

    .line 24
    .line 25
    iget-object p2, p0, LR2/R2;->b:LR2/D5;

    .line 26
    .line 27
    invoke-virtual {p2}, LR2/D5;->a()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {p2, v2}, LE2/o;->a(Landroid/content/Context;I)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-nez p2, :cond_1

    .line 40
    .line 41
    iget-object p2, p0, LR2/R2;->b:LR2/D5;

    .line 42
    .line 43
    invoke-virtual {p2}, LR2/D5;->a()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-static {p2}, Lx2/o;->a(Landroid/content/Context;)Lx2/o;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-virtual {p2, v2}, Lx2/o;->c(I)Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-eqz p2, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    move p2, v1

    .line 63
    goto :goto_1

    .line 64
    :catch_0
    move-exception p2

    .line 65
    goto :goto_2

    .line 66
    :cond_1
    :goto_0
    move p2, v0

    .line 67
    :goto_1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    iput-object p2, p0, LR2/R2;->c:Ljava/lang/Boolean;

    .line 72
    .line 73
    :cond_2
    iget-object p2, p0, LR2/R2;->c:Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    if-nez p2, :cond_5

    .line 80
    .line 81
    :cond_3
    iget-object p2, p0, LR2/R2;->d:Ljava/lang/String;

    .line 82
    .line 83
    if-nez p2, :cond_4

    .line 84
    .line 85
    iget-object p2, p0, LR2/R2;->b:LR2/D5;

    .line 86
    .line 87
    invoke-virtual {p2}, LR2/D5;->a()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    invoke-static {p2, v2, p1}, Lx2/n;->i(Landroid/content/Context;ILjava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_4

    .line 100
    .line 101
    iput-object p1, p0, LR2/R2;->d:Ljava/lang/String;

    .line 102
    .line 103
    :cond_4
    iget-object p2, p0, LR2/R2;->d:Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    if-eqz p2, :cond_6

    .line 110
    .line 111
    :cond_5
    return-void

    .line 112
    :cond_6
    new-instance p2, Ljava/lang/SecurityException;

    .line 113
    .line 114
    const-string v2, "Unknown calling package name \'%s\'."

    .line 115
    .line 116
    new-array v0, v0, [Ljava/lang/Object;

    .line 117
    .line 118
    aput-object p1, v0, v1

    .line 119
    .line 120
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-direct {p2, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p2
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 128
    :goto_2
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 129
    .line 130
    invoke-virtual {v0}, LR2/D5;->j()LR2/Y1;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    const-string v1, "Measurement Service called with invalid calling package. appId"

    .line 139
    .line 140
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {v0, v1, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    throw p2

    .line 148
    :cond_7
    iget-object p1, p0, LR2/R2;->b:LR2/D5;

    .line 149
    .line 150
    invoke-virtual {p1}, LR2/D5;->j()LR2/Y1;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    const-string p2, "Measurement Service called without app package"

    .line 159
    .line 160
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    new-instance p1, Ljava/lang/SecurityException;

    .line 164
    .line 165
    invoke-direct {p1, p2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw p1
.end method

.method public final b1(LR2/I;LR2/W5;)LR2/I;
    .locals 8

    .line 1
    iget-object p2, p1, LR2/I;->o:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "_cmp"

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-eqz p2, :cond_2

    .line 10
    .line 11
    iget-object p2, p1, LR2/I;->p:LR2/D;

    .line 12
    .line 13
    if-eqz p2, :cond_2

    .line 14
    .line 15
    invoke-virtual {p2}, LR2/D;->a()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p2, p1, LR2/I;->p:LR2/D;

    .line 23
    .line 24
    const-string v0, "_cis"

    .line 25
    .line 26
    invoke-virtual {p2, v0}, LR2/D;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    const-string v0, "referrer broadcast"

    .line 31
    .line 32
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    const-string v0, "referrer API"

    .line 39
    .line 40
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    :cond_1
    iget-object p2, p0, LR2/R2;->b:LR2/D5;

    .line 47
    .line 48
    invoke-virtual {p2}, LR2/D5;->j()LR2/Y1;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-virtual {p2}, LR2/Y1;->J()LR2/a2;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    const-string v0, "Event has been filtered "

    .line 57
    .line 58
    invoke-virtual {p1}, LR2/I;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {p2, v0, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    new-instance p2, LR2/I;

    .line 66
    .line 67
    iget-object v4, p1, LR2/I;->p:LR2/D;

    .line 68
    .line 69
    iget-object v5, p1, LR2/I;->q:Ljava/lang/String;

    .line 70
    .line 71
    iget-wide v6, p1, LR2/I;->r:J

    .line 72
    .line 73
    const-string v3, "_cmpx"

    .line 74
    .line 75
    move-object v2, p2

    .line 76
    invoke-direct/range {v2 .. v7}, LR2/I;-><init>(Ljava/lang/String;LR2/D;Ljava/lang/String;J)V

    .line 77
    .line 78
    .line 79
    return-object p2

    .line 80
    :cond_2
    :goto_0
    return-object p1
.end method

.method public final c0(LR2/W5;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, LR2/R2;->c1(LR2/W5;Z)V

    .line 3
    .line 4
    .line 5
    new-instance v0, LR2/S2;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, LR2/S2;-><init>(LR2/R2;LR2/W5;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, LR2/R2;->v(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final c1(LR2/W5;Z)V
    .locals 1

    .line 1
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object p2, p1, LR2/W5;->o:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {p2}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iget-object p2, p1, LR2/W5;->o:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, p2, v0}, LR2/R2;->a1(Ljava/lang/String;Z)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, LR2/R2;->b:LR2/D5;

    .line 16
    .line 17
    invoke-virtual {p2}, LR2/D5;->n0()LR2/S5;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iget-object v0, p1, LR2/W5;->p:Ljava/lang/String;

    .line 22
    .line 23
    iget-object p1, p1, LR2/W5;->E:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p2, v0, p1}, LR2/S5;->j0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final d1(LR2/I;LR2/W5;)V
    .locals 6

    .line 1
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/D5;->h0()LR2/x2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p2, LR2/W5;->o:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, LR2/x2;->W(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, LR2/R2;->e1(LR2/I;LR2/W5;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 20
    .line 21
    invoke-virtual {v0}, LR2/D5;->j()LR2/Y1;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "EES config found for"

    .line 30
    .line 31
    iget-object v2, p2, LR2/W5;->o:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 37
    .line 38
    invoke-virtual {v0}, LR2/D5;->h0()LR2/x2;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v1, p2, LR2/W5;->o:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iget-object v0, v0, LR2/x2;->j:Lt/g;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Lt/g;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Lcom/google/android/gms/internal/measurement/C;

    .line 59
    .line 60
    :goto_0
    if-nez v0, :cond_2

    .line 61
    .line 62
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 63
    .line 64
    invoke-virtual {v0}, LR2/D5;->j()LR2/Y1;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const-string v1, "EES not loaded for"

    .line 73
    .line 74
    iget-object v2, p2, LR2/W5;->o:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v0, v1, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    invoke-virtual {p0, p1, p2}, LR2/R2;->e1(LR2/I;LR2/W5;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_2
    :try_start_0
    iget-object v1, p0, LR2/R2;->b:LR2/D5;

    .line 84
    .line 85
    invoke-virtual {v1}, LR2/D5;->m0()LR2/N5;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v2, p1, LR2/I;->p:LR2/D;

    .line 90
    .line 91
    invoke-virtual {v2}, LR2/D;->g()Landroid/os/Bundle;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    const/4 v3, 0x1

    .line 96
    invoke-virtual {v1, v2, v3}, LR2/N5;->O(Landroid/os/Bundle;Z)Ljava/util/Map;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iget-object v2, p1, LR2/I;->o:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {v2}, LR2/r3;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    if-nez v2, :cond_3

    .line 107
    .line 108
    iget-object v2, p1, LR2/I;->o:Ljava/lang/String;

    .line 109
    .line 110
    :cond_3
    new-instance v3, Lcom/google/android/gms/internal/measurement/e;

    .line 111
    .line 112
    iget-wide v4, p1, LR2/I;->r:J

    .line 113
    .line 114
    invoke-direct {v3, v2, v4, v5, v1}, Lcom/google/android/gms/internal/measurement/e;-><init>(Ljava/lang/String;JLjava/util/Map;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/C;->d(Lcom/google/android/gms/internal/measurement/e;)Z

    .line 118
    .line 119
    .line 120
    move-result v1
    :try_end_0
    .catch Lcom/google/android/gms/internal/measurement/d0; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    if-nez v1, :cond_4

    .line 122
    .line 123
    goto/16 :goto_3

    .line 124
    .line 125
    :cond_4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/C;->g()Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_5

    .line 130
    .line 131
    iget-object v1, p0, LR2/R2;->b:LR2/D5;

    .line 132
    .line 133
    invoke-virtual {v1}, LR2/D5;->j()LR2/Y1;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v1}, LR2/Y1;->K()LR2/a2;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    const-string v2, "EES edited event"

    .line 142
    .line 143
    iget-object p1, p1, LR2/I;->o:Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {v1, v2, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    iget-object p1, p0, LR2/R2;->b:LR2/D5;

    .line 149
    .line 150
    invoke-virtual {p1}, LR2/D5;->m0()LR2/N5;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/C;->a()Lcom/google/android/gms/internal/measurement/d;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->d()Lcom/google/android/gms/internal/measurement/e;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {p1, v1}, LR2/N5;->B(Lcom/google/android/gms/internal/measurement/e;)LR2/I;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    :cond_5
    invoke-virtual {p0, p1, p2}, LR2/R2;->e1(LR2/I;LR2/W5;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/C;->f()Z

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-eqz p1, :cond_6

    .line 174
    .line 175
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/C;->a()Lcom/google/android/gms/internal/measurement/d;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d;->f()Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_6

    .line 192
    .line 193
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    check-cast v0, Lcom/google/android/gms/internal/measurement/e;

    .line 198
    .line 199
    iget-object v1, p0, LR2/R2;->b:LR2/D5;

    .line 200
    .line 201
    invoke-virtual {v1}, LR2/D5;->j()LR2/Y1;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {v1}, LR2/Y1;->K()LR2/a2;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/e;->e()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    const-string v3, "EES logging created event"

    .line 214
    .line 215
    invoke-virtual {v1, v3, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    iget-object v1, p0, LR2/R2;->b:LR2/D5;

    .line 219
    .line 220
    invoke-virtual {v1}, LR2/D5;->m0()LR2/N5;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-virtual {v1, v0}, LR2/N5;->B(Lcom/google/android/gms/internal/measurement/e;)LR2/I;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {p0, v0, p2}, LR2/R2;->e1(LR2/I;LR2/W5;)V

    .line 229
    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_6
    return-void

    .line 233
    :catch_0
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 234
    .line 235
    invoke-virtual {v0}, LR2/D5;->j()LR2/Y1;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    iget-object v1, p2, LR2/W5;->p:Ljava/lang/String;

    .line 244
    .line 245
    iget-object v2, p1, LR2/I;->o:Ljava/lang/String;

    .line 246
    .line 247
    const-string v3, "EES error. appId, eventName"

    .line 248
    .line 249
    invoke-virtual {v0, v3, v1, v2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    :goto_3
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 253
    .line 254
    invoke-virtual {v0}, LR2/D5;->j()LR2/Y1;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    iget-object v1, p1, LR2/I;->o:Ljava/lang/String;

    .line 263
    .line 264
    const-string v2, "EES was not applied to event"

    .line 265
    .line 266
    invoke-virtual {v0, v2, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    goto/16 :goto_1
.end method

.method public final e1(LR2/I;LR2/W5;)V
    .locals 1

    .line 1
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/D5;->o0()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, LR2/D5;->q(LR2/I;LR2/W5;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final m0(LR2/e;LR2/W5;)V
    .locals 1

    .line 1
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, LR2/e;->q:LR2/R5;

    .line 5
    .line 6
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, p2, v0}, LR2/R2;->c1(LR2/W5;Z)V

    .line 11
    .line 12
    .line 13
    new-instance v0, LR2/e;

    .line 14
    .line 15
    invoke-direct {v0, p1}, LR2/e;-><init>(LR2/e;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p2, LR2/W5;->o:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p1, v0, LR2/e;->o:Ljava/lang/String;

    .line 21
    .line 22
    new-instance p1, LR2/U2;

    .line 23
    .line 24
    invoke-direct {p1, p0, v0, p2}, LR2/U2;-><init>(LR2/R2;LR2/e;LR2/W5;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, LR2/R2;->v(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final n0(LR2/e;)V
    .locals 2

    .line 1
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, LR2/e;->q:LR2/R5;

    .line 5
    .line 6
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iget-object v0, p1, LR2/e;->o:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, LR2/e;->o:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {p0, v0, v1}, LR2/R2;->a1(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    new-instance v0, LR2/e;

    .line 21
    .line 22
    invoke-direct {v0, p1}, LR2/e;-><init>(LR2/e;)V

    .line 23
    .line 24
    .line 25
    new-instance p1, LR2/X2;

    .line 26
    .line 27
    invoke-direct {p1, p0, v0}, LR2/X2;-><init>(LR2/R2;LR2/e;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1}, LR2/R2;->v(Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final v(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 5
    .line 6
    invoke-virtual {v0}, LR2/D5;->e()LR2/G2;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, LR2/G2;->J()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, LR2/R2;->b:LR2/D5;

    .line 21
    .line 22
    invoke-virtual {v0}, LR2/D5;->e()LR2/G2;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0, p1}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final x0(Ljava/lang/String;Ljava/lang/String;ZLR2/W5;)Ljava/util/List;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p4, v0}, LR2/R2;->c1(LR2/W5;Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p4, LR2/W5;->o:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, LR2/R2;->b:LR2/D5;

    .line 11
    .line 12
    invoke-virtual {v1}, LR2/D5;->e()LR2/G2;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, LR2/W2;

    .line 17
    .line 18
    invoke-direct {v2, p0, v0, p1, p2}, LR2/W2;-><init>(LR2/R2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, LR2/G2;->w(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ljava/util/List;

    .line 30
    .line 31
    new-instance p2, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, LR2/T5;

    .line 55
    .line 56
    if-nez p3, :cond_1

    .line 57
    .line 58
    iget-object v1, v0, LR2/T5;->c:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v1}, LR2/S5;->H0(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_0

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :catch_0
    move-exception p1

    .line 68
    goto :goto_2

    .line 69
    :catch_1
    move-exception p1

    .line 70
    goto :goto_2

    .line 71
    :cond_1
    :goto_1
    new-instance v1, LR2/R5;

    .line 72
    .line 73
    invoke-direct {v1, v0}, LR2/R5;-><init>(LR2/T5;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    return-object p2

    .line 81
    :goto_2
    iget-object p2, p0, LR2/R2;->b:LR2/D5;

    .line 82
    .line 83
    invoke-virtual {p2}, LR2/D5;->j()LR2/Y1;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {p2}, LR2/Y1;->G()LR2/a2;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    iget-object p3, p4, LR2/W5;->o:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {p3}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    const-string p4, "Failed to query user properties. appId"

    .line 98
    .line 99
    invoke-virtual {p2, p4, p3, p1}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    return-object p1
.end method
