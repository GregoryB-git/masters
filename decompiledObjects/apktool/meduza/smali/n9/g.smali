.class public final Ln9/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ln9/a;

.field public final b:Ln9/a$c;

.field public final c:J

.field public final d:J

.field public e:J

.field public f:J

.field public g:J

.field public h:Ln9/a$a;


# direct methods
.method public constructor <init>(Ln9/a;Ln9/a$c;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln9/g;->a:Ln9/a;

    iput-object p2, p0, Ln9/g;->b:Ln9/a$c;

    iput-wide p3, p0, Ln9/g;->c:J

    iput-wide p5, p0, Ln9/g;->d:J

    iput-wide p5, p0, Ln9/g;->e:J

    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide p1

    iput-wide p1, p0, Ln9/g;->g:J

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Ln9/g;->f:J

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Runnable;)V
    .locals 10

    .line 1
    iget-object v0, p0, Ln9/g;->h:Ln9/a$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ln9/a$a;->a()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Ln9/g;->h:Ln9/a$a;

    .line 10
    .line 11
    :cond_0
    iget-wide v0, p0, Ln9/g;->f:J

    .line 12
    .line 13
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    .line 18
    .line 19
    sub-double/2addr v2, v4

    .line 20
    iget-wide v4, p0, Ln9/g;->f:J

    .line 21
    .line 22
    long-to-double v4, v4

    .line 23
    mul-double/2addr v2, v4

    .line 24
    double-to-long v2, v2

    .line 25
    add-long/2addr v0, v2

    .line 26
    new-instance v2, Ljava/util/Date;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    iget-wide v4, p0, Ln9/g;->g:J

    .line 36
    .line 37
    sub-long/2addr v2, v4

    .line 38
    const-wide/16 v4, 0x0

    .line 39
    .line 40
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    sub-long v6, v0, v2

    .line 45
    .line 46
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v6

    .line 50
    iget-wide v8, p0, Ln9/g;->f:J

    .line 51
    .line 52
    cmp-long v4, v8, v4

    .line 53
    .line 54
    if-lez v4, :cond_1

    .line 55
    .line 56
    const-class v4, Ln9/g;

    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    const/4 v5, 0x4

    .line 63
    new-array v5, v5, [Ljava/lang/Object;

    .line 64
    .line 65
    const/4 v8, 0x0

    .line 66
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    aput-object v9, v5, v8

    .line 71
    .line 72
    iget-wide v8, p0, Ln9/g;->f:J

    .line 73
    .line 74
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    const/4 v9, 0x1

    .line 79
    aput-object v8, v5, v9

    .line 80
    .line 81
    const/4 v8, 0x2

    .line 82
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    aput-object v0, v5, v8

    .line 87
    .line 88
    const/4 v0, 0x3

    .line 89
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    aput-object v1, v5, v0

    .line 94
    .line 95
    const-string v0, "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)"

    .line 96
    .line 97
    invoke-static {v9, v4, v0, v5}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_1
    iget-object v0, p0, Ln9/g;->a:Ln9/a;

    .line 101
    .line 102
    iget-object v1, p0, Ln9/g;->b:Ln9/a$c;

    .line 103
    .line 104
    new-instance v2, Lx0/f;

    .line 105
    .line 106
    const/16 v3, 0x15

    .line 107
    .line 108
    invoke-direct {v2, v3, p0, p1}, Lx0/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v1, v6, v7, v2}, Ln9/a;->b(Ln9/a$c;JLjava/lang/Runnable;)Ln9/a$a;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iput-object p1, p0, Ln9/g;->h:Ln9/a$a;

    .line 116
    .line 117
    iget-wide v0, p0, Ln9/g;->f:J

    .line 118
    .line 119
    long-to-double v0, v0

    .line 120
    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    .line 121
    .line 122
    mul-double/2addr v0, v2

    .line 123
    double-to-long v0, v0

    .line 124
    iput-wide v0, p0, Ln9/g;->f:J

    .line 125
    .line 126
    iget-wide v2, p0, Ln9/g;->c:J

    .line 127
    .line 128
    cmp-long p1, v0, v2

    .line 129
    .line 130
    if-gez p1, :cond_2

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_2
    iget-wide v2, p0, Ln9/g;->e:J

    .line 134
    .line 135
    cmp-long p1, v0, v2

    .line 136
    .line 137
    if-lez p1, :cond_3

    .line 138
    .line 139
    :goto_0
    iput-wide v2, p0, Ln9/g;->f:J

    .line 140
    .line 141
    :cond_3
    iget-wide v0, p0, Ln9/g;->d:J

    .line 142
    .line 143
    iput-wide v0, p0, Ln9/g;->e:J

    .line 144
    .line 145
    return-void
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
