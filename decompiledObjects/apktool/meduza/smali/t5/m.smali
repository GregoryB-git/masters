.class public final Lt5/m;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field public final a:Lt5/k;

.field public final b:Lt5/n;

.field public final c:[B

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>(Lt5/k;Lt5/n;)V
    .locals 1

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lt5/m;->d:Z

    iput-boolean v0, p0, Lt5/m;->e:Z

    iput-object p1, p0, Lt5/m;->a:Lt5/k;

    iput-object p2, p0, Lt5/m;->b:Lt5/n;

    const/4 p1, 0x1

    new-array p1, p1, [B

    iput-object p1, p0, Lt5/m;->c:[B

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-boolean v0, p0, Lt5/m;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lt5/m;->a:Lt5/k;

    invoke-interface {v0}, Lt5/k;->close()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt5/m;->e:Z

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 2

    iget-boolean v0, p0, Lt5/m;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lt5/m;->a:Lt5/k;

    iget-object v1, p0, Lt5/m;->b:Lt5/n;

    invoke-interface {v0, v1}, Lt5/k;->a(Lt5/n;)J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt5/m;->d:Z

    :cond_0
    return-void
.end method

.method public final read()I
    .locals 2

    iget-object v0, p0, Lt5/m;->c:[B

    invoke-virtual {p0, v0}, Lt5/m;->read([B)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lt5/m;->c:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    and-int/lit16 v1, v0, 0xff

    :goto_0
    return v1
.end method

.method public final read([B)I
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lt5/m;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 1

    iget-boolean v0, p0, Lt5/m;->e:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lx6/b;->H(Z)V

    invoke-virtual {p0}, Lt5/m;->f()V

    iget-object v0, p0, Lt5/m;->a:Lt5/k;

    invoke-interface {v0, p1, p2, p3}, Lt5/h;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    return p1
.end method
