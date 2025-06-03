.class public final LR2/l5;
.super LR2/f1;
.source "SourceFile"


# instance fields
.field public c:Landroid/os/Handler;

.field public d:Z

.field public final e:LR2/t5;

.field public final f:LR2/r5;

.field public final g:LR2/q5;


# direct methods
.method public constructor <init>(LR2/N2;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LR2/f1;-><init>(LR2/N2;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, LR2/l5;->d:Z

    .line 6
    .line 7
    new-instance p1, LR2/t5;

    .line 8
    .line 9
    invoke-direct {p1, p0}, LR2/t5;-><init>(LR2/l5;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, LR2/l5;->e:LR2/t5;

    .line 13
    .line 14
    new-instance p1, LR2/r5;

    .line 15
    .line 16
    invoke-direct {p1, p0}, LR2/r5;-><init>(LR2/l5;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LR2/l5;->f:LR2/r5;

    .line 20
    .line 21
    new-instance p1, LR2/q5;

    .line 22
    .line 23
    invoke-direct {p1, p0}, LR2/q5;-><init>(LR2/l5;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, LR2/l5;->g:LR2/q5;

    .line 27
    .line 28
    return-void
.end method

.method public static bridge synthetic B(LR2/l5;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, LR2/l5;->c:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic C(LR2/l5;J)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LR2/l5;->G()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "Activity paused, time"

    .line 20
    .line 21
    invoke-virtual {v0, v2, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, LR2/l5;->g:LR2/q5;

    .line 25
    .line 26
    invoke-virtual {v0, p1, p2}, LR2/q5;->b(J)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, LR2/g;->Q()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    iget-object p0, p0, LR2/l5;->f:LR2/r5;

    .line 40
    .line 41
    invoke-virtual {p0, p1, p2}, LR2/r5;->e(J)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method

.method private final G()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LR2/l5;->c:Landroid/os/Handler;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lcom/google/android/gms/internal/measurement/t0;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/t0;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, LR2/l5;->c:Landroid/os/Handler;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public static synthetic H(LR2/l5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LR2/l5;->G()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic I(LR2/l5;J)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LR2/l5;->G()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "Activity resumed, time"

    .line 20
    .line 21
    invoke-virtual {v0, v2, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, LR2/K;->Q0:LR2/P1;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, LR2/g;->s(LR2/P1;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, LR2/g;->Q()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    iget-boolean v0, p0, LR2/l5;->d:Z

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    :cond_0
    :goto_0
    iget-object v0, p0, LR2/l5;->f:LR2/r5;

    .line 51
    .line 52
    invoke-virtual {v0, p1, p2}, LR2/r5;->f(J)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, LR2/g;->Q()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_0

    .line 65
    .line 66
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v0, v0, LR2/l2;->s:LR2/o2;

    .line 71
    .line 72
    invoke-virtual {v0}, LR2/o2;->b()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    :goto_1
    iget-object p1, p0, LR2/l5;->g:LR2/q5;

    .line 80
    .line 81
    invoke-virtual {p1}, LR2/q5;->a()V

    .line 82
    .line 83
    .line 84
    iget-object p0, p0, LR2/l5;->e:LR2/t5;

    .line 85
    .line 86
    iget-object p1, p0, LR2/t5;->a:LR2/l5;

    .line 87
    .line 88
    invoke-virtual {p1}, LR2/m3;->n()V

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, LR2/t5;->a:LR2/l5;

    .line 92
    .line 93
    iget-object p1, p1, LR2/m3;->a:LR2/N2;

    .line 94
    .line 95
    invoke-virtual {p1}, LR2/N2;->p()Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_3

    .line 100
    .line 101
    iget-object p1, p0, LR2/t5;->a:LR2/l5;

    .line 102
    .line 103
    invoke-virtual {p1}, LR2/m3;->b()LE2/e;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-interface {p1}, LE2/e;->a()J

    .line 108
    .line 109
    .line 110
    move-result-wide p1

    .line 111
    const/4 v0, 0x0

    .line 112
    invoke-virtual {p0, p1, p2, v0}, LR2/t5;->b(JZ)V

    .line 113
    .line 114
    .line 115
    :cond_3
    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final D(Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, LR2/l5;->d:Z

    .line 5
    .line 6
    return-void
.end method

.method public final E(ZZJ)Z
    .locals 1

    .line 1
    iget-object v0, p0, LR2/l5;->f:LR2/r5;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, LR2/r5;->d(ZZJ)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final F()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, LR2/l5;->d:Z

    .line 5
    .line 6
    return v0
.end method

.method public final bridge synthetic a()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic b()LE2/e;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->b()LE2/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic d()LR2/f;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->d()LR2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic e()LR2/G2;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic f()LR2/g;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->f()LR2/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic g()LR2/C;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->g()LR2/C;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic h()LR2/X1;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->h()LR2/X1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic i()LR2/l2;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->i()LR2/l2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic j()LR2/Y1;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->j()LR2/Y1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic k()LR2/S5;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->k()LR2/S5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic l()V
    .locals 0

    .line 1
    invoke-super {p0}, LR2/G1;->l()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final bridge synthetic m()V
    .locals 0

    .line 1
    invoke-super {p0}, LR2/G1;->m()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final bridge synthetic n()V
    .locals 0

    .line 1
    invoke-super {p0}, LR2/G1;->n()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final bridge synthetic o()LR2/B;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->o()LR2/B;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic p()LR2/S1;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->p()LR2/S1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic q()LR2/V1;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->q()LR2/V1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic r()LR2/C3;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->r()LR2/C3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic s()LR2/v4;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->s()LR2/v4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic t()LR2/D4;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->t()LR2/D4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic u()LR2/l5;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->u()LR2/l5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
