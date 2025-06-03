.class public final Lx0/l;
.super Lx0/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx0/l$b;,
        Lx0/l$e;,
        Lx0/l$c;,
        Lx0/l$d;,
        Lx0/l$f;
    }
.end annotation


# static fields
.field public static final w:Ld0/u;


# instance fields
.field public final k:Ljava/util/List;

.field public final l:Ljava/util/Set;

.field public m:Landroid/os/Handler;

.field public final n:Ljava/util/List;

.field public final o:Ljava/util/IdentityHashMap;

.field public final p:Ljava/util/Map;

.field public final q:Ljava/util/Set;

.field public final r:Z

.field public final s:Z

.field public t:Z

.field public u:Ljava/util/Set;

.field public v:Lx0/T;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ld0/u$c;

    .line 2
    .line 3
    invoke-direct {v0}, Ld0/u$c;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ld0/u$c;->e(Landroid/net/Uri;)Ld0/u$c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ld0/u$c;->a()Ld0/u;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lx0/l;->w:Ld0/u;

    .line 17
    .line 18
    return-void
.end method

.method public varargs constructor <init>(ZLx0/T;[Lx0/x;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2, p3}, Lx0/l;-><init>(ZZLx0/T;[Lx0/x;)V

    return-void
.end method

.method public varargs constructor <init>(ZZLx0/T;[Lx0/x;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Lx0/h;-><init>()V

    array-length v0, p4

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p4, v1

    invoke-static {v2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p3}, Lx0/T;->a()I

    move-result v0

    if-lez v0, :cond_1

    invoke-interface {p3}, Lx0/T;->h()Lx0/T;

    move-result-object p3

    :cond_1
    iput-object p3, p0, Lx0/l;->v:Lx0/T;

    new-instance p3, Ljava/util/IdentityHashMap;

    invoke-direct {p3}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p3, p0, Lx0/l;->o:Ljava/util/IdentityHashMap;

    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    iput-object p3, p0, Lx0/l;->p:Ljava/util/Map;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lx0/l;->k:Ljava/util/List;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lx0/l;->n:Ljava/util/List;

    new-instance p3, Ljava/util/HashSet;

    invoke-direct {p3}, Ljava/util/HashSet;-><init>()V

    iput-object p3, p0, Lx0/l;->u:Ljava/util/Set;

    new-instance p3, Ljava/util/HashSet;

    invoke-direct {p3}, Ljava/util/HashSet;-><init>()V

    iput-object p3, p0, Lx0/l;->l:Ljava/util/Set;

    new-instance p3, Ljava/util/HashSet;

    invoke-direct {p3}, Ljava/util/HashSet;-><init>()V

    iput-object p3, p0, Lx0/l;->q:Ljava/util/Set;

    iput-boolean p1, p0, Lx0/l;->r:Z

    iput-boolean p2, p0, Lx0/l;->s:Z

    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx0/l;->Q(Ljava/util/Collection;)V

    return-void
.end method

.method public varargs constructor <init>(Z[Lx0/x;)V
    .locals 2

    .line 3
    new-instance v0, Lx0/T$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx0/T$a;-><init>(I)V

    invoke-direct {p0, p1, v0, p2}, Lx0/l;-><init>(ZLx0/T;[Lx0/x;)V

    return-void
.end method

.method public varargs constructor <init>([Lx0/x;)V
    .locals 1

    .line 4
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lx0/l;-><init>(Z[Lx0/x;)V

    return-void
.end method

.method public static synthetic M(Lx0/l;Landroid/os/Message;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lx0/l;->f0(Landroid/os/Message;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic N()Ld0/u;
    .locals 1

    .line 1
    sget-object v0, Lx0/l;->w:Ld0/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public static Y(Ljava/lang/Object;)Ljava/lang/Object;
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

.method public static a0(Ljava/lang/Object;)Ljava/lang/Object;
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

.method public static b0(Lx0/l$e;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lx0/l$e;->b:Ljava/lang/Object;

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


# virtual methods
.method public declared-synchronized B()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-super {p0}, Lx0/h;->B()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lx0/l;->n:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lx0/l;->q:Ljava/util/Set;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lx0/l;->p:Ljava/util/Map;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lx0/l;->v:Lx0/T;

    .line 21
    .line 22
    invoke-interface {v0}, Lx0/T;->h()Lx0/T;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lx0/l;->v:Lx0/T;

    .line 27
    .line 28
    iget-object v0, p0, Lx0/l;->m:Landroid/os/Handler;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lx0/l;->m:Landroid/os/Handler;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 42
    iput-boolean v0, p0, Lx0/l;->t:Z

    .line 43
    .line 44
    iget-object v0, p0, Lx0/l;->u:Ljava/util/Set;

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lx0/l;->l:Ljava/util/Set;

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Lx0/l;->W(Ljava/util/Set;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    monitor-exit p0

    .line 55
    return-void

    .line 56
    :goto_1
    monitor-exit p0

    .line 57
    throw v0
.end method

.method public bridge synthetic F(Ljava/lang/Object;Lx0/x$b;)Lx0/x$b;
    .locals 0

    .line 1
    check-cast p1, Lx0/l$e;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lx0/l;->Z(Lx0/l$e;Lx0/x$b;)Lx0/x$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic H(Ljava/lang/Object;I)I
    .locals 0

    .line 1
    check-cast p1, Lx0/l$e;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lx0/l;->e0(Lx0/l$e;I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic J(Ljava/lang/Object;Lx0/x;Ld0/I;)V
    .locals 0

    .line 1
    check-cast p1, Lx0/l$e;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lx0/l;->k0(Lx0/l$e;Lx0/x;Ld0/I;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final O(ILx0/l$e;)V
    .locals 2

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lx0/l;->n:Ljava/util/List;

    .line 4
    .line 5
    add-int/lit8 v1, p1, -0x1

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lx0/l$e;

    .line 12
    .line 13
    iget-object v1, v0, Lx0/l$e;->a:Lx0/t;

    .line 14
    .line 15
    invoke-virtual {v1}, Lx0/t;->Z()Ld0/I;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget v0, v0, Lx0/l$e;->e:I

    .line 20
    .line 21
    invoke-virtual {v1}, Ld0/I;->p()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    add-int/2addr v0, v1

    .line 26
    :goto_0
    invoke-virtual {p2, p1, v0}, Lx0/l$e;->a(II)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    goto :goto_0

    .line 32
    :goto_1
    iget-object v0, p2, Lx0/l$e;->a:Lx0/t;

    .line 33
    .line 34
    invoke-virtual {v0}, Lx0/t;->Z()Ld0/I;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ld0/I;->p()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-virtual {p0, p1, v1, v0}, Lx0/l;->T(III)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lx0/l;->n:Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lx0/l;->p:Ljava/util/Map;

    .line 52
    .line 53
    iget-object v0, p2, Lx0/l$e;->b:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    iget-object p1, p2, Lx0/l$e;->a:Lx0/t;

    .line 59
    .line 60
    invoke-virtual {p0, p2, p1}, Lx0/h;->K(Ljava/lang/Object;Lx0/x;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lx0/a;->y()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_1

    .line 68
    .line 69
    iget-object p1, p0, Lx0/l;->o:Ljava/util/IdentityHashMap;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/util/IdentityHashMap;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_1

    .line 76
    .line 77
    iget-object p1, p0, Lx0/l;->q:Ljava/util/Set;

    .line 78
    .line 79
    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_1
    invoke-virtual {p0, p2}, Lx0/h;->D(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :goto_2
    return-void
.end method

.method public declared-synchronized P(ILjava/util/Collection;Landroid/os/Handler;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lx0/l;->S(ILjava/util/Collection;Landroid/os/Handler;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    .line 5
    monitor-exit p0

    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    monitor-exit p0

    .line 9
    throw p1
.end method

.method public declared-synchronized Q(Ljava/util/Collection;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lx0/l;->k:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p0, v0, p1, v1, v1}, Lx0/l;->S(ILjava/util/Collection;Landroid/os/Handler;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0

    .line 16
    throw p1
.end method

.method public final R(ILjava/util/Collection;)V
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lx0/l$e;

    .line 16
    .line 17
    add-int/lit8 v1, p1, 0x1

    .line 18
    .line 19
    invoke-virtual {p0, p1, v0}, Lx0/l;->O(ILx0/l$e;)V

    .line 20
    .line 21
    .line 22
    move p1, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
.end method

.method public final S(ILjava/util/Collection;Landroid/os/Handler;Ljava/lang/Runnable;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    move v2, v1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v2, v0

    .line 8
    :goto_0
    if-nez p4, :cond_1

    .line 9
    .line 10
    move v3, v1

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    move v3, v0

    .line 13
    :goto_1
    if-ne v2, v3, :cond_2

    .line 14
    .line 15
    move v0, v1

    .line 16
    :cond_2
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lx0/l;->m:Landroid/os/Handler;

    .line 20
    .line 21
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_3

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Lx0/x;

    .line 36
    .line 37
    invoke-static {v3}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_4

    .line 59
    .line 60
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, Lx0/x;

    .line 65
    .line 66
    new-instance v5, Lx0/l$e;

    .line 67
    .line 68
    iget-boolean v6, p0, Lx0/l;->s:Z

    .line 69
    .line 70
    invoke-direct {v5, v4, v6}, Lx0/l$e;-><init>(Lx0/x;Z)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_4
    iget-object v3, p0, Lx0/l;->k:Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {v3, p1, v2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 80
    .line 81
    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-nez p2, :cond_5

    .line 89
    .line 90
    invoke-virtual {p0, p3, p4}, Lx0/l;->U(Landroid/os/Handler;Ljava/lang/Runnable;)Lx0/l$d;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    new-instance p3, Lx0/l$f;

    .line 95
    .line 96
    invoke-direct {p3, p1, v2, p2}, Lx0/l$f;-><init>(ILjava/lang/Object;Lx0/l$d;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1, p3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 104
    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_5
    if-eqz p4, :cond_6

    .line 108
    .line 109
    if-eqz p3, :cond_6

    .line 110
    .line 111
    invoke-virtual {p3, p4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 112
    .line 113
    .line 114
    :cond_6
    :goto_4
    return-void
.end method

.method public final T(III)V
    .locals 2

    .line 1
    :goto_0
    iget-object v0, p0, Lx0/l;->n:Ljava/util/List;

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
    iget-object v0, p0, Lx0/l;->n:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lx0/l$e;

    .line 16
    .line 17
    iget v1, v0, Lx0/l$e;->d:I

    .line 18
    .line 19
    add-int/2addr v1, p2

    .line 20
    iput v1, v0, Lx0/l$e;->d:I

    .line 21
    .line 22
    iget v1, v0, Lx0/l$e;->e:I

    .line 23
    .line 24
    add-int/2addr v1, p3

    .line 25
    iput v1, v0, Lx0/l$e;->e:I

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public final U(Landroid/os/Handler;Ljava/lang/Runnable;)Lx0/l$d;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Lx0/l$d;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2}, Lx0/l$d;-><init>(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lx0/l;->l:Ljava/util/Set;

    .line 12
    .line 13
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 18
    return-object p1
.end method

.method public final V()V
    .locals 3

    .line 1
    iget-object v0, p0, Lx0/l;->q:Ljava/util/Set;

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
    check-cast v1, Lx0/l$e;

    .line 18
    .line 19
    iget-object v2, v1, Lx0/l$e;->c:Ljava/util/List;

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
    invoke-virtual {p0, v1}, Lx0/h;->D(Ljava/lang/Object;)V

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

.method public final declared-synchronized W(Ljava/util/Set;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lx0/l$d;

    .line 17
    .line 18
    invoke-virtual {v1}, Lx0/l$d;->a()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v0, p0, Lx0/l;->l:Ljava/util/Set;

    .line 25
    .line 26
    invoke-interface {v0, p1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    monitor-exit p0

    .line 30
    return-void

    .line 31
    :goto_1
    monitor-exit p0

    .line 32
    throw p1
.end method

.method public final X(Lx0/l$e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/l;->q:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lx0/h;->E(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public Z(Lx0/l$e;Lx0/x$b;)Lx0/x$b;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p1, Lx0/l$e;->c:Ljava/util/List;

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
    iget-object v1, p1, Lx0/l$e;->c:Ljava/util/List;

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
    iget-wide v3, p2, Lx0/x$b;->d:J

    .line 21
    .line 22
    cmp-long v1, v1, v3

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    iget-object v0, p2, Lx0/x$b;->a:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {p1, v0}, Lx0/l;->b0(Lx0/l$e;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p2, p1}, Lx0/x$b;->a(Ljava/lang/Object;)Lx0/x$b;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    return-object p1
.end method

.method public a()Ld0/u;
    .locals 1

    .line 1
    sget-object v0, Lx0/l;->w:Ld0/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c0()Landroid/os/Handler;
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/l;->m:Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/os/Handler;

    .line 8
    .line 9
    return-object v0
.end method

.method public declared-synchronized d0()I
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lx0/l;->k:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p0

    .line 9
    return v0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    monitor-exit p0

    .line 12
    throw v0
.end method

.method public e(Lx0/v;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/l;->o:Ljava/util/IdentityHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lx0/l$e;

    .line 8
    .line 9
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lx0/l$e;

    .line 14
    .line 15
    iget-object v1, v0, Lx0/l$e;->a:Lx0/t;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Lx0/t;->e(Lx0/v;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, Lx0/l$e;->c:Ljava/util/List;

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
    iget-object p1, p0, Lx0/l;->o:Ljava/util/IdentityHashMap;

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
    invoke-virtual {p0}, Lx0/l;->V()V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p0, v0}, Lx0/l;->g0(Lx0/l$e;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public e0(Lx0/l$e;I)I
    .locals 0

    .line 1
    iget p1, p1, Lx0/l$e;->e:I

    .line 2
    .line 3
    add-int/2addr p2, p1

    .line 4
    return p2
.end method

.method public f(Lx0/x$b;LB0/b;J)Lx0/v;
    .locals 3

    .line 1
    iget-object v0, p1, Lx0/x$b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Lx0/l;->a0(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p1, Lx0/x$b;->a:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {v1}, Lx0/l;->Y(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v1, p0, Lx0/l;->p:Ljava/util/Map;

    .line 18
    .line 19
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lx0/l$e;

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    new-instance v0, Lx0/l$e;

    .line 28
    .line 29
    new-instance v1, Lx0/l$c;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-direct {v1, v2}, Lx0/l$c;-><init>(Lx0/l$a;)V

    .line 33
    .line 34
    .line 35
    iget-boolean v2, p0, Lx0/l;->s:Z

    .line 36
    .line 37
    invoke-direct {v0, v1, v2}, Lx0/l$e;-><init>(Lx0/x;Z)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    iput-boolean v1, v0, Lx0/l$e;->f:Z

    .line 42
    .line 43
    iget-object v1, v0, Lx0/l$e;->a:Lx0/t;

    .line 44
    .line 45
    invoke-virtual {p0, v0, v1}, Lx0/h;->K(Ljava/lang/Object;Lx0/x;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-virtual {p0, v0}, Lx0/l;->X(Lx0/l$e;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, v0, Lx0/l$e;->c:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    iget-object v1, v0, Lx0/l$e;->a:Lx0/t;

    .line 57
    .line 58
    invoke-virtual {v1, p1, p2, p3, p4}, Lx0/t;->W(Lx0/x$b;LB0/b;J)Lx0/s;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-object p2, p0, Lx0/l;->o:Ljava/util/IdentityHashMap;

    .line 63
    .line 64
    invoke-virtual {p2, p1, v0}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Lx0/l;->V()V

    .line 68
    .line 69
    .line 70
    return-object p1
.end method

.method public final f0(Landroid/os/Message;)Z
    .locals 4

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 10
    .line 11
    .line 12
    throw p1

    .line 13
    :pswitch_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {p1}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Ljava/util/Set;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lx0/l;->W(Ljava/util/Set;)V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_4

    .line 25
    .line 26
    :pswitch_1
    invoke-virtual {p0}, Lx0/l;->t0()V

    .line 27
    .line 28
    .line 29
    goto/16 :goto_4

    .line 30
    .line 31
    :pswitch_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {p1}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lx0/l$f;

    .line 38
    .line 39
    iget-object v0, p1, Lx0/l$f;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lx0/T;

    .line 42
    .line 43
    iput-object v0, p0, Lx0/l;->v:Lx0/T;

    .line 44
    .line 45
    :cond_0
    :goto_0
    iget-object p1, p1, Lx0/l$f;->c:Lx0/l$d;

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lx0/l;->p0(Lx0/l$d;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :pswitch_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-static {p1}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lx0/l$f;

    .line 59
    .line 60
    iget-object v0, p0, Lx0/l;->v:Lx0/T;

    .line 61
    .line 62
    iget v2, p1, Lx0/l$f;->a:I

    .line 63
    .line 64
    add-int/lit8 v3, v2, 0x1

    .line 65
    .line 66
    invoke-interface {v0, v2, v3}, Lx0/T;->b(II)Lx0/T;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p0, Lx0/l;->v:Lx0/T;

    .line 71
    .line 72
    iget-object v2, p1, Lx0/l$f;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, Ljava/lang/Integer;

    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-interface {v0, v2, v1}, Lx0/T;->d(II)Lx0/T;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iput-object v0, p0, Lx0/l;->v:Lx0/T;

    .line 85
    .line 86
    iget v0, p1, Lx0/l$f;->a:I

    .line 87
    .line 88
    iget-object v2, p1, Lx0/l$f;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, Ljava/lang/Integer;

    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    invoke-virtual {p0, v0, v2}, Lx0/l;->i0(II)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-static {p1}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    check-cast p1, Lx0/l$f;

    .line 107
    .line 108
    iget v0, p1, Lx0/l$f;->a:I

    .line 109
    .line 110
    iget-object v2, p1, Lx0/l$f;->b:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v2, Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-nez v0, :cond_1

    .line 119
    .line 120
    iget-object v3, p0, Lx0/l;->v:Lx0/T;

    .line 121
    .line 122
    invoke-interface {v3}, Lx0/T;->a()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-ne v2, v3, :cond_1

    .line 127
    .line 128
    iget-object v3, p0, Lx0/l;->v:Lx0/T;

    .line 129
    .line 130
    invoke-interface {v3}, Lx0/T;->h()Lx0/T;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    :goto_1
    iput-object v3, p0, Lx0/l;->v:Lx0/T;

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_1
    iget-object v3, p0, Lx0/l;->v:Lx0/T;

    .line 138
    .line 139
    invoke-interface {v3, v0, v2}, Lx0/T;->b(II)Lx0/T;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    goto :goto_1

    .line 144
    :goto_2
    sub-int/2addr v2, v1

    .line 145
    :goto_3
    if-lt v2, v0, :cond_0

    .line 146
    .line 147
    invoke-virtual {p0, v2}, Lx0/l;->l0(I)V

    .line 148
    .line 149
    .line 150
    add-int/lit8 v2, v2, -0x1

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :pswitch_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 154
    .line 155
    invoke-static {p1}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    check-cast p1, Lx0/l$f;

    .line 160
    .line 161
    iget-object v0, p0, Lx0/l;->v:Lx0/T;

    .line 162
    .line 163
    iget v2, p1, Lx0/l$f;->a:I

    .line 164
    .line 165
    iget-object v3, p1, Lx0/l$f;->b:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v3, Ljava/util/Collection;

    .line 168
    .line 169
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    invoke-interface {v0, v2, v3}, Lx0/T;->d(II)Lx0/T;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    iput-object v0, p0, Lx0/l;->v:Lx0/T;

    .line 178
    .line 179
    iget v0, p1, Lx0/l$f;->a:I

    .line 180
    .line 181
    iget-object v2, p1, Lx0/l$f;->b:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v2, Ljava/util/Collection;

    .line 184
    .line 185
    invoke-virtual {p0, v0, v2}, Lx0/l;->R(ILjava/util/Collection;)V

    .line 186
    .line 187
    .line 188
    goto/16 :goto_0

    .line 189
    .line 190
    :goto_4
    return v1

    .line 191
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g0(Lx0/l$e;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Lx0/l$e;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, Lx0/l$e;->c:Ljava/util/List;

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
    iget-object v0, p0, Lx0/l;->q:Ljava/util/Set;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lx0/h;->L(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public declared-synchronized h0(IILandroid/os/Handler;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lx0/l;->j0(IILandroid/os/Handler;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    .line 5
    monitor-exit p0

    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    monitor-exit p0

    .line 9
    throw p1
.end method

.method public i()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final i0(II)V
    .locals 4

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lx0/l;->n:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lx0/l$e;

    .line 16
    .line 17
    iget v2, v2, Lx0/l$e;->e:I

    .line 18
    .line 19
    iget-object v3, p0, Lx0/l;->n:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v3, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lx0/l$e;

    .line 26
    .line 27
    invoke-interface {v3, p2, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    if-gt v0, v1, :cond_0

    .line 31
    .line 32
    iget-object p1, p0, Lx0/l;->n:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lx0/l$e;

    .line 39
    .line 40
    iput v0, p1, Lx0/l$e;->d:I

    .line 41
    .line 42
    iput v2, p1, Lx0/l$e;->e:I

    .line 43
    .line 44
    iget-object p1, p1, Lx0/l$e;->a:Lx0/t;

    .line 45
    .line 46
    invoke-virtual {p1}, Lx0/t;->Z()Ld0/I;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Ld0/I;->p()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    add-int/2addr v2, p1

    .line 55
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    return-void
.end method

.method public declared-synchronized j()Ld0/I;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lx0/l;->v:Lx0/T;

    .line 3
    .line 4
    invoke-interface {v0}, Lx0/T;->a()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, Lx0/l;->k:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lx0/l;->v:Lx0/T;

    .line 17
    .line 18
    invoke-interface {v0}, Lx0/T;->h()Lx0/T;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lx0/l;->k:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-interface {v0, v2, v1}, Lx0/T;->d(II)Lx0/T;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    iget-object v0, p0, Lx0/l;->v:Lx0/T;

    .line 37
    .line 38
    :goto_0
    new-instance v1, Lx0/l$b;

    .line 39
    .line 40
    iget-object v2, p0, Lx0/l;->k:Ljava/util/List;

    .line 41
    .line 42
    iget-boolean v3, p0, Lx0/l;->r:Z

    .line 43
    .line 44
    invoke-direct {v1, v2, v0, v3}, Lx0/l$b;-><init>(Ljava/util/Collection;Lx0/T;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    monitor-exit p0

    .line 48
    return-object v1

    .line 49
    :goto_1
    monitor-exit p0

    .line 50
    throw v0
.end method

.method public final j0(IILandroid/os/Handler;Ljava/lang/Runnable;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    move v2, v1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v2, v0

    .line 8
    :goto_0
    if-nez p4, :cond_1

    .line 9
    .line 10
    move v3, v1

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    move v3, v0

    .line 13
    :goto_1
    if-ne v2, v3, :cond_2

    .line 14
    .line 15
    move v0, v1

    .line 16
    :cond_2
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lx0/l;->m:Landroid/os/Handler;

    .line 20
    .line 21
    iget-object v1, p0, Lx0/l;->k:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v1, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lx0/l$e;

    .line 28
    .line 29
    invoke-interface {v1, p2, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-virtual {p0, p3, p4}, Lx0/l;->U(Landroid/os/Handler;Ljava/lang/Runnable;)Lx0/l$d;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    new-instance p4, Lx0/l$f;

    .line 39
    .line 40
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-direct {p4, p1, p2, p3}, Lx0/l$f;-><init>(ILjava/lang/Object;Lx0/l$d;)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x3

    .line 48
    invoke-virtual {v0, p1, p4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    if-eqz p4, :cond_4

    .line 57
    .line 58
    if-eqz p3, :cond_4

    .line 59
    .line 60
    invoke-virtual {p3, p4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 61
    .line 62
    .line 63
    :cond_4
    :goto_2
    return-void
.end method

.method public k0(Lx0/l$e;Lx0/x;Ld0/I;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p3}, Lx0/l;->s0(Lx0/l$e;Ld0/I;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final l0(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lx0/l;->n:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lx0/l$e;

    .line 8
    .line 9
    iget-object v1, p0, Lx0/l;->p:Ljava/util/Map;

    .line 10
    .line 11
    iget-object v2, v0, Lx0/l$e;->b:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, Lx0/l$e;->a:Lx0/t;

    .line 17
    .line 18
    invoke-virtual {v1}, Lx0/t;->Z()Ld0/I;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ld0/I;->p()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    neg-int v1, v1

    .line 27
    const/4 v2, -0x1

    .line 28
    invoke-virtual {p0, p1, v2, v1}, Lx0/l;->T(III)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    iput-boolean p1, v0, Lx0/l$e;->f:Z

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lx0/l;->g0(Lx0/l$e;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public declared-synchronized m0(IILandroid/os/Handler;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lx0/l;->n0(IILandroid/os/Handler;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    .line 5
    monitor-exit p0

    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    monitor-exit p0

    .line 9
    throw p1
.end method

.method public final n0(IILandroid/os/Handler;Ljava/lang/Runnable;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    move v2, v1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v2, v0

    .line 8
    :goto_0
    if-nez p4, :cond_1

    .line 9
    .line 10
    move v3, v1

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    move v3, v0

    .line 13
    :goto_1
    if-ne v2, v3, :cond_2

    .line 14
    .line 15
    move v0, v1

    .line 16
    :cond_2
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lx0/l;->m:Landroid/os/Handler;

    .line 20
    .line 21
    iget-object v1, p0, Lx0/l;->k:Ljava/util/List;

    .line 22
    .line 23
    invoke-static {v1, p1, p2}, Lg0/M;->U0(Ljava/util/List;II)V

    .line 24
    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    invoke-virtual {p0, p3, p4}, Lx0/l;->U(Landroid/os/Handler;Ljava/lang/Runnable;)Lx0/l$d;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    new-instance p4, Lx0/l$f;

    .line 33
    .line 34
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-direct {p4, p1, p2, p3}, Lx0/l$f;-><init>(ILjava/lang/Object;Lx0/l$d;)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x2

    .line 42
    invoke-virtual {v0, p1, p4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_3
    if-eqz p4, :cond_4

    .line 51
    .line 52
    if-eqz p3, :cond_4

    .line 53
    .line 54
    invoke-virtual {p3, p4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 55
    .line 56
    .line 57
    :cond_4
    :goto_2
    return-void
.end method

.method public final o0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lx0/l;->p0(Lx0/l$d;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final p0(Lx0/l$d;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lx0/l;->t:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lx0/l;->c0()Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x5

    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lx0/l;->t:Z

    .line 19
    .line 20
    :cond_0
    if-eqz p1, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lx0/l;->u:Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final q0(Lx0/T;Landroid/os/Handler;Ljava/lang/Runnable;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    move v2, v0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v2, v1

    .line 8
    :goto_0
    if-nez p3, :cond_1

    .line 9
    .line 10
    move v3, v0

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    move v3, v1

    .line 13
    :goto_1
    if-ne v2, v3, :cond_2

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_2
    move v0, v1

    .line 17
    :goto_2
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lx0/l;->m:Landroid/os/Handler;

    .line 21
    .line 22
    if-eqz v0, :cond_4

    .line 23
    .line 24
    invoke-virtual {p0}, Lx0/l;->d0()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-interface {p1}, Lx0/T;->a()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eq v3, v2, :cond_3

    .line 33
    .line 34
    invoke-interface {p1}, Lx0/T;->h()Lx0/T;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-interface {p1, v1, v2}, Lx0/T;->d(II)Lx0/T;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :cond_3
    invoke-virtual {p0, p2, p3}, Lx0/l;->U(Landroid/os/Handler;Ljava/lang/Runnable;)Lx0/l$d;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    new-instance p3, Lx0/l$f;

    .line 47
    .line 48
    invoke-direct {p3, v1, p1, p2}, Lx0/l$f;-><init>(ILjava/lang/Object;Lx0/l$d;)V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x4

    .line 52
    invoke-virtual {v0, p1, p3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 57
    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_4
    invoke-interface {p1}, Lx0/T;->a()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-lez v0, :cond_5

    .line 65
    .line 66
    invoke-interface {p1}, Lx0/T;->h()Lx0/T;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    :cond_5
    iput-object p1, p0, Lx0/l;->v:Lx0/T;

    .line 71
    .line 72
    if-eqz p3, :cond_6

    .line 73
    .line 74
    if-eqz p2, :cond_6

    .line 75
    .line 76
    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 77
    .line 78
    .line 79
    :cond_6
    :goto_3
    return-void
.end method

.method public declared-synchronized r0(Lx0/T;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p0, p1, v0, v0}, Lx0/l;->q0(Lx0/T;Landroid/os/Handler;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    monitor-exit p0

    .line 10
    throw p1
.end method

.method public final s0(Lx0/l$e;Ld0/I;)V
    .locals 2

    .line 1
    iget v0, p1, Lx0/l$e;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iget-object v1, p0, Lx0/l;->n:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lx0/l;->n:Ljava/util/List;

    .line 14
    .line 15
    iget v1, p1, Lx0/l$e;->d:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lx0/l$e;

    .line 24
    .line 25
    invoke-virtual {p2}, Ld0/I;->p()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    iget v0, v0, Lx0/l$e;->e:I

    .line 30
    .line 31
    iget v1, p1, Lx0/l$e;->e:I

    .line 32
    .line 33
    sub-int/2addr v0, v1

    .line 34
    sub-int/2addr p2, v0

    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    iget p1, p1, Lx0/l$e;->d:I

    .line 38
    .line 39
    add-int/lit8 p1, p1, 0x1

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-virtual {p0, p1, v0, p2}, Lx0/l;->T(III)V

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {p0}, Lx0/l;->o0()V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final t0()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lx0/l;->t:Z

    .line 3
    .line 4
    iget-object v0, p0, Lx0/l;->u:Ljava/util/Set;

    .line 5
    .line 6
    new-instance v1, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, Lx0/l;->u:Ljava/util/Set;

    .line 12
    .line 13
    new-instance v1, Lx0/l$b;

    .line 14
    .line 15
    iget-object v2, p0, Lx0/l;->n:Ljava/util/List;

    .line 16
    .line 17
    iget-object v3, p0, Lx0/l;->v:Lx0/T;

    .line 18
    .line 19
    iget-boolean v4, p0, Lx0/l;->r:Z

    .line 20
    .line 21
    invoke-direct {v1, v2, v3, v4}, Lx0/l$b;-><init>(Ljava/util/Collection;Lx0/T;Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lx0/a;->A(Ld0/I;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lx0/l;->c0()Landroid/os/Handler;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v2, 0x6

    .line 32
    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public v()V
    .locals 1

    .line 1
    invoke-super {p0}, Lx0/h;->v()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lx0/l;->q:Ljava/util/Set;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public w()V
    .locals 0

    .line 1
    return-void
.end method

.method public declared-synchronized z(Li0/y;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-super {p0, p1}, Lx0/h;->z(Li0/y;)V

    .line 3
    .line 4
    .line 5
    new-instance p1, Landroid/os/Handler;

    .line 6
    .line 7
    new-instance v0, Lx0/k;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lx0/k;-><init>(Lx0/l;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lx0/l;->m:Landroid/os/Handler;

    .line 16
    .line 17
    iget-object p1, p0, Lx0/l;->k:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Lx0/l;->t0()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    iget-object p1, p0, Lx0/l;->v:Lx0/T;

    .line 32
    .line 33
    iget-object v0, p0, Lx0/l;->k:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-interface {p1, v1, v0}, Lx0/T;->d(II)Lx0/T;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Lx0/l;->v:Lx0/T;

    .line 45
    .line 46
    iget-object p1, p0, Lx0/l;->k:Ljava/util/List;

    .line 47
    .line 48
    invoke-virtual {p0, v1, p1}, Lx0/l;->R(ILjava/util/Collection;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lx0/l;->o0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    :goto_0
    monitor-exit p0

    .line 55
    return-void

    .line 56
    :goto_1
    monitor-exit p0

    .line 57
    throw p1
.end method
