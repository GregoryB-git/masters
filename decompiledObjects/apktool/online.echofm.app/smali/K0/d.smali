.class public final LK0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/r;


# static fields
.field public static final o:LF0/x;


# instance fields
.field public final a:[B

.field public final b:Lg0/z;

.field public final c:Z

.field public final d:LF0/y$a;

.field public e:LF0/t;

.field public f:LF0/T;

.field public g:I

.field public h:Ld0/x;

.field public i:LF0/B;

.field public j:I

.field public k:I

.field public l:LK0/b;

.field public m:I

.field public n:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LK0/c;

    .line 2
    .line 3
    invoke-direct {v0}, LK0/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LK0/d;->o:LF0/x;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, LK0/d;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2a

    new-array v0, v0, [B

    iput-object v0, p0, LK0/d;->a:[B

    new-instance v0, Lg0/z;

    const v1, 0x8000

    new-array v1, v1, [B

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg0/z;-><init>([BI)V

    iput-object v0, p0, LK0/d;->b:Lg0/z;

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p0, LK0/d;->c:Z

    new-instance p1, LF0/y$a;

    invoke-direct {p1}, LF0/y$a;-><init>()V

    iput-object p1, p0, LK0/d;->d:LF0/y$a;

    iput v2, p0, LK0/d;->g:I

    return-void
.end method

.method public static synthetic c()[LF0/r;
    .locals 1

    .line 1
    invoke-static {}, LK0/d;->l()[LF0/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static synthetic l()[LF0/r;
    .locals 3

    .line 1
    new-instance v0, LK0/d;

    .line 2
    .line 3
    invoke-direct {v0}, LK0/d;-><init>()V

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
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    iput p2, p0, LK0/d;->g:I

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, LK0/d;->l:LK0/b;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1, p3, p4}, LF0/e;->h(J)V

    .line 16
    .line 17
    .line 18
    :cond_1
    :goto_0
    cmp-long p1, p3, v0

    .line 19
    .line 20
    if-nez p1, :cond_2

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    const-wide/16 v0, -0x1

    .line 24
    .line 25
    :goto_1
    iput-wide v0, p0, LK0/d;->n:J

    .line 26
    .line 27
    iput p2, p0, LK0/d;->m:I

    .line 28
    .line 29
    iget-object p1, p0, LK0/d;->b:Lg0/z;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lg0/z;->P(I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public b(LF0/t;)V
    .locals 2

    .line 1
    iput-object p1, p0, LK0/d;->e:LF0/t;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-interface {p1, v0, v1}, LF0/t;->a(II)LF0/T;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LK0/d;->f:LF0/T;

    .line 10
    .line 11
    invoke-interface {p1}, LF0/t;->j()V

    .line 12
    .line 13
    .line 14
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
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0}, LF0/z;->c(LF0/s;Z)Ld0/x;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, LF0/z;->a(LF0/s;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final f(Lg0/z;Z)J
    .locals 4

    .line 1
    iget-object v0, p0, LK0/d;->i:LF0/B;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lg0/z;->f()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    :goto_0
    invoke-virtual {p1}, Lg0/z;->g()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/lit8 v1, v1, -0x10

    .line 15
    .line 16
    if-gt v0, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lg0/z;->T(I)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, LK0/d;->i:LF0/B;

    .line 22
    .line 23
    iget v2, p0, LK0/d;->k:I

    .line 24
    .line 25
    iget-object v3, p0, LK0/d;->d:LF0/y$a;

    .line 26
    .line 27
    invoke-static {p1, v1, v2, v3}, LF0/y;->d(Lg0/z;LF0/B;ILF0/y$a;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    :goto_1
    invoke-virtual {p1, v0}, Lg0/z;->T(I)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, LK0/d;->d:LF0/y$a;

    .line 37
    .line 38
    iget-wide p1, p1, LF0/y$a;->a:J

    .line 39
    .line 40
    return-wide p1

    .line 41
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    if-eqz p2, :cond_5

    .line 45
    .line 46
    :goto_2
    invoke-virtual {p1}, Lg0/z;->g()I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    iget v1, p0, LK0/d;->j:I

    .line 51
    .line 52
    sub-int/2addr p2, v1

    .line 53
    if-gt v0, p2, :cond_4

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lg0/z;->T(I)V

    .line 56
    .line 57
    .line 58
    :try_start_0
    iget-object p2, p0, LK0/d;->i:LF0/B;

    .line 59
    .line 60
    iget v1, p0, LK0/d;->k:I

    .line 61
    .line 62
    iget-object v2, p0, LK0/d;->d:LF0/y$a;

    .line 63
    .line 64
    invoke-static {p1, p2, v1, v2}, LF0/y;->d(Lg0/z;LF0/B;ILF0/y$a;)Z

    .line 65
    .line 66
    .line 67
    move-result p2
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    goto :goto_3

    .line 69
    :catch_0
    const/4 p2, 0x0

    .line 70
    :goto_3
    invoke-virtual {p1}, Lg0/z;->f()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-virtual {p1}, Lg0/z;->g()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-le v1, v2, :cond_2

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_2
    if-eqz p2, :cond_3

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    :goto_4
    add-int/lit8 v0, v0, 0x1

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    invoke-virtual {p1}, Lg0/z;->g()I

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    invoke-virtual {p1, p2}, Lg0/z;->T(I)V

    .line 92
    .line 93
    .line 94
    goto :goto_5

    .line 95
    :cond_5
    invoke-virtual {p1, v0}, Lg0/z;->T(I)V

    .line 96
    .line 97
    .line 98
    :goto_5
    const-wide/16 p1, -0x1

    .line 99
    .line 100
    return-wide p1
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

.method public final h(LF0/s;)V
    .locals 5

    .line 1
    invoke-static {p1}, LF0/z;->b(LF0/s;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, LK0/d;->k:I

    .line 6
    .line 7
    iget-object v0, p0, LK0/d;->e:LF0/t;

    .line 8
    .line 9
    invoke-static {v0}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, LF0/t;

    .line 14
    .line 15
    invoke-interface {p1}, LF0/s;->p()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    invoke-interface {p1}, LF0/s;->a()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    invoke-virtual {p0, v1, v2, v3, v4}, LK0/d;->j(JJ)LF0/M;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {v0, p1}, LF0/t;->e(LF0/M;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x5

    .line 31
    iput p1, p0, LK0/d;->g:I

    .line 32
    .line 33
    return-void
.end method

.method public i(LF0/s;LF0/L;)I
    .locals 3

    .line 1
    iget v0, p0, LK0/d;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-eq v0, v2, :cond_4

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    if-eq v0, v2, :cond_3

    .line 11
    .line 12
    const/4 v2, 0x3

    .line 13
    if-eq v0, v2, :cond_2

    .line 14
    .line 15
    const/4 v2, 0x4

    .line 16
    if-eq v0, v2, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x5

    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, p1, p2}, LK0/d;->n(LF0/s;LF0/L;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-virtual {p0, p1}, LK0/d;->h(LF0/s;)V

    .line 33
    .line 34
    .line 35
    return v1

    .line 36
    :cond_2
    invoke-virtual {p0, p1}, LK0/d;->p(LF0/s;)V

    .line 37
    .line 38
    .line 39
    return v1

    .line 40
    :cond_3
    invoke-virtual {p0, p1}, LK0/d;->q(LF0/s;)V

    .line 41
    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    invoke-virtual {p0, p1}, LK0/d;->k(LF0/s;)V

    .line 45
    .line 46
    .line 47
    return v1

    .line 48
    :cond_5
    invoke-virtual {p0, p1}, LK0/d;->o(LF0/s;)V

    .line 49
    .line 50
    .line 51
    return v1
.end method

.method public final j(JJ)LF0/M;
    .locals 8

    .line 1
    iget-object v0, p0, LK0/d;->i:LF0/B;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, LK0/d;->i:LF0/B;

    .line 7
    .line 8
    iget-object v0, v2, LF0/B;->k:LF0/B$a;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance p3, LF0/A;

    .line 13
    .line 14
    invoke-direct {p3, v2, p1, p2}, LF0/A;-><init>(LF0/B;J)V

    .line 15
    .line 16
    .line 17
    return-object p3

    .line 18
    :cond_0
    const-wide/16 v0, -0x1

    .line 19
    .line 20
    cmp-long v0, p3, v0

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-wide v0, v2, LF0/B;->j:J

    .line 25
    .line 26
    const-wide/16 v3, 0x0

    .line 27
    .line 28
    cmp-long v0, v0, v3

    .line 29
    .line 30
    if-lez v0, :cond_1

    .line 31
    .line 32
    new-instance v0, LK0/b;

    .line 33
    .line 34
    iget v3, p0, LK0/d;->k:I

    .line 35
    .line 36
    move-object v1, v0

    .line 37
    move-wide v4, p1

    .line 38
    move-wide v6, p3

    .line 39
    invoke-direct/range {v1 .. v7}, LK0/b;-><init>(LF0/B;IJJ)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, LK0/d;->l:LK0/b;

    .line 43
    .line 44
    invoke-virtual {v0}, LF0/e;->b()LF0/M;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_1
    new-instance p1, LF0/M$b;

    .line 50
    .line 51
    invoke-virtual {v2}, LF0/B;->f()J

    .line 52
    .line 53
    .line 54
    move-result-wide p2

    .line 55
    invoke-direct {p1, p2, p3}, LF0/M$b;-><init>(J)V

    .line 56
    .line 57
    .line 58
    return-object p1
.end method

.method public final k(LF0/s;)V
    .locals 3

    .line 1
    iget-object v0, p0, LK0/d;->a:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    array-length v2, v0

    .line 5
    invoke-interface {p1, v0, v1, v2}, LF0/s;->n([BII)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, LF0/s;->h()V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    iput p1, p0, LK0/d;->g:I

    .line 13
    .line 14
    return-void
.end method

.method public final m()V
    .locals 11

    .line 1
    iget-wide v0, p0, LK0/d;->n:J

    .line 2
    .line 3
    const-wide/32 v2, 0xf4240

    .line 4
    .line 5
    .line 6
    mul-long/2addr v0, v2

    .line 7
    iget-object v2, p0, LK0/d;->i:LF0/B;

    .line 8
    .line 9
    invoke-static {v2}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, LF0/B;

    .line 14
    .line 15
    iget v2, v2, LF0/B;->e:I

    .line 16
    .line 17
    int-to-long v2, v2

    .line 18
    div-long v5, v0, v2

    .line 19
    .line 20
    iget-object v0, p0, LK0/d;->f:LF0/T;

    .line 21
    .line 22
    invoke-static {v0}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    move-object v4, v0

    .line 27
    check-cast v4, LF0/T;

    .line 28
    .line 29
    iget v8, p0, LK0/d;->m:I

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const/4 v10, 0x0

    .line 33
    const/4 v7, 0x1

    .line 34
    invoke-interface/range {v4 .. v10}, LF0/T;->b(JIIILF0/T$a;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final n(LF0/s;LF0/L;)I
    .locals 6

    .line 1
    iget-object v0, p0, LK0/d;->f:LF0/T;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LK0/d;->i:LF0/B;

    .line 7
    .line 8
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LK0/d;->l:LK0/b;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, LF0/e;->d()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, LK0/d;->l:LK0/b;

    .line 22
    .line 23
    invoke-virtual {v0, p1, p2}, LF0/e;->c(LF0/s;LF0/L;)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_0
    iget-wide v0, p0, LK0/d;->n:J

    .line 29
    .line 30
    const-wide/16 v2, -0x1

    .line 31
    .line 32
    cmp-long p2, v0, v2

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    if-nez p2, :cond_1

    .line 36
    .line 37
    iget-object p2, p0, LK0/d;->i:LF0/B;

    .line 38
    .line 39
    invoke-static {p1, p2}, LF0/y;->i(LF0/s;LF0/B;)J

    .line 40
    .line 41
    .line 42
    move-result-wide p1

    .line 43
    iput-wide p1, p0, LK0/d;->n:J

    .line 44
    .line 45
    return v0

    .line 46
    :cond_1
    iget-object p2, p0, LK0/d;->b:Lg0/z;

    .line 47
    .line 48
    invoke-virtual {p2}, Lg0/z;->g()I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    const v1, 0x8000

    .line 53
    .line 54
    .line 55
    if-ge p2, v1, :cond_4

    .line 56
    .line 57
    iget-object v4, p0, LK0/d;->b:Lg0/z;

    .line 58
    .line 59
    invoke-virtual {v4}, Lg0/z;->e()[B

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    sub-int/2addr v1, p2

    .line 64
    invoke-interface {p1, v4, p2, v1}, LF0/s;->read([BII)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    const/4 v1, -0x1

    .line 69
    if-ne p1, v1, :cond_2

    .line 70
    .line 71
    const/4 v4, 0x1

    .line 72
    goto :goto_0

    .line 73
    :cond_2
    move v4, v0

    .line 74
    :goto_0
    if-nez v4, :cond_3

    .line 75
    .line 76
    iget-object v1, p0, LK0/d;->b:Lg0/z;

    .line 77
    .line 78
    add-int/2addr p2, p1

    .line 79
    invoke-virtual {v1, p2}, Lg0/z;->S(I)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    iget-object p1, p0, LK0/d;->b:Lg0/z;

    .line 84
    .line 85
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-nez p1, :cond_5

    .line 90
    .line 91
    invoke-virtual {p0}, LK0/d;->m()V

    .line 92
    .line 93
    .line 94
    return v1

    .line 95
    :cond_4
    move v4, v0

    .line 96
    :cond_5
    :goto_1
    iget-object p1, p0, LK0/d;->b:Lg0/z;

    .line 97
    .line 98
    invoke-virtual {p1}, Lg0/z;->f()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    iget p2, p0, LK0/d;->m:I

    .line 103
    .line 104
    iget v1, p0, LK0/d;->j:I

    .line 105
    .line 106
    if-ge p2, v1, :cond_6

    .line 107
    .line 108
    iget-object v5, p0, LK0/d;->b:Lg0/z;

    .line 109
    .line 110
    sub-int/2addr v1, p2

    .line 111
    invoke-virtual {v5}, Lg0/z;->a()I

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    invoke-virtual {v5, p2}, Lg0/z;->U(I)V

    .line 120
    .line 121
    .line 122
    :cond_6
    iget-object p2, p0, LK0/d;->b:Lg0/z;

    .line 123
    .line 124
    invoke-virtual {p0, p2, v4}, LK0/d;->f(Lg0/z;Z)J

    .line 125
    .line 126
    .line 127
    move-result-wide v4

    .line 128
    iget-object p2, p0, LK0/d;->b:Lg0/z;

    .line 129
    .line 130
    invoke-virtual {p2}, Lg0/z;->f()I

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    sub-int/2addr p2, p1

    .line 135
    iget-object v1, p0, LK0/d;->b:Lg0/z;

    .line 136
    .line 137
    invoke-virtual {v1, p1}, Lg0/z;->T(I)V

    .line 138
    .line 139
    .line 140
    iget-object p1, p0, LK0/d;->f:LF0/T;

    .line 141
    .line 142
    iget-object v1, p0, LK0/d;->b:Lg0/z;

    .line 143
    .line 144
    invoke-interface {p1, v1, p2}, LF0/T;->e(Lg0/z;I)V

    .line 145
    .line 146
    .line 147
    iget p1, p0, LK0/d;->m:I

    .line 148
    .line 149
    add-int/2addr p1, p2

    .line 150
    iput p1, p0, LK0/d;->m:I

    .line 151
    .line 152
    cmp-long p1, v4, v2

    .line 153
    .line 154
    if-eqz p1, :cond_7

    .line 155
    .line 156
    invoke-virtual {p0}, LK0/d;->m()V

    .line 157
    .line 158
    .line 159
    iput v0, p0, LK0/d;->m:I

    .line 160
    .line 161
    iput-wide v4, p0, LK0/d;->n:J

    .line 162
    .line 163
    :cond_7
    iget-object p1, p0, LK0/d;->b:Lg0/z;

    .line 164
    .line 165
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    const/16 p2, 0x10

    .line 170
    .line 171
    if-ge p1, p2, :cond_8

    .line 172
    .line 173
    iget-object p1, p0, LK0/d;->b:Lg0/z;

    .line 174
    .line 175
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    iget-object p2, p0, LK0/d;->b:Lg0/z;

    .line 180
    .line 181
    invoke-virtual {p2}, Lg0/z;->e()[B

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    iget-object v1, p0, LK0/d;->b:Lg0/z;

    .line 186
    .line 187
    invoke-virtual {v1}, Lg0/z;->f()I

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    iget-object v2, p0, LK0/d;->b:Lg0/z;

    .line 192
    .line 193
    invoke-virtual {v2}, Lg0/z;->e()[B

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-static {p2, v1, v2, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 198
    .line 199
    .line 200
    iget-object p2, p0, LK0/d;->b:Lg0/z;

    .line 201
    .line 202
    invoke-virtual {p2, v0}, Lg0/z;->T(I)V

    .line 203
    .line 204
    .line 205
    iget-object p2, p0, LK0/d;->b:Lg0/z;

    .line 206
    .line 207
    invoke-virtual {p2, p1}, Lg0/z;->S(I)V

    .line 208
    .line 209
    .line 210
    :cond_8
    return v0
.end method

.method public final o(LF0/s;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LK0/d;->c:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {p1, v0}, LF0/z;->d(LF0/s;Z)Ld0/x;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, LK0/d;->h:Ld0/x;

    .line 10
    .line 11
    iput v1, p0, LK0/d;->g:I

    .line 12
    .line 13
    return-void
.end method

.method public final p(LF0/s;)V
    .locals 3

    .line 1
    new-instance v0, LF0/z$a;

    .line 2
    .line 3
    iget-object v1, p0, LK0/d;->i:LF0/B;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LF0/z$a;-><init>(LF0/B;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-static {p1, v0}, LF0/z;->e(LF0/s;LF0/z$a;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, v0, LF0/z$a;->a:LF0/B;

    .line 16
    .line 17
    invoke-static {v2}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, LF0/B;

    .line 22
    .line 23
    iput-object v2, p0, LK0/d;->i:LF0/B;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object p1, p0, LK0/d;->i:LF0/B;

    .line 27
    .line 28
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, LK0/d;->i:LF0/B;

    .line 32
    .line 33
    iget p1, p1, LF0/B;->c:I

    .line 34
    .line 35
    const/4 v0, 0x6

    .line 36
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iput p1, p0, LK0/d;->j:I

    .line 41
    .line 42
    iget-object p1, p0, LK0/d;->f:LF0/T;

    .line 43
    .line 44
    invoke-static {p1}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, LF0/T;

    .line 49
    .line 50
    iget-object v0, p0, LK0/d;->i:LF0/B;

    .line 51
    .line 52
    iget-object v1, p0, LK0/d;->a:[B

    .line 53
    .line 54
    iget-object v2, p0, LK0/d;->h:Ld0/x;

    .line 55
    .line 56
    invoke-virtual {v0, v1, v2}, LF0/B;->g([BLd0/x;)Ld0/q;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {p1, v0}, LF0/T;->d(Ld0/q;)V

    .line 61
    .line 62
    .line 63
    const/4 p1, 0x4

    .line 64
    iput p1, p0, LK0/d;->g:I

    .line 65
    .line 66
    return-void
.end method

.method public final q(LF0/s;)V
    .locals 0

    .line 1
    invoke-static {p1}, LF0/z;->i(LF0/s;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x3

    .line 5
    iput p1, p0, LK0/d;->g:I

    .line 6
    .line 7
    return-void
.end method

.method public release()V
    .locals 0

    .line 1
    return-void
.end method
