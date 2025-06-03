.class public Lpc/g;
.super Lnc/a;
.source "SourceFile"

# interfaces
.implements Lpc/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lnc/a<",
        "Lrb/h;",
        ">;",
        "Lpc/f<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final d:Lpc/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpc/f<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lub/h;Lpc/b;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lnc/a;-><init>(Lub/h;Z)V

    iput-object p2, p0, Lpc/g;->d:Lpc/f;

    return-void
.end method


# virtual methods
.method public final a(Lpc/o$b;)V
    .locals 1

    iget-object v0, p0, Lpc/g;->d:Lpc/f;

    invoke-interface {v0, p1}, Lpc/t;->a(Lpc/o$b;)V

    return-void
.end method

.method public final c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpc/g;->d:Lpc/f;

    invoke-interface {v0}, Lpc/s;->c()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic cancel()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    invoke-virtual {p0}, Lnc/o1;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    new-instance v0, Lnc/k1;

    .line 1
    invoke-virtual {p0}, Lnc/a;->u()Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-direct {v0, v1, p1, p0}, Lnc/k1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lnc/j1;)V

    move-object p1, v0

    :cond_1
    invoke-virtual {p0, p1}, Lpc/g;->s(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final synthetic cancel(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final d(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, Lpc/g;->d:Lpc/f;

    invoke-interface {v0, p1}, Lpc/t;->d(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public final i(Lrc/j;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpc/g;->d:Lpc/f;

    invoke-interface {v0, p1}, Lpc/s;->i(Lrc/j;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lvb/a;->a:Lvb/a;

    return-object p1
.end method

.method public final iterator()Lpc/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lpc/h<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, Lpc/g;->d:Lpc/f;

    invoke-interface {v0}, Lpc/s;->iterator()Lpc/h;

    move-result-object v0

    return-object v0
.end method

.method public final k(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lpc/g;->d:Lpc/f;

    invoke-interface {v0, p1, p2}, Lpc/t;->k(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lpc/g;->d:Lpc/f;

    invoke-interface {v0, p1}, Lpc/t;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final m()Z
    .locals 1

    iget-object v0, p0, Lpc/g;->d:Lpc/f;

    invoke-interface {v0}, Lpc/t;->m()Z

    move-result v0

    return v0
.end method

.method public final s(Ljava/util/concurrent/CancellationException;)V
    .locals 1

    invoke-static {p0, p1}, Lnc/o1;->W(Lnc/o1;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    iget-object v0, p0, Lpc/g;->d:Lpc/f;

    invoke-interface {v0, p1}, Lpc/s;->cancel(Ljava/util/concurrent/CancellationException;)V

    invoke-virtual {p0, p1}, Lnc/o1;->r(Ljava/lang/Object;)Z

    return-void
.end method
