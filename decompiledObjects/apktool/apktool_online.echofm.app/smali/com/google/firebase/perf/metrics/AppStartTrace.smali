.class public Lcom/google/firebase/perf/metrics/AppStartTrace;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;
.implements Landroidx/lifecycle/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/perf/metrics/AppStartTrace$b;,
        Lcom/google/firebase/perf/metrics/AppStartTrace$c;
    }
.end annotation


# static fields
.field public static final M:LM4/l;

.field public static final N:J

.field public static volatile O:Lcom/google/firebase/perf/metrics/AppStartTrace;

.field public static P:Ljava/util/concurrent/ExecutorService;


# instance fields
.field public A:LM4/l;

.field public B:LM4/l;

.field public C:LM4/l;

.field public D:LM4/l;

.field public E:LM4/l;

.field public F:LM4/l;

.field public G:LM4/l;

.field public H:LJ4/a;

.field public I:Z

.field public J:I

.field public final K:Lcom/google/firebase/perf/metrics/AppStartTrace$b;

.field public L:Z

.field public o:Z

.field public final p:LL4/k;

.field public final q:LM4/a;

.field public final r:LC4/a;

.field public final s:LN4/m$b;

.field public t:Landroid/content/Context;

.field public u:Ljava/lang/ref/WeakReference;

.field public v:Ljava/lang/ref/WeakReference;

.field public w:Z

.field public final x:LM4/l;

.field public final y:LM4/l;

.field public z:LM4/l;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LM4/a;

    invoke-direct {v0}, LM4/a;-><init>()V

    invoke-virtual {v0}, LM4/a;->a()LM4/l;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->M:LM4/l;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->N:J

    return-void
.end method

.method public constructor <init>(LL4/k;LM4/a;LC4/a;Ljava/util/concurrent/ExecutorService;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->o:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->w:Z

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:LM4/l;

    .line 11
    .line 12
    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->A:LM4/l;

    .line 13
    .line 14
    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->B:LM4/l;

    .line 15
    .line 16
    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->C:LM4/l;

    .line 17
    .line 18
    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->D:LM4/l;

    .line 19
    .line 20
    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->E:LM4/l;

    .line 21
    .line 22
    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->F:LM4/l;

    .line 23
    .line 24
    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->G:LM4/l;

    .line 25
    .line 26
    iput-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->I:Z

    .line 27
    .line 28
    iput v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->J:I

    .line 29
    .line 30
    new-instance v2, Lcom/google/firebase/perf/metrics/AppStartTrace$b;

    .line 31
    .line 32
    invoke-direct {v2, p0, v1}, Lcom/google/firebase/perf/metrics/AppStartTrace$b;-><init>(Lcom/google/firebase/perf/metrics/AppStartTrace;Lcom/google/firebase/perf/metrics/AppStartTrace$a;)V

    .line 33
    .line 34
    .line 35
    iput-object v2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->K:Lcom/google/firebase/perf/metrics/AppStartTrace$b;

    .line 36
    .line 37
    iput-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->L:Z

    .line 38
    .line 39
    iput-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->p:LL4/k;

    .line 40
    .line 41
    iput-object p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->q:LM4/a;

    .line 42
    .line 43
    iput-object p3, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->r:LC4/a;

    .line 44
    .line 45
    sput-object p4, Lcom/google/firebase/perf/metrics/AppStartTrace;->P:Ljava/util/concurrent/ExecutorService;

    .line 46
    .line 47
    invoke-static {}, LN4/m;->z0()LN4/m$b;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string p2, "_experiment_app_start_ttid"

    .line 52
    .line 53
    invoke-virtual {p1, p2}, LN4/m$b;->N(Ljava/lang/String;)LN4/m$b;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->s:LN4/m$b;

    .line 58
    .line 59
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 60
    .line 61
    const/16 p2, 0x18

    .line 62
    .line 63
    if-lt p1, p2, :cond_0

    .line 64
    .line 65
    invoke-static {}, LG4/a;->a()J

    .line 66
    .line 67
    .line 68
    move-result-wide p1

    .line 69
    invoke-static {p1, p2}, LM4/l;->f(J)LM4/l;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    goto :goto_0

    .line 74
    :cond_0
    move-object p1, v1

    .line 75
    :goto_0
    iput-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->x:LM4/l;

    .line 76
    .line 77
    invoke-static {}, Ls3/e;->o()Ls3/e;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const-class p2, Ls3/n;

    .line 82
    .line 83
    invoke-virtual {p1, p2}, Ls3/e;->k(Ljava/lang/Class;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, Ls3/n;

    .line 88
    .line 89
    if-eqz p1, :cond_1

    .line 90
    .line 91
    invoke-virtual {p1}, Ls3/n;->b()J

    .line 92
    .line 93
    .line 94
    move-result-wide p1

    .line 95
    invoke-static {p1, p2}, LM4/l;->f(J)LM4/l;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    :cond_1
    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->y:LM4/l;

    .line 100
    .line 101
    return-void
.end method

.method public static synthetic b(Lcom/google/firebase/perf/metrics/AppStartTrace;LN4/m$b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/firebase/perf/metrics/AppStartTrace;->o(LN4/m$b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lcom/google/firebase/perf/metrics/AppStartTrace;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->p()V

    return-void
.end method

.method public static synthetic d(Lcom/google/firebase/perf/metrics/AppStartTrace;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->s()V

    return-void
.end method

.method public static synthetic e(Lcom/google/firebase/perf/metrics/AppStartTrace;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->t()V

    return-void
.end method

.method public static synthetic f(Lcom/google/firebase/perf/metrics/AppStartTrace;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->r()V

    return-void
.end method

.method public static synthetic g(Lcom/google/firebase/perf/metrics/AppStartTrace;)LM4/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:LM4/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic h(Lcom/google/firebase/perf/metrics/AppStartTrace;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->I:Z

    return p1
.end method

.method public static synthetic i(Lcom/google/firebase/perf/metrics/AppStartTrace;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->J:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->J:I

    return v0
.end method

.method public static k()Lcom/google/firebase/perf/metrics/AppStartTrace;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->O:Lcom/google/firebase/perf/metrics/AppStartTrace;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->O:Lcom/google/firebase/perf/metrics/AppStartTrace;

    goto :goto_0

    :cond_0
    invoke-static {}, LL4/k;->l()LL4/k;

    move-result-object v0

    new-instance v1, LM4/a;

    invoke-direct {v1}, LM4/a;-><init>()V

    invoke-static {v0, v1}, Lcom/google/firebase/perf/metrics/AppStartTrace;->l(LL4/k;LM4/a;)Lcom/google/firebase/perf/metrics/AppStartTrace;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static l(LL4/k;LM4/a;)Lcom/google/firebase/perf/metrics/AppStartTrace;
    .locals 11

    .line 1
    sget-object v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->O:Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->O:Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 13
    .line 14
    invoke-static {}, LC4/a;->g()LC4/a;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    new-instance v10, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 19
    .line 20
    sget-wide v3, Lcom/google/firebase/perf/metrics/AppStartTrace;->N:J

    .line 21
    .line 22
    const-wide/16 v5, 0xa

    .line 23
    .line 24
    add-long v6, v3, v5

    .line 25
    .line 26
    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 27
    .line 28
    new-instance v9, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 29
    .line 30
    invoke-direct {v9}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 31
    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x1

    .line 35
    move-object v3, v10

    .line 36
    invoke-direct/range {v3 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {v1, p0, p1, v2, v10}, Lcom/google/firebase/perf/metrics/AppStartTrace;-><init>(LL4/k;LM4/a;LC4/a;Ljava/util/concurrent/ExecutorService;)V

    .line 40
    .line 41
    .line 42
    sput-object v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->O:Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    :goto_0
    monitor-exit v0

    .line 48
    goto :goto_2

    .line 49
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    throw p0

    .line 51
    :cond_1
    :goto_2
    sget-object p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->O:Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 52
    .line 53
    return-object p0
.end method

.method public static n(Landroid/content/Context;)Z
    .locals 6

    .line 1
    const-string v0, "activity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget v4, v3, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v5, 0x64

    if-eq v4, v5, :cond_2

    goto :goto_0

    :cond_2
    iget-object v4, v3, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    iget-object v3, v3, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_3
    return v1

    :cond_4
    const/4 p0, 0x0

    return p0
.end method

.method public static setLauncherActivityOnCreateTime(Ljava/lang/String;)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    return-void
.end method

.method public static setLauncherActivityOnResumeTime(Ljava/lang/String;)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    return-void
.end method

.method public static setLauncherActivityOnStartTime(Ljava/lang/String;)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    return-void
.end method


# virtual methods
.method public final j()LM4/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->y:LM4/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    sget-object v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->M:LM4/l;

    .line 7
    .line 8
    return-object v0
.end method

.method public final m()LM4/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->x:LM4/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->j()LM4/l;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public final synthetic o(LN4/m$b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->p:LL4/k;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/protobuf/r$a;->v()Lcom/google/protobuf/r;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LN4/m;

    .line 8
    .line 9
    sget-object v1, LN4/d;->s:LN4/d;

    .line 10
    .line 11
    invoke-virtual {v0, p1, v1}, LL4/k;->D(LN4/m;LN4/d;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public declared-synchronized onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->I:Z

    if-nez p2, :cond_4

    iget-object p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:LM4/l;

    if-eqz p2, :cond_0

    goto :goto_2

    :cond_0
    iget-boolean p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->L:Z

    const/4 v0, 0x1

    if-nez p2, :cond_2

    iget-object p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->t:Landroid/content/Context;

    invoke-static {p2}, Lcom/google/firebase/perf/metrics/AppStartTrace;->n(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_0
    move p2, v0

    :goto_1
    iput-boolean p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->L:Z

    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->u:Ljava/lang/ref/WeakReference;

    iget-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->q:LM4/a;

    invoke-virtual {p1}, LM4/a;->a()LM4/l;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:LM4/l;

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->m()LM4/l;

    move-result-object p1

    iget-object p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:LM4/l;

    invoke-virtual {p1, p2}, LM4/l;->d(LM4/l;)J

    move-result-wide p1

    sget-wide v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->N:J

    cmp-long p1, p1, v1

    if-lez p1, :cond_3

    iput-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    monitor-exit p0

    return-void

    :cond_4
    :goto_2
    monitor-exit p0

    return-void

    :goto_3
    monitor-exit p0

    throw p1
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->I:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->w:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->r:LC4/a;

    invoke-virtual {v0}, LC4/a;->h()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x1020002

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->K:Lcom/google/firebase/perf/metrics/AppStartTrace$b;

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public declared-synchronized onActivityResumed(Landroid/app/Activity;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->I:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->w:Z

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->r:LC4/a;

    invoke-virtual {v0}, LC4/a;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    const v1, 0x1020002

    invoke-virtual {p1, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->K:Lcom/google/firebase/perf/metrics/AppStartTrace$b;

    invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->addOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    new-instance v2, LG4/b;

    invoke-direct {v2, p0}, LG4/b;-><init>(Lcom/google/firebase/perf/metrics/AppStartTrace;)V

    invoke-static {v1, v2}, LM4/e;->e(Landroid/view/View;Ljava/lang/Runnable;)V

    new-instance v2, LG4/c;

    invoke-direct {v2, p0}, LG4/c;-><init>(Lcom/google/firebase/perf/metrics/AppStartTrace;)V

    new-instance v3, LG4/d;

    invoke-direct {v3, p0}, LG4/d;-><init>(Lcom/google/firebase/perf/metrics/AppStartTrace;)V

    invoke-static {v1, v2, v3}, LM4/h;->a(Landroid/view/View;Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->B:LM4/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    monitor-exit p0

    return-void

    :cond_2
    :try_start_1
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->v:Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->q:LM4/a;

    invoke-virtual {v1}, LM4/a;->a()LM4/l;

    move-result-object v1

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->B:LM4/l;

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/perf/session/SessionManager;->perfSession()LJ4/a;

    move-result-object v1

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->H:LJ4/a;

    invoke-static {}, LF4/a;->e()LF4/a;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onResume(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->j()LM4/l;

    move-result-object p1

    iget-object v3, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->B:LM4/l;

    invoke-virtual {p1, v3}, LM4/l;->d(LM4/l;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " microseconds"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, LF4/a;->a(Ljava/lang/String;)V

    sget-object p1, Lcom/google/firebase/perf/metrics/AppStartTrace;->P:Ljava/util/concurrent/ExecutorService;

    new-instance v1, LG4/e;

    invoke-direct {v1, p0}, LG4/e;-><init>(Lcom/google/firebase/perf/metrics/AppStartTrace;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->v()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    monitor-exit p0

    return-void

    :cond_4
    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public declared-synchronized onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iget-boolean p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->I:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->A:LM4/l;

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->w:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->q:LM4/a;

    invoke-virtual {p1}, LM4/a;->a()LM4/l;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->A:LM4/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onAppEnteredBackground()V
    .locals 4
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation runtime Landroidx/lifecycle/n;
        value = .enum Landroidx/lifecycle/d$b;->ON_STOP:Landroidx/lifecycle/d$b;
    .end annotation

    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->I:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->w:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->D:LM4/l;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->q:LM4/a;

    invoke-virtual {v0}, LM4/a;->a()LM4/l;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->D:LM4/l;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->s:LN4/m$b;

    invoke-static {}, LN4/m;->z0()LN4/m$b;

    move-result-object v1

    const-string v2, "_experiment_firstBackgrounding"

    invoke-virtual {v1, v2}, LN4/m$b;->N(Ljava/lang/String;)LN4/m$b;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->m()LM4/l;

    move-result-object v2

    invoke-virtual {v2}, LM4/l;->e()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LN4/m$b;->L(J)LN4/m$b;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->m()LM4/l;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->D:LM4/l;

    invoke-virtual {v2, v3}, LM4/l;->d(LM4/l;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LN4/m$b;->M(J)LN4/m$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/r$a;->v()Lcom/google/protobuf/r;

    move-result-object v1

    check-cast v1, LN4/m;

    invoke-virtual {v0, v1}, LN4/m$b;->G(LN4/m;)LN4/m$b;

    :cond_1
    :goto_0
    return-void
.end method

.method public onAppEnteredForeground()V
    .locals 4
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation runtime Landroidx/lifecycle/n;
        value = .enum Landroidx/lifecycle/d$b;->ON_START:Landroidx/lifecycle/d$b;
    .end annotation

    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->I:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->w:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->C:LM4/l;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->q:LM4/a;

    invoke-virtual {v0}, LM4/a;->a()LM4/l;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->C:LM4/l;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->s:LN4/m$b;

    invoke-static {}, LN4/m;->z0()LN4/m$b;

    move-result-object v1

    const-string v2, "_experiment_firstForegrounding"

    invoke-virtual {v1, v2}, LN4/m$b;->N(Ljava/lang/String;)LN4/m$b;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->m()LM4/l;

    move-result-object v2

    invoke-virtual {v2}, LM4/l;->e()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LN4/m$b;->L(J)LN4/m$b;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->m()LM4/l;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->C:LM4/l;

    invoke-virtual {v2, v3}, LM4/l;->d(LM4/l;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LN4/m$b;->M(J)LN4/m$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/r$a;->v()Lcom/google/protobuf/r;

    move-result-object v1

    check-cast v1, LN4/m;

    invoke-virtual {v0, v1}, LN4/m$b;->G(LN4/m;)LN4/m$b;

    :cond_1
    :goto_0
    return-void
.end method

.method public final p()V
    .locals 6

    .line 1
    invoke-static {}, LN4/m;->z0()LN4/m$b;

    move-result-object v0

    sget-object v1, LM4/c;->p:LM4/c;

    invoke-virtual {v1}, LM4/c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LN4/m$b;->N(Ljava/lang/String;)LN4/m$b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->j()LM4/l;

    move-result-object v1

    invoke-virtual {v1}, LM4/l;->e()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LN4/m$b;->L(J)LN4/m$b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->j()LM4/l;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->B:LM4/l;

    invoke-virtual {v1, v2}, LM4/l;->d(LM4/l;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LN4/m$b;->M(J)LN4/m$b;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {}, LN4/m;->z0()LN4/m$b;

    move-result-object v2

    sget-object v3, LM4/c;->q:LM4/c;

    invoke-virtual {v3}, LM4/c;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, LN4/m$b;->N(Ljava/lang/String;)LN4/m$b;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->j()LM4/l;

    move-result-object v3

    invoke-virtual {v3}, LM4/l;->e()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, LN4/m$b;->L(J)LN4/m$b;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->j()LM4/l;

    move-result-object v3

    iget-object v4, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:LM4/l;

    invoke-virtual {v3, v4}, LM4/l;->d(LM4/l;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, LN4/m$b;->M(J)LN4/m$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/protobuf/r$a;->v()Lcom/google/protobuf/r;

    move-result-object v2

    check-cast v2, LN4/m;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->A:LM4/l;

    if-eqz v2, :cond_0

    invoke-static {}, LN4/m;->z0()LN4/m$b;

    move-result-object v2

    sget-object v3, LM4/c;->r:LM4/c;

    invoke-virtual {v3}, LM4/c;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, LN4/m$b;->N(Ljava/lang/String;)LN4/m$b;

    move-result-object v3

    iget-object v4, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:LM4/l;

    invoke-virtual {v4}, LM4/l;->e()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, LN4/m$b;->L(J)LN4/m$b;

    move-result-object v3

    iget-object v4, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:LM4/l;

    iget-object v5, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->A:LM4/l;

    invoke-virtual {v4, v5}, LM4/l;->d(LM4/l;)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, LN4/m$b;->M(J)LN4/m$b;

    invoke-virtual {v2}, Lcom/google/protobuf/r$a;->v()Lcom/google/protobuf/r;

    move-result-object v2

    check-cast v2, LN4/m;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, LN4/m;->z0()LN4/m$b;

    move-result-object v2

    sget-object v3, LM4/c;->s:LM4/c;

    invoke-virtual {v3}, LM4/c;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, LN4/m$b;->N(Ljava/lang/String;)LN4/m$b;

    move-result-object v3

    iget-object v4, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->A:LM4/l;

    invoke-virtual {v4}, LM4/l;->e()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, LN4/m$b;->L(J)LN4/m$b;

    move-result-object v3

    iget-object v4, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->A:LM4/l;

    iget-object v5, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->B:LM4/l;

    invoke-virtual {v4, v5}, LM4/l;->d(LM4/l;)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, LN4/m$b;->M(J)LN4/m$b;

    invoke-virtual {v2}, Lcom/google/protobuf/r$a;->v()Lcom/google/protobuf/r;

    move-result-object v2

    check-cast v2, LN4/m;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {v0, v1}, LN4/m$b;->E(Ljava/lang/Iterable;)LN4/m$b;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->H:LJ4/a;

    invoke-virtual {v2}, LJ4/a;->a()LN4/k;

    move-result-object v2

    invoke-virtual {v1, v2}, LN4/m$b;->F(LN4/k;)LN4/m$b;

    iget-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->p:LL4/k;

    invoke-virtual {v0}, Lcom/google/protobuf/r$a;->v()Lcom/google/protobuf/r;

    move-result-object v0

    check-cast v0, LN4/m;

    sget-object v2, LN4/d;->s:LN4/d;

    invoke-virtual {v1, v0, v2}, LL4/k;->D(LN4/m;LN4/d;)V

    return-void
.end method

.method public final q(LN4/m$b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->E:LM4/l;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->F:LM4/l;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->G:LM4/l;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->P:Ljava/util/concurrent/ExecutorService;

    .line 15
    .line 16
    new-instance v1, LG4/f;

    .line 17
    .line 18
    invoke-direct {v1, p0, p1}, LG4/f;-><init>(Lcom/google/firebase/perf/metrics/AppStartTrace;LN4/m$b;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->v()V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
.end method

.method public final r()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->G:LM4/l;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->q:LM4/a;

    invoke-virtual {v0}, LM4/a;->a()LM4/l;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->G:LM4/l;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->s:LN4/m$b;

    invoke-static {}, LN4/m;->z0()LN4/m$b;

    move-result-object v1

    const-string v2, "_experiment_onDrawFoQ"

    invoke-virtual {v1, v2}, LN4/m$b;->N(Ljava/lang/String;)LN4/m$b;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->m()LM4/l;

    move-result-object v2

    invoke-virtual {v2}, LM4/l;->e()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LN4/m$b;->L(J)LN4/m$b;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->m()LM4/l;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->G:LM4/l;

    invoke-virtual {v2, v3}, LM4/l;->d(LM4/l;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LN4/m$b;->M(J)LN4/m$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/r$a;->v()Lcom/google/protobuf/r;

    move-result-object v1

    check-cast v1, LN4/m;

    invoke-virtual {v0, v1}, LN4/m$b;->G(LN4/m;)LN4/m$b;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->x:LM4/l;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->s:LN4/m$b;

    invoke-static {}, LN4/m;->z0()LN4/m$b;

    move-result-object v1

    const-string v2, "_experiment_procStart_to_classLoad"

    invoke-virtual {v1, v2}, LN4/m$b;->N(Ljava/lang/String;)LN4/m$b;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->m()LM4/l;

    move-result-object v2

    invoke-virtual {v2}, LM4/l;->e()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LN4/m$b;->L(J)LN4/m$b;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->m()LM4/l;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->j()LM4/l;

    move-result-object v3

    invoke-virtual {v2, v3}, LM4/l;->d(LM4/l;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LN4/m$b;->M(J)LN4/m$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/r$a;->v()Lcom/google/protobuf/r;

    move-result-object v1

    check-cast v1, LN4/m;

    invoke-virtual {v0, v1}, LN4/m$b;->G(LN4/m;)LN4/m$b;

    :cond_1
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->s:LN4/m$b;

    iget-boolean v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->L:Z

    if-eqz v1, :cond_2

    const-string v1, "true"

    goto :goto_0

    :cond_2
    const-string v1, "false"

    :goto_0
    const-string v2, "systemDeterminedForeground"

    invoke-virtual {v0, v2, v1}, LN4/m$b;->K(Ljava/lang/String;Ljava/lang/String;)LN4/m$b;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->s:LN4/m$b;

    iget v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->J:I

    int-to-long v1, v1

    const-string v3, "onDrawCount"

    invoke-virtual {v0, v3, v1, v2}, LN4/m$b;->J(Ljava/lang/String;J)LN4/m$b;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->s:LN4/m$b;

    iget-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->H:LJ4/a;

    invoke-virtual {v1}, LJ4/a;->a()LN4/k;

    move-result-object v1

    invoke-virtual {v0, v1}, LN4/m$b;->F(LN4/k;)LN4/m$b;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->s:LN4/m$b;

    invoke-virtual {p0, v0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->q(LN4/m$b;)V

    return-void
.end method

.method public final s()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->E:LM4/l;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->q:LM4/a;

    invoke-virtual {v0}, LM4/a;->a()LM4/l;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->E:LM4/l;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->s:LN4/m$b;

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->m()LM4/l;

    move-result-object v1

    invoke-virtual {v1}, LM4/l;->e()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LN4/m$b;->L(J)LN4/m$b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->m()LM4/l;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->E:LM4/l;

    invoke-virtual {v1, v2}, LM4/l;->d(LM4/l;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LN4/m$b;->M(J)LN4/m$b;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->s:LN4/m$b;

    invoke-virtual {p0, v0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->q(LN4/m$b;)V

    return-void
.end method

.method public final t()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->F:LM4/l;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->q:LM4/a;

    invoke-virtual {v0}, LM4/a;->a()LM4/l;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->F:LM4/l;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->s:LN4/m$b;

    invoke-static {}, LN4/m;->z0()LN4/m$b;

    move-result-object v1

    const-string v2, "_experiment_preDrawFoQ"

    invoke-virtual {v1, v2}, LN4/m$b;->N(Ljava/lang/String;)LN4/m$b;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->m()LM4/l;

    move-result-object v2

    invoke-virtual {v2}, LM4/l;->e()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LN4/m$b;->L(J)LN4/m$b;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->m()LM4/l;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->F:LM4/l;

    invoke-virtual {v2, v3}, LM4/l;->d(LM4/l;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LN4/m$b;->M(J)LN4/m$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/r$a;->v()Lcom/google/protobuf/r;

    move-result-object v1

    check-cast v1, LN4/m;

    invoke-virtual {v0, v1}, LN4/m$b;->G(LN4/m;)LN4/m$b;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->s:LN4/m$b;

    invoke-virtual {p0, v0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->q(LN4/m$b;)V

    return-void
.end method

.method public declared-synchronized u(Landroid/content/Context;)V
    .locals 2

    .line 1
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, Landroidx/lifecycle/o;->i()Landroidx/lifecycle/h;

    move-result-object v0

    invoke-interface {v0}, Landroidx/lifecycle/h;->g()Landroidx/lifecycle/d;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/d;->a(Landroidx/lifecycle/g;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    instance-of v0, p1, Landroid/app/Application;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Landroid/app/Application;

    invoke-virtual {v0, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->L:Z

    const/4 v1, 0x1

    if-nez v0, :cond_2

    invoke-static {p1}, Lcom/google/firebase/perf/metrics/AppStartTrace;->n(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_0
    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->L:Z

    iput-boolean v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->o:Z

    iput-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->t:Landroid/content/Context;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    monitor-exit p0

    return-void

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized v()V
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, Landroidx/lifecycle/o;->i()Landroidx/lifecycle/h;

    move-result-object v0

    invoke-interface {v0}, Landroidx/lifecycle/h;->g()Landroidx/lifecycle/d;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/d;->c(Landroidx/lifecycle/g;)V

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->t:Landroid/content/Context;

    check-cast v0, Landroid/app/Application;

    invoke-virtual {v0, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->o:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
