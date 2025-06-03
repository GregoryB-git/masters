.class public final Lokhttp3/internal/ws/WebSocketProtocol;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "No instances."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public static a(Lxc/f$a;[B)V
    .locals 9

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :cond_0
    iget-object v3, p0, Lxc/f$a;->e:[B

    .line 5
    .line 6
    iget v4, p0, Lxc/f$a;->f:I

    .line 7
    .line 8
    iget v5, p0, Lxc/f$a;->o:I

    .line 9
    .line 10
    :goto_0
    const/4 v6, 0x1

    .line 11
    if-ge v4, v5, :cond_1

    .line 12
    .line 13
    rem-int/2addr v2, v0

    .line 14
    aget-byte v7, v3, v4

    .line 15
    .line 16
    aget-byte v8, p1, v2

    .line 17
    .line 18
    xor-int/2addr v7, v8

    .line 19
    int-to-byte v7, v7

    .line 20
    aput-byte v7, v3, v4

    .line 21
    .line 22
    add-int/lit8 v4, v4, 0x1

    .line 23
    .line 24
    add-int/2addr v2, v6

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-wide v3, p0, Lxc/f$a;->d:J

    .line 27
    .line 28
    iget-object v5, p0, Lxc/f$a;->a:Lxc/f;

    .line 29
    .line 30
    invoke-static {v5}, Lec/i;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-wide v7, v5, Lxc/f;->b:J

    .line 34
    .line 35
    cmp-long v3, v3, v7

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v6, v1

    .line 41
    :goto_1
    if-eqz v6, :cond_4

    .line 42
    .line 43
    iget-wide v3, p0, Lxc/f$a;->d:J

    .line 44
    .line 45
    const-wide/16 v5, -0x1

    .line 46
    .line 47
    cmp-long v5, v3, v5

    .line 48
    .line 49
    if-nez v5, :cond_3

    .line 50
    .line 51
    const-wide/16 v3, 0x0

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    iget v5, p0, Lxc/f$a;->o:I

    .line 55
    .line 56
    iget v6, p0, Lxc/f$a;->f:I

    .line 57
    .line 58
    sub-int/2addr v5, v6

    .line 59
    int-to-long v5, v5

    .line 60
    add-long/2addr v3, v5

    .line 61
    :goto_2
    invoke-virtual {p0, v3, v4}, Lxc/f$a;->f(J)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    const/4 v4, -0x1

    .line 66
    if-ne v3, v4, :cond_0

    .line 67
    .line 68
    return-void

    .line 69
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string p1, "no more bytes"

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p0
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
