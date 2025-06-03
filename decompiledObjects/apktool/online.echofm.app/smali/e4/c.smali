.class public Le4/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le4/c$d;
    }
.end annotation


# static fields
.field public static final l:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final m:Ljava/nio/charset/Charset;

.field public static n:Ljava/util/concurrent/ThreadFactory;

.field public static o:Le4/b;


# instance fields
.field public volatile a:Le4/c$d;

.field public volatile b:Ljava/net/Socket;

.field public c:Le4/d;

.field public final d:Ljava/net/URI;

.field public final e:Ljava/lang/String;

.field public final f:Le4/h;

.field public final g:Le4/i;

.field public final h:Le4/f;

.field public final i:Lc4/c;

.field public final j:I

.field public final k:Ljava/lang/Thread;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Le4/c;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    const-string v0, "UTF-8"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Le4/c;->m:Ljava/nio/charset/Charset;

    .line 16
    .line 17
    invoke-static {}, Ljava/util/concurrent/Executors;->defaultThreadFactory()Ljava/util/concurrent/ThreadFactory;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Le4/c;->n:Ljava/util/concurrent/ThreadFactory;

    .line 22
    .line 23
    new-instance v0, Le4/c$a;

    .line 24
    .line 25
    invoke-direct {v0}, Le4/c$a;-><init>()V

    .line 26
    .line 27
    .line 28
    sput-object v0, Le4/c;->o:Le4/b;

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>(LT3/c;Ljava/net/URI;Ljava/lang/String;Ljava/util/Map;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Le4/c$d;->o:Le4/c$d;

    .line 5
    .line 6
    iput-object v0, p0, Le4/c;->a:Le4/c$d;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Le4/c;->b:Ljava/net/Socket;

    .line 10
    .line 11
    iput-object v0, p0, Le4/c;->c:Le4/d;

    .line 12
    .line 13
    sget-object v0, Le4/c;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput v0, p0, Le4/c;->j:I

    .line 20
    .line 21
    invoke-static {}, Le4/c;->j()Ljava/util/concurrent/ThreadFactory;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v2, Le4/c$b;

    .line 26
    .line 27
    invoke-direct {v2, p0}, Le4/c$b;-><init>(Le4/c;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v1, v2}, Ljava/util/concurrent/ThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, p0, Le4/c;->k:Ljava/lang/Thread;

    .line 35
    .line 36
    iput-object p2, p0, Le4/c;->d:Ljava/net/URI;

    .line 37
    .line 38
    invoke-virtual {p1}, LT3/c;->g()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iput-object v1, p0, Le4/c;->e:Ljava/lang/String;

    .line 43
    .line 44
    new-instance v1, Lc4/c;

    .line 45
    .line 46
    invoke-virtual {p1}, LT3/c;->f()Lc4/d;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance v2, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v3, "sk_"

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const-string v3, "WebSocket"

    .line 68
    .line 69
    invoke-direct {v1, p1, v3, v2}, Lc4/c;-><init>(Lc4/d;Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iput-object v1, p0, Le4/c;->i:Lc4/c;

    .line 73
    .line 74
    new-instance p1, Le4/f;

    .line 75
    .line 76
    invoke-direct {p1, p2, p3, p4}, Le4/f;-><init>(Ljava/net/URI;Ljava/lang/String;Ljava/util/Map;)V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, Le4/c;->h:Le4/f;

    .line 80
    .line 81
    new-instance p1, Le4/h;

    .line 82
    .line 83
    invoke-direct {p1, p0}, Le4/h;-><init>(Le4/c;)V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, Le4/c;->f:Le4/h;

    .line 87
    .line 88
    new-instance p1, Le4/i;

    .line 89
    .line 90
    const-string p2, "TubeSock"

    .line 91
    .line 92
    invoke-direct {p1, p0, p2, v0}, Le4/i;-><init>(Le4/c;Ljava/lang/String;I)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, Le4/c;->g:Le4/i;

    .line 96
    .line 97
    return-void
.end method

.method public static synthetic a(Le4/c;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Le4/c;->n()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static i()Le4/b;
    .locals 1

    .line 1
    sget-object v0, Le4/c;->o:Le4/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public static j()Ljava/util/concurrent/ThreadFactory;
    .locals 1

    .line 1
    sget-object v0, Le4/c;->n:Ljava/util/concurrent/ThreadFactory;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Le4/c;->g:Le4/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Le4/i;->d()Ljava/lang/Thread;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Ljava/lang/Thread$State;->NEW:Ljava/lang/Thread$State;

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Le4/c;->g:Le4/i;

    .line 16
    .line 17
    invoke-virtual {v0}, Le4/i;->d()Ljava/lang/Thread;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, Le4/c;->h()Ljava/lang/Thread;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public declared-synchronized c()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Le4/c$c;->a:[I

    .line 3
    .line 4
    iget-object v1, p0, Le4/c;->a:Le4/c$d;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    aget v0, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-eq v0, v1, :cond_3

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    if-eq v0, v1, :cond_1

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x5

    .line 25
    monitor-exit p0

    .line 26
    return-void

    .line 27
    :cond_0
    monitor-exit p0

    .line 28
    return-void

    .line 29
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Le4/c;->q()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    .line 31
    .line 32
    monitor-exit p0

    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    :try_start_2
    invoke-virtual {p0}, Le4/c;->d()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 37
    .line 38
    .line 39
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :cond_3
    :try_start_3
    sget-object v0, Le4/c$d;->s:Le4/c$d;

    .line 42
    .line 43
    iput-object v0, p0, Le4/c;->a:Le4/c$d;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 44
    .line 45
    monitor-exit p0

    .line 46
    return-void

    .line 47
    :goto_0
    monitor-exit p0

    .line 48
    throw v0
.end method

.method public final declared-synchronized d()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Le4/c;->a:Le4/c$d;

    .line 3
    .line 4
    sget-object v1, Le4/c$d;->s:Le4/c$d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    iget-object v0, p0, Le4/c;->f:Le4/h;

    .line 11
    .line 12
    invoke-virtual {v0}, Le4/h;->h()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Le4/c;->g:Le4/i;

    .line 16
    .line 17
    invoke-virtual {v0}, Le4/i;->i()V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Le4/c;->b:Ljava/net/Socket;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    :try_start_2
    iget-object v0, p0, Le4/c;->b:Ljava/net/Socket;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto :goto_1

    .line 32
    :catch_0
    move-exception v0

    .line 33
    :try_start_3
    iget-object v1, p0, Le4/c;->c:Le4/d;

    .line 34
    .line 35
    new-instance v2, Le4/e;

    .line 36
    .line 37
    const-string v3, "Failed to close"

    .line 38
    .line 39
    invoke-direct {v2, v3, v0}, Le4/e;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v1, v2}, Le4/d;->d(Le4/e;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    :goto_0
    sget-object v0, Le4/c$d;->s:Le4/c$d;

    .line 46
    .line 47
    iput-object v0, p0, Le4/c;->a:Le4/c$d;

    .line 48
    .line 49
    iget-object v0, p0, Le4/c;->c:Le4/d;

    .line 50
    .line 51
    invoke-interface {v0}, Le4/d;->b()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 52
    .line 53
    .line 54
    monitor-exit p0

    .line 55
    return-void

    .line 56
    :goto_1
    monitor-exit p0

    .line 57
    throw v0
.end method

.method public declared-synchronized e()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Le4/c;->a:Le4/c$d;

    .line 3
    .line 4
    sget-object v1, Le4/c$d;->o:Le4/c$d;

    .line 5
    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Le4/c;->c:Le4/d;

    .line 9
    .line 10
    new-instance v1, Le4/e;

    .line 11
    .line 12
    const-string v2, "connect() already called"

    .line 13
    .line 14
    invoke-direct {v1, v2}, Le4/e;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Le4/d;->d(Le4/e;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Le4/c;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    :try_start_1
    invoke-static {}, Le4/c;->i()Le4/b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0}, Le4/c;->h()Ljava/lang/Thread;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v3, "TubeSockReader-"

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget v3, p0, Le4/c;->j:I

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-interface {v0, v1, v2}, Le4/b;->a(Ljava/lang/Thread;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    sget-object v0, Le4/c$d;->p:Le4/c$d;

    .line 58
    .line 59
    iput-object v0, p0, Le4/c;->a:Le4/c$d;

    .line 60
    .line 61
    invoke-virtual {p0}, Le4/c;->h()Ljava/lang/Thread;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    .line 68
    monitor-exit p0

    .line 69
    return-void

    .line 70
    :goto_0
    monitor-exit p0

    .line 71
    throw v0
.end method

.method public final f()Ljava/net/Socket;
    .locals 8

    .line 1
    iget-object v0, p0, Le4/c;->d:Ljava/net/URI;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Le4/c;->d:Ljava/net/URI;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Le4/c;->d:Ljava/net/URI;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/net/URI;->getPort()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const-string v3, "unknown host: "

    .line 20
    .line 21
    const/4 v4, -0x1

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const-string v5, "ws"

    .line 25
    .line 26
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_1

    .line 31
    .line 32
    if-ne v2, v4, :cond_0

    .line 33
    .line 34
    const/16 v2, 0x50

    .line 35
    .line 36
    :cond_0
    :try_start_0
    new-instance v0, Ljava/net/Socket;

    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Ljava/net/Socket;-><init>(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    goto/16 :goto_3

    .line 42
    .line 43
    :catch_0
    move-exception v0

    .line 44
    goto :goto_0

    .line 45
    :catch_1
    move-exception v0

    .line 46
    goto :goto_1

    .line 47
    :goto_0
    new-instance v1, Le4/e;

    .line 48
    .line 49
    new-instance v2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v3, "error while creating socket to "

    .line 55
    .line 56
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v3, p0, Le4/c;->d:Ljava/net/URI;

    .line 60
    .line 61
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-direct {v1, v2, v0}, Le4/e;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    throw v1

    .line 72
    :goto_1
    new-instance v2, Le4/e;

    .line 73
    .line 74
    new-instance v4, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-direct {v2, v1, v0}, Le4/e;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    throw v2

    .line 93
    :cond_1
    if-eqz v0, :cond_5

    .line 94
    .line 95
    const-string v5, "wss"

    .line 96
    .line 97
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-eqz v5, :cond_5

    .line 102
    .line 103
    if-ne v2, v4, :cond_2

    .line 104
    .line 105
    const/16 v2, 0x1bb

    .line 106
    .line 107
    :cond_2
    const/4 v0, 0x0

    .line 108
    :try_start_1
    iget-object v4, p0, Le4/c;->e:Ljava/lang/String;

    .line 109
    .line 110
    if-eqz v4, :cond_3

    .line 111
    .line 112
    new-instance v4, Landroid/net/SSLSessionCache;

    .line 113
    .line 114
    new-instance v5, Ljava/io/File;

    .line 115
    .line 116
    iget-object v6, p0, Le4/c;->e:Ljava/lang/String;

    .line 117
    .line 118
    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-direct {v4, v5}, Landroid/net/SSLSessionCache;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 122
    .line 123
    .line 124
    move-object v0, v4

    .line 125
    goto :goto_2

    .line 126
    :catch_2
    move-exception v4

    .line 127
    iget-object v5, p0, Le4/c;->i:Lc4/c;

    .line 128
    .line 129
    const/4 v6, 0x0

    .line 130
    new-array v6, v6, [Ljava/lang/Object;

    .line 131
    .line 132
    const-string v7, "Failed to initialize SSL session cache"

    .line 133
    .line 134
    invoke-virtual {v5, v7, v4, v6}, Lc4/c;->a(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :cond_3
    :goto_2
    const v4, 0xea60

    .line 138
    .line 139
    .line 140
    :try_start_2
    invoke-static {v4, v0}, Landroid/net/SSLCertificateSocketFactory;->getDefault(ILandroid/net/SSLSessionCache;)Ljavax/net/ssl/SSLSocketFactory;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0, v1, v2}, Ljavax/net/SocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, Ljavax/net/ssl/SSLSocket;

    .line 149
    .line 150
    invoke-static {}, Ljavax/net/ssl/HttpsURLConnection;->getDefaultHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-interface {v2, v1, v4}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-eqz v2, :cond_4

    .line 163
    .line 164
    :goto_3
    return-object v0

    .line 165
    :cond_4
    new-instance v0, Le4/e;

    .line 166
    .line 167
    new-instance v2, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 170
    .line 171
    .line 172
    const-string v4, "Error while verifying secure socket to "

    .line 173
    .line 174
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    iget-object v4, p0, Le4/c;->d:Ljava/net/URI;

    .line 178
    .line 179
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-direct {v0, v2}, Le4/e;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw v0
    :try_end_2
    .catch Ljava/net/UnknownHostException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    .line 190
    :catch_3
    move-exception v0

    .line 191
    goto :goto_4

    .line 192
    :catch_4
    move-exception v0

    .line 193
    goto :goto_5

    .line 194
    :goto_4
    new-instance v1, Le4/e;

    .line 195
    .line 196
    new-instance v2, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 199
    .line 200
    .line 201
    const-string v3, "error while creating secure socket to "

    .line 202
    .line 203
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    iget-object v3, p0, Le4/c;->d:Ljava/net/URI;

    .line 207
    .line 208
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-direct {v1, v2, v0}, Le4/e;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 216
    .line 217
    .line 218
    throw v1

    .line 219
    :goto_5
    new-instance v2, Le4/e;

    .line 220
    .line 221
    new-instance v4, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-direct {v2, v1, v0}, Le4/e;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 237
    .line 238
    .line 239
    throw v2

    .line 240
    :cond_5
    new-instance v1, Le4/e;

    .line 241
    .line 242
    new-instance v2, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 245
    .line 246
    .line 247
    const-string v3, "unsupported protocol: "

    .line 248
    .line 249
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-direct {v1, v0}, Le4/e;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw v1
.end method

.method public g()Le4/d;
    .locals 1

    .line 1
    iget-object v0, p0, Le4/c;->c:Le4/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Ljava/lang/Thread;
    .locals 1

    .line 1
    iget-object v0, p0, Le4/c;->k:Ljava/lang/Thread;

    .line 2
    .line 3
    return-object v0
.end method

.method public k(Le4/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le4/c;->c:Le4/d;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Le4/d;->d(Le4/e;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Le4/c;->a:Le4/c$d;

    .line 7
    .line 8
    sget-object v0, Le4/c$d;->q:Le4/c$d;

    .line 9
    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Le4/c;->c()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Le4/c;->d()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public l()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Le4/c;->d()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public declared-synchronized m([B)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/16 v0, 0xa

    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0, v0, p1}, Le4/c;->o(B[B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    monitor-exit p0

    .line 11
    throw p1
.end method

.method public final n()V
    .locals 12

    .line 1
    :try_start_0
    invoke-virtual {p0}, Le4/c;->f()Ljava/net/Socket;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    monitor-enter p0
    :try_end_0
    .catch Le4/e; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    :try_start_1
    iput-object v0, p0, Le4/c;->b:Ljava/net/Socket;

    .line 7
    .line 8
    iget-object v1, p0, Le4/c;->a:Le4/c$d;

    .line 9
    .line 10
    sget-object v2, Le4/c$d;->s:Le4/c$d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    :try_start_2
    iget-object v0, p0, Le4/c;->b:Ljava/net/Socket;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    :try_start_3
    iput-object v0, p0, Le4/c;->b:Ljava/net/Socket;

    .line 21
    .line 22
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 23
    invoke-virtual {p0}, Le4/c;->c()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :catch_0
    move-exception v0

    .line 31
    :try_start_4
    new-instance v1, Ljava/lang/RuntimeException;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_0
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 38
    :try_start_5
    new-instance v1, Ljava/io/DataInputStream;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-direct {v1, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v2, p0, Le4/c;->h:Le4/f;

    .line 52
    .line 53
    invoke-virtual {v2}, Le4/f;->c()[B

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write([B)V

    .line 58
    .line 59
    .line 60
    const/16 v2, 0x3e8

    .line 61
    .line 62
    new-array v3, v2, [B

    .line 63
    .line 64
    new-instance v4, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    move v6, v5

    .line 71
    move v7, v6

    .line 72
    :goto_0
    const/4 v8, 0x1

    .line 73
    if-nez v6, :cond_5

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    const/4 v10, -0x1

    .line 80
    if-eq v9, v10, :cond_4

    .line 81
    .line 82
    int-to-byte v9, v9

    .line 83
    aput-byte v9, v3, v7

    .line 84
    .line 85
    add-int/lit8 v9, v7, 0x1

    .line 86
    .line 87
    aget-byte v10, v3, v7

    .line 88
    .line 89
    const/16 v11, 0xa

    .line 90
    .line 91
    if-ne v10, v11, :cond_2

    .line 92
    .line 93
    add-int/lit8 v7, v7, -0x1

    .line 94
    .line 95
    aget-byte v7, v3, v7

    .line 96
    .line 97
    const/16 v10, 0xd

    .line 98
    .line 99
    if-ne v7, v10, :cond_2

    .line 100
    .line 101
    new-instance v7, Ljava/lang/String;

    .line 102
    .line 103
    sget-object v9, Le4/c;->m:Ljava/nio/charset/Charset;

    .line 104
    .line 105
    invoke-direct {v7, v3, v9}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    const-string v9, ""

    .line 113
    .line 114
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-eqz v3, :cond_1

    .line 119
    .line 120
    move v6, v8

    .line 121
    goto :goto_1

    .line 122
    :cond_1
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    :goto_1
    new-array v3, v2, [B

    .line 130
    .line 131
    move v7, v5

    .line 132
    goto :goto_0

    .line 133
    :catchall_1
    move-exception v0

    .line 134
    goto/16 :goto_5

    .line 135
    .line 136
    :catch_1
    move-exception v0

    .line 137
    goto/16 :goto_6

    .line 138
    .line 139
    :cond_2
    if-eq v9, v2, :cond_3

    .line 140
    .line 141
    move v7, v9

    .line 142
    goto :goto_0

    .line 143
    :cond_3
    new-instance v0, Ljava/lang/String;

    .line 144
    .line 145
    sget-object v1, Le4/c;->m:Ljava/nio/charset/Charset;

    .line 146
    .line 147
    invoke-direct {v0, v3, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 148
    .line 149
    .line 150
    new-instance v1, Le4/e;

    .line 151
    .line 152
    new-instance v2, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    const-string v3, "Unexpected long line in handshake: "

    .line 158
    .line 159
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-direct {v1, v0}, Le4/e;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v1

    .line 173
    :cond_4
    new-instance v0, Le4/e;

    .line 174
    .line 175
    const-string v1, "Connection closed before handshake was complete"

    .line 176
    .line 177
    invoke-direct {v0, v1}, Le4/e;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw v0

    .line 181
    :cond_5
    iget-object v2, p0, Le4/c;->h:Le4/f;

    .line 182
    .line 183
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    check-cast v3, Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {v2, v3}, Le4/f;->f(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    new-instance v2, Ljava/util/HashMap;

    .line 196
    .line 197
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-eqz v4, :cond_6

    .line 209
    .line 210
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    check-cast v4, Ljava/lang/String;

    .line 215
    .line 216
    const-string v6, ": "

    .line 217
    .line 218
    const/4 v7, 0x2

    .line 219
    invoke-virtual {v4, v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    aget-object v6, v4, v5

    .line 224
    .line 225
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 226
    .line 227
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    aget-object v4, v4, v8

    .line 232
    .line 233
    invoke-virtual {v4, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    invoke-virtual {v2, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    goto :goto_2

    .line 241
    :cond_6
    iget-object v3, p0, Le4/c;->h:Le4/f;

    .line 242
    .line 243
    invoke-virtual {v3, v2}, Le4/f;->e(Ljava/util/HashMap;)V

    .line 244
    .line 245
    .line 246
    iget-object v2, p0, Le4/c;->g:Le4/i;

    .line 247
    .line 248
    invoke-virtual {v2, v0}, Le4/i;->h(Ljava/io/OutputStream;)V

    .line 249
    .line 250
    .line 251
    iget-object v0, p0, Le4/c;->f:Le4/h;

    .line 252
    .line 253
    invoke-virtual {v0, v1}, Le4/h;->g(Ljava/io/DataInputStream;)V

    .line 254
    .line 255
    .line 256
    sget-object v0, Le4/c$d;->q:Le4/c$d;

    .line 257
    .line 258
    iput-object v0, p0, Le4/c;->a:Le4/c$d;

    .line 259
    .line 260
    iget-object v0, p0, Le4/c;->g:Le4/i;

    .line 261
    .line 262
    invoke-virtual {v0}, Le4/i;->d()Ljava/lang/Thread;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 267
    .line 268
    .line 269
    iget-object v0, p0, Le4/c;->c:Le4/d;

    .line 270
    .line 271
    invoke-interface {v0}, Le4/d;->c()V

    .line 272
    .line 273
    .line 274
    iget-object v0, p0, Le4/c;->f:Le4/h;

    .line 275
    .line 276
    invoke-virtual {v0}, Le4/h;->f()V
    :try_end_5
    .catch Le4/e; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 277
    .line 278
    .line 279
    :goto_3
    invoke-virtual {p0}, Le4/c;->c()V

    .line 280
    .line 281
    .line 282
    goto :goto_7

    .line 283
    :goto_4
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 284
    :try_start_7
    throw v0
    :try_end_7
    .catch Le4/e; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 285
    :goto_5
    :try_start_8
    iget-object v1, p0, Le4/c;->c:Le4/d;

    .line 286
    .line 287
    new-instance v2, Le4/e;

    .line 288
    .line 289
    new-instance v3, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 292
    .line 293
    .line 294
    const-string v4, "error while connecting: "

    .line 295
    .line 296
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    invoke-direct {v2, v3, v0}, Le4/e;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 311
    .line 312
    .line 313
    invoke-interface {v1, v2}, Le4/d;->d(Le4/e;)V

    .line 314
    .line 315
    .line 316
    goto :goto_3

    .line 317
    :catchall_2
    move-exception v0

    .line 318
    goto :goto_8

    .line 319
    :goto_6
    iget-object v1, p0, Le4/c;->c:Le4/d;

    .line 320
    .line 321
    invoke-interface {v1, v0}, Le4/d;->d(Le4/e;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 322
    .line 323
    .line 324
    goto :goto_3

    .line 325
    :goto_7
    return-void

    .line 326
    :goto_8
    invoke-virtual {p0}, Le4/c;->c()V

    .line 327
    .line 328
    .line 329
    throw v0
.end method

.method public final declared-synchronized o(B[B)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Le4/c;->a:Le4/c$d;

    .line 3
    .line 4
    sget-object v1, Le4/c$d;->q:Le4/c$d;

    .line 5
    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Le4/c;->c:Le4/d;

    .line 9
    .line 10
    new-instance p2, Le4/e;

    .line 11
    .line 12
    const-string v0, "error while sending data: not connected"

    .line 13
    .line 14
    invoke-direct {p2, v0}, Le4/e;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, p2}, Le4/d;->d(Le4/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :try_start_1
    iget-object v0, p0, Le4/c;->g:Le4/i;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-virtual {v0, p1, v1, p2}, Le4/i;->g(BZ[B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p1

    .line 31
    :try_start_2
    iget-object p2, p0, Le4/c;->c:Le4/d;

    .line 32
    .line 33
    new-instance v0, Le4/e;

    .line 34
    .line 35
    const-string v1, "Failed to send frame"

    .line 36
    .line 37
    invoke-direct {v0, v1, p1}, Le4/e;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p2, v0}, Le4/d;->d(Le4/e;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Le4/c;->c()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    .line 45
    .line 46
    :goto_0
    monitor-exit p0

    .line 47
    return-void

    .line 48
    :goto_1
    monitor-exit p0

    .line 49
    throw p1
.end method

.method public declared-synchronized p(Ljava/lang/String;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Le4/c;->m:Ljava/nio/charset/Charset;

    .line 3
    .line 4
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-virtual {p0, v0, p1}, Le4/c;->o(B[B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0

    .line 16
    throw p1
.end method

.method public final q()V
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Le4/c$d;->r:Le4/c$d;

    .line 2
    .line 3
    iput-object v0, p0, Le4/c;->a:Le4/c$d;

    .line 4
    .line 5
    iget-object v0, p0, Le4/c;->g:Le4/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Le4/i;->i()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Le4/c;->g:Le4/i;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    new-array v1, v1, [B

    .line 14
    .line 15
    const/16 v2, 0x8

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-virtual {v0, v2, v3, v1}, Le4/i;->g(BZ[B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception v0

    .line 23
    iget-object v1, p0, Le4/c;->c:Le4/d;

    .line 24
    .line 25
    new-instance v2, Le4/e;

    .line 26
    .line 27
    const-string v3, "Failed to send close frame"

    .line 28
    .line 29
    invoke-direct {v2, v3, v0}, Le4/e;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v1, v2}, Le4/d;->d(Le4/e;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    return-void
.end method

.method public r(Le4/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le4/c;->c:Le4/d;

    .line 2
    .line 3
    return-void
.end method
