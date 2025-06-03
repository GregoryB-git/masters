.class public final Llb/a;
.super Ljava/io/InputStream;
.source "SourceFile"

# interfaces
.implements Leb/t;
.implements Leb/j0;


# instance fields
.field public a:Lma/s0;

.field public final b:Lma/b1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma/b1<",
            "*>;"
        }
    .end annotation
.end field

.field public c:Ljava/io/ByteArrayInputStream;


# direct methods
.method public constructor <init>(Lma/s0;Lma/b1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lma/s0;",
            "Lma/b1<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    iput-object p1, p0, Llb/a;->a:Lma/s0;

    iput-object p2, p0, Llb/a;->b:Lma/b1;

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 1

    iget-object v0, p0, Llb/a;->a:Lma/s0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lma/s0;->d()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Llb/a;->c:Ljava/io/ByteArrayInputStream;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final f(Ljava/io/OutputStream;)I
    .locals 8

    .line 1
    iget-object v0, p0, Llb/a;->a:Lma/s0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Lma/s0;->d()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v0, p0, Llb/a;->a:Lma/s0;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Lma/s0;->g(Ljava/io/OutputStream;)V

    .line 14
    .line 15
    .line 16
    iput-object v2, p0, Llb/a;->a:Lma/s0;

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    iget-object v0, p0, Llb/a;->c:Ljava/io/ByteArrayInputStream;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    sget-object v3, Llb/b;->a:Lma/o;

    .line 24
    .line 25
    const-string v3, "outputStream cannot be null!"

    .line 26
    .line 27
    invoke-static {p1, v3}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const/16 v3, 0x2000

    .line 31
    .line 32
    new-array v3, v3, [B

    .line 33
    .line 34
    const-wide/16 v4, 0x0

    .line 35
    .line 36
    :goto_0
    invoke-virtual {v0, v3}, Ljava/io/InputStream;->read([B)I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    const/4 v7, -0x1

    .line 41
    if-ne v6, v7, :cond_1

    .line 42
    .line 43
    long-to-int v1, v4

    .line 44
    iput-object v2, p0, Llb/a;->c:Ljava/io/ByteArrayInputStream;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {p1, v3, v1, v6}, Ljava/io/OutputStream;->write([BII)V

    .line 48
    .line 49
    .line 50
    int-to-long v6, v6

    .line 51
    add-long/2addr v4, v6

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    :goto_1
    return v1
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

.method public final read()I
    .locals 2

    iget-object v0, p0, Llb/a;->a:Lma/s0;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p0, Llb/a;->a:Lma/s0;

    invoke-interface {v1}, Lma/s0;->j()[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    iput-object v0, p0, Llb/a;->c:Ljava/io/ByteArrayInputStream;

    const/4 v0, 0x0

    iput-object v0, p0, Llb/a;->a:Lma/s0;

    :cond_0
    iget-object v0, p0, Llb/a;->c:Ljava/io/ByteArrayInputStream;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public final read([BII)I
    .locals 4

    iget-object v0, p0, Llb/a;->a:Lma/s0;

    const/4 v1, -0x1

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lma/s0;->d()I

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    iput-object v2, p0, Llb/a;->a:Lma/s0;

    iput-object v2, p0, Llb/a;->c:Ljava/io/ByteArrayInputStream;

    return v1

    :cond_0
    if-lt p3, v0, :cond_2

    sget-object p3, Lma/k;->c:Ljava/util/logging/Logger;

    .line 1
    new-instance p3, Lma/k$b;

    invoke-direct {p3, p1, p2, v0}, Lma/k$b;-><init>([BII)V

    .line 2
    iget-object p1, p0, Llb/a;->a:Lma/s0;

    invoke-interface {p1, p3}, Lma/s0;->i(Lma/k;)V

    .line 3
    invoke-virtual {p3}, Lma/k$b;->p0()I

    move-result p1

    if-nez p1, :cond_1

    .line 4
    iput-object v2, p0, Llb/a;->a:Lma/s0;

    iput-object v2, p0, Llb/a;->c:Ljava/io/ByteArrayInputStream;

    return v0

    .line 5
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Did not write as much data as expected."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 6
    :cond_2
    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v3, p0, Llb/a;->a:Lma/s0;

    invoke-interface {v3}, Lma/s0;->j()[B

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    iput-object v0, p0, Llb/a;->c:Ljava/io/ByteArrayInputStream;

    iput-object v2, p0, Llb/a;->a:Lma/s0;

    :cond_3
    iget-object v0, p0, Llb/a;->c:Ljava/io/ByteArrayInputStream;

    if-eqz v0, :cond_4

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/ByteArrayInputStream;->read([BII)I

    move-result p1

    return p1

    :cond_4
    return v1
.end method
