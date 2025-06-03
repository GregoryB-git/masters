.class final Lokhttp3/internal/ws/WebSocketWriter$FrameSink;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxc/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/ws/WebSocketWriter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "FrameSink"
.end annotation


# instance fields
.field public a:Z

.field public b:Z


# virtual methods
.method public final c()Lxc/z;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final close()V
    .locals 2

    iget-boolean v0, p0, Lokhttp3/internal/ws/WebSocketWriter$FrameSink;->b:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    throw v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final flush()V
    .locals 2

    iget-boolean v0, p0, Lokhttp3/internal/ws/WebSocketWriter$FrameSink;->b:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    throw v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g0(Lxc/f;J)V
    .locals 0

    iget-boolean p1, p0, Lokhttp3/internal/ws/WebSocketWriter$FrameSink;->b:Z

    if-nez p1, :cond_0

    const/4 p1, 0x0

    throw p1

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
