.class public final LR2/L4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic p:LR2/W5;

.field public final synthetic q:LR2/D4;


# direct methods
.method public constructor <init>(LR2/D4;Ljava/util/concurrent/atomic/AtomicReference;LR2/W5;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/L4;->q:LR2/D4;

    .line 2
    .line 3
    iput-object p2, p0, LR2/L4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    iput-object p3, p0, LR2/L4;->p:LR2/W5;

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
    iget-object v0, p0, LR2/L4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LR2/L4;->q:LR2/D4;

    .line 5
    .line 6
    invoke-virtual {v1}, LR2/m3;->i()LR2/l2;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, LR2/l2;->J()LR2/q3;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, LR2/q3;->y()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, LR2/L4;->q:LR2/D4;

    .line 21
    .line 22
    invoke-virtual {v1}, LR2/m3;->j()LR2/Y1;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, LR2/Y1;->M()LR2/a2;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "Analytics storage consent denied; will not get app instance id"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, LR2/L4;->q:LR2/D4;

    .line 36
    .line 37
    invoke-virtual {v1}, LR2/G1;->r()LR2/C3;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-virtual {v1, v2}, LR2/C3;->T(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, LR2/L4;->q:LR2/D4;

    .line 46
    .line 47
    invoke-virtual {v1}, LR2/m3;->i()LR2/l2;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object v1, v1, LR2/l2;->g:LR2/r2;

    .line 52
    .line 53
    invoke-virtual {v1, v2}, LR2/r2;->b(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, LR2/L4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 59
    .line 60
    .line 61
    :try_start_1
    iget-object v1, p0, LR2/L4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 64
    .line 65
    .line 66
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    return-void

    .line 68
    :catchall_0
    move-exception v1

    .line 69
    goto/16 :goto_4

    .line 70
    .line 71
    :catchall_1
    move-exception v1

    .line 72
    goto :goto_3

    .line 73
    :catch_0
    move-exception v1

    .line 74
    goto :goto_1

    .line 75
    :cond_0
    :try_start_2
    iget-object v1, p0, LR2/L4;->q:LR2/D4;

    .line 76
    .line 77
    invoke-static {v1}, LR2/D4;->B(LR2/D4;)LR2/R1;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-nez v1, :cond_1

    .line 82
    .line 83
    iget-object v1, p0, LR2/L4;->q:LR2/D4;

    .line 84
    .line 85
    invoke-virtual {v1}, LR2/m3;->j()LR2/Y1;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    const-string v2, "Failed to get app instance id"

    .line 94
    .line 95
    invoke-virtual {v1, v2}, LR2/a2;->a(Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 96
    .line 97
    .line 98
    :try_start_3
    iget-object v1, p0, LR2/L4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 101
    .line 102
    .line 103
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 104
    return-void

    .line 105
    :cond_1
    :try_start_4
    iget-object v2, p0, LR2/L4;->p:LR2/W5;

    .line 106
    .line 107
    invoke-static {v2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    iget-object v2, p0, LR2/L4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 111
    .line 112
    iget-object v3, p0, LR2/L4;->p:LR2/W5;

    .line 113
    .line 114
    invoke-interface {v1, v3}, LR2/R1;->G(LR2/W5;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iget-object v1, p0, LR2/L4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Ljava/lang/String;

    .line 128
    .line 129
    if-eqz v1, :cond_2

    .line 130
    .line 131
    iget-object v2, p0, LR2/L4;->q:LR2/D4;

    .line 132
    .line 133
    invoke-virtual {v2}, LR2/G1;->r()LR2/C3;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v2, v1}, LR2/C3;->T(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iget-object v2, p0, LR2/L4;->q:LR2/D4;

    .line 141
    .line 142
    invoke-virtual {v2}, LR2/m3;->i()LR2/l2;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    iget-object v2, v2, LR2/l2;->g:LR2/r2;

    .line 147
    .line 148
    invoke-virtual {v2, v1}, LR2/r2;->b(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :cond_2
    iget-object v1, p0, LR2/L4;->q:LR2/D4;

    .line 152
    .line 153
    invoke-static {v1}, LR2/D4;->m0(LR2/D4;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 154
    .line 155
    .line 156
    :try_start_5
    iget-object v1, p0, LR2/L4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 157
    .line 158
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :goto_1
    :try_start_6
    iget-object v2, p0, LR2/L4;->q:LR2/D4;

    .line 163
    .line 164
    invoke-virtual {v2}, LR2/m3;->j()LR2/Y1;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    const-string v3, "Failed to get app instance id"

    .line 173
    .line 174
    invoke-virtual {v2, v3, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 175
    .line 176
    .line 177
    :try_start_7
    iget-object v1, p0, LR2/L4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 178
    .line 179
    goto :goto_0

    .line 180
    :goto_2
    monitor-exit v0

    .line 181
    return-void

    .line 182
    :goto_3
    iget-object v2, p0, LR2/L4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 183
    .line 184
    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 185
    .line 186
    .line 187
    throw v1

    .line 188
    :goto_4
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 189
    throw v1
.end method
