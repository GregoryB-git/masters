.class public final Lq0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/r;


# static fields
.field public static final i:Ljava/util/regex/Pattern;

.field public static final j:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lg0/E;

.field public final c:Lg0/z;

.field public final d:Lc1/t$a;

.field public final e:Z

.field public f:LF0/t;

.field public g:[B

.field public h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "LOCAL:([^,]+)"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lq0/w;->i:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "MPEGTS:(-?\\d+)"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lq0/w;->j:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lg0/E;Lc1/t$a;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq0/w;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lq0/w;->b:Lg0/E;

    .line 7
    .line 8
    new-instance p1, Lg0/z;

    .line 9
    .line 10
    invoke-direct {p1}, Lg0/z;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lq0/w;->c:Lg0/z;

    .line 14
    .line 15
    const/16 p1, 0x400

    .line 16
    .line 17
    new-array p1, p1, [B

    .line 18
    .line 19
    iput-object p1, p0, Lq0/w;->g:[B

    .line 20
    .line 21
    iput-object p3, p0, Lq0/w;->d:Lc1/t$a;

    .line 22
    .line 23
    iput-boolean p4, p0, Lq0/w;->e:Z

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public a(JJ)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public b(LF0/t;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lq0/w;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lc1/v;

    .line 6
    .line 7
    iget-object v1, p0, Lq0/w;->d:Lc1/t$a;

    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, Lc1/v;-><init>(LF0/t;Lc1/t$a;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, p1

    .line 14
    :goto_0
    iput-object v0, p0, Lq0/w;->f:LF0/t;

    .line 15
    .line 16
    new-instance v0, LF0/M$b;

    .line 17
    .line 18
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1, v2}, LF0/M$b;-><init>(J)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v0}, LF0/t;->e(LF0/M;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final c(J)LF0/T;
    .locals 3

    .line 1
    iget-object v0, p0, Lq0/w;->f:LF0/t;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    invoke-interface {v0, v1, v2}, LF0/t;->a(II)LF0/T;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ld0/q$b;

    .line 10
    .line 11
    invoke-direct {v1}, Ld0/q$b;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "text/vtt"

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, Lq0/w;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ld0/q$b;->e0(Ljava/lang/String;)Ld0/q$b;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1, p1, p2}, Ld0/q$b;->s0(J)Ld0/q$b;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ld0/q$b;->K()Ld0/q;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-interface {v0, p1}, LF0/T;->d(Ld0/q;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lq0/w;->f:LF0/t;

    .line 38
    .line 39
    invoke-interface {p1}, LF0/t;->j()V

    .line 40
    .line 41
    .line 42
    return-object v0
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
    .locals 4

    .line 1
    iget-object v0, p0, Lq0/w;->g:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x6

    .line 5
    invoke-interface {p1, v0, v1, v2, v1}, LF0/s;->l([BIIZ)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lq0/w;->c:Lg0/z;

    .line 9
    .line 10
    iget-object v3, p0, Lq0/w;->g:[B

    .line 11
    .line 12
    invoke-virtual {v0, v3, v2}, Lg0/z;->R([BI)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lq0/w;->c:Lg0/z;

    .line 16
    .line 17
    invoke-static {v0}, Lk1/h;->b(Lg0/z;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_0
    iget-object v0, p0, Lq0/w;->g:[B

    .line 26
    .line 27
    const/4 v3, 0x3

    .line 28
    invoke-interface {p1, v0, v2, v3, v1}, LF0/s;->l([BIIZ)Z

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lq0/w;->c:Lg0/z;

    .line 32
    .line 33
    iget-object v0, p0, Lq0/w;->g:[B

    .line 34
    .line 35
    const/16 v1, 0x9

    .line 36
    .line 37
    invoke-virtual {p1, v0, v1}, Lg0/z;->R([BI)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lq0/w;->c:Lg0/z;

    .line 41
    .line 42
    invoke-static {p1}, Lk1/h;->b(Lg0/z;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    return p1
.end method

.method public final f()V
    .locals 12

    .line 1
    new-instance v0, Lg0/z;

    .line 2
    .line 3
    iget-object v1, p0, Lq0/w;->g:[B

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lg0/z;-><init>([B)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lk1/h;->e(Lg0/z;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lg0/z;->r()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    move-wide v4, v2

    .line 18
    move-wide v6, v4

    .line 19
    :goto_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v8

    .line 23
    const/4 v9, 0x1

    .line 24
    if-nez v8, :cond_3

    .line 25
    .line 26
    const-string v8, "X-TIMESTAMP-MAP"

    .line 27
    .line 28
    invoke-virtual {v1, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v8

    .line 32
    if-eqz v8, :cond_2

    .line 33
    .line 34
    sget-object v4, Lq0/w;->i:Ljava/util/regex/Pattern;

    .line 35
    .line 36
    invoke-virtual {v4, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const/4 v6, 0x0

    .line 45
    if-eqz v5, :cond_1

    .line 46
    .line 47
    sget-object v5, Lq0/w;->j:Ljava/util/regex/Pattern;

    .line 48
    .line 49
    invoke-virtual {v5, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    if-eqz v7, :cond_0

    .line 58
    .line 59
    invoke-virtual {v4, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v1}, Lk1/h;->d(Ljava/lang/String;)J

    .line 70
    .line 71
    .line 72
    move-result-wide v6

    .line 73
    invoke-virtual {v5, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 84
    .line 85
    .line 86
    move-result-wide v4

    .line 87
    invoke-static {v4, v5}, Lg0/E;->h(J)J

    .line 88
    .line 89
    .line 90
    move-result-wide v4

    .line 91
    goto :goto_1

    .line 92
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    const-string v2, "X-TIMESTAMP-MAP doesn\'t contain media timestamp: "

    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v0, v6}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    throw v0

    .line 114
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    const-string v2, "X-TIMESTAMP-MAP doesn\'t contain local timestamp: "

    .line 120
    .line 121
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v0, v6}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    throw v0

    .line 136
    :cond_2
    :goto_1
    invoke-virtual {v0}, Lg0/z;->r()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    goto :goto_0

    .line 141
    :cond_3
    invoke-static {v0}, Lk1/h;->a(Lg0/z;)Ljava/util/regex/Matcher;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    if-nez v0, :cond_4

    .line 146
    .line 147
    invoke-virtual {p0, v2, v3}, Lq0/w;->c(J)LF0/T;

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_4
    invoke-virtual {v0, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    check-cast v0, Ljava/lang/String;

    .line 160
    .line 161
    invoke-static {v0}, Lk1/h;->d(Ljava/lang/String;)J

    .line 162
    .line 163
    .line 164
    move-result-wide v0

    .line 165
    iget-object v2, p0, Lq0/w;->b:Lg0/E;

    .line 166
    .line 167
    add-long/2addr v4, v0

    .line 168
    sub-long/2addr v4, v6

    .line 169
    invoke-static {v4, v5}, Lg0/E;->l(J)J

    .line 170
    .line 171
    .line 172
    move-result-wide v3

    .line 173
    invoke-virtual {v2, v3, v4}, Lg0/E;->b(J)J

    .line 174
    .line 175
    .line 176
    move-result-wide v6

    .line 177
    sub-long v0, v6, v0

    .line 178
    .line 179
    invoke-virtual {p0, v0, v1}, Lq0/w;->c(J)LF0/T;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    iget-object v0, p0, Lq0/w;->c:Lg0/z;

    .line 184
    .line 185
    iget-object v1, p0, Lq0/w;->g:[B

    .line 186
    .line 187
    iget v2, p0, Lq0/w;->h:I

    .line 188
    .line 189
    invoke-virtual {v0, v1, v2}, Lg0/z;->R([BI)V

    .line 190
    .line 191
    .line 192
    iget-object v0, p0, Lq0/w;->c:Lg0/z;

    .line 193
    .line 194
    iget v1, p0, Lq0/w;->h:I

    .line 195
    .line 196
    invoke-interface {v5, v0, v1}, LF0/T;->e(Lg0/z;I)V

    .line 197
    .line 198
    .line 199
    iget v9, p0, Lq0/w;->h:I

    .line 200
    .line 201
    const/4 v10, 0x0

    .line 202
    const/4 v11, 0x0

    .line 203
    const/4 v8, 0x1

    .line 204
    invoke-interface/range {v5 .. v11}, LF0/T;->b(JIIILF0/T$a;)V

    .line 205
    .line 206
    .line 207
    return-void
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
    iget-object p2, p0, Lq0/w;->f:LF0/t;

    .line 2
    .line 3
    invoke-static {p2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, LF0/s;->a()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    long-to-int p2, v0

    .line 11
    iget v0, p0, Lq0/w;->h:I

    .line 12
    .line 13
    iget-object v1, p0, Lq0/w;->g:[B

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, -0x1

    .line 17
    if-ne v0, v2, :cond_1

    .line 18
    .line 19
    if-eq p2, v3, :cond_0

    .line 20
    .line 21
    move v0, p2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    array-length v0, v1

    .line 24
    :goto_0
    mul-int/lit8 v0, v0, 0x3

    .line 25
    .line 26
    div-int/lit8 v0, v0, 0x2

    .line 27
    .line 28
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lq0/w;->g:[B

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lq0/w;->g:[B

    .line 35
    .line 36
    iget v1, p0, Lq0/w;->h:I

    .line 37
    .line 38
    array-length v2, v0

    .line 39
    sub-int/2addr v2, v1

    .line 40
    invoke-interface {p1, v0, v1, v2}, LF0/s;->read([BII)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eq p1, v3, :cond_3

    .line 45
    .line 46
    iget v0, p0, Lq0/w;->h:I

    .line 47
    .line 48
    add-int/2addr v0, p1

    .line 49
    iput v0, p0, Lq0/w;->h:I

    .line 50
    .line 51
    if-eq p2, v3, :cond_2

    .line 52
    .line 53
    if-eq v0, p2, :cond_3

    .line 54
    .line 55
    :cond_2
    const/4 p1, 0x0

    .line 56
    return p1

    .line 57
    :cond_3
    invoke-virtual {p0}, Lq0/w;->f()V

    .line 58
    .line 59
    .line 60
    return v3
.end method

.method public release()V
    .locals 0

    .line 1
    return-void
.end method
