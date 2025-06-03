.class public final Lqc/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lqc/f<",
        "TT;>;"
    }
.end annotation


# virtual methods
.method public final a(Lub/e;)Lrb/h;
    .locals 4

    instance-of v0, p1, Lqc/v;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lqc/v;

    iget v1, v0, Lqc/v;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lqc/v;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lqc/v;

    invoke-direct {v0, p0, p1}, Lqc/v;-><init>(Lqc/w;Lub/e;)V

    :goto_0
    iget-object p1, v0, Lqc/v;->c:Ljava/lang/Object;

    sget-object v1, Lvb/a;->a:Lvb/a;

    iget v1, v0, Lqc/v;->e:I

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    const/4 v0, 0x2

    if-ne v1, v0, :cond_1

    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    :goto_1
    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v1, v0, Lqc/v;->b:Lrc/o;

    iget-object v0, v0, Lqc/v;->a:Lqc/w;

    :try_start_0
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lrc/o;->releaseIntercepted()V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    new-instance v1, Lrc/o;

    invoke-interface {v0}, Lub/e;->getContext()Lub/h;

    move-result-object p1

    const/4 v3, 0x0

    invoke-direct {v1, v3, p1}, Lrc/o;-><init>(Lqc/f;Lub/h;)V

    :try_start_1
    iput-object p0, v0, Lqc/v;->a:Lqc/w;

    iput-object v1, v0, Lqc/v;->b:Lrc/o;

    iput v2, v0, Lqc/v;->e:I

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {v1}, Lrc/o;->releaseIntercepted()V

    throw p1
.end method

.method public final emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 p1, 0x0

    throw p1
.end method
