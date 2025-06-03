.class public final LY0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/r;


# static fields
.field public static final u:LF0/x;

.field public static final v:LT0/h$a;


# instance fields
.field public final a:I

.field public final b:J

.field public final c:Lg0/z;

.field public final d:LF0/I$a;

.field public final e:LF0/E;

.field public final f:LF0/G;

.field public final g:LF0/T;

.field public h:LF0/t;

.field public i:LF0/T;

.field public j:LF0/T;

.field public k:I

.field public l:Ld0/x;

.field public m:J

.field public n:J

.field public o:J

.field public p:I

.field public q:LY0/g;

.field public r:Z

.field public s:Z

.field public t:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LY0/d;

    .line 2
    .line 3
    invoke-direct {v0}, LY0/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LY0/f;->u:LF0/x;

    .line 7
    .line 8
    new-instance v0, LY0/e;

    .line 9
    .line 10
    invoke-direct {v0}, LY0/e;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LY0/f;->v:LT0/h$a;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, LY0/f;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 2
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {p0, p1, v0, v1}, LY0/f;-><init>(IJ)V

    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 p1, p1, 0x1

    :cond_0
    iput p1, p0, LY0/f;->a:I

    iput-wide p2, p0, LY0/f;->b:J

    new-instance p1, Lg0/z;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Lg0/z;-><init>(I)V

    iput-object p1, p0, LY0/f;->c:Lg0/z;

    new-instance p1, LF0/I$a;

    invoke-direct {p1}, LF0/I$a;-><init>()V

    iput-object p1, p0, LY0/f;->d:LF0/I$a;

    new-instance p1, LF0/E;

    invoke-direct {p1}, LF0/E;-><init>()V

    iput-object p1, p0, LY0/f;->e:LF0/E;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, LY0/f;->m:J

    new-instance p1, LF0/G;

    invoke-direct {p1}, LF0/G;-><init>()V

    iput-object p1, p0, LY0/f;->f:LF0/G;

    new-instance p1, LF0/n;

    invoke-direct {p1}, LF0/n;-><init>()V

    iput-object p1, p0, LY0/f;->g:LF0/T;

    iput-object p1, p0, LY0/f;->j:LF0/T;

    return-void
.end method

.method public static synthetic c()[LF0/r;
    .locals 1

    .line 1
    invoke-static {}, LY0/f;->r()[LF0/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic f(IIIII)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, LY0/f;->s(IIIII)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private h()V
    .locals 1

    .line 1
    iget-object v0, p0, LY0/f;->i:LF0/T;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY0/f;->h:LF0/t;

    .line 7
    .line 8
    invoke-static {v0}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static o(Ld0/x;)J
    .locals 6

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ld0/x;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v2, v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, v2}, Ld0/x;->d(I)Ld0/x$b;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    instance-of v4, v3, LT0/n;

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    check-cast v3, LT0/n;

    .line 20
    .line 21
    iget-object v4, v3, LT0/i;->o:Ljava/lang/String;

    .line 22
    .line 23
    const-string v5, "TLEN"

    .line 24
    .line 25
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    iget-object p0, v3, LT0/n;->r:LX2/v;

    .line 32
    .line 33
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    invoke-static {v0, v1}, Lg0/M;->J0(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    return-wide v0

    .line 48
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    return-wide v0
.end method

.method public static p(Lg0/z;I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lg0/z;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v1, p1, 0x4

    .line 6
    .line 7
    if-lt v0, v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lg0/z;->T(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const v0, 0x58696e67

    .line 17
    .line 18
    .line 19
    if-eq p1, v0, :cond_0

    .line 20
    .line 21
    const v0, 0x496e666f

    .line 22
    .line 23
    .line 24
    if-ne p1, v0, :cond_1

    .line 25
    .line 26
    :cond_0
    return p1

    .line 27
    :cond_1
    invoke-virtual {p0}, Lg0/z;->g()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/16 v0, 0x28

    .line 32
    .line 33
    if-lt p1, v0, :cond_2

    .line 34
    .line 35
    const/16 p1, 0x24

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lg0/z;->T(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    const p1, 0x56425249

    .line 45
    .line 46
    .line 47
    if-ne p0, p1, :cond_2

    .line 48
    .line 49
    return p1

    .line 50
    :cond_2
    const/4 p0, 0x0

    .line 51
    return p0
.end method

.method public static q(IJ)Z
    .locals 4

    .line 1
    const v0, -0x1f400

    .line 2
    .line 3
    .line 4
    and-int/2addr p0, v0

    .line 5
    int-to-long v0, p0

    .line 6
    const-wide/32 v2, -0x1f400

    .line 7
    .line 8
    .line 9
    and-long p0, p1, v2

    .line 10
    .line 11
    cmp-long p0, v0, p0

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    :goto_0
    return p0
.end method

.method private static synthetic r()[LF0/r;
    .locals 3

    .line 1
    new-instance v0, LY0/f;

    .line 2
    .line 3
    invoke-direct {v0}, LY0/f;-><init>()V

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

.method public static synthetic s(IIIII)Z
    .locals 3

    .line 1
    const/16 v0, 0x43

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/16 v2, 0x4d

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    const/16 v0, 0x4f

    .line 9
    .line 10
    if-ne p2, v0, :cond_0

    .line 11
    .line 12
    if-ne p3, v2, :cond_0

    .line 13
    .line 14
    if-eq p4, v2, :cond_1

    .line 15
    .line 16
    if-eq p0, v1, :cond_1

    .line 17
    .line 18
    :cond_0
    if-ne p1, v2, :cond_2

    .line 19
    .line 20
    const/16 p1, 0x4c

    .line 21
    .line 22
    if-ne p2, p1, :cond_2

    .line 23
    .line 24
    if-ne p3, p1, :cond_2

    .line 25
    .line 26
    const/16 p1, 0x54

    .line 27
    .line 28
    if-eq p4, p1, :cond_1

    .line 29
    .line 30
    if-ne p0, v1, :cond_2

    .line 31
    .line 32
    :cond_1
    const/4 p0, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const/4 p0, 0x0

    .line 35
    :goto_0
    return p0
.end method

.method public static t(Ld0/x;J)LY0/c;
    .locals 4

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ld0/x;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ld0/x;->d(I)Ld0/x$b;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    instance-of v3, v2, LT0/l;

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    check-cast v2, LT0/l;

    .line 19
    .line 20
    invoke-static {p0}, LY0/f;->o(Ld0/x;)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    invoke-static {p1, p2, v2, v0, v1}, LY0/c;->a(JLT0/l;J)LY0/c;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method private x(LF0/s;)I
    .locals 11

    .line 1
    iget v0, p0, LY0/f;->p:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, -0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-nez v0, :cond_4

    .line 7
    .line 8
    invoke-interface {p1}, LF0/s;->h()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, LY0/f;->v(LF0/s;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return v2

    .line 18
    :cond_0
    iget-object v0, p0, LY0/f;->c:Lg0/z;

    .line 19
    .line 20
    invoke-virtual {v0, v3}, Lg0/z;->T(I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, LY0/f;->c:Lg0/z;

    .line 24
    .line 25
    invoke-virtual {v0}, Lg0/z;->p()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget v4, p0, LY0/f;->k:I

    .line 30
    .line 31
    int-to-long v4, v4

    .line 32
    invoke-static {v0, v4, v5}, LY0/f;->q(IJ)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_3

    .line 37
    .line 38
    invoke-static {v0}, LF0/I;->j(I)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-ne v4, v2, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget-object v4, p0, LY0/f;->d:LF0/I$a;

    .line 46
    .line 47
    invoke-virtual {v4, v0}, LF0/I$a;->a(I)Z

    .line 48
    .line 49
    .line 50
    iget-wide v4, p0, LY0/f;->m:J

    .line 51
    .line 52
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    cmp-long v0, v4, v6

    .line 58
    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    iget-object v0, p0, LY0/f;->q:LY0/g;

    .line 62
    .line 63
    invoke-interface {p1}, LF0/s;->p()J

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    invoke-interface {v0, v4, v5}, LY0/g;->c(J)J

    .line 68
    .line 69
    .line 70
    move-result-wide v4

    .line 71
    iput-wide v4, p0, LY0/f;->m:J

    .line 72
    .line 73
    iget-wide v4, p0, LY0/f;->b:J

    .line 74
    .line 75
    cmp-long v0, v4, v6

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    iget-object v0, p0, LY0/f;->q:LY0/g;

    .line 80
    .line 81
    const-wide/16 v4, 0x0

    .line 82
    .line 83
    invoke-interface {v0, v4, v5}, LY0/g;->c(J)J

    .line 84
    .line 85
    .line 86
    move-result-wide v4

    .line 87
    iget-wide v6, p0, LY0/f;->m:J

    .line 88
    .line 89
    iget-wide v8, p0, LY0/f;->b:J

    .line 90
    .line 91
    sub-long/2addr v8, v4

    .line 92
    add-long/2addr v6, v8

    .line 93
    iput-wide v6, p0, LY0/f;->m:J

    .line 94
    .line 95
    :cond_2
    iget-object v0, p0, LY0/f;->d:LF0/I$a;

    .line 96
    .line 97
    iget v4, v0, LF0/I$a;->c:I

    .line 98
    .line 99
    iput v4, p0, LY0/f;->p:I

    .line 100
    .line 101
    iget-object v4, p0, LY0/f;->q:LY0/g;

    .line 102
    .line 103
    instance-of v5, v4, LY0/b;

    .line 104
    .line 105
    if-eqz v5, :cond_4

    .line 106
    .line 107
    check-cast v4, LY0/b;

    .line 108
    .line 109
    iget-wide v5, p0, LY0/f;->n:J

    .line 110
    .line 111
    iget v0, v0, LF0/I$a;->g:I

    .line 112
    .line 113
    int-to-long v7, v0

    .line 114
    add-long/2addr v5, v7

    .line 115
    invoke-virtual {p0, v5, v6}, LY0/f;->k(J)J

    .line 116
    .line 117
    .line 118
    move-result-wide v5

    .line 119
    invoke-interface {p1}, LF0/s;->p()J

    .line 120
    .line 121
    .line 122
    move-result-wide v7

    .line 123
    iget-object v0, p0, LY0/f;->d:LF0/I$a;

    .line 124
    .line 125
    iget v0, v0, LF0/I$a;->c:I

    .line 126
    .line 127
    int-to-long v9, v0

    .line 128
    add-long/2addr v7, v9

    .line 129
    invoke-virtual {v4, v5, v6, v7, v8}, LY0/b;->b(JJ)V

    .line 130
    .line 131
    .line 132
    iget-boolean v0, p0, LY0/f;->s:Z

    .line 133
    .line 134
    if-eqz v0, :cond_4

    .line 135
    .line 136
    iget-wide v5, p0, LY0/f;->t:J

    .line 137
    .line 138
    invoke-virtual {v4, v5, v6}, LY0/b;->a(J)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_4

    .line 143
    .line 144
    iput-boolean v3, p0, LY0/f;->s:Z

    .line 145
    .line 146
    iget-object v0, p0, LY0/f;->i:LF0/T;

    .line 147
    .line 148
    iput-object v0, p0, LY0/f;->j:LF0/T;

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_3
    :goto_0
    invoke-interface {p1, v1}, LF0/s;->i(I)V

    .line 152
    .line 153
    .line 154
    iput v3, p0, LY0/f;->k:I

    .line 155
    .line 156
    return v3

    .line 157
    :cond_4
    :goto_1
    iget-object v0, p0, LY0/f;->j:LF0/T;

    .line 158
    .line 159
    iget v4, p0, LY0/f;->p:I

    .line 160
    .line 161
    invoke-interface {v0, p1, v4, v1}, LF0/T;->f(Ld0/i;IZ)I

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-ne p1, v2, :cond_5

    .line 166
    .line 167
    return v2

    .line 168
    :cond_5
    iget v0, p0, LY0/f;->p:I

    .line 169
    .line 170
    sub-int/2addr v0, p1

    .line 171
    iput v0, p0, LY0/f;->p:I

    .line 172
    .line 173
    if-lez v0, :cond_6

    .line 174
    .line 175
    return v3

    .line 176
    :cond_6
    iget-object v4, p0, LY0/f;->j:LF0/T;

    .line 177
    .line 178
    iget-wide v0, p0, LY0/f;->n:J

    .line 179
    .line 180
    invoke-virtual {p0, v0, v1}, LY0/f;->k(J)J

    .line 181
    .line 182
    .line 183
    move-result-wide v5

    .line 184
    iget-object p1, p0, LY0/f;->d:LF0/I$a;

    .line 185
    .line 186
    iget v8, p1, LF0/I$a;->c:I

    .line 187
    .line 188
    const/4 v9, 0x0

    .line 189
    const/4 v10, 0x0

    .line 190
    const/4 v7, 0x1

    .line 191
    invoke-interface/range {v4 .. v10}, LF0/T;->b(JIIILF0/T$a;)V

    .line 192
    .line 193
    .line 194
    iget-wide v0, p0, LY0/f;->n:J

    .line 195
    .line 196
    iget-object p1, p0, LY0/f;->d:LF0/I$a;

    .line 197
    .line 198
    iget p1, p1, LF0/I$a;->g:I

    .line 199
    .line 200
    int-to-long v4, p1

    .line 201
    add-long/2addr v0, v4

    .line 202
    iput-wide v0, p0, LY0/f;->n:J

    .line 203
    .line 204
    iput v3, p0, LY0/f;->p:I

    .line 205
    .line 206
    return v3
.end method


# virtual methods
.method public a(JJ)V
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, LY0/f;->k:I

    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, LY0/f;->m:J

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iput-wide v0, p0, LY0/f;->n:J

    .line 14
    .line 15
    iput p1, p0, LY0/f;->p:I

    .line 16
    .line 17
    iput-wide p3, p0, LY0/f;->t:J

    .line 18
    .line 19
    iget-object p1, p0, LY0/f;->q:LY0/g;

    .line 20
    .line 21
    instance-of p2, p1, LY0/b;

    .line 22
    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    check-cast p1, LY0/b;

    .line 26
    .line 27
    invoke-virtual {p1, p3, p4}, LY0/b;->a(J)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, LY0/f;->s:Z

    .line 35
    .line 36
    iget-object p1, p0, LY0/f;->g:LF0/T;

    .line 37
    .line 38
    iput-object p1, p0, LY0/f;->j:LF0/T;

    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public b(LF0/t;)V
    .locals 2

    .line 1
    iput-object p1, p0, LY0/f;->h:LF0/t;

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
    move-result-object p1

    .line 9
    iput-object p1, p0, LY0/f;->i:LF0/T;

    .line 10
    .line 11
    iput-object p1, p0, LY0/f;->j:LF0/T;

    .line 12
    .line 13
    iget-object p1, p0, LY0/f;->h:LF0/t;

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
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, LY0/f;->y(LF0/s;Z)Z

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
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
    .locals 4

    .line 1
    invoke-direct {p0}, LY0/f;->h()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, LY0/f;->w(LF0/s;)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/4 p2, -0x1

    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    iget-object p2, p0, LY0/f;->q:LY0/g;

    .line 12
    .line 13
    instance-of p2, p2, LY0/b;

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    iget-wide v0, p0, LY0/f;->n:J

    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, LY0/f;->k(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    iget-object p2, p0, LY0/f;->q:LY0/g;

    .line 24
    .line 25
    invoke-interface {p2}, LF0/M;->l()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    cmp-long p2, v2, v0

    .line 30
    .line 31
    if-eqz p2, :cond_0

    .line 32
    .line 33
    iget-object p2, p0, LY0/f;->q:LY0/g;

    .line 34
    .line 35
    check-cast p2, LY0/b;

    .line 36
    .line 37
    invoke-virtual {p2, v0, v1}, LY0/b;->d(J)V

    .line 38
    .line 39
    .line 40
    iget-object p2, p0, LY0/f;->h:LF0/t;

    .line 41
    .line 42
    iget-object v0, p0, LY0/f;->q:LY0/g;

    .line 43
    .line 44
    invoke-interface {p2, v0}, LF0/t;->e(LF0/M;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return p1
.end method

.method public final j(LF0/s;)LY0/g;
    .locals 11

    .line 1
    invoke-virtual {p0, p1}, LY0/f;->u(LF0/s;)LY0/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LY0/f;->l:Ld0/x;

    .line 6
    .line 7
    invoke-interface {p1}, LF0/s;->p()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    invoke-static {v1, v2, v3}, LY0/f;->t(Ld0/x;J)LY0/c;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-boolean v2, p0, LY0/f;->r:Z

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    new-instance p1, LY0/g$a;

    .line 20
    .line 21
    invoke-direct {p1}, LY0/g$a;-><init>()V

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    iget v2, p0, LY0/f;->a:I

    .line 26
    .line 27
    and-int/lit8 v2, v2, 0x4

    .line 28
    .line 29
    if-eqz v2, :cond_3

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {v1}, LF0/M;->l()J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    invoke-interface {v1}, LY0/g;->f()J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    :goto_0
    move-wide v9, v0

    .line 42
    move-wide v5, v2

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-interface {v0}, LF0/M;->l()J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    invoke-interface {v0}, LY0/g;->f()J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    iget-object v0, p0, LY0/f;->l:Ld0/x;

    .line 56
    .line 57
    invoke-static {v0}, LY0/f;->o(Ld0/x;)J

    .line 58
    .line 59
    .line 60
    move-result-wide v2

    .line 61
    const-wide/16 v0, -0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :goto_1
    new-instance v0, LY0/b;

    .line 65
    .line 66
    invoke-interface {p1}, LF0/s;->p()J

    .line 67
    .line 68
    .line 69
    move-result-wide v7

    .line 70
    move-object v4, v0

    .line 71
    invoke-direct/range {v4 .. v10}, LY0/b;-><init>(JJJ)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    if-eqz v1, :cond_4

    .line 76
    .line 77
    move-object v0, v1

    .line 78
    goto :goto_2

    .line 79
    :cond_4
    if-eqz v0, :cond_5

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_5
    const/4 v0, 0x0

    .line 83
    :goto_2
    const/4 v1, 0x1

    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    invoke-interface {v0}, LF0/M;->h()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-nez v2, :cond_8

    .line 91
    .line 92
    iget v2, p0, LY0/f;->a:I

    .line 93
    .line 94
    and-int/2addr v2, v1

    .line 95
    if-eqz v2, :cond_8

    .line 96
    .line 97
    :cond_6
    iget v0, p0, LY0/f;->a:I

    .line 98
    .line 99
    and-int/lit8 v0, v0, 0x2

    .line 100
    .line 101
    if-eqz v0, :cond_7

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_7
    const/4 v1, 0x0

    .line 105
    :goto_3
    invoke-virtual {p0, p1, v1}, LY0/f;->n(LF0/s;Z)LY0/g;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    :cond_8
    return-object v0
.end method

.method public final k(J)J
    .locals 4

    .line 1
    iget-wide v0, p0, LY0/f;->m:J

    .line 2
    .line 3
    const-wide/32 v2, 0xf4240

    .line 4
    .line 5
    .line 6
    mul-long/2addr p1, v2

    .line 7
    iget-object v2, p0, LY0/f;->d:LF0/I$a;

    .line 8
    .line 9
    iget v2, v2, LF0/I$a;->d:I

    .line 10
    .line 11
    int-to-long v2, v2

    .line 12
    div-long/2addr p1, v2

    .line 13
    add-long/2addr v0, p1

    .line 14
    return-wide v0
.end method

.method public l()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LY0/f;->r:Z

    .line 3
    .line 4
    return-void
.end method

.method public final m(JLY0/i;J)LY0/g;
    .locals 15

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    invoke-virtual/range {p3 .. p3}, LY0/i;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v5

    .line 7
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long v1, v5, v1

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    return-object v2

    .line 18
    :cond_0
    iget-wide v3, v0, LY0/i;->c:J

    .line 19
    .line 20
    const-wide/16 v7, -0x1

    .line 21
    .line 22
    cmp-long v1, v3, v7

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    add-long v1, p1, v3

    .line 27
    .line 28
    iget-object v7, v0, LY0/i;->a:LF0/I$a;

    .line 29
    .line 30
    iget v7, v7, LF0/I$a;->c:I

    .line 31
    .line 32
    int-to-long v7, v7

    .line 33
    sub-long/2addr v3, v7

    .line 34
    move-wide v8, v1

    .line 35
    :goto_0
    move-wide v10, v3

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    cmp-long v1, p4, v7

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    sub-long v1, p4, p1

    .line 42
    .line 43
    iget-object v3, v0, LY0/i;->a:LF0/I$a;

    .line 44
    .line 45
    iget v3, v3, LF0/I$a;->c:I

    .line 46
    .line 47
    int-to-long v3, v3

    .line 48
    sub-long v3, v1, v3

    .line 49
    .line 50
    move-wide/from16 v8, p4

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :goto_1
    sget-object v12, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 54
    .line 55
    const-wide/32 v3, 0x7a1200

    .line 56
    .line 57
    .line 58
    move-wide v1, v10

    .line 59
    move-object v7, v12

    .line 60
    invoke-static/range {v1 .. v7}, Lg0/M;->Y0(JJJLjava/math/RoundingMode;)J

    .line 61
    .line 62
    .line 63
    move-result-wide v1

    .line 64
    invoke-static {v1, v2}, La3/f;->d(J)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    iget-wide v2, v0, LY0/i;->b:J

    .line 69
    .line 70
    invoke-static {v10, v11, v2, v3, v12}, LZ2/e;->b(JJLjava/math/RoundingMode;)J

    .line 71
    .line 72
    .line 73
    move-result-wide v2

    .line 74
    invoke-static {v2, v3}, La3/f;->d(J)I

    .line 75
    .line 76
    .line 77
    move-result v13

    .line 78
    new-instance v2, LY0/a;

    .line 79
    .line 80
    iget-object v0, v0, LY0/i;->a:LF0/I$a;

    .line 81
    .line 82
    iget v0, v0, LF0/I$a;->c:I

    .line 83
    .line 84
    int-to-long v3, v0

    .line 85
    add-long v10, p1, v3

    .line 86
    .line 87
    const/4 v14, 0x0

    .line 88
    move-object v7, v2

    .line 89
    move v12, v1

    .line 90
    invoke-direct/range {v7 .. v14}, LY0/a;-><init>(JJIIZ)V

    .line 91
    .line 92
    .line 93
    :cond_2
    return-object v2
.end method

.method public final n(LF0/s;Z)LY0/g;
    .locals 9

    .line 1
    iget-object v0, p0, LY0/f;->c:Lg0/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x4

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-interface {p1, v0, v2, v1}, LF0/s;->n([BII)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LY0/f;->c:Lg0/z;

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Lg0/z;->T(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, LY0/f;->d:LF0/I$a;

    .line 18
    .line 19
    iget-object v1, p0, LY0/f;->c:Lg0/z;

    .line 20
    .line 21
    invoke-virtual {v1}, Lg0/z;->p()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1}, LF0/I$a;->a(I)Z

    .line 26
    .line 27
    .line 28
    new-instance v0, LY0/a;

    .line 29
    .line 30
    invoke-interface {p1}, LF0/s;->a()J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    invoke-interface {p1}, LF0/s;->p()J

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    iget-object v7, p0, LY0/f;->d:LF0/I$a;

    .line 39
    .line 40
    move-object v2, v0

    .line 41
    move v8, p2

    .line 42
    invoke-direct/range {v2 .. v8}, LY0/a;-><init>(JJLF0/I$a;Z)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method

.method public release()V
    .locals 0

    .line 1
    return-void
.end method

.method public final u(LF0/s;)LY0/g;
    .locals 12

    .line 1
    new-instance v5, Lg0/z;

    .line 2
    .line 3
    iget-object v0, p0, LY0/f;->d:LF0/I$a;

    .line 4
    .line 5
    iget v0, v0, LF0/I$a;->c:I

    .line 6
    .line 7
    invoke-direct {v5, v0}, Lg0/z;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v5}, Lg0/z;->e()[B

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, LY0/f;->d:LF0/I$a;

    .line 15
    .line 16
    iget v1, v1, LF0/I$a;->c:I

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-interface {p1, v0, v2, v1}, LF0/s;->n([BII)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, LY0/f;->d:LF0/I$a;

    .line 23
    .line 24
    iget v1, v0, LF0/I$a;->a:I

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    and-int/2addr v1, v2

    .line 28
    const/16 v3, 0x15

    .line 29
    .line 30
    iget v0, v0, LF0/I$a;->e:I

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    if-eq v0, v2, :cond_2

    .line 35
    .line 36
    const/16 v3, 0x24

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    if-eq v0, v2, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/16 v3, 0xd

    .line 43
    .line 44
    :cond_2
    :goto_0
    invoke-static {v5, v3}, LY0/f;->p(Lg0/z;I)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const v1, 0x496e666f

    .line 49
    .line 50
    .line 51
    const v2, 0x58696e67

    .line 52
    .line 53
    .line 54
    if-eq v0, v1, :cond_4

    .line 55
    .line 56
    const v1, 0x56425249

    .line 57
    .line 58
    .line 59
    if-eq v0, v1, :cond_3

    .line 60
    .line 61
    if-eq v0, v2, :cond_4

    .line 62
    .line 63
    invoke-interface {p1}, LF0/s;->h()V

    .line 64
    .line 65
    .line 66
    const/4 p1, 0x0

    .line 67
    goto/16 :goto_1

    .line 68
    .line 69
    :cond_3
    invoke-interface {p1}, LF0/s;->a()J

    .line 70
    .line 71
    .line 72
    move-result-wide v0

    .line 73
    invoke-interface {p1}, LF0/s;->p()J

    .line 74
    .line 75
    .line 76
    move-result-wide v2

    .line 77
    iget-object v4, p0, LY0/f;->d:LF0/I$a;

    .line 78
    .line 79
    invoke-static/range {v0 .. v5}, LY0/h;->a(JJLF0/I$a;Lg0/z;)LY0/h;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget-object v1, p0, LY0/f;->d:LF0/I$a;

    .line 84
    .line 85
    iget v1, v1, LF0/I$a;->c:I

    .line 86
    .line 87
    invoke-interface {p1, v1}, LF0/s;->i(I)V

    .line 88
    .line 89
    .line 90
    move-object p1, v0

    .line 91
    goto/16 :goto_1

    .line 92
    .line 93
    :cond_4
    iget-object v1, p0, LY0/f;->d:LF0/I$a;

    .line 94
    .line 95
    invoke-static {v1, v5}, LY0/i;->b(LF0/I$a;Lg0/z;)LY0/i;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    iget-object v1, p0, LY0/f;->e:LF0/E;

    .line 100
    .line 101
    invoke-virtual {v1}, LF0/E;->a()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-nez v1, :cond_5

    .line 106
    .line 107
    iget v1, v9, LY0/i;->d:I

    .line 108
    .line 109
    const/4 v3, -0x1

    .line 110
    if-eq v1, v3, :cond_5

    .line 111
    .line 112
    iget v4, v9, LY0/i;->e:I

    .line 113
    .line 114
    if-eq v4, v3, :cond_5

    .line 115
    .line 116
    iget-object v3, p0, LY0/f;->e:LF0/E;

    .line 117
    .line 118
    iput v1, v3, LF0/E;->a:I

    .line 119
    .line 120
    iput v4, v3, LF0/E;->b:I

    .line 121
    .line 122
    :cond_5
    invoke-interface {p1}, LF0/s;->p()J

    .line 123
    .line 124
    .line 125
    move-result-wide v7

    .line 126
    invoke-interface {p1}, LF0/s;->a()J

    .line 127
    .line 128
    .line 129
    move-result-wide v3

    .line 130
    const-wide/16 v5, -0x1

    .line 131
    .line 132
    cmp-long v1, v3, v5

    .line 133
    .line 134
    if-eqz v1, :cond_6

    .line 135
    .line 136
    iget-wide v3, v9, LY0/i;->c:J

    .line 137
    .line 138
    cmp-long v1, v3, v5

    .line 139
    .line 140
    if-eqz v1, :cond_6

    .line 141
    .line 142
    invoke-interface {p1}, LF0/s;->a()J

    .line 143
    .line 144
    .line 145
    move-result-wide v3

    .line 146
    iget-wide v5, v9, LY0/i;->c:J

    .line 147
    .line 148
    add-long/2addr v5, v7

    .line 149
    cmp-long v1, v3, v5

    .line 150
    .line 151
    if-eqz v1, :cond_6

    .line 152
    .line 153
    new-instance v1, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    const-string v3, "Data size mismatch between stream ("

    .line 159
    .line 160
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-interface {p1}, LF0/s;->a()J

    .line 164
    .line 165
    .line 166
    move-result-wide v3

    .line 167
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string v3, ") and Xing frame ("

    .line 171
    .line 172
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    iget-wide v3, v9, LY0/i;->c:J

    .line 176
    .line 177
    add-long/2addr v3, v7

    .line 178
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    const-string v3, "), using Xing value."

    .line 182
    .line 183
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    const-string v3, "Mp3Extractor"

    .line 191
    .line 192
    invoke-static {v3, v1}, Lg0/o;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    :cond_6
    iget-object v1, p0, LY0/f;->d:LF0/I$a;

    .line 196
    .line 197
    iget v1, v1, LF0/I$a;->c:I

    .line 198
    .line 199
    invoke-interface {p1, v1}, LF0/s;->i(I)V

    .line 200
    .line 201
    .line 202
    if-ne v0, v2, :cond_7

    .line 203
    .line 204
    invoke-static {v9, v7, v8}, LY0/j;->a(LY0/i;J)LY0/j;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    goto :goto_1

    .line 209
    :cond_7
    invoke-interface {p1}, LF0/s;->a()J

    .line 210
    .line 211
    .line 212
    move-result-wide v10

    .line 213
    move-object v6, p0

    .line 214
    invoke-virtual/range {v6 .. v11}, LY0/f;->m(JLY0/i;J)LY0/g;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    :goto_1
    return-object p1
.end method

.method public final v(LF0/s;)Z
    .locals 8

    .line 1
    iget-object v0, p0, LY0/f;->q:LY0/g;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, LY0/g;->f()J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    const-wide/16 v4, -0x1

    .line 11
    .line 12
    cmp-long v0, v2, v4

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, LF0/s;->m()J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    const-wide/16 v6, 0x4

    .line 21
    .line 22
    sub-long/2addr v2, v6

    .line 23
    cmp-long v0, v4, v2

    .line 24
    .line 25
    if-lez v0, :cond_0

    .line 26
    .line 27
    return v1

    .line 28
    :cond_0
    :try_start_0
    iget-object v0, p0, LY0/f;->c:Lg0/z;

    .line 29
    .line 30
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v3, 0x4

    .line 36
    invoke-interface {p1, v0, v2, v3, v1}, LF0/s;->l([BIIZ)Z

    .line 37
    .line 38
    .line 39
    move-result p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    xor-int/2addr p1, v1

    .line 41
    return p1

    .line 42
    :catch_0
    return v1
.end method

.method public final w(LF0/s;)I
    .locals 5

    .line 1
    iget v0, p0, LY0/f;->k:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :try_start_0
    invoke-virtual {p0, p1, v0}, LY0/f;->y(LF0/s;Z)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    const/4 p1, -0x1

    .line 11
    return p1

    .line 12
    :cond_0
    :goto_0
    iget-object v0, p0, LY0/f;->q:LY0/g;

    .line 13
    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    invoke-virtual {p0, p1}, LY0/f;->j(LF0/s;)LY0/g;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, LY0/f;->q:LY0/g;

    .line 21
    .line 22
    iget-object v1, p0, LY0/f;->h:LF0/t;

    .line 23
    .line 24
    invoke-interface {v1, v0}, LF0/t;->e(LF0/M;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Ld0/q$b;

    .line 28
    .line 29
    invoke-direct {v0}, Ld0/q$b;-><init>()V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, LY0/f;->d:LF0/I$a;

    .line 33
    .line 34
    iget-object v1, v1, LF0/I$a;->b:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/16 v1, 0x1000

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ld0/q$b;->f0(I)Ld0/q$b;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v1, p0, LY0/f;->d:LF0/I$a;

    .line 47
    .line 48
    iget v1, v1, LF0/I$a;->e:I

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ld0/q$b;->N(I)Ld0/q$b;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v1, p0, LY0/f;->d:LF0/I$a;

    .line 55
    .line 56
    iget v1, v1, LF0/I$a;->d:I

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ld0/q$b;->p0(I)Ld0/q$b;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v1, p0, LY0/f;->e:LF0/E;

    .line 63
    .line 64
    iget v1, v1, LF0/E;->a:I

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ld0/q$b;->V(I)Ld0/q$b;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v1, p0, LY0/f;->e:LF0/E;

    .line 71
    .line 72
    iget v1, v1, LF0/E;->b:I

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ld0/q$b;->W(I)Ld0/q$b;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget v1, p0, LY0/f;->a:I

    .line 79
    .line 80
    and-int/lit8 v1, v1, 0x8

    .line 81
    .line 82
    if-eqz v1, :cond_1

    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    goto :goto_1

    .line 86
    :cond_1
    iget-object v1, p0, LY0/f;->l:Ld0/x;

    .line 87
    .line 88
    :goto_1
    invoke-virtual {v0, v1}, Ld0/q$b;->h0(Ld0/x;)Ld0/q$b;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iget-object v1, p0, LY0/f;->q:LY0/g;

    .line 93
    .line 94
    invoke-interface {v1}, LY0/g;->k()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    const v2, -0x7fffffff

    .line 99
    .line 100
    .line 101
    if-eq v1, v2, :cond_2

    .line 102
    .line 103
    iget-object v1, p0, LY0/f;->q:LY0/g;

    .line 104
    .line 105
    invoke-interface {v1}, LY0/g;->k()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    invoke-virtual {v0, v1}, Ld0/q$b;->M(I)Ld0/q$b;

    .line 110
    .line 111
    .line 112
    :cond_2
    iget-object v1, p0, LY0/f;->j:LF0/T;

    .line 113
    .line 114
    invoke-virtual {v0}, Ld0/q$b;->K()Ld0/q;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-interface {v1, v0}, LF0/T;->d(Ld0/q;)V

    .line 119
    .line 120
    .line 121
    invoke-interface {p1}, LF0/s;->p()J

    .line 122
    .line 123
    .line 124
    move-result-wide v0

    .line 125
    iput-wide v0, p0, LY0/f;->o:J

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_3
    iget-wide v0, p0, LY0/f;->o:J

    .line 129
    .line 130
    const-wide/16 v2, 0x0

    .line 131
    .line 132
    cmp-long v0, v0, v2

    .line 133
    .line 134
    if-eqz v0, :cond_4

    .line 135
    .line 136
    invoke-interface {p1}, LF0/s;->p()J

    .line 137
    .line 138
    .line 139
    move-result-wide v0

    .line 140
    iget-wide v2, p0, LY0/f;->o:J

    .line 141
    .line 142
    cmp-long v4, v0, v2

    .line 143
    .line 144
    if-gez v4, :cond_4

    .line 145
    .line 146
    sub-long/2addr v2, v0

    .line 147
    long-to-int v0, v2

    .line 148
    invoke-interface {p1, v0}, LF0/s;->i(I)V

    .line 149
    .line 150
    .line 151
    :cond_4
    :goto_2
    invoke-direct {p0, p1}, LY0/f;->x(LF0/s;)I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    return p1
.end method

.method public final y(LF0/s;Z)Z
    .locals 11

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const v0, 0x8000

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/high16 v0, 0x20000

    .line 8
    .line 9
    :goto_0
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
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    if-nez v1, :cond_4

    .line 23
    .line 24
    iget v1, p0, LY0/f;->a:I

    .line 25
    .line 26
    and-int/lit8 v1, v1, 0x8

    .line 27
    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    move-object v1, v2

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    sget-object v1, LY0/f;->v:LT0/h$a;

    .line 33
    .line 34
    :goto_1
    iget-object v4, p0, LY0/f;->f:LF0/G;

    .line 35
    .line 36
    invoke-virtual {v4, p1, v1}, LF0/G;->a(LF0/s;LT0/h$a;)Ld0/x;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, p0, LY0/f;->l:Ld0/x;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    iget-object v4, p0, LY0/f;->e:LF0/E;

    .line 45
    .line 46
    invoke-virtual {v4, v1}, LF0/E;->c(Ld0/x;)Z

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-interface {p1}, LF0/s;->m()J

    .line 50
    .line 51
    .line 52
    move-result-wide v4

    .line 53
    long-to-int v1, v4

    .line 54
    if-nez p2, :cond_3

    .line 55
    .line 56
    invoke-interface {p1, v1}, LF0/s;->i(I)V

    .line 57
    .line 58
    .line 59
    :cond_3
    move v4, v3

    .line 60
    :goto_2
    move v5, v4

    .line 61
    move v6, v5

    .line 62
    goto :goto_3

    .line 63
    :cond_4
    move v1, v3

    .line 64
    move v4, v1

    .line 65
    goto :goto_2

    .line 66
    :goto_3
    invoke-virtual {p0, p1}, LY0/f;->v(LF0/s;)Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    const/4 v8, 0x1

    .line 71
    if-eqz v7, :cond_6

    .line 72
    .line 73
    if-lez v5, :cond_5

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_5
    new-instance p1, Ljava/io/EOFException;

    .line 77
    .line 78
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 79
    .line 80
    .line 81
    throw p1

    .line 82
    :cond_6
    iget-object v7, p0, LY0/f;->c:Lg0/z;

    .line 83
    .line 84
    invoke-virtual {v7, v3}, Lg0/z;->T(I)V

    .line 85
    .line 86
    .line 87
    iget-object v7, p0, LY0/f;->c:Lg0/z;

    .line 88
    .line 89
    invoke-virtual {v7}, Lg0/z;->p()I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    if-eqz v4, :cond_7

    .line 94
    .line 95
    int-to-long v9, v4

    .line 96
    invoke-static {v7, v9, v10}, LY0/f;->q(IJ)Z

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    if-eqz v9, :cond_8

    .line 101
    .line 102
    :cond_7
    invoke-static {v7}, LF0/I;->j(I)I

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    const/4 v10, -0x1

    .line 107
    if-ne v9, v10, :cond_c

    .line 108
    .line 109
    :cond_8
    add-int/lit8 v4, v6, 0x1

    .line 110
    .line 111
    if-ne v6, v0, :cond_a

    .line 112
    .line 113
    if-eqz p2, :cond_9

    .line 114
    .line 115
    return v3

    .line 116
    :cond_9
    const-string p1, "Searched too many bytes."

    .line 117
    .line 118
    invoke-static {p1, v2}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    throw p1

    .line 123
    :cond_a
    if-eqz p2, :cond_b

    .line 124
    .line 125
    invoke-interface {p1}, LF0/s;->h()V

    .line 126
    .line 127
    .line 128
    add-int v5, v1, v4

    .line 129
    .line 130
    invoke-interface {p1, v5}, LF0/s;->o(I)V

    .line 131
    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_b
    invoke-interface {p1, v8}, LF0/s;->i(I)V

    .line 135
    .line 136
    .line 137
    :goto_4
    move v5, v3

    .line 138
    move v6, v4

    .line 139
    move v4, v5

    .line 140
    goto :goto_3

    .line 141
    :cond_c
    add-int/lit8 v5, v5, 0x1

    .line 142
    .line 143
    if-ne v5, v8, :cond_d

    .line 144
    .line 145
    iget-object v4, p0, LY0/f;->d:LF0/I$a;

    .line 146
    .line 147
    invoke-virtual {v4, v7}, LF0/I$a;->a(I)Z

    .line 148
    .line 149
    .line 150
    move v4, v7

    .line 151
    goto :goto_7

    .line 152
    :cond_d
    const/4 v7, 0x4

    .line 153
    if-ne v5, v7, :cond_f

    .line 154
    .line 155
    :goto_5
    if-eqz p2, :cond_e

    .line 156
    .line 157
    add-int/2addr v1, v6

    .line 158
    invoke-interface {p1, v1}, LF0/s;->i(I)V

    .line 159
    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_e
    invoke-interface {p1}, LF0/s;->h()V

    .line 163
    .line 164
    .line 165
    :goto_6
    iput v4, p0, LY0/f;->k:I

    .line 166
    .line 167
    return v8

    .line 168
    :cond_f
    :goto_7
    add-int/lit8 v9, v9, -0x4

    .line 169
    .line 170
    invoke-interface {p1, v9}, LF0/s;->o(I)V

    .line 171
    .line 172
    .line 173
    goto :goto_3
.end method
