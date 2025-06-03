.class public final Lc1/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/T;


# instance fields
.field public final a:LF0/T;

.field public final b:Lc1/t$a;

.field public final c:Lc1/d;

.field public final d:Lg0/z;

.field public e:I

.field public f:I

.field public g:[B

.field public h:Lc1/t;

.field public i:Ld0/q;


# direct methods
.method public constructor <init>(LF0/T;Lc1/t$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc1/x;->a:LF0/T;

    .line 5
    .line 6
    iput-object p2, p0, Lc1/x;->b:Lc1/t$a;

    .line 7
    .line 8
    new-instance p1, Lc1/d;

    .line 9
    .line 10
    invoke-direct {p1}, Lc1/d;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lc1/x;->c:Lc1/d;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput p1, p0, Lc1/x;->e:I

    .line 17
    .line 18
    iput p1, p0, Lc1/x;->f:I

    .line 19
    .line 20
    sget-object p1, Lg0/M;->f:[B

    .line 21
    .line 22
    iput-object p1, p0, Lc1/x;->g:[B

    .line 23
    .line 24
    new-instance p1, Lg0/z;

    .line 25
    .line 26
    invoke-direct {p1}, Lg0/z;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lc1/x;->d:Lg0/z;

    .line 30
    .line 31
    return-void
.end method

.method public static synthetic g(Lc1/x;JILc1/e;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lc1/x;->i(JILc1/e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lg0/z;II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc1/x;->h:Lc1/t;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lc1/x;->a:LF0/T;

    .line 6
    .line 7
    invoke-interface {v0, p1, p2, p3}, LF0/T;->a(Lg0/z;II)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0, p2}, Lc1/x;->h(I)V

    .line 12
    .line 13
    .line 14
    iget-object p3, p0, Lc1/x;->g:[B

    .line 15
    .line 16
    iget v0, p0, Lc1/x;->f:I

    .line 17
    .line 18
    invoke-virtual {p1, p3, v0, p2}, Lg0/z;->l([BII)V

    .line 19
    .line 20
    .line 21
    iget p1, p0, Lc1/x;->f:I

    .line 22
    .line 23
    add-int/2addr p1, p2

    .line 24
    iput p1, p0, Lc1/x;->f:I

    .line 25
    .line 26
    return-void
.end method

.method public b(JIIILF0/T$a;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lc1/x;->h:Lc1/t;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lc1/x;->a:LF0/T;

    .line 6
    .line 7
    move-wide v2, p1

    .line 8
    move v4, p3

    .line 9
    move v5, p4

    .line 10
    move v6, p5

    .line 11
    move-object v7, p6

    .line 12
    invoke-interface/range {v1 .. v7}, LF0/T;->b(JIIILF0/T$a;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    if-nez p6, :cond_1

    .line 18
    .line 19
    const/4 p6, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move p6, v0

    .line 22
    :goto_0
    const-string v1, "DRM on subtitles is not supported"

    .line 23
    .line 24
    invoke-static {p6, v1}, Lg0/a;->b(ZLjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget p6, p0, Lc1/x;->f:I

    .line 28
    .line 29
    sub-int/2addr p6, p5

    .line 30
    sub-int/2addr p6, p4

    .line 31
    iget-object v1, p0, Lc1/x;->h:Lc1/t;

    .line 32
    .line 33
    iget-object v2, p0, Lc1/x;->g:[B

    .line 34
    .line 35
    invoke-static {}, Lc1/t$b;->b()Lc1/t$b;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    new-instance v6, Lc1/w;

    .line 40
    .line 41
    invoke-direct {v6, p0, p1, p2, p3}, Lc1/w;-><init>(Lc1/x;JI)V

    .line 42
    .line 43
    .line 44
    move v3, p6

    .line 45
    move v4, p4

    .line 46
    invoke-interface/range {v1 .. v6}, Lc1/t;->c([BIILc1/t$b;Lg0/g;)V

    .line 47
    .line 48
    .line 49
    add-int/2addr p6, p4

    .line 50
    iput p6, p0, Lc1/x;->e:I

    .line 51
    .line 52
    iget p1, p0, Lc1/x;->f:I

    .line 53
    .line 54
    if-ne p6, p1, :cond_2

    .line 55
    .line 56
    iput v0, p0, Lc1/x;->e:I

    .line 57
    .line 58
    iput v0, p0, Lc1/x;->f:I

    .line 59
    .line 60
    :cond_2
    return-void
.end method

.method public c(Ld0/i;IZI)I
    .locals 1

    .line 1
    iget-object v0, p0, Lc1/x;->h:Lc1/t;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lc1/x;->a:LF0/T;

    .line 6
    .line 7
    invoke-interface {v0, p1, p2, p3, p4}, LF0/T;->c(Ld0/i;IZI)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-virtual {p0, p2}, Lc1/x;->h(I)V

    .line 13
    .line 14
    .line 15
    iget-object p4, p0, Lc1/x;->g:[B

    .line 16
    .line 17
    iget v0, p0, Lc1/x;->f:I

    .line 18
    .line 19
    invoke-interface {p1, p4, v0, p2}, Ld0/i;->read([BII)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 p2, -0x1

    .line 24
    if-ne p1, p2, :cond_2

    .line 25
    .line 26
    if-eqz p3, :cond_1

    .line 27
    .line 28
    return p2

    .line 29
    :cond_1
    new-instance p1, Ljava/io/EOFException;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_2
    iget p2, p0, Lc1/x;->f:I

    .line 36
    .line 37
    add-int/2addr p2, p1

    .line 38
    iput p2, p0, Lc1/x;->f:I

    .line 39
    .line 40
    return p1
.end method

.method public d(Ld0/q;)V
    .locals 4

    .line 1
    iget-object v0, p1, Ld0/q;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Ld0/q;->n:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0}, Ld0/z;->k(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x3

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lc1/x;->i:Ld0/q;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ld0/q;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    iput-object p1, p0, Lc1/x;->i:Ld0/q;

    .line 30
    .line 31
    iget-object v0, p0, Lc1/x;->b:Lc1/t$a;

    .line 32
    .line 33
    invoke-interface {v0, p1}, Lc1/t$a;->a(Ld0/q;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v0, p0, Lc1/x;->b:Lc1/t$a;

    .line 40
    .line 41
    invoke-interface {v0, p1}, Lc1/t$a;->b(Ld0/q;)Lc1/t;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const/4 v0, 0x0

    .line 47
    :goto_1
    iput-object v0, p0, Lc1/x;->h:Lc1/t;

    .line 48
    .line 49
    :cond_2
    iget-object v0, p0, Lc1/x;->h:Lc1/t;

    .line 50
    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    iget-object v0, p0, Lc1/x;->a:LF0/T;

    .line 54
    .line 55
    :goto_2
    invoke-interface {v0, p1}, LF0/T;->d(Ld0/q;)V

    .line 56
    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_3
    iget-object v0, p0, Lc1/x;->a:LF0/T;

    .line 60
    .line 61
    invoke-virtual {p1}, Ld0/q;->a()Ld0/q$b;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const-string v2, "application/x-media3-cues"

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iget-object v2, p1, Ld0/q;->n:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ld0/q$b;->O(Ljava/lang/String;)Ld0/q$b;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const-wide v2, 0x7fffffffffffffffL

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2, v3}, Ld0/q$b;->s0(J)Ld0/q$b;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iget-object v2, p0, Lc1/x;->b:Lc1/t$a;

    .line 87
    .line 88
    invoke-interface {v2, p1}, Lc1/t$a;->c(Ld0/q;)I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    invoke-virtual {v1, p1}, Ld0/q$b;->S(I)Ld0/q$b;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1}, Ld0/q$b;->K()Ld0/q;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    goto :goto_2

    .line 101
    :goto_3
    return-void
.end method

.method public synthetic e(Lg0/z;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LF0/S;->b(LF0/T;Lg0/z;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public synthetic f(Ld0/i;IZ)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LF0/S;->a(LF0/T;Ld0/i;IZ)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final h(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lc1/x;->g:[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    iget v1, p0, Lc1/x;->f:I

    .line 5
    .line 6
    sub-int/2addr v0, v1

    .line 7
    if-lt v0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget v0, p0, Lc1/x;->e:I

    .line 11
    .line 12
    sub-int/2addr v1, v0

    .line 13
    mul-int/lit8 v0, v1, 0x2

    .line 14
    .line 15
    add-int/2addr p1, v1

    .line 16
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iget-object v0, p0, Lc1/x;->g:[B

    .line 21
    .line 22
    array-length v2, v0

    .line 23
    if-gt p1, v2, :cond_1

    .line 24
    .line 25
    move-object p1, v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    new-array p1, p1, [B

    .line 28
    .line 29
    :goto_0
    iget v2, p0, Lc1/x;->e:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-static {v0, v2, p1, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    .line 34
    .line 35
    iput v3, p0, Lc1/x;->e:I

    .line 36
    .line 37
    iput v1, p0, Lc1/x;->f:I

    .line 38
    .line 39
    iput-object p1, p0, Lc1/x;->g:[B

    .line 40
    .line 41
    return-void
.end method

.method public final synthetic i(JILc1/e;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p4, p1, p2, p3}, Lc1/x;->j(Lc1/e;JI)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final j(Lc1/e;JI)V
    .locals 8

    .line 1
    iget-object v0, p0, Lc1/x;->i:Ld0/q;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc1/x;->c:Lc1/d;

    .line 7
    .line 8
    iget-object v1, p1, Lc1/e;->a:LX2/v;

    .line 9
    .line 10
    iget-wide v2, p1, Lc1/e;->c:J

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2, v3}, Lc1/d;->a(Ljava/util/List;J)[B

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Lc1/x;->d:Lg0/z;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lg0/z;->Q([B)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lc1/x;->a:LF0/T;

    .line 22
    .line 23
    iget-object v2, p0, Lc1/x;->d:Lg0/z;

    .line 24
    .line 25
    array-length v3, v0

    .line 26
    invoke-interface {v1, v2, v3}, LF0/T;->e(Lg0/z;I)V

    .line 27
    .line 28
    .line 29
    iget-wide v1, p1, Lc1/e;->b:J

    .line 30
    .line 31
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    cmp-long p1, v1, v3

    .line 37
    .line 38
    const-wide v3, 0x7fffffffffffffffL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    if-nez p1, :cond_1

    .line 44
    .line 45
    iget-object p1, p0, Lc1/x;->i:Ld0/q;

    .line 46
    .line 47
    iget-wide v1, p1, Ld0/q;->s:J

    .line 48
    .line 49
    cmp-long p1, v1, v3

    .line 50
    .line 51
    if-nez p1, :cond_0

    .line 52
    .line 53
    const/4 p1, 0x1

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 p1, 0x0

    .line 56
    :goto_0
    invoke-static {p1}, Lg0/a;->f(Z)V

    .line 57
    .line 58
    .line 59
    :goto_1
    move-wide v2, p2

    .line 60
    goto :goto_2

    .line 61
    :cond_1
    iget-object p1, p0, Lc1/x;->i:Ld0/q;

    .line 62
    .line 63
    iget-wide v5, p1, Ld0/q;->s:J

    .line 64
    .line 65
    cmp-long p1, v5, v3

    .line 66
    .line 67
    if-nez p1, :cond_2

    .line 68
    .line 69
    add-long/2addr p2, v1

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    add-long p2, v1, v5

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :goto_2
    iget-object v1, p0, Lc1/x;->a:LF0/T;

    .line 75
    .line 76
    array-length v5, v0

    .line 77
    const/4 v6, 0x0

    .line 78
    const/4 v7, 0x0

    .line 79
    move v4, p4

    .line 80
    invoke-interface/range {v1 .. v7}, LF0/T;->b(JIIILF0/T$a;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public k()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc1/x;->h:Lc1/t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lc1/t;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
