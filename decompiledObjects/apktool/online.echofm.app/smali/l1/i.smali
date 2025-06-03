.class public final Ll1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll1/m;


# static fields
.field public static final w:[B


# instance fields
.field public final a:Z

.field public final b:Lg0/y;

.field public final c:Lg0/z;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public f:Ljava/lang/String;

.field public g:LF0/T;

.field public h:LF0/T;

.field public i:I

.field public j:I

.field public k:I

.field public l:Z

.field public m:Z

.field public n:I

.field public o:I

.field public p:I

.field public q:Z

.field public r:J

.field public s:I

.field public t:J

.field public u:LF0/T;

.field public v:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Ll1/i;->w:[B

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 1
        0x49t
        0x44t
        0x33t
    .end array-data
.end method

.method public constructor <init>(Z)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Ll1/i;-><init>(ZLjava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;I)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lg0/y;

    const/4 v1, 0x7

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lg0/y;-><init>([B)V

    iput-object v0, p0, Ll1/i;->b:Lg0/y;

    new-instance v0, Lg0/z;

    sget-object v1, Ll1/i;->w:[B

    const/16 v2, 0xa

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lg0/z;-><init>([B)V

    iput-object v0, p0, Ll1/i;->c:Lg0/z;

    invoke-virtual {p0}, Ll1/i;->s()V

    const/4 v0, -0x1

    iput v0, p0, Ll1/i;->n:I

    iput v0, p0, Ll1/i;->o:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Ll1/i;->r:J

    iput-wide v0, p0, Ll1/i;->t:J

    iput-boolean p1, p0, Ll1/i;->a:Z

    iput-object p2, p0, Ll1/i;->d:Ljava/lang/String;

    iput p3, p0, Ll1/i;->e:I

    return-void
.end method

.method private i(Lg0/z;[BI)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Ll1/i;->j:I

    .line 6
    .line 7
    sub-int v1, p3, v1

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Ll1/i;->j:I

    .line 14
    .line 15
    invoke-virtual {p1, p2, v1, v0}, Lg0/z;->l([BII)V

    .line 16
    .line 17
    .line 18
    iget p1, p0, Ll1/i;->j:I

    .line 19
    .line 20
    add-int/2addr p1, v0

    .line 21
    iput p1, p0, Ll1/i;->j:I

    .line 22
    .line 23
    if-ne p1, p3, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    :goto_0
    return p1
.end method

.method public static m(I)Z
    .locals 1

    .line 1
    const v0, 0xfff6

    .line 2
    .line 3
    .line 4
    and-int/2addr p0, v0

    .line 5
    const v0, 0xfff0

    .line 6
    .line 7
    .line 8
    if-ne p0, v0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    return p0
.end method


# virtual methods
.method public a(Lg0/z;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ll1/i;->f()V

    .line 2
    .line 3
    .line 4
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-lez v0, :cond_7

    .line 9
    .line 10
    iget v0, p0, Ll1/i;->i:I

    .line 11
    .line 12
    if-eqz v0, :cond_6

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eq v0, v1, :cond_5

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    if-eq v0, v1, :cond_4

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    if-eq v0, v1, :cond_2

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    if-ne v0, v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ll1/i;->p(Lg0/z;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_2
    iget-boolean v0, p0, Ll1/i;->l:Z

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    const/4 v0, 0x7

    .line 41
    goto :goto_1

    .line 42
    :cond_3
    const/4 v0, 0x5

    .line 43
    :goto_1
    iget-object v1, p0, Ll1/i;->b:Lg0/y;

    .line 44
    .line 45
    iget-object v1, v1, Lg0/y;->a:[B

    .line 46
    .line 47
    invoke-direct {p0, p1, v1, v0}, Ll1/i;->i(Lg0/z;[BI)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    invoke-virtual {p0}, Ll1/i;->n()V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_4
    iget-object v0, p0, Ll1/i;->c:Lg0/z;

    .line 58
    .line 59
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const/16 v1, 0xa

    .line 64
    .line 65
    invoke-direct {p0, p1, v0, v1}, Ll1/i;->i(Lg0/z;[BI)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_0

    .line 70
    .line 71
    invoke-virtual {p0}, Ll1/i;->o()V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_5
    invoke-virtual {p0, p1}, Ll1/i;->g(Lg0/z;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_6
    invoke-virtual {p0, p1}, Ll1/i;->j(Lg0/z;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_7
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Ll1/i;->t:J

    .line 7
    .line 8
    invoke-virtual {p0}, Ll1/i;->q()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public d(JI)V
    .locals 0

    .line 1
    iput-wide p1, p0, Ll1/i;->t:J

    .line 2
    .line 3
    return-void
.end method

.method public e(LF0/t;Ll1/K$d;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ll1/K$d;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ll1/K$d;->b()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Ll1/i;->f:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p2}, Ll1/K$d;->c()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-interface {p1, v0, v1}, LF0/t;->a(II)LF0/T;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Ll1/i;->g:LF0/T;

    .line 20
    .line 21
    iput-object v0, p0, Ll1/i;->u:LF0/T;

    .line 22
    .line 23
    iget-boolean v0, p0, Ll1/i;->a:Z

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p2}, Ll1/K$d;->a()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Ll1/K$d;->c()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x5

    .line 35
    invoke-interface {p1, v0, v1}, LF0/t;->a(II)LF0/T;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Ll1/i;->h:LF0/T;

    .line 40
    .line 41
    new-instance v0, Ld0/q$b;

    .line 42
    .line 43
    invoke-direct {v0}, Ld0/q$b;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Ll1/K$d;->b()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {v0, p2}, Ld0/q$b;->a0(Ljava/lang/String;)Ld0/q$b;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    const-string v0, "application/id3"

    .line 55
    .line 56
    invoke-virtual {p2, v0}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p2}, Ld0/q$b;->K()Ld0/q;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-interface {p1, p2}, LF0/T;->d(Ld0/q;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    new-instance p1, LF0/n;

    .line 69
    .line 70
    invoke-direct {p1}, LF0/n;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Ll1/i;->h:LF0/T;

    .line 74
    .line 75
    :goto_0
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, Ll1/i;->g:LF0/T;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll1/i;->u:LF0/T;

    .line 7
    .line 8
    invoke-static {v0}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ll1/i;->h:LF0/T;

    .line 12
    .line 13
    invoke-static {v0}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final g(Lg0/z;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Ll1/i;->b:Lg0/y;

    .line 9
    .line 10
    iget-object v0, v0, Lg0/y;->a:[B

    .line 11
    .line 12
    invoke-virtual {p1}, Lg0/z;->e()[B

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p1}, Lg0/z;->f()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    aget-byte p1, v1, p1

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    aput-byte p1, v0, v1

    .line 24
    .line 25
    iget-object p1, p0, Ll1/i;->b:Lg0/y;

    .line 26
    .line 27
    const/4 v0, 0x2

    .line 28
    invoke-virtual {p1, v0}, Lg0/y;->p(I)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Ll1/i;->b:Lg0/y;

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    invoke-virtual {p1, v0}, Lg0/y;->h(I)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iget v0, p0, Ll1/i;->o:I

    .line 39
    .line 40
    const/4 v1, -0x1

    .line 41
    if-eq v0, v1, :cond_1

    .line 42
    .line 43
    if-eq p1, v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0}, Ll1/i;->q()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    iget-boolean v0, p0, Ll1/i;->m:Z

    .line 50
    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    iput-boolean v0, p0, Ll1/i;->m:Z

    .line 55
    .line 56
    iget v0, p0, Ll1/i;->p:I

    .line 57
    .line 58
    iput v0, p0, Ll1/i;->n:I

    .line 59
    .line 60
    iput p1, p0, Ll1/i;->o:I

    .line 61
    .line 62
    :cond_2
    invoke-virtual {p0}, Ll1/i;->t()V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final h(Lg0/z;I)Z
    .locals 8

    .line 1
    add-int/lit8 v0, p2, 0x1

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lg0/z;->T(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll1/i;->b:Lg0/y;

    .line 7
    .line 8
    iget-object v0, v0, Lg0/y;->a:[B

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {p0, p1, v0, v1}, Ll1/i;->w(Lg0/z;[BI)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return v2

    .line 19
    :cond_0
    iget-object v0, p0, Ll1/i;->b:Lg0/y;

    .line 20
    .line 21
    const/4 v3, 0x4

    .line 22
    invoke-virtual {v0, v3}, Lg0/y;->p(I)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Ll1/i;->b:Lg0/y;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lg0/y;->h(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget v4, p0, Ll1/i;->n:I

    .line 32
    .line 33
    const/4 v5, -0x1

    .line 34
    if-eq v4, v5, :cond_1

    .line 35
    .line 36
    if-eq v0, v4, :cond_1

    .line 37
    .line 38
    return v2

    .line 39
    :cond_1
    iget v4, p0, Ll1/i;->o:I

    .line 40
    .line 41
    const/4 v6, 0x2

    .line 42
    if-eq v4, v5, :cond_4

    .line 43
    .line 44
    iget-object v4, p0, Ll1/i;->b:Lg0/y;

    .line 45
    .line 46
    iget-object v4, v4, Lg0/y;->a:[B

    .line 47
    .line 48
    invoke-virtual {p0, p1, v4, v1}, Ll1/i;->w(Lg0/z;[BI)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-nez v4, :cond_2

    .line 53
    .line 54
    return v1

    .line 55
    :cond_2
    iget-object v4, p0, Ll1/i;->b:Lg0/y;

    .line 56
    .line 57
    invoke-virtual {v4, v6}, Lg0/y;->p(I)V

    .line 58
    .line 59
    .line 60
    iget-object v4, p0, Ll1/i;->b:Lg0/y;

    .line 61
    .line 62
    invoke-virtual {v4, v3}, Lg0/y;->h(I)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    iget v7, p0, Ll1/i;->o:I

    .line 67
    .line 68
    if-eq v4, v7, :cond_3

    .line 69
    .line 70
    return v2

    .line 71
    :cond_3
    add-int/lit8 v4, p2, 0x2

    .line 72
    .line 73
    invoke-virtual {p1, v4}, Lg0/z;->T(I)V

    .line 74
    .line 75
    .line 76
    :cond_4
    iget-object v4, p0, Ll1/i;->b:Lg0/y;

    .line 77
    .line 78
    iget-object v4, v4, Lg0/y;->a:[B

    .line 79
    .line 80
    invoke-virtual {p0, p1, v4, v3}, Ll1/i;->w(Lg0/z;[BI)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-nez v3, :cond_5

    .line 85
    .line 86
    return v1

    .line 87
    :cond_5
    iget-object v3, p0, Ll1/i;->b:Lg0/y;

    .line 88
    .line 89
    const/16 v4, 0xe

    .line 90
    .line 91
    invoke-virtual {v3, v4}, Lg0/y;->p(I)V

    .line 92
    .line 93
    .line 94
    iget-object v3, p0, Ll1/i;->b:Lg0/y;

    .line 95
    .line 96
    const/16 v4, 0xd

    .line 97
    .line 98
    invoke-virtual {v3, v4}, Lg0/y;->h(I)I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    const/4 v4, 0x7

    .line 103
    if-ge v3, v4, :cond_6

    .line 104
    .line 105
    return v2

    .line 106
    :cond_6
    invoke-virtual {p1}, Lg0/z;->e()[B

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {p1}, Lg0/z;->g()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    add-int/2addr p2, v3

    .line 115
    if-lt p2, p1, :cond_7

    .line 116
    .line 117
    return v1

    .line 118
    :cond_7
    aget-byte v3, v4, p2

    .line 119
    .line 120
    if-ne v3, v5, :cond_a

    .line 121
    .line 122
    add-int/2addr p2, v1

    .line 123
    if-ne p2, p1, :cond_8

    .line 124
    .line 125
    return v1

    .line 126
    :cond_8
    aget-byte p1, v4, p2

    .line 127
    .line 128
    invoke-virtual {p0, v5, p1}, Ll1/i;->l(BB)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-eqz p1, :cond_9

    .line 133
    .line 134
    aget-byte p1, v4, p2

    .line 135
    .line 136
    and-int/lit8 p1, p1, 0x8

    .line 137
    .line 138
    shr-int/lit8 p1, p1, 0x3

    .line 139
    .line 140
    if-ne p1, v0, :cond_9

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_9
    move v1, v2

    .line 144
    :goto_0
    return v1

    .line 145
    :cond_a
    const/16 v0, 0x49

    .line 146
    .line 147
    if-eq v3, v0, :cond_b

    .line 148
    .line 149
    return v2

    .line 150
    :cond_b
    add-int/lit8 v0, p2, 0x1

    .line 151
    .line 152
    if-ne v0, p1, :cond_c

    .line 153
    .line 154
    return v1

    .line 155
    :cond_c
    aget-byte v0, v4, v0

    .line 156
    .line 157
    const/16 v3, 0x44

    .line 158
    .line 159
    if-eq v0, v3, :cond_d

    .line 160
    .line 161
    return v2

    .line 162
    :cond_d
    add-int/2addr p2, v6

    .line 163
    if-ne p2, p1, :cond_e

    .line 164
    .line 165
    return v1

    .line 166
    :cond_e
    aget-byte p1, v4, p2

    .line 167
    .line 168
    const/16 p2, 0x33

    .line 169
    .line 170
    if-ne p1, p2, :cond_f

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_f
    move v1, v2

    .line 174
    :goto_1
    return v1
.end method

.method public final j(Lg0/z;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lg0/z;->e()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lg0/z;->f()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1}, Lg0/z;->g()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    :goto_0
    if-ge v1, v2, :cond_9

    .line 14
    .line 15
    add-int/lit8 v3, v1, 0x1

    .line 16
    .line 17
    aget-byte v4, v0, v1

    .line 18
    .line 19
    and-int/lit16 v5, v4, 0xff

    .line 20
    .line 21
    iget v6, p0, Ll1/i;->k:I

    .line 22
    .line 23
    const/16 v7, 0x200

    .line 24
    .line 25
    if-ne v6, v7, :cond_3

    .line 26
    .line 27
    int-to-byte v6, v5

    .line 28
    const/4 v8, -0x1

    .line 29
    invoke-virtual {p0, v8, v6}, Ll1/i;->l(BB)Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-eqz v6, :cond_3

    .line 34
    .line 35
    iget-boolean v6, p0, Ll1/i;->m:Z

    .line 36
    .line 37
    if-nez v6, :cond_0

    .line 38
    .line 39
    add-int/lit8 v6, v1, -0x1

    .line 40
    .line 41
    invoke-virtual {p0, p1, v6}, Ll1/i;->h(Lg0/z;I)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_3

    .line 46
    .line 47
    :cond_0
    and-int/lit8 v0, v4, 0x8

    .line 48
    .line 49
    shr-int/lit8 v0, v0, 0x3

    .line 50
    .line 51
    iput v0, p0, Ll1/i;->p:I

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    and-int/lit8 v1, v4, 0x1

    .line 55
    .line 56
    if-nez v1, :cond_1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    const/4 v0, 0x0

    .line 60
    :goto_1
    iput-boolean v0, p0, Ll1/i;->l:Z

    .line 61
    .line 62
    iget-boolean v0, p0, Ll1/i;->m:Z

    .line 63
    .line 64
    if-nez v0, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0}, Ll1/i;->r()V

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_2
    invoke-virtual {p0}, Ll1/i;->t()V

    .line 71
    .line 72
    .line 73
    :goto_2
    invoke-virtual {p1, v3}, Lg0/z;->T(I)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_3
    iget v4, p0, Ll1/i;->k:I

    .line 78
    .line 79
    or-int/2addr v5, v4

    .line 80
    const/16 v6, 0x149

    .line 81
    .line 82
    if-eq v5, v6, :cond_7

    .line 83
    .line 84
    const/16 v6, 0x1ff

    .line 85
    .line 86
    if-eq v5, v6, :cond_6

    .line 87
    .line 88
    const/16 v6, 0x344

    .line 89
    .line 90
    if-eq v5, v6, :cond_5

    .line 91
    .line 92
    const/16 v6, 0x433

    .line 93
    .line 94
    if-eq v5, v6, :cond_4

    .line 95
    .line 96
    const/16 v5, 0x100

    .line 97
    .line 98
    if-eq v4, v5, :cond_8

    .line 99
    .line 100
    iput v5, p0, Ll1/i;->k:I

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_4
    invoke-virtual {p0}, Ll1/i;->u()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v3}, Lg0/z;->T(I)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_5
    const/16 v1, 0x400

    .line 111
    .line 112
    :goto_3
    iput v1, p0, Ll1/i;->k:I

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_6
    iput v7, p0, Ll1/i;->k:I

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_7
    const/16 v1, 0x300

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_8
    :goto_4
    move v1, v3

    .line 122
    goto :goto_0

    .line 123
    :cond_9
    invoke-virtual {p1, v1}, Lg0/z;->T(I)V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public k()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ll1/i;->r:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final l(BB)Z
    .locals 0

    .line 1
    and-int/lit16 p1, p1, 0xff

    .line 2
    .line 3
    shl-int/lit8 p1, p1, 0x8

    .line 4
    .line 5
    and-int/lit16 p2, p2, 0xff

    .line 6
    .line 7
    or-int/2addr p1, p2

    .line 8
    invoke-static {p1}, Ll1/i;->m(I)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final n()V
    .locals 8

    .line 1
    iget-object v0, p0, Ll1/i;->b:Lg0/y;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lg0/y;->p(I)V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Ll1/i;->q:Z

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Ll1/i;->b:Lg0/y;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-virtual {v0, v1}, Lg0/y;->h(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, 0x1

    .line 19
    add-int/2addr v0, v2

    .line 20
    if-eq v0, v1, :cond_0

    .line 21
    .line 22
    new-instance v3, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v4, "Detected audio object type: "

    .line 28
    .line 29
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v0, ", but assuming AAC LC."

    .line 36
    .line 37
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v3, "AdtsReader"

    .line 45
    .line 46
    invoke-static {v3, v0}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move v1, v0

    .line 51
    :goto_0
    iget-object v0, p0, Ll1/i;->b:Lg0/y;

    .line 52
    .line 53
    const/4 v3, 0x5

    .line 54
    invoke-virtual {v0, v3}, Lg0/y;->r(I)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Ll1/i;->b:Lg0/y;

    .line 58
    .line 59
    const/4 v3, 0x3

    .line 60
    invoke-virtual {v0, v3}, Lg0/y;->h(I)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v3, p0, Ll1/i;->o:I

    .line 65
    .line 66
    invoke-static {v1, v3, v0}, LF0/a;->a(III)[B

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, LF0/a;->e([B)LF0/a$b;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    new-instance v3, Ld0/q$b;

    .line 75
    .line 76
    invoke-direct {v3}, Ld0/q$b;-><init>()V

    .line 77
    .line 78
    .line 79
    iget-object v4, p0, Ll1/i;->f:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v3, v4}, Ld0/q$b;->a0(Ljava/lang/String;)Ld0/q$b;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    const-string v4, "audio/mp4a-latm"

    .line 86
    .line 87
    invoke-virtual {v3, v4}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    iget-object v4, v1, LF0/a$b;->c:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v3, v4}, Ld0/q$b;->O(Ljava/lang/String;)Ld0/q$b;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    iget v4, v1, LF0/a$b;->b:I

    .line 98
    .line 99
    invoke-virtual {v3, v4}, Ld0/q$b;->N(I)Ld0/q$b;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    iget v1, v1, LF0/a$b;->a:I

    .line 104
    .line 105
    invoke-virtual {v3, v1}, Ld0/q$b;->p0(I)Ld0/q$b;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v1, v0}, Ld0/q$b;->b0(Ljava/util/List;)Ld0/q$b;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iget-object v1, p0, Ll1/i;->d:Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ld0/q$b;->e0(Ljava/lang/String;)Ld0/q$b;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    iget v1, p0, Ll1/i;->e:I

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ld0/q$b;->m0(I)Ld0/q$b;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Ld0/q$b;->K()Ld0/q;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iget v1, v0, Ld0/q;->C:I

    .line 134
    .line 135
    int-to-long v3, v1

    .line 136
    const-wide/32 v5, 0x3d090000

    .line 137
    .line 138
    .line 139
    div-long/2addr v5, v3

    .line 140
    iput-wide v5, p0, Ll1/i;->r:J

    .line 141
    .line 142
    iget-object v1, p0, Ll1/i;->g:LF0/T;

    .line 143
    .line 144
    invoke-interface {v1, v0}, LF0/T;->d(Ld0/q;)V

    .line 145
    .line 146
    .line 147
    iput-boolean v2, p0, Ll1/i;->q:Z

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_1
    iget-object v0, p0, Ll1/i;->b:Lg0/y;

    .line 151
    .line 152
    const/16 v1, 0xa

    .line 153
    .line 154
    invoke-virtual {v0, v1}, Lg0/y;->r(I)V

    .line 155
    .line 156
    .line 157
    :goto_1
    iget-object v0, p0, Ll1/i;->b:Lg0/y;

    .line 158
    .line 159
    const/4 v1, 0x4

    .line 160
    invoke-virtual {v0, v1}, Lg0/y;->r(I)V

    .line 161
    .line 162
    .line 163
    iget-object v0, p0, Ll1/i;->b:Lg0/y;

    .line 164
    .line 165
    const/16 v1, 0xd

    .line 166
    .line 167
    invoke-virtual {v0, v1}, Lg0/y;->h(I)I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    add-int/lit8 v1, v0, -0x7

    .line 172
    .line 173
    iget-boolean v2, p0, Ll1/i;->l:Z

    .line 174
    .line 175
    if-eqz v2, :cond_2

    .line 176
    .line 177
    add-int/lit8 v1, v0, -0x9

    .line 178
    .line 179
    :cond_2
    move v7, v1

    .line 180
    iget-object v3, p0, Ll1/i;->g:LF0/T;

    .line 181
    .line 182
    iget-wide v4, p0, Ll1/i;->r:J

    .line 183
    .line 184
    const/4 v6, 0x0

    .line 185
    move-object v2, p0

    .line 186
    invoke-virtual/range {v2 .. v7}, Ll1/i;->v(LF0/T;JII)V

    .line 187
    .line 188
    .line 189
    return-void
.end method

.method public final o()V
    .locals 9

    .line 1
    iget-object v0, p0, Ll1/i;->h:LF0/T;

    .line 2
    .line 3
    iget-object v1, p0, Ll1/i;->c:Lg0/z;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    invoke-interface {v0, v1, v2}, LF0/T;->e(Lg0/z;I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ll1/i;->c:Lg0/z;

    .line 11
    .line 12
    const/4 v1, 0x6

    .line 13
    invoke-virtual {v0, v1}, Lg0/z;->T(I)V

    .line 14
    .line 15
    .line 16
    iget-object v4, p0, Ll1/i;->h:LF0/T;

    .line 17
    .line 18
    iget-object v0, p0, Ll1/i;->c:Lg0/z;

    .line 19
    .line 20
    invoke-virtual {v0}, Lg0/z;->F()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/lit8 v8, v0, 0xa

    .line 25
    .line 26
    const-wide/16 v5, 0x0

    .line 27
    .line 28
    const/16 v7, 0xa

    .line 29
    .line 30
    move-object v3, p0

    .line 31
    invoke-virtual/range {v3 .. v8}, Ll1/i;->v(LF0/T;JII)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final p(Lg0/z;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Ll1/i;->s:I

    .line 6
    .line 7
    iget v2, p0, Ll1/i;->j:I

    .line 8
    .line 9
    sub-int/2addr v1, v2

    .line 10
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v1, p0, Ll1/i;->u:LF0/T;

    .line 15
    .line 16
    invoke-interface {v1, p1, v0}, LF0/T;->e(Lg0/z;I)V

    .line 17
    .line 18
    .line 19
    iget p1, p0, Ll1/i;->j:I

    .line 20
    .line 21
    add-int/2addr p1, v0

    .line 22
    iput p1, p0, Ll1/i;->j:I

    .line 23
    .line 24
    iget v0, p0, Ll1/i;->s:I

    .line 25
    .line 26
    if-ne p1, v0, :cond_1

    .line 27
    .line 28
    iget-wide v0, p0, Ll1/i;->t:J

    .line 29
    .line 30
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    cmp-long p1, v0, v2

    .line 36
    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 p1, 0x0

    .line 42
    :goto_0
    invoke-static {p1}, Lg0/a;->f(Z)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Ll1/i;->u:LF0/T;

    .line 46
    .line 47
    iget-wide v1, p0, Ll1/i;->t:J

    .line 48
    .line 49
    iget v4, p0, Ll1/i;->s:I

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    const/4 v6, 0x0

    .line 53
    const/4 v3, 0x1

    .line 54
    invoke-interface/range {v0 .. v6}, LF0/T;->b(JIIILF0/T$a;)V

    .line 55
    .line 56
    .line 57
    iget-wide v0, p0, Ll1/i;->t:J

    .line 58
    .line 59
    iget-wide v2, p0, Ll1/i;->v:J

    .line 60
    .line 61
    add-long/2addr v0, v2

    .line 62
    iput-wide v0, p0, Ll1/i;->t:J

    .line 63
    .line 64
    invoke-virtual {p0}, Ll1/i;->s()V

    .line 65
    .line 66
    .line 67
    :cond_1
    return-void
.end method

.method public final q()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Ll1/i;->m:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Ll1/i;->s()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final r()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ll1/i;->i:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ll1/i;->j:I

    .line 6
    .line 7
    return-void
.end method

.method public final s()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ll1/i;->i:I

    .line 3
    .line 4
    iput v0, p0, Ll1/i;->j:I

    .line 5
    .line 6
    const/16 v0, 0x100

    .line 7
    .line 8
    iput v0, p0, Ll1/i;->k:I

    .line 9
    .line 10
    return-void
.end method

.method public final t()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Ll1/i;->i:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ll1/i;->j:I

    .line 6
    .line 7
    return-void
.end method

.method public final u()V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Ll1/i;->i:I

    .line 3
    .line 4
    sget-object v0, Ll1/i;->w:[B

    .line 5
    .line 6
    array-length v0, v0

    .line 7
    iput v0, p0, Ll1/i;->j:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Ll1/i;->s:I

    .line 11
    .line 12
    iget-object v1, p0, Ll1/i;->c:Lg0/z;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lg0/z;->T(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final v(LF0/T;JII)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Ll1/i;->i:I

    .line 3
    .line 4
    iput p4, p0, Ll1/i;->j:I

    .line 5
    .line 6
    iput-object p1, p0, Ll1/i;->u:LF0/T;

    .line 7
    .line 8
    iput-wide p2, p0, Ll1/i;->v:J

    .line 9
    .line 10
    iput p5, p0, Ll1/i;->s:I

    .line 11
    .line 12
    return-void
.end method

.method public final w(Lg0/z;[BI)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-ge v0, p3, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p1, p2, v1, p3}, Lg0/z;->l([BII)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1
.end method
