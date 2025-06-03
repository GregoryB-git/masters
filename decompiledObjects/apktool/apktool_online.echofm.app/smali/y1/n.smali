.class public final Ly1/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ly1/n;

.field public static final b:Ljava/lang/String;

.field public static final c:I

.field public static volatile d:Ly1/f;

.field public static final e:Ljava/util/concurrent/ScheduledExecutorService;

.field public static f:Ljava/util/concurrent/ScheduledFuture;

.field public static final g:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ly1/n;

    .line 2
    .line 3
    invoke-direct {v0}, Ly1/n;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ly1/n;->a:Ly1/n;

    .line 7
    .line 8
    const-class v0, Ly1/n;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Ly1/n;->b:Ljava/lang/String;

    .line 15
    .line 16
    const/16 v0, 0x64

    .line 17
    .line 18
    sput v0, Ly1/n;->c:I

    .line 19
    .line 20
    new-instance v0, Ly1/f;

    .line 21
    .line 22
    invoke-direct {v0}, Ly1/f;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, Ly1/n;->d:Ly1/f;

    .line 26
    .line 27
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Ly1/n;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 32
    .line 33
    new-instance v0, Ly1/h;

    .line 34
    .line 35
    invoke-direct {v0}, Ly1/h;-><init>()V

    .line 36
    .line 37
    .line 38
    sput-object v0, Ly1/n;->g:Ljava/lang/Runnable;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ly1/a;Lx1/F;Ly1/H;Ly1/E;Lx1/K;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Ly1/n;->j(Ly1/a;Lx1/F;Ly1/H;Ly1/E;Lx1/K;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Ly1/a;Ly1/e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ly1/n;->h(Ly1/a;Ly1/e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Ly1/C;)V
    .locals 0

    .line 1
    invoke-static {p0}, Ly1/n;->m(Ly1/C;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Ly1/a;Ly1/H;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ly1/n;->r(Ly1/a;Ly1/H;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e()V
    .locals 0

    .line 1
    invoke-static {}, Ly1/n;->o()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f()V
    .locals 0

    .line 1
    invoke-static {}, Ly1/n;->t()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final g(Ly1/a;Ly1/e;)V
    .locals 3

    .line 1
    const-class v0, Ly1/n;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    const-string v1, "accessTokenAppId"

    .line 11
    .line 12
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "appEvent"

    .line 16
    .line 17
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object v1, Ly1/n;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 21
    .line 22
    new-instance v2, Ly1/i;

    .line 23
    .line 24
    invoke-direct {v2, p0, p1}, Ly1/i;-><init>(Ly1/a;Ly1/e;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    invoke-static {p0, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static final h(Ly1/a;Ly1/e;)V
    .locals 4

    .line 1
    const-class v0, Ly1/n;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    const-string v1, "$accessTokenAppId"

    .line 11
    .line 12
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "$appEvent"

    .line 16
    .line 17
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object v1, Ly1/n;->d:Ly1/f;

    .line 21
    .line 22
    invoke-virtual {v1, p0, p1}, Ly1/f;->a(Ly1/a;Ly1/e;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Ly1/p;->b:Ly1/p$a;

    .line 26
    .line 27
    invoke-virtual {p0}, Ly1/p$a;->e()Ly1/p$b;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    sget-object p1, Ly1/p$b;->p:Ly1/p$b;

    .line 32
    .line 33
    if-eq p0, p1, :cond_1

    .line 34
    .line 35
    sget-object p0, Ly1/n;->d:Ly1/f;

    .line 36
    .line 37
    invoke-virtual {p0}, Ly1/f;->d()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    sget p1, Ly1/n;->c:I

    .line 42
    .line 43
    if-le p0, p1, :cond_1

    .line 44
    .line 45
    sget-object p0, Ly1/C;->s:Ly1/C;

    .line 46
    .line 47
    invoke-static {p0}, Ly1/n;->n(Ly1/C;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    sget-object p0, Ly1/n;->f:Ljava/util/concurrent/ScheduledFuture;

    .line 54
    .line 55
    if-nez p0, :cond_2

    .line 56
    .line 57
    sget-object p0, Ly1/n;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 58
    .line 59
    sget-object p1, Ly1/n;->g:Ljava/lang/Runnable;

    .line 60
    .line 61
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 62
    .line 63
    const-wide/16 v2, 0xf

    .line 64
    .line 65
    invoke-interface {p0, p1, v2, v3, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    sput-object p0, Ly1/n;->f:Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    :cond_2
    :goto_0
    return-void

    .line 72
    :goto_1
    invoke-static {p0, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public static final i(Ly1/a;Ly1/H;ZLy1/E;)Lx1/F;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const-class v2, Ly1/n;

    .line 4
    .line 5
    invoke-static {v2}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    return-object v4

    .line 13
    :cond_0
    :try_start_0
    const-string v3, "accessTokenAppId"

    .line 14
    .line 15
    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v3, "appEvents"

    .line 19
    .line 20
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v3, "flushState"

    .line 24
    .line 25
    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ly1/a;->b()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-static {v3, v1}, LO1/v;->q(Ljava/lang/String;Z)LO1/r;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    sget-object v6, Lx1/F;->n:Lx1/F$c;

    .line 37
    .line 38
    sget-object v7, Lkotlin/jvm/internal/x;->a:Lkotlin/jvm/internal/x;

    .line 39
    .line 40
    const-string v7, "%s/activities"

    .line 41
    .line 42
    new-array v8, v0, [Ljava/lang/Object;

    .line 43
    .line 44
    aput-object v3, v8, v1

    .line 45
    .line 46
    invoke-static {v8, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v7, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const-string v7, "java.lang.String.format(format, *args)"

    .line 55
    .line 56
    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v6, v4, v3, v4, v4}, Lx1/F$c;->A(Lx1/a;Ljava/lang/String;Lorg/json/JSONObject;Lx1/F$b;)Lx1/F;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v3, v0}, Lx1/F;->D(Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3}, Lx1/F;->u()Landroid/os/Bundle;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-nez v0, :cond_1

    .line 71
    .line 72
    new-instance v0, Landroid/os/Bundle;

    .line 73
    .line 74
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catchall_0
    move-exception p0

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    :goto_0
    const-string v6, "access_token"

    .line 81
    .line 82
    invoke-virtual {p0}, Ly1/a;->a()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-virtual {v0, v6, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    sget-object v6, Ly1/F;->b:Ly1/F$a;

    .line 90
    .line 91
    invoke-virtual {v6}, Ly1/F$a;->d()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    if-eqz v6, :cond_2

    .line 96
    .line 97
    const-string v7, "device_token"

    .line 98
    .line 99
    invoke-virtual {v0, v7, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_2
    sget-object v6, Ly1/s;->c:Ly1/s$a;

    .line 103
    .line 104
    invoke-virtual {v6}, Ly1/s$a;->k()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    if-eqz v6, :cond_3

    .line 109
    .line 110
    const-string v7, "install_referrer"

    .line 111
    .line 112
    invoke-virtual {v0, v7, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_3
    invoke-virtual {v3, v0}, Lx1/F;->G(Landroid/os/Bundle;)V

    .line 116
    .line 117
    .line 118
    if-eqz v5, :cond_4

    .line 119
    .line 120
    invoke-virtual {v5}, LO1/r;->n()Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    :cond_4
    invoke-static {}, Lx1/B;->l()Landroid/content/Context;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {p1, v3, v0, v1, p2}, Ly1/H;->e(Lx1/F;Landroid/content/Context;ZZ)I

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    if-nez p2, :cond_5

    .line 133
    .line 134
    return-object v4

    .line 135
    :cond_5
    invoke-virtual {p3}, Ly1/E;->a()I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    add-int/2addr v0, p2

    .line 140
    invoke-virtual {p3, v0}, Ly1/E;->c(I)V

    .line 141
    .line 142
    .line 143
    new-instance p2, Ly1/k;

    .line 144
    .line 145
    invoke-direct {p2, p0, v3, p1, p3}, Ly1/k;-><init>(Ly1/a;Lx1/F;Ly1/H;Ly1/E;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3, p2}, Lx1/F;->C(Lx1/F$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    .line 150
    .line 151
    return-object v3

    .line 152
    :goto_1
    invoke-static {p0, v2}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    return-object v4
.end method

.method public static final j(Ly1/a;Lx1/F;Ly1/H;Ly1/E;Lx1/K;)V
    .locals 2

    .line 1
    const-class v0, Ly1/n;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    const-string v1, "$accessTokenAppId"

    .line 11
    .line 12
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "$postRequest"

    .line 16
    .line 17
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v1, "$appEvents"

    .line 21
    .line 22
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v1, "$flushState"

    .line 26
    .line 27
    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const-string v1, "response"

    .line 31
    .line 32
    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0, p1, p4, p2, p3}, Ly1/n;->q(Ly1/a;Lx1/F;Lx1/K;Ly1/H;Ly1/E;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    invoke-static {p0, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static final k(Ly1/f;Ly1/E;)Ljava/util/List;
    .locals 7

    .line 1
    const-class v0, Ly1/n;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_0
    :try_start_0
    const-string v1, "appEventCollection"

    .line 12
    .line 13
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "flushResults"

    .line 17
    .line 18
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lx1/B;->l()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Lx1/B;->z(Landroid/content/Context;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    new-instance v3, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ly1/f;->f()Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_3

    .line 47
    .line 48
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    check-cast v5, Ly1/a;

    .line 53
    .line 54
    invoke-virtual {p0, v5}, Ly1/f;->c(Ly1/a;)Ly1/H;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    if-eqz v6, :cond_2

    .line 59
    .line 60
    invoke-static {v5, v6, v1, p1}, Ly1/n;->i(Ly1/a;Ly1/H;ZLy1/E;)Lx1/F;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    if-eqz v5, :cond_1

    .line 65
    .line 66
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    sget-object v6, LA1/d;->a:LA1/d;

    .line 70
    .line 71
    invoke-virtual {v6}, LA1/d;->f()Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_1

    .line 76
    .line 77
    invoke-static {v5}, LA1/g;->l(Lx1/F;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catchall_0
    move-exception p0

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    const-string p0, "Required value was null."

    .line 84
    .line 85
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    :cond_3
    return-object v3

    .line 96
    :goto_1
    invoke-static {p0, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-object v2
.end method

.method public static final l(Ly1/C;)V
    .locals 3

    .line 1
    const-class v0, Ly1/n;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    const-string v1, "reason"

    .line 11
    .line 12
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Ly1/n;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 16
    .line 17
    new-instance v2, Ly1/j;

    .line 18
    .line 19
    invoke-direct {v2, p0}, Ly1/j;-><init>(Ly1/C;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    invoke-static {p0, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static final m(Ly1/C;)V
    .locals 2

    .line 1
    const-class v0, Ly1/n;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    const-string v1, "$reason"

    .line 11
    .line 12
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Ly1/n;->n(Ly1/C;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    invoke-static {p0, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static final n(Ly1/C;)V
    .locals 4

    .line 1
    const-class v0, Ly1/n;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    const-string v1, "reason"

    .line 11
    .line 12
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Ly1/g;->a()Ly1/G;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sget-object v2, Ly1/n;->d:Ly1/f;

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Ly1/f;->b(Ly1/G;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    :try_start_1
    sget-object v1, Ly1/n;->d:Ly1/f;

    .line 25
    .line 26
    invoke-static {p0, v1}, Ly1/n;->u(Ly1/C;Ly1/f;)Ly1/E;

    .line 27
    .line 28
    .line 29
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    :try_start_2
    new-instance v1, Landroid/content/Intent;

    .line 33
    .line 34
    const-string v2, "com.facebook.sdk.APP_EVENTS_FLUSHED"

    .line 35
    .line 36
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v2, "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED"

    .line 40
    .line 41
    invoke-virtual {p0}, Ly1/E;->a()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 46
    .line 47
    .line 48
    const-string v2, "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT"

    .line 49
    .line 50
    invoke-virtual {p0}, Ly1/E;->b()Ly1/D;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {v1, v2, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lx1/B;->l()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, LZ/a;->b(Landroid/content/Context;)LZ/a;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0, v1}, LZ/a;->d(Landroid/content/Intent;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p0

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    :goto_0
    return-void

    .line 72
    :catch_0
    move-exception p0

    .line 73
    sget-object v1, Ly1/n;->b:Ljava/lang/String;

    .line 74
    .line 75
    const-string v2, "Caught unexpected exception while flushing app events: "

    .line 76
    .line 77
    invoke-static {v1, v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :goto_1
    invoke-static {p0, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public static final o()V
    .locals 3

    .line 1
    const-class v0, Ly1/n;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :try_start_0
    sput-object v1, Ly1/n;->f:Ljava/util/concurrent/ScheduledFuture;

    .line 12
    .line 13
    sget-object v1, Ly1/p;->b:Ly1/p$a;

    .line 14
    .line 15
    invoke-virtual {v1}, Ly1/p$a;->e()Ly1/p$b;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sget-object v2, Ly1/p$b;->p:Ly1/p$b;

    .line 20
    .line 21
    if-eq v1, v2, :cond_1

    .line 22
    .line 23
    sget-object v1, Ly1/C;->p:Ly1/C;

    .line 24
    .line 25
    invoke-static {v1}, Ly1/n;->n(Ly1/C;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    :goto_0
    return-void

    .line 32
    :goto_1
    invoke-static {v1, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static final p()Ljava/util/Set;
    .locals 3

    .line 1
    const-class v0, Ly1/n;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_0
    :try_start_0
    sget-object v1, Ly1/n;->d:Ly1/f;

    .line 12
    .line 13
    invoke-virtual {v1}, Ly1/f;->f()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    return-object v0

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    invoke-static {v1, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object v2
.end method

.method public static final q(Ly1/a;Lx1/F;Lx1/K;Ly1/H;Ly1/E;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    const-class v3, Ly1/n;

    .line 8
    .line 9
    invoke-static {v3}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    :try_start_0
    const-string v4, "accessTokenAppId"

    .line 17
    .line 18
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v4, "request"

    .line 22
    .line 23
    move-object/from16 v5, p1

    .line 24
    .line 25
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v4, "response"

    .line 29
    .line 30
    move-object/from16 v6, p2

    .line 31
    .line 32
    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v4, "appEvents"

    .line 36
    .line 37
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string v4, "flushState"

    .line 41
    .line 42
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual/range {p2 .. p2}, Lx1/K;->b()Lx1/r;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const-string v7, "Success"

    .line 50
    .line 51
    sget-object v8, Ly1/D;->o:Ly1/D;

    .line 52
    .line 53
    const/4 v9, 0x1

    .line 54
    const/4 v10, 0x0

    .line 55
    const/4 v11, 0x2

    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    invoke-virtual {v4}, Lx1/r;->b()I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    const/4 v8, -0x1

    .line 63
    if-ne v7, v8, :cond_1

    .line 64
    .line 65
    const-string v7, "Failed: No Connectivity"

    .line 66
    .line 67
    sget-object v8, Ly1/D;->q:Ly1/D;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    goto/16 :goto_3

    .line 72
    .line 73
    :cond_1
    sget-object v7, Lkotlin/jvm/internal/x;->a:Lkotlin/jvm/internal/x;

    .line 74
    .line 75
    const-string v7, "Failed:\n  Response: %s\n  Error %s"

    .line 76
    .line 77
    new-array v8, v11, [Ljava/lang/Object;

    .line 78
    .line 79
    invoke-virtual/range {p2 .. p2}, Lx1/K;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    aput-object v6, v8, v10

    .line 84
    .line 85
    invoke-virtual {v4}, Lx1/r;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    aput-object v6, v8, v9

    .line 90
    .line 91
    invoke-static {v8, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    invoke-static {v7, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    const-string v6, "java.lang.String.format(format, *args)"

    .line 100
    .line 101
    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    sget-object v8, Ly1/D;->p:Ly1/D;

    .line 105
    .line 106
    :cond_2
    :goto_0
    sget-object v6, Lx1/B;->a:Lx1/B;

    .line 107
    .line 108
    sget-object v6, Lx1/N;->s:Lx1/N;

    .line 109
    .line 110
    invoke-static {v6}, Lx1/B;->H(Lx1/N;)Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-eqz v6, :cond_3

    .line 115
    .line 116
    invoke-virtual/range {p1 .. p1}, Lx1/F;->w()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    check-cast v6, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    .line 122
    :try_start_1
    new-instance v12, Lorg/json/JSONArray;

    .line 123
    .line 124
    invoke-direct {v12, v6}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12, v11}, Lorg/json/JSONArray;->toString(I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    const-string v12, "{\n            val jsonArray = JSONArray(eventsJsonString)\n            jsonArray.toString(2)\n          }"

    .line 132
    .line 133
    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :catch_0
    :try_start_2
    const-string v6, "<Can\'t encode events for debug logging>"

    .line 138
    .line 139
    :goto_1
    sget-object v12, LO1/C;->e:LO1/C$a;

    .line 140
    .line 141
    sget-object v13, Lx1/N;->s:Lx1/N;

    .line 142
    .line 143
    sget-object v14, Ly1/n;->b:Ljava/lang/String;

    .line 144
    .line 145
    const-string v15, "TAG"

    .line 146
    .line 147
    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    const-string v15, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s"

    .line 151
    .line 152
    const/4 v11, 0x3

    .line 153
    new-array v11, v11, [Ljava/lang/Object;

    .line 154
    .line 155
    invoke-virtual/range {p1 .. p1}, Lx1/F;->q()Lorg/json/JSONObject;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    aput-object v5, v11, v10

    .line 164
    .line 165
    aput-object v7, v11, v9

    .line 166
    .line 167
    const/4 v5, 0x2

    .line 168
    aput-object v6, v11, v5

    .line 169
    .line 170
    invoke-virtual {v12, v13, v14, v15, v11}, LO1/C$a;->c(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    :cond_3
    if-eqz v4, :cond_4

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_4
    move v9, v10

    .line 177
    :goto_2
    invoke-virtual {v1, v9}, Ly1/H;->b(Z)V

    .line 178
    .line 179
    .line 180
    sget-object v4, Ly1/D;->q:Ly1/D;

    .line 181
    .line 182
    if-ne v8, v4, :cond_5

    .line 183
    .line 184
    invoke-static {}, Lx1/B;->t()Ljava/util/concurrent/Executor;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    new-instance v6, Ly1/m;

    .line 189
    .line 190
    invoke-direct {v6, v0, v1}, Ly1/m;-><init>(Ly1/a;Ly1/H;)V

    .line 191
    .line 192
    .line 193
    invoke-interface {v5, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 194
    .line 195
    .line 196
    :cond_5
    sget-object v0, Ly1/D;->o:Ly1/D;

    .line 197
    .line 198
    if-eq v8, v0, :cond_6

    .line 199
    .line 200
    invoke-virtual/range {p4 .. p4}, Ly1/E;->b()Ly1/D;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    if-eq v0, v4, :cond_6

    .line 205
    .line 206
    invoke-virtual {v2, v8}, Ly1/E;->d(Ly1/D;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 207
    .line 208
    .line 209
    :cond_6
    return-void

    .line 210
    :goto_3
    invoke-static {v0, v3}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    return-void
.end method

.method public static final r(Ly1/a;Ly1/H;)V
    .locals 2

    .line 1
    const-class v0, Ly1/n;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    const-string v1, "$accessTokenAppId"

    .line 11
    .line 12
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "$appEvents"

    .line 16
    .line 17
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, p1}, Ly1/o;->a(Ly1/a;Ly1/H;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    invoke-static {p0, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static final s()V
    .locals 3

    .line 1
    const-class v0, Ly1/n;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    sget-object v1, Ly1/n;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 11
    .line 12
    new-instance v2, Ly1/l;

    .line 13
    .line 14
    invoke-direct {v2}, Ly1/l;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    invoke-static {v1, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static final t()V
    .locals 2

    .line 1
    const-class v0, Ly1/n;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    sget-object v1, Ly1/o;->a:Ly1/o;

    .line 11
    .line 12
    sget-object v1, Ly1/n;->d:Ly1/f;

    .line 13
    .line 14
    invoke-static {v1}, Ly1/o;->b(Ly1/f;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Ly1/f;

    .line 18
    .line 19
    invoke-direct {v1}, Ly1/f;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v1, Ly1/n;->d:Ly1/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    invoke-static {v1, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static final u(Ly1/C;Ly1/f;)Ly1/E;
    .locals 11

    .line 1
    const-class v0, Ly1/n;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_0
    :try_start_0
    const-string v1, "reason"

    .line 12
    .line 13
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "appEventCollection"

    .line 17
    .line 18
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Ly1/E;

    .line 22
    .line 23
    invoke-direct {v1}, Ly1/E;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v1}, Ly1/n;->k(Ly1/f;Ly1/E;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    move-object v3, p1

    .line 31
    check-cast v3, Ljava/util/Collection;

    .line 32
    .line 33
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    const/4 v4, 0x1

    .line 38
    xor-int/2addr v3, v4

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    sget-object v3, LO1/C;->e:LO1/C$a;

    .line 42
    .line 43
    sget-object v5, Lx1/N;->s:Lx1/N;

    .line 44
    .line 45
    sget-object v6, Ly1/n;->b:Ljava/lang/String;

    .line 46
    .line 47
    const-string v7, "TAG"

    .line 48
    .line 49
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string v7, "Flushing %d events due to %s."

    .line 53
    .line 54
    const/4 v8, 0x2

    .line 55
    new-array v8, v8, [Ljava/lang/Object;

    .line 56
    .line 57
    invoke-virtual {v1}, Ly1/E;->a()I

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    const/4 v10, 0x0

    .line 66
    aput-object v9, v8, v10

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    aput-object p0, v8, v4

    .line 73
    .line 74
    invoke-virtual {v3, v5, v6, v7, v8}, LO1/C$a;->c(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_1

    .line 86
    .line 87
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Lx1/F;

    .line 92
    .line 93
    invoke-virtual {p1}, Lx1/F;->k()Lx1/K;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :catchall_0
    move-exception p0

    .line 98
    goto :goto_1

    .line 99
    :cond_1
    return-object v1

    .line 100
    :cond_2
    return-object v2

    .line 101
    :goto_1
    invoke-static {p0, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    return-object v2
.end method
