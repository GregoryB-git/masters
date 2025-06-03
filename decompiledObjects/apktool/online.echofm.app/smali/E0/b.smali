.class public final LE0/b;
.super Lk0/n;
.source "SourceFile"


# instance fields
.field public final F:Lj0/i;

.field public final G:Lg0/z;

.field public H:J

.field public I:LE0/a;

.field public J:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-direct {p0, v0}, Lk0/n;-><init>(I)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lj0/i;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1}, Lj0/i;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LE0/b;->F:Lj0/i;

    .line 12
    .line 13
    new-instance v0, Lg0/z;

    .line 14
    .line 15
    invoke-direct {v0}, Lg0/z;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LE0/b;->G:Lg0/z;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public T()V
    .locals 0

    .line 1
    invoke-virtual {p0}, LE0/b;->i0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public W(JZ)V
    .locals 0

    .line 1
    const-wide/high16 p1, -0x8000000000000000L

    .line 2
    .line 3
    iput-wide p1, p0, LE0/b;->J:J

    .line 4
    .line 5
    invoke-virtual {p0}, LE0/b;->i0()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public a(Ld0/q;)I
    .locals 1

    .line 1
    const-string v0, "application/x-camera-motion"

    .line 2
    .line 3
    iget-object p1, p1, Ld0/q;->n:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x4

    .line 12
    :goto_0
    invoke-static {p1}, Lk0/Z0;->a(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    goto :goto_0

    .line 19
    :goto_1
    return p1
.end method

.method public c()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk0/n;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public c0([Ld0/q;JJLx0/x$b;)V
    .locals 0

    .line 1
    iput-wide p4, p0, LE0/b;->H:J

    .line 2
    .line 3
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "CameraMotionRenderer"

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public f(JJ)V
    .locals 4

    .line 1
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lk0/n;->p()Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-nez p3, :cond_5

    .line 6
    .line 7
    iget-wide p3, p0, LE0/b;->J:J

    .line 8
    .line 9
    const-wide/32 v0, 0x186a0

    .line 10
    .line 11
    .line 12
    add-long/2addr v0, p1

    .line 13
    cmp-long p3, p3, v0

    .line 14
    .line 15
    if-gez p3, :cond_5

    .line 16
    .line 17
    iget-object p3, p0, LE0/b;->F:Lj0/i;

    .line 18
    .line 19
    invoke-virtual {p3}, Lj0/i;->m()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lk0/n;->N()Lk0/v0;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    iget-object p4, p0, LE0/b;->F:Lj0/i;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-virtual {p0, p3, p4, v0}, Lk0/n;->e0(Lk0/v0;Lj0/i;I)I

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    const/4 p4, -0x4

    .line 34
    if-ne p3, p4, :cond_5

    .line 35
    .line 36
    iget-object p3, p0, LE0/b;->F:Lj0/i;

    .line 37
    .line 38
    invoke-virtual {p3}, Lj0/a;->p()Z

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    if-eqz p3, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    iget-object p3, p0, LE0/b;->F:Lj0/i;

    .line 46
    .line 47
    iget-wide p3, p3, Lj0/i;->t:J

    .line 48
    .line 49
    iput-wide p3, p0, LE0/b;->J:J

    .line 50
    .line 51
    invoke-virtual {p0}, Lk0/n;->P()J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    cmp-long p3, p3, v1

    .line 56
    .line 57
    if-gez p3, :cond_2

    .line 58
    .line 59
    const/4 v0, 0x1

    .line 60
    :cond_2
    iget-object p3, p0, LE0/b;->I:LE0/a;

    .line 61
    .line 62
    if-eqz p3, :cond_0

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    iget-object p3, p0, LE0/b;->F:Lj0/i;

    .line 68
    .line 69
    invoke-virtual {p3}, Lj0/i;->C()V

    .line 70
    .line 71
    .line 72
    iget-object p3, p0, LE0/b;->F:Lj0/i;

    .line 73
    .line 74
    iget-object p3, p3, Lj0/i;->r:Ljava/nio/ByteBuffer;

    .line 75
    .line 76
    invoke-static {p3}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    check-cast p3, Ljava/nio/ByteBuffer;

    .line 81
    .line 82
    invoke-virtual {p0, p3}, LE0/b;->h0(Ljava/nio/ByteBuffer;)[F

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    if-nez p3, :cond_4

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    iget-object p4, p0, LE0/b;->I:LE0/a;

    .line 90
    .line 91
    invoke-static {p4}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p4

    .line 95
    check-cast p4, LE0/a;

    .line 96
    .line 97
    iget-wide v0, p0, LE0/b;->J:J

    .line 98
    .line 99
    iget-wide v2, p0, LE0/b;->H:J

    .line 100
    .line 101
    sub-long/2addr v0, v2

    .line 102
    invoke-interface {p4, v0, v1, p3}, LE0/a;->a(J[F)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_5
    :goto_1
    return-void
.end method

.method public final h0(Ljava/nio/ByteBuffer;)[F
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x10

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_0
    iget-object v0, p0, LE0/b;->G:Lg0/z;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-virtual {v0, v1, v2}, Lg0/z;->R([BI)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, LE0/b;->G:Lg0/z;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    add-int/lit8 p1, p1, 0x4

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lg0/z;->T(I)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x3

    .line 36
    new-array v0, p1, [F

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    :goto_0
    if-ge v1, p1, :cond_1

    .line 40
    .line 41
    iget-object v2, p0, LE0/b;->G:Lg0/z;

    .line 42
    .line 43
    invoke-virtual {v2}, Lg0/z;->t()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    aput v2, v0, v1

    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    return-object v0
.end method

.method public final i0()V
    .locals 1

    .line 1
    iget-object v0, p0, LE0/b;->I:LE0/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LE0/a;->h()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public t(ILjava/lang/Object;)V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    check-cast p2, LE0/a;

    .line 6
    .line 7
    iput-object p2, p0, LE0/b;->I:LE0/a;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-super {p0, p1, p2}, Lk0/n;->t(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    return-void
.end method
