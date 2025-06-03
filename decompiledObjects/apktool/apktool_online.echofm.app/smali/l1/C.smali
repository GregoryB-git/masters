.class public final Ll1/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll1/C$a;
    }
.end annotation


# static fields
.field public static final l:LF0/x;


# instance fields
.field public final a:Lg0/E;

.field public final b:Landroid/util/SparseArray;

.field public final c:Lg0/z;

.field public final d:Ll1/A;

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:J

.field public i:Ll1/z;

.field public j:LF0/t;

.field public k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ll1/B;

    .line 2
    .line 3
    invoke-direct {v0}, Ll1/B;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ll1/C;->l:LF0/x;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Lg0/E;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lg0/E;-><init>(J)V

    invoke-direct {p0, v0}, Ll1/C;-><init>(Lg0/E;)V

    return-void
.end method

.method public constructor <init>(Lg0/E;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/C;->a:Lg0/E;

    new-instance p1, Lg0/z;

    const/16 v0, 0x1000

    invoke-direct {p1, v0}, Lg0/z;-><init>(I)V

    iput-object p1, p0, Ll1/C;->c:Lg0/z;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Ll1/C;->b:Landroid/util/SparseArray;

    new-instance p1, Ll1/A;

    invoke-direct {p1}, Ll1/A;-><init>()V

    iput-object p1, p0, Ll1/C;->d:Ll1/A;

    return-void
.end method

.method public static synthetic c()[LF0/r;
    .locals 1

    .line 1
    invoke-static {}, Ll1/C;->f()[LF0/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static synthetic f()[LF0/r;
    .locals 3

    .line 1
    new-instance v0, Ll1/C;

    .line 2
    .line 3
    invoke-direct {v0}, Ll1/C;-><init>()V

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
    .locals 4

    .line 1
    iget-object p1, p0, Ll1/C;->a:Lg0/E;

    .line 2
    .line 3
    invoke-virtual {p1}, Lg0/E;->f()J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long p1, p1, v0

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p1, p2

    .line 20
    :goto_0
    if-nez p1, :cond_1

    .line 21
    .line 22
    iget-object p1, p0, Ll1/C;->a:Lg0/E;

    .line 23
    .line 24
    invoke-virtual {p1}, Lg0/E;->d()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    cmp-long p1, v2, v0

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    const-wide/16 v0, 0x0

    .line 33
    .line 34
    cmp-long p1, v2, v0

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    cmp-long p1, v2, p3

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    if-eqz p1, :cond_2

    .line 44
    .line 45
    :goto_1
    iget-object p1, p0, Ll1/C;->a:Lg0/E;

    .line 46
    .line 47
    invoke-virtual {p1, p3, p4}, Lg0/E;->i(J)V

    .line 48
    .line 49
    .line 50
    :cond_2
    iget-object p1, p0, Ll1/C;->i:Ll1/z;

    .line 51
    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    invoke-virtual {p1, p3, p4}, LF0/e;->h(J)V

    .line 55
    .line 56
    .line 57
    :cond_3
    :goto_2
    iget-object p1, p0, Ll1/C;->b:Landroid/util/SparseArray;

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-ge p2, p1, :cond_4

    .line 64
    .line 65
    iget-object p1, p0, Ll1/C;->b:Landroid/util/SparseArray;

    .line 66
    .line 67
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, Ll1/C$a;

    .line 72
    .line 73
    invoke-virtual {p1}, Ll1/C$a;->d()V

    .line 74
    .line 75
    .line 76
    add-int/lit8 p2, p2, 0x1

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    return-void
.end method

.method public b(LF0/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll1/C;->j:LF0/t;

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
    .locals 9

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {p1, v1, v2, v0}, LF0/s;->n([BII)V

    .line 7
    .line 8
    .line 9
    aget-byte v0, v1, v2

    .line 10
    .line 11
    and-int/lit16 v0, v0, 0xff

    .line 12
    .line 13
    shl-int/lit8 v0, v0, 0x18

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    aget-byte v4, v1, v3

    .line 17
    .line 18
    and-int/lit16 v4, v4, 0xff

    .line 19
    .line 20
    shl-int/lit8 v4, v4, 0x10

    .line 21
    .line 22
    or-int/2addr v0, v4

    .line 23
    const/4 v4, 0x2

    .line 24
    aget-byte v5, v1, v4

    .line 25
    .line 26
    and-int/lit16 v5, v5, 0xff

    .line 27
    .line 28
    const/16 v6, 0x8

    .line 29
    .line 30
    shl-int/2addr v5, v6

    .line 31
    or-int/2addr v0, v5

    .line 32
    const/4 v5, 0x3

    .line 33
    aget-byte v7, v1, v5

    .line 34
    .line 35
    and-int/lit16 v7, v7, 0xff

    .line 36
    .line 37
    or-int/2addr v0, v7

    .line 38
    const/16 v7, 0x1ba

    .line 39
    .line 40
    if-eq v7, v0, :cond_0

    .line 41
    .line 42
    return v2

    .line 43
    :cond_0
    const/4 v0, 0x4

    .line 44
    aget-byte v7, v1, v0

    .line 45
    .line 46
    and-int/lit16 v7, v7, 0xc4

    .line 47
    .line 48
    const/16 v8, 0x44

    .line 49
    .line 50
    if-eq v7, v8, :cond_1

    .line 51
    .line 52
    return v2

    .line 53
    :cond_1
    const/4 v7, 0x6

    .line 54
    aget-byte v7, v1, v7

    .line 55
    .line 56
    and-int/2addr v7, v0

    .line 57
    if-eq v7, v0, :cond_2

    .line 58
    .line 59
    return v2

    .line 60
    :cond_2
    aget-byte v7, v1, v6

    .line 61
    .line 62
    and-int/2addr v7, v0

    .line 63
    if-eq v7, v0, :cond_3

    .line 64
    .line 65
    return v2

    .line 66
    :cond_3
    const/16 v0, 0x9

    .line 67
    .line 68
    aget-byte v0, v1, v0

    .line 69
    .line 70
    and-int/2addr v0, v3

    .line 71
    if-eq v0, v3, :cond_4

    .line 72
    .line 73
    return v2

    .line 74
    :cond_4
    const/16 v0, 0xc

    .line 75
    .line 76
    aget-byte v0, v1, v0

    .line 77
    .line 78
    and-int/2addr v0, v5

    .line 79
    if-eq v0, v5, :cond_5

    .line 80
    .line 81
    return v2

    .line 82
    :cond_5
    const/16 v0, 0xd

    .line 83
    .line 84
    aget-byte v0, v1, v0

    .line 85
    .line 86
    and-int/lit8 v0, v0, 0x7

    .line 87
    .line 88
    invoke-interface {p1, v0}, LF0/s;->o(I)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p1, v1, v2, v5}, LF0/s;->n([BII)V

    .line 92
    .line 93
    .line 94
    aget-byte p1, v1, v2

    .line 95
    .line 96
    and-int/lit16 p1, p1, 0xff

    .line 97
    .line 98
    shl-int/lit8 p1, p1, 0x10

    .line 99
    .line 100
    aget-byte v0, v1, v3

    .line 101
    .line 102
    and-int/lit16 v0, v0, 0xff

    .line 103
    .line 104
    shl-int/2addr v0, v6

    .line 105
    or-int/2addr p1, v0

    .line 106
    aget-byte v0, v1, v4

    .line 107
    .line 108
    and-int/lit16 v0, v0, 0xff

    .line 109
    .line 110
    or-int/2addr p1, v0

    .line 111
    if-ne v3, p1, :cond_6

    .line 112
    .line 113
    move v2, v3

    .line 114
    :cond_6
    return v2
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

.method public final h(J)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Ll1/C;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Ll1/C;->k:Z

    .line 7
    .line 8
    iget-object v0, p0, Ll1/C;->d:Ll1/A;

    .line 9
    .line 10
    invoke-virtual {v0}, Ll1/A;->c()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v0, v0, v2

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    new-instance v0, Ll1/z;

    .line 24
    .line 25
    iget-object v1, p0, Ll1/C;->d:Ll1/A;

    .line 26
    .line 27
    invoke-virtual {v1}, Ll1/A;->d()Lg0/E;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v1, p0, Ll1/C;->d:Ll1/A;

    .line 32
    .line 33
    invoke-virtual {v1}, Ll1/A;->c()J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    move-object v1, v0

    .line 38
    move-wide v5, p1

    .line 39
    invoke-direct/range {v1 .. v6}, Ll1/z;-><init>(Lg0/E;JJ)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Ll1/C;->i:Ll1/z;

    .line 43
    .line 44
    iget-object p1, p0, Ll1/C;->j:LF0/t;

    .line 45
    .line 46
    invoke-virtual {v0}, LF0/e;->b()LF0/M;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    :goto_0
    invoke-interface {p1, p2}, LF0/t;->e(LF0/M;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_0
    iget-object p1, p0, Ll1/C;->j:LF0/t;

    .line 55
    .line 56
    new-instance p2, LF0/M$b;

    .line 57
    .line 58
    iget-object v0, p0, Ll1/C;->d:Ll1/A;

    .line 59
    .line 60
    invoke-virtual {v0}, Ll1/A;->c()J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    invoke-direct {p2, v0, v1}, LF0/M$b;-><init>(J)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    :goto_1
    return-void
.end method

.method public i(LF0/s;LF0/L;)I
    .locals 10

    .line 1
    iget-object v0, p0, Ll1/C;->j:LF0/t;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, LF0/s;->a()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide/16 v2, -0x1

    .line 11
    .line 12
    cmp-long v4, v0, v2

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    iget-object v5, p0, Ll1/C;->d:Ll1/A;

    .line 17
    .line 18
    invoke-virtual {v5}, Ll1/A;->e()Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Ll1/C;->d:Ll1/A;

    .line 25
    .line 26
    invoke-virtual {v0, p1, p2}, Ll1/A;->g(LF0/s;LF0/L;)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_0
    invoke-virtual {p0, v0, v1}, Ll1/C;->h(J)V

    .line 32
    .line 33
    .line 34
    iget-object v5, p0, Ll1/C;->i:Ll1/z;

    .line 35
    .line 36
    if-eqz v5, :cond_1

    .line 37
    .line 38
    invoke-virtual {v5}, LF0/e;->d()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    iget-object v0, p0, Ll1/C;->i:Ll1/z;

    .line 45
    .line 46
    invoke-virtual {v0, p1, p2}, LF0/e;->c(LF0/s;LF0/L;)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    return p1

    .line 51
    :cond_1
    invoke-interface {p1}, LF0/s;->h()V

    .line 52
    .line 53
    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    invoke-interface {p1}, LF0/s;->m()J

    .line 57
    .line 58
    .line 59
    move-result-wide v4

    .line 60
    sub-long/2addr v0, v4

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    move-wide v0, v2

    .line 63
    :goto_0
    cmp-long p2, v0, v2

    .line 64
    .line 65
    const/4 v2, -0x1

    .line 66
    if-eqz p2, :cond_3

    .line 67
    .line 68
    const-wide/16 v3, 0x4

    .line 69
    .line 70
    cmp-long p2, v0, v3

    .line 71
    .line 72
    if-gez p2, :cond_3

    .line 73
    .line 74
    return v2

    .line 75
    :cond_3
    iget-object p2, p0, Ll1/C;->c:Lg0/z;

    .line 76
    .line 77
    invoke-virtual {p2}, Lg0/z;->e()[B

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    const/4 v0, 0x4

    .line 82
    const/4 v1, 0x0

    .line 83
    const/4 v3, 0x1

    .line 84
    invoke-interface {p1, p2, v1, v0, v3}, LF0/s;->l([BIIZ)Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-nez p2, :cond_4

    .line 89
    .line 90
    return v2

    .line 91
    :cond_4
    iget-object p2, p0, Ll1/C;->c:Lg0/z;

    .line 92
    .line 93
    invoke-virtual {p2, v1}, Lg0/z;->T(I)V

    .line 94
    .line 95
    .line 96
    iget-object p2, p0, Ll1/C;->c:Lg0/z;

    .line 97
    .line 98
    invoke-virtual {p2}, Lg0/z;->p()I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    const/16 v0, 0x1b9

    .line 103
    .line 104
    if-ne p2, v0, :cond_5

    .line 105
    .line 106
    return v2

    .line 107
    :cond_5
    const/16 v0, 0x1ba

    .line 108
    .line 109
    if-ne p2, v0, :cond_6

    .line 110
    .line 111
    iget-object p2, p0, Ll1/C;->c:Lg0/z;

    .line 112
    .line 113
    invoke-virtual {p2}, Lg0/z;->e()[B

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    const/16 v0, 0xa

    .line 118
    .line 119
    invoke-interface {p1, p2, v1, v0}, LF0/s;->n([BII)V

    .line 120
    .line 121
    .line 122
    iget-object p2, p0, Ll1/C;->c:Lg0/z;

    .line 123
    .line 124
    const/16 v0, 0x9

    .line 125
    .line 126
    invoke-virtual {p2, v0}, Lg0/z;->T(I)V

    .line 127
    .line 128
    .line 129
    iget-object p2, p0, Ll1/C;->c:Lg0/z;

    .line 130
    .line 131
    invoke-virtual {p2}, Lg0/z;->G()I

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    and-int/lit8 p2, p2, 0x7

    .line 136
    .line 137
    add-int/lit8 p2, p2, 0xe

    .line 138
    .line 139
    :goto_1
    invoke-interface {p1, p2}, LF0/s;->i(I)V

    .line 140
    .line 141
    .line 142
    return v1

    .line 143
    :cond_6
    const/16 v0, 0x1bb

    .line 144
    .line 145
    const/4 v2, 0x2

    .line 146
    const/4 v4, 0x6

    .line 147
    if-ne p2, v0, :cond_7

    .line 148
    .line 149
    iget-object p2, p0, Ll1/C;->c:Lg0/z;

    .line 150
    .line 151
    invoke-virtual {p2}, Lg0/z;->e()[B

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-interface {p1, p2, v1, v2}, LF0/s;->n([BII)V

    .line 156
    .line 157
    .line 158
    iget-object p2, p0, Ll1/C;->c:Lg0/z;

    .line 159
    .line 160
    invoke-virtual {p2, v1}, Lg0/z;->T(I)V

    .line 161
    .line 162
    .line 163
    iget-object p2, p0, Ll1/C;->c:Lg0/z;

    .line 164
    .line 165
    invoke-virtual {p2}, Lg0/z;->M()I

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    add-int/2addr p2, v4

    .line 170
    goto :goto_1

    .line 171
    :cond_7
    and-int/lit16 v0, p2, -0x100

    .line 172
    .line 173
    shr-int/lit8 v0, v0, 0x8

    .line 174
    .line 175
    if-eq v0, v3, :cond_8

    .line 176
    .line 177
    invoke-interface {p1, v3}, LF0/s;->i(I)V

    .line 178
    .line 179
    .line 180
    return v1

    .line 181
    :cond_8
    and-int/lit16 v0, p2, 0xff

    .line 182
    .line 183
    iget-object v5, p0, Ll1/C;->b:Landroid/util/SparseArray;

    .line 184
    .line 185
    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    check-cast v5, Ll1/C$a;

    .line 190
    .line 191
    iget-boolean v6, p0, Ll1/C;->e:Z

    .line 192
    .line 193
    if-nez v6, :cond_e

    .line 194
    .line 195
    if-nez v5, :cond_c

    .line 196
    .line 197
    const/16 v6, 0xbd

    .line 198
    .line 199
    if-ne v0, v6, :cond_9

    .line 200
    .line 201
    new-instance p2, Ll1/c;

    .line 202
    .line 203
    invoke-direct {p2}, Ll1/c;-><init>()V

    .line 204
    .line 205
    .line 206
    :goto_2
    iput-boolean v3, p0, Ll1/C;->f:Z

    .line 207
    .line 208
    :goto_3
    invoke-interface {p1}, LF0/s;->p()J

    .line 209
    .line 210
    .line 211
    move-result-wide v6

    .line 212
    iput-wide v6, p0, Ll1/C;->h:J

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_9
    and-int/lit16 v6, p2, 0xe0

    .line 216
    .line 217
    const/16 v7, 0xc0

    .line 218
    .line 219
    if-ne v6, v7, :cond_a

    .line 220
    .line 221
    new-instance p2, Ll1/t;

    .line 222
    .line 223
    invoke-direct {p2}, Ll1/t;-><init>()V

    .line 224
    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_a
    and-int/lit16 p2, p2, 0xf0

    .line 228
    .line 229
    const/16 v6, 0xe0

    .line 230
    .line 231
    if-ne p2, v6, :cond_b

    .line 232
    .line 233
    new-instance p2, Ll1/n;

    .line 234
    .line 235
    invoke-direct {p2}, Ll1/n;-><init>()V

    .line 236
    .line 237
    .line 238
    iput-boolean v3, p0, Ll1/C;->g:Z

    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_b
    const/4 p2, 0x0

    .line 242
    :goto_4
    if-eqz p2, :cond_c

    .line 243
    .line 244
    new-instance v5, Ll1/K$d;

    .line 245
    .line 246
    const/16 v6, 0x100

    .line 247
    .line 248
    invoke-direct {v5, v0, v6}, Ll1/K$d;-><init>(II)V

    .line 249
    .line 250
    .line 251
    iget-object v6, p0, Ll1/C;->j:LF0/t;

    .line 252
    .line 253
    invoke-interface {p2, v6, v5}, Ll1/m;->e(LF0/t;Ll1/K$d;)V

    .line 254
    .line 255
    .line 256
    new-instance v5, Ll1/C$a;

    .line 257
    .line 258
    iget-object v6, p0, Ll1/C;->a:Lg0/E;

    .line 259
    .line 260
    invoke-direct {v5, p2, v6}, Ll1/C$a;-><init>(Ll1/m;Lg0/E;)V

    .line 261
    .line 262
    .line 263
    iget-object p2, p0, Ll1/C;->b:Landroid/util/SparseArray;

    .line 264
    .line 265
    invoke-virtual {p2, v0, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    :cond_c
    iget-boolean p2, p0, Ll1/C;->f:Z

    .line 269
    .line 270
    if-eqz p2, :cond_d

    .line 271
    .line 272
    iget-boolean p2, p0, Ll1/C;->g:Z

    .line 273
    .line 274
    if-eqz p2, :cond_d

    .line 275
    .line 276
    iget-wide v6, p0, Ll1/C;->h:J

    .line 277
    .line 278
    const-wide/16 v8, 0x2000

    .line 279
    .line 280
    add-long/2addr v6, v8

    .line 281
    goto :goto_5

    .line 282
    :cond_d
    const-wide/32 v6, 0x100000

    .line 283
    .line 284
    .line 285
    :goto_5
    invoke-interface {p1}, LF0/s;->p()J

    .line 286
    .line 287
    .line 288
    move-result-wide v8

    .line 289
    cmp-long p2, v8, v6

    .line 290
    .line 291
    if-lez p2, :cond_e

    .line 292
    .line 293
    iput-boolean v3, p0, Ll1/C;->e:Z

    .line 294
    .line 295
    iget-object p2, p0, Ll1/C;->j:LF0/t;

    .line 296
    .line 297
    invoke-interface {p2}, LF0/t;->j()V

    .line 298
    .line 299
    .line 300
    :cond_e
    iget-object p2, p0, Ll1/C;->c:Lg0/z;

    .line 301
    .line 302
    invoke-virtual {p2}, Lg0/z;->e()[B

    .line 303
    .line 304
    .line 305
    move-result-object p2

    .line 306
    invoke-interface {p1, p2, v1, v2}, LF0/s;->n([BII)V

    .line 307
    .line 308
    .line 309
    iget-object p2, p0, Ll1/C;->c:Lg0/z;

    .line 310
    .line 311
    invoke-virtual {p2, v1}, Lg0/z;->T(I)V

    .line 312
    .line 313
    .line 314
    iget-object p2, p0, Ll1/C;->c:Lg0/z;

    .line 315
    .line 316
    invoke-virtual {p2}, Lg0/z;->M()I

    .line 317
    .line 318
    .line 319
    move-result p2

    .line 320
    add-int/2addr p2, v4

    .line 321
    if-nez v5, :cond_f

    .line 322
    .line 323
    invoke-interface {p1, p2}, LF0/s;->i(I)V

    .line 324
    .line 325
    .line 326
    goto :goto_6

    .line 327
    :cond_f
    iget-object v0, p0, Ll1/C;->c:Lg0/z;

    .line 328
    .line 329
    invoke-virtual {v0, p2}, Lg0/z;->P(I)V

    .line 330
    .line 331
    .line 332
    iget-object v0, p0, Ll1/C;->c:Lg0/z;

    .line 333
    .line 334
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-interface {p1, v0, v1, p2}, LF0/s;->readFully([BII)V

    .line 339
    .line 340
    .line 341
    iget-object p1, p0, Ll1/C;->c:Lg0/z;

    .line 342
    .line 343
    invoke-virtual {p1, v4}, Lg0/z;->T(I)V

    .line 344
    .line 345
    .line 346
    iget-object p1, p0, Ll1/C;->c:Lg0/z;

    .line 347
    .line 348
    invoke-virtual {v5, p1}, Ll1/C$a;->a(Lg0/z;)V

    .line 349
    .line 350
    .line 351
    iget-object p1, p0, Ll1/C;->c:Lg0/z;

    .line 352
    .line 353
    invoke-virtual {p1}, Lg0/z;->b()I

    .line 354
    .line 355
    .line 356
    move-result p2

    .line 357
    invoke-virtual {p1, p2}, Lg0/z;->S(I)V

    .line 358
    .line 359
    .line 360
    :goto_6
    return v1
.end method

.method public release()V
    .locals 0

    .line 1
    return-void
.end method
