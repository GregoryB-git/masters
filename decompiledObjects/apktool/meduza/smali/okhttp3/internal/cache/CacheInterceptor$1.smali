.class Lokhttp3/internal/cache/CacheInterceptor$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxc/y;


# instance fields
.field public a:Z

.field public final synthetic b:Lxc/h;

.field public final synthetic c:Lokhttp3/internal/cache/CacheRequest;

.field public final synthetic d:Lxc/g;


# direct methods
.method public constructor <init>(Lxc/h;Lokhttp3/internal/cache/CacheRequest;Lxc/r;)V
    .locals 0

    iput-object p1, p0, Lokhttp3/internal/cache/CacheInterceptor$1;->b:Lxc/h;

    iput-object p2, p0, Lokhttp3/internal/cache/CacheInterceptor$1;->c:Lokhttp3/internal/cache/CacheRequest;

    iput-object p3, p0, Lokhttp3/internal/cache/CacheInterceptor$1;->d:Lxc/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()Lxc/z;
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/cache/CacheInterceptor$1;->b:Lxc/h;

    invoke-interface {v0}, Lxc/y;->c()Lxc/z;

    move-result-object v0

    return-object v0
.end method

.method public final close()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/cache/CacheInterceptor$1;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 6
    .line 7
    const/16 v1, 0x64

    .line 8
    .line 9
    :try_start_0
    invoke-static {p0, v1, v0}, Lokhttp3/internal/Util;->s(Lxc/y;ILjava/util/concurrent/TimeUnit;)Z

    .line 10
    .line 11
    .line 12
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    goto :goto_0

    .line 14
    :catch_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lokhttp3/internal/cache/CacheInterceptor$1;->a:Z

    .line 19
    .line 20
    iget-object v0, p0, Lokhttp3/internal/cache/CacheInterceptor$1;->c:Lokhttp3/internal/cache/CacheRequest;

    .line 21
    .line 22
    invoke-interface {v0}, Lokhttp3/internal/cache/CacheRequest;->a()V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/cache/CacheInterceptor$1;->b:Lxc/h;

    .line 26
    .line 27
    invoke-interface {v0}, Lxc/y;->close()V

    .line 28
    .line 29
    .line 30
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final e0(Lxc/f;J)J
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    iget-object v1, p0, Lokhttp3/internal/cache/CacheInterceptor$1;->b:Lxc/h;

    .line 3
    .line 4
    invoke-interface {v1, p1, p2, p3}, Lxc/y;->e0(Lxc/f;J)J

    .line 5
    .line 6
    .line 7
    move-result-wide p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    const-wide/16 v1, -0x1

    .line 9
    .line 10
    cmp-long v3, p2, v1

    .line 11
    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    iget-boolean p1, p0, Lokhttp3/internal/cache/CacheInterceptor$1;->a:Z

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    iput-boolean v0, p0, Lokhttp3/internal/cache/CacheInterceptor$1;->a:Z

    .line 19
    .line 20
    iget-object p1, p0, Lokhttp3/internal/cache/CacheInterceptor$1;->d:Lxc/g;

    .line 21
    .line 22
    invoke-interface {p1}, Lxc/w;->close()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-wide v1

    .line 26
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/cache/CacheInterceptor$1;->d:Lxc/g;

    .line 27
    .line 28
    invoke-interface {v0}, Lxc/g;->k()Lxc/f;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    iget-wide v0, p1, Lxc/f;->b:J

    .line 33
    .line 34
    sub-long v3, v0, p2

    .line 35
    .line 36
    move-object v2, p1

    .line 37
    move-wide v5, p2

    .line 38
    invoke-virtual/range {v2 .. v7}, Lxc/f;->H(JJLxc/f;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lokhttp3/internal/cache/CacheInterceptor$1;->d:Lxc/g;

    .line 42
    .line 43
    invoke-interface {p1}, Lxc/g;->D()Lxc/g;

    .line 44
    .line 45
    .line 46
    return-wide p2

    .line 47
    :catch_0
    move-exception p1

    .line 48
    iget-boolean p2, p0, Lokhttp3/internal/cache/CacheInterceptor$1;->a:Z

    .line 49
    .line 50
    if-nez p2, :cond_2

    .line 51
    .line 52
    iput-boolean v0, p0, Lokhttp3/internal/cache/CacheInterceptor$1;->a:Z

    .line 53
    .line 54
    iget-object p2, p0, Lokhttp3/internal/cache/CacheInterceptor$1;->c:Lokhttp3/internal/cache/CacheRequest;

    .line 55
    .line 56
    invoke-interface {p2}, Lokhttp3/internal/cache/CacheRequest;->a()V

    .line 57
    .line 58
    .line 59
    :cond_2
    throw p1
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
