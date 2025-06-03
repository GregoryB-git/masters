.class public final synthetic Lt5/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv5/s$a;


# instance fields
.field public final synthetic a:Lt5/q;


# direct methods
.method public synthetic constructor <init>(Lt5/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt5/p;->a:Lt5/q;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 10

    .line 1
    iget-object v6, p0, Lt5/p;->a:Lt5/q;

    .line 2
    .line 3
    monitor-enter v6

    .line 4
    :try_start_0
    iget v0, v6, Lt5/q;->i:I

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-boolean v1, v6, Lt5/q;->e:Z

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    if-ne v0, p1, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    iput p1, v6, Lt5/q;->i:I

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    if-eq p1, v0, :cond_4

    .line 20
    .line 21
    if-eqz p1, :cond_4

    .line 22
    .line 23
    const/16 v0, 0x8

    .line 24
    .line 25
    if-ne p1, v0, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    invoke-virtual {v6, p1}, Lt5/q;->k(I)J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    iput-wide v0, v6, Lt5/q;->l:J

    .line 33
    .line 34
    iget-object p1, v6, Lt5/q;->d:Lv5/c;

    .line 35
    .line 36
    invoke-interface {p1}, Lv5/c;->d()J

    .line 37
    .line 38
    .line 39
    move-result-wide v7

    .line 40
    iget p1, v6, Lt5/q;->f:I

    .line 41
    .line 42
    const/4 v9, 0x0

    .line 43
    if-lez p1, :cond_3

    .line 44
    .line 45
    iget-wide v0, v6, Lt5/q;->g:J

    .line 46
    .line 47
    sub-long v0, v7, v0

    .line 48
    .line 49
    long-to-int p1, v0

    .line 50
    move v1, p1

    .line 51
    goto :goto_0

    .line 52
    :cond_3
    move v1, v9

    .line 53
    :goto_0
    iget-wide v2, v6, Lt5/q;->h:J

    .line 54
    .line 55
    iget-wide v4, v6, Lt5/q;->l:J

    .line 56
    .line 57
    move-object v0, v6

    .line 58
    invoke-virtual/range {v0 .. v5}, Lt5/q;->l(IJJ)V

    .line 59
    .line 60
    .line 61
    iput-wide v7, v6, Lt5/q;->g:J

    .line 62
    .line 63
    const-wide/16 v0, 0x0

    .line 64
    .line 65
    iput-wide v0, v6, Lt5/q;->h:J

    .line 66
    .line 67
    iput-wide v0, v6, Lt5/q;->k:J

    .line 68
    .line 69
    iput-wide v0, v6, Lt5/q;->j:J

    .line 70
    .line 71
    iget-object p1, v6, Lt5/q;->c:Lt5/i0;

    .line 72
    .line 73
    iget-object v0, p1, Lt5/i0;->b:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 76
    .line 77
    .line 78
    const/4 v0, -0x1

    .line 79
    iput v0, p1, Lt5/i0;->d:I

    .line 80
    .line 81
    iput v9, p1, Lt5/i0;->e:I

    .line 82
    .line 83
    iput v9, p1, Lt5/i0;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    :cond_4
    :goto_1
    monitor-exit v6

    .line 86
    return-void

    .line 87
    :catchall_0
    move-exception p1

    .line 88
    monitor-exit v6

    .line 89
    throw p1
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
