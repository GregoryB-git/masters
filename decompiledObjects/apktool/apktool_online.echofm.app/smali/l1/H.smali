.class public final Ll1/H;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Lg0/E;

.field public final c:Lg0/z;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:J

.field public h:J

.field public i:J


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ll1/H;->a:I

    .line 5
    .line 6
    new-instance p1, Lg0/E;

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    invoke-direct {p1, v0, v1}, Lg0/E;-><init>(J)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ll1/H;->b:Lg0/E;

    .line 14
    .line 15
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    iput-wide v0, p0, Ll1/H;->g:J

    .line 21
    .line 22
    iput-wide v0, p0, Ll1/H;->h:J

    .line 23
    .line 24
    iput-wide v0, p0, Ll1/H;->i:J

    .line 25
    .line 26
    new-instance p1, Lg0/z;

    .line 27
    .line 28
    invoke-direct {p1}, Lg0/z;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Ll1/H;->c:Lg0/z;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a(LF0/s;)I
    .locals 2

    .line 1
    iget-object v0, p0, Ll1/H;->c:Lg0/z;

    .line 2
    .line 3
    sget-object v1, Lg0/M;->f:[B

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lg0/z;->Q([B)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Ll1/H;->d:Z

    .line 10
    .line 11
    invoke-interface {p1}, LF0/s;->h()V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    return p1
.end method

.method public b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ll1/H;->i:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public c()Lg0/E;
    .locals 1

    .line 1
    iget-object v0, p0, Ll1/H;->b:Lg0/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll1/H;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public e(LF0/s;LF0/L;I)I
    .locals 4

    .line 1
    if-gtz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ll1/H;->a(LF0/s;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1

    .line 8
    :cond_0
    iget-boolean v0, p0, Ll1/H;->f:Z

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2, p3}, Ll1/H;->h(LF0/s;LF0/L;I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :cond_1
    iget-wide v0, p0, Ll1/H;->h:J

    .line 18
    .line 19
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    cmp-long v0, v0, v2

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Ll1/H;->a(LF0/s;)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1

    .line 33
    :cond_2
    iget-boolean v0, p0, Ll1/H;->e:Z

    .line 34
    .line 35
    if-nez v0, :cond_3

    .line 36
    .line 37
    invoke-virtual {p0, p1, p2, p3}, Ll1/H;->f(LF0/s;LF0/L;I)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1

    .line 42
    :cond_3
    iget-wide p2, p0, Ll1/H;->g:J

    .line 43
    .line 44
    cmp-long v0, p2, v2

    .line 45
    .line 46
    if-nez v0, :cond_4

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ll1/H;->a(LF0/s;)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    return p1

    .line 53
    :cond_4
    iget-object v0, p0, Ll1/H;->b:Lg0/E;

    .line 54
    .line 55
    invoke-virtual {v0, p2, p3}, Lg0/E;->b(J)J

    .line 56
    .line 57
    .line 58
    move-result-wide p2

    .line 59
    iget-object v0, p0, Ll1/H;->b:Lg0/E;

    .line 60
    .line 61
    iget-wide v1, p0, Ll1/H;->h:J

    .line 62
    .line 63
    invoke-virtual {v0, v1, v2}, Lg0/E;->c(J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    sub-long/2addr v0, p2

    .line 68
    iput-wide v0, p0, Ll1/H;->i:J

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Ll1/H;->a(LF0/s;)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    return p1
.end method

.method public final f(LF0/s;LF0/L;I)I
    .locals 6

    .line 1
    iget v0, p0, Ll1/H;->a:I

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    invoke-interface {p1}, LF0/s;->a()J

    .line 5
    .line 6
    .line 7
    move-result-wide v2

    .line 8
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    long-to-int v0, v0

    .line 13
    invoke-interface {p1}, LF0/s;->p()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    const/4 v3, 0x0

    .line 18
    int-to-long v4, v3

    .line 19
    cmp-long v1, v1, v4

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iput-wide v4, p2, LF0/L;->a:J

    .line 25
    .line 26
    return v2

    .line 27
    :cond_0
    iget-object p2, p0, Ll1/H;->c:Lg0/z;

    .line 28
    .line 29
    invoke-virtual {p2, v0}, Lg0/z;->P(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, LF0/s;->h()V

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, Ll1/H;->c:Lg0/z;

    .line 36
    .line 37
    invoke-virtual {p2}, Lg0/z;->e()[B

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-interface {p1, p2, v3, v0}, LF0/s;->n([BII)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Ll1/H;->c:Lg0/z;

    .line 45
    .line 46
    invoke-virtual {p0, p1, p3}, Ll1/H;->g(Lg0/z;I)J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    iput-wide p1, p0, Ll1/H;->g:J

    .line 51
    .line 52
    iput-boolean v2, p0, Ll1/H;->e:Z

    .line 53
    .line 54
    return v3
.end method

.method public final g(Lg0/z;I)J
    .locals 6

    .line 1
    invoke-virtual {p1}, Lg0/z;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lg0/z;->g()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    :goto_0
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    if-ge v0, v1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p1}, Lg0/z;->e()[B

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    aget-byte v4, v4, v0

    .line 21
    .line 22
    const/16 v5, 0x47

    .line 23
    .line 24
    if-eq v4, v5, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-static {p1, v0, p2}, Ll1/L;->c(Lg0/z;II)J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    cmp-long v2, v4, v2

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    return-wide v4

    .line 36
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    return-wide v2
.end method

.method public final h(LF0/s;LF0/L;I)I
    .locals 5

    .line 1
    invoke-interface {p1}, LF0/s;->a()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget v2, p0, Ll1/H;->a:I

    .line 6
    .line 7
    int-to-long v2, v2

    .line 8
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    long-to-int v2, v2

    .line 13
    int-to-long v3, v2

    .line 14
    sub-long/2addr v0, v3

    .line 15
    invoke-interface {p1}, LF0/s;->p()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    cmp-long v3, v3, v0

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    iput-wide v0, p2, LF0/L;->a:J

    .line 25
    .line 26
    return v4

    .line 27
    :cond_0
    iget-object p2, p0, Ll1/H;->c:Lg0/z;

    .line 28
    .line 29
    invoke-virtual {p2, v2}, Lg0/z;->P(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, LF0/s;->h()V

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, Ll1/H;->c:Lg0/z;

    .line 36
    .line 37
    invoke-virtual {p2}, Lg0/z;->e()[B

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-interface {p1, p2, v0, v2}, LF0/s;->n([BII)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Ll1/H;->c:Lg0/z;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p3}, Ll1/H;->i(Lg0/z;I)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    iput-wide p1, p0, Ll1/H;->h:J

    .line 52
    .line 53
    iput-boolean v4, p0, Ll1/H;->f:Z

    .line 54
    .line 55
    return v0
.end method

.method public final i(Lg0/z;I)J
    .locals 7

    .line 1
    invoke-virtual {p1}, Lg0/z;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lg0/z;->g()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit16 v2, v1, -0xbc

    .line 10
    .line 11
    :goto_0
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    if-lt v2, v0, :cond_2

    .line 17
    .line 18
    invoke-virtual {p1}, Lg0/z;->e()[B

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-static {v5, v0, v1, v2}, Ll1/L;->b([BIII)Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-nez v5, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-static {p1, v2, p2}, Ll1/L;->c(Lg0/z;II)J

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    cmp-long v3, v5, v3

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    return-wide v5

    .line 38
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, -0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return-wide v3
.end method
