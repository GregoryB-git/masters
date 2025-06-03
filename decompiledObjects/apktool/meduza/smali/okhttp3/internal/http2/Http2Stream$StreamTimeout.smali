.class Lokhttp3/internal/http2/Http2Stream$StreamTimeout;
.super Lxc/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http2/Http2Stream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "StreamTimeout"
.end annotation


# instance fields
.field public final synthetic m:Lokhttp3/internal/http2/Http2Stream;


# direct methods
.method public constructor <init>(Lokhttp3/internal/http2/Http2Stream;)V
    .locals 0

    iput-object p1, p0, Lokhttp3/internal/http2/Http2Stream$StreamTimeout;->m:Lokhttp3/internal/http2/Http2Stream;

    invoke-direct {p0}, Lxc/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    new-instance v0, Ljava/net/SocketTimeoutException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

.method public final k()V
    .locals 6

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/Http2Stream$StreamTimeout;->m:Lokhttp3/internal/http2/Http2Stream;

    .line 2
    .line 3
    sget-object v1, Lokhttp3/internal/http2/ErrorCode;->o:Lokhttp3/internal/http2/ErrorCode;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lokhttp3/internal/http2/Http2Stream;->d(Lokhttp3/internal/http2/ErrorCode;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v2, v0, Lokhttp3/internal/http2/Http2Stream;->d:Lokhttp3/internal/http2/Http2Connection;

    .line 13
    .line 14
    iget v0, v0, Lokhttp3/internal/http2/Http2Stream;->c:I

    .line 15
    .line 16
    invoke-virtual {v2, v0, v1}, Lokhttp3/internal/http2/Http2Connection;->h0(ILokhttp3/internal/http2/ErrorCode;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/http2/Http2Stream$StreamTimeout;->m:Lokhttp3/internal/http2/Http2Stream;

    .line 20
    .line 21
    iget-object v0, v0, Lokhttp3/internal/http2/Http2Stream;->d:Lokhttp3/internal/http2/Http2Connection;

    .line 22
    .line 23
    monitor-enter v0

    .line 24
    :try_start_0
    iget-wide v1, v0, Lokhttp3/internal/http2/Http2Connection;->v:J

    .line 25
    .line 26
    iget-wide v3, v0, Lokhttp3/internal/http2/Http2Connection;->u:J

    .line 27
    .line 28
    cmp-long v1, v1, v3

    .line 29
    .line 30
    if-gez v1, :cond_1

    .line 31
    .line 32
    monitor-exit v0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const-wide/16 v1, 0x1

    .line 35
    .line 36
    add-long/2addr v3, v1

    .line 37
    iput-wide v3, v0, Lokhttp3/internal/http2/Http2Connection;->u:J

    .line 38
    .line 39
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 40
    .line 41
    .line 42
    move-result-wide v1

    .line 43
    const-wide/32 v3, 0x3b9aca00

    .line 44
    .line 45
    .line 46
    add-long/2addr v1, v3

    .line 47
    iput-wide v1, v0, Lokhttp3/internal/http2/Http2Connection;->w:J

    .line 48
    .line 49
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    :try_start_1
    iget-object v1, v0, Lokhttp3/internal/http2/Http2Connection;->p:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 51
    .line 52
    new-instance v2, Lokhttp3/internal/http2/Http2Connection$3;

    .line 53
    .line 54
    const/4 v3, 0x1

    .line 55
    new-array v3, v3, [Ljava/lang/Object;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    iget-object v5, v0, Lokhttp3/internal/http2/Http2Connection;->d:Ljava/lang/String;

    .line 59
    .line 60
    aput-object v5, v3, v4

    .line 61
    .line 62
    invoke-direct {v2, v0, v3}, Lokhttp3/internal/http2/Http2Connection$3;-><init>(Lokhttp3/internal/http2/Http2Connection;[Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    .line 66
    .line 67
    .line 68
    :catch_0
    :goto_1
    return-void

    .line 69
    :catchall_0
    move-exception v1

    .line 70
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    throw v1
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
.end method

.method public final l()V
    .locals 1

    invoke-virtual {p0}, Lxc/c;->i()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lokhttp3/internal/http2/Http2Stream$StreamTimeout;->j(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method
