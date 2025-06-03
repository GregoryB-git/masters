.class public final Lm4/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm4/j;


# instance fields
.field public final a:Lv5/u;

.field public b:Lc4/v;

.field public c:Z

.field public d:J

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lv5/u;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lv5/u;-><init>(I)V

    iput-object v0, p0, Lm4/o;->a:Lv5/u;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lm4/o;->d:J

    return-void
.end method


# virtual methods
.method public final a(Lv5/u;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lm4/o;->b:Lc4/v;

    .line 2
    .line 3
    invoke-static {v0}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lm4/o;->c:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget v0, p1, Lv5/u;->c:I

    .line 12
    .line 13
    iget v1, p1, Lv5/u;->b:I

    .line 14
    .line 15
    sub-int/2addr v0, v1

    .line 16
    iget v1, p0, Lm4/o;->f:I

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    if-ge v1, v2, :cond_3

    .line 21
    .line 22
    rsub-int/lit8 v1, v1, 0xa

    .line 23
    .line 24
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iget-object v3, p1, Lv5/u;->a:[B

    .line 29
    .line 30
    iget v4, p1, Lv5/u;->b:I

    .line 31
    .line 32
    iget-object v5, p0, Lm4/o;->a:Lv5/u;

    .line 33
    .line 34
    iget-object v5, v5, Lv5/u;->a:[B

    .line 35
    .line 36
    iget v6, p0, Lm4/o;->f:I

    .line 37
    .line 38
    invoke-static {v3, v4, v5, v6, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 39
    .line 40
    .line 41
    iget v3, p0, Lm4/o;->f:I

    .line 42
    .line 43
    add-int/2addr v3, v1

    .line 44
    if-ne v3, v2, :cond_3

    .line 45
    .line 46
    iget-object v1, p0, Lm4/o;->a:Lv5/u;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-virtual {v1, v3}, Lv5/u;->G(I)V

    .line 50
    .line 51
    .line 52
    const/16 v1, 0x49

    .line 53
    .line 54
    iget-object v4, p0, Lm4/o;->a:Lv5/u;

    .line 55
    .line 56
    invoke-virtual {v4}, Lv5/u;->v()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-ne v1, v4, :cond_2

    .line 61
    .line 62
    const/16 v1, 0x44

    .line 63
    .line 64
    iget-object v4, p0, Lm4/o;->a:Lv5/u;

    .line 65
    .line 66
    invoke-virtual {v4}, Lv5/u;->v()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-ne v1, v4, :cond_2

    .line 71
    .line 72
    const/16 v1, 0x33

    .line 73
    .line 74
    iget-object v4, p0, Lm4/o;->a:Lv5/u;

    .line 75
    .line 76
    invoke-virtual {v4}, Lv5/u;->v()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eq v1, v4, :cond_1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    iget-object v1, p0, Lm4/o;->a:Lv5/u;

    .line 84
    .line 85
    const/4 v3, 0x3

    .line 86
    invoke-virtual {v1, v3}, Lv5/u;->H(I)V

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, Lm4/o;->a:Lv5/u;

    .line 90
    .line 91
    invoke-virtual {v1}, Lv5/u;->u()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    add-int/2addr v1, v2

    .line 96
    iput v1, p0, Lm4/o;->e:I

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    :goto_0
    const-string p1, "Id3Reader"

    .line 100
    .line 101
    const-string v0, "Discarding invalid ID3 tag"

    .line 102
    .line 103
    invoke-static {p1, v0}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iput-boolean v3, p0, Lm4/o;->c:Z

    .line 107
    .line 108
    return-void

    .line 109
    :cond_3
    :goto_1
    iget v1, p0, Lm4/o;->e:I

    .line 110
    .line 111
    iget v2, p0, Lm4/o;->f:I

    .line 112
    .line 113
    sub-int/2addr v1, v2

    .line 114
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    iget-object v1, p0, Lm4/o;->b:Lc4/v;

    .line 119
    .line 120
    invoke-interface {v1, v0, p1}, Lc4/v;->b(ILv5/u;)V

    .line 121
    .line 122
    .line 123
    iget p1, p0, Lm4/o;->f:I

    .line 124
    .line 125
    add-int/2addr p1, v0

    .line 126
    iput p1, p0, Lm4/o;->f:I

    .line 127
    .line 128
    return-void
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method

.method public final b()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lm4/o;->c:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lm4/o;->d:J

    return-void
.end method

.method public final c()V
    .locals 8

    iget-object v0, p0, Lm4/o;->b:Lc4/v;

    invoke-static {v0}, Lx6/b;->K(Ljava/lang/Object;)V

    iget-boolean v0, p0, Lm4/o;->c:Z

    if-eqz v0, :cond_2

    iget v5, p0, Lm4/o;->e:I

    if-eqz v5, :cond_2

    iget v0, p0, Lm4/o;->f:I

    if-eq v0, v5, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lm4/o;->d:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lm4/o;->b:Lc4/v;

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-interface/range {v1 .. v7}, Lc4/v;->c(JIIILc4/v$a;)V

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lm4/o;->c:Z

    :cond_2
    :goto_0
    return-void
.end method

.method public final d(IJ)V
    .locals 2

    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lm4/o;->c:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p2, v0

    if-eqz p1, :cond_1

    iput-wide p2, p0, Lm4/o;->d:J

    :cond_1
    const/4 p1, 0x0

    iput p1, p0, Lm4/o;->e:I

    iput p1, p0, Lm4/o;->f:I

    return-void
.end method

.method public final e(Lc4/j;Lm4/d0$d;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lm4/d0$d;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lm4/d0$d;->b()V

    .line 5
    .line 6
    .line 7
    iget v0, p2, Lm4/d0$d;->d:I

    .line 8
    .line 9
    const/4 v1, 0x5

    .line 10
    invoke-interface {p1, v0, v1}, Lc4/j;->r(II)Lc4/v;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lm4/o;->b:Lc4/v;

    .line 15
    .line 16
    new-instance v0, Lv3/i0$a;

    .line 17
    .line 18
    invoke-direct {v0}, Lv3/i0$a;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Lm4/d0$d;->b()V

    .line 22
    .line 23
    .line 24
    iget-object p2, p2, Lm4/d0$d;->e:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p2, v0, Lv3/i0$a;->a:Ljava/lang/String;

    .line 27
    .line 28
    const-string p2, "application/id3"

    .line 29
    .line 30
    iput-object p2, v0, Lv3/i0$a;->k:Ljava/lang/String;

    .line 31
    .line 32
    new-instance p2, Lv3/i0;

    .line 33
    .line 34
    invoke-direct {p2, v0}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, p2}, Lc4/v;->d(Lv3/i0;)V

    .line 38
    .line 39
    .line 40
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method
