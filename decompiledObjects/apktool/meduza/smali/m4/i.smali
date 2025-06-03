.class public final Lm4/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm4/j;


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm4/d0$a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:[Lc4/v;

.field public c:Z

.field public d:I

.field public e:I

.field public f:J


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm4/d0$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm4/i;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lc4/v;

    iput-object p1, p0, Lm4/i;->b:[Lc4/v;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lm4/i;->f:J

    return-void
.end method


# virtual methods
.method public final a(Lv5/u;)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lm4/i;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget v0, p0, Lm4/i;->d:I

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x0

    .line 9
    if-ne v0, v1, :cond_2

    .line 10
    .line 11
    const/16 v0, 0x20

    .line 12
    .line 13
    iget v1, p1, Lv5/u;->c:I

    .line 14
    .line 15
    iget v3, p1, Lv5/u;->b:I

    .line 16
    .line 17
    sub-int/2addr v1, v3

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    move v0, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p1}, Lv5/u;->v()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eq v1, v0, :cond_1

    .line 27
    .line 28
    iput-boolean v2, p0, Lm4/i;->c:Z

    .line 29
    .line 30
    :cond_1
    iget v0, p0, Lm4/i;->d:I

    .line 31
    .line 32
    add-int/lit8 v0, v0, -0x1

    .line 33
    .line 34
    iput v0, p0, Lm4/i;->d:I

    .line 35
    .line 36
    iget-boolean v0, p0, Lm4/i;->c:Z

    .line 37
    .line 38
    :goto_0
    if-nez v0, :cond_2

    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    iget v0, p0, Lm4/i;->d:I

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    if-ne v0, v1, :cond_5

    .line 45
    .line 46
    iget v0, p1, Lv5/u;->c:I

    .line 47
    .line 48
    iget v1, p1, Lv5/u;->b:I

    .line 49
    .line 50
    sub-int/2addr v0, v1

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    move v0, v2

    .line 54
    goto :goto_1

    .line 55
    :cond_3
    invoke-virtual {p1}, Lv5/u;->v()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    iput-boolean v2, p0, Lm4/i;->c:Z

    .line 62
    .line 63
    :cond_4
    iget v0, p0, Lm4/i;->d:I

    .line 64
    .line 65
    add-int/lit8 v0, v0, -0x1

    .line 66
    .line 67
    iput v0, p0, Lm4/i;->d:I

    .line 68
    .line 69
    iget-boolean v0, p0, Lm4/i;->c:Z

    .line 70
    .line 71
    :goto_1
    if-nez v0, :cond_5

    .line 72
    .line 73
    return-void

    .line 74
    :cond_5
    iget v0, p1, Lv5/u;->b:I

    .line 75
    .line 76
    iget v1, p1, Lv5/u;->c:I

    .line 77
    .line 78
    sub-int/2addr v1, v0

    .line 79
    iget-object v3, p0, Lm4/i;->b:[Lc4/v;

    .line 80
    .line 81
    array-length v4, v3

    .line 82
    :goto_2
    if-ge v2, v4, :cond_6

    .line 83
    .line 84
    aget-object v5, v3, v2

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Lv5/u;->G(I)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v5, v1, p1}, Lc4/v;->b(ILv5/u;)V

    .line 90
    .line 91
    .line 92
    add-int/lit8 v2, v2, 0x1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_6
    iget p1, p0, Lm4/i;->e:I

    .line 96
    .line 97
    add-int/2addr p1, v1

    .line 98
    iput p1, p0, Lm4/i;->e:I

    .line 99
    .line 100
    :cond_7
    return-void
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
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
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

    iput-boolean v0, p0, Lm4/i;->c:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lm4/i;->f:J

    return-void
.end method

.method public final c()V
    .locals 11

    iget-boolean v0, p0, Lm4/i;->c:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lm4/i;->f:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm4/i;->b:[Lc4/v;

    array-length v2, v0

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    iget-wide v5, p0, Lm4/i;->f:J

    const/4 v7, 0x1

    iget v8, p0, Lm4/i;->e:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Lc4/v;->c(JIIILc4/v$a;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Lm4/i;->c:Z

    :cond_1
    return-void
.end method

.method public final d(IJ)V
    .locals 2

    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lm4/i;->c:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p2, v0

    if-eqz p1, :cond_1

    iput-wide p2, p0, Lm4/i;->f:J

    :cond_1
    const/4 p1, 0x0

    iput p1, p0, Lm4/i;->e:I

    const/4 p1, 0x2

    iput p1, p0, Lm4/i;->d:I

    return-void
.end method

.method public final e(Lc4/j;Lm4/d0$d;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lm4/i;->b:[Lc4/v;

    .line 3
    .line 4
    array-length v1, v1

    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lm4/i;->a:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lm4/d0$a;

    .line 14
    .line 15
    invoke-virtual {p2}, Lm4/d0$d;->a()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Lm4/d0$d;->b()V

    .line 19
    .line 20
    .line 21
    iget v2, p2, Lm4/d0$d;->d:I

    .line 22
    .line 23
    const/4 v3, 0x3

    .line 24
    invoke-interface {p1, v2, v3}, Lc4/j;->r(II)Lc4/v;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    new-instance v3, Lv3/i0$a;

    .line 29
    .line 30
    invoke-direct {v3}, Lv3/i0$a;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Lm4/d0$d;->b()V

    .line 34
    .line 35
    .line 36
    iget-object v4, p2, Lm4/d0$d;->e:Ljava/lang/String;

    .line 37
    .line 38
    iput-object v4, v3, Lv3/i0$a;->a:Ljava/lang/String;

    .line 39
    .line 40
    const-string v4, "application/dvbsubs"

    .line 41
    .line 42
    iput-object v4, v3, Lv3/i0$a;->k:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v4, v1, Lm4/d0$a;->b:[B

    .line 45
    .line 46
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    iput-object v4, v3, Lv3/i0$a;->m:Ljava/util/List;

    .line 51
    .line 52
    iget-object v1, v1, Lm4/d0$a;->a:Ljava/lang/String;

    .line 53
    .line 54
    iput-object v1, v3, Lv3/i0$a;->c:Ljava/lang/String;

    .line 55
    .line 56
    new-instance v1, Lv3/i0;

    .line 57
    .line 58
    invoke-direct {v1, v3}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v2, v1}, Lc4/v;->d(Lv3/i0;)V

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, Lm4/i;->b:[Lc4/v;

    .line 65
    .line 66
    aput-object v2, v1, v0

    .line 67
    .line 68
    add-int/lit8 v0, v0, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    return-void
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
