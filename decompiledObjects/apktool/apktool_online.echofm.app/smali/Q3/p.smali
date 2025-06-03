.class public LQ3/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LV3/m;

.field public final b:LV3/k;

.field public final c:La4/h;

.field public final d:Z


# direct methods
.method public constructor <init>(LV3/m;LV3/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ3/p;->a:LV3/m;

    iput-object p2, p0, LQ3/p;->b:LV3/k;

    sget-object p1, La4/h;->i:La4/h;

    iput-object p1, p0, LQ3/p;->c:La4/h;

    const/4 p1, 0x0

    iput-boolean p1, p0, LQ3/p;->d:Z

    return-void
.end method

.method public constructor <init>(LV3/m;LV3/k;La4/h;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ3/p;->a:LV3/m;

    iput-object p2, p0, LQ3/p;->b:LV3/k;

    iput-object p3, p0, LQ3/p;->c:La4/h;

    iput-boolean p4, p0, LQ3/p;->d:Z

    invoke-virtual {p3}, La4/h;->q()Z

    move-result p1

    const-string p2, "Validation of queries failed."

    invoke-static {p1, p2}, LY3/m;->g(ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public A()LQ3/p;
    .locals 5

    .line 1
    invoke-virtual {p0}, LQ3/p;->U()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LQ3/p;->c:La4/h;

    .line 5
    .line 6
    invoke-static {}, Ld4/q;->j()Ld4/q;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, La4/h;->w(Ld4/h;)La4/h;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, v0}, LQ3/p;->V(La4/h;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, LQ3/p;

    .line 18
    .line 19
    iget-object v2, p0, LQ3/p;->a:LV3/m;

    .line 20
    .line 21
    iget-object v3, p0, LQ3/p;->b:LV3/k;

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    invoke-direct {v1, v2, v3, v0, v4}, LQ3/p;-><init>(LV3/m;LV3/k;La4/h;Z)V

    .line 25
    .line 26
    .line 27
    return-object v1
.end method

.method public B()LQ3/p;
    .locals 5

    .line 1
    invoke-virtual {p0}, LQ3/p;->U()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LQ3/p;

    .line 5
    .line 6
    iget-object v1, p0, LQ3/p;->a:LV3/m;

    .line 7
    .line 8
    iget-object v2, p0, LQ3/p;->b:LV3/k;

    .line 9
    .line 10
    iget-object v3, p0, LQ3/p;->c:La4/h;

    .line 11
    .line 12
    invoke-static {}, Ld4/u;->j()Ld4/u;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-virtual {v3, v4}, La4/h;->w(Ld4/h;)La4/h;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    const/4 v4, 0x1

    .line 21
    invoke-direct {v0, v1, v2, v3, v4}, LQ3/p;-><init>(LV3/m;LV3/k;La4/h;Z)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public C(LQ3/a;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, LV3/a;

    .line 4
    .line 5
    iget-object v1, p0, LQ3/p;->a:LV3/m;

    .line 6
    .line 7
    invoke-virtual {p0}, LQ3/p;->u()La4/i;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v0, v1, p1, v2}, LV3/a;-><init>(LV3/m;LQ3/a;La4/i;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, LQ3/p;->E(LV3/h;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 19
    .line 20
    const-string v0, "listener must not be null"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
.end method

.method public D(LQ3/s;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, LV3/D;

    .line 4
    .line 5
    iget-object v1, p0, LQ3/p;->a:LV3/m;

    .line 6
    .line 7
    invoke-virtual {p0}, LQ3/p;->u()La4/i;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v0, v1, p1, v2}, LV3/D;-><init>(LV3/m;LQ3/s;La4/i;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, LQ3/p;->E(LV3/h;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 19
    .line 20
    const-string v0, "listener must not be null"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
.end method

.method public final E(LV3/h;)V
    .locals 2

    .line 1
    invoke-static {}, LV3/H;->b()LV3/H;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LV3/H;->e(LV3/h;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LQ3/p;->a:LV3/m;

    .line 9
    .line 10
    new-instance v1, LQ3/p$a;

    .line 11
    .line 12
    invoke-direct {v1, p0, p1}, LQ3/p$a;-><init>(LQ3/p;LV3/h;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, LV3/m;->i0(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public F(D)LQ3/p;
    .locals 1

    .line 1
    invoke-static {}, Ld4/b;->m()Ld4/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ld4/b;->e()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, p1, p2, v0}, LQ3/p;->N(DLjava/lang/String;)LQ3/p;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public G(DLjava/lang/String;)LQ3/p;
    .locals 1

    .line 1
    new-instance v0, Ld4/f;

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Ld4/r;->a()Ld4/n;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-direct {v0, p1, p2}, Ld4/f;-><init>(Ljava/lang/Double;Ld4/n;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, p3}, LQ3/p;->H(Ld4/n;Ljava/lang/String;)LQ3/p;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public final H(Ld4/n;Ljava/lang/String;)LQ3/p;
    .locals 0

    .line 1
    invoke-static {p2}, LY3/j;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0, p1, p2}, LQ3/p;->O(Ld4/n;Ljava/lang/String;)LQ3/p;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public I(Ljava/lang/String;)LQ3/p;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, LQ3/p;->c:La4/h;

    .line 4
    .line 5
    invoke-virtual {v0}, La4/h;->d()Ld4/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Ld4/j;->j()Ld4/j;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, LY3/j;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, LQ3/p;->P(Ljava/lang/String;)LQ3/p;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_0
    invoke-static {}, Ld4/b;->m()Ld4/b;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ld4/b;->e()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p0, p1, v0}, LQ3/p;->Q(Ljava/lang/String;Ljava/lang/String;)LQ3/p;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1
.end method

.method public J(Ljava/lang/String;Ljava/lang/String;)LQ3/p;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, LQ3/p;->c:La4/h;

    .line 4
    .line 5
    invoke-virtual {v0}, La4/h;->d()Ld4/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Ld4/j;->j()Ld4/j;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, LY3/j;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :cond_0
    if-eqz p1, :cond_1

    .line 24
    .line 25
    new-instance v0, Ld4/t;

    .line 26
    .line 27
    invoke-static {}, Ld4/r;->a()Ld4/n;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-direct {v0, p1, v1}, Ld4/t;-><init>(Ljava/lang/String;Ld4/n;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-static {}, Ld4/g;->W()Ld4/g;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_0
    invoke-virtual {p0, v0, p2}, LQ3/p;->H(Ld4/n;Ljava/lang/String;)LQ3/p;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1
.end method

.method public K(Z)LQ3/p;
    .locals 1

    .line 1
    invoke-static {}, Ld4/b;->m()Ld4/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ld4/b;->e()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, p1, v0}, LQ3/p;->S(ZLjava/lang/String;)LQ3/p;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public L(ZLjava/lang/String;)LQ3/p;
    .locals 2

    .line 1
    new-instance v0, Ld4/a;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Ld4/r;->a()Ld4/n;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, p1, v1}, Ld4/a;-><init>(Ljava/lang/Boolean;Ld4/n;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, p2}, LQ3/p;->H(Ld4/n;Ljava/lang/String;)LQ3/p;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public M(D)LQ3/p;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, LQ3/p;->N(DLjava/lang/String;)LQ3/p;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public N(DLjava/lang/String;)LQ3/p;
    .locals 1

    .line 1
    new-instance v0, Ld4/f;

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Ld4/r;->a()Ld4/n;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-direct {v0, p1, p2}, Ld4/f;-><init>(Ljava/lang/Double;Ld4/n;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, p3}, LQ3/p;->O(Ld4/n;Ljava/lang/String;)LQ3/p;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public final O(Ld4/n;Ljava/lang/String;)LQ3/p;
    .locals 3

    .line 1
    invoke-static {p2}, LY3/n;->g(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ld4/n;->B()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    invoke-interface {p1}, Ld4/n;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 18
    .line 19
    const-string p2, "Can only use simple values for startAt() and startAfter()"

    .line 20
    .line 21
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    :goto_0
    iget-object v0, p0, LQ3/p;->c:La4/h;

    .line 26
    .line 27
    invoke-virtual {v0}, La4/h;->o()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_5

    .line 32
    .line 33
    if-eqz p2, :cond_4

    .line 34
    .line 35
    const-string v0, "[MIN_NAME]"

    .line 36
    .line 37
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-static {}, Ld4/b;->n()Ld4/b;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    const-string v0, "[MAX_KEY]"

    .line 49
    .line 50
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-static {}, Ld4/b;->m()Ld4/b;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {p2}, Ld4/b;->j(Ljava/lang/String;)Ld4/b;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    goto :goto_1

    .line 66
    :cond_4
    const/4 p2, 0x0

    .line 67
    :goto_1
    iget-object v0, p0, LQ3/p;->c:La4/h;

    .line 68
    .line 69
    invoke-virtual {v0, p1, p2}, La4/h;->x(Ld4/n;Ld4/b;)La4/h;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p0, p1}, LQ3/p;->T(La4/h;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p1}, LQ3/p;->V(La4/h;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, La4/h;->q()Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    invoke-static {p2}, LY3/m;->f(Z)V

    .line 84
    .line 85
    .line 86
    new-instance p2, LQ3/p;

    .line 87
    .line 88
    iget-object v0, p0, LQ3/p;->a:LV3/m;

    .line 89
    .line 90
    iget-object v1, p0, LQ3/p;->b:LV3/k;

    .line 91
    .line 92
    iget-boolean v2, p0, LQ3/p;->d:Z

    .line 93
    .line 94
    invoke-direct {p2, v0, v1, p1, v2}, LQ3/p;-><init>(LV3/m;LV3/k;La4/h;Z)V

    .line 95
    .line 96
    .line 97
    return-object p2

    .line 98
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 99
    .line 100
    const-string p2, "Can\'t call startAt(), startAfte(), or equalTo() multiple times"

    .line 101
    .line 102
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p1
.end method

.method public P(Ljava/lang/String;)LQ3/p;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, LQ3/p;->Q(Ljava/lang/String;Ljava/lang/String;)LQ3/p;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public Q(Ljava/lang/String;Ljava/lang/String;)LQ3/p;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Ld4/t;

    .line 4
    .line 5
    invoke-static {}, Ld4/r;->a()Ld4/n;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, p1, v1}, Ld4/t;-><init>(Ljava/lang/String;Ld4/n;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, Ld4/g;->W()Ld4/g;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :goto_0
    invoke-virtual {p0, v0, p2}, LQ3/p;->O(Ld4/n;Ljava/lang/String;)LQ3/p;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public R(Z)LQ3/p;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, LQ3/p;->S(ZLjava/lang/String;)LQ3/p;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public S(ZLjava/lang/String;)LQ3/p;
    .locals 2

    .line 1
    new-instance v0, Ld4/a;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Ld4/r;->a()Ld4/n;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, p1, v1}, Ld4/a;-><init>(Ljava/lang/Boolean;Ld4/n;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, p2}, LQ3/p;->O(Ld4/n;Ljava/lang/String;)LQ3/p;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public final T(La4/h;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, La4/h;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, La4/h;->m()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, La4/h;->n()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, La4/h;->l()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    const-string v0, "Can\'t combine startAt(), startAfter(), endAt(), endBefore(), and limit(). Use limitToFirst() or limitToLast() instead"

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    :goto_0
    return-void
.end method

.method public final U()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LQ3/p;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 7
    .line 8
    const-string v1, "You can\'t combine multiple orderBy calls!"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final V(La4/h;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, La4/h;->d()Ld4/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Ld4/j;->j()Ld4/j;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    invoke-virtual {p1}, La4/h;->o()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const-string v1, "You must use startAt(String value), startAfter(String value), endAt(String value), endBefore(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported"

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, La4/h;->h()Ld4/n;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1}, La4/h;->g()Ld4/b;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {}, Ld4/b;->n()Ld4/b;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v2, v3}, LA2/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    instance-of v0, v0, Ld4/t;

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 47
    .line 48
    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_1
    :goto_0
    invoke-virtual {p1}, La4/h;->m()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_6

    .line 57
    .line 58
    invoke-virtual {p1}, La4/h;->f()Ld4/n;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p1}, La4/h;->e()Ld4/b;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {}, Ld4/b;->m()Ld4/b;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {p1, v2}, Ld4/b;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_2

    .line 75
    .line 76
    instance-of p1, v0, Ld4/t;

    .line 77
    .line 78
    if-eqz p1, :cond_2

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 82
    .line 83
    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_3
    invoke-virtual {p1}, La4/h;->d()Ld4/h;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {}, Ld4/q;->j()Ld4/q;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_6

    .line 100
    .line 101
    invoke-virtual {p1}, La4/h;->o()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_4

    .line 106
    .line 107
    invoke-virtual {p1}, La4/h;->h()Ld4/n;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v0}, Ld4/r;->b(Ld4/n;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_5

    .line 116
    .line 117
    :cond_4
    invoke-virtual {p1}, La4/h;->m()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_6

    .line 122
    .line 123
    invoke-virtual {p1}, La4/h;->f()Ld4/n;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {p1}, Ld4/r;->b(Ld4/n;)Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-eqz p1, :cond_5

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 135
    .line 136
    const-string v0, "When using orderByPriority(), values provided to startAt(), startAfter(), endAt(), endBefore(), or equalTo() must be valid priorities."

    .line 137
    .line 138
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw p1

    .line 142
    :cond_6
    :goto_1
    return-void
.end method

.method public a(LQ3/a;)LQ3/a;
    .locals 3

    .line 1
    new-instance v0, LV3/a;

    .line 2
    .line 3
    iget-object v1, p0, LQ3/p;->a:LV3/m;

    .line 4
    .line 5
    invoke-virtual {p0}, LQ3/p;->u()La4/i;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v0, v1, p1, v2}, LV3/a;-><init>(LV3/m;LQ3/a;La4/i;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, LQ3/p;->b(LV3/h;)V

    .line 13
    .line 14
    .line 15
    return-object p1
.end method

.method public final b(LV3/h;)V
    .locals 2

    .line 1
    invoke-static {}, LV3/H;->b()LV3/H;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LV3/H;->c(LV3/h;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LQ3/p;->a:LV3/m;

    .line 9
    .line 10
    new-instance v1, LQ3/p$b;

    .line 11
    .line 12
    invoke-direct {v1, p0, p1}, LQ3/p$b;-><init>(LQ3/p;LV3/h;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, LV3/m;->i0(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public c(LQ3/s;)LQ3/s;
    .locals 3

    .line 1
    new-instance v0, LV3/D;

    .line 2
    .line 3
    iget-object v1, p0, LQ3/p;->a:LV3/m;

    .line 4
    .line 5
    invoke-virtual {p0}, LQ3/p;->u()La4/i;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v0, v1, p1, v2}, LV3/D;-><init>(LV3/m;LQ3/s;La4/i;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, LQ3/p;->b(LV3/h;)V

    .line 13
    .line 14
    .line 15
    return-object p1
.end method

.method public d(D)LQ3/p;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, LQ3/p;->e(DLjava/lang/String;)LQ3/p;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public e(DLjava/lang/String;)LQ3/p;
    .locals 1

    .line 1
    new-instance v0, Ld4/f;

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Ld4/r;->a()Ld4/n;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-direct {v0, p1, p2}, Ld4/f;-><init>(Ljava/lang/Double;Ld4/n;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, p3}, LQ3/p;->f(Ld4/n;Ljava/lang/String;)LQ3/p;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public final f(Ld4/n;Ljava/lang/String;)LQ3/p;
    .locals 3

    .line 1
    invoke-static {p2}, LY3/n;->g(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ld4/n;->B()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    invoke-interface {p1}, Ld4/n;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 18
    .line 19
    const-string p2, "Can only use simple values for endAt()"

    .line 20
    .line 21
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    .line 26
    .line 27
    invoke-static {p2}, Ld4/b;->j(Ljava/lang/String;)Ld4/b;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    const/4 p2, 0x0

    .line 33
    :goto_1
    iget-object v0, p0, LQ3/p;->c:La4/h;

    .line 34
    .line 35
    invoke-virtual {v0}, La4/h;->m()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_3

    .line 40
    .line 41
    iget-object v0, p0, LQ3/p;->c:La4/h;

    .line 42
    .line 43
    invoke-virtual {v0, p1, p2}, La4/h;->b(Ld4/n;Ld4/b;)La4/h;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0, p1}, LQ3/p;->T(La4/h;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1}, LQ3/p;->V(La4/h;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, La4/h;->q()Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    invoke-static {p2}, LY3/m;->f(Z)V

    .line 58
    .line 59
    .line 60
    new-instance p2, LQ3/p;

    .line 61
    .line 62
    iget-object v0, p0, LQ3/p;->a:LV3/m;

    .line 63
    .line 64
    iget-object v1, p0, LQ3/p;->b:LV3/k;

    .line 65
    .line 66
    iget-boolean v2, p0, LQ3/p;->d:Z

    .line 67
    .line 68
    invoke-direct {p2, v0, v1, p1, v2}, LQ3/p;-><init>(LV3/m;LV3/k;La4/h;Z)V

    .line 69
    .line 70
    .line 71
    return-object p2

    .line 72
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 73
    .line 74
    const-string p2, "Can\'t call endAt() or equalTo() multiple times"

    .line 75
    .line 76
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1
.end method

.method public g(Ljava/lang/String;)LQ3/p;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, LQ3/p;->h(Ljava/lang/String;Ljava/lang/String;)LQ3/p;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public h(Ljava/lang/String;Ljava/lang/String;)LQ3/p;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Ld4/t;

    .line 4
    .line 5
    invoke-static {}, Ld4/r;->a()Ld4/n;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, p1, v1}, Ld4/t;-><init>(Ljava/lang/String;Ld4/n;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, Ld4/g;->W()Ld4/g;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :goto_0
    invoke-virtual {p0, v0, p2}, LQ3/p;->f(Ld4/n;Ljava/lang/String;)LQ3/p;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public i(Z)LQ3/p;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, LQ3/p;->j(ZLjava/lang/String;)LQ3/p;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public j(ZLjava/lang/String;)LQ3/p;
    .locals 2

    .line 1
    new-instance v0, Ld4/a;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Ld4/r;->a()Ld4/n;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, p1, v1}, Ld4/a;-><init>(Ljava/lang/Boolean;Ld4/n;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, p2}, LQ3/p;->f(Ld4/n;Ljava/lang/String;)LQ3/p;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public k(D)LQ3/p;
    .locals 1

    .line 1
    invoke-static {}, Ld4/b;->n()Ld4/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ld4/b;->e()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, p1, p2, v0}, LQ3/p;->e(DLjava/lang/String;)LQ3/p;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public l(DLjava/lang/String;)LQ3/p;
    .locals 1

    .line 1
    new-instance v0, Ld4/f;

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Ld4/r;->a()Ld4/n;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-direct {v0, p1, p2}, Ld4/f;-><init>(Ljava/lang/Double;Ld4/n;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, p3}, LQ3/p;->m(Ld4/n;Ljava/lang/String;)LQ3/p;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public final m(Ld4/n;Ljava/lang/String;)LQ3/p;
    .locals 0

    .line 1
    invoke-static {p2}, LY3/j;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0, p1, p2}, LQ3/p;->f(Ld4/n;Ljava/lang/String;)LQ3/p;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public n(Ljava/lang/String;)LQ3/p;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, LQ3/p;->c:La4/h;

    .line 4
    .line 5
    invoke-virtual {v0}, La4/h;->d()Ld4/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Ld4/j;->j()Ld4/j;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, LY3/j;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, LQ3/p;->g(Ljava/lang/String;)LQ3/p;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_0
    invoke-static {}, Ld4/b;->n()Ld4/b;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ld4/b;->e()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p0, p1, v0}, LQ3/p;->h(Ljava/lang/String;Ljava/lang/String;)LQ3/p;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1
.end method

.method public o(Ljava/lang/String;Ljava/lang/String;)LQ3/p;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, LQ3/p;->c:La4/h;

    .line 4
    .line 5
    invoke-virtual {v0}, La4/h;->d()Ld4/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Ld4/j;->j()Ld4/j;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, LY3/j;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :cond_0
    if-eqz p1, :cond_1

    .line 24
    .line 25
    new-instance v0, Ld4/t;

    .line 26
    .line 27
    invoke-static {}, Ld4/r;->a()Ld4/n;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-direct {v0, p1, v1}, Ld4/t;-><init>(Ljava/lang/String;Ld4/n;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-static {}, Ld4/g;->W()Ld4/g;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_0
    invoke-virtual {p0, v0, p2}, LQ3/p;->m(Ld4/n;Ljava/lang/String;)LQ3/p;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1
.end method

.method public p(Z)LQ3/p;
    .locals 1

    .line 1
    invoke-static {}, Ld4/b;->n()Ld4/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ld4/b;->e()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, p1, v0}, LQ3/p;->j(ZLjava/lang/String;)LQ3/p;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public q(ZLjava/lang/String;)LQ3/p;
    .locals 2

    .line 1
    new-instance v0, Ld4/a;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Ld4/r;->a()Ld4/n;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, p1, v1}, Ld4/a;-><init>(Ljava/lang/Boolean;Ld4/n;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, p2}, LQ3/p;->m(Ld4/n;Ljava/lang/String;)LQ3/p;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public r()LV2/j;
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/p;->a:LV3/m;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LV3/m;->O(LQ3/p;)LV2/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public s()LV3/k;
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/p;->b:LV3/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public t()LQ3/e;
    .locals 3

    .line 1
    new-instance v0, LQ3/e;

    .line 2
    .line 3
    iget-object v1, p0, LQ3/p;->a:LV3/m;

    .line 4
    .line 5
    invoke-virtual {p0}, LQ3/p;->s()LV3/k;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v0, v1, v2}, LQ3/e;-><init>(LV3/m;LV3/k;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public u()La4/i;
    .locals 3

    .line 1
    new-instance v0, La4/i;

    .line 2
    .line 3
    iget-object v1, p0, LQ3/p;->b:LV3/k;

    .line 4
    .line 5
    iget-object v2, p0, LQ3/p;->c:La4/h;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, La4/i;-><init>(LV3/k;La4/h;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public v(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LQ3/p;->b:LV3/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LV3/k;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, LQ3/p;->b:LV3/k;

    .line 10
    .line 11
    invoke-virtual {v0}, LV3/k;->Z()Ld4/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {}, Ld4/b;->l()Ld4/b;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ld4/b;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p1, LQ3/d;

    .line 27
    .line 28
    const-string v0, "Can\'t call keepSynced() on .info paths."

    .line 29
    .line 30
    invoke-direct {p1, v0}, LQ3/d;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    :goto_0
    iget-object v0, p0, LQ3/p;->a:LV3/m;

    .line 35
    .line 36
    new-instance v1, LQ3/p$c;

    .line 37
    .line 38
    invoke-direct {v1, p0, p1}, LQ3/p$c;-><init>(LQ3/p;Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, LV3/m;->i0(Ljava/lang/Runnable;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public w(I)LQ3/p;
    .locals 4

    .line 1
    if-lez p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, LQ3/p;->c:La4/h;

    .line 4
    .line 5
    invoke-virtual {v0}, La4/h;->n()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, LQ3/p;

    .line 12
    .line 13
    iget-object v1, p0, LQ3/p;->a:LV3/m;

    .line 14
    .line 15
    iget-object v2, p0, LQ3/p;->b:LV3/k;

    .line 16
    .line 17
    iget-object v3, p0, LQ3/p;->c:La4/h;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, La4/h;->s(I)La4/h;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-boolean v3, p0, LQ3/p;->d:Z

    .line 24
    .line 25
    invoke-direct {v0, v1, v2, p1, v3}, LQ3/p;-><init>(LV3/m;LV3/k;La4/h;Z)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    const-string v0, "Can\'t call limitToLast on query with previously set limit!"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 38
    .line 39
    const-string v0, "Limit must be a positive integer!"

    .line 40
    .line 41
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1
.end method

.method public x(I)LQ3/p;
    .locals 4

    .line 1
    if-lez p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, LQ3/p;->c:La4/h;

    .line 4
    .line 5
    invoke-virtual {v0}, La4/h;->n()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, LQ3/p;

    .line 12
    .line 13
    iget-object v1, p0, LQ3/p;->a:LV3/m;

    .line 14
    .line 15
    iget-object v2, p0, LQ3/p;->b:LV3/k;

    .line 16
    .line 17
    iget-object v3, p0, LQ3/p;->c:La4/h;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, La4/h;->t(I)La4/h;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-boolean v3, p0, LQ3/p;->d:Z

    .line 24
    .line 25
    invoke-direct {v0, v1, v2, p1, v3}, LQ3/p;-><init>(LV3/m;LV3/k;La4/h;Z)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    const-string v0, "Can\'t call limitToLast on query with previously set limit!"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 38
    .line 39
    const-string v0, "Limit must be a positive integer!"

    .line 40
    .line 41
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1
.end method

.method public y(Ljava/lang/String;)LQ3/p;
    .locals 4

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    const-string v0, "$key"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v1, "Can\'t use \'"

    .line 10
    .line 11
    if-nez v0, :cond_3

    .line 12
    .line 13
    const-string v0, ".key"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_3

    .line 20
    .line 21
    const-string v0, "$priority"

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const-string v0, ".priority"

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    const-string v0, "$value"

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    const-string v0, ".value"

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    invoke-static {p1}, LY3/n;->h(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, LQ3/p;->U()V

    .line 57
    .line 58
    .line 59
    new-instance v0, LV3/k;

    .line 60
    .line 61
    invoke-direct {v0, p1}, LV3/k;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, LV3/k;->size()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_0

    .line 69
    .line 70
    new-instance p1, Ld4/p;

    .line 71
    .line 72
    invoke-direct {p1, v0}, Ld4/p;-><init>(LV3/k;)V

    .line 73
    .line 74
    .line 75
    new-instance v0, LQ3/p;

    .line 76
    .line 77
    iget-object v1, p0, LQ3/p;->a:LV3/m;

    .line 78
    .line 79
    iget-object v2, p0, LQ3/p;->b:LV3/k;

    .line 80
    .line 81
    iget-object v3, p0, LQ3/p;->c:La4/h;

    .line 82
    .line 83
    invoke-virtual {v3, p1}, La4/h;->w(Ld4/h;)La4/h;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const/4 v3, 0x1

    .line 88
    invoke-direct {v0, v1, v2, p1, v3}, LQ3/p;-><init>(LV3/m;LV3/k;La4/h;Z)V

    .line 89
    .line 90
    .line 91
    return-object v0

    .line 92
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 93
    .line 94
    const-string v0, "Can\'t use empty path, use orderByValue() instead!"

    .line 95
    .line 96
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p1

    .line 100
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 101
    .line 102
    new-instance v2, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string p1, "\' as path, please use orderByValue() instead!"

    .line 114
    .line 115
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v0

    .line 126
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 127
    .line 128
    new-instance v2, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string p1, "\' as path, please use orderByPriority() instead!"

    .line 140
    .line 141
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw v0

    .line 152
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 153
    .line 154
    new-instance v2, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const-string p1, "\' as path, please use orderByKey() instead!"

    .line 166
    .line 167
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v0

    .line 178
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 179
    .line 180
    const-string v0, "Key can\'t be null"

    .line 181
    .line 182
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw p1
.end method

.method public z()LQ3/p;
    .locals 5

    .line 1
    invoke-virtual {p0}, LQ3/p;->U()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LQ3/p;->c:La4/h;

    .line 5
    .line 6
    invoke-static {}, Ld4/j;->j()Ld4/j;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, La4/h;->w(Ld4/h;)La4/h;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, v0}, LQ3/p;->V(La4/h;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, LQ3/p;

    .line 18
    .line 19
    iget-object v2, p0, LQ3/p;->a:LV3/m;

    .line 20
    .line 21
    iget-object v3, p0, LQ3/p;->b:LV3/k;

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    invoke-direct {v1, v2, v3, v0, v4}, LQ3/p;-><init>(LV3/m;LV3/k;La4/h;Z)V

    .line 25
    .line 26
    .line 27
    return-object v1
.end method
