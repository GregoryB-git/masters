.class public final LL0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/r;


# static fields
.field public static final q:LF0/x;


# instance fields
.field public final a:Lg0/z;

.field public final b:Lg0/z;

.field public final c:Lg0/z;

.field public final d:Lg0/z;

.field public final e:LL0/d;

.field public f:LF0/t;

.field public g:I

.field public h:Z

.field public i:J

.field public j:I

.field public k:I

.field public l:I

.field public m:J

.field public n:Z

.field public o:LL0/a;

.field public p:LL0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LL0/b;

    .line 2
    .line 3
    invoke-direct {v0}, LL0/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LL0/c;->q:LF0/x;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lg0/z;

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, v1}, Lg0/z;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LL0/c;->a:Lg0/z;

    .line 11
    .line 12
    new-instance v0, Lg0/z;

    .line 13
    .line 14
    const/16 v1, 0x9

    .line 15
    .line 16
    invoke-direct {v0, v1}, Lg0/z;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, LL0/c;->b:Lg0/z;

    .line 20
    .line 21
    new-instance v0, Lg0/z;

    .line 22
    .line 23
    const/16 v1, 0xb

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lg0/z;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, LL0/c;->c:Lg0/z;

    .line 29
    .line 30
    new-instance v0, Lg0/z;

    .line 31
    .line 32
    invoke-direct {v0}, Lg0/z;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, LL0/c;->d:Lg0/z;

    .line 36
    .line 37
    new-instance v0, LL0/d;

    .line 38
    .line 39
    invoke-direct {v0}, LL0/d;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, LL0/c;->e:LL0/d;

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    iput v0, p0, LL0/c;->g:I

    .line 46
    .line 47
    return-void
.end method

.method public static synthetic c()[LF0/r;
    .locals 1

    .line 1
    invoke-static {}, LL0/c;->j()[LF0/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static synthetic j()[LF0/r;
    .locals 3

    .line 1
    new-instance v0, LL0/c;

    .line 2
    .line 3
    invoke-direct {v0}, LL0/c;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [LF0/r;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object v0, v1, v2

    .line 11
    .line 12
    return-object v1
.end method


# virtual methods
.method public a(JJ)V
    .locals 0

    .line 1
    const-wide/16 p3, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, p3

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput p1, p0, LL0/c;->g:I

    .line 10
    .line 11
    iput-boolean p2, p0, LL0/c;->h:Z

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x3

    .line 15
    iput p1, p0, LL0/c;->g:I

    .line 16
    .line 17
    :goto_0
    iput p2, p0, LL0/c;->j:I

    .line 18
    .line 19
    return-void
.end method

.method public b(LF0/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, LL0/c;->f:LF0/t;

    .line 2
    .line 3
    return-void
.end method

.method public synthetic d()LF0/r;
    .locals 1

    .line 1
    invoke-static {p0}, LF0/q;->b(LF0/r;)LF0/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public e(LF0/s;)Z
    .locals 3

    .line 1
    iget-object v0, p0, LL0/c;->a:Lg0/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x3

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-interface {p1, v0, v2, v1}, LF0/s;->n([BII)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LL0/c;->a:Lg0/z;

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Lg0/z;->T(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, LL0/c;->a:Lg0/z;

    .line 18
    .line 19
    invoke-virtual {v0}, Lg0/z;->J()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const v1, 0x464c56

    .line 24
    .line 25
    .line 26
    if-eq v0, v1, :cond_0

    .line 27
    .line 28
    return v2

    .line 29
    :cond_0
    iget-object v0, p0, LL0/c;->a:Lg0/z;

    .line 30
    .line 31
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/4 v1, 0x2

    .line 36
    invoke-interface {p1, v0, v2, v1}, LF0/s;->n([BII)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, LL0/c;->a:Lg0/z;

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Lg0/z;->T(I)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, LL0/c;->a:Lg0/z;

    .line 45
    .line 46
    invoke-virtual {v0}, Lg0/z;->M()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    and-int/lit16 v0, v0, 0xfa

    .line 51
    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    return v2

    .line 55
    :cond_1
    iget-object v0, p0, LL0/c;->a:Lg0/z;

    .line 56
    .line 57
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const/4 v1, 0x4

    .line 62
    invoke-interface {p1, v0, v2, v1}, LF0/s;->n([BII)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, LL0/c;->a:Lg0/z;

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Lg0/z;->T(I)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, LL0/c;->a:Lg0/z;

    .line 71
    .line 72
    invoke-virtual {v0}, Lg0/z;->p()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-interface {p1}, LF0/s;->h()V

    .line 77
    .line 78
    .line 79
    invoke-interface {p1, v0}, LF0/s;->o(I)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, LL0/c;->a:Lg0/z;

    .line 83
    .line 84
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-interface {p1, v0, v2, v1}, LF0/s;->n([BII)V

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, LL0/c;->a:Lg0/z;

    .line 92
    .line 93
    invoke-virtual {p1, v2}, Lg0/z;->T(I)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, LL0/c;->a:Lg0/z;

    .line 97
    .line 98
    invoke-virtual {p1}, Lg0/z;->p()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-nez p1, :cond_2

    .line 103
    .line 104
    const/4 v2, 0x1

    .line 105
    :cond_2
    return v2
.end method

.method public final f()V
    .locals 4

    .line 1
    iget-boolean v0, p0, LL0/c;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LL0/c;->f:LF0/t;

    .line 6
    .line 7
    new-instance v1, LF0/M$b;

    .line 8
    .line 9
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v2, v3}, LF0/M$b;-><init>(J)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, LF0/t;->e(LF0/M;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, LL0/c;->n:Z

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public synthetic g()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {p0}, LF0/q;->a(LF0/r;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final h()J
    .locals 4

    .line 1
    iget-boolean v0, p0, LL0/c;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, LL0/c;->i:J

    .line 6
    .line 7
    iget-wide v2, p0, LL0/c;->m:J

    .line 8
    .line 9
    add-long/2addr v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, LL0/c;->e:LL0/d;

    .line 12
    .line 13
    invoke-virtual {v0}, LL0/d;->d()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    cmp-long v0, v0, v2

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    const-wide/16 v0, 0x0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-wide v0, p0, LL0/c;->m:J

    .line 30
    .line 31
    :goto_0
    return-wide v0
.end method

.method public i(LF0/s;LF0/L;)I
    .locals 2

    .line 1
    iget-object p2, p0, LL0/c;->f:LF0/t;

    .line 2
    .line 3
    invoke-static {p2}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    :cond_0
    :goto_0
    iget p2, p0, LL0/c;->g:I

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    const/4 v1, -0x1

    .line 10
    if-eq p2, v0, :cond_4

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    if-eq p2, v0, :cond_3

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-eq p2, v0, :cond_2

    .line 17
    .line 18
    const/4 v0, 0x4

    .line 19
    if-ne p2, v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, p1}, LL0/c;->m(LF0/s;)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    return p1

    .line 29
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_2
    invoke-virtual {p0, p1}, LL0/c;->n(LF0/s;)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-nez p2, :cond_0

    .line 40
    .line 41
    return v1

    .line 42
    :cond_3
    invoke-virtual {p0, p1}, LL0/c;->o(LF0/s;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    invoke-virtual {p0, p1}, LL0/c;->l(LF0/s;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-nez p2, :cond_0

    .line 51
    .line 52
    return v1
.end method

.method public final k(LF0/s;)Lg0/z;
    .locals 4

    .line 1
    iget v0, p0, LL0/c;->l:I

    .line 2
    .line 3
    iget-object v1, p0, LL0/c;->d:Lg0/z;

    .line 4
    .line 5
    invoke-virtual {v1}, Lg0/z;->b()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-le v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, LL0/c;->d:Lg0/z;

    .line 13
    .line 14
    invoke-virtual {v0}, Lg0/z;->b()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    mul-int/lit8 v1, v1, 0x2

    .line 19
    .line 20
    iget v3, p0, LL0/c;->l:I

    .line 21
    .line 22
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    new-array v1, v1, [B

    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Lg0/z;->R([BI)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v0, p0, LL0/c;->d:Lg0/z;

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Lg0/z;->T(I)V

    .line 35
    .line 36
    .line 37
    :goto_0
    iget-object v0, p0, LL0/c;->d:Lg0/z;

    .line 38
    .line 39
    iget v1, p0, LL0/c;->l:I

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lg0/z;->S(I)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, LL0/c;->d:Lg0/z;

    .line 45
    .line 46
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget v1, p0, LL0/c;->l:I

    .line 51
    .line 52
    invoke-interface {p1, v0, v2, v1}, LF0/s;->readFully([BII)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, LL0/c;->d:Lg0/z;

    .line 56
    .line 57
    return-object p1
.end method

.method public final l(LF0/s;)Z
    .locals 5

    .line 1
    iget-object v0, p0, LL0/c;->b:Lg0/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/16 v2, 0x9

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    invoke-interface {p1, v0, v1, v2, v3}, LF0/s;->d([BIIZ)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    iget-object p1, p0, LL0/c;->b:Lg0/z;

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Lg0/z;->T(I)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, LL0/c;->b:Lg0/z;

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    invoke-virtual {p1, v0}, Lg0/z;->U(I)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, LL0/c;->b:Lg0/z;

    .line 30
    .line 31
    invoke-virtual {p1}, Lg0/z;->G()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    and-int/lit8 v0, p1, 0x4

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    move v0, v3

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move v0, v1

    .line 42
    :goto_0
    and-int/2addr p1, v3

    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    move v1, v3

    .line 46
    :cond_2
    if-eqz v0, :cond_3

    .line 47
    .line 48
    iget-object p1, p0, LL0/c;->o:LL0/a;

    .line 49
    .line 50
    if-nez p1, :cond_3

    .line 51
    .line 52
    new-instance p1, LL0/a;

    .line 53
    .line 54
    iget-object v0, p0, LL0/c;->f:LF0/t;

    .line 55
    .line 56
    const/16 v4, 0x8

    .line 57
    .line 58
    invoke-interface {v0, v4, v3}, LF0/t;->a(II)LF0/T;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-direct {p1, v0}, LL0/a;-><init>(LF0/T;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, LL0/c;->o:LL0/a;

    .line 66
    .line 67
    :cond_3
    const/4 p1, 0x2

    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    iget-object v0, p0, LL0/c;->p:LL0/f;

    .line 71
    .line 72
    if-nez v0, :cond_4

    .line 73
    .line 74
    new-instance v0, LL0/f;

    .line 75
    .line 76
    iget-object v1, p0, LL0/c;->f:LF0/t;

    .line 77
    .line 78
    invoke-interface {v1, v2, p1}, LF0/t;->a(II)LF0/T;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-direct {v0, v1}, LL0/f;-><init>(LF0/T;)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, LL0/c;->p:LL0/f;

    .line 86
    .line 87
    :cond_4
    iget-object v0, p0, LL0/c;->f:LF0/t;

    .line 88
    .line 89
    invoke-interface {v0}, LF0/t;->j()V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, LL0/c;->b:Lg0/z;

    .line 93
    .line 94
    invoke-virtual {v0}, Lg0/z;->p()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    add-int/lit8 v0, v0, -0x5

    .line 99
    .line 100
    iput v0, p0, LL0/c;->j:I

    .line 101
    .line 102
    iput p1, p0, LL0/c;->g:I

    .line 103
    .line 104
    return v3
.end method

.method public final m(LF0/s;)Z
    .locals 9

    .line 1
    invoke-virtual {p0}, LL0/c;->h()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget v2, p0, LL0/c;->k:I

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/4 v6, 0x1

    .line 15
    if-ne v2, v3, :cond_1

    .line 16
    .line 17
    iget-object v3, p0, LL0/c;->o:LL0/a;

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, LL0/c;->f()V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, LL0/c;->o:LL0/a;

    .line 25
    .line 26
    :goto_0
    invoke-virtual {p0, p1}, LL0/c;->k(LF0/s;)Lg0/z;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {v2, p1, v0, v1}, LL0/e;->a(Lg0/z;J)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    :cond_0
    :goto_1
    move v0, v6

    .line 35
    goto :goto_2

    .line 36
    :cond_1
    const/16 v3, 0x9

    .line 37
    .line 38
    if-ne v2, v3, :cond_2

    .line 39
    .line 40
    iget-object v3, p0, LL0/c;->p:LL0/f;

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, LL0/c;->f()V

    .line 45
    .line 46
    .line 47
    iget-object v2, p0, LL0/c;->p:LL0/f;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/16 v3, 0x12

    .line 51
    .line 52
    if-ne v2, v3, :cond_3

    .line 53
    .line 54
    iget-boolean v2, p0, LL0/c;->n:Z

    .line 55
    .line 56
    if-nez v2, :cond_3

    .line 57
    .line 58
    iget-object v2, p0, LL0/c;->e:LL0/d;

    .line 59
    .line 60
    invoke-virtual {p0, p1}, LL0/c;->k(LF0/s;)Lg0/z;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {v2, p1, v0, v1}, LL0/e;->a(Lg0/z;J)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    iget-object v0, p0, LL0/c;->e:LL0/d;

    .line 69
    .line 70
    invoke-virtual {v0}, LL0/d;->d()J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    cmp-long v2, v0, v4

    .line 75
    .line 76
    if-eqz v2, :cond_0

    .line 77
    .line 78
    iget-object v2, p0, LL0/c;->f:LF0/t;

    .line 79
    .line 80
    new-instance v3, LF0/H;

    .line 81
    .line 82
    iget-object v7, p0, LL0/c;->e:LL0/d;

    .line 83
    .line 84
    invoke-virtual {v7}, LL0/d;->e()[J

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    iget-object v8, p0, LL0/c;->e:LL0/d;

    .line 89
    .line 90
    invoke-virtual {v8}, LL0/d;->f()[J

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    invoke-direct {v3, v7, v8, v0, v1}, LF0/H;-><init>([J[JJ)V

    .line 95
    .line 96
    .line 97
    invoke-interface {v2, v3}, LF0/t;->e(LF0/M;)V

    .line 98
    .line 99
    .line 100
    iput-boolean v6, p0, LL0/c;->n:Z

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    iget v0, p0, LL0/c;->l:I

    .line 104
    .line 105
    invoke-interface {p1, v0}, LF0/s;->i(I)V

    .line 106
    .line 107
    .line 108
    const/4 p1, 0x0

    .line 109
    move v0, p1

    .line 110
    :goto_2
    iget-boolean v1, p0, LL0/c;->h:Z

    .line 111
    .line 112
    if-nez v1, :cond_5

    .line 113
    .line 114
    if-eqz p1, :cond_5

    .line 115
    .line 116
    iput-boolean v6, p0, LL0/c;->h:Z

    .line 117
    .line 118
    iget-object p1, p0, LL0/c;->e:LL0/d;

    .line 119
    .line 120
    invoke-virtual {p1}, LL0/d;->d()J

    .line 121
    .line 122
    .line 123
    move-result-wide v1

    .line 124
    cmp-long p1, v1, v4

    .line 125
    .line 126
    if-nez p1, :cond_4

    .line 127
    .line 128
    iget-wide v1, p0, LL0/c;->m:J

    .line 129
    .line 130
    neg-long v1, v1

    .line 131
    goto :goto_3

    .line 132
    :cond_4
    const-wide/16 v1, 0x0

    .line 133
    .line 134
    :goto_3
    iput-wide v1, p0, LL0/c;->i:J

    .line 135
    .line 136
    :cond_5
    const/4 p1, 0x4

    .line 137
    iput p1, p0, LL0/c;->j:I

    .line 138
    .line 139
    const/4 p1, 0x2

    .line 140
    iput p1, p0, LL0/c;->g:I

    .line 141
    .line 142
    return v0
.end method

.method public final n(LF0/s;)Z
    .locals 6

    .line 1
    iget-object v0, p0, LL0/c;->c:Lg0/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/16 v2, 0xb

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    invoke-interface {p1, v0, v1, v2, v3}, LF0/s;->d([BIIZ)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    iget-object p1, p0, LL0/c;->c:Lg0/z;

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Lg0/z;->T(I)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, LL0/c;->c:Lg0/z;

    .line 24
    .line 25
    invoke-virtual {p1}, Lg0/z;->G()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iput p1, p0, LL0/c;->k:I

    .line 30
    .line 31
    iget-object p1, p0, LL0/c;->c:Lg0/z;

    .line 32
    .line 33
    invoke-virtual {p1}, Lg0/z;->J()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iput p1, p0, LL0/c;->l:I

    .line 38
    .line 39
    iget-object p1, p0, LL0/c;->c:Lg0/z;

    .line 40
    .line 41
    invoke-virtual {p1}, Lg0/z;->J()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    int-to-long v0, p1

    .line 46
    iput-wide v0, p0, LL0/c;->m:J

    .line 47
    .line 48
    iget-object p1, p0, LL0/c;->c:Lg0/z;

    .line 49
    .line 50
    invoke-virtual {p1}, Lg0/z;->G()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    shl-int/lit8 p1, p1, 0x18

    .line 55
    .line 56
    int-to-long v0, p1

    .line 57
    iget-wide v4, p0, LL0/c;->m:J

    .line 58
    .line 59
    or-long/2addr v0, v4

    .line 60
    const-wide/16 v4, 0x3e8

    .line 61
    .line 62
    mul-long/2addr v0, v4

    .line 63
    iput-wide v0, p0, LL0/c;->m:J

    .line 64
    .line 65
    iget-object p1, p0, LL0/c;->c:Lg0/z;

    .line 66
    .line 67
    const/4 v0, 0x3

    .line 68
    invoke-virtual {p1, v0}, Lg0/z;->U(I)V

    .line 69
    .line 70
    .line 71
    const/4 p1, 0x4

    .line 72
    iput p1, p0, LL0/c;->g:I

    .line 73
    .line 74
    return v3
.end method

.method public final o(LF0/s;)V
    .locals 1

    .line 1
    iget v0, p0, LL0/c;->j:I

    .line 2
    .line 3
    invoke-interface {p1, v0}, LF0/s;->i(I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput p1, p0, LL0/c;->j:I

    .line 8
    .line 9
    const/4 p1, 0x3

    .line 10
    iput p1, p0, LL0/c;->g:I

    .line 11
    .line 12
    return-void
.end method

.method public release()V
    .locals 0

    .line 1
    return-void
.end method
