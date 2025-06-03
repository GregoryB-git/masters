.class public LM5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;
.implements LE5/k$c;
.implements LA5/a;
.implements LE5/d$d;


# instance fields
.field public a:LE5/k;

.field public final b:Ljava/util/Map;

.field public c:LE5/d;

.field public final d:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LM5/e;->b:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, LM5/e;->d:Landroid/os/Handler;

    .line 21
    .line 22
    return-void
.end method

.method public static synthetic c(LE5/k$d;LV2/j;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LM5/e;->l(LE5/k$d;LV2/j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(LM5/e;Ls3/e;LV2/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LM5/e;->k(Ls3/e;LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(LV2/k;)V
    .locals 0

    .line 1
    invoke-static {p0}, LM5/e;->j(LV2/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(LM5/e;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, LM5/e;->d:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic j(LV2/k;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, v0}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    .line 4
    .line 5
    goto :goto_0

    .line 6
    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {p0, v0}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 8
    .line 9
    .line 10
    :goto_0
    return-void
.end method

.method public static synthetic l(LE5/k$d;LV2/j;)V
    .locals 4

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
    invoke-interface {p0, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_3

    .line 15
    :cond_0
    invoke-virtual {p1}, LV2/j;->i()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v0, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    instance-of v1, p1, LP4/p;

    .line 25
    .line 26
    const-string v2, "message"

    .line 27
    .line 28
    const-string v3, "code"

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    const-string v1, "throttled"

    .line 33
    .line 34
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    const-string v1, "frequency of requests exceeds throttled limits"

    .line 38
    .line 39
    :goto_0
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    instance-of v1, p1, LP4/n;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    const-string v1, "internal"

    .line 48
    .line 49
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    const-string v1, "internal remote config fetch error"

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    instance-of v1, p1, LP4/r;

    .line 56
    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    const-string v1, "remote-config-server-error"

    .line 60
    .line 61
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    if-eqz v1, :cond_4

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-eqz v1, :cond_4

    .line 82
    .line 83
    const-string v2, "Forbidden"

    .line 84
    .line 85
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_4

    .line 90
    .line 91
    const-string v1, "forbidden"

    .line 92
    .line 93
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    const-string v1, "unknown"

    .line 98
    .line 99
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    const-string v1, "unknown remote config error"

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_4
    :goto_1
    if-eqz p1, :cond_5

    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    goto :goto_2

    .line 112
    :cond_5
    const/4 p1, 0x0

    .line 113
    :goto_2
    const-string v1, "firebase_remote_config"

    .line 114
    .line 115
    invoke-interface {p0, v1, p1, v0}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :goto_3
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    const-string v0, "appName"

    .line 4
    .line 5
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    check-cast p1, Ljava/lang/String;

    .line 13
    .line 14
    iget-object v0, p0, LM5/e;->b:Ljava/util/Map;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, LP4/d;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, LP4/d;->remove()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, LM5/e;->b:Ljava/util/Map;

    .line 28
    .line 29
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Object;LE5/d$b;)V
    .locals 3

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LM5/e;->i(Ljava/util/Map;)LP4/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "appName"

    .line 8
    .line 9
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    check-cast p1, Ljava/lang/String;

    .line 17
    .line 18
    iget-object v1, p0, LM5/e;->b:Ljava/util/Map;

    .line 19
    .line 20
    new-instance v2, LM5/e$a;

    .line 21
    .line 22
    invoke-direct {v2, p0, p2}, LM5/e$a;-><init>(LM5/e;LE5/d$b;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v2}, LP4/m;->i(LP4/c;)LP4/d;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-void
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
    new-instance v2, LM5/a;

    .line 9
    .line 10
    invoke-direct {v2, v0}, LM5/a;-><init>(LV2/k;)V

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

.method public final g(LP4/t;)Ljava/util/Map;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, LP4/t;->e()[B

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "value"

    .line 11
    .line 12
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, LP4/t;->f()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {p0, p1}, LM5/e;->n(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v1, "source"

    .line 24
    .line 25
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public getPluginConstantsForFirebaseApp(Ls3/e;)LV2/j;
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
    new-instance v2, LM5/b;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LM5/b;-><init>(LM5/e;Ls3/e;LV2/k;)V

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

.method public final h(LP4/m;)Ljava/util/Map;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LP4/m;->n()LP4/q;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, LP4/q;->b()LP4/s;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, LP4/s;->a()J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "fetchTimeout"

    .line 23
    .line 24
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, LP4/m;->n()LP4/q;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {v1}, LP4/q;->b()LP4/s;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, LP4/s;->b()J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v3, "minimumFetchInterval"

    .line 44
    .line 45
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, LP4/m;->n()LP4/q;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-interface {v1}, LP4/q;->a()J

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const-string v3, "lastFetchTime"

    .line 61
    .line 62
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, LP4/m;->n()LP4/q;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-interface {p1}, LP4/q;->c()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-virtual {p0, p1}, LM5/e;->m(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const-string v1, "lastFetchStatus"

    .line 78
    .line 79
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    new-instance p1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string v1, "Sending fetchTimeout: "

    .line 88
    .line 89
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    const-string v1, "FRCPlugin"

    .line 104
    .line 105
    invoke-static {v1, p1}, Lt5/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return-object v0
.end method

.method public final i(Ljava/util/Map;)LP4/m;
    .locals 1

    .line 1
    const-string v0, "appName"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {p1}, Ls3/e;->p(Ljava/lang/String;)Ls3/e;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, LP4/m;->o(Ls3/e;)LP4/m;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final synthetic k(Ls3/e;LV2/k;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p1}, LP4/m;->o(Ls3/e;)LP4/m;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, LM5/e;->h(LP4/m;)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "parameters"

    .line 15
    .line 16
    invoke-virtual {p1}, LP4/m;->m()Ljava/util/Map;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1}, LM5/e;->o(Ljava/util/Map;)Ljava/util/Map;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, v1}, LV2/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-exception p1

    .line 32
    invoke-virtual {p2, p1}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    return-void
.end method

.method public final m(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p1, v0, :cond_2

    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    const-string p1, "failure"

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    const-string p1, "throttled"

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_1
    const-string p1, "noFetchYet"

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_2
    const-string p1, "success"

    .line 19
    .line 20
    return-object p1
.end method

.method public final n(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    const-string p1, "static"

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    const-string p1, "remote"

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_1
    const-string p1, "default"

    .line 14
    .line 15
    return-object p1
.end method

.method public final o(Ljava/util/Map;)Ljava/util/Map;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/lang/String;

    .line 25
    .line 26
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, LP4/t;

    .line 31
    .line 32
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    check-cast v3, LP4/t;

    .line 36
    .line 37
    invoke-virtual {p0, v3}, LM5/e;->g(LP4/t;)Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-object v0
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
    invoke-virtual {p0, p1}, LM5/e;->p(LE5/c;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onDetachedFromEngine(LA5/a$b;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LM5/e;->q()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onMethodCall(LE5/j;LE5/k$d;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p1}, LE5/j;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    check-cast v2, Ljava/util/Map;

    .line 8
    .line 9
    invoke-virtual {p0, v2}, LM5/e;->i(Ljava/util/Map;)LP4/m;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, p1, LE5/j;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v5, -0x1

    .line 23
    sparse-switch v4, :sswitch_data_0

    .line 24
    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :sswitch_0
    const-string v4, "RemoteConfig#setDefaults"

    .line 29
    .line 30
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-nez v3, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v5, 0x7

    .line 38
    goto :goto_0

    .line 39
    :sswitch_1
    const-string v4, "RemoteConfig#fetchAndActivate"

    .line 40
    .line 41
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/4 v5, 0x6

    .line 49
    goto :goto_0

    .line 50
    :sswitch_2
    const-string v4, "RemoteConfig#getAll"

    .line 51
    .line 52
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-nez v3, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    const/4 v5, 0x5

    .line 60
    goto :goto_0

    .line 61
    :sswitch_3
    const-string v4, "RemoteConfig#activate"

    .line 62
    .line 63
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-nez v3, :cond_3

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    const/4 v5, 0x4

    .line 71
    goto :goto_0

    .line 72
    :sswitch_4
    const-string v4, "RemoteConfig#fetch"

    .line 73
    .line 74
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-nez v3, :cond_4

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    const/4 v5, 0x3

    .line 82
    goto :goto_0

    .line 83
    :sswitch_5
    const-string v4, "RemoteConfig#getProperties"

    .line 84
    .line 85
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-nez v3, :cond_5

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_5
    const/4 v5, 0x2

    .line 93
    goto :goto_0

    .line 94
    :sswitch_6
    const-string v4, "RemoteConfig#setConfigSettings"

    .line 95
    .line 96
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-nez v3, :cond_6

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_6
    move v5, v1

    .line 104
    goto :goto_0

    .line 105
    :sswitch_7
    const-string v4, "RemoteConfig#ensureInitialized"

    .line 106
    .line 107
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-nez v3, :cond_7

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_7
    move v5, v0

    .line 115
    :goto_0
    packed-switch v5, :pswitch_data_0

    .line 116
    .line 117
    .line 118
    invoke-interface {p2}, LE5/k$d;->c()V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :pswitch_0
    const-string v0, "defaults"

    .line 123
    .line 124
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    check-cast p1, Ljava/util/Map;

    .line 129
    .line 130
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    check-cast p1, Ljava/util/Map;

    .line 134
    .line 135
    invoke-virtual {v2, p1}, LP4/m;->z(Ljava/util/Map;)LV2/j;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    goto :goto_2

    .line 140
    :pswitch_1
    invoke-virtual {v2}, LP4/m;->l()LV2/j;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    goto :goto_2

    .line 145
    :pswitch_2
    invoke-virtual {v2}, LP4/m;->m()Ljava/util/Map;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {p0, p1}, LM5/e;->o(Ljava/util/Map;)Ljava/util/Map;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    :goto_1
    invoke-static {p1}, LV2/m;->e(Ljava/lang/Object;)LV2/j;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    goto :goto_2

    .line 158
    :pswitch_3
    invoke-virtual {v2}, LP4/m;->h()LV2/j;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    goto :goto_2

    .line 163
    :pswitch_4
    invoke-virtual {v2}, LP4/m;->k()LV2/j;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    goto :goto_2

    .line 168
    :pswitch_5
    invoke-virtual {p0, v2}, LM5/e;->h(LP4/m;)Ljava/util/Map;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    goto :goto_1

    .line 173
    :pswitch_6
    const-string v0, "fetchTimeout"

    .line 174
    .line 175
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    check-cast v0, Ljava/lang/Integer;

    .line 180
    .line 181
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    const-string v1, "minimumFetchInterval"

    .line 189
    .line 190
    invoke-virtual {p1, v1}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    check-cast p1, Ljava/lang/Integer;

    .line 195
    .line 196
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    new-instance v1, LP4/s$b;

    .line 204
    .line 205
    invoke-direct {v1}, LP4/s$b;-><init>()V

    .line 206
    .line 207
    .line 208
    int-to-long v3, v0

    .line 209
    invoke-virtual {v1, v3, v4}, LP4/s$b;->d(J)LP4/s$b;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    int-to-long v3, p1

    .line 214
    invoke-virtual {v0, v3, v4}, LP4/s$b;->e(J)LP4/s$b;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-virtual {p1}, LP4/s$b;->c()LP4/s;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-virtual {v2, p1}, LP4/m;->x(LP4/s;)LV2/j;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    goto :goto_2

    .line 227
    :pswitch_7
    invoke-virtual {v2}, LP4/m;->j()LV2/j;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    new-array v1, v1, [LV2/j;

    .line 232
    .line 233
    aput-object p1, v1, v0

    .line 234
    .line 235
    invoke-static {v1}, LV2/m;->g([LV2/j;)LV2/j;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    :goto_2
    new-instance v0, LM5/c;

    .line 240
    .line 241
    invoke-direct {v0, p2}, LM5/c;-><init>(LE5/k$d;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1, v0}, LV2/j;->b(LV2/e;)LV2/j;

    .line 245
    .line 246
    .line 247
    return-void

    .line 248
    nop

    .line 249
    :sswitch_data_0
    .sparse-switch
        -0x444528c5 -> :sswitch_7
        -0x39aef1f4 -> :sswitch_6
        -0x312298d2 -> :sswitch_5
        0x2cfdbf -> :sswitch_4
        0x2d6c3ce -> :sswitch_3
        0x7271406 -> :sswitch_2
        0xbced8ab -> :sswitch_1
        0x3fc37019 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final p(LE5/c;)V
    .locals 2

    .line 1
    const-string v0, "plugins.flutter.io/firebase_remote_config"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->registerPlugin(Ljava/lang/String;Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, LE5/k;

    .line 7
    .line 8
    invoke-direct {v1, p1, v0}, LE5/k;-><init>(LE5/c;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, LM5/e;->a:LE5/k;

    .line 12
    .line 13
    invoke-virtual {v1, p0}, LE5/k;->e(LE5/k$c;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, LE5/d;

    .line 17
    .line 18
    const-string v1, "plugins.flutter.io/firebase_remote_config_updated"

    .line 19
    .line 20
    invoke-direct {v0, p1, v1}, LE5/d;-><init>(LE5/c;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LM5/e;->c:LE5/d;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, LE5/d;->d(LE5/d$d;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final q()V
    .locals 2

    .line 1
    iget-object v0, p0, LM5/e;->a:LE5/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, LE5/k;->e(LE5/k$c;)V

    .line 5
    .line 6
    .line 7
    iput-object v1, p0, LM5/e;->a:LE5/k;

    .line 8
    .line 9
    iget-object v0, p0, LM5/e;->c:LE5/d;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, LE5/d;->d(LE5/d$d;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, LM5/e;->c:LE5/d;

    .line 15
    .line 16
    return-void
.end method
