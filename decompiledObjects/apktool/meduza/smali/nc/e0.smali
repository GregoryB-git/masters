.class public final Lnc/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lub/h;)Lsc/d;
    .locals 3

    .line 1
    new-instance v0, Lsc/d;

    .line 2
    .line 3
    sget-object v1, Lnc/j1$b;->a:Lnc/j1$b;

    .line 4
    .line 5
    invoke-interface {p0, v1}, Lub/h;->get(Lub/h$c;)Lub/h$b;

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
    const/4 v1, 0x0

    .line 13
    new-instance v2, Lnc/m1;

    .line 14
    .line 15
    invoke-direct {v2, v1}, Lnc/m1;-><init>(Lnc/j1;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0, v2}, Lub/h;->plus(Lub/h;)Lub/h;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    invoke-direct {v0, p0}, Lsc/d;-><init>(Lub/h;)V

    .line 23
    .line 24
    .line 25
    return-object v0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public static final b(Ldc/p;Lub/e;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ldc/p<",
            "-",
            "Lnc/d0;",
            "-",
            "Lub/e<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lub/e<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lsc/s;

    invoke-interface {p1}, Lub/e;->getContext()Lub/h;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lsc/s;-><init>(Lub/e;Lub/h;)V

    invoke-static {v0, v0, p0}, Lx6/b;->t0(Lsc/s;Lsc/s;Ldc/p;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lvb/a;->a:Lvb/a;

    return-object p0
.end method
