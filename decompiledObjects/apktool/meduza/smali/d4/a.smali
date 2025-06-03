.class public final Ld4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/h;


# static fields
.field public static final p:[I

.field public static final q:[I

.field public static final r:[B

.field public static final s:[B

.field public static final t:I


# instance fields
.field public final a:[B

.field public final b:I

.field public c:Z

.field public d:J

.field public e:I

.field public f:I

.field public g:Z

.field public h:J

.field public i:I

.field public j:I

.field public k:J

.field public l:Lc4/j;

.field public m:Lc4/v;

.field public n:Lc4/t;

.field public o:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x10

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sput-object v1, Ld4/a;->p:[I

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Ld4/a;->q:[I

    const-string v1, "#!AMR\n"

    invoke-static {v1}, Lv5/e0;->B(Ljava/lang/String;)[B

    move-result-object v1

    sput-object v1, Ld4/a;->r:[B

    const-string v1, "#!AMR-WB\n"

    invoke-static {v1}, Lv5/e0;->B(Ljava/lang/String;)[B

    move-result-object v1

    sput-object v1, Ld4/a;->s:[B

    const/16 v1, 0x8

    aget v0, v0, v1

    sput v0, Ld4/a;->t:I

    return-void

    nop

    :array_0
    .array-data 4
        0xd
        0xe
        0x10
        0x12
        0x14
        0x15
        0x1b
        0x20
        0x6
        0x7
        0x6
        0x6
        0x1
        0x1
        0x1
        0x1
    .end array-data

    :array_1
    .array-data 4
        0x12
        0x18
        0x21
        0x25
        0x29
        0x2f
        0x33
        0x3b
        0x3d
        0x6
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
    .end array-data
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 p1, p1, 0x1

    :cond_0
    iput p1, p0, Ld4/a;->b:I

    const/4 p1, 0x1

    new-array p1, p1, [B

    iput-object p1, p0, Ld4/a;->a:[B

    const/4 p1, -0x1

    iput p1, p0, Ld4/a;->i:I

    return-void
.end method


# virtual methods
.method public final a(Lc4/i;)I
    .locals 5

    .line 1
    invoke-interface {p1}, Lc4/i;->i()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ld4/a;->a:[B

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-interface {p1, v0, v1, v2}, Lc4/i;->m([BII)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Ld4/a;->a:[B

    .line 12
    .line 13
    aget-byte p1, p1, v1

    .line 14
    .line 15
    and-int/lit16 v0, p1, 0x83

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-gtz v0, :cond_9

    .line 19
    .line 20
    shr-int/lit8 p1, p1, 0x3

    .line 21
    .line 22
    const/16 v0, 0xf

    .line 23
    .line 24
    and-int/2addr p1, v0

    .line 25
    if-ltz p1, :cond_5

    .line 26
    .line 27
    if-gt p1, v0, :cond_5

    .line 28
    .line 29
    iget-boolean v0, p0, Ld4/a;->c:Z

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    const/16 v4, 0xa

    .line 34
    .line 35
    if-lt p1, v4, :cond_0

    .line 36
    .line 37
    const/16 v4, 0xd

    .line 38
    .line 39
    if-le p1, v4, :cond_1

    .line 40
    .line 41
    :cond_0
    move v4, v2

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v4, v1

    .line 44
    :goto_0
    if-nez v4, :cond_4

    .line 45
    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    const/16 v0, 0xc

    .line 49
    .line 50
    if-lt p1, v0, :cond_2

    .line 51
    .line 52
    const/16 v0, 0xe

    .line 53
    .line 54
    if-le p1, v0, :cond_3

    .line 55
    .line 56
    :cond_2
    move v0, v2

    .line 57
    goto :goto_1

    .line 58
    :cond_3
    move v0, v1

    .line 59
    :goto_1
    if-eqz v0, :cond_5

    .line 60
    .line 61
    :cond_4
    move v1, v2

    .line 62
    :cond_5
    if-nez v1, :cond_7

    .line 63
    .line 64
    const-string v0, "Illegal AMR "

    .line 65
    .line 66
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-boolean v1, p0, Ld4/a;->c:Z

    .line 71
    .line 72
    if-eqz v1, :cond_6

    .line 73
    .line 74
    const-string v1, "WB"

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_6
    const-string v1, "NB"

    .line 78
    .line 79
    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, " frame type "

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {p1, v3}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    throw p1

    .line 99
    :cond_7
    iget-boolean v0, p0, Ld4/a;->c:Z

    .line 100
    .line 101
    if-eqz v0, :cond_8

    .line 102
    .line 103
    sget-object v0, Ld4/a;->q:[I

    .line 104
    .line 105
    aget p1, v0, p1

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_8
    sget-object v0, Ld4/a;->p:[I

    .line 109
    .line 110
    aget p1, v0, p1

    .line 111
    .line 112
    :goto_3
    return p1

    .line 113
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    .line 118
    const-string v1, "Invalid padding bits for frame header "

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-static {p1, v3}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    throw p1
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

.method public final b(Lc4/j;)V
    .locals 2

    iput-object p1, p0, Ld4/a;->l:Lc4/j;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lc4/j;->r(II)Lc4/v;

    move-result-object v0

    iput-object v0, p0, Ld4/a;->m:Lc4/v;

    invoke-interface {p1}, Lc4/j;->m()V

    return-void
.end method

.method public final c(Lc4/i;)Z
    .locals 5

    .line 1
    sget-object v0, Ld4/a;->r:[B

    .line 2
    .line 3
    invoke-interface {p1}, Lc4/i;->i()V

    .line 4
    .line 5
    .line 6
    array-length v1, v0

    .line 7
    new-array v1, v1, [B

    .line 8
    .line 9
    array-length v2, v0

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-interface {p1, v1, v3, v2}, Lc4/i;->m([BII)V

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iput-boolean v3, p0, Ld4/a;->c:Z

    .line 22
    .line 23
    array-length v0, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object v0, Ld4/a;->s:[B

    .line 26
    .line 27
    invoke-interface {p1}, Lc4/i;->i()V

    .line 28
    .line 29
    .line 30
    array-length v1, v0

    .line 31
    new-array v1, v1, [B

    .line 32
    .line 33
    array-length v4, v0

    .line 34
    invoke-interface {p1, v1, v3, v4}, Lc4/i;->m([BII)V

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    iput-boolean v2, p0, Ld4/a;->c:Z

    .line 44
    .line 45
    array-length v0, v0

    .line 46
    :goto_0
    invoke-interface {p1, v0}, Lc4/i;->j(I)V

    .line 47
    .line 48
    .line 49
    return v2

    .line 50
    :cond_1
    return v3
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

.method public final d(Lc4/i;Lc4/s;)I
    .locals 13

    .line 1
    iget-object p2, p0, Ld4/a;->m:Lc4/v;

    .line 2
    .line 3
    invoke-static {p2}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget p2, Lv5/e0;->a:I

    .line 7
    .line 8
    invoke-interface {p1}, Lc4/i;->getPosition()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    cmp-long p2, v0, v2

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ld4/a;->c(Lc4/i;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    const-string p2, "Could not find AMR header."

    .line 27
    .line 28
    invoke-static {p2, p1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    throw p1

    .line 33
    :cond_1
    :goto_0
    iget-boolean p2, p0, Ld4/a;->o:Z

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    if-nez p2, :cond_4

    .line 37
    .line 38
    iput-boolean v0, p0, Ld4/a;->o:Z

    .line 39
    .line 40
    iget-boolean p2, p0, Ld4/a;->c:Z

    .line 41
    .line 42
    if-eqz p2, :cond_2

    .line 43
    .line 44
    const-string v1, "audio/amr-wb"

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const-string v1, "audio/3gpp"

    .line 48
    .line 49
    :goto_1
    if-eqz p2, :cond_3

    .line 50
    .line 51
    const/16 p2, 0x3e80

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    const/16 p2, 0x1f40

    .line 55
    .line 56
    :goto_2
    iget-object v2, p0, Ld4/a;->m:Lc4/v;

    .line 57
    .line 58
    new-instance v3, Lv3/i0$a;

    .line 59
    .line 60
    invoke-direct {v3}, Lv3/i0$a;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v1, v3, Lv3/i0$a;->k:Ljava/lang/String;

    .line 64
    .line 65
    sget v1, Ld4/a;->t:I

    .line 66
    .line 67
    iput v1, v3, Lv3/i0$a;->l:I

    .line 68
    .line 69
    iput v0, v3, Lv3/i0$a;->x:I

    .line 70
    .line 71
    iput p2, v3, Lv3/i0$a;->y:I

    .line 72
    .line 73
    new-instance p2, Lv3/i0;

    .line 74
    .line 75
    invoke-direct {p2, v3}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v2, p2}, Lc4/v;->d(Lv3/i0;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    iget p2, p0, Ld4/a;->f:I

    .line 82
    .line 83
    const-wide/16 v1, 0x4e20

    .line 84
    .line 85
    const/4 v3, 0x0

    .line 86
    const/4 v4, -0x1

    .line 87
    if-nez p2, :cond_6

    .line 88
    .line 89
    :try_start_0
    invoke-virtual {p0, p1}, Ld4/a;->a(Lc4/i;)I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    iput p2, p0, Ld4/a;->e:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    .line 95
    iput p2, p0, Ld4/a;->f:I

    .line 96
    .line 97
    iget p2, p0, Ld4/a;->i:I

    .line 98
    .line 99
    if-ne p2, v4, :cond_5

    .line 100
    .line 101
    invoke-interface {p1}, Lc4/i;->getPosition()J

    .line 102
    .line 103
    .line 104
    move-result-wide v5

    .line 105
    iput-wide v5, p0, Ld4/a;->h:J

    .line 106
    .line 107
    iget p2, p0, Ld4/a;->e:I

    .line 108
    .line 109
    iput p2, p0, Ld4/a;->i:I

    .line 110
    .line 111
    :cond_5
    iget p2, p0, Ld4/a;->i:I

    .line 112
    .line 113
    iget v5, p0, Ld4/a;->e:I

    .line 114
    .line 115
    if-ne p2, v5, :cond_6

    .line 116
    .line 117
    iget p2, p0, Ld4/a;->j:I

    .line 118
    .line 119
    add-int/2addr p2, v0

    .line 120
    iput p2, p0, Ld4/a;->j:I

    .line 121
    .line 122
    :cond_6
    iget-object p2, p0, Ld4/a;->m:Lc4/v;

    .line 123
    .line 124
    iget v5, p0, Ld4/a;->f:I

    .line 125
    .line 126
    invoke-interface {p2, p1, v5, v0}, Lc4/v;->e(Lt5/h;IZ)I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-ne p2, v4, :cond_7

    .line 131
    .line 132
    :catch_0
    move p2, v4

    .line 133
    goto :goto_4

    .line 134
    :cond_7
    iget v5, p0, Ld4/a;->f:I

    .line 135
    .line 136
    sub-int/2addr v5, p2

    .line 137
    iput v5, p0, Ld4/a;->f:I

    .line 138
    .line 139
    if-lez v5, :cond_8

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_8
    iget-object v6, p0, Ld4/a;->m:Lc4/v;

    .line 143
    .line 144
    iget-wide v7, p0, Ld4/a;->k:J

    .line 145
    .line 146
    iget-wide v9, p0, Ld4/a;->d:J

    .line 147
    .line 148
    add-long/2addr v7, v9

    .line 149
    const/4 v9, 0x1

    .line 150
    iget v10, p0, Ld4/a;->e:I

    .line 151
    .line 152
    const/4 v11, 0x0

    .line 153
    const/4 v12, 0x0

    .line 154
    invoke-interface/range {v6 .. v12}, Lc4/v;->c(JIIILc4/v$a;)V

    .line 155
    .line 156
    .line 157
    iget-wide v5, p0, Ld4/a;->d:J

    .line 158
    .line 159
    add-long/2addr v5, v1

    .line 160
    iput-wide v5, p0, Ld4/a;->d:J

    .line 161
    .line 162
    :goto_3
    move p2, v3

    .line 163
    :goto_4
    invoke-interface {p1}, Lc4/i;->getLength()J

    .line 164
    .line 165
    .line 166
    move-result-wide v8

    .line 167
    iget-boolean p1, p0, Ld4/a;->g:Z

    .line 168
    .line 169
    if-eqz p1, :cond_9

    .line 170
    .line 171
    goto :goto_8

    .line 172
    :cond_9
    iget p1, p0, Ld4/a;->b:I

    .line 173
    .line 174
    and-int/lit8 v5, p1, 0x1

    .line 175
    .line 176
    if-eqz v5, :cond_d

    .line 177
    .line 178
    const-wide/16 v5, -0x1

    .line 179
    .line 180
    cmp-long v5, v8, v5

    .line 181
    .line 182
    if-eqz v5, :cond_d

    .line 183
    .line 184
    iget v7, p0, Ld4/a;->i:I

    .line 185
    .line 186
    if-eq v7, v4, :cond_a

    .line 187
    .line 188
    iget v5, p0, Ld4/a;->e:I

    .line 189
    .line 190
    if-eq v7, v5, :cond_a

    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_a
    iget v5, p0, Ld4/a;->j:I

    .line 194
    .line 195
    const/16 v6, 0x14

    .line 196
    .line 197
    if-ge v5, v6, :cond_b

    .line 198
    .line 199
    if-ne p2, v4, :cond_e

    .line 200
    .line 201
    :cond_b
    and-int/lit8 p1, p1, 0x2

    .line 202
    .line 203
    if-eqz p1, :cond_c

    .line 204
    .line 205
    move v12, v0

    .line 206
    goto :goto_5

    .line 207
    :cond_c
    move v12, v3

    .line 208
    :goto_5
    int-to-long v3, v7

    .line 209
    const-wide/16 v5, 0x8

    .line 210
    .line 211
    mul-long/2addr v3, v5

    .line 212
    const-wide/32 v5, 0xf4240

    .line 213
    .line 214
    .line 215
    mul-long/2addr v3, v5

    .line 216
    div-long/2addr v3, v1

    .line 217
    long-to-int v6, v3

    .line 218
    new-instance p1, Lc4/d;

    .line 219
    .line 220
    iget-wide v10, p0, Ld4/a;->h:J

    .line 221
    .line 222
    move-object v5, p1

    .line 223
    invoke-direct/range {v5 .. v12}, Lc4/d;-><init>(IIJJZ)V

    .line 224
    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_d
    :goto_6
    new-instance p1, Lc4/t$b;

    .line 228
    .line 229
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    invoke-direct {p1, v1, v2}, Lc4/t$b;-><init>(J)V

    .line 235
    .line 236
    .line 237
    :goto_7
    iput-object p1, p0, Ld4/a;->n:Lc4/t;

    .line 238
    .line 239
    iget-object v1, p0, Ld4/a;->l:Lc4/j;

    .line 240
    .line 241
    invoke-interface {v1, p1}, Lc4/j;->t(Lc4/t;)V

    .line 242
    .line 243
    .line 244
    iput-boolean v0, p0, Ld4/a;->g:Z

    .line 245
    .line 246
    :cond_e
    :goto_8
    return p2
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
.end method

.method public final f(JJ)V
    .locals 3

    .line 1
    const-wide/16 p3, 0x0

    .line 2
    .line 3
    iput-wide p3, p0, Ld4/a;->d:J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput v0, p0, Ld4/a;->e:I

    .line 7
    .line 8
    iput v0, p0, Ld4/a;->f:I

    .line 9
    .line 10
    cmp-long v0, p1, p3

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Ld4/a;->n:Lc4/t;

    .line 15
    .line 16
    instance-of v1, v0, Lc4/d;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    check-cast v0, Lc4/d;

    .line 21
    .line 22
    iget-wide v1, v0, Lc4/d;->b:J

    .line 23
    .line 24
    iget v0, v0, Lc4/d;->e:I

    .line 25
    .line 26
    sub-long/2addr p1, v1

    .line 27
    invoke-static {p3, p4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    const-wide/16 p3, 0x8

    .line 32
    .line 33
    mul-long/2addr p1, p3

    .line 34
    const-wide/32 p3, 0xf4240

    .line 35
    .line 36
    .line 37
    mul-long/2addr p1, p3

    .line 38
    int-to-long p3, v0

    .line 39
    div-long/2addr p1, p3

    .line 40
    iput-wide p1, p0, Ld4/a;->k:J

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iput-wide p3, p0, Ld4/a;->k:J

    .line 44
    .line 45
    :goto_0
    return-void
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
.end method

.method public final i(Lc4/i;)Z
    .locals 0

    invoke-virtual {p0, p1}, Ld4/a;->c(Lc4/i;)Z

    move-result p1

    return p1
.end method

.method public final release()V
    .locals 0

    return-void
.end method
