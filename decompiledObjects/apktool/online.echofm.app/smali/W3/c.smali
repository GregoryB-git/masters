.class public LW3/c;
.super LW3/d;
.source "SourceFile"


# instance fields
.field public final d:LV3/b;


# direct methods
.method public constructor <init>(LW3/e;LV3/k;LV3/b;)V
    .locals 1

    .line 1
    sget-object v0, LW3/d$a;->p:LW3/d$a;

    .line 2
    .line 3
    invoke-direct {p0, v0, p1, p2}, LW3/d;-><init>(LW3/d$a;LW3/e;LV3/k;)V

    .line 4
    .line 5
    .line 6
    iput-object p3, p0, LW3/c;->d:LV3/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public d(Ld4/b;)LW3/d;
    .locals 5

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
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-object v0, p0, LW3/c;->d:LV3/b;

    .line 11
    .line 12
    new-instance v2, LV3/k;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    new-array v3, v3, [Ld4/b;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    aput-object p1, v3, v4

    .line 19
    .line 20
    invoke-direct {v2, v3}, LV3/k;-><init>([Ld4/b;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v2}, LV3/b;->k(LV3/k;)LV3/b;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, LV3/b;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    return-object v1

    .line 34
    :cond_0
    invoke-virtual {p1}, LV3/b;->X()Ld4/n;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    new-instance v0, LW3/f;

    .line 41
    .line 42
    iget-object v1, p0, LW3/d;->b:LW3/e;

    .line 43
    .line 44
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {p1}, LV3/b;->X()Ld4/n;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {v0, v1, v2, p1}, LW3/f;-><init>(LW3/e;LV3/k;Ld4/n;)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_1
    new-instance v0, LW3/c;

    .line 57
    .line 58
    iget-object v1, p0, LW3/d;->b:LW3/e;

    .line 59
    .line 60
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-direct {v0, v1, v2, p1}, LW3/c;-><init>(LW3/e;LV3/k;LV3/b;)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_2
    iget-object v0, p0, LW3/d;->c:LV3/k;

    .line 69
    .line 70
    invoke-virtual {v0}, LV3/k;->Z()Ld4/b;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0, p1}, Ld4/b;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    new-instance p1, LW3/c;

    .line 81
    .line 82
    iget-object v0, p0, LW3/d;->b:LW3/e;

    .line 83
    .line 84
    iget-object v1, p0, LW3/d;->c:LV3/k;

    .line 85
    .line 86
    invoke-virtual {v1}, LV3/k;->c0()LV3/k;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    iget-object v2, p0, LW3/c;->d:LV3/b;

    .line 91
    .line 92
    invoke-direct {p1, v0, v1, v2}, LW3/c;-><init>(LW3/e;LV3/k;LV3/b;)V

    .line 93
    .line 94
    .line 95
    return-object p1

    .line 96
    :cond_3
    return-object v1
.end method

.method public e()LV3/b;
    .locals 1

    .line 1
    iget-object v0, p0, LW3/c;->d:LV3/b;

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
    iget-object v2, p0, LW3/c;->d:LV3/b;

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
    const-string v0, "Merge { path=%s, source=%s, children=%s }"

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
