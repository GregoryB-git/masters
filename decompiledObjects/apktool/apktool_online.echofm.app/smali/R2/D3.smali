.class public final synthetic LR2/D3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic o:LR2/C3;

.field public synthetic p:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public synthetic constructor <init>(LR2/C3;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR2/D3;->o:LR2/C3;

    .line 5
    .line 6
    iput-object p2, p0, LR2/D3;->p:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LR2/D3;->o:LR2/C3;

    .line 2
    .line 3
    iget-object v1, p0, LR2/D3;->p:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    invoke-virtual {v0}, LR2/m3;->i()LR2/l2;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v2, v2, LR2/l2;->n:LR2/n2;

    .line 10
    .line 11
    invoke-virtual {v2}, LR2/n2;->a()Landroid/os/Bundle;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v0}, LR2/G1;->t()LR2/D4;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    new-instance v2, Landroid/os/Bundle;

    .line 22
    .line 23
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {v0, v1, v2}, LR2/D4;->R(Ljava/util/concurrent/atomic/AtomicReference;Landroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
