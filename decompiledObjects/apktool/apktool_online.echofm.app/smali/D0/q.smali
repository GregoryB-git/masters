.class public final LD0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD0/q$b;,
        LD0/q$a;
    }
.end annotation


# instance fields
.field public final a:LD0/q$b;

.field public final b:LD0/s;

.field public final c:J

.field public d:Z

.field public e:I

.field public f:J

.field public g:J

.field public h:J

.field public i:J

.field public j:Z

.field public k:F

.field public l:Lg0/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;LD0/q$b;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LD0/q;->a:LD0/q$b;

    .line 5
    .line 6
    iput-wide p3, p0, LD0/q;->c:J

    .line 7
    .line 8
    new-instance p2, LD0/s;

    .line 9
    .line 10
    invoke-direct {p2, p1}, LD0/s;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, LD0/q;->b:LD0/s;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput p1, p0, LD0/q;->e:I

    .line 17
    .line 18
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    iput-wide p1, p0, LD0/q;->f:J

    .line 24
    .line 25
    iput-wide p1, p0, LD0/q;->h:J

    .line 26
    .line 27
    iput-wide p1, p0, LD0/q;->i:J

    .line 28
    .line 29
    const/high16 p1, 0x3f800000    # 1.0f

    .line 30
    .line 31
    iput p1, p0, LD0/q;->k:F

    .line 32
    .line 33
    sget-object p1, Lg0/c;->a:Lg0/c;

    .line 34
    .line 35
    iput-object p1, p0, LD0/q;->l:Lg0/c;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget v0, p0, LD0/q;->e:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput v0, p0, LD0/q;->e:I

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final b(JJJ)J
    .locals 0

    .line 1
    sub-long/2addr p5, p1

    .line 2
    long-to-double p1, p5

    .line 3
    iget p5, p0, LD0/q;->k:F

    .line 4
    .line 5
    float-to-double p5, p5

    .line 6
    div-double/2addr p1, p5

    .line 7
    double-to-long p1, p1

    .line 8
    iget-boolean p5, p0, LD0/q;->d:Z

    .line 9
    .line 10
    if-eqz p5, :cond_0

    .line 11
    .line 12
    iget-object p5, p0, LD0/q;->l:Lg0/c;

    .line 13
    .line 14
    invoke-interface {p5}, Lg0/c;->b()J

    .line 15
    .line 16
    .line 17
    move-result-wide p5

    .line 18
    invoke-static {p5, p6}, Lg0/M;->J0(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide p5

    .line 22
    sub-long/2addr p5, p3

    .line 23
    sub-long/2addr p1, p5

    .line 24
    :cond_0
    return-wide p1
.end method

.method public c(JJJJZLD0/q$a;)I
    .locals 17

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    move-wide/from16 v5, p1

    .line 4
    .line 5
    move-wide/from16 v11, p3

    .line 6
    .line 7
    move-object/from16 v15, p10

    .line 8
    .line 9
    invoke-static/range {p10 .. p10}, LD0/q$a;->a(LD0/q$a;)V

    .line 10
    .line 11
    .line 12
    iget-wide v0, v7, LD0/q;->f:J

    .line 13
    .line 14
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v0, v0, v8

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iput-wide v11, v7, LD0/q;->f:J

    .line 24
    .line 25
    :cond_0
    iget-wide v0, v7, LD0/q;->h:J

    .line 26
    .line 27
    cmp-long v0, v0, v5

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, v7, LD0/q;->b:LD0/s;

    .line 32
    .line 33
    invoke-virtual {v0, v5, v6}, LD0/s;->h(J)V

    .line 34
    .line 35
    .line 36
    iput-wide v5, v7, LD0/q;->h:J

    .line 37
    .line 38
    :cond_1
    move-object/from16 v0, p0

    .line 39
    .line 40
    move-wide/from16 v1, p3

    .line 41
    .line 42
    move-wide/from16 v3, p5

    .line 43
    .line 44
    move-wide/from16 v5, p1

    .line 45
    .line 46
    invoke-virtual/range {v0 .. v6}, LD0/q;->b(JJJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    invoke-static {v15, v0, v1}, LD0/q$a;->c(LD0/q$a;J)J

    .line 51
    .line 52
    .line 53
    invoke-static/range {p10 .. p10}, LD0/q$a;->b(LD0/q$a;)J

    .line 54
    .line 55
    .line 56
    move-result-wide v3

    .line 57
    move-object/from16 v0, p0

    .line 58
    .line 59
    move-wide/from16 v1, p3

    .line 60
    .line 61
    move-wide/from16 v5, p7

    .line 62
    .line 63
    invoke-virtual/range {v0 .. v6}, LD0/q;->s(JJJ)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const/4 v1, 0x0

    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    return v1

    .line 71
    :cond_2
    iget-boolean v0, v7, LD0/q;->d:Z

    .line 72
    .line 73
    const/4 v2, 0x5

    .line 74
    if-eqz v0, :cond_9

    .line 75
    .line 76
    iget-wide v3, v7, LD0/q;->f:J

    .line 77
    .line 78
    cmp-long v0, v11, v3

    .line 79
    .line 80
    if-nez v0, :cond_3

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    iget-object v0, v7, LD0/q;->l:Lg0/c;

    .line 84
    .line 85
    invoke-interface {v0}, Lg0/c;->c()J

    .line 86
    .line 87
    .line 88
    move-result-wide v3

    .line 89
    iget-object v0, v7, LD0/q;->b:LD0/s;

    .line 90
    .line 91
    invoke-static/range {p10 .. p10}, LD0/q$a;->b(LD0/q$a;)J

    .line 92
    .line 93
    .line 94
    move-result-wide v5

    .line 95
    const-wide/16 v13, 0x3e8

    .line 96
    .line 97
    mul-long/2addr v5, v13

    .line 98
    add-long/2addr v5, v3

    .line 99
    invoke-virtual {v0, v5, v6}, LD0/s;->b(J)J

    .line 100
    .line 101
    .line 102
    move-result-wide v5

    .line 103
    invoke-static {v15, v5, v6}, LD0/q$a;->e(LD0/q$a;J)J

    .line 104
    .line 105
    .line 106
    invoke-static/range {p10 .. p10}, LD0/q$a;->d(LD0/q$a;)J

    .line 107
    .line 108
    .line 109
    move-result-wide v5

    .line 110
    sub-long/2addr v5, v3

    .line 111
    div-long/2addr v5, v13

    .line 112
    invoke-static {v15, v5, v6}, LD0/q$a;->c(LD0/q$a;J)J

    .line 113
    .line 114
    .line 115
    iget-wide v3, v7, LD0/q;->i:J

    .line 116
    .line 117
    cmp-long v0, v3, v8

    .line 118
    .line 119
    const/4 v3, 0x1

    .line 120
    if-eqz v0, :cond_4

    .line 121
    .line 122
    iget-boolean v0, v7, LD0/q;->j:Z

    .line 123
    .line 124
    if-nez v0, :cond_4

    .line 125
    .line 126
    move v1, v3

    .line 127
    :cond_4
    iget-object v8, v7, LD0/q;->a:LD0/q$b;

    .line 128
    .line 129
    invoke-static/range {p10 .. p10}, LD0/q$a;->b(LD0/q$a;)J

    .line 130
    .line 131
    .line 132
    move-result-wide v9

    .line 133
    move-wide/from16 v11, p3

    .line 134
    .line 135
    move-wide/from16 v13, p5

    .line 136
    .line 137
    move/from16 v15, p9

    .line 138
    .line 139
    move/from16 v16, v1

    .line 140
    .line 141
    invoke-interface/range {v8 .. v16}, LD0/q$b;->n(JJJZZ)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_5

    .line 146
    .line 147
    const/4 v0, 0x4

    .line 148
    return v0

    .line 149
    :cond_5
    iget-object v8, v7, LD0/q;->a:LD0/q$b;

    .line 150
    .line 151
    invoke-static/range {p10 .. p10}, LD0/q$a;->b(LD0/q$a;)J

    .line 152
    .line 153
    .line 154
    move-result-wide v9

    .line 155
    move-wide/from16 v11, p5

    .line 156
    .line 157
    move/from16 v13, p9

    .line 158
    .line 159
    invoke-interface/range {v8 .. v13}, LD0/q$b;->m(JJZ)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_7

    .line 164
    .line 165
    if-eqz v1, :cond_6

    .line 166
    .line 167
    const/4 v0, 0x3

    .line 168
    goto :goto_0

    .line 169
    :cond_6
    const/4 v0, 0x2

    .line 170
    :goto_0
    return v0

    .line 171
    :cond_7
    invoke-static/range {p10 .. p10}, LD0/q$a;->b(LD0/q$a;)J

    .line 172
    .line 173
    .line 174
    move-result-wide v0

    .line 175
    const-wide/32 v4, 0xc350

    .line 176
    .line 177
    .line 178
    cmp-long v0, v0, v4

    .line 179
    .line 180
    if-lez v0, :cond_8

    .line 181
    .line 182
    return v2

    .line 183
    :cond_8
    return v3

    .line 184
    :cond_9
    :goto_1
    return v2
.end method

.method public d(Z)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget p1, p0, LD0/q;->e:I

    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    if-ne p1, v3, :cond_0

    .line 13
    .line 14
    iput-wide v1, p0, LD0/q;->i:J

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    iget-wide v3, p0, LD0/q;->i:J

    .line 18
    .line 19
    cmp-long p1, v3, v1

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    return v3

    .line 25
    :cond_1
    iget-object p1, p0, LD0/q;->l:Lg0/c;

    .line 26
    .line 27
    invoke-interface {p1}, Lg0/c;->b()J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    iget-wide v6, p0, LD0/q;->i:J

    .line 32
    .line 33
    cmp-long p1, v4, v6

    .line 34
    .line 35
    if-gez p1, :cond_2

    .line 36
    .line 37
    return v0

    .line 38
    :cond_2
    iput-wide v1, p0, LD0/q;->i:J

    .line 39
    .line 40
    return v3
.end method

.method public e(Z)V
    .locals 4

    .line 1
    iput-boolean p1, p0, LD0/q;->j:Z

    .line 2
    .line 3
    iget-wide v0, p0, LD0/q;->c:J

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long p1, v0, v2

    .line 8
    .line 9
    if-lez p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, LD0/q;->l:Lg0/c;

    .line 12
    .line 13
    invoke-interface {p1}, Lg0/c;->b()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iget-wide v2, p0, LD0/q;->c:J

    .line 18
    .line 19
    add-long/2addr v0, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    :goto_0
    iput-wide v0, p0, LD0/q;->i:J

    .line 27
    .line 28
    return-void
.end method

.method public final f(I)V
    .locals 1

    .line 1
    iget v0, p0, LD0/q;->e:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, LD0/q;->e:I

    .line 8
    .line 9
    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, LD0/q;->f(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public h(Z)V
    .locals 0

    .line 1
    iput p1, p0, LD0/q;->e:I

    .line 2
    .line 3
    return-void
.end method

.method public i()Z
    .locals 3

    .line 1
    iget v0, p0, LD0/q;->e:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iput v1, p0, LD0/q;->e:I

    .line 10
    .line 11
    iget-object v1, p0, LD0/q;->l:Lg0/c;

    .line 12
    .line 13
    invoke-interface {v1}, Lg0/c;->b()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    invoke-static {v1, v2}, Lg0/M;->J0(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    iput-wide v1, p0, LD0/q;->g:J

    .line 22
    .line 23
    return v0
.end method

.method public j()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, LD0/q;->f(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public k()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LD0/q;->d:Z

    .line 3
    .line 4
    iget-object v0, p0, LD0/q;->l:Lg0/c;

    .line 5
    .line 6
    invoke-interface {v0}, Lg0/c;->b()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Lg0/M;->J0(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iput-wide v0, p0, LD0/q;->g:J

    .line 15
    .line 16
    iget-object v0, p0, LD0/q;->b:LD0/s;

    .line 17
    .line 18
    invoke-virtual {v0}, LD0/s;->k()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public l()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LD0/q;->d:Z

    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, LD0/q;->i:J

    .line 10
    .line 11
    iget-object v0, p0, LD0/q;->b:LD0/s;

    .line 12
    .line 13
    invoke-virtual {v0}, LD0/s;->l()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public m()V
    .locals 3

    .line 1
    iget-object v0, p0, LD0/q;->b:LD0/s;

    .line 2
    .line 3
    invoke-virtual {v0}, LD0/s;->j()V

    .line 4
    .line 5
    .line 6
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    iput-wide v0, p0, LD0/q;->h:J

    .line 12
    .line 13
    iput-wide v0, p0, LD0/q;->f:J

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {p0, v2}, LD0/q;->f(I)V

    .line 17
    .line 18
    .line 19
    iput-wide v0, p0, LD0/q;->i:J

    .line 20
    .line 21
    return-void
.end method

.method public n(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LD0/q;->b:LD0/s;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LD0/s;->o(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public o(Lg0/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD0/q;->l:Lg0/c;

    .line 2
    .line 3
    return-void
.end method

.method public p(F)V
    .locals 1

    .line 1
    iget-object v0, p0, LD0/q;->b:LD0/s;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LD0/s;->g(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public q(Landroid/view/Surface;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD0/q;->b:LD0/s;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LD0/s;->m(Landroid/view/Surface;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1}, LD0/q;->f(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public r(F)V
    .locals 1

    .line 1
    iget v0, p0, LD0/q;->k:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iput p1, p0, LD0/q;->k:F

    .line 9
    .line 10
    iget-object v0, p0, LD0/q;->b:LD0/s;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, LD0/s;->i(F)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final s(JJJ)Z
    .locals 4

    .line 1
    iget-wide v0, p0, LD0/q;->i:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, LD0/q;->j:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    iget v0, p0, LD0/q;->e:I

    .line 19
    .line 20
    if-eqz v0, :cond_6

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    if-eq v0, v2, :cond_5

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    if-eq v0, v3, :cond_3

    .line 27
    .line 28
    const/4 p1, 0x3

    .line 29
    if-ne v0, p1, :cond_2

    .line 30
    .line 31
    iget-object p1, p0, LD0/q;->l:Lg0/c;

    .line 32
    .line 33
    invoke-interface {p1}, Lg0/c;->b()J

    .line 34
    .line 35
    .line 36
    move-result-wide p1

    .line 37
    invoke-static {p1, p2}, Lg0/M;->J0(J)J

    .line 38
    .line 39
    .line 40
    move-result-wide p1

    .line 41
    iget-wide p5, p0, LD0/q;->g:J

    .line 42
    .line 43
    sub-long/2addr p1, p5

    .line 44
    iget-boolean p5, p0, LD0/q;->d:Z

    .line 45
    .line 46
    if-eqz p5, :cond_1

    .line 47
    .line 48
    iget-object p5, p0, LD0/q;->a:LD0/q$b;

    .line 49
    .line 50
    invoke-interface {p5, p3, p4, p1, p2}, LD0/q$b;->y(JJ)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    move v1, v2

    .line 57
    :cond_1
    return v1

    .line 58
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_3
    cmp-long p1, p1, p5

    .line 65
    .line 66
    if-ltz p1, :cond_4

    .line 67
    .line 68
    move v1, v2

    .line 69
    :cond_4
    return v1

    .line 70
    :cond_5
    return v2

    .line 71
    :cond_6
    iget-boolean p1, p0, LD0/q;->d:Z

    .line 72
    .line 73
    return p1
.end method
