.class public abstract LZ0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ0/b$g;,
        LZ0/b$d;,
        LZ0/b$e;,
        LZ0/b$f;,
        LZ0/b$c;,
        LZ0/b$a;,
        LZ0/b$b;
    }
.end annotation


# static fields
.field public static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "OpusHead"

    .line 2
    .line 3
    invoke-static {v0}, Lg0/M;->r0(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LZ0/b;->a:[B

    .line 8
    .line 9
    return-void
.end method

.method public static A(LZ0/a$a;LZ0/a$b;JLd0/m;ZZ)LZ0/s;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const v1, 0x6d646961

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, LZ0/a$a;->f(I)LZ0/a$a;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, LZ0/a$a;

    .line 15
    .line 16
    const v2, 0x68646c72    # 4.3148E24f

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, LZ0/a$a;->g(I)LZ0/a$b;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, LZ0/a$b;

    .line 28
    .line 29
    iget-object v2, v2, LZ0/a$b;->b:Lg0/z;

    .line 30
    .line 31
    invoke-static {v2}, LZ0/b;->m(Lg0/z;)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {v2}, LZ0/b;->e(I)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    const/4 v2, -0x1

    .line 40
    const/4 v3, 0x0

    .line 41
    if-ne v5, v2, :cond_0

    .line 42
    .line 43
    return-object v3

    .line 44
    :cond_0
    const v2, 0x746b6864

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v2}, LZ0/a$a;->g(I)LZ0/a$b;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, LZ0/a$b;

    .line 56
    .line 57
    iget-object v2, v2, LZ0/a$b;->b:Lg0/z;

    .line 58
    .line 59
    invoke-static {v2}, LZ0/b;->z(Lg0/z;)LZ0/b$g;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    cmp-long v4, p2, v6

    .line 69
    .line 70
    if-nez v4, :cond_1

    .line 71
    .line 72
    invoke-static {v2}, LZ0/b$g;->a(LZ0/b$g;)J

    .line 73
    .line 74
    .line 75
    move-result-wide v8

    .line 76
    move-object/from16 v4, p1

    .line 77
    .line 78
    move-wide v10, v8

    .line 79
    goto :goto_0

    .line 80
    :cond_1
    move-object/from16 v4, p1

    .line 81
    .line 82
    move-wide/from16 v10, p2

    .line 83
    .line 84
    :goto_0
    iget-object v4, v4, LZ0/a$b;->b:Lg0/z;

    .line 85
    .line 86
    invoke-static {v4}, LZ0/b;->r(Lg0/z;)Lh0/c;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    iget-wide v8, v4, Lh0/c;->q:J

    .line 91
    .line 92
    cmp-long v4, v10, v6

    .line 93
    .line 94
    if-nez v4, :cond_2

    .line 95
    .line 96
    :goto_1
    move-wide v10, v6

    .line 97
    goto :goto_2

    .line 98
    :cond_2
    const-wide/32 v12, 0xf4240

    .line 99
    .line 100
    .line 101
    move-wide v14, v8

    .line 102
    invoke-static/range {v10 .. v15}, Lg0/M;->W0(JJJ)J

    .line 103
    .line 104
    .line 105
    move-result-wide v6

    .line 106
    goto :goto_1

    .line 107
    :goto_2
    const v4, 0x6d696e66

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v4}, LZ0/a$a;->f(I)LZ0/a$a;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-static {v4}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    check-cast v4, LZ0/a$a;

    .line 119
    .line 120
    const v6, 0x7374626c

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4, v6}, LZ0/a$a;->f(I)LZ0/a$a;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-static {v4}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    check-cast v4, LZ0/a$a;

    .line 132
    .line 133
    const v6, 0x6d646864

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v6}, LZ0/a$a;->g(I)LZ0/a$b;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-static {v1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    check-cast v1, LZ0/a$b;

    .line 145
    .line 146
    iget-object v1, v1, LZ0/a$b;->b:Lg0/z;

    .line 147
    .line 148
    invoke-static {v1}, LZ0/b;->o(Lg0/z;)Landroid/util/Pair;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    const v6, 0x73747364

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4, v6}, LZ0/a$a;->g(I)LZ0/a$b;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    if-eqz v4, :cond_5

    .line 160
    .line 161
    iget-object v12, v4, LZ0/a$b;->b:Lg0/z;

    .line 162
    .line 163
    invoke-static {v2}, LZ0/b$g;->b(LZ0/b$g;)I

    .line 164
    .line 165
    .line 166
    move-result v13

    .line 167
    invoke-static {v2}, LZ0/b$g;->c(LZ0/b$g;)I

    .line 168
    .line 169
    .line 170
    move-result v14

    .line 171
    iget-object v4, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 172
    .line 173
    move-object v15, v4

    .line 174
    check-cast v15, Ljava/lang/String;

    .line 175
    .line 176
    move-object/from16 v16, p4

    .line 177
    .line 178
    move/from16 v17, p6

    .line 179
    .line 180
    invoke-static/range {v12 .. v17}, LZ0/b;->x(Lg0/z;IILjava/lang/String;Ld0/m;Z)LZ0/b$d;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    if-nez p5, :cond_3

    .line 185
    .line 186
    const v6, 0x65647473

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v6}, LZ0/a$a;->f(I)LZ0/a$a;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    if-eqz v0, :cond_3

    .line 194
    .line 195
    invoke-static {v0}, LZ0/b;->j(LZ0/a$a;)Landroid/util/Pair;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    if-eqz v0, :cond_3

    .line 200
    .line 201
    iget-object v6, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v6, [J

    .line 204
    .line 205
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v0, [J

    .line 208
    .line 209
    move-object/from16 v17, v0

    .line 210
    .line 211
    move-object/from16 v16, v6

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_3
    move-object/from16 v16, v3

    .line 215
    .line 216
    move-object/from16 v17, v16

    .line 217
    .line 218
    :goto_3
    iget-object v0, v4, LZ0/b$d;->b:Ld0/q;

    .line 219
    .line 220
    if-nez v0, :cond_4

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_4
    new-instance v0, LZ0/s;

    .line 224
    .line 225
    invoke-static {v2}, LZ0/b$g;->b(LZ0/b$g;)I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v1, Ljava/lang/Long;

    .line 232
    .line 233
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 234
    .line 235
    .line 236
    move-result-wide v6

    .line 237
    iget-object v12, v4, LZ0/b$d;->b:Ld0/q;

    .line 238
    .line 239
    iget v13, v4, LZ0/b$d;->d:I

    .line 240
    .line 241
    iget-object v14, v4, LZ0/b$d;->a:[LZ0/t;

    .line 242
    .line 243
    iget v15, v4, LZ0/b$d;->c:I

    .line 244
    .line 245
    move-object v3, v0

    .line 246
    move v4, v2

    .line 247
    invoke-direct/range {v3 .. v17}, LZ0/s;-><init>(IIJJJLd0/q;I[LZ0/t;I[J[J)V

    .line 248
    .line 249
    .line 250
    :goto_4
    return-object v3

    .line 251
    :cond_5
    const-string v0, "Malformed sample table (stbl) missing sample description (stsd)"

    .line 252
    .line 253
    invoke-static {v0, v3}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    throw v0
.end method

.method public static B(LZ0/a$a;LF0/E;JLd0/m;ZZLW2/g;)Ljava/util/List;
    .locals 11

    .line 1
    move-object v0, p0

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    iget-object v3, v0, LZ0/a$a;->d:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-ge v2, v3, :cond_2

    .line 15
    .line 16
    iget-object v3, v0, LZ0/a$a;->d:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, LZ0/a$a;

    .line 23
    .line 24
    iget v4, v3, LZ0/a;->a:I

    .line 25
    .line 26
    const v5, 0x7472616b

    .line 27
    .line 28
    .line 29
    if-eq v4, v5, :cond_0

    .line 30
    .line 31
    move-object v6, p1

    .line 32
    move-object/from16 v5, p7

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    const v4, 0x6d766864

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v4}, LZ0/a$a;->g(I)LZ0/a$b;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-static {v4}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    move-object v5, v4

    .line 47
    check-cast v5, LZ0/a$b;

    .line 48
    .line 49
    move-object v4, v3

    .line 50
    move-wide v6, p2

    .line 51
    move-object v8, p4

    .line 52
    move/from16 v9, p5

    .line 53
    .line 54
    move/from16 v10, p6

    .line 55
    .line 56
    invoke-static/range {v4 .. v10}, LZ0/b;->A(LZ0/a$a;LZ0/a$b;JLd0/m;ZZ)LZ0/s;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    move-object/from16 v5, p7

    .line 61
    .line 62
    invoke-interface {v5, v4}, LW2/g;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, LZ0/s;

    .line 67
    .line 68
    if-nez v4, :cond_1

    .line 69
    .line 70
    move-object v6, p1

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    const v6, 0x6d646961

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v6}, LZ0/a$a;->f(I)LZ0/a$a;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-static {v3}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, LZ0/a$a;

    .line 84
    .line 85
    const v6, 0x6d696e66

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3, v6}, LZ0/a$a;->f(I)LZ0/a$a;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-static {v3}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, LZ0/a$a;

    .line 97
    .line 98
    const v6, 0x7374626c

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v6}, LZ0/a$a;->f(I)LZ0/a$a;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-static {v3}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, LZ0/a$a;

    .line 110
    .line 111
    move-object v6, p1

    .line 112
    invoke-static {v4, v3, p1}, LZ0/b;->w(LZ0/s;LZ0/a$a;LF0/E;)LZ0/v;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_2
    return-object v1
.end method

.method public static C(LZ0/a$b;)Ld0/x;
    .locals 6

    .line 1
    iget-object p0, p0, LZ0/a$b;->b:Lg0/z;

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ld0/x;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    new-array v2, v2, [Ld0/x$b;

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ld0/x;-><init>([Ld0/x$b;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-virtual {p0}, Lg0/z;->a()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-lt v2, v0, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0}, Lg0/z;->f()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    const v5, 0x6d657461

    .line 35
    .line 36
    .line 37
    if-ne v4, v5, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0, v2}, Lg0/z;->T(I)V

    .line 40
    .line 41
    .line 42
    add-int v4, v2, v3

    .line 43
    .line 44
    invoke-static {p0, v4}, LZ0/b;->D(Lg0/z;I)Ld0/x;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    :goto_1
    invoke-virtual {v1, v4}, Ld0/x;->b(Ld0/x;)Ld0/x;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    goto :goto_2

    .line 53
    :cond_0
    const v5, 0x736d7461

    .line 54
    .line 55
    .line 56
    if-ne v4, v5, :cond_1

    .line 57
    .line 58
    invoke-virtual {p0, v2}, Lg0/z;->T(I)V

    .line 59
    .line 60
    .line 61
    add-int v4, v2, v3

    .line 62
    .line 63
    invoke-static {p0, v4}, LZ0/q;->b(Lg0/z;I)Ld0/x;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    const v5, -0x56878686

    .line 69
    .line 70
    .line 71
    if-ne v4, v5, :cond_2

    .line 72
    .line 73
    invoke-static {p0}, LZ0/b;->F(Lg0/z;)Ld0/x;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    :goto_2
    add-int/2addr v2, v3

    .line 79
    invoke-virtual {p0, v2}, Lg0/z;->T(I)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    return-object v1
.end method

.method public static D(Lg0/z;I)Ld0/x;
    .locals 4

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lg0/z;->U(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, LZ0/b;->f(Lg0/z;)V

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-virtual {p0}, Lg0/z;->f()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ge v0, p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lg0/z;->f()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const v3, 0x696c7374

    .line 28
    .line 29
    .line 30
    if-ne v2, v3, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 33
    .line 34
    .line 35
    add-int/2addr v0, v1

    .line 36
    invoke-static {p0, v0}, LZ0/b;->n(Lg0/z;I)Ld0/x;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_0
    add-int/2addr v0, v1

    .line 42
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 p0, 0x0

    .line 47
    return-object p0
.end method

.method public static E(Lg0/z;IIIIILd0/m;LZ0/b$d;I)V
    .locals 37

    .line 1
    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    add-int/lit8 v5, v1, 0x10

    invoke-virtual {v0, v5}, Lg0/z;->T(I)V

    const/16 v5, 0x10

    invoke-virtual {v0, v5}, Lg0/z;->U(I)V

    invoke-virtual/range {p0 .. p0}, Lg0/z;->M()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lg0/z;->M()I

    move-result v6

    const/16 v7, 0x32

    invoke-virtual {v0, v7}, Lg0/z;->U(I)V

    invoke-virtual/range {p0 .. p0}, Lg0/z;->f()I

    move-result v7

    const v8, 0x656e6376

    move/from16 v10, p1

    if-ne v10, v8, :cond_2

    invoke-static {v0, v1, v2}, LZ0/b;->u(Lg0/z;II)Landroid/util/Pair;

    move-result-object v8

    if-eqz v8, :cond_1

    iget-object v10, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-nez v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    iget-object v11, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v11, LZ0/t;

    iget-object v11, v11, LZ0/t;->b:Ljava/lang/String;

    invoke-virtual {v3, v11}, Ld0/m;->c(Ljava/lang/String;)Ld0/m;

    move-result-object v3

    :goto_0
    iget-object v11, v4, LZ0/b$d;->a:[LZ0/t;

    iget-object v8, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v8, LZ0/t;

    aput-object v8, v11, p8

    :cond_1
    invoke-virtual {v0, v7}, Lg0/z;->T(I)V

    :cond_2
    const v8, 0x6d317620

    const-string v11, "video/3gpp"

    if-ne v10, v8, :cond_3

    const-string v8, "video/mpeg"

    goto :goto_1

    :cond_3
    const v8, 0x48323633

    if-ne v10, v8, :cond_4

    move-object v8, v11

    goto :goto_1

    :cond_4
    const/4 v8, 0x0

    :goto_1
    const/high16 v14, 0x3f800000    # 1.0f

    const/16 v15, 0x8

    move/from16 v16, v15

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, -0x1

    const/16 v21, -0x1

    const/16 v22, -0x1

    const/16 v23, -0x1

    const/16 v24, -0x1

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    :goto_2
    sub-int v12, v7, v1

    if-ge v12, v2, :cond_5

    invoke-virtual {v0, v7}, Lg0/z;->T(I)V

    invoke-virtual/range {p0 .. p0}, Lg0/z;->f()I

    move-result v12

    invoke-virtual/range {p0 .. p0}, Lg0/z;->p()I

    move-result v13

    if-nez v13, :cond_6

    invoke-virtual/range {p0 .. p0}, Lg0/z;->f()I

    move-result v28

    sub-int v9, v28, v1

    if-ne v9, v2, :cond_6

    :cond_5
    move-object/from16 v31, v3

    move/from16 v36, v14

    move/from16 v30, v15

    move/from16 v1, v22

    move/from16 v4, v24

    const/4 v2, 0x0

    goto/16 :goto_17

    :cond_6
    if-lez v13, :cond_7

    const/4 v9, 0x1

    goto :goto_3

    :cond_7
    const/4 v9, 0x0

    :goto_3
    const-string v1, "childAtomSize must be positive"

    invoke-static {v9, v1}, LF0/u;->a(ZLjava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lg0/z;->p()I

    move-result v1

    const v9, 0x61766343

    if-ne v1, v9, :cond_a

    const/4 v1, 0x0

    if-nez v8, :cond_8

    const/4 v9, 0x1

    goto :goto_4

    :cond_8
    const/4 v9, 0x0

    :goto_4
    invoke-static {v9, v1}, LF0/u;->a(ZLjava/lang/String;)V

    add-int/lit8 v12, v12, 0x8

    invoke-virtual {v0, v12}, Lg0/z;->T(I)V

    invoke-static/range {p0 .. p0}, LF0/d;->b(Lg0/z;)LF0/d;

    move-result-object v1

    iget-object v8, v1, LF0/d;->a:Ljava/util/List;

    iget v9, v1, LF0/d;->b:I

    iput v9, v4, LZ0/b$d;->c:I

    if-nez v27, :cond_9

    iget v14, v1, LF0/d;->k:F

    :cond_9
    iget-object v9, v1, LF0/d;->l:Ljava/lang/String;

    iget v12, v1, LF0/d;->j:I

    iget v15, v1, LF0/d;->g:I

    iget v2, v1, LF0/d;->h:I

    move/from16 v16, v2

    iget v2, v1, LF0/d;->i:I

    move/from16 v17, v2

    iget v2, v1, LF0/d;->e:I

    iget v1, v1, LF0/d;->f:I

    const-string v18, "video/avc"

    move-object/from16 v31, v3

    move/from16 v28, v10

    move-object/from16 v29, v11

    move/from16 v21, v12

    move/from16 v22, v15

    move/from16 v23, v16

    move/from16 v24, v17

    const/4 v3, -0x1

    move/from16 v16, v1

    move v15, v2

    move-object/from16 v17, v8

    move-object/from16 v8, v18

    const/4 v2, 0x0

    move-object/from16 v18, v9

    goto/16 :goto_16

    :cond_a
    const v2, 0x68766343

    if-ne v1, v2, :cond_d

    const/4 v1, 0x0

    if-nez v8, :cond_b

    const/4 v9, 0x1

    goto :goto_5

    :cond_b
    const/4 v9, 0x0

    :goto_5
    invoke-static {v9, v1}, LF0/u;->a(ZLjava/lang/String;)V

    add-int/lit8 v12, v12, 0x8

    invoke-virtual {v0, v12}, Lg0/z;->T(I)V

    invoke-static/range {p0 .. p0}, LF0/F;->a(Lg0/z;)LF0/F;

    move-result-object v1

    iget-object v2, v1, LF0/F;->a:Ljava/util/List;

    iget v8, v1, LF0/F;->b:I

    iput v8, v4, LZ0/b$d;->c:I

    if-nez v27, :cond_c

    iget v14, v1, LF0/F;->j:F

    :cond_c
    iget v8, v1, LF0/F;->k:I

    iget-object v9, v1, LF0/F;->l:Ljava/lang/String;

    iget v12, v1, LF0/F;->g:I

    iget v15, v1, LF0/F;->h:I

    move-object/from16 v16, v2

    iget v2, v1, LF0/F;->i:I

    move/from16 v17, v2

    iget v2, v1, LF0/F;->e:I

    iget v1, v1, LF0/F;->f:I

    const-string v18, "video/hevc"

    move-object/from16 v31, v3

    move/from16 v21, v8

    move/from16 v28, v10

    move-object/from16 v29, v11

    move/from16 v22, v12

    move/from16 v23, v15

    move/from16 v24, v17

    move-object/from16 v8, v18

    const/4 v3, -0x1

    move v15, v2

    move-object/from16 v18, v9

    move-object/from16 v17, v16

    const/4 v2, 0x0

    move/from16 v16, v1

    goto/16 :goto_16

    :cond_d
    const v2, 0x64766343

    if-eq v1, v2, :cond_e

    const v2, 0x64767643

    if-ne v1, v2, :cond_f

    :cond_e
    move-object/from16 v31, v3

    move/from16 v28, v10

    move-object/from16 v29, v11

    move/from16 v36, v14

    move/from16 v30, v15

    move/from16 v1, v22

    move/from16 v4, v24

    const/4 v2, 0x0

    const/4 v3, -0x1

    goto/16 :goto_15

    :cond_f
    const v2, 0x76706343

    const/4 v9, 0x2

    if-ne v1, v2, :cond_14

    if-nez v8, :cond_10

    const/4 v1, 0x1

    :goto_6
    const/4 v2, 0x0

    goto :goto_7

    :cond_10
    const/4 v1, 0x0

    goto :goto_6

    :goto_7
    invoke-static {v1, v2}, LF0/u;->a(ZLjava/lang/String;)V

    const v1, 0x76703038

    if-ne v10, v1, :cond_11

    const-string v1, "video/x-vnd.on2.vp8"

    goto :goto_8

    :cond_11
    const-string v1, "video/x-vnd.on2.vp9"

    :goto_8
    add-int/lit8 v12, v12, 0xc

    invoke-virtual {v0, v12}, Lg0/z;->T(I)V

    invoke-virtual {v0, v9}, Lg0/z;->U(I)V

    invoke-virtual/range {p0 .. p0}, Lg0/z;->G()I

    move-result v2

    shr-int/lit8 v8, v2, 0x4

    const/4 v12, 0x1

    and-int/2addr v2, v12

    if-eqz v2, :cond_12

    const/4 v2, 0x1

    goto :goto_9

    :cond_12
    const/4 v2, 0x0

    :goto_9
    invoke-virtual/range {p0 .. p0}, Lg0/z;->G()I

    move-result v12

    invoke-virtual/range {p0 .. p0}, Lg0/z;->G()I

    move-result v15

    invoke-static {v12}, Ld0/h;->j(I)I

    move-result v22

    if-eqz v2, :cond_13

    const/16 v23, 0x1

    goto :goto_a

    :cond_13
    move/from16 v23, v9

    :goto_a
    invoke-static {v15}, Ld0/h;->k(I)I

    move-result v24

    move-object/from16 v31, v3

    move v15, v8

    move/from16 v16, v15

    move/from16 v28, v10

    move-object/from16 v29, v11

    const/4 v2, 0x0

    const/4 v3, -0x1

    move-object v8, v1

    goto/16 :goto_16

    :cond_14
    const v2, 0x61763143

    if-ne v1, v2, :cond_15

    add-int/lit8 v1, v13, -0x8

    new-array v2, v1, [B

    const/4 v8, 0x0

    invoke-virtual {v0, v2, v8, v1}, Lg0/z;->l([BII)V

    invoke-static {v2}, LX2/v;->Z(Ljava/lang/Object;)LX2/v;

    move-result-object v17

    add-int/lit8 v12, v12, 0x8

    invoke-virtual {v0, v12}, Lg0/z;->T(I)V

    invoke-static/range {p0 .. p0}, LZ0/b;->h(Lg0/z;)Ld0/h;

    move-result-object v1

    iget v2, v1, Ld0/h;->e:I

    iget v9, v1, Ld0/h;->f:I

    iget v12, v1, Ld0/h;->a:I

    iget v15, v1, Ld0/h;->b:I

    iget v1, v1, Ld0/h;->c:I

    const-string v16, "video/av01"

    move/from16 v24, v1

    move-object/from16 v31, v3

    move/from16 v28, v10

    move-object/from16 v29, v11

    move/from16 v22, v12

    move/from16 v23, v15

    move-object/from16 v8, v16

    const/4 v3, -0x1

    move v15, v2

    move/from16 v16, v9

    const/4 v2, 0x0

    goto/16 :goto_16

    :cond_15
    const v2, 0x636c6c69

    if-ne v1, v2, :cond_17

    if-nez v25, :cond_16

    invoke-static {}, LZ0/b;->a()Ljava/nio/ByteBuffer;

    move-result-object v25

    :cond_16
    move-object/from16 v1, v25

    const/16 v2, 0x15

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual/range {p0 .. p0}, Lg0/z;->C()S

    move-result v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual/range {p0 .. p0}, Lg0/z;->C()S

    move-result v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v25, v1

    move-object/from16 v31, v3

    move/from16 v28, v10

    move-object/from16 v29, v11

    :goto_b
    const/4 v2, 0x0

    :goto_c
    const/4 v3, -0x1

    goto/16 :goto_16

    :cond_17
    const v2, 0x6d646376

    if-ne v1, v2, :cond_19

    if-nez v25, :cond_18

    invoke-static {}, LZ0/b;->a()Ljava/nio/ByteBuffer;

    move-result-object v25

    :cond_18
    move-object/from16 v1, v25

    invoke-virtual/range {p0 .. p0}, Lg0/z;->C()S

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lg0/z;->C()S

    move-result v9

    invoke-virtual/range {p0 .. p0}, Lg0/z;->C()S

    move-result v12

    move/from16 v28, v10

    invoke-virtual/range {p0 .. p0}, Lg0/z;->C()S

    move-result v10

    move-object/from16 v29, v11

    invoke-virtual/range {p0 .. p0}, Lg0/z;->C()S

    move-result v11

    invoke-virtual/range {p0 .. p0}, Lg0/z;->C()S

    move-result v4

    move/from16 v30, v15

    invoke-virtual/range {p0 .. p0}, Lg0/z;->C()S

    move-result v15

    move-object/from16 v31, v3

    invoke-virtual/range {p0 .. p0}, Lg0/z;->C()S

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lg0/z;->I()J

    move-result-wide v32

    invoke-virtual/range {p0 .. p0}, Lg0/z;->I()J

    move-result-wide v34

    move/from16 v36, v14

    const/4 v14, 0x1

    invoke-virtual {v1, v14}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v1, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v9}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    const-wide/16 v2, 0x2710

    div-long v9, v32, v2

    long-to-int v4, v9

    int-to-short v4, v4

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    div-long v2, v34, v2

    long-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v25, v1

    move/from16 v15, v30

    move/from16 v14, v36

    goto :goto_b

    :cond_19
    move-object/from16 v31, v3

    move/from16 v28, v10

    move-object/from16 v29, v11

    move/from16 v36, v14

    move/from16 v30, v15

    const v2, 0x64323633

    if-ne v1, v2, :cond_1c

    const/4 v2, 0x0

    if-nez v8, :cond_1a

    const/4 v9, 0x1

    goto :goto_d

    :cond_1a
    const/4 v9, 0x0

    :goto_d
    invoke-static {v9, v2}, LF0/u;->a(ZLjava/lang/String;)V

    move-object/from16 v8, v29

    :cond_1b
    :goto_e
    move/from16 v15, v30

    move/from16 v14, v36

    goto/16 :goto_c

    :cond_1c
    const/4 v2, 0x0

    const v3, 0x65736473

    if-ne v1, v3, :cond_1f

    if-nez v8, :cond_1d

    const/4 v9, 0x1

    goto :goto_f

    :cond_1d
    const/4 v9, 0x0

    :goto_f
    invoke-static {v9, v2}, LF0/u;->a(ZLjava/lang/String;)V

    invoke-static {v0, v12}, LZ0/b;->k(Lg0/z;I)LZ0/b$b;

    move-result-object v26

    invoke-static/range {v26 .. v26}, LZ0/b$b;->a(LZ0/b$b;)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v26 .. v26}, LZ0/b$b;->b(LZ0/b$b;)[B

    move-result-object v3

    if-eqz v3, :cond_1e

    invoke-static {v3}, LX2/v;->Z(Ljava/lang/Object;)LX2/v;

    move-result-object v17

    :cond_1e
    move-object v8, v1

    goto :goto_e

    :cond_1f
    const v3, 0x70617370

    if-ne v1, v3, :cond_20

    invoke-static {v0, v12}, LZ0/b;->s(Lg0/z;I)F

    move-result v1

    move v14, v1

    move/from16 v15, v30

    const/4 v3, -0x1

    const/16 v27, 0x1

    goto/16 :goto_16

    :cond_20
    const v3, 0x73763364

    if-ne v1, v3, :cond_21

    invoke-static {v0, v12, v13}, LZ0/b;->t(Lg0/z;II)[B

    move-result-object v19

    goto :goto_e

    :cond_21
    const v3, 0x73743364

    if-ne v1, v3, :cond_26

    invoke-virtual/range {p0 .. p0}, Lg0/z;->G()I

    move-result v1

    const/4 v3, 0x3

    invoke-virtual {v0, v3}, Lg0/z;->U(I)V

    if-nez v1, :cond_1b

    invoke-virtual/range {p0 .. p0}, Lg0/z;->G()I

    move-result v1

    if-eqz v1, :cond_25

    const/4 v12, 0x1

    if-eq v1, v12, :cond_24

    if-eq v1, v9, :cond_23

    if-eq v1, v3, :cond_22

    goto :goto_e

    :cond_22
    move/from16 v20, v3

    goto :goto_e

    :cond_23
    move/from16 v20, v9

    goto :goto_e

    :cond_24
    move/from16 v20, v12

    goto :goto_e

    :cond_25
    const/16 v20, 0x0

    goto :goto_e

    :cond_26
    const/4 v12, 0x1

    const v3, 0x636f6c72

    if-ne v1, v3, :cond_2b

    move/from16 v1, v22

    const/4 v3, -0x1

    move/from16 v4, v24

    if-ne v1, v3, :cond_2c

    if-ne v4, v3, :cond_2c

    invoke-virtual/range {p0 .. p0}, Lg0/z;->p()I

    move-result v10

    const v11, 0x6e636c78

    if-eq v10, v11, :cond_28

    const v11, 0x6e636c63

    if-ne v10, v11, :cond_27

    goto :goto_10

    :cond_27
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Unsupported color type: "

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10}, LZ0/a;->a(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const-string v10, "AtomParsers"

    invoke-static {v10, v9}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_14

    :cond_28
    :goto_10
    invoke-virtual/range {p0 .. p0}, Lg0/z;->M()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lg0/z;->M()I

    move-result v4

    invoke-virtual {v0, v9}, Lg0/z;->U(I)V

    const/16 v10, 0x13

    if-ne v13, v10, :cond_29

    invoke-virtual/range {p0 .. p0}, Lg0/z;->G()I

    move-result v10

    and-int/lit16 v10, v10, 0x80

    if-eqz v10, :cond_29

    move v10, v12

    goto :goto_11

    :cond_29
    const/4 v10, 0x0

    :goto_11
    invoke-static {v1}, Ld0/h;->j(I)I

    move-result v22

    if-eqz v10, :cond_2a

    move/from16 v23, v12

    goto :goto_12

    :cond_2a
    move/from16 v23, v9

    :goto_12
    invoke-static {v4}, Ld0/h;->k(I)I

    move-result v24

    :goto_13
    move/from16 v15, v30

    move/from16 v14, v36

    goto :goto_16

    :cond_2b
    move/from16 v1, v22

    move/from16 v4, v24

    const/4 v3, -0x1

    :cond_2c
    :goto_14
    move/from16 v22, v1

    move/from16 v24, v4

    goto :goto_13

    :goto_15
    invoke-static/range {p0 .. p0}, LF0/o;->a(Lg0/z;)LF0/o;

    move-result-object v9

    if-eqz v9, :cond_2c

    iget-object v8, v9, LF0/o;->c:Ljava/lang/String;

    const-string v9, "video/dolby-vision"

    move-object/from16 v18, v8

    move-object v8, v9

    goto :goto_14

    :goto_16
    add-int/2addr v7, v13

    move/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v4, p7

    move/from16 v10, v28

    move-object/from16 v11, v29

    move-object/from16 v3, v31

    goto/16 :goto_2

    :goto_17
    if-nez v8, :cond_2d

    return-void

    :cond_2d
    new-instance v0, Ld0/q$b;

    invoke-direct {v0}, Ld0/q$b;-><init>()V

    move/from16 v3, p4

    invoke-virtual {v0, v3}, Ld0/q$b;->Z(I)Ld0/q$b;

    move-result-object v0

    invoke-virtual {v0, v8}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    move-result-object v0

    move-object/from16 v9, v18

    invoke-virtual {v0, v9}, Ld0/q$b;->O(Ljava/lang/String;)Ld0/q$b;

    move-result-object v0

    invoke-virtual {v0, v5}, Ld0/q$b;->v0(I)Ld0/q$b;

    move-result-object v0

    invoke-virtual {v0, v6}, Ld0/q$b;->Y(I)Ld0/q$b;

    move-result-object v0

    move/from16 v14, v36

    invoke-virtual {v0, v14}, Ld0/q$b;->k0(F)Ld0/q$b;

    move-result-object v0

    move/from16 v3, p5

    invoke-virtual {v0, v3}, Ld0/q$b;->n0(I)Ld0/q$b;

    move-result-object v0

    move-object/from16 v9, v19

    invoke-virtual {v0, v9}, Ld0/q$b;->l0([B)Ld0/q$b;

    move-result-object v0

    move/from16 v12, v20

    invoke-virtual {v0, v12}, Ld0/q$b;->r0(I)Ld0/q$b;

    move-result-object v0

    move-object/from16 v9, v17

    invoke-virtual {v0, v9}, Ld0/q$b;->b0(Ljava/util/List;)Ld0/q$b;

    move-result-object v0

    move/from16 v12, v21

    invoke-virtual {v0, v12}, Ld0/q$b;->g0(I)Ld0/q$b;

    move-result-object v0

    move-object/from16 v3, v31

    invoke-virtual {v0, v3}, Ld0/q$b;->U(Ld0/m;)Ld0/q$b;

    move-result-object v0

    new-instance v3, Ld0/h$b;

    invoke-direct {v3}, Ld0/h$b;-><init>()V

    invoke-virtual {v3, v1}, Ld0/h$b;->d(I)Ld0/h$b;

    move-result-object v1

    move/from16 v12, v23

    invoke-virtual {v1, v12}, Ld0/h$b;->c(I)Ld0/h$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Ld0/h$b;->e(I)Ld0/h$b;

    move-result-object v1

    if-eqz v25, :cond_2e

    invoke-virtual/range {v25 .. v25}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v9

    goto :goto_18

    :cond_2e
    move-object v9, v2

    :goto_18
    invoke-virtual {v1, v9}, Ld0/h$b;->f([B)Ld0/h$b;

    move-result-object v1

    move/from16 v15, v30

    invoke-virtual {v1, v15}, Ld0/h$b;->g(I)Ld0/h$b;

    move-result-object v1

    move/from16 v15, v16

    invoke-virtual {v1, v15}, Ld0/h$b;->b(I)Ld0/h$b;

    move-result-object v1

    invoke-virtual {v1}, Ld0/h$b;->a()Ld0/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld0/q$b;->P(Ld0/h;)Ld0/q$b;

    move-result-object v0

    if-eqz v26, :cond_2f

    invoke-static/range {v26 .. v26}, LZ0/b$b;->d(LZ0/b$b;)J

    move-result-wide v1

    invoke-static {v1, v2}, La3/f;->m(J)I

    move-result v1

    invoke-virtual {v0, v1}, Ld0/q$b;->M(I)Ld0/q$b;

    move-result-object v1

    invoke-static/range {v26 .. v26}, LZ0/b$b;->c(LZ0/b$b;)J

    move-result-wide v2

    invoke-static {v2, v3}, La3/f;->m(J)I

    move-result v2

    invoke-virtual {v1, v2}, Ld0/q$b;->j0(I)Ld0/q$b;

    :cond_2f
    invoke-virtual {v0}, Ld0/q$b;->K()Ld0/q;

    move-result-object v0

    move-object/from16 v1, p7

    iput-object v0, v1, LZ0/b$d;->b:Ld0/q;

    return-void
.end method

.method public static F(Lg0/z;)Ld0/x;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lg0/z;->C()S

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-virtual {p0, v1}, Lg0/z;->U(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lg0/z;->D(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/16 v0, 0x2b

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/16 v1, 0x2d

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x0

    .line 30
    :try_start_0
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const/4 v4, 0x1

    .line 43
    sub-int/2addr v3, v4

    .line 44
    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    new-instance v0, Ld0/x;

    .line 53
    .line 54
    new-array v3, v4, [Ld0/x$b;

    .line 55
    .line 56
    new-instance v4, Lh0/b;

    .line 57
    .line 58
    invoke-direct {v4, v2, p0}, Lh0/b;-><init>(FF)V

    .line 59
    .line 60
    .line 61
    aput-object v4, v3, v1

    .line 62
    .line 63
    invoke-direct {v0, v3}, Ld0/x;-><init>([Ld0/x$b;)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :catch_0
    const/4 p0, 0x0

    .line 68
    return-object p0
.end method

.method public static a()Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    const/16 v0, 0x19

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public static b([JJJJ)Z
    .locals 7

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x1

    .line 3
    sub-int/2addr v0, v1

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-static {v2, v3, v0}, Lg0/M;->p(III)I

    .line 7
    .line 8
    .line 9
    move-result v4

    .line 10
    array-length v5, p0

    .line 11
    sub-int/2addr v5, v2

    .line 12
    invoke-static {v5, v3, v0}, Lg0/M;->p(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    aget-wide v5, p0, v3

    .line 17
    .line 18
    cmp-long v2, v5, p3

    .line 19
    .line 20
    if-gtz v2, :cond_0

    .line 21
    .line 22
    aget-wide v4, p0, v4

    .line 23
    .line 24
    cmp-long p3, p3, v4

    .line 25
    .line 26
    if-gez p3, :cond_0

    .line 27
    .line 28
    aget-wide p3, p0, v0

    .line 29
    .line 30
    cmp-long p0, p3, p5

    .line 31
    .line 32
    if-gez p0, :cond_0

    .line 33
    .line 34
    cmp-long p0, p5, p1

    .line 35
    .line 36
    if-gtz p0, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v1, v3

    .line 40
    :goto_0
    return v1
.end method

.method public static c(I)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    return v0
.end method

.method public static d(Lg0/z;III)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Lg0/z;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-lt v0, p2, :cond_0

    .line 8
    .line 9
    move v3, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v3, v1

    .line 12
    :goto_0
    const/4 v4, 0x0

    .line 13
    invoke-static {v3, v4}, LF0/u;->a(ZLjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :goto_1
    sub-int v3, v0, p2

    .line 17
    .line 18
    if-ge v3, p3, :cond_3

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-lez v3, :cond_1

    .line 28
    .line 29
    move v4, v2

    .line 30
    goto :goto_2

    .line 31
    :cond_1
    move v4, v1

    .line 32
    :goto_2
    const-string v5, "childAtomSize must be positive"

    .line 33
    .line 34
    invoke-static {v4, v5}, LF0/u;->a(ZLjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-ne v4, p1, :cond_2

    .line 42
    .line 43
    return v0

    .line 44
    :cond_2
    add-int/2addr v0, v3

    .line 45
    goto :goto_1

    .line 46
    :cond_3
    const/4 p0, -0x1

    .line 47
    return p0
.end method

.method public static e(I)I
    .locals 1

    .line 1
    const v0, 0x736f756e

    .line 2
    .line 3
    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const v0, 0x76696465

    .line 9
    .line 10
    .line 11
    if-ne p0, v0, :cond_1

    .line 12
    .line 13
    const/4 p0, 0x2

    .line 14
    return p0

    .line 15
    :cond_1
    const v0, 0x74657874

    .line 16
    .line 17
    .line 18
    if-eq p0, v0, :cond_4

    .line 19
    .line 20
    const v0, 0x7362746c

    .line 21
    .line 22
    .line 23
    if-eq p0, v0, :cond_4

    .line 24
    .line 25
    const v0, 0x73756274

    .line 26
    .line 27
    .line 28
    if-eq p0, v0, :cond_4

    .line 29
    .line 30
    const v0, 0x636c6370

    .line 31
    .line 32
    .line 33
    if-ne p0, v0, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const v0, 0x6d657461

    .line 37
    .line 38
    .line 39
    if-ne p0, v0, :cond_3

    .line 40
    .line 41
    const/4 p0, 0x5

    .line 42
    return p0

    .line 43
    :cond_3
    const/4 p0, -0x1

    .line 44
    return p0

    .line 45
    :cond_4
    :goto_0
    const/4 p0, 0x3

    .line 46
    return p0
.end method

.method public static f(Lg0/z;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lg0/z;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    invoke-virtual {p0, v1}, Lg0/z;->U(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const v2, 0x68646c72    # 4.3148E24f

    .line 14
    .line 15
    .line 16
    if-eq v1, v2, :cond_0

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x4

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static g(Lg0/z;IIIILjava/lang/String;ZLd0/m;LZ0/b$d;I)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    const/4 v7, 0x1

    const/16 v8, 0x10

    add-int/lit8 v9, v1, 0x10

    invoke-virtual {v0, v9}, Lg0/z;->T(I)V

    const/4 v9, 0x6

    const/16 v10, 0x8

    if-eqz p6, :cond_0

    invoke-virtual/range {p0 .. p0}, Lg0/z;->M()I

    move-result v12

    invoke-virtual {v0, v9}, Lg0/z;->U(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v10}, Lg0/z;->U(I)V

    const/4 v12, 0x0

    :goto_0
    const/4 v15, -0x1

    const/4 v13, 0x4

    const/4 v14, 0x2

    if-eqz v12, :cond_d

    if-ne v12, v7, :cond_1

    goto/16 :goto_4

    :cond_1
    if-ne v12, v14, :cond_c

    invoke-virtual {v0, v8}, Lg0/z;->U(I)V

    invoke-virtual/range {p0 .. p0}, Lg0/z;->o()D

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->round(D)J

    move-result-wide v11

    long-to-int v9, v11

    invoke-virtual/range {p0 .. p0}, Lg0/z;->K()I

    move-result v11

    invoke-virtual {v0, v13}, Lg0/z;->U(I)V

    invoke-virtual/range {p0 .. p0}, Lg0/z;->K()I

    move-result v12

    invoke-virtual/range {p0 .. p0}, Lg0/z;->K()I

    move-result v17

    and-int/lit8 v18, v17, 0x1

    if-eqz v18, :cond_2

    move/from16 v18, v7

    goto :goto_1

    :cond_2
    const/16 v18, 0x0

    :goto_1
    and-int/lit8 v17, v17, 0x2

    if-eqz v17, :cond_3

    move/from16 v17, v7

    goto :goto_2

    :cond_3
    const/16 v17, 0x0

    :goto_2
    const/16 v14, 0x20

    if-nez v18, :cond_a

    if-ne v12, v10, :cond_4

    const/4 v8, 0x3

    goto :goto_3

    :cond_4
    if-ne v12, v8, :cond_6

    if-eqz v17, :cond_5

    const/high16 v8, 0x10000000

    goto :goto_3

    :cond_5
    const/4 v8, 0x2

    goto :goto_3

    :cond_6
    const/16 v8, 0x18

    if-ne v12, v8, :cond_8

    if-eqz v17, :cond_7

    const/high16 v8, 0x50000000

    goto :goto_3

    :cond_7
    const/16 v8, 0x15

    goto :goto_3

    :cond_8
    if-ne v12, v14, :cond_b

    if-eqz v17, :cond_9

    const/high16 v8, 0x60000000

    goto :goto_3

    :cond_9
    const/16 v8, 0x16

    goto :goto_3

    :cond_a
    if-ne v12, v14, :cond_b

    move v8, v13

    goto :goto_3

    :cond_b
    move v8, v15

    :goto_3
    invoke-virtual {v0, v10}, Lg0/z;->U(I)V

    const/4 v14, 0x0

    goto :goto_5

    :cond_c
    return-void

    :cond_d
    :goto_4
    invoke-virtual/range {p0 .. p0}, Lg0/z;->M()I

    move-result v11

    invoke-virtual {v0, v9}, Lg0/z;->U(I)V

    invoke-virtual/range {p0 .. p0}, Lg0/z;->H()I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Lg0/z;->f()I

    move-result v14

    sub-int/2addr v14, v13

    invoke-virtual {v0, v14}, Lg0/z;->T(I)V

    invoke-virtual/range {p0 .. p0}, Lg0/z;->p()I

    move-result v14

    if-ne v12, v7, :cond_e

    invoke-virtual {v0, v8}, Lg0/z;->U(I)V

    :cond_e
    move v8, v15

    :goto_5
    invoke-virtual/range {p0 .. p0}, Lg0/z;->f()I

    move-result v12

    const v13, 0x656e6361

    move/from16 v7, p1

    if-ne v7, v13, :cond_11

    invoke-static {v0, v1, v2}, LZ0/b;->u(Lg0/z;II)Landroid/util/Pair;

    move-result-object v13

    if-eqz v13, :cond_10

    iget-object v7, v13, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-nez v5, :cond_f

    const/4 v5, 0x0

    goto :goto_6

    :cond_f
    iget-object v10, v13, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v10, LZ0/t;

    iget-object v10, v10, LZ0/t;->b:Ljava/lang/String;

    invoke-virtual {v5, v10}, Ld0/m;->c(Ljava/lang/String;)Ld0/m;

    move-result-object v5

    :goto_6
    iget-object v10, v6, LZ0/b$d;->a:[LZ0/t;

    iget-object v13, v13, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v13, LZ0/t;

    aput-object v13, v10, p9

    :cond_10
    invoke-virtual {v0, v12}, Lg0/z;->T(I)V

    :cond_11
    const v10, 0x61632d33

    const-string v13, "audio/mhm1"

    if-ne v7, v10, :cond_12

    const-string v7, "audio/ac3"

    goto/16 :goto_a

    :cond_12
    const v10, 0x65632d33

    if-ne v7, v10, :cond_13

    const-string v7, "audio/eac3"

    goto/16 :goto_a

    :cond_13
    const v10, 0x61632d34

    if-ne v7, v10, :cond_14

    const-string v7, "audio/ac4"

    goto/16 :goto_a

    :cond_14
    const v10, 0x64747363

    if-ne v7, v10, :cond_15

    const-string v7, "audio/vnd.dts"

    goto/16 :goto_a

    :cond_15
    const v10, 0x64747368

    if-eq v7, v10, :cond_29

    const v10, 0x6474736c

    if-ne v7, v10, :cond_16

    goto/16 :goto_9

    :cond_16
    const v10, 0x64747365

    if-ne v7, v10, :cond_17

    const-string v7, "audio/vnd.dts.hd;profile=lbr"

    goto/16 :goto_a

    :cond_17
    const v10, 0x64747378

    if-ne v7, v10, :cond_18

    const-string v7, "audio/vnd.dts.uhd;profile=p2"

    goto/16 :goto_a

    :cond_18
    const v10, 0x73616d72

    if-ne v7, v10, :cond_19

    const-string v7, "audio/3gpp"

    goto/16 :goto_a

    :cond_19
    const v10, 0x73617762

    if-ne v7, v10, :cond_1a

    const-string v7, "audio/amr-wb"

    goto/16 :goto_a

    :cond_1a
    const v10, 0x736f7774

    const-string v22, "audio/raw"

    if-ne v7, v10, :cond_1b

    :goto_7
    move-object/from16 v7, v22

    const/4 v8, 0x2

    goto/16 :goto_a

    :cond_1b
    const v10, 0x74776f73

    if-ne v7, v10, :cond_1c

    move-object/from16 v7, v22

    const/high16 v8, 0x10000000

    goto/16 :goto_a

    :cond_1c
    const v10, 0x6c70636d

    if-ne v7, v10, :cond_1e

    if-ne v8, v15, :cond_1d

    goto :goto_7

    :cond_1d
    move-object/from16 v7, v22

    goto :goto_a

    :cond_1e
    const v10, 0x2e6d7032

    if-eq v7, v10, :cond_28

    const v10, 0x2e6d7033

    if-ne v7, v10, :cond_1f

    goto :goto_8

    :cond_1f
    const v10, 0x6d686131

    if-ne v7, v10, :cond_20

    const-string v7, "audio/mha1"

    goto :goto_a

    :cond_20
    const v10, 0x6d686d31

    if-ne v7, v10, :cond_21

    move-object v7, v13

    goto :goto_a

    :cond_21
    const v10, 0x616c6163

    if-ne v7, v10, :cond_22

    const-string v7, "audio/alac"

    goto :goto_a

    :cond_22
    const v10, 0x616c6177

    if-ne v7, v10, :cond_23

    const-string v7, "audio/g711-alaw"

    goto :goto_a

    :cond_23
    const v10, 0x756c6177

    if-ne v7, v10, :cond_24

    const-string v7, "audio/g711-mlaw"

    goto :goto_a

    :cond_24
    const v10, 0x4f707573

    if-ne v7, v10, :cond_25

    const-string v7, "audio/opus"

    goto :goto_a

    :cond_25
    const v10, 0x664c6143

    if-ne v7, v10, :cond_26

    const-string v7, "audio/flac"

    goto :goto_a

    :cond_26
    const v10, 0x6d6c7061

    if-ne v7, v10, :cond_27

    const-string v7, "audio/true-hd"

    goto :goto_a

    :cond_27
    const/4 v7, 0x0

    goto :goto_a

    :cond_28
    :goto_8
    const-string v7, "audio/mpeg"

    goto :goto_a

    :cond_29
    :goto_9
    const-string v7, "audio/vnd.dts.hd"

    :goto_a
    move/from16 p7, v8

    const/4 v10, 0x0

    const/4 v15, 0x0

    const/16 v22, 0x0

    :goto_b
    sub-int v8, v12, v1

    if-ge v8, v2, :cond_41

    invoke-virtual {v0, v12}, Lg0/z;->T(I)V

    invoke-virtual/range {p0 .. p0}, Lg0/z;->p()I

    move-result v8

    if-lez v8, :cond_2a

    const/4 v1, 0x1

    goto :goto_c

    :cond_2a
    const/4 v1, 0x0

    :goto_c
    const-string v2, "childAtomSize must be positive"

    invoke-static {v1, v2}, LF0/u;->a(ZLjava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lg0/z;->p()I

    move-result v1

    const v2, 0x6d686143

    if-ne v1, v2, :cond_2e

    const/16 v2, 0x8

    add-int/lit8 v10, v12, 0x8

    invoke-virtual {v0, v10}, Lg0/z;->T(I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lg0/z;->U(I)V

    invoke-virtual/range {p0 .. p0}, Lg0/z;->G()I

    move-result v2

    invoke-virtual {v0, v1}, Lg0/z;->U(I)V

    invoke-static {v7, v13}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2b

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v10, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v2, v10, v1

    const-string v2, "mhm1.%02X"

    invoke-static {v2, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    move-object v10, v2

    move-object/from16 p9, v13

    goto :goto_d

    :cond_2b
    const/4 v1, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 p9, v13

    const/4 v10, 0x1

    new-array v13, v10, [Ljava/lang/Object;

    aput-object v2, v13, v1

    const-string v2, "mha1.%02X"

    invoke-static {v2, v13}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    move-object v10, v2

    :goto_d
    invoke-virtual/range {p0 .. p0}, Lg0/z;->M()I

    move-result v2

    new-array v13, v2, [B

    invoke-virtual {v0, v13, v1, v2}, Lg0/z;->l([BII)V

    if-nez v15, :cond_2c

    invoke-static {v13}, LX2/v;->Z(Ljava/lang/Object;)LX2/v;

    move-result-object v2

    move-object v15, v2

    goto :goto_e

    :cond_2c
    invoke-interface {v15, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    invoke-static {v13, v2}, LX2/v;->a0(Ljava/lang/Object;Ljava/lang/Object;)LX2/v;

    move-result-object v1

    move-object v15, v1

    :cond_2d
    :goto_e
    const/4 v2, -0x1

    :goto_f
    const/4 v13, 0x4

    const/16 v16, 0x3

    const/16 v17, 0x0

    const/16 v18, 0x1

    const v19, 0x616c6163

    const/16 v20, 0x2

    const/16 v21, 0x8

    goto/16 :goto_16

    :cond_2e
    move-object/from16 p9, v13

    const v2, 0x6d686150

    if-ne v1, v2, :cond_30

    const/16 v2, 0x8

    add-int/lit8 v1, v12, 0x8

    invoke-virtual {v0, v1}, Lg0/z;->T(I)V

    invoke-virtual/range {p0 .. p0}, Lg0/z;->G()I

    move-result v1

    if-lez v1, :cond_2d

    new-array v2, v1, [B

    const/4 v13, 0x0

    invoke-virtual {v0, v2, v13, v1}, Lg0/z;->l([BII)V

    if-nez v15, :cond_2f

    invoke-static {v2}, LX2/v;->Z(Ljava/lang/Object;)LX2/v;

    move-result-object v15

    goto :goto_e

    :cond_2f
    invoke-interface {v15, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    invoke-static {v1, v2}, LX2/v;->a0(Ljava/lang/Object;Ljava/lang/Object;)LX2/v;

    move-result-object v15

    goto :goto_e

    :cond_30
    const v2, 0x65736473

    if-eq v1, v2, :cond_31

    if-eqz p6, :cond_32

    const v13, 0x77617665

    if-ne v1, v13, :cond_32

    :cond_31
    const/4 v13, 0x4

    const/16 v16, 0x3

    const/16 v17, 0x0

    const/16 v18, 0x1

    const v19, 0x616c6163

    const/16 v20, 0x2

    const/16 v21, 0x8

    goto/16 :goto_13

    :cond_32
    const v2, 0x64616333

    if-ne v1, v2, :cond_33

    const/16 v2, 0x8

    add-int/lit8 v1, v12, 0x8

    invoke-virtual {v0, v1}, Lg0/z;->T(I)V

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4, v5}, LF0/b;->d(Lg0/z;Ljava/lang/String;Ljava/lang/String;Ld0/m;)Ld0/q;

    move-result-object v1

    :goto_10
    iput-object v1, v6, LZ0/b$d;->b:Ld0/q;

    move/from16 v21, v2

    const v2, 0x616c6163

    const/4 v13, 0x4

    const/16 v16, 0x3

    const/16 v17, 0x0

    const/16 v18, 0x1

    const/16 v20, 0x2

    goto/16 :goto_12

    :cond_33
    const/16 v2, 0x8

    const v13, 0x64656333

    if-ne v1, v13, :cond_34

    add-int/lit8 v1, v12, 0x8

    invoke-virtual {v0, v1}, Lg0/z;->T(I)V

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4, v5}, LF0/b;->h(Lg0/z;Ljava/lang/String;Ljava/lang/String;Ld0/m;)Ld0/q;

    move-result-object v1

    goto :goto_10

    :cond_34
    const v13, 0x64616334

    if-ne v1, v13, :cond_35

    add-int/lit8 v1, v12, 0x8

    invoke-virtual {v0, v1}, Lg0/z;->T(I)V

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4, v5}, LF0/c;->b(Lg0/z;Ljava/lang/String;Ljava/lang/String;Ld0/m;)Ld0/q;

    move-result-object v1

    iput-object v1, v6, LZ0/b$d;->b:Ld0/q;

    const v2, 0x616c6163

    const/4 v13, 0x4

    const/16 v16, 0x3

    const/16 v17, 0x0

    const/16 v18, 0x1

    const/16 v20, 0x2

    const/16 v21, 0x8

    goto/16 :goto_12

    :cond_35
    const v2, 0x646d6c70

    if-ne v1, v2, :cond_37

    if-lez v14, :cond_36

    move v9, v14

    const/4 v2, -0x1

    const/4 v11, 0x2

    goto/16 :goto_f

    :cond_36
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid sample rate for Dolby TrueHD MLP stream: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v13, 0x0

    invoke-static {v0, v13}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    move-result-object v0

    throw v0

    :cond_37
    const/4 v13, 0x0

    const v2, 0x64647473

    if-eq v1, v2, :cond_38

    const v2, 0x75647473

    if-ne v1, v2, :cond_39

    :cond_38
    const v2, 0x616c6163

    const/4 v13, 0x4

    const/16 v16, 0x3

    const/16 v17, 0x0

    const/16 v18, 0x1

    const/16 v20, 0x2

    const/16 v21, 0x8

    goto/16 :goto_11

    :cond_39
    const v2, 0x644f7073

    const/16 v21, 0x8

    if-ne v1, v2, :cond_3a

    add-int/lit8 v1, v8, -0x8

    sget-object v2, LZ0/b;->a:[B

    array-length v15, v2

    add-int/2addr v15, v1

    invoke-static {v2, v15}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v15

    add-int/lit8 v13, v12, 0x8

    invoke-virtual {v0, v13}, Lg0/z;->T(I)V

    array-length v2, v2

    invoke-virtual {v0, v15, v2, v1}, Lg0/z;->l([BII)V

    invoke-static {v15}, LF0/K;->a([B)Ljava/util/List;

    move-result-object v15

    const/4 v2, -0x1

    const/4 v13, 0x4

    const/16 v16, 0x3

    const/16 v17, 0x0

    const/16 v18, 0x1

    const v19, 0x616c6163

    const/16 v20, 0x2

    goto/16 :goto_16

    :cond_3a
    const v2, 0x64664c61

    if-ne v1, v2, :cond_3b

    add-int/lit8 v1, v8, -0xc

    add-int/lit8 v2, v8, -0x8

    new-array v2, v2, [B

    const/16 v13, 0x66

    const/4 v15, 0x0

    aput-byte v13, v2, v15

    const/16 v13, 0x4c

    const/16 v18, 0x1

    aput-byte v13, v2, v18

    const/16 v13, 0x61

    const/16 v20, 0x2

    aput-byte v13, v2, v20

    const/16 v13, 0x43

    const/16 v16, 0x3

    aput-byte v13, v2, v16

    add-int/lit8 v13, v12, 0xc

    invoke-virtual {v0, v13}, Lg0/z;->T(I)V

    const/4 v13, 0x4

    invoke-virtual {v0, v2, v13, v1}, Lg0/z;->l([BII)V

    invoke-static {v2}, LX2/v;->Z(Ljava/lang/Object;)LX2/v;

    move-result-object v15

    const/4 v2, -0x1

    const/16 v17, 0x0

    const v19, 0x616c6163

    goto/16 :goto_16

    :cond_3b
    const v2, 0x616c6163

    const/4 v13, 0x4

    const/16 v16, 0x3

    const/16 v18, 0x1

    const/16 v20, 0x2

    if-ne v1, v2, :cond_3c

    add-int/lit8 v1, v8, -0xc

    new-array v9, v1, [B

    add-int/lit8 v11, v12, 0xc

    invoke-virtual {v0, v11}, Lg0/z;->T(I)V

    const/4 v11, 0x0

    invoke-virtual {v0, v9, v11, v1}, Lg0/z;->l([BII)V

    invoke-static {v9}, Lg0/d;->e([B)Landroid/util/Pair;

    move-result-object v1

    iget-object v15, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Integer;

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v9}, LX2/v;->Z(Ljava/lang/Object;)LX2/v;

    move-result-object v9

    move/from16 v19, v2

    move/from16 v17, v11

    const/4 v2, -0x1

    move v11, v1

    move/from16 v23, v15

    move-object v15, v9

    move/from16 v9, v23

    goto/16 :goto_16

    :cond_3c
    const/16 v17, 0x0

    goto :goto_12

    :goto_11
    new-instance v1, Ld0/q$b;

    invoke-direct {v1}, Ld0/q$b;-><init>()V

    invoke-virtual {v1, v3}, Ld0/q$b;->Z(I)Ld0/q$b;

    move-result-object v1

    invoke-virtual {v1, v7}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    move-result-object v1

    invoke-virtual {v1, v11}, Ld0/q$b;->N(I)Ld0/q$b;

    move-result-object v1

    invoke-virtual {v1, v9}, Ld0/q$b;->p0(I)Ld0/q$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Ld0/q$b;->U(Ld0/m;)Ld0/q$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Ld0/q$b;->e0(Ljava/lang/String;)Ld0/q$b;

    move-result-object v1

    invoke-virtual {v1}, Ld0/q$b;->K()Ld0/q;

    move-result-object v1

    iput-object v1, v6, LZ0/b$d;->b:Ld0/q;

    :goto_12
    move/from16 v19, v2

    const/4 v2, -0x1

    goto :goto_16

    :goto_13
    if-ne v1, v2, :cond_3d

    move v1, v12

    :goto_14
    const/4 v2, -0x1

    goto :goto_15

    :cond_3d
    invoke-static {v0, v2, v12, v8}, LZ0/b;->d(Lg0/z;III)I

    move-result v1

    goto :goto_14

    :goto_15
    if-eq v1, v2, :cond_40

    invoke-static {v0, v1}, LZ0/b;->k(Lg0/z;I)LZ0/b$b;

    move-result-object v22

    invoke-static/range {v22 .. v22}, LZ0/b$b;->a(LZ0/b$b;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v22 .. v22}, LZ0/b$b;->b(LZ0/b$b;)[B

    move-result-object v1

    if-eqz v1, :cond_40

    const-string v15, "audio/vorbis"

    invoke-virtual {v15, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_3e

    invoke-static {v1}, LF0/W;->e([B)LX2/v;

    move-result-object v15

    goto :goto_16

    :cond_3e
    const-string v15, "audio/mp4a-latm"

    invoke-virtual {v15, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_3f

    invoke-static {v1}, LF0/a;->e([B)LF0/a$b;

    move-result-object v9

    iget v10, v9, LF0/a$b;->a:I

    iget v11, v9, LF0/a$b;->b:I

    iget-object v9, v9, LF0/a$b;->c:Ljava/lang/String;

    move/from16 v23, v10

    move-object v10, v9

    move/from16 v9, v23

    :cond_3f
    invoke-static {v1}, LX2/v;->Z(Ljava/lang/Object;)LX2/v;

    move-result-object v15

    :cond_40
    :goto_16
    add-int/2addr v12, v8

    move/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v13, p9

    goto/16 :goto_b

    :cond_41
    iget-object v0, v6, LZ0/b$d;->b:Ld0/q;

    if-nez v0, :cond_43

    if-eqz v7, :cond_43

    new-instance v0, Ld0/q$b;

    invoke-direct {v0}, Ld0/q$b;-><init>()V

    invoke-virtual {v0, v3}, Ld0/q$b;->Z(I)Ld0/q$b;

    move-result-object v0

    invoke-virtual {v0, v7}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    move-result-object v0

    invoke-virtual {v0, v10}, Ld0/q$b;->O(Ljava/lang/String;)Ld0/q$b;

    move-result-object v0

    invoke-virtual {v0, v11}, Ld0/q$b;->N(I)Ld0/q$b;

    move-result-object v0

    invoke-virtual {v0, v9}, Ld0/q$b;->p0(I)Ld0/q$b;

    move-result-object v0

    move/from16 v8, p7

    invoke-virtual {v0, v8}, Ld0/q$b;->i0(I)Ld0/q$b;

    move-result-object v0

    invoke-virtual {v0, v15}, Ld0/q$b;->b0(Ljava/util/List;)Ld0/q$b;

    move-result-object v0

    invoke-virtual {v0, v5}, Ld0/q$b;->U(Ld0/m;)Ld0/q$b;

    move-result-object v0

    invoke-virtual {v0, v4}, Ld0/q$b;->e0(Ljava/lang/String;)Ld0/q$b;

    move-result-object v0

    if-eqz v22, :cond_42

    invoke-static/range {v22 .. v22}, LZ0/b$b;->d(LZ0/b$b;)J

    move-result-wide v1

    invoke-static {v1, v2}, La3/f;->m(J)I

    move-result v1

    invoke-virtual {v0, v1}, Ld0/q$b;->M(I)Ld0/q$b;

    move-result-object v1

    invoke-static/range {v22 .. v22}, LZ0/b$b;->c(LZ0/b$b;)J

    move-result-wide v2

    invoke-static {v2, v3}, La3/f;->m(J)I

    move-result v2

    invoke-virtual {v1, v2}, Ld0/q$b;->j0(I)Ld0/q$b;

    :cond_42
    invoke-virtual {v0}, Ld0/q$b;->K()Ld0/q;

    move-result-object v0

    iput-object v0, v6, LZ0/b$d;->b:Ld0/q;

    :cond_43
    return-void
.end method

.method public static h(Lg0/z;)Ld0/h;
    .locals 15

    .line 1
    new-instance v0, Ld0/h$b;

    invoke-direct {v0}, Ld0/h$b;-><init>()V

    new-instance v1, Lg0/y;

    invoke-virtual {p0}, Lg0/z;->e()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lg0/y;-><init>([B)V

    invoke-virtual {p0}, Lg0/z;->f()I

    move-result p0

    const/16 v2, 0x8

    mul-int/2addr p0, v2

    invoke-virtual {v1, p0}, Lg0/y;->p(I)V

    const/4 p0, 0x1

    invoke-virtual {v1, p0}, Lg0/y;->s(I)V

    const/4 v3, 0x3

    invoke-virtual {v1, v3}, Lg0/y;->h(I)I

    move-result v4

    const/4 v5, 0x6

    invoke-virtual {v1, v5}, Lg0/y;->r(I)V

    invoke-virtual {v1}, Lg0/y;->g()Z

    move-result v5

    invoke-virtual {v1}, Lg0/y;->g()Z

    move-result v6

    const/16 v7, 0xc

    const/16 v8, 0xa

    const/4 v9, 0x2

    if-ne v4, v9, :cond_2

    if-eqz v5, :cond_2

    if-eqz v6, :cond_0

    move v4, v7

    goto :goto_0

    :cond_0
    move v4, v8

    :goto_0
    invoke-virtual {v0, v4}, Ld0/h$b;->g(I)Ld0/h$b;

    if-eqz v6, :cond_1

    move v8, v7

    :cond_1
    :goto_1
    invoke-virtual {v0, v8}, Ld0/h$b;->b(I)Ld0/h$b;

    goto :goto_3

    :cond_2
    if-gt v4, v9, :cond_5

    if-eqz v5, :cond_3

    move v4, v8

    goto :goto_2

    :cond_3
    move v4, v2

    :goto_2
    invoke-virtual {v0, v4}, Ld0/h$b;->g(I)Ld0/h$b;

    if-eqz v5, :cond_4

    goto :goto_1

    :cond_4
    move v8, v2

    goto :goto_1

    :cond_5
    :goto_3
    const/16 v4, 0xd

    invoke-virtual {v1, v4}, Lg0/y;->r(I)V

    invoke-virtual {v1}, Lg0/y;->q()V

    const/4 v5, 0x4

    invoke-virtual {v1, v5}, Lg0/y;->h(I)I

    move-result v6

    const-string v8, "AtomParsers"

    if-eq v6, p0, :cond_6

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported obu_type: "

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_4
    invoke-static {v8, p0}, Lg0/o;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ld0/h$b;->a()Ld0/h;

    move-result-object p0

    return-object p0

    :cond_6
    invoke-virtual {v1}, Lg0/y;->g()Z

    move-result v6

    if-eqz v6, :cond_7

    const-string p0, "Unsupported obu_extension_flag"

    goto :goto_4

    :cond_7
    invoke-virtual {v1}, Lg0/y;->g()Z

    move-result v6

    invoke-virtual {v1}, Lg0/y;->q()V

    if-eqz v6, :cond_8

    invoke-virtual {v1, v2}, Lg0/y;->h(I)I

    move-result v6

    const/16 v10, 0x7f

    if-le v6, v10, :cond_8

    const-string p0, "Excessive obu_size"

    goto :goto_4

    :cond_8
    invoke-virtual {v1, v3}, Lg0/y;->h(I)I

    move-result v6

    invoke-virtual {v1}, Lg0/y;->q()V

    invoke-virtual {v1}, Lg0/y;->g()Z

    move-result v10

    if-eqz v10, :cond_9

    const-string p0, "Unsupported reduced_still_picture_header"

    goto :goto_4

    :cond_9
    invoke-virtual {v1}, Lg0/y;->g()Z

    move-result v10

    if-eqz v10, :cond_a

    const-string p0, "Unsupported timing_info_present_flag"

    goto :goto_4

    :cond_a
    invoke-virtual {v1}, Lg0/y;->g()Z

    move-result v10

    if-eqz v10, :cond_b

    const-string p0, "Unsupported initial_display_delay_present_flag"

    goto :goto_4

    :cond_b
    const/4 v8, 0x5

    invoke-virtual {v1, v8}, Lg0/y;->h(I)I

    move-result v10

    const/4 v11, 0x0

    move v12, v11

    :goto_5
    const/4 v13, 0x7

    if-gt v12, v10, :cond_d

    invoke-virtual {v1, v7}, Lg0/y;->r(I)V

    invoke-virtual {v1, v8}, Lg0/y;->h(I)I

    move-result v14

    if-le v14, v13, :cond_c

    invoke-virtual {v1}, Lg0/y;->q()V

    :cond_c
    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    :cond_d
    invoke-virtual {v1, v5}, Lg0/y;->h(I)I

    move-result v7

    invoke-virtual {v1, v5}, Lg0/y;->h(I)I

    move-result v5

    add-int/2addr v7, p0

    invoke-virtual {v1, v7}, Lg0/y;->r(I)V

    add-int/2addr v5, p0

    invoke-virtual {v1, v5}, Lg0/y;->r(I)V

    invoke-virtual {v1}, Lg0/y;->g()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-virtual {v1, v13}, Lg0/y;->r(I)V

    :cond_e
    invoke-virtual {v1, v13}, Lg0/y;->r(I)V

    invoke-virtual {v1}, Lg0/y;->g()Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-virtual {v1, v9}, Lg0/y;->r(I)V

    :cond_f
    invoke-virtual {v1}, Lg0/y;->g()Z

    move-result v7

    if-eqz v7, :cond_10

    goto :goto_6

    :cond_10
    invoke-virtual {v1, p0}, Lg0/y;->h(I)I

    move-result v7

    if-lez v7, :cond_11

    :goto_6
    invoke-virtual {v1}, Lg0/y;->g()Z

    move-result v7

    if-nez v7, :cond_11

    invoke-virtual {v1, p0}, Lg0/y;->r(I)V

    :cond_11
    if-eqz v5, :cond_12

    invoke-virtual {v1, v3}, Lg0/y;->r(I)V

    :cond_12
    invoke-virtual {v1, v3}, Lg0/y;->r(I)V

    invoke-virtual {v1}, Lg0/y;->g()Z

    move-result v3

    if-ne v6, v9, :cond_13

    if-eqz v3, :cond_13

    invoke-virtual {v1}, Lg0/y;->q()V

    :cond_13
    if-eq v6, p0, :cond_14

    invoke-virtual {v1}, Lg0/y;->g()Z

    move-result v3

    if-eqz v3, :cond_14

    move v11, p0

    :cond_14
    invoke-virtual {v1}, Lg0/y;->g()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-virtual {v1, v2}, Lg0/y;->h(I)I

    move-result v3

    invoke-virtual {v1, v2}, Lg0/y;->h(I)I

    move-result v5

    invoke-virtual {v1, v2}, Lg0/y;->h(I)I

    move-result v2

    if-nez v11, :cond_15

    if-ne v3, p0, :cond_15

    if-ne v5, v4, :cond_15

    if-nez v2, :cond_15

    move v1, p0

    goto :goto_7

    :cond_15
    invoke-virtual {v1, p0}, Lg0/y;->h(I)I

    move-result v1

    :goto_7
    invoke-static {v3}, Ld0/h;->j(I)I

    move-result v2

    invoke-virtual {v0, v2}, Ld0/h$b;->d(I)Ld0/h$b;

    move-result-object v2

    if-ne v1, p0, :cond_16

    goto :goto_8

    :cond_16
    move p0, v9

    :goto_8
    invoke-virtual {v2, p0}, Ld0/h$b;->c(I)Ld0/h$b;

    move-result-object p0

    invoke-static {v5}, Ld0/h;->k(I)I

    move-result v1

    invoke-virtual {p0, v1}, Ld0/h$b;->e(I)Ld0/h$b;

    :cond_17
    invoke-virtual {v0}, Ld0/h$b;->a()Ld0/h;

    move-result-object p0

    return-object p0
.end method

.method public static i(Lg0/z;II)Landroid/util/Pair;
    .locals 11

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    move v5, v1

    .line 7
    move v7, v2

    .line 8
    move-object v4, v3

    .line 9
    move-object v6, v4

    .line 10
    :goto_0
    sub-int v8, v0, p1

    .line 11
    .line 12
    if-ge v8, p2, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 18
    .line 19
    .line 20
    move-result v8

    .line 21
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 22
    .line 23
    .line 24
    move-result v9

    .line 25
    const v10, 0x66726d61

    .line 26
    .line 27
    .line 28
    if-ne v9, v10, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    const v10, 0x7363686d

    .line 40
    .line 41
    .line 42
    if-ne v9, v10, :cond_1

    .line 43
    .line 44
    const/4 v4, 0x4

    .line 45
    invoke-virtual {p0, v4}, Lg0/z;->U(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v4}, Lg0/z;->D(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const v10, 0x73636869

    .line 54
    .line 55
    .line 56
    if-ne v9, v10, :cond_2

    .line 57
    .line 58
    move v5, v0

    .line 59
    move v7, v8

    .line 60
    :cond_2
    :goto_1
    add-int/2addr v0, v8

    .line 61
    goto :goto_0

    .line 62
    :cond_3
    const-string p1, "cenc"

    .line 63
    .line 64
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_5

    .line 69
    .line 70
    const-string p1, "cbc1"

    .line 71
    .line 72
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-nez p1, :cond_5

    .line 77
    .line 78
    const-string p1, "cens"

    .line 79
    .line 80
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-nez p1, :cond_5

    .line 85
    .line 86
    const-string p1, "cbcs"

    .line 87
    .line 88
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_4

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    return-object v3

    .line 96
    :cond_5
    :goto_2
    const/4 p1, 0x1

    .line 97
    if-eqz v6, :cond_6

    .line 98
    .line 99
    move p2, p1

    .line 100
    goto :goto_3

    .line 101
    :cond_6
    move p2, v2

    .line 102
    :goto_3
    const-string v0, "frma atom is mandatory"

    .line 103
    .line 104
    invoke-static {p2, v0}, LF0/u;->a(ZLjava/lang/String;)V

    .line 105
    .line 106
    .line 107
    if-eq v5, v1, :cond_7

    .line 108
    .line 109
    move p2, p1

    .line 110
    goto :goto_4

    .line 111
    :cond_7
    move p2, v2

    .line 112
    :goto_4
    const-string v0, "schi atom is mandatory"

    .line 113
    .line 114
    invoke-static {p2, v0}, LF0/u;->a(ZLjava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-static {p0, v5, v7, v4}, LZ0/b;->v(Lg0/z;IILjava/lang/String;)LZ0/t;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    if-eqz p0, :cond_8

    .line 122
    .line 123
    move v2, p1

    .line 124
    :cond_8
    const-string p1, "tenc atom is mandatory"

    .line 125
    .line 126
    invoke-static {v2, p1}, LF0/u;->a(ZLjava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-static {p0}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, LZ0/t;

    .line 134
    .line 135
    invoke-static {v6, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    return-object p0
.end method

.method public static j(LZ0/a$a;)Landroid/util/Pair;
    .locals 8

    .line 1
    const v0, 0x656c7374

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, LZ0/a$a;->g(I)LZ0/a$b;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, LZ0/a$b;->b:Lg0/z;

    .line 13
    .line 14
    const/16 v0, 0x8

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, LZ0/a;->c(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0}, Lg0/z;->K()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    new-array v2, v1, [J

    .line 32
    .line 33
    new-array v3, v1, [J

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    :goto_0
    if-ge v4, v1, :cond_4

    .line 37
    .line 38
    const/4 v5, 0x1

    .line 39
    if-ne v0, v5, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Lg0/z;->L()J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {p0}, Lg0/z;->I()J

    .line 47
    .line 48
    .line 49
    move-result-wide v6

    .line 50
    :goto_1
    aput-wide v6, v2, v4

    .line 51
    .line 52
    if-ne v0, v5, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0}, Lg0/z;->z()J

    .line 55
    .line 56
    .line 57
    move-result-wide v6

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    int-to-long v6, v6

    .line 64
    :goto_2
    aput-wide v6, v3, v4

    .line 65
    .line 66
    invoke-virtual {p0}, Lg0/z;->C()S

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-ne v6, v5, :cond_3

    .line 71
    .line 72
    const/4 v5, 0x2

    .line 73
    invoke-virtual {p0, v5}, Lg0/z;->U(I)V

    .line 74
    .line 75
    .line 76
    add-int/lit8 v4, v4, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 80
    .line 81
    const-string v0, "Unsupported media rate."

    .line 82
    .line 83
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p0

    .line 87
    :cond_4
    invoke-static {v2, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
.end method

.method public static k(Lg0/z;I)LZ0/b$b;
    .locals 12

    .line 1
    add-int/lit8 p1, p1, 0xc

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lg0/z;->T(I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1}, Lg0/z;->U(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, LZ0/b;->l(Lg0/z;)I

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-virtual {p0, v0}, Lg0/z;->U(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lg0/z;->G()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    and-int/lit16 v2, v1, 0x80

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lg0/z;->U(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    and-int/lit8 v2, v1, 0x40

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Lg0/z;->G()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p0, v2}, Lg0/z;->U(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    and-int/lit8 v1, v1, 0x20

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lg0/z;->U(I)V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p0, p1}, Lg0/z;->U(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, LZ0/b;->l(Lg0/z;)I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lg0/z;->G()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {v0}, Ld0/z;->h(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v0, "audio/mpeg"

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    const-string v0, "audio/vnd.dts"

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_6

    .line 75
    .line 76
    const-string v0, "audio/vnd.dts.hd"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    const/4 v0, 0x4

    .line 86
    invoke-virtual {p0, v0}, Lg0/z;->U(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lg0/z;->I()J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    invoke-virtual {p0}, Lg0/z;->I()J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    invoke-virtual {p0, p1}, Lg0/z;->U(I)V

    .line 98
    .line 99
    .line 100
    invoke-static {p0}, LZ0/b;->l(Lg0/z;)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    new-array v5, p1, [B

    .line 105
    .line 106
    const/4 v6, 0x0

    .line 107
    invoke-virtual {p0, v5, v6, p1}, Lg0/z;->l([BII)V

    .line 108
    .line 109
    .line 110
    new-instance p0, LZ0/b$b;

    .line 111
    .line 112
    const-wide/16 v6, 0x0

    .line 113
    .line 114
    cmp-long p1, v3, v6

    .line 115
    .line 116
    const-wide/16 v8, -0x1

    .line 117
    .line 118
    if-lez p1, :cond_4

    .line 119
    .line 120
    move-wide v10, v3

    .line 121
    goto :goto_0

    .line 122
    :cond_4
    move-wide v10, v8

    .line 123
    :goto_0
    cmp-long p1, v0, v6

    .line 124
    .line 125
    if-lez p1, :cond_5

    .line 126
    .line 127
    move-wide v6, v0

    .line 128
    goto :goto_1

    .line 129
    :cond_5
    move-wide v6, v8

    .line 130
    :goto_1
    move-object v1, p0

    .line 131
    move-object v3, v5

    .line 132
    move-wide v4, v10

    .line 133
    invoke-direct/range {v1 .. v7}, LZ0/b$b;-><init>(Ljava/lang/String;[BJJ)V

    .line 134
    .line 135
    .line 136
    return-object p0

    .line 137
    :cond_6
    :goto_2
    new-instance p0, LZ0/b$b;

    .line 138
    .line 139
    const-wide/16 v4, -0x1

    .line 140
    .line 141
    const-wide/16 v6, -0x1

    .line 142
    .line 143
    const/4 v3, 0x0

    .line 144
    move-object v1, p0

    .line 145
    invoke-direct/range {v1 .. v7}, LZ0/b$b;-><init>(Ljava/lang/String;[BJJ)V

    .line 146
    .line 147
    .line 148
    return-object p0
.end method

.method public static l(Lg0/z;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lg0/z;->G()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v1, v0, 0x7f

    .line 6
    .line 7
    :goto_0
    const/16 v2, 0x80

    .line 8
    .line 9
    and-int/2addr v0, v2

    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lg0/z;->G()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    shl-int/lit8 v1, v1, 0x7

    .line 17
    .line 18
    and-int/lit8 v2, v0, 0x7f

    .line 19
    .line 20
    or-int/2addr v1, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return v1
.end method

.method public static m(Lg0/z;)I
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public static n(Lg0/z;I)Ld0/x;
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lg0/z;->U(I)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lg0/z;->f()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-ge v1, p1, :cond_1

    .line 16
    .line 17
    invoke-static {p0}, LZ0/j;->c(Lg0/z;)Ld0/x$b;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    new-instance p0, Ld0/x;

    .line 36
    .line 37
    invoke-direct {p0, v0}, Ld0/x;-><init>(Ljava/util/List;)V

    .line 38
    .line 39
    .line 40
    :goto_1
    return-object p0
.end method

.method public static o(Lg0/z;)Landroid/util/Pair;
    .locals 4

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, LZ0/a;->c(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    move v2, v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v2, 0x10

    .line 19
    .line 20
    :goto_0
    invoke-virtual {p0, v2}, Lg0/z;->U(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lg0/z;->I()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    :cond_1
    invoke-virtual {p0, v0}, Lg0/z;->U(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lg0/z;->M()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v1, ""

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    shr-int/lit8 v1, p0, 0xa

    .line 48
    .line 49
    and-int/lit8 v1, v1, 0x1f

    .line 50
    .line 51
    add-int/lit8 v1, v1, 0x60

    .line 52
    .line 53
    int-to-char v1, v1

    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    shr-int/lit8 v1, p0, 0x5

    .line 58
    .line 59
    and-int/lit8 v1, v1, 0x1f

    .line 60
    .line 61
    add-int/lit8 v1, v1, 0x60

    .line 62
    .line 63
    int-to-char v1, v1

    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    and-int/lit8 p0, p0, 0x1f

    .line 68
    .line 69
    add-int/lit8 p0, p0, 0x60

    .line 70
    .line 71
    int-to-char p0, p0

    .line 72
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0
.end method

.method public static p(LZ0/a$a;)Ld0/x;
    .locals 10

    .line 1
    const v0, 0x68646c72    # 4.3148E24f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, LZ0/a$a;->g(I)LZ0/a$b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const v1, 0x6b657973

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, LZ0/a$a;->g(I)LZ0/a$b;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const v2, 0x696c7374

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v2}, LZ0/a$a;->g(I)LZ0/a$b;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v0, :cond_6

    .line 24
    .line 25
    if-eqz v1, :cond_6

    .line 26
    .line 27
    if-eqz p0, :cond_6

    .line 28
    .line 29
    iget-object v0, v0, LZ0/a$b;->b:Lg0/z;

    .line 30
    .line 31
    invoke-static {v0}, LZ0/b;->m(Lg0/z;)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const v3, 0x6d647461

    .line 36
    .line 37
    .line 38
    if-eq v0, v3, :cond_0

    .line 39
    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :cond_0
    iget-object v0, v1, LZ0/a$b;->b:Lg0/z;

    .line 43
    .line 44
    const/16 v1, 0xc

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lg0/z;->T(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lg0/z;->p()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    new-array v3, v1, [Ljava/lang/String;

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    :goto_0
    const/16 v5, 0x8

    .line 57
    .line 58
    if-ge v4, v1, :cond_1

    .line 59
    .line 60
    invoke-virtual {v0}, Lg0/z;->p()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    const/4 v7, 0x4

    .line 65
    invoke-virtual {v0, v7}, Lg0/z;->U(I)V

    .line 66
    .line 67
    .line 68
    sub-int/2addr v6, v5

    .line 69
    invoke-virtual {v0, v6}, Lg0/z;->D(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    aput-object v5, v3, v4

    .line 74
    .line 75
    add-int/lit8 v4, v4, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    iget-object p0, p0, LZ0/a$b;->b:Lg0/z;

    .line 79
    .line 80
    invoke-virtual {p0, v5}, Lg0/z;->T(I)V

    .line 81
    .line 82
    .line 83
    new-instance v0, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    :goto_1
    invoke-virtual {p0}, Lg0/z;->a()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-le v4, v5, :cond_4

    .line 93
    .line 94
    invoke-virtual {p0}, Lg0/z;->f()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    add-int/lit8 v7, v7, -0x1

    .line 107
    .line 108
    if-ltz v7, :cond_2

    .line 109
    .line 110
    if-ge v7, v1, :cond_2

    .line 111
    .line 112
    aget-object v7, v3, v7

    .line 113
    .line 114
    add-int v8, v4, v6

    .line 115
    .line 116
    invoke-static {p0, v8, v7}, LZ0/j;->h(Lg0/z;ILjava/lang/String;)Lh0/a;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    if-eqz v7, :cond_3

    .line 121
    .line 122
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_2
    new-instance v8, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v9, "Skipped metadata with unknown key index: "

    .line 132
    .line 133
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    const-string v8, "AtomParsers"

    .line 144
    .line 145
    invoke-static {v8, v7}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :cond_3
    :goto_2
    add-int/2addr v4, v6

    .line 149
    invoke-virtual {p0, v4}, Lg0/z;->T(I)V

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-eqz p0, :cond_5

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_5
    new-instance v2, Ld0/x;

    .line 161
    .line 162
    invoke-direct {v2, v0}, Ld0/x;-><init>(Ljava/util/List;)V

    .line 163
    .line 164
    .line 165
    :cond_6
    :goto_3
    return-object v2
.end method

.method public static q(Lg0/z;IIILZ0/b$d;)V
    .locals 0

    .line 1
    add-int/lit8 p2, p2, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lg0/z;->T(I)V

    .line 4
    .line 5
    .line 6
    const p2, 0x6d657474

    .line 7
    .line 8
    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lg0/z;->A()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lg0/z;->A()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    new-instance p1, Ld0/q$b;

    .line 21
    .line 22
    invoke-direct {p1}, Ld0/q$b;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p3}, Ld0/q$b;->Z(I)Ld0/q$b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1, p0}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ld0/q$b;->K()Ld0/q;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iput-object p0, p4, LZ0/b$d;->b:Ld0/q;

    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public static r(Lg0/z;)Lh0/c;
    .locals 11

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, LZ0/a;->c(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lg0/z;->I()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-virtual {p0}, Lg0/z;->I()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    :goto_0
    move-wide v5, v0

    .line 25
    move-wide v7, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {p0}, Lg0/z;->z()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-virtual {p0}, Lg0/z;->z()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    goto :goto_0

    .line 36
    :goto_1
    invoke-virtual {p0}, Lg0/z;->I()J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    new-instance p0, Lh0/c;

    .line 41
    .line 42
    move-object v4, p0

    .line 43
    invoke-direct/range {v4 .. v10}, Lh0/c;-><init>(JJJ)V

    .line 44
    .line 45
    .line 46
    return-object p0
.end method

.method public static s(Lg0/z;I)F
    .locals 0

    .line 1
    add-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lg0/z;->T(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lg0/z;->K()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {p0}, Lg0/z;->K()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    int-to-float p1, p1

    .line 15
    int-to-float p0, p0

    .line 16
    div-float/2addr p1, p0

    .line 17
    return p1
.end method

.method public static t(Lg0/z;II)[B
    .locals 4

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    :goto_0
    sub-int v1, v0, p1

    .line 4
    .line 5
    if-ge v1, p2, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const v3, 0x70726f6a

    .line 19
    .line 20
    .line 21
    if-ne v2, v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lg0/z;->e()[B

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    add-int/2addr v1, v0

    .line 28
    invoke-static {p0, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_0
    add-int/2addr v0, v1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public static u(Lg0/z;II)Landroid/util/Pair;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lg0/z;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_0
    sub-int v1, v0, p1

    .line 6
    .line 7
    if-ge v1, p2, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-lez v1, :cond_0

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const/4 v2, 0x0

    .line 21
    :goto_1
    const-string v3, "childAtomSize must be positive"

    .line 22
    .line 23
    invoke-static {v2, v3}, LF0/u;->a(ZLjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const v3, 0x73696e66

    .line 31
    .line 32
    .line 33
    if-ne v2, v3, :cond_1

    .line 34
    .line 35
    invoke-static {p0, v0, v1}, LZ0/b;->i(Lg0/z;II)Landroid/util/Pair;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    return-object v2

    .line 42
    :cond_1
    add-int/2addr v0, v1

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 p0, 0x0

    .line 45
    return-object p0
.end method

.method public static v(Lg0/z;IILjava/lang/String;)LZ0/t;
    .locals 11

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    :goto_0
    sub-int v1, v0, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v1, p2, :cond_4

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const v4, 0x74656e63

    .line 20
    .line 21
    .line 22
    if-ne v3, v4, :cond_3

    .line 23
    .line 24
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-static {p1}, LZ0/a;->c(I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    const/4 p2, 0x1

    .line 33
    invoke-virtual {p0, p2}, Lg0/z;->U(I)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    if-nez p1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0, p2}, Lg0/z;->U(I)V

    .line 40
    .line 41
    .line 42
    move v8, v0

    .line 43
    move v9, v8

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-virtual {p0}, Lg0/z;->G()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    and-int/lit16 v1, p1, 0xf0

    .line 50
    .line 51
    shr-int/lit8 v1, v1, 0x4

    .line 52
    .line 53
    and-int/lit8 p1, p1, 0xf

    .line 54
    .line 55
    move v9, p1

    .line 56
    move v8, v1

    .line 57
    :goto_1
    invoke-virtual {p0}, Lg0/z;->G()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-ne p1, p2, :cond_1

    .line 62
    .line 63
    move v4, p2

    .line 64
    goto :goto_2

    .line 65
    :cond_1
    move v4, v0

    .line 66
    :goto_2
    invoke-virtual {p0}, Lg0/z;->G()I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    const/16 p1, 0x10

    .line 71
    .line 72
    new-array v7, p1, [B

    .line 73
    .line 74
    invoke-virtual {p0, v7, v0, p1}, Lg0/z;->l([BII)V

    .line 75
    .line 76
    .line 77
    if-eqz v4, :cond_2

    .line 78
    .line 79
    if-nez v6, :cond_2

    .line 80
    .line 81
    invoke-virtual {p0}, Lg0/z;->G()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    new-array v2, p1, [B

    .line 86
    .line 87
    invoke-virtual {p0, v2, v0, p1}, Lg0/z;->l([BII)V

    .line 88
    .line 89
    .line 90
    :cond_2
    move-object v10, v2

    .line 91
    new-instance p0, LZ0/t;

    .line 92
    .line 93
    move-object v3, p0

    .line 94
    move-object v5, p3

    .line 95
    invoke-direct/range {v3 .. v10}, LZ0/t;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 96
    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_3
    add-int/2addr v0, v1

    .line 100
    goto :goto_0

    .line 101
    :cond_4
    return-object v2
.end method

.method public static w(LZ0/s;LZ0/a$a;LF0/E;)LZ0/v;
    .locals 37

    .line 1
    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const v3, 0x7374737a

    invoke-virtual {v0, v3}, LZ0/a$a;->g(I)LZ0/a$b;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance v5, LZ0/b$e;

    iget-object v6, v1, LZ0/s;->f:Ld0/q;

    invoke-direct {v5, v3, v6}, LZ0/b$e;-><init>(LZ0/a$b;Ld0/q;)V

    goto :goto_0

    :cond_0
    const v3, 0x73747a32

    invoke-virtual {v0, v3}, LZ0/a$a;->g(I)LZ0/a$b;

    move-result-object v3

    if-eqz v3, :cond_32

    new-instance v5, LZ0/b$f;

    invoke-direct {v5, v3}, LZ0/b$f;-><init>(LZ0/a$b;)V

    :goto_0
    invoke-interface {v5}, LZ0/b$c;->b()I

    move-result v3

    const/4 v6, 0x0

    if-nez v3, :cond_1

    new-instance v9, LZ0/v;

    new-array v2, v6, [J

    new-array v3, v6, [I

    new-array v5, v6, [J

    new-array v6, v6, [I

    const-wide/16 v7, 0x0

    const/4 v4, 0x0

    move-object v0, v9

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v8}, LZ0/v;-><init>(LZ0/s;[J[II[J[IJ)V

    return-object v9

    :cond_1
    const v7, 0x7374636f

    invoke-virtual {v0, v7}, LZ0/a$a;->g(I)LZ0/a$b;

    move-result-object v7

    const/4 v8, 0x1

    if-nez v7, :cond_2

    const v7, 0x636f3634

    invoke-virtual {v0, v7}, LZ0/a$a;->g(I)LZ0/a$b;

    move-result-object v7

    invoke-static {v7}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LZ0/a$b;

    move v9, v8

    goto :goto_1

    :cond_2
    move v9, v6

    :goto_1
    iget-object v7, v7, LZ0/a$b;->b:Lg0/z;

    const v10, 0x73747363

    invoke-virtual {v0, v10}, LZ0/a$a;->g(I)LZ0/a$b;

    move-result-object v10

    invoke-static {v10}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LZ0/a$b;

    iget-object v10, v10, LZ0/a$b;->b:Lg0/z;

    const v11, 0x73747473

    invoke-virtual {v0, v11}, LZ0/a$a;->g(I)LZ0/a$b;

    move-result-object v11

    invoke-static {v11}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LZ0/a$b;

    iget-object v11, v11, LZ0/a$b;->b:Lg0/z;

    const v12, 0x73747373

    invoke-virtual {v0, v12}, LZ0/a$a;->g(I)LZ0/a$b;

    move-result-object v12

    if-eqz v12, :cond_3

    iget-object v12, v12, LZ0/a$b;->b:Lg0/z;

    goto :goto_2

    :cond_3
    const/4 v12, 0x0

    :goto_2
    const v13, 0x63747473

    invoke-virtual {v0, v13}, LZ0/a$a;->g(I)LZ0/a$b;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, v0, LZ0/a$b;->b:Lg0/z;

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    new-instance v13, LZ0/b$a;

    invoke-direct {v13, v10, v7, v9}, LZ0/b$a;-><init>(Lg0/z;Lg0/z;Z)V

    const/16 v7, 0xc

    invoke-virtual {v11, v7}, Lg0/z;->T(I)V

    invoke-virtual {v11}, Lg0/z;->K()I

    move-result v9

    sub-int/2addr v9, v8

    invoke-virtual {v11}, Lg0/z;->K()I

    move-result v10

    invoke-virtual {v11}, Lg0/z;->K()I

    move-result v14

    if-eqz v0, :cond_5

    invoke-virtual {v0, v7}, Lg0/z;->T(I)V

    invoke-virtual {v0}, Lg0/z;->K()I

    move-result v15

    goto :goto_4

    :cond_5
    move v15, v6

    :goto_4
    const/4 v4, -0x1

    if-eqz v12, :cond_7

    invoke-virtual {v12, v7}, Lg0/z;->T(I)V

    invoke-virtual {v12}, Lg0/z;->K()I

    move-result v7

    if-lez v7, :cond_6

    invoke-virtual {v12}, Lg0/z;->K()I

    move-result v16

    add-int/lit8 v16, v16, -0x1

    goto :goto_5

    :cond_6
    move/from16 v16, v4

    const/4 v12, 0x0

    goto :goto_5

    :cond_7
    move/from16 v16, v4

    move v7, v6

    :goto_5
    invoke-interface {v5}, LZ0/b$c;->a()I

    move-result v6

    iget-object v8, v1, LZ0/s;->f:Ld0/q;

    iget-object v8, v8, Ld0/q;->n:Ljava/lang/String;

    if-eq v6, v4, :cond_9

    const-string v4, "audio/raw"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    const-string v4, "audio/g711-mlaw"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    const-string v4, "audio/g711-alaw"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    :cond_8
    if-nez v9, :cond_9

    if-nez v15, :cond_9

    if-nez v7, :cond_9

    move/from16 p1, v7

    const/4 v4, 0x1

    goto :goto_6

    :cond_9
    move/from16 p1, v7

    const/4 v4, 0x0

    :goto_6
    if-eqz v4, :cond_b

    iget v0, v13, LZ0/b$a;->a:I

    new-array v4, v0, [J

    new-array v0, v0, [I

    :goto_7
    invoke-virtual {v13}, LZ0/b$a;->a()Z

    move-result v5

    if-eqz v5, :cond_a

    iget v5, v13, LZ0/b$a;->b:I

    iget-wide v9, v13, LZ0/b$a;->d:J

    aput-wide v9, v4, v5

    iget v9, v13, LZ0/b$a;->c:I

    aput v9, v0, v5

    goto :goto_7

    :cond_a
    int-to-long v9, v14

    invoke-static {v6, v4, v0, v9, v10}, LZ0/e;->a(I[J[IJ)LZ0/e$b;

    move-result-object v0

    iget-object v4, v0, LZ0/e$b;->a:[J

    iget-object v5, v0, LZ0/e$b;->b:[I

    iget v6, v0, LZ0/e$b;->c:I

    iget-object v9, v0, LZ0/e$b;->d:[J

    iget-object v10, v0, LZ0/e$b;->e:[I

    iget-wide v11, v0, LZ0/e$b;->f:J

    move-object v14, v1

    move v0, v3

    move-object v2, v4

    move-object v3, v5

    move v4, v6

    move-object v13, v10

    move-wide v15, v11

    move-object v12, v9

    goto/16 :goto_14

    :cond_b
    new-array v4, v3, [J

    new-array v6, v3, [I

    new-array v7, v3, [J

    new-array v8, v3, [I

    move-object/from16 v24, v11

    move/from16 v2, v16

    const/4 v1, 0x0

    const/4 v11, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    move/from16 v16, v15

    move v15, v14

    move v14, v10

    move/from16 v36, v9

    move/from16 v9, p1

    :goto_8
    move/from16 p1, v36

    const-string v10, "AtomParsers"

    if-ge v1, v3, :cond_14

    move-wide/from16 v28, v27

    move/from16 v27, v21

    const/16 v21, 0x1

    :goto_9
    if-nez v27, :cond_c

    invoke-virtual {v13}, LZ0/b$a;->a()Z

    move-result v21

    if-eqz v21, :cond_c

    move/from16 v30, v14

    move/from16 v31, v15

    iget-wide v14, v13, LZ0/b$a;->d:J

    move/from16 v32, v3

    iget v3, v13, LZ0/b$a;->c:I

    move/from16 v27, v3

    move-wide/from16 v28, v14

    move/from16 v14, v30

    move/from16 v15, v31

    move/from16 v3, v32

    goto :goto_9

    :cond_c
    move/from16 v32, v3

    move/from16 v30, v14

    move/from16 v31, v15

    if-nez v21, :cond_d

    const-string v2, "Unexpected end of chunk data"

    invoke-static {v10, v2}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v4

    invoke-static {v6, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v6

    invoke-static {v7, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v7

    invoke-static {v8, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v8

    move v3, v1

    move/from16 v2, v22

    move/from16 v1, v27

    goto/16 :goto_e

    :cond_d
    if-eqz v0, :cond_f

    :goto_a
    if-nez v23, :cond_e

    if-lez v16, :cond_e

    invoke-virtual {v0}, Lg0/z;->K()I

    move-result v23

    invoke-virtual {v0}, Lg0/z;->p()I

    move-result v22

    add-int/lit8 v16, v16, -0x1

    goto :goto_a

    :cond_e
    add-int/lit8 v23, v23, -0x1

    :cond_f
    move/from16 v3, v22

    aput-wide v28, v4, v1

    invoke-interface {v5}, LZ0/b$c;->c()I

    move-result v10

    aput v10, v6, v1

    if-le v10, v11, :cond_10

    move v11, v10

    :cond_10
    int-to-long v14, v3

    add-long v14, v25, v14

    aput-wide v14, v7, v1

    if-nez v12, :cond_11

    const/4 v10, 0x1

    goto :goto_b

    :cond_11
    const/4 v10, 0x0

    :goto_b
    aput v10, v8, v1

    if-ne v1, v2, :cond_12

    const/4 v10, 0x1

    aput v10, v8, v1

    add-int/lit8 v9, v9, -0x1

    if-lez v9, :cond_12

    invoke-static {v12}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg0/z;

    invoke-virtual {v2}, Lg0/z;->K()I

    move-result v2

    sub-int/2addr v2, v10

    :cond_12
    move v15, v2

    move v10, v3

    move/from16 v14, v31

    int-to-long v2, v14

    add-long v25, v25, v2

    add-int/lit8 v2, v30, -0x1

    if-nez v2, :cond_13

    if-lez p1, :cond_13

    invoke-virtual/range {v24 .. v24}, Lg0/z;->K()I

    move-result v2

    invoke-virtual/range {v24 .. v24}, Lg0/z;->p()I

    move-result v3

    add-int/lit8 v14, p1, -0x1

    :goto_c
    move/from16 p1, v2

    goto :goto_d

    :cond_13
    move v3, v14

    move/from16 v14, p1

    goto :goto_c

    :goto_d
    aget v2, v6, v1

    move/from16 v21, v3

    int-to-long v2, v2

    add-long v2, v28, v2

    add-int/lit8 v22, v27, -0x1

    add-int/lit8 v1, v1, 0x1

    move-wide/from16 v27, v2

    move v2, v15

    move/from16 v15, v21

    move/from16 v21, v22

    move/from16 v3, v32

    move/from16 v22, v10

    move/from16 v36, v14

    move/from16 v14, p1

    goto/16 :goto_8

    :cond_14
    move/from16 v32, v3

    move/from16 v30, v14

    move/from16 v1, v21

    move/from16 v2, v22

    :goto_e
    int-to-long v12, v2

    add-long v12, v25, v12

    if-eqz v0, :cond_16

    :goto_f
    if-lez v16, :cond_16

    invoke-virtual {v0}, Lg0/z;->K()I

    move-result v2

    if-eqz v2, :cond_15

    const/4 v0, 0x0

    goto :goto_10

    :cond_15
    invoke-virtual {v0}, Lg0/z;->p()I

    add-int/lit8 v16, v16, -0x1

    goto :goto_f

    :cond_16
    const/4 v0, 0x1

    :goto_10
    if-nez v9, :cond_18

    if-nez v30, :cond_18

    if-nez v1, :cond_18

    if-nez p1, :cond_18

    move/from16 v2, v23

    if-nez v2, :cond_19

    if-nez v0, :cond_17

    goto :goto_11

    :cond_17
    move-object/from16 v14, p0

    goto :goto_13

    :cond_18
    move/from16 v2, v23

    :cond_19
    :goto_11
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Inconsistent stbl box for track "

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v14, p0

    iget v15, v14, LZ0/s;->a:I

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v15, ": remainingSynchronizationSamples "

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ", remainingSamplesAtTimestampDelta "

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v9, v30

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ", remainingSamplesInChunk "

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", remainingTimestampDeltaChanges "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v9, p1

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", remainingSamplesAtTimestampOffset "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-nez v0, :cond_1a

    const-string v0, ", ctts invalid"

    goto :goto_12

    :cond_1a
    const-string v0, ""

    :goto_12
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    :goto_13
    move v0, v3

    move-object v2, v4

    move-object v3, v6

    move v4, v11

    move-wide v15, v12

    move-object v12, v7

    move-object v13, v8

    :goto_14
    const-wide/32 v7, 0xf4240

    iget-wide v9, v14, LZ0/s;->c:J

    move-wide v5, v15

    invoke-static/range {v5 .. v10}, Lg0/M;->W0(JJJ)J

    move-result-wide v7

    iget-object v1, v14, LZ0/s;->h:[J

    const-wide/32 v10, 0xf4240

    if-nez v1, :cond_1b

    iget-wide v0, v14, LZ0/s;->c:J

    invoke-static {v12, v10, v11, v0, v1}, Lg0/M;->X0([JJJ)V

    new-instance v9, LZ0/v;

    move-object v0, v9

    move-object/from16 v1, p0

    move-object v5, v12

    move-object v6, v13

    invoke-direct/range {v0 .. v8}, LZ0/v;-><init>(LZ0/s;[J[II[J[IJ)V

    return-object v9

    :cond_1b
    array-length v1, v1

    const/4 v5, 0x1

    if-ne v1, v5, :cond_1e

    iget v1, v14, LZ0/s;->b:I

    if-ne v1, v5, :cond_1e

    array-length v1, v12

    const/4 v5, 0x2

    if-lt v1, v5, :cond_1e

    iget-object v1, v14, LZ0/s;->i:[J

    invoke-static {v1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [J

    const/4 v5, 0x0

    aget-wide v21, v1, v5

    iget-object v1, v14, LZ0/s;->h:[J

    aget-wide v23, v1, v5

    iget-wide v5, v14, LZ0/s;->c:J

    iget-wide v7, v14, LZ0/s;->d:J

    move-wide/from16 v25, v5

    move-wide/from16 v27, v7

    invoke-static/range {v23 .. v28}, Lg0/M;->W0(JJJ)J

    move-result-wide v5

    add-long v23, v21, v5

    move-object v5, v12

    move-wide v6, v15

    move-wide/from16 v8, v21

    move/from16 v25, v0

    move-wide v0, v10

    move-wide/from16 v10, v23

    invoke-static/range {v5 .. v11}, LZ0/b;->b([JJJJ)Z

    move-result v5

    if-eqz v5, :cond_1d

    sub-long v6, v15, v23

    const/4 v5, 0x0

    aget-wide v8, v12, v5

    sub-long v26, v21, v8

    iget-object v5, v14, LZ0/s;->f:Ld0/q;

    iget v5, v5, Ld0/q;->C:I

    int-to-long v8, v5

    iget-wide v10, v14, LZ0/s;->c:J

    move-wide/from16 v28, v8

    move-wide/from16 v30, v10

    invoke-static/range {v26 .. v31}, Lg0/M;->W0(JJJ)J

    move-result-wide v10

    iget-object v5, v14, LZ0/s;->f:Ld0/q;

    iget v5, v5, Ld0/q;->C:I

    int-to-long v8, v5

    iget-wide v0, v14, LZ0/s;->c:J

    move/from16 p1, v4

    move-wide v4, v10

    move-wide v10, v0

    invoke-static/range {v6 .. v11}, Lg0/M;->W0(JJJ)J

    move-result-wide v0

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-nez v8, :cond_1c

    cmp-long v8, v0, v6

    if-eqz v8, :cond_1f

    :cond_1c
    const-wide/32 v6, 0x7fffffff

    cmp-long v8, v4, v6

    if-gtz v8, :cond_1f

    cmp-long v6, v0, v6

    if-gtz v6, :cond_1f

    long-to-int v4, v4

    move-object/from16 v5, p2

    iput v4, v5, LF0/E;->a:I

    long-to-int v0, v0

    iput v0, v5, LF0/E;->b:I

    iget-wide v0, v14, LZ0/s;->c:J

    const-wide/32 v4, 0xf4240

    invoke-static {v12, v4, v5, v0, v1}, Lg0/M;->X0([JJJ)V

    iget-object v0, v14, LZ0/s;->h:[J

    const/4 v1, 0x0

    aget-wide v4, v0, v1

    const-wide/32 v6, 0xf4240

    iget-wide v8, v14, LZ0/s;->d:J

    invoke-static/range {v4 .. v9}, Lg0/M;->W0(JJJ)J

    move-result-wide v7

    new-instance v9, LZ0/v;

    move-object v0, v9

    move-object/from16 v1, p0

    move/from16 v4, p1

    move-object v5, v12

    move-object v6, v13

    invoke-direct/range {v0 .. v8}, LZ0/v;-><init>(LZ0/s;[J[II[J[IJ)V

    return-object v9

    :cond_1d
    :goto_15
    move/from16 p1, v4

    goto :goto_16

    :cond_1e
    move/from16 v25, v0

    goto :goto_15

    :cond_1f
    :goto_16
    iget-object v0, v14, LZ0/s;->h:[J

    array-length v1, v0

    const/4 v4, 0x1

    if-ne v1, v4, :cond_21

    const/4 v1, 0x0

    aget-wide v4, v0, v1

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-nez v4, :cond_21

    iget-object v0, v14, LZ0/s;->i:[J

    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    aget-wide v4, v0, v1

    const/4 v6, 0x0

    :goto_17
    array-length v0, v12

    if-ge v6, v0, :cond_20

    aget-wide v0, v12, v6

    sub-long v17, v0, v4

    const-wide/32 v19, 0xf4240

    iget-wide v0, v14, LZ0/s;->c:J

    move-wide/from16 v21, v0

    invoke-static/range {v17 .. v22}, Lg0/M;->W0(JJJ)J

    move-result-wide v0

    aput-wide v0, v12, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_17

    :cond_20
    sub-long v17, v15, v4

    const-wide/32 v19, 0xf4240

    iget-wide v0, v14, LZ0/s;->c:J

    move-wide/from16 v21, v0

    invoke-static/range {v17 .. v22}, Lg0/M;->W0(JJJ)J

    move-result-wide v7

    new-instance v9, LZ0/v;

    move-object v0, v9

    move-object/from16 v1, p0

    move/from16 v4, p1

    move-object v5, v12

    move-object v6, v13

    invoke-direct/range {v0 .. v8}, LZ0/v;-><init>(LZ0/s;[J[II[J[IJ)V

    return-object v9

    :cond_21
    iget v1, v14, LZ0/s;->b:I

    const/4 v4, 0x1

    if-ne v1, v4, :cond_22

    const/4 v10, 0x1

    goto :goto_18

    :cond_22
    const/4 v10, 0x0

    :goto_18
    array-length v1, v0

    new-array v1, v1, [I

    array-length v0, v0

    new-array v0, v0, [I

    iget-object v4, v14, LZ0/s;->i:[J

    invoke-static {v4}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [J

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_19
    iget-object v9, v14, LZ0/s;->h:[J

    array-length v11, v9

    if-ge v5, v11, :cond_26

    move-object v11, v2

    move-object v15, v3

    aget-wide v2, v4, v5

    const-wide/16 v21, -0x1

    cmp-long v16, v2, v21

    if-eqz v16, :cond_25

    aget-wide v26, v9, v5

    move/from16 v16, v8

    iget-wide v8, v14, LZ0/s;->c:J

    move/from16 p2, v6

    move/from16 v21, v7

    iget-wide v6, v14, LZ0/s;->d:J

    move-wide/from16 v28, v8

    move-wide/from16 v30, v6

    invoke-static/range {v26 .. v31}, Lg0/M;->W0(JJJ)J

    move-result-wide v6

    const/4 v8, 0x1

    invoke-static {v12, v2, v3, v8, v8}, Lg0/M;->h([JJZZ)I

    move-result v9

    aput v9, v1, v5

    add-long/2addr v2, v6

    const/4 v6, 0x0

    invoke-static {v12, v2, v3, v10, v6}, Lg0/M;->d([JJZZ)I

    move-result v2

    aput v2, v0, v5

    :goto_1a
    aget v2, v1, v5

    aget v3, v0, v5

    if-ge v2, v3, :cond_23

    aget v7, v13, v2

    and-int/2addr v7, v8

    if-nez v7, :cond_23

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v5

    goto :goto_1a

    :cond_23
    sub-int v7, v3, v2

    add-int v7, v21, v7

    move/from16 v9, v16

    if-eq v9, v2, :cond_24

    move v2, v8

    goto :goto_1b

    :cond_24
    move v2, v6

    :goto_1b
    or-int v2, p2, v2

    goto :goto_1c

    :cond_25
    move/from16 p2, v6

    move/from16 v21, v7

    move v9, v8

    const/4 v6, 0x0

    const/4 v8, 0x1

    move/from16 v2, p2

    move v3, v9

    :goto_1c
    add-int/lit8 v5, v5, 0x1

    move v6, v2

    move v8, v3

    move-object v2, v11

    move-object v3, v15

    goto :goto_19

    :cond_26
    move-object v11, v2

    move-object v15, v3

    move/from16 p2, v6

    move/from16 v3, v25

    const/4 v6, 0x0

    const/4 v8, 0x1

    if-eq v7, v3, :cond_27

    goto :goto_1d

    :cond_27
    move v8, v6

    :goto_1d
    or-int v2, p2, v8

    if-eqz v2, :cond_28

    new-array v3, v7, [J

    goto :goto_1e

    :cond_28
    move-object v3, v11

    :goto_1e
    if-eqz v2, :cond_29

    new-array v4, v7, [I

    goto :goto_1f

    :cond_29
    move-object v4, v15

    :goto_1f
    if-eqz v2, :cond_2a

    move v5, v6

    goto :goto_20

    :cond_2a
    move/from16 v5, p1

    :goto_20
    if-eqz v2, :cond_2b

    new-array v8, v7, [I

    goto :goto_21

    :cond_2b
    move-object v8, v13

    :goto_21
    new-array v7, v7, [J

    move/from16 p2, v5

    move-object/from16 p1, v15

    const-wide/16 v9, 0x0

    move v15, v6

    :goto_22
    iget-object v5, v14, LZ0/s;->h:[J

    array-length v5, v5

    if-ge v6, v5, :cond_31

    iget-object v5, v14, LZ0/s;->i:[J

    aget-wide v16, v5, v6

    aget v5, v1, v6

    move-object/from16 v18, v1

    aget v1, v0, v6

    move-object/from16 v27, v0

    if-eqz v2, :cond_2c

    sub-int v0, v1, v5

    invoke-static {v11, v5, v3, v15, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object/from16 v28, v11

    move-object/from16 v11, p1

    invoke-static {v11, v5, v4, v15, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v13, v5, v8, v15, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_23

    :cond_2c
    move-object/from16 v28, v11

    move-object/from16 v11, p1

    :goto_23
    move/from16 v0, p2

    :goto_24
    if-ge v5, v1, :cond_30

    const-wide/32 v23, 0xf4240

    move/from16 v29, v0

    move/from16 p1, v1

    iget-wide v0, v14, LZ0/s;->d:J

    move-wide/from16 v21, v9

    move-wide/from16 v25, v0

    invoke-static/range {v21 .. v26}, Lg0/M;->W0(JJJ)J

    move-result-wide v0

    aget-wide v21, v12, v5

    sub-long v30, v21, v16

    const-wide/32 v32, 0xf4240

    move-object/from16 v21, v12

    move-object/from16 v22, v13

    iget-wide v12, v14, LZ0/s;->c:J

    move-wide/from16 v34, v12

    invoke-static/range {v30 .. v35}, Lg0/M;->W0(JJJ)J

    move-result-wide v12

    move-object/from16 v30, v8

    iget v8, v14, LZ0/s;->b:I

    invoke-static {v8}, LZ0/b;->c(I)Z

    move-result v8

    move-wide/from16 v23, v9

    if-eqz v8, :cond_2d

    const-wide/16 v8, 0x0

    invoke-static {v8, v9, v12, v13}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v12

    goto :goto_25

    :cond_2d
    const-wide/16 v8, 0x0

    :goto_25
    add-long/2addr v0, v12

    aput-wide v0, v7, v15

    if-eqz v2, :cond_2e

    aget v0, v4, v15

    move/from16 v1, v29

    if-le v0, v1, :cond_2f

    aget v0, v11, v5

    goto :goto_26

    :cond_2e
    move/from16 v1, v29

    :cond_2f
    move v0, v1

    :goto_26
    add-int/lit8 v15, v15, 0x1

    add-int/lit8 v5, v5, 0x1

    move/from16 v1, p1

    move-object/from16 v12, v21

    move-object/from16 v13, v22

    move-wide/from16 v9, v23

    move-object/from16 v8, v30

    goto :goto_24

    :cond_30
    move v1, v0

    move-object/from16 v30, v8

    move-wide/from16 v23, v9

    move-object/from16 v21, v12

    move-object/from16 v22, v13

    const-wide/16 v8, 0x0

    iget-object v0, v14, LZ0/s;->h:[J

    aget-wide v12, v0, v6

    add-long v12, v23, v12

    add-int/lit8 v6, v6, 0x1

    move/from16 p2, v1

    move-object/from16 p1, v11

    move-wide v9, v12

    move-object/from16 v1, v18

    move-object/from16 v12, v21

    move-object/from16 v13, v22

    move-object/from16 v0, v27

    move-object/from16 v11, v28

    move-object/from16 v8, v30

    goto/16 :goto_22

    :cond_31
    move-object/from16 v30, v8

    move-wide/from16 v23, v9

    const-wide/32 v0, 0xf4240

    iget-wide v5, v14, LZ0/s;->d:J

    move-wide/from16 v21, v23

    move-wide/from16 v23, v0

    move-wide/from16 v25, v5

    invoke-static/range {v21 .. v26}, Lg0/M;->W0(JJJ)J

    move-result-wide v8

    new-instance v10, LZ0/v;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object v2, v3

    move-object v3, v4

    move/from16 v4, p2

    move-object v5, v7

    move-object/from16 v6, v30

    move-wide v7, v8

    invoke-direct/range {v0 .. v8}, LZ0/v;-><init>(LZ0/s;[J[II[J[IJ)V

    return-object v10

    :cond_32
    const-string v0, "Track has no sample table size information"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    move-result-object v0

    throw v0
.end method

.method public static x(Lg0/z;IILjava/lang/String;Ld0/m;Z)LZ0/b$d;
    .locals 18

    .line 1
    move-object/from16 v10, p0

    .line 2
    .line 3
    move/from16 v11, p1

    .line 4
    .line 5
    const/16 v0, 0xc

    .line 6
    .line 7
    invoke-virtual {v10, v0}, Lg0/z;->T(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p0 .. p0}, Lg0/z;->p()I

    .line 11
    .line 12
    .line 13
    move-result v12

    .line 14
    new-instance v13, LZ0/b$d;

    .line 15
    .line 16
    invoke-direct {v13, v12}, LZ0/b$d;-><init>(I)V

    .line 17
    .line 18
    .line 19
    const/4 v14, 0x0

    .line 20
    move v15, v14

    .line 21
    :goto_0
    if-ge v15, v12, :cond_9

    .line 22
    .line 23
    invoke-virtual/range {p0 .. p0}, Lg0/z;->f()I

    .line 24
    .line 25
    .line 26
    move-result v9

    .line 27
    invoke-virtual/range {p0 .. p0}, Lg0/z;->p()I

    .line 28
    .line 29
    .line 30
    move-result v16

    .line 31
    if-lez v16, :cond_0

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    move v0, v14

    .line 36
    :goto_1
    const-string v1, "childAtomSize must be positive"

    .line 37
    .line 38
    invoke-static {v0, v1}, LF0/u;->a(ZLjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual/range {p0 .. p0}, Lg0/z;->p()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    const v0, 0x61766331

    .line 46
    .line 47
    .line 48
    if-eq v1, v0, :cond_1

    .line 49
    .line 50
    const v0, 0x61766333

    .line 51
    .line 52
    .line 53
    if-eq v1, v0, :cond_1

    .line 54
    .line 55
    const v0, 0x656e6376

    .line 56
    .line 57
    .line 58
    if-eq v1, v0, :cond_1

    .line 59
    .line 60
    const v0, 0x6d317620

    .line 61
    .line 62
    .line 63
    if-eq v1, v0, :cond_1

    .line 64
    .line 65
    const v0, 0x6d703476

    .line 66
    .line 67
    .line 68
    if-eq v1, v0, :cond_1

    .line 69
    .line 70
    const v0, 0x68766331

    .line 71
    .line 72
    .line 73
    if-eq v1, v0, :cond_1

    .line 74
    .line 75
    const v0, 0x68657631

    .line 76
    .line 77
    .line 78
    if-eq v1, v0, :cond_1

    .line 79
    .line 80
    const v0, 0x73323633

    .line 81
    .line 82
    .line 83
    if-eq v1, v0, :cond_1

    .line 84
    .line 85
    const v0, 0x48323633

    .line 86
    .line 87
    .line 88
    if-eq v1, v0, :cond_1

    .line 89
    .line 90
    const v0, 0x76703038

    .line 91
    .line 92
    .line 93
    if-eq v1, v0, :cond_1

    .line 94
    .line 95
    const v0, 0x76703039

    .line 96
    .line 97
    .line 98
    if-eq v1, v0, :cond_1

    .line 99
    .line 100
    const v0, 0x61763031

    .line 101
    .line 102
    .line 103
    if-eq v1, v0, :cond_1

    .line 104
    .line 105
    const v0, 0x64766176

    .line 106
    .line 107
    .line 108
    if-eq v1, v0, :cond_1

    .line 109
    .line 110
    const v0, 0x64766131

    .line 111
    .line 112
    .line 113
    if-eq v1, v0, :cond_1

    .line 114
    .line 115
    const v0, 0x64766865

    .line 116
    .line 117
    .line 118
    if-eq v1, v0, :cond_1

    .line 119
    .line 120
    const v0, 0x64766831

    .line 121
    .line 122
    .line 123
    if-ne v1, v0, :cond_2

    .line 124
    .line 125
    :cond_1
    move/from16 v17, v9

    .line 126
    .line 127
    goto/16 :goto_5

    .line 128
    .line 129
    :cond_2
    const v0, 0x6d703461

    .line 130
    .line 131
    .line 132
    if-eq v1, v0, :cond_8

    .line 133
    .line 134
    const v0, 0x656e6361

    .line 135
    .line 136
    .line 137
    if-eq v1, v0, :cond_8

    .line 138
    .line 139
    const v0, 0x61632d33

    .line 140
    .line 141
    .line 142
    if-eq v1, v0, :cond_8

    .line 143
    .line 144
    const v0, 0x65632d33

    .line 145
    .line 146
    .line 147
    if-eq v1, v0, :cond_8

    .line 148
    .line 149
    const v0, 0x61632d34

    .line 150
    .line 151
    .line 152
    if-eq v1, v0, :cond_8

    .line 153
    .line 154
    const v0, 0x6d6c7061

    .line 155
    .line 156
    .line 157
    if-eq v1, v0, :cond_8

    .line 158
    .line 159
    const v0, 0x64747363

    .line 160
    .line 161
    .line 162
    if-eq v1, v0, :cond_8

    .line 163
    .line 164
    const v0, 0x64747365

    .line 165
    .line 166
    .line 167
    if-eq v1, v0, :cond_8

    .line 168
    .line 169
    const v0, 0x64747368

    .line 170
    .line 171
    .line 172
    if-eq v1, v0, :cond_8

    .line 173
    .line 174
    const v0, 0x6474736c

    .line 175
    .line 176
    .line 177
    if-eq v1, v0, :cond_8

    .line 178
    .line 179
    const v0, 0x64747378

    .line 180
    .line 181
    .line 182
    if-eq v1, v0, :cond_8

    .line 183
    .line 184
    const v0, 0x73616d72

    .line 185
    .line 186
    .line 187
    if-eq v1, v0, :cond_8

    .line 188
    .line 189
    const v0, 0x73617762

    .line 190
    .line 191
    .line 192
    if-eq v1, v0, :cond_8

    .line 193
    .line 194
    const v0, 0x6c70636d

    .line 195
    .line 196
    .line 197
    if-eq v1, v0, :cond_8

    .line 198
    .line 199
    const v0, 0x736f7774

    .line 200
    .line 201
    .line 202
    if-eq v1, v0, :cond_8

    .line 203
    .line 204
    const v0, 0x74776f73

    .line 205
    .line 206
    .line 207
    if-eq v1, v0, :cond_8

    .line 208
    .line 209
    const v0, 0x2e6d7032

    .line 210
    .line 211
    .line 212
    if-eq v1, v0, :cond_8

    .line 213
    .line 214
    const v0, 0x2e6d7033

    .line 215
    .line 216
    .line 217
    if-eq v1, v0, :cond_8

    .line 218
    .line 219
    const v0, 0x6d686131

    .line 220
    .line 221
    .line 222
    if-eq v1, v0, :cond_8

    .line 223
    .line 224
    const v0, 0x6d686d31

    .line 225
    .line 226
    .line 227
    if-eq v1, v0, :cond_8

    .line 228
    .line 229
    const v0, 0x616c6163

    .line 230
    .line 231
    .line 232
    if-eq v1, v0, :cond_8

    .line 233
    .line 234
    const v0, 0x616c6177

    .line 235
    .line 236
    .line 237
    if-eq v1, v0, :cond_8

    .line 238
    .line 239
    const v0, 0x756c6177

    .line 240
    .line 241
    .line 242
    if-eq v1, v0, :cond_8

    .line 243
    .line 244
    const v0, 0x4f707573

    .line 245
    .line 246
    .line 247
    if-eq v1, v0, :cond_8

    .line 248
    .line 249
    const v0, 0x664c6143

    .line 250
    .line 251
    .line 252
    if-ne v1, v0, :cond_3

    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_3
    const v0, 0x54544d4c

    .line 256
    .line 257
    .line 258
    if-eq v1, v0, :cond_7

    .line 259
    .line 260
    const v0, 0x74783367

    .line 261
    .line 262
    .line 263
    if-eq v1, v0, :cond_7

    .line 264
    .line 265
    const v0, 0x77767474

    .line 266
    .line 267
    .line 268
    if-eq v1, v0, :cond_7

    .line 269
    .line 270
    const v0, 0x73747070

    .line 271
    .line 272
    .line 273
    if-eq v1, v0, :cond_7

    .line 274
    .line 275
    const v0, 0x63363038

    .line 276
    .line 277
    .line 278
    if-ne v1, v0, :cond_4

    .line 279
    .line 280
    goto :goto_3

    .line 281
    :cond_4
    const v0, 0x6d657474

    .line 282
    .line 283
    .line 284
    if-ne v1, v0, :cond_6

    .line 285
    .line 286
    invoke-static {v10, v1, v9, v11, v13}, LZ0/b;->q(Lg0/z;IIILZ0/b$d;)V

    .line 287
    .line 288
    .line 289
    :cond_5
    :goto_2
    move/from16 v17, v9

    .line 290
    .line 291
    goto :goto_6

    .line 292
    :cond_6
    const v0, 0x63616d6d

    .line 293
    .line 294
    .line 295
    if-ne v1, v0, :cond_5

    .line 296
    .line 297
    new-instance v0, Ld0/q$b;

    .line 298
    .line 299
    invoke-direct {v0}, Ld0/q$b;-><init>()V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0, v11}, Ld0/q$b;->Z(I)Ld0/q$b;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    const-string v1, "application/x-camera-motion"

    .line 307
    .line 308
    invoke-virtual {v0, v1}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    invoke-virtual {v0}, Ld0/q$b;->K()Ld0/q;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    iput-object v0, v13, LZ0/b$d;->b:Ld0/q;

    .line 317
    .line 318
    goto :goto_2

    .line 319
    :cond_7
    :goto_3
    move-object/from16 v0, p0

    .line 320
    .line 321
    move v2, v9

    .line 322
    move/from16 v3, v16

    .line 323
    .line 324
    move/from16 v4, p1

    .line 325
    .line 326
    move-object/from16 v5, p3

    .line 327
    .line 328
    move-object v6, v13

    .line 329
    invoke-static/range {v0 .. v6}, LZ0/b;->y(Lg0/z;IIIILjava/lang/String;LZ0/b$d;)V

    .line 330
    .line 331
    .line 332
    goto :goto_2

    .line 333
    :cond_8
    :goto_4
    move-object/from16 v0, p0

    .line 334
    .line 335
    move v2, v9

    .line 336
    move/from16 v3, v16

    .line 337
    .line 338
    move/from16 v4, p1

    .line 339
    .line 340
    move-object/from16 v5, p3

    .line 341
    .line 342
    move/from16 v6, p5

    .line 343
    .line 344
    move-object/from16 v7, p4

    .line 345
    .line 346
    move-object v8, v13

    .line 347
    move/from16 v17, v9

    .line 348
    .line 349
    move v9, v15

    .line 350
    invoke-static/range {v0 .. v9}, LZ0/b;->g(Lg0/z;IIIILjava/lang/String;ZLd0/m;LZ0/b$d;I)V

    .line 351
    .line 352
    .line 353
    goto :goto_6

    .line 354
    :goto_5
    move-object/from16 v0, p0

    .line 355
    .line 356
    move/from16 v2, v17

    .line 357
    .line 358
    move/from16 v3, v16

    .line 359
    .line 360
    move/from16 v4, p1

    .line 361
    .line 362
    move/from16 v5, p2

    .line 363
    .line 364
    move-object/from16 v6, p4

    .line 365
    .line 366
    move-object v7, v13

    .line 367
    move v8, v15

    .line 368
    invoke-static/range {v0 .. v8}, LZ0/b;->E(Lg0/z;IIIIILd0/m;LZ0/b$d;I)V

    .line 369
    .line 370
    .line 371
    :goto_6
    add-int v9, v17, v16

    .line 372
    .line 373
    invoke-virtual {v10, v9}, Lg0/z;->T(I)V

    .line 374
    .line 375
    .line 376
    add-int/lit8 v15, v15, 0x1

    .line 377
    .line 378
    goto/16 :goto_0

    .line 379
    .line 380
    :cond_9
    return-object v13
.end method

.method public static y(Lg0/z;IIIILjava/lang/String;LZ0/b$d;)V
    .locals 4

    .line 1
    add-int/lit8 p2, p2, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lg0/z;->T(I)V

    .line 4
    .line 5
    .line 6
    const p2, 0x54544d4c

    .line 7
    .line 8
    .line 9
    const-string v0, "application/ttml+xml"

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const-wide v2, 0x7fffffffffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    if-ne p1, p2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const p2, 0x74783367

    .line 21
    .line 22
    .line 23
    if-ne p1, p2, :cond_1

    .line 24
    .line 25
    add-int/lit8 p3, p3, -0x10

    .line 26
    .line 27
    new-array p1, p3, [B

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    invoke-virtual {p0, p1, p2, p3}, Lg0/z;->l([BII)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, LX2/v;->Z(Ljava/lang/Object;)LX2/v;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-string v0, "application/x-quicktime-tx3g"

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const p0, 0x77767474

    .line 41
    .line 42
    .line 43
    if-ne p1, p0, :cond_2

    .line 44
    .line 45
    const-string v0, "application/x-mp4-vtt"

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const p0, 0x73747070

    .line 49
    .line 50
    .line 51
    if-ne p1, p0, :cond_3

    .line 52
    .line 53
    const-wide/16 v2, 0x0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    const p0, 0x63363038

    .line 57
    .line 58
    .line 59
    if-ne p1, p0, :cond_4

    .line 60
    .line 61
    const/4 p0, 0x1

    .line 62
    iput p0, p6, LZ0/b$d;->d:I

    .line 63
    .line 64
    const-string v0, "application/x-mp4-cea-608"

    .line 65
    .line 66
    :goto_0
    new-instance p0, Ld0/q$b;

    .line 67
    .line 68
    invoke-direct {p0}, Ld0/q$b;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, p4}, Ld0/q$b;->Z(I)Ld0/q$b;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0, v0}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0, p5}, Ld0/q$b;->e0(Ljava/lang/String;)Ld0/q$b;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p0, v2, v3}, Ld0/q$b;->s0(J)Ld0/q$b;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p0, v1}, Ld0/q$b;->b0(Ljava/util/List;)Ld0/q$b;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Ld0/q$b;->K()Ld0/q;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    iput-object p0, p6, LZ0/b$d;->b:Ld0/q;

    .line 96
    .line 97
    return-void

    .line 98
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 99
    .line 100
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 101
    .line 102
    .line 103
    throw p0
.end method

.method public static z(Lg0/z;)LZ0/b$g;
    .locals 12

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, LZ0/a;->c(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/16 v2, 0x10

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    move v3, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v3, v2

    .line 21
    :goto_0
    invoke-virtual {p0, v3}, Lg0/z;->U(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/4 v4, 0x4

    .line 29
    invoke-virtual {p0, v4}, Lg0/z;->U(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lg0/z;->f()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    move v0, v4

    .line 39
    :cond_1
    const/4 v6, 0x0

    .line 40
    move v7, v6

    .line 41
    :goto_1
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    if-ge v7, v0, :cond_5

    .line 47
    .line 48
    invoke-virtual {p0}, Lg0/z;->e()[B

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    add-int v11, v5, v7

    .line 53
    .line 54
    aget-byte v10, v10, v11

    .line 55
    .line 56
    const/4 v11, -0x1

    .line 57
    if-eq v10, v11, :cond_4

    .line 58
    .line 59
    if-nez v1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0}, Lg0/z;->I()J

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    invoke-virtual {p0}, Lg0/z;->L()J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    :goto_2
    const-wide/16 v10, 0x0

    .line 71
    .line 72
    cmp-long v5, v0, v10

    .line 73
    .line 74
    if-nez v5, :cond_3

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    move-wide v8, v0

    .line 78
    goto :goto_3

    .line 79
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    invoke-virtual {p0, v0}, Lg0/z;->U(I)V

    .line 83
    .line 84
    .line 85
    :goto_3
    invoke-virtual {p0, v2}, Lg0/z;->U(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    invoke-virtual {p0, v4}, Lg0/z;->U(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    invoke-virtual {p0}, Lg0/z;->p()I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    const/high16 v4, -0x10000

    .line 108
    .line 109
    const/high16 v5, 0x10000

    .line 110
    .line 111
    if-nez v0, :cond_6

    .line 112
    .line 113
    if-ne v1, v5, :cond_6

    .line 114
    .line 115
    if-ne v2, v4, :cond_6

    .line 116
    .line 117
    if-nez p0, :cond_6

    .line 118
    .line 119
    const/16 v6, 0x5a

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_6
    if-nez v0, :cond_7

    .line 123
    .line 124
    if-ne v1, v4, :cond_7

    .line 125
    .line 126
    if-ne v2, v5, :cond_7

    .line 127
    .line 128
    if-nez p0, :cond_7

    .line 129
    .line 130
    const/16 v6, 0x10e

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_7
    if-ne v0, v4, :cond_8

    .line 134
    .line 135
    if-nez v1, :cond_8

    .line 136
    .line 137
    if-nez v2, :cond_8

    .line 138
    .line 139
    if-ne p0, v4, :cond_8

    .line 140
    .line 141
    const/16 v6, 0xb4

    .line 142
    .line 143
    :cond_8
    :goto_4
    new-instance p0, LZ0/b$g;

    .line 144
    .line 145
    invoke-direct {p0, v3, v8, v9, v6}, LZ0/b$g;-><init>(IJI)V

    .line 146
    .line 147
    .line 148
    return-object p0
.end method
