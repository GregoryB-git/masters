.class public Ld4/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# static fields
.field public static final r:LS3/e;


# instance fields
.field public final o:Ld4/n;

.field public p:LS3/e;

.field public final q:Ld4/h;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LS3/e;

    .line 2
    .line 3
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, v1, v2}, LS3/e;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Ld4/i;->r:LS3/e;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ld4/n;Ld4/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ld4/i;->q:Ld4/h;

    iput-object p1, p0, Ld4/i;->o:Ld4/n;

    const/4 p1, 0x0

    iput-object p1, p0, Ld4/i;->p:LS3/e;

    return-void
.end method

.method public constructor <init>(Ld4/n;Ld4/h;LS3/e;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ld4/i;->q:Ld4/h;

    iput-object p1, p0, Ld4/i;->o:Ld4/n;

    iput-object p3, p0, Ld4/i;->p:LS3/e;

    return-void
.end method

.method public static d(Ld4/n;)Ld4/i;
    .locals 2

    .line 1
    new-instance v0, Ld4/i;

    .line 2
    .line 3
    invoke-static {}, Ld4/q;->j()Ld4/q;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, p0, v1}, Ld4/i;-><init>(Ld4/n;Ld4/h;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static f(Ld4/n;Ld4/h;)Ld4/i;
    .locals 1

    .line 1
    new-instance v0, Ld4/i;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ld4/i;-><init>(Ld4/n;Ld4/h;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public D(Ld4/b;Ld4/n;)Ld4/i;
    .locals 4

    .line 1
    iget-object v0, p0, Ld4/i;->o:Ld4/n;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ld4/n;->N(Ld4/b;Ld4/n;)Ld4/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Ld4/i;->p:LS3/e;

    .line 8
    .line 9
    sget-object v2, Ld4/i;->r:LS3/e;

    .line 10
    .line 11
    invoke-static {v1, v2}, LA2/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Ld4/i;->q:Ld4/h;

    .line 18
    .line 19
    invoke-virtual {v1, p2}, Ld4/h;->e(Ld4/n;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    new-instance p1, Ld4/i;

    .line 26
    .line 27
    iget-object p2, p0, Ld4/i;->q:Ld4/h;

    .line 28
    .line 29
    invoke-direct {p1, v0, p2, v2}, Ld4/i;-><init>(Ld4/n;Ld4/h;LS3/e;)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    iget-object v1, p0, Ld4/i;->p:LS3/e;

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    invoke-static {v1, v2}, LA2/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-object v1, p0, Ld4/i;->o:Ld4/n;

    .line 45
    .line 46
    invoke-interface {v1, p1}, Ld4/n;->v(Ld4/b;)Ld4/n;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v2, p0, Ld4/i;->p:LS3/e;

    .line 51
    .line 52
    new-instance v3, Ld4/m;

    .line 53
    .line 54
    invoke-direct {v3, p1, v1}, Ld4/m;-><init>(Ld4/b;Ld4/n;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v3}, LS3/e;->i(Ljava/lang/Object;)LS3/e;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-interface {p2}, Ld4/n;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_2

    .line 66
    .line 67
    new-instance v2, Ld4/m;

    .line 68
    .line 69
    invoke-direct {v2, p1, p2}, Ld4/m;-><init>(Ld4/b;Ld4/n;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v2}, LS3/e;->g(Ljava/lang/Object;)LS3/e;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :cond_2
    new-instance p1, Ld4/i;

    .line 77
    .line 78
    iget-object p2, p0, Ld4/i;->q:Ld4/h;

    .line 79
    .line 80
    invoke-direct {p1, v0, p2, v1}, Ld4/i;-><init>(Ld4/n;Ld4/h;LS3/e;)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_3
    :goto_0
    new-instance p1, Ld4/i;

    .line 85
    .line 86
    iget-object p2, p0, Ld4/i;->q:Ld4/h;

    .line 87
    .line 88
    const/4 v1, 0x0

    .line 89
    invoke-direct {p1, v0, p2, v1}, Ld4/i;-><init>(Ld4/n;Ld4/h;LS3/e;)V

    .line 90
    .line 91
    .line 92
    return-object p1
.end method

.method public M(Ld4/n;)Ld4/i;
    .locals 3

    .line 1
    new-instance v0, Ld4/i;

    .line 2
    .line 3
    iget-object v1, p0, Ld4/i;->o:Ld4/n;

    .line 4
    .line 5
    invoke-interface {v1, p1}, Ld4/n;->J(Ld4/n;)Ld4/n;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v1, p0, Ld4/i;->q:Ld4/h;

    .line 10
    .line 11
    iget-object v2, p0, Ld4/i;->p:LS3/e;

    .line 12
    .line 13
    invoke-direct {v0, p1, v1, v2}, Ld4/i;-><init>(Ld4/n;Ld4/h;LS3/e;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public P()Ljava/util/Iterator;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ld4/i;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ld4/i;->p:LS3/e;

    .line 5
    .line 6
    sget-object v1, Ld4/i;->r:LS3/e;

    .line 7
    .line 8
    invoke-static {v0, v1}, LA2/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Ld4/i;->o:Ld4/n;

    .line 15
    .line 16
    invoke-interface {v0}, Ld4/n;->P()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :cond_0
    iget-object v0, p0, Ld4/i;->p:LS3/e;

    .line 22
    .line 23
    invoke-virtual {v0}, LS3/e;->P()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public final a()V
    .locals 7

    .line 1
    iget-object v0, p0, Ld4/i;->p:LS3/e;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    iget-object v0, p0, Ld4/i;->q:Ld4/h;

    .line 6
    .line 7
    invoke-static {}, Ld4/j;->j()Ld4/j;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    :cond_0
    sget-object v0, Ld4/i;->r:LS3/e;

    .line 18
    .line 19
    iput-object v0, p0, Ld4/i;->p:LS3/e;

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Ld4/i;->o:Ld4/n;

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v2, 0x0

    .line 34
    move v3, v2

    .line 35
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_4

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Ld4/m;

    .line 46
    .line 47
    if-nez v3, :cond_3

    .line 48
    .line 49
    iget-object v3, p0, Ld4/i;->q:Ld4/h;

    .line 50
    .line 51
    invoke-virtual {v4}, Ld4/m;->d()Ld4/n;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v3, v5}, Ld4/h;->e(Ld4/n;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    move v3, v2

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    :goto_1
    const/4 v3, 0x1

    .line 65
    :goto_2
    new-instance v5, Ld4/m;

    .line 66
    .line 67
    invoke-virtual {v4}, Ld4/m;->c()Ld4/b;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {v4}, Ld4/m;->d()Ld4/n;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-direct {v5, v6, v4}, Ld4/m;-><init>(Ld4/b;Ld4/n;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    if-eqz v3, :cond_0

    .line 83
    .line 84
    new-instance v1, LS3/e;

    .line 85
    .line 86
    iget-object v2, p0, Ld4/i;->q:Ld4/h;

    .line 87
    .line 88
    invoke-direct {v1, v0, v2}, LS3/e;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    .line 89
    .line 90
    .line 91
    iput-object v1, p0, Ld4/i;->p:LS3/e;

    .line 92
    .line 93
    :cond_5
    :goto_3
    return-void
.end method

.method public g()Ld4/m;
    .locals 3

    .line 1
    iget-object v0, p0, Ld4/i;->o:Ld4/n;

    .line 2
    .line 3
    instance-of v0, v0, Ld4/c;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Ld4/i;->a()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Ld4/i;->p:LS3/e;

    .line 13
    .line 14
    sget-object v1, Ld4/i;->r:LS3/e;

    .line 15
    .line 16
    invoke-static {v0, v1}, LA2/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Ld4/i;->o:Ld4/n;

    .line 23
    .line 24
    check-cast v0, Ld4/c;

    .line 25
    .line 26
    invoke-virtual {v0}, Ld4/c;->T()Ld4/b;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Ld4/m;

    .line 31
    .line 32
    iget-object v2, p0, Ld4/i;->o:Ld4/n;

    .line 33
    .line 34
    invoke-interface {v2, v0}, Ld4/n;->v(Ld4/b;)Ld4/n;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-direct {v1, v0, v2}, Ld4/m;-><init>(Ld4/b;Ld4/n;)V

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    :cond_1
    iget-object v0, p0, Ld4/i;->p:LS3/e;

    .line 43
    .line 44
    invoke-virtual {v0}, LS3/e;->d()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ld4/m;

    .line 49
    .line 50
    return-object v0
.end method

.method public i()Ld4/m;
    .locals 3

    .line 1
    iget-object v0, p0, Ld4/i;->o:Ld4/n;

    .line 2
    .line 3
    instance-of v0, v0, Ld4/c;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Ld4/i;->a()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Ld4/i;->p:LS3/e;

    .line 13
    .line 14
    sget-object v1, Ld4/i;->r:LS3/e;

    .line 15
    .line 16
    invoke-static {v0, v1}, LA2/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Ld4/i;->o:Ld4/n;

    .line 23
    .line 24
    check-cast v0, Ld4/c;

    .line 25
    .line 26
    invoke-virtual {v0}, Ld4/c;->U()Ld4/b;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Ld4/m;

    .line 31
    .line 32
    iget-object v2, p0, Ld4/i;->o:Ld4/n;

    .line 33
    .line 34
    invoke-interface {v2, v0}, Ld4/n;->v(Ld4/b;)Ld4/n;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-direct {v1, v0, v2}, Ld4/m;-><init>(Ld4/b;Ld4/n;)V

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    :cond_1
    iget-object v0, p0, Ld4/i;->p:LS3/e;

    .line 43
    .line 44
    invoke-virtual {v0}, LS3/e;->a()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ld4/m;

    .line 49
    .line 50
    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ld4/i;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ld4/i;->p:LS3/e;

    .line 5
    .line 6
    sget-object v1, Ld4/i;->r:LS3/e;

    .line 7
    .line 8
    invoke-static {v0, v1}, LA2/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Ld4/i;->o:Ld4/n;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :cond_0
    iget-object v0, p0, Ld4/i;->p:LS3/e;

    .line 22
    .line 23
    invoke-virtual {v0}, LS3/e;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public k()Ld4/n;
    .locals 1

    .line 1
    iget-object v0, p0, Ld4/i;->o:Ld4/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public q(Ld4/b;Ld4/n;Ld4/h;)Ld4/b;
    .locals 2

    .line 1
    iget-object v0, p0, Ld4/i;->q:Ld4/h;

    .line 2
    .line 3
    invoke-static {}, Ld4/j;->j()Ld4/j;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Ld4/i;->q:Ld4/h;

    .line 14
    .line 15
    invoke-virtual {v0, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    if-eqz p3, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    const-string p2, "Index not available in IndexedNode!"

    .line 25
    .line 26
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ld4/i;->a()V

    .line 31
    .line 32
    .line 33
    iget-object p3, p0, Ld4/i;->p:LS3/e;

    .line 34
    .line 35
    sget-object v0, Ld4/i;->r:LS3/e;

    .line 36
    .line 37
    invoke-static {p3, v0}, LA2/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    if-eqz p3, :cond_2

    .line 42
    .line 43
    iget-object p2, p0, Ld4/i;->o:Ld4/n;

    .line 44
    .line 45
    invoke-interface {p2, p1}, Ld4/n;->I(Ld4/b;)Ld4/b;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :cond_2
    iget-object p3, p0, Ld4/i;->p:LS3/e;

    .line 51
    .line 52
    new-instance v0, Ld4/m;

    .line 53
    .line 54
    invoke-direct {v0, p1, p2}, Ld4/m;-><init>(Ld4/b;Ld4/n;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p3, v0}, LS3/e;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Ld4/m;

    .line 62
    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    invoke-virtual {p1}, Ld4/m;->c()Ld4/b;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    goto :goto_1

    .line 70
    :cond_3
    const/4 p1, 0x0

    .line 71
    :goto_1
    return-object p1
.end method

.method public s(Ld4/h;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ld4/i;->q:Ld4/h;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    :goto_0
    return p1
.end method
