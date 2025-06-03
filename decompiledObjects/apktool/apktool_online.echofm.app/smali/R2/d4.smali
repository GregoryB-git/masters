.class public final LR2/d4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lcom/google/android/gms/internal/measurement/y0;

.field public final synthetic p:LR2/C3;


# direct methods
.method public constructor <init>(LR2/C3;Lcom/google/android/gms/internal/measurement/y0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/d4;->p:LR2/C3;

    .line 2
    .line 3
    iput-object p2, p0, LR2/d4;->o:Lcom/google/android/gms/internal/measurement/y0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, LR2/d4;->p:LR2/C3;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/G1;->u()LR2/l5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/measurement/r7;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    invoke-virtual {v0}, LR2/m3;->f()LR2/g;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sget-object v3, LR2/K;->D0:LR2/P1;

    .line 19
    .line 20
    invoke-virtual {v1, v3}, LR2/g;->s(LR2/P1;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    invoke-virtual {v0}, LR2/m3;->i()LR2/l2;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, LR2/l2;->J()LR2/q3;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, LR2/q3;->y()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0}, LR2/m3;->j()LR2/Y1;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, LR2/Y1;->M()LR2/a2;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-string v1, "Analytics storage consent denied; will not get session id"

    .line 49
    .line 50
    :goto_0
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    :goto_1
    move-object v0, v2

    .line 54
    goto :goto_2

    .line 55
    :cond_1
    invoke-virtual {v0}, LR2/m3;->i()LR2/l2;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0}, LR2/m3;->b()LE2/e;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-interface {v3}, LE2/e;->a()J

    .line 64
    .line 65
    .line 66
    move-result-wide v3

    .line 67
    invoke-virtual {v1, v3, v4}, LR2/l2;->y(J)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_0

    .line 72
    .line 73
    invoke-virtual {v0}, LR2/m3;->i()LR2/l2;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-object v1, v1, LR2/l2;->q:LR2/q2;

    .line 78
    .line 79
    invoke-virtual {v1}, LR2/q2;->a()J

    .line 80
    .line 81
    .line 82
    move-result-wide v3

    .line 83
    const-wide/16 v5, 0x0

    .line 84
    .line 85
    cmp-long v1, v3, v5

    .line 86
    .line 87
    if-nez v1, :cond_2

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    invoke-virtual {v0}, LR2/m3;->i()LR2/l2;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget-object v0, v0, LR2/l2;->q:LR2/q2;

    .line 95
    .line 96
    invoke-virtual {v0}, LR2/q2;->a()J

    .line 97
    .line 98
    .line 99
    move-result-wide v0

    .line 100
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    goto :goto_2

    .line 105
    :cond_3
    invoke-virtual {v0}, LR2/m3;->j()LR2/Y1;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, LR2/Y1;->M()LR2/a2;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    const-string v1, "getSessionId has been disabled."

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :goto_2
    if-eqz v0, :cond_4

    .line 117
    .line 118
    iget-object v1, p0, LR2/d4;->p:LR2/C3;

    .line 119
    .line 120
    iget-object v1, v1, LR2/m3;->a:LR2/N2;

    .line 121
    .line 122
    invoke-virtual {v1}, LR2/N2;->L()LR2/S5;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    iget-object v2, p0, LR2/d4;->o:Lcom/google/android/gms/internal/measurement/y0;

    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 129
    .line 130
    .line 131
    move-result-wide v3

    .line 132
    invoke-virtual {v1, v2, v3, v4}, LR2/S5;->T(Lcom/google/android/gms/internal/measurement/y0;J)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_4
    :try_start_0
    iget-object v0, p0, LR2/d4;->o:Lcom/google/android/gms/internal/measurement/y0;

    .line 137
    .line 138
    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/measurement/y0;->l(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :catch_0
    move-exception v0

    .line 143
    iget-object v1, p0, LR2/d4;->p:LR2/C3;

    .line 144
    .line 145
    iget-object v1, v1, LR2/m3;->a:LR2/N2;

    .line 146
    .line 147
    invoke-virtual {v1}, LR2/N2;->j()LR2/Y1;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    const-string v2, "getSessionId failed with exception"

    .line 156
    .line 157
    invoke-virtual {v1, v2, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    return-void
.end method
