.class public final Lm4/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm4/x;


# instance fields
.field public a:Lv3/i0;

.field public b:Lv5/c0;

.field public c:Lc4/v;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lv3/i0$a;

    .line 5
    .line 6
    invoke-direct {v0}, Lv3/i0$a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, v0, Lv3/i0$a;->k:Ljava/lang/String;

    .line 10
    .line 11
    new-instance p1, Lv3/i0;

    .line 12
    .line 13
    invoke-direct {p1, v0}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lm4/s;->a:Lv3/i0;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
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
.end method


# virtual methods
.method public final a(Lv5/u;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lm4/s;->b:Lv5/c0;

    .line 2
    .line 3
    invoke-static {v0}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget v0, Lv5/e0;->a:I

    .line 7
    .line 8
    iget-object v0, p0, Lm4/s;->b:Lv5/c0;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-wide v1, v0, Lv5/c0;->c:J

    .line 12
    .line 13
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmp-long v5, v1, v3

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    iget-wide v5, v0, Lv5/c0;->b:J

    .line 23
    .line 24
    add-long/2addr v1, v5

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v0}, Lv5/c0;->c()J

    .line 27
    .line 28
    .line 29
    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 30
    :goto_0
    move-wide v6, v1

    .line 31
    monitor-exit v0

    .line 32
    iget-object v0, p0, Lm4/s;->b:Lv5/c0;

    .line 33
    .line 34
    monitor-enter v0

    .line 35
    :try_start_1
    iget-wide v1, v0, Lv5/c0;->b:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    monitor-exit v0

    .line 38
    cmp-long v0, v6, v3

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    cmp-long v0, v1, v3

    .line 43
    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    iget-object v0, p0, Lm4/s;->a:Lv3/i0;

    .line 48
    .line 49
    iget-wide v3, v0, Lv3/i0;->x:J

    .line 50
    .line 51
    cmp-long v3, v1, v3

    .line 52
    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    new-instance v3, Lv3/i0$a;

    .line 56
    .line 57
    invoke-direct {v3, v0}, Lv3/i0$a;-><init>(Lv3/i0;)V

    .line 58
    .line 59
    .line 60
    iput-wide v1, v3, Lv3/i0$a;->o:J

    .line 61
    .line 62
    new-instance v0, Lv3/i0;

    .line 63
    .line 64
    invoke-direct {v0, v3}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Lm4/s;->a:Lv3/i0;

    .line 68
    .line 69
    iget-object v1, p0, Lm4/s;->c:Lc4/v;

    .line 70
    .line 71
    invoke-interface {v1, v0}, Lc4/v;->d(Lv3/i0;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    iget v0, p1, Lv5/u;->c:I

    .line 75
    .line 76
    iget v1, p1, Lv5/u;->b:I

    .line 77
    .line 78
    sub-int v9, v0, v1

    .line 79
    .line 80
    iget-object v0, p0, Lm4/s;->c:Lc4/v;

    .line 81
    .line 82
    invoke-interface {v0, v9, p1}, Lc4/v;->b(ILv5/u;)V

    .line 83
    .line 84
    .line 85
    iget-object v5, p0, Lm4/s;->c:Lc4/v;

    .line 86
    .line 87
    const/4 v8, 0x1

    .line 88
    const/4 v10, 0x0

    .line 89
    const/4 v11, 0x0

    .line 90
    invoke-interface/range {v5 .. v11}, Lc4/v;->c(JIIILc4/v$a;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    :goto_1
    return-void

    .line 94
    :catchall_0
    move-exception p1

    .line 95
    monitor-exit v0

    .line 96
    throw p1

    .line 97
    :catchall_1
    move-exception p1

    .line 98
    monitor-exit v0

    .line 99
    throw p1
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

.method public final c(Lv5/c0;Lc4/j;Lm4/d0$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm4/s;->b:Lv5/c0;

    .line 2
    .line 3
    invoke-virtual {p3}, Lm4/d0$d;->a()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, Lm4/d0$d;->b()V

    .line 7
    .line 8
    .line 9
    iget p1, p3, Lm4/d0$d;->d:I

    .line 10
    .line 11
    const/4 p3, 0x5

    .line 12
    invoke-interface {p2, p1, p3}, Lc4/j;->r(II)Lc4/v;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lm4/s;->c:Lc4/v;

    .line 17
    .line 18
    iget-object p2, p0, Lm4/s;->a:Lv3/i0;

    .line 19
    .line 20
    invoke-interface {p1, p2}, Lc4/v;->d(Lv3/i0;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
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
