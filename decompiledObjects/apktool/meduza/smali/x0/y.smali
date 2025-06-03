.class public abstract Lx0/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx0/y$l;,
        Lx0/y$m;,
        Lx0/y$n;,
        Lx0/y$o;,
        Lx0/y$j;,
        Lx0/y$k;
    }
.end annotation


# instance fields
.field public A:Lx0/y$d;

.field public B:Lx0/y$e;

.field public C:Ld/f;

.field public D:Ld/f;

.field public E:Ld/f;

.field public F:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lx0/y$k;",
            ">;"
        }
    .end annotation
.end field

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lx0/a;",
            ">;"
        }
    .end annotation
.end field

.field public M:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public N:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lx0/i;",
            ">;"
        }
    .end annotation
.end field

.field public O:Lx0/b0;

.field public P:Lx0/y$f;

.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lx0/y$m;",
            ">;"
        }
    .end annotation
.end field

.field public b:Z

.field public final c:Lx0/f0;

.field public d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lx0/a;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lx0/i;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lx0/u;

.field public g:Lb/w;

.field public h:Lx0/a;

.field public final i:Lx0/y$b;

.field public final j:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx0/c;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field public final m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lx0/y$l;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Lx0/v;

.field public final p:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lx0/c0;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Lx0/w;

.field public final r:Lx0/k;

.field public final s:Lx0/l;

.field public final t:Lx0/x;

.field public final u:Lx0/y$c;

.field public v:I

.field public w:Lx0/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx0/t<",
            "*>;"
        }
    .end annotation
.end field

.field public x:Lx0/p;

.field public y:Lx0/i;

.field public z:Lx0/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx0/y;->a:Ljava/util/ArrayList;

    new-instance v0, Lx0/f0;

    invoke-direct {v0}, Lx0/f0;-><init>()V

    iput-object v0, p0, Lx0/y;->c:Lx0/f0;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx0/y;->d:Ljava/util/ArrayList;

    new-instance v0, Lx0/u;

    invoke-direct {v0, p0}, Lx0/u;-><init>(Lx0/y;)V

    iput-object v0, p0, Lx0/y;->f:Lx0/u;

    const/4 v0, 0x0

    iput-object v0, p0, Lx0/y;->h:Lx0/a;

    new-instance v0, Lx0/y$b;

    invoke-direct {v0, p0}, Lx0/y$b;-><init>(Lx0/y;)V

    iput-object v0, p0, Lx0/y;->i:Lx0/y$b;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lx0/y;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lx0/y;->k:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lx0/y;->l:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lx0/y;->m:Ljava/util/Map;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx0/y;->n:Ljava/util/ArrayList;

    new-instance v0, Lx0/v;

    invoke-direct {v0, p0}, Lx0/v;-><init>(Lx0/y;)V

    iput-object v0, p0, Lx0/y;->o:Lx0/v;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lx0/y;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Lx0/w;

    invoke-direct {v0, p0}, Lx0/w;-><init>(Lx0/y;)V

    iput-object v0, p0, Lx0/y;->q:Lx0/w;

    new-instance v0, Lx0/k;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lx0/k;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lx0/y;->r:Lx0/k;

    new-instance v0, Lx0/l;

    invoke-direct {v0, p0, v1}, Lx0/l;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lx0/y;->s:Lx0/l;

    new-instance v0, Lx0/x;

    invoke-direct {v0, p0}, Lx0/x;-><init>(Lx0/y;)V

    iput-object v0, p0, Lx0/y;->t:Lx0/x;

    new-instance v0, Lx0/y$c;

    invoke-direct {v0, p0}, Lx0/y$c;-><init>(Lx0/y;)V

    iput-object v0, p0, Lx0/y;->u:Lx0/y$c;

    const/4 v0, -0x1

    iput v0, p0, Lx0/y;->v:I

    new-instance v0, Lx0/y$d;

    invoke-direct {v0, p0}, Lx0/y$d;-><init>(Lx0/y;)V

    iput-object v0, p0, Lx0/y;->A:Lx0/y$d;

    new-instance v0, Lx0/y$e;

    invoke-direct {v0}, Lx0/y$e;-><init>()V

    iput-object v0, p0, Lx0/y;->B:Lx0/y$e;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lx0/y;->F:Ljava/util/ArrayDeque;

    new-instance v0, Lx0/y$f;

    invoke-direct {v0, p0}, Lx0/y$f;-><init>(Lx0/y;)V

    iput-object v0, p0, Lx0/y;->P:Lx0/y$f;

    return-void
.end method

.method public static G(Lx0/a;)Ljava/util/HashSet;
    .locals 4

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lx0/g0;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lx0/g0;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx0/g0$a;

    iget-object v2, v2, Lx0/g0$a;->b:Lx0/i;

    if-eqz v2, :cond_0

    iget-boolean v3, p0, Lx0/g0;->g:Z

    if-eqz v3, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static L(I)Z
    .locals 1

    const-string v0, "FragmentManager"

    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static M(Lx0/i;)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lx0/i;->mHasMenu:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lx0/i;->mMenuVisible:Z

    .line 8
    .line 9
    if-nez v0, :cond_5

    .line 10
    .line 11
    :cond_0
    iget-object p0, p0, Lx0/i;->mChildFragmentManager:Lx0/y;

    .line 12
    .line 13
    iget-object p0, p0, Lx0/y;->c:Lx0/f0;

    .line 14
    .line 15
    invoke-virtual {p0}, Lx0/f0;->f()Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    move v0, v2

    .line 24
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_3

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lx0/i;

    .line 35
    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    invoke-static {v3}, Lx0/y;->M(Lx0/i;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    :cond_2
    if-eqz v0, :cond_1

    .line 43
    .line 44
    move p0, v1

    .line 45
    goto :goto_0

    .line 46
    :cond_3
    move p0, v2

    .line 47
    :goto_0
    if-eqz p0, :cond_4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    move v1, v2

    .line 51
    :cond_5
    :goto_1
    return v1
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public static O(Lx0/i;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Lx0/i;->mFragmentManager:Lx0/y;

    .line 6
    .line 7
    iget-object v2, v1, Lx0/y;->z:Lx0/i;

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Lx0/i;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    iget-object p0, v1, Lx0/y;->y:Lx0/i;

    .line 16
    .line 17
    invoke-static {p0}, Lx0/y;->O(Lx0/i;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    :goto_0
    return v0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public static c0(Lx0/i;)V
    .locals 2

    const/4 v0, 0x2

    invoke-static {v0}, Lx0/y;->L(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "show: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, p0, Lx0/i;->mHidden:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lx0/i;->mHidden:Z

    iget-boolean v0, p0, Lx0/i;->mHiddenChanged:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lx0/i;->mHiddenChanged:Z

    :cond_1
    return-void
.end method


# virtual methods
.method public final A(Z)Z
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, Lx0/y;->z(Z)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    :goto_0
    iget-object v2, p0, Lx0/y;->L:Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v3, p0, Lx0/y;->M:Ljava/util/ArrayList;

    .line 10
    .line 11
    iget-object v4, p0, Lx0/y;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    monitor-enter v4

    .line 14
    :try_start_0
    iget-object v5, p0, Lx0/y;->a:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 23
    move v7, v0

    .line 24
    goto :goto_2

    .line 25
    :cond_0
    :try_start_1
    iget-object v5, p0, Lx0/y;->a:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    move v6, v0

    .line 32
    move v7, v6

    .line 33
    :goto_1
    if-ge v6, v5, :cond_1

    .line 34
    .line 35
    iget-object v8, p0, Lx0/y;->a:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    check-cast v8, Lx0/y$m;

    .line 42
    .line 43
    invoke-interface {v8, v2, v3}, Lx0/y$m;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 44
    .line 45
    .line 46
    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 47
    or-int/2addr v7, v8

    .line 48
    add-int/lit8 v6, v6, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    :try_start_2
    iget-object v2, p0, Lx0/y;->a:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 54
    .line 55
    .line 56
    iget-object v2, p0, Lx0/y;->w:Lx0/t;

    .line 57
    .line 58
    iget-object v2, v2, Lx0/t;->c:Landroid/os/Handler;

    .line 59
    .line 60
    iget-object v3, p0, Lx0/y;->P:Lx0/y$f;

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 63
    .line 64
    .line 65
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 66
    :goto_2
    if-eqz v7, :cond_2

    .line 67
    .line 68
    iput-boolean p1, p0, Lx0/y;->b:Z

    .line 69
    .line 70
    :try_start_3
    iget-object v1, p0, Lx0/y;->L:Ljava/util/ArrayList;

    .line 71
    .line 72
    iget-object v2, p0, Lx0/y;->M:Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-virtual {p0, v1, v2}, Lx0/y;->U(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lx0/y;->e()V

    .line 78
    .line 79
    .line 80
    move v1, p1

    .line 81
    goto :goto_0

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    invoke-virtual {p0}, Lx0/y;->e()V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_2
    invoke-virtual {p0}, Lx0/y;->f0()V

    .line 88
    .line 89
    .line 90
    iget-boolean p1, p0, Lx0/y;->K:Z

    .line 91
    .line 92
    if-eqz p1, :cond_3

    .line 93
    .line 94
    iput-boolean v0, p0, Lx0/y;->K:Z

    .line 95
    .line 96
    invoke-virtual {p0}, Lx0/y;->d0()V

    .line 97
    .line 98
    .line 99
    :cond_3
    iget-object p1, p0, Lx0/y;->c:Lx0/f0;

    .line 100
    .line 101
    invoke-virtual {p1}, Lx0/f0;->b()V

    .line 102
    .line 103
    .line 104
    return v1

    .line 105
    :catchall_1
    move-exception p1

    .line 106
    :try_start_4
    iget-object v0, p0, Lx0/y;->a:Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, Lx0/y;->w:Lx0/t;

    .line 112
    .line 113
    iget-object v0, v0, Lx0/t;->c:Landroid/os/Handler;

    .line 114
    .line 115
    iget-object v1, p0, Lx0/y;->P:Lx0/y$f;

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 118
    .line 119
    .line 120
    throw p1

    .line 121
    :catchall_2
    move-exception p1

    .line 122
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 123
    throw p1
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method

.method public final B(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lx0/a;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    check-cast v5, Lx0/a;

    .line 16
    .line 17
    iget-boolean v5, v5, Lx0/g0;->o:Z

    .line 18
    .line 19
    iget-object v6, v0, Lx0/y;->N:Ljava/util/ArrayList;

    .line 20
    .line 21
    if-nez v6, :cond_0

    .line 22
    .line 23
    new-instance v6, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v6, v0, Lx0/y;->N:Ljava/util/ArrayList;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 32
    .line 33
    .line 34
    :goto_0
    iget-object v6, v0, Lx0/y;->N:Ljava/util/ArrayList;

    .line 35
    .line 36
    iget-object v7, v0, Lx0/y;->c:Lx0/f0;

    .line 37
    .line 38
    invoke-virtual {v7}, Lx0/f0;->g()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 43
    .line 44
    .line 45
    iget-object v6, v0, Lx0/y;->z:Lx0/i;

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    move v8, v3

    .line 49
    :goto_1
    const/4 v9, 0x1

    .line 50
    if-ge v8, v4, :cond_12

    .line 51
    .line 52
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    check-cast v10, Lx0/a;

    .line 57
    .line 58
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v11

    .line 62
    check-cast v11, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v11

    .line 68
    const/4 v12, 0x3

    .line 69
    if-nez v11, :cond_c

    .line 70
    .line 71
    iget-object v11, v0, Lx0/y;->N:Ljava/util/ArrayList;

    .line 72
    .line 73
    const/4 v13, 0x0

    .line 74
    :goto_2
    iget-object v14, v10, Lx0/g0;->a:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 77
    .line 78
    .line 79
    move-result v14

    .line 80
    if-ge v13, v14, :cond_f

    .line 81
    .line 82
    iget-object v14, v10, Lx0/g0;->a:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v14

    .line 88
    check-cast v14, Lx0/g0$a;

    .line 89
    .line 90
    iget v15, v14, Lx0/g0$a;->a:I

    .line 91
    .line 92
    if-eq v15, v9, :cond_b

    .line 93
    .line 94
    const/4 v9, 0x2

    .line 95
    const/16 v3, 0x9

    .line 96
    .line 97
    if-eq v15, v9, :cond_4

    .line 98
    .line 99
    if-eq v15, v12, :cond_3

    .line 100
    .line 101
    const/4 v9, 0x6

    .line 102
    if-eq v15, v9, :cond_3

    .line 103
    .line 104
    const/4 v9, 0x7

    .line 105
    if-eq v15, v9, :cond_2

    .line 106
    .line 107
    const/16 v9, 0x8

    .line 108
    .line 109
    if-eq v15, v9, :cond_1

    .line 110
    .line 111
    goto/16 :goto_7

    .line 112
    .line 113
    :cond_1
    iget-object v9, v10, Lx0/g0;->a:Ljava/util/ArrayList;

    .line 114
    .line 115
    new-instance v12, Lx0/g0$a;

    .line 116
    .line 117
    invoke-direct {v12, v3, v6}, Lx0/g0$a;-><init>(ILx0/i;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v9, v13, v12}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    const/4 v3, 0x1

    .line 124
    iput-boolean v3, v14, Lx0/g0$a;->c:Z

    .line 125
    .line 126
    add-int/lit8 v13, v13, 0x1

    .line 127
    .line 128
    iget-object v6, v14, Lx0/g0$a;->b:Lx0/i;

    .line 129
    .line 130
    goto/16 :goto_7

    .line 131
    .line 132
    :cond_2
    const/4 v9, 0x1

    .line 133
    goto/16 :goto_9

    .line 134
    .line 135
    :cond_3
    iget-object v9, v14, Lx0/g0$a;->b:Lx0/i;

    .line 136
    .line 137
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    iget-object v9, v14, Lx0/g0$a;->b:Lx0/i;

    .line 141
    .line 142
    if-ne v9, v6, :cond_9

    .line 143
    .line 144
    iget-object v6, v10, Lx0/g0;->a:Ljava/util/ArrayList;

    .line 145
    .line 146
    new-instance v12, Lx0/g0$a;

    .line 147
    .line 148
    invoke-direct {v12, v9, v3}, Lx0/g0$a;-><init>(Lx0/i;I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v6, v13, v12}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    add-int/lit8 v13, v13, 0x1

    .line 155
    .line 156
    const/4 v3, 0x1

    .line 157
    const/4 v6, 0x0

    .line 158
    move v9, v3

    .line 159
    goto/16 :goto_a

    .line 160
    .line 161
    :cond_4
    iget-object v3, v14, Lx0/g0$a;->b:Lx0/i;

    .line 162
    .line 163
    iget v9, v3, Lx0/i;->mContainerId:I

    .line 164
    .line 165
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 166
    .line 167
    .line 168
    move-result v12

    .line 169
    add-int/lit8 v12, v12, -0x1

    .line 170
    .line 171
    const/4 v15, 0x0

    .line 172
    :goto_3
    if-ltz v12, :cond_8

    .line 173
    .line 174
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v16

    .line 178
    move-object/from16 v2, v16

    .line 179
    .line 180
    check-cast v2, Lx0/i;

    .line 181
    .line 182
    iget v1, v2, Lx0/i;->mContainerId:I

    .line 183
    .line 184
    if-ne v1, v9, :cond_7

    .line 185
    .line 186
    if-ne v2, v3, :cond_5

    .line 187
    .line 188
    const/4 v1, 0x1

    .line 189
    move v15, v1

    .line 190
    goto :goto_5

    .line 191
    :cond_5
    if-ne v2, v6, :cond_6

    .line 192
    .line 193
    iget-object v1, v10, Lx0/g0;->a:Ljava/util/ArrayList;

    .line 194
    .line 195
    new-instance v6, Lx0/g0$a;

    .line 196
    .line 197
    move/from16 v16, v9

    .line 198
    .line 199
    const/16 v9, 0x9

    .line 200
    .line 201
    invoke-direct {v6, v9, v2}, Lx0/g0$a;-><init>(ILx0/i;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v13, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    add-int/lit8 v13, v13, 0x1

    .line 208
    .line 209
    const/4 v6, 0x0

    .line 210
    goto :goto_4

    .line 211
    :cond_6
    move/from16 v16, v9

    .line 212
    .line 213
    :goto_4
    new-instance v1, Lx0/g0$a;

    .line 214
    .line 215
    const/4 v9, 0x3

    .line 216
    invoke-direct {v1, v9, v2}, Lx0/g0$a;-><init>(ILx0/i;)V

    .line 217
    .line 218
    .line 219
    iget v9, v14, Lx0/g0$a;->d:I

    .line 220
    .line 221
    iput v9, v1, Lx0/g0$a;->d:I

    .line 222
    .line 223
    iget v9, v14, Lx0/g0$a;->f:I

    .line 224
    .line 225
    iput v9, v1, Lx0/g0$a;->f:I

    .line 226
    .line 227
    iget v9, v14, Lx0/g0$a;->e:I

    .line 228
    .line 229
    iput v9, v1, Lx0/g0$a;->e:I

    .line 230
    .line 231
    iget v9, v14, Lx0/g0$a;->g:I

    .line 232
    .line 233
    iput v9, v1, Lx0/g0$a;->g:I

    .line 234
    .line 235
    iget-object v9, v10, Lx0/g0;->a:Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-virtual {v9, v13, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    add-int/lit8 v13, v13, 0x1

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_7
    :goto_5
    move/from16 v16, v9

    .line 247
    .line 248
    :goto_6
    add-int/lit8 v12, v12, -0x1

    .line 249
    .line 250
    move-object/from16 v1, p1

    .line 251
    .line 252
    move-object/from16 v2, p2

    .line 253
    .line 254
    move/from16 v9, v16

    .line 255
    .line 256
    goto :goto_3

    .line 257
    :cond_8
    if-eqz v15, :cond_a

    .line 258
    .line 259
    iget-object v1, v10, Lx0/g0;->a:Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    add-int/lit8 v13, v13, -0x1

    .line 265
    .line 266
    :cond_9
    :goto_7
    const/4 v1, 0x1

    .line 267
    :goto_8
    move v9, v1

    .line 268
    goto :goto_a

    .line 269
    :cond_a
    const/4 v1, 0x1

    .line 270
    iput v1, v14, Lx0/g0$a;->a:I

    .line 271
    .line 272
    iput-boolean v1, v14, Lx0/g0$a;->c:Z

    .line 273
    .line 274
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    goto :goto_8

    .line 278
    :cond_b
    :goto_9
    iget-object v1, v14, Lx0/g0$a;->b:Lx0/i;

    .line 279
    .line 280
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    :goto_a
    add-int/2addr v13, v9

    .line 284
    const/4 v12, 0x3

    .line 285
    move-object/from16 v1, p1

    .line 286
    .line 287
    move-object/from16 v2, p2

    .line 288
    .line 289
    move/from16 v3, p3

    .line 290
    .line 291
    goto/16 :goto_2

    .line 292
    .line 293
    :cond_c
    iget-object v1, v0, Lx0/y;->N:Ljava/util/ArrayList;

    .line 294
    .line 295
    iget-object v2, v10, Lx0/g0;->a:Ljava/util/ArrayList;

    .line 296
    .line 297
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    sub-int/2addr v2, v9

    .line 302
    :goto_b
    if-ltz v2, :cond_f

    .line 303
    .line 304
    iget-object v3, v10, Lx0/g0;->a:Ljava/util/ArrayList;

    .line 305
    .line 306
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    check-cast v3, Lx0/g0$a;

    .line 311
    .line 312
    iget v11, v3, Lx0/g0$a;->a:I

    .line 313
    .line 314
    if-eq v11, v9, :cond_e

    .line 315
    .line 316
    const/4 v9, 0x3

    .line 317
    if-eq v11, v9, :cond_d

    .line 318
    .line 319
    packed-switch v11, :pswitch_data_0

    .line 320
    .line 321
    .line 322
    goto :goto_d

    .line 323
    :pswitch_0
    iget-object v9, v3, Lx0/g0$a;->h:Lb1/k$b;

    .line 324
    .line 325
    iput-object v9, v3, Lx0/g0$a;->i:Lb1/k$b;

    .line 326
    .line 327
    goto :goto_d

    .line 328
    :pswitch_1
    iget-object v3, v3, Lx0/g0$a;->b:Lx0/i;

    .line 329
    .line 330
    goto :goto_c

    .line 331
    :pswitch_2
    const/4 v3, 0x0

    .line 332
    :goto_c
    move-object v6, v3

    .line 333
    goto :goto_d

    .line 334
    :cond_d
    :pswitch_3
    iget-object v3, v3, Lx0/g0$a;->b:Lx0/i;

    .line 335
    .line 336
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    goto :goto_d

    .line 340
    :cond_e
    :pswitch_4
    iget-object v3, v3, Lx0/g0$a;->b:Lx0/i;

    .line 341
    .line 342
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    :goto_d
    add-int/lit8 v2, v2, -0x1

    .line 346
    .line 347
    const/4 v9, 0x1

    .line 348
    goto :goto_b

    .line 349
    :cond_f
    if-nez v7, :cond_11

    .line 350
    .line 351
    iget-boolean v1, v10, Lx0/g0;->g:Z

    .line 352
    .line 353
    if-eqz v1, :cond_10

    .line 354
    .line 355
    goto :goto_e

    .line 356
    :cond_10
    const/4 v1, 0x0

    .line 357
    goto :goto_f

    .line 358
    :cond_11
    :goto_e
    const/4 v1, 0x1

    .line 359
    :goto_f
    move v7, v1

    .line 360
    add-int/lit8 v8, v8, 0x1

    .line 361
    .line 362
    move-object/from16 v1, p1

    .line 363
    .line 364
    move-object/from16 v2, p2

    .line 365
    .line 366
    move/from16 v3, p3

    .line 367
    .line 368
    goto/16 :goto_1

    .line 369
    .line 370
    :cond_12
    iget-object v1, v0, Lx0/y;->N:Ljava/util/ArrayList;

    .line 371
    .line 372
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 373
    .line 374
    .line 375
    if-nez v5, :cond_15

    .line 376
    .line 377
    iget v1, v0, Lx0/y;->v:I

    .line 378
    .line 379
    const/4 v2, 0x1

    .line 380
    if-lt v1, v2, :cond_15

    .line 381
    .line 382
    move/from16 v1, p3

    .line 383
    .line 384
    :goto_10
    if-ge v1, v4, :cond_15

    .line 385
    .line 386
    move-object/from16 v2, p1

    .line 387
    .line 388
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    check-cast v3, Lx0/a;

    .line 393
    .line 394
    iget-object v3, v3, Lx0/g0;->a:Ljava/util/ArrayList;

    .line 395
    .line 396
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    :cond_13
    :goto_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 401
    .line 402
    .line 403
    move-result v5

    .line 404
    if-eqz v5, :cond_14

    .line 405
    .line 406
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v5

    .line 410
    check-cast v5, Lx0/g0$a;

    .line 411
    .line 412
    iget-object v5, v5, Lx0/g0$a;->b:Lx0/i;

    .line 413
    .line 414
    if-eqz v5, :cond_13

    .line 415
    .line 416
    iget-object v6, v5, Lx0/i;->mFragmentManager:Lx0/y;

    .line 417
    .line 418
    if-eqz v6, :cond_13

    .line 419
    .line 420
    invoke-virtual {v0, v5}, Lx0/y;->h(Lx0/i;)Lx0/e0;

    .line 421
    .line 422
    .line 423
    move-result-object v5

    .line 424
    iget-object v6, v0, Lx0/y;->c:Lx0/f0;

    .line 425
    .line 426
    invoke-virtual {v6, v5}, Lx0/f0;->h(Lx0/e0;)V

    .line 427
    .line 428
    .line 429
    goto :goto_11

    .line 430
    :cond_14
    add-int/lit8 v1, v1, 0x1

    .line 431
    .line 432
    goto :goto_10

    .line 433
    :cond_15
    move-object/from16 v2, p1

    .line 434
    .line 435
    move/from16 v1, p3

    .line 436
    .line 437
    :goto_12
    if-ge v1, v4, :cond_1e

    .line 438
    .line 439
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    check-cast v3, Lx0/a;

    .line 444
    .line 445
    move-object/from16 v5, p2

    .line 446
    .line 447
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v6

    .line 451
    check-cast v6, Ljava/lang/Boolean;

    .line 452
    .line 453
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 454
    .line 455
    .line 456
    move-result v6

    .line 457
    const-string v8, "Unknown cmd: "

    .line 458
    .line 459
    if-eqz v6, :cond_1b

    .line 460
    .line 461
    const/4 v6, -0x1

    .line 462
    invoke-virtual {v3, v6}, Lx0/a;->c(I)V

    .line 463
    .line 464
    .line 465
    iget-object v6, v3, Lx0/g0;->a:Ljava/util/ArrayList;

    .line 466
    .line 467
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 468
    .line 469
    .line 470
    move-result v6

    .line 471
    const/4 v9, 0x1

    .line 472
    sub-int/2addr v6, v9

    .line 473
    :goto_13
    if-ltz v6, :cond_1d

    .line 474
    .line 475
    iget-object v10, v3, Lx0/g0;->a:Ljava/util/ArrayList;

    .line 476
    .line 477
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v10

    .line 481
    check-cast v10, Lx0/g0$a;

    .line 482
    .line 483
    iget-object v11, v10, Lx0/g0$a;->b:Lx0/i;

    .line 484
    .line 485
    if-eqz v11, :cond_1a

    .line 486
    .line 487
    const/4 v12, 0x0

    .line 488
    iput-boolean v12, v11, Lx0/i;->mBeingSaved:Z

    .line 489
    .line 490
    invoke-virtual {v11, v9}, Lx0/i;->setPopDirection(Z)V

    .line 491
    .line 492
    .line 493
    iget v9, v3, Lx0/g0;->f:I

    .line 494
    .line 495
    const/16 v12, 0x2005

    .line 496
    .line 497
    const/16 v13, 0x2002

    .line 498
    .line 499
    const/16 v14, 0x1001

    .line 500
    .line 501
    const/16 v15, 0x1004

    .line 502
    .line 503
    if-eq v9, v14, :cond_18

    .line 504
    .line 505
    if-eq v9, v13, :cond_17

    .line 506
    .line 507
    if-eq v9, v12, :cond_16

    .line 508
    .line 509
    const/16 v13, 0x1003

    .line 510
    .line 511
    if-eq v9, v13, :cond_18

    .line 512
    .line 513
    if-eq v9, v15, :cond_19

    .line 514
    .line 515
    const/4 v12, 0x0

    .line 516
    goto :goto_14

    .line 517
    :cond_16
    move v12, v15

    .line 518
    goto :goto_14

    .line 519
    :cond_17
    move v12, v14

    .line 520
    goto :goto_14

    .line 521
    :cond_18
    move v12, v13

    .line 522
    :cond_19
    :goto_14
    invoke-virtual {v11, v12}, Lx0/i;->setNextTransition(I)V

    .line 523
    .line 524
    .line 525
    iget-object v9, v3, Lx0/g0;->n:Ljava/util/ArrayList;

    .line 526
    .line 527
    iget-object v12, v3, Lx0/g0;->m:Ljava/util/ArrayList;

    .line 528
    .line 529
    invoke-virtual {v11, v9, v12}, Lx0/i;->setSharedElementNames(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 530
    .line 531
    .line 532
    :cond_1a
    iget v9, v10, Lx0/g0$a;->a:I

    .line 533
    .line 534
    packed-switch v9, :pswitch_data_1

    .line 535
    .line 536
    .line 537
    :pswitch_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 538
    .line 539
    invoke-static {v8}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    iget v3, v10, Lx0/g0$a;->a:I

    .line 544
    .line 545
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v2

    .line 552
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    throw v1

    .line 556
    :pswitch_6
    iget-object v9, v3, Lx0/a;->p:Lx0/y;

    .line 557
    .line 558
    iget-object v10, v10, Lx0/g0$a;->h:Lb1/k$b;

    .line 559
    .line 560
    invoke-virtual {v9, v11, v10}, Lx0/y;->Z(Lx0/i;Lb1/k$b;)V

    .line 561
    .line 562
    .line 563
    goto/16 :goto_16

    .line 564
    .line 565
    :pswitch_7
    iget-object v9, v3, Lx0/a;->p:Lx0/y;

    .line 566
    .line 567
    goto :goto_15

    .line 568
    :pswitch_8
    iget-object v9, v3, Lx0/a;->p:Lx0/y;

    .line 569
    .line 570
    const/4 v11, 0x0

    .line 571
    :goto_15
    invoke-virtual {v9, v11}, Lx0/y;->a0(Lx0/i;)V

    .line 572
    .line 573
    .line 574
    goto/16 :goto_16

    .line 575
    .line 576
    :pswitch_9
    iget v9, v10, Lx0/g0$a;->d:I

    .line 577
    .line 578
    iget v12, v10, Lx0/g0$a;->e:I

    .line 579
    .line 580
    iget v13, v10, Lx0/g0$a;->f:I

    .line 581
    .line 582
    iget v10, v10, Lx0/g0$a;->g:I

    .line 583
    .line 584
    invoke-virtual {v11, v9, v12, v13, v10}, Lx0/i;->setAnimations(IIII)V

    .line 585
    .line 586
    .line 587
    iget-object v9, v3, Lx0/a;->p:Lx0/y;

    .line 588
    .line 589
    const/4 v10, 0x1

    .line 590
    invoke-virtual {v9, v11, v10}, Lx0/y;->Y(Lx0/i;Z)V

    .line 591
    .line 592
    .line 593
    iget-object v9, v3, Lx0/a;->p:Lx0/y;

    .line 594
    .line 595
    invoke-virtual {v9, v11}, Lx0/y;->i(Lx0/i;)V

    .line 596
    .line 597
    .line 598
    goto :goto_16

    .line 599
    :pswitch_a
    iget v9, v10, Lx0/g0$a;->d:I

    .line 600
    .line 601
    iget v12, v10, Lx0/g0$a;->e:I

    .line 602
    .line 603
    iget v13, v10, Lx0/g0$a;->f:I

    .line 604
    .line 605
    iget v10, v10, Lx0/g0$a;->g:I

    .line 606
    .line 607
    invoke-virtual {v11, v9, v12, v13, v10}, Lx0/i;->setAnimations(IIII)V

    .line 608
    .line 609
    .line 610
    iget-object v9, v3, Lx0/a;->p:Lx0/y;

    .line 611
    .line 612
    invoke-virtual {v9, v11}, Lx0/y;->d(Lx0/i;)V

    .line 613
    .line 614
    .line 615
    goto :goto_16

    .line 616
    :pswitch_b
    iget v9, v10, Lx0/g0$a;->d:I

    .line 617
    .line 618
    iget v12, v10, Lx0/g0$a;->e:I

    .line 619
    .line 620
    iget v13, v10, Lx0/g0$a;->f:I

    .line 621
    .line 622
    iget v10, v10, Lx0/g0$a;->g:I

    .line 623
    .line 624
    invoke-virtual {v11, v9, v12, v13, v10}, Lx0/i;->setAnimations(IIII)V

    .line 625
    .line 626
    .line 627
    iget-object v9, v3, Lx0/a;->p:Lx0/y;

    .line 628
    .line 629
    const/4 v10, 0x1

    .line 630
    invoke-virtual {v9, v11, v10}, Lx0/y;->Y(Lx0/i;Z)V

    .line 631
    .line 632
    .line 633
    iget-object v9, v3, Lx0/a;->p:Lx0/y;

    .line 634
    .line 635
    invoke-virtual {v9, v11}, Lx0/y;->K(Lx0/i;)V

    .line 636
    .line 637
    .line 638
    goto :goto_16

    .line 639
    :pswitch_c
    iget v9, v10, Lx0/g0$a;->d:I

    .line 640
    .line 641
    iget v12, v10, Lx0/g0$a;->e:I

    .line 642
    .line 643
    iget v13, v10, Lx0/g0$a;->f:I

    .line 644
    .line 645
    iget v10, v10, Lx0/g0$a;->g:I

    .line 646
    .line 647
    invoke-virtual {v11, v9, v12, v13, v10}, Lx0/i;->setAnimations(IIII)V

    .line 648
    .line 649
    .line 650
    iget-object v9, v3, Lx0/a;->p:Lx0/y;

    .line 651
    .line 652
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 653
    .line 654
    .line 655
    invoke-static {v11}, Lx0/y;->c0(Lx0/i;)V

    .line 656
    .line 657
    .line 658
    goto :goto_16

    .line 659
    :pswitch_d
    iget v9, v10, Lx0/g0$a;->d:I

    .line 660
    .line 661
    iget v12, v10, Lx0/g0$a;->e:I

    .line 662
    .line 663
    iget v13, v10, Lx0/g0$a;->f:I

    .line 664
    .line 665
    iget v10, v10, Lx0/g0$a;->g:I

    .line 666
    .line 667
    invoke-virtual {v11, v9, v12, v13, v10}, Lx0/i;->setAnimations(IIII)V

    .line 668
    .line 669
    .line 670
    iget-object v9, v3, Lx0/a;->p:Lx0/y;

    .line 671
    .line 672
    invoke-virtual {v9, v11}, Lx0/y;->a(Lx0/i;)Lx0/e0;

    .line 673
    .line 674
    .line 675
    goto :goto_16

    .line 676
    :pswitch_e
    iget v9, v10, Lx0/g0$a;->d:I

    .line 677
    .line 678
    iget v12, v10, Lx0/g0$a;->e:I

    .line 679
    .line 680
    iget v13, v10, Lx0/g0$a;->f:I

    .line 681
    .line 682
    iget v10, v10, Lx0/g0$a;->g:I

    .line 683
    .line 684
    invoke-virtual {v11, v9, v12, v13, v10}, Lx0/i;->setAnimations(IIII)V

    .line 685
    .line 686
    .line 687
    iget-object v9, v3, Lx0/a;->p:Lx0/y;

    .line 688
    .line 689
    const/4 v10, 0x1

    .line 690
    invoke-virtual {v9, v11, v10}, Lx0/y;->Y(Lx0/i;Z)V

    .line 691
    .line 692
    .line 693
    iget-object v9, v3, Lx0/a;->p:Lx0/y;

    .line 694
    .line 695
    invoke-virtual {v9, v11}, Lx0/y;->T(Lx0/i;)V

    .line 696
    .line 697
    .line 698
    :goto_16
    add-int/lit8 v6, v6, -0x1

    .line 699
    .line 700
    const/4 v9, 0x1

    .line 701
    goto/16 :goto_13

    .line 702
    .line 703
    :cond_1b
    const/4 v6, 0x1

    .line 704
    invoke-virtual {v3, v6}, Lx0/a;->c(I)V

    .line 705
    .line 706
    .line 707
    iget-object v6, v3, Lx0/g0;->a:Ljava/util/ArrayList;

    .line 708
    .line 709
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 710
    .line 711
    .line 712
    move-result v6

    .line 713
    const/4 v9, 0x0

    .line 714
    :goto_17
    if-ge v9, v6, :cond_1d

    .line 715
    .line 716
    iget-object v10, v3, Lx0/g0;->a:Ljava/util/ArrayList;

    .line 717
    .line 718
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v10

    .line 722
    check-cast v10, Lx0/g0$a;

    .line 723
    .line 724
    iget-object v11, v10, Lx0/g0$a;->b:Lx0/i;

    .line 725
    .line 726
    if-eqz v11, :cond_1c

    .line 727
    .line 728
    const/4 v12, 0x0

    .line 729
    iput-boolean v12, v11, Lx0/i;->mBeingSaved:Z

    .line 730
    .line 731
    invoke-virtual {v11, v12}, Lx0/i;->setPopDirection(Z)V

    .line 732
    .line 733
    .line 734
    iget v12, v3, Lx0/g0;->f:I

    .line 735
    .line 736
    invoke-virtual {v11, v12}, Lx0/i;->setNextTransition(I)V

    .line 737
    .line 738
    .line 739
    iget-object v12, v3, Lx0/g0;->m:Ljava/util/ArrayList;

    .line 740
    .line 741
    iget-object v13, v3, Lx0/g0;->n:Ljava/util/ArrayList;

    .line 742
    .line 743
    invoke-virtual {v11, v12, v13}, Lx0/i;->setSharedElementNames(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 744
    .line 745
    .line 746
    :cond_1c
    iget v12, v10, Lx0/g0$a;->a:I

    .line 747
    .line 748
    packed-switch v12, :pswitch_data_2

    .line 749
    .line 750
    .line 751
    :pswitch_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 752
    .line 753
    invoke-static {v8}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 754
    .line 755
    .line 756
    move-result-object v2

    .line 757
    iget v3, v10, Lx0/g0$a;->a:I

    .line 758
    .line 759
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 760
    .line 761
    .line 762
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object v2

    .line 766
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 767
    .line 768
    .line 769
    throw v1

    .line 770
    :pswitch_10
    iget-object v12, v3, Lx0/a;->p:Lx0/y;

    .line 771
    .line 772
    iget-object v10, v10, Lx0/g0$a;->i:Lb1/k$b;

    .line 773
    .line 774
    invoke-virtual {v12, v11, v10}, Lx0/y;->Z(Lx0/i;Lb1/k$b;)V

    .line 775
    .line 776
    .line 777
    goto/16 :goto_19

    .line 778
    .line 779
    :pswitch_11
    iget-object v10, v3, Lx0/a;->p:Lx0/y;

    .line 780
    .line 781
    const/4 v11, 0x0

    .line 782
    goto :goto_18

    .line 783
    :pswitch_12
    iget-object v10, v3, Lx0/a;->p:Lx0/y;

    .line 784
    .line 785
    :goto_18
    invoke-virtual {v10, v11}, Lx0/y;->a0(Lx0/i;)V

    .line 786
    .line 787
    .line 788
    goto/16 :goto_19

    .line 789
    .line 790
    :pswitch_13
    iget v12, v10, Lx0/g0$a;->d:I

    .line 791
    .line 792
    iget v13, v10, Lx0/g0$a;->e:I

    .line 793
    .line 794
    iget v14, v10, Lx0/g0$a;->f:I

    .line 795
    .line 796
    iget v10, v10, Lx0/g0$a;->g:I

    .line 797
    .line 798
    invoke-virtual {v11, v12, v13, v14, v10}, Lx0/i;->setAnimations(IIII)V

    .line 799
    .line 800
    .line 801
    iget-object v10, v3, Lx0/a;->p:Lx0/y;

    .line 802
    .line 803
    const/4 v12, 0x0

    .line 804
    invoke-virtual {v10, v11, v12}, Lx0/y;->Y(Lx0/i;Z)V

    .line 805
    .line 806
    .line 807
    iget-object v10, v3, Lx0/a;->p:Lx0/y;

    .line 808
    .line 809
    invoke-virtual {v10, v11}, Lx0/y;->d(Lx0/i;)V

    .line 810
    .line 811
    .line 812
    goto :goto_19

    .line 813
    :pswitch_14
    iget v12, v10, Lx0/g0$a;->d:I

    .line 814
    .line 815
    iget v13, v10, Lx0/g0$a;->e:I

    .line 816
    .line 817
    iget v14, v10, Lx0/g0$a;->f:I

    .line 818
    .line 819
    iget v10, v10, Lx0/g0$a;->g:I

    .line 820
    .line 821
    invoke-virtual {v11, v12, v13, v14, v10}, Lx0/i;->setAnimations(IIII)V

    .line 822
    .line 823
    .line 824
    iget-object v10, v3, Lx0/a;->p:Lx0/y;

    .line 825
    .line 826
    invoke-virtual {v10, v11}, Lx0/y;->i(Lx0/i;)V

    .line 827
    .line 828
    .line 829
    goto :goto_19

    .line 830
    :pswitch_15
    iget v12, v10, Lx0/g0$a;->d:I

    .line 831
    .line 832
    iget v13, v10, Lx0/g0$a;->e:I

    .line 833
    .line 834
    iget v14, v10, Lx0/g0$a;->f:I

    .line 835
    .line 836
    iget v10, v10, Lx0/g0$a;->g:I

    .line 837
    .line 838
    invoke-virtual {v11, v12, v13, v14, v10}, Lx0/i;->setAnimations(IIII)V

    .line 839
    .line 840
    .line 841
    iget-object v10, v3, Lx0/a;->p:Lx0/y;

    .line 842
    .line 843
    const/4 v12, 0x0

    .line 844
    invoke-virtual {v10, v11, v12}, Lx0/y;->Y(Lx0/i;Z)V

    .line 845
    .line 846
    .line 847
    iget-object v10, v3, Lx0/a;->p:Lx0/y;

    .line 848
    .line 849
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    .line 851
    .line 852
    invoke-static {v11}, Lx0/y;->c0(Lx0/i;)V

    .line 853
    .line 854
    .line 855
    goto :goto_19

    .line 856
    :pswitch_16
    iget v12, v10, Lx0/g0$a;->d:I

    .line 857
    .line 858
    iget v13, v10, Lx0/g0$a;->e:I

    .line 859
    .line 860
    iget v14, v10, Lx0/g0$a;->f:I

    .line 861
    .line 862
    iget v10, v10, Lx0/g0$a;->g:I

    .line 863
    .line 864
    invoke-virtual {v11, v12, v13, v14, v10}, Lx0/i;->setAnimations(IIII)V

    .line 865
    .line 866
    .line 867
    iget-object v10, v3, Lx0/a;->p:Lx0/y;

    .line 868
    .line 869
    invoke-virtual {v10, v11}, Lx0/y;->K(Lx0/i;)V

    .line 870
    .line 871
    .line 872
    goto :goto_19

    .line 873
    :pswitch_17
    iget v12, v10, Lx0/g0$a;->d:I

    .line 874
    .line 875
    iget v13, v10, Lx0/g0$a;->e:I

    .line 876
    .line 877
    iget v14, v10, Lx0/g0$a;->f:I

    .line 878
    .line 879
    iget v10, v10, Lx0/g0$a;->g:I

    .line 880
    .line 881
    invoke-virtual {v11, v12, v13, v14, v10}, Lx0/i;->setAnimations(IIII)V

    .line 882
    .line 883
    .line 884
    iget-object v10, v3, Lx0/a;->p:Lx0/y;

    .line 885
    .line 886
    invoke-virtual {v10, v11}, Lx0/y;->T(Lx0/i;)V

    .line 887
    .line 888
    .line 889
    goto :goto_19

    .line 890
    :pswitch_18
    iget v12, v10, Lx0/g0$a;->d:I

    .line 891
    .line 892
    iget v13, v10, Lx0/g0$a;->e:I

    .line 893
    .line 894
    iget v14, v10, Lx0/g0$a;->f:I

    .line 895
    .line 896
    iget v10, v10, Lx0/g0$a;->g:I

    .line 897
    .line 898
    invoke-virtual {v11, v12, v13, v14, v10}, Lx0/i;->setAnimations(IIII)V

    .line 899
    .line 900
    .line 901
    iget-object v10, v3, Lx0/a;->p:Lx0/y;

    .line 902
    .line 903
    const/4 v12, 0x0

    .line 904
    invoke-virtual {v10, v11, v12}, Lx0/y;->Y(Lx0/i;Z)V

    .line 905
    .line 906
    .line 907
    iget-object v10, v3, Lx0/a;->p:Lx0/y;

    .line 908
    .line 909
    invoke-virtual {v10, v11}, Lx0/y;->a(Lx0/i;)Lx0/e0;

    .line 910
    .line 911
    .line 912
    :goto_19
    add-int/lit8 v9, v9, 0x1

    .line 913
    .line 914
    goto/16 :goto_17

    .line 915
    .line 916
    :cond_1d
    add-int/lit8 v1, v1, 0x1

    .line 917
    .line 918
    goto/16 :goto_12

    .line 919
    .line 920
    :cond_1e
    move-object/from16 v5, p2

    .line 921
    .line 922
    const/4 v1, 0x0

    .line 923
    add-int/lit8 v3, v4, -0x1

    .line 924
    .line 925
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 926
    .line 927
    .line 928
    move-result-object v3

    .line 929
    check-cast v3, Ljava/lang/Boolean;

    .line 930
    .line 931
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 932
    .line 933
    .line 934
    move-result v3

    .line 935
    if-eqz v7, :cond_23

    .line 936
    .line 937
    iget-object v6, v0, Lx0/y;->n:Ljava/util/ArrayList;

    .line 938
    .line 939
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 940
    .line 941
    .line 942
    move-result v6

    .line 943
    if-nez v6, :cond_23

    .line 944
    .line 945
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 946
    .line 947
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 948
    .line 949
    .line 950
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 951
    .line 952
    .line 953
    move-result-object v8

    .line 954
    :goto_1a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 955
    .line 956
    .line 957
    move-result v9

    .line 958
    if-eqz v9, :cond_1f

    .line 959
    .line 960
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    move-result-object v9

    .line 964
    check-cast v9, Lx0/a;

    .line 965
    .line 966
    invoke-static {v9}, Lx0/y;->G(Lx0/a;)Ljava/util/HashSet;

    .line 967
    .line 968
    .line 969
    move-result-object v9

    .line 970
    invoke-interface {v6, v9}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 971
    .line 972
    .line 973
    goto :goto_1a

    .line 974
    :cond_1f
    iget-object v8, v0, Lx0/y;->h:Lx0/a;

    .line 975
    .line 976
    if-nez v8, :cond_23

    .line 977
    .line 978
    iget-object v8, v0, Lx0/y;->n:Ljava/util/ArrayList;

    .line 979
    .line 980
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 981
    .line 982
    .line 983
    move-result-object v8

    .line 984
    :cond_20
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 985
    .line 986
    .line 987
    move-result v9

    .line 988
    if-eqz v9, :cond_21

    .line 989
    .line 990
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 991
    .line 992
    .line 993
    move-result-object v9

    .line 994
    check-cast v9, Lx0/y$l;

    .line 995
    .line 996
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 997
    .line 998
    .line 999
    move-result-object v10

    .line 1000
    :goto_1b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1001
    .line 1002
    .line 1003
    move-result v11

    .line 1004
    if-eqz v11, :cond_20

    .line 1005
    .line 1006
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v11

    .line 1010
    check-cast v11, Lx0/i;

    .line 1011
    .line 1012
    invoke-interface {v9}, Lx0/y$l;->b()V

    .line 1013
    .line 1014
    .line 1015
    goto :goto_1b

    .line 1016
    :cond_21
    iget-object v8, v0, Lx0/y;->n:Ljava/util/ArrayList;

    .line 1017
    .line 1018
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v8

    .line 1022
    :cond_22
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1023
    .line 1024
    .line 1025
    move-result v9

    .line 1026
    if-eqz v9, :cond_23

    .line 1027
    .line 1028
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v9

    .line 1032
    check-cast v9, Lx0/y$l;

    .line 1033
    .line 1034
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v10

    .line 1038
    :goto_1c
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1039
    .line 1040
    .line 1041
    move-result v11

    .line 1042
    if-eqz v11, :cond_22

    .line 1043
    .line 1044
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v11

    .line 1048
    check-cast v11, Lx0/i;

    .line 1049
    .line 1050
    invoke-interface {v9}, Lx0/y$l;->d()V

    .line 1051
    .line 1052
    .line 1053
    goto :goto_1c

    .line 1054
    :cond_23
    move/from16 v6, p3

    .line 1055
    .line 1056
    :goto_1d
    if-ge v6, v4, :cond_28

    .line 1057
    .line 1058
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v8

    .line 1062
    check-cast v8, Lx0/a;

    .line 1063
    .line 1064
    if-eqz v3, :cond_25

    .line 1065
    .line 1066
    iget-object v9, v8, Lx0/g0;->a:Ljava/util/ArrayList;

    .line 1067
    .line 1068
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1069
    .line 1070
    .line 1071
    move-result v9

    .line 1072
    add-int/lit8 v9, v9, -0x1

    .line 1073
    .line 1074
    :goto_1e
    if-ltz v9, :cond_27

    .line 1075
    .line 1076
    iget-object v10, v8, Lx0/g0;->a:Ljava/util/ArrayList;

    .line 1077
    .line 1078
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v10

    .line 1082
    check-cast v10, Lx0/g0$a;

    .line 1083
    .line 1084
    iget-object v10, v10, Lx0/g0$a;->b:Lx0/i;

    .line 1085
    .line 1086
    if-eqz v10, :cond_24

    .line 1087
    .line 1088
    invoke-virtual {v0, v10}, Lx0/y;->h(Lx0/i;)Lx0/e0;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v10

    .line 1092
    invoke-virtual {v10}, Lx0/e0;->k()V

    .line 1093
    .line 1094
    .line 1095
    :cond_24
    add-int/lit8 v9, v9, -0x1

    .line 1096
    .line 1097
    goto :goto_1e

    .line 1098
    :cond_25
    iget-object v8, v8, Lx0/g0;->a:Ljava/util/ArrayList;

    .line 1099
    .line 1100
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v8

    .line 1104
    :cond_26
    :goto_1f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1105
    .line 1106
    .line 1107
    move-result v9

    .line 1108
    if-eqz v9, :cond_27

    .line 1109
    .line 1110
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v9

    .line 1114
    check-cast v9, Lx0/g0$a;

    .line 1115
    .line 1116
    iget-object v9, v9, Lx0/g0$a;->b:Lx0/i;

    .line 1117
    .line 1118
    if-eqz v9, :cond_26

    .line 1119
    .line 1120
    invoke-virtual {v0, v9}, Lx0/y;->h(Lx0/i;)Lx0/e0;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v9

    .line 1124
    invoke-virtual {v9}, Lx0/e0;->k()V

    .line 1125
    .line 1126
    .line 1127
    goto :goto_1f

    .line 1128
    :cond_27
    add-int/lit8 v6, v6, 0x1

    .line 1129
    .line 1130
    goto :goto_1d

    .line 1131
    :cond_28
    iget v6, v0, Lx0/y;->v:I

    .line 1132
    .line 1133
    const/4 v8, 0x1

    .line 1134
    invoke-virtual {v0, v6, v8}, Lx0/y;->P(IZ)V

    .line 1135
    .line 1136
    .line 1137
    move/from16 v6, p3

    .line 1138
    .line 1139
    invoke-virtual {v0, v2, v6, v4}, Lx0/y;->g(Ljava/util/ArrayList;II)Ljava/util/HashSet;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v8

    .line 1143
    invoke-virtual {v8}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v8

    .line 1147
    :goto_20
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1148
    .line 1149
    .line 1150
    move-result v9

    .line 1151
    if-eqz v9, :cond_29

    .line 1152
    .line 1153
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v9

    .line 1157
    check-cast v9, Lx0/r0;

    .line 1158
    .line 1159
    iput-boolean v3, v9, Lx0/r0;->d:Z

    .line 1160
    .line 1161
    invoke-virtual {v9}, Lx0/r0;->n()V

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v9}, Lx0/r0;->i()V

    .line 1165
    .line 1166
    .line 1167
    goto :goto_20

    .line 1168
    :cond_29
    :goto_21
    if-ge v6, v4, :cond_2b

    .line 1169
    .line 1170
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v3

    .line 1174
    check-cast v3, Lx0/a;

    .line 1175
    .line 1176
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v8

    .line 1180
    check-cast v8, Ljava/lang/Boolean;

    .line 1181
    .line 1182
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1183
    .line 1184
    .line 1185
    move-result v8

    .line 1186
    if-eqz v8, :cond_2a

    .line 1187
    .line 1188
    iget v8, v3, Lx0/a;->r:I

    .line 1189
    .line 1190
    if-ltz v8, :cond_2a

    .line 1191
    .line 1192
    const/4 v8, -0x1

    .line 1193
    iput v8, v3, Lx0/a;->r:I

    .line 1194
    .line 1195
    :cond_2a
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1196
    .line 1197
    .line 1198
    add-int/lit8 v6, v6, 0x1

    .line 1199
    .line 1200
    goto :goto_21

    .line 1201
    :cond_2b
    if-eqz v7, :cond_2c

    .line 1202
    .line 1203
    :goto_22
    iget-object v2, v0, Lx0/y;->n:Ljava/util/ArrayList;

    .line 1204
    .line 1205
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1206
    .line 1207
    .line 1208
    move-result v2

    .line 1209
    if-ge v1, v2, :cond_2c

    .line 1210
    .line 1211
    iget-object v2, v0, Lx0/y;->n:Ljava/util/ArrayList;

    .line 1212
    .line 1213
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v2

    .line 1217
    check-cast v2, Lx0/y$l;

    .line 1218
    .line 1219
    invoke-interface {v2}, Lx0/y$l;->onBackStackChanged()V

    .line 1220
    .line 1221
    .line 1222
    add-int/lit8 v1, v1, 0x1

    .line 1223
    .line 1224
    goto :goto_22

    .line 1225
    :cond_2c
    return-void

    .line 1226
    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_5
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_18
        :pswitch_f
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method

.method public final C(Ljava/lang/String;)Lx0/i;
    .locals 1

    iget-object v0, p0, Lx0/y;->c:Lx0/f0;

    invoke-virtual {v0, p1}, Lx0/f0;->c(Ljava/lang/String;)Lx0/i;

    move-result-object p1

    return-object p1
.end method

.method public final D(I)Lx0/i;
    .locals 4

    .line 1
    iget-object v0, p0, Lx0/y;->c:Lx0/f0;

    .line 2
    .line 3
    iget-object v1, v0, Lx0/f0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    if-ltz v1, :cond_1

    .line 14
    .line 15
    iget-object v2, v0, Lx0/f0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lx0/i;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iget v3, v2, Lx0/i;->mFragmentId:I

    .line 28
    .line 29
    if-ne v3, p1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v0, v0, Lx0/f0;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Lx0/e0;

    .line 55
    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    iget-object v2, v1, Lx0/e0;->c:Lx0/i;

    .line 59
    .line 60
    iget v1, v2, Lx0/i;->mFragmentId:I

    .line 61
    .line 62
    if-ne v1, p1, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    const/4 v2, 0x0

    .line 66
    :goto_0
    return-object v2
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final E(Ljava/lang/String;)Lx0/i;
    .locals 4

    .line 1
    iget-object v0, p0, Lx0/y;->c:Lx0/f0;

    .line 2
    .line 3
    iget-object v1, v0, Lx0/f0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    if-ltz v1, :cond_1

    .line 14
    .line 15
    iget-object v2, v0, Lx0/f0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lx0/i;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iget-object v3, v2, Lx0/i;->mTag:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object v0, v0, Lx0/f0;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lx0/e0;

    .line 59
    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    iget-object v2, v1, Lx0/e0;->c:Lx0/i;

    .line 63
    .line 64
    iget-object v1, v2, Lx0/i;->mTag:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    const/4 v2, 0x0

    .line 74
    :goto_0
    return-object v2
    .line 75
    .line 76
    .line 77
.end method

.method public final F()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lx0/y;->f()Ljava/util/HashSet;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lx0/r0;

    .line 20
    .line 21
    iget-boolean v2, v1, Lx0/r0;->e:Z

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-static {v2}, Lx0/y;->L(I)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    const-string v2, "FragmentManager"

    .line 33
    .line 34
    const-string v3, "SpecialEffectsController: Forcing postponed operations"

    .line 35
    .line 36
    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    :cond_1
    const/4 v2, 0x0

    .line 40
    iput-boolean v2, v1, Lx0/r0;->e:Z

    .line 41
    .line 42
    invoke-virtual {v1}, Lx0/r0;->i()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    return-void
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final H(Lx0/i;)Landroid/view/ViewGroup;
    .locals 2

    iget-object v0, p1, Lx0/i;->mContainer:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget v0, p1, Lx0/i;->mContainerId:I

    const/4 v1, 0x0

    if-gtz v0, :cond_1

    return-object v1

    :cond_1
    iget-object v0, p0, Lx0/y;->x:Lx0/p;

    invoke-virtual {v0}, Lx0/p;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lx0/y;->x:Lx0/p;

    iget p1, p1, Lx0/i;->mContainerId:I

    invoke-virtual {v0, p1}, Lx0/p;->b(I)Landroid/view/View;

    move-result-object p1

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/view/ViewGroup;

    return-object p1

    :cond_2
    return-object v1
.end method

.method public final I()Lx0/s;
    .locals 1

    iget-object v0, p0, Lx0/y;->y:Lx0/i;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lx0/i;->mFragmentManager:Lx0/y;

    invoke-virtual {v0}, Lx0/y;->I()Lx0/s;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lx0/y;->A:Lx0/y$d;

    return-object v0
.end method

.method public final J()Lx0/t0;
    .locals 1

    iget-object v0, p0, Lx0/y;->y:Lx0/i;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lx0/i;->mFragmentManager:Lx0/y;

    invoke-virtual {v0}, Lx0/y;->J()Lx0/t0;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lx0/y;->B:Lx0/y$e;

    return-object v0
.end method

.method public final K(Lx0/i;)V
    .locals 2

    const/4 v0, 0x2

    invoke-static {v0}, Lx0/y;->L(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "hide: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, p1, Lx0/i;->mHidden:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p1, Lx0/i;->mHidden:Z

    iget-boolean v1, p1, Lx0/i;->mHiddenChanged:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p1, Lx0/i;->mHiddenChanged:Z

    invoke-virtual {p0, p1}, Lx0/y;->b0(Lx0/i;)V

    :cond_1
    return-void
.end method

.method public final N()Z
    .locals 2

    iget-object v0, p0, Lx0/y;->y:Lx0/i;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Lx0/i;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx0/y;->y:Lx0/i;

    invoke-virtual {v0}, Lx0/i;->getParentFragmentManager()Lx0/y;

    move-result-object v0

    invoke-virtual {v0}, Lx0/y;->N()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final P(IZ)V
    .locals 4

    .line 1
    iget-object v0, p0, Lx0/y;->w:Lx0/t;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string p2, "No activity"

    .line 12
    .line 13
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p1

    .line 17
    :cond_1
    :goto_0
    if-nez p2, :cond_2

    .line 18
    .line 19
    iget p2, p0, Lx0/y;->v:I

    .line 20
    .line 21
    if-ne p1, p2, :cond_2

    .line 22
    .line 23
    return-void

    .line 24
    :cond_2
    iput p1, p0, Lx0/y;->v:I

    .line 25
    .line 26
    iget-object p1, p0, Lx0/y;->c:Lx0/f0;

    .line 27
    .line 28
    iget-object p2, p1, Lx0/f0;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p2, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lx0/i;

    .line 47
    .line 48
    iget-object v1, p1, Lx0/f0;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Ljava/util/HashMap;

    .line 51
    .line 52
    iget-object v0, v0, Lx0/i;->mWho:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Lx0/e0;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    invoke-virtual {v0}, Lx0/e0;->k()V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    iget-object p2, p1, Lx0/f0;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p2, Ljava/util/HashMap;

    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    const/4 v1, 0x0

    .line 83
    if-eqz v0, :cond_8

    .line 84
    .line 85
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Lx0/e0;

    .line 90
    .line 91
    if-eqz v0, :cond_5

    .line 92
    .line 93
    invoke-virtual {v0}, Lx0/e0;->k()V

    .line 94
    .line 95
    .line 96
    iget-object v2, v0, Lx0/e0;->c:Lx0/i;

    .line 97
    .line 98
    iget-boolean v3, v2, Lx0/i;->mRemoving:Z

    .line 99
    .line 100
    if-eqz v3, :cond_6

    .line 101
    .line 102
    invoke-virtual {v2}, Lx0/i;->isInBackStack()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-nez v3, :cond_6

    .line 107
    .line 108
    const/4 v1, 0x1

    .line 109
    :cond_6
    if-eqz v1, :cond_5

    .line 110
    .line 111
    iget-boolean v1, v2, Lx0/i;->mBeingSaved:Z

    .line 112
    .line 113
    if-eqz v1, :cond_7

    .line 114
    .line 115
    iget-object v1, p1, Lx0/f0;->c:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v1, Ljava/util/HashMap;

    .line 118
    .line 119
    iget-object v3, v2, Lx0/i;->mWho:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-nez v1, :cond_7

    .line 126
    .line 127
    iget-object v1, v2, Lx0/i;->mWho:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v0}, Lx0/e0;->o()Landroid/os/Bundle;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {p1, v2, v1}, Lx0/f0;->j(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 134
    .line 135
    .line 136
    :cond_7
    invoke-virtual {p1, v0}, Lx0/f0;->i(Lx0/e0;)V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_8
    invoke-virtual {p0}, Lx0/y;->d0()V

    .line 141
    .line 142
    .line 143
    iget-boolean p1, p0, Lx0/y;->G:Z

    .line 144
    .line 145
    if-eqz p1, :cond_9

    .line 146
    .line 147
    iget-object p1, p0, Lx0/y;->w:Lx0/t;

    .line 148
    .line 149
    if-eqz p1, :cond_9

    .line 150
    .line 151
    iget p2, p0, Lx0/y;->v:I

    .line 152
    .line 153
    const/4 v0, 0x7

    .line 154
    if-ne p2, v0, :cond_9

    .line 155
    .line 156
    invoke-virtual {p1}, Lx0/t;->i()V

    .line 157
    .line 158
    .line 159
    iput-boolean v1, p0, Lx0/y;->G:Z

    .line 160
    .line 161
    :cond_9
    return-void
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
.end method

.method public final Q()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/y;->w:Lx0/t;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lx0/y;->H:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lx0/y;->I:Z

    .line 10
    .line 11
    iget-object v1, p0, Lx0/y;->O:Lx0/b0;

    .line 12
    .line 13
    iput-boolean v0, v1, Lx0/b0;->i:Z

    .line 14
    .line 15
    iget-object v0, p0, Lx0/y;->c:Lx0/f0;

    .line 16
    .line 17
    invoke-virtual {v0}, Lx0/f0;->g()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lx0/i;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {v1}, Lx0/i;->noteStateNotSaved()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final R()Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lx0/y;->A(Z)Z

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v1}, Lx0/y;->z(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, Lx0/y;->z:Lx0/i;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2}, Lx0/i;->getChildFragmentManager()Lx0/y;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Lx0/y;->R()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v2, p0, Lx0/y;->L:Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object v3, p0, Lx0/y;->M:Ljava/util/ArrayList;

    .line 27
    .line 28
    const/4 v4, -0x1

    .line 29
    invoke-virtual {p0, v2, v3, v4, v0}, Lx0/y;->S(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    iput-boolean v1, p0, Lx0/y;->b:Z

    .line 36
    .line 37
    :try_start_0
    iget-object v1, p0, Lx0/y;->L:Ljava/util/ArrayList;

    .line 38
    .line 39
    iget-object v3, p0, Lx0/y;->M:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {p0, v1, v3}, Lx0/y;->U(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lx0/y;->e()V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    invoke-virtual {p0}, Lx0/y;->e()V

    .line 50
    .line 51
    .line 52
    throw v0

    .line 53
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lx0/y;->f0()V

    .line 54
    .line 55
    .line 56
    iget-boolean v1, p0, Lx0/y;->K:Z

    .line 57
    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    iput-boolean v0, p0, Lx0/y;->K:Z

    .line 61
    .line 62
    invoke-virtual {p0}, Lx0/y;->d0()V

    .line 63
    .line 64
    .line 65
    :cond_2
    iget-object v0, p0, Lx0/y;->c:Lx0/f0;

    .line 66
    .line 67
    invoke-virtual {v0}, Lx0/f0;->b()V

    .line 68
    .line 69
    .line 70
    move v1, v2

    .line 71
    :goto_1
    return v1
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final S(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p4, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move p4, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p4, v1

    .line 9
    :goto_0
    iget-object v2, p0, Lx0/y;->d:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, -0x1

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    goto :goto_5

    .line 19
    :cond_1
    if-gez p3, :cond_3

    .line 20
    .line 21
    if-eqz p4, :cond_2

    .line 22
    .line 23
    move v3, v1

    .line 24
    goto :goto_5

    .line 25
    :cond_2
    iget-object p3, p0, Lx0/y;->d:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    add-int/2addr v3, p3

    .line 32
    goto :goto_5

    .line 33
    :cond_3
    iget-object v2, p0, Lx0/y;->d:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    add-int/2addr v2, v3

    .line 40
    :goto_1
    if-ltz v2, :cond_5

    .line 41
    .line 42
    iget-object v4, p0, Lx0/y;->d:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Lx0/a;

    .line 49
    .line 50
    if-ltz p3, :cond_4

    .line 51
    .line 52
    iget v4, v4, Lx0/a;->r:I

    .line 53
    .line 54
    if-ne p3, v4, :cond_4

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_4
    add-int/lit8 v2, v2, -0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_5
    :goto_2
    if-gez v2, :cond_7

    .line 61
    .line 62
    :cond_6
    :goto_3
    move v3, v2

    .line 63
    goto :goto_5

    .line 64
    :cond_7
    if-eqz p4, :cond_8

    .line 65
    .line 66
    :goto_4
    if-lez v2, :cond_6

    .line 67
    .line 68
    iget-object p4, p0, Lx0/y;->d:Ljava/util/ArrayList;

    .line 69
    .line 70
    add-int/lit8 v3, v2, -0x1

    .line 71
    .line 72
    invoke-virtual {p4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p4

    .line 76
    check-cast p4, Lx0/a;

    .line 77
    .line 78
    if-ltz p3, :cond_6

    .line 79
    .line 80
    iget p4, p4, Lx0/a;->r:I

    .line 81
    .line 82
    if-ne p3, p4, :cond_6

    .line 83
    .line 84
    move v2, v3

    .line 85
    goto :goto_4

    .line 86
    :cond_8
    iget-object p3, p0, Lx0/y;->d:Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 89
    .line 90
    .line 91
    move-result p3

    .line 92
    add-int/2addr p3, v3

    .line 93
    if-ne v2, p3, :cond_9

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_9
    add-int/lit8 v2, v2, 0x1

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :goto_5
    if-gez v3, :cond_a

    .line 100
    .line 101
    return v1

    .line 102
    :cond_a
    iget-object p3, p0, Lx0/y;->d:Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 105
    .line 106
    .line 107
    move-result p3

    .line 108
    sub-int/2addr p3, v0

    .line 109
    :goto_6
    if-lt p3, v3, :cond_b

    .line 110
    .line 111
    iget-object p4, p0, Lx0/y;->d:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p4

    .line 117
    check-cast p4, Lx0/a;

    .line 118
    .line 119
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 123
    .line 124
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    add-int/lit8 p3, p3, -0x1

    .line 128
    .line 129
    goto :goto_6

    .line 130
    :cond_b
    return v0
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
.end method

.method public final T(Lx0/i;)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lx0/y;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "remove: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, " nesting="

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget v1, p1, Lx0/i;->mBackStackNesting:I

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "FragmentManager"

    .line 36
    .line 37
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p1}, Lx0/i;->isInBackStack()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v1, 0x1

    .line 45
    xor-int/2addr v0, v1

    .line 46
    iget-boolean v2, p1, Lx0/i;->mDetached:Z

    .line 47
    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    :cond_1
    iget-object v0, p0, Lx0/y;->c:Lx0/f0;

    .line 53
    .line 54
    iget-object v2, v0, Lx0/f0;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Ljava/util/ArrayList;

    .line 57
    .line 58
    monitor-enter v2

    .line 59
    :try_start_0
    iget-object v0, v0, Lx0/f0;->a:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    const/4 v0, 0x0

    .line 68
    iput-boolean v0, p1, Lx0/i;->mAdded:Z

    .line 69
    .line 70
    invoke-static {p1}, Lx0/y;->M(Lx0/i;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    iput-boolean v1, p0, Lx0/y;->G:Z

    .line 77
    .line 78
    :cond_2
    iput-boolean v1, p1, Lx0/i;->mRemoving:Z

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Lx0/y;->b0(Lx0/i;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    return-void

    .line 84
    :catchall_0
    move-exception p1

    .line 85
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    throw p1
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method

.method public final U(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lx0/a;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx0/a;

    iget-boolean v3, v3, Lx0/g0;->o:Z

    if-nez v3, :cond_3

    if-eq v2, v1, :cond_1

    invoke-virtual {p0, p1, p2, v2, v1}, Lx0/y;->B(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_1
    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    if-ge v2, v0, :cond_2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx0/a;

    iget-boolean v3, v3, Lx0/g0;->o:Z

    if-nez v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1, p2, v1, v2}, Lx0/y;->B(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    add-int/lit8 v1, v2, -0x1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    if-eq v2, v0, :cond_5

    invoke-virtual {p0, p1, p2, v2, v0}, Lx0/y;->B(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_5
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Internal error with the back stack records"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final V(Landroid/os/Bundle;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/String;

    .line 24
    .line 25
    const-string v4, "result_"

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    iget-object v5, v0, Lx0/y;->w:Lx0/t;

    .line 40
    .line 41
    iget-object v5, v5, Lx0/t;->b:Landroid/content/Context;

    .line 42
    .line 43
    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 48
    .line 49
    .line 50
    const/4 v5, 0x7

    .line 51
    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iget-object v5, v0, Lx0/y;->l:Ljava/util/Map;

    .line 56
    .line 57
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    new-instance v2, Ljava/util/HashMap;

    .line 62
    .line 63
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual/range {p1 .. p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_3

    .line 79
    .line 80
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Ljava/lang/String;

    .line 85
    .line 86
    const-string v5, "fragment_"

    .line 87
    .line 88
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_2

    .line 93
    .line 94
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    if-eqz v5, :cond_2

    .line 99
    .line 100
    iget-object v6, v0, Lx0/y;->w:Lx0/t;

    .line 101
    .line 102
    iget-object v6, v6, Lx0/t;->b:Landroid/content/Context;

    .line 103
    .line 104
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v5, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 109
    .line 110
    .line 111
    const/16 v6, 0x9

    .line 112
    .line 113
    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    iget-object v3, v0, Lx0/y;->c:Lx0/f0;

    .line 122
    .line 123
    iget-object v4, v3, Lx0/f0;->c:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v4, Ljava/util/HashMap;

    .line 126
    .line 127
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 128
    .line 129
    .line 130
    iget-object v3, v3, Lx0/f0;->c:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v3, Ljava/util/HashMap;

    .line 133
    .line 134
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 135
    .line 136
    .line 137
    const-string v2, "state"

    .line 138
    .line 139
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    check-cast v1, Lx0/a0;

    .line 144
    .line 145
    if-nez v1, :cond_4

    .line 146
    .line 147
    return-void

    .line 148
    :cond_4
    iget-object v3, v0, Lx0/y;->c:Lx0/f0;

    .line 149
    .line 150
    iget-object v3, v3, Lx0/f0;->b:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v3, Ljava/util/HashMap;

    .line 153
    .line 154
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 155
    .line 156
    .line 157
    iget-object v3, v1, Lx0/a0;->a:Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    :cond_5
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    const-string v5, "): "

    .line 168
    .line 169
    const/4 v6, 0x2

    .line 170
    const-string v7, "FragmentManager"

    .line 171
    .line 172
    if-eqz v4, :cond_9

    .line 173
    .line 174
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    check-cast v4, Ljava/lang/String;

    .line 179
    .line 180
    iget-object v8, v0, Lx0/y;->c:Lx0/f0;

    .line 181
    .line 182
    const/4 v9, 0x0

    .line 183
    invoke-virtual {v8, v9, v4}, Lx0/f0;->j(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    if-eqz v4, :cond_5

    .line 188
    .line 189
    invoke-virtual {v4, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    check-cast v8, Lx0/d0;

    .line 194
    .line 195
    iget-object v9, v0, Lx0/y;->O:Lx0/b0;

    .line 196
    .line 197
    iget-object v8, v8, Lx0/d0;->b:Ljava/lang/String;

    .line 198
    .line 199
    iget-object v9, v9, Lx0/b0;->d:Ljava/util/HashMap;

    .line 200
    .line 201
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    check-cast v8, Lx0/i;

    .line 206
    .line 207
    if-eqz v8, :cond_7

    .line 208
    .line 209
    invoke-static {v6}, Lx0/y;->L(I)Z

    .line 210
    .line 211
    .line 212
    move-result v9

    .line 213
    if-eqz v9, :cond_6

    .line 214
    .line 215
    new-instance v9, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 218
    .line 219
    .line 220
    const-string v10, "restoreSaveState: re-attaching retained "

    .line 221
    .line 222
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v9

    .line 232
    invoke-static {v7, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 233
    .line 234
    .line 235
    :cond_6
    new-instance v9, Lx0/e0;

    .line 236
    .line 237
    iget-object v10, v0, Lx0/y;->o:Lx0/v;

    .line 238
    .line 239
    iget-object v11, v0, Lx0/y;->c:Lx0/f0;

    .line 240
    .line 241
    invoke-direct {v9, v10, v11, v8, v4}, Lx0/e0;-><init>(Lx0/v;Lx0/f0;Lx0/i;Landroid/os/Bundle;)V

    .line 242
    .line 243
    .line 244
    goto :goto_3

    .line 245
    :cond_7
    new-instance v9, Lx0/e0;

    .line 246
    .line 247
    iget-object v11, v0, Lx0/y;->o:Lx0/v;

    .line 248
    .line 249
    iget-object v12, v0, Lx0/y;->c:Lx0/f0;

    .line 250
    .line 251
    iget-object v8, v0, Lx0/y;->w:Lx0/t;

    .line 252
    .line 253
    iget-object v8, v8, Lx0/t;->b:Landroid/content/Context;

    .line 254
    .line 255
    invoke-virtual {v8}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 256
    .line 257
    .line 258
    move-result-object v13

    .line 259
    invoke-virtual/range {p0 .. p0}, Lx0/y;->I()Lx0/s;

    .line 260
    .line 261
    .line 262
    move-result-object v14

    .line 263
    move-object v10, v9

    .line 264
    move-object v15, v4

    .line 265
    invoke-direct/range {v10 .. v15}, Lx0/e0;-><init>(Lx0/v;Lx0/f0;Ljava/lang/ClassLoader;Lx0/s;Landroid/os/Bundle;)V

    .line 266
    .line 267
    .line 268
    :goto_3
    iget-object v8, v9, Lx0/e0;->c:Lx0/i;

    .line 269
    .line 270
    iput-object v4, v8, Lx0/i;->mSavedFragmentState:Landroid/os/Bundle;

    .line 271
    .line 272
    iput-object v0, v8, Lx0/i;->mFragmentManager:Lx0/y;

    .line 273
    .line 274
    invoke-static {v6}, Lx0/y;->L(I)Z

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    if-eqz v4, :cond_8

    .line 279
    .line 280
    const-string v4, "restoreSaveState: active ("

    .line 281
    .line 282
    invoke-static {v4}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    iget-object v6, v8, Lx0/i;->mWho:Ljava/lang/String;

    .line 287
    .line 288
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    invoke-static {v7, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 302
    .line 303
    .line 304
    :cond_8
    iget-object v4, v0, Lx0/y;->w:Lx0/t;

    .line 305
    .line 306
    iget-object v4, v4, Lx0/t;->b:Landroid/content/Context;

    .line 307
    .line 308
    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    invoke-virtual {v9, v4}, Lx0/e0;->m(Ljava/lang/ClassLoader;)V

    .line 313
    .line 314
    .line 315
    iget-object v4, v0, Lx0/y;->c:Lx0/f0;

    .line 316
    .line 317
    invoke-virtual {v4, v9}, Lx0/f0;->h(Lx0/e0;)V

    .line 318
    .line 319
    .line 320
    iget v4, v0, Lx0/y;->v:I

    .line 321
    .line 322
    iput v4, v9, Lx0/e0;->e:I

    .line 323
    .line 324
    goto/16 :goto_2

    .line 325
    .line 326
    :cond_9
    iget-object v2, v0, Lx0/y;->O:Lx0/b0;

    .line 327
    .line 328
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    new-instance v3, Ljava/util/ArrayList;

    .line 332
    .line 333
    iget-object v2, v2, Lx0/b0;->d:Ljava/util/HashMap;

    .line 334
    .line 335
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    :cond_a
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 347
    .line 348
    .line 349
    move-result v3

    .line 350
    const/4 v4, 0x0

    .line 351
    const/4 v8, 0x1

    .line 352
    if-eqz v3, :cond_d

    .line 353
    .line 354
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    check-cast v3, Lx0/i;

    .line 359
    .line 360
    iget-object v9, v0, Lx0/y;->c:Lx0/f0;

    .line 361
    .line 362
    iget-object v10, v3, Lx0/i;->mWho:Ljava/lang/String;

    .line 363
    .line 364
    iget-object v9, v9, Lx0/f0;->b:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast v9, Ljava/util/HashMap;

    .line 367
    .line 368
    invoke-virtual {v9, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v9

    .line 372
    if-eqz v9, :cond_b

    .line 373
    .line 374
    move v4, v8

    .line 375
    :cond_b
    if-nez v4, :cond_a

    .line 376
    .line 377
    invoke-static {v6}, Lx0/y;->L(I)Z

    .line 378
    .line 379
    .line 380
    move-result v4

    .line 381
    if-eqz v4, :cond_c

    .line 382
    .line 383
    new-instance v4, Ljava/lang/StringBuilder;

    .line 384
    .line 385
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 386
    .line 387
    .line 388
    const-string v9, "Discarding retained Fragment "

    .line 389
    .line 390
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    const-string v9, " that was not found in the set of active Fragments "

    .line 397
    .line 398
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    iget-object v9, v1, Lx0/a0;->a:Ljava/util/ArrayList;

    .line 402
    .line 403
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    invoke-static {v7, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 411
    .line 412
    .line 413
    :cond_c
    iget-object v4, v0, Lx0/y;->O:Lx0/b0;

    .line 414
    .line 415
    invoke-virtual {v4, v3}, Lx0/b0;->g(Lx0/i;)V

    .line 416
    .line 417
    .line 418
    iput-object v0, v3, Lx0/i;->mFragmentManager:Lx0/y;

    .line 419
    .line 420
    new-instance v4, Lx0/e0;

    .line 421
    .line 422
    iget-object v9, v0, Lx0/y;->o:Lx0/v;

    .line 423
    .line 424
    iget-object v10, v0, Lx0/y;->c:Lx0/f0;

    .line 425
    .line 426
    invoke-direct {v4, v9, v10, v3}, Lx0/e0;-><init>(Lx0/v;Lx0/f0;Lx0/i;)V

    .line 427
    .line 428
    .line 429
    iput v8, v4, Lx0/e0;->e:I

    .line 430
    .line 431
    invoke-virtual {v4}, Lx0/e0;->k()V

    .line 432
    .line 433
    .line 434
    iput-boolean v8, v3, Lx0/i;->mRemoving:Z

    .line 435
    .line 436
    invoke-virtual {v4}, Lx0/e0;->k()V

    .line 437
    .line 438
    .line 439
    goto :goto_4

    .line 440
    :cond_d
    iget-object v2, v0, Lx0/y;->c:Lx0/f0;

    .line 441
    .line 442
    iget-object v3, v1, Lx0/a0;->b:Ljava/util/ArrayList;

    .line 443
    .line 444
    iget-object v9, v2, Lx0/f0;->a:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v9, Ljava/util/ArrayList;

    .line 447
    .line 448
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    .line 449
    .line 450
    .line 451
    if-eqz v3, :cond_10

    .line 452
    .line 453
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 454
    .line 455
    .line 456
    move-result-object v3

    .line 457
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 458
    .line 459
    .line 460
    move-result v9

    .line 461
    if-eqz v9, :cond_10

    .line 462
    .line 463
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v9

    .line 467
    check-cast v9, Ljava/lang/String;

    .line 468
    .line 469
    invoke-virtual {v2, v9}, Lx0/f0;->c(Ljava/lang/String;)Lx0/i;

    .line 470
    .line 471
    .line 472
    move-result-object v10

    .line 473
    if-eqz v10, :cond_f

    .line 474
    .line 475
    invoke-static {v6}, Lx0/y;->L(I)Z

    .line 476
    .line 477
    .line 478
    move-result v11

    .line 479
    if-eqz v11, :cond_e

    .line 480
    .line 481
    new-instance v11, Ljava/lang/StringBuilder;

    .line 482
    .line 483
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 484
    .line 485
    .line 486
    const-string v12, "restoreSaveState: added ("

    .line 487
    .line 488
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v9

    .line 504
    invoke-static {v7, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 505
    .line 506
    .line 507
    :cond_e
    invoke-virtual {v2, v10}, Lx0/f0;->a(Lx0/i;)V

    .line 508
    .line 509
    .line 510
    goto :goto_5

    .line 511
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 512
    .line 513
    const-string v2, "No instantiated fragment for ("

    .line 514
    .line 515
    const-string v3, ")"

    .line 516
    .line 517
    invoke-static {v2, v9, v3}, Lg;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    throw v1

    .line 525
    :cond_10
    iget-object v2, v1, Lx0/a0;->c:[Lx0/b;

    .line 526
    .line 527
    if-eqz v2, :cond_17

    .line 528
    .line 529
    new-instance v2, Ljava/util/ArrayList;

    .line 530
    .line 531
    iget-object v3, v1, Lx0/a0;->c:[Lx0/b;

    .line 532
    .line 533
    array-length v3, v3

    .line 534
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 535
    .line 536
    .line 537
    iput-object v2, v0, Lx0/y;->d:Ljava/util/ArrayList;

    .line 538
    .line 539
    move v2, v4

    .line 540
    :goto_6
    iget-object v3, v1, Lx0/a0;->c:[Lx0/b;

    .line 541
    .line 542
    array-length v9, v3

    .line 543
    if-ge v2, v9, :cond_18

    .line 544
    .line 545
    aget-object v3, v3, v2

    .line 546
    .line 547
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    new-instance v9, Lx0/a;

    .line 551
    .line 552
    invoke-direct {v9, v0}, Lx0/a;-><init>(Lx0/y;)V

    .line 553
    .line 554
    .line 555
    move v10, v4

    .line 556
    move v11, v10

    .line 557
    :goto_7
    iget-object v12, v3, Lx0/b;->a:[I

    .line 558
    .line 559
    array-length v12, v12

    .line 560
    if-ge v10, v12, :cond_13

    .line 561
    .line 562
    new-instance v12, Lx0/g0$a;

    .line 563
    .line 564
    invoke-direct {v12}, Lx0/g0$a;-><init>()V

    .line 565
    .line 566
    .line 567
    iget-object v13, v3, Lx0/b;->a:[I

    .line 568
    .line 569
    add-int/lit8 v14, v10, 0x1

    .line 570
    .line 571
    aget v10, v13, v10

    .line 572
    .line 573
    iput v10, v12, Lx0/g0$a;->a:I

    .line 574
    .line 575
    invoke-static {v6}, Lx0/y;->L(I)Z

    .line 576
    .line 577
    .line 578
    move-result v10

    .line 579
    if-eqz v10, :cond_11

    .line 580
    .line 581
    new-instance v10, Ljava/lang/StringBuilder;

    .line 582
    .line 583
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 584
    .line 585
    .line 586
    const-string v13, "Instantiate "

    .line 587
    .line 588
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    const-string v13, " op #"

    .line 595
    .line 596
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    const-string v13, " base fragment #"

    .line 603
    .line 604
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 605
    .line 606
    .line 607
    iget-object v13, v3, Lx0/b;->a:[I

    .line 608
    .line 609
    aget v13, v13, v14

    .line 610
    .line 611
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v10

    .line 618
    invoke-static {v7, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 619
    .line 620
    .line 621
    :cond_11
    invoke-static {}, Lb1/k$b;->values()[Lb1/k$b;

    .line 622
    .line 623
    .line 624
    move-result-object v10

    .line 625
    iget-object v13, v3, Lx0/b;->c:[I

    .line 626
    .line 627
    aget v13, v13, v11

    .line 628
    .line 629
    aget-object v10, v10, v13

    .line 630
    .line 631
    iput-object v10, v12, Lx0/g0$a;->h:Lb1/k$b;

    .line 632
    .line 633
    invoke-static {}, Lb1/k$b;->values()[Lb1/k$b;

    .line 634
    .line 635
    .line 636
    move-result-object v10

    .line 637
    iget-object v13, v3, Lx0/b;->d:[I

    .line 638
    .line 639
    aget v13, v13, v11

    .line 640
    .line 641
    aget-object v10, v10, v13

    .line 642
    .line 643
    iput-object v10, v12, Lx0/g0$a;->i:Lb1/k$b;

    .line 644
    .line 645
    iget-object v10, v3, Lx0/b;->a:[I

    .line 646
    .line 647
    add-int/lit8 v13, v14, 0x1

    .line 648
    .line 649
    aget v14, v10, v14

    .line 650
    .line 651
    if-eqz v14, :cond_12

    .line 652
    .line 653
    move v14, v8

    .line 654
    goto :goto_8

    .line 655
    :cond_12
    move v14, v4

    .line 656
    :goto_8
    iput-boolean v14, v12, Lx0/g0$a;->c:Z

    .line 657
    .line 658
    add-int/lit8 v14, v13, 0x1

    .line 659
    .line 660
    aget v13, v10, v13

    .line 661
    .line 662
    iput v13, v12, Lx0/g0$a;->d:I

    .line 663
    .line 664
    add-int/lit8 v15, v14, 0x1

    .line 665
    .line 666
    aget v14, v10, v14

    .line 667
    .line 668
    iput v14, v12, Lx0/g0$a;->e:I

    .line 669
    .line 670
    add-int/lit8 v16, v15, 0x1

    .line 671
    .line 672
    aget v15, v10, v15

    .line 673
    .line 674
    iput v15, v12, Lx0/g0$a;->f:I

    .line 675
    .line 676
    add-int/lit8 v17, v16, 0x1

    .line 677
    .line 678
    aget v10, v10, v16

    .line 679
    .line 680
    iput v10, v12, Lx0/g0$a;->g:I

    .line 681
    .line 682
    iput v13, v9, Lx0/g0;->b:I

    .line 683
    .line 684
    iput v14, v9, Lx0/g0;->c:I

    .line 685
    .line 686
    iput v15, v9, Lx0/g0;->d:I

    .line 687
    .line 688
    iput v10, v9, Lx0/g0;->e:I

    .line 689
    .line 690
    invoke-virtual {v9, v12}, Lx0/g0;->b(Lx0/g0$a;)V

    .line 691
    .line 692
    .line 693
    add-int/lit8 v11, v11, 0x1

    .line 694
    .line 695
    move/from16 v10, v17

    .line 696
    .line 697
    goto/16 :goto_7

    .line 698
    .line 699
    :cond_13
    iget v10, v3, Lx0/b;->e:I

    .line 700
    .line 701
    iput v10, v9, Lx0/g0;->f:I

    .line 702
    .line 703
    iget-object v10, v3, Lx0/b;->f:Ljava/lang/String;

    .line 704
    .line 705
    iput-object v10, v9, Lx0/g0;->h:Ljava/lang/String;

    .line 706
    .line 707
    iput-boolean v8, v9, Lx0/g0;->g:Z

    .line 708
    .line 709
    iget v10, v3, Lx0/b;->p:I

    .line 710
    .line 711
    iput v10, v9, Lx0/g0;->i:I

    .line 712
    .line 713
    iget-object v10, v3, Lx0/b;->q:Ljava/lang/CharSequence;

    .line 714
    .line 715
    iput-object v10, v9, Lx0/g0;->j:Ljava/lang/CharSequence;

    .line 716
    .line 717
    iget v10, v3, Lx0/b;->r:I

    .line 718
    .line 719
    iput v10, v9, Lx0/g0;->k:I

    .line 720
    .line 721
    iget-object v10, v3, Lx0/b;->s:Ljava/lang/CharSequence;

    .line 722
    .line 723
    iput-object v10, v9, Lx0/g0;->l:Ljava/lang/CharSequence;

    .line 724
    .line 725
    iget-object v10, v3, Lx0/b;->t:Ljava/util/ArrayList;

    .line 726
    .line 727
    iput-object v10, v9, Lx0/g0;->m:Ljava/util/ArrayList;

    .line 728
    .line 729
    iget-object v10, v3, Lx0/b;->u:Ljava/util/ArrayList;

    .line 730
    .line 731
    iput-object v10, v9, Lx0/g0;->n:Ljava/util/ArrayList;

    .line 732
    .line 733
    iget-boolean v10, v3, Lx0/b;->v:Z

    .line 734
    .line 735
    iput-boolean v10, v9, Lx0/g0;->o:Z

    .line 736
    .line 737
    iget v10, v3, Lx0/b;->o:I

    .line 738
    .line 739
    iput v10, v9, Lx0/a;->r:I

    .line 740
    .line 741
    move v10, v4

    .line 742
    :goto_9
    iget-object v11, v3, Lx0/b;->b:Ljava/util/ArrayList;

    .line 743
    .line 744
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 745
    .line 746
    .line 747
    move-result v11

    .line 748
    if-ge v10, v11, :cond_15

    .line 749
    .line 750
    iget-object v11, v3, Lx0/b;->b:Ljava/util/ArrayList;

    .line 751
    .line 752
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v11

    .line 756
    check-cast v11, Ljava/lang/String;

    .line 757
    .line 758
    if-eqz v11, :cond_14

    .line 759
    .line 760
    iget-object v12, v9, Lx0/g0;->a:Ljava/util/ArrayList;

    .line 761
    .line 762
    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v12

    .line 766
    check-cast v12, Lx0/g0$a;

    .line 767
    .line 768
    invoke-virtual {v0, v11}, Lx0/y;->C(Ljava/lang/String;)Lx0/i;

    .line 769
    .line 770
    .line 771
    move-result-object v11

    .line 772
    iput-object v11, v12, Lx0/g0$a;->b:Lx0/i;

    .line 773
    .line 774
    :cond_14
    add-int/lit8 v10, v10, 0x1

    .line 775
    .line 776
    goto :goto_9

    .line 777
    :cond_15
    invoke-virtual {v9, v8}, Lx0/a;->c(I)V

    .line 778
    .line 779
    .line 780
    invoke-static {v6}, Lx0/y;->L(I)Z

    .line 781
    .line 782
    .line 783
    move-result v3

    .line 784
    if-eqz v3, :cond_16

    .line 785
    .line 786
    const-string v3, "restoreAllState: back stack #"

    .line 787
    .line 788
    const-string v10, " (index "

    .line 789
    .line 790
    invoke-static {v3, v2, v10}, La0/j;->n(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 791
    .line 792
    .line 793
    move-result-object v3

    .line 794
    iget v10, v9, Lx0/a;->r:I

    .line 795
    .line 796
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 797
    .line 798
    .line 799
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 800
    .line 801
    .line 802
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 803
    .line 804
    .line 805
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 806
    .line 807
    .line 808
    move-result-object v3

    .line 809
    invoke-static {v7, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 810
    .line 811
    .line 812
    new-instance v3, Lx0/p0;

    .line 813
    .line 814
    invoke-direct {v3}, Lx0/p0;-><init>()V

    .line 815
    .line 816
    .line 817
    new-instance v10, Ljava/io/PrintWriter;

    .line 818
    .line 819
    invoke-direct {v10, v3}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 820
    .line 821
    .line 822
    const-string v3, "  "

    .line 823
    .line 824
    invoke-virtual {v9, v3, v10, v4}, Lx0/a;->f(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v10}, Ljava/io/PrintWriter;->close()V

    .line 828
    .line 829
    .line 830
    :cond_16
    iget-object v3, v0, Lx0/y;->d:Ljava/util/ArrayList;

    .line 831
    .line 832
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 833
    .line 834
    .line 835
    add-int/lit8 v2, v2, 0x1

    .line 836
    .line 837
    goto/16 :goto_6

    .line 838
    .line 839
    :cond_17
    new-instance v2, Ljava/util/ArrayList;

    .line 840
    .line 841
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 842
    .line 843
    .line 844
    iput-object v2, v0, Lx0/y;->d:Ljava/util/ArrayList;

    .line 845
    .line 846
    :cond_18
    iget-object v2, v0, Lx0/y;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 847
    .line 848
    iget v3, v1, Lx0/a0;->d:I

    .line 849
    .line 850
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 851
    .line 852
    .line 853
    iget-object v2, v1, Lx0/a0;->e:Ljava/lang/String;

    .line 854
    .line 855
    if-eqz v2, :cond_19

    .line 856
    .line 857
    invoke-virtual {v0, v2}, Lx0/y;->C(Ljava/lang/String;)Lx0/i;

    .line 858
    .line 859
    .line 860
    move-result-object v2

    .line 861
    iput-object v2, v0, Lx0/y;->z:Lx0/i;

    .line 862
    .line 863
    invoke-virtual {v0, v2}, Lx0/y;->s(Lx0/i;)V

    .line 864
    .line 865
    .line 866
    :cond_19
    iget-object v2, v1, Lx0/a0;->f:Ljava/util/ArrayList;

    .line 867
    .line 868
    if-eqz v2, :cond_1a

    .line 869
    .line 870
    :goto_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 871
    .line 872
    .line 873
    move-result v3

    .line 874
    if-ge v4, v3, :cond_1a

    .line 875
    .line 876
    iget-object v3, v0, Lx0/y;->k:Ljava/util/Map;

    .line 877
    .line 878
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v5

    .line 882
    check-cast v5, Ljava/lang/String;

    .line 883
    .line 884
    iget-object v6, v1, Lx0/a0;->o:Ljava/util/ArrayList;

    .line 885
    .line 886
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    move-result-object v6

    .line 890
    check-cast v6, Lx0/c;

    .line 891
    .line 892
    invoke-interface {v3, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 893
    .line 894
    .line 895
    add-int/lit8 v4, v4, 0x1

    .line 896
    .line 897
    goto :goto_a

    .line 898
    :cond_1a
    new-instance v2, Ljava/util/ArrayDeque;

    .line 899
    .line 900
    iget-object v1, v1, Lx0/a0;->p:Ljava/util/ArrayList;

    .line 901
    .line 902
    invoke-direct {v2, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 903
    .line 904
    .line 905
    iput-object v2, v0, Lx0/y;->F:Ljava/util/ArrayDeque;

    .line 906
    .line 907
    return-void
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
.end method

.method public final W()Landroid/os/Bundle;
    .locals 12

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lx0/y;->F()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lx0/y;->x()V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {p0, v1}, Lx0/y;->A(Z)Z

    .line 14
    .line 15
    .line 16
    iput-boolean v1, p0, Lx0/y;->H:Z

    .line 17
    .line 18
    iget-object v2, p0, Lx0/y;->O:Lx0/b0;

    .line 19
    .line 20
    iput-boolean v1, v2, Lx0/b0;->i:Z

    .line 21
    .line 22
    iget-object v1, p0, Lx0/y;->c:Lx0/f0;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v2, Ljava/util/ArrayList;

    .line 28
    .line 29
    iget-object v3, v1, Lx0/f0;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iget-object v3, v1, Lx0/f0;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    const/4 v5, 0x2

    .line 57
    if-eqz v4, :cond_1

    .line 58
    .line 59
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Lx0/e0;

    .line 64
    .line 65
    if-eqz v4, :cond_0

    .line 66
    .line 67
    iget-object v6, v4, Lx0/e0;->c:Lx0/i;

    .line 68
    .line 69
    iget-object v7, v6, Lx0/i;->mWho:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v4}, Lx0/e0;->o()Landroid/os/Bundle;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v1, v4, v7}, Lx0/f0;->j(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 76
    .line 77
    .line 78
    iget-object v4, v6, Lx0/i;->mWho:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    invoke-static {v5}, Lx0/y;->L(I)Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-eqz v4, :cond_0

    .line 88
    .line 89
    new-instance v4, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    const-string v5, "Saved state of "

    .line 95
    .line 96
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v5, ": "

    .line 103
    .line 104
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-object v5, v6, Lx0/i;->mSavedFragmentState:Landroid/os/Bundle;

    .line 108
    .line 109
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    const-string v5, "FragmentManager"

    .line 117
    .line 118
    invoke-static {v5, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_1
    iget-object v1, p0, Lx0/y;->c:Lx0/f0;

    .line 123
    .line 124
    iget-object v1, v1, Lx0/f0;->c:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v1, Ljava/util/HashMap;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_2

    .line 133
    .line 134
    invoke-static {v5}, Lx0/y;->L(I)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_a

    .line 139
    .line 140
    const-string v1, "FragmentManager"

    .line 141
    .line 142
    const-string v2, "saveAllState: no fragments!"

    .line 143
    .line 144
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    goto/16 :goto_6

    .line 148
    .line 149
    :cond_2
    iget-object v3, p0, Lx0/y;->c:Lx0/f0;

    .line 150
    .line 151
    iget-object v4, v3, Lx0/f0;->a:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v4, Ljava/util/ArrayList;

    .line 154
    .line 155
    monitor-enter v4

    .line 156
    :try_start_0
    iget-object v6, v3, Lx0/f0;->a:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v6, Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    const/4 v7, 0x0

    .line 165
    if-eqz v6, :cond_3

    .line 166
    .line 167
    monitor-exit v4

    .line 168
    move-object v6, v7

    .line 169
    goto :goto_2

    .line 170
    :cond_3
    new-instance v6, Ljava/util/ArrayList;

    .line 171
    .line 172
    iget-object v8, v3, Lx0/f0;->a:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v8, Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 177
    .line 178
    .line 179
    move-result v8

    .line 180
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 181
    .line 182
    .line 183
    iget-object v3, v3, Lx0/f0;->a:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v3, Ljava/util/ArrayList;

    .line 186
    .line 187
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    :cond_4
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    if-eqz v8, :cond_5

    .line 196
    .line 197
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    check-cast v8, Lx0/i;

    .line 202
    .line 203
    iget-object v9, v8, Lx0/i;->mWho:Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    invoke-static {v5}, Lx0/y;->L(I)Z

    .line 209
    .line 210
    .line 211
    move-result v9

    .line 212
    if-eqz v9, :cond_4

    .line 213
    .line 214
    const-string v9, "FragmentManager"

    .line 215
    .line 216
    new-instance v10, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 219
    .line 220
    .line 221
    const-string v11, "saveAllState: adding fragment ("

    .line 222
    .line 223
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    iget-object v11, v8, Lx0/i;->mWho:Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    const-string v11, "): "

    .line 232
    .line 233
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v8

    .line 243
    invoke-static {v9, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 244
    .line 245
    .line 246
    goto :goto_1

    .line 247
    :cond_5
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 248
    :goto_2
    iget-object v3, p0, Lx0/y;->d:Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    if-lez v3, :cond_7

    .line 255
    .line 256
    new-array v7, v3, [Lx0/b;

    .line 257
    .line 258
    const/4 v4, 0x0

    .line 259
    :goto_3
    if-ge v4, v3, :cond_7

    .line 260
    .line 261
    new-instance v8, Lx0/b;

    .line 262
    .line 263
    iget-object v9, p0, Lx0/y;->d:Ljava/util/ArrayList;

    .line 264
    .line 265
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v9

    .line 269
    check-cast v9, Lx0/a;

    .line 270
    .line 271
    invoke-direct {v8, v9}, Lx0/b;-><init>(Lx0/a;)V

    .line 272
    .line 273
    .line 274
    aput-object v8, v7, v4

    .line 275
    .line 276
    invoke-static {v5}, Lx0/y;->L(I)Z

    .line 277
    .line 278
    .line 279
    move-result v8

    .line 280
    if-eqz v8, :cond_6

    .line 281
    .line 282
    const-string v8, "FragmentManager"

    .line 283
    .line 284
    const-string v9, "saveAllState: adding back stack #"

    .line 285
    .line 286
    const-string v10, ": "

    .line 287
    .line 288
    invoke-static {v9, v4, v10}, La0/j;->n(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    move-result-object v9

    .line 292
    iget-object v10, p0, Lx0/y;->d:Ljava/util/ArrayList;

    .line 293
    .line 294
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v10

    .line 298
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v9

    .line 305
    invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 306
    .line 307
    .line 308
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 309
    .line 310
    goto :goto_3

    .line 311
    :cond_7
    new-instance v3, Lx0/a0;

    .line 312
    .line 313
    invoke-direct {v3}, Lx0/a0;-><init>()V

    .line 314
    .line 315
    .line 316
    iput-object v2, v3, Lx0/a0;->a:Ljava/util/ArrayList;

    .line 317
    .line 318
    iput-object v6, v3, Lx0/a0;->b:Ljava/util/ArrayList;

    .line 319
    .line 320
    iput-object v7, v3, Lx0/a0;->c:[Lx0/b;

    .line 321
    .line 322
    iget-object v2, p0, Lx0/y;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 323
    .line 324
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    iput v2, v3, Lx0/a0;->d:I

    .line 329
    .line 330
    iget-object v2, p0, Lx0/y;->z:Lx0/i;

    .line 331
    .line 332
    if-eqz v2, :cond_8

    .line 333
    .line 334
    iget-object v2, v2, Lx0/i;->mWho:Ljava/lang/String;

    .line 335
    .line 336
    iput-object v2, v3, Lx0/a0;->e:Ljava/lang/String;

    .line 337
    .line 338
    :cond_8
    iget-object v2, v3, Lx0/a0;->f:Ljava/util/ArrayList;

    .line 339
    .line 340
    iget-object v4, p0, Lx0/y;->k:Ljava/util/Map;

    .line 341
    .line 342
    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 343
    .line 344
    .line 345
    move-result-object v4

    .line 346
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 347
    .line 348
    .line 349
    iget-object v2, v3, Lx0/a0;->o:Ljava/util/ArrayList;

    .line 350
    .line 351
    iget-object v4, p0, Lx0/y;->k:Ljava/util/Map;

    .line 352
    .line 353
    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 358
    .line 359
    .line 360
    new-instance v2, Ljava/util/ArrayList;

    .line 361
    .line 362
    iget-object v4, p0, Lx0/y;->F:Ljava/util/ArrayDeque;

    .line 363
    .line 364
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 365
    .line 366
    .line 367
    iput-object v2, v3, Lx0/a0;->p:Ljava/util/ArrayList;

    .line 368
    .line 369
    const-string v2, "state"

    .line 370
    .line 371
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 372
    .line 373
    .line 374
    iget-object v2, p0, Lx0/y;->l:Ljava/util/Map;

    .line 375
    .line 376
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 385
    .line 386
    .line 387
    move-result v3

    .line 388
    if-eqz v3, :cond_9

    .line 389
    .line 390
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    check-cast v3, Ljava/lang/String;

    .line 395
    .line 396
    const-string v4, "result_"

    .line 397
    .line 398
    invoke-static {v4, v3}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    iget-object v5, p0, Lx0/y;->l:Ljava/util/Map;

    .line 403
    .line 404
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    check-cast v3, Landroid/os/Bundle;

    .line 409
    .line 410
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 411
    .line 412
    .line 413
    goto :goto_4

    .line 414
    :cond_9
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 423
    .line 424
    .line 425
    move-result v3

    .line 426
    if-eqz v3, :cond_a

    .line 427
    .line 428
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    check-cast v3, Ljava/lang/String;

    .line 433
    .line 434
    const-string v4, "fragment_"

    .line 435
    .line 436
    invoke-static {v4, v3}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v4

    .line 440
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    check-cast v3, Landroid/os/Bundle;

    .line 445
    .line 446
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 447
    .line 448
    .line 449
    goto :goto_5

    .line 450
    :cond_a
    :goto_6
    return-object v0

    .line 451
    :catchall_0
    move-exception v0

    .line 452
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 453
    throw v0
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
.end method

.method public final X()V
    .locals 3

    .line 1
    iget-object v0, p0, Lx0/y;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lx0/y;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Lx0/y;->w:Lx0/t;

    .line 18
    .line 19
    iget-object v1, v1, Lx0/t;->c:Landroid/os/Handler;

    .line 20
    .line 21
    iget-object v2, p0, Lx0/y;->P:Lx0/y$f;

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lx0/y;->w:Lx0/t;

    .line 27
    .line 28
    iget-object v1, v1, Lx0/t;->c:Landroid/os/Handler;

    .line 29
    .line 30
    iget-object v2, p0, Lx0/y;->P:Lx0/y$f;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lx0/y;->f0()V

    .line 36
    .line 37
    .line 38
    :cond_1
    monitor-exit v0

    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw v1
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final Y(Lx0/i;Z)V
    .locals 1

    invoke-virtual {p0, p1}, Lx0/y;->H(Lx0/i;)Landroid/view/ViewGroup;

    move-result-object p1

    if-eqz p1, :cond_0

    instance-of v0, p1, Lx0/q;

    if-eqz v0, :cond_0

    check-cast p1, Lx0/q;

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Lx0/q;->setDrawDisappearingViewsLast(Z)V

    :cond_0
    return-void
.end method

.method public final Z(Lx0/i;Lb1/k$b;)V
    .locals 2

    iget-object v0, p1, Lx0/i;->mWho:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lx0/y;->C(Ljava/lang/String;)Lx0/i;

    move-result-object v0

    invoke-virtual {p1, v0}, Lx0/i;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lx0/i;->mHost:Lx0/t;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lx0/i;->mFragmentManager:Lx0/y;

    if-ne v0, p0, :cond_1

    :cond_0
    iput-object p2, p1, Lx0/i;->mMaxState:Lb1/k$b;

    return-void

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final a(Lx0/i;)Lx0/e0;
    .locals 3

    iget-object v0, p1, Lx0/i;->mPreviousWho:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, Ly0/b;->d(Lx0/i;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x2

    invoke-static {v0}, Lx0/y;->L(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "add: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-virtual {p0, p1}, Lx0/y;->h(Lx0/i;)Lx0/e0;

    move-result-object v0

    iput-object p0, p1, Lx0/i;->mFragmentManager:Lx0/y;

    iget-object v1, p0, Lx0/y;->c:Lx0/f0;

    invoke-virtual {v1, v0}, Lx0/f0;->h(Lx0/e0;)V

    iget-boolean v1, p1, Lx0/i;->mDetached:Z

    if-nez v1, :cond_3

    iget-object v1, p0, Lx0/y;->c:Lx0/f0;

    invoke-virtual {v1, p1}, Lx0/f0;->a(Lx0/i;)V

    const/4 v1, 0x0

    iput-boolean v1, p1, Lx0/i;->mRemoving:Z

    iget-object v2, p1, Lx0/i;->mView:Landroid/view/View;

    if-nez v2, :cond_2

    iput-boolean v1, p1, Lx0/i;->mHiddenChanged:Z

    :cond_2
    invoke-static {p1}, Lx0/y;->M(Lx0/i;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    iput-boolean p1, p0, Lx0/y;->G:Z

    :cond_3
    return-object v0
.end method

.method public final a0(Lx0/i;)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p1, Lx0/i;->mWho:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lx0/y;->C(Ljava/lang/String;)Lx0/i;

    move-result-object v0

    invoke-virtual {p1, v0}, Lx0/i;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lx0/i;->mHost:Lx0/t;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lx0/i;->mFragmentManager:Lx0/y;

    if-ne v0, p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lx0/y;->z:Lx0/i;

    iput-object p1, p0, Lx0/y;->z:Lx0/i;

    invoke-virtual {p0, v0}, Lx0/y;->s(Lx0/i;)V

    iget-object p1, p0, Lx0/y;->z:Lx0/i;

    invoke-virtual {p0, p1}, Lx0/y;->s(Lx0/i;)V

    return-void
.end method

.method public final b(Lx0/c0;)V
    .locals 1

    iget-object v0, p0, Lx0/y;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b0(Lx0/i;)V
    .locals 3

    invoke-virtual {p0, p1}, Lx0/y;->H(Lx0/i;)Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lx0/i;->getEnterAnim()I

    move-result v1

    invoke-virtual {p1}, Lx0/i;->getExitAnim()I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {p1}, Lx0/i;->getPopEnterAnim()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {p1}, Lx0/i;->getPopExitAnim()I

    move-result v2

    add-int/2addr v2, v1

    if-lez v2, :cond_1

    const v1, 0x7f0a0112

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx0/i;

    invoke-virtual {p1}, Lx0/i;->getPopDirection()Z

    move-result p1

    invoke-virtual {v0, p1}, Lx0/i;->setPopDirection(Z)V

    :cond_1
    return-void
.end method

.method public final c(Lx0/t;Lx0/p;Lx0/i;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/t<",
            "*>;",
            "Lx0/p;",
            "Lx0/i;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lx0/y;->w:Lx0/t;

    .line 2
    .line 3
    if-nez v0, :cond_12

    .line 4
    .line 5
    iput-object p1, p0, Lx0/y;->w:Lx0/t;

    .line 6
    .line 7
    iput-object p2, p0, Lx0/y;->x:Lx0/p;

    .line 8
    .line 9
    iput-object p3, p0, Lx0/y;->y:Lx0/i;

    .line 10
    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    new-instance p2, Lx0/y$g;

    .line 14
    .line 15
    invoke-direct {p2, p3}, Lx0/y$g;-><init>(Lx0/i;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    instance-of p2, p1, Lx0/c0;

    .line 20
    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    move-object p2, p1

    .line 24
    check-cast p2, Lx0/c0;

    .line 25
    .line 26
    :goto_0
    invoke-virtual {p0, p2}, Lx0/y;->b(Lx0/c0;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object p2, p0, Lx0/y;->y:Lx0/i;

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Lx0/y;->f0()V

    .line 34
    .line 35
    .line 36
    :cond_2
    instance-of p2, p1, Lb/y;

    .line 37
    .line 38
    if-eqz p2, :cond_4

    .line 39
    .line 40
    move-object p2, p1

    .line 41
    check-cast p2, Lb/y;

    .line 42
    .line 43
    invoke-interface {p2}, Lb/y;->getOnBackPressedDispatcher()Lb/w;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lx0/y;->g:Lb/w;

    .line 48
    .line 49
    if-eqz p3, :cond_3

    .line 50
    .line 51
    move-object p2, p3

    .line 52
    :cond_3
    iget-object v1, p0, Lx0/y;->i:Lx0/y$b;

    .line 53
    .line 54
    invoke-virtual {v0, p2, v1}, Lb/w;->a(Lb1/o;Lb/p;)V

    .line 55
    .line 56
    .line 57
    :cond_4
    const/4 p2, 0x0

    .line 58
    if-eqz p3, :cond_6

    .line 59
    .line 60
    iget-object p1, p3, Lx0/i;->mFragmentManager:Lx0/y;

    .line 61
    .line 62
    iget-object p1, p1, Lx0/y;->O:Lx0/b0;

    .line 63
    .line 64
    iget-object v0, p1, Lx0/b0;->e:Ljava/util/HashMap;

    .line 65
    .line 66
    iget-object v1, p3, Lx0/i;->mWho:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Lx0/b0;

    .line 73
    .line 74
    if-nez v0, :cond_5

    .line 75
    .line 76
    new-instance v0, Lx0/b0;

    .line 77
    .line 78
    iget-boolean v1, p1, Lx0/b0;->g:Z

    .line 79
    .line 80
    invoke-direct {v0, v1}, Lx0/b0;-><init>(Z)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p1, Lx0/b0;->e:Ljava/util/HashMap;

    .line 84
    .line 85
    iget-object v1, p3, Lx0/i;->mWho:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    :cond_5
    iput-object v0, p0, Lx0/y;->O:Lx0/b0;

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_6
    instance-of v0, p1, Lb1/t0;

    .line 94
    .line 95
    if-eqz v0, :cond_7

    .line 96
    .line 97
    check-cast p1, Lb1/t0;

    .line 98
    .line 99
    invoke-interface {p1}, Lb1/t0;->getViewModelStore()Lb1/s0;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    new-instance v0, Lb1/q0;

    .line 104
    .line 105
    sget-object v1, Lx0/b0;->j:Lx0/b0$a;

    .line 106
    .line 107
    invoke-direct {v0, p1, v1}, Lb1/q0;-><init>(Lb1/s0;Lb1/q0$b;)V

    .line 108
    .line 109
    .line 110
    const-class p1, Lx0/b0;

    .line 111
    .line 112
    invoke-virtual {v0, p1}, Lb1/q0;->a(Ljava/lang/Class;)Lb1/o0;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, Lx0/b0;

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_7
    new-instance p1, Lx0/b0;

    .line 120
    .line 121
    invoke-direct {p1, p2}, Lx0/b0;-><init>(Z)V

    .line 122
    .line 123
    .line 124
    :goto_1
    iput-object p1, p0, Lx0/y;->O:Lx0/b0;

    .line 125
    .line 126
    :goto_2
    iget-object p1, p0, Lx0/y;->O:Lx0/b0;

    .line 127
    .line 128
    iget-boolean v0, p0, Lx0/y;->H:Z

    .line 129
    .line 130
    const/4 v1, 0x1

    .line 131
    if-nez v0, :cond_8

    .line 132
    .line 133
    iget-boolean v0, p0, Lx0/y;->I:Z

    .line 134
    .line 135
    if-eqz v0, :cond_9

    .line 136
    .line 137
    :cond_8
    move p2, v1

    .line 138
    :cond_9
    iput-boolean p2, p1, Lx0/b0;->i:Z

    .line 139
    .line 140
    iget-object p2, p0, Lx0/y;->c:Lx0/f0;

    .line 141
    .line 142
    iput-object p1, p2, Lx0/f0;->d:Ljava/lang/Object;

    .line 143
    .line 144
    iget-object p1, p0, Lx0/y;->w:Lx0/t;

    .line 145
    .line 146
    instance-of p2, p1, Ls1/e;

    .line 147
    .line 148
    if-eqz p2, :cond_a

    .line 149
    .line 150
    if-nez p3, :cond_a

    .line 151
    .line 152
    check-cast p1, Ls1/e;

    .line 153
    .line 154
    invoke-interface {p1}, Ls1/e;->getSavedStateRegistry()Ls1/c;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    new-instance p2, Lx0/j;

    .line 159
    .line 160
    invoke-direct {p2, p0, v1}, Lx0/j;-><init>(Ljava/lang/Object;I)V

    .line 161
    .line 162
    .line 163
    const-string v0, "android:support:fragments"

    .line 164
    .line 165
    invoke-virtual {p1, v0, p2}, Ls1/c;->c(Ljava/lang/String;Ls1/c$b;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, v0}, Ls1/c;->a(Ljava/lang/String;)Landroid/os/Bundle;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    if-eqz p1, :cond_a

    .line 173
    .line 174
    invoke-virtual {p0, p1}, Lx0/y;->V(Landroid/os/Bundle;)V

    .line 175
    .line 176
    .line 177
    :cond_a
    iget-object p1, p0, Lx0/y;->w:Lx0/t;

    .line 178
    .line 179
    instance-of p2, p1, Ld/h;

    .line 180
    .line 181
    if-eqz p2, :cond_c

    .line 182
    .line 183
    check-cast p1, Ld/h;

    .line 184
    .line 185
    invoke-interface {p1}, Ld/h;->getActivityResultRegistry()Ld/g;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    if-eqz p3, :cond_b

    .line 190
    .line 191
    new-instance p2, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 194
    .line 195
    .line 196
    iget-object v0, p3, Lx0/i;->mWho:Ljava/lang/String;

    .line 197
    .line 198
    const-string v1, ":"

    .line 199
    .line 200
    invoke-static {p2, v0, v1}, Lg;->f(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    goto :goto_3

    .line 205
    :cond_b
    const-string p2, ""

    .line 206
    .line 207
    :goto_3
    const-string v0, "FragmentManager:"

    .line 208
    .line 209
    invoke-static {v0, p2}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    const-string v0, "StartActivityForResult"

    .line 214
    .line 215
    invoke-static {p2, v0}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    new-instance v1, Le/c;

    .line 220
    .line 221
    invoke-direct {v1}, Le/c;-><init>()V

    .line 222
    .line 223
    .line 224
    new-instance v2, Lx0/y$h;

    .line 225
    .line 226
    invoke-direct {v2, p0}, Lx0/y$h;-><init>(Lx0/y;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1, v0, v1, v2}, Ld/g;->d(Ljava/lang/String;Le/a;Ld/b;)Ld/f;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    iput-object v0, p0, Lx0/y;->C:Ld/f;

    .line 234
    .line 235
    const-string v0, "StartIntentSenderForResult"

    .line 236
    .line 237
    invoke-static {p2, v0}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    new-instance v1, Lx0/y$j;

    .line 242
    .line 243
    invoke-direct {v1}, Lx0/y$j;-><init>()V

    .line 244
    .line 245
    .line 246
    new-instance v2, Lx0/y$i;

    .line 247
    .line 248
    invoke-direct {v2, p0}, Lx0/y$i;-><init>(Lx0/y;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1, v0, v1, v2}, Ld/g;->d(Ljava/lang/String;Le/a;Ld/b;)Ld/f;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    iput-object v0, p0, Lx0/y;->D:Ld/f;

    .line 256
    .line 257
    const-string v0, "RequestPermissions"

    .line 258
    .line 259
    invoke-static {p2, v0}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p2

    .line 263
    new-instance v0, Le/b;

    .line 264
    .line 265
    invoke-direct {v0}, Le/b;-><init>()V

    .line 266
    .line 267
    .line 268
    new-instance v1, Lx0/y$a;

    .line 269
    .line 270
    invoke-direct {v1, p0}, Lx0/y$a;-><init>(Lx0/y;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1, p2, v0, v1}, Ld/g;->d(Ljava/lang/String;Le/a;Ld/b;)Ld/f;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    iput-object p1, p0, Lx0/y;->E:Ld/f;

    .line 278
    .line 279
    :cond_c
    iget-object p1, p0, Lx0/y;->w:Lx0/t;

    .line 280
    .line 281
    instance-of p2, p1, Lv/c;

    .line 282
    .line 283
    if-eqz p2, :cond_d

    .line 284
    .line 285
    check-cast p1, Lv/c;

    .line 286
    .line 287
    iget-object p2, p0, Lx0/y;->q:Lx0/w;

    .line 288
    .line 289
    invoke-interface {p1, p2}, Lv/c;->addOnConfigurationChangedListener(Ld0/a;)V

    .line 290
    .line 291
    .line 292
    :cond_d
    iget-object p1, p0, Lx0/y;->w:Lx0/t;

    .line 293
    .line 294
    instance-of p2, p1, Lv/d;

    .line 295
    .line 296
    if-eqz p2, :cond_e

    .line 297
    .line 298
    check-cast p1, Lv/d;

    .line 299
    .line 300
    iget-object p2, p0, Lx0/y;->r:Lx0/k;

    .line 301
    .line 302
    invoke-interface {p1, p2}, Lv/d;->addOnTrimMemoryListener(Ld0/a;)V

    .line 303
    .line 304
    .line 305
    :cond_e
    iget-object p1, p0, Lx0/y;->w:Lx0/t;

    .line 306
    .line 307
    instance-of p2, p1, Lu/v;

    .line 308
    .line 309
    if-eqz p2, :cond_f

    .line 310
    .line 311
    check-cast p1, Lu/v;

    .line 312
    .line 313
    iget-object p2, p0, Lx0/y;->s:Lx0/l;

    .line 314
    .line 315
    invoke-interface {p1, p2}, Lu/v;->addOnMultiWindowModeChangedListener(Ld0/a;)V

    .line 316
    .line 317
    .line 318
    :cond_f
    iget-object p1, p0, Lx0/y;->w:Lx0/t;

    .line 319
    .line 320
    instance-of p2, p1, Lu/w;

    .line 321
    .line 322
    if-eqz p2, :cond_10

    .line 323
    .line 324
    check-cast p1, Lu/w;

    .line 325
    .line 326
    iget-object p2, p0, Lx0/y;->t:Lx0/x;

    .line 327
    .line 328
    invoke-interface {p1, p2}, Lu/w;->addOnPictureInPictureModeChangedListener(Ld0/a;)V

    .line 329
    .line 330
    .line 331
    :cond_10
    iget-object p1, p0, Lx0/y;->w:Lx0/t;

    .line 332
    .line 333
    instance-of p2, p1, Le0/j;

    .line 334
    .line 335
    if-eqz p2, :cond_11

    .line 336
    .line 337
    if-nez p3, :cond_11

    .line 338
    .line 339
    check-cast p1, Le0/j;

    .line 340
    .line 341
    iget-object p2, p0, Lx0/y;->u:Lx0/y$c;

    .line 342
    .line 343
    invoke-interface {p1, p2}, Le0/j;->addMenuProvider(Le0/o;)V

    .line 344
    .line 345
    .line 346
    :cond_11
    return-void

    .line 347
    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 348
    .line 349
    const-string p2, "Already attached"

    .line 350
    .line 351
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw p1
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
.end method

.method public final d(Lx0/i;)V
    .locals 4

    const/4 v0, 0x2

    invoke-static {v0}, Lx0/y;->L(I)Z

    move-result v1

    const-string v2, "FragmentManager"

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "attach: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v1, p1, Lx0/i;->mDetached:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    iput-boolean v1, p1, Lx0/i;->mDetached:Z

    iget-boolean v1, p1, Lx0/i;->mAdded:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lx0/y;->c:Lx0/f0;

    invoke-virtual {v1, p1}, Lx0/f0;->a(Lx0/i;)V

    invoke-static {v0}, Lx0/y;->L(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "add from attach: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-static {p1}, Lx0/y;->M(Lx0/i;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, Lx0/y;->G:Z

    :cond_2
    return-void
.end method

.method public final d0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lx0/y;->c:Lx0/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/f0;->e()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lx0/e0;

    .line 22
    .line 23
    iget-object v2, v1, Lx0/e0;->c:Lx0/i;

    .line 24
    .line 25
    iget-boolean v3, v2, Lx0/i;->mDeferStart:Z

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    iget-boolean v3, p0, Lx0/y;->b:Z

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    iput-boolean v1, p0, Lx0/y;->K:Z

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v3, 0x0

    .line 38
    iput-boolean v3, v2, Lx0/i;->mDeferStart:Z

    .line 39
    .line 40
    invoke-virtual {v1}, Lx0/e0;->k()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final e()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lx0/y;->b:Z

    iget-object v0, p0, Lx0/y;->M:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lx0/y;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final e0(Ljava/lang/IllegalStateException;)V
    .locals 5

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "Activity state:"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lx0/p0;

    invoke-direct {v0}, Lx0/p0;-><init>()V

    new-instance v2, Ljava/io/PrintWriter;

    invoke-direct {v2, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    iget-object v0, p0, Lx0/y;->w:Lx0/t;

    const-string v3, "  "

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    new-array v3, v4, [Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lx0/t;->d(Ljava/io/PrintWriter;[Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-array v0, v4, [Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {p0, v3, v4, v2, v0}, Lx0/y;->w(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "Failed dumping state"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    throw p1
.end method

.method public final f()Ljava/util/HashSet;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lx0/y;->c:Lx0/f0;

    .line 7
    .line 8
    invoke-virtual {v1}, Lx0/f0;->e()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lx0/e0;

    .line 27
    .line 28
    iget-object v2, v2, Lx0/e0;->c:Lx0/i;

    .line 29
    .line 30
    iget-object v2, v2, Lx0/i;->mContainer:Landroid/view/ViewGroup;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Lx0/y;->J()Lx0/t0;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const-string v4, "factory"

    .line 39
    .line 40
    invoke-static {v3, v4}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const v3, 0x7f0a00e4

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    instance-of v5, v4, Lx0/r0;

    .line 51
    .line 52
    if-eqz v5, :cond_1

    .line 53
    .line 54
    check-cast v4, Lx0/r0;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    new-instance v4, Lx0/e;

    .line 58
    .line 59
    invoke-direct {v4, v2}, Lx0/e;-><init>(Landroid/view/ViewGroup;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :goto_1
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    return-object v0
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final f0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lx0/y;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lx0/y;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x3

    .line 11
    const/4 v3, 0x1

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lx0/y;->i:Lx0/y$b;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Lb/p;->setEnabled(Z)V

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, Lx0/y;->L(I)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const-string v1, "FragmentManager"

    .line 26
    .line 27
    new-instance v2, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v3, "FragmentManager "

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v3, " enabling OnBackPressedCallback, caused by non-empty pending actions"

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    :cond_0
    monitor-exit v0

    .line 53
    return-void

    .line 54
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    iget-object v0, p0, Lx0/y;->d:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget-object v1, p0, Lx0/y;->h:Lx0/a;

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    move v1, v3

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    move v1, v4

    .line 69
    :goto_0
    add-int/2addr v0, v1

    .line 70
    if-lez v0, :cond_3

    .line 71
    .line 72
    iget-object v0, p0, Lx0/y;->y:Lx0/i;

    .line 73
    .line 74
    invoke-static {v0}, Lx0/y;->O(Lx0/i;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    move v3, v4

    .line 82
    :goto_1
    invoke-static {v2}, Lx0/y;->L(I)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    const-string v0, "FragmentManager"

    .line 89
    .line 90
    new-instance v1, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    .line 95
    const-string v2, "OnBackPressedCallback for FragmentManager "

    .line 96
    .line 97
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v2, " enabled state is "

    .line 104
    .line 105
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    :cond_4
    iget-object v0, p0, Lx0/y;->i:Lx0/y$b;

    .line 119
    .line 120
    invoke-virtual {v0, v3}, Lb/p;->setEnabled(Z)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :catchall_0
    move-exception v1

    .line 125
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    throw v1
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method

.method public final g(Ljava/util/ArrayList;II)Ljava/util/HashSet;
    .locals 3

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    :goto_0
    if-ge p2, p3, :cond_2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx0/a;

    iget-object v1, v1, Lx0/g0;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx0/g0$a;

    iget-object v2, v2, Lx0/g0$a;->b:Lx0/i;

    if-eqz v2, :cond_0

    iget-object v2, v2, Lx0/i;->mContainer:Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    invoke-static {v2, p0}, Lx0/r0;->m(Landroid/view/ViewGroup;Lx0/y;)Lx0/r0;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final h(Lx0/i;)Lx0/e0;
    .locals 3

    .line 1
    iget-object v0, p0, Lx0/y;->c:Lx0/f0;

    .line 2
    .line 3
    iget-object v1, p1, Lx0/i;->mWho:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v0, v0, Lx0/f0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lx0/e0;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v0, Lx0/e0;

    .line 19
    .line 20
    iget-object v1, p0, Lx0/y;->o:Lx0/v;

    .line 21
    .line 22
    iget-object v2, p0, Lx0/y;->c:Lx0/f0;

    .line 23
    .line 24
    invoke-direct {v0, v1, v2, p1}, Lx0/e0;-><init>(Lx0/v;Lx0/f0;Lx0/i;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lx0/y;->w:Lx0/t;

    .line 28
    .line 29
    iget-object p1, p1, Lx0/t;->b:Landroid/content/Context;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, p1}, Lx0/e0;->m(Ljava/lang/ClassLoader;)V

    .line 36
    .line 37
    .line 38
    iget p1, p0, Lx0/y;->v:I

    .line 39
    .line 40
    iput p1, v0, Lx0/e0;->e:I

    .line 41
    .line 42
    return-object v0
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final i(Lx0/i;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lx0/y;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v3, "detach: "

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-boolean v1, p1, Lx0/i;->mDetached:Z

    .line 31
    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    iput-boolean v1, p1, Lx0/i;->mDetached:Z

    .line 36
    .line 37
    iget-boolean v3, p1, Lx0/i;->mAdded:Z

    .line 38
    .line 39
    if-eqz v3, :cond_3

    .line 40
    .line 41
    invoke-static {v0}, Lx0/y;->L(I)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string v3, "remove from detach: "

    .line 53
    .line 54
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    :cond_1
    iget-object v0, p0, Lx0/y;->c:Lx0/f0;

    .line 68
    .line 69
    iget-object v2, v0, Lx0/f0;->a:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Ljava/util/ArrayList;

    .line 72
    .line 73
    monitor-enter v2

    .line 74
    :try_start_0
    iget-object v0, v0, Lx0/f0;->a:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    const/4 v0, 0x0

    .line 83
    iput-boolean v0, p1, Lx0/i;->mAdded:Z

    .line 84
    .line 85
    invoke-static {p1}, Lx0/y;->M(Lx0/i;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_2

    .line 90
    .line 91
    iput-boolean v1, p0, Lx0/y;->G:Z

    .line 92
    .line 93
    :cond_2
    invoke-virtual {p0, p1}, Lx0/y;->b0(Lx0/i;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :catchall_0
    move-exception p1

    .line 98
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    throw p1

    .line 100
    :cond_3
    :goto_0
    return-void
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method

.method public final j(ZLandroid/content/res/Configuration;)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p0, Lx0/y;->w:Lx0/t;

    instance-of v0, v0, Lv/c;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lx0/y;->e0(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lx0/y;->c:Lx0/f0;

    invoke-virtual {v0}, Lx0/f0;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx0/i;

    if-eqz v1, :cond_2

    invoke-virtual {v1, p2}, Lx0/i;->performConfigurationChanged(Landroid/content/res/Configuration;)V

    if-eqz p1, :cond_2

    iget-object v1, v1, Lx0/i;->mChildFragmentManager:Lx0/y;

    const/4 v2, 0x1

    invoke-virtual {v1, v2, p2}, Lx0/y;->j(ZLandroid/content/res/Configuration;)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final k(Landroid/view/MenuItem;)Z
    .locals 4

    iget v0, p0, Lx0/y;->v:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lx0/y;->c:Lx0/f0;

    invoke-virtual {v0}, Lx0/f0;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx0/i;

    if-eqz v3, :cond_1

    invoke-virtual {v3, p1}, Lx0/i;->performContextItemSelected(Landroid/view/MenuItem;)Z

    move-result v3

    if-eqz v3, :cond_1

    return v2

    :cond_2
    return v1
.end method

.method public final l(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 7

    .line 1
    iget v0, p0, Lx0/y;->v:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    return v2

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iget-object v3, p0, Lx0/y;->c:Lx0/f0;

    .line 10
    .line 11
    invoke-virtual {v3}, Lx0/f0;->g()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    move v4, v2

    .line 20
    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_3

    .line 25
    .line 26
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Lx0/i;

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    invoke-virtual {v5}, Lx0/i;->isMenuVisible()Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    invoke-virtual {v5, p1, p2}, Lx0/i;->performCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eqz v6, :cond_1

    .line 45
    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    new-instance v0, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move v4, v1

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    iget-object p1, p0, Lx0/y;->e:Ljava/util/ArrayList;

    .line 59
    .line 60
    if-eqz p1, :cond_6

    .line 61
    .line 62
    :goto_1
    iget-object p1, p0, Lx0/y;->e:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-ge v2, p1, :cond_6

    .line 69
    .line 70
    iget-object p1, p0, Lx0/y;->e:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, Lx0/i;

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-nez p2, :cond_5

    .line 85
    .line 86
    :cond_4
    invoke-virtual {p1}, Lx0/i;->onDestroyOptionsMenu()V

    .line 87
    .line 88
    .line 89
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_6
    iput-object v0, p0, Lx0/y;->e:Ljava/util/ArrayList;

    .line 93
    .line 94
    return v4
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final m()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lx0/y;->J:Z

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lx0/y;->A(Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lx0/y;->x()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lx0/y;->w:Lx0/t;

    .line 11
    .line 12
    instance-of v2, v1, Lb1/t0;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lx0/y;->c:Lx0/f0;

    .line 17
    .line 18
    iget-object v0, v0, Lx0/f0;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lx0/b0;

    .line 21
    .line 22
    iget-boolean v0, v0, Lx0/b0;->h:Z

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v1, v1, Lx0/t;->b:Landroid/content/Context;

    .line 26
    .line 27
    instance-of v2, v1, Landroid/app/Activity;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    check-cast v1, Landroid/app/Activity;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    xor-int/2addr v0, v1

    .line 38
    :cond_1
    :goto_0
    if-eqz v0, :cond_3

    .line 39
    .line 40
    iget-object v0, p0, Lx0/y;->k:Ljava/util/Map;

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Lx0/c;

    .line 61
    .line 62
    iget-object v1, v1, Lx0/c;->a:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_2

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Ljava/lang/String;

    .line 79
    .line 80
    iget-object v3, p0, Lx0/y;->c:Lx0/f0;

    .line 81
    .line 82
    iget-object v3, v3, Lx0/f0;->d:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v3, Lx0/b0;

    .line 85
    .line 86
    const/4 v4, 0x0

    .line 87
    invoke-virtual {v3, v2, v4}, Lx0/b0;->d(Ljava/lang/String;Z)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    const/4 v0, -0x1

    .line 92
    invoke-virtual {p0, v0}, Lx0/y;->v(I)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lx0/y;->w:Lx0/t;

    .line 96
    .line 97
    instance-of v1, v0, Lv/d;

    .line 98
    .line 99
    if-eqz v1, :cond_4

    .line 100
    .line 101
    check-cast v0, Lv/d;

    .line 102
    .line 103
    iget-object v1, p0, Lx0/y;->r:Lx0/k;

    .line 104
    .line 105
    invoke-interface {v0, v1}, Lv/d;->removeOnTrimMemoryListener(Ld0/a;)V

    .line 106
    .line 107
    .line 108
    :cond_4
    iget-object v0, p0, Lx0/y;->w:Lx0/t;

    .line 109
    .line 110
    instance-of v1, v0, Lv/c;

    .line 111
    .line 112
    if-eqz v1, :cond_5

    .line 113
    .line 114
    check-cast v0, Lv/c;

    .line 115
    .line 116
    iget-object v1, p0, Lx0/y;->q:Lx0/w;

    .line 117
    .line 118
    invoke-interface {v0, v1}, Lv/c;->removeOnConfigurationChangedListener(Ld0/a;)V

    .line 119
    .line 120
    .line 121
    :cond_5
    iget-object v0, p0, Lx0/y;->w:Lx0/t;

    .line 122
    .line 123
    instance-of v1, v0, Lu/v;

    .line 124
    .line 125
    if-eqz v1, :cond_6

    .line 126
    .line 127
    check-cast v0, Lu/v;

    .line 128
    .line 129
    iget-object v1, p0, Lx0/y;->s:Lx0/l;

    .line 130
    .line 131
    invoke-interface {v0, v1}, Lu/v;->removeOnMultiWindowModeChangedListener(Ld0/a;)V

    .line 132
    .line 133
    .line 134
    :cond_6
    iget-object v0, p0, Lx0/y;->w:Lx0/t;

    .line 135
    .line 136
    instance-of v1, v0, Lu/w;

    .line 137
    .line 138
    if-eqz v1, :cond_7

    .line 139
    .line 140
    check-cast v0, Lu/w;

    .line 141
    .line 142
    iget-object v1, p0, Lx0/y;->t:Lx0/x;

    .line 143
    .line 144
    invoke-interface {v0, v1}, Lu/w;->removeOnPictureInPictureModeChangedListener(Ld0/a;)V

    .line 145
    .line 146
    .line 147
    :cond_7
    iget-object v0, p0, Lx0/y;->w:Lx0/t;

    .line 148
    .line 149
    instance-of v1, v0, Le0/j;

    .line 150
    .line 151
    if-eqz v1, :cond_8

    .line 152
    .line 153
    iget-object v1, p0, Lx0/y;->y:Lx0/i;

    .line 154
    .line 155
    if-nez v1, :cond_8

    .line 156
    .line 157
    check-cast v0, Le0/j;

    .line 158
    .line 159
    iget-object v1, p0, Lx0/y;->u:Lx0/y$c;

    .line 160
    .line 161
    invoke-interface {v0, v1}, Le0/j;->removeMenuProvider(Le0/o;)V

    .line 162
    .line 163
    .line 164
    :cond_8
    const/4 v0, 0x0

    .line 165
    iput-object v0, p0, Lx0/y;->w:Lx0/t;

    .line 166
    .line 167
    iput-object v0, p0, Lx0/y;->x:Lx0/p;

    .line 168
    .line 169
    iput-object v0, p0, Lx0/y;->y:Lx0/i;

    .line 170
    .line 171
    iget-object v1, p0, Lx0/y;->g:Lb/w;

    .line 172
    .line 173
    if-eqz v1, :cond_9

    .line 174
    .line 175
    iget-object v1, p0, Lx0/y;->i:Lx0/y$b;

    .line 176
    .line 177
    invoke-virtual {v1}, Lb/p;->remove()V

    .line 178
    .line 179
    .line 180
    iput-object v0, p0, Lx0/y;->g:Lb/w;

    .line 181
    .line 182
    :cond_9
    iget-object v0, p0, Lx0/y;->C:Ld/f;

    .line 183
    .line 184
    if-eqz v0, :cond_a

    .line 185
    .line 186
    invoke-virtual {v0}, Ld/f;->b()V

    .line 187
    .line 188
    .line 189
    iget-object v0, p0, Lx0/y;->D:Ld/f;

    .line 190
    .line 191
    invoke-virtual {v0}, Ld/f;->b()V

    .line 192
    .line 193
    .line 194
    iget-object v0, p0, Lx0/y;->E:Ld/f;

    .line 195
    .line 196
    invoke-virtual {v0}, Ld/f;->b()V

    .line 197
    .line 198
    .line 199
    :cond_a
    return-void
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method

.method public final n(Z)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p0, Lx0/y;->w:Lx0/t;

    instance-of v0, v0, Lv/d;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lx0/y;->e0(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lx0/y;->c:Lx0/f0;

    invoke-virtual {v0}, Lx0/f0;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx0/i;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lx0/i;->performLowMemory()V

    if-eqz p1, :cond_2

    iget-object v1, v1, Lx0/i;->mChildFragmentManager:Lx0/y;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lx0/y;->n(Z)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final o(ZZ)V
    .locals 3

    if-eqz p2, :cond_1

    iget-object v0, p0, Lx0/y;->w:Lx0/t;

    instance-of v0, v0, Lu/v;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lx0/y;->e0(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lx0/y;->c:Lx0/f0;

    invoke-virtual {v0}, Lx0/f0;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx0/i;

    if-eqz v1, :cond_2

    invoke-virtual {v1, p1}, Lx0/i;->performMultiWindowModeChanged(Z)V

    if-eqz p2, :cond_2

    iget-object v1, v1, Lx0/i;->mChildFragmentManager:Lx0/y;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Lx0/y;->o(ZZ)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final p()V
    .locals 3

    iget-object v0, p0, Lx0/y;->c:Lx0/f0;

    invoke-virtual {v0}, Lx0/f0;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx0/i;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lx0/i;->isHidden()Z

    move-result v2

    invoke-virtual {v1, v2}, Lx0/i;->onHiddenChanged(Z)V

    iget-object v1, v1, Lx0/i;->mChildFragmentManager:Lx0/y;

    invoke-virtual {v1}, Lx0/y;->p()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final q(Landroid/view/MenuItem;)Z
    .locals 4

    iget v0, p0, Lx0/y;->v:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lx0/y;->c:Lx0/f0;

    invoke-virtual {v0}, Lx0/f0;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx0/i;

    if-eqz v3, :cond_1

    invoke-virtual {v3, p1}, Lx0/i;->performOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v3

    if-eqz v3, :cond_1

    return v2

    :cond_2
    return v1
.end method

.method public final r(Landroid/view/Menu;)V
    .locals 2

    iget v0, p0, Lx0/y;->v:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lx0/y;->c:Lx0/f0;

    invoke-virtual {v0}, Lx0/f0;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx0/i;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Lx0/i;->performOptionsMenuClosed(Landroid/view/Menu;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final s(Lx0/i;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p1, Lx0/i;->mWho:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lx0/y;->C(Ljava/lang/String;)Lx0/i;

    move-result-object v0

    invoke-virtual {p1, v0}, Lx0/i;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lx0/i;->performPrimaryNavigationFragmentChanged()V

    :cond_0
    return-void
.end method

.method public final t(ZZ)V
    .locals 3

    if-eqz p2, :cond_1

    iget-object v0, p0, Lx0/y;->w:Lx0/t;

    instance-of v0, v0, Lu/w;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lx0/y;->e0(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lx0/y;->c:Lx0/f0;

    invoke-virtual {v0}, Lx0/f0;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx0/i;

    if-eqz v1, :cond_2

    invoke-virtual {v1, p1}, Lx0/i;->performPictureInPictureModeChanged(Z)V

    if-eqz p2, :cond_2

    iget-object v1, v1, Lx0/i;->mChildFragmentManager:Lx0/y;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Lx0/y;->t(ZZ)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "FragmentManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx0/y;->y:Lx0/i;

    const-string v2, "}"

    const-string v3, "{"

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx0/y;->y:Lx0/i;

    :goto_0
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lx0/y;->w:Lx0/t;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx0/y;->w:Lx0/t;

    goto :goto_0

    :cond_1
    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Landroid/view/Menu;)Z
    .locals 5

    .line 1
    iget v0, p0, Lx0/y;->v:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Lx0/y;->c:Lx0/f0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lx0/f0;->g()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lx0/i;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {v3}, Lx0/i;->isMenuVisible()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    invoke-virtual {v3, p1}, Lx0/i;->performPrepareOptionsMenu(Landroid/view/Menu;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    move v1, v2

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    return v1
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final v(I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lx0/y;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, Lx0/y;->c:Lx0/f0;

    .line 6
    .line 7
    iget-object v2, v2, Lx0/f0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lx0/e0;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iput p1, v3, Lx0/e0;->e:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0, p1, v1}, Lx0/y;->P(IZ)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lx0/y;->f()Ljava/util/HashSet;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Lx0/r0;

    .line 58
    .line 59
    invoke-virtual {v2}, Lx0/r0;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    iput-boolean v1, p0, Lx0/y;->b:Z

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Lx0/y;->A(Z)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    iput-boolean v1, p0, Lx0/y;->b:Z

    .line 71
    .line 72
    throw p1
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final w(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "    "

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lx0/y;->c:Lx0/f0;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v3, "    "

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object v3, v1, Lx0/f0;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v3, "Active Fragments:"

    .line 43
    .line 44
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object v3, v1, Lx0/f0;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Ljava/util/HashMap;

    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_1

    .line 64
    .line 65
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    check-cast v4, Lx0/e0;

    .line 70
    .line 71
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    if-eqz v4, :cond_0

    .line 75
    .line 76
    iget-object v4, v4, Lx0/e0;->c:Lx0/i;

    .line 77
    .line 78
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, v2, p2, p3, p4}, Lx0/i;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    const-string v4, "null"

    .line 86
    .line 87
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    iget-object p2, v1, Lx0/f0;->a:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p2, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    const/4 p4, 0x0

    .line 100
    if-lez p2, :cond_2

    .line 101
    .line 102
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const-string v2, "Added Fragments:"

    .line 106
    .line 107
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    move v2, p4

    .line 111
    :goto_1
    if-ge v2, p2, :cond_2

    .line 112
    .line 113
    iget-object v3, v1, Lx0/f0;->a:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v3, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    check-cast v3, Lx0/i;

    .line 122
    .line 123
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    const-string v4, "  #"

    .line 127
    .line 128
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    .line 132
    .line 133
    .line 134
    const-string v4, ": "

    .line 135
    .line 136
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3}, Lx0/i;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    add-int/lit8 v2, v2, 0x1

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_2
    iget-object p2, p0, Lx0/y;->e:Ljava/util/ArrayList;

    .line 150
    .line 151
    if-eqz p2, :cond_3

    .line 152
    .line 153
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    if-lez p2, :cond_3

    .line 158
    .line 159
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    const-string v1, "Fragments Created Menus:"

    .line 163
    .line 164
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    move v1, p4

    .line 168
    :goto_2
    if-ge v1, p2, :cond_3

    .line 169
    .line 170
    iget-object v2, p0, Lx0/y;->e:Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    check-cast v2, Lx0/i;

    .line 177
    .line 178
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    const-string v3, "  #"

    .line 182
    .line 183
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 187
    .line 188
    .line 189
    const-string v3, ": "

    .line 190
    .line 191
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2}, Lx0/i;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    add-int/lit8 v1, v1, 0x1

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_3
    iget-object p2, p0, Lx0/y;->d:Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 207
    .line 208
    .line 209
    move-result p2

    .line 210
    if-lez p2, :cond_4

    .line 211
    .line 212
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    const-string v1, "Back Stack:"

    .line 216
    .line 217
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    move v1, p4

    .line 221
    :goto_3
    if-ge v1, p2, :cond_4

    .line 222
    .line 223
    iget-object v2, p0, Lx0/y;->d:Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    check-cast v2, Lx0/a;

    .line 230
    .line 231
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    const-string v3, "  #"

    .line 235
    .line 236
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 240
    .line 241
    .line 242
    const-string v3, ": "

    .line 243
    .line 244
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2}, Lx0/a;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    const/4 v3, 0x1

    .line 255
    invoke-virtual {v2, v0, p3, v3}, Lx0/a;->f(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 256
    .line 257
    .line 258
    add-int/lit8 v1, v1, 0x1

    .line 259
    .line 260
    goto :goto_3

    .line 261
    :cond_4
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    new-instance p2, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 267
    .line 268
    .line 269
    const-string v0, "Back Stack Index: "

    .line 270
    .line 271
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    iget-object v0, p0, Lx0/y;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object p2

    .line 287
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    iget-object p2, p0, Lx0/y;->a:Ljava/util/ArrayList;

    .line 291
    .line 292
    monitor-enter p2

    .line 293
    :try_start_0
    iget-object v0, p0, Lx0/y;->a:Ljava/util/ArrayList;

    .line 294
    .line 295
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    if-lez v0, :cond_5

    .line 300
    .line 301
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    const-string v1, "Pending Actions:"

    .line 305
    .line 306
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    :goto_4
    if-ge p4, v0, :cond_5

    .line 310
    .line 311
    iget-object v1, p0, Lx0/y;->a:Ljava/util/ArrayList;

    .line 312
    .line 313
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    check-cast v1, Lx0/y$m;

    .line 318
    .line 319
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    const-string v2, "  #"

    .line 323
    .line 324
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 328
    .line 329
    .line 330
    const-string v2, ": "

    .line 331
    .line 332
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    add-int/lit8 p4, p4, 0x1

    .line 339
    .line 340
    goto :goto_4

    .line 341
    :cond_5
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 342
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    const-string p2, "FragmentManager misc state:"

    .line 346
    .line 347
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    const-string p2, "  mHost="

    .line 354
    .line 355
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    iget-object p2, p0, Lx0/y;->w:Lx0/t;

    .line 359
    .line 360
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    const-string p2, "  mContainer="

    .line 367
    .line 368
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    iget-object p2, p0, Lx0/y;->x:Lx0/p;

    .line 372
    .line 373
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    iget-object p2, p0, Lx0/y;->y:Lx0/i;

    .line 377
    .line 378
    if-eqz p2, :cond_6

    .line 379
    .line 380
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    const-string p2, "  mParent="

    .line 384
    .line 385
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    iget-object p2, p0, Lx0/y;->y:Lx0/i;

    .line 389
    .line 390
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    :cond_6
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    const-string p2, "  mCurState="

    .line 397
    .line 398
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    iget p2, p0, Lx0/y;->v:I

    .line 402
    .line 403
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    .line 404
    .line 405
    .line 406
    const-string p2, " mStateSaved="

    .line 407
    .line 408
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    iget-boolean p2, p0, Lx0/y;->H:Z

    .line 412
    .line 413
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 414
    .line 415
    .line 416
    const-string p2, " mStopped="

    .line 417
    .line 418
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    iget-boolean p2, p0, Lx0/y;->I:Z

    .line 422
    .line 423
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 424
    .line 425
    .line 426
    const-string p2, " mDestroyed="

    .line 427
    .line 428
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    iget-boolean p2, p0, Lx0/y;->J:Z

    .line 432
    .line 433
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    .line 434
    .line 435
    .line 436
    iget-boolean p2, p0, Lx0/y;->G:Z

    .line 437
    .line 438
    if-eqz p2, :cond_7

    .line 439
    .line 440
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    const-string p1, "  mNeedMenuInvalidate="

    .line 444
    .line 445
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    iget-boolean p1, p0, Lx0/y;->G:Z

    .line 449
    .line 450
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Z)V

    .line 451
    .line 452
    .line 453
    :cond_7
    return-void

    .line 454
    :catchall_0
    move-exception p1

    .line 455
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 456
    throw p1
.end method

.method public final x()V
    .locals 2

    invoke-virtual {p0}, Lx0/y;->f()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx0/r0;

    invoke-virtual {v1}, Lx0/r0;->l()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final y(Lx0/y$m;Z)V
    .locals 2

    .line 1
    if-nez p2, :cond_5

    .line 2
    .line 3
    iget-object v0, p0, Lx0/y;->w:Lx0/t;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean p1, p0, Lx0/y;->J:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string p2, "FragmentManager has been destroyed"

    .line 14
    .line 15
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string p2, "FragmentManager has not been attached to a host."

    .line 22
    .line 23
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    iget-boolean v0, p0, Lx0/y;->H:Z

    .line 28
    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    iget-boolean v0, p0, Lx0/y;->I:Z

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const/4 v0, 0x0

    .line 37
    goto :goto_1

    .line 38
    :cond_3
    :goto_0
    const/4 v0, 0x1

    .line 39
    :goto_1
    if-nez v0, :cond_4

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "Can not perform this action after onSaveInstanceState"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_5
    :goto_2
    iget-object v0, p0, Lx0/y;->a:Ljava/util/ArrayList;

    .line 51
    .line 52
    monitor-enter v0

    .line 53
    :try_start_0
    iget-object v1, p0, Lx0/y;->w:Lx0/t;

    .line 54
    .line 55
    if-nez v1, :cond_7

    .line 56
    .line 57
    if-eqz p2, :cond_6

    .line 58
    .line 59
    monitor-exit v0

    .line 60
    return-void

    .line 61
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string p2, "Activity has been destroyed"

    .line 64
    .line 65
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_7
    iget-object p2, p0, Lx0/y;->a:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lx0/y;->X()V

    .line 75
    .line 76
    .line 77
    monitor-exit v0

    .line 78
    return-void

    .line 79
    :catchall_0
    move-exception p1

    .line 80
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    throw p1
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final z(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lx0/y;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_8

    .line 4
    .line 5
    iget-object v0, p0, Lx0/y;->w:Lx0/t;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean p1, p0, Lx0/y;->J:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v0, "FragmentManager has been destroyed"

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "FragmentManager has not been attached to a host."

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, Lx0/y;->w:Lx0/t;

    .line 34
    .line 35
    iget-object v1, v1, Lx0/t;->c:Landroid/os/Handler;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-ne v0, v1, :cond_7

    .line 42
    .line 43
    if-nez p1, :cond_5

    .line 44
    .line 45
    iget-boolean p1, p0, Lx0/y;->H:Z

    .line 46
    .line 47
    if-nez p1, :cond_3

    .line 48
    .line 49
    iget-boolean p1, p0, Lx0/y;->I:Z

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const/4 p1, 0x0

    .line 55
    goto :goto_1

    .line 56
    :cond_3
    :goto_0
    const/4 p1, 0x1

    .line 57
    :goto_1
    if-nez p1, :cond_4

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string v0, "Can not perform this action after onSaveInstanceState"

    .line 63
    .line 64
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_5
    :goto_2
    iget-object p1, p0, Lx0/y;->L:Ljava/util/ArrayList;

    .line 69
    .line 70
    if-nez p1, :cond_6

    .line 71
    .line 72
    new-instance p1, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Lx0/y;->L:Ljava/util/ArrayList;

    .line 78
    .line 79
    new-instance p1, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object p1, p0, Lx0/y;->M:Ljava/util/ArrayList;

    .line 85
    .line 86
    :cond_6
    return-void

    .line 87
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    const-string v0, "Must be called from main thread of fragment host"

    .line 90
    .line 91
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 96
    .line 97
    const-string v0, "FragmentManager is already executing transactions"

    .line 98
    .line 99
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p1
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method
