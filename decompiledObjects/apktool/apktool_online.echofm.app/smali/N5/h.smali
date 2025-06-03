.class public LN5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;
.implements LA5/a;
.implements LE5/k$c;


# instance fields
.field public a:LE5/k;

.field public final b:Ljava/util/Map;

.field public c:LE5/c;


# direct methods
.method public constructor <init>()V
    .locals 1

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
    iput-object v0, p0, LN5/h;->b:Ljava/util/Map;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(LN5/h;Ljava/util/Map;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LN5/h;->s(Ljava/util/Map;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b()Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-static {}, LN5/h;->n()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic c(LN5/h;LE5/k$d;LV2/j;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LN5/h;->r(LE5/k$d;LV2/j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(LN5/h;Ljava/util/Map;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LN5/h;->o(Ljava/util/Map;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(LN5/h;Ljava/util/Map;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LN5/h;->q(Ljava/util/Map;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-static {}, LN5/h;->p()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic g(LN5/h;Ljava/util/Map;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LN5/h;->m(Ljava/util/Map;)Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic n()Ljava/lang/Void;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public static synthetic p()Ljava/util/Map;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method


# virtual methods
.method public didReinitializeFirebaseCore()LV2/j;
    .locals 2

    .line 1
    sget-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, LN5/b;

    .line 4
    .line 5
    invoke-direct {v1}, LN5/b;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, LV2/m;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)LV2/j;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public getPluginConstantsForFirebaseApp(Ls3/e;)LV2/j;
    .locals 1

    .line 1
    sget-object p1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v0, LN5/a;

    .line 4
    .line 5
    invoke-direct {v0}, LN5/a;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v0}, LV2/m;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)LV2/j;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final h(Ljava/util/Map;)LV2/j;
    .locals 2

    .line 1
    sget-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, LN5/g;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, LN5/g;-><init>(LN5/h;Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, LV2/m;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)LV2/j;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final i(Ljava/lang/Exception;)Ljava/util/Map;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "code"

    .line 7
    .line 8
    const-string v2, "unknown"

    .line 9
    .line 10
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    const-string v1, "message"

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const-string p1, "An unknown error has occurred."

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :goto_1
    return-object v0
.end method

.method public final j(Ljava/util/Map;)LV2/j;
    .locals 2

    .line 1
    sget-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, LN5/d;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, LN5/d;-><init>(LN5/h;Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, LV2/m;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)LV2/j;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final k(Ljava/util/Map;)Ls4/h;
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
    invoke-static {p1}, Ls4/h;->u(Ls3/e;)Ls4/h;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final l(Ljava/util/Map;)LV2/j;
    .locals 2

    .line 1
    sget-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, LN5/e;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, LN5/e;-><init>(LN5/h;Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, LV2/m;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)LV2/j;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final synthetic m(Ljava/util/Map;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LN5/h;->k(Ljava/util/Map;)Ls4/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ls4/h;->k()LV2/j;

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
    check-cast p1, Ljava/lang/Void;

    .line 14
    .line 15
    return-object p1
.end method

.method public final synthetic o(Ljava/util/Map;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LN5/h;->k(Ljava/util/Map;)Ls4/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ls4/h;->a()LV2/j;

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
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
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
    invoke-virtual {p0, p1}, LN5/h;->v(LE5/c;)LE5/k;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, LN5/h;->a:LE5/k;

    .line 10
    .line 11
    const-string p1, "plugins.flutter.io/firebase_app_installations"

    .line 12
    .line 13
    invoke-static {p1, p0}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->registerPlugin(Ljava/lang/String;Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onDetachedFromEngine(LA5/a$b;)V
    .locals 1

    .line 1
    iget-object p1, p0, LN5/h;->a:LE5/k;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, LE5/k;->e(LE5/k$c;)V

    .line 5
    .line 6
    .line 7
    iput-object v0, p0, LN5/h;->a:LE5/k;

    .line 8
    .line 9
    iput-object v0, p0, LN5/h;->c:LE5/c;

    .line 10
    .line 11
    invoke-virtual {p0}, LN5/h;->u()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onMethodCall(LE5/j;LE5/k$d;)V
    .locals 3

    .line 1
    iget-object v0, p1, LE5/j;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, -0x1

    .line 11
    sparse-switch v1, :sswitch_data_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :sswitch_0
    const-string v1, "FirebaseInstallations#delete"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v2, 0x3

    .line 25
    goto :goto_0

    .line 26
    :sswitch_1
    const-string v1, "FirebaseInstallations#getId"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v2, 0x2

    .line 36
    goto :goto_0

    .line 37
    :sswitch_2
    const-string v1, "FirebaseInstallations#getToken"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 v2, 0x1

    .line 47
    goto :goto_0

    .line 48
    :sswitch_3
    const-string v1, "FirebaseInstallations#registerIdChangeListener"

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    const/4 v2, 0x0

    .line 58
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 59
    .line 60
    .line 61
    invoke-interface {p2}, LE5/k$d;->c()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_0
    invoke-virtual {p1}, LE5/j;->b()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Ljava/util/Map;

    .line 70
    .line 71
    invoke-virtual {p0, p1}, LN5/h;->h(Ljava/util/Map;)LV2/j;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    goto :goto_1

    .line 76
    :pswitch_1
    invoke-virtual {p1}, LE5/j;->b()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, Ljava/util/Map;

    .line 81
    .line 82
    invoke-virtual {p0, p1}, LN5/h;->j(Ljava/util/Map;)LV2/j;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    goto :goto_1

    .line 87
    :pswitch_2
    invoke-virtual {p1}, LE5/j;->b()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Ljava/util/Map;

    .line 92
    .line 93
    invoke-virtual {p0, p1}, LN5/h;->l(Ljava/util/Map;)LV2/j;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    goto :goto_1

    .line 98
    :pswitch_3
    invoke-virtual {p1}, LE5/j;->b()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    check-cast p1, Ljava/util/Map;

    .line 103
    .line 104
    invoke-virtual {p0, p1}, LN5/h;->t(Ljava/util/Map;)LV2/j;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    :goto_1
    new-instance v0, LN5/c;

    .line 109
    .line 110
    invoke-direct {v0, p0, p2}, LN5/c;-><init>(LN5/h;LE5/k$d;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v0}, LV2/j;->b(LV2/e;)LV2/j;

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :sswitch_data_0
    .sparse-switch
        -0x46b6e3ed -> :sswitch_3
        -0xdb968ec -> :sswitch_2
        0x2ccbbde0 -> :sswitch_1
        0x678a3cbc -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic q(Ljava/util/Map;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, LN5/h;->k(Ljava/util/Map;)Ls4/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "forceRefresh"

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
    invoke-virtual {v0, p1}, Ls4/h;->b(Z)LV2/j;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, LV2/m;->a(LV2/j;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Ls4/n;

    .line 29
    .line 30
    invoke-virtual {p1}, Ls4/n;->b()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method

.method public final synthetic r(LE5/k$d;LV2/j;)V
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
    move-result-object p2

    .line 11
    invoke-interface {p1, p2}, LE5/k$d;->a(Ljava/lang/Object;)V

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
    if-eqz p2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    :goto_0
    invoke-virtual {p0, p2}, LN5/h;->i(Ljava/lang/Exception;)Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    const-string v1, "firebase_app_installations"

    .line 32
    .line 33
    invoke-interface {p1, v1, v0, p2}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :goto_1
    return-void
.end method

.method public final synthetic s(Ljava/util/Map;)Ljava/lang/String;
    .locals 3

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
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    check-cast v0, Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, LN5/h;->k(Ljava/util/Map;)Ls4/h;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v1, LN5/j;

    .line 17
    .line 18
    invoke-direct {v1, p1}, LN5/j;-><init>(Ls4/h;)V

    .line 19
    .line 20
    .line 21
    new-instance p1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v2, "plugins.flutter.io/firebase_app_installations/token/"

    .line 27
    .line 28
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v0, LE5/d;

    .line 39
    .line 40
    iget-object v2, p0, LN5/h;->c:LE5/c;

    .line 41
    .line 42
    invoke-direct {v0, v2, p1}, LE5/d;-><init>(LE5/c;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, LE5/d;->d(LE5/d$d;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, LN5/h;->b:Ljava/util/Map;

    .line 49
    .line 50
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    return-object p1
.end method

.method public final t(Ljava/util/Map;)LV2/j;
    .locals 2

    .line 1
    sget-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, LN5/f;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, LN5/f;-><init>(LN5/h;Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, LV2/m;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)LV2/j;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final u()V
    .locals 4

    .line 1
    iget-object v0, p0, LN5/h;->b:Ljava/util/Map;

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
    check-cast v1, LE5/d;

    .line 22
    .line 23
    iget-object v2, p0, LN5/h;->b:Ljava/util/Map;

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
    const/4 v3, 0x0

    .line 32
    invoke-interface {v2, v3}, LE5/d$d;->a(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v3}, LE5/d;->d(LE5/d$d;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object v0, p0, LN5/h;->b:Ljava/util/Map;

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final v(LE5/c;)LE5/k;
    .locals 2

    .line 1
    new-instance v0, LE5/k;

    .line 2
    .line 3
    const-string v1, "plugins.flutter.io/firebase_app_installations"

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, LE5/k;-><init>(LE5/c;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, LE5/k;->e(LE5/k$c;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LN5/h;->c:LE5/c;

    .line 12
    .line 13
    return-object v0
.end method
