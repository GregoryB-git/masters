.class public final Lnc/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a([Lnc/j0;Lub/e;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([",
            "Lnc/j0<",
            "+TT;>;",
            "Lub/e<",
            "-",
            "Ljava/util/List<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v0, v2

    .line 9
    :goto_0
    if-eqz v0, :cond_1

    .line 10
    .line 11
    sget-object p0, Lsb/s;->a:Lsb/s;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_1
    new-instance v0, Lnc/c;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lnc/c;-><init>([Lnc/j0;)V

    .line 17
    .line 18
    .line 19
    new-instance v3, Lnc/l;

    .line 20
    .line 21
    invoke-static {p1}, Lp2/m0;->P(Lub/e;)Lub/e;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {v3, v1, p1}, Lnc/l;-><init>(ILub/e;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Lnc/l;->t()V

    .line 29
    .line 30
    .line 31
    array-length p0, p0

    .line 32
    new-array p1, p0, [Lnc/c$a;

    .line 33
    .line 34
    move v4, v2

    .line 35
    :goto_1
    if-ge v4, p0, :cond_2

    .line 36
    .line 37
    iget-object v5, v0, Lnc/c;->a:[Lnc/j0;

    .line 38
    .line 39
    aget-object v5, v5, v4

    .line 40
    .line 41
    invoke-interface {v5}, Lnc/j1;->start()Z

    .line 42
    .line 43
    .line 44
    new-instance v6, Lnc/c$a;

    .line 45
    .line 46
    invoke-direct {v6, v0, v3}, Lnc/c$a;-><init>(Lnc/c;Lnc/l;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v5, v6}, Lnc/j1;->invokeOnCompletion(Ldc/l;)Lnc/t0;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    iput-object v5, v6, Lnc/c$a;->f:Lnc/t0;

    .line 54
    .line 55
    sget-object v5, Lrb/h;->a:Lrb/h;

    .line 56
    .line 57
    aput-object v6, p1, v4

    .line 58
    .line 59
    add-int/lit8 v4, v4, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    new-instance v0, Lnc/c$b;

    .line 63
    .line 64
    invoke-direct {v0, p1}, Lnc/c$b;-><init>([Lnc/c$a;)V

    .line 65
    .line 66
    .line 67
    :goto_2
    if-ge v2, p0, :cond_3

    .line 68
    .line 69
    aget-object v4, p1, v2

    .line 70
    .line 71
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    sget-object v5, Lnc/c$a;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 75
    .line 76
    invoke-virtual {v5, v4, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    sget-object p0, Lnc/l;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 83
    .line 84
    invoke-virtual {p0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    instance-of p0, p0, Lnc/v1;

    .line 89
    .line 90
    xor-int/2addr p0, v1

    .line 91
    if-eqz p0, :cond_4

    .line 92
    .line 93
    invoke-virtual {v0}, Lnc/c$b;->i()V

    .line 94
    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    invoke-virtual {v3, v0}, Lnc/l;->v(Ldc/l;)V

    .line 98
    .line 99
    .line 100
    :goto_3
    invoke-virtual {v3}, Lnc/l;->s()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    sget-object p1, Lvb/a;->a:Lvb/a;

    .line 105
    .line 106
    return-object p0
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public static final b(Ljava/util/List;Lub/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lnc/e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lnc/e;

    iget v1, v0, Lnc/e;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lnc/e;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lnc/e;

    invoke-direct {v0, p1}, Lnc/e;-><init>(Lub/e;)V

    :goto_0
    iget-object p1, v0, Lnc/e;->b:Ljava/lang/Object;

    sget-object v1, Lvb/a;->a:Lvb/a;

    iget v2, v0, Lnc/e;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lnc/e;->a:Ljava/util/Iterator;

    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnc/j1;

    iput-object p0, v0, Lnc/e;->a:Ljava/util/Iterator;

    iput v3, v0, Lnc/e;->c:I

    invoke-interface {p1, v0}, Lnc/j1;->join(Lub/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_4
    sget-object p0, Lrb/h;->a:Lrb/h;

    return-object p0
.end method

.method public static final c([Lnc/j1;Lub/e;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lnc/j1;",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lnc/d$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lnc/d$a;

    iget v1, v0, Lnc/d$a;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lnc/d$a;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lnc/d$a;

    invoke-direct {v0, p1}, Lnc/d$a;-><init>(Lub/e;)V

    :goto_0
    iget-object p1, v0, Lnc/d$a;->d:Ljava/lang/Object;

    sget-object v1, Lvb/a;->a:Lvb/a;

    iget v2, v0, Lnc/d$a;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p0, v0, Lnc/d$a;->c:I

    iget v2, v0, Lnc/d$a;->b:I

    iget-object v4, v0, Lnc/d$a;->a:[Ljava/lang/Object;

    check-cast v4, [Lnc/j1;

    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    move-object p1, v4

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    const/4 p1, 0x0

    array-length v2, p0

    move v5, p1

    move-object p1, p0

    move p0, v2

    move v2, v5

    :goto_1
    if-ge v2, p0, :cond_4

    aget-object v4, p1, v2

    iput-object p1, v0, Lnc/d$a;->a:[Ljava/lang/Object;

    iput v2, v0, Lnc/d$a;->b:I

    iput p0, v0, Lnc/d$a;->c:I

    iput v3, v0, Lnc/d$a;->e:I

    invoke-interface {v4, v0}, Lnc/j1;->join(Lub/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    add-int/2addr v2, v3

    goto :goto_1

    :cond_4
    sget-object p0, Lrb/h;->a:Lrb/h;

    return-object p0
.end method
