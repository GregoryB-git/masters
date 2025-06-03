.class public final LR2/Y4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:LR2/W5;

.field public final synthetic r:Lcom/google/android/gms/internal/measurement/y0;

.field public final synthetic s:LR2/D4;


# direct methods
.method public constructor <init>(LR2/D4;Ljava/lang/String;Ljava/lang/String;LR2/W5;Lcom/google/android/gms/internal/measurement/y0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/Y4;->s:LR2/D4;

    .line 2
    .line 3
    iput-object p2, p0, LR2/Y4;->o:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, LR2/Y4;->p:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, LR2/Y4;->q:LR2/W5;

    .line 8
    .line 9
    iput-object p5, p0, LR2/Y4;->r:Lcom/google/android/gms/internal/measurement/y0;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, LR2/Y4;->s:LR2/D4;

    .line 7
    .line 8
    invoke-static {v1}, LR2/D4;->B(LR2/D4;)LR2/R1;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, LR2/Y4;->s:LR2/D4;

    .line 15
    .line 16
    invoke-virtual {v1}, LR2/m3;->j()LR2/Y1;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "Failed to get conditional properties; not connected to service"

    .line 25
    .line 26
    iget-object v3, p0, LR2/Y4;->o:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v4, p0, LR2/Y4;->p:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1, v2, v3, v4}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v1, p0, LR2/Y4;->s:LR2/D4;

    .line 34
    .line 35
    invoke-virtual {v1}, LR2/m3;->k()LR2/S5;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v2, p0, LR2/Y4;->r:Lcom/google/android/gms/internal/measurement/y0;

    .line 40
    .line 41
    invoke-virtual {v1, v2, v0}, LR2/S5;->W(Lcom/google/android/gms/internal/measurement/y0;Ljava/util/ArrayList;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception v1

    .line 46
    goto :goto_2

    .line 47
    :catch_0
    move-exception v1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :try_start_1
    iget-object v2, p0, LR2/Y4;->q:LR2/W5;

    .line 50
    .line 51
    invoke-static {v2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    iget-object v2, p0, LR2/Y4;->o:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v3, p0, LR2/Y4;->p:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v4, p0, LR2/Y4;->q:LR2/W5;

    .line 59
    .line 60
    invoke-interface {v1, v2, v3, v4}, LR2/R1;->V0(Ljava/lang/String;Ljava/lang/String;LR2/W5;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v1}, LR2/S5;->t0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v1, p0, LR2/Y4;->s:LR2/D4;

    .line 69
    .line 70
    invoke-static {v1}, LR2/D4;->m0(LR2/D4;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :goto_1
    :try_start_2
    iget-object v2, p0, LR2/Y4;->s:LR2/D4;

    .line 75
    .line 76
    invoke-virtual {v2}, LR2/m3;->j()LR2/Y1;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    const-string v3, "Failed to get conditional properties; remote exception"

    .line 85
    .line 86
    iget-object v4, p0, LR2/Y4;->o:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v5, p0, LR2/Y4;->p:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v2, v3, v4, v5, v1}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :goto_2
    iget-object v2, p0, LR2/Y4;->s:LR2/D4;

    .line 95
    .line 96
    invoke-virtual {v2}, LR2/m3;->k()LR2/S5;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    iget-object v3, p0, LR2/Y4;->r:Lcom/google/android/gms/internal/measurement/y0;

    .line 101
    .line 102
    invoke-virtual {v2, v3, v0}, LR2/S5;->W(Lcom/google/android/gms/internal/measurement/y0;Ljava/util/ArrayList;)V

    .line 103
    .line 104
    .line 105
    throw v1
.end method
