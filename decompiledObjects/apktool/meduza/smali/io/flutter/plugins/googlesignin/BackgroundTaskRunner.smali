.class public final Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;
    }
.end annotation


# instance fields
.field private final executor:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method public constructor <init>(I)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v7, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1

    move-object v0, v7

    move v1, p1

    move v2, p1

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v7, p0, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;->executor:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public static synthetic a(Ls7/f;Ljava/util/concurrent/Callable;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;->lambda$runInBackground$1(Ls7/f;Ljava/util/concurrent/Callable;)V

    return-void
.end method

.method public static synthetic b(Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;Ls7/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;->lambda$runInBackground$0(Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;Ls7/e;)V

    return-void
.end method

.method private static synthetic lambda$runInBackground$0(Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;Ls7/e;)V
    .locals 0

    invoke-interface {p0, p1}, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;->run(Ljava/util/concurrent/Future;)V

    return-void
.end method

.method private static lambda$runInBackground$1(Ls7/f;Ljava/util/concurrent/Callable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ls7/a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, v0, Ls7/a$b;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    sget-object p1, Ls7/a;->o:Ljava/lang/Object;

    .line 15
    .line 16
    :cond_0
    sget-object v1, Ls7/a;->f:Ls7/a$a;

    .line 17
    .line 18
    invoke-virtual {v1, p0, v0, p1}, Ls7/a$a;->b(Ls7/a;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-static {p0}, Ls7/a;->d(Ls7/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    new-instance v1, Ls7/a$c;

    .line 30
    .line 31
    invoke-direct {v1, p1}, Ls7/a$c;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    sget-object p1, Ls7/a;->f:Ls7/a$a;

    .line 35
    .line 36
    invoke-virtual {p1, p0, v0, v1}, Ls7/a$a;->b(Ls7/a;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-static {p0}, Ls7/a;->d(Ls7/a;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    :goto_0
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method


# virtual methods
.method public runInBackground(Ljava/util/concurrent/Callable;)Ls7/e;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Ls7/e<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ls7/f;

    .line 2
    .line 3
    invoke-direct {v0}, Ls7/f;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;->executor:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 7
    .line 8
    new-instance v2, Lio/flutter/plugins/firebase/messaging/f;

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    invoke-direct {v2, v3, v0, p1}, Lio/flutter/plugins/firebase/messaging/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public runInBackground(Ljava/util/concurrent/Callable;Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;",
            "Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback<",
            "TT;>;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;->runInBackground(Ljava/util/concurrent/Callable;)Ls7/e;

    move-result-object p1

    new-instance v0, Lio/flutter/plugins/googlesignin/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p2, p1}, Lio/flutter/plugins/googlesignin/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lio/flutter/plugins/googlesignin/Executors;->uiThreadExecutor()Ljava/util/concurrent/Executor;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Ls7/e;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method
