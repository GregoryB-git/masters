.class public LW3/f;
.super LW3/d;
.source "SourceFile"


# instance fields
.field public final d:Ld4/n;


# direct methods
.method public constructor <init>(LW3/e;LV3/k;Ld4/n;)V
    .locals 1

    .line 1
    sget-object v0, LW3/d$a;->o:LW3/d$a;

    .line 2
    .line 3
    invoke-direct {p0, v0, p1, p2}, LW3/d;-><init>(LW3/d$a;LW3/e;LV3/k;)V

    .line 4
    .line 5
    .line 6
    iput-object p3, p0, LW3/f;->d:Ld4/n;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public d(Ld4/b;)LW3/d;
    .locals 4

    .line 1
    iget-object v0, p0, LW3/d;->c:LV3/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LV3/k;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, LW3/f;

    .line 10
    .line 11
    iget-object v1, p0, LW3/d;->b:LW3/e;

    .line 12
    .line 13
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v3, p0, LW3/f;->d:Ld4/n;

    .line 18
    .line 19
    invoke-interface {v3, p1}, Ld4/n;->v(Ld4/b;)Ld4/n;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {v0, v1, v2, p1}, LW3/f;-><init>(LW3/e;LV3/k;Ld4/n;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_0
    new-instance p1, LW3/f;

    .line 28
    .line 29
    iget-object v0, p0, LW3/d;->b:LW3/e;

    .line 30
    .line 31
    iget-object v1, p0, LW3/d;->c:LV3/k;

    .line 32
    .line 33
    invoke-virtual {v1}, LV3/k;->c0()LV3/k;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v2, p0, LW3/f;->d:Ld4/n;

    .line 38
    .line 39
    invoke-direct {p1, v0, v1, v2}, LW3/f;-><init>(LW3/e;LV3/k;Ld4/n;)V

    .line 40
    .line 41
    .line 42
    return-object p1
.end method

.method public e()Ld4/n;
    .locals 1

    .line 1
    iget-object v0, p0, LW3/f;->d:Ld4/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

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
    iget-object v2, p0, LW3/f;->d:Ld4/n;

    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    new-array v3, v3, [Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    aput-object v0, v3, v4

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    aput-object v1, v3, v0

    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    aput-object v2, v3, v0

    .line 22
    .line 23
    const-string v0, "Overwrite { path=%s, source=%s, snapshot=%s }"

    .line 24
    .line 25
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method
