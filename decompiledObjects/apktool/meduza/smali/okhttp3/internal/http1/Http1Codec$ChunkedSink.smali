.class final Lokhttp3/internal/http1/Http1Codec$ChunkedSink;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxc/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http1/Http1Codec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ChunkedSink"
.end annotation


# instance fields
.field public final a:Lxc/l;

.field public b:Z

.field public final synthetic c:Lokhttp3/internal/http1/Http1Codec;


# direct methods
.method public constructor <init>(Lokhttp3/internal/http1/Http1Codec;)V
    .locals 1

    iput-object p1, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSink;->c:Lokhttp3/internal/http1/Http1Codec;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lxc/l;

    iget-object p1, p1, Lokhttp3/internal/http1/Http1Codec;->d:Lxc/g;

    invoke-interface {p1}, Lxc/w;->c()Lxc/z;

    move-result-object p1

    invoke-direct {v0, p1}, Lxc/l;-><init>(Lxc/z;)V

    iput-object v0, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSink;->a:Lxc/l;

    return-void
.end method


# virtual methods
.method public final c()Lxc/z;
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSink;->a:Lxc/l;

    return-object v0
.end method

.method public final declared-synchronized close()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSink;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSink;->b:Z

    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSink;->c:Lokhttp3/internal/http1/Http1Codec;

    iget-object v0, v0, Lokhttp3/internal/http1/Http1Codec;->d:Lxc/g;

    const-string v1, "0\r\n\r\n"

    invoke-interface {v0, v1}, Lxc/g;->O(Ljava/lang/String;)Lxc/g;

    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSink;->c:Lokhttp3/internal/http1/Http1Codec;

    iget-object v1, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSink;->a:Lxc/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lokhttp3/internal/http1/Http1Codec;->g(Lxc/l;)V

    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSink;->c:Lokhttp3/internal/http1/Http1Codec;

    const/4 v1, 0x3

    iput v1, v0, Lokhttp3/internal/http1/Http1Codec;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized flush()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSink;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSink;->c:Lokhttp3/internal/http1/Http1Codec;

    iget-object v0, v0, Lokhttp3/internal/http1/Http1Codec;->d:Lxc/g;

    invoke-interface {v0}, Lxc/g;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final g0(Lxc/f;J)V
    .locals 2

    iget-boolean v0, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSink;->b:Z

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSink;->c:Lokhttp3/internal/http1/Http1Codec;

    iget-object v0, v0, Lokhttp3/internal/http1/Http1Codec;->d:Lxc/g;

    invoke-interface {v0, p2, p3}, Lxc/g;->Y(J)Lxc/g;

    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSink;->c:Lokhttp3/internal/http1/Http1Codec;

    iget-object v0, v0, Lokhttp3/internal/http1/Http1Codec;->d:Lxc/g;

    const-string v1, "\r\n"

    invoke-interface {v0, v1}, Lxc/g;->O(Ljava/lang/String;)Lxc/g;

    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSink;->c:Lokhttp3/internal/http1/Http1Codec;

    iget-object v0, v0, Lokhttp3/internal/http1/Http1Codec;->d:Lxc/g;

    invoke-interface {v0, p1, p2, p3}, Lxc/w;->g0(Lxc/f;J)V

    iget-object p1, p0, Lokhttp3/internal/http1/Http1Codec$ChunkedSink;->c:Lokhttp3/internal/http1/Http1Codec;

    iget-object p1, p1, Lokhttp3/internal/http1/Http1Codec;->d:Lxc/g;

    invoke-interface {p1, v1}, Lxc/g;->O(Ljava/lang/String;)Lxc/g;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
