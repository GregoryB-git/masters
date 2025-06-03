.class public LW3/b;
.super LW3/d;
.source "SourceFile"


# direct methods
.method public constructor <init>(LW3/e;LV3/k;)V
    .locals 1

    .line 1
    sget-object v0, LW3/d$a;->r:LW3/d$a;

    .line 2
    .line 3
    invoke-direct {p0, v0, p1, p2}, LW3/d;-><init>(LW3/d$a;LW3/e;LV3/k;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LW3/e;->d()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    xor-int/lit8 p1, p1, 0x1

    .line 11
    .line 12
    const-string p2, "Can\'t have a listen complete from a user source"

    .line 13
    .line 14
    invoke-static {p1, p2}, LY3/m;->g(ZLjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public d(Ld4/b;)LW3/d;
    .locals 2

    .line 1
    iget-object p1, p0, LW3/d;->c:LV3/k;

    .line 2
    .line 3
    invoke-virtual {p1}, LV3/k;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    new-instance p1, LW3/b;

    .line 10
    .line 11
    iget-object v0, p0, LW3/d;->b:LW3/e;

    .line 12
    .line 13
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {p1, v0, v1}, LW3/b;-><init>(LW3/e;LV3/k;)V

    .line 18
    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    new-instance p1, LW3/b;

    .line 22
    .line 23
    iget-object v0, p0, LW3/d;->b:LW3/e;

    .line 24
    .line 25
    iget-object v1, p0, LW3/d;->c:LV3/k;

    .line 26
    .line 27
    invoke-virtual {v1}, LV3/k;->c0()LV3/k;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-direct {p1, v0, v1}, LW3/b;-><init>(LW3/e;LV3/k;)V

    .line 32
    .line 33
    .line 34
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, LW3/d;->a()LV3/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LW3/d;->b()LW3/e;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x2

    .line 10
    new-array v2, v2, [Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    aput-object v0, v2, v3

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    aput-object v1, v2, v0

    .line 17
    .line 18
    const-string v0, "ListenComplete { path=%s, source=%s }"

    .line 19
    .line 20
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method
