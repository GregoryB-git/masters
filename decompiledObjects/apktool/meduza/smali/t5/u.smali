.class public final Lt5/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5/c0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lt5/c0$a;Lt5/c0$c;)Lt5/c0$b;
    .locals 4

    .line 1
    iget-object p2, p2, Lt5/c0$c;->a:Ljava/io/IOException;

    .line 2
    .line 3
    instance-of v0, p2, Lt5/z;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    check-cast p2, Lt5/z;

    .line 10
    .line 11
    iget p2, p2, Lt5/z;->d:I

    .line 12
    .line 13
    const/16 v0, 0x193

    .line 14
    .line 15
    if-eq p2, v0, :cond_2

    .line 16
    .line 17
    const/16 v0, 0x194

    .line 18
    .line 19
    if-eq p2, v0, :cond_2

    .line 20
    .line 21
    const/16 v0, 0x19a

    .line 22
    .line 23
    if-eq p2, v0, :cond_2

    .line 24
    .line 25
    const/16 v0, 0x1a0

    .line 26
    .line 27
    if-eq p2, v0, :cond_2

    .line 28
    .line 29
    const/16 v0, 0x1f4

    .line 30
    .line 31
    if-eq p2, v0, :cond_2

    .line 32
    .line 33
    const/16 v0, 0x1f7

    .line 34
    .line 35
    if-ne p2, v0, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    :goto_0
    const/4 p2, 0x0

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    :goto_1
    move p2, v1

    .line 41
    :goto_2
    const/4 v0, 0x0

    .line 42
    if-nez p2, :cond_3

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_3
    invoke-virtual {p1, v1}, Lt5/c0$a;->a(I)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eqz p2, :cond_4

    .line 50
    .line 51
    new-instance p1, Lt5/c0$b;

    .line 52
    .line 53
    const-wide/32 v2, 0x493e0

    .line 54
    .line 55
    .line 56
    invoke-direct {p1, v1, v2, v3}, Lt5/c0$b;-><init>(IJ)V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_4
    const/4 p2, 0x2

    .line 61
    invoke-virtual {p1, p2}, Lt5/c0$a;->a(I)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_5

    .line 66
    .line 67
    new-instance p1, Lt5/c0$b;

    .line 68
    .line 69
    const-wide/32 v0, 0xea60

    .line 70
    .line 71
    .line 72
    invoke-direct {p1, p2, v0, v1}, Lt5/c0$b;-><init>(IJ)V

    .line 73
    .line 74
    .line 75
    return-object p1

    .line 76
    :cond_5
    return-object v0
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

.method public final b(I)I
    .locals 1

    const/4 v0, 0x7

    if-ne p1, v0, :cond_0

    const/4 p1, 0x6

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    :goto_0
    return p1
.end method

.method public final c(Lt5/c0$c;)J
    .locals 4

    .line 1
    iget-object v0, p1, Lt5/c0$c;->a:Ljava/io/IOException;

    .line 2
    .line 3
    instance-of v1, v0, Lv3/a1;

    .line 4
    .line 5
    if-nez v1, :cond_3

    .line 6
    .line 7
    instance-of v1, v0, Ljava/io/FileNotFoundException;

    .line 8
    .line 9
    if-nez v1, :cond_3

    .line 10
    .line 11
    instance-of v1, v0, Lt5/w;

    .line 12
    .line 13
    if-nez v1, :cond_3

    .line 14
    .line 15
    instance-of v1, v0, Lt5/d0$g;

    .line 16
    .line 17
    if-nez v1, :cond_3

    .line 18
    .line 19
    sget v1, Lt5/l;->b:I

    .line 20
    .line 21
    :goto_0
    const/4 v1, 0x1

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    instance-of v2, v0, Lt5/l;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    move-object v2, v0

    .line 29
    check-cast v2, Lt5/l;

    .line 30
    .line 31
    iget v2, v2, Lt5/l;->a:I

    .line 32
    .line 33
    const/16 v3, 0x7d8

    .line 34
    .line 35
    if-ne v2, v3, :cond_0

    .line 36
    .line 37
    move v0, v1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v0, 0x0

    .line 45
    :goto_1
    if-eqz v0, :cond_2

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    iget p1, p1, Lt5/c0$c;->b:I

    .line 49
    .line 50
    sub-int/2addr p1, v1

    .line 51
    mul-int/lit16 p1, p1, 0x3e8

    .line 52
    .line 53
    const/16 v0, 0x1388

    .line 54
    .line 55
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    int-to-long v0, p1

    .line 60
    goto :goto_3

    .line 61
    :cond_3
    :goto_2
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    :goto_3
    return-wide v0
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
