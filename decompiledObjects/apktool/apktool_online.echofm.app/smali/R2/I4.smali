.class public final LR2/I4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LR2/W5;

.field public final synthetic p:LR2/D4;


# direct methods
.method public constructor <init>(LR2/D4;LR2/W5;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/I4;->p:LR2/D4;

    .line 2
    .line 3
    iput-object p2, p0, LR2/I4;->o:LR2/W5;

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
    .locals 3

    .line 1
    iget-object v0, p0, LR2/I4;->p:LR2/D4;

    .line 2
    .line 3
    invoke-static {v0}, LR2/D4;->B(LR2/D4;)LR2/R1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LR2/I4;->p:LR2/D4;

    .line 10
    .line 11
    invoke-virtual {v0}, LR2/m3;->j()LR2/Y1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "Failed to reset data on the service: not connected to service"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    :try_start_0
    iget-object v1, p0, LR2/I4;->o:LR2/W5;

    .line 26
    .line 27
    invoke-static {v1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, LR2/I4;->o:LR2/W5;

    .line 31
    .line 32
    invoke-interface {v0, v1}, LR2/R1;->D0(LR2/W5;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catch_0
    move-exception v0

    .line 37
    iget-object v1, p0, LR2/I4;->p:LR2/D4;

    .line 38
    .line 39
    invoke-virtual {v1}, LR2/m3;->j()LR2/Y1;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-string v2, "Failed to reset data on the service: remote exception"

    .line 48
    .line 49
    invoke-virtual {v1, v2, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    iget-object v0, p0, LR2/I4;->p:LR2/D4;

    .line 53
    .line 54
    invoke-static {v0}, LR2/D4;->m0(LR2/D4;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method
