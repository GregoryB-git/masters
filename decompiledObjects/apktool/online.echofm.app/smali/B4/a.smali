.class public LB4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB4/a$a;,
        LB4/a$b;
    }
.end annotation


# static fields
.field public static final F:LF4/a;

.field public static volatile G:LB4/a;


# instance fields
.field public A:LM4/l;

.field public B:LM4/l;

.field public C:LN4/d;

.field public D:Z

.field public E:Z

.field public final o:Ljava/util/WeakHashMap;

.field public final p:Ljava/util/WeakHashMap;

.field public final q:Ljava/util/WeakHashMap;

.field public final r:Ljava/util/WeakHashMap;

.field public final s:Ljava/util/Map;

.field public final t:Ljava/util/Set;

.field public u:Ljava/util/Set;

.field public final v:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final w:LL4/k;

.field public final x:LC4/a;

.field public final y:LM4/a;

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, LF4/a;->e()LF4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, LB4/a;->F:LF4/a;

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(LL4/k;LM4/a;)V
    .locals 2

    .line 1
    invoke-static {}, LC4/a;->g()LC4/a;

    move-result-object v0

    invoke-static {}, LB4/a;->f()Z

    move-result v1

    invoke-direct {p0, p1, p2, v0, v1}, LB4/a;-><init>(LL4/k;LM4/a;LC4/a;Z)V

    return-void
.end method

.method public constructor <init>(LL4/k;LM4/a;LC4/a;Z)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, LB4/a;->o:Ljava/util/WeakHashMap;

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, LB4/a;->p:Ljava/util/WeakHashMap;

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, LB4/a;->q:Ljava/util/WeakHashMap;

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, LB4/a;->r:Ljava/util/WeakHashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LB4/a;->s:Ljava/util/Map;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LB4/a;->t:Ljava/util/Set;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LB4/a;->u:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, LB4/a;->v:Ljava/util/concurrent/atomic/AtomicInteger;

    sget-object v0, LN4/d;->r:LN4/d;

    iput-object v0, p0, LB4/a;->C:LN4/d;

    iput-boolean v1, p0, LB4/a;->D:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, LB4/a;->E:Z

    iput-object p1, p0, LB4/a;->w:LL4/k;

    iput-object p2, p0, LB4/a;->y:LM4/a;

    iput-object p3, p0, LB4/a;->x:LC4/a;

    iput-boolean p4, p0, LB4/a;->z:Z

    return-void
.end method

.method public static b()LB4/a;
    .locals 4

    .line 1
    sget-object v0, LB4/a;->G:LB4/a;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, LB4/a;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, LB4/a;->G:LB4/a;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, LB4/a;

    .line 13
    .line 14
    invoke-static {}, LL4/k;->l()LL4/k;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    new-instance v3, LM4/a;

    .line 19
    .line 20
    invoke-direct {v3}, LM4/a;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, v2, v3}, LB4/a;-><init>(LL4/k;LM4/a;)V

    .line 24
    .line 25
    .line 26
    sput-object v1, LB4/a;->G:LB4/a;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    monitor-exit v0

    .line 32
    goto :goto_2

    .line 33
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw v1

    .line 35
    :cond_1
    :goto_2
    sget-object v0, LB4/a;->G:LB4/a;

    .line 36
    .line 37
    return-object v0
.end method

.method public static c(Landroid/app/Activity;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "_st_"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static f()Z
    .locals 1

    .line 1
    invoke-static {}, LB4/d;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method


# virtual methods
.method public a()LN4/d;
    .locals 1

    .line 1
    iget-object v0, p0, LB4/a;->C:LN4/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public d(Ljava/lang/String;J)V
    .locals 5

    .line 1
    iget-object v0, p0, LB4/a;->s:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LB4/a;->s:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Ljava/lang/Long;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, LB4/a;->s:Ljava/util/Map;

    .line 15
    .line 16
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object v2, p0, LB4/a;->s:Ljava/util/Map;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    add-long/2addr v3, p2

    .line 33
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-interface {v2, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    :goto_0
    monitor-exit v0

    .line 41
    return-void

    .line 42
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    throw p1
.end method

.method public e(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LB4/a;->v:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LB4/a;->z:Z

    .line 2
    .line 3
    return v0
.end method

.method public declared-synchronized h(Landroid/content/Context;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LB4/a;->D:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    instance-of v0, p1, Landroid/app/Application;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    check-cast p1, Landroid/app/Application;

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, LB4/a;->D:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    monitor-exit p0

    .line 28
    return-void

    .line 29
    :goto_1
    monitor-exit p0

    .line 30
    throw p1
.end method

.method public i(LB4/a$a;)V
    .locals 2

    .line 1
    iget-object v0, p0, LB4/a;->u:Ljava/util/Set;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LB4/a;->u:Ljava/util/Set;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
.end method

.method public j(Ljava/lang/ref/WeakReference;)V
    .locals 2

    .line 1
    iget-object v0, p0, LB4/a;->t:Ljava/util/Set;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LB4/a;->t:Ljava/util/Set;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
.end method

.method public final k()V
    .locals 3

    .line 1
    iget-object v0, p0, LB4/a;->u:Ljava/util/Set;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LB4/a;->u:Ljava/util/Set;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, LB4/a$a;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-interface {v2}, LB4/a$a;->a()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    throw v1
.end method

.method public final l(Landroid/app/Activity;)V
    .locals 3

    .line 1
    iget-object v0, p0, LB4/a;->r:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/firebase/perf/metrics/Trace;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v1, p0, LB4/a;->r:Ljava/util/WeakHashMap;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, LB4/a;->p:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, LB4/d;

    .line 24
    .line 25
    invoke-virtual {v1}, LB4/d;->e()LM4/g;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, LM4/g;->d()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    sget-object v0, LB4/a;->F:LF4/a;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const/4 v1, 0x1

    .line 46
    new-array v1, v1, [Ljava/lang/Object;

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    aput-object p1, v1, v2

    .line 50
    .line 51
    const-string p1, "Failed to record frame data for %s."

    .line 52
    .line 53
    invoke-virtual {v0, p1, v1}, LF4/a;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    invoke-virtual {v1}, LM4/g;->c()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, LG4/h$a;

    .line 62
    .line 63
    invoke-static {v0, p1}, LM4/j;->a(Lcom/google/firebase/perf/metrics/Trace;LG4/h$a;)Lcom/google/firebase/perf/metrics/Trace;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/google/firebase/perf/metrics/Trace;->stop()V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final m(Ljava/lang/String;LM4/l;LM4/l;)V
    .locals 3

    .line 1
    iget-object v0, p0, LB4/a;->x:LC4/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LC4/a;->L()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-static {}, LN4/m;->z0()LN4/m$b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, LN4/m$b;->N(Ljava/lang/String;)LN4/m$b;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p2}, LM4/l;->e()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-virtual {p1, v0, v1}, LN4/m$b;->L(J)LN4/m$b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p2, p3}, LM4/l;->d(LM4/l;)J

    .line 27
    .line 28
    .line 29
    move-result-wide p2

    .line 30
    invoke-virtual {p1, p2, p3}, LN4/m$b;->M(J)LN4/m$b;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p2}, Lcom/google/firebase/perf/session/SessionManager;->perfSession()LJ4/a;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p2}, LJ4/a;->a()LN4/k;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {p1, p2}, LN4/m$b;->F(LN4/k;)LN4/m$b;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object p2, p0, LB4/a;->v:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 51
    .line 52
    const/4 p3, 0x0

    .line 53
    invoke-virtual {p2, p3}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    iget-object p3, p0, LB4/a;->s:Ljava/util/Map;

    .line 58
    .line 59
    monitor-enter p3

    .line 60
    :try_start_0
    iget-object v0, p0, LB4/a;->s:Ljava/util/Map;

    .line 61
    .line 62
    invoke-virtual {p1, v0}, LN4/m$b;->H(Ljava/util/Map;)LN4/m$b;

    .line 63
    .line 64
    .line 65
    if-eqz p2, :cond_1

    .line 66
    .line 67
    sget-object v0, LM4/b;->r:LM4/b;

    .line 68
    .line 69
    invoke-virtual {v0}, LM4/b;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    int-to-long v1, p2

    .line 74
    invoke-virtual {p1, v0, v1, v2}, LN4/m$b;->J(Ljava/lang/String;J)LN4/m$b;

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catchall_0
    move-exception p1

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    :goto_0
    iget-object p2, p0, LB4/a;->s:Ljava/util/Map;

    .line 81
    .line 82
    invoke-interface {p2}, Ljava/util/Map;->clear()V

    .line 83
    .line 84
    .line 85
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    iget-object p2, p0, LB4/a;->w:LL4/k;

    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/google/protobuf/r$a;->v()Lcom/google/protobuf/r;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, LN4/m;

    .line 93
    .line 94
    sget-object p3, LN4/d;->s:LN4/d;

    .line 95
    .line 96
    invoke-virtual {p2, p1, p3}, LL4/k;->D(LN4/m;LN4/d;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :goto_1
    :try_start_1
    monitor-exit p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    throw p1
.end method

.method public final n(Landroid/app/Activity;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LB4/a;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LB4/a;->x:LC4/a;

    .line 8
    .line 9
    invoke-virtual {v0}, LC4/a;->L()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, LB4/d;

    .line 16
    .line 17
    invoke-direct {v0, p1}, LB4/d;-><init>(Landroid/app/Activity;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, LB4/a;->p:Ljava/util/WeakHashMap;

    .line 21
    .line 22
    invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    instance-of v1, p1, Landroidx/fragment/app/e;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    new-instance v1, LB4/c;

    .line 30
    .line 31
    iget-object v2, p0, LB4/a;->y:LM4/a;

    .line 32
    .line 33
    iget-object v3, p0, LB4/a;->w:LL4/k;

    .line 34
    .line 35
    invoke-direct {v1, v2, v3, p0, v0}, LB4/c;-><init>(LM4/a;LL4/k;LB4/a;LB4/d;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, LB4/a;->q:Ljava/util/WeakHashMap;

    .line 39
    .line 40
    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    check-cast p1, Landroidx/fragment/app/e;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroidx/fragment/app/e;->n()Landroidx/fragment/app/n;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const/4 v0, 0x1

    .line 50
    invoke-virtual {p1, v1, v0}, Landroidx/fragment/app/n;->W0(Landroidx/fragment/app/n$l;Z)V

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
.end method

.method public o(Ljava/lang/ref/WeakReference;)V
    .locals 2

    .line 1
    iget-object v0, p0, LB4/a;->t:Ljava/util/Set;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LB4/a;->t:Ljava/util/Set;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LB4/a;->n(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget-object v0, p0, LB4/a;->p:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LB4/a;->q:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Landroidx/fragment/app/e;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/fragment/app/e;->n()Landroidx/fragment/app/n;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, LB4/a;->q:Ljava/util/WeakHashMap;

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Landroidx/fragment/app/n$l;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Landroidx/fragment/app/n;->m1(Landroidx/fragment/app/n$l;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public declared-synchronized onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LB4/a;->o:Ljava/util/WeakHashMap;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, LB4/a;->y:LM4/a;

    .line 11
    .line 12
    invoke-virtual {v0}, LM4/a;->a()LM4/l;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, LB4/a;->A:LM4/l;

    .line 17
    .line 18
    iget-object v0, p0, LB4/a;->o:Ljava/util/WeakHashMap;

    .line 19
    .line 20
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    iget-boolean p1, p0, LB4/a;->E:Z

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    sget-object p1, LN4/d;->q:LN4/d;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, LB4/a;->p(LN4/d;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, LB4/a;->k()V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iput-boolean p1, p0, LB4/a;->E:Z

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    sget-object p1, LM4/c;->u:LM4/c;

    .line 44
    .line 45
    invoke-virtual {p1}, LM4/c;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object v0, p0, LB4/a;->B:LM4/l;

    .line 50
    .line 51
    iget-object v1, p0, LB4/a;->A:LM4/l;

    .line 52
    .line 53
    invoke-virtual {p0, p1, v0, v1}, LB4/a;->m(Ljava/lang/String;LM4/l;LM4/l;)V

    .line 54
    .line 55
    .line 56
    sget-object p1, LN4/d;->q:LN4/d;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, LB4/a;->p(LN4/d;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget-object v0, p0, LB4/a;->o:Ljava/util/WeakHashMap;

    .line 63
    .line 64
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    :goto_0
    monitor-exit p0

    .line 70
    return-void

    .line 71
    :goto_1
    monitor-exit p0

    .line 72
    throw p1
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public declared-synchronized onActivityStarted(Landroid/app/Activity;)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, LB4/a;->g()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, LB4/a;->x:LC4/a;

    .line 9
    .line 10
    invoke-virtual {v0}, LC4/a;->L()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, LB4/a;->p:Ljava/util/WeakHashMap;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, p1}, LB4/a;->n(Landroid/app/Activity;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    iget-object v0, p0, LB4/a;->p:Ljava/util/WeakHashMap;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, LB4/d;

    .line 37
    .line 38
    invoke-virtual {v0}, LB4/d;->c()V

    .line 39
    .line 40
    .line 41
    new-instance v0, Lcom/google/firebase/perf/metrics/Trace;

    .line 42
    .line 43
    invoke-static {p1}, LB4/a;->c(Landroid/app/Activity;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget-object v2, p0, LB4/a;->w:LL4/k;

    .line 48
    .line 49
    iget-object v3, p0, LB4/a;->y:LM4/a;

    .line 50
    .line 51
    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/firebase/perf/metrics/Trace;-><init>(Ljava/lang/String;LL4/k;LM4/a;LB4/a;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/google/firebase/perf/metrics/Trace;->start()V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, LB4/a;->r:Ljava/util/WeakHashMap;

    .line 58
    .line 59
    invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    :cond_1
    monitor-exit p0

    .line 63
    return-void

    .line 64
    :goto_1
    monitor-exit p0

    .line 65
    throw p1
.end method

.method public declared-synchronized onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, LB4/a;->g()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, LB4/a;->l(Landroid/app/Activity;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :goto_0
    iget-object v0, p0, LB4/a;->o:Ljava/util/WeakHashMap;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, LB4/a;->o:Ljava/util/WeakHashMap;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, LB4/a;->o:Ljava/util/WeakHashMap;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/util/WeakHashMap;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    iget-object p1, p0, LB4/a;->y:LM4/a;

    .line 36
    .line 37
    invoke-virtual {p1}, LM4/a;->a()LM4/l;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, LB4/a;->B:LM4/l;

    .line 42
    .line 43
    sget-object p1, LM4/c;->t:LM4/c;

    .line 44
    .line 45
    invoke-virtual {p1}, LM4/c;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object v0, p0, LB4/a;->A:LM4/l;

    .line 50
    .line 51
    iget-object v1, p0, LB4/a;->B:LM4/l;

    .line 52
    .line 53
    invoke-virtual {p0, p1, v0, v1}, LB4/a;->m(Ljava/lang/String;LM4/l;LM4/l;)V

    .line 54
    .line 55
    .line 56
    sget-object p1, LN4/d;->r:LN4/d;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, LB4/a;->p(LN4/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    :cond_1
    monitor-exit p0

    .line 62
    return-void

    .line 63
    :goto_1
    monitor-exit p0

    .line 64
    throw p1
.end method

.method public final p(LN4/d;)V
    .locals 3

    .line 1
    iput-object p1, p0, LB4/a;->C:LN4/d;

    .line 2
    .line 3
    iget-object p1, p0, LB4/a;->t:Ljava/util/Set;

    .line 4
    .line 5
    monitor-enter p1

    .line 6
    :try_start_0
    iget-object v0, p0, LB4/a;->t:Ljava/util/Set;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, LB4/a$b;

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    iget-object v2, p0, LB4/a;->C:LN4/d;

    .line 33
    .line 34
    invoke-interface {v1, v2}, LB4/a$b;->b(LN4/d;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    monitor-exit p1

    .line 45
    return-void

    .line 46
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    throw v0
.end method
