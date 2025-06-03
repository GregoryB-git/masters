.class public final Lpa/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/f1$c;


# instance fields
.field public final synthetic a:Lpa/b;


# direct methods
.method public constructor <init>(Lpa/b;)V
    .locals 0

    iput-object p1, p0, Lpa/e;->a:Lpa/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic D(Z)V
    .locals 0

    return-void
.end method

.method public final synthetic F(Lv3/f1$a;)V
    .locals 0

    return-void
.end method

.method public final synthetic G(ILv3/f1$d;Lv3/f1$d;)V
    .locals 0

    return-void
.end method

.method public final synthetic I(Z)V
    .locals 0

    return-void
.end method

.method public final synthetic K(IZ)V
    .locals 0

    return-void
.end method

.method public final synthetic L(F)V
    .locals 0

    return-void
.end method

.method public final N(I)V
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const-string v2, "event"

    .line 4
    .line 5
    if-eq p1, v0, :cond_f

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    const-string v3, "key"

    .line 9
    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x4

    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_a

    .line 16
    .line 17
    :cond_0
    new-instance p1, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v0, "completed"

    .line 23
    .line 24
    invoke-virtual {p1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lpa/e;->a:Lpa/b;

    .line 28
    .line 29
    iget-object v0, v0, Lpa/b;->h:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    goto/16 :goto_9

    .line 35
    .line 36
    :cond_1
    iget-object p1, p0, Lpa/e;->a:Lpa/b;

    .line 37
    .line 38
    iget-boolean v0, p1, Lpa/b;->f:Z

    .line 39
    .line 40
    if-nez v0, :cond_e

    .line 41
    .line 42
    iput-boolean v1, p1, Lpa/b;->f:Z

    .line 43
    .line 44
    new-instance v0, Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v1, "initialized"

    .line 50
    .line 51
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    iget-object v1, p1, Lpa/b;->h:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    iget-object v1, p1, Lpa/b;->c:Lv3/d0;

    .line 60
    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    invoke-virtual {v1}, Lv3/d0;->getDuration()J

    .line 64
    .line 65
    .line 66
    move-result-wide v3

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const-wide/16 v3, 0x0

    .line 69
    .line 70
    :goto_0
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const-string v3, "duration"

    .line 75
    .line 76
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    iget-object v1, p1, Lpa/b;->c:Lv3/d0;

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    if-eqz v1, :cond_3

    .line 83
    .line 84
    invoke-virtual {v1}, Lv3/d0;->u0()V

    .line 85
    .line 86
    .line 87
    iget-object v1, v1, Lv3/d0;->P:Lv3/i0;

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    move-object v1, v3

    .line 91
    :goto_1
    if-eqz v1, :cond_d

    .line 92
    .line 93
    iget-object v1, p1, Lpa/b;->c:Lv3/d0;

    .line 94
    .line 95
    invoke-virtual {v1}, Lv3/d0;->u0()V

    .line 96
    .line 97
    .line 98
    iget-object v1, v1, Lv3/d0;->P:Lv3/i0;

    .line 99
    .line 100
    if-eqz v1, :cond_4

    .line 101
    .line 102
    iget v4, v1, Lv3/i0;->y:I

    .line 103
    .line 104
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    goto :goto_2

    .line 109
    :cond_4
    move-object v4, v3

    .line 110
    :goto_2
    if-eqz v1, :cond_5

    .line 111
    .line 112
    iget v5, v1, Lv3/i0;->z:I

    .line 113
    .line 114
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    goto :goto_3

    .line 119
    :cond_5
    move-object v5, v3

    .line 120
    :goto_3
    if-eqz v1, :cond_6

    .line 121
    .line 122
    iget v1, v1, Lv3/i0;->B:I

    .line 123
    .line 124
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    goto :goto_4

    .line 129
    :cond_6
    move-object v1, v3

    .line 130
    :goto_4
    const/16 v6, 0x5a

    .line 131
    .line 132
    if-nez v1, :cond_7

    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_7
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    if-eq v7, v6, :cond_9

    .line 140
    .line 141
    :goto_5
    const/16 v6, 0x10e

    .line 142
    .line 143
    if-nez v1, :cond_8

    .line 144
    .line 145
    goto :goto_7

    .line 146
    :cond_8
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-ne v1, v6, :cond_c

    .line 151
    .line 152
    :cond_9
    iget-object v1, p1, Lpa/b;->c:Lv3/d0;

    .line 153
    .line 154
    invoke-virtual {v1}, Lv3/d0;->u0()V

    .line 155
    .line 156
    .line 157
    iget-object v1, v1, Lv3/d0;->P:Lv3/i0;

    .line 158
    .line 159
    if-eqz v1, :cond_a

    .line 160
    .line 161
    iget v1, v1, Lv3/i0;->z:I

    .line 162
    .line 163
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    move-object v4, v1

    .line 168
    goto :goto_6

    .line 169
    :cond_a
    move-object v4, v3

    .line 170
    :goto_6
    iget-object v1, p1, Lpa/b;->c:Lv3/d0;

    .line 171
    .line 172
    invoke-virtual {v1}, Lv3/d0;->u0()V

    .line 173
    .line 174
    .line 175
    iget-object v1, v1, Lv3/d0;->P:Lv3/i0;

    .line 176
    .line 177
    if-eqz v1, :cond_b

    .line 178
    .line 179
    iget v1, v1, Lv3/i0;->y:I

    .line 180
    .line 181
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    :cond_b
    move-object v5, v3

    .line 186
    :cond_c
    :goto_7
    const-string v1, "width"

    .line 187
    .line 188
    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    const-string v1, "height"

    .line 192
    .line 193
    invoke-virtual {v0, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    :cond_d
    iget-object p1, p1, Lpa/b;->d:Lpa/k;

    .line 197
    .line 198
    invoke-virtual {p1, v0}, Lpa/k;->success(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    :cond_e
    new-instance p1, Ljava/util/HashMap;

    .line 202
    .line 203
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 204
    .line 205
    .line 206
    const-string v0, "bufferingEnd"

    .line 207
    .line 208
    goto :goto_8

    .line 209
    :cond_f
    iget-object p1, p0, Lpa/e;->a:Lpa/b;

    .line 210
    .line 211
    invoke-virtual {p1, v1}, Lpa/b;->d(Z)V

    .line 212
    .line 213
    .line 214
    new-instance p1, Ljava/util/HashMap;

    .line 215
    .line 216
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 217
    .line 218
    .line 219
    const-string v0, "bufferingStart"

    .line 220
    .line 221
    :goto_8
    invoke-virtual {p1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    :goto_9
    iget-object v0, p0, Lpa/e;->a:Lpa/b;

    .line 225
    .line 226
    iget-object v0, v0, Lpa/b;->d:Lpa/k;

    .line 227
    .line 228
    invoke-virtual {v0, p1}, Lpa/k;->success(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    :goto_a
    return-void
    .line 232
    .line 233
.end method

.method public final synthetic R(Lv3/p0;)V
    .locals 0

    return-void
.end method

.method public final synthetic T(Z)V
    .locals 0

    return-void
.end method

.method public final synthetic W(IZ)V
    .locals 0

    return-void
.end method

.method public final synthetic X(Lv3/n;)V
    .locals 0

    return-void
.end method

.method public final synthetic Y(Lv3/r1;I)V
    .locals 0

    return-void
.end method

.method public final synthetic Z(Lv3/s1;)V
    .locals 0

    return-void
.end method

.method public final a0(Lv3/n;)V
    .locals 3

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lpa/e;->a:Lpa/b;

    .line 7
    .line 8
    iget-object v0, v0, Lpa/b;->d:Lpa/k;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v2, "Video player had error "

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v1, "VideoError"

    .line 28
    .line 29
    const-string v2, ""

    .line 30
    .line 31
    invoke-virtual {v0, v1, p1, v2}, Lpa/k;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
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

.method public final synthetic b(Lw5/o;)V
    .locals 0

    return-void
.end method

.method public final synthetic b0(IZ)V
    .locals 0

    return-void
.end method

.method public final synthetic c0(Lv3/e1;)V
    .locals 0

    return-void
.end method

.method public final synthetic d(I)V
    .locals 0

    return-void
.end method

.method public final synthetic d0(Lx3/d;)V
    .locals 0

    return-void
.end method

.method public final synthetic e0(Lv3/f1;Lv3/f1$b;)V
    .locals 0

    return-void
.end method

.method public final synthetic f()V
    .locals 0

    return-void
.end method

.method public final synthetic j(Lh5/c;)V
    .locals 0

    return-void
.end method

.method public final synthetic k0(Lv3/o0;I)V
    .locals 0

    return-void
.end method

.method public final synthetic l0(Lv3/m;)V
    .locals 0

    return-void
.end method

.method public final synthetic m()V
    .locals 0

    return-void
.end method

.method public final synthetic m0(II)V
    .locals 0

    return-void
.end method

.method public final synthetic o(Z)V
    .locals 0

    return-void
.end method

.method public final synthetic p0(Z)V
    .locals 0

    return-void
.end method

.method public final synthetic q(I)V
    .locals 0

    return-void
.end method

.method public final synthetic r(Ljava/util/List;)V
    .locals 0

    return-void
.end method

.method public final synthetic w(Lp4/a;)V
    .locals 0

    return-void
.end method

.method public final synthetic x(I)V
    .locals 0

    return-void
.end method
