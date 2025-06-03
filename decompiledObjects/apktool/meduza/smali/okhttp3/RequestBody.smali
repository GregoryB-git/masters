.class public abstract Lokhttp3/RequestBody;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lokhttp3/MediaType;[B)Lokhttp3/RequestBody;
    .locals 11

    .line 1
    array-length v0, p1

    .line 2
    array-length v1, p1

    .line 3
    int-to-long v1, v1

    .line 4
    const/4 v3, 0x0

    .line 5
    int-to-long v3, v3

    .line 6
    int-to-long v5, v0

    .line 7
    sget-object v7, Lokhttp3/internal/Util;->a:[B

    .line 8
    .line 9
    or-long v7, v3, v5

    .line 10
    .line 11
    const-wide/16 v9, 0x0

    .line 12
    .line 13
    cmp-long v7, v7, v9

    .line 14
    .line 15
    if-ltz v7, :cond_0

    .line 16
    .line 17
    cmp-long v7, v3, v1

    .line 18
    .line 19
    if-gtz v7, :cond_0

    .line 20
    .line 21
    sub-long/2addr v1, v3

    .line 22
    cmp-long v1, v1, v5

    .line 23
    .line 24
    if-ltz v1, :cond_0

    .line 25
    .line 26
    new-instance v1, Lokhttp3/RequestBody$2;

    .line 27
    .line 28
    invoke-direct {v1, v0, p0, p1}, Lokhttp3/RequestBody$2;-><init>(ILokhttp3/MediaType;[B)V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_0
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 33
    .line 34
    invoke-direct {p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    .line 35
    .line 36
    .line 37
    throw p0
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


# virtual methods
.method public a()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public abstract b()Lokhttp3/MediaType;
.end method

.method public abstract d(Lxc/r;)V
.end method
