.class public abstract Lp6/J;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LX5/g;)Lp6/I;
    .locals 3

    .line 1
    new-instance v0, Lu6/f;

    .line 2
    .line 3
    sget-object v1, Lp6/q0;->n:Lp6/q0$b;

    .line 4
    .line 5
    invoke-interface {p0, v1}, LX5/g;->b(LX5/g$c;)LX5/g$b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v2, v1, v2}, Lp6/u0;->b(Lp6/q0;ILjava/lang/Object;)Lp6/x;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {p0, v1}, LX5/g;->k(LX5/g;)LX5/g;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    invoke-direct {v0, p0}, Lu6/f;-><init>(LX5/g;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public static final b(Lp6/I;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Lp6/I;->f()LX5/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lp6/u0;->d(LX5/g;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
