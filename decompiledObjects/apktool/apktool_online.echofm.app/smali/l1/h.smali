.class public final Ll1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/r;


# static fields
.field public static final m:LF0/x;


# instance fields
.field public final a:I

.field public final b:Ll1/i;

.field public final c:Lg0/z;

.field public final d:Lg0/z;

.field public final e:Lg0/y;

.field public f:LF0/t;

.field public g:J

.field public h:J

.field public i:I

.field public j:Z

.field public k:Z

.field public l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ll1/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ll1/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ll1/h;->m:LF0/x;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ll1/h;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 p1, p1, 0x1

    :cond_0
    iput p1, p0, Ll1/h;->a:I

    new-instance p1, Ll1/i;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ll1/i;-><init>(Z)V

    iput-object p1, p0, Ll1/h;->b:Ll1/i;

    new-instance p1, Lg0/z;

    const/16 v0, 0x800

    invoke-direct {p1, v0}, Lg0/z;-><init>(I)V

    iput-object p1, p0, Ll1/h;->c:Lg0/z;

    const/4 p1, -0x1

    iput p1, p0, Ll1/h;->i:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Ll1/h;->h:J

    new-instance p1, Lg0/z;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lg0/z;-><init>(I)V

    iput-object p1, p0, Ll1/h;->d:Lg0/z;

    new-instance v0, Lg0/y;

    invoke-virtual {p1}, Lg0/z;->e()[B

    move-result-object p1

    invoke-direct {v0, p1}, Lg0/y;-><init>([B)V

    iput-object v0, p0, Ll1/h;->e:Lg0/y;

    return-void
.end method

.method public static synthetic c()[LF0/r;
    .locals 1

    .line 1
    invoke-static {}, Ll1/h;->k()[LF0/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static h(IJ)I
    .locals 4

    .line 1
    int-to-long v0, p0

    .line 2
    const-wide/32 v2, 0x7a1200

    .line 3
    .line 4
    .line 5
    mul-long/2addr v0, v2

    .line 6
    div-long/2addr v0, p1

    .line 7
    long-to-int p0, v0

    .line 8
    return p0
.end method

.method private j(JZ)LF0/M;
    .locals 11

    .line 1
    iget v0, p0, Ll1/h;->i:I

    .line 2
    .line 3
    iget-object v1, p0, Ll1/h;->b:Ll1/i;

    .line 4
    .line 5
    invoke-virtual {v1}, Ll1/i;->k()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-static {v0, v1, v2}, Ll1/h;->h(IJ)I

    .line 10
    .line 11
    .line 12
    move-result v8

    .line 13
    new-instance v0, LF0/i;

    .line 14
    .line 15
    iget-wide v6, p0, Ll1/h;->h:J

    .line 16
    .line 17
    iget v9, p0, Ll1/h;->i:I

    .line 18
    .line 19
    move-object v3, v0

    .line 20
    move-wide v4, p1

    .line 21
    move v10, p3

    .line 22
    invoke-direct/range {v3 .. v10}, LF0/i;-><init>(JJIIZ)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method private static synthetic k()[LF0/r;
    .locals 3

    .line 1
    new-instance v0, Ll1/h;

    .line 2
    .line 3
    invoke-direct {v0}, Ll1/h;-><init>()V

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
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Ll1/h;->k:Z

    .line 3
    .line 4
    iget-object p1, p0, Ll1/h;->b:Ll1/i;

    .line 5
    .line 6
    invoke-virtual {p1}, Ll1/i;->b()V

    .line 7
    .line 8
    .line 9
    iput-wide p3, p0, Ll1/h;->g:J

    .line 10
    .line 11
    return-void
.end method

.method public b(LF0/t;)V
    .locals 4

    .line 1
    iput-object p1, p0, Ll1/h;->f:LF0/t;

    .line 2
    .line 3
    iget-object v0, p0, Ll1/h;->b:Ll1/i;

    .line 4
    .line 5
    new-instance v1, Ll1/K$d;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    invoke-direct {v1, v2, v3}, Ll1/K$d;-><init>(II)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Ll1/i;->e(LF0/t;Ll1/K$d;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, LF0/t;->j()V

    .line 16
    .line 17
    .line 18
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
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, Ll1/h;->m(LF0/s;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v3, v0

    .line 7
    move v2, v1

    .line 8
    move v4, v2

    .line 9
    :cond_0
    iget-object v5, p0, Ll1/h;->d:Lg0/z;

    .line 10
    .line 11
    invoke-virtual {v5}, Lg0/z;->e()[B

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    const/4 v6, 0x2

    .line 16
    invoke-interface {p1, v5, v1, v6}, LF0/s;->n([BII)V

    .line 17
    .line 18
    .line 19
    iget-object v5, p0, Ll1/h;->d:Lg0/z;

    .line 20
    .line 21
    invoke-virtual {v5, v1}, Lg0/z;->T(I)V

    .line 22
    .line 23
    .line 24
    iget-object v5, p0, Ll1/h;->d:Lg0/z;

    .line 25
    .line 26
    invoke-virtual {v5}, Lg0/z;->M()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-static {v5}, Ll1/i;->m(I)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-nez v5, :cond_1

    .line 35
    .line 36
    :goto_0
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    invoke-interface {p1}, LF0/s;->h()V

    .line 39
    .line 40
    .line 41
    invoke-interface {p1, v3}, LF0/s;->o(I)V

    .line 42
    .line 43
    .line 44
    move v2, v1

    .line 45
    move v4, v2

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/4 v5, 0x1

    .line 48
    add-int/2addr v2, v5

    .line 49
    const/4 v6, 0x4

    .line 50
    if-lt v2, v6, :cond_2

    .line 51
    .line 52
    const/16 v7, 0xbc

    .line 53
    .line 54
    if-le v4, v7, :cond_2

    .line 55
    .line 56
    return v5

    .line 57
    :cond_2
    iget-object v5, p0, Ll1/h;->d:Lg0/z;

    .line 58
    .line 59
    invoke-virtual {v5}, Lg0/z;->e()[B

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-interface {p1, v5, v1, v6}, LF0/s;->n([BII)V

    .line 64
    .line 65
    .line 66
    iget-object v5, p0, Ll1/h;->e:Lg0/y;

    .line 67
    .line 68
    const/16 v6, 0xe

    .line 69
    .line 70
    invoke-virtual {v5, v6}, Lg0/y;->p(I)V

    .line 71
    .line 72
    .line 73
    iget-object v5, p0, Ll1/h;->e:Lg0/y;

    .line 74
    .line 75
    const/16 v6, 0xd

    .line 76
    .line 77
    invoke-virtual {v5, v6}, Lg0/y;->h(I)I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    const/4 v6, 0x6

    .line 82
    if-gt v5, v6, :cond_3

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    add-int/lit8 v6, v5, -0x6

    .line 86
    .line 87
    invoke-interface {p1, v6}, LF0/s;->o(I)V

    .line 88
    .line 89
    .line 90
    add-int/2addr v4, v5

    .line 91
    :goto_1
    sub-int v5, v3, v0

    .line 92
    .line 93
    const/16 v6, 0x2000

    .line 94
    .line 95
    if-lt v5, v6, :cond_0

    .line 96
    .line 97
    return v1
.end method

.method public final f(LF0/s;)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Ll1/h;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, -0x1

    .line 7
    iput v0, p0, Ll1/h;->i:I

    .line 8
    .line 9
    invoke-interface {p1}, LF0/s;->h()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, LF0/s;->p()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    cmp-long v1, v1, v3

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Ll1/h;->m(LF0/s;)I

    .line 23
    .line 24
    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    move v2, v1

    .line 27
    :cond_2
    const/4 v5, 0x1

    .line 28
    :try_start_0
    iget-object v6, p0, Ll1/h;->d:Lg0/z;

    .line 29
    .line 30
    invoke-virtual {v6}, Lg0/z;->e()[B

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    const/4 v7, 0x2

    .line 35
    invoke-interface {p1, v6, v1, v7, v5}, LF0/s;->l([BIIZ)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_7

    .line 40
    .line 41
    iget-object v6, p0, Ll1/h;->d:Lg0/z;

    .line 42
    .line 43
    invoke-virtual {v6, v1}, Lg0/z;->T(I)V

    .line 44
    .line 45
    .line 46
    iget-object v6, p0, Ll1/h;->d:Lg0/z;

    .line 47
    .line 48
    invoke-virtual {v6}, Lg0/z;->M()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    invoke-static {v6}, Ll1/i;->m(I)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-nez v6, :cond_3

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    iget-object v6, p0, Ll1/h;->d:Lg0/z;

    .line 60
    .line 61
    invoke-virtual {v6}, Lg0/z;->e()[B

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    const/4 v7, 0x4

    .line 66
    invoke-interface {p1, v6, v1, v7, v5}, LF0/s;->l([BIIZ)Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-nez v6, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    iget-object v6, p0, Ll1/h;->e:Lg0/y;

    .line 74
    .line 75
    const/16 v7, 0xe

    .line 76
    .line 77
    invoke-virtual {v6, v7}, Lg0/y;->p(I)V

    .line 78
    .line 79
    .line 80
    iget-object v6, p0, Ll1/h;->e:Lg0/y;

    .line 81
    .line 82
    const/16 v7, 0xd

    .line 83
    .line 84
    invoke-virtual {v6, v7}, Lg0/y;->h(I)I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    const/4 v7, 0x6

    .line 89
    if-le v6, v7, :cond_6

    .line 90
    .line 91
    int-to-long v7, v6

    .line 92
    add-long/2addr v3, v7

    .line 93
    add-int/lit8 v2, v2, 0x1

    .line 94
    .line 95
    const/16 v7, 0x3e8

    .line 96
    .line 97
    if-ne v2, v7, :cond_5

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_5
    add-int/lit8 v6, v6, -0x6

    .line 101
    .line 102
    invoke-interface {p1, v6, v5}, LF0/s;->j(IZ)Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    if-nez v6, :cond_2

    .line 107
    .line 108
    :goto_0
    goto :goto_1

    .line 109
    :cond_6
    iput-boolean v5, p0, Ll1/h;->j:Z

    .line 110
    .line 111
    const-string v1, "Malformed ADTS stream"

    .line 112
    .line 113
    const/4 v6, 0x0

    .line 114
    invoke-static {v1, v6}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    throw v1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    :catch_0
    :cond_7
    :goto_1
    move v1, v2

    .line 120
    :goto_2
    invoke-interface {p1}, LF0/s;->h()V

    .line 121
    .line 122
    .line 123
    if-lez v1, :cond_8

    .line 124
    .line 125
    int-to-long v0, v1

    .line 126
    div-long/2addr v3, v0

    .line 127
    long-to-int p1, v3

    .line 128
    iput p1, p0, Ll1/h;->i:I

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_8
    iput v0, p0, Ll1/h;->i:I

    .line 132
    .line 133
    :goto_3
    iput-boolean v5, p0, Ll1/h;->j:Z

    .line 134
    .line 135
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
    .locals 6

    .line 1
    iget-object p2, p0, Ll1/h;->f:LF0/t;

    .line 2
    .line 3
    invoke-static {p2}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, LF0/s;->a()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget p2, p0, Ll1/h;->a:I

    .line 11
    .line 12
    and-int/lit8 v2, p2, 0x2

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    and-int/2addr p2, v3

    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    const-wide/16 v4, -0x1

    .line 21
    .line 22
    cmp-long p2, v0, v4

    .line 23
    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0, p1}, Ll1/h;->f(LF0/s;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object p2, p0, Ll1/h;->c:Lg0/z;

    .line 30
    .line 31
    invoke-virtual {p2}, Lg0/z;->e()[B

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    const/16 v2, 0x800

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-interface {p1, p2, v4, v2}, LF0/s;->read([BII)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    const/4 p2, -0x1

    .line 43
    if-ne p1, p2, :cond_2

    .line 44
    .line 45
    move v2, v3

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move v2, v4

    .line 48
    :goto_0
    invoke-virtual {p0, v0, v1, v2}, Ll1/h;->l(JZ)V

    .line 49
    .line 50
    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    return p2

    .line 54
    :cond_3
    iget-object p2, p0, Ll1/h;->c:Lg0/z;

    .line 55
    .line 56
    invoke-virtual {p2, v4}, Lg0/z;->T(I)V

    .line 57
    .line 58
    .line 59
    iget-object p2, p0, Ll1/h;->c:Lg0/z;

    .line 60
    .line 61
    invoke-virtual {p2, p1}, Lg0/z;->S(I)V

    .line 62
    .line 63
    .line 64
    iget-boolean p1, p0, Ll1/h;->k:Z

    .line 65
    .line 66
    if-nez p1, :cond_4

    .line 67
    .line 68
    iget-object p1, p0, Ll1/h;->b:Ll1/i;

    .line 69
    .line 70
    iget-wide v0, p0, Ll1/h;->g:J

    .line 71
    .line 72
    const/4 p2, 0x4

    .line 73
    invoke-virtual {p1, v0, v1, p2}, Ll1/i;->d(JI)V

    .line 74
    .line 75
    .line 76
    iput-boolean v3, p0, Ll1/h;->k:Z

    .line 77
    .line 78
    :cond_4
    iget-object p1, p0, Ll1/h;->b:Ll1/i;

    .line 79
    .line 80
    iget-object p2, p0, Ll1/h;->c:Lg0/z;

    .line 81
    .line 82
    invoke-virtual {p1, p2}, Ll1/i;->a(Lg0/z;)V

    .line 83
    .line 84
    .line 85
    return v4
.end method

.method public final l(JZ)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Ll1/h;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, Ll1/h;->a:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    and-int/2addr v0, v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget v0, p0, Ll1/h;->i:I

    .line 14
    .line 15
    if-lez v0, :cond_1

    .line 16
    .line 17
    move v0, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move v0, v2

    .line 20
    :goto_0
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v5, p0, Ll1/h;->b:Ll1/i;

    .line 28
    .line 29
    invoke-virtual {v5}, Ll1/i;->k()J

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    cmp-long v5, v5, v3

    .line 34
    .line 35
    if-nez v5, :cond_2

    .line 36
    .line 37
    if-nez p3, :cond_2

    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    if-eqz v0, :cond_4

    .line 41
    .line 42
    iget-object p3, p0, Ll1/h;->b:Ll1/i;

    .line 43
    .line 44
    invoke-virtual {p3}, Ll1/i;->k()J

    .line 45
    .line 46
    .line 47
    move-result-wide v5

    .line 48
    cmp-long p3, v5, v3

    .line 49
    .line 50
    if-eqz p3, :cond_4

    .line 51
    .line 52
    iget-object p3, p0, Ll1/h;->f:LF0/t;

    .line 53
    .line 54
    iget v0, p0, Ll1/h;->a:I

    .line 55
    .line 56
    and-int/lit8 v0, v0, 0x2

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    move v2, v1

    .line 61
    :cond_3
    invoke-direct {p0, p1, p2, v2}, Ll1/h;->j(JZ)LF0/M;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-interface {p3, p1}, LF0/t;->e(LF0/M;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_4
    iget-object p1, p0, Ll1/h;->f:LF0/t;

    .line 70
    .line 71
    new-instance p2, LF0/M$b;

    .line 72
    .line 73
    invoke-direct {p2, v3, v4}, LF0/M$b;-><init>(J)V

    .line 74
    .line 75
    .line 76
    invoke-interface {p1, p2}, LF0/t;->e(LF0/M;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    iput-boolean v1, p0, Ll1/h;->l:Z

    .line 80
    .line 81
    return-void
.end method

.method public final m(LF0/s;)I
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Ll1/h;->d:Lg0/z;

    .line 4
    .line 5
    invoke-virtual {v2}, Lg0/z;->e()[B

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/16 v3, 0xa

    .line 10
    .line 11
    invoke-interface {p1, v2, v0, v3}, LF0/s;->n([BII)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Ll1/h;->d:Lg0/z;

    .line 15
    .line 16
    invoke-virtual {v2, v0}, Lg0/z;->T(I)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Ll1/h;->d:Lg0/z;

    .line 20
    .line 21
    invoke-virtual {v2}, Lg0/z;->J()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const v3, 0x494433

    .line 26
    .line 27
    .line 28
    if-eq v2, v3, :cond_1

    .line 29
    .line 30
    invoke-interface {p1}, LF0/s;->h()V

    .line 31
    .line 32
    .line 33
    invoke-interface {p1, v1}, LF0/s;->o(I)V

    .line 34
    .line 35
    .line 36
    iget-wide v2, p0, Ll1/h;->h:J

    .line 37
    .line 38
    const-wide/16 v4, -0x1

    .line 39
    .line 40
    cmp-long p1, v2, v4

    .line 41
    .line 42
    if-nez p1, :cond_0

    .line 43
    .line 44
    int-to-long v2, v1

    .line 45
    iput-wide v2, p0, Ll1/h;->h:J

    .line 46
    .line 47
    :cond_0
    return v1

    .line 48
    :cond_1
    iget-object v2, p0, Ll1/h;->d:Lg0/z;

    .line 49
    .line 50
    const/4 v3, 0x3

    .line 51
    invoke-virtual {v2, v3}, Lg0/z;->U(I)V

    .line 52
    .line 53
    .line 54
    iget-object v2, p0, Ll1/h;->d:Lg0/z;

    .line 55
    .line 56
    invoke-virtual {v2}, Lg0/z;->F()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    add-int/lit8 v3, v2, 0xa

    .line 61
    .line 62
    add-int/2addr v1, v3

    .line 63
    invoke-interface {p1, v2}, LF0/s;->o(I)V

    .line 64
    .line 65
    .line 66
    goto :goto_0
.end method

.method public release()V
    .locals 0

    .line 1
    return-void
.end method
