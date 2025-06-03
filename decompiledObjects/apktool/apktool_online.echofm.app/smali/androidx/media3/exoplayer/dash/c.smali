.class public Landroidx/media3/exoplayer/dash/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/exoplayer/dash/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/dash/c$b;,
        Landroidx/media3/exoplayer/dash/c$c;,
        Landroidx/media3/exoplayer/dash/c$a;
    }
.end annotation


# instance fields
.field public final a:LB0/o;

.field public final b:Ln0/b;

.field public final c:[I

.field public final d:I

.field public final e:Li0/g;

.field public final f:J

.field public final g:I

.field public final h:Landroidx/media3/exoplayer/dash/d$c;

.field public final i:[Landroidx/media3/exoplayer/dash/c$b;

.field public j:LA0/y;

.field public k:Lo0/c;

.field public l:I

.field public m:Ljava/io/IOException;

.field public n:Z

.field public o:J


# direct methods
.method public constructor <init>(Ly0/f$a;LB0/o;Lo0/c;Ln0/b;I[ILA0/y;ILi0/g;JIZLjava/util/List;Landroidx/media3/exoplayer/dash/d$c;Ll0/y1;LB0/f;)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move/from16 v3, p5

    move-object/from16 v4, p7

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v5, p2

    iput-object v5, v0, Landroidx/media3/exoplayer/dash/c;->a:LB0/o;

    iput-object v1, v0, Landroidx/media3/exoplayer/dash/c;->k:Lo0/c;

    iput-object v2, v0, Landroidx/media3/exoplayer/dash/c;->b:Ln0/b;

    move-object/from16 v5, p6

    iput-object v5, v0, Landroidx/media3/exoplayer/dash/c;->c:[I

    iput-object v4, v0, Landroidx/media3/exoplayer/dash/c;->j:LA0/y;

    move/from16 v12, p8

    iput v12, v0, Landroidx/media3/exoplayer/dash/c;->d:I

    move-object/from16 v5, p9

    iput-object v5, v0, Landroidx/media3/exoplayer/dash/c;->e:Li0/g;

    iput v3, v0, Landroidx/media3/exoplayer/dash/c;->l:I

    move-wide/from16 v5, p10

    iput-wide v5, v0, Landroidx/media3/exoplayer/dash/c;->f:J

    move/from16 v5, p12

    iput v5, v0, Landroidx/media3/exoplayer/dash/c;->g:I

    move-object/from16 v13, p15

    iput-object v13, v0, Landroidx/media3/exoplayer/dash/c;->h:Landroidx/media3/exoplayer/dash/d$c;

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v5, v0, Landroidx/media3/exoplayer/dash/c;->o:J

    invoke-virtual {v1, v3}, Lo0/c;->g(I)J

    move-result-wide v23

    invoke-virtual/range {p0 .. p0}, Landroidx/media3/exoplayer/dash/c;->n()Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface/range {p7 .. p7}, LA0/B;->length()I

    move-result v3

    new-array v3, v3, [Landroidx/media3/exoplayer/dash/c$b;

    iput-object v3, v0, Landroidx/media3/exoplayer/dash/c;->i:[Landroidx/media3/exoplayer/dash/c$b;

    const/4 v3, 0x0

    move v15, v3

    :goto_0
    iget-object v5, v0, Landroidx/media3/exoplayer/dash/c;->i:[Landroidx/media3/exoplayer/dash/c$b;

    array-length v5, v5

    if-ge v15, v5, :cond_1

    invoke-interface {v4, v15}, LA0/B;->c(I)I

    move-result v5

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v14, v5

    check-cast v14, Lo0/j;

    iget-object v5, v14, Lo0/j;->c:LX2/v;

    invoke-virtual {v2, v5}, Ln0/b;->j(Ljava/util/List;)Lo0/b;

    move-result-object v5

    iget-object v11, v0, Landroidx/media3/exoplayer/dash/c;->i:[Landroidx/media3/exoplayer/dash/c$b;

    new-instance v25, Landroidx/media3/exoplayer/dash/c$b;

    if-eqz v5, :cond_0

    :goto_1
    move-object/from16 v18, v5

    goto :goto_2

    :cond_0
    iget-object v5, v14, Lo0/j;->c:LX2/v;

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo0/b;

    goto :goto_1

    :goto_2
    iget-object v7, v14, Lo0/j;->b:Ld0/q;

    move-object/from16 v5, p1

    move/from16 v6, p8

    move/from16 v8, p13

    move-object/from16 v9, p14

    move-object/from16 v10, p15

    move-object/from16 v26, v11

    move-object/from16 v11, p16

    invoke-interface/range {v5 .. v11}, Ly0/f$a;->c(ILd0/q;ZLjava/util/List;LF0/T;Ll0/y1;)Ly0/f;

    move-result-object v19

    const-wide/16 v20, 0x0

    invoke-virtual {v14}, Lo0/j;->l()Ln0/g;

    move-result-object v22

    move-object v5, v14

    move-object/from16 v14, v25

    move v6, v15

    move-wide/from16 v15, v23

    move-object/from16 v17, v5

    invoke-direct/range {v14 .. v22}, Landroidx/media3/exoplayer/dash/c$b;-><init>(JLo0/j;Lo0/b;Ly0/f;JLn0/g;)V

    aput-object v25, v26, v6

    add-int/lit8 v15, v6, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c;->m:Ljava/io/IOException;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c;->a:LB0/o;

    invoke-interface {v0}, LB0/o;->a()V

    return-void

    :cond_0
    throw v0
.end method

.method public b(JLy0/e;Ljava/util/List;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c;->m:Ljava/io/IOException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c;->j:LA0/y;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3, p4}, LA0/y;->q(JLy0/e;Ljava/util/List;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public c(Lo0/c;I)V
    .locals 5

    .line 1
    :try_start_0
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/c;->k:Lo0/c;

    .line 2
    .line 3
    iput p2, p0, Landroidx/media3/exoplayer/dash/c;->l:I

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Lo0/c;->g(I)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    invoke-virtual {p0}, Landroidx/media3/exoplayer/dash/c;->n()Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/c;->i:[Landroidx/media3/exoplayer/dash/c$b;

    .line 15
    .line 16
    array-length v2, v2

    .line 17
    if-ge v1, v2, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/c;->j:LA0/y;

    .line 20
    .line 21
    invoke-interface {v2, v1}, LA0/B;->c(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lo0/j;

    .line 30
    .line 31
    iget-object v3, p0, Landroidx/media3/exoplayer/dash/c;->i:[Landroidx/media3/exoplayer/dash/c$b;

    .line 32
    .line 33
    aget-object v4, v3, v1

    .line 34
    .line 35
    invoke-virtual {v4, p1, p2, v2}, Landroidx/media3/exoplayer/dash/c$b;->b(JLo0/j;)Landroidx/media3/exoplayer/dash/c$b;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    aput-object v2, v3, v1
    :try_end_0
    .catch Lx0/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catch_0
    move-exception p1

    .line 45
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/c;->m:Ljava/io/IOException;

    .line 46
    .line 47
    :cond_0
    return-void
.end method

.method public d(JLk0/d1;)J
    .locals 16

    .line 1
    move-wide/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v7, p0

    .line 4
    .line 5
    iget-object v0, v7, Landroidx/media3/exoplayer/dash/c;->i:[Landroidx/media3/exoplayer/dash/c$b;

    .line 6
    .line 7
    array-length v3, v0

    .line 8
    const/4 v4, 0x0

    .line 9
    :goto_0
    if-ge v4, v3, :cond_4

    .line 10
    .line 11
    aget-object v5, v0, v4

    .line 12
    .line 13
    iget-object v6, v5, Landroidx/media3/exoplayer/dash/c$b;->d:Ln0/g;

    .line 14
    .line 15
    if-eqz v6, :cond_3

    .line 16
    .line 17
    invoke-virtual {v5}, Landroidx/media3/exoplayer/dash/c$b;->h()J

    .line 18
    .line 19
    .line 20
    move-result-wide v8

    .line 21
    const-wide/16 v10, 0x0

    .line 22
    .line 23
    cmp-long v6, v8, v10

    .line 24
    .line 25
    if-nez v6, :cond_0

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_0
    invoke-virtual {v5, v1, v2}, Landroidx/media3/exoplayer/dash/c$b;->j(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    invoke-virtual {v5, v3, v4}, Landroidx/media3/exoplayer/dash/c$b;->k(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v10

    .line 36
    cmp-long v0, v10, v1

    .line 37
    .line 38
    if-gez v0, :cond_2

    .line 39
    .line 40
    const-wide/16 v12, -0x1

    .line 41
    .line 42
    cmp-long v0, v8, v12

    .line 43
    .line 44
    const-wide/16 v12, 0x1

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {v5}, Landroidx/media3/exoplayer/dash/c$b;->f()J

    .line 49
    .line 50
    .line 51
    move-result-wide v14

    .line 52
    add-long/2addr v14, v8

    .line 53
    sub-long/2addr v14, v12

    .line 54
    cmp-long v0, v3, v14

    .line 55
    .line 56
    if-gez v0, :cond_2

    .line 57
    .line 58
    :cond_1
    add-long/2addr v3, v12

    .line 59
    invoke-virtual {v5, v3, v4}, Landroidx/media3/exoplayer/dash/c$b;->k(J)J

    .line 60
    .line 61
    .line 62
    move-result-wide v3

    .line 63
    move-wide v5, v3

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    move-wide v5, v10

    .line 66
    :goto_1
    move-object/from16 v0, p3

    .line 67
    .line 68
    move-wide/from16 v1, p1

    .line 69
    .line 70
    move-wide v3, v10

    .line 71
    invoke-virtual/range {v0 .. v6}, Lk0/d1;->a(JJJ)J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    return-wide v0

    .line 76
    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    return-wide v1
.end method

.method public e(Ly0/e;ZLB0/m$c;LB0/m;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object p2, p0, Landroidx/media3/exoplayer/dash/c;->h:Landroidx/media3/exoplayer/dash/d$c;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    invoke-virtual {p2, p1}, Landroidx/media3/exoplayer/dash/d$c;->j(Ly0/e;)Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    return v1

    .line 17
    :cond_1
    iget-object p2, p0, Landroidx/media3/exoplayer/dash/c;->k:Lo0/c;

    .line 18
    .line 19
    iget-boolean p2, p2, Lo0/c;->d:Z

    .line 20
    .line 21
    if-nez p2, :cond_2

    .line 22
    .line 23
    instance-of p2, p1, Ly0/m;

    .line 24
    .line 25
    if-eqz p2, :cond_2

    .line 26
    .line 27
    iget-object p2, p3, LB0/m$c;->c:Ljava/io/IOException;

    .line 28
    .line 29
    instance-of v2, p2, Li0/t;

    .line 30
    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    check-cast p2, Li0/t;

    .line 34
    .line 35
    iget p2, p2, Li0/t;->r:I

    .line 36
    .line 37
    const/16 v2, 0x194

    .line 38
    .line 39
    if-ne p2, v2, :cond_2

    .line 40
    .line 41
    iget-object p2, p0, Landroidx/media3/exoplayer/dash/c;->i:[Landroidx/media3/exoplayer/dash/c$b;

    .line 42
    .line 43
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/c;->j:LA0/y;

    .line 44
    .line 45
    iget-object v3, p1, Ly0/e;->d:Ld0/q;

    .line 46
    .line 47
    invoke-interface {v2, v3}, LA0/B;->a(Ld0/q;)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    aget-object p2, p2, v2

    .line 52
    .line 53
    invoke-virtual {p2}, Landroidx/media3/exoplayer/dash/c$b;->h()J

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    const-wide/16 v4, -0x1

    .line 58
    .line 59
    cmp-long v4, v2, v4

    .line 60
    .line 61
    if-eqz v4, :cond_2

    .line 62
    .line 63
    const-wide/16 v4, 0x0

    .line 64
    .line 65
    cmp-long v4, v2, v4

    .line 66
    .line 67
    if-eqz v4, :cond_2

    .line 68
    .line 69
    invoke-virtual {p2}, Landroidx/media3/exoplayer/dash/c$b;->f()J

    .line 70
    .line 71
    .line 72
    move-result-wide v4

    .line 73
    add-long/2addr v4, v2

    .line 74
    const-wide/16 v2, 0x1

    .line 75
    .line 76
    sub-long/2addr v4, v2

    .line 77
    move-object p2, p1

    .line 78
    check-cast p2, Ly0/m;

    .line 79
    .line 80
    invoke-virtual {p2}, Ly0/m;->g()J

    .line 81
    .line 82
    .line 83
    move-result-wide v2

    .line 84
    cmp-long p2, v2, v4

    .line 85
    .line 86
    if-lez p2, :cond_2

    .line 87
    .line 88
    iput-boolean v1, p0, Landroidx/media3/exoplayer/dash/c;->n:Z

    .line 89
    .line 90
    return v1

    .line 91
    :cond_2
    iget-object p2, p0, Landroidx/media3/exoplayer/dash/c;->j:LA0/y;

    .line 92
    .line 93
    iget-object v2, p1, Ly0/e;->d:Ld0/q;

    .line 94
    .line 95
    invoke-interface {p2, v2}, LA0/B;->a(Ld0/q;)I

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/c;->i:[Landroidx/media3/exoplayer/dash/c$b;

    .line 100
    .line 101
    aget-object p2, v2, p2

    .line 102
    .line 103
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/c;->b:Ln0/b;

    .line 104
    .line 105
    iget-object v3, p2, Landroidx/media3/exoplayer/dash/c$b;->b:Lo0/j;

    .line 106
    .line 107
    iget-object v3, v3, Lo0/j;->c:LX2/v;

    .line 108
    .line 109
    invoke-virtual {v2, v3}, Ln0/b;->j(Ljava/util/List;)Lo0/b;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    if-eqz v2, :cond_3

    .line 114
    .line 115
    iget-object v3, p2, Landroidx/media3/exoplayer/dash/c$b;->c:Lo0/b;

    .line 116
    .line 117
    invoke-virtual {v3, v2}, Lo0/b;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-nez v2, :cond_3

    .line 122
    .line 123
    return v1

    .line 124
    :cond_3
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/c;->j:LA0/y;

    .line 125
    .line 126
    iget-object v3, p2, Landroidx/media3/exoplayer/dash/c$b;->b:Lo0/j;

    .line 127
    .line 128
    iget-object v3, v3, Lo0/j;->c:LX2/v;

    .line 129
    .line 130
    invoke-virtual {p0, v2, v3}, Landroidx/media3/exoplayer/dash/c;->j(LA0/y;Ljava/util/List;)LB0/m$a;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    const/4 v3, 0x2

    .line 135
    invoke-virtual {v2, v3}, LB0/m$a;->a(I)Z

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    if-nez v4, :cond_4

    .line 140
    .line 141
    invoke-virtual {v2, v1}, LB0/m$a;->a(I)Z

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    if-nez v4, :cond_4

    .line 146
    .line 147
    return v0

    .line 148
    :cond_4
    invoke-interface {p4, v2, p3}, LB0/m;->b(LB0/m$a;LB0/m$c;)LB0/m$b;

    .line 149
    .line 150
    .line 151
    move-result-object p3

    .line 152
    if-eqz p3, :cond_7

    .line 153
    .line 154
    iget p4, p3, LB0/m$b;->a:I

    .line 155
    .line 156
    invoke-virtual {v2, p4}, LB0/m$a;->a(I)Z

    .line 157
    .line 158
    .line 159
    move-result p4

    .line 160
    if-nez p4, :cond_5

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_5
    iget p4, p3, LB0/m$b;->a:I

    .line 164
    .line 165
    if-ne p4, v3, :cond_6

    .line 166
    .line 167
    iget-object p2, p0, Landroidx/media3/exoplayer/dash/c;->j:LA0/y;

    .line 168
    .line 169
    iget-object p1, p1, Ly0/e;->d:Ld0/q;

    .line 170
    .line 171
    invoke-interface {p2, p1}, LA0/B;->a(Ld0/q;)I

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    iget-wide p3, p3, LB0/m$b;->b:J

    .line 176
    .line 177
    invoke-interface {p2, p1, p3, p4}, LA0/y;->p(IJ)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    goto :goto_0

    .line 182
    :cond_6
    if-ne p4, v1, :cond_7

    .line 183
    .line 184
    iget-object p1, p0, Landroidx/media3/exoplayer/dash/c;->b:Ln0/b;

    .line 185
    .line 186
    iget-object p2, p2, Landroidx/media3/exoplayer/dash/c$b;->c:Lo0/b;

    .line 187
    .line 188
    iget-wide p3, p3, LB0/m$b;->b:J

    .line 189
    .line 190
    invoke-virtual {p1, p2, p3, p4}, Ln0/b;->e(Lo0/b;J)V

    .line 191
    .line 192
    .line 193
    move v0, v1

    .line 194
    :cond_7
    :goto_0
    return v0
.end method

.method public f(JLjava/util/List;)I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c;->m:Ljava/io/IOException;

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c;->j:LA0/y;

    invoke-interface {v0}, LA0/B;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c;->j:LA0/y;

    invoke-interface {v0, p1, p2, p3}, LA0/y;->k(JLjava/util/List;)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    return p1
.end method

.method public g(Ly0/e;)V
    .locals 7

    .line 1
    instance-of v0, p1, Ly0/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ly0/l;

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/media3/exoplayer/dash/c;->j:LA0/y;

    .line 9
    .line 10
    iget-object v0, v0, Ly0/e;->d:Ld0/q;

    .line 11
    .line 12
    invoke-interface {v1, v0}, LA0/B;->a(Ld0/q;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, Landroidx/media3/exoplayer/dash/c;->i:[Landroidx/media3/exoplayer/dash/c$b;

    .line 17
    .line 18
    aget-object v1, v1, v0

    .line 19
    .line 20
    iget-object v2, v1, Landroidx/media3/exoplayer/dash/c$b;->d:Ln0/g;

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    iget-object v2, v1, Landroidx/media3/exoplayer/dash/c$b;->a:Ly0/f;

    .line 25
    .line 26
    invoke-static {v2}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ly0/f;

    .line 31
    .line 32
    invoke-interface {v2}, Ly0/f;->d()LF0/h;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    iget-object v3, p0, Landroidx/media3/exoplayer/dash/c;->i:[Landroidx/media3/exoplayer/dash/c$b;

    .line 39
    .line 40
    new-instance v4, Ln0/i;

    .line 41
    .line 42
    iget-object v5, v1, Landroidx/media3/exoplayer/dash/c$b;->b:Lo0/j;

    .line 43
    .line 44
    iget-wide v5, v5, Lo0/j;->d:J

    .line 45
    .line 46
    invoke-direct {v4, v2, v5, v6}, Ln0/i;-><init>(LF0/h;J)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v4}, Landroidx/media3/exoplayer/dash/c$b;->c(Ln0/g;)Landroidx/media3/exoplayer/dash/c$b;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    aput-object v1, v3, v0

    .line 54
    .line 55
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c;->h:Landroidx/media3/exoplayer/dash/d$c;

    .line 56
    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/dash/d$c;->i(Ly0/e;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    return-void
.end method

.method public h(Lk0/y0;JLjava/util/List;Ly0/g;)V
    .locals 32

    .line 1
    move-object/from16 v15, p0

    move-object/from16 v14, p5

    iget-object v0, v15, Landroidx/media3/exoplayer/dash/c;->m:Ljava/io/IOException;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    move-object/from16 v0, p1

    iget-wide v9, v0, Lk0/y0;->a:J

    sub-long v11, p2, v9

    iget-object v0, v15, Landroidx/media3/exoplayer/dash/c;->k:Lo0/c;

    iget-wide v0, v0, Lo0/c;->a:J

    invoke-static {v0, v1}, Lg0/M;->J0(J)J

    move-result-wide v0

    iget-object v2, v15, Landroidx/media3/exoplayer/dash/c;->k:Lo0/c;

    iget v3, v15, Landroidx/media3/exoplayer/dash/c;->l:I

    invoke-virtual {v2, v3}, Lo0/c;->d(I)Lo0/g;

    move-result-object v2

    iget-wide v2, v2, Lo0/g;->b:J

    invoke-static {v2, v3}, Lg0/M;->J0(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    add-long v0, v0, p2

    iget-object v2, v15, Landroidx/media3/exoplayer/dash/c;->h:Landroidx/media3/exoplayer/dash/d$c;

    if-eqz v2, :cond_1

    invoke-virtual {v2, v0, v1}, Landroidx/media3/exoplayer/dash/d$c;->h(J)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-wide v0, v15, Landroidx/media3/exoplayer/dash/c;->f:J

    invoke-static {v0, v1}, Lg0/M;->d0(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lg0/M;->J0(J)J

    move-result-wide v7

    invoke-virtual {v15, v7, v8}, Landroidx/media3/exoplayer/dash/c;->m(J)J

    move-result-wide v24

    invoke-interface/range {p4 .. p4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v5, 0x1

    if-eqz v0, :cond_2

    move-object/from16 v6, p4

    const/16 v26, 0x0

    goto :goto_0

    :cond_2
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v5

    move-object/from16 v6, p4

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/m;

    move-object/from16 v26, v0

    :goto_0
    iget-object v0, v15, Landroidx/media3/exoplayer/dash/c;->j:LA0/y;

    invoke-interface {v0}, LA0/B;->length()I

    move-result v3

    new-array v4, v3, [Ly0/n;

    const/16 v27, 0x0

    move/from16 v2, v27

    :goto_1
    if-ge v2, v3, :cond_5

    iget-object v0, v15, Landroidx/media3/exoplayer/dash/c;->i:[Landroidx/media3/exoplayer/dash/c$b;

    aget-object v1, v0, v2

    iget-object v0, v1, Landroidx/media3/exoplayer/dash/c$b;->d:Ln0/g;

    if-nez v0, :cond_3

    sget-object v0, Ly0/n;->a:Ly0/n;

    aput-object v0, v4, v2

    move v13, v2

    move/from16 v28, v3

    move-object/from16 v29, v4

    move-wide/from16 v30, v11

    move-wide v11, v7

    goto :goto_2

    :cond_3
    invoke-virtual {v1, v7, v8}, Landroidx/media3/exoplayer/dash/c$b;->e(J)J

    move-result-wide v16

    invoke-virtual {v1, v7, v8}, Landroidx/media3/exoplayer/dash/c$b;->g(J)J

    move-result-wide v20

    move-object/from16 v0, p0

    move v13, v2

    move-object/from16 v2, v26

    move/from16 v28, v3

    move-object/from16 v29, v4

    move-wide/from16 v3, p2

    move-wide/from16 v5, v16

    move-wide/from16 v30, v11

    move-wide v11, v7

    move-wide/from16 v7, v20

    invoke-virtual/range {v0 .. v8}, Landroidx/media3/exoplayer/dash/c;->o(Landroidx/media3/exoplayer/dash/c$b;Ly0/m;JJJ)J

    move-result-wide v18

    cmp-long v0, v18, v16

    if-gez v0, :cond_4

    sget-object v0, Ly0/n;->a:Ly0/n;

    aput-object v0, v29, v13

    goto :goto_2

    :cond_4
    invoke-virtual {v15, v13}, Landroidx/media3/exoplayer/dash/c;->r(I)Landroidx/media3/exoplayer/dash/c$b;

    move-result-object v17

    new-instance v0, Landroidx/media3/exoplayer/dash/c$c;

    move-object/from16 v16, v0

    move-wide/from16 v22, v24

    invoke-direct/range {v16 .. v23}, Landroidx/media3/exoplayer/dash/c$c;-><init>(Landroidx/media3/exoplayer/dash/c$b;JJJ)V

    aput-object v0, v29, v13

    :goto_2
    add-int/lit8 v2, v13, 0x1

    move-object/from16 v6, p4

    move-wide v7, v11

    move/from16 v3, v28

    move-object/from16 v4, v29

    move-wide/from16 v11, v30

    const/4 v5, 0x1

    goto :goto_1

    :cond_5
    move-object/from16 v29, v4

    move-wide/from16 v30, v11

    move-wide v11, v7

    invoke-virtual {v15, v11, v12, v9, v10}, Landroidx/media3/exoplayer/dash/c;->k(JJ)J

    move-result-wide v5

    iget-object v0, v15, Landroidx/media3/exoplayer/dash/c;->j:LA0/y;

    move-wide v1, v9

    move-wide/from16 v3, v30

    move-object/from16 v7, p4

    move-object/from16 v8, v29

    invoke-interface/range {v0 .. v8}, LA0/y;->v(JJJLjava/util/List;[Ly0/n;)V

    iget-object v0, v15, Landroidx/media3/exoplayer/dash/c;->j:LA0/y;

    invoke-interface {v0}, LA0/y;->o()I

    move-result v0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iput-wide v1, v15, Landroidx/media3/exoplayer/dash/c;->o:J

    invoke-virtual {v15, v0}, Landroidx/media3/exoplayer/dash/c;->r(I)Landroidx/media3/exoplayer/dash/c$b;

    move-result-object v9

    iget-object v0, v9, Landroidx/media3/exoplayer/dash/c$b;->a:Ly0/f;

    const/16 v16, 0x0

    if-eqz v0, :cond_9

    iget-object v1, v9, Landroidx/media3/exoplayer/dash/c$b;->b:Lo0/j;

    invoke-interface {v0}, Ly0/f;->f()[Ld0/q;

    move-result-object v0

    if-nez v0, :cond_6

    invoke-virtual {v1}, Lo0/j;->n()Lo0/i;

    move-result-object v0

    move-object v6, v0

    goto :goto_3

    :cond_6
    const/4 v6, 0x0

    :goto_3
    iget-object v0, v9, Landroidx/media3/exoplayer/dash/c$b;->d:Ln0/g;

    if-nez v0, :cond_7

    invoke-virtual {v1}, Lo0/j;->m()Lo0/i;

    move-result-object v0

    move-object v7, v0

    goto :goto_4

    :cond_7
    const/4 v7, 0x0

    :goto_4
    if-nez v6, :cond_8

    if-eqz v7, :cond_9

    :cond_8
    iget-object v2, v15, Landroidx/media3/exoplayer/dash/c;->e:Li0/g;

    iget-object v0, v15, Landroidx/media3/exoplayer/dash/c;->j:LA0/y;

    invoke-interface {v0}, LA0/y;->m()Ld0/q;

    move-result-object v3

    iget-object v0, v15, Landroidx/media3/exoplayer/dash/c;->j:LA0/y;

    invoke-interface {v0}, LA0/y;->n()I

    move-result v4

    iget-object v0, v15, Landroidx/media3/exoplayer/dash/c;->j:LA0/y;

    invoke-interface {v0}, LA0/y;->s()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v0, p0

    move-object v1, v9

    move-object/from16 v8, v16

    invoke-virtual/range {v0 .. v8}, Landroidx/media3/exoplayer/dash/c;->p(Landroidx/media3/exoplayer/dash/c$b;Li0/g;Ld0/q;ILjava/lang/Object;Lo0/i;Lo0/i;LB0/g$a;)Ly0/e;

    move-result-object v0

    iput-object v0, v14, Ly0/g;->a:Ly0/e;

    return-void

    :cond_9
    invoke-static {v9}, Landroidx/media3/exoplayer/dash/c$b;->a(Landroidx/media3/exoplayer/dash/c$b;)J

    move-result-wide v17

    iget-object v0, v15, Landroidx/media3/exoplayer/dash/c;->k:Lo0/c;

    iget-boolean v1, v0, Lo0/c;->d:Z

    if-eqz v1, :cond_a

    iget v1, v15, Landroidx/media3/exoplayer/dash/c;->l:I

    invoke-virtual {v0}, Lo0/c;->e()I

    move-result v0

    const/4 v10, 0x1

    sub-int/2addr v0, v10

    if-ne v1, v0, :cond_b

    move v5, v10

    goto :goto_5

    :cond_a
    const/4 v10, 0x1

    :cond_b
    move/from16 v5, v27

    :goto_5
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v5, :cond_d

    cmp-long v0, v17, v19

    if-eqz v0, :cond_c

    goto :goto_6

    :cond_c
    move/from16 v0, v27

    goto :goto_7

    :cond_d
    :goto_6
    move v0, v10

    :goto_7
    invoke-virtual {v9}, Landroidx/media3/exoplayer/dash/c$b;->h()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_e

    iput-boolean v0, v14, Ly0/g;->b:Z

    return-void

    :cond_e
    invoke-virtual {v9, v11, v12}, Landroidx/media3/exoplayer/dash/c$b;->e(J)J

    move-result-wide v21

    invoke-virtual {v9, v11, v12}, Landroidx/media3/exoplayer/dash/c$b;->g(J)J

    move-result-wide v11

    if-eqz v5, :cond_10

    invoke-virtual {v9, v11, v12}, Landroidx/media3/exoplayer/dash/c$b;->i(J)J

    move-result-wide v1

    invoke-virtual {v9, v11, v12}, Landroidx/media3/exoplayer/dash/c$b;->k(J)J

    move-result-wide v3

    sub-long v3, v1, v3

    add-long/2addr v1, v3

    cmp-long v1, v1, v17

    if-ltz v1, :cond_f

    move v5, v10

    goto :goto_8

    :cond_f
    move/from16 v5, v27

    :goto_8
    and-int/2addr v0, v5

    :cond_10
    move v13, v0

    move-object/from16 v0, p0

    move-object v1, v9

    move-object/from16 v2, v26

    move-wide/from16 v3, p2

    move-wide/from16 v5, v21

    move-wide v7, v11

    invoke-virtual/range {v0 .. v8}, Landroidx/media3/exoplayer/dash/c;->o(Landroidx/media3/exoplayer/dash/c$b;Ly0/m;JJJ)J

    move-result-wide v7

    cmp-long v0, v7, v21

    if-gez v0, :cond_11

    new-instance v0, Lx0/b;

    invoke-direct {v0}, Lx0/b;-><init>()V

    iput-object v0, v15, Landroidx/media3/exoplayer/dash/c;->m:Ljava/io/IOException;

    return-void

    :cond_11
    cmp-long v0, v7, v11

    if-gtz v0, :cond_12

    iget-boolean v1, v15, Landroidx/media3/exoplayer/dash/c;->n:Z

    if-eqz v1, :cond_13

    if-ltz v0, :cond_13

    :cond_12
    move-object v15, v14

    goto :goto_a

    :cond_13
    if-eqz v13, :cond_14

    invoke-virtual {v9, v7, v8}, Landroidx/media3/exoplayer/dash/c$b;->k(J)J

    move-result-wide v0

    cmp-long v0, v0, v17

    if-ltz v0, :cond_14

    iput-boolean v10, v14, Ly0/g;->b:Z

    return-void

    :cond_14
    iget v0, v15, Landroidx/media3/exoplayer/dash/c;->g:I

    int-to-long v0, v0

    sub-long/2addr v11, v7

    const-wide/16 v2, 0x1

    add-long/2addr v11, v2

    invoke-static {v0, v1, v11, v12}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    cmp-long v1, v17, v19

    if-eqz v1, :cond_15

    :goto_9
    if-le v0, v10, :cond_15

    int-to-long v4, v0

    add-long/2addr v4, v7

    sub-long/2addr v4, v2

    invoke-virtual {v9, v4, v5}, Landroidx/media3/exoplayer/dash/c$b;->k(J)J

    move-result-wide v4

    cmp-long v1, v4, v17

    if-ltz v1, :cond_15

    add-int/lit8 v0, v0, -0x1

    goto :goto_9

    :cond_15
    move v10, v0

    invoke-interface/range {p4 .. p4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_16

    move-wide/from16 v19, p2

    :cond_16
    iget-object v2, v15, Landroidx/media3/exoplayer/dash/c;->e:Li0/g;

    iget v3, v15, Landroidx/media3/exoplayer/dash/c;->d:I

    iget-object v0, v15, Landroidx/media3/exoplayer/dash/c;->j:LA0/y;

    invoke-interface {v0}, LA0/y;->m()Ld0/q;

    move-result-object v4

    iget-object v0, v15, Landroidx/media3/exoplayer/dash/c;->j:LA0/y;

    invoke-interface {v0}, LA0/y;->n()I

    move-result v5

    iget-object v0, v15, Landroidx/media3/exoplayer/dash/c;->j:LA0/y;

    invoke-interface {v0}, LA0/y;->s()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v0, p0

    move-object v1, v9

    move v9, v10

    move-wide/from16 v10, v19

    move-wide/from16 v12, v24

    move-object v15, v14

    move-object/from16 v14, v16

    invoke-virtual/range {v0 .. v14}, Landroidx/media3/exoplayer/dash/c;->q(Landroidx/media3/exoplayer/dash/c$b;Li0/g;ILd0/q;ILjava/lang/Object;JIJJLB0/g$a;)Ly0/e;

    move-result-object v0

    iput-object v0, v15, Ly0/g;->a:Ly0/e;

    return-void

    :goto_a
    iput-boolean v13, v15, Ly0/g;->b:Z

    return-void
.end method

.method public i(LA0/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/c;->j:LA0/y;

    .line 2
    .line 3
    return-void
.end method

.method public final j(LA0/y;Ljava/util/List;)LB0/m$a;
    .locals 6

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-interface {p1}, LA0/B;->length()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    if-ge v3, v2, :cond_1

    .line 12
    .line 13
    invoke-interface {p1, v3, v0, v1}, LA0/y;->i(IJ)Z

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    if-eqz v5, :cond_0

    .line 18
    .line 19
    add-int/lit8 v4, v4, 0x1

    .line 20
    .line 21
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {p2}, Ln0/b;->f(Ljava/util/List;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    new-instance v0, LB0/m$a;

    .line 29
    .line 30
    iget-object v1, p0, Landroidx/media3/exoplayer/dash/c;->b:Ln0/b;

    .line 31
    .line 32
    invoke-virtual {v1, p2}, Ln0/b;->g(Ljava/util/List;)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    sub-int p2, p1, p2

    .line 37
    .line 38
    invoke-direct {v0, p1, p2, v2, v4}, LB0/m$a;-><init>(IIII)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method

.method public final k(JJ)J
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c;->k:Lo0/c;

    iget-boolean v0, v0, Lo0/c;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c;->i:[Landroidx/media3/exoplayer/dash/c$b;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroidx/media3/exoplayer/dash/c$b;->h()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c;->i:[Landroidx/media3/exoplayer/dash/c$b;

    aget-object v0, v0, v1

    invoke-virtual {v0, p1, p2}, Landroidx/media3/exoplayer/dash/c$b;->g(J)J

    move-result-wide v2

    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c;->i:[Landroidx/media3/exoplayer/dash/c$b;

    aget-object v0, v0, v1

    invoke-virtual {v0, v2, v3}, Landroidx/media3/exoplayer/dash/c$b;->i(J)J

    move-result-wide v0

    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/dash/c;->m(J)J

    move-result-wide p1

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    sub-long/2addr p1, p3

    invoke-static {v4, v5, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    return-wide p1

    :cond_1
    :goto_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    return-wide p1
.end method

.method public final l(JLo0/i;Landroidx/media3/exoplayer/dash/c$b;)Landroid/util/Pair;
    .locals 4

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    add-long/2addr p1, v0

    .line 4
    invoke-virtual {p4}, Landroidx/media3/exoplayer/dash/c$b;->h()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    cmp-long v0, p1, v0

    .line 9
    .line 10
    if-ltz v0, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {p4, p1, p2}, Landroidx/media3/exoplayer/dash/c$b;->l(J)Lo0/i;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p2, p4, Landroidx/media3/exoplayer/dash/c$b;->c:Lo0/b;

    .line 19
    .line 20
    iget-object p2, p2, Lo0/b;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p3, p2}, Lo0/i;->b(Ljava/lang/String;)Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iget-object p3, p4, Landroidx/media3/exoplayer/dash/c$b;->c:Lo0/b;

    .line 27
    .line 28
    iget-object p3, p3, Lo0/b;->a:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p1, p3}, Lo0/i;->b(Ljava/lang/String;)Landroid/net/Uri;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    invoke-static {p2, p3}, Lg0/G;->a(Landroid/net/Uri;Landroid/net/Uri;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    new-instance p3, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    iget-wide v0, p1, Lo0/i;->a:J

    .line 44
    .line 45
    invoke-virtual {p3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string p4, "-"

    .line 49
    .line 50
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    iget-wide v0, p1, Lo0/i;->b:J

    .line 58
    .line 59
    const-wide/16 v2, -0x1

    .line 60
    .line 61
    cmp-long p4, v0, v2

    .line 62
    .line 63
    if-eqz p4, :cond_1

    .line 64
    .line 65
    new-instance p4, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    iget-wide v0, p1, Lo0/i;->a:J

    .line 74
    .line 75
    iget-wide v2, p1, Lo0/i;->b:J

    .line 76
    .line 77
    add-long/2addr v0, v2

    .line 78
    invoke-virtual {p4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    :cond_1
    new-instance p1, Landroid/util/Pair;

    .line 86
    .line 87
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    return-object p1
.end method

.method public final m(J)J
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c;->k:Lo0/c;

    iget-wide v1, v0, Lo0/c;->a:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    iget v3, p0, Landroidx/media3/exoplayer/dash/c;->l:I

    invoke-virtual {v0, v3}, Lo0/c;->d(I)Lo0/g;

    move-result-object v0

    iget-wide v3, v0, Lo0/g;->b:J

    add-long/2addr v1, v3

    invoke-static {v1, v2}, Lg0/M;->J0(J)J

    move-result-wide v0

    sub-long v3, p1, v0

    :goto_0
    return-wide v3
.end method

.method public final n()Ljava/util/ArrayList;
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c;->k:Lo0/c;

    iget v1, p0, Landroidx/media3/exoplayer/dash/c;->l:I

    invoke-virtual {v0, v1}, Lo0/c;->d(I)Lo0/g;

    move-result-object v0

    iget-object v0, v0, Lo0/g;->c:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Landroidx/media3/exoplayer/dash/c;->c:[I

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget v5, v2, v4

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo0/a;

    iget-object v5, v5, Lo0/a;->c:Ljava/util/List;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final o(Landroidx/media3/exoplayer/dash/c$b;Ly0/m;JJJ)J
    .locals 6

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2}, Ly0/m;->g()J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1, p3, p4}, Landroidx/media3/exoplayer/dash/c$b;->j(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    move-wide v2, p5

    .line 13
    move-wide v4, p7

    .line 14
    invoke-static/range {v0 .. v5}, Lg0/M;->q(JJJ)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    :goto_0
    return-wide p1
.end method

.method public p(Landroidx/media3/exoplayer/dash/c$b;Li0/g;Ld0/q;ILjava/lang/Object;Lo0/i;Lo0/i;LB0/g$a;)Ly0/e;
    .locals 13

    .line 1
    move-object v0, p1

    .line 2
    move-object/from16 v1, p6

    .line 3
    .line 4
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/c$b;->b:Lo0/j;

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/c$b;->c:Lo0/b;

    .line 9
    .line 10
    iget-object v3, v3, Lo0/b;->a:Ljava/lang/String;

    .line 11
    .line 12
    move-object/from16 v4, p7

    .line 13
    .line 14
    invoke-virtual {v1, v4, v3}, Lo0/i;->a(Lo0/i;Ljava/lang/String;)Lo0/i;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v1, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move-object/from16 v4, p7

    .line 24
    .line 25
    invoke-static/range {p7 .. p7}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lo0/i;

    .line 30
    .line 31
    :goto_0
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/c$b;->c:Lo0/b;

    .line 32
    .line 33
    iget-object v3, v3, Lo0/b;->a:Ljava/lang/String;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-static {}, LX2/w;->j()LX2/w;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-static {v2, v3, v1, v4, v5}, Ln0/h;->a(Lo0/j;Ljava/lang/String;Lo0/i;ILjava/util/Map;)Li0/k;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    new-instance v1, Ly0/l;

    .line 45
    .line 46
    iget-object v12, v0, Landroidx/media3/exoplayer/dash/c$b;->a:Ly0/f;

    .line 47
    .line 48
    move-object v6, v1

    .line 49
    move-object v7, p2

    .line 50
    move-object/from16 v9, p3

    .line 51
    .line 52
    move/from16 v10, p4

    .line 53
    .line 54
    move-object/from16 v11, p5

    .line 55
    .line 56
    invoke-direct/range {v6 .. v12}, Ly0/l;-><init>(Li0/g;Li0/k;Ld0/q;ILjava/lang/Object;Ly0/f;)V

    .line 57
    .line 58
    .line 59
    return-object v1
.end method

.method public q(Landroidx/media3/exoplayer/dash/c$b;Li0/g;ILd0/q;ILjava/lang/Object;JIJJLB0/g$a;)Ly0/e;
    .locals 24

    .line 1
    move-object/from16 v0, p1

    move-wide/from16 v13, p7

    move-wide/from16 v1, p12

    iget-object v3, v0, Landroidx/media3/exoplayer/dash/c$b;->b:Lo0/j;

    invoke-virtual {v0, v13, v14}, Landroidx/media3/exoplayer/dash/c$b;->k(J)J

    move-result-wide v7

    invoke-virtual {v0, v13, v14}, Landroidx/media3/exoplayer/dash/c$b;->l(J)Lo0/i;

    move-result-object v4

    iget-object v5, v0, Landroidx/media3/exoplayer/dash/c$b;->a:Ly0/f;

    const/16 v6, 0x8

    const/4 v9, 0x0

    if-nez v5, :cond_1

    invoke-virtual {v0, v13, v14}, Landroidx/media3/exoplayer/dash/c$b;->i(J)J

    move-result-wide v10

    invoke-virtual {v0, v13, v14, v1, v2}, Landroidx/media3/exoplayer/dash/c$b;->m(JJ)Z

    move-result v1

    if-eqz v1, :cond_0

    move v6, v9

    :cond_0
    iget-object v0, v0, Landroidx/media3/exoplayer/dash/c$b;->c:Lo0/b;

    iget-object v0, v0, Lo0/b;->a:Ljava/lang/String;

    invoke-static {}, LX2/w;->j()LX2/w;

    move-result-object v1

    invoke-static {v3, v0, v4, v6, v1}, Ln0/h;->a(Lo0/j;Ljava/lang/String;Lo0/i;ILjava/util/Map;)Li0/k;

    move-result-object v2

    new-instance v15, Ly0/o;

    move-object v0, v15

    move-object/from16 v1, p2

    move-object/from16 v3, p4

    move/from16 v4, p5

    move-object/from16 v5, p6

    move-wide v6, v7

    move-wide v8, v10

    move-wide/from16 v10, p7

    move/from16 v12, p3

    move-object/from16 v13, p4

    invoke-direct/range {v0 .. v13}, Ly0/o;-><init>(Li0/g;Li0/k;Ld0/q;ILjava/lang/Object;JJJILd0/q;)V

    return-object v15

    :cond_1
    const/4 v5, 0x1

    move/from16 v10, p9

    move v15, v5

    :goto_0
    if-ge v5, v10, :cond_3

    int-to-long v11, v5

    add-long/2addr v11, v13

    invoke-virtual {v0, v11, v12}, Landroidx/media3/exoplayer/dash/c$b;->l(J)Lo0/i;

    move-result-object v11

    iget-object v12, v0, Landroidx/media3/exoplayer/dash/c$b;->c:Lo0/b;

    iget-object v12, v12, Lo0/b;->a:Ljava/lang/String;

    invoke-virtual {v4, v11, v12}, Lo0/i;->a(Lo0/i;Ljava/lang/String;)Lo0/i;

    move-result-object v11

    if-nez v11, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v15, v15, 0x1

    add-int/lit8 v5, v5, 0x1

    move-object v4, v11

    goto :goto_0

    :cond_3
    :goto_1
    int-to-long v10, v15

    add-long/2addr v10, v13

    const-wide/16 v16, 0x1

    sub-long v10, v10, v16

    invoke-virtual {v0, v10, v11}, Landroidx/media3/exoplayer/dash/c$b;->i(J)J

    move-result-wide v16

    invoke-static/range {p1 .. p1}, Landroidx/media3/exoplayer/dash/c$b;->a(Landroidx/media3/exoplayer/dash/c$b;)J

    move-result-wide v18

    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v18, v20

    if-eqz v5, :cond_4

    cmp-long v5, v18, v16

    if-gtz v5, :cond_4

    goto :goto_2

    :cond_4
    move-wide/from16 v18, v20

    :goto_2
    invoke-virtual {v0, v10, v11, v1, v2}, Landroidx/media3/exoplayer/dash/c$b;->m(JJ)Z

    move-result v1

    if-eqz v1, :cond_5

    move v6, v9

    :cond_5
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/c$b;->c:Lo0/b;

    iget-object v1, v1, Lo0/b;->a:Ljava/lang/String;

    invoke-static {}, LX2/w;->j()LX2/w;

    move-result-object v2

    invoke-static {v3, v1, v4, v6, v2}, Ln0/h;->a(Lo0/j;Ljava/lang/String;Lo0/i;ILjava/util/Map;)Li0/k;

    move-result-object v4

    iget-wide v1, v3, Lo0/j;->d:J

    neg-long v1, v1

    move-object/from16 v5, p4

    iget-object v3, v5, Ld0/q;->n:Ljava/lang/String;

    invoke-static {v3}, Ld0/z;->p(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    add-long/2addr v1, v7

    :cond_6
    move-wide/from16 v21, v1

    new-instance v23, Ly0/j;

    move-object/from16 v1, v23

    iget-object v0, v0, Landroidx/media3/exoplayer/dash/c$b;->a:Ly0/f;

    move-object/from16 v20, v0

    move-object/from16 v2, p2

    move-object v3, v4

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    move-wide/from16 v9, v16

    move-wide/from16 v11, p10

    move-wide/from16 v13, v18

    move v0, v15

    move-wide/from16 v15, p7

    move/from16 v17, v0

    move-wide/from16 v18, v21

    invoke-direct/range {v1 .. v20}, Ly0/j;-><init>(Li0/g;Li0/k;Ld0/q;ILjava/lang/Object;JJJJJIJLy0/f;)V

    return-object v23
.end method

.method public final r(I)Landroidx/media3/exoplayer/dash/c$b;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c;->i:[Landroidx/media3/exoplayer/dash/c$b;

    aget-object v0, v0, p1

    iget-object v1, p0, Landroidx/media3/exoplayer/dash/c;->b:Ln0/b;

    iget-object v2, v0, Landroidx/media3/exoplayer/dash/c$b;->b:Lo0/j;

    iget-object v2, v2, Lo0/j;->c:LX2/v;

    invoke-virtual {v1, v2}, Ln0/b;->j(Ljava/util/List;)Lo0/b;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, v0, Landroidx/media3/exoplayer/dash/c$b;->c:Lo0/b;

    invoke-virtual {v1, v2}, Lo0/b;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/dash/c$b;->d(Lo0/b;)Landroidx/media3/exoplayer/dash/c$b;

    move-result-object v0

    iget-object v1, p0, Landroidx/media3/exoplayer/dash/c;->i:[Landroidx/media3/exoplayer/dash/c$b;

    aput-object v0, v1, p1

    :cond_0
    return-object v0
.end method

.method public release()V
    .locals 4

    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c;->i:[Landroidx/media3/exoplayer/dash/c$b;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-object v3, v3, Landroidx/media3/exoplayer/dash/c$b;->a:Ly0/f;

    if-eqz v3, :cond_0

    invoke-interface {v3}, Ly0/f;->release()V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
