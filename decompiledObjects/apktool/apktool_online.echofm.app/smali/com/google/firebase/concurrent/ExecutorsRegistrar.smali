.class public Lcom/google/firebase/concurrent/ExecutorsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ThreadPoolCreation"
    }
.end annotation


# static fields
.field public static final a:LB3/x;

.field public static final b:LB3/x;

.field public static final c:LB3/x;

.field public static final d:LB3/x;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LB3/x;

    new-instance v1, LC3/r;

    invoke-direct {v1}, LC3/r;-><init>()V

    invoke-direct {v0, v1}, LB3/x;-><init>(Lr4/b;)V

    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:LB3/x;

    new-instance v0, LB3/x;

    new-instance v1, LC3/s;

    invoke-direct {v1}, LC3/s;-><init>()V

    invoke-direct {v0, v1}, LB3/x;-><init>(Lr4/b;)V

    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->b:LB3/x;

    new-instance v0, LB3/x;

    new-instance v1, LC3/t;

    invoke-direct {v1}, LC3/t;-><init>()V

    invoke-direct {v0, v1}, LB3/x;-><init>(Lr4/b;)V

    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->c:LB3/x;

    new-instance v0, LB3/x;

    new-instance v1, LC3/u;

    invoke-direct {v1}, LC3/u;-><init>()V

    invoke-direct {v0, v1}, LB3/x;-><init>(Lr4/b;)V

    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->d:LB3/x;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LB3/e;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->n(LB3/e;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->s()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->q()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(LB3/e;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->o(LB3/e;)Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(LB3/e;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->m(LB3/e;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->p()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(LB3/e;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->l(LB3/e;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic h()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->r()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static i()Landroid/os/StrictMode$ThreadPolicy;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/StrictMode$ThreadPolicy$Builder;

    invoke-direct {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectNetwork()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectResourceMismatches()Landroid/os/StrictMode$ThreadPolicy$Builder;

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_0

    invoke-static {v0}, LC3/q;->a(Landroid/os/StrictMode$ThreadPolicy$Builder;)Landroid/os/StrictMode$ThreadPolicy$Builder;

    :cond_0
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyLog()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    return-object v0
.end method

.method public static j(Ljava/lang/String;I)Ljava/util/concurrent/ThreadFactory;
    .locals 2

    .line 1
    new-instance v0, LC3/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LC3/b;-><init>(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)V

    return-object v0
.end method

.method public static k(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)Ljava/util/concurrent/ThreadFactory;
    .locals 1

    .line 1
    new-instance v0, LC3/b;

    invoke-direct {v0, p0, p1, p2}, LC3/b;-><init>(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)V

    return-object v0
.end method

.method public static synthetic l(LB3/e;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    .line 1
    sget-object p0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:LB3/x;

    .line 2
    .line 3
    invoke-virtual {p0}, LB3/x;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic m(LB3/e;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    .line 1
    sget-object p0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->c:LB3/x;

    .line 2
    .line 3
    invoke-virtual {p0}, LB3/x;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic n(LB3/e;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    .line 1
    sget-object p0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->b:LB3/x;

    .line 2
    .line 3
    invoke-virtual {p0}, LB3/x;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic o(LB3/e;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    sget-object p0, LC3/B;->o:LC3/B;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic p()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 3

    .line 1
    const/16 v0, 0xa

    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->i()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v1

    const-string v2, "Firebase Background"

    invoke-static {v2, v0, v1}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->k(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->u(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic q()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    const/4 v1, 0x2

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->t()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v2

    const-string v3, "Firebase Lite"

    invoke-static {v3, v1, v2}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->k(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)Ljava/util/concurrent/ThreadFactory;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->u(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic r()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 2

    .line 1
    const-string v0, "Firebase Blocking"

    const/16 v1, 0xb

    invoke-static {v0, v1}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->j(Ljava/lang/String;I)Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->u(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic s()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 2

    .line 1
    const-string v0, "Firebase Scheduler"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->j(Ljava/lang/String;I)Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static t()Landroid/os/StrictMode$ThreadPolicy;
    .locals 1

    .line 1
    new-instance v0, Landroid/os/StrictMode$ThreadPolicy$Builder;

    invoke-direct {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectAll()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyLog()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    return-object v0
.end method

.method public static u(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 2

    .line 1
    new-instance v0, LC3/o;

    sget-object v1, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->d:LB3/x;

    invoke-virtual {v1}, LB3/x;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct {v0, p0, v1}, LC3/o;-><init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 11

    const-class v0, Ly3/a;

    const-class v1, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0, v1}, LB3/F;->a(Ljava/lang/Class;Ljava/lang/Class;)LB3/F;

    move-result-object v2

    const-class v3, Ljava/util/concurrent/ExecutorService;

    invoke-static {v0, v3}, LB3/F;->a(Ljava/lang/Class;Ljava/lang/Class;)LB3/F;

    move-result-object v4

    const-class v5, Ljava/util/concurrent/Executor;

    invoke-static {v0, v5}, LB3/F;->a(Ljava/lang/Class;Ljava/lang/Class;)LB3/F;

    move-result-object v0

    const/4 v6, 0x2

    new-array v7, v6, [LB3/F;

    const/4 v8, 0x0

    aput-object v4, v7, v8

    const/4 v4, 0x1

    aput-object v0, v7, v4

    invoke-static {v2, v7}, LB3/c;->d(LB3/F;[LB3/F;)LB3/c$b;

    move-result-object v0

    new-instance v2, LC3/v;

    invoke-direct {v2}, LC3/v;-><init>()V

    invoke-virtual {v0, v2}, LB3/c$b;->f(LB3/h;)LB3/c$b;

    move-result-object v0

    invoke-virtual {v0}, LB3/c$b;->d()LB3/c;

    move-result-object v0

    const-class v2, Ly3/b;

    invoke-static {v2, v1}, LB3/F;->a(Ljava/lang/Class;Ljava/lang/Class;)LB3/F;

    move-result-object v7

    invoke-static {v2, v3}, LB3/F;->a(Ljava/lang/Class;Ljava/lang/Class;)LB3/F;

    move-result-object v9

    invoke-static {v2, v5}, LB3/F;->a(Ljava/lang/Class;Ljava/lang/Class;)LB3/F;

    move-result-object v2

    new-array v10, v6, [LB3/F;

    aput-object v9, v10, v8

    aput-object v2, v10, v4

    invoke-static {v7, v10}, LB3/c;->d(LB3/F;[LB3/F;)LB3/c$b;

    move-result-object v2

    new-instance v7, LC3/w;

    invoke-direct {v7}, LC3/w;-><init>()V

    invoke-virtual {v2, v7}, LB3/c$b;->f(LB3/h;)LB3/c$b;

    move-result-object v2

    invoke-virtual {v2}, LB3/c$b;->d()LB3/c;

    move-result-object v2

    const-class v7, Ly3/c;

    invoke-static {v7, v1}, LB3/F;->a(Ljava/lang/Class;Ljava/lang/Class;)LB3/F;

    move-result-object v1

    invoke-static {v7, v3}, LB3/F;->a(Ljava/lang/Class;Ljava/lang/Class;)LB3/F;

    move-result-object v3

    invoke-static {v7, v5}, LB3/F;->a(Ljava/lang/Class;Ljava/lang/Class;)LB3/F;

    move-result-object v7

    new-array v9, v6, [LB3/F;

    aput-object v3, v9, v8

    aput-object v7, v9, v4

    invoke-static {v1, v9}, LB3/c;->d(LB3/F;[LB3/F;)LB3/c$b;

    move-result-object v1

    new-instance v3, LC3/x;

    invoke-direct {v3}, LC3/x;-><init>()V

    invoke-virtual {v1, v3}, LB3/c$b;->f(LB3/h;)LB3/c$b;

    move-result-object v1

    invoke-virtual {v1}, LB3/c$b;->d()LB3/c;

    move-result-object v1

    const-class v3, Ly3/d;

    invoke-static {v3, v5}, LB3/F;->a(Ljava/lang/Class;Ljava/lang/Class;)LB3/F;

    move-result-object v3

    invoke-static {v3}, LB3/c;->c(LB3/F;)LB3/c$b;

    move-result-object v3

    new-instance v5, LC3/y;

    invoke-direct {v5}, LC3/y;-><init>()V

    invoke-virtual {v3, v5}, LB3/c$b;->f(LB3/h;)LB3/c$b;

    move-result-object v3

    invoke-virtual {v3}, LB3/c$b;->d()LB3/c;

    move-result-object v3

    const/4 v5, 0x4

    new-array v5, v5, [LB3/c;

    aput-object v0, v5, v8

    aput-object v2, v5, v4

    aput-object v1, v5, v6

    const/4 v0, 0x3

    aput-object v3, v5, v0

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
