.class public LW3/a;
.super LW3/d;
.source "SourceFile"


# instance fields
.field public final d:Z

.field public final e:LY3/d;


# direct methods
.method public constructor <init>(LV3/k;LY3/d;Z)V
    .locals 2

    .line 1
    sget-object v0, LW3/d$a;->q:LW3/d$a;

    .line 2
    .line 3
    sget-object v1, LW3/e;->d:LW3/e;

    .line 4
    .line 5
    invoke-direct {p0, v0, v1, p1}, LW3/d;-><init>(LW3/d$a;LW3/e;LV3/k;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, LW3/a;->e:LY3/d;

    .line 9
    .line 10
    iput-boolean p3, p0, LW3/a;->d:Z

    .line 11
    .line 12
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
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LW3/d;->c:LV3/k;

    .line 10
    .line 11
    invoke-virtual {v0}, LV3/k;->Z()Ld4/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p1}, Ld4/b;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const-string v0, "operationForChild called for unrelated child."

    .line 20
    .line 21
    invoke-static {p1, v0}, LY3/m;->g(ZLjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    new-instance p1, LW3/a;

    .line 25
    .line 26
    iget-object v0, p0, LW3/d;->c:LV3/k;

    .line 27
    .line 28
    invoke-virtual {v0}, LV3/k;->c0()LV3/k;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v1, p0, LW3/a;->e:LY3/d;

    .line 33
    .line 34
    iget-boolean v2, p0, LW3/a;->d:Z

    .line 35
    .line 36
    invoke-direct {p1, v0, v1, v2}, LW3/a;-><init>(LV3/k;LY3/d;Z)V

    .line 37
    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_0
    iget-object v0, p0, LW3/a;->e:LY3/d;

    .line 41
    .line 42
    invoke-virtual {v0}, LY3/d;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    iget-object p1, p0, LW3/a;->e:LY3/d;

    .line 49
    .line 50
    invoke-virtual {p1}, LY3/d;->M()LS3/c;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, LS3/c;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    const-string v0, "affectedTree should not have overlapping affected paths."

    .line 59
    .line 60
    invoke-static {p1, v0}, LY3/m;->g(ZLjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_1
    iget-object v0, p0, LW3/a;->e:LY3/d;

    .line 65
    .line 66
    new-instance v1, LV3/k;

    .line 67
    .line 68
    const/4 v2, 0x1

    .line 69
    new-array v2, v2, [Ld4/b;

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    aput-object p1, v2, v3

    .line 73
    .line 74
    invoke-direct {v1, v2}, LV3/k;-><init>([Ld4/b;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, LY3/d;->Y(LV3/k;)LY3/d;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    new-instance v0, LW3/a;

    .line 82
    .line 83
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iget-boolean v2, p0, LW3/a;->d:Z

    .line 88
    .line 89
    invoke-direct {v0, v1, p1, v2}, LW3/a;-><init>(LV3/k;LY3/d;Z)V

    .line 90
    .line 91
    .line 92
    return-object v0
.end method

.method public e()LY3/d;
    .locals 1

    .line 1
    iget-object v0, p0, LW3/a;->e:LY3/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LW3/a;->d:Z

    .line 2
    .line 3
    return v0
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
    iget-boolean v1, p0, LW3/a;->d:Z

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, LW3/a;->e:LY3/d;

    .line 12
    .line 13
    const/4 v3, 0x3

    .line 14
    new-array v3, v3, [Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    aput-object v0, v3, v4

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    aput-object v1, v3, v0

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    aput-object v2, v3, v0

    .line 24
    .line 25
    const-string v0, "AckUserWrite { path=%s, revert=%s, affectedTree=%s }"

    .line 26
    .line 27
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method
