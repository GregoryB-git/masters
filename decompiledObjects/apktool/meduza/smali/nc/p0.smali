.class public abstract Lnc/p0;
.super Ltc/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ltc/g;"
    }
.end annotation


# instance fields
.field public c:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ltc/g;-><init>()V

    iput p1, p0, Lnc/p0;->c:I

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V
    .locals 0

    return-void
.end method

.method public abstract d()Lub/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lub/e<",
            "TT;>;"
        }
    .end annotation
.end method

.method public f(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    instance-of v0, p1, Lnc/u;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lnc/u;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    iget-object v1, p1, Lnc/u;->a:Ljava/lang/Throwable;

    :cond_1
    return-object v1
.end method

.method public g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    return-object p1
.end method

.method public final i(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    invoke-static {p1, p2}, Lx6/b;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_1
    if-nez p1, :cond_2

    move-object p1, p2

    :cond_2
    new-instance p2, Lnc/f0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fatal exception in coroutines machinery for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". Please read KDoc to \'handleFatalException\' method and report this incident to maintainers"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lec/i;->b(Ljava/lang/Object;)V

    invoke-direct {p2, v0, p1}, Lnc/f0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lnc/p0;->d()Lub/e;

    move-result-object p1

    invoke-interface {p1}, Lub/e;->getContext()Lub/h;

    move-result-object p1

    invoke-static {p1, p2}, Lnc/c0;->a(Lub/h;Ljava/lang/Throwable;)V

    return-void
.end method

.method public abstract k()Ljava/lang/Object;
.end method

.method public final run()V
    .locals 12

    iget-object v0, p0, Ltc/g;->b:Ltc/h;

    :try_start_0
    invoke-virtual {p0}, Lnc/p0;->d()Lub/e;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"

    invoke-static {v1, v2}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lsc/g;

    iget-object v2, v1, Lsc/g;->e:Lub/e;

    iget-object v1, v1, Lsc/g;->o:Ljava/lang/Object;

    invoke-interface {v2}, Lub/e;->getContext()Lub/h;

    move-result-object v3

    invoke-static {v3, v1}, Lsc/w;->c(Lub/h;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v4, Lsc/w;->a:Ld2/h0;

    const/4 v5, 0x0

    if-eq v1, v4, :cond_0

    invoke-static {v2, v3, v1}, Lnc/y;->c(Lub/e;Lub/h;Ljava/lang/Object;)Lnc/g2;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    goto :goto_0

    :cond_0
    move-object v4, v5

    :goto_0
    :try_start_1
    invoke-interface {v2}, Lub/e;->getContext()Lub/h;

    move-result-object v6

    invoke-virtual {p0}, Lnc/p0;->k()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {p0, v7}, Lnc/p0;->f(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v8

    if-nez v8, :cond_3

    iget v9, p0, Lnc/p0;->c:I

    const/4 v10, 0x1

    if-eq v9, v10, :cond_2

    const/4 v11, 0x2

    if-ne v9, v11, :cond_1

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    :cond_2
    :goto_1
    if-eqz v10, :cond_3

    sget-object v9, Lnc/j1$b;->a:Lnc/j1$b;

    invoke-interface {v6, v9}, Lub/h;->get(Lub/h$c;)Lub/h$b;

    move-result-object v6

    check-cast v6, Lnc/j1;

    goto :goto_2

    :cond_3
    move-object v6, v5

    :goto_2
    if-eqz v6, :cond_4

    invoke-interface {v6}, Lnc/j1;->isActive()Z

    move-result v9

    if-nez v9, :cond_4

    invoke-interface {v6}, Lnc/j1;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object v6

    invoke-virtual {p0, v7, v6}, Lnc/p0;->a(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V

    invoke-static {v6}, Lrb/f;->a(Ljava/lang/Throwable;)Lrb/e$a;

    move-result-object v6

    goto :goto_3

    :catchall_0
    move-exception v2

    goto :goto_5

    :cond_4
    if-eqz v8, :cond_5

    invoke-static {v8}, Lrb/f;->a(Ljava/lang/Throwable;)Lrb/e$a;

    move-result-object v6

    goto :goto_3

    :cond_5
    invoke-virtual {p0, v7}, Lnc/p0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    :goto_3
    invoke-interface {v2, v6}, Lub/e;->resumeWith(Ljava/lang/Object;)V

    sget-object v2, Lrb/h;->a:Lrb/h;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v4, :cond_6

    :try_start_2
    invoke-virtual {v4}, Lnc/g2;->e0()Z

    move-result v2

    if-eqz v2, :cond_7

    :cond_6
    invoke-static {v3, v1}, Lsc/w;->a(Lub/h;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :cond_7
    :try_start_3
    invoke-interface {v0}, Ltc/h;->a()V

    sget-object v0, Lrb/h;->a:Lrb/h;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lrb/f;->a(Ljava/lang/Throwable;)Lrb/e$a;

    move-result-object v0

    :goto_4
    invoke-static {v0}, Lrb/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v5, v0}, Lnc/p0;->i(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_7

    :goto_5
    if-eqz v4, :cond_8

    :try_start_4
    invoke-virtual {v4}, Lnc/g2;->e0()Z

    move-result v4

    if-eqz v4, :cond_9

    :cond_8
    invoke-static {v3, v1}, Lsc/w;->a(Lub/h;Ljava/lang/Object;)V

    :cond_9
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v1

    :try_start_5
    invoke-interface {v0}, Ltc/h;->a()V

    sget-object v0, Lrb/h;->a:Lrb/h;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_6

    :catchall_3
    move-exception v0

    invoke-static {v0}, Lrb/f;->a(Ljava/lang/Throwable;)Lrb/e$a;

    move-result-object v0

    :goto_6
    invoke-static {v0}, Lrb/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lnc/p0;->i(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_7
    return-void
.end method
