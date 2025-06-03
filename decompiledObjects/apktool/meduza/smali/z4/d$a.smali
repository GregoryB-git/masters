.class public final Lz4/d$a;
.super Lz4/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz4/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:Z


# direct methods
.method public constructor <init>(Lv3/r1;JJ)V
    .locals 7

    invoke-direct {p0, p1}, Lz4/l;-><init>(Lv3/r1;)V

    invoke-virtual {p1}, Lv3/r1;->h()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_9

    new-instance v0, Lv3/r1$c;

    invoke-direct {v0}, Lv3/r1$c;-><init>()V

    invoke-virtual {p1, v1, v0}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    move-result-object p1

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    iget-boolean v0, p1, Lv3/r1$c;->t:Z

    if-nez v0, :cond_1

    cmp-long v0, p2, v3

    if-eqz v0, :cond_1

    iget-boolean v0, p1, Lv3/r1$c;->p:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lz4/d$b;

    invoke-direct {p1, v2}, Lz4/d$b;-><init>(I)V

    throw p1

    :cond_1
    :goto_0
    const-wide/high16 v5, -0x8000000000000000L

    cmp-long v0, p4, v5

    if-nez v0, :cond_2

    iget-wide p4, p1, Lv3/r1$c;->v:J

    goto :goto_1

    :cond_2
    invoke-static {v3, v4, p4, p5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p4

    :goto_1
    iget-wide v3, p1, Lv3/r1$c;->v:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v3, v5

    if-eqz v0, :cond_5

    cmp-long v0, p4, v3

    if-lez v0, :cond_3

    move-wide p4, v3

    :cond_3
    cmp-long v0, p2, p4

    if-gtz v0, :cond_4

    goto :goto_2

    :cond_4
    new-instance p1, Lz4/d$b;

    const/4 p2, 0x2

    invoke-direct {p1, p2}, Lz4/d$b;-><init>(I)V

    throw p1

    :cond_5
    :goto_2
    iput-wide p2, p0, Lz4/d$a;->c:J

    iput-wide p4, p0, Lz4/d$a;->d:J

    cmp-long v0, p4, v5

    if-nez v0, :cond_6

    move-wide p2, v5

    goto :goto_3

    :cond_6
    sub-long p2, p4, p2

    :goto_3
    iput-wide p2, p0, Lz4/d$a;->e:J

    iget-boolean p1, p1, Lv3/r1$c;->q:Z

    if-eqz p1, :cond_8

    if-eqz v0, :cond_7

    cmp-long p1, v3, v5

    if-eqz p1, :cond_8

    cmp-long p1, p4, v3

    if-nez p1, :cond_8

    :cond_7
    move v1, v2

    :cond_8
    iput-boolean v1, p0, Lz4/d$a;->f:Z

    return-void

    :cond_9
    new-instance p1, Lz4/d$b;

    invoke-direct {p1, v1}, Lz4/d$b;-><init>(I)V

    throw p1
.end method


# virtual methods
.method public final f(ILv3/r1$b;Z)Lv3/r1$b;
    .locals 10

    .line 1
    iget-object v0, p0, Lz4/l;->b:Lv3/r1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, p2, p3}, Lv3/r1;->f(ILv3/r1$b;Z)Lv3/r1$b;

    .line 5
    .line 6
    .line 7
    iget-wide v0, p2, Lv3/r1$b;->e:J

    .line 8
    .line 9
    iget-wide v2, p0, Lz4/d$a;->c:J

    .line 10
    .line 11
    sub-long v6, v0, v2

    .line 12
    .line 13
    iget-wide v0, p0, Lz4/d$a;->e:J

    .line 14
    .line 15
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmp-long v4, v0, v2

    .line 21
    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    move-wide v4, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sub-long/2addr v0, v6

    .line 27
    move-wide v4, v0

    .line 28
    :goto_0
    iget-object v1, p2, Lv3/r1$b;->a:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v2, p2, Lv3/r1$b;->b:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v8, La5/a;->o:La5/a;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v9, 0x0

    .line 36
    move-object v0, p2

    .line 37
    invoke-virtual/range {v0 .. v9}, Lv3/r1$b;->h(Ljava/lang/Object;Ljava/lang/Object;IJJLa5/a;Z)V

    .line 38
    .line 39
    .line 40
    return-object p2
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
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method

.method public final n(ILv3/r1$c;J)Lv3/r1$c;
    .locals 4

    iget-object p1, p0, Lz4/l;->b:Lv3/r1;

    const/4 p3, 0x0

    const-wide/16 v0, 0x0

    invoke-virtual {p1, p3, p2, v0, v1}, Lv3/r1;->n(ILv3/r1$c;J)Lv3/r1$c;

    iget-wide p3, p2, Lv3/r1$c;->y:J

    iget-wide v0, p0, Lz4/d$a;->c:J

    add-long/2addr p3, v0

    iput-wide p3, p2, Lv3/r1$c;->y:J

    iget-wide p3, p0, Lz4/d$a;->e:J

    iput-wide p3, p2, Lv3/r1$c;->v:J

    iget-boolean p1, p0, Lz4/d$a;->f:Z

    iput-boolean p1, p2, Lv3/r1$c;->q:Z

    iget-wide p3, p2, Lv3/r1$c;->u:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p3, v2

    if-eqz p1, :cond_1

    invoke-static {p3, p4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p3

    iput-wide p3, p2, Lv3/r1$c;->u:J

    iget-wide v0, p0, Lz4/d$a;->d:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p3, p4, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p3

    :goto_0
    iget-wide v0, p0, Lz4/d$a;->c:J

    sub-long/2addr p3, v0

    iput-wide p3, p2, Lv3/r1$c;->u:J

    :cond_1
    iget-wide p3, p0, Lz4/d$a;->c:J

    invoke-static {p3, p4}, Lv5/e0;->R(J)J

    move-result-wide p3

    iget-wide v0, p2, Lv3/r1$c;->e:J

    cmp-long p1, v0, v2

    if-eqz p1, :cond_2

    add-long/2addr v0, p3

    iput-wide v0, p2, Lv3/r1$c;->e:J

    :cond_2
    iget-wide v0, p2, Lv3/r1$c;->f:J

    cmp-long p1, v0, v2

    if-eqz p1, :cond_3

    add-long/2addr v0, p3

    iput-wide v0, p2, Lv3/r1$c;->f:J

    :cond_3
    return-object p2
.end method
