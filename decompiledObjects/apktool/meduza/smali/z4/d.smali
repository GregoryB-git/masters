.class public final Lz4/d;
.super Lz4/l0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz4/d$a;,
        Lz4/d$b;
    }
.end annotation


# instance fields
.field public A:J

.field public B:J

.field public final t:J

.field public final u:J

.field public final v:Z

.field public final w:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lz4/c;",
            ">;"
        }
    .end annotation
.end field

.field public final x:Lv3/r1$c;

.field public y:Lz4/d$a;

.field public z:Lz4/d$b;


# direct methods
.method public constructor <init>(Lz4/t;JJ)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lz4/l0;-><init>(Lz4/t;)V

    .line 5
    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    cmp-long p1, p2, v0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-ltz p1, :cond_0

    .line 13
    .line 14
    move p1, v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    invoke-static {p1}, Lx6/b;->q(Z)V

    .line 18
    .line 19
    .line 20
    iput-wide p2, p0, Lz4/d;->t:J

    .line 21
    .line 22
    iput-wide p4, p0, Lz4/d;->u:J

    .line 23
    .line 24
    iput-boolean v0, p0, Lz4/d;->v:Z

    .line 25
    .line 26
    new-instance p1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lz4/d;->w:Ljava/util/ArrayList;

    .line 32
    .line 33
    new-instance p1, Lv3/r1$c;

    .line 34
    .line 35
    invoke-direct {p1}, Lv3/r1$c;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lz4/d;->x:Lv3/r1$c;

    .line 39
    .line 40
    return-void
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


# virtual methods
.method public final D(Lv3/r1;)V
    .locals 1

    iget-object v0, p0, Lz4/d;->z:Lz4/d$b;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lz4/d;->F(Lv3/r1;)V

    return-void
.end method

.method public final F(Lv3/r1;)V
    .locals 15

    .line 1
    move-object v1, p0

    .line 2
    iget-object v0, v1, Lz4/d;->x:Lv3/r1$c;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    move-object/from16 v4, p1

    .line 6
    .line 7
    invoke-virtual {v4, v2, v0}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Lz4/d;->x:Lv3/r1$c;

    .line 11
    .line 12
    iget-wide v5, v0, Lv3/r1$c;->y:J

    .line 13
    .line 14
    iget-object v0, v1, Lz4/d;->y:Lz4/d$a;

    .line 15
    .line 16
    const-wide/high16 v7, -0x8000000000000000L

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, v1, Lz4/d;->w:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    iget-wide v9, v1, Lz4/d;->A:J

    .line 29
    .line 30
    sub-long/2addr v9, v5

    .line 31
    iget-wide v11, v1, Lz4/d;->u:J

    .line 32
    .line 33
    cmp-long v0, v11, v7

    .line 34
    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-wide v7, v1, Lz4/d;->B:J

    .line 39
    .line 40
    sub-long/2addr v7, v5

    .line 41
    :goto_0
    move-wide v5, v9

    .line 42
    goto :goto_3

    .line 43
    :cond_1
    iget-wide v9, v1, Lz4/d;->t:J

    .line 44
    .line 45
    iget-wide v11, v1, Lz4/d;->u:J

    .line 46
    .line 47
    add-long v13, v5, v9

    .line 48
    .line 49
    iput-wide v13, v1, Lz4/d;->A:J

    .line 50
    .line 51
    cmp-long v0, v11, v7

    .line 52
    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    add-long v7, v5, v11

    .line 57
    .line 58
    :goto_1
    iput-wide v7, v1, Lz4/d;->B:J

    .line 59
    .line 60
    iget-object v0, v1, Lz4/d;->w:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    move v3, v2

    .line 67
    :goto_2
    if-ge v3, v0, :cond_3

    .line 68
    .line 69
    iget-object v5, v1, Lz4/d;->w:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    check-cast v5, Lz4/c;

    .line 76
    .line 77
    iget-wide v6, v1, Lz4/d;->A:J

    .line 78
    .line 79
    iget-wide v13, v1, Lz4/d;->B:J

    .line 80
    .line 81
    iput-wide v6, v5, Lz4/c;->e:J

    .line 82
    .line 83
    iput-wide v13, v5, Lz4/c;->f:J

    .line 84
    .line 85
    add-int/lit8 v3, v3, 0x1

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    move-wide v5, v9

    .line 89
    move-wide v7, v11

    .line 90
    :goto_3
    :try_start_0
    new-instance v0, Lz4/d$a;

    .line 91
    .line 92
    move-object v3, v0

    .line 93
    move-object/from16 v4, p1

    .line 94
    .line 95
    invoke-direct/range {v3 .. v8}, Lz4/d$a;-><init>(Lv3/r1;JJ)V

    .line 96
    .line 97
    .line 98
    iput-object v0, v1, Lz4/d;->y:Lz4/d$a;
    :try_end_0
    .catch Lz4/d$b; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    .line 100
    invoke-virtual {p0, v0}, Lz4/a;->v(Lv3/r1;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :catch_0
    move-exception v0

    .line 105
    iput-object v0, v1, Lz4/d;->z:Lz4/d$b;

    .line 106
    .line 107
    :goto_4
    iget-object v0, v1, Lz4/d;->w:Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-ge v2, v0, :cond_4

    .line 114
    .line 115
    iget-object v0, v1, Lz4/d;->w:Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, Lz4/c;

    .line 122
    .line 123
    iget-object v3, v1, Lz4/d;->z:Lz4/d$b;

    .line 124
    .line 125
    iput-object v3, v0, Lz4/c;->o:Lz4/d$b;

    .line 126
    .line 127
    add-int/lit8 v2, v2, 0x1

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_4
    return-void
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

.method public final g(Lz4/r;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz4/d;->w:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lx6/b;->H(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lz4/l0;->s:Lz4/t;

    .line 11
    .line 12
    check-cast p1, Lz4/c;

    .line 13
    .line 14
    iget-object p1, p1, Lz4/c;->a:Lz4/r;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Lz4/t;->g(Lz4/r;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lz4/d;->w:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget-object p1, p0, Lz4/d;->y:Lz4/d$a;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object p1, p1, Lz4/l;->b:Lv3/r1;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lz4/d;->F(Lv3/r1;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
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

.method public final h()V
    .locals 1

    iget-object v0, p0, Lz4/d;->z:Lz4/d$b;

    if-nez v0, :cond_0

    invoke-super {p0}, Lz4/f;->h()V

    return-void

    :cond_0
    throw v0
.end method

.method public final o(Lz4/t$b;Lt5/b;J)Lz4/r;
    .locals 8

    new-instance v7, Lz4/c;

    iget-object v0, p0, Lz4/l0;->s:Lz4/t;

    invoke-interface {v0, p1, p2, p3, p4}, Lz4/t;->o(Lz4/t$b;Lt5/b;J)Lz4/r;

    move-result-object v1

    iget-boolean v2, p0, Lz4/d;->v:Z

    iget-wide v3, p0, Lz4/d;->A:J

    iget-wide v5, p0, Lz4/d;->B:J

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lz4/c;-><init>(Lz4/r;ZJJ)V

    iget-object p1, p0, Lz4/d;->w:Ljava/util/ArrayList;

    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v7
.end method

.method public final w()V
    .locals 1

    invoke-super {p0}, Lz4/f;->w()V

    const/4 v0, 0x0

    iput-object v0, p0, Lz4/d;->z:Lz4/d$b;

    iput-object v0, p0, Lz4/d;->y:Lz4/d$a;

    return-void
.end method
