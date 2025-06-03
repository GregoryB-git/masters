.class public abstract Lh0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh0/d$c;,
        Lh0/d$a;,
        Lh0/d$b;
    }
.end annotation


# static fields
.field public static final a:[B

.field public static final b:[F

.field public static final c:Ljava/lang/Object;

.field public static d:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lh0/d;->a:[B

    .line 8
    .line 9
    const/16 v0, 0x11

    .line 10
    .line 11
    new-array v0, v0, [F

    .line 12
    .line 13
    fill-array-data v0, :array_1

    .line 14
    .line 15
    .line 16
    sput-object v0, Lh0/d;->b:[F

    .line 17
    .line 18
    new-instance v0, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lh0/d;->c:Ljava/lang/Object;

    .line 24
    .line 25
    const/16 v0, 0xa

    .line 26
    .line 27
    new-array v0, v0, [I

    .line 28
    .line 29
    sput-object v0, Lh0/d;->d:[I

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x400ba2e9
        0x3fe8ba2f
        0x403a2e8c
        0x401b26ca
        0x3fd1745d
        0x3fae8ba3
        0x3ff83e10
        0x3fcede62
        0x3faaaaab
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
.end method

.method public static a([Z)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    aput-boolean v0, p0, v0

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    aput-boolean v0, p0, v1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    aput-boolean v0, p0, v1

    .line 9
    .line 10
    return-void
.end method

.method public static b(Ljava/nio/ByteBuffer;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    move v3, v2

    .line 8
    :goto_0
    add-int/lit8 v4, v2, 0x1

    .line 9
    .line 10
    if-ge v4, v0, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    and-int/lit16 v5, v5, 0xff

    .line 17
    .line 18
    const/4 v6, 0x3

    .line 19
    if-ne v3, v6, :cond_0

    .line 20
    .line 21
    const/4 v7, 0x1

    .line 22
    if-ne v5, v7, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    and-int/lit8 v7, v7, 0x1f

    .line 29
    .line 30
    const/4 v8, 0x7

    .line 31
    if-ne v7, v8, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    sub-int/2addr v2, v6

    .line 38
    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v3}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    if-nez v5, :cond_1

    .line 52
    .line 53
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    :cond_1
    if-eqz v5, :cond_2

    .line 56
    .line 57
    move v3, v1

    .line 58
    :cond_2
    move v2, v4

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public static c([BII[Z)I
    .locals 8

    .line 1
    sub-int v0, p2, p1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    move v3, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v3, v1

    .line 10
    :goto_0
    invoke-static {v3}, Lg0/a;->f(Z)V

    .line 11
    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return p2

    .line 16
    :cond_1
    aget-boolean v3, p3, v1

    .line 17
    .line 18
    if-eqz v3, :cond_2

    .line 19
    .line 20
    invoke-static {p3}, Lh0/d;->a([Z)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 p1, p1, -0x3

    .line 24
    .line 25
    return p1

    .line 26
    :cond_2
    const/4 v3, 0x2

    .line 27
    if-le v0, v2, :cond_3

    .line 28
    .line 29
    aget-boolean v4, p3, v2

    .line 30
    .line 31
    if-eqz v4, :cond_3

    .line 32
    .line 33
    aget-byte v4, p0, p1

    .line 34
    .line 35
    if-ne v4, v2, :cond_3

    .line 36
    .line 37
    invoke-static {p3}, Lh0/d;->a([Z)V

    .line 38
    .line 39
    .line 40
    sub-int/2addr p1, v3

    .line 41
    return p1

    .line 42
    :cond_3
    if-le v0, v3, :cond_4

    .line 43
    .line 44
    aget-boolean v4, p3, v3

    .line 45
    .line 46
    if-eqz v4, :cond_4

    .line 47
    .line 48
    aget-byte v4, p0, p1

    .line 49
    .line 50
    if-nez v4, :cond_4

    .line 51
    .line 52
    add-int/lit8 v4, p1, 0x1

    .line 53
    .line 54
    aget-byte v4, p0, v4

    .line 55
    .line 56
    if-ne v4, v2, :cond_4

    .line 57
    .line 58
    invoke-static {p3}, Lh0/d;->a([Z)V

    .line 59
    .line 60
    .line 61
    sub-int/2addr p1, v2

    .line 62
    return p1

    .line 63
    :cond_4
    add-int/lit8 v4, p2, -0x1

    .line 64
    .line 65
    add-int/2addr p1, v3

    .line 66
    :goto_1
    if-ge p1, v4, :cond_7

    .line 67
    .line 68
    aget-byte v5, p0, p1

    .line 69
    .line 70
    and-int/lit16 v6, v5, 0xfe

    .line 71
    .line 72
    if-eqz v6, :cond_5

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_5
    add-int/lit8 v6, p1, -0x2

    .line 76
    .line 77
    aget-byte v7, p0, v6

    .line 78
    .line 79
    if-nez v7, :cond_6

    .line 80
    .line 81
    add-int/lit8 v7, p1, -0x1

    .line 82
    .line 83
    aget-byte v7, p0, v7

    .line 84
    .line 85
    if-nez v7, :cond_6

    .line 86
    .line 87
    if-ne v5, v2, :cond_6

    .line 88
    .line 89
    invoke-static {p3}, Lh0/d;->a([Z)V

    .line 90
    .line 91
    .line 92
    return v6

    .line 93
    :cond_6
    add-int/lit8 p1, p1, -0x2

    .line 94
    .line 95
    :goto_2
    add-int/lit8 p1, p1, 0x3

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_7
    if-le v0, v3, :cond_9

    .line 99
    .line 100
    add-int/lit8 p1, p2, -0x3

    .line 101
    .line 102
    aget-byte p1, p0, p1

    .line 103
    .line 104
    if-nez p1, :cond_8

    .line 105
    .line 106
    add-int/lit8 p1, p2, -0x2

    .line 107
    .line 108
    aget-byte p1, p0, p1

    .line 109
    .line 110
    if-nez p1, :cond_8

    .line 111
    .line 112
    aget-byte p1, p0, v4

    .line 113
    .line 114
    if-ne p1, v2, :cond_8

    .line 115
    .line 116
    :goto_3
    move p1, v2

    .line 117
    goto :goto_4

    .line 118
    :cond_8
    move p1, v1

    .line 119
    goto :goto_4

    .line 120
    :cond_9
    if-ne v0, v3, :cond_a

    .line 121
    .line 122
    aget-boolean p1, p3, v3

    .line 123
    .line 124
    if-eqz p1, :cond_8

    .line 125
    .line 126
    add-int/lit8 p1, p2, -0x2

    .line 127
    .line 128
    aget-byte p1, p0, p1

    .line 129
    .line 130
    if-nez p1, :cond_8

    .line 131
    .line 132
    aget-byte p1, p0, v4

    .line 133
    .line 134
    if-ne p1, v2, :cond_8

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_a
    aget-boolean p1, p3, v2

    .line 138
    .line 139
    if-eqz p1, :cond_8

    .line 140
    .line 141
    aget-byte p1, p0, v4

    .line 142
    .line 143
    if-ne p1, v2, :cond_8

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :goto_4
    aput-boolean p1, p3, v1

    .line 147
    .line 148
    if-le v0, v2, :cond_c

    .line 149
    .line 150
    add-int/lit8 p1, p2, -0x2

    .line 151
    .line 152
    aget-byte p1, p0, p1

    .line 153
    .line 154
    if-nez p1, :cond_b

    .line 155
    .line 156
    aget-byte p1, p0, v4

    .line 157
    .line 158
    if-nez p1, :cond_b

    .line 159
    .line 160
    :goto_5
    move p1, v2

    .line 161
    goto :goto_6

    .line 162
    :cond_b
    move p1, v1

    .line 163
    goto :goto_6

    .line 164
    :cond_c
    aget-boolean p1, p3, v3

    .line 165
    .line 166
    if-eqz p1, :cond_b

    .line 167
    .line 168
    aget-byte p1, p0, v4

    .line 169
    .line 170
    if-nez p1, :cond_b

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :goto_6
    aput-boolean p1, p3, v2

    .line 174
    .line 175
    aget-byte p0, p0, v4

    .line 176
    .line 177
    if-nez p0, :cond_d

    .line 178
    .line 179
    move v1, v2

    .line 180
    :cond_d
    aput-boolean v1, p3, v3

    .line 181
    .line 182
    return p2
.end method

.method public static d([BII)I
    .locals 2

    .line 1
    :goto_0
    add-int/lit8 v0, p2, -0x2

    .line 2
    .line 3
    if-ge p1, v0, :cond_1

    .line 4
    .line 5
    aget-byte v0, p0, p1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    add-int/lit8 v0, p1, 0x1

    .line 10
    .line 11
    aget-byte v0, p0, v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    add-int/lit8 v0, p1, 0x2

    .line 16
    .line 17
    aget-byte v0, p0, v0

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    return p1

    .line 23
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return p2
.end method

.method public static e([BI)I
    .locals 0

    .line 1
    add-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    aget-byte p0, p0, p1

    .line 4
    .line 5
    and-int/lit8 p0, p0, 0x7e

    .line 6
    .line 7
    shr-int/lit8 p0, p0, 0x1

    .line 8
    .line 9
    return p0
.end method

.method public static f([BI)I
    .locals 0

    .line 1
    add-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    aget-byte p0, p0, p1

    .line 4
    .line 5
    and-int/lit8 p0, p0, 0x1f

    .line 6
    .line 7
    return p0
.end method

.method public static g(Ljava/lang/String;B)Z
    .locals 3

    .line 1
    const-string v0, "video/avc"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    and-int/lit8 v0, p1, 0x1f

    .line 11
    .line 12
    const/4 v2, 0x6

    .line 13
    if-eq v0, v2, :cond_2

    .line 14
    .line 15
    :cond_0
    const-string v0, "video/hevc"

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    and-int/lit8 p0, p1, 0x7e

    .line 24
    .line 25
    shr-int/2addr p0, v1

    .line 26
    const/16 p1, 0x27

    .line 27
    .line 28
    if-ne p0, p1, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v1, 0x0

    .line 32
    :cond_2
    :goto_0
    return v1
.end method

.method public static h([BII)Lh0/d$a;
    .locals 0

    .line 1
    add-int/lit8 p1, p1, 0x2

    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lh0/d;->i([BII)Lh0/d$a;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static i([BII)Lh0/d$a;
    .locals 25

    .line 1
    new-instance v0, Lh0/e;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    move/from16 v2, p1

    .line 6
    .line 7
    move/from16 v3, p2

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Lh0/e;-><init>([BII)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    invoke-virtual {v0, v1}, Lh0/e;->l(I)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x3

    .line 17
    invoke-virtual {v0, v1}, Lh0/e;->e(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-virtual {v0}, Lh0/e;->k()V

    .line 22
    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    invoke-virtual {v0, v3}, Lh0/e;->e(I)I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    const/4 v4, 0x5

    .line 34
    invoke-virtual {v0, v4}, Lh0/e;->e(I)I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    const/4 v9, 0x0

    .line 39
    const/4 v10, 0x0

    .line 40
    :goto_0
    const/16 v11, 0x20

    .line 41
    .line 42
    const/4 v12, 0x1

    .line 43
    if-ge v10, v11, :cond_1

    .line 44
    .line 45
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 46
    .line 47
    .line 48
    move-result v11

    .line 49
    if-eqz v11, :cond_0

    .line 50
    .line 51
    shl-int v11, v12, v10

    .line 52
    .line 53
    or-int/2addr v9, v11

    .line 54
    :cond_0
    add-int/lit8 v10, v10, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const/4 v10, 0x6

    .line 58
    new-array v13, v10, [I

    .line 59
    .line 60
    const/4 v11, 0x0

    .line 61
    :goto_1
    const/16 v14, 0x8

    .line 62
    .line 63
    if-ge v11, v10, :cond_2

    .line 64
    .line 65
    invoke-virtual {v0, v14}, Lh0/e;->e(I)I

    .line 66
    .line 67
    .line 68
    move-result v14

    .line 69
    aput v14, v13, v11

    .line 70
    .line 71
    add-int/lit8 v11, v11, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    invoke-virtual {v0, v14}, Lh0/e;->e(I)I

    .line 75
    .line 76
    .line 77
    move-result v15

    .line 78
    const/4 v10, 0x0

    .line 79
    const/4 v11, 0x0

    .line 80
    :goto_2
    if-ge v10, v2, :cond_5

    .line 81
    .line 82
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 83
    .line 84
    .line 85
    move-result v16

    .line 86
    if-eqz v16, :cond_3

    .line 87
    .line 88
    add-int/lit8 v11, v11, 0x59

    .line 89
    .line 90
    :cond_3
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 91
    .line 92
    .line 93
    move-result v16

    .line 94
    if-eqz v16, :cond_4

    .line 95
    .line 96
    add-int/lit8 v11, v11, 0x8

    .line 97
    .line 98
    :cond_4
    add-int/lit8 v10, v10, 0x1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    invoke-virtual {v0, v11}, Lh0/e;->l(I)V

    .line 102
    .line 103
    .line 104
    if-lez v2, :cond_6

    .line 105
    .line 106
    rsub-int/lit8 v10, v2, 0x8

    .line 107
    .line 108
    mul-int/2addr v10, v3

    .line 109
    invoke-virtual {v0, v10}, Lh0/e;->l(I)V

    .line 110
    .line 111
    .line 112
    :cond_6
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 113
    .line 114
    .line 115
    move-result v16

    .line 116
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 117
    .line 118
    .line 119
    move-result v10

    .line 120
    if-ne v10, v1, :cond_7

    .line 121
    .line 122
    invoke-virtual {v0}, Lh0/e;->k()V

    .line 123
    .line 124
    .line 125
    :cond_7
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 130
    .line 131
    .line 132
    move-result v17

    .line 133
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 134
    .line 135
    .line 136
    move-result v18

    .line 137
    if-eqz v18, :cond_b

    .line 138
    .line 139
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 140
    .line 141
    .line 142
    move-result v18

    .line 143
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 144
    .line 145
    .line 146
    move-result v19

    .line 147
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 148
    .line 149
    .line 150
    move-result v20

    .line 151
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 152
    .line 153
    .line 154
    move-result v21

    .line 155
    if-eq v10, v12, :cond_9

    .line 156
    .line 157
    if-ne v10, v3, :cond_8

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_8
    move/from16 v22, v12

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_9
    :goto_3
    move/from16 v22, v3

    .line 164
    .line 165
    :goto_4
    if-ne v10, v12, :cond_a

    .line 166
    .line 167
    move/from16 v23, v3

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_a
    move/from16 v23, v12

    .line 171
    .line 172
    :goto_5
    add-int v18, v18, v19

    .line 173
    .line 174
    mul-int v22, v22, v18

    .line 175
    .line 176
    sub-int v11, v11, v22

    .line 177
    .line 178
    add-int v20, v20, v21

    .line 179
    .line 180
    mul-int v23, v23, v20

    .line 181
    .line 182
    sub-int v17, v17, v23

    .line 183
    .line 184
    :cond_b
    move/from16 v24, v17

    .line 185
    .line 186
    move/from16 v17, v11

    .line 187
    .line 188
    move/from16 v11, v24

    .line 189
    .line 190
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 191
    .line 192
    .line 193
    move-result v18

    .line 194
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 195
    .line 196
    .line 197
    move-result v19

    .line 198
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 199
    .line 200
    .line 201
    move-result v20

    .line 202
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 203
    .line 204
    .line 205
    move-result v21

    .line 206
    if-eqz v21, :cond_c

    .line 207
    .line 208
    const/16 v21, 0x0

    .line 209
    .line 210
    goto :goto_6

    .line 211
    :cond_c
    move/from16 v21, v2

    .line 212
    .line 213
    :goto_6
    const/16 v22, -0x1

    .line 214
    .line 215
    move/from16 v8, v21

    .line 216
    .line 217
    move/from16 v1, v22

    .line 218
    .line 219
    :goto_7
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 220
    .line 221
    .line 222
    if-gt v8, v2, :cond_d

    .line 223
    .line 224
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    invoke-static {v12, v1}, Ljava/lang/Math;->max(II)I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 233
    .line 234
    .line 235
    add-int/lit8 v8, v8, 0x1

    .line 236
    .line 237
    const/4 v12, 0x1

    .line 238
    goto :goto_7

    .line 239
    :cond_d
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    if-eqz v2, :cond_e

    .line 259
    .line 260
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    if-eqz v2, :cond_e

    .line 265
    .line 266
    invoke-static {v0}, Lh0/d;->n(Lh0/e;)V

    .line 267
    .line 268
    .line 269
    :cond_e
    invoke-virtual {v0, v3}, Lh0/e;->l(I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    if-eqz v2, :cond_f

    .line 277
    .line 278
    invoke-virtual {v0, v14}, Lh0/e;->l(I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0}, Lh0/e;->k()V

    .line 288
    .line 289
    .line 290
    :cond_f
    invoke-static {v0}, Lh0/d;->q(Lh0/e;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    if-eqz v2, :cond_10

    .line 298
    .line 299
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    const/4 v8, 0x0

    .line 304
    :goto_8
    if-ge v8, v2, :cond_10

    .line 305
    .line 306
    add-int/lit8 v12, v20, 0x5

    .line 307
    .line 308
    invoke-virtual {v0, v12}, Lh0/e;->l(I)V

    .line 309
    .line 310
    .line 311
    add-int/lit8 v8, v8, 0x1

    .line 312
    .line 313
    goto :goto_8

    .line 314
    :cond_10
    invoke-virtual {v0, v3}, Lh0/e;->l(I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    const/high16 v4, 0x3f800000    # 1.0f

    .line 322
    .line 323
    if-eqz v2, :cond_1a

    .line 324
    .line 325
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    if-eqz v2, :cond_13

    .line 330
    .line 331
    invoke-virtual {v0, v14}, Lh0/e;->e(I)I

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    const/16 v8, 0xff

    .line 336
    .line 337
    if-ne v2, v8, :cond_11

    .line 338
    .line 339
    const/16 v2, 0x10

    .line 340
    .line 341
    invoke-virtual {v0, v2}, Lh0/e;->e(I)I

    .line 342
    .line 343
    .line 344
    move-result v8

    .line 345
    invoke-virtual {v0, v2}, Lh0/e;->e(I)I

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    if-eqz v8, :cond_13

    .line 350
    .line 351
    if-eqz v2, :cond_13

    .line 352
    .line 353
    int-to-float v4, v8

    .line 354
    int-to-float v2, v2

    .line 355
    div-float/2addr v4, v2

    .line 356
    goto :goto_9

    .line 357
    :cond_11
    sget-object v8, Lh0/d;->b:[F

    .line 358
    .line 359
    array-length v12, v8

    .line 360
    if-ge v2, v12, :cond_12

    .line 361
    .line 362
    aget v4, v8, v2

    .line 363
    .line 364
    goto :goto_9

    .line 365
    :cond_12
    new-instance v8, Ljava/lang/StringBuilder;

    .line 366
    .line 367
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 368
    .line 369
    .line 370
    const-string v12, "Unexpected aspect_ratio_idc value: "

    .line 371
    .line 372
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    const-string v8, "NalUnitUtil"

    .line 383
    .line 384
    invoke-static {v8, v2}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    :cond_13
    :goto_9
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 388
    .line 389
    .line 390
    move-result v2

    .line 391
    if-eqz v2, :cond_14

    .line 392
    .line 393
    invoke-virtual {v0}, Lh0/e;->k()V

    .line 394
    .line 395
    .line 396
    :cond_14
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 397
    .line 398
    .line 399
    move-result v2

    .line 400
    if-eqz v2, :cond_17

    .line 401
    .line 402
    const/4 v2, 0x3

    .line 403
    invoke-virtual {v0, v2}, Lh0/e;->l(I)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 407
    .line 408
    .line 409
    move-result v2

    .line 410
    if-eqz v2, :cond_15

    .line 411
    .line 412
    const/4 v3, 0x1

    .line 413
    :cond_15
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 414
    .line 415
    .line 416
    move-result v2

    .line 417
    if-eqz v2, :cond_16

    .line 418
    .line 419
    invoke-virtual {v0, v14}, Lh0/e;->e(I)I

    .line 420
    .line 421
    .line 422
    move-result v2

    .line 423
    invoke-virtual {v0, v14}, Lh0/e;->e(I)I

    .line 424
    .line 425
    .line 426
    move-result v8

    .line 427
    invoke-virtual {v0, v14}, Lh0/e;->l(I)V

    .line 428
    .line 429
    .line 430
    invoke-static {v2}, Ld0/h;->j(I)I

    .line 431
    .line 432
    .line 433
    move-result v22

    .line 434
    invoke-static {v8}, Ld0/h;->k(I)I

    .line 435
    .line 436
    .line 437
    move-result v2

    .line 438
    goto :goto_a

    .line 439
    :cond_16
    move/from16 v2, v22

    .line 440
    .line 441
    goto :goto_a

    .line 442
    :cond_17
    move/from16 v2, v22

    .line 443
    .line 444
    move v3, v2

    .line 445
    :goto_a
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 446
    .line 447
    .line 448
    move-result v8

    .line 449
    if-eqz v8, :cond_18

    .line 450
    .line 451
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 452
    .line 453
    .line 454
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 455
    .line 456
    .line 457
    :cond_18
    invoke-virtual {v0}, Lh0/e;->k()V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    if-eqz v0, :cond_19

    .line 465
    .line 466
    mul-int/lit8 v11, v11, 0x2

    .line 467
    .line 468
    :cond_19
    move/from16 v21, v2

    .line 469
    .line 470
    move/from16 v20, v3

    .line 471
    .line 472
    move v2, v4

    .line 473
    move v0, v11

    .line 474
    goto :goto_b

    .line 475
    :cond_1a
    move v2, v4

    .line 476
    move v0, v11

    .line 477
    move/from16 v20, v22

    .line 478
    .line 479
    move/from16 v21, v20

    .line 480
    .line 481
    :goto_b
    new-instance v3, Lh0/d$a;

    .line 482
    .line 483
    move-object v4, v3

    .line 484
    move v8, v9

    .line 485
    move v9, v10

    .line 486
    move/from16 v10, v18

    .line 487
    .line 488
    move/from16 v11, v19

    .line 489
    .line 490
    move-object v12, v13

    .line 491
    move v13, v15

    .line 492
    move/from16 v14, v16

    .line 493
    .line 494
    move/from16 v15, v17

    .line 495
    .line 496
    move/from16 v16, v0

    .line 497
    .line 498
    move/from16 v17, v2

    .line 499
    .line 500
    move/from16 v18, v1

    .line 501
    .line 502
    move/from16 v19, v22

    .line 503
    .line 504
    invoke-direct/range {v4 .. v21}, Lh0/d$a;-><init>(IZIIIII[IIIIIFIIII)V

    .line 505
    .line 506
    .line 507
    return-object v3
.end method

.method public static j([BII)Lh0/d$b;
    .locals 0

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lh0/d;->k([BII)Lh0/d$b;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static k([BII)Lh0/d$b;
    .locals 1

    .line 1
    new-instance v0, Lh0/e;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lh0/e;-><init>([BII)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-virtual {v0}, Lh0/e;->k()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    new-instance v0, Lh0/d$b;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1, p2}, Lh0/d$b;-><init>(IIZ)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public static l([BII)Lh0/d$c;
    .locals 0

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lh0/d;->m([BII)Lh0/d$c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static m([BII)Lh0/d$c;
    .locals 32

    .line 1
    new-instance v0, Lh0/e;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    move/from16 v2, p1

    .line 6
    .line 7
    move/from16 v3, p2

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Lh0/e;-><init>([BII)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lh0/e;->e(I)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-virtual {v0, v1}, Lh0/e;->e(I)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    invoke-virtual {v0, v1}, Lh0/e;->e(I)I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    const/16 v2, 0x56

    .line 31
    .line 32
    const/16 v7, 0x2c

    .line 33
    .line 34
    const/16 v8, 0xf4

    .line 35
    .line 36
    const/16 v9, 0x7a

    .line 37
    .line 38
    const/16 v10, 0x6e

    .line 39
    .line 40
    const/4 v11, 0x3

    .line 41
    const/16 v12, 0x10

    .line 42
    .line 43
    const/4 v13, 0x1

    .line 44
    const/16 v15, 0x64

    .line 45
    .line 46
    if-eq v3, v15, :cond_1

    .line 47
    .line 48
    if-eq v3, v10, :cond_1

    .line 49
    .line 50
    if-eq v3, v9, :cond_1

    .line 51
    .line 52
    if-eq v3, v8, :cond_1

    .line 53
    .line 54
    if-eq v3, v7, :cond_1

    .line 55
    .line 56
    const/16 v14, 0x53

    .line 57
    .line 58
    if-eq v3, v14, :cond_1

    .line 59
    .line 60
    if-eq v3, v2, :cond_1

    .line 61
    .line 62
    const/16 v14, 0x76

    .line 63
    .line 64
    if-eq v3, v14, :cond_1

    .line 65
    .line 66
    const/16 v14, 0x80

    .line 67
    .line 68
    if-eq v3, v14, :cond_1

    .line 69
    .line 70
    const/16 v14, 0x8a

    .line 71
    .line 72
    if-ne v3, v14, :cond_0

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    move v14, v13

    .line 76
    const/16 v16, 0x0

    .line 77
    .line 78
    const/16 v17, 0x0

    .line 79
    .line 80
    const/16 v18, 0x0

    .line 81
    .line 82
    goto :goto_5

    .line 83
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 84
    .line 85
    .line 86
    move-result v14

    .line 87
    if-ne v14, v11, :cond_2

    .line 88
    .line 89
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 90
    .line 91
    .line 92
    move-result v16

    .line 93
    goto :goto_1

    .line 94
    :cond_2
    const/16 v16, 0x0

    .line 95
    .line 96
    :goto_1
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 97
    .line 98
    .line 99
    move-result v17

    .line 100
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 101
    .line 102
    .line 103
    move-result v18

    .line 104
    invoke-virtual {v0}, Lh0/e;->k()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 108
    .line 109
    .line 110
    move-result v19

    .line 111
    if-eqz v19, :cond_6

    .line 112
    .line 113
    if-eq v14, v11, :cond_3

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_3
    const/16 v19, 0xc

    .line 117
    .line 118
    move/from16 v1, v19

    .line 119
    .line 120
    :goto_2
    const/4 v8, 0x0

    .line 121
    :goto_3
    if-ge v8, v1, :cond_6

    .line 122
    .line 123
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 124
    .line 125
    .line 126
    move-result v19

    .line 127
    if-eqz v19, :cond_5

    .line 128
    .line 129
    const/4 v9, 0x6

    .line 130
    if-ge v8, v9, :cond_4

    .line 131
    .line 132
    move v9, v12

    .line 133
    goto :goto_4

    .line 134
    :cond_4
    const/16 v9, 0x40

    .line 135
    .line 136
    :goto_4
    invoke-static {v0, v9}, Lh0/d;->p(Lh0/e;I)V

    .line 137
    .line 138
    .line 139
    :cond_5
    add-int/lit8 v8, v8, 0x1

    .line 140
    .line 141
    const/16 v9, 0x7a

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_6
    :goto_5
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    add-int/lit8 v1, v1, 0x4

    .line 149
    .line 150
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 151
    .line 152
    .line 153
    move-result v9

    .line 154
    if-nez v9, :cond_7

    .line 155
    .line 156
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    add-int/lit8 v8, v8, 0x4

    .line 161
    .line 162
    move/from16 v21, v3

    .line 163
    .line 164
    move/from16 v24, v8

    .line 165
    .line 166
    :goto_6
    const/16 v25, 0x0

    .line 167
    .line 168
    goto :goto_8

    .line 169
    :cond_7
    if-ne v9, v13, :cond_9

    .line 170
    .line 171
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    invoke-virtual {v0}, Lh0/e;->g()I

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0}, Lh0/e;->g()I

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    move/from16 v21, v3

    .line 186
    .line 187
    int-to-long v2, v10

    .line 188
    move/from16 v24, v8

    .line 189
    .line 190
    const/4 v10, 0x0

    .line 191
    :goto_7
    int-to-long v7, v10

    .line 192
    cmp-long v7, v7, v2

    .line 193
    .line 194
    if-gez v7, :cond_8

    .line 195
    .line 196
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 197
    .line 198
    .line 199
    add-int/lit8 v10, v10, 0x1

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_8
    move/from16 v25, v24

    .line 203
    .line 204
    const/16 v24, 0x0

    .line 205
    .line 206
    goto :goto_8

    .line 207
    :cond_9
    move/from16 v21, v3

    .line 208
    .line 209
    const/16 v24, 0x0

    .line 210
    .line 211
    goto :goto_6

    .line 212
    :goto_8
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 213
    .line 214
    .line 215
    move-result v7

    .line 216
    invoke-virtual {v0}, Lh0/e;->k()V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    add-int/2addr v2, v13

    .line 224
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    add-int/2addr v3, v13

    .line 229
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 230
    .line 231
    .line 232
    move-result v26

    .line 233
    rsub-int/lit8 v8, v26, 0x2

    .line 234
    .line 235
    mul-int/2addr v8, v3

    .line 236
    if-nez v26, :cond_a

    .line 237
    .line 238
    invoke-virtual {v0}, Lh0/e;->k()V

    .line 239
    .line 240
    .line 241
    :cond_a
    invoke-virtual {v0}, Lh0/e;->k()V

    .line 242
    .line 243
    .line 244
    mul-int/2addr v2, v12

    .line 245
    mul-int/2addr v8, v12

    .line 246
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    if-eqz v3, :cond_e

    .line 251
    .line 252
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 257
    .line 258
    .line 259
    move-result v27

    .line 260
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 261
    .line 262
    .line 263
    move-result v28

    .line 264
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 265
    .line 266
    .line 267
    move-result v29

    .line 268
    if-nez v14, :cond_b

    .line 269
    .line 270
    rsub-int/lit8 v14, v26, 0x2

    .line 271
    .line 272
    move/from16 v30, v13

    .line 273
    .line 274
    goto :goto_b

    .line 275
    :cond_b
    if-ne v14, v11, :cond_c

    .line 276
    .line 277
    move/from16 v30, v13

    .line 278
    .line 279
    goto :goto_9

    .line 280
    :cond_c
    const/16 v30, 0x2

    .line 281
    .line 282
    :goto_9
    if-ne v14, v13, :cond_d

    .line 283
    .line 284
    const/4 v14, 0x2

    .line 285
    goto :goto_a

    .line 286
    :cond_d
    move v14, v13

    .line 287
    :goto_a
    rsub-int/lit8 v31, v26, 0x2

    .line 288
    .line 289
    mul-int v14, v14, v31

    .line 290
    .line 291
    :goto_b
    add-int v3, v3, v27

    .line 292
    .line 293
    mul-int v3, v3, v30

    .line 294
    .line 295
    sub-int/2addr v2, v3

    .line 296
    add-int v28, v28, v29

    .line 297
    .line 298
    mul-int v28, v28, v14

    .line 299
    .line 300
    sub-int v8, v8, v28

    .line 301
    .line 302
    :cond_e
    move v14, v8

    .line 303
    move/from16 v3, v21

    .line 304
    .line 305
    move v8, v2

    .line 306
    const/16 v2, 0x2c

    .line 307
    .line 308
    if-eq v3, v2, :cond_f

    .line 309
    .line 310
    const/16 v2, 0x56

    .line 311
    .line 312
    if-eq v3, v2, :cond_f

    .line 313
    .line 314
    if-eq v3, v15, :cond_f

    .line 315
    .line 316
    const/16 v2, 0x6e

    .line 317
    .line 318
    if-eq v3, v2, :cond_f

    .line 319
    .line 320
    const/16 v2, 0x7a

    .line 321
    .line 322
    if-eq v3, v2, :cond_f

    .line 323
    .line 324
    const/16 v2, 0xf4

    .line 325
    .line 326
    if-ne v3, v2, :cond_10

    .line 327
    .line 328
    :cond_f
    and-int/lit8 v2, v4, 0x10

    .line 329
    .line 330
    if-eqz v2, :cond_10

    .line 331
    .line 332
    const/4 v2, 0x0

    .line 333
    goto :goto_c

    .line 334
    :cond_10
    move v2, v12

    .line 335
    :goto_c
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 336
    .line 337
    .line 338
    move-result v15

    .line 339
    const/16 v19, -0x1

    .line 340
    .line 341
    const/high16 v20, 0x3f800000    # 1.0f

    .line 342
    .line 343
    if-eqz v15, :cond_1f

    .line 344
    .line 345
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 346
    .line 347
    .line 348
    move-result v15

    .line 349
    if-eqz v15, :cond_13

    .line 350
    .line 351
    const/16 v15, 0x8

    .line 352
    .line 353
    invoke-virtual {v0, v15}, Lh0/e;->e(I)I

    .line 354
    .line 355
    .line 356
    move-result v10

    .line 357
    const/16 v15, 0xff

    .line 358
    .line 359
    if-ne v10, v15, :cond_11

    .line 360
    .line 361
    invoke-virtual {v0, v12}, Lh0/e;->e(I)I

    .line 362
    .line 363
    .line 364
    move-result v10

    .line 365
    invoke-virtual {v0, v12}, Lh0/e;->e(I)I

    .line 366
    .line 367
    .line 368
    move-result v12

    .line 369
    if-eqz v10, :cond_13

    .line 370
    .line 371
    if-eqz v12, :cond_13

    .line 372
    .line 373
    int-to-float v10, v10

    .line 374
    int-to-float v12, v12

    .line 375
    div-float v20, v10, v12

    .line 376
    .line 377
    goto :goto_d

    .line 378
    :cond_11
    sget-object v12, Lh0/d;->b:[F

    .line 379
    .line 380
    array-length v15, v12

    .line 381
    if-ge v10, v15, :cond_12

    .line 382
    .line 383
    aget v20, v12, v10

    .line 384
    .line 385
    goto :goto_d

    .line 386
    :cond_12
    new-instance v12, Ljava/lang/StringBuilder;

    .line 387
    .line 388
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 389
    .line 390
    .line 391
    const-string v15, "Unexpected aspect_ratio_idc value: "

    .line 392
    .line 393
    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v10

    .line 403
    const-string v12, "NalUnitUtil"

    .line 404
    .line 405
    invoke-static {v12, v10}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    :cond_13
    :goto_d
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 409
    .line 410
    .line 411
    move-result v10

    .line 412
    if-eqz v10, :cond_14

    .line 413
    .line 414
    invoke-virtual {v0}, Lh0/e;->k()V

    .line 415
    .line 416
    .line 417
    :cond_14
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 418
    .line 419
    .line 420
    move-result v10

    .line 421
    if-eqz v10, :cond_17

    .line 422
    .line 423
    invoke-virtual {v0, v11}, Lh0/e;->l(I)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 427
    .line 428
    .line 429
    move-result v10

    .line 430
    if-eqz v10, :cond_15

    .line 431
    .line 432
    goto :goto_e

    .line 433
    :cond_15
    const/4 v13, 0x2

    .line 434
    :goto_e
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 435
    .line 436
    .line 437
    move-result v10

    .line 438
    if-eqz v10, :cond_16

    .line 439
    .line 440
    const/16 v10, 0x8

    .line 441
    .line 442
    invoke-virtual {v0, v10}, Lh0/e;->e(I)I

    .line 443
    .line 444
    .line 445
    move-result v11

    .line 446
    invoke-virtual {v0, v10}, Lh0/e;->e(I)I

    .line 447
    .line 448
    .line 449
    move-result v12

    .line 450
    invoke-virtual {v0, v10}, Lh0/e;->l(I)V

    .line 451
    .line 452
    .line 453
    invoke-static {v11}, Ld0/h;->j(I)I

    .line 454
    .line 455
    .line 456
    move-result v19

    .line 457
    invoke-static {v12}, Ld0/h;->k(I)I

    .line 458
    .line 459
    .line 460
    move-result v10

    .line 461
    goto :goto_f

    .line 462
    :cond_16
    move/from16 v10, v19

    .line 463
    .line 464
    goto :goto_f

    .line 465
    :cond_17
    move/from16 v10, v19

    .line 466
    .line 467
    move v13, v10

    .line 468
    :goto_f
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 469
    .line 470
    .line 471
    move-result v11

    .line 472
    if-eqz v11, :cond_18

    .line 473
    .line 474
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 475
    .line 476
    .line 477
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 478
    .line 479
    .line 480
    :cond_18
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 481
    .line 482
    .line 483
    move-result v11

    .line 484
    if-eqz v11, :cond_19

    .line 485
    .line 486
    const/16 v11, 0x41

    .line 487
    .line 488
    invoke-virtual {v0, v11}, Lh0/e;->l(I)V

    .line 489
    .line 490
    .line 491
    :cond_19
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 492
    .line 493
    .line 494
    move-result v11

    .line 495
    if-eqz v11, :cond_1a

    .line 496
    .line 497
    invoke-static {v0}, Lh0/d;->o(Lh0/e;)V

    .line 498
    .line 499
    .line 500
    :cond_1a
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 501
    .line 502
    .line 503
    move-result v12

    .line 504
    if-eqz v12, :cond_1b

    .line 505
    .line 506
    invoke-static {v0}, Lh0/d;->o(Lh0/e;)V

    .line 507
    .line 508
    .line 509
    :cond_1b
    if-nez v11, :cond_1c

    .line 510
    .line 511
    if-eqz v12, :cond_1d

    .line 512
    .line 513
    :cond_1c
    invoke-virtual {v0}, Lh0/e;->k()V

    .line 514
    .line 515
    .line 516
    :cond_1d
    invoke-virtual {v0}, Lh0/e;->k()V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v0}, Lh0/e;->d()Z

    .line 520
    .line 521
    .line 522
    move-result v11

    .line 523
    if-eqz v11, :cond_1e

    .line 524
    .line 525
    invoke-virtual {v0}, Lh0/e;->k()V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 529
    .line 530
    .line 531
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 532
    .line 533
    .line 534
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 535
    .line 536
    .line 537
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 538
    .line 539
    .line 540
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 541
    .line 542
    .line 543
    move-result v2

    .line 544
    invoke-virtual {v0}, Lh0/e;->h()I

    .line 545
    .line 546
    .line 547
    :cond_1e
    move/from16 v22, v2

    .line 548
    .line 549
    move/from16 v21, v10

    .line 550
    .line 551
    move/from16 v10, v20

    .line 552
    .line 553
    move/from16 v20, v13

    .line 554
    .line 555
    goto :goto_10

    .line 556
    :cond_1f
    move/from16 v22, v2

    .line 557
    .line 558
    move/from16 v21, v19

    .line 559
    .line 560
    move/from16 v10, v20

    .line 561
    .line 562
    move/from16 v20, v21

    .line 563
    .line 564
    :goto_10
    new-instance v0, Lh0/d$c;

    .line 565
    .line 566
    move-object v2, v0

    .line 567
    move/from16 v23, v9

    .line 568
    .line 569
    move v9, v14

    .line 570
    move/from16 v11, v17

    .line 571
    .line 572
    move/from16 v12, v18

    .line 573
    .line 574
    move/from16 v13, v16

    .line 575
    .line 576
    move/from16 v14, v26

    .line 577
    .line 578
    move v15, v1

    .line 579
    move/from16 v16, v23

    .line 580
    .line 581
    move/from16 v17, v24

    .line 582
    .line 583
    move/from16 v18, v25

    .line 584
    .line 585
    invoke-direct/range {v2 .. v22}, Lh0/d$c;-><init>(IIIIIIIFIIZZIIIZIIII)V

    .line 586
    .line 587
    .line 588
    return-object v0
.end method

.method public static n(Lh0/e;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    const/4 v2, 0x4

    .line 4
    if-ge v1, v2, :cond_5

    .line 5
    .line 6
    move v3, v0

    .line 7
    :goto_1
    const/4 v4, 0x6

    .line 8
    if-ge v3, v4, :cond_4

    .line 9
    .line 10
    invoke-virtual {p0}, Lh0/e;->d()Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    const/4 v5, 0x1

    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lh0/e;->h()I

    .line 18
    .line 19
    .line 20
    goto :goto_3

    .line 21
    :cond_0
    shl-int/lit8 v4, v1, 0x1

    .line 22
    .line 23
    add-int/2addr v4, v2

    .line 24
    shl-int v4, v5, v4

    .line 25
    .line 26
    const/16 v6, 0x40

    .line 27
    .line 28
    invoke-static {v6, v4}, Ljava/lang/Math;->min(II)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-le v1, v5, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Lh0/e;->g()I

    .line 35
    .line 36
    .line 37
    :cond_1
    move v6, v0

    .line 38
    :goto_2
    if-ge v6, v4, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0}, Lh0/e;->g()I

    .line 41
    .line 42
    .line 43
    add-int/lit8 v6, v6, 0x1

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    :goto_3
    const/4 v4, 0x3

    .line 47
    if-ne v1, v4, :cond_3

    .line 48
    .line 49
    move v5, v4

    .line 50
    :cond_3
    add-int/2addr v3, v5

    .line 51
    goto :goto_1

    .line 52
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    return-void
.end method

.method public static o(Lh0/e;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh0/e;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lh0/e;->l(I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lh0/e;->h()I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lh0/e;->h()I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lh0/e;->k()V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/16 v0, 0x14

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lh0/e;->l(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static p(Lh0/e;I)V
    .locals 3

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    move v1, v0

    .line 6
    :goto_0
    if-ge v2, p1, :cond_2

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lh0/e;->g()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/2addr v0, v1

    .line 15
    add-int/lit16 v0, v0, 0x100

    .line 16
    .line 17
    rem-int/lit16 v0, v0, 0x100

    .line 18
    .line 19
    :cond_0
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v1, v0

    .line 23
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    return-void
.end method

.method public static q(Lh0/e;)V
    .locals 19

    .line 1
    invoke-virtual/range {p0 .. p0}, Lh0/e;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v2, v1, [I

    .line 7
    .line 8
    new-array v3, v1, [I

    .line 9
    .line 10
    const/4 v4, -0x1

    .line 11
    move v6, v1

    .line 12
    move v5, v4

    .line 13
    :goto_0
    if-ge v6, v0, :cond_11

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    if-eqz v6, :cond_c

    .line 17
    .line 18
    invoke-virtual/range {p0 .. p0}, Lh0/e;->d()Z

    .line 19
    .line 20
    .line 21
    move-result v8

    .line 22
    if-eqz v8, :cond_c

    .line 23
    .line 24
    add-int v8, v4, v5

    .line 25
    .line 26
    invoke-virtual/range {p0 .. p0}, Lh0/e;->d()Z

    .line 27
    .line 28
    .line 29
    move-result v9

    .line 30
    invoke-virtual/range {p0 .. p0}, Lh0/e;->h()I

    .line 31
    .line 32
    .line 33
    move-result v10

    .line 34
    add-int/2addr v10, v7

    .line 35
    mul-int/lit8 v9, v9, 0x2

    .line 36
    .line 37
    rsub-int/lit8 v9, v9, 0x1

    .line 38
    .line 39
    mul-int/2addr v9, v10

    .line 40
    add-int/lit8 v10, v8, 0x1

    .line 41
    .line 42
    new-array v11, v10, [Z

    .line 43
    .line 44
    move v12, v1

    .line 45
    :goto_1
    if-gt v12, v8, :cond_1

    .line 46
    .line 47
    invoke-virtual/range {p0 .. p0}, Lh0/e;->d()Z

    .line 48
    .line 49
    .line 50
    move-result v13

    .line 51
    if-nez v13, :cond_0

    .line 52
    .line 53
    invoke-virtual/range {p0 .. p0}, Lh0/e;->d()Z

    .line 54
    .line 55
    .line 56
    move-result v13

    .line 57
    aput-boolean v13, v11, v12

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_0
    aput-boolean v7, v11, v12

    .line 61
    .line 62
    :goto_2
    add-int/lit8 v12, v12, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    new-array v7, v10, [I

    .line 66
    .line 67
    new-array v10, v10, [I

    .line 68
    .line 69
    add-int/lit8 v12, v5, -0x1

    .line 70
    .line 71
    move v13, v1

    .line 72
    :goto_3
    if-ltz v12, :cond_3

    .line 73
    .line 74
    aget v14, v3, v12

    .line 75
    .line 76
    add-int/2addr v14, v9

    .line 77
    if-gez v14, :cond_2

    .line 78
    .line 79
    add-int v15, v4, v12

    .line 80
    .line 81
    aget-boolean v15, v11, v15

    .line 82
    .line 83
    if-eqz v15, :cond_2

    .line 84
    .line 85
    add-int/lit8 v15, v13, 0x1

    .line 86
    .line 87
    aput v14, v7, v13

    .line 88
    .line 89
    move v13, v15

    .line 90
    :cond_2
    add-int/lit8 v12, v12, -0x1

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_3
    if-gez v9, :cond_4

    .line 94
    .line 95
    aget-boolean v12, v11, v8

    .line 96
    .line 97
    if-eqz v12, :cond_4

    .line 98
    .line 99
    add-int/lit8 v12, v13, 0x1

    .line 100
    .line 101
    aput v9, v7, v13

    .line 102
    .line 103
    move v13, v12

    .line 104
    :cond_4
    move v12, v1

    .line 105
    :goto_4
    if-ge v12, v4, :cond_6

    .line 106
    .line 107
    aget v14, v2, v12

    .line 108
    .line 109
    add-int/2addr v14, v9

    .line 110
    if-gez v14, :cond_5

    .line 111
    .line 112
    aget-boolean v15, v11, v12

    .line 113
    .line 114
    if-eqz v15, :cond_5

    .line 115
    .line 116
    add-int/lit8 v15, v13, 0x1

    .line 117
    .line 118
    aput v14, v7, v13

    .line 119
    .line 120
    move v13, v15

    .line 121
    :cond_5
    add-int/lit8 v12, v12, 0x1

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_6
    invoke-static {v7, v13}, Ljava/util/Arrays;->copyOf([II)[I

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    add-int/lit8 v12, v4, -0x1

    .line 129
    .line 130
    move v14, v1

    .line 131
    :goto_5
    if-ltz v12, :cond_8

    .line 132
    .line 133
    aget v15, v2, v12

    .line 134
    .line 135
    add-int/2addr v15, v9

    .line 136
    if-lez v15, :cond_7

    .line 137
    .line 138
    aget-boolean v16, v11, v12

    .line 139
    .line 140
    if-eqz v16, :cond_7

    .line 141
    .line 142
    add-int/lit8 v16, v14, 0x1

    .line 143
    .line 144
    aput v15, v10, v14

    .line 145
    .line 146
    move/from16 v14, v16

    .line 147
    .line 148
    :cond_7
    add-int/lit8 v12, v12, -0x1

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_8
    if-lez v9, :cond_9

    .line 152
    .line 153
    aget-boolean v2, v11, v8

    .line 154
    .line 155
    if-eqz v2, :cond_9

    .line 156
    .line 157
    add-int/lit8 v2, v14, 0x1

    .line 158
    .line 159
    aput v9, v10, v14

    .line 160
    .line 161
    move v14, v2

    .line 162
    :cond_9
    move v2, v1

    .line 163
    :goto_6
    if-ge v2, v5, :cond_b

    .line 164
    .line 165
    aget v8, v3, v2

    .line 166
    .line 167
    add-int/2addr v8, v9

    .line 168
    if-lez v8, :cond_a

    .line 169
    .line 170
    add-int v12, v4, v2

    .line 171
    .line 172
    aget-boolean v12, v11, v12

    .line 173
    .line 174
    if-eqz v12, :cond_a

    .line 175
    .line 176
    add-int/lit8 v12, v14, 0x1

    .line 177
    .line 178
    aput v8, v10, v14

    .line 179
    .line 180
    move v14, v12

    .line 181
    :cond_a
    add-int/lit8 v2, v2, 0x1

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_b
    invoke-static {v10, v14}, Ljava/util/Arrays;->copyOf([II)[I

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    move-object v3, v2

    .line 189
    move-object v2, v7

    .line 190
    move v4, v13

    .line 191
    move v5, v14

    .line 192
    goto :goto_b

    .line 193
    :cond_c
    invoke-virtual/range {p0 .. p0}, Lh0/e;->h()I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    invoke-virtual/range {p0 .. p0}, Lh0/e;->h()I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    new-array v4, v2, [I

    .line 202
    .line 203
    move v5, v1

    .line 204
    :goto_7
    if-ge v5, v2, :cond_e

    .line 205
    .line 206
    if-lez v5, :cond_d

    .line 207
    .line 208
    add-int/lit8 v8, v5, -0x1

    .line 209
    .line 210
    aget v8, v4, v8

    .line 211
    .line 212
    goto :goto_8

    .line 213
    :cond_d
    move v8, v1

    .line 214
    :goto_8
    invoke-virtual/range {p0 .. p0}, Lh0/e;->h()I

    .line 215
    .line 216
    .line 217
    move-result v9

    .line 218
    add-int/2addr v9, v7

    .line 219
    sub-int/2addr v8, v9

    .line 220
    aput v8, v4, v5

    .line 221
    .line 222
    invoke-virtual/range {p0 .. p0}, Lh0/e;->k()V

    .line 223
    .line 224
    .line 225
    add-int/lit8 v5, v5, 0x1

    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_e
    new-array v5, v3, [I

    .line 229
    .line 230
    move v8, v1

    .line 231
    :goto_9
    if-ge v8, v3, :cond_10

    .line 232
    .line 233
    if-lez v8, :cond_f

    .line 234
    .line 235
    add-int/lit8 v9, v8, -0x1

    .line 236
    .line 237
    aget v9, v5, v9

    .line 238
    .line 239
    goto :goto_a

    .line 240
    :cond_f
    move v9, v1

    .line 241
    :goto_a
    invoke-virtual/range {p0 .. p0}, Lh0/e;->h()I

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    add-int/2addr v10, v7

    .line 246
    add-int/2addr v9, v10

    .line 247
    aput v9, v5, v8

    .line 248
    .line 249
    invoke-virtual/range {p0 .. p0}, Lh0/e;->k()V

    .line 250
    .line 251
    .line 252
    add-int/lit8 v8, v8, 0x1

    .line 253
    .line 254
    goto :goto_9

    .line 255
    :cond_10
    move-object/from16 v17, v4

    .line 256
    .line 257
    move v4, v2

    .line 258
    move-object/from16 v2, v17

    .line 259
    .line 260
    move-object/from16 v18, v5

    .line 261
    .line 262
    move v5, v3

    .line 263
    move-object/from16 v3, v18

    .line 264
    .line 265
    :goto_b
    add-int/lit8 v6, v6, 0x1

    .line 266
    .line 267
    goto/16 :goto_0

    .line 268
    .line 269
    :cond_11
    return-void
.end method

.method public static r([BI)I
    .locals 8

    .line 1
    sget-object v0, Lh0/d;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    move v3, v2

    .line 7
    :cond_0
    :goto_0
    if-ge v2, p1, :cond_2

    .line 8
    .line 9
    :try_start_0
    invoke-static {p0, v2, p1}, Lh0/d;->d([BII)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ge v2, p1, :cond_0

    .line 14
    .line 15
    sget-object v4, Lh0/d;->d:[I

    .line 16
    .line 17
    array-length v5, v4

    .line 18
    if-gt v5, v3, :cond_1

    .line 19
    .line 20
    array-length v5, v4

    .line 21
    mul-int/lit8 v5, v5, 0x2

    .line 22
    .line 23
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    sput-object v4, Lh0/d;->d:[I

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_3

    .line 32
    :cond_1
    :goto_1
    sget-object v4, Lh0/d;->d:[I

    .line 33
    .line 34
    add-int/lit8 v5, v3, 0x1

    .line 35
    .line 36
    aput v2, v4, v3

    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x3

    .line 39
    .line 40
    move v3, v5

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    sub-int/2addr p1, v3

    .line 43
    move v2, v1

    .line 44
    move v4, v2

    .line 45
    move v5, v4

    .line 46
    :goto_2
    if-ge v2, v3, :cond_3

    .line 47
    .line 48
    sget-object v6, Lh0/d;->d:[I

    .line 49
    .line 50
    aget v6, v6, v2

    .line 51
    .line 52
    sub-int/2addr v6, v5

    .line 53
    invoke-static {p0, v5, p0, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 54
    .line 55
    .line 56
    add-int/2addr v4, v6

    .line 57
    add-int/lit8 v7, v4, 0x1

    .line 58
    .line 59
    aput-byte v1, p0, v4

    .line 60
    .line 61
    add-int/lit8 v4, v4, 0x2

    .line 62
    .line 63
    aput-byte v1, p0, v7

    .line 64
    .line 65
    add-int/lit8 v6, v6, 0x3

    .line 66
    .line 67
    add-int/2addr v5, v6

    .line 68
    add-int/lit8 v2, v2, 0x1

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    sub-int v1, p1, v4

    .line 72
    .line 73
    invoke-static {p0, v5, p0, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 74
    .line 75
    .line 76
    monitor-exit v0

    .line 77
    return p1

    .line 78
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    throw p0
.end method
