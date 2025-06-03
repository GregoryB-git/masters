.class public final LR2/K4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LR2/W5;

.field public final synthetic p:Lcom/google/android/gms/internal/measurement/y0;

.field public final synthetic q:LR2/D4;


# direct methods
.method public constructor <init>(LR2/D4;LR2/W5;Lcom/google/android/gms/internal/measurement/y0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/K4;->q:LR2/D4;

    .line 2
    .line 3
    iput-object p2, p0, LR2/K4;->o:LR2/W5;

    .line 4
    .line 5
    iput-object p3, p0, LR2/K4;->p:Lcom/google/android/gms/internal/measurement/y0;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    const-string v0, "Failed to get app instance id"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iget-object v2, p0, LR2/K4;->q:LR2/D4;

    .line 5
    .line 6
    invoke-virtual {v2}, LR2/m3;->i()LR2/l2;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v2}, LR2/l2;->J()LR2/q3;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2}, LR2/q3;->y()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    iget-object v2, p0, LR2/K4;->q:LR2/D4;

    .line 21
    .line 22
    invoke-virtual {v2}, LR2/m3;->j()LR2/Y1;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, LR2/Y1;->M()LR2/a2;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-string v3, "Analytics storage consent denied; will not get app instance id"

    .line 31
    .line 32
    invoke-virtual {v2, v3}, LR2/a2;->a(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v2, p0, LR2/K4;->q:LR2/D4;

    .line 36
    .line 37
    invoke-virtual {v2}, LR2/G1;->r()LR2/C3;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2, v1}, LR2/C3;->T(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, LR2/K4;->q:LR2/D4;

    .line 45
    .line 46
    invoke-virtual {v2}, LR2/m3;->i()LR2/l2;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    iget-object v2, v2, LR2/l2;->g:LR2/r2;

    .line 51
    .line 52
    invoke-virtual {v2, v1}, LR2/r2;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    :goto_0
    iget-object v0, p0, LR2/K4;->q:LR2/D4;

    .line 56
    .line 57
    invoke-virtual {v0}, LR2/m3;->k()LR2/S5;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v2, p0, LR2/K4;->p:Lcom/google/android/gms/internal/measurement/y0;

    .line 62
    .line 63
    invoke-virtual {v0, v2, v1}, LR2/S5;->V(Lcom/google/android/gms/internal/measurement/y0;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    goto :goto_2

    .line 69
    :catch_0
    move-exception v2

    .line 70
    goto :goto_1

    .line 71
    :cond_0
    :try_start_1
    iget-object v2, p0, LR2/K4;->q:LR2/D4;

    .line 72
    .line 73
    invoke-static {v2}, LR2/D4;->B(LR2/D4;)LR2/R1;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    if-nez v2, :cond_1

    .line 78
    .line 79
    iget-object v2, p0, LR2/K4;->q:LR2/D4;

    .line 80
    .line 81
    invoke-virtual {v2}, LR2/m3;->j()LR2/Y1;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v2, v0}, LR2/a2;->a(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    iget-object v3, p0, LR2/K4;->o:LR2/W5;

    .line 94
    .line 95
    invoke-static {v3}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    iget-object v3, p0, LR2/K4;->o:LR2/W5;

    .line 99
    .line 100
    invoke-interface {v2, v3}, LR2/R1;->G(LR2/W5;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    if-eqz v1, :cond_2

    .line 105
    .line 106
    iget-object v2, p0, LR2/K4;->q:LR2/D4;

    .line 107
    .line 108
    invoke-virtual {v2}, LR2/G1;->r()LR2/C3;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v2, v1}, LR2/C3;->T(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iget-object v2, p0, LR2/K4;->q:LR2/D4;

    .line 116
    .line 117
    invoke-virtual {v2}, LR2/m3;->i()LR2/l2;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    iget-object v2, v2, LR2/l2;->g:LR2/r2;

    .line 122
    .line 123
    invoke-virtual {v2, v1}, LR2/r2;->b(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    :cond_2
    iget-object v2, p0, LR2/K4;->q:LR2/D4;

    .line 127
    .line 128
    invoke-static {v2}, LR2/D4;->m0(LR2/D4;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :goto_1
    :try_start_2
    iget-object v3, p0, LR2/K4;->q:LR2/D4;

    .line 133
    .line 134
    invoke-virtual {v3}, LR2/m3;->j()LR2/Y1;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v3}, LR2/Y1;->G()LR2/a2;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-virtual {v3, v0, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :goto_2
    iget-object v2, p0, LR2/K4;->q:LR2/D4;

    .line 147
    .line 148
    invoke-virtual {v2}, LR2/m3;->k()LR2/S5;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    iget-object v3, p0, LR2/K4;->p:Lcom/google/android/gms/internal/measurement/y0;

    .line 153
    .line 154
    invoke-virtual {v2, v3, v1}, LR2/S5;->V(Lcom/google/android/gms/internal/measurement/y0;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v0
.end method
