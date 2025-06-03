.class public abstract synthetic LS5/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()LE5/i;
    .locals 1

    .line 1
    sget-object v0, LS5/a$c;->d:LS5/a$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic b(LS5/a$b;Ljava/lang/Object;LE5/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    :try_start_0
    invoke-interface {p0, p1}, LS5/a$b;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    invoke-static {p0}, LS5/a;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-interface {p2, v0}, LE5/a$e;->a(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static synthetic c(LS5/a$b;Ljava/lang/Object;LE5/a$e;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Ljava/lang/String;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ljava/util/Map;

    .line 21
    .line 22
    :try_start_0
    invoke-interface {p0, v2, p1}, LS5/a$b;->d(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    invoke-static {p0}, LS5/a;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :goto_0
    invoke-interface {p2, v0}, LE5/a$e;->a(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static synthetic d(LS5/a$b;Ljava/lang/Object;LE5/a$e;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Ljava/lang/String;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Ljava/lang/Boolean;

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, LS5/a$d;

    .line 28
    .line 29
    :try_start_0
    invoke-interface {p0, v2, v3, p1}, LS5/a$b;->b(Ljava/lang/String;Ljava/lang/Boolean;LS5/a$d;)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    invoke-static {p0}, LS5/a;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :goto_0
    invoke-interface {p2, v0}, LE5/a$e;->a(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public static synthetic e(LS5/a$b;Ljava/lang/Object;LE5/a$e;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-interface {p0}, LS5/a$b;->e()Ljava/lang/Boolean;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p1, v0, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    invoke-static {p0}, LS5/a;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    invoke-interface {p2, p1}, LE5/a$e;->a(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static synthetic f(LS5/a$b;Ljava/lang/Object;LE5/a$e;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-interface {p0}, LS5/a$b;->c()V

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p1, p0, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    invoke-static {p0}, LS5/a;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    invoke-interface {p2, p1}, LE5/a$e;->a(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static g(LE5/c;LS5/a$b;)V
    .locals 4

    .line 1
    new-instance v0, LE5/a;

    .line 2
    .line 3
    const-string v1, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl"

    .line 4
    .line 5
    invoke-static {}, LS5/g;->a()LE5/i;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v0, p0, v1, v2}, LE5/a;-><init>(LE5/c;Ljava/lang/String;LE5/i;)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    new-instance v2, LS5/b;

    .line 16
    .line 17
    invoke-direct {v2, p1}, LS5/b;-><init>(LS5/a$b;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, LE5/a;->e(LE5/a$d;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v0, v1}, LE5/a;->e(LE5/a$d;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    new-instance v0, LE5/a;

    .line 28
    .line 29
    const-string v2, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl"

    .line 30
    .line 31
    invoke-static {}, LS5/g;->a()LE5/i;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-direct {v0, p0, v2, v3}, LE5/a;-><init>(LE5/c;Ljava/lang/String;LE5/i;)V

    .line 36
    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    new-instance v2, LS5/c;

    .line 41
    .line 42
    invoke-direct {v2, p1}, LS5/c;-><init>(LS5/a$b;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2}, LE5/a;->e(LE5/a$d;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {v0, v1}, LE5/a;->e(LE5/a$d;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    new-instance v0, LE5/a;

    .line 53
    .line 54
    const-string v2, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp"

    .line 55
    .line 56
    invoke-static {}, LS5/g;->a()LE5/i;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-direct {v0, p0, v2, v3}, LE5/a;-><init>(LE5/c;Ljava/lang/String;LE5/i;)V

    .line 61
    .line 62
    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    new-instance v2, LS5/d;

    .line 66
    .line 67
    invoke-direct {v2, p1}, LS5/d;-><init>(LS5/a$b;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v2}, LE5/a;->e(LE5/a$d;)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    invoke-virtual {v0, v1}, LE5/a;->e(LE5/a$d;)V

    .line 75
    .line 76
    .line 77
    :goto_2
    new-instance v0, LE5/a;

    .line 78
    .line 79
    const-string v2, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs"

    .line 80
    .line 81
    invoke-static {}, LS5/g;->a()LE5/i;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-direct {v0, p0, v2, v3}, LE5/a;-><init>(LE5/c;Ljava/lang/String;LE5/i;)V

    .line 86
    .line 87
    .line 88
    if-eqz p1, :cond_3

    .line 89
    .line 90
    new-instance v2, LS5/e;

    .line 91
    .line 92
    invoke-direct {v2, p1}, LS5/e;-><init>(LS5/a$b;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v2}, LE5/a;->e(LE5/a$d;)V

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_3
    invoke-virtual {v0, v1}, LE5/a;->e(LE5/a$d;)V

    .line 100
    .line 101
    .line 102
    :goto_3
    new-instance v0, LE5/a;

    .line 103
    .line 104
    const-string v2, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView"

    .line 105
    .line 106
    invoke-static {}, LS5/g;->a()LE5/i;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-direct {v0, p0, v2, v3}, LE5/a;-><init>(LE5/c;Ljava/lang/String;LE5/i;)V

    .line 111
    .line 112
    .line 113
    if-eqz p1, :cond_4

    .line 114
    .line 115
    new-instance p0, LS5/f;

    .line 116
    .line 117
    invoke-direct {p0, p1}, LS5/f;-><init>(LS5/a$b;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, p0}, LE5/a;->e(LE5/a$d;)V

    .line 121
    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_4
    invoke-virtual {v0, v1}, LE5/a;->e(LE5/a$d;)V

    .line 125
    .line 126
    .line 127
    :goto_4
    return-void
.end method
