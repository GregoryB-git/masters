.class public final Le7/t5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:J

.field public final c:Le7/s5;

.field public final synthetic d:Le7/q5;


# direct methods
.method public constructor <init>(Le7/q5;)V
    .locals 3

    .line 1
    iput-object p1, p0, Le7/t5;->d:Le7/q5;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Le7/s5;

    .line 7
    .line 8
    iget-object v1, p1, Ld2/q;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Le7/j2;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, p0, v1, v2}, Le7/s5;-><init>(Ljava/lang/Object;Le7/j2;I)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Le7/t5;->c:Le7/s5;

    .line 17
    .line 18
    invoke-virtual {p1}, Ld2/q;->zzb()Lv6/b;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lb/z;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    iput-wide v0, p0, Le7/t5;->a:J

    .line 32
    .line 33
    iput-wide v0, p0, Le7/t5;->b:J

    .line 34
    .line 35
    return-void
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
.method public final a(JZZ)Z
    .locals 4

    .line 1
    iget-object v0, p0, Le7/t5;->d:Le7/q5;

    .line 2
    .line 3
    invoke-virtual {v0}, Le7/o0;->l()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le7/t5;->d:Le7/q5;

    .line 7
    .line 8
    invoke-virtual {v0}, Le7/j0;->t()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Le7/t5;->d:Le7/q5;

    .line 12
    .line 13
    iget-object v0, v0, Ld2/q;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Le7/j2;

    .line 16
    .line 17
    invoke-virtual {v0}, Le7/j2;->d()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Le7/t5;->d:Le7/q5;

    .line 24
    .line 25
    invoke-virtual {v0}, Ld2/q;->j()Le7/l1;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v0, v0, Le7/l1;->z:Le7/q1;

    .line 30
    .line 31
    iget-object v1, p0, Le7/t5;->d:Le7/q5;

    .line 32
    .line 33
    invoke-virtual {v1}, Ld2/q;->zzb()Lv6/b;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lb/z;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 43
    .line 44
    .line 45
    move-result-wide v1

    .line 46
    invoke-virtual {v0, v1, v2}, Le7/q1;->b(J)V

    .line 47
    .line 48
    .line 49
    :cond_0
    iget-wide v0, p0, Le7/t5;->a:J

    .line 50
    .line 51
    sub-long v0, p1, v0

    .line 52
    .line 53
    if-nez p3, :cond_1

    .line 54
    .line 55
    const-wide/16 v2, 0x3e8

    .line 56
    .line 57
    cmp-long p3, v0, v2

    .line 58
    .line 59
    if-gez p3, :cond_1

    .line 60
    .line 61
    iget-object p1, p0, Le7/t5;->d:Le7/q5;

    .line 62
    .line 63
    invoke-virtual {p1}, Ld2/q;->zzj()Le7/a1;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iget-object p1, p1, Le7/a1;->w:Le7/b1;

    .line 68
    .line 69
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    const-string p3, "Screen exposed for less than 1000 ms. Event not sent. time"

    .line 74
    .line 75
    invoke-virtual {p1, p3, p2}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    const/4 p1, 0x0

    .line 79
    return p1

    .line 80
    :cond_1
    if-nez p4, :cond_2

    .line 81
    .line 82
    iget-wide v0, p0, Le7/t5;->b:J

    .line 83
    .line 84
    sub-long v0, p1, v0

    .line 85
    .line 86
    iput-wide p1, p0, Le7/t5;->b:J

    .line 87
    .line 88
    :cond_2
    iget-object p3, p0, Le7/t5;->d:Le7/q5;

    .line 89
    .line 90
    invoke-virtual {p3}, Ld2/q;->zzj()Le7/a1;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    iget-object p3, p3, Le7/a1;->w:Le7/b1;

    .line 95
    .line 96
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    const-string v3, "Recording user engagement, ms"

    .line 101
    .line 102
    invoke-virtual {p3, v3, v2}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    new-instance p3, Landroid/os/Bundle;

    .line 106
    .line 107
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 108
    .line 109
    .line 110
    const-string v2, "_et"

    .line 111
    .line 112
    invoke-virtual {p3, v2, v0, v1}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Le7/t5;->d:Le7/q5;

    .line 116
    .line 117
    invoke-virtual {v0}, Ld2/q;->h()Le7/h;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, Le7/h;->A()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    const/4 v1, 0x1

    .line 126
    xor-int/2addr v0, v1

    .line 127
    iget-object v2, p0, Le7/t5;->d:Le7/q5;

    .line 128
    .line 129
    invoke-virtual {v2}, Le7/o0;->p()Le7/s4;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v2, v0}, Le7/s4;->v(Z)Le7/q4;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-static {v0, p3, v1}, Le7/r6;->L(Le7/q4;Landroid/os/Bundle;Z)V

    .line 138
    .line 139
    .line 140
    if-nez p4, :cond_3

    .line 141
    .line 142
    iget-object p4, p0, Le7/t5;->d:Le7/q5;

    .line 143
    .line 144
    invoke-virtual {p4}, Le7/o0;->o()Le7/k3;

    .line 145
    .line 146
    .line 147
    move-result-object p4

    .line 148
    const-string v0, "auto"

    .line 149
    .line 150
    const-string v2, "_e"

    .line 151
    .line 152
    invoke-virtual {p4, v0, v2, p3}, Le7/k3;->Q(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 153
    .line 154
    .line 155
    :cond_3
    iput-wide p1, p0, Le7/t5;->a:J

    .line 156
    .line 157
    iget-object p1, p0, Le7/t5;->c:Le7/s5;

    .line 158
    .line 159
    invoke-virtual {p1}, Le7/v;->a()V

    .line 160
    .line 161
    .line 162
    iget-object p1, p0, Le7/t5;->c:Le7/s5;

    .line 163
    .line 164
    sget-object p2, Le7/h0;->l0:Le7/m0;

    .line 165
    .line 166
    const/4 p3, 0x0

    .line 167
    invoke-virtual {p2, p3}, Le7/m0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    check-cast p2, Ljava/lang/Long;

    .line 172
    .line 173
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 174
    .line 175
    .line 176
    move-result-wide p2

    .line 177
    invoke-virtual {p1, p2, p3}, Le7/v;->b(J)V

    .line 178
    .line 179
    .line 180
    return v1
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
