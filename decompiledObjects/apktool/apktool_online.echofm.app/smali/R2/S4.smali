.class public final LR2/S4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LR2/I;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Lcom/google/android/gms/internal/measurement/y0;

.field public final synthetic r:LR2/D4;


# direct methods
.method public constructor <init>(LR2/D4;LR2/I;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/y0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/S4;->r:LR2/D4;

    .line 2
    .line 3
    iput-object p2, p0, LR2/S4;->o:LR2/I;

    .line 4
    .line 5
    iput-object p3, p0, LR2/S4;->p:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, LR2/S4;->q:Lcom/google/android/gms/internal/measurement/y0;

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
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, LR2/S4;->r:LR2/D4;

    .line 3
    .line 4
    invoke-static {v1}, LR2/D4;->B(LR2/D4;)LR2/R1;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, LR2/S4;->r:LR2/D4;

    .line 11
    .line 12
    invoke-virtual {v1}, LR2/m3;->j()LR2/Y1;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "Discarding data. Failed to send event to service to bundle"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, LR2/a2;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object v1, p0, LR2/S4;->r:LR2/D4;

    .line 26
    .line 27
    invoke-virtual {v1}, LR2/m3;->k()LR2/S5;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v2, p0, LR2/S4;->q:Lcom/google/android/gms/internal/measurement/y0;

    .line 32
    .line 33
    invoke-virtual {v1, v2, v0}, LR2/S5;->Y(Lcom/google/android/gms/internal/measurement/y0;[B)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    goto :goto_2

    .line 39
    :catch_0
    move-exception v1

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    :try_start_1
    iget-object v2, p0, LR2/S4;->o:LR2/I;

    .line 42
    .line 43
    iget-object v3, p0, LR2/S4;->p:Ljava/lang/String;

    .line 44
    .line 45
    invoke-interface {v1, v2, v3}, LR2/R1;->M0(LR2/I;Ljava/lang/String;)[B

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v1, p0, LR2/S4;->r:LR2/D4;

    .line 50
    .line 51
    invoke-static {v1}, LR2/D4;->m0(LR2/D4;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :goto_1
    :try_start_2
    iget-object v2, p0, LR2/S4;->r:LR2/D4;

    .line 56
    .line 57
    invoke-virtual {v2}, LR2/m3;->j()LR2/Y1;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    const-string v3, "Failed to send event to the service to bundle"

    .line 66
    .line 67
    invoke-virtual {v2, v3, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :goto_2
    iget-object v2, p0, LR2/S4;->r:LR2/D4;

    .line 72
    .line 73
    invoke-virtual {v2}, LR2/m3;->k()LR2/S5;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    iget-object v3, p0, LR2/S4;->q:Lcom/google/android/gms/internal/measurement/y0;

    .line 78
    .line 79
    invoke-virtual {v2, v3, v0}, LR2/S5;->Y(Lcom/google/android/gms/internal/measurement/y0;[B)V

    .line 80
    .line 81
    .line 82
    throw v1
.end method
