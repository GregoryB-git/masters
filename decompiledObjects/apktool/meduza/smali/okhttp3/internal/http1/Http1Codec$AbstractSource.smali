.class abstract Lokhttp3/internal/http1/Http1Codec$AbstractSource;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxc/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http1/Http1Codec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "AbstractSource"
.end annotation


# instance fields
.field public final a:Lxc/l;

.field public b:Z

.field public c:J

.field public final synthetic d:Lokhttp3/internal/http1/Http1Codec;


# direct methods
.method public constructor <init>(Lokhttp3/internal/http1/Http1Codec;)V
    .locals 2

    iput-object p1, p0, Lokhttp3/internal/http1/Http1Codec$AbstractSource;->d:Lokhttp3/internal/http1/Http1Codec;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lxc/l;

    iget-object p1, p1, Lokhttp3/internal/http1/Http1Codec;->c:Lxc/h;

    invoke-interface {p1}, Lxc/y;->c()Lxc/z;

    move-result-object p1

    invoke-direct {v0, p1}, Lxc/l;-><init>(Lxc/z;)V

    iput-object v0, p0, Lokhttp3/internal/http1/Http1Codec$AbstractSource;->a:Lxc/l;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lokhttp3/internal/http1/Http1Codec$AbstractSource;->c:J

    return-void
.end method


# virtual methods
.method public final c()Lxc/z;
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec$AbstractSource;->a:Lxc/l;

    return-object v0
.end method

.method public e0(Lxc/f;J)J
    .locals 2

    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec$AbstractSource;->d:Lokhttp3/internal/http1/Http1Codec;

    iget-object v0, v0, Lokhttp3/internal/http1/Http1Codec;->c:Lxc/h;

    invoke-interface {v0, p1, p2, p3}, Lxc/y;->e0(Lxc/f;J)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p3, p1, v0

    if-lez p3, :cond_0

    iget-wide v0, p0, Lokhttp3/internal/http1/Http1Codec$AbstractSource;->c:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lokhttp3/internal/http1/Http1Codec$AbstractSource;->c:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-wide p1

    :catch_0
    move-exception p1

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lokhttp3/internal/http1/Http1Codec$AbstractSource;->f(Ljava/io/IOException;Z)V

    throw p1
.end method

.method public final f(Ljava/io/IOException;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec$AbstractSource;->d:Lokhttp3/internal/http1/Http1Codec;

    .line 2
    .line 3
    iget v0, v0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 4
    .line 5
    const/4 v1, 0x6

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v2, 0x5

    .line 10
    if-ne v0, v2, :cond_2

    .line 11
    .line 12
    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec$AbstractSource;->a:Lxc/l;

    .line 13
    .line 14
    invoke-static {v0}, Lokhttp3/internal/http1/Http1Codec;->g(Lxc/l;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec$AbstractSource;->d:Lokhttp3/internal/http1/Http1Codec;

    .line 18
    .line 19
    iput v1, v0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 20
    .line 21
    iget-object v1, v0, Lokhttp3/internal/http1/Http1Codec;->b:Lokhttp3/internal/connection/StreamAllocation;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    xor-int/lit8 p2, p2, 0x1

    .line 26
    .line 27
    invoke-virtual {v1, p2, v0, p1}, Lokhttp3/internal/connection/StreamAllocation;->i(ZLokhttp3/internal/http/HttpCodec;Ljava/io/IOException;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void

    .line 31
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string p2, "state: "

    .line 34
    .line 35
    invoke-static {p2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec$AbstractSource;->d:Lokhttp3/internal/http1/Http1Codec;

    .line 40
    .line 41
    iget v0, v0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 42
    .line 43
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1
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
