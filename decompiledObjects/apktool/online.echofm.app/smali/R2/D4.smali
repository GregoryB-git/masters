.class public final LR2/D4;
.super LR2/f1;
.source "SourceFile"


# instance fields
.field public final c:LR2/a5;

.field public d:LR2/R1;

.field public volatile e:Ljava/lang/Boolean;

.field public final f:LR2/x;

.field public final g:LR2/w5;

.field public final h:Ljava/util/List;

.field public final i:LR2/x;


# direct methods
.method public constructor <init>(LR2/N2;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, LR2/f1;-><init>(LR2/N2;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LR2/D4;->h:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, LR2/w5;

    .line 12
    .line 13
    invoke-virtual {p1}, LR2/N2;->b()LE2/e;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, LR2/w5;-><init>(LE2/e;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, LR2/D4;->g:LR2/w5;

    .line 21
    .line 22
    new-instance v0, LR2/a5;

    .line 23
    .line 24
    invoke-direct {v0, p0}, LR2/a5;-><init>(LR2/D4;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, LR2/D4;->c:LR2/a5;

    .line 28
    .line 29
    new-instance v0, LR2/G4;

    .line 30
    .line 31
    invoke-direct {v0, p0, p1}, LR2/G4;-><init>(LR2/D4;LR2/o3;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, LR2/D4;->f:LR2/x;

    .line 35
    .line 36
    new-instance v0, LR2/P4;

    .line 37
    .line 38
    invoke-direct {v0, p0, p1}, LR2/P4;-><init>(LR2/D4;LR2/o3;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, LR2/D4;->i:LR2/x;

    .line 42
    .line 43
    return-void
.end method

.method public static bridge synthetic B(LR2/D4;)LR2/R1;
    .locals 0

    .line 1
    iget-object p0, p0, LR2/D4;->d:LR2/R1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static bridge synthetic H(LR2/D4;LR2/R1;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, LR2/D4;->d:LR2/R1;

    .line 3
    .line 4
    return-void
.end method

.method public static synthetic I(LR2/D4;Landroid/content/ComponentName;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LR2/D4;->d:LR2/R1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, LR2/D4;->d:LR2/R1;

    .line 10
    .line 11
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "Disconnected from device MeasurementService"

    .line 20
    .line 21
    invoke-virtual {v0, v1, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, LR2/D4;->Y()V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method private final P(Ljava/lang/Runnable;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/D4;->c0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, LR2/D4;->h:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    int-to-long v0, v0

    .line 21
    const-wide/16 v2, 0x3e8

    .line 22
    .line 23
    cmp-long v0, v0, v2

    .line 24
    .line 25
    if-ltz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string v0, "Discarding data. Max runnable queue size reached"

    .line 36
    .line 37
    invoke-virtual {p1, v0}, LR2/a2;->a(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    iget-object v0, p0, LR2/D4;->h:Ljava/util/List;

    .line 42
    .line 43
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, LR2/D4;->i:LR2/x;

    .line 47
    .line 48
    const-wide/32 v0, 0xea60

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0, v1}, LR2/x;->b(J)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, LR2/D4;->Y()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method private final f0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, LR2/D4;->h:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "Processing queued up service tasks"

    .line 23
    .line 24
    invoke-virtual {v0, v2, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, LR2/D4;->h:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ljava/lang/Runnable;

    .line 44
    .line 45
    :try_start_0
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catch_0
    move-exception v1

    .line 50
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    const-string v3, "Task exception while flushing queue"

    .line 59
    .line 60
    invoke-virtual {v2, v3, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    iget-object v0, p0, LR2/D4;->h:Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, LR2/D4;->i:LR2/x;

    .line 70
    .line 71
    invoke-virtual {v0}, LR2/x;->a()V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method private final g0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LR2/D4;->g:LR2/w5;

    .line 5
    .line 6
    invoke-virtual {v0}, LR2/w5;->c()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LR2/D4;->f:LR2/x;

    .line 10
    .line 11
    sget-object v1, LR2/K;->L:LR2/P1;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v1, v2}, LR2/P1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/Long;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    invoke-virtual {v0, v1, v2}, LR2/x;->b(J)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private final h0()Z
    .locals 6

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LR2/D4;->e:Ljava/lang/Boolean;

    .line 8
    .line 9
    if-nez v0, :cond_c

    .line 10
    .line 11
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, LR2/l2;->K()Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x1

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    goto/16 :goto_6

    .line 35
    .line 36
    :cond_0
    invoke-virtual {p0}, LR2/G1;->p()LR2/S1;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, LR2/S1;->C()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-ne v2, v1, :cond_1

    .line 45
    .line 46
    :goto_0
    move v3, v1

    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_1
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v2}, LR2/Y1;->K()LR2/a2;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const-string v3, "Checking service availability"

    .line 58
    .line 59
    invoke-virtual {v2, v3}, LR2/a2;->a(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    const v3, 0xbdfcb8

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v3}, LR2/S5;->u(I)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_9

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    if-eq v2, v1, :cond_8

    .line 77
    .line 78
    const/4 v4, 0x2

    .line 79
    if-eq v2, v4, :cond_6

    .line 80
    .line 81
    const/4 v0, 0x3

    .line 82
    if-eq v2, v0, :cond_5

    .line 83
    .line 84
    const/16 v0, 0x9

    .line 85
    .line 86
    if-eq v2, v0, :cond_4

    .line 87
    .line 88
    const/16 v0, 0x12

    .line 89
    .line 90
    if-eq v2, v0, :cond_3

    .line 91
    .line 92
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0}, LR2/Y1;->L()LR2/a2;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    const-string v2, "Unexpected service status"

    .line 105
    .line 106
    invoke-virtual {v0, v2, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_2
    :goto_1
    move v1, v3

    .line 110
    goto :goto_5

    .line 111
    :cond_3
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0}, LR2/Y1;->L()LR2/a2;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    const-string v2, "Service updating"

    .line 120
    .line 121
    :goto_2
    invoke-virtual {v0, v2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_4
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, LR2/Y1;->L()LR2/a2;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    const-string v1, "Service invalid"

    .line 134
    .line 135
    :goto_3
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_5
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0}, LR2/Y1;->L()LR2/a2;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    const-string v1, "Service disabled"

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_6
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v2}, LR2/Y1;->F()LR2/a2;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    const-string v4, "Service container out of date"

    .line 159
    .line 160
    invoke-virtual {v2, v4}, LR2/a2;->a(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {v2}, LR2/S5;->G0()I

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    const/16 v4, 0x4423

    .line 172
    .line 173
    if-ge v2, v4, :cond_7

    .line 174
    .line 175
    :goto_4
    move v5, v3

    .line 176
    move v3, v1

    .line 177
    move v1, v5

    .line 178
    goto :goto_5

    .line 179
    :cond_7
    if-nez v0, :cond_2

    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_8
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    const-string v2, "Service missing"

    .line 191
    .line 192
    invoke-virtual {v0, v2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_9
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    const-string v2, "Service available"

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :goto_5
    if-nez v1, :cond_a

    .line 208
    .line 209
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0}, LR2/g;->S()Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-eqz v0, :cond_a

    .line 218
    .line 219
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    const-string v2, "No way to upload. Consider using the full version of Analytics"

    .line 228
    .line 229
    invoke-virtual {v0, v2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_a
    if-eqz v3, :cond_b

    .line 234
    .line 235
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-virtual {v0, v1}, LR2/l2;->w(Z)V

    .line 240
    .line 241
    .line 242
    :cond_b
    :goto_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    iput-object v0, p0, LR2/D4;->e:Ljava/lang/Boolean;

    .line 247
    .line 248
    :cond_c
    iget-object v0, p0, LR2/D4;->e:Ljava/lang/Boolean;

    .line 249
    .line 250
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    return v0
.end method

.method public static bridge synthetic i0(LR2/D4;)LR2/a5;
    .locals 0

    .line 1
    iget-object p0, p0, LR2/D4;->c:LR2/a5;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic k0(LR2/D4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LR2/D4;->f0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic l0(LR2/D4;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/D4;->c0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "Inactivity, disconnecting from the service"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, LR2/D4;->Z()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public static synthetic m0(LR2/D4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LR2/D4;->g0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final C(LR2/e;)V
    .locals 8

    .line 1
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LR2/G1;->q()LR2/V1;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, LR2/V1;->E(LR2/e;)Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    new-instance v6, LR2/e;

    .line 19
    .line 20
    invoke-direct {v6, p1}, LR2/e;-><init>(LR2/e;)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p0, v0}, LR2/D4;->j0(Z)LR2/W5;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    new-instance v0, LR2/W4;

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    move-object v1, v0

    .line 32
    move-object v2, p0

    .line 33
    move-object v7, p1

    .line 34
    invoke-direct/range {v1 .. v7}, LR2/W4;-><init>(LR2/D4;ZLR2/W5;ZLR2/e;LR2/e;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v0}, LR2/D4;->P(Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final D(LR2/I;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LR2/G1;->q()LR2/V1;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, LR2/V1;->F(LR2/I;)Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-virtual {p0, v0}, LR2/D4;->j0(Z)LR2/W5;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    new-instance v0, LR2/T4;

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    move-object v1, v0

    .line 27
    move-object v2, p0

    .line 28
    move-object v6, p1

    .line 29
    move-object v7, p2

    .line 30
    invoke-direct/range {v1 .. v7}, LR2/T4;-><init>(LR2/D4;ZLR2/W5;ZLR2/I;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0, v0}, LR2/D4;->P(Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final E(LR2/R1;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, LR2/D4;->d:LR2/R1;

    .line 8
    .line 9
    invoke-direct {p0}, LR2/D4;->g0()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, LR2/D4;->f0()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final F(LR2/R1;LB2/a;LR2/W5;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    const/16 v0, 0x64

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    move v3, v0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    const/16 v4, 0x3e9

    .line 13
    .line 14
    if-ge v2, v4, :cond_6

    .line 15
    .line 16
    if-ne v3, v0, :cond_6

    .line 17
    .line 18
    new-instance v3, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, LR2/G1;->q()LR2/V1;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4, v0}, LR2/V1;->C(I)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-interface {v3, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 34
    .line 35
    .line 36
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    move v4, v1

    .line 42
    :goto_1
    if-eqz p2, :cond_1

    .line 43
    .line 44
    if-ge v4, v0, :cond_1

    .line 45
    .line 46
    invoke-interface {v3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    move v6, v1

    .line 54
    :goto_2
    if-ge v6, v5, :cond_5

    .line 55
    .line 56
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    add-int/lit8 v6, v6, 0x1

    .line 61
    .line 62
    check-cast v7, LB2/a;

    .line 63
    .line 64
    instance-of v8, v7, LR2/I;

    .line 65
    .line 66
    if-eqz v8, :cond_2

    .line 67
    .line 68
    :try_start_0
    check-cast v7, LR2/I;

    .line 69
    .line 70
    invoke-interface {p1, v7, p3}, LR2/R1;->R0(LR2/I;LR2/W5;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :catch_0
    move-exception v7

    .line 75
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    invoke-virtual {v8}, LR2/Y1;->G()LR2/a2;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    const-string v9, "Failed to send event to the service"

    .line 84
    .line 85
    :goto_3
    invoke-virtual {v8, v9, v7}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    instance-of v8, v7, LR2/R5;

    .line 90
    .line 91
    if-eqz v8, :cond_3

    .line 92
    .line 93
    :try_start_1
    check-cast v7, LR2/R5;

    .line 94
    .line 95
    invoke-interface {p1, v7, p3}, LR2/R1;->Z(LR2/R5;LR2/W5;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :catch_1
    move-exception v7

    .line 100
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    invoke-virtual {v8}, LR2/Y1;->G()LR2/a2;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    const-string v9, "Failed to send user property to the service"

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_3
    instance-of v8, v7, LR2/e;

    .line 112
    .line 113
    if-eqz v8, :cond_4

    .line 114
    .line 115
    :try_start_2
    check-cast v7, LR2/e;

    .line 116
    .line 117
    invoke-interface {p1, v7, p3}, LR2/R1;->m0(LR2/e;LR2/W5;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :catch_2
    move-exception v7

    .line 122
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    invoke-virtual {v8}, LR2/Y1;->G()LR2/a2;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    const-string v9, "Failed to send conditional user property to the service"

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_4
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    invoke-virtual {v7}, LR2/Y1;->G()LR2/a2;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    const-string v8, "Discarding data. Unrecognized parcel type."

    .line 142
    .line 143
    invoke-virtual {v7, v8}, LR2/a2;->a(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 148
    .line 149
    move v3, v4

    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :cond_6
    return-void
.end method

.method public final G(LR2/w4;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    new-instance v0, LR2/M4;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, LR2/M4;-><init>(LR2/D4;LR2/w4;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0}, LR2/D4;->P(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final J(LR2/R5;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/G1;->q()LR2/V1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, LR2/V1;->G(LR2/R5;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {p0, v1}, LR2/D4;->j0(Z)LR2/W5;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, LR2/J4;

    .line 21
    .line 22
    invoke-direct {v2, p0, v1, v0, p1}, LR2/J4;-><init>(LR2/D4;LR2/W5;ZLR2/R5;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v2}, LR2/D4;->P(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final K(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, LR2/D4;->j0(Z)LR2/W5;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, LR2/Q4;

    .line 13
    .line 14
    invoke-direct {v1, p0, v0, p1}, LR2/Q4;-><init>(LR2/D4;LR2/W5;Landroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v1}, LR2/D4;->P(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final L(Lcom/google/android/gms/internal/measurement/y0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, LR2/D4;->j0(Z)LR2/W5;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, LR2/K4;

    .line 13
    .line 14
    invoke-direct {v1, p0, v0, p1}, LR2/K4;-><init>(LR2/D4;LR2/W5;Lcom/google/android/gms/internal/measurement/y0;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v1}, LR2/D4;->P(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final M(Lcom/google/android/gms/internal/measurement/y0;LR2/I;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0xbdfcb8

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, LR2/S5;->u(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p2}, LR2/Y1;->L()LR2/a2;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const-string p3, "Not bundling data. Service unavailable or out of date"

    .line 29
    .line 30
    invoke-virtual {p2, p3}, LR2/a2;->a(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    const/4 p3, 0x0

    .line 38
    new-array p3, p3, [B

    .line 39
    .line 40
    invoke-virtual {p2, p1, p3}, LR2/S5;->Y(Lcom/google/android/gms/internal/measurement/y0;[B)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    new-instance v0, LR2/S4;

    .line 45
    .line 46
    invoke-direct {v0, p0, p2, p3, p1}, LR2/S4;-><init>(LR2/D4;LR2/I;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/y0;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, v0}, LR2/D4;->P(Ljava/lang/Runnable;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final N(Lcom/google/android/gms/internal/measurement/y0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, LR2/D4;->j0(Z)LR2/W5;

    .line 9
    .line 10
    .line 11
    move-result-object v5

    .line 12
    new-instance v0, LR2/Y4;

    .line 13
    .line 14
    move-object v1, v0

    .line 15
    move-object v2, p0

    .line 16
    move-object v3, p2

    .line 17
    move-object v4, p3

    .line 18
    move-object v6, p1

    .line 19
    invoke-direct/range {v1 .. v6}, LR2/Y4;-><init>(LR2/D4;Ljava/lang/String;Ljava/lang/String;LR2/W5;Lcom/google/android/gms/internal/measurement/y0;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0}, LR2/D4;->P(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final O(Lcom/google/android/gms/internal/measurement/y0;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 8

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, LR2/D4;->j0(Z)LR2/W5;

    .line 9
    .line 10
    .line 11
    move-result-object v5

    .line 12
    new-instance v0, LR2/F4;

    .line 13
    .line 14
    move-object v1, v0

    .line 15
    move-object v2, p0

    .line 16
    move-object v3, p2

    .line 17
    move-object v4, p3

    .line 18
    move v6, p4

    .line 19
    move-object v7, p1

    .line 20
    invoke-direct/range {v1 .. v7}, LR2/F4;-><init>(LR2/D4;Ljava/lang/String;Ljava/lang/String;LR2/W5;ZLcom/google/android/gms/internal/measurement/y0;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, LR2/D4;->P(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final Q(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, LR2/D4;->j0(Z)LR2/W5;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, LR2/L4;

    .line 13
    .line 14
    invoke-direct {v1, p0, p1, v0}, LR2/L4;-><init>(LR2/D4;Ljava/util/concurrent/atomic/AtomicReference;LR2/W5;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v1}, LR2/D4;->P(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final R(Ljava/util/concurrent/atomic/AtomicReference;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, LR2/D4;->j0(Z)LR2/W5;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, LR2/H4;

    .line 13
    .line 14
    invoke-direct {v1, p0, p1, v0, p2}, LR2/H4;-><init>(LR2/D4;Ljava/util/concurrent/atomic/AtomicReference;LR2/W5;Landroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v1}, LR2/D4;->P(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final S(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, LR2/D4;->j0(Z)LR2/W5;

    .line 9
    .line 10
    .line 11
    move-result-object v7

    .line 12
    new-instance v0, LR2/V4;

    .line 13
    .line 14
    move-object v1, v0

    .line 15
    move-object v2, p0

    .line 16
    move-object v3, p1

    .line 17
    move-object v4, p2

    .line 18
    move-object v5, p3

    .line 19
    move-object v6, p4

    .line 20
    invoke-direct/range {v1 .. v7}, LR2/V4;-><init>(LR2/D4;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LR2/W5;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, LR2/D4;->P(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final T(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 9

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, LR2/D4;->j0(Z)LR2/W5;

    .line 9
    .line 10
    .line 11
    move-result-object v7

    .line 12
    new-instance v0, LR2/X4;

    .line 13
    .line 14
    move-object v1, v0

    .line 15
    move-object v2, p0

    .line 16
    move-object v3, p1

    .line 17
    move-object v4, p2

    .line 18
    move-object v5, p3

    .line 19
    move-object v6, p4

    .line 20
    move v8, p5

    .line 21
    invoke-direct/range {v1 .. v8}, LR2/X4;-><init>(LR2/D4;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LR2/W5;Z)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, v0}, LR2/D4;->P(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final U(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, LR2/G1;->q()LR2/V1;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, LR2/V1;->H()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, LR2/D4;->e0()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p1}, LR2/D4;->j0(Z)LR2/W5;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-instance v0, LR2/U4;

    .line 28
    .line 29
    invoke-direct {v0, p0, p1}, LR2/U4;-><init>(LR2/D4;LR2/W5;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0}, LR2/D4;->P(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method public final V()LR2/n;
    .locals 4

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LR2/D4;->d:LR2/R1;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, LR2/D4;->Y()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v2, "Failed to get consents; not connected to service yet."

    .line 24
    .line 25
    invoke-virtual {v0, v2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_0
    const/4 v2, 0x0

    .line 30
    invoke-virtual {p0, v2}, LR2/D4;->j0(Z)LR2/W5;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    :try_start_0
    invoke-interface {v0, v2}, LR2/R1;->P0(LR2/W5;)LR2/n;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-direct {p0}, LR2/D4;->g0()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :catch_0
    move-exception v0

    .line 46
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const-string v3, "Failed to get consents; remote exception"

    .line 55
    .line 56
    invoke-virtual {v2, v3, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-object v1
.end method

.method public final W()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/D4;->e:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final X()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v0}, LR2/D4;->j0(Z)LR2/W5;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, LR2/G1;->q()LR2/V1;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, LR2/V1;->I()Z

    .line 17
    .line 18
    .line 19
    new-instance v1, LR2/O4;

    .line 20
    .line 21
    invoke-direct {v1, p0, v0}, LR2/O4;-><init>(LR2/D4;LR2/W5;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, v1}, LR2/D4;->P(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final Y()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/D4;->c0()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-direct {p0}, LR2/D4;->h0()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, LR2/D4;->c:LR2/a5;

    .line 21
    .line 22
    invoke-virtual {v0}, LR2/a5;->a()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, LR2/g;->S()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, Landroid/content/Intent;

    .line 45
    .line 46
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const-string v3, "com.google.android.gms.measurement.AppMeasurementService"

    .line 54
    .line 55
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const/high16 v2, 0x10000

    .line 60
    .line 61
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_2

    .line 72
    .line 73
    new-instance v0, Landroid/content/Intent;

    .line 74
    .line 75
    const-string v1, "com.google.android.gms.measurement.START"

    .line 76
    .line 77
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    new-instance v1, Landroid/content/ComponentName;

    .line 81
    .line 82
    invoke-virtual {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, LR2/D4;->c:LR2/a5;

    .line 93
    .line 94
    invoke-virtual {v1, v0}, LR2/a5;->c(Landroid/content/Intent;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_2
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const-string v1, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"

    .line 107
    .line 108
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :cond_3
    return-void
.end method

.method public final Z()V
    .locals 3

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LR2/D4;->c:LR2/a5;

    .line 8
    .line 9
    invoke-virtual {v0}, LR2/a5;->d()V

    .line 10
    .line 11
    .line 12
    :try_start_0
    invoke-static {}, LD2/b;->b()LD2/b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, LR2/D4;->c:LR2/a5;

    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, LD2/b;->c(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    :catch_0
    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, LR2/D4;->d:LR2/R1;

    .line 27
    .line 28
    return-void
.end method

.method public final bridge synthetic a()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final a0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, LR2/D4;->j0(Z)LR2/W5;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, LR2/G1;->q()LR2/V1;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, LR2/V1;->H()V

    .line 17
    .line 18
    .line 19
    new-instance v1, LR2/I4;

    .line 20
    .line 21
    invoke-direct {v1, p0, v0}, LR2/I4;-><init>(LR2/D4;LR2/W5;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, v1}, LR2/D4;->P(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final bridge synthetic b()LE2/e;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->b()LE2/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final b0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v0}, LR2/D4;->j0(Z)LR2/W5;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, LR2/R4;

    .line 13
    .line 14
    invoke-direct {v1, p0, v0}, LR2/R4;-><init>(LR2/D4;LR2/W5;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v1}, LR2/D4;->P(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final c0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LR2/D4;->d:LR2/R1;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final bridge synthetic d()LR2/f;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->d()LR2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final d0()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, LR2/D4;->h0()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, LR2/S5;->G0()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const v2, 0x310c4

    .line 24
    .line 25
    .line 26
    if-lt v0, v2, :cond_1

    .line 27
    .line 28
    return v1

    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    return v0
.end method

.method public final bridge synthetic e()LR2/G2;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final e0()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, LR2/D4;->h0()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, LR2/S5;->G0()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sget-object v2, LR2/K;->r0:LR2/P1;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v2, v3}, LR2/P1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-lt v0, v2, :cond_1

    .line 37
    .line 38
    return v1

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    return v0
.end method

.method public final bridge synthetic f()LR2/g;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->f()LR2/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic g()LR2/C;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->g()LR2/C;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic h()LR2/X1;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->h()LR2/X1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic i()LR2/l2;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->i()LR2/l2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic j()LR2/Y1;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->j()LR2/Y1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final j0(Z)LR2/W5;
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/G1;->p()LR2/S1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, LR2/Y1;->O()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    invoke-virtual {v0, p1}, LR2/S1;->B(Ljava/lang/String;)LR2/W5;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public final bridge synthetic k()LR2/S5;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->k()LR2/S5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic l()V
    .locals 0

    .line 1
    invoke-super {p0}, LR2/G1;->l()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final bridge synthetic m()V
    .locals 0

    .line 1
    invoke-super {p0}, LR2/G1;->m()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final bridge synthetic n()V
    .locals 0

    .line 1
    invoke-super {p0}, LR2/G1;->n()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final bridge synthetic o()LR2/B;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->o()LR2/B;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic p()LR2/S1;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->p()LR2/S1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic q()LR2/V1;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->q()LR2/V1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic r()LR2/C3;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->r()LR2/C3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic s()LR2/v4;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->s()LR2/v4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic t()LR2/D4;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->t()LR2/D4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final bridge synthetic u()LR2/l5;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->u()LR2/l5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
