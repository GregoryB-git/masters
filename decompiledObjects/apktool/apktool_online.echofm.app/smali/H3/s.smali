.class public LH3/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ls3/e;

.field public final c:LH3/y;

.field public final d:LH3/H;

.field public final e:J

.field public f:LH3/t;

.field public g:LH3/t;

.field public h:Z

.field public i:LH3/q;

.field public final j:LH3/C;

.field public final k:LM3/g;

.field public final l:LG3/b;

.field public final m:LF3/a;

.field public final n:Ljava/util/concurrent/ExecutorService;

.field public final o:LH3/n;

.field public final p:LH3/m;

.field public final q:LE3/a;


# direct methods
.method public constructor <init>(Ls3/e;LH3/C;LE3/a;LH3/y;LG3/b;LF3/a;LM3/g;Ljava/util/concurrent/ExecutorService;LH3/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LH3/s;->b:Ls3/e;

    .line 5
    .line 6
    iput-object p4, p0, LH3/s;->c:LH3/y;

    .line 7
    .line 8
    invoke-virtual {p1}, Ls3/e;->m()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, LH3/s;->a:Landroid/content/Context;

    .line 13
    .line 14
    iput-object p2, p0, LH3/s;->j:LH3/C;

    .line 15
    .line 16
    iput-object p3, p0, LH3/s;->q:LE3/a;

    .line 17
    .line 18
    iput-object p5, p0, LH3/s;->l:LG3/b;

    .line 19
    .line 20
    iput-object p6, p0, LH3/s;->m:LF3/a;

    .line 21
    .line 22
    iput-object p8, p0, LH3/s;->n:Ljava/util/concurrent/ExecutorService;

    .line 23
    .line 24
    iput-object p7, p0, LH3/s;->k:LM3/g;

    .line 25
    .line 26
    new-instance p1, LH3/n;

    .line 27
    .line 28
    invoke-direct {p1, p8}, LH3/n;-><init>(Ljava/util/concurrent/Executor;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, LH3/s;->o:LH3/n;

    .line 32
    .line 33
    iput-object p9, p0, LH3/s;->p:LH3/m;

    .line 34
    .line 35
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    iput-wide p1, p0, LH3/s;->e:J

    .line 40
    .line 41
    new-instance p1, LH3/H;

    .line 42
    .line 43
    invoke-direct {p1}, LH3/H;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, LH3/s;->d:LH3/H;

    .line 47
    .line 48
    return-void
.end method

.method public static synthetic a(LH3/s;LO3/i;)LV2/j;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LH3/s;->i(LO3/i;)LV2/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(LH3/s;)LH3/t;
    .locals 0

    .line 1
    iget-object p0, p0, LH3/s;->f:LH3/t;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(LH3/s;)LH3/q;
    .locals 0

    .line 1
    iget-object p0, p0, LH3/s;->i:LH3/q;

    .line 2
    .line 3
    return-object p0
.end method

.method public static l()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "18.5.1"

    .line 2
    .line 3
    return-object v0
.end method

.method public static m(Ljava/lang/String;Z)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    invoke-static {}, LE3/f;->f()LE3/f;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-string p1, "Configured not to require a build ID."

    .line 9
    .line 10
    invoke-virtual {p0, p1}, LE3/f;->i(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    return v0

    .line 21
    :cond_1
    const-string p0, "FirebaseCrashlytics"

    .line 22
    .line 23
    const-string p1, "."

    .line 24
    .line 25
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    const-string v0, ".     |  | "

    .line 29
    .line 30
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    const-string v0, ".     |  |"

    .line 34
    .line 35
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    const-string v1, ".   \\ |  | /"

    .line 42
    .line 43
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    const-string v1, ".    \\    /"

    .line 47
    .line 48
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    const-string v1, ".     \\  /"

    .line 52
    .line 53
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    const-string v1, ".      \\/"

    .line 57
    .line 58
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    const-string v1, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app\'s build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin"

    .line 65
    .line 66
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    const-string v1, ".      /\\"

    .line 73
    .line 74
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    const-string v1, ".     /  \\"

    .line 78
    .line 79
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    const-string v1, ".    /    \\"

    .line 83
    .line 84
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    const-string v1, ".   / |  | \\"

    .line 88
    .line 89
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    const/4 p0, 0x0

    .line 105
    return p0
.end method


# virtual methods
.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, LH3/s;->o:LH3/n;

    .line 2
    .line 3
    new-instance v1, LH3/s$d;

    .line 4
    .line 5
    invoke-direct {v1, p0}, LH3/s$d;-><init>(LH3/s;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, LH3/n;->h(Ljava/util/concurrent/Callable;)LV2/j;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :try_start_0
    invoke-static {v0}, LH3/c0;->f(LV2/j;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    :goto_0
    iput-boolean v0, p0, LH3/s;->h:Z

    .line 25
    .line 26
    return-void

    .line 27
    :catch_0
    const/4 v0, 0x0

    .line 28
    goto :goto_0
.end method

.method public e()LV2/j;
    .locals 1

    .line 1
    iget-object v0, p0, LH3/s;->i:LH3/q;

    .line 2
    .line 3
    invoke-virtual {v0}, LH3/q;->o()LV2/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public f()LV2/j;
    .locals 1

    .line 1
    iget-object v0, p0, LH3/s;->i:LH3/q;

    .line 2
    .line 3
    invoke-virtual {v0}, LH3/q;->t()LV2/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LH3/s;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public h()Z
    .locals 1

    .line 1
    iget-object v0, p0, LH3/s;->f:LH3/t;

    .line 2
    .line 3
    invoke-virtual {v0}, LH3/t;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final i(LO3/i;)LV2/j;
    .locals 3

    .line 1
    const-string v0, "Collection of crash reports disabled in Crashlytics settings."

    .line 2
    .line 3
    invoke-virtual {p0}, LH3/s;->r()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, LH3/s;->l:LG3/b;

    .line 7
    .line 8
    new-instance v2, LH3/r;

    .line 9
    .line 10
    invoke-direct {v2, p0}, LH3/r;-><init>(LH3/s;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, LG3/b;->a(LG3/a;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, LH3/s;->i:LH3/q;

    .line 17
    .line 18
    invoke-virtual {v1}, LH3/q;->V()V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, LO3/i;->b()LO3/d;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v1, v1, LO3/d;->b:LO3/d$a;

    .line 26
    .line 27
    iget-boolean v1, v1, LO3/d$a;->a:Z

    .line 28
    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    invoke-static {}, LE3/f;->f()LE3/f;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1, v0}, LE3/f;->b(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance p1, Ljava/lang/RuntimeException;

    .line 39
    .line 40
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, LV2/m;->d(Ljava/lang/Exception;)LV2/j;

    .line 44
    .line 45
    .line 46
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    invoke-virtual {p0}, LH3/s;->q()V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_1

    .line 53
    :catch_0
    move-exception p1

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    :try_start_1
    iget-object v0, p0, LH3/s;->i:LH3/q;

    .line 56
    .line 57
    invoke-virtual {v0, p1}, LH3/q;->B(LO3/i;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_1

    .line 62
    .line 63
    invoke-static {}, LE3/f;->f()LE3/f;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const-string v1, "Previous sessions could not be finalized."

    .line 68
    .line 69
    invoke-virtual {v0, v1}, LE3/f;->k(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    iget-object v0, p0, LH3/s;->i:LH3/q;

    .line 73
    .line 74
    invoke-interface {p1}, LO3/i;->a()LV2/j;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {v0, p1}, LH3/q;->a0(LV2/j;)LV2/j;

    .line 79
    .line 80
    .line 81
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    invoke-virtual {p0}, LH3/s;->q()V

    .line 83
    .line 84
    .line 85
    return-object p1

    .line 86
    :goto_0
    :try_start_2
    invoke-static {}, LE3/f;->f()LE3/f;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const-string v1, "Crashlytics encountered a problem during asynchronous initialization."

    .line 91
    .line 92
    invoke-virtual {v0, v1, p1}, LE3/f;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    invoke-static {p1}, LV2/m;->d(Ljava/lang/Exception;)LV2/j;

    .line 96
    .line 97
    .line 98
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 99
    invoke-virtual {p0}, LH3/s;->q()V

    .line 100
    .line 101
    .line 102
    return-object p1

    .line 103
    :goto_1
    invoke-virtual {p0}, LH3/s;->q()V

    .line 104
    .line 105
    .line 106
    throw p1
.end method

.method public j(LO3/i;)LV2/j;
    .locals 2

    .line 1
    iget-object v0, p0, LH3/s;->n:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, LH3/s$a;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, LH3/s$a;-><init>(LH3/s;LO3/i;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, LH3/c0;->h(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)LV2/j;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final k(LO3/i;)V
    .locals 3

    .line 1
    new-instance v0, LH3/s$b;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LH3/s$b;-><init>(LH3/s;LO3/i;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LH3/s;->n:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {}, LE3/f;->f()LE3/f;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously."

    .line 17
    .line 18
    invoke-virtual {v0, v1}, LE3/f;->b(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 22
    .line 23
    const-wide/16 v1, 0x3

    .line 24
    .line 25
    invoke-interface {p1, v1, v2, v0}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    goto :goto_4

    .line 29
    :catch_0
    move-exception p1

    .line 30
    goto :goto_0

    .line 31
    :catch_1
    move-exception p1

    .line 32
    goto :goto_2

    .line 33
    :catch_2
    move-exception p1

    .line 34
    goto :goto_3

    .line 35
    :goto_0
    invoke-static {}, LE3/f;->f()LE3/f;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "Crashlytics timed out during initialization."

    .line 40
    .line 41
    :goto_1
    invoke-virtual {v0, v1, p1}, LE3/f;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    goto :goto_4

    .line 45
    :goto_2
    invoke-static {}, LE3/f;->f()LE3/f;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v1, "Crashlytics encountered a problem during initialization."

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :goto_3
    invoke-static {}, LE3/f;->f()LE3/f;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v1, "Crashlytics was interrupted during initialization."

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :goto_4
    return-void
.end method

.method public n(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, LH3/s;->e:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    iget-object v2, p0, LH3/s;->i:LH3/q;

    .line 9
    .line 10
    invoke-virtual {v2, v0, v1, p1}, LH3/q;->e0(JLjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public o(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, LH3/s;->i:LH3/q;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1, p1}, LH3/q;->d0(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public p(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    invoke-static {}, LE3/f;->f()LE3/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "Recorded on-demand fatal events: "

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, LH3/s;->d:LH3/H;

    .line 16
    .line 17
    invoke-virtual {v2}, LH3/H;->b()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, LE3/f;->b(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {}, LE3/f;->f()LE3/f;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v2, "Dropped on-demand fatal events: "

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, LH3/s;->d:LH3/H;

    .line 46
    .line 47
    invoke-virtual {v2}, LH3/H;->a()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, v1}, LE3/f;->b(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, LH3/s;->i:LH3/q;

    .line 62
    .line 63
    iget-object v1, p0, LH3/s;->d:LH3/H;

    .line 64
    .line 65
    invoke-virtual {v1}, LH3/H;->b()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    const-string v2, "com.crashlytics.on-demand.recorded-exceptions"

    .line 74
    .line 75
    invoke-virtual {v0, v2, v1}, LH3/q;->Y(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, LH3/s;->i:LH3/q;

    .line 79
    .line 80
    iget-object v1, p0, LH3/s;->d:LH3/H;

    .line 81
    .line 82
    invoke-virtual {v1}, LH3/H;->a()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const-string v2, "com.crashlytics.on-demand.dropped-exceptions"

    .line 91
    .line 92
    invoke-virtual {v0, v2, v1}, LH3/q;->Y(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, LH3/s;->i:LH3/q;

    .line 96
    .line 97
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v0, v1, p1}, LH3/q;->Q(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public q()V
    .locals 2

    .line 1
    iget-object v0, p0, LH3/s;->o:LH3/n;

    .line 2
    .line 3
    new-instance v1, LH3/s$c;

    .line 4
    .line 5
    invoke-direct {v1, p0}, LH3/s$c;-><init>(LH3/s;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, LH3/n;->h(Ljava/util/concurrent/Callable;)LV2/j;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public r()V
    .locals 2

    .line 1
    iget-object v0, p0, LH3/s;->o:LH3/n;

    .line 2
    .line 3
    invoke-virtual {v0}, LH3/n;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LH3/s;->f:LH3/t;

    .line 7
    .line 8
    invoke-virtual {v0}, LH3/t;->a()Z

    .line 9
    .line 10
    .line 11
    invoke-static {}, LE3/f;->f()LE3/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "Initialization marker file was created."

    .line 16
    .line 17
    invoke-virtual {v0, v1}, LE3/f;->i(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public s(LH3/a;LO3/i;)Z
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    iget-object v2, v1, LH3/s;->a:Landroid/content/Context;

    .line 6
    .line 7
    const-string v3, "com.crashlytics.RequireBuildId"

    .line 8
    .line 9
    const/4 v12, 0x1

    .line 10
    invoke-static {v2, v3, v12}, LH3/i;->j(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    move-object/from16 v15, p1

    .line 15
    .line 16
    iget-object v3, v15, LH3/a;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v3, v2}, LH3/s;->m(Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    new-instance v2, LH3/h;

    .line 25
    .line 26
    iget-object v3, v1, LH3/s;->j:LH3/C;

    .line 27
    .line 28
    invoke-direct {v2, v3}, LH3/h;-><init>(LH3/C;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, LH3/h;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v14

    .line 35
    const/16 v27, 0x0

    .line 36
    .line 37
    :try_start_0
    new-instance v2, LH3/t;

    .line 38
    .line 39
    const-string v3, "crash_marker"

    .line 40
    .line 41
    iget-object v4, v1, LH3/s;->k:LM3/g;

    .line 42
    .line 43
    invoke-direct {v2, v3, v4}, LH3/t;-><init>(Ljava/lang/String;LM3/g;)V

    .line 44
    .line 45
    .line 46
    iput-object v2, v1, LH3/s;->g:LH3/t;

    .line 47
    .line 48
    new-instance v2, LH3/t;

    .line 49
    .line 50
    const-string v3, "initialization_marker"

    .line 51
    .line 52
    iget-object v4, v1, LH3/s;->k:LM3/g;

    .line 53
    .line 54
    invoke-direct {v2, v3, v4}, LH3/t;-><init>(Ljava/lang/String;LM3/g;)V

    .line 55
    .line 56
    .line 57
    iput-object v2, v1, LH3/s;->f:LH3/t;

    .line 58
    .line 59
    new-instance v13, LI3/i;

    .line 60
    .line 61
    iget-object v2, v1, LH3/s;->k:LM3/g;

    .line 62
    .line 63
    iget-object v3, v1, LH3/s;->o:LH3/n;

    .line 64
    .line 65
    invoke-direct {v13, v14, v2, v3}, LI3/i;-><init>(Ljava/lang/String;LM3/g;LH3/n;)V

    .line 66
    .line 67
    .line 68
    new-instance v11, LI3/c;

    .line 69
    .line 70
    iget-object v2, v1, LH3/s;->k:LM3/g;

    .line 71
    .line 72
    invoke-direct {v11, v2}, LI3/c;-><init>(LM3/g;)V

    .line 73
    .line 74
    .line 75
    new-instance v8, LP3/a;

    .line 76
    .line 77
    new-array v2, v12, [LP3/d;

    .line 78
    .line 79
    new-instance v3, LP3/c;

    .line 80
    .line 81
    const/16 v4, 0xa

    .line 82
    .line 83
    invoke-direct {v3, v4}, LP3/c;-><init>(I)V

    .line 84
    .line 85
    .line 86
    aput-object v3, v2, v27

    .line 87
    .line 88
    const/16 v3, 0x400

    .line 89
    .line 90
    invoke-direct {v8, v3, v2}, LP3/a;-><init>(I[LP3/d;)V

    .line 91
    .line 92
    .line 93
    iget-object v2, v1, LH3/s;->a:Landroid/content/Context;

    .line 94
    .line 95
    iget-object v3, v1, LH3/s;->j:LH3/C;

    .line 96
    .line 97
    iget-object v4, v1, LH3/s;->k:LM3/g;

    .line 98
    .line 99
    iget-object v10, v1, LH3/s;->d:LH3/H;

    .line 100
    .line 101
    iget-object v9, v1, LH3/s;->p:LH3/m;

    .line 102
    .line 103
    move-object/from16 v5, p1

    .line 104
    .line 105
    move-object v6, v11

    .line 106
    move-object v7, v13

    .line 107
    move-object/from16 v16, v9

    .line 108
    .line 109
    move-object/from16 v9, p2

    .line 110
    .line 111
    move-object/from16 v22, v11

    .line 112
    .line 113
    move-object/from16 v11, v16

    .line 114
    .line 115
    invoke-static/range {v2 .. v11}, LH3/V;->g(Landroid/content/Context;LH3/C;LM3/g;LH3/a;LI3/c;LI3/i;LP3/d;LO3/i;LH3/H;LH3/m;)LH3/V;

    .line 116
    .line 117
    .line 118
    move-result-object v23

    .line 119
    new-instance v2, LH3/q;

    .line 120
    .line 121
    iget-object v3, v1, LH3/s;->a:Landroid/content/Context;

    .line 122
    .line 123
    iget-object v4, v1, LH3/s;->o:LH3/n;

    .line 124
    .line 125
    iget-object v5, v1, LH3/s;->j:LH3/C;

    .line 126
    .line 127
    iget-object v6, v1, LH3/s;->c:LH3/y;

    .line 128
    .line 129
    iget-object v7, v1, LH3/s;->k:LM3/g;

    .line 130
    .line 131
    iget-object v8, v1, LH3/s;->g:LH3/t;

    .line 132
    .line 133
    iget-object v9, v1, LH3/s;->q:LE3/a;

    .line 134
    .line 135
    iget-object v10, v1, LH3/s;->m:LF3/a;

    .line 136
    .line 137
    iget-object v11, v1, LH3/s;->p:LH3/m;

    .line 138
    .line 139
    move-object/from16 v21, v13

    .line 140
    .line 141
    move-object v13, v2

    .line 142
    move-object v12, v14

    .line 143
    move-object v14, v3

    .line 144
    move-object v15, v4

    .line 145
    move-object/from16 v16, v5

    .line 146
    .line 147
    move-object/from16 v17, v6

    .line 148
    .line 149
    move-object/from16 v18, v7

    .line 150
    .line 151
    move-object/from16 v19, v8

    .line 152
    .line 153
    move-object/from16 v20, p1

    .line 154
    .line 155
    move-object/from16 v24, v9

    .line 156
    .line 157
    move-object/from16 v25, v10

    .line 158
    .line 159
    move-object/from16 v26, v11

    .line 160
    .line 161
    invoke-direct/range {v13 .. v26}, LH3/q;-><init>(Landroid/content/Context;LH3/n;LH3/C;LH3/y;LM3/g;LH3/t;LH3/a;LI3/i;LI3/c;LH3/V;LE3/a;LF3/a;LH3/m;)V

    .line 162
    .line 163
    .line 164
    iput-object v2, v1, LH3/s;->i:LH3/q;

    .line 165
    .line 166
    invoke-virtual/range {p0 .. p0}, LH3/s;->h()Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    invoke-virtual/range {p0 .. p0}, LH3/s;->d()V

    .line 171
    .line 172
    .line 173
    iget-object v3, v1, LH3/s;->i:LH3/q;

    .line 174
    .line 175
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    invoke-virtual {v3, v12, v4, v0}, LH3/q;->z(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;LO3/i;)V

    .line 180
    .line 181
    .line 182
    if-eqz v2, :cond_0

    .line 183
    .line 184
    iget-object v2, v1, LH3/s;->a:Landroid/content/Context;

    .line 185
    .line 186
    invoke-static {v2}, LH3/i;->d(Landroid/content/Context;)Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-eqz v2, :cond_0

    .line 191
    .line 192
    invoke-static {}, LE3/f;->f()LE3/f;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    const-string v3, "Crashlytics did not finish previous background initialization. Initializing synchronously."

    .line 197
    .line 198
    invoke-virtual {v2, v3}, LE3/f;->b(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1, v0}, LH3/s;->k(LO3/i;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 202
    .line 203
    .line 204
    return v27

    .line 205
    :catch_0
    move-exception v0

    .line 206
    goto :goto_0

    .line 207
    :cond_0
    invoke-static {}, LE3/f;->f()LE3/f;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    const-string v2, "Successfully configured exception handler."

    .line 212
    .line 213
    invoke-virtual {v0, v2}, LE3/f;->b(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    const/4 v0, 0x1

    .line 217
    return v0

    .line 218
    :goto_0
    invoke-static {}, LE3/f;->f()LE3/f;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    const-string v3, "Crashlytics was not started due to an exception during initialization"

    .line 223
    .line 224
    invoke-virtual {v2, v3, v0}, LE3/f;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 225
    .line 226
    .line 227
    const/4 v0, 0x0

    .line 228
    iput-object v0, v1, LH3/s;->i:LH3/q;

    .line 229
    .line 230
    return v27

    .line 231
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 232
    .line 233
    const-string v2, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app\'s build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin"

    .line 234
    .line 235
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    throw v0
.end method

.method public t()LV2/j;
    .locals 1

    .line 1
    iget-object v0, p0, LH3/s;->i:LH3/q;

    .line 2
    .line 3
    invoke-virtual {v0}, LH3/q;->W()LV2/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public u(Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    iget-object v0, p0, LH3/s;->c:LH3/y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LH3/y;->h(Ljava/lang/Boolean;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, LH3/s;->i:LH3/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LH3/q;->X(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, LH3/s;->i:LH3/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LH3/q;->Y(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public x(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, LH3/s;->i:LH3/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LH3/q;->Z(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
