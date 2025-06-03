.class public final Ll1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll1/m;


# instance fields
.field public final a:Lg0/y;

.field public final b:Lg0/z;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public e:Ljava/lang/String;

.field public f:LF0/T;

.field public g:I

.field public h:I

.field public i:Z

.field public j:J

.field public k:Ld0/q;

.field public l:I

.field public m:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ll1/c;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lg0/y;

    const/16 v1, 0x80

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lg0/y;-><init>([B)V

    iput-object v0, p0, Ll1/c;->a:Lg0/y;

    new-instance v1, Lg0/z;

    iget-object v0, v0, Lg0/y;->a:[B

    invoke-direct {v1, v0}, Lg0/z;-><init>([B)V

    iput-object v1, p0, Ll1/c;->b:Lg0/z;

    const/4 v0, 0x0

    iput v0, p0, Ll1/c;->g:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Ll1/c;->m:J

    iput-object p1, p0, Ll1/c;->c:Ljava/lang/String;

    iput p2, p0, Ll1/c;->d:I

    return-void
.end method


# virtual methods
.method public a(Lg0/z;)V
    .locals 11

    .line 1
    iget-object v0, p0, Ll1/c;->f:LF0/T;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-lez v0, :cond_5

    .line 11
    .line 12
    iget v0, p0, Ll1/c;->g:I

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x1

    .line 17
    if-eqz v0, :cond_4

    .line 18
    .line 19
    if-eq v0, v3, :cond_3

    .line 20
    .line 21
    if-eq v0, v1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v1, p0, Ll1/c;->l:I

    .line 29
    .line 30
    iget v4, p0, Ll1/c;->h:I

    .line 31
    .line 32
    sub-int/2addr v1, v4

    .line 33
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v1, p0, Ll1/c;->f:LF0/T;

    .line 38
    .line 39
    invoke-interface {v1, p1, v0}, LF0/T;->e(Lg0/z;I)V

    .line 40
    .line 41
    .line 42
    iget v1, p0, Ll1/c;->h:I

    .line 43
    .line 44
    add-int/2addr v1, v0

    .line 45
    iput v1, p0, Ll1/c;->h:I

    .line 46
    .line 47
    iget v0, p0, Ll1/c;->l:I

    .line 48
    .line 49
    if-ne v1, v0, :cond_0

    .line 50
    .line 51
    iget-wide v0, p0, Ll1/c;->m:J

    .line 52
    .line 53
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    cmp-long v0, v0, v4

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    move v3, v2

    .line 64
    :goto_1
    invoke-static {v3}, Lg0/a;->f(Z)V

    .line 65
    .line 66
    .line 67
    iget-object v4, p0, Ll1/c;->f:LF0/T;

    .line 68
    .line 69
    iget-wide v5, p0, Ll1/c;->m:J

    .line 70
    .line 71
    iget v8, p0, Ll1/c;->l:I

    .line 72
    .line 73
    const/4 v9, 0x0

    .line 74
    const/4 v10, 0x0

    .line 75
    const/4 v7, 0x1

    .line 76
    invoke-interface/range {v4 .. v10}, LF0/T;->b(JIIILF0/T$a;)V

    .line 77
    .line 78
    .line 79
    iget-wide v0, p0, Ll1/c;->m:J

    .line 80
    .line 81
    iget-wide v3, p0, Ll1/c;->j:J

    .line 82
    .line 83
    add-long/2addr v0, v3

    .line 84
    iput-wide v0, p0, Ll1/c;->m:J

    .line 85
    .line 86
    iput v2, p0, Ll1/c;->g:I

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    iget-object v0, p0, Ll1/c;->b:Lg0/z;

    .line 90
    .line 91
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const/16 v3, 0x80

    .line 96
    .line 97
    invoke-virtual {p0, p1, v0, v3}, Ll1/c;->f(Lg0/z;[BI)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_0

    .line 102
    .line 103
    invoke-virtual {p0}, Ll1/c;->g()V

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, Ll1/c;->b:Lg0/z;

    .line 107
    .line 108
    invoke-virtual {v0, v2}, Lg0/z;->T(I)V

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, Ll1/c;->f:LF0/T;

    .line 112
    .line 113
    iget-object v2, p0, Ll1/c;->b:Lg0/z;

    .line 114
    .line 115
    invoke-interface {v0, v2, v3}, LF0/T;->e(Lg0/z;I)V

    .line 116
    .line 117
    .line 118
    iput v1, p0, Ll1/c;->g:I

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_4
    invoke-virtual {p0, p1}, Ll1/c;->h(Lg0/z;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_0

    .line 126
    .line 127
    iput v3, p0, Ll1/c;->g:I

    .line 128
    .line 129
    iget-object v0, p0, Ll1/c;->b:Lg0/z;

    .line 130
    .line 131
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    const/16 v4, 0xb

    .line 136
    .line 137
    aput-byte v4, v0, v2

    .line 138
    .line 139
    iget-object v0, p0, Ll1/c;->b:Lg0/z;

    .line 140
    .line 141
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    const/16 v2, 0x77

    .line 146
    .line 147
    aput-byte v2, v0, v3

    .line 148
    .line 149
    iput v1, p0, Ll1/c;->h:I

    .line 150
    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :cond_5
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ll1/c;->g:I

    .line 3
    .line 4
    iput v0, p0, Ll1/c;->h:I

    .line 5
    .line 6
    iput-boolean v0, p0, Ll1/c;->i:Z

    .line 7
    .line 8
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v0, p0, Ll1/c;->m:J

    .line 14
    .line 15
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
    iput-wide p1, p0, Ll1/c;->m:J

    .line 2
    .line 3
    return-void
.end method

.method public e(LF0/t;Ll1/K$d;)V
    .locals 1

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
    iput-object v0, p0, Ll1/c;->e:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p2}, Ll1/K$d;->c()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-interface {p1, p2, v0}, LF0/t;->a(II)LF0/T;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Ll1/c;->f:LF0/T;

    .line 20
    .line 21
    return-void
.end method

.method public final f(Lg0/z;[BI)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Ll1/c;->h:I

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
    iget v1, p0, Ll1/c;->h:I

    .line 14
    .line 15
    invoke-virtual {p1, p2, v1, v0}, Lg0/z;->l([BII)V

    .line 16
    .line 17
    .line 18
    iget p1, p0, Ll1/c;->h:I

    .line 19
    .line 20
    add-int/2addr p1, v0

    .line 21
    iput p1, p0, Ll1/c;->h:I

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

.method public final g()V
    .locals 4

    .line 1
    iget-object v0, p0, Ll1/c;->a:Lg0/y;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lg0/y;->p(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Ll1/c;->a:Lg0/y;

    .line 8
    .line 9
    invoke-static {v0}, LF0/b;->f(Lg0/y;)LF0/b$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Ll1/c;->k:Ld0/q;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget v2, v0, LF0/b$b;->d:I

    .line 18
    .line 19
    iget v3, v1, Ld0/q;->B:I

    .line 20
    .line 21
    if-ne v2, v3, :cond_0

    .line 22
    .line 23
    iget v2, v0, LF0/b$b;->c:I

    .line 24
    .line 25
    iget v3, v1, Ld0/q;->C:I

    .line 26
    .line 27
    if-ne v2, v3, :cond_0

    .line 28
    .line 29
    iget-object v2, v0, LF0/b$b;->a:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v1, v1, Ld0/q;->n:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v2, v1}, Lg0/M;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    :cond_0
    new-instance v1, Ld0/q$b;

    .line 40
    .line 41
    invoke-direct {v1}, Ld0/q$b;-><init>()V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Ll1/c;->e:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ld0/q$b;->a0(Ljava/lang/String;)Ld0/q$b;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v2, v0, LF0/b$b;->a:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget v2, v0, LF0/b$b;->d:I

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ld0/q$b;->N(I)Ld0/q$b;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iget v2, v0, LF0/b$b;->c:I

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ld0/q$b;->p0(I)Ld0/q$b;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget-object v2, p0, Ll1/c;->c:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ld0/q$b;->e0(Ljava/lang/String;)Ld0/q$b;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget v2, p0, Ll1/c;->d:I

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Ld0/q$b;->m0(I)Ld0/q$b;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iget v2, v0, LF0/b$b;->g:I

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Ld0/q$b;->j0(I)Ld0/q$b;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    const-string v2, "audio/ac3"

    .line 87
    .line 88
    iget-object v3, v0, LF0/b$b;->a:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_1

    .line 95
    .line 96
    iget v2, v0, LF0/b$b;->g:I

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Ld0/q$b;->M(I)Ld0/q$b;

    .line 99
    .line 100
    .line 101
    :cond_1
    invoke-virtual {v1}, Ld0/q$b;->K()Ld0/q;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    iput-object v1, p0, Ll1/c;->k:Ld0/q;

    .line 106
    .line 107
    iget-object v2, p0, Ll1/c;->f:LF0/T;

    .line 108
    .line 109
    invoke-interface {v2, v1}, LF0/T;->d(Ld0/q;)V

    .line 110
    .line 111
    .line 112
    :cond_2
    iget v1, v0, LF0/b$b;->e:I

    .line 113
    .line 114
    iput v1, p0, Ll1/c;->l:I

    .line 115
    .line 116
    iget v0, v0, LF0/b$b;->f:I

    .line 117
    .line 118
    int-to-long v0, v0

    .line 119
    const-wide/32 v2, 0xf4240

    .line 120
    .line 121
    .line 122
    mul-long/2addr v0, v2

    .line 123
    iget-object v2, p0, Ll1/c;->k:Ld0/q;

    .line 124
    .line 125
    iget v2, v2, Ld0/q;->C:I

    .line 126
    .line 127
    int-to-long v2, v2

    .line 128
    div-long/2addr v0, v2

    .line 129
    iput-wide v0, p0, Ll1/c;->j:J

    .line 130
    .line 131
    return-void
.end method

.method public final h(Lg0/z;)Z
    .locals 5

    .line 1
    :goto_0
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-lez v0, :cond_3

    .line 7
    .line 8
    iget-boolean v0, p0, Ll1/c;->i:Z

    .line 9
    .line 10
    const/16 v2, 0xb

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Lg0/z;->G()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ne v0, v2, :cond_0

    .line 20
    .line 21
    :goto_1
    move v1, v3

    .line 22
    :cond_0
    iput-boolean v1, p0, Ll1/c;->i:Z

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p1}, Lg0/z;->G()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/16 v4, 0x77

    .line 30
    .line 31
    if-ne v0, v4, :cond_2

    .line 32
    .line 33
    iput-boolean v1, p0, Ll1/c;->i:Z

    .line 34
    .line 35
    return v3

    .line 36
    :cond_2
    if-ne v0, v2, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    return v1
.end method
