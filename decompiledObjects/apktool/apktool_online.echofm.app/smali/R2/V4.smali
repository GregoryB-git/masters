.class public final LR2/V4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:LR2/W5;

.field public final synthetic t:LR2/D4;


# direct methods
.method public constructor <init>(LR2/D4;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LR2/W5;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/V4;->t:LR2/D4;

    .line 2
    .line 3
    iput-object p2, p0, LR2/V4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    iput-object p3, p0, LR2/V4;->p:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, LR2/V4;->q:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, LR2/V4;->r:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, LR2/V4;->s:LR2/W5;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, LR2/V4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LR2/V4;->t:LR2/D4;

    .line 5
    .line 6
    invoke-static {v1}, LR2/D4;->B(LR2/D4;)LR2/R1;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, LR2/V4;->t:LR2/D4;

    .line 13
    .line 14
    invoke-virtual {v1}, LR2/m3;->j()LR2/Y1;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "(legacy) Failed to get conditional properties; not connected to service"

    .line 23
    .line 24
    iget-object v3, p0, LR2/V4;->p:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v3}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    iget-object v4, p0, LR2/V4;->q:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v5, p0, LR2/V4;->r:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v1, v2, v3, v4, v5}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, LR2/V4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 38
    .line 39
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 44
    .line 45
    .line 46
    :try_start_1
    iget-object v1, p0, LR2/V4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 49
    .line 50
    .line 51
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    return-void

    .line 53
    :catchall_0
    move-exception v1

    .line 54
    goto :goto_6

    .line 55
    :catchall_1
    move-exception v1

    .line 56
    goto :goto_5

    .line 57
    :catch_0
    move-exception v1

    .line 58
    goto :goto_3

    .line 59
    :cond_0
    :try_start_2
    iget-object v2, p0, LR2/V4;->p:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    iget-object v2, p0, LR2/V4;->s:LR2/W5;

    .line 68
    .line 69
    invoke-static {v2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    iget-object v2, p0, LR2/V4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 73
    .line 74
    iget-object v3, p0, LR2/V4;->q:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v4, p0, LR2/V4;->r:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v5, p0, LR2/V4;->s:LR2/W5;

    .line 79
    .line 80
    invoke-interface {v1, v3, v4, v5}, LR2/R1;->V0(Ljava/lang/String;Ljava/lang/String;LR2/W5;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    :goto_0
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    iget-object v2, p0, LR2/V4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 89
    .line 90
    iget-object v3, p0, LR2/V4;->p:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v4, p0, LR2/V4;->q:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v5, p0, LR2/V4;->r:Ljava/lang/String;

    .line 95
    .line 96
    invoke-interface {v1, v3, v4, v5}, LR2/R1;->K0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    goto :goto_0

    .line 101
    :goto_1
    iget-object v1, p0, LR2/V4;->t:LR2/D4;

    .line 102
    .line 103
    invoke-static {v1}, LR2/D4;->m0(LR2/D4;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 104
    .line 105
    .line 106
    :try_start_3
    iget-object v1, p0, LR2/V4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 107
    .line 108
    :goto_2
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 109
    .line 110
    .line 111
    goto :goto_4

    .line 112
    :goto_3
    :try_start_4
    iget-object v2, p0, LR2/V4;->t:LR2/D4;

    .line 113
    .line 114
    invoke-virtual {v2}, LR2/m3;->j()LR2/Y1;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    const-string v3, "(legacy) Failed to get conditional properties; remote exception"

    .line 123
    .line 124
    iget-object v4, p0, LR2/V4;->p:Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {v4}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    iget-object v5, p0, LR2/V4;->q:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v2, v3, v4, v5, v1}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    iget-object v1, p0, LR2/V4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 136
    .line 137
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 142
    .line 143
    .line 144
    :try_start_5
    iget-object v1, p0, LR2/V4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :goto_4
    monitor-exit v0

    .line 148
    return-void

    .line 149
    :goto_5
    iget-object v2, p0, LR2/V4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 152
    .line 153
    .line 154
    throw v1

    .line 155
    :goto_6
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 156
    throw v1
.end method
