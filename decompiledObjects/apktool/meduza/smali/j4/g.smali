.class public final Lj4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj4/e;


# instance fields
.field public final a:J

.field public final b:I

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:[J


# direct methods
.method public constructor <init>(JIJJ[J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lj4/g;->a:J

    iput p3, p0, Lj4/g;->b:I

    iput-wide p4, p0, Lj4/g;->c:J

    iput-object p8, p0, Lj4/g;->f:[J

    iput-wide p6, p0, Lj4/g;->d:J

    const-wide/16 p3, -0x1

    cmp-long p5, p6, p3

    if-nez p5, :cond_0

    goto :goto_0

    :cond_0
    add-long p3, p1, p6

    :goto_0
    iput-wide p3, p0, Lj4/g;->e:J

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 13

    .line 1
    iget-wide v0, p0, Lj4/g;->a:J

    .line 2
    .line 3
    sub-long/2addr p1, v0

    .line 4
    invoke-virtual {p0}, Lj4/g;->e()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    iget v0, p0, Lj4/g;->b:I

    .line 11
    .line 12
    int-to-long v0, v0

    .line 13
    cmp-long v0, p1, v0

    .line 14
    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    iget-object v0, p0, Lj4/g;->f:[J

    .line 19
    .line 20
    invoke-static {v0}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    long-to-double p1, p1

    .line 24
    const-wide/high16 v1, 0x4070000000000000L    # 256.0

    .line 25
    .line 26
    mul-double/2addr p1, v1

    .line 27
    iget-wide v1, p0, Lj4/g;->d:J

    .line 28
    .line 29
    long-to-double v1, v1

    .line 30
    div-double/2addr p1, v1

    .line 31
    double-to-long v1, p1

    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-static {v0, v1, v2, v3}, Lv5/e0;->f([JJZ)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iget-wide v2, p0, Lj4/g;->c:J

    .line 38
    .line 39
    int-to-long v4, v1

    .line 40
    mul-long/2addr v4, v2

    .line 41
    const-wide/16 v6, 0x64

    .line 42
    .line 43
    div-long/2addr v4, v6

    .line 44
    aget-wide v8, v0, v1

    .line 45
    .line 46
    add-int/lit8 v10, v1, 0x1

    .line 47
    .line 48
    int-to-long v11, v10

    .line 49
    mul-long/2addr v2, v11

    .line 50
    div-long/2addr v2, v6

    .line 51
    const/16 v6, 0x63

    .line 52
    .line 53
    if-ne v1, v6, :cond_1

    .line 54
    .line 55
    const-wide/16 v0, 0x100

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    aget-wide v6, v0, v10

    .line 59
    .line 60
    move-wide v0, v6

    .line 61
    :goto_0
    cmp-long v6, v8, v0

    .line 62
    .line 63
    if-nez v6, :cond_2

    .line 64
    .line 65
    const-wide/16 p1, 0x0

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    long-to-double v6, v8

    .line 69
    sub-double/2addr p1, v6

    .line 70
    sub-long/2addr v0, v8

    .line 71
    long-to-double v0, v0

    .line 72
    div-double/2addr p1, v0

    .line 73
    :goto_1
    sub-long/2addr v2, v4

    .line 74
    long-to-double v0, v2

    .line 75
    mul-double/2addr p1, v0

    .line 76
    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    .line 77
    .line 78
    .line 79
    move-result-wide p1

    .line 80
    add-long/2addr p1, v4

    .line 81
    return-wide p1

    .line 82
    :cond_3
    :goto_2
    const-wide/16 p1, 0x0

    .line 83
    .line 84
    return-wide p1
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

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lj4/g;->e:J

    return-wide v0
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lj4/g;->f:[J

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final g(J)Lc4/t$a;
    .locals 12

    .line 1
    invoke-virtual {p0}, Lj4/g;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance p1, Lc4/t$a;

    .line 8
    .line 9
    new-instance p2, Lc4/u;

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iget-wide v2, p0, Lj4/g;->a:J

    .line 14
    .line 15
    iget v4, p0, Lj4/g;->b:I

    .line 16
    .line 17
    int-to-long v4, v4

    .line 18
    add-long/2addr v2, v4

    .line 19
    invoke-direct {p2, v0, v1, v2, v3}, Lc4/u;-><init>(JJ)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, p2, p2}, Lc4/t$a;-><init>(Lc4/u;Lc4/u;)V

    .line 23
    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    const-wide/16 v6, 0x0

    .line 27
    .line 28
    iget-wide v8, p0, Lj4/g;->c:J

    .line 29
    .line 30
    move-wide v4, p1

    .line 31
    invoke-static/range {v4 .. v9}, Lv5/e0;->j(JJJ)J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    long-to-double v0, p1

    .line 36
    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    .line 37
    .line 38
    mul-double/2addr v0, v2

    .line 39
    iget-wide v4, p0, Lj4/g;->c:J

    .line 40
    .line 41
    long-to-double v4, v4

    .line 42
    div-double/2addr v0, v4

    .line 43
    const-wide/16 v4, 0x0

    .line 44
    .line 45
    cmpg-double v6, v0, v4

    .line 46
    .line 47
    const-wide/high16 v7, 0x4070000000000000L    # 256.0

    .line 48
    .line 49
    if-gtz v6, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    cmpl-double v2, v0, v2

    .line 53
    .line 54
    if-ltz v2, :cond_2

    .line 55
    .line 56
    move-wide v4, v7

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    double-to-int v2, v0

    .line 59
    iget-object v3, p0, Lj4/g;->f:[J

    .line 60
    .line 61
    invoke-static {v3}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    aget-wide v4, v3, v2

    .line 65
    .line 66
    long-to-double v4, v4

    .line 67
    const/16 v6, 0x63

    .line 68
    .line 69
    if-ne v2, v6, :cond_3

    .line 70
    .line 71
    move-wide v9, v7

    .line 72
    goto :goto_0

    .line 73
    :cond_3
    add-int/lit8 v6, v2, 0x1

    .line 74
    .line 75
    aget-wide v9, v3, v6

    .line 76
    .line 77
    long-to-double v9, v9

    .line 78
    :goto_0
    int-to-double v2, v2

    .line 79
    sub-double/2addr v0, v2

    .line 80
    sub-double/2addr v9, v4

    .line 81
    mul-double/2addr v9, v0

    .line 82
    add-double/2addr v4, v9

    .line 83
    :goto_1
    div-double/2addr v4, v7

    .line 84
    iget-wide v0, p0, Lj4/g;->d:J

    .line 85
    .line 86
    long-to-double v0, v0

    .line 87
    mul-double/2addr v4, v0

    .line 88
    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    .line 89
    .line 90
    .line 91
    move-result-wide v6

    .line 92
    iget v0, p0, Lj4/g;->b:I

    .line 93
    .line 94
    int-to-long v8, v0

    .line 95
    iget-wide v0, p0, Lj4/g;->d:J

    .line 96
    .line 97
    const-wide/16 v2, 0x1

    .line 98
    .line 99
    sub-long v10, v0, v2

    .line 100
    .line 101
    invoke-static/range {v6 .. v11}, Lv5/e0;->j(JJJ)J

    .line 102
    .line 103
    .line 104
    move-result-wide v0

    .line 105
    new-instance v2, Lc4/t$a;

    .line 106
    .line 107
    new-instance v3, Lc4/u;

    .line 108
    .line 109
    iget-wide v4, p0, Lj4/g;->a:J

    .line 110
    .line 111
    add-long/2addr v4, v0

    .line 112
    invoke-direct {v3, p1, p2, v4, v5}, Lc4/u;-><init>(JJ)V

    .line 113
    .line 114
    .line 115
    invoke-direct {v2, v3, v3}, Lc4/t$a;-><init>(Lc4/u;Lc4/u;)V

    .line 116
    .line 117
    .line 118
    return-object v2
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

.method public final h()J
    .locals 2

    iget-wide v0, p0, Lj4/g;->c:J

    return-wide v0
.end method
