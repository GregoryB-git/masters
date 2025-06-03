.class public abstract synthetic LR5/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()LE5/i;
    .locals 1

    .line 1
    new-instance v0, LE5/p;

    .line 2
    .line 3
    invoke-direct {v0}, LE5/p;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic b(LR5/j$a;Ljava/lang/Object;LE5/a$e;)V
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
    invoke-interface {p0, p1}, LR5/j$a;->remove(Ljava/lang/String;)Ljava/lang/Boolean;

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
    invoke-static {p0}, LR5/j;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

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

.method public static synthetic c(LR5/j$a;Ljava/lang/Object;LE5/a$e;)V
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
    check-cast p1, Ljava/lang/Boolean;

    .line 21
    .line 22
    :try_start_0
    invoke-interface {p0, v2, p1}, LR5/j$a;->f(Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;

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
    invoke-static {p0}, LR5/j;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

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

.method public static synthetic d(LR5/j$a;Ljava/lang/Object;LE5/a$e;)V
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
    check-cast p1, Ljava/lang/String;

    .line 21
    .line 22
    :try_start_0
    invoke-interface {p0, v2, p1}, LR5/j$a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;

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
    invoke-static {p0}, LR5/j;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

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

.method public static synthetic e(LR5/j$a;Ljava/lang/Object;LE5/a$e;)V
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
    move-result-object p1

    .line 20
    check-cast p1, Ljava/lang/Number;

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_0
    invoke-interface {p0, v2, p1}, LR5/j$a;->a(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    invoke-static {p0}, LR5/j;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :goto_1
    invoke-interface {p2, v0}, LE5/a$e;->a(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static synthetic f(LR5/j$a;Ljava/lang/Object;LE5/a$e;)V
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
    check-cast p1, Ljava/lang/Double;

    .line 21
    .line 22
    :try_start_0
    invoke-interface {p0, v2, p1}, LR5/j$a;->g(Ljava/lang/String;Ljava/lang/Double;)Ljava/lang/Boolean;

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
    invoke-static {p0}, LR5/j;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

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

.method public static synthetic g(LR5/j$a;Ljava/lang/Object;LE5/a$e;)V
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
    check-cast p1, Ljava/util/List;

    .line 21
    .line 22
    :try_start_0
    invoke-interface {p0, v2, p1}, LR5/j$a;->e(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Boolean;

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
    invoke-static {p0}, LR5/j;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

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

.method public static synthetic h(LR5/j$a;Ljava/lang/Object;LE5/a$e;)V
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
    check-cast p1, Ljava/util/List;

    .line 21
    .line 22
    :try_start_0
    invoke-interface {p0, v2, p1}, LR5/j$a;->d(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Boolean;

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
    invoke-static {p0}, LR5/j;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

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

.method public static synthetic i(LR5/j$a;Ljava/lang/Object;LE5/a$e;)V
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
    check-cast p1, Ljava/util/List;

    .line 21
    .line 22
    :try_start_0
    invoke-interface {p0, v2, p1}, LR5/j$a;->b(Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;

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
    invoke-static {p0}, LR5/j;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

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

.method public static j(LE5/c;LR5/j$a;)V
    .locals 5

    .line 1
    invoke-interface {p0}, LE5/c;->b()LE5/c$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LE5/a;

    .line 6
    .line 7
    const-string v2, "dev.flutter.pigeon.SharedPreferencesApi.remove"

    .line 8
    .line 9
    invoke-static {}, LR5/i;->a()LE5/i;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-direct {v1, p0, v2, v3, v0}, LE5/a;-><init>(LE5/c;Ljava/lang/String;LE5/i;LE5/c$c;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    new-instance v2, LR5/a;

    .line 20
    .line 21
    invoke-direct {v2, p1}, LR5/a;-><init>(LR5/j$a;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, LE5/a;->e(LE5/a$d;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v1, v0}, LE5/a;->e(LE5/a$d;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-interface {p0}, LE5/c;->b()LE5/c$c;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v2, LE5/a;

    .line 36
    .line 37
    const-string v3, "dev.flutter.pigeon.SharedPreferencesApi.setBool"

    .line 38
    .line 39
    invoke-static {}, LR5/i;->a()LE5/i;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-direct {v2, p0, v3, v4, v1}, LE5/a;-><init>(LE5/c;Ljava/lang/String;LE5/i;LE5/c$c;)V

    .line 44
    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    new-instance v1, LR5/b;

    .line 49
    .line 50
    invoke-direct {v1, p1}, LR5/b;-><init>(LR5/j$a;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v1}, LE5/a;->e(LE5/a$d;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {v2, v0}, LE5/a;->e(LE5/a$d;)V

    .line 58
    .line 59
    .line 60
    :goto_1
    invoke-interface {p0}, LE5/c;->b()LE5/c$c;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    new-instance v2, LE5/a;

    .line 65
    .line 66
    const-string v3, "dev.flutter.pigeon.SharedPreferencesApi.setString"

    .line 67
    .line 68
    invoke-static {}, LR5/i;->a()LE5/i;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-direct {v2, p0, v3, v4, v1}, LE5/a;-><init>(LE5/c;Ljava/lang/String;LE5/i;LE5/c$c;)V

    .line 73
    .line 74
    .line 75
    if-eqz p1, :cond_2

    .line 76
    .line 77
    new-instance v1, LR5/c;

    .line 78
    .line 79
    invoke-direct {v1, p1}, LR5/c;-><init>(LR5/j$a;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v1}, LE5/a;->e(LE5/a$d;)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    invoke-virtual {v2, v0}, LE5/a;->e(LE5/a$d;)V

    .line 87
    .line 88
    .line 89
    :goto_2
    invoke-interface {p0}, LE5/c;->b()LE5/c$c;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    new-instance v2, LE5/a;

    .line 94
    .line 95
    const-string v3, "dev.flutter.pigeon.SharedPreferencesApi.setInt"

    .line 96
    .line 97
    invoke-static {}, LR5/i;->a()LE5/i;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-direct {v2, p0, v3, v4, v1}, LE5/a;-><init>(LE5/c;Ljava/lang/String;LE5/i;LE5/c$c;)V

    .line 102
    .line 103
    .line 104
    if-eqz p1, :cond_3

    .line 105
    .line 106
    new-instance v1, LR5/d;

    .line 107
    .line 108
    invoke-direct {v1, p1}, LR5/d;-><init>(LR5/j$a;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v1}, LE5/a;->e(LE5/a$d;)V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_3
    invoke-virtual {v2, v0}, LE5/a;->e(LE5/a$d;)V

    .line 116
    .line 117
    .line 118
    :goto_3
    invoke-interface {p0}, LE5/c;->b()LE5/c$c;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    new-instance v2, LE5/a;

    .line 123
    .line 124
    const-string v3, "dev.flutter.pigeon.SharedPreferencesApi.setDouble"

    .line 125
    .line 126
    invoke-static {}, LR5/i;->a()LE5/i;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-direct {v2, p0, v3, v4, v1}, LE5/a;-><init>(LE5/c;Ljava/lang/String;LE5/i;LE5/c$c;)V

    .line 131
    .line 132
    .line 133
    if-eqz p1, :cond_4

    .line 134
    .line 135
    new-instance v1, LR5/e;

    .line 136
    .line 137
    invoke-direct {v1, p1}, LR5/e;-><init>(LR5/j$a;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v1}, LE5/a;->e(LE5/a$d;)V

    .line 141
    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_4
    invoke-virtual {v2, v0}, LE5/a;->e(LE5/a$d;)V

    .line 145
    .line 146
    .line 147
    :goto_4
    invoke-interface {p0}, LE5/c;->b()LE5/c$c;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    new-instance v2, LE5/a;

    .line 152
    .line 153
    const-string v3, "dev.flutter.pigeon.SharedPreferencesApi.setStringList"

    .line 154
    .line 155
    invoke-static {}, LR5/i;->a()LE5/i;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-direct {v2, p0, v3, v4, v1}, LE5/a;-><init>(LE5/c;Ljava/lang/String;LE5/i;LE5/c$c;)V

    .line 160
    .line 161
    .line 162
    if-eqz p1, :cond_5

    .line 163
    .line 164
    new-instance v1, LR5/f;

    .line 165
    .line 166
    invoke-direct {v1, p1}, LR5/f;-><init>(LR5/j$a;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v1}, LE5/a;->e(LE5/a$d;)V

    .line 170
    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_5
    invoke-virtual {v2, v0}, LE5/a;->e(LE5/a$d;)V

    .line 174
    .line 175
    .line 176
    :goto_5
    invoke-interface {p0}, LE5/c;->b()LE5/c$c;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    new-instance v2, LE5/a;

    .line 181
    .line 182
    const-string v3, "dev.flutter.pigeon.SharedPreferencesApi.clear"

    .line 183
    .line 184
    invoke-static {}, LR5/i;->a()LE5/i;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-direct {v2, p0, v3, v4, v1}, LE5/a;-><init>(LE5/c;Ljava/lang/String;LE5/i;LE5/c$c;)V

    .line 189
    .line 190
    .line 191
    if-eqz p1, :cond_6

    .line 192
    .line 193
    new-instance v1, LR5/g;

    .line 194
    .line 195
    invoke-direct {v1, p1}, LR5/g;-><init>(LR5/j$a;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v1}, LE5/a;->e(LE5/a$d;)V

    .line 199
    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_6
    invoke-virtual {v2, v0}, LE5/a;->e(LE5/a$d;)V

    .line 203
    .line 204
    .line 205
    :goto_6
    invoke-interface {p0}, LE5/c;->b()LE5/c$c;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    new-instance v2, LE5/a;

    .line 210
    .line 211
    const-string v3, "dev.flutter.pigeon.SharedPreferencesApi.getAll"

    .line 212
    .line 213
    invoke-static {}, LR5/i;->a()LE5/i;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-direct {v2, p0, v3, v4, v1}, LE5/a;-><init>(LE5/c;Ljava/lang/String;LE5/i;LE5/c$c;)V

    .line 218
    .line 219
    .line 220
    if-eqz p1, :cond_7

    .line 221
    .line 222
    new-instance p0, LR5/h;

    .line 223
    .line 224
    invoke-direct {p0, p1}, LR5/h;-><init>(LR5/j$a;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2, p0}, LE5/a;->e(LE5/a$d;)V

    .line 228
    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_7
    invoke-virtual {v2, v0}, LE5/a;->e(LE5/a$d;)V

    .line 232
    .line 233
    .line 234
    :goto_7
    return-void
.end method
