.class public final Lgb/y2$r;
.super Leb/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/y2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "r"
.end annotation


# instance fields
.field public final c:Lgb/y2$a0;

.field public d:J

.field public final synthetic e:Lgb/y2;


# direct methods
.method public constructor <init>(Lgb/y2;Lgb/y2$a0;)V
    .locals 0

    iput-object p1, p0, Lgb/y2$r;->e:Lgb/y2;

    invoke-direct {p0}, Leb/h;-><init>()V

    iput-object p2, p0, Lgb/y2$r;->c:Lgb/y2$a0;

    return-void
.end method


# virtual methods
.method public final n(J)V
    .locals 9

    .line 1
    iget-object v0, p0, Lgb/y2$r;->e:Lgb/y2;

    .line 2
    .line 3
    iget-object v0, v0, Lgb/y2;->o:Lgb/y2$y;

    .line 4
    .line 5
    iget-object v0, v0, Lgb/y2$y;->f:Lgb/y2$a0;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    iget-object v1, p0, Lgb/y2$r;->e:Lgb/y2;

    .line 12
    .line 13
    iget-object v1, v1, Lgb/y2;->i:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v1

    .line 16
    :try_start_0
    iget-object v2, p0, Lgb/y2$r;->e:Lgb/y2;

    .line 17
    .line 18
    iget-object v2, v2, Lgb/y2;->o:Lgb/y2$y;

    .line 19
    .line 20
    iget-object v2, v2, Lgb/y2$y;->f:Lgb/y2$a0;

    .line 21
    .line 22
    if-nez v2, :cond_7

    .line 23
    .line 24
    iget-object v2, p0, Lgb/y2$r;->c:Lgb/y2$a0;

    .line 25
    .line 26
    iget-boolean v3, v2, Lgb/y2$a0;->b:Z

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    iget-wide v3, p0, Lgb/y2$r;->d:J

    .line 32
    .line 33
    add-long/2addr v3, p1

    .line 34
    iput-wide v3, p0, Lgb/y2$r;->d:J

    .line 35
    .line 36
    iget-object p1, p0, Lgb/y2$r;->e:Lgb/y2;

    .line 37
    .line 38
    iget-wide v5, p1, Lgb/y2;->t:J

    .line 39
    .line 40
    cmp-long p2, v3, v5

    .line 41
    .line 42
    if-gtz p2, :cond_2

    .line 43
    .line 44
    monitor-exit v1

    .line 45
    return-void

    .line 46
    :cond_2
    iget-wide v7, p1, Lgb/y2;->k:J

    .line 47
    .line 48
    cmp-long p2, v3, v7

    .line 49
    .line 50
    const/4 v7, 0x1

    .line 51
    if-lez p2, :cond_3

    .line 52
    .line 53
    iput-boolean v7, v2, Lgb/y2$a0;->c:Z

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    iget-object p1, p1, Lgb/y2;->j:Lgb/y2$s;

    .line 57
    .line 58
    sub-long/2addr v3, v5

    .line 59
    iget-object p1, p1, Lgb/y2$s;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 60
    .line 61
    invoke-virtual {p1, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    .line 62
    .line 63
    .line 64
    move-result-wide p1

    .line 65
    iget-object v2, p0, Lgb/y2$r;->e:Lgb/y2;

    .line 66
    .line 67
    iget-wide v3, p0, Lgb/y2$r;->d:J

    .line 68
    .line 69
    iput-wide v3, v2, Lgb/y2;->t:J

    .line 70
    .line 71
    iget-wide v2, v2, Lgb/y2;->l:J

    .line 72
    .line 73
    cmp-long p1, p1, v2

    .line 74
    .line 75
    if-lez p1, :cond_4

    .line 76
    .line 77
    iget-object p1, p0, Lgb/y2$r;->c:Lgb/y2$a0;

    .line 78
    .line 79
    iput-boolean v7, p1, Lgb/y2$a0;->c:Z

    .line 80
    .line 81
    :cond_4
    :goto_0
    iget-object p1, p0, Lgb/y2$r;->c:Lgb/y2$a0;

    .line 82
    .line 83
    iget-boolean p2, p1, Lgb/y2$a0;->c:Z

    .line 84
    .line 85
    if-eqz p2, :cond_5

    .line 86
    .line 87
    iget-object p2, p0, Lgb/y2$r;->e:Lgb/y2;

    .line 88
    .line 89
    invoke-virtual {p2, p1}, Lgb/y2;->q(Lgb/y2$a0;)Lgb/z2;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    :cond_5
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    invoke-virtual {v0}, Lgb/z2;->run()V

    .line 97
    .line 98
    .line 99
    :cond_6
    return-void

    .line 100
    :cond_7
    :goto_1
    :try_start_1
    monitor-exit v1

    .line 101
    return-void

    .line 102
    :catchall_0
    move-exception p1

    .line 103
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    throw p1
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
