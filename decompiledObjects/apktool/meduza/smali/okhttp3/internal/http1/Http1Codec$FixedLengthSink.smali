.class final Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;
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
    name = "FixedLengthSink"
.end annotation


# instance fields
.field public final a:Lxc/l;

.field public b:Z

.field public c:J

.field public final synthetic d:Lokhttp3/internal/http1/Http1Codec;


# direct methods
.method public constructor <init>(Lokhttp3/internal/http1/Http1Codec;J)V
    .locals 1

    iput-object p1, p0, Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;->d:Lokhttp3/internal/http1/Http1Codec;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lxc/l;

    iget-object p1, p1, Lokhttp3/internal/http1/Http1Codec;->d:Lxc/g;

    invoke-interface {p1}, Lxc/w;->c()Lxc/z;

    move-result-object p1

    invoke-direct {v0, p1}, Lxc/l;-><init>(Lxc/z;)V

    iput-object v0, p0, Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;->a:Lxc/l;

    iput-wide p2, p0, Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;->c:J

    return-void
.end method


# virtual methods
.method public final c()Lxc/z;
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;->a:Lxc/l;

    return-object v0
.end method

.method public final close()V
    .locals 4

    iget-boolean v0, p0, Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;->b:Z

    iget-wide v0, p0, Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;->d:Lokhttp3/internal/http1/Http1Codec;

    iget-object v1, p0, Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;->a:Lxc/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lokhttp3/internal/http1/Http1Codec;->g(Lxc/l;)V

    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;->d:Lokhttp3/internal/http1/Http1Codec;

    const/4 v1, 0x3

    iput v1, v0, Lokhttp3/internal/http1/Http1Codec;->e:I

    return-void

    :cond_1
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "unexpected end of stream"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final flush()V
    .locals 1

    iget-boolean v0, p0, Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;->d:Lokhttp3/internal/http1/Http1Codec;

    iget-object v0, v0, Lokhttp3/internal/http1/Http1Codec;->d:Lxc/g;

    invoke-interface {v0}, Lxc/g;->flush()V

    return-void
.end method

.method public final g0(Lxc/f;J)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-wide v0, p1, Lxc/f;->b:J

    .line 6
    .line 7
    sget-object v2, Lokhttp3/internal/Util;->a:[B

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    or-long v4, p2, v2

    .line 12
    .line 13
    cmp-long v4, v4, v2

    .line 14
    .line 15
    if-ltz v4, :cond_1

    .line 16
    .line 17
    cmp-long v4, v2, v0

    .line 18
    .line 19
    if-gtz v4, :cond_1

    .line 20
    .line 21
    sub-long/2addr v0, v2

    .line 22
    cmp-long v0, v0, p2

    .line 23
    .line 24
    if-ltz v0, :cond_1

    .line 25
    .line 26
    iget-wide v0, p0, Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;->c:J

    .line 27
    .line 28
    cmp-long v0, p2, v0

    .line 29
    .line 30
    if-gtz v0, :cond_0

    .line 31
    .line 32
    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;->d:Lokhttp3/internal/http1/Http1Codec;

    .line 33
    .line 34
    iget-object v0, v0, Lokhttp3/internal/http1/Http1Codec;->d:Lxc/g;

    .line 35
    .line 36
    invoke-interface {v0, p1, p2, p3}, Lxc/w;->g0(Lxc/f;J)V

    .line 37
    .line 38
    .line 39
    iget-wide v0, p0, Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;->c:J

    .line 40
    .line 41
    sub-long/2addr v0, p2

    .line 42
    iput-wide v0, p0, Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;->c:J

    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    .line 46
    .line 47
    const-string v0, "expected "

    .line 48
    .line 49
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-wide v1, p0, Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;->c:J

    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v1, " bytes but received "

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1

    .line 74
    :cond_1
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 75
    .line 76
    invoke-direct {p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    .line 77
    .line 78
    .line 79
    throw p1

    .line 80
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string p2, "closed"

    .line 83
    .line 84
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1
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
