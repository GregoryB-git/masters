.class public Lx0/N;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx0/N$a;
    }
.end annotation


# instance fields
.field public final a:LB0/b;

.field public final b:I

.field public final c:Lg0/z;

.field public d:Lx0/N$a;

.field public e:Lx0/N$a;

.field public f:Lx0/N$a;

.field public g:J


# direct methods
.method public constructor <init>(LB0/b;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx0/N;->a:LB0/b;

    .line 5
    .line 6
    invoke-interface {p1}, LB0/b;->e()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lx0/N;->b:I

    .line 11
    .line 12
    new-instance v0, Lg0/z;

    .line 13
    .line 14
    const/16 v1, 0x20

    .line 15
    .line 16
    invoke-direct {v0, v1}, Lg0/z;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lx0/N;->c:Lg0/z;

    .line 20
    .line 21
    new-instance v0, Lx0/N$a;

    .line 22
    .line 23
    const-wide/16 v1, 0x0

    .line 24
    .line 25
    invoke-direct {v0, v1, v2, p1}, Lx0/N$a;-><init>(JI)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lx0/N;->d:Lx0/N$a;

    .line 29
    .line 30
    iput-object v0, p0, Lx0/N;->e:Lx0/N$a;

    .line 31
    .line 32
    iput-object v0, p0, Lx0/N;->f:Lx0/N$a;

    .line 33
    .line 34
    return-void
.end method

.method public static d(Lx0/N$a;J)Lx0/N$a;
    .locals 2

    .line 1
    :goto_0
    iget-wide v0, p0, Lx0/N$a;->b:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lx0/N$a;->d:Lx0/N$a;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-object p0
.end method

.method public static i(Lx0/N$a;JLjava/nio/ByteBuffer;I)Lx0/N$a;
    .locals 3

    .line 1
    invoke-static {p0, p1, p2}, Lx0/N;->d(Lx0/N$a;J)Lx0/N$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_0
    :goto_0
    if-lez p4, :cond_1

    .line 6
    .line 7
    iget-wide v0, p0, Lx0/N$a;->b:J

    .line 8
    .line 9
    sub-long/2addr v0, p1

    .line 10
    long-to-int v0, v0

    .line 11
    invoke-static {p4, v0}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, Lx0/N$a;->c:LB0/a;

    .line 16
    .line 17
    iget-object v1, v1, LB0/a;->a:[B

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2}, Lx0/N$a;->e(J)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {p3, v1, v2, v0}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    sub-int/2addr p4, v0

    .line 27
    int-to-long v0, v0

    .line 28
    add-long/2addr p1, v0

    .line 29
    iget-wide v0, p0, Lx0/N$a;->b:J

    .line 30
    .line 31
    cmp-long v0, p1, v0

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    iget-object p0, p0, Lx0/N$a;->d:Lx0/N$a;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return-object p0
.end method

.method public static j(Lx0/N$a;J[BI)Lx0/N$a;
    .locals 5

    .line 1
    invoke-static {p0, p1, p2}, Lx0/N;->d(Lx0/N$a;J)Lx0/N$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    move v0, p4

    .line 6
    :cond_0
    :goto_0
    if-lez v0, :cond_1

    .line 7
    .line 8
    iget-wide v1, p0, Lx0/N$a;->b:J

    .line 9
    .line 10
    sub-long/2addr v1, p1

    .line 11
    long-to-int v1, v1

    .line 12
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, p0, Lx0/N$a;->c:LB0/a;

    .line 17
    .line 18
    iget-object v2, v2, LB0/a;->a:[B

    .line 19
    .line 20
    invoke-virtual {p0, p1, p2}, Lx0/N$a;->e(J)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    sub-int v4, p4, v0

    .line 25
    .line 26
    invoke-static {v2, v3, p3, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 27
    .line 28
    .line 29
    sub-int/2addr v0, v1

    .line 30
    int-to-long v1, v1

    .line 31
    add-long/2addr p1, v1

    .line 32
    iget-wide v1, p0, Lx0/N$a;->b:J

    .line 33
    .line 34
    cmp-long v1, p1, v1

    .line 35
    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    iget-object p0, p0, Lx0/N$a;->d:Lx0/N$a;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-object p0
.end method

.method public static k(Lx0/N$a;Lj0/i;Lx0/P$b;Lg0/z;)Lx0/N$a;
    .locals 18

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    iget-wide v2, v0, Lx0/P$b;->b:J

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    invoke-virtual {v1, v4}, Lg0/z;->P(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual/range {p3 .. p3}, Lg0/z;->e()[B

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    move-object/from16 v6, p0

    .line 16
    .line 17
    invoke-static {v6, v2, v3, v5, v4}, Lx0/N;->j(Lx0/N$a;J[BI)Lx0/N$a;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    const-wide/16 v6, 0x1

    .line 22
    .line 23
    add-long/2addr v2, v6

    .line 24
    invoke-virtual/range {p3 .. p3}, Lg0/z;->e()[B

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    const/4 v7, 0x0

    .line 29
    aget-byte v6, v6, v7

    .line 30
    .line 31
    and-int/lit16 v8, v6, 0x80

    .line 32
    .line 33
    if-eqz v8, :cond_0

    .line 34
    .line 35
    move v8, v4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v8, v7

    .line 38
    :goto_0
    and-int/lit8 v6, v6, 0x7f

    .line 39
    .line 40
    move-object/from16 v9, p1

    .line 41
    .line 42
    iget-object v9, v9, Lj0/i;->q:Lj0/c;

    .line 43
    .line 44
    iget-object v10, v9, Lj0/c;->a:[B

    .line 45
    .line 46
    if-nez v10, :cond_1

    .line 47
    .line 48
    const/16 v10, 0x10

    .line 49
    .line 50
    new-array v10, v10, [B

    .line 51
    .line 52
    iput-object v10, v9, Lj0/c;->a:[B

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-static {v10, v7}, Ljava/util/Arrays;->fill([BB)V

    .line 56
    .line 57
    .line 58
    :goto_1
    iget-object v10, v9, Lj0/c;->a:[B

    .line 59
    .line 60
    invoke-static {v5, v2, v3, v10, v6}, Lx0/N;->j(Lx0/N$a;J[BI)Lx0/N$a;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    int-to-long v10, v6

    .line 65
    add-long/2addr v2, v10

    .line 66
    if-eqz v8, :cond_2

    .line 67
    .line 68
    const/4 v4, 0x2

    .line 69
    invoke-virtual {v1, v4}, Lg0/z;->P(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual/range {p3 .. p3}, Lg0/z;->e()[B

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-static {v5, v2, v3, v6, v4}, Lx0/N;->j(Lx0/N$a;J[BI)Lx0/N$a;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    const-wide/16 v10, 0x2

    .line 81
    .line 82
    add-long/2addr v2, v10

    .line 83
    invoke-virtual/range {p3 .. p3}, Lg0/z;->M()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    :cond_2
    move v10, v4

    .line 88
    iget-object v4, v9, Lj0/c;->d:[I

    .line 89
    .line 90
    if-eqz v4, :cond_4

    .line 91
    .line 92
    array-length v6, v4

    .line 93
    if-ge v6, v10, :cond_3

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_3
    :goto_2
    move-object v11, v4

    .line 97
    goto :goto_4

    .line 98
    :cond_4
    :goto_3
    new-array v4, v10, [I

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :goto_4
    iget-object v4, v9, Lj0/c;->e:[I

    .line 102
    .line 103
    if-eqz v4, :cond_6

    .line 104
    .line 105
    array-length v6, v4

    .line 106
    if-ge v6, v10, :cond_5

    .line 107
    .line 108
    goto :goto_6

    .line 109
    :cond_5
    :goto_5
    move-object v12, v4

    .line 110
    goto :goto_7

    .line 111
    :cond_6
    :goto_6
    new-array v4, v10, [I

    .line 112
    .line 113
    goto :goto_5

    .line 114
    :goto_7
    if-eqz v8, :cond_7

    .line 115
    .line 116
    mul-int/lit8 v4, v10, 0x6

    .line 117
    .line 118
    invoke-virtual {v1, v4}, Lg0/z;->P(I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {p3 .. p3}, Lg0/z;->e()[B

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    invoke-static {v5, v2, v3, v6, v4}, Lx0/N;->j(Lx0/N$a;J[BI)Lx0/N$a;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    int-to-long v13, v4

    .line 130
    add-long/2addr v2, v13

    .line 131
    invoke-virtual {v1, v7}, Lg0/z;->T(I)V

    .line 132
    .line 133
    .line 134
    :goto_8
    if-ge v7, v10, :cond_8

    .line 135
    .line 136
    invoke-virtual/range {p3 .. p3}, Lg0/z;->M()I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    aput v4, v11, v7

    .line 141
    .line 142
    invoke-virtual/range {p3 .. p3}, Lg0/z;->K()I

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    aput v4, v12, v7

    .line 147
    .line 148
    add-int/lit8 v7, v7, 0x1

    .line 149
    .line 150
    goto :goto_8

    .line 151
    :cond_7
    aput v7, v11, v7

    .line 152
    .line 153
    iget v1, v0, Lx0/P$b;->a:I

    .line 154
    .line 155
    iget-wide v13, v0, Lx0/P$b;->b:J

    .line 156
    .line 157
    sub-long v13, v2, v13

    .line 158
    .line 159
    long-to-int v4, v13

    .line 160
    sub-int/2addr v1, v4

    .line 161
    aput v1, v12, v7

    .line 162
    .line 163
    :cond_8
    iget-object v1, v0, Lx0/P$b;->c:LF0/T$a;

    .line 164
    .line 165
    invoke-static {v1}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    check-cast v1, LF0/T$a;

    .line 170
    .line 171
    iget-object v13, v1, LF0/T$a;->b:[B

    .line 172
    .line 173
    iget-object v14, v9, Lj0/c;->a:[B

    .line 174
    .line 175
    iget v15, v1, LF0/T$a;->a:I

    .line 176
    .line 177
    iget v4, v1, LF0/T$a;->c:I

    .line 178
    .line 179
    iget v1, v1, LF0/T$a;->d:I

    .line 180
    .line 181
    move/from16 v16, v4

    .line 182
    .line 183
    move/from16 v17, v1

    .line 184
    .line 185
    invoke-virtual/range {v9 .. v17}, Lj0/c;->c(I[I[I[B[BIII)V

    .line 186
    .line 187
    .line 188
    iget-wide v6, v0, Lx0/P$b;->b:J

    .line 189
    .line 190
    sub-long/2addr v2, v6

    .line 191
    long-to-int v1, v2

    .line 192
    int-to-long v2, v1

    .line 193
    add-long/2addr v6, v2

    .line 194
    iput-wide v6, v0, Lx0/P$b;->b:J

    .line 195
    .line 196
    iget v2, v0, Lx0/P$b;->a:I

    .line 197
    .line 198
    sub-int/2addr v2, v1

    .line 199
    iput v2, v0, Lx0/P$b;->a:I

    .line 200
    .line 201
    return-object v5
.end method

.method public static l(Lx0/N$a;Lj0/i;Lx0/P$b;Lg0/z;)Lx0/N$a;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lj0/i;->D()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1, p2, p3}, Lx0/N;->k(Lx0/N$a;Lj0/i;Lx0/P$b;Lg0/z;)Lx0/N$a;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_0
    invoke-virtual {p1}, Lj0/a;->o()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    invoke-virtual {p3, v0}, Lg0/z;->P(I)V

    .line 19
    .line 20
    .line 21
    iget-wide v1, p2, Lx0/P$b;->b:J

    .line 22
    .line 23
    invoke-virtual {p3}, Lg0/z;->e()[B

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {p0, v1, v2, v3, v0}, Lx0/N;->j(Lx0/N$a;J[BI)Lx0/N$a;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p3}, Lg0/z;->K()I

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    iget-wide v1, p2, Lx0/P$b;->b:J

    .line 36
    .line 37
    const-wide/16 v3, 0x4

    .line 38
    .line 39
    add-long/2addr v1, v3

    .line 40
    iput-wide v1, p2, Lx0/P$b;->b:J

    .line 41
    .line 42
    iget v1, p2, Lx0/P$b;->a:I

    .line 43
    .line 44
    sub-int/2addr v1, v0

    .line 45
    iput v1, p2, Lx0/P$b;->a:I

    .line 46
    .line 47
    invoke-virtual {p1, p3}, Lj0/i;->z(I)V

    .line 48
    .line 49
    .line 50
    iget-wide v0, p2, Lx0/P$b;->b:J

    .line 51
    .line 52
    iget-object v2, p1, Lj0/i;->r:Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    invoke-static {p0, v0, v1, v2, p3}, Lx0/N;->i(Lx0/N$a;JLjava/nio/ByteBuffer;I)Lx0/N$a;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    iget-wide v0, p2, Lx0/P$b;->b:J

    .line 59
    .line 60
    int-to-long v2, p3

    .line 61
    add-long/2addr v0, v2

    .line 62
    iput-wide v0, p2, Lx0/P$b;->b:J

    .line 63
    .line 64
    iget v0, p2, Lx0/P$b;->a:I

    .line 65
    .line 66
    sub-int/2addr v0, p3

    .line 67
    iput v0, p2, Lx0/P$b;->a:I

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Lj0/i;->G(I)V

    .line 70
    .line 71
    .line 72
    iget-wide v0, p2, Lx0/P$b;->b:J

    .line 73
    .line 74
    iget-object p1, p1, Lj0/i;->u:Ljava/nio/ByteBuffer;

    .line 75
    .line 76
    :goto_0
    iget p2, p2, Lx0/P$b;->a:I

    .line 77
    .line 78
    invoke-static {p0, v0, v1, p1, p2}, Lx0/N;->i(Lx0/N$a;JLjava/nio/ByteBuffer;I)Lx0/N$a;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    iget p3, p2, Lx0/P$b;->a:I

    .line 84
    .line 85
    invoke-virtual {p1, p3}, Lj0/i;->z(I)V

    .line 86
    .line 87
    .line 88
    iget-wide v0, p2, Lx0/P$b;->b:J

    .line 89
    .line 90
    iget-object p1, p1, Lj0/i;->r:Ljava/nio/ByteBuffer;

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :goto_1
    return-object p0
.end method


# virtual methods
.method public final a(Lx0/N$a;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lx0/N$a;->c:LB0/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lx0/N;->a:LB0/b;

    .line 7
    .line 8
    invoke-interface {v0, p1}, LB0/b;->b(LB0/b$a;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lx0/N$a;->b()Lx0/N$a;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public b(J)V
    .locals 3

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :goto_0
    iget-object v0, p0, Lx0/N;->d:Lx0/N$a;

    .line 9
    .line 10
    iget-wide v1, v0, Lx0/N$a;->b:J

    .line 11
    .line 12
    cmp-long v1, p1, v1

    .line 13
    .line 14
    if-ltz v1, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Lx0/N;->a:LB0/b;

    .line 17
    .line 18
    iget-object v0, v0, Lx0/N$a;->c:LB0/a;

    .line 19
    .line 20
    invoke-interface {v1, v0}, LB0/b;->c(LB0/a;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lx0/N;->d:Lx0/N$a;

    .line 24
    .line 25
    invoke-virtual {v0}, Lx0/N$a;->b()Lx0/N$a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lx0/N;->d:Lx0/N$a;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object p1, p0, Lx0/N;->e:Lx0/N$a;

    .line 33
    .line 34
    iget-wide p1, p1, Lx0/N$a;->a:J

    .line 35
    .line 36
    iget-wide v1, v0, Lx0/N$a;->a:J

    .line 37
    .line 38
    cmp-long p1, p1, v1

    .line 39
    .line 40
    if-gez p1, :cond_2

    .line 41
    .line 42
    iput-object v0, p0, Lx0/N;->e:Lx0/N$a;

    .line 43
    .line 44
    :cond_2
    return-void
.end method

.method public c(J)V
    .locals 5

    .line 1
    iget-wide v0, p0, Lx0/N;->g:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 11
    .line 12
    .line 13
    iput-wide p1, p0, Lx0/N;->g:J

    .line 14
    .line 15
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    cmp-long v0, p1, v0

    .line 18
    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    iget-object v0, p0, Lx0/N;->d:Lx0/N$a;

    .line 22
    .line 23
    iget-wide v1, v0, Lx0/N$a;->a:J

    .line 24
    .line 25
    cmp-long p1, p1, v1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_1
    :goto_1
    iget-wide p1, p0, Lx0/N;->g:J

    .line 31
    .line 32
    iget-wide v1, v0, Lx0/N$a;->b:J

    .line 33
    .line 34
    cmp-long p1, p1, v1

    .line 35
    .line 36
    if-lez p1, :cond_2

    .line 37
    .line 38
    iget-object v0, v0, Lx0/N$a;->d:Lx0/N$a;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    iget-object p1, v0, Lx0/N$a;->d:Lx0/N$a;

    .line 42
    .line 43
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Lx0/N$a;

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Lx0/N;->a(Lx0/N$a;)V

    .line 50
    .line 51
    .line 52
    new-instance p2, Lx0/N$a;

    .line 53
    .line 54
    iget-wide v1, v0, Lx0/N$a;->b:J

    .line 55
    .line 56
    iget v3, p0, Lx0/N;->b:I

    .line 57
    .line 58
    invoke-direct {p2, v1, v2, v3}, Lx0/N$a;-><init>(JI)V

    .line 59
    .line 60
    .line 61
    iput-object p2, v0, Lx0/N$a;->d:Lx0/N$a;

    .line 62
    .line 63
    iget-wide v1, p0, Lx0/N;->g:J

    .line 64
    .line 65
    iget-wide v3, v0, Lx0/N$a;->b:J

    .line 66
    .line 67
    cmp-long v1, v1, v3

    .line 68
    .line 69
    if-nez v1, :cond_3

    .line 70
    .line 71
    move-object v0, p2

    .line 72
    :cond_3
    iput-object v0, p0, Lx0/N;->f:Lx0/N$a;

    .line 73
    .line 74
    iget-object v0, p0, Lx0/N;->e:Lx0/N$a;

    .line 75
    .line 76
    if-ne v0, p1, :cond_5

    .line 77
    .line 78
    iput-object p2, p0, Lx0/N;->e:Lx0/N$a;

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    :goto_2
    iget-object p1, p0, Lx0/N;->d:Lx0/N$a;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, Lx0/N;->a(Lx0/N$a;)V

    .line 84
    .line 85
    .line 86
    new-instance p1, Lx0/N$a;

    .line 87
    .line 88
    iget-wide v0, p0, Lx0/N;->g:J

    .line 89
    .line 90
    iget p2, p0, Lx0/N;->b:I

    .line 91
    .line 92
    invoke-direct {p1, v0, v1, p2}, Lx0/N$a;-><init>(JI)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, Lx0/N;->d:Lx0/N$a;

    .line 96
    .line 97
    iput-object p1, p0, Lx0/N;->e:Lx0/N$a;

    .line 98
    .line 99
    iput-object p1, p0, Lx0/N;->f:Lx0/N$a;

    .line 100
    .line 101
    :cond_5
    :goto_3
    return-void
.end method

.method public e()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lx0/N;->g:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public f(Lj0/i;Lx0/P$b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/N;->e:Lx0/N$a;

    .line 2
    .line 3
    iget-object v1, p0, Lx0/N;->c:Lg0/z;

    .line 4
    .line 5
    invoke-static {v0, p1, p2, v1}, Lx0/N;->l(Lx0/N$a;Lj0/i;Lx0/P$b;Lg0/z;)Lx0/N$a;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final g(I)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lx0/N;->g:J

    .line 2
    .line 3
    int-to-long v2, p1

    .line 4
    add-long/2addr v0, v2

    .line 5
    iput-wide v0, p0, Lx0/N;->g:J

    .line 6
    .line 7
    iget-object p1, p0, Lx0/N;->f:Lx0/N$a;

    .line 8
    .line 9
    iget-wide v2, p1, Lx0/N$a;->b:J

    .line 10
    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object p1, p1, Lx0/N$a;->d:Lx0/N$a;

    .line 16
    .line 17
    iput-object p1, p0, Lx0/N;->f:Lx0/N$a;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final h(I)I
    .locals 6

    .line 1
    iget-object v0, p0, Lx0/N;->f:Lx0/N$a;

    .line 2
    .line 3
    iget-object v1, v0, Lx0/N$a;->c:LB0/a;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lx0/N;->a:LB0/b;

    .line 8
    .line 9
    invoke-interface {v1}, LB0/b;->d()LB0/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Lx0/N$a;

    .line 14
    .line 15
    iget-object v3, p0, Lx0/N;->f:Lx0/N$a;

    .line 16
    .line 17
    iget-wide v3, v3, Lx0/N$a;->b:J

    .line 18
    .line 19
    iget v5, p0, Lx0/N;->b:I

    .line 20
    .line 21
    invoke-direct {v2, v3, v4, v5}, Lx0/N$a;-><init>(JI)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lx0/N$a;->c(LB0/a;Lx0/N$a;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lx0/N;->f:Lx0/N$a;

    .line 28
    .line 29
    iget-wide v0, v0, Lx0/N$a;->b:J

    .line 30
    .line 31
    iget-wide v2, p0, Lx0/N;->g:J

    .line 32
    .line 33
    sub-long/2addr v0, v2

    .line 34
    long-to-int v0, v0

    .line 35
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    return p1
.end method

.method public m(Lj0/i;Lx0/P$b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/N;->e:Lx0/N$a;

    .line 2
    .line 3
    iget-object v1, p0, Lx0/N;->c:Lg0/z;

    .line 4
    .line 5
    invoke-static {v0, p1, p2, v1}, Lx0/N;->l(Lx0/N$a;Lj0/i;Lx0/P$b;Lg0/z;)Lx0/N$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lx0/N;->e:Lx0/N$a;

    .line 10
    .line 11
    return-void
.end method

.method public n()V
    .locals 4

    .line 1
    iget-object v0, p0, Lx0/N;->d:Lx0/N$a;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lx0/N;->a(Lx0/N$a;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx0/N;->d:Lx0/N$a;

    .line 7
    .line 8
    iget v1, p0, Lx0/N;->b:I

    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    invoke-virtual {v0, v2, v3, v1}, Lx0/N$a;->d(JI)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lx0/N;->d:Lx0/N$a;

    .line 16
    .line 17
    iput-object v0, p0, Lx0/N;->e:Lx0/N$a;

    .line 18
    .line 19
    iput-object v0, p0, Lx0/N;->f:Lx0/N$a;

    .line 20
    .line 21
    iput-wide v2, p0, Lx0/N;->g:J

    .line 22
    .line 23
    iget-object v0, p0, Lx0/N;->a:LB0/b;

    .line 24
    .line 25
    invoke-interface {v0}, LB0/b;->a()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public o()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/N;->d:Lx0/N$a;

    .line 2
    .line 3
    iput-object v0, p0, Lx0/N;->e:Lx0/N$a;

    .line 4
    .line 5
    return-void
.end method

.method public p(Ld0/i;IZ)I
    .locals 4

    .line 1
    invoke-virtual {p0, p2}, Lx0/N;->h(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    iget-object v0, p0, Lx0/N;->f:Lx0/N$a;

    .line 6
    .line 7
    iget-object v1, v0, Lx0/N$a;->c:LB0/a;

    .line 8
    .line 9
    iget-object v1, v1, LB0/a;->a:[B

    .line 10
    .line 11
    iget-wide v2, p0, Lx0/N;->g:J

    .line 12
    .line 13
    invoke-virtual {v0, v2, v3}, Lx0/N$a;->e(J)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-interface {p1, v1, v0, p2}, Ld0/i;->read([BII)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/4 p2, -0x1

    .line 22
    if-ne p1, p2, :cond_1

    .line 23
    .line 24
    if-eqz p3, :cond_0

    .line 25
    .line 26
    return p2

    .line 27
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    invoke-virtual {p0, p1}, Lx0/N;->g(I)V

    .line 34
    .line 35
    .line 36
    return p1
.end method

.method public q(Lg0/z;I)V
    .locals 5

    .line 1
    :goto_0
    if-lez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lx0/N;->h(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lx0/N;->f:Lx0/N$a;

    .line 8
    .line 9
    iget-object v2, v1, Lx0/N$a;->c:LB0/a;

    .line 10
    .line 11
    iget-object v2, v2, LB0/a;->a:[B

    .line 12
    .line 13
    iget-wide v3, p0, Lx0/N;->g:J

    .line 14
    .line 15
    invoke-virtual {v1, v3, v4}, Lx0/N$a;->e(J)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p1, v2, v1, v0}, Lg0/z;->l([BII)V

    .line 20
    .line 21
    .line 22
    sub-int/2addr p2, v0

    .line 23
    invoke-virtual {p0, v0}, Lx0/N;->g(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method
