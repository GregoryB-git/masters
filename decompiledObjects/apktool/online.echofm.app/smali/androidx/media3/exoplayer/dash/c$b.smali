.class public final Landroidx/media3/exoplayer/dash/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/dash/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ly0/f;

.field public final b:Lo0/j;

.field public final c:Lo0/b;

.field public final d:Ln0/g;

.field public final e:J

.field public final f:J


# direct methods
.method public constructor <init>(JLo0/j;Lo0/b;Ly0/f;JLn0/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Landroidx/media3/exoplayer/dash/c$b;->e:J

    .line 5
    .line 6
    iput-object p3, p0, Landroidx/media3/exoplayer/dash/c$b;->b:Lo0/j;

    .line 7
    .line 8
    iput-object p4, p0, Landroidx/media3/exoplayer/dash/c$b;->c:Lo0/b;

    .line 9
    .line 10
    iput-wide p6, p0, Landroidx/media3/exoplayer/dash/c$b;->f:J

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/media3/exoplayer/dash/c$b;->a:Ly0/f;

    .line 13
    .line 14
    iput-object p8, p0, Landroidx/media3/exoplayer/dash/c$b;->d:Ln0/g;

    .line 15
    .line 16
    return-void
.end method

.method public static synthetic a(Landroidx/media3/exoplayer/dash/c$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/dash/c$b;->e:J

    return-wide v0
.end method


# virtual methods
.method public b(JLo0/j;)Landroidx/media3/exoplayer/dash/c$b;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/c$b;->b:Lo0/j;

    .line 6
    .line 7
    invoke-virtual {v1}, Lo0/j;->l()Ln0/g;

    .line 8
    .line 9
    .line 10
    move-result-object v9

    .line 11
    invoke-virtual/range {p3 .. p3}, Lo0/j;->l()Ln0/g;

    .line 12
    .line 13
    .line 14
    move-result-object v10

    .line 15
    if-nez v9, :cond_0

    .line 16
    .line 17
    new-instance v10, Landroidx/media3/exoplayer/dash/c$b;

    .line 18
    .line 19
    iget-object v5, v0, Landroidx/media3/exoplayer/dash/c$b;->c:Lo0/b;

    .line 20
    .line 21
    iget-object v6, v0, Landroidx/media3/exoplayer/dash/c$b;->a:Ly0/f;

    .line 22
    .line 23
    iget-wide v7, v0, Landroidx/media3/exoplayer/dash/c$b;->f:J

    .line 24
    .line 25
    move-object v1, v10

    .line 26
    move-wide/from16 v2, p1

    .line 27
    .line 28
    move-object/from16 v4, p3

    .line 29
    .line 30
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/dash/c$b;-><init>(JLo0/j;Lo0/b;Ly0/f;JLn0/g;)V

    .line 31
    .line 32
    .line 33
    return-object v10

    .line 34
    :cond_0
    invoke-interface {v9}, Ln0/g;->g()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    new-instance v11, Landroidx/media3/exoplayer/dash/c$b;

    .line 41
    .line 42
    iget-object v5, v0, Landroidx/media3/exoplayer/dash/c$b;->c:Lo0/b;

    .line 43
    .line 44
    iget-object v6, v0, Landroidx/media3/exoplayer/dash/c$b;->a:Ly0/f;

    .line 45
    .line 46
    iget-wide v7, v0, Landroidx/media3/exoplayer/dash/c$b;->f:J

    .line 47
    .line 48
    move-object v1, v11

    .line 49
    move-wide/from16 v2, p1

    .line 50
    .line 51
    move-object/from16 v4, p3

    .line 52
    .line 53
    move-object v9, v10

    .line 54
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/dash/c$b;-><init>(JLo0/j;Lo0/b;Ly0/f;JLn0/g;)V

    .line 55
    .line 56
    .line 57
    return-object v11

    .line 58
    :cond_1
    invoke-interface {v9, v2, v3}, Ln0/g;->i(J)J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    const-wide/16 v6, 0x0

    .line 63
    .line 64
    cmp-long v1, v4, v6

    .line 65
    .line 66
    if-nez v1, :cond_2

    .line 67
    .line 68
    new-instance v11, Landroidx/media3/exoplayer/dash/c$b;

    .line 69
    .line 70
    iget-object v5, v0, Landroidx/media3/exoplayer/dash/c$b;->c:Lo0/b;

    .line 71
    .line 72
    iget-object v6, v0, Landroidx/media3/exoplayer/dash/c$b;->a:Ly0/f;

    .line 73
    .line 74
    iget-wide v7, v0, Landroidx/media3/exoplayer/dash/c$b;->f:J

    .line 75
    .line 76
    move-object v1, v11

    .line 77
    move-wide/from16 v2, p1

    .line 78
    .line 79
    move-object/from16 v4, p3

    .line 80
    .line 81
    move-object v9, v10

    .line 82
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/dash/c$b;-><init>(JLo0/j;Lo0/b;Ly0/f;JLn0/g;)V

    .line 83
    .line 84
    .line 85
    return-object v11

    .line 86
    :cond_2
    invoke-static {v10}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    invoke-interface {v9}, Ln0/g;->h()J

    .line 90
    .line 91
    .line 92
    move-result-wide v6

    .line 93
    invoke-interface {v9, v6, v7}, Ln0/g;->c(J)J

    .line 94
    .line 95
    .line 96
    move-result-wide v11

    .line 97
    add-long/2addr v4, v6

    .line 98
    const-wide/16 v13, 0x1

    .line 99
    .line 100
    sub-long v13, v4, v13

    .line 101
    .line 102
    invoke-interface {v9, v13, v14}, Ln0/g;->c(J)J

    .line 103
    .line 104
    .line 105
    move-result-wide v15

    .line 106
    invoke-interface {v9, v13, v14, v2, v3}, Ln0/g;->b(JJ)J

    .line 107
    .line 108
    .line 109
    move-result-wide v13

    .line 110
    add-long/2addr v15, v13

    .line 111
    invoke-interface {v10}, Ln0/g;->h()J

    .line 112
    .line 113
    .line 114
    move-result-wide v13

    .line 115
    move-object v1, v9

    .line 116
    invoke-interface {v10, v13, v14}, Ln0/g;->c(J)J

    .line 117
    .line 118
    .line 119
    move-result-wide v8

    .line 120
    move-wide/from16 v17, v6

    .line 121
    .line 122
    iget-wide v6, v0, Landroidx/media3/exoplayer/dash/c$b;->f:J

    .line 123
    .line 124
    cmp-long v15, v15, v8

    .line 125
    .line 126
    if-nez v15, :cond_3

    .line 127
    .line 128
    :goto_0
    sub-long/2addr v4, v13

    .line 129
    add-long/2addr v6, v4

    .line 130
    :goto_1
    move-wide v7, v6

    .line 131
    goto :goto_2

    .line 132
    :cond_3
    if-ltz v15, :cond_5

    .line 133
    .line 134
    cmp-long v4, v8, v11

    .line 135
    .line 136
    if-gez v4, :cond_4

    .line 137
    .line 138
    invoke-interface {v10, v11, v12, v2, v3}, Ln0/g;->a(JJ)J

    .line 139
    .line 140
    .line 141
    move-result-wide v4

    .line 142
    sub-long v4, v4, v17

    .line 143
    .line 144
    sub-long/2addr v6, v4

    .line 145
    goto :goto_1

    .line 146
    :cond_4
    invoke-interface {v1, v8, v9, v2, v3}, Ln0/g;->a(JJ)J

    .line 147
    .line 148
    .line 149
    move-result-wide v4

    .line 150
    goto :goto_0

    .line 151
    :goto_2
    new-instance v11, Landroidx/media3/exoplayer/dash/c$b;

    .line 152
    .line 153
    iget-object v5, v0, Landroidx/media3/exoplayer/dash/c$b;->c:Lo0/b;

    .line 154
    .line 155
    iget-object v6, v0, Landroidx/media3/exoplayer/dash/c$b;->a:Ly0/f;

    .line 156
    .line 157
    move-object v1, v11

    .line 158
    move-wide/from16 v2, p1

    .line 159
    .line 160
    move-object/from16 v4, p3

    .line 161
    .line 162
    move-object v9, v10

    .line 163
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/dash/c$b;-><init>(JLo0/j;Lo0/b;Ly0/f;JLn0/g;)V

    .line 164
    .line 165
    .line 166
    return-object v11

    .line 167
    :cond_5
    new-instance v1, Lx0/b;

    .line 168
    .line 169
    invoke-direct {v1}, Lx0/b;-><init>()V

    .line 170
    .line 171
    .line 172
    throw v1
.end method

.method public c(Ln0/g;)Landroidx/media3/exoplayer/dash/c$b;
    .locals 10

    .line 1
    new-instance v9, Landroidx/media3/exoplayer/dash/c$b;

    .line 2
    .line 3
    iget-wide v1, p0, Landroidx/media3/exoplayer/dash/c$b;->e:J

    .line 4
    .line 5
    iget-object v3, p0, Landroidx/media3/exoplayer/dash/c$b;->b:Lo0/j;

    .line 6
    .line 7
    iget-object v4, p0, Landroidx/media3/exoplayer/dash/c$b;->c:Lo0/b;

    .line 8
    .line 9
    iget-object v5, p0, Landroidx/media3/exoplayer/dash/c$b;->a:Ly0/f;

    .line 10
    .line 11
    iget-wide v6, p0, Landroidx/media3/exoplayer/dash/c$b;->f:J

    .line 12
    .line 13
    move-object v0, v9

    .line 14
    move-object v8, p1

    .line 15
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/dash/c$b;-><init>(JLo0/j;Lo0/b;Ly0/f;JLn0/g;)V

    .line 16
    .line 17
    .line 18
    return-object v9
.end method

.method public d(Lo0/b;)Landroidx/media3/exoplayer/dash/c$b;
    .locals 10

    .line 1
    new-instance v9, Landroidx/media3/exoplayer/dash/c$b;

    .line 2
    .line 3
    iget-wide v1, p0, Landroidx/media3/exoplayer/dash/c$b;->e:J

    .line 4
    .line 5
    iget-object v3, p0, Landroidx/media3/exoplayer/dash/c$b;->b:Lo0/j;

    .line 6
    .line 7
    iget-object v5, p0, Landroidx/media3/exoplayer/dash/c$b;->a:Ly0/f;

    .line 8
    .line 9
    iget-wide v6, p0, Landroidx/media3/exoplayer/dash/c$b;->f:J

    .line 10
    .line 11
    iget-object v8, p0, Landroidx/media3/exoplayer/dash/c$b;->d:Ln0/g;

    .line 12
    .line 13
    move-object v0, v9

    .line 14
    move-object v4, p1

    .line 15
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/dash/c$b;-><init>(JLo0/j;Lo0/b;Ly0/f;JLn0/g;)V

    .line 16
    .line 17
    .line 18
    return-object v9
.end method

.method public e(J)J
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c$b;->d:Ln0/g;

    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/g;

    iget-wide v1, p0, Landroidx/media3/exoplayer/dash/c$b;->e:J

    invoke-interface {v0, v1, v2, p1, p2}, Ln0/g;->d(JJ)J

    move-result-wide p1

    iget-wide v0, p0, Landroidx/media3/exoplayer/dash/c$b;->f:J

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public f()J
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c$b;->d:Ln0/g;

    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/g;

    invoke-interface {v0}, Ln0/g;->h()J

    move-result-wide v0

    iget-wide v2, p0, Landroidx/media3/exoplayer/dash/c$b;->f:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public g(J)J
    .locals 5

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/dash/c$b;->e(J)J

    move-result-wide v0

    iget-object v2, p0, Landroidx/media3/exoplayer/dash/c$b;->d:Ln0/g;

    invoke-static {v2}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/g;

    iget-wide v3, p0, Landroidx/media3/exoplayer/dash/c$b;->e:J

    invoke-interface {v2, v3, v4, p1, p2}, Ln0/g;->j(JJ)J

    move-result-wide p1

    add-long/2addr v0, p1

    const-wide/16 p1, 0x1

    sub-long/2addr v0, p1

    return-wide v0
.end method

.method public h()J
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c$b;->d:Ln0/g;

    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/g;

    iget-wide v1, p0, Landroidx/media3/exoplayer/dash/c$b;->e:J

    invoke-interface {v0, v1, v2}, Ln0/g;->i(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public i(J)J
    .locals 5

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/dash/c$b;->k(J)J

    move-result-wide v0

    iget-object v2, p0, Landroidx/media3/exoplayer/dash/c$b;->d:Ln0/g;

    invoke-static {v2}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/g;

    iget-wide v3, p0, Landroidx/media3/exoplayer/dash/c$b;->f:J

    sub-long/2addr p1, v3

    iget-wide v3, p0, Landroidx/media3/exoplayer/dash/c$b;->e:J

    invoke-interface {v2, p1, p2, v3, v4}, Ln0/g;->b(JJ)J

    move-result-wide p1

    add-long/2addr v0, p1

    return-wide v0
.end method

.method public j(J)J
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c$b;->d:Ln0/g;

    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/g;

    iget-wide v1, p0, Landroidx/media3/exoplayer/dash/c$b;->e:J

    invoke-interface {v0, p1, p2, v1, v2}, Ln0/g;->a(JJ)J

    move-result-wide p1

    iget-wide v0, p0, Landroidx/media3/exoplayer/dash/c$b;->f:J

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public k(J)J
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c$b;->d:Ln0/g;

    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/g;

    iget-wide v1, p0, Landroidx/media3/exoplayer/dash/c$b;->f:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Ln0/g;->c(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public l(J)Lo0/i;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c$b;->d:Ln0/g;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ln0/g;

    .line 8
    .line 9
    iget-wide v1, p0, Landroidx/media3/exoplayer/dash/c$b;->f:J

    .line 10
    .line 11
    sub-long/2addr p1, v1

    .line 12
    invoke-interface {v0, p1, p2}, Ln0/g;->f(J)Lo0/i;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public m(JJ)Z
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c$b;->d:Ln0/g;

    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/g;

    invoke-interface {v0}, Ln0/g;->g()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p3, v2

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/dash/c$b;->i(J)J

    move-result-wide p1

    cmp-long p1, p1, p3

    if-gtz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1
.end method
