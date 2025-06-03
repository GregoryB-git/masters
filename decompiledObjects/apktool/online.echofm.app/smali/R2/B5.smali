.class public final LR2/B5;
.super LR2/z5;
.source "SourceFile"


# direct methods
.method public constructor <init>(LR2/D5;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LR2/z5;-><init>(LR2/D5;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final v(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, LR2/z5;->r()LR2/x2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LR2/x2;->Q(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    sget-object v0, LR2/K;->s:LR2/P1;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, LR2/P1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p1, "."

    .line 45
    .line 46
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {v1, p1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    return-object p1

    .line 68
    :cond_0
    sget-object p1, LR2/K;->s:LR2/P1;

    .line 69
    .line 70
    invoke-virtual {p1, v1}, LR2/P1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Ljava/lang/String;

    .line 75
    .line 76
    return-object p1
.end method


# virtual methods
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

.method public final u(Ljava/lang/String;)LR2/E5;
    .locals 5

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/E7;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, LR2/K;->A0:LR2/P1;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, LR2/g;->s(LR2/P1;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_6

    .line 18
    .line 19
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "sgtm feature flag enabled."

    .line 28
    .line 29
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, LR2/z5;->q()LR2/p;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0, p1}, LR2/p;->D0(Ljava/lang/String;)LR2/I2;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    new-instance v0, LR2/E5;

    .line 43
    .line 44
    invoke-direct {p0, p1}, LR2/B5;->v(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {v0, p1}, LR2/E5;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_0
    invoke-virtual {v0}, LR2/I2;->t()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    const/4 v2, 0x0

    .line 57
    if-nez v1, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, LR2/Y1;->K()LR2/a2;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const-string v3, "sgtm upload enabled in manifest."

    .line 69
    .line 70
    invoke-virtual {v1, v3}, LR2/a2;->a(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, LR2/z5;->r()LR2/x2;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0}, LR2/I2;->t0()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v1, v0}, LR2/x2;->L(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/L1;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-nez v0, :cond_2

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/L1;->S()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_3

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/L1;->R()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v2}, LR2/Y1;->K()LR2/a2;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-eqz v3, :cond_4

    .line 116
    .line 117
    const-string v3, "Y"

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_4
    const-string v3, "N"

    .line 121
    .line 122
    :goto_0
    const-string v4, "sgtm configured with upload_url, server_info"

    .line 123
    .line 124
    invoke-virtual {v2, v4, v1, v3}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-eqz v2, :cond_5

    .line 132
    .line 133
    new-instance v2, LR2/E5;

    .line 134
    .line 135
    invoke-direct {v2, v1}, LR2/E5;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_5
    new-instance v2, Ljava/util/HashMap;

    .line 140
    .line 141
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 142
    .line 143
    .line 144
    const-string v3, "x-google-sgtm-server-info"

    .line 145
    .line 146
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    new-instance v0, LR2/E5;

    .line 150
    .line 151
    invoke-direct {v0, v1, v2}, LR2/E5;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 152
    .line 153
    .line 154
    move-object v2, v0

    .line 155
    :goto_1
    if-eqz v2, :cond_6

    .line 156
    .line 157
    return-object v2

    .line 158
    :cond_6
    new-instance v0, LR2/E5;

    .line 159
    .line 160
    invoke-direct {p0, p1}, LR2/B5;->v(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-direct {v0, p1}, LR2/E5;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    return-object v0
.end method
