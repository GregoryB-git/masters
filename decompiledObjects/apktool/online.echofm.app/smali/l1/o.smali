.class public final Ll1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll1/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll1/o$a;,
        Ll1/o$b;
    }
.end annotation


# static fields
.field public static final l:[F


# instance fields
.field public final a:Ll1/M;

.field public final b:Lg0/z;

.field public final c:[Z

.field public final d:Ll1/o$a;

.field public final e:Ll1/w;

.field public f:Ll1/o$b;

.field public g:J

.field public h:Ljava/lang/String;

.field public i:LF0/T;

.field public j:Z

.field public k:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Ll1/o;->l:[F

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(Ll1/M;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll1/o;->a:Ll1/M;

    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    new-array v0, v0, [Z

    .line 8
    .line 9
    iput-object v0, p0, Ll1/o;->c:[Z

    .line 10
    .line 11
    new-instance v0, Ll1/o$a;

    .line 12
    .line 13
    const/16 v1, 0x80

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ll1/o$a;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Ll1/o;->d:Ll1/o$a;

    .line 19
    .line 20
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iput-wide v2, p0, Ll1/o;->k:J

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    new-instance p1, Ll1/w;

    .line 30
    .line 31
    const/16 v0, 0xb2

    .line 32
    .line 33
    invoke-direct {p1, v0, v1}, Ll1/w;-><init>(II)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Ll1/o;->e:Ll1/w;

    .line 37
    .line 38
    new-instance p1, Lg0/z;

    .line 39
    .line 40
    invoke-direct {p1}, Lg0/z;-><init>()V

    .line 41
    .line 42
    .line 43
    :goto_0
    iput-object p1, p0, Ll1/o;->b:Lg0/z;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    const/4 p1, 0x0

    .line 47
    iput-object p1, p0, Ll1/o;->e:Ll1/w;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :goto_1
    return-void
.end method

.method public static f(Ll1/o$a;ILjava/lang/String;)Ld0/q;
    .locals 8

    .line 1
    iget-object v0, p0, Ll1/o$a;->e:[B

    .line 2
    .line 3
    iget p0, p0, Ll1/o$a;->c:I

    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, Lg0/y;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lg0/y;-><init>([B)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lg0/y;->s(I)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x4

    .line 18
    invoke-virtual {v0, p1}, Lg0/y;->s(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lg0/y;->q()V

    .line 22
    .line 23
    .line 24
    const/16 v1, 0x8

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lg0/y;->r(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lg0/y;->g()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v3, 0x3

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lg0/y;->r(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v3}, Lg0/y;->r(I)V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-virtual {v0, p1}, Lg0/y;->h(I)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    const/high16 v2, 0x3f800000    # 1.0f

    .line 47
    .line 48
    const-string v4, "Invalid aspect ratio"

    .line 49
    .line 50
    const-string v5, "H263Reader"

    .line 51
    .line 52
    const/16 v6, 0xf

    .line 53
    .line 54
    if-ne p1, v6, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lg0/y;->h(I)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-virtual {v0, v1}, Lg0/y;->h(I)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    int-to-float p1, p1

    .line 68
    int-to-float v1, v1

    .line 69
    div-float v2, p1, v1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    sget-object v1, Ll1/o;->l:[F

    .line 73
    .line 74
    array-length v7, v1

    .line 75
    if-ge p1, v7, :cond_3

    .line 76
    .line 77
    aget v2, v1, p1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    :goto_0
    invoke-static {v5, v4}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :goto_1
    invoke-virtual {v0}, Lg0/y;->g()Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    const/4 v1, 0x2

    .line 88
    if-eqz p1, :cond_4

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Lg0/y;->r(I)V

    .line 91
    .line 92
    .line 93
    const/4 p1, 0x1

    .line 94
    invoke-virtual {v0, p1}, Lg0/y;->r(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Lg0/y;->g()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_4

    .line 102
    .line 103
    invoke-virtual {v0, v6}, Lg0/y;->r(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Lg0/y;->q()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v6}, Lg0/y;->r(I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Lg0/y;->q()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v6}, Lg0/y;->r(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Lg0/y;->q()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v3}, Lg0/y;->r(I)V

    .line 122
    .line 123
    .line 124
    const/16 p1, 0xb

    .line 125
    .line 126
    invoke-virtual {v0, p1}, Lg0/y;->r(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Lg0/y;->q()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v6}, Lg0/y;->r(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Lg0/y;->q()V

    .line 136
    .line 137
    .line 138
    :cond_4
    invoke-virtual {v0, v1}, Lg0/y;->h(I)I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    if-eqz p1, :cond_5

    .line 143
    .line 144
    const-string p1, "Unhandled video object layer shape"

    .line 145
    .line 146
    invoke-static {v5, p1}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    :cond_5
    invoke-virtual {v0}, Lg0/y;->q()V

    .line 150
    .line 151
    .line 152
    const/16 p1, 0x10

    .line 153
    .line 154
    invoke-virtual {v0, p1}, Lg0/y;->h(I)I

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    invoke-virtual {v0}, Lg0/y;->q()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Lg0/y;->g()Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-eqz v1, :cond_8

    .line 166
    .line 167
    if-nez p1, :cond_6

    .line 168
    .line 169
    const-string p1, "Invalid vop_increment_time_resolution"

    .line 170
    .line 171
    invoke-static {v5, p1}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_6
    add-int/lit8 p1, p1, -0x1

    .line 176
    .line 177
    const/4 v1, 0x0

    .line 178
    :goto_2
    if-lez p1, :cond_7

    .line 179
    .line 180
    add-int/lit8 v1, v1, 0x1

    .line 181
    .line 182
    shr-int/lit8 p1, p1, 0x1

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_7
    invoke-virtual {v0, v1}, Lg0/y;->r(I)V

    .line 186
    .line 187
    .line 188
    :cond_8
    :goto_3
    invoke-virtual {v0}, Lg0/y;->q()V

    .line 189
    .line 190
    .line 191
    const/16 p1, 0xd

    .line 192
    .line 193
    invoke-virtual {v0, p1}, Lg0/y;->h(I)I

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    invoke-virtual {v0}, Lg0/y;->q()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, p1}, Lg0/y;->h(I)I

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    invoke-virtual {v0}, Lg0/y;->q()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Lg0/y;->q()V

    .line 208
    .line 209
    .line 210
    new-instance v0, Ld0/q$b;

    .line 211
    .line 212
    invoke-direct {v0}, Ld0/q$b;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, p2}, Ld0/q$b;->a0(Ljava/lang/String;)Ld0/q$b;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    const-string v0, "video/mp4v-es"

    .line 220
    .line 221
    invoke-virtual {p2, v0}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 222
    .line 223
    .line 224
    move-result-object p2

    .line 225
    invoke-virtual {p2, v1}, Ld0/q$b;->v0(I)Ld0/q$b;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    invoke-virtual {p2, p1}, Ld0/q$b;->Y(I)Ld0/q$b;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-virtual {p1, v2}, Ld0/q$b;->k0(F)Ld0/q$b;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    invoke-virtual {p1, p0}, Ld0/q$b;->b0(Ljava/util/List;)Ld0/q$b;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    invoke-virtual {p0}, Ld0/q$b;->K()Ld0/q;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    return-object p0
.end method


# virtual methods
.method public a(Lg0/z;)V
    .locals 13

    .line 1
    iget-object v0, p0, Ll1/o;->f:Ll1/o$b;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll1/o;->i:LF0/T;

    .line 7
    .line 8
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lg0/z;->f()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p1}, Lg0/z;->g()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p1}, Lg0/z;->e()[B

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-wide v3, p0, Ll1/o;->g:J

    .line 24
    .line 25
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    int-to-long v5, v5

    .line 30
    add-long/2addr v3, v5

    .line 31
    iput-wide v3, p0, Ll1/o;->g:J

    .line 32
    .line 33
    iget-object v3, p0, Ll1/o;->i:LF0/T;

    .line 34
    .line 35
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    invoke-interface {v3, p1, v4}, LF0/T;->e(Lg0/z;I)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object v3, p0, Ll1/o;->c:[Z

    .line 43
    .line 44
    invoke-static {v2, v0, v1, v3}, Lh0/d;->c([BII[Z)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-ne v3, v1, :cond_2

    .line 49
    .line 50
    iget-boolean p1, p0, Ll1/o;->j:Z

    .line 51
    .line 52
    if-nez p1, :cond_0

    .line 53
    .line 54
    iget-object p1, p0, Ll1/o;->d:Ll1/o$a;

    .line 55
    .line 56
    invoke-virtual {p1, v2, v0, v1}, Ll1/o$a;->a([BII)V

    .line 57
    .line 58
    .line 59
    :cond_0
    iget-object p1, p0, Ll1/o;->f:Ll1/o$b;

    .line 60
    .line 61
    invoke-virtual {p1, v2, v0, v1}, Ll1/o$b;->a([BII)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Ll1/o;->e:Ll1/w;

    .line 65
    .line 66
    if-eqz p1, :cond_1

    .line 67
    .line 68
    invoke-virtual {p1, v2, v0, v1}, Ll1/w;->a([BII)V

    .line 69
    .line 70
    .line 71
    :cond_1
    return-void

    .line 72
    :cond_2
    invoke-virtual {p1}, Lg0/z;->e()[B

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    add-int/lit8 v5, v3, 0x3

    .line 77
    .line 78
    aget-byte v4, v4, v5

    .line 79
    .line 80
    and-int/lit16 v4, v4, 0xff

    .line 81
    .line 82
    sub-int v6, v3, v0

    .line 83
    .line 84
    iget-boolean v7, p0, Ll1/o;->j:Z

    .line 85
    .line 86
    const/4 v8, 0x1

    .line 87
    const/4 v9, 0x0

    .line 88
    if-nez v7, :cond_5

    .line 89
    .line 90
    if-lez v6, :cond_3

    .line 91
    .line 92
    iget-object v7, p0, Ll1/o;->d:Ll1/o$a;

    .line 93
    .line 94
    invoke-virtual {v7, v2, v0, v3}, Ll1/o$a;->a([BII)V

    .line 95
    .line 96
    .line 97
    :cond_3
    if-gez v6, :cond_4

    .line 98
    .line 99
    neg-int v7, v6

    .line 100
    goto :goto_1

    .line 101
    :cond_4
    move v7, v9

    .line 102
    :goto_1
    iget-object v10, p0, Ll1/o;->d:Ll1/o$a;

    .line 103
    .line 104
    invoke-virtual {v10, v4, v7}, Ll1/o$a;->b(II)Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    if-eqz v7, :cond_5

    .line 109
    .line 110
    iget-object v7, p0, Ll1/o;->i:LF0/T;

    .line 111
    .line 112
    iget-object v10, p0, Ll1/o;->d:Ll1/o$a;

    .line 113
    .line 114
    iget v11, v10, Ll1/o$a;->d:I

    .line 115
    .line 116
    iget-object v12, p0, Ll1/o;->h:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v12}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    check-cast v12, Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {v10, v11, v12}, Ll1/o;->f(Ll1/o$a;ILjava/lang/String;)Ld0/q;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    invoke-interface {v7, v10}, LF0/T;->d(Ld0/q;)V

    .line 129
    .line 130
    .line 131
    iput-boolean v8, p0, Ll1/o;->j:Z

    .line 132
    .line 133
    :cond_5
    iget-object v7, p0, Ll1/o;->f:Ll1/o$b;

    .line 134
    .line 135
    invoke-virtual {v7, v2, v0, v3}, Ll1/o$b;->a([BII)V

    .line 136
    .line 137
    .line 138
    iget-object v7, p0, Ll1/o;->e:Ll1/w;

    .line 139
    .line 140
    if-eqz v7, :cond_8

    .line 141
    .line 142
    if-lez v6, :cond_6

    .line 143
    .line 144
    invoke-virtual {v7, v2, v0, v3}, Ll1/w;->a([BII)V

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_6
    neg-int v9, v6

    .line 149
    :goto_2
    iget-object v0, p0, Ll1/o;->e:Ll1/w;

    .line 150
    .line 151
    invoke-virtual {v0, v9}, Ll1/w;->b(I)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_7

    .line 156
    .line 157
    iget-object v0, p0, Ll1/o;->e:Ll1/w;

    .line 158
    .line 159
    iget-object v6, v0, Ll1/w;->d:[B

    .line 160
    .line 161
    iget v0, v0, Ll1/w;->e:I

    .line 162
    .line 163
    invoke-static {v6, v0}, Lh0/d;->r([BI)I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    iget-object v6, p0, Ll1/o;->b:Lg0/z;

    .line 168
    .line 169
    invoke-static {v6}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    check-cast v6, Lg0/z;

    .line 174
    .line 175
    iget-object v7, p0, Ll1/o;->e:Ll1/w;

    .line 176
    .line 177
    iget-object v7, v7, Ll1/w;->d:[B

    .line 178
    .line 179
    invoke-virtual {v6, v7, v0}, Lg0/z;->R([BI)V

    .line 180
    .line 181
    .line 182
    iget-object v0, p0, Ll1/o;->a:Ll1/M;

    .line 183
    .line 184
    invoke-static {v0}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    check-cast v0, Ll1/M;

    .line 189
    .line 190
    iget-wide v6, p0, Ll1/o;->k:J

    .line 191
    .line 192
    iget-object v9, p0, Ll1/o;->b:Lg0/z;

    .line 193
    .line 194
    invoke-virtual {v0, v6, v7, v9}, Ll1/M;->a(JLg0/z;)V

    .line 195
    .line 196
    .line 197
    :cond_7
    const/16 v0, 0xb2

    .line 198
    .line 199
    if-ne v4, v0, :cond_8

    .line 200
    .line 201
    invoke-virtual {p1}, Lg0/z;->e()[B

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    add-int/lit8 v6, v3, 0x2

    .line 206
    .line 207
    aget-byte v0, v0, v6

    .line 208
    .line 209
    if-ne v0, v8, :cond_8

    .line 210
    .line 211
    iget-object v0, p0, Ll1/o;->e:Ll1/w;

    .line 212
    .line 213
    invoke-virtual {v0, v4}, Ll1/w;->e(I)V

    .line 214
    .line 215
    .line 216
    :cond_8
    sub-int v0, v1, v3

    .line 217
    .line 218
    iget-wide v6, p0, Ll1/o;->g:J

    .line 219
    .line 220
    int-to-long v8, v0

    .line 221
    sub-long/2addr v6, v8

    .line 222
    iget-object v3, p0, Ll1/o;->f:Ll1/o$b;

    .line 223
    .line 224
    iget-boolean v8, p0, Ll1/o;->j:Z

    .line 225
    .line 226
    invoke-virtual {v3, v6, v7, v0, v8}, Ll1/o$b;->b(JIZ)V

    .line 227
    .line 228
    .line 229
    iget-object v0, p0, Ll1/o;->f:Ll1/o$b;

    .line 230
    .line 231
    iget-wide v6, p0, Ll1/o;->k:J

    .line 232
    .line 233
    invoke-virtual {v0, v4, v6, v7}, Ll1/o$b;->c(IJ)V

    .line 234
    .line 235
    .line 236
    move v0, v5

    .line 237
    goto/16 :goto_0
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Ll1/o;->c:[Z

    .line 2
    .line 3
    invoke-static {v0}, Lh0/d;->a([Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll1/o;->d:Ll1/o$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Ll1/o$a;->c()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ll1/o;->f:Ll1/o$b;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ll1/o$b;->d()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Ll1/o;->e:Ll1/w;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Ll1/w;->d()V

    .line 23
    .line 24
    .line 25
    :cond_1
    const-wide/16 v0, 0x0

    .line 26
    .line 27
    iput-wide v0, p0, Ll1/o;->g:J

    .line 28
    .line 29
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    iput-wide v0, p0, Ll1/o;->k:J

    .line 35
    .line 36
    return-void
.end method

.method public c(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Ll1/o;->f:Ll1/o$b;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Ll1/o;->f:Ll1/o$b;

    .line 9
    .line 10
    iget-wide v0, p0, Ll1/o;->g:J

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    iget-boolean v3, p0, Ll1/o;->j:Z

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1, v2, v3}, Ll1/o$b;->b(JIZ)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Ll1/o;->f:Ll1/o$b;

    .line 19
    .line 20
    invoke-virtual {p1}, Ll1/o$b;->d()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public d(JI)V
    .locals 0

    .line 1
    iput-wide p1, p0, Ll1/o;->k:J

    .line 2
    .line 3
    return-void
.end method

.method public e(LF0/t;Ll1/K$d;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ll1/K$d;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ll1/K$d;->b()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Ll1/o;->h:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p2}, Ll1/K$d;->c()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-interface {p1, v0, v1}, LF0/t;->a(II)LF0/T;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Ll1/o;->i:LF0/T;

    .line 20
    .line 21
    new-instance v1, Ll1/o$b;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Ll1/o$b;-><init>(LF0/T;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Ll1/o;->f:Ll1/o$b;

    .line 27
    .line 28
    iget-object v0, p0, Ll1/o;->a:Ll1/M;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Ll1/M;->b(LF0/t;Ll1/K$d;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method
