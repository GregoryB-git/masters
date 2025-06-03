.class public LJ5/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA5/a;
.implements LJ5/p$b;
.implements LJ5/p$a;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LJ5/i;->b:Z

    .line 6
    .line 7
    return-void
.end method

.method public static synthetic g(Ljava/lang/String;Ljava/lang/Boolean;LV2/k;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LJ5/i;->w(Ljava/lang/String;Ljava/lang/Boolean;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h(LJ5/i;LJ5/p$d;Ljava/lang/String;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, LJ5/i;->s(LJ5/p$d;Ljava/lang/String;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(Ljava/lang/String;Ljava/lang/Boolean;LV2/k;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LJ5/i;->x(Ljava/lang/String;Ljava/lang/Boolean;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic j(LJ5/i;Ls3/e;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LJ5/i;->r(Ls3/e;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k(Ljava/lang/String;LV2/k;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LJ5/i;->q(Ljava/lang/String;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic l(LJ5/i;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LJ5/i;->v(LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic m(LJ5/i;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LJ5/i;->t(LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic n(LJ5/p$f;LV2/j;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LJ5/i;->u(LJ5/p$f;LV2/j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic q(Ljava/lang/String;LV2/k;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0}, Ls3/e;->p(Ljava/lang/String;)Ls3/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    :try_start_1
    invoke-virtual {p0}, Ls3/e;->j()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception p0

    .line 10
    goto :goto_1

    .line 11
    :catch_1
    :goto_0
    const/4 p0, 0x0

    .line 12
    :try_start_2
    invoke-virtual {p1, p0}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_2

    .line 16
    :goto_1
    invoke-virtual {p1, p0}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 17
    .line 18
    .line 19
    :goto_2
    return-void
.end method

.method public static synthetic u(LJ5/p$f;LV2/j;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, LV2/j;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, LV2/j;->j()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, LJ5/p$f;->a(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, LV2/j;->i()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p0, p1}, LJ5/p$f;->b(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void
.end method

.method public static synthetic w(Ljava/lang/String;Ljava/lang/Boolean;LV2/k;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0}, Ls3/e;->p(Ljava/lang/String;)Ls3/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Ls3/e;->F(Ljava/lang/Boolean;)V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    invoke-virtual {p2, p0}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception p0

    .line 14
    invoke-virtual {p2, p0}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    return-void
.end method

.method public static synthetic x(Ljava/lang/String;Ljava/lang/Boolean;LV2/k;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0}, Ls3/e;->p(Ljava/lang/String;)Ls3/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Ls3/e;->E(Z)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    invoke-virtual {p2, p0}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catch_0
    move-exception p0

    .line 18
    invoke-virtual {p2, p0}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    return-void
.end method


# virtual methods
.method public a(LJ5/p$f;)V
    .locals 3

    .line 1
    new-instance v0, LV2/k;

    .line 2
    .line 3
    invoke-direct {v0}, LV2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LJ5/d;

    .line 9
    .line 10
    invoke-direct {v2, p0, v0}, LJ5/d;-><init>(LJ5/i;LV2/k;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, p1}, LJ5/i;->y(LV2/k;LJ5/p$f;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/Boolean;LJ5/p$f;)V
    .locals 3

    .line 1
    new-instance v0, LV2/k;

    .line 2
    .line 3
    invoke-direct {v0}, LV2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LJ5/e;

    .line 9
    .line 10
    invoke-direct {v2, p1, p2, v0}, LJ5/e;-><init>(Ljava/lang/String;Ljava/lang/Boolean;LV2/k;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, p3}, LJ5/i;->y(LV2/k;LJ5/p$f;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public c(LJ5/p$f;)V
    .locals 3

    .line 1
    new-instance v0, LV2/k;

    .line 2
    .line 3
    invoke-direct {v0}, LV2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LJ5/b;

    .line 9
    .line 10
    invoke-direct {v2, p0, v0}, LJ5/b;-><init>(LJ5/i;LV2/k;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, p1}, LJ5/i;->y(LV2/k;LJ5/p$f;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public d(Ljava/lang/String;LJ5/p$f;)V
    .locals 3

    .line 1
    new-instance v0, LV2/k;

    .line 2
    .line 3
    invoke-direct {v0}, LV2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LJ5/a;

    .line 9
    .line 10
    invoke-direct {v2, p1, v0}, LJ5/a;-><init>(Ljava/lang/String;LV2/k;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, p2}, LJ5/i;->y(LV2/k;LJ5/p$f;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public e(Ljava/lang/String;LJ5/p$d;LJ5/p$f;)V
    .locals 3

    .line 1
    new-instance v0, LV2/k;

    .line 2
    .line 3
    invoke-direct {v0}, LV2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LJ5/f;

    .line 9
    .line 10
    invoke-direct {v2, p0, p2, p1, v0}, LJ5/f;-><init>(LJ5/i;LJ5/p$d;Ljava/lang/String;LV2/k;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, p3}, LJ5/i;->y(LV2/k;LJ5/p$f;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public f(Ljava/lang/String;Ljava/lang/Boolean;LJ5/p$f;)V
    .locals 3

    .line 1
    new-instance v0, LV2/k;

    .line 2
    .line 3
    invoke-direct {v0}, LV2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LJ5/c;

    .line 9
    .line 10
    invoke-direct {v2, p1, p2, v0}, LJ5/c;-><init>(Ljava/lang/String;Ljava/lang/Boolean;LV2/k;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, p3}, LJ5/i;->y(LV2/k;LJ5/p$f;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final o(Ls3/e;)LV2/j;
    .locals 3

    .line 1
    new-instance v0, LV2/k;

    .line 2
    .line 3
    invoke-direct {v0}, LV2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LJ5/h;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LJ5/h;-><init>(LJ5/i;Ls3/e;LV2/k;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, LV2/k;->a()LV2/j;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public onAttachedToEngine(LA5/a$b;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, LA5/a$b;->b()LE5/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p0}, LJ5/t;->e(LE5/c;LJ5/p$b;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, LA5/a$b;->b()LE5/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0, p0}, LJ5/o;->e(LE5/c;LJ5/p$a;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, LA5/a$b;->a()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, LJ5/i;->a:Landroid/content/Context;

    .line 20
    .line 21
    return-void
.end method

.method public onDetachedFromEngine(LA5/a$b;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LJ5/i;->a:Landroid/content/Context;

    .line 3
    .line 4
    invoke-virtual {p1}, LA5/a$b;->b()LE5/c;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-static {v1, v0}, LJ5/t;->e(LE5/c;LJ5/p$b;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, LA5/a$b;->b()LE5/c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1, v0}, LJ5/o;->e(LE5/c;LJ5/p$a;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final p(Ls3/m;)LJ5/p$d;
    .locals 2

    .line 1
    new-instance v0, LJ5/p$d$a;

    .line 2
    .line 3
    invoke-direct {v0}, LJ5/p$d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ls3/m;->b()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, LJ5/p$d$a;->b(Ljava/lang/String;)LJ5/p$d$a;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ls3/m;->c()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, LJ5/p$d$a;->c(Ljava/lang/String;)LJ5/p$d$a;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ls3/m;->f()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Ls3/m;->f()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, LJ5/p$d$a;->e(Ljava/lang/String;)LJ5/p$d$a;

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p1}, Ls3/m;->g()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {p1}, Ls3/m;->g()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, LJ5/p$d$a;->f(Ljava/lang/String;)LJ5/p$d$a;

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-virtual {p1}, Ls3/m;->d()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, LJ5/p$d$a;->d(Ljava/lang/String;)LJ5/p$d$a;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ls3/m;->h()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, LJ5/p$d$a;->g(Ljava/lang/String;)LJ5/p$d$a;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Ls3/m;->e()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {v0, p1}, LJ5/p$d$a;->h(Ljava/lang/String;)LJ5/p$d$a;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, LJ5/p$d$a;->a()LJ5/p$d;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1
.end method

.method public final synthetic r(Ls3/e;LV2/k;)V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, LJ5/p$e$a;

    .line 2
    .line 3
    invoke-direct {v0}, LJ5/p$e$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ls3/e;->q()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, LJ5/p$e$a;->c(Ljava/lang/String;)LJ5/p$e$a;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ls3/e;->r()Ls3/m;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0, v1}, LJ5/i;->p(Ls3/m;)LJ5/p$d;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, LJ5/p$e$a;->d(LJ5/p$d;)LJ5/p$e$a;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ls3/e;->x()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, LJ5/p$e$a;->b(Ljava/lang/Boolean;)LJ5/p$e$a;

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->getPluginConstantsForFirebaseApp(Ls3/e;)LV2/j;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1}, LV2/m;->a(LV2/j;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Ljava/util/Map;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, LJ5/p$e$a;->e(Ljava/util/Map;)LJ5/p$e$a;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, LJ5/p$e$a;->a()LJ5/p$e;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catch_0
    move-exception p1

    .line 57
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    return-void
.end method

.method public final synthetic s(LJ5/p$d;Ljava/lang/String;LV2/k;)V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Ls3/m$b;

    .line 2
    .line 3
    invoke-direct {v0}, Ls3/m$b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LJ5/p$d;->b()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ls3/m$b;->b(Ljava/lang/String;)Ls3/m$b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1}, LJ5/p$d;->c()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ls3/m$b;->c(Ljava/lang/String;)Ls3/m$b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1}, LJ5/p$d;->d()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ls3/m$b;->d(Ljava/lang/String;)Ls3/m$b;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1}, LJ5/p$d;->e()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ls3/m$b;->f(Ljava/lang/String;)Ls3/m$b;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p1}, LJ5/p$d;->f()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ls3/m$b;->g(Ljava/lang/String;)Ls3/m$b;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p1}, LJ5/p$d;->g()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Ls3/m$b;->h(Ljava/lang/String;)Ls3/m$b;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p1}, LJ5/p$d;->h()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v0, p1}, Ls3/m$b;->e(Ljava/lang/String;)Ls3/m$b;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Ls3/m$b;->a()Ls3/m;

    .line 63
    .line 64
    .line 65
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 66
    :try_start_1
    invoke-static {}, Landroid/os/Looper;->prepare()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 67
    .line 68
    .line 69
    :catch_0
    :try_start_2
    iget-object v0, p0, LJ5/i;->a:Landroid/content/Context;

    .line 70
    .line 71
    invoke-static {v0, p1, p2}, Ls3/e;->w(Landroid/content/Context;Ls3/m;Ljava/lang/String;)Ls3/e;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p0, p1}, LJ5/i;->o(Ls3/e;)LV2/j;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1}, LV2/m;->a(LV2/j;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, LJ5/p$e;

    .line 84
    .line 85
    invoke-virtual {p3, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catch_1
    move-exception p1

    .line 90
    invoke-virtual {p3, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 91
    .line 92
    .line 93
    :goto_0
    return-void
.end method

.method public final synthetic t(LV2/k;)V
    .locals 3

    .line 1
    :try_start_0
    iget-boolean v0, p0, LJ5/i;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LJ5/i;->b:Z

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception v0

    .line 10
    goto :goto_2

    .line 11
    :cond_0
    invoke-static {}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->didReinitializeFirebaseCore()LV2/j;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, LV2/m;->a(LV2/j;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    :goto_0
    iget-object v0, p0, LJ5/i;->a:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v0}, Ls3/e;->n(Landroid/content/Context;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Ls3/e;

    .line 48
    .line 49
    invoke-virtual {p0, v2}, LJ5/i;->o(Ls3/e;)LV2/j;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2}, LV2/m;->a(LV2/j;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, LJ5/p$e;

    .line 58
    .line 59
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-virtual {p1, v1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    goto :goto_3

    .line 67
    :goto_2
    invoke-virtual {p1, v0}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 68
    .line 69
    .line 70
    :goto_3
    return-void
.end method

.method public final synthetic v(LV2/k;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, LJ5/i;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Ls3/m;->a(Landroid/content/Context;)Ls3/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p1, v0}, LV2/k;->c(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catch_0
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0, v0}, LJ5/i;->p(Ls3/m;)LJ5/p$d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p1, v0}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :goto_0
    invoke-virtual {p1, v0}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 25
    .line 26
    .line 27
    :goto_1
    return-void
.end method

.method public final y(LV2/k;LJ5/p$f;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, LV2/k;->a()LV2/j;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LJ5/g;

    .line 6
    .line 7
    invoke-direct {v0, p2}, LJ5/g;-><init>(LJ5/p$f;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, LV2/j;->b(LV2/e;)LV2/j;

    .line 11
    .line 12
    .line 13
    return-void
.end method
