.class public final Ll0/s0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll0/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ld0/I$b;

.field public b:LX2/v;

.field public c:LX2/w;

.field public d:Lx0/x$b;

.field public e:Lx0/x$b;

.field public f:Lx0/x$b;


# direct methods
.method public constructor <init>(Ld0/I$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll0/s0$a;->a:Ld0/I$b;

    .line 5
    .line 6
    invoke-static {}, LX2/v;->Y()LX2/v;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Ll0/s0$a;->b:LX2/v;

    .line 11
    .line 12
    invoke-static {}, LX2/w;->j()LX2/w;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Ll0/s0$a;->c:LX2/w;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic a(Ll0/s0$a;)LX2/v;
    .locals 0

    .line 1
    iget-object p0, p0, Ll0/s0$a;->b:LX2/v;

    .line 2
    .line 3
    return-object p0
.end method

.method public static c(Ld0/D;LX2/v;Lx0/x$b;Ld0/I$b;)Lx0/x$b;
    .locals 10

    .line 1
    invoke-interface {p0}, Ld0/D;->L()Ld0/I;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0}, Ld0/D;->C()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0}, Ld0/I;->q()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    move-object v2, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v0, v1}, Ld0/I;->m(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :goto_0
    invoke-interface {p0}, Ld0/D;->o()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-nez v4, :cond_2

    .line 27
    .line 28
    invoke-virtual {v0}, Ld0/I;->q()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v0, v1, p3}, Ld0/I;->f(ILd0/I$b;)Ld0/I$b;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {p0}, Ld0/D;->P()J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    invoke-static {v4, v5}, Lg0/M;->J0(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide v4

    .line 47
    invoke-virtual {p3}, Ld0/I$b;->n()J

    .line 48
    .line 49
    .line 50
    move-result-wide v6

    .line 51
    sub-long/2addr v4, v6

    .line 52
    invoke-virtual {v0, v4, v5}, Ld0/I$b;->d(J)I

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    :goto_1
    const/4 p3, -0x1

    .line 58
    :goto_2
    const/4 v0, 0x0

    .line 59
    :goto_3
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-ge v0, v1, :cond_4

    .line 64
    .line 65
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Lx0/x$b;

    .line 70
    .line 71
    invoke-interface {p0}, Ld0/D;->o()Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    invoke-interface {p0}, Ld0/D;->D()I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    invoke-interface {p0}, Ld0/D;->H()I

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    move-object v4, v1

    .line 84
    move-object v5, v2

    .line 85
    move v9, p3

    .line 86
    invoke-static/range {v4 .. v9}, Ll0/s0$a;->i(Lx0/x$b;Ljava/lang/Object;ZIII)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_3

    .line 91
    .line 92
    return-object v1

    .line 93
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_5

    .line 101
    .line 102
    if-eqz p2, :cond_5

    .line 103
    .line 104
    invoke-interface {p0}, Ld0/D;->o()Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    invoke-interface {p0}, Ld0/D;->D()I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    invoke-interface {p0}, Ld0/D;->H()I

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    move-object v4, p2

    .line 117
    move-object v5, v2

    .line 118
    move v9, p3

    .line 119
    invoke-static/range {v4 .. v9}, Ll0/s0$a;->i(Lx0/x$b;Ljava/lang/Object;ZIII)Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    if-eqz p0, :cond_5

    .line 124
    .line 125
    return-object p2

    .line 126
    :cond_5
    return-object v3
.end method

.method public static i(Lx0/x$b;Ljava/lang/Object;ZIII)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/x$b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    if-eqz p2, :cond_1

    .line 12
    .line 13
    iget p1, p0, Lx0/x$b;->b:I

    .line 14
    .line 15
    if-ne p1, p3, :cond_1

    .line 16
    .line 17
    iget p1, p0, Lx0/x$b;->c:I

    .line 18
    .line 19
    if-eq p1, p4, :cond_2

    .line 20
    .line 21
    :cond_1
    if-nez p2, :cond_3

    .line 22
    .line 23
    iget p1, p0, Lx0/x$b;->b:I

    .line 24
    .line 25
    const/4 p2, -0x1

    .line 26
    if-ne p1, p2, :cond_3

    .line 27
    .line 28
    iget p0, p0, Lx0/x$b;->e:I

    .line 29
    .line 30
    if-ne p0, p5, :cond_3

    .line 31
    .line 32
    :cond_2
    const/4 v0, 0x1

    .line 33
    :cond_3
    return v0
.end method


# virtual methods
.method public final b(LX2/w$a;Lx0/x$b;Ld0/I;)V
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p2, Lx0/x$b;->a:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p3, v0}, Ld0/I;->b(Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p1, p2, p3}, LX2/w$a;->f(Ljava/lang/Object;Ljava/lang/Object;)LX2/w$a;

    .line 14
    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    iget-object p3, p0, Ll0/s0$a;->c:LX2/w;

    .line 18
    .line 19
    invoke-virtual {p3, p2}, LX2/w;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    check-cast p3, Ld0/I;

    .line 24
    .line 25
    if-eqz p3, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    :goto_1
    return-void
.end method

.method public d()Lx0/x$b;
    .locals 1

    .line 1
    iget-object v0, p0, Ll0/s0$a;->d:Lx0/x$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Lx0/x$b;
    .locals 1

    .line 1
    iget-object v0, p0, Ll0/s0$a;->b:LX2/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Ll0/s0$a;->b:LX2/v;

    .line 12
    .line 13
    invoke-static {v0}, LX2/B;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lx0/x$b;

    .line 18
    .line 19
    :goto_0
    return-object v0
.end method

.method public f(Lx0/x$b;)Ld0/I;
    .locals 1

    .line 1
    iget-object v0, p0, Ll0/s0$a;->c:LX2/w;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LX2/w;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ld0/I;

    .line 8
    .line 9
    return-object p1
.end method

.method public g()Lx0/x$b;
    .locals 1

    .line 1
    iget-object v0, p0, Ll0/s0$a;->e:Lx0/x$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Lx0/x$b;
    .locals 1

    .line 1
    iget-object v0, p0, Ll0/s0$a;->f:Lx0/x$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public j(Ld0/D;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ll0/s0$a;->b:LX2/v;

    .line 2
    .line 3
    iget-object v1, p0, Ll0/s0$a;->e:Lx0/x$b;

    .line 4
    .line 5
    iget-object v2, p0, Ll0/s0$a;->a:Ld0/I$b;

    .line 6
    .line 7
    invoke-static {p1, v0, v1, v2}, Ll0/s0$a;->c(Ld0/D;LX2/v;Lx0/x$b;Ld0/I$b;)Lx0/x$b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Ll0/s0$a;->d:Lx0/x$b;

    .line 12
    .line 13
    return-void
.end method

.method public k(Ljava/util/List;Lx0/x$b;Ld0/D;)V
    .locals 1

    .line 1
    invoke-static {p1}, LX2/v;->U(Ljava/util/Collection;)LX2/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Ll0/s0$a;->b:LX2/v;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lx0/x$b;

    .line 19
    .line 20
    iput-object p1, p0, Ll0/s0$a;->e:Lx0/x$b;

    .line 21
    .line 22
    invoke-static {p2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lx0/x$b;

    .line 27
    .line 28
    iput-object p1, p0, Ll0/s0$a;->f:Lx0/x$b;

    .line 29
    .line 30
    :cond_0
    iget-object p1, p0, Ll0/s0$a;->d:Lx0/x$b;

    .line 31
    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    iget-object p1, p0, Ll0/s0$a;->b:LX2/v;

    .line 35
    .line 36
    iget-object p2, p0, Ll0/s0$a;->e:Lx0/x$b;

    .line 37
    .line 38
    iget-object v0, p0, Ll0/s0$a;->a:Ld0/I$b;

    .line 39
    .line 40
    invoke-static {p3, p1, p2, v0}, Ll0/s0$a;->c(Ld0/D;LX2/v;Lx0/x$b;Ld0/I$b;)Lx0/x$b;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Ll0/s0$a;->d:Lx0/x$b;

    .line 45
    .line 46
    :cond_1
    invoke-interface {p3}, Ld0/D;->L()Ld0/I;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, p1}, Ll0/s0$a;->m(Ld0/I;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public l(Ld0/D;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ll0/s0$a;->b:LX2/v;

    .line 2
    .line 3
    iget-object v1, p0, Ll0/s0$a;->e:Lx0/x$b;

    .line 4
    .line 5
    iget-object v2, p0, Ll0/s0$a;->a:Ld0/I$b;

    .line 6
    .line 7
    invoke-static {p1, v0, v1, v2}, Ll0/s0$a;->c(Ld0/D;LX2/v;Lx0/x$b;Ld0/I$b;)Lx0/x$b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Ll0/s0$a;->d:Lx0/x$b;

    .line 12
    .line 13
    invoke-interface {p1}, Ld0/D;->L()Ld0/I;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1}, Ll0/s0$a;->m(Ld0/I;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final m(Ld0/I;)V
    .locals 3

    .line 1
    invoke-static {}, LX2/w;->a()LX2/w$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ll0/s0$a;->b:LX2/v;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Ll0/s0$a;->e:Lx0/x$b;

    .line 14
    .line 15
    invoke-virtual {p0, v0, v1, p1}, Ll0/s0$a;->b(LX2/w$a;Lx0/x$b;Ld0/I;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Ll0/s0$a;->f:Lx0/x$b;

    .line 19
    .line 20
    iget-object v2, p0, Ll0/s0$a;->e:Lx0/x$b;

    .line 21
    .line 22
    invoke-static {v1, v2}, LW2/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    iget-object v1, p0, Ll0/s0$a;->f:Lx0/x$b;

    .line 29
    .line 30
    invoke-virtual {p0, v0, v1, p1}, Ll0/s0$a;->b(LX2/w$a;Lx0/x$b;Ld0/I;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object v1, p0, Ll0/s0$a;->d:Lx0/x$b;

    .line 34
    .line 35
    iget-object v2, p0, Ll0/s0$a;->e:Lx0/x$b;

    .line 36
    .line 37
    invoke-static {v1, v2}, LW2/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_3

    .line 42
    .line 43
    iget-object v1, p0, Ll0/s0$a;->d:Lx0/x$b;

    .line 44
    .line 45
    iget-object v2, p0, Ll0/s0$a;->f:Lx0/x$b;

    .line 46
    .line 47
    invoke-static {v1, v2}, LW2/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_3

    .line 52
    .line 53
    :goto_0
    iget-object v1, p0, Ll0/s0$a;->d:Lx0/x$b;

    .line 54
    .line 55
    invoke-virtual {p0, v0, v1, p1}, Ll0/s0$a;->b(LX2/w$a;Lx0/x$b;Ld0/I;)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_1
    const/4 v1, 0x0

    .line 60
    :goto_1
    iget-object v2, p0, Ll0/s0$a;->b:LX2/v;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-ge v1, v2, :cond_2

    .line 67
    .line 68
    iget-object v2, p0, Ll0/s0$a;->b:LX2/v;

    .line 69
    .line 70
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Lx0/x$b;

    .line 75
    .line 76
    invoke-virtual {p0, v0, v2, p1}, Ll0/s0$a;->b(LX2/w$a;Lx0/x$b;Ld0/I;)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v1, v1, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    iget-object v1, p0, Ll0/s0$a;->b:LX2/v;

    .line 83
    .line 84
    iget-object v2, p0, Ll0/s0$a;->d:Lx0/x$b;

    .line 85
    .line 86
    invoke-virtual {v1, v2}, LX2/v;->contains(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-nez v1, :cond_3

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    :goto_2
    invoke-virtual {v0}, LX2/w$a;->c()LX2/w;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iput-object p1, p0, Ll0/s0$a;->c:LX2/w;

    .line 98
    .line 99
    return-void
.end method
