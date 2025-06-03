.class public final Lc1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc1/k;


# static fields
.field public static final q:LX2/P;


# instance fields
.field public final o:LX2/v;

.field public final p:[J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, LX2/P;->d()LX2/P;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lc1/f;

    .line 6
    .line 7
    invoke-direct {v1}, Lc1/f;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, LX2/P;->f(LW2/g;)LX2/P;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lc1/g;->q:LX2/P;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const/4 v4, 0x1

    .line 13
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    if-ne v3, v4, :cond_1

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, LX2/B;->g(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lc1/e;

    .line 25
    .line 26
    iget-wide v7, v3, Lc1/e;->b:J

    .line 27
    .line 28
    invoke-static {v7, v8}, Lc1/g;->f(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v7

    .line 32
    iget-wide v9, v3, Lc1/e;->c:J

    .line 33
    .line 34
    cmp-long v5, v9, v5

    .line 35
    .line 36
    if-nez v5, :cond_0

    .line 37
    .line 38
    iget-object v1, v3, Lc1/e;->a:LX2/v;

    .line 39
    .line 40
    invoke-static {v1}, LX2/v;->Z(Ljava/lang/Object;)LX2/v;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v1, v0, Lc1/g;->o:LX2/v;

    .line 45
    .line 46
    new-array v1, v4, [J

    .line 47
    .line 48
    aput-wide v7, v1, v2

    .line 49
    .line 50
    iput-object v1, v0, Lc1/g;->p:[J

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget-object v5, v3, Lc1/e;->a:LX2/v;

    .line 54
    .line 55
    invoke-static {}, LX2/v;->Y()LX2/v;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-static {v5, v6}, LX2/v;->a0(Ljava/lang/Object;Ljava/lang/Object;)LX2/v;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    iput-object v5, v0, Lc1/g;->o:LX2/v;

    .line 64
    .line 65
    iget-wide v5, v3, Lc1/e;->c:J

    .line 66
    .line 67
    add-long/2addr v5, v7

    .line 68
    new-array v1, v1, [J

    .line 69
    .line 70
    aput-wide v7, v1, v2

    .line 71
    .line 72
    aput-wide v5, v1, v4

    .line 73
    .line 74
    iput-object v1, v0, Lc1/g;->p:[J

    .line 75
    .line 76
    :goto_0
    return-void

    .line 77
    :cond_1
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    mul-int/2addr v3, v1

    .line 82
    new-array v1, v3, [J

    .line 83
    .line 84
    iput-object v1, v0, Lc1/g;->p:[J

    .line 85
    .line 86
    const-wide v7, 0x7fffffffffffffffL

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    invoke-static {v1, v7, v8}, Ljava/util/Arrays;->fill([JJ)V

    .line 92
    .line 93
    .line 94
    new-instance v1, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    sget-object v3, Lc1/g;->q:LX2/P;

    .line 100
    .line 101
    move-object/from16 v7, p1

    .line 102
    .line 103
    invoke-static {v3, v7}, LX2/v;->g0(Ljava/util/Comparator;Ljava/lang/Iterable;)LX2/v;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    move v7, v2

    .line 108
    :goto_1
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    if-ge v2, v8, :cond_6

    .line 113
    .line 114
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    check-cast v8, Lc1/e;

    .line 119
    .line 120
    iget-wide v9, v8, Lc1/e;->b:J

    .line 121
    .line 122
    invoke-static {v9, v10}, Lc1/g;->f(J)J

    .line 123
    .line 124
    .line 125
    move-result-wide v9

    .line 126
    iget-wide v11, v8, Lc1/e;->c:J

    .line 127
    .line 128
    add-long/2addr v11, v9

    .line 129
    if-eqz v7, :cond_4

    .line 130
    .line 131
    iget-object v13, v0, Lc1/g;->p:[J

    .line 132
    .line 133
    add-int/lit8 v14, v7, -0x1

    .line 134
    .line 135
    aget-wide v15, v13, v14

    .line 136
    .line 137
    cmp-long v13, v15, v9

    .line 138
    .line 139
    if-gez v13, :cond_2

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_2
    cmp-long v13, v15, v9

    .line 143
    .line 144
    if-nez v13, :cond_3

    .line 145
    .line 146
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    check-cast v13, LX2/v;

    .line 151
    .line 152
    invoke-virtual {v13}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 153
    .line 154
    .line 155
    move-result v13

    .line 156
    if-eqz v13, :cond_3

    .line 157
    .line 158
    :goto_2
    iget-object v9, v8, Lc1/e;->a:LX2/v;

    .line 159
    .line 160
    invoke-virtual {v1, v14, v9}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_3
    const-string v13, "CuesWithTimingSubtitle"

    .line 165
    .line 166
    const-string v15, "Truncating unsupported overlapping cues."

    .line 167
    .line 168
    invoke-static {v13, v15}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    iget-object v13, v0, Lc1/g;->p:[J

    .line 172
    .line 173
    aput-wide v9, v13, v14

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_4
    :goto_3
    iget-object v13, v0, Lc1/g;->p:[J

    .line 177
    .line 178
    add-int/lit8 v14, v7, 0x1

    .line 179
    .line 180
    aput-wide v9, v13, v7

    .line 181
    .line 182
    iget-object v7, v8, Lc1/e;->a:LX2/v;

    .line 183
    .line 184
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move v7, v14

    .line 188
    :goto_4
    iget-wide v8, v8, Lc1/e;->c:J

    .line 189
    .line 190
    cmp-long v8, v8, v5

    .line 191
    .line 192
    if-eqz v8, :cond_5

    .line 193
    .line 194
    iget-object v8, v0, Lc1/g;->p:[J

    .line 195
    .line 196
    add-int/lit8 v9, v7, 0x1

    .line 197
    .line 198
    aput-wide v11, v8, v7

    .line 199
    .line 200
    invoke-static {}, LX2/v;->Y()LX2/v;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move v7, v9

    .line 208
    :cond_5
    add-int/2addr v2, v4

    .line 209
    goto :goto_1

    .line 210
    :cond_6
    invoke-static {v1}, LX2/v;->U(Ljava/util/Collection;)LX2/v;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    iput-object v1, v0, Lc1/g;->o:LX2/v;

    .line 215
    .line 216
    return-void
.end method

.method public static synthetic a(Lc1/e;)Ljava/lang/Comparable;
    .locals 0

    .line 1
    invoke-static {p0}, Lc1/g;->d(Lc1/e;)Ljava/lang/Comparable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(Lc1/e;)Ljava/lang/Comparable;
    .locals 2

    .line 1
    iget-wide v0, p0, Lc1/e;->b:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Lc1/g;->f(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static f(J)J
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p0, v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-wide/16 p0, 0x0

    .line 11
    .line 12
    :cond_0
    return-wide p0
.end method


# virtual methods
.method public b(J)LX2/v;
    .locals 3

    .line 1
    iget-object v0, p0, Lc1/g;->p:[J

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v0, p1, p2, v1, v2}, Lg0/M;->h([JJZZ)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 p2, -0x1

    .line 10
    if-ne p1, p2, :cond_0

    .line 11
    .line 12
    invoke-static {}, LX2/v;->Y()LX2/v;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object p2, p0, Lc1/g;->o:LX2/v;

    .line 18
    .line 19
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, LX2/v;

    .line 24
    .line 25
    :goto_0
    return-object p1
.end method

.method public c(J)I
    .locals 2

    .line 1
    iget-object v0, p0, Lc1/g;->p:[J

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, p1, p2, v1, v1}, Lg0/M;->d([JJZZ)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iget-object p2, p0, Lc1/g;->o:LX2/v;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-ge p1, p2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, -0x1

    .line 18
    :goto_0
    return p1
.end method

.method public e(I)J
    .locals 3

    .line 1
    iget-object v0, p0, Lc1/g;->o:LX2/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lc1/g;->p:[J

    .line 16
    .line 17
    aget-wide v1, v0, p1

    .line 18
    .line 19
    return-wide v1
.end method

.method public bridge synthetic h(J)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lc1/g;->b(J)LX2/v;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public j()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc1/g;->o:LX2/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
