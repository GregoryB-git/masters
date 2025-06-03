.class public LL5/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;
.implements LA5/a;
.implements LE5/k$c;


# static fields
.field public static final e:Ljava/util/HashMap;


# instance fields
.field public a:I

.field public final b:Ljava/util/Map;

.field public c:LE5/k;

.field public d:LE5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LL5/w;->e:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, LL5/w;->a:I

    .line 6
    .line 7
    new-instance v0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, LL5/w;->b:Ljava/util/Map;

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic E(LV2/k;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    invoke-virtual {p0, v0}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    return-void
.end method

.method public static synthetic H(LE5/d;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, LE5/d;->d(LE5/d$d;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static synthetic J(LE5/k$d;LE5/j;LV2/j;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, LV2/j;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, LV2/j;->j()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-virtual {p2}, LV2/j;->i()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    instance-of v0, p2, LL5/y;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    check-cast p2, LL5/y;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    instance-of v0, p2, LQ3/d;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    check-cast p2, LQ3/d;

    .line 31
    .line 32
    invoke-static {p2}, LL5/y;->b(LQ3/d;)LL5/y;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v1, "An unknown error occurred handling native method call "

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object p1, p1, LE5/j;->a:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const-string v0, "firebase_database"

    .line 57
    .line 58
    invoke-static {v0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 59
    .line 60
    .line 61
    invoke-static {p2}, LL5/y;->c(Ljava/lang/Exception;)LL5/y;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    :goto_0
    invoke-virtual {p2}, LL5/y;->e()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p2}, LL5/y;->getMessage()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {p2}, LL5/y;->d()Ljava/util/Map;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-interface {p0, p1, v0, p2}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :goto_1
    return-void
.end method

.method public static synthetic a(LL5/w;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LL5/w;->M(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(LL5/w;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LL5/w;->P(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static b0(LQ3/h;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, LL5/w;->e:Ljava/util/HashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, LQ3/h;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p0
.end method

.method public static synthetic c(LL5/w;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LL5/w;->I(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(LL5/w;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LL5/w;->U(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(LL5/w;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LL5/w;->Q(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(LL5/w;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LL5/w;->R(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(LL5/w;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LL5/w;->D(LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h(LL5/w;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LL5/w;->L(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(LL5/w;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LL5/w;->O(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic j(LL5/w;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LL5/w;->N(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k(LL5/w;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LL5/w;->F(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic l(LE5/k$d;LE5/j;LV2/j;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LL5/w;->J(LE5/k$d;LE5/j;LV2/j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic m(LL5/w;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LL5/w;->T(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic n(LL5/w;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LL5/w;->C(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic o(LL5/w;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LL5/w;->G(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic p(LL5/w;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LL5/w;->S(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic q(LV2/k;)V
    .locals 0

    .line 1
    invoke-static {p0}, LL5/w;->E(LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic r(LL5/w;Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LL5/w;->K(Ljava/util/Map;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic s(LE5/d;)V
    .locals 0

    .line 1
    invoke-static {p0}, LL5/w;->H(LE5/d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static v(Ljava/lang/String;)LQ3/h;
    .locals 1

    .line 1
    sget-object v0, LL5/w;->e:Ljava/util/HashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, LQ3/h;

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-object p0

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw p0
.end method


# virtual methods
.method public final A(Ljava/util/Map;)LV2/j;
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
    new-instance v2, LL5/u;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LL5/u;-><init>(LL5/w;Ljava/util/Map;LV2/k;)V

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

.method public final B(LE5/c;)V
    .locals 2

    .line 1
    const-string v0, "plugins.flutter.io/firebase_database"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->registerPlugin(Ljava/lang/String;Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LL5/w;->d:LE5/c;

    .line 7
    .line 8
    new-instance v1, LE5/k;

    .line 9
    .line 10
    invoke-direct {v1, p1, v0}, LE5/k;-><init>(LE5/c;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, LL5/w;->c:LE5/k;

    .line 14
    .line 15
    invoke-virtual {v1, p0}, LE5/k;->e(LE5/k$c;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final synthetic C(Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, LL5/w;->y(Ljava/util/Map;)LQ3/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, LQ3/e;->Z()LQ3/n;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, LQ3/n;->c()LV2/j;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, LV2/m;->a(LV2/j;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception p1

    .line 22
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void
.end method

.method public final synthetic D(LV2/k;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, LL5/w;->u()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {p1, v0}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    return-void
.end method

.method public final synthetic F(Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, LL5/w;->w(Ljava/util/Map;)LQ3/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, LQ3/h;->h()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception p1

    .line 14
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    return-void
.end method

.method public final synthetic G(Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, LL5/w;->w(Ljava/util/Map;)LQ3/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, LQ3/h;->i()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception p1

    .line 14
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    return-void
.end method

.method public final synthetic I(Ljava/util/Map;LV2/k;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, LL5/w;->x(Ljava/util/Map;)LQ3/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "eventChannelNamePrefix"

    .line 6
    .line 7
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/String;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p1, "#"

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget p1, p0, LL5/w;->a:I

    .line 27
    .line 28
    add-int/lit8 v2, p1, 0x1

    .line 29
    .line 30
    iput v2, p0, LL5/w;->a:I

    .line 31
    .line 32
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v1, LE5/d;

    .line 40
    .line 41
    iget-object v2, p0, LL5/w;->d:LE5/c;

    .line 42
    .line 43
    invoke-direct {v1, v2, p1}, LE5/d;-><init>(LE5/c;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance v2, LL5/b;

    .line 47
    .line 48
    new-instance v3, LL5/m;

    .line 49
    .line 50
    invoke-direct {v3, v1}, LL5/m;-><init>(LE5/d;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {v2, v0, v3}, LL5/b;-><init>(LQ3/p;LL5/z;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v2}, LE5/d;->d(LE5/d$d;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, LL5/w;->b:Ljava/util/Map;

    .line 60
    .line 61
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catch_0
    move-exception p1

    .line 69
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 70
    .line 71
    .line 72
    :goto_0
    return-void
.end method

.method public final synthetic K(Ljava/util/Map;LV2/k;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, LL5/w;->w(Ljava/util/Map;)LQ3/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, LQ3/h;->j()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception p1

    .line 14
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    return-void
.end method

.method public final synthetic L(Ljava/util/Map;LV2/k;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, LL5/w;->x(Ljava/util/Map;)LQ3/p;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, LQ3/p;->r()LV2/j;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, LV2/m;->a(LV2/j;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, LQ3/b;

    .line 14
    .line 15
    new-instance v0, LL5/x;

    .line 16
    .line 17
    invoke-direct {v0, p1}, LL5/x;-><init>(LQ3/b;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, LL5/x;->a()Ljava/util/Map;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception p1

    .line 29
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    return-void
.end method

.method public final synthetic M(Ljava/util/Map;LV2/k;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, LL5/w;->x(Ljava/util/Map;)LQ3/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "value"

    .line 6
    .line 7
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {v0, p1}, LQ3/p;->v(Z)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception p1

    .line 29
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    return-void
.end method

.method public final synthetic N(Ljava/util/Map;LV2/k;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, LL5/w;->y(Ljava/util/Map;)LQ3/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "transactionKey"

    .line 6
    .line 7
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    check-cast v1, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const-string v2, "transactionApplyLocally"

    .line 21
    .line 22
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    check-cast p1, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    new-instance v2, LL5/D;

    .line 36
    .line 37
    iget-object v3, p0, LL5/w;->c:LE5/k;

    .line 38
    .line 39
    invoke-direct {v2, v3, v1}, LL5/D;-><init>(LE5/k;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2, p1}, LQ3/e;->a0(LQ3/r$b;Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, LL5/D;->c()LV2/j;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, LV2/m;->a(LV2/j;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Ljava/util/Map;

    .line 54
    .line 55
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catch_0
    move-exception p1

    .line 60
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    return-void
.end method

.method public final synthetic O(Ljava/util/Map;LV2/k;)V
    .locals 1

    .line 1
    :try_start_0
    const-string v0, "value"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, p1}, LL5/w;->y(Ljava/util/Map;)LQ3/e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, LQ3/e;->Z()LQ3/n;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, v0}, LQ3/n;->f(Ljava/lang/Object;)LV2/j;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, LV2/m;->a(LV2/j;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_0
    move-exception p1

    .line 28
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    return-void
.end method

.method public final synthetic P(Ljava/util/Map;LV2/k;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, LL5/w;->y(Ljava/util/Map;)LQ3/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "priority"

    .line 6
    .line 7
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v0, p1}, LQ3/e;->b0(Ljava/lang/Object;)LV2/j;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, LV2/m;->a(LV2/j;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception p1

    .line 24
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void
.end method

.method public final synthetic Q(Ljava/util/Map;LV2/k;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, LL5/w;->y(Ljava/util/Map;)LQ3/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "value"

    .line 6
    .line 7
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v0, p1}, LQ3/e;->d0(Ljava/lang/Object;)LV2/j;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, LV2/m;->a(LV2/j;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception p1

    .line 24
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void
.end method

.method public final synthetic R(Ljava/util/Map;LV2/k;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, LL5/w;->y(Ljava/util/Map;)LQ3/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "value"

    .line 6
    .line 7
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "priority"

    .line 12
    .line 13
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v0, v1, p1}, LQ3/e;->e0(Ljava/lang/Object;Ljava/lang/Object;)LV2/j;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, LV2/m;->a(LV2/j;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move-exception p1

    .line 30
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-void
.end method

.method public final synthetic S(Ljava/util/Map;LV2/k;)V
    .locals 4

    .line 1
    :try_start_0
    const-string v0, "value"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "priority"

    .line 8
    .line 9
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0, p1}, LL5/w;->y(Ljava/util/Map;)LQ3/e;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, LQ3/e;->Z()LQ3/n;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    instance-of v2, v1, Ljava/lang/Double;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    check-cast v1, Ljava/lang/Number;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    invoke-virtual {p1, v0, v1, v2}, LQ3/n;->g(Ljava/lang/Object;D)LV2/j;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    goto :goto_0

    .line 37
    :catch_0
    move-exception p1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    instance-of v2, v1, Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    check-cast v1, Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p1, v0, v1}, LQ3/n;->h(Ljava/lang/Object;Ljava/lang/String;)LV2/j;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    if-nez v1, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1, v0, v3}, LQ3/n;->h(Ljava/lang/Object;Ljava/lang/String;)LV2/j;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :goto_0
    invoke-static {p1}, LV2/m;->a(LV2/j;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, v3}, LV2/k;->c(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    new-instance p1, Ljava/lang/Exception;

    .line 64
    .line 65
    const-string v0, "Invalid priority value for OnDisconnect.setWithPriority"

    .line 66
    .line 67
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    :goto_1
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 72
    .line 73
    .line 74
    :goto_2
    return-void
.end method

.method public final synthetic T(Ljava/util/Map;LV2/k;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, LL5/w;->y(Ljava/util/Map;)LQ3/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "value"

    .line 6
    .line 7
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/util/Map;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, LQ3/e;->g0(Ljava/util/Map;)LV2/j;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, LV2/m;->a(LV2/j;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception p1

    .line 29
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    return-void
.end method

.method public final synthetic U(Ljava/util/Map;LV2/k;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, LL5/w;->y(Ljava/util/Map;)LQ3/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "value"

    .line 6
    .line 7
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/util/Map;

    .line 15
    .line 16
    invoke-virtual {v0}, LQ3/e;->Z()LQ3/n;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0, p1}, LQ3/n;->i(Ljava/util/Map;)LV2/j;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, LV2/m;->a(LV2/j;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catch_0
    move-exception p1

    .line 33
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    return-void
.end method

.method public final V(Ljava/util/Map;)LV2/j;
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
    new-instance v2, LL5/g;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LL5/g;-><init>(LL5/w;Ljava/util/Map;LV2/k;)V

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

.method public final W(Ljava/util/Map;)LV2/j;
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
    new-instance v2, LL5/q;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LL5/q;-><init>(LL5/w;Ljava/util/Map;LV2/k;)V

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

.method public final X(Ljava/util/Map;)LV2/j;
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
    new-instance v2, LL5/k;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LL5/k;-><init>(LL5/w;Ljava/util/Map;LV2/k;)V

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

.method public final Y(Ljava/util/Map;)LV2/j;
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
    new-instance v2, LL5/f;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LL5/f;-><init>(LL5/w;Ljava/util/Map;LV2/k;)V

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

.method public final Z()V
    .locals 4

    .line 1
    iget-object v0, p0, LL5/w;->b:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

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
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, LE5/d;

    .line 22
    .line 23
    iget-object v2, p0, LL5/w;->b:Ljava/util/Map;

    .line 24
    .line 25
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, LE5/d$d;

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-interface {v2, v3}, LE5/d$d;->a(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v3}, LE5/d;->d(LE5/d$d;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v0, p0, LL5/w;->b:Ljava/util/Map;

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final a0(Ljava/util/Map;)LV2/j;
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
    new-instance v2, LL5/s;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LL5/s;-><init>(LL5/w;Ljava/util/Map;LV2/k;)V

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

.method public final c0(Ljava/util/Map;)LV2/j;
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
    new-instance v2, LL5/v;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LL5/v;-><init>(LL5/w;Ljava/util/Map;LV2/k;)V

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

.method public final d0(Ljava/util/Map;)LV2/j;
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
    new-instance v2, LL5/j;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LL5/j;-><init>(LL5/w;Ljava/util/Map;LV2/k;)V

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

.method public didReinitializeFirebaseCore()LV2/j;
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
    new-instance v2, LL5/n;

    .line 9
    .line 10
    invoke-direct {v2, p0, v0}, LL5/n;-><init>(LL5/w;LV2/k;)V

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
    move-result-object v0

    .line 20
    return-object v0
.end method

.method public final e0(Ljava/util/Map;)LV2/j;
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
    new-instance v2, LL5/i;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LL5/i;-><init>(LL5/w;Ljava/util/Map;LV2/k;)V

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

.method public final f0(Ljava/util/Map;)LV2/j;
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
    new-instance v2, LL5/t;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LL5/t;-><init>(LL5/w;Ljava/util/Map;LV2/k;)V

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

.method public final g0(Ljava/util/Map;)LV2/j;
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
    new-instance v2, LL5/r;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LL5/r;-><init>(LL5/w;Ljava/util/Map;LV2/k;)V

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

.method public getPluginConstantsForFirebaseApp(Ls3/e;)LV2/j;
    .locals 2

    .line 1
    new-instance p1, LV2/k;

    .line 2
    .line 3
    invoke-direct {p1}, LV2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v1, LL5/d;

    .line 9
    .line 10
    invoke-direct {v1, p1}, LL5/d;-><init>(LV2/k;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, LV2/k;->a()LV2/j;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final h0(Ljava/util/Map;)LV2/j;
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
    new-instance v2, LL5/l;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LL5/l;-><init>(LL5/w;Ljava/util/Map;LV2/k;)V

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

.method public final i0(Ljava/util/Map;)LV2/j;
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
    new-instance v2, LL5/p;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LL5/p;-><init>(LL5/w;Ljava/util/Map;LV2/k;)V

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
    .locals 0

    .line 1
    invoke-virtual {p1}, LA5/a$b;->b()LE5/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, LL5/w;->B(LE5/c;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onDetachedFromEngine(LA5/a$b;)V
    .locals 1

    .line 1
    iget-object p1, p0, LL5/w;->c:LE5/k;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, LE5/k;->e(LE5/k$c;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LL5/w;->u()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onMethodCall(LE5/j;LE5/k$d;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, LE5/j;->b()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/util/Map;

    .line 6
    .line 7
    iget-object v1, p1, LE5/j;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, -0x1

    .line 17
    sparse-switch v2, :sswitch_data_0

    .line 18
    .line 19
    .line 20
    goto/16 :goto_0

    .line 21
    .line 22
    :sswitch_0
    const-string v2, "Query#observe"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    goto/16 :goto_0

    .line 31
    .line 32
    :cond_0
    const/16 v3, 0xe

    .line 33
    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :sswitch_1
    const-string v2, "FirebaseDatabase#goOnline"

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    goto/16 :goto_0

    .line 45
    .line 46
    :cond_1
    const/16 v3, 0xd

    .line 47
    .line 48
    goto/16 :goto_0

    .line 49
    .line 50
    :sswitch_2
    const-string v2, "OnDisconnect#setWithPriority"

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_2

    .line 57
    .line 58
    goto/16 :goto_0

    .line 59
    .line 60
    :cond_2
    const/16 v3, 0xc

    .line 61
    .line 62
    goto/16 :goto_0

    .line 63
    .line 64
    :sswitch_3
    const-string v2, "DatabaseReference#set"

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_3

    .line 71
    .line 72
    goto/16 :goto_0

    .line 73
    .line 74
    :cond_3
    const/16 v3, 0xb

    .line 75
    .line 76
    goto/16 :goto_0

    .line 77
    .line 78
    :sswitch_4
    const-string v2, "OnDisconnect#update"

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_4

    .line 85
    .line 86
    goto/16 :goto_0

    .line 87
    .line 88
    :cond_4
    const/16 v3, 0xa

    .line 89
    .line 90
    goto/16 :goto_0

    .line 91
    .line 92
    :sswitch_5
    const-string v2, "Query#keepSynced"

    .line 93
    .line 94
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_5

    .line 99
    .line 100
    goto/16 :goto_0

    .line 101
    .line 102
    :cond_5
    const/16 v3, 0x9

    .line 103
    .line 104
    goto/16 :goto_0

    .line 105
    .line 106
    :sswitch_6
    const-string v2, "Query#get"

    .line 107
    .line 108
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-nez v1, :cond_6

    .line 113
    .line 114
    goto/16 :goto_0

    .line 115
    .line 116
    :cond_6
    const/16 v3, 0x8

    .line 117
    .line 118
    goto/16 :goto_0

    .line 119
    .line 120
    :sswitch_7
    const-string v2, "OnDisconnect#cancel"

    .line 121
    .line 122
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-nez v1, :cond_7

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_7
    const/4 v3, 0x7

    .line 130
    goto :goto_0

    .line 131
    :sswitch_8
    const-string v2, "OnDisconnect#set"

    .line 132
    .line 133
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-nez v1, :cond_8

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_8
    const/4 v3, 0x6

    .line 141
    goto :goto_0

    .line 142
    :sswitch_9
    const-string v2, "FirebaseDatabase#goOffline"

    .line 143
    .line 144
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-nez v1, :cond_9

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_9
    const/4 v3, 0x5

    .line 152
    goto :goto_0

    .line 153
    :sswitch_a
    const-string v2, "DatabaseReference#update"

    .line 154
    .line 155
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-nez v1, :cond_a

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_a
    const/4 v3, 0x4

    .line 163
    goto :goto_0

    .line 164
    :sswitch_b
    const-string v2, "DatabaseReference#setWithPriority"

    .line 165
    .line 166
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-nez v1, :cond_b

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_b
    const/4 v3, 0x3

    .line 174
    goto :goto_0

    .line 175
    :sswitch_c
    const-string v2, "FirebaseDatabase#purgeOutstandingWrites"

    .line 176
    .line 177
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-nez v1, :cond_c

    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_c
    const/4 v3, 0x2

    .line 185
    goto :goto_0

    .line 186
    :sswitch_d
    const-string v2, "DatabaseReference#setPriority"

    .line 187
    .line 188
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-nez v1, :cond_d

    .line 193
    .line 194
    goto :goto_0

    .line 195
    :cond_d
    const/4 v3, 0x1

    .line 196
    goto :goto_0

    .line 197
    :sswitch_e
    const-string v2, "DatabaseReference#runTransaction"

    .line 198
    .line 199
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-nez v1, :cond_e

    .line 204
    .line 205
    goto :goto_0

    .line 206
    :cond_e
    const/4 v3, 0x0

    .line 207
    :goto_0
    packed-switch v3, :pswitch_data_0

    .line 208
    .line 209
    .line 210
    invoke-interface {p2}, LE5/k$d;->c()V

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    :pswitch_0
    invoke-virtual {p0, v0}, LL5/w;->V(Ljava/util/Map;)LV2/j;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    goto :goto_1

    .line 219
    :pswitch_1
    invoke-virtual {p0, v0}, LL5/w;->A(Ljava/util/Map;)LV2/j;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    goto :goto_1

    .line 224
    :pswitch_2
    invoke-virtual {p0, v0}, LL5/w;->g0(Ljava/util/Map;)LV2/j;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    goto :goto_1

    .line 229
    :pswitch_3
    invoke-virtual {p0, v0}, LL5/w;->e0(Ljava/util/Map;)LV2/j;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    goto :goto_1

    .line 234
    :pswitch_4
    invoke-virtual {p0, v0}, LL5/w;->i0(Ljava/util/Map;)LV2/j;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    goto :goto_1

    .line 239
    :pswitch_5
    invoke-virtual {p0, v0}, LL5/w;->Y(Ljava/util/Map;)LV2/j;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    goto :goto_1

    .line 244
    :pswitch_6
    invoke-virtual {p0, v0}, LL5/w;->X(Ljava/util/Map;)LV2/j;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    goto :goto_1

    .line 249
    :pswitch_7
    invoke-virtual {p0, v0}, LL5/w;->t(Ljava/util/Map;)LV2/j;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    goto :goto_1

    .line 254
    :pswitch_8
    invoke-virtual {p0, v0}, LL5/w;->c0(Ljava/util/Map;)LV2/j;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    goto :goto_1

    .line 259
    :pswitch_9
    invoke-virtual {p0, v0}, LL5/w;->z(Ljava/util/Map;)LV2/j;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    goto :goto_1

    .line 264
    :pswitch_a
    invoke-virtual {p0, v0}, LL5/w;->h0(Ljava/util/Map;)LV2/j;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    goto :goto_1

    .line 269
    :pswitch_b
    invoke-virtual {p0, v0}, LL5/w;->f0(Ljava/util/Map;)LV2/j;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    goto :goto_1

    .line 274
    :pswitch_c
    invoke-virtual {p0, v0}, LL5/w;->W(Ljava/util/Map;)LV2/j;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    goto :goto_1

    .line 279
    :pswitch_d
    invoke-virtual {p0, v0}, LL5/w;->d0(Ljava/util/Map;)LV2/j;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    goto :goto_1

    .line 284
    :pswitch_e
    invoke-virtual {p0, v0}, LL5/w;->a0(Ljava/util/Map;)LV2/j;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    :goto_1
    new-instance v1, LL5/o;

    .line 289
    .line 290
    invoke-direct {v1, p2, p1}, LL5/o;-><init>(LE5/k$d;LE5/j;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0, v1}, LV2/j;->b(LV2/e;)LV2/j;

    .line 294
    .line 295
    .line 296
    return-void

    .line 297
    :sswitch_data_0
    .sparse-switch
        -0x7c1f13ba -> :sswitch_e
        -0x7ac2abed -> :sswitch_d
        -0x6354addc -> :sswitch_c
        -0x58538c87 -> :sswitch_b
        -0x33268344 -> :sswitch_a
        -0x1f609aa6 -> :sswitch_9
        -0x1994c426 -> :sswitch_8
        -0x29d23fe -> :sswitch_7
        0xba90cfb -> :sswitch_6
        0x10455b1a -> :sswitch_5
        0x1ce8e651 -> :sswitch_4
        0x2bc1354f -> :sswitch_3
        0x46a20184 -> :sswitch_2
        0x628913fc -> :sswitch_1
        0x6848f441 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final t(Ljava/util/Map;)LV2/j;
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
    new-instance v2, LL5/e;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LL5/e;-><init>(LL5/w;Ljava/util/Map;LV2/k;)V

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

.method public final u()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LL5/w;->Z()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LL5/w;->e:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public w(Ljava/util/Map;)LQ3/h;
    .locals 7

    .line 1
    const-string v0, "appName"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "[DEFAULT]"

    .line 12
    .line 13
    :cond_0
    const-string v1, "databaseURL"

    .line 14
    .line 15
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    const-string v1, ""

    .line 24
    .line 25
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, LL5/w;->v(Ljava/lang/String;)LQ3/h;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    return-object v3

    .line 36
    :cond_2
    invoke-static {v0}, Ls3/e;->p(Ljava/lang/String;)Ls3/e;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-nez v3, :cond_3

    .line 45
    .line 46
    invoke-static {v0, v1}, LQ3/h;->e(Ls3/e;Ljava/lang/String;)LQ3/h;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_0

    .line 51
    :cond_3
    invoke-static {v0}, LQ3/h;->d(Ls3/e;)LQ3/h;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :goto_0
    const-string v1, "loggingEnabled"

    .line 56
    .line 57
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Ljava/lang/Boolean;

    .line 62
    .line 63
    const-string v3, "persistenceEnabled"

    .line 64
    .line 65
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Ljava/lang/Boolean;

    .line 70
    .line 71
    const-string v4, "emulatorHost"

    .line 72
    .line 73
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Ljava/lang/String;

    .line 78
    .line 79
    const-string v5, "emulatorPort"

    .line 80
    .line 81
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, Ljava/lang/Integer;

    .line 86
    .line 87
    const-string v6, "cacheSizeBytes"

    .line 88
    .line 89
    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-eqz v1, :cond_5

    .line 94
    .line 95
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_4

    .line 100
    .line 101
    sget-object v1, LQ3/l;->o:LQ3/l;

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :catch_0
    move-exception p1

    .line 105
    goto :goto_3

    .line 106
    :cond_4
    sget-object v1, LQ3/l;->s:LQ3/l;

    .line 107
    .line 108
    :goto_1
    invoke-virtual {v0, v1}, LQ3/h;->k(LQ3/l;)V

    .line 109
    .line 110
    .line 111
    :cond_5
    if-eqz v4, :cond_6

    .line 112
    .line 113
    if-eqz v5, :cond_6

    .line 114
    .line 115
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    invoke-virtual {v0, v4, v1}, LQ3/h;->n(Ljava/lang/String;I)V

    .line 120
    .line 121
    .line 122
    :cond_6
    if-eqz v3, :cond_7

    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    invoke-virtual {v0, v1}, LQ3/h;->m(Z)V

    .line 129
    .line 130
    .line 131
    :cond_7
    if-eqz p1, :cond_b

    .line 132
    .line 133
    instance-of v1, p1, Ljava/lang/Long;

    .line 134
    .line 135
    if-eqz v1, :cond_8

    .line 136
    .line 137
    check-cast p1, Ljava/lang/Long;

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 140
    .line 141
    .line 142
    move-result-wide v3

    .line 143
    :goto_2
    invoke-virtual {v0, v3, v4}, LQ3/h;->l(J)V

    .line 144
    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_8
    instance-of v1, p1, Ljava/lang/Integer;

    .line 148
    .line 149
    if-eqz v1, :cond_b

    .line 150
    .line 151
    check-cast p1, Ljava/lang/Integer;

    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 154
    .line 155
    .line 156
    move-result p1
    :try_end_0
    .catch LQ3/d; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    int-to-long v3, p1

    .line 158
    goto :goto_2

    .line 159
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    if-eqz v1, :cond_a

    .line 164
    .line 165
    const-string v3, "must be made before any other usage of FirebaseDatabase"

    .line 166
    .line 167
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eqz v1, :cond_9

    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_9
    throw p1

    .line 175
    :cond_a
    throw p1

    .line 176
    :cond_b
    :goto_4
    invoke-static {v0, v2}, LL5/w;->b0(LQ3/h;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    return-object v0
.end method

.method public final x(Ljava/util/Map;)LQ3/p;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, LL5/w;->y(Ljava/util/Map;)LQ3/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "modifiers"

    .line 6
    .line 7
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/util/List;

    .line 15
    .line 16
    new-instance v1, LL5/A;

    .line 17
    .line 18
    invoke-direct {v1, v0, p1}, LL5/A;-><init>(LQ3/e;Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, LL5/A;->a()LQ3/p;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method

.method public final y(Ljava/util/Map;)LQ3/e;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, LL5/w;->w(Ljava/util/Map;)LQ3/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "path"

    .line 6
    .line 7
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, LQ3/h;->f(Ljava/lang/String;)LQ3/e;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final z(Ljava/util/Map;)LV2/j;
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
    new-instance v2, LL5/h;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LL5/h;-><init>(LL5/w;Ljava/util/Map;LV2/k;)V

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
