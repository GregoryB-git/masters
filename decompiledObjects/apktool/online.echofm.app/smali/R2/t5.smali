.class public final LR2/t5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:LR2/l5;


# direct methods
.method public constructor <init>(LR2/l5;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/t5;->a:LR2/l5;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, LR2/t5;->a:LR2/l5;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR2/t5;->a:LR2/l5;

    .line 7
    .line 8
    invoke-virtual {v0}, LR2/m3;->i()LR2/l2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, LR2/t5;->a:LR2/l5;

    .line 13
    .line 14
    invoke-virtual {v1}, LR2/m3;->b()LE2/e;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, LE2/e;->a()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    invoke-virtual {v0, v1, v2}, LR2/l2;->y(J)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, LR2/t5;->a:LR2/l5;

    .line 29
    .line 30
    invoke-virtual {v0}, LR2/m3;->i()LR2/l2;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v0, v0, LR2/l2;->l:LR2/o2;

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-virtual {v0, v1}, LR2/o2;->a(Z)V

    .line 38
    .line 39
    .line 40
    new-instance v0, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 41
    .line 42
    invoke-direct {v0}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 46
    .line 47
    .line 48
    iget v0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 49
    .line 50
    const/16 v1, 0x64

    .line 51
    .line 52
    if-ne v0, v1, :cond_0

    .line 53
    .line 54
    iget-object v0, p0, LR2/t5;->a:LR2/l5;

    .line 55
    .line 56
    invoke-virtual {v0}, LR2/m3;->j()LR2/Y1;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v1, "Detected application was in foreground"

    .line 65
    .line 66
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, LR2/t5;->a:LR2/l5;

    .line 70
    .line 71
    invoke-virtual {v0}, LR2/m3;->b()LE2/e;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-interface {v0}, LE2/e;->a()J

    .line 76
    .line 77
    .line 78
    move-result-wide v0

    .line 79
    const/4 v2, 0x0

    .line 80
    invoke-virtual {p0, v0, v1, v2}, LR2/t5;->c(JZ)V

    .line 81
    .line 82
    .line 83
    :cond_0
    return-void
.end method

.method public final b(JZ)V
    .locals 2

    .line 1
    iget-object v0, p0, LR2/t5;->a:LR2/l5;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR2/t5;->a:LR2/l5;

    .line 7
    .line 8
    invoke-static {v0}, LR2/l5;->H(LR2/l5;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LR2/t5;->a:LR2/l5;

    .line 12
    .line 13
    invoke-virtual {v0}, LR2/m3;->i()LR2/l2;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1, p2}, LR2/l2;->y(J)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, LR2/t5;->a:LR2/l5;

    .line 24
    .line 25
    invoke-virtual {v0}, LR2/m3;->i()LR2/l2;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v0, v0, LR2/l2;->l:LR2/o2;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-virtual {v0, v1}, LR2/o2;->a(Z)V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lcom/google/android/gms/internal/measurement/s7;->a()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    iget-object v0, p0, LR2/t5;->a:LR2/l5;

    .line 42
    .line 43
    invoke-virtual {v0}, LR2/m3;->f()LR2/g;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sget-object v1, LR2/K;->x0:LR2/P1;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, LR2/g;->s(LR2/P1;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    iget-object v0, p0, LR2/t5;->a:LR2/l5;

    .line 56
    .line 57
    invoke-virtual {v0}, LR2/G1;->p()LR2/S1;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, LR2/S1;->I()V

    .line 62
    .line 63
    .line 64
    :cond_0
    iget-object v0, p0, LR2/t5;->a:LR2/l5;

    .line 65
    .line 66
    invoke-virtual {v0}, LR2/m3;->i()LR2/l2;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v0, v0, LR2/l2;->p:LR2/q2;

    .line 71
    .line 72
    invoke-virtual {v0, p1, p2}, LR2/q2;->b(J)V

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, LR2/t5;->a:LR2/l5;

    .line 76
    .line 77
    invoke-virtual {v0}, LR2/m3;->i()LR2/l2;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget-object v0, v0, LR2/l2;->l:LR2/o2;

    .line 82
    .line 83
    invoke-virtual {v0}, LR2/o2;->b()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_1

    .line 88
    .line 89
    invoke-virtual {p0, p1, p2, p3}, LR2/t5;->c(JZ)V

    .line 90
    .line 91
    .line 92
    :cond_1
    return-void
.end method

.method public final c(JZ)V
    .locals 10

    .line 1
    iget-object v0, p0, LR2/t5;->a:LR2/l5;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR2/t5;->a:LR2/l5;

    .line 7
    .line 8
    iget-object v0, v0, LR2/m3;->a:LR2/N2;

    .line 9
    .line 10
    invoke-virtual {v0}, LR2/N2;->p()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, p0, LR2/t5;->a:LR2/l5;

    .line 18
    .line 19
    invoke-virtual {v0}, LR2/m3;->i()LR2/l2;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v0, v0, LR2/l2;->p:LR2/q2;

    .line 24
    .line 25
    invoke-virtual {v0, p1, p2}, LR2/q2;->b(J)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, LR2/t5;->a:LR2/l5;

    .line 29
    .line 30
    invoke-virtual {v0}, LR2/m3;->b()LE2/e;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0}, LE2/e;->b()J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    iget-object v2, p0, LR2/t5;->a:LR2/l5;

    .line 39
    .line 40
    invoke-virtual {v2}, LR2/m3;->j()LR2/Y1;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, LR2/Y1;->K()LR2/a2;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "Session started, time"

    .line 53
    .line 54
    invoke-virtual {v2, v1, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    const-wide/16 v0, 0x3e8

    .line 58
    .line 59
    div-long v0, p1, v0

    .line 60
    .line 61
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    iget-object v2, p0, LR2/t5;->a:LR2/l5;

    .line 66
    .line 67
    invoke-virtual {v2}, LR2/G1;->r()LR2/C3;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const-string v3, "auto"

    .line 72
    .line 73
    const-string v4, "_sid"

    .line 74
    .line 75
    move-wide v6, p1

    .line 76
    invoke-virtual/range {v2 .. v7}, LR2/C3;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    .line 77
    .line 78
    .line 79
    iget-object v2, p0, LR2/t5;->a:LR2/l5;

    .line 80
    .line 81
    invoke-virtual {v2}, LR2/m3;->i()LR2/l2;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    iget-object v2, v2, LR2/l2;->q:LR2/q2;

    .line 86
    .line 87
    invoke-virtual {v2, v0, v1}, LR2/q2;->b(J)V

    .line 88
    .line 89
    .line 90
    iget-object v2, p0, LR2/t5;->a:LR2/l5;

    .line 91
    .line 92
    invoke-virtual {v2}, LR2/m3;->i()LR2/l2;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    iget-object v2, v2, LR2/l2;->l:LR2/o2;

    .line 97
    .line 98
    const/4 v3, 0x0

    .line 99
    invoke-virtual {v2, v3}, LR2/o2;->a(Z)V

    .line 100
    .line 101
    .line 102
    new-instance v9, Landroid/os/Bundle;

    .line 103
    .line 104
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 105
    .line 106
    .line 107
    const-string v2, "_sid"

    .line 108
    .line 109
    invoke-virtual {v9, v2, v0, v1}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, LR2/t5;->a:LR2/l5;

    .line 113
    .line 114
    invoke-virtual {v0}, LR2/m3;->f()LR2/g;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sget-object v1, LR2/K;->m0:LR2/P1;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, LR2/g;->s(LR2/P1;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_1

    .line 125
    .line 126
    if-eqz p3, :cond_1

    .line 127
    .line 128
    const-string p3, "_aib"

    .line 129
    .line 130
    const-wide/16 v0, 0x1

    .line 131
    .line 132
    invoke-virtual {v9, p3, v0, v1}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 133
    .line 134
    .line 135
    :cond_1
    iget-object p3, p0, LR2/t5;->a:LR2/l5;

    .line 136
    .line 137
    invoke-virtual {p3}, LR2/G1;->r()LR2/C3;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    const-string v5, "auto"

    .line 142
    .line 143
    const-string v6, "_s"

    .line 144
    .line 145
    move-wide v7, p1

    .line 146
    invoke-virtual/range {v4 .. v9}, LR2/C3;->U(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V

    .line 147
    .line 148
    .line 149
    invoke-static {}, Lcom/google/android/gms/internal/measurement/t6;->a()Z

    .line 150
    .line 151
    .line 152
    move-result p3

    .line 153
    if-eqz p3, :cond_2

    .line 154
    .line 155
    iget-object p3, p0, LR2/t5;->a:LR2/l5;

    .line 156
    .line 157
    invoke-virtual {p3}, LR2/m3;->f()LR2/g;

    .line 158
    .line 159
    .line 160
    move-result-object p3

    .line 161
    sget-object v0, LR2/K;->p0:LR2/P1;

    .line 162
    .line 163
    invoke-virtual {p3, v0}, LR2/g;->s(LR2/P1;)Z

    .line 164
    .line 165
    .line 166
    move-result p3

    .line 167
    if-eqz p3, :cond_2

    .line 168
    .line 169
    iget-object p3, p0, LR2/t5;->a:LR2/l5;

    .line 170
    .line 171
    invoke-virtual {p3}, LR2/m3;->i()LR2/l2;

    .line 172
    .line 173
    .line 174
    move-result-object p3

    .line 175
    iget-object p3, p3, LR2/l2;->v:LR2/r2;

    .line 176
    .line 177
    invoke-virtual {p3}, LR2/r2;->a()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p3

    .line 181
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-nez v0, :cond_2

    .line 186
    .line 187
    new-instance v6, Landroid/os/Bundle;

    .line 188
    .line 189
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 190
    .line 191
    .line 192
    const-string v0, "_ffr"

    .line 193
    .line 194
    invoke-virtual {v6, v0, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    iget-object p3, p0, LR2/t5;->a:LR2/l5;

    .line 198
    .line 199
    invoke-virtual {p3}, LR2/G1;->r()LR2/C3;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    const-string v2, "auto"

    .line 204
    .line 205
    const-string v3, "_ssr"

    .line 206
    .line 207
    move-wide v4, p1

    .line 208
    invoke-virtual/range {v1 .. v6}, LR2/C3;->U(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V

    .line 209
    .line 210
    .line 211
    :cond_2
    return-void
.end method
