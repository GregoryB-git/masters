.class Lokhttp3/internal/http2/Http2Codec$StreamFinishingSource;
.super Lxc/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http2/Http2Codec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "StreamFinishingSource"
.end annotation


# instance fields
.field public b:Z

.field public c:J

.field public final synthetic d:Lokhttp3/internal/http2/Http2Codec;


# direct methods
.method public constructor <init>(Lokhttp3/internal/http2/Http2Codec;Lxc/y;)V
    .locals 0

    iput-object p1, p0, Lokhttp3/internal/http2/Http2Codec$StreamFinishingSource;->d:Lokhttp3/internal/http2/Http2Codec;

    invoke-direct {p0, p2}, Lxc/k;-><init>(Lxc/y;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lokhttp3/internal/http2/Http2Codec$StreamFinishingSource;->b:Z

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lokhttp3/internal/http2/Http2Codec$StreamFinishingSource;->c:J

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    invoke-super {p0}, Lxc/k;->close()V

    iget-boolean v0, p0, Lokhttp3/internal/http2/Http2Codec$StreamFinishingSource;->b:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/http2/Http2Codec$StreamFinishingSource;->b:Z

    iget-object v0, p0, Lokhttp3/internal/http2/Http2Codec$StreamFinishingSource;->d:Lokhttp3/internal/http2/Http2Codec;

    iget-object v1, v0, Lokhttp3/internal/http2/Http2Codec;->b:Lokhttp3/internal/connection/StreamAllocation;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lokhttp3/internal/connection/StreamAllocation;->i(ZLokhttp3/internal/http/HttpCodec;Ljava/io/IOException;)V

    :goto_0
    return-void
.end method

.method public final e0(Lxc/f;J)J
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lxc/k;->a:Lxc/y;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lxc/y;->e0(Lxc/f;J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    cmp-long p3, p1, v0

    .line 10
    .line 11
    if-lez p3, :cond_0

    .line 12
    .line 13
    iget-wide v0, p0, Lokhttp3/internal/http2/Http2Codec$StreamFinishingSource;->c:J

    .line 14
    .line 15
    add-long/2addr v0, p1

    .line 16
    iput-wide v0, p0, Lokhttp3/internal/http2/Http2Codec$StreamFinishingSource;->c:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    :cond_0
    return-wide p1

    .line 19
    :catch_0
    move-exception p1

    .line 20
    iget-boolean p2, p0, Lokhttp3/internal/http2/Http2Codec$StreamFinishingSource;->b:Z

    .line 21
    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 p2, 0x1

    .line 26
    iput-boolean p2, p0, Lokhttp3/internal/http2/Http2Codec$StreamFinishingSource;->b:Z

    .line 27
    .line 28
    iget-object p2, p0, Lokhttp3/internal/http2/Http2Codec$StreamFinishingSource;->d:Lokhttp3/internal/http2/Http2Codec;

    .line 29
    .line 30
    iget-object p3, p2, Lokhttp3/internal/http2/Http2Codec;->b:Lokhttp3/internal/connection/StreamAllocation;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-virtual {p3, v0, p2, p1}, Lokhttp3/internal/connection/StreamAllocation;->i(ZLokhttp3/internal/http/HttpCodec;Ljava/io/IOException;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    throw p1
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
