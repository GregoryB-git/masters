.class public final Lw5/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw5/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:J

.field public d:J

.field public e:J

.field public f:J

.field public final g:[Z

.field public h:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xf

    new-array v0, v0, [Z

    iput-object v0, p0, Lw5/d$a;->g:[Z

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    iget-wide v0, p0, Lw5/d$a;->d:J

    const-wide/16 v2, 0xf

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget v0, p0, Lw5/d$a;->h:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final b(J)V
    .locals 9

    .line 1
    iget-wide v0, p0, Lw5/d$a;->d:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    const-wide/16 v3, 0x1

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    iput-wide p1, p0, Lw5/d$a;->a:J

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    cmp-long v2, v0, v3

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    iget-wide v0, p0, Lw5/d$a;->a:J

    .line 19
    .line 20
    sub-long v0, p1, v0

    .line 21
    .line 22
    iput-wide v0, p0, Lw5/d$a;->b:J

    .line 23
    .line 24
    iput-wide v0, p0, Lw5/d$a;->f:J

    .line 25
    .line 26
    iput-wide v3, p0, Lw5/d$a;->e:J

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    iget-wide v5, p0, Lw5/d$a;->c:J

    .line 30
    .line 31
    sub-long v5, p1, v5

    .line 32
    .line 33
    const-wide/16 v7, 0xf

    .line 34
    .line 35
    rem-long/2addr v0, v7

    .line 36
    long-to-int v0, v0

    .line 37
    iget-wide v1, p0, Lw5/d$a;->b:J

    .line 38
    .line 39
    sub-long v1, v5, v1

    .line 40
    .line 41
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    const-wide/32 v7, 0xf4240

    .line 46
    .line 47
    .line 48
    cmp-long v1, v1, v7

    .line 49
    .line 50
    const/4 v2, 0x1

    .line 51
    if-gtz v1, :cond_2

    .line 52
    .line 53
    iget-wide v7, p0, Lw5/d$a;->e:J

    .line 54
    .line 55
    add-long/2addr v7, v3

    .line 56
    iput-wide v7, p0, Lw5/d$a;->e:J

    .line 57
    .line 58
    iget-wide v7, p0, Lw5/d$a;->f:J

    .line 59
    .line 60
    add-long/2addr v7, v5

    .line 61
    iput-wide v7, p0, Lw5/d$a;->f:J

    .line 62
    .line 63
    iget-object v1, p0, Lw5/d$a;->g:[Z

    .line 64
    .line 65
    aget-boolean v5, v1, v0

    .line 66
    .line 67
    if-eqz v5, :cond_3

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    aput-boolean v5, v1, v0

    .line 71
    .line 72
    iget v0, p0, Lw5/d$a;->h:I

    .line 73
    .line 74
    sub-int/2addr v0, v2

    .line 75
    goto :goto_0

    .line 76
    :cond_2
    iget-object v1, p0, Lw5/d$a;->g:[Z

    .line 77
    .line 78
    aget-boolean v5, v1, v0

    .line 79
    .line 80
    if-nez v5, :cond_3

    .line 81
    .line 82
    aput-boolean v2, v1, v0

    .line 83
    .line 84
    iget v0, p0, Lw5/d$a;->h:I

    .line 85
    .line 86
    add-int/2addr v0, v2

    .line 87
    :goto_0
    iput v0, p0, Lw5/d$a;->h:I

    .line 88
    .line 89
    :cond_3
    :goto_1
    iget-wide v0, p0, Lw5/d$a;->d:J

    .line 90
    .line 91
    add-long/2addr v0, v3

    .line 92
    iput-wide v0, p0, Lw5/d$a;->d:J

    .line 93
    .line 94
    iput-wide p1, p0, Lw5/d$a;->c:J

    .line 95
    .line 96
    return-void
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

.method public final c()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lw5/d$a;->d:J

    iput-wide v0, p0, Lw5/d$a;->e:J

    iput-wide v0, p0, Lw5/d$a;->f:J

    const/4 v0, 0x0

    iput v0, p0, Lw5/d$a;->h:I

    iget-object v1, p0, Lw5/d$a;->g:[Z

    invoke-static {v1, v0}, Ljava/util/Arrays;->fill([ZZ)V

    return-void
.end method
