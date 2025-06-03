.class public final LR2/H4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic p:LR2/W5;

.field public final synthetic q:Landroid/os/Bundle;

.field public final synthetic r:LR2/D4;


# direct methods
.method public constructor <init>(LR2/D4;Ljava/util/concurrent/atomic/AtomicReference;LR2/W5;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/H4;->r:LR2/D4;

    .line 2
    .line 3
    iput-object p2, p0, LR2/H4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    iput-object p3, p0, LR2/H4;->p:LR2/W5;

    .line 6
    .line 7
    iput-object p4, p0, LR2/H4;->q:Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, LR2/H4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LR2/H4;->r:LR2/D4;

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
    iget-object v1, p0, LR2/H4;->r:LR2/D4;

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
    const-string v2, "Failed to get trigger URIs; not connected to service"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, LR2/a2;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 25
    .line 26
    .line 27
    :try_start_1
    iget-object v1, p0, LR2/H4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 30
    .line 31
    .line 32
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    goto :goto_4

    .line 36
    :catchall_1
    move-exception v1

    .line 37
    goto :goto_3

    .line 38
    :catch_0
    move-exception v1

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    :try_start_2
    iget-object v2, p0, LR2/H4;->p:LR2/W5;

    .line 41
    .line 42
    invoke-static {v2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, LR2/H4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 46
    .line 47
    iget-object v3, p0, LR2/H4;->p:LR2/W5;

    .line 48
    .line 49
    iget-object v4, p0, LR2/H4;->q:Landroid/os/Bundle;

    .line 50
    .line 51
    invoke-interface {v1, v3, v4}, LR2/R1;->F(LR2/W5;Landroid/os/Bundle;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, LR2/H4;->r:LR2/D4;

    .line 59
    .line 60
    invoke-static {v1}, LR2/D4;->m0(LR2/D4;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 61
    .line 62
    .line 63
    :try_start_3
    iget-object v1, p0, LR2/H4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 64
    .line 65
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :goto_1
    :try_start_4
    iget-object v2, p0, LR2/H4;->r:LR2/D4;

    .line 70
    .line 71
    invoke-virtual {v2}, LR2/m3;->j()LR2/Y1;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    const-string v3, "Failed to get trigger URIs; remote exception"

    .line 80
    .line 81
    invoke-virtual {v2, v3, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 82
    .line 83
    .line 84
    :try_start_5
    iget-object v1, p0, LR2/H4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :goto_2
    monitor-exit v0

    .line 88
    return-void

    .line 89
    :goto_3
    iget-object v2, p0, LR2/H4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 92
    .line 93
    .line 94
    throw v1

    .line 95
    :goto_4
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 96
    throw v1
.end method
