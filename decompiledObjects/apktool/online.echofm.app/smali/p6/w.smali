.class public abstract Lp6/w;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lp6/q0;)Lp6/u;
    .locals 1

    .line 1
    new-instance v0, Lp6/v;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lp6/v;-><init>(Lp6/q0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic b(Lp6/q0;ILjava/lang/Object;)Lp6/u;
    .locals 0

    .line 1
    and-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    :cond_0
    invoke-static {p0}, Lp6/w;->a(Lp6/q0;)Lp6/u;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final c(Lp6/u;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-static {p1}, LV5/n;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0, p1}, Lp6/u;->n(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {p0, v0}, Lp6/u;->l(Ljava/lang/Throwable;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    :goto_0
    return p0
.end method
