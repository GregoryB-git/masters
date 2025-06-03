.class public final LN0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/r;


# instance fields
.field public final a:Lg0/z;

.field public b:LF0/t;

.field public c:I

.field public d:I

.field public e:I

.field public f:J

.field public g:LU0/a;

.field public h:LF0/s;

.field public i:LN0/d;

.field public j:LZ0/m;


# direct methods
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
    const/4 v1, 0x6

    .line 7
    invoke-direct {v0, v1}, Lg0/z;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LN0/b;->a:Lg0/z;

    .line 11
    .line 12
    const-wide/16 v0, -0x1

    .line 13
    .line 14
    iput-wide v0, p0, LN0/b;->f:J

    .line 15
    .line 16
    return-void
.end method

.method public static h(Ljava/lang/String;J)LU0/a;
    .locals 2

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-static {p0}, LN0/f;->a(Ljava/lang/String;)LN0/c;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-nez p0, :cond_1

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_1
    invoke-virtual {p0, p1, p2}, LN0/c;->a(J)LU0/a;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method private m(LF0/s;)V
    .locals 5

    .line 1
    iget v0, p0, LN0/b;->d:I

    .line 2
    .line 3
    const v1, 0xffe1

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    new-instance v0, Lg0/z;

    .line 10
    .line 11
    iget v1, p0, LN0/b;->e:I

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lg0/z;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget v3, p0, LN0/b;->e:I

    .line 21
    .line 22
    invoke-interface {p1, v1, v2, v3}, LF0/s;->readFully([BII)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, LN0/b;->g:LU0/a;

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    const-string v1, "http://ns.adobe.com/xap/1.0/"

    .line 30
    .line 31
    invoke-virtual {v0}, Lg0/z;->A()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, Lg0/z;->A()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-interface {p1}, LF0/s;->a()J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    invoke-static {v0, v3, v4}, LN0/b;->h(Ljava/lang/String;J)LU0/a;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, LN0/b;->g:LU0/a;

    .line 56
    .line 57
    if-eqz p1, :cond_1

    .line 58
    .line 59
    iget-wide v0, p1, LU0/a;->r:J

    .line 60
    .line 61
    iput-wide v0, p0, LN0/b;->f:J

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    iget v0, p0, LN0/b;->e:I

    .line 65
    .line 66
    invoke-interface {p1, v0}, LF0/s;->i(I)V

    .line 67
    .line 68
    .line 69
    :cond_1
    :goto_0
    iput v2, p0, LN0/b;->c:I

    .line 70
    .line 71
    return-void
.end method


# virtual methods
.method public a(JJ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput p1, p0, LN0/b;->c:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, LN0/b;->j:LZ0/m;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v0, p0, LN0/b;->c:I

    .line 15
    .line 16
    const/4 v1, 0x5

    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, LN0/b;->j:LZ0/m;

    .line 20
    .line 21
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, LZ0/m;

    .line 26
    .line 27
    invoke-virtual {v0, p1, p2, p3, p4}, LZ0/m;->a(JJ)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    return-void
.end method

.method public b(LF0/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN0/b;->b:LF0/t;

    .line 2
    .line 3
    return-void
.end method

.method public final c(LF0/s;)V
    .locals 3

    .line 1
    iget-object v0, p0, LN0/b;->a:Lg0/z;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Lg0/z;->P(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LN0/b;->a:Lg0/z;

    .line 8
    .line 9
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-interface {p1, v0, v2, v1}, LF0/s;->n([BII)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, LN0/b;->a:Lg0/z;

    .line 18
    .line 19
    invoke-virtual {v0}, Lg0/z;->M()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sub-int/2addr v0, v1

    .line 24
    invoke-interface {p1, v0}, LF0/s;->o(I)V

    .line 25
    .line 26
    .line 27
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
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, LN0/b;->k(LF0/s;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0xffd8

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    return v2

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, LN0/b;->k(LF0/s;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, LN0/b;->d:I

    .line 17
    .line 18
    const v1, 0xffe0

    .line 19
    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, p1}, LN0/b;->c(LF0/s;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, LN0/b;->k(LF0/s;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iput v0, p0, LN0/b;->d:I

    .line 31
    .line 32
    :cond_1
    iget v0, p0, LN0/b;->d:I

    .line 33
    .line 34
    const v1, 0xffe1

    .line 35
    .line 36
    .line 37
    if-eq v0, v1, :cond_2

    .line 38
    .line 39
    return v2

    .line 40
    :cond_2
    const/4 v0, 0x2

    .line 41
    invoke-interface {p1, v0}, LF0/s;->o(I)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, LN0/b;->a:Lg0/z;

    .line 45
    .line 46
    const/4 v1, 0x6

    .line 47
    invoke-virtual {v0, v1}, Lg0/z;->P(I)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, LN0/b;->a:Lg0/z;

    .line 51
    .line 52
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {p1, v0, v2, v1}, LF0/s;->n([BII)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, LN0/b;->a:Lg0/z;

    .line 60
    .line 61
    invoke-virtual {p1}, Lg0/z;->I()J

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    const-wide/32 v3, 0x45786966    # 5.758429993E-315

    .line 66
    .line 67
    .line 68
    cmp-long p1, v0, v3

    .line 69
    .line 70
    if-nez p1, :cond_3

    .line 71
    .line 72
    iget-object p1, p0, LN0/b;->a:Lg0/z;

    .line 73
    .line 74
    invoke-virtual {p1}, Lg0/z;->M()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_3

    .line 79
    .line 80
    const/4 v2, 0x1

    .line 81
    :cond_3
    return v2
.end method

.method public final f()V
    .locals 4

    .line 1
    iget-object v0, p0, LN0/b;->b:LF0/t;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LF0/t;

    .line 8
    .line 9
    invoke-interface {v0}, LF0/t;->j()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LN0/b;->b:LF0/t;

    .line 13
    .line 14
    new-instance v1, LF0/M$b;

    .line 15
    .line 16
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2, v3}, LF0/M$b;-><init>(J)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, LF0/t;->e(LF0/M;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x6

    .line 28
    iput v0, p0, LN0/b;->c:I

    .line 29
    .line 30
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

.method public i(LF0/s;LF0/L;)I
    .locals 7

    .line 1
    iget v0, p0, LN0/b;->c:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_9

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-eq v0, v2, :cond_8

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    if-eq v0, v3, :cond_7

    .line 11
    .line 12
    const/4 v3, 0x4

    .line 13
    if-eq v0, v3, :cond_5

    .line 14
    .line 15
    const/4 v1, 0x5

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x6

    .line 19
    if-ne v0, p1, :cond_0

    .line 20
    .line 21
    const/4 p1, -0x1

    .line 22
    return p1

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    iget-object v0, p0, LN0/b;->i:LN0/d;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, LN0/b;->h:LF0/s;

    .line 34
    .line 35
    if-eq p1, v0, :cond_3

    .line 36
    .line 37
    :cond_2
    iput-object p1, p0, LN0/b;->h:LF0/s;

    .line 38
    .line 39
    new-instance v0, LN0/d;

    .line 40
    .line 41
    iget-wide v3, p0, LN0/b;->f:J

    .line 42
    .line 43
    invoke-direct {v0, p1, v3, v4}, LN0/d;-><init>(LF0/s;J)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, LN0/b;->i:LN0/d;

    .line 47
    .line 48
    :cond_3
    iget-object p1, p0, LN0/b;->j:LZ0/m;

    .line 49
    .line 50
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, LZ0/m;

    .line 55
    .line 56
    iget-object v0, p0, LN0/b;->i:LN0/d;

    .line 57
    .line 58
    invoke-virtual {p1, v0, p2}, LZ0/m;->i(LF0/s;LF0/L;)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-ne p1, v2, :cond_4

    .line 63
    .line 64
    iget-wide v0, p2, LF0/L;->a:J

    .line 65
    .line 66
    iget-wide v2, p0, LN0/b;->f:J

    .line 67
    .line 68
    add-long/2addr v0, v2

    .line 69
    iput-wide v0, p2, LF0/L;->a:J

    .line 70
    .line 71
    :cond_4
    return p1

    .line 72
    :cond_5
    invoke-interface {p1}, LF0/s;->p()J

    .line 73
    .line 74
    .line 75
    move-result-wide v3

    .line 76
    iget-wide v5, p0, LN0/b;->f:J

    .line 77
    .line 78
    cmp-long v0, v3, v5

    .line 79
    .line 80
    if-eqz v0, :cond_6

    .line 81
    .line 82
    iput-wide v5, p2, LF0/L;->a:J

    .line 83
    .line 84
    return v2

    .line 85
    :cond_6
    invoke-virtual {p0, p1}, LN0/b;->o(LF0/s;)V

    .line 86
    .line 87
    .line 88
    return v1

    .line 89
    :cond_7
    invoke-direct {p0, p1}, LN0/b;->m(LF0/s;)V

    .line 90
    .line 91
    .line 92
    return v1

    .line 93
    :cond_8
    invoke-virtual {p0, p1}, LN0/b;->n(LF0/s;)V

    .line 94
    .line 95
    .line 96
    return v1

    .line 97
    :cond_9
    invoke-virtual {p0, p1}, LN0/b;->l(LF0/s;)V

    .line 98
    .line 99
    .line 100
    return v1
.end method

.method public final j(LU0/a;)V
    .locals 5

    .line 1
    iget-object v0, p0, LN0/b;->b:LF0/t;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LF0/t;

    .line 8
    .line 9
    const/16 v1, 0x400

    .line 10
    .line 11
    const/4 v2, 0x4

    .line 12
    invoke-interface {v0, v1, v2}, LF0/t;->a(II)LF0/T;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Ld0/q$b;

    .line 17
    .line 18
    invoke-direct {v1}, Ld0/q$b;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v2, "image/jpeg"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ld0/q$b;->Q(Ljava/lang/String;)Ld0/q$b;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-instance v2, Ld0/x;

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    new-array v3, v3, [Ld0/x$b;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    aput-object p1, v3, v4

    .line 34
    .line 35
    invoke-direct {v2, v3}, Ld0/x;-><init>([Ld0/x$b;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ld0/q$b;->h0(Ld0/x;)Ld0/q$b;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ld0/q$b;->K()Ld0/q;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {v0, p1}, LF0/T;->d(Ld0/q;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final k(LF0/s;)I
    .locals 3

    .line 1
    iget-object v0, p0, LN0/b;->a:Lg0/z;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Lg0/z;->P(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LN0/b;->a:Lg0/z;

    .line 8
    .line 9
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-interface {p1, v0, v2, v1}, LF0/s;->n([BII)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, LN0/b;->a:Lg0/z;

    .line 18
    .line 19
    invoke-virtual {p1}, Lg0/z;->M()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1
.end method

.method public final l(LF0/s;)V
    .locals 4

    .line 1
    iget-object v0, p0, LN0/b;->a:Lg0/z;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Lg0/z;->P(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LN0/b;->a:Lg0/z;

    .line 8
    .line 9
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-interface {p1, v0, v2, v1}, LF0/s;->readFully([BII)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, LN0/b;->a:Lg0/z;

    .line 18
    .line 19
    invoke-virtual {p1}, Lg0/z;->M()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iput p1, p0, LN0/b;->d:I

    .line 24
    .line 25
    const v0, 0xffda

    .line 26
    .line 27
    .line 28
    if-ne p1, v0, :cond_1

    .line 29
    .line 30
    iget-wide v0, p0, LN0/b;->f:J

    .line 31
    .line 32
    const-wide/16 v2, -0x1

    .line 33
    .line 34
    cmp-long p1, v0, v2

    .line 35
    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    const/4 p1, 0x4

    .line 39
    :goto_0
    iput p1, p0, LN0/b;->c:I

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    invoke-virtual {p0}, LN0/b;->f()V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const v0, 0xffd0

    .line 47
    .line 48
    .line 49
    if-lt p1, v0, :cond_2

    .line 50
    .line 51
    const v0, 0xffd9

    .line 52
    .line 53
    .line 54
    if-le p1, v0, :cond_3

    .line 55
    .line 56
    :cond_2
    const v0, 0xff01

    .line 57
    .line 58
    .line 59
    if-eq p1, v0, :cond_3

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    goto :goto_0

    .line 63
    :cond_3
    :goto_1
    return-void
.end method

.method public final n(LF0/s;)V
    .locals 3

    .line 1
    iget-object v0, p0, LN0/b;->a:Lg0/z;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Lg0/z;->P(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LN0/b;->a:Lg0/z;

    .line 8
    .line 9
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-interface {p1, v0, v2, v1}, LF0/s;->readFully([BII)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, LN0/b;->a:Lg0/z;

    .line 18
    .line 19
    invoke-virtual {p1}, Lg0/z;->M()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    sub-int/2addr p1, v1

    .line 24
    iput p1, p0, LN0/b;->e:I

    .line 25
    .line 26
    iput v1, p0, LN0/b;->c:I

    .line 27
    .line 28
    return-void
.end method

.method public final o(LF0/s;)V
    .locals 4

    .line 1
    iget-object v0, p0, LN0/b;->a:Lg0/z;

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
    const/4 v2, 0x1

    .line 9
    invoke-interface {p1, v0, v1, v2, v2}, LF0/s;->l([BIIZ)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, LN0/b;->f()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-interface {p1}, LF0/s;->h()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, LN0/b;->j:LZ0/m;

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    new-instance v0, LZ0/m;

    .line 27
    .line 28
    sget-object v1, Lc1/t$a;->a:Lc1/t$a;

    .line 29
    .line 30
    const/16 v2, 0x8

    .line 31
    .line 32
    invoke-direct {v0, v1, v2}, LZ0/m;-><init>(Lc1/t$a;I)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, LN0/b;->j:LZ0/m;

    .line 36
    .line 37
    :cond_2
    new-instance v0, LN0/d;

    .line 38
    .line 39
    iget-wide v1, p0, LN0/b;->f:J

    .line 40
    .line 41
    invoke-direct {v0, p1, v1, v2}, LN0/d;-><init>(LF0/s;J)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, LN0/b;->i:LN0/d;

    .line 45
    .line 46
    iget-object p1, p0, LN0/b;->j:LZ0/m;

    .line 47
    .line 48
    invoke-virtual {p1, v0}, LZ0/m;->e(LF0/s;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_0

    .line 53
    .line 54
    iget-object p1, p0, LN0/b;->j:LZ0/m;

    .line 55
    .line 56
    new-instance v0, LN0/e;

    .line 57
    .line 58
    iget-wide v1, p0, LN0/b;->f:J

    .line 59
    .line 60
    iget-object v3, p0, LN0/b;->b:LF0/t;

    .line 61
    .line 62
    invoke-static {v3}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, LF0/t;

    .line 67
    .line 68
    invoke-direct {v0, v1, v2, v3}, LN0/e;-><init>(JLF0/t;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, LZ0/m;->b(LF0/t;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, LN0/b;->p()V

    .line 75
    .line 76
    .line 77
    :goto_0
    return-void
.end method

.method public final p()V
    .locals 1

    .line 1
    iget-object v0, p0, LN0/b;->g:LU0/a;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LU0/a;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, LN0/b;->j(LU0/a;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x5

    .line 13
    iput v0, p0, LN0/b;->c:I

    .line 14
    .line 15
    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    iget-object v0, p0, LN0/b;->j:LZ0/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, LZ0/m;->release()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
