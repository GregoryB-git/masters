.class public abstract synthetic LB3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LB3/e;LB3/F;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, LB3/e;->b(LB3/F;)Lr4/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, Lr4/b;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static b(LB3/e;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, LB3/F;->b(Ljava/lang/Class;)LB3/F;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, LB3/e;->h(LB3/F;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static c(LB3/e;Ljava/lang/Class;)Lr4/a;
    .locals 0

    .line 1
    invoke-static {p1}, LB3/F;->b(Ljava/lang/Class;)LB3/F;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, LB3/e;->d(LB3/F;)Lr4/a;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static d(LB3/e;Ljava/lang/Class;)Lr4/b;
    .locals 0

    .line 1
    invoke-static {p1}, LB3/F;->b(Ljava/lang/Class;)LB3/F;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, LB3/e;->b(LB3/F;)Lr4/b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static e(LB3/e;LB3/F;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, LB3/e;->f(LB3/F;)Lr4/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lr4/b;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/util/Set;

    .line 10
    .line 11
    return-object p0
.end method

.method public static f(LB3/e;Ljava/lang/Class;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-static {p1}, LB3/F;->b(Ljava/lang/Class;)LB3/F;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, LB3/e;->e(LB3/F;)Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
