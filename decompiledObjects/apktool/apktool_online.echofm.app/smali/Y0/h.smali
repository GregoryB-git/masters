.class public final LY0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY0/g;


# instance fields
.field public final a:[J

.field public final b:[J

.field public final c:J

.field public final d:J

.field public final e:I


# direct methods
.method public constructor <init>([J[JJJI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY0/h;->a:[J

    .line 5
    .line 6
    iput-object p2, p0, LY0/h;->b:[J

    .line 7
    .line 8
    iput-wide p3, p0, LY0/h;->c:J

    .line 9
    .line 10
    iput-wide p5, p0, LY0/h;->d:J

    .line 11
    .line 12
    iput p7, p0, LY0/h;->e:I

    .line 13
    .line 14
    return-void
.end method

.method public static a(JJLF0/I$a;Lg0/z;)LY0/h;
    .locals 25

    .line 1
    move-wide/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p4

    .line 4
    .line 5
    move-object/from16 v3, p5

    .line 6
    .line 7
    const/16 v4, 0xa

    .line 8
    .line 9
    invoke-virtual {v3, v4}, Lg0/z;->U(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p5 .. p5}, Lg0/z;->p()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const/4 v5, 0x0

    .line 17
    if-gtz v4, :cond_0

    .line 18
    .line 19
    return-object v5

    .line 20
    :cond_0
    iget v6, v2, LF0/I$a;->d:I

    .line 21
    .line 22
    int-to-long v7, v4

    .line 23
    const/16 v4, 0x7d00

    .line 24
    .line 25
    if-lt v6, v4, :cond_1

    .line 26
    .line 27
    const/16 v4, 0x480

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/16 v4, 0x240

    .line 31
    .line 32
    :goto_0
    int-to-long v9, v4

    .line 33
    const-wide/32 v11, 0xf4240

    .line 34
    .line 35
    .line 36
    mul-long/2addr v9, v11

    .line 37
    int-to-long v11, v6

    .line 38
    invoke-static/range {v7 .. v12}, Lg0/M;->W0(JJJ)J

    .line 39
    .line 40
    .line 41
    move-result-wide v16

    .line 42
    invoke-virtual/range {p5 .. p5}, Lg0/z;->M()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    invoke-virtual/range {p5 .. p5}, Lg0/z;->M()I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    invoke-virtual/range {p5 .. p5}, Lg0/z;->M()I

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    const/4 v8, 0x2

    .line 55
    invoke-virtual {v3, v8}, Lg0/z;->U(I)V

    .line 56
    .line 57
    .line 58
    iget v9, v2, LF0/I$a;->c:I

    .line 59
    .line 60
    int-to-long v9, v9

    .line 61
    add-long v9, p2, v9

    .line 62
    .line 63
    new-array v14, v4, [J

    .line 64
    .line 65
    new-array v15, v4, [J

    .line 66
    .line 67
    const/4 v11, 0x0

    .line 68
    move-wide/from16 v12, p2

    .line 69
    .line 70
    :goto_1
    if-ge v11, v4, :cond_6

    .line 71
    .line 72
    move/from16 v19, v6

    .line 73
    .line 74
    int-to-long v5, v11

    .line 75
    mul-long v5, v5, v16

    .line 76
    .line 77
    move-wide/from16 v21, v9

    .line 78
    .line 79
    int-to-long v8, v4

    .line 80
    div-long/2addr v5, v8

    .line 81
    aput-wide v5, v14, v11

    .line 82
    .line 83
    move-wide/from16 v5, v21

    .line 84
    .line 85
    invoke-static {v12, v13, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 86
    .line 87
    .line 88
    move-result-wide v8

    .line 89
    aput-wide v8, v15, v11

    .line 90
    .line 91
    const/4 v8, 0x1

    .line 92
    if-eq v7, v8, :cond_5

    .line 93
    .line 94
    const/4 v8, 0x2

    .line 95
    if-eq v7, v8, :cond_4

    .line 96
    .line 97
    const/4 v9, 0x3

    .line 98
    if-eq v7, v9, :cond_3

    .line 99
    .line 100
    const/4 v9, 0x4

    .line 101
    if-eq v7, v9, :cond_2

    .line 102
    .line 103
    const/4 v9, 0x0

    .line 104
    return-object v9

    .line 105
    :cond_2
    const/4 v9, 0x0

    .line 106
    invoke-virtual/range {p5 .. p5}, Lg0/z;->K()I

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    goto :goto_2

    .line 111
    :cond_3
    const/4 v9, 0x0

    .line 112
    invoke-virtual/range {p5 .. p5}, Lg0/z;->J()I

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    goto :goto_2

    .line 117
    :cond_4
    const/4 v9, 0x0

    .line 118
    invoke-virtual/range {p5 .. p5}, Lg0/z;->M()I

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    goto :goto_2

    .line 123
    :cond_5
    const/4 v8, 0x2

    .line 124
    const/4 v9, 0x0

    .line 125
    invoke-virtual/range {p5 .. p5}, Lg0/z;->G()I

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    :goto_2
    int-to-long v8, v10

    .line 130
    move/from16 v10, v19

    .line 131
    .line 132
    move/from16 v19, v4

    .line 133
    .line 134
    int-to-long v3, v10

    .line 135
    mul-long/2addr v8, v3

    .line 136
    add-long/2addr v12, v8

    .line 137
    add-int/lit8 v11, v11, 0x1

    .line 138
    .line 139
    move-object/from16 v3, p5

    .line 140
    .line 141
    move/from16 v4, v19

    .line 142
    .line 143
    const/4 v8, 0x2

    .line 144
    move-wide/from16 v23, v5

    .line 145
    .line 146
    move v6, v10

    .line 147
    move-wide/from16 v9, v23

    .line 148
    .line 149
    const/4 v5, 0x0

    .line 150
    goto :goto_1

    .line 151
    :cond_6
    const-wide/16 v3, -0x1

    .line 152
    .line 153
    cmp-long v3, v0, v3

    .line 154
    .line 155
    if-eqz v3, :cond_7

    .line 156
    .line 157
    cmp-long v3, v0, v12

    .line 158
    .line 159
    if-eqz v3, :cond_7

    .line 160
    .line 161
    new-instance v3, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    const-string v4, "VBRI data size mismatch: "

    .line 167
    .line 168
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v0, ", "

    .line 175
    .line 176
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    const-string v1, "VbriSeeker"

    .line 187
    .line 188
    invoke-static {v1, v0}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :cond_7
    new-instance v0, LY0/h;

    .line 192
    .line 193
    iget v1, v2, LF0/I$a;->f:I

    .line 194
    .line 195
    move-wide v2, v12

    .line 196
    move-object v13, v0

    .line 197
    move-wide/from16 v18, v2

    .line 198
    .line 199
    move/from16 v20, v1

    .line 200
    .line 201
    invoke-direct/range {v13 .. v20}, LY0/h;-><init>([J[JJJI)V

    .line 202
    .line 203
    .line 204
    return-object v0
.end method


# virtual methods
.method public c(J)J
    .locals 3

    .line 1
    iget-object v0, p0, LY0/h;->a:[J

    .line 2
    .line 3
    iget-object v1, p0, LY0/h;->b:[J

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-static {v1, p1, p2, v2, v2}, Lg0/M;->h([JJZZ)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    aget-wide p1, v0, p1

    .line 11
    .line 12
    return-wide p1
.end method

.method public f()J
    .locals 2

    .line 1
    iget-wide v0, p0, LY0/h;->d:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public h()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public j(J)LF0/M$a;
    .locals 8

    .line 1
    iget-object v0, p0, LY0/h;->a:[J

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, p1, p2, v1, v1}, Lg0/M;->h([JJZZ)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    new-instance v2, LF0/N;

    .line 9
    .line 10
    iget-object v3, p0, LY0/h;->a:[J

    .line 11
    .line 12
    aget-wide v4, v3, v0

    .line 13
    .line 14
    iget-object v3, p0, LY0/h;->b:[J

    .line 15
    .line 16
    aget-wide v6, v3, v0

    .line 17
    .line 18
    invoke-direct {v2, v4, v5, v6, v7}, LF0/N;-><init>(JJ)V

    .line 19
    .line 20
    .line 21
    iget-wide v3, v2, LF0/N;->a:J

    .line 22
    .line 23
    cmp-long p1, v3, p1

    .line 24
    .line 25
    if-gez p1, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, LY0/h;->a:[J

    .line 28
    .line 29
    array-length p1, p1

    .line 30
    sub-int/2addr p1, v1

    .line 31
    if-ne v0, p1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance p1, LF0/N;

    .line 35
    .line 36
    iget-object p2, p0, LY0/h;->a:[J

    .line 37
    .line 38
    add-int/2addr v0, v1

    .line 39
    aget-wide v3, p2, v0

    .line 40
    .line 41
    iget-object p2, p0, LY0/h;->b:[J

    .line 42
    .line 43
    aget-wide v0, p2, v0

    .line 44
    .line 45
    invoke-direct {p1, v3, v4, v0, v1}, LF0/N;-><init>(JJ)V

    .line 46
    .line 47
    .line 48
    new-instance p2, LF0/M$a;

    .line 49
    .line 50
    invoke-direct {p2, v2, p1}, LF0/M$a;-><init>(LF0/N;LF0/N;)V

    .line 51
    .line 52
    .line 53
    return-object p2

    .line 54
    :cond_1
    :goto_0
    new-instance p1, LF0/M$a;

    .line 55
    .line 56
    invoke-direct {p1, v2}, LF0/M$a;-><init>(LF0/N;)V

    .line 57
    .line 58
    .line 59
    return-object p1
.end method

.method public k()I
    .locals 1

    .line 1
    iget v0, p0, LY0/h;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public l()J
    .locals 2

    .line 1
    iget-wide v0, p0, LY0/h;->c:J

    .line 2
    .line 3
    return-wide v0
.end method
