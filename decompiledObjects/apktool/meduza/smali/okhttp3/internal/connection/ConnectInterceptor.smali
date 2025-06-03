.class public final Lokhttp3/internal/connection/ConnectInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# instance fields
.field public final a:Lokhttp3/OkHttpClient;


# direct methods
.method public constructor <init>(Lokhttp3/OkHttpClient;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/connection/ConnectInterceptor;->a:Lokhttp3/OkHttpClient;

    return-void
.end method


# virtual methods
.method public final a(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/Response;
    .locals 10

    .line 1
    iget-object v0, p1, Lokhttp3/internal/http/RealInterceptorChain;->f:Lokhttp3/Request;

    .line 2
    .line 3
    iget-object v8, p1, Lokhttp3/internal/http/RealInterceptorChain;->b:Lokhttp3/internal/connection/StreamAllocation;

    .line 4
    .line 5
    iget-object v1, v0, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 6
    .line 7
    const-string v2, "GET"

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    xor-int/lit8 v7, v1, 0x1

    .line 14
    .line 15
    iget-object v9, p0, Lokhttp3/internal/connection/ConnectInterceptor;->a:Lokhttp3/OkHttpClient;

    .line 16
    .line 17
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget v2, p1, Lokhttp3/internal/http/RealInterceptorChain;->i:I

    .line 21
    .line 22
    iget v3, p1, Lokhttp3/internal/http/RealInterceptorChain;->j:I

    .line 23
    .line 24
    iget v4, p1, Lokhttp3/internal/http/RealInterceptorChain;->k:I

    .line 25
    .line 26
    iget v5, v9, Lokhttp3/OkHttpClient;->J:I

    .line 27
    .line 28
    iget-boolean v6, v9, Lokhttp3/OkHttpClient;->E:Z

    .line 29
    .line 30
    move-object v1, v8

    .line 31
    :try_start_0
    invoke-virtual/range {v1 .. v7}, Lokhttp3/internal/connection/StreamAllocation;->e(IIIIZZ)Lokhttp3/internal/connection/RealConnection;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1, v9, p1, v8}, Lokhttp3/internal/connection/RealConnection;->h(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/RealInterceptorChain;Lokhttp3/internal/connection/StreamAllocation;)Lokhttp3/internal/http/HttpCodec;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v2, v8, Lokhttp3/internal/connection/StreamAllocation;->d:Lokhttp3/ConnectionPool;

    .line 40
    .line 41
    monitor-enter v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    :try_start_1
    iput-object v1, v8, Lokhttp3/internal/connection/StreamAllocation;->n:Lokhttp3/internal/http/HttpCodec;

    .line 43
    .line 44
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    invoke-virtual {v8}, Lokhttp3/internal/connection/StreamAllocation;->b()Lokhttp3/internal/connection/RealConnection;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {p1, v0, v8, v1, v2}, Lokhttp3/internal/http/RealInterceptorChain;->d(Lokhttp3/Request;Lokhttp3/internal/connection/StreamAllocation;Lokhttp3/internal/http/HttpCodec;Lokhttp3/internal/connection/RealConnection;)Lokhttp3/Response;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 56
    :try_start_3
    throw p1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 57
    :catch_0
    move-exception p1

    .line 58
    new-instance v0, Lokhttp3/internal/connection/RouteException;

    .line 59
    .line 60
    invoke-direct {v0, p1}, Lokhttp3/internal/connection/RouteException;-><init>(Ljava/io/IOException;)V

    .line 61
    .line 62
    .line 63
    throw v0
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
