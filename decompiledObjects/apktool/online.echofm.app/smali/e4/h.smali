.class public Le4/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/io/DataInputStream;

.field public b:Le4/c;

.field public c:Le4/d;

.field public d:[B

.field public e:Le4/a$b;

.field public volatile f:Z


# direct methods
.method public constructor <init>(Le4/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Le4/h;->a:Ljava/io/DataInputStream;

    .line 6
    .line 7
    iput-object v0, p0, Le4/h;->b:Le4/c;

    .line 8
    .line 9
    iput-object v0, p0, Le4/h;->c:Le4/d;

    .line 10
    .line 11
    const/16 v0, 0x70

    .line 12
    .line 13
    new-array v0, v0, [B

    .line 14
    .line 15
    iput-object v0, p0, Le4/h;->d:[B

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Le4/h;->f:Z

    .line 19
    .line 20
    iput-object p1, p0, Le4/h;->b:Le4/c;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a(ZB[B)V
    .locals 1

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    if-ne p2, v0, :cond_1

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p3}, Le4/h;->c([B)V

    .line 8
    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    new-instance p1, Le4/e;

    .line 12
    .line 13
    const-string p2, "PING must not fragment across frames"

    .line 14
    .line 15
    invoke-direct {p1, p2}, Le4/e;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1

    .line 19
    :cond_1
    iget-object v0, p0, Le4/h;->e:Le4/a$b;

    .line 20
    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    if-nez p2, :cond_2

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    new-instance p1, Le4/e;

    .line 27
    .line 28
    const-string p2, "Failed to continue outstanding frame"

    .line 29
    .line 30
    invoke-direct {p1, p2}, Le4/e;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_3
    :goto_0
    if-nez v0, :cond_5

    .line 35
    .line 36
    if-eqz p2, :cond_4

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_4
    new-instance p1, Le4/e;

    .line 40
    .line 41
    const-string p2, "Received continuing frame, but there\'s nothing to continue"

    .line 42
    .line 43
    invoke-direct {p1, p2}, Le4/e;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_5
    :goto_1
    if-nez v0, :cond_6

    .line 48
    .line 49
    invoke-static {p2}, Le4/a;->a(B)Le4/a$b;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    iput-object p2, p0, Le4/h;->e:Le4/a$b;

    .line 54
    .line 55
    :cond_6
    iget-object p2, p0, Le4/h;->e:Le4/a$b;

    .line 56
    .line 57
    invoke-interface {p2, p3}, Le4/a$b;->a([B)Z

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-eqz p2, :cond_9

    .line 62
    .line 63
    if-eqz p1, :cond_8

    .line 64
    .line 65
    iget-object p1, p0, Le4/h;->e:Le4/a$b;

    .line 66
    .line 67
    invoke-interface {p1}, Le4/a$b;->b()Le4/g;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const/4 p2, 0x0

    .line 72
    iput-object p2, p0, Le4/h;->e:Le4/a$b;

    .line 73
    .line 74
    if-eqz p1, :cond_7

    .line 75
    .line 76
    iget-object p2, p0, Le4/h;->c:Le4/d;

    .line 77
    .line 78
    invoke-interface {p2, p1}, Le4/d;->f(Le4/g;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_7
    new-instance p1, Le4/e;

    .line 83
    .line 84
    const-string p2, "Failed to decode whole message"

    .line 85
    .line 86
    invoke-direct {p1, p2}, Le4/e;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :cond_8
    :goto_2
    return-void

    .line 91
    :cond_9
    new-instance p1, Le4/e;

    .line 92
    .line 93
    const-string p2, "Failed to decode frame"

    .line 94
    .line 95
    invoke-direct {p1, p2}, Le4/e;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p1
.end method

.method public final b(Le4/e;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le4/h;->h()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Le4/h;->b:Le4/c;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Le4/c;->k(Le4/e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final c([B)V
    .locals 2

    .line 1
    array-length v0, p1

    .line 2
    const/16 v1, 0x7d

    .line 3
    .line 4
    if-gt v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Le4/h;->b:Le4/c;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Le4/c;->m([B)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p1, Le4/e;

    .line 13
    .line 14
    const-string v0, "PING frame too long"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Le4/e;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1
.end method

.method public final d([BI)J
    .locals 5

    .line 1
    aget-byte v0, p1, p2

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    const/16 v2, 0x38

    .line 5
    .line 6
    shl-long/2addr v0, v2

    .line 7
    add-int/lit8 v2, p2, 0x1

    .line 8
    .line 9
    aget-byte v2, p1, v2

    .line 10
    .line 11
    and-int/lit16 v2, v2, 0xff

    .line 12
    .line 13
    int-to-long v2, v2

    .line 14
    const/16 v4, 0x30

    .line 15
    .line 16
    shl-long/2addr v2, v4

    .line 17
    add-long/2addr v0, v2

    .line 18
    add-int/lit8 v2, p2, 0x2

    .line 19
    .line 20
    aget-byte v2, p1, v2

    .line 21
    .line 22
    and-int/lit16 v2, v2, 0xff

    .line 23
    .line 24
    int-to-long v2, v2

    .line 25
    const/16 v4, 0x28

    .line 26
    .line 27
    shl-long/2addr v2, v4

    .line 28
    add-long/2addr v0, v2

    .line 29
    add-int/lit8 v2, p2, 0x3

    .line 30
    .line 31
    aget-byte v2, p1, v2

    .line 32
    .line 33
    and-int/lit16 v2, v2, 0xff

    .line 34
    .line 35
    int-to-long v2, v2

    .line 36
    const/16 v4, 0x20

    .line 37
    .line 38
    shl-long/2addr v2, v4

    .line 39
    add-long/2addr v0, v2

    .line 40
    add-int/lit8 v2, p2, 0x4

    .line 41
    .line 42
    aget-byte v2, p1, v2

    .line 43
    .line 44
    and-int/lit16 v2, v2, 0xff

    .line 45
    .line 46
    int-to-long v2, v2

    .line 47
    const/16 v4, 0x18

    .line 48
    .line 49
    shl-long/2addr v2, v4

    .line 50
    add-long/2addr v0, v2

    .line 51
    add-int/lit8 v2, p2, 0x5

    .line 52
    .line 53
    aget-byte v2, p1, v2

    .line 54
    .line 55
    and-int/lit16 v2, v2, 0xff

    .line 56
    .line 57
    shl-int/lit8 v2, v2, 0x10

    .line 58
    .line 59
    int-to-long v2, v2

    .line 60
    add-long/2addr v0, v2

    .line 61
    add-int/lit8 v2, p2, 0x6

    .line 62
    .line 63
    aget-byte v2, p1, v2

    .line 64
    .line 65
    and-int/lit16 v2, v2, 0xff

    .line 66
    .line 67
    shl-int/lit8 v2, v2, 0x8

    .line 68
    .line 69
    int-to-long v2, v2

    .line 70
    add-long/2addr v0, v2

    .line 71
    add-int/lit8 p2, p2, 0x7

    .line 72
    .line 73
    aget-byte p1, p1, p2

    .line 74
    .line 75
    and-int/lit16 p1, p1, 0xff

    .line 76
    .line 77
    int-to-long p1, p1

    .line 78
    add-long/2addr v0, p1

    .line 79
    return-wide v0
.end method

.method public final e([BII)I
    .locals 1

    .line 1
    iget-object v0, p0, Le4/h;->a:Ljava/io/DataInputStream;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/DataInputStream;->readFully([BII)V

    .line 4
    .line 5
    .line 6
    return p3
.end method

.method public f()V
    .locals 12

    .line 1
    iget-object v0, p0, Le4/h;->b:Le4/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Le4/c;->g()Le4/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Le4/h;->c:Le4/d;

    .line 8
    .line 9
    :catch_0
    :goto_0
    iget-boolean v0, p0, Le4/h;->f:Z

    .line 10
    .line 11
    if-nez v0, :cond_9

    .line 12
    .line 13
    :try_start_0
    iget-object v0, p0, Le4/h;->d:[B

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-virtual {p0, v0, v1, v2}, Le4/h;->e([BII)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object v3, p0, Le4/h;->d:[B

    .line 22
    .line 23
    aget-byte v4, v3, v1

    .line 24
    .line 25
    and-int/lit16 v5, v4, 0x80

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    move v5, v2

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    move v5, v1

    .line 32
    :goto_1
    and-int/lit8 v6, v4, 0x70

    .line 33
    .line 34
    if-nez v6, :cond_8

    .line 35
    .line 36
    and-int/lit8 v4, v4, 0xf

    .line 37
    .line 38
    int-to-byte v4, v4

    .line 39
    invoke-virtual {p0, v3, v0, v2}, Le4/h;->e([BII)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    add-int/2addr v0, v3

    .line 44
    iget-object v3, p0, Le4/h;->d:[B

    .line 45
    .line 46
    aget-byte v6, v3, v2

    .line 47
    .line 48
    const/16 v7, 0x7e

    .line 49
    .line 50
    const/4 v8, 0x2

    .line 51
    const/16 v9, 0x8

    .line 52
    .line 53
    if-ge v6, v7, :cond_1

    .line 54
    .line 55
    int-to-long v6, v6

    .line 56
    goto :goto_2

    .line 57
    :cond_1
    if-ne v6, v7, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0, v3, v0, v8}, Le4/h;->e([BII)I

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Le4/h;->d:[B

    .line 63
    .line 64
    aget-byte v3, v0, v8

    .line 65
    .line 66
    and-int/lit16 v3, v3, 0xff

    .line 67
    .line 68
    int-to-long v6, v3

    .line 69
    shl-long/2addr v6, v9

    .line 70
    const/4 v3, 0x3

    .line 71
    aget-byte v0, v0, v3

    .line 72
    .line 73
    and-int/lit16 v0, v0, 0xff

    .line 74
    .line 75
    int-to-long v10, v0

    .line 76
    or-long/2addr v6, v10

    .line 77
    goto :goto_2

    .line 78
    :catch_1
    move-exception v0

    .line 79
    goto :goto_4

    .line 80
    :catch_2
    move-exception v0

    .line 81
    goto :goto_5

    .line 82
    :cond_2
    const/16 v7, 0x7f

    .line 83
    .line 84
    if-ne v6, v7, :cond_3

    .line 85
    .line 86
    invoke-virtual {p0, v3, v0, v9}, Le4/h;->e([BII)I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    add-int/2addr v0, v3

    .line 91
    iget-object v3, p0, Le4/h;->d:[B

    .line 92
    .line 93
    sub-int/2addr v0, v9

    .line 94
    invoke-virtual {p0, v3, v0}, Le4/h;->d([BI)J

    .line 95
    .line 96
    .line 97
    move-result-wide v6

    .line 98
    goto :goto_2

    .line 99
    :cond_3
    const-wide/16 v6, 0x0

    .line 100
    .line 101
    :goto_2
    long-to-int v0, v6

    .line 102
    new-array v3, v0, [B

    .line 103
    .line 104
    invoke-virtual {p0, v3, v1, v0}, Le4/h;->e([BII)I

    .line 105
    .line 106
    .line 107
    if-ne v4, v9, :cond_4

    .line 108
    .line 109
    iget-object v0, p0, Le4/h;->b:Le4/c;

    .line 110
    .line 111
    invoke-virtual {v0}, Le4/c;->l()V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_4
    const/16 v0, 0xa

    .line 116
    .line 117
    if-ne v4, v0, :cond_5

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_5
    if-eq v4, v2, :cond_7

    .line 121
    .line 122
    if-eq v4, v8, :cond_7

    .line 123
    .line 124
    const/16 v0, 0x9

    .line 125
    .line 126
    if-eq v4, v0, :cond_7

    .line 127
    .line 128
    if-nez v4, :cond_6

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_6
    new-instance v0, Le4/e;

    .line 132
    .line 133
    new-instance v1, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    .line 138
    const-string v2, "Unsupported opcode: "

    .line 139
    .line 140
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-direct {v0, v1}, Le4/e;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw v0

    .line 154
    :cond_7
    :goto_3
    invoke-virtual {p0, v5, v4, v3}, Le4/h;->a(ZB[B)V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_0

    .line 158
    .line 159
    :cond_8
    new-instance v0, Le4/e;

    .line 160
    .line 161
    const-string v1, "Invalid frame received"

    .line 162
    .line 163
    invoke-direct {v0, v1}, Le4/e;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw v0
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Le4/e; {:try_start_0 .. :try_end_0} :catch_1

    .line 167
    :goto_4
    invoke-virtual {p0, v0}, Le4/h;->b(Le4/e;)V

    .line 168
    .line 169
    .line 170
    goto/16 :goto_0

    .line 171
    .line 172
    :goto_5
    new-instance v1, Le4/e;

    .line 173
    .line 174
    const-string v2, "IO Error"

    .line 175
    .line 176
    invoke-direct {v1, v2, v0}, Le4/e;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0, v1}, Le4/h;->b(Le4/e;)V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_9
    return-void
.end method

.method public g(Ljava/io/DataInputStream;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le4/h;->a:Ljava/io/DataInputStream;

    .line 2
    .line 3
    return-void
.end method

.method public h()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Le4/h;->f:Z

    .line 3
    .line 4
    return-void
.end method
