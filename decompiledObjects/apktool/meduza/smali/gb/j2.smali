.class public final Lgb/j2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgb/j2$a;,
        Lgb/j2$b;,
        Lgb/j2$c;
    }
.end annotation


# instance fields
.field public final a:Lgb/j2$c;

.field public b:I

.field public c:Lgb/s3;

.field public d:Leb/l;

.field public final e:Lgb/j2$b;

.field public final f:Ljava/nio/ByteBuffer;

.field public final g:Lgb/t3;

.field public final h:Lgb/l3;

.field public i:Z

.field public j:I

.field public k:I

.field public l:J


# direct methods
.method public constructor <init>(Lgb/j2$c;Leb/y;Lgb/l3;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lgb/j2;->b:I

    sget-object v1, Leb/j$b;->a:Leb/j$b;

    iput-object v1, p0, Lgb/j2;->d:Leb/l;

    new-instance v1, Lgb/j2$b;

    invoke-direct {v1, p0}, Lgb/j2$b;-><init>(Lgb/j2;)V

    iput-object v1, p0, Lgb/j2;->e:Lgb/j2$b;

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, p0, Lgb/j2;->f:Ljava/nio/ByteBuffer;

    iput v0, p0, Lgb/j2;->k:I

    const-string v0, "sink"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lgb/j2;->a:Lgb/j2$c;

    iput-object p2, p0, Lgb/j2;->g:Lgb/t3;

    iput-object p3, p0, Lgb/j2;->h:Lgb/l3;

    return-void
.end method

.method public static f(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    .locals 6

    .line 1
    instance-of v0, p0, Leb/t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Leb/t;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Leb/t;->f(Ljava/io/OutputStream;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    sget v0, Lp7/b;->a:I

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/16 v0, 0x2000

    .line 21
    .line 22
    new-array v0, v0, [B

    .line 23
    .line 24
    const-wide/16 v1, 0x0

    .line 25
    .line 26
    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const/4 v4, -0x1

    .line 31
    const/4 v5, 0x0

    .line 32
    if-ne v3, v4, :cond_2

    .line 33
    .line 34
    const-wide/32 p0, 0x7fffffff

    .line 35
    .line 36
    .line 37
    cmp-long p0, v1, p0

    .line 38
    .line 39
    if-gtz p0, :cond_1

    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    :cond_1
    const-string p0, "Message size overflow: %s"

    .line 43
    .line 44
    invoke-static {v1, v2, p0, v5}, Lx6/b;->m(JLjava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    long-to-int p0, v1

    .line 48
    return p0

    .line 49
    :cond_2
    invoke-virtual {p1, v0, v5, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 50
    .line 51
    .line 52
    int-to-long v3, v3

    .line 53
    add-long/2addr v1, v3

    .line 54
    goto :goto_0
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


# virtual methods
.method public final a(Leb/l;)Lgb/t0;
    .locals 1

    const-string v0, "Can\'t pass an empty compressor"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lgb/j2;->d:Leb/l;

    return-object p0
.end method

.method public final b(Ljava/io/InputStream;)V
    .locals 13

    .line 1
    const-string v0, "Failed to frame message"

    .line 2
    .line 3
    iget-boolean v1, p0, Lgb/j2;->i:Z

    .line 4
    .line 5
    if-nez v1, :cond_a

    .line 6
    .line 7
    iget v1, p0, Lgb/j2;->j:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    add-int/2addr v1, v2

    .line 11
    iput v1, p0, Lgb/j2;->j:I

    .line 12
    .line 13
    iget v1, p0, Lgb/j2;->k:I

    .line 14
    .line 15
    add-int/2addr v1, v2

    .line 16
    iput v1, p0, Lgb/j2;->k:I

    .line 17
    .line 18
    const-wide/16 v3, 0x0

    .line 19
    .line 20
    iput-wide v3, p0, Lgb/j2;->l:J

    .line 21
    .line 22
    iget-object v3, p0, Lgb/j2;->h:Lgb/l3;

    .line 23
    .line 24
    iget-object v3, v3, Lgb/l3;->a:[Lm/e;

    .line 25
    .line 26
    array-length v4, v3

    .line 27
    const/4 v5, 0x0

    .line 28
    move v6, v5

    .line 29
    :goto_0
    if-ge v6, v4, :cond_0

    .line 30
    .line 31
    aget-object v7, v3, v6

    .line 32
    .line 33
    invoke-virtual {v7, v1}, Lm/e;->k(I)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 v6, v6, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object v1, p0, Lgb/j2;->d:Leb/l;

    .line 40
    .line 41
    sget-object v3, Leb/j$b;->a:Leb/j$b;

    .line 42
    .line 43
    if-eq v1, v3, :cond_1

    .line 44
    .line 45
    move v1, v2

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move v1, v5

    .line 48
    :goto_1
    :try_start_0
    instance-of v3, p1, Leb/j0;

    .line 49
    .line 50
    const/4 v4, -0x1

    .line 51
    if-nez v3, :cond_3

    .line 52
    .line 53
    instance-of v3, p1, Ljava/io/ByteArrayInputStream;

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    move v3, v4

    .line 59
    goto :goto_3

    .line 60
    :cond_3
    :goto_2
    invoke-virtual {p1}, Ljava/io/InputStream;->available()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    :goto_3
    if-eqz v3, :cond_4

    .line 65
    .line 66
    if-eqz v1, :cond_4

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lgb/j2;->d(Ljava/io/InputStream;)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    goto :goto_4

    .line 73
    :cond_4
    invoke-virtual {p0, p1, v3}, Lgb/j2;->g(Ljava/io/InputStream;I)I

    .line 74
    .line 75
    .line 76
    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Leb/g1; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    :goto_4
    if-eq v3, v4, :cond_6

    .line 78
    .line 79
    if-ne p1, v3, :cond_5

    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_5
    const/4 v0, 0x2

    .line 83
    new-array v0, v0, [Ljava/lang/Object;

    .line 84
    .line 85
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    aput-object p1, v0, v5

    .line 90
    .line 91
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    aput-object p1, v0, v2

    .line 96
    .line 97
    const-string p1, "Message length inaccurate %s != %s"

    .line 98
    .line 99
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    sget-object v0, Leb/e1;->m:Leb/e1;

    .line 104
    .line 105
    invoke-virtual {v0, p1}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    new-instance v0, Leb/g1;

    .line 110
    .line 111
    invoke-direct {v0, p1}, Leb/g1;-><init>(Leb/e1;)V

    .line 112
    .line 113
    .line 114
    throw v0

    .line 115
    :cond_6
    :goto_5
    iget-object v0, p0, Lgb/j2;->h:Lgb/l3;

    .line 116
    .line 117
    int-to-long v1, p1

    .line 118
    iget-object p1, v0, Lgb/l3;->a:[Lm/e;

    .line 119
    .line 120
    array-length v0, p1

    .line 121
    move v3, v5

    .line 122
    :goto_6
    if-ge v3, v0, :cond_7

    .line 123
    .line 124
    aget-object v4, p1, v3

    .line 125
    .line 126
    invoke-virtual {v4, v1, v2}, Lm/e;->m(J)V

    .line 127
    .line 128
    .line 129
    add-int/lit8 v3, v3, 0x1

    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_7
    iget-object p1, p0, Lgb/j2;->h:Lgb/l3;

    .line 133
    .line 134
    iget-wide v3, p0, Lgb/j2;->l:J

    .line 135
    .line 136
    iget-object p1, p1, Lgb/l3;->a:[Lm/e;

    .line 137
    .line 138
    array-length v0, p1

    .line 139
    move v6, v5

    .line 140
    :goto_7
    if-ge v6, v0, :cond_8

    .line 141
    .line 142
    aget-object v7, p1, v6

    .line 143
    .line 144
    invoke-virtual {v7, v3, v4}, Lm/e;->n(J)V

    .line 145
    .line 146
    .line 147
    add-int/lit8 v6, v6, 0x1

    .line 148
    .line 149
    goto :goto_7

    .line 150
    :cond_8
    iget-object p1, p0, Lgb/j2;->h:Lgb/l3;

    .line 151
    .line 152
    iget v0, p0, Lgb/j2;->k:I

    .line 153
    .line 154
    iget-wide v3, p0, Lgb/j2;->l:J

    .line 155
    .line 156
    iget-object p1, p1, Lgb/l3;->a:[Lm/e;

    .line 157
    .line 158
    array-length v12, p1

    .line 159
    :goto_8
    if-ge v5, v12, :cond_9

    .line 160
    .line 161
    aget-object v6, p1, v5

    .line 162
    .line 163
    move v7, v0

    .line 164
    move-wide v8, v3

    .line 165
    move-wide v10, v1

    .line 166
    invoke-virtual/range {v6 .. v11}, Lm/e;->l(IJJ)V

    .line 167
    .line 168
    .line 169
    add-int/lit8 v5, v5, 0x1

    .line 170
    .line 171
    goto :goto_8

    .line 172
    :cond_9
    return-void

    .line 173
    :catch_0
    move-exception p1

    .line 174
    sget-object v1, Leb/e1;->m:Leb/e1;

    .line 175
    .line 176
    invoke-virtual {v1, v0}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {v0, p1}, Leb/e1;->f(Ljava/lang/Throwable;)Leb/e1;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    new-instance v0, Leb/g1;

    .line 185
    .line 186
    invoke-direct {v0, p1}, Leb/g1;-><init>(Leb/e1;)V

    .line 187
    .line 188
    .line 189
    throw v0

    .line 190
    :catch_1
    move-exception p1

    .line 191
    throw p1

    .line 192
    :catch_2
    move-exception p1

    .line 193
    sget-object v1, Leb/e1;->m:Leb/e1;

    .line 194
    .line 195
    invoke-virtual {v1, v0}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v0, p1}, Leb/e1;->f(Ljava/lang/Throwable;)Leb/e1;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    new-instance v0, Leb/g1;

    .line 204
    .line 205
    invoke-direct {v0, p1}, Leb/g1;-><init>(Leb/e1;)V

    .line 206
    .line 207
    .line 208
    throw v0

    .line 209
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 210
    .line 211
    const-string v0, "Framer already closed"

    .line 212
    .line 213
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw p1
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

.method public final c(Lgb/j2$a;Z)V
    .locals 5

    .line 1
    iget-object v0, p1, Lgb/j2$a;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lgb/s3;

    .line 20
    .line 21
    invoke-interface {v3}, Lgb/s3;->b()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    add-int/2addr v2, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget v0, p0, Lgb/j2;->b:I

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    if-ltz v0, :cond_2

    .line 31
    .line 32
    if-gt v2, v0, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    sget-object p1, Leb/e1;->k:Leb/e1;

    .line 36
    .line 37
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    new-array v0, v0, [Ljava/lang/Object;

    .line 41
    .line 42
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    aput-object v2, v0, v1

    .line 47
    .line 48
    iget v1, p0, Lgb/j2;->b:I

    .line 49
    .line 50
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    aput-object v1, v0, v3

    .line 55
    .line 56
    const-string v1, "message too large %d > %d"

    .line 57
    .line 58
    invoke-static {p2, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {p1, p2}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance p2, Leb/g1;

    .line 67
    .line 68
    invoke-direct {p2, p1}, Leb/g1;-><init>(Leb/e1;)V

    .line 69
    .line 70
    .line 71
    throw p2

    .line 72
    :cond_2
    :goto_1
    iget-object v0, p0, Lgb/j2;->f:Ljava/nio/ByteBuffer;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lgb/j2;->f:Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-virtual {p2, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 84
    .line 85
    .line 86
    iget-object p2, p0, Lgb/j2;->g:Lgb/t3;

    .line 87
    .line 88
    const/4 v0, 0x5

    .line 89
    invoke-interface {p2, v0}, Lgb/t3;->a(I)Lhb/o;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    iget-object v0, p0, Lgb/j2;->f:Ljava/nio/ByteBuffer;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iget-object v4, p0, Lgb/j2;->f:Ljava/nio/ByteBuffer;

    .line 100
    .line 101
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    invoke-virtual {p2, v0, v1, v4}, Lhb/o;->write([BII)V

    .line 106
    .line 107
    .line 108
    if-nez v2, :cond_3

    .line 109
    .line 110
    iput-object p2, p0, Lgb/j2;->c:Lgb/s3;

    .line 111
    .line 112
    return-void

    .line 113
    :cond_3
    iget-object v0, p0, Lgb/j2;->a:Lgb/j2$c;

    .line 114
    .line 115
    iget v4, p0, Lgb/j2;->j:I

    .line 116
    .line 117
    sub-int/2addr v4, v3

    .line 118
    invoke-interface {v0, p2, v1, v1, v4}, Lgb/j2$c;->c(Lgb/s3;ZZI)V

    .line 119
    .line 120
    .line 121
    iput v3, p0, Lgb/j2;->j:I

    .line 122
    .line 123
    iget-object p1, p1, Lgb/j2$a;->a:Ljava/util/ArrayList;

    .line 124
    .line 125
    move p2, v1

    .line 126
    :goto_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    sub-int/2addr v0, v3

    .line 131
    if-ge p2, v0, :cond_4

    .line 132
    .line 133
    iget-object v0, p0, Lgb/j2;->a:Lgb/j2$c;

    .line 134
    .line 135
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    check-cast v4, Lgb/s3;

    .line 140
    .line 141
    invoke-interface {v0, v4, v1, v1, v1}, Lgb/j2$c;->c(Lgb/s3;ZZI)V

    .line 142
    .line 143
    .line 144
    add-int/lit8 p2, p2, 0x1

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_4
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 148
    .line 149
    .line 150
    move-result p2

    .line 151
    sub-int/2addr p2, v3

    .line 152
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    check-cast p1, Lgb/s3;

    .line 157
    .line 158
    iput-object p1, p0, Lgb/j2;->c:Lgb/s3;

    .line 159
    .line 160
    int-to-long p1, v2

    .line 161
    iput-wide p1, p0, Lgb/j2;->l:J

    .line 162
    .line 163
    return-void
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

.method public final close()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lgb/j2;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lgb/j2;->i:Z

    .line 7
    .line 8
    iget-object v1, p0, Lgb/j2;->c:Lgb/s3;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v1}, Lgb/s3;->b()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lgb/j2;->c:Lgb/s3;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-interface {v1}, Lgb/s3;->release()V

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, Lgb/j2;->c:Lgb/s3;

    .line 27
    .line 28
    :cond_0
    iget-object v1, p0, Lgb/j2;->c:Lgb/s3;

    .line 29
    .line 30
    iput-object v2, p0, Lgb/j2;->c:Lgb/s3;

    .line 31
    .line 32
    iget-object v2, p0, Lgb/j2;->a:Lgb/j2$c;

    .line 33
    .line 34
    iget v3, p0, Lgb/j2;->j:I

    .line 35
    .line 36
    invoke-interface {v2, v1, v0, v0, v3}, Lgb/j2$c;->c(Lgb/s3;ZZI)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    iput v0, p0, Lgb/j2;->j:I

    .line 41
    .line 42
    :cond_1
    return-void
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
.end method

.method public final d(Ljava/io/InputStream;)I
    .locals 5

    .line 1
    new-instance v0, Lgb/j2$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lgb/j2$a;-><init>(Lgb/j2;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lgb/j2;->d:Leb/l;

    .line 7
    .line 8
    invoke-interface {v1, v0}, Leb/l;->b(Lgb/j2$a;)Ljava/io/OutputStream;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :try_start_0
    invoke-static {p1, v1}, Lgb/j2;->f(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    .line 13
    .line 14
    .line 15
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 17
    .line 18
    .line 19
    iget v1, p0, Lgb/j2;->b:I

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    if-ltz v1, :cond_1

    .line 23
    .line 24
    if-gt p1, v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    sget-object v0, Leb/e1;->k:Leb/e1;

    .line 28
    .line 29
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    new-array v3, v3, [Ljava/lang/Object;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    aput-object p1, v3, v4

    .line 40
    .line 41
    iget p1, p0, Lgb/j2;->b:I

    .line 42
    .line 43
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    aput-object p1, v3, v2

    .line 48
    .line 49
    const-string p1, "message too large %d > %d"

    .line 50
    .line 51
    invoke-static {v1, p1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {v0, p1}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    new-instance v0, Leb/g1;

    .line 60
    .line 61
    invoke-direct {v0, p1}, Leb/g1;-><init>(Leb/e1;)V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_1
    :goto_0
    invoke-virtual {p0, v0, v2}, Lgb/j2;->c(Lgb/j2$a;Z)V

    .line 66
    .line 67
    .line 68
    return p1

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 71
    .line 72
    .line 73
    throw p1
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final e([BII)V
    .locals 4

    .line 1
    :goto_0
    if-lez p3, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Lgb/j2;->c:Lgb/s3;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Lgb/s3;->a()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lgb/j2;->c:Lgb/s3;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    iput-object v1, p0, Lgb/j2;->c:Lgb/s3;

    .line 17
    .line 18
    iget-object v1, p0, Lgb/j2;->a:Lgb/j2$c;

    .line 19
    .line 20
    iget v2, p0, Lgb/j2;->j:I

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-interface {v1, v0, v3, v3, v2}, Lgb/j2$c;->c(Lgb/s3;ZZI)V

    .line 24
    .line 25
    .line 26
    iput v3, p0, Lgb/j2;->j:I

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lgb/j2;->c:Lgb/s3;

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Lgb/j2;->g:Lgb/t3;

    .line 33
    .line 34
    invoke-interface {v0, p3}, Lgb/t3;->a(I)Lhb/o;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lgb/j2;->c:Lgb/s3;

    .line 39
    .line 40
    :cond_1
    iget-object v0, p0, Lgb/j2;->c:Lgb/s3;

    .line 41
    .line 42
    invoke-interface {v0}, Lgb/s3;->a()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v1, p0, Lgb/j2;->c:Lgb/s3;

    .line 51
    .line 52
    invoke-interface {v1, p1, p2, v0}, Lgb/s3;->write([BII)V

    .line 53
    .line 54
    .line 55
    add-int/2addr p2, v0

    .line 56
    sub-int/2addr p3, v0

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    return-void
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

.method public final flush()V
    .locals 5

    iget-object v0, p0, Lgb/j2;->c:Lgb/s3;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lgb/s3;->b()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    iget-object v1, p0, Lgb/j2;->c:Lgb/s3;

    const/4 v2, 0x0

    iput-object v2, p0, Lgb/j2;->c:Lgb/s3;

    iget-object v2, p0, Lgb/j2;->a:Lgb/j2$c;

    iget v3, p0, Lgb/j2;->j:I

    const/4 v4, 0x0

    invoke-interface {v2, v1, v4, v0, v3}, Lgb/j2$c;->c(Lgb/s3;ZZI)V

    iput v4, p0, Lgb/j2;->j:I

    :cond_0
    return-void
.end method

.method public final g(Ljava/io/InputStream;I)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, -0x1

    .line 3
    if-eq p2, v1, :cond_3

    .line 4
    .line 5
    int-to-long v1, p2

    .line 6
    iput-wide v1, p0, Lgb/j2;->l:J

    .line 7
    .line 8
    iget v1, p0, Lgb/j2;->b:I

    .line 9
    .line 10
    if-ltz v1, :cond_1

    .line 11
    .line 12
    if-gt p2, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object p1, Leb/e1;->k:Leb/e1;

    .line 16
    .line 17
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    new-array v2, v2, [Ljava/lang/Object;

    .line 21
    .line 22
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    aput-object p2, v2, v0

    .line 27
    .line 28
    const/4 p2, 0x1

    .line 29
    iget v0, p0, Lgb/j2;->b:I

    .line 30
    .line 31
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    aput-object v0, v2, p2

    .line 36
    .line 37
    const-string p2, "message too large %d > %d"

    .line 38
    .line 39
    invoke-static {v1, p2, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p1, p2}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance p2, Leb/g1;

    .line 48
    .line 49
    invoke-direct {p2, p1}, Leb/g1;-><init>(Leb/e1;)V

    .line 50
    .line 51
    .line 52
    throw p2

    .line 53
    :cond_1
    :goto_0
    iget-object v1, p0, Lgb/j2;->f:Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lgb/j2;->f:Ljava/nio/ByteBuffer;

    .line 59
    .line 60
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lgb/j2;->c:Lgb/s3;

    .line 68
    .line 69
    if-nez v1, :cond_2

    .line 70
    .line 71
    iget-object v1, p0, Lgb/j2;->g:Lgb/t3;

    .line 72
    .line 73
    iget-object v2, p0, Lgb/j2;->f:Ljava/nio/ByteBuffer;

    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    add-int/2addr v2, p2

    .line 80
    invoke-interface {v1, v2}, Lgb/t3;->a(I)Lhb/o;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    iput-object p2, p0, Lgb/j2;->c:Lgb/s3;

    .line 85
    .line 86
    :cond_2
    iget-object p2, p0, Lgb/j2;->f:Ljava/nio/ByteBuffer;

    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    iget-object v1, p0, Lgb/j2;->f:Ljava/nio/ByteBuffer;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    invoke-virtual {p0, p2, v0, v1}, Lgb/j2;->e([BII)V

    .line 99
    .line 100
    .line 101
    iget-object p2, p0, Lgb/j2;->e:Lgb/j2$b;

    .line 102
    .line 103
    invoke-static {p1, p2}, Lgb/j2;->f(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    return p1

    .line 108
    :cond_3
    new-instance p2, Lgb/j2$a;

    .line 109
    .line 110
    invoke-direct {p2, p0}, Lgb/j2$a;-><init>(Lgb/j2;)V

    .line 111
    .line 112
    .line 113
    invoke-static {p1, p2}, Lgb/j2;->f(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    invoke-virtual {p0, p2, v0}, Lgb/j2;->c(Lgb/j2$a;Z)V

    .line 118
    .line 119
    .line 120
    return p1
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

.method public final h(I)V
    .locals 2

    iget v0, p0, Lgb/j2;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "max size already set"

    invoke-static {v0, v1}, Lx6/b;->I(ZLjava/lang/String;)V

    iput p1, p0, Lgb/j2;->b:I

    return-void
.end method

.method public final isClosed()Z
    .locals 1

    iget-boolean v0, p0, Lgb/j2;->i:Z

    return v0
.end method
