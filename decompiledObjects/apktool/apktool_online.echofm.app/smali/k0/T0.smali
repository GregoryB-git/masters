.class public final Lk0/T0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk0/T0$c;,
        Lk0/T0$d;,
        Lk0/T0$b;,
        Lk0/T0$a;
    }
.end annotation


# instance fields
.field public final a:Ll0/y1;

.field public final b:Ljava/util/List;

.field public final c:Ljava/util/IdentityHashMap;

.field public final d:Ljava/util/Map;

.field public final e:Lk0/T0$d;

.field public final f:Ljava/util/HashMap;

.field public final g:Ljava/util/Set;

.field public final h:Ll0/a;

.field public final i:Lg0/k;

.field public j:Lx0/T;

.field public k:Z

.field public l:Li0/y;


# direct methods
.method public constructor <init>(Lk0/T0$d;Ll0/a;Lg0/k;Ll0/y1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lk0/T0;->a:Ll0/y1;

    .line 5
    .line 6
    iput-object p1, p0, Lk0/T0;->e:Lk0/T0$d;

    .line 7
    .line 8
    new-instance p1, Lx0/T$a;

    .line 9
    .line 10
    const/4 p4, 0x0

    .line 11
    invoke-direct {p1, p4}, Lx0/T$a;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lk0/T0;->j:Lx0/T;

    .line 15
    .line 16
    new-instance p1, Ljava/util/IdentityHashMap;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lk0/T0;->c:Ljava/util/IdentityHashMap;

    .line 22
    .line 23
    new-instance p1, Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lk0/T0;->d:Ljava/util/Map;

    .line 29
    .line 30
    new-instance p1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lk0/T0;->b:Ljava/util/List;

    .line 36
    .line 37
    iput-object p2, p0, Lk0/T0;->h:Ll0/a;

    .line 38
    .line 39
    iput-object p3, p0, Lk0/T0;->i:Lg0/k;

    .line 40
    .line 41
    new-instance p1, Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lk0/T0;->f:Ljava/util/HashMap;

    .line 47
    .line 48
    new-instance p1, Ljava/util/HashSet;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lk0/T0;->g:Ljava/util/Set;

    .line 54
    .line 55
    return-void
.end method

.method public static synthetic a(Lk0/T0;Lx0/x;Ld0/I;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lk0/T0;->u(Lx0/x;Ld0/I;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lk0/T0;)Lg0/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lk0/T0;->i:Lg0/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Lk0/T0$c;Lx0/x$b;)Lx0/x$b;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk0/T0;->n(Lk0/T0$c;Lx0/x$b;)Lx0/x$b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(Lk0/T0$c;I)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk0/T0;->s(Lk0/T0$c;I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic e(Lk0/T0;)Ll0/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lk0/T0;->h:Ll0/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lk0/a;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static n(Lk0/T0$c;Lx0/x$b;)Lx0/x$b;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lk0/T0$c;->c:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lk0/T0$c;->c:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lx0/x$b;

    .line 17
    .line 18
    iget-wide v1, v1, Lx0/x$b;->d:J

    .line 19
    .line 20
    iget-wide v3, p1, Lx0/x$b;->d:J

    .line 21
    .line 22
    cmp-long v1, v1, v3

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    iget-object v0, p1, Lx0/x$b;->a:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {p0, v0}, Lk0/T0;->p(Lk0/T0$c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p1, p0}, Lx0/x$b;->a(Ljava/lang/Object;)Lx0/x$b;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method public static o(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lk0/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static p(Lk0/T0$c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lk0/T0$c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lk0/a;->y(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static s(Lk0/T0$c;I)I
    .locals 0

    .line 1
    iget p0, p0, Lk0/T0$c;->d:I

    .line 2
    .line 3
    add-int/2addr p1, p0

    .line 4
    return p1
.end method


# virtual methods
.method public A(IILx0/T;)Ld0/I;
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    if-gt p1, p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lk0/T0;->r()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-gt p2, v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 15
    .line 16
    .line 17
    iput-object p3, p0, Lk0/T0;->j:Lx0/T;

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2}, Lk0/T0;->B(II)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lk0/T0;->i()Ld0/I;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method public final B(II)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    sub-int/2addr p2, v0

    .line 3
    :goto_0
    if-lt p2, p1, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lk0/T0;->b:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1, p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lk0/T0$c;

    .line 12
    .line 13
    iget-object v2, p0, Lk0/T0;->d:Ljava/util/Map;

    .line 14
    .line 15
    iget-object v3, v1, Lk0/T0$c;->b:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-interface {v2, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget-object v2, v1, Lk0/T0$c;->a:Lx0/t;

    .line 21
    .line 22
    invoke-virtual {v2}, Lx0/t;->Z()Ld0/I;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Ld0/I;->p()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    neg-int v2, v2

    .line 31
    invoke-virtual {p0, p2, v2}, Lk0/T0;->g(II)V

    .line 32
    .line 33
    .line 34
    iput-boolean v0, v1, Lk0/T0$c;->e:Z

    .line 35
    .line 36
    iget-boolean v2, p0, Lk0/T0;->k:Z

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Lk0/T0;->v(Lk0/T0$c;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    add-int/lit8 p2, p2, -0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-void
.end method

.method public C(Ljava/util/List;Lx0/T;)Ld0/I;
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/T0;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p0, v1, v0}, Lk0/T0;->B(II)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lk0/T0;->b:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p0, v0, p1, p2}, Lk0/T0;->f(ILjava/util/List;Lx0/T;)Ld0/I;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public D(Lx0/T;)Ld0/I;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk0/T0;->r()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1}, Lx0/T;->a()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eq v1, v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Lx0/T;->h()Lx0/T;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-interface {p1, v1, v0}, Lx0/T;->d(II)Lx0/T;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :cond_0
    iput-object p1, p0, Lk0/T0;->j:Lx0/T;

    .line 21
    .line 22
    invoke-virtual {p0}, Lk0/T0;->i()Ld0/I;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method public E(IILjava/util/List;)Ld0/I;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    if-gt p1, p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lk0/T0;->r()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-gt p2, v2, :cond_0

    .line 12
    .line 13
    move v2, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v2, v0

    .line 16
    :goto_0
    invoke-static {v2}, Lg0/a;->a(Z)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    sub-int v3, p2, p1

    .line 24
    .line 25
    if-ne v2, v3, :cond_1

    .line 26
    .line 27
    move v0, v1

    .line 28
    :cond_1
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 29
    .line 30
    .line 31
    move v0, p1

    .line 32
    :goto_1
    if-ge v0, p2, :cond_2

    .line 33
    .line 34
    iget-object v1, p0, Lk0/T0;->b:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lk0/T0$c;

    .line 41
    .line 42
    iget-object v1, v1, Lk0/T0$c;->a:Lx0/t;

    .line 43
    .line 44
    sub-int v2, v0, p1

    .line 45
    .line 46
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ld0/u;

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Lx0/t;->l(Ld0/u;)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-virtual {p0}, Lk0/T0;->i()Ld0/I;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1
.end method

.method public f(ILjava/util/List;Lx0/T;)Ld0/I;
    .locals 3

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    iput-object p3, p0, Lk0/T0;->j:Lx0/T;

    .line 8
    .line 9
    move p3, p1

    .line 10
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/2addr v0, p1

    .line 15
    if-ge p3, v0, :cond_3

    .line 16
    .line 17
    sub-int v0, p3, p1

    .line 18
    .line 19
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lk0/T0$c;

    .line 24
    .line 25
    if-lez p3, :cond_0

    .line 26
    .line 27
    iget-object v1, p0, Lk0/T0;->b:Ljava/util/List;

    .line 28
    .line 29
    add-int/lit8 v2, p3, -0x1

    .line 30
    .line 31
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lk0/T0$c;

    .line 36
    .line 37
    iget-object v2, v1, Lk0/T0$c;->a:Lx0/t;

    .line 38
    .line 39
    invoke-virtual {v2}, Lx0/t;->Z()Ld0/I;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget v1, v1, Lk0/T0$c;->d:I

    .line 44
    .line 45
    invoke-virtual {v2}, Ld0/I;->p()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    add-int/2addr v1, v2

    .line 50
    :goto_1
    invoke-virtual {v0, v1}, Lk0/T0$c;->c(I)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_0
    const/4 v1, 0x0

    .line 55
    goto :goto_1

    .line 56
    :goto_2
    iget-object v1, v0, Lk0/T0$c;->a:Lx0/t;

    .line 57
    .line 58
    invoke-virtual {v1}, Lx0/t;->Z()Ld0/I;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Ld0/I;->p()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    invoke-virtual {p0, p3, v1}, Lk0/T0;->g(II)V

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Lk0/T0;->b:Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {v1, p3, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, Lk0/T0;->d:Ljava/util/Map;

    .line 75
    .line 76
    iget-object v2, v0, Lk0/T0$c;->b:Ljava/lang/Object;

    .line 77
    .line 78
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    iget-boolean v1, p0, Lk0/T0;->k:Z

    .line 82
    .line 83
    if-eqz v1, :cond_2

    .line 84
    .line 85
    invoke-virtual {p0, v0}, Lk0/T0;->x(Lk0/T0$c;)V

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Lk0/T0;->c:Ljava/util/IdentityHashMap;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_1

    .line 95
    .line 96
    iget-object v1, p0, Lk0/T0;->g:Ljava/util/Set;

    .line 97
    .line 98
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_1
    invoke-virtual {p0, v0}, Lk0/T0;->j(Lk0/T0$c;)V

    .line 103
    .line 104
    .line 105
    :cond_2
    :goto_3
    add-int/lit8 p3, p3, 0x1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_3
    invoke-virtual {p0}, Lk0/T0;->i()Ld0/I;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    return-object p1
.end method

.method public final g(II)V
    .locals 2

    .line 1
    :goto_0
    iget-object v0, p0, Lk0/T0;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lk0/T0;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lk0/T0$c;

    .line 16
    .line 17
    iget v1, v0, Lk0/T0$c;->d:I

    .line 18
    .line 19
    add-int/2addr v1, p2

    .line 20
    iput v1, v0, Lk0/T0$c;->d:I

    .line 21
    .line 22
    add-int/lit8 p1, p1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public h(Lx0/x$b;LB0/b;J)Lx0/v;
    .locals 2

    .line 1
    iget-object v0, p1, Lx0/x$b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Lk0/T0;->o(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p1, Lx0/x$b;->a:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {v1}, Lk0/T0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p1, v1}, Lx0/x$b;->a(Ljava/lang/Object;)Lx0/x$b;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v1, p0, Lk0/T0;->d:Ljava/util/Map;

    .line 18
    .line 19
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lk0/T0$c;

    .line 24
    .line 25
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lk0/T0$c;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lk0/T0;->l(Lk0/T0$c;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, v0, Lk0/T0$c;->c:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    iget-object v1, v0, Lk0/T0$c;->a:Lx0/t;

    .line 40
    .line 41
    invoke-virtual {v1, p1, p2, p3, p4}, Lx0/t;->W(Lx0/x$b;LB0/b;J)Lx0/s;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object p2, p0, Lk0/T0;->c:Ljava/util/IdentityHashMap;

    .line 46
    .line 47
    invoke-virtual {p2, p1, v0}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lk0/T0;->k()V

    .line 51
    .line 52
    .line 53
    return-object p1
.end method

.method public i()Ld0/I;
    .locals 3

    .line 1
    iget-object v0, p0, Lk0/T0;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Ld0/I;->a:Ld0/I;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    move v1, v0

    .line 14
    :goto_0
    iget-object v2, p0, Lk0/T0;->b:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ge v0, v2, :cond_1

    .line 21
    .line 22
    iget-object v2, p0, Lk0/T0;->b:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lk0/T0$c;

    .line 29
    .line 30
    iput v1, v2, Lk0/T0$c;->d:I

    .line 31
    .line 32
    iget-object v2, v2, Lk0/T0$c;->a:Lx0/t;

    .line 33
    .line 34
    invoke-virtual {v2}, Lx0/t;->Z()Ld0/I;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Ld0/I;->p()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    add-int/2addr v1, v2

    .line 43
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    new-instance v0, Lk0/W0;

    .line 47
    .line 48
    iget-object v1, p0, Lk0/T0;->b:Ljava/util/List;

    .line 49
    .line 50
    iget-object v2, p0, Lk0/T0;->j:Lx0/T;

    .line 51
    .line 52
    invoke-direct {v0, v1, v2}, Lk0/W0;-><init>(Ljava/util/Collection;Lx0/T;)V

    .line 53
    .line 54
    .line 55
    return-object v0
.end method

.method public final j(Lk0/T0$c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/T0;->f:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lk0/T0$b;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object v0, p1, Lk0/T0$b;->a:Lx0/x;

    .line 12
    .line 13
    iget-object p1, p1, Lk0/T0$b;->b:Lx0/x$c;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Lx0/x;->d(Lx0/x$c;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final k()V
    .locals 3

    .line 1
    iget-object v0, p0, Lk0/T0;->g:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lk0/T0$c;

    .line 18
    .line 19
    iget-object v2, v1, Lk0/T0$c;->c:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Lk0/T0;->j(Lk0/T0$c;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method public final l(Lk0/T0$c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/T0;->g:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk0/T0;->f:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lk0/T0$b;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object v0, p1, Lk0/T0$b;->a:Lx0/x;

    .line 17
    .line 18
    iget-object p1, p1, Lk0/T0$b;->b:Lx0/x$c;

    .line 19
    .line 20
    invoke-interface {v0, p1}, Lx0/x;->n(Lx0/x$c;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public q()Lx0/T;
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/T0;->j:Lx0/T;

    .line 2
    .line 3
    return-object v0
.end method

.method public r()I
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/T0;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public t()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk0/T0;->k:Z

    .line 2
    .line 3
    return v0
.end method

.method public final synthetic u(Lx0/x;Ld0/I;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lk0/T0;->e:Lk0/T0$d;

    .line 2
    .line 3
    invoke-interface {p1}, Lk0/T0$d;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final v(Lk0/T0$c;)V
    .locals 3

    .line 1
    iget-boolean v0, p1, Lk0/T0$c;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, Lk0/T0$c;->c:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lk0/T0;->f:Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lk0/T0$b;

    .line 20
    .line 21
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lk0/T0$b;

    .line 26
    .line 27
    iget-object v1, v0, Lk0/T0$b;->a:Lx0/x;

    .line 28
    .line 29
    iget-object v2, v0, Lk0/T0$b;->b:Lx0/x$c;

    .line 30
    .line 31
    invoke-interface {v1, v2}, Lx0/x;->m(Lx0/x$c;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, v0, Lk0/T0$b;->a:Lx0/x;

    .line 35
    .line 36
    iget-object v2, v0, Lk0/T0$b;->c:Lk0/T0$a;

    .line 37
    .line 38
    invoke-interface {v1, v2}, Lx0/x;->c(Lx0/E;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, v0, Lk0/T0$b;->a:Lx0/x;

    .line 42
    .line 43
    iget-object v0, v0, Lk0/T0$b;->c:Lk0/T0$a;

    .line 44
    .line 45
    invoke-interface {v1, v0}, Lx0/x;->o(Lp0/v;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lk0/T0;->g:Ljava/util/Set;

    .line 49
    .line 50
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
.end method

.method public w(Li0/y;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lk0/T0;->k:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lk0/T0;->l:Li0/y;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    :goto_0
    iget-object v0, p0, Lk0/T0;->b:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ge p1, v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lk0/T0;->b:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lk0/T0$c;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lk0/T0;->x(Lk0/T0$c;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lk0/T0;->g:Ljava/util/Set;

    .line 31
    .line 32
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iput-boolean v1, p0, Lk0/T0;->k:Z

    .line 39
    .line 40
    return-void
.end method

.method public final x(Lk0/T0$c;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lk0/T0$c;->a:Lx0/t;

    .line 2
    .line 3
    new-instance v1, Lk0/G0;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lk0/G0;-><init>(Lk0/T0;)V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lk0/T0$a;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1}, Lk0/T0$a;-><init>(Lk0/T0;Lk0/T0$c;)V

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Lk0/T0;->f:Ljava/util/HashMap;

    .line 14
    .line 15
    new-instance v4, Lk0/T0$b;

    .line 16
    .line 17
    invoke-direct {v4, v0, v1, v2}, Lk0/T0$b;-><init>(Lx0/x;Lx0/x$c;Lk0/T0$a;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lg0/M;->C()Landroid/os/Handler;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {v0, p1, v2}, Lx0/x;->p(Landroid/os/Handler;Lx0/E;)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lg0/M;->C()Landroid/os/Handler;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-interface {v0, p1, v2}, Lx0/x;->k(Landroid/os/Handler;Lp0/v;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lk0/T0;->l:Li0/y;

    .line 38
    .line 39
    iget-object v2, p0, Lk0/T0;->a:Ll0/y1;

    .line 40
    .line 41
    invoke-interface {v0, v1, p1, v2}, Lx0/x;->g(Lx0/x$c;Li0/y;Ll0/y1;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public y()V
    .locals 5

    .line 1
    iget-object v0, p0, Lk0/T0;->f:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lk0/T0$b;

    .line 22
    .line 23
    :try_start_0
    iget-object v2, v1, Lk0/T0$b;->a:Lx0/x;

    .line 24
    .line 25
    iget-object v3, v1, Lk0/T0$b;->b:Lx0/x$c;

    .line 26
    .line 27
    invoke-interface {v2, v3}, Lx0/x;->m(Lx0/x$c;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :catch_0
    move-exception v2

    .line 32
    const-string v3, "MediaSourceList"

    .line 33
    .line 34
    const-string v4, "Failed to release child source."

    .line 35
    .line 36
    invoke-static {v3, v4, v2}, Lg0/o;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    :goto_1
    iget-object v2, v1, Lk0/T0$b;->a:Lx0/x;

    .line 40
    .line 41
    iget-object v3, v1, Lk0/T0$b;->c:Lk0/T0$a;

    .line 42
    .line 43
    invoke-interface {v2, v3}, Lx0/x;->c(Lx0/E;)V

    .line 44
    .line 45
    .line 46
    iget-object v2, v1, Lk0/T0$b;->a:Lx0/x;

    .line 47
    .line 48
    iget-object v1, v1, Lk0/T0$b;->c:Lk0/T0$a;

    .line 49
    .line 50
    invoke-interface {v2, v1}, Lx0/x;->o(Lp0/v;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    iget-object v0, p0, Lk0/T0;->f:Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lk0/T0;->g:Ljava/util/Set;

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 62
    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    iput-boolean v0, p0, Lk0/T0;->k:Z

    .line 66
    .line 67
    return-void
.end method

.method public z(Lx0/v;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/T0;->c:Ljava/util/IdentityHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lk0/T0$c;

    .line 8
    .line 9
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lk0/T0$c;

    .line 14
    .line 15
    iget-object v1, v0, Lk0/T0$c;->a:Lx0/t;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Lx0/t;->e(Lx0/v;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, Lk0/T0$c;->c:Ljava/util/List;

    .line 21
    .line 22
    check-cast p1, Lx0/s;

    .line 23
    .line 24
    iget-object p1, p1, Lx0/s;->o:Lx0/x$b;

    .line 25
    .line 26
    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lk0/T0;->c:Ljava/util/IdentityHashMap;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/util/IdentityHashMap;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    invoke-virtual {p0}, Lk0/T0;->k()V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p0, v0}, Lk0/T0;->v(Lk0/T0$c;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method
