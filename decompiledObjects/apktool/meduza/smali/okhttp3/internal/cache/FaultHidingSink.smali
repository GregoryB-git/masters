.class Lokhttp3/internal/cache/FaultHidingSink;
.super Lxc/j;
.source "SourceFile"


# instance fields
.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-boolean v0, p0, Lokhttp3/internal/cache/FaultHidingSink;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-super {p0}, Lxc/j;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/cache/FaultHidingSink;->b:Z

    invoke-virtual {p0}, Lokhttp3/internal/cache/FaultHidingSink;->f()V

    :goto_0
    return-void
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-boolean v0, p0, Lokhttp3/internal/cache/FaultHidingSink;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-super {p0}, Lxc/j;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/cache/FaultHidingSink;->b:Z

    invoke-virtual {p0}, Lokhttp3/internal/cache/FaultHidingSink;->f()V

    :goto_0
    return-void
.end method

.method public final g0(Lxc/f;J)V
    .locals 1

    iget-boolean v0, p0, Lokhttp3/internal/cache/FaultHidingSink;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2, p3}, Lxc/f;->skip(J)V

    return-void

    :cond_0
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lxc/j;->g0(Lxc/f;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lokhttp3/internal/cache/FaultHidingSink;->b:Z

    invoke-virtual {p0}, Lokhttp3/internal/cache/FaultHidingSink;->f()V

    :goto_0
    return-void
.end method
