.class public abstract LF0/W;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF0/W$c;,
        LF0/W$a;,
        LF0/W$b;
    }
.end annotation


# direct methods
.method public static a(I)[I
    .locals 9

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x6

    .line 6
    const/4 v4, 0x5

    .line 7
    const/4 v5, 0x3

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x2

    .line 10
    const/4 v8, 0x1

    .line 11
    if-eq p0, v5, :cond_4

    .line 12
    .line 13
    if-eq p0, v4, :cond_3

    .line 14
    .line 15
    if-eq p0, v3, :cond_2

    .line 16
    .line 17
    if-eq p0, v1, :cond_1

    .line 18
    .line 19
    if-eq p0, v0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_0
    new-array p0, v0, [I

    .line 24
    .line 25
    fill-array-data p0, :array_0

    .line 26
    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    new-array p0, v1, [I

    .line 30
    .line 31
    fill-array-data p0, :array_1

    .line 32
    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_2
    new-array p0, v3, [I

    .line 36
    .line 37
    fill-array-data p0, :array_2

    .line 38
    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_3
    filled-new-array {v6, v7, v8, v5, v2}, [I

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_4
    filled-new-array {v6, v7, v8}, [I

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :array_0
    .array-data 4
        0x0
        0x2
        0x1
        0x7
        0x5
        0x6
        0x3
        0x4
    .end array-data

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
    :array_1
    .array-data 4
        0x0
        0x2
        0x1
        0x6
        0x5
        0x3
        0x4
    .end array-data

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
    :array_2
    .array-data 4
        0x0
        0x2
        0x1
        0x5
        0x3
        0x4
    .end array-data
.end method

.method public static b(I)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-lez p0, :cond_0

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    ushr-int/lit8 p0, p0, 0x1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    return v0
.end method

.method public static c(JJ)J
    .locals 2

    .line 1
    long-to-double p0, p0

    .line 2
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 3
    .line 4
    long-to-double p2, p2

    .line 5
    div-double/2addr v0, p2

    .line 6
    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 7
    .line 8
    .line 9
    move-result-wide p0

    .line 10
    invoke-static {p0, p1}, Ljava/lang/Math;->floor(D)D

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    double-to-long p0, p0

    .line 15
    return-wide p0
.end method

.method public static d(Ljava/util/List;)Ld0/x;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-ge v2, v3, :cond_2

    .line 13
    .line 14
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Ljava/lang/String;

    .line 19
    .line 20
    const-string v4, "="

    .line 21
    .line 22
    invoke-static {v3, v4}, Lg0/M;->c1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    array-length v5, v4

    .line 27
    const/4 v6, 0x2

    .line 28
    const-string v7, "VorbisUtil"

    .line 29
    .line 30
    if-eq v5, v6, :cond_0

    .line 31
    .line 32
    new-instance v4, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v5, "Failed to parse Vorbis comment: "

    .line 38
    .line 39
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-static {v7, v3}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    aget-object v3, v4, v1

    .line 54
    .line 55
    const-string v5, "METADATA_BLOCK_PICTURE"

    .line 56
    .line 57
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    const/4 v5, 0x1

    .line 62
    if-eqz v3, :cond_1

    .line 63
    .line 64
    :try_start_0
    aget-object v3, v4, v5

    .line 65
    .line 66
    invoke-static {v3, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    new-instance v4, Lg0/z;

    .line 71
    .line 72
    invoke-direct {v4, v3}, Lg0/z;-><init>([B)V

    .line 73
    .line 74
    .line 75
    invoke-static {v4}, LR0/a;->a(Lg0/z;)LR0/a;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :catch_0
    move-exception v3

    .line 84
    const-string v4, "Failed to parse vorbis picture"

    .line 85
    .line 86
    invoke-static {v7, v4, v3}, Lg0/o;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    new-instance v3, LW0/a;

    .line 91
    .line 92
    aget-object v6, v4, v1

    .line 93
    .line 94
    aget-object v4, v4, v5

    .line 95
    .line 96
    invoke-direct {v3, v6, v4}, LW0/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    if-eqz p0, :cond_3

    .line 110
    .line 111
    const/4 p0, 0x0

    .line 112
    goto :goto_2

    .line 113
    :cond_3
    new-instance p0, Ld0/x;

    .line 114
    .line 115
    invoke-direct {p0, v0}, Ld0/x;-><init>(Ljava/util/List;)V

    .line 116
    .line 117
    .line 118
    :goto_2
    return-object p0
.end method

.method public static e([B)LX2/v;
    .locals 7

    .line 1
    new-instance v0, Lg0/z;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lg0/z;-><init>([B)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Lg0/z;->U(I)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    invoke-virtual {v0}, Lg0/z;->a()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const/16 v5, 0xff

    .line 17
    .line 18
    if-lez v4, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Lg0/z;->j()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-ne v4, v5, :cond_0

    .line 25
    .line 26
    add-int/lit16 v3, v3, 0xff

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lg0/z;->U(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0}, Lg0/z;->G()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    add-int/2addr v3, v4

    .line 37
    move v4, v2

    .line 38
    :goto_1
    invoke-virtual {v0}, Lg0/z;->a()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-lez v6, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0}, Lg0/z;->j()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-ne v6, v5, :cond_1

    .line 49
    .line 50
    add-int/lit16 v4, v4, 0xff

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lg0/z;->U(I)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-virtual {v0}, Lg0/z;->G()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/2addr v4, v1

    .line 61
    new-array v1, v3, [B

    .line 62
    .line 63
    invoke-virtual {v0}, Lg0/z;->f()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-static {p0, v0, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 68
    .line 69
    .line 70
    add-int/2addr v0, v3

    .line 71
    add-int/2addr v0, v4

    .line 72
    array-length v3, p0

    .line 73
    sub-int/2addr v3, v0

    .line 74
    new-array v4, v3, [B

    .line 75
    .line 76
    invoke-static {p0, v0, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 77
    .line 78
    .line 79
    invoke-static {v1, v4}, LX2/v;->a0(Ljava/lang/Object;Ljava/lang/Object;)LX2/v;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method

.method public static f(LF0/V;)V
    .locals 15

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-virtual {p0, v0}, LF0/V;->d(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x1

    .line 7
    add-int/2addr v1, v2

    .line 8
    const/4 v3, 0x0

    .line 9
    move v4, v3

    .line 10
    :goto_0
    if-ge v4, v1, :cond_9

    .line 11
    .line 12
    const/16 v5, 0x10

    .line 13
    .line 14
    invoke-virtual {p0, v5}, LF0/V;->d(I)I

    .line 15
    .line 16
    .line 17
    move-result v6

    .line 18
    const/4 v7, 0x4

    .line 19
    const/16 v8, 0x8

    .line 20
    .line 21
    if-eqz v6, :cond_7

    .line 22
    .line 23
    if-ne v6, v2, :cond_6

    .line 24
    .line 25
    const/4 v5, 0x5

    .line 26
    invoke-virtual {p0, v5}, LF0/V;->d(I)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    new-array v6, v5, [I

    .line 31
    .line 32
    const/4 v9, -0x1

    .line 33
    move v10, v3

    .line 34
    :goto_1
    if-ge v10, v5, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0, v7}, LF0/V;->d(I)I

    .line 37
    .line 38
    .line 39
    move-result v11

    .line 40
    aput v11, v6, v10

    .line 41
    .line 42
    if-le v11, v9, :cond_0

    .line 43
    .line 44
    move v9, v11

    .line 45
    :cond_0
    add-int/lit8 v10, v10, 0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 49
    .line 50
    new-array v10, v9, [I

    .line 51
    .line 52
    move v11, v3

    .line 53
    :goto_2
    const/4 v12, 0x2

    .line 54
    if-ge v11, v9, :cond_4

    .line 55
    .line 56
    const/4 v13, 0x3

    .line 57
    invoke-virtual {p0, v13}, LF0/V;->d(I)I

    .line 58
    .line 59
    .line 60
    move-result v13

    .line 61
    add-int/2addr v13, v2

    .line 62
    aput v13, v10, v11

    .line 63
    .line 64
    invoke-virtual {p0, v12}, LF0/V;->d(I)I

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    if-lez v12, :cond_2

    .line 69
    .line 70
    invoke-virtual {p0, v8}, LF0/V;->e(I)V

    .line 71
    .line 72
    .line 73
    :cond_2
    move v13, v3

    .line 74
    :goto_3
    shl-int v14, v2, v12

    .line 75
    .line 76
    if-ge v13, v14, :cond_3

    .line 77
    .line 78
    invoke-virtual {p0, v8}, LF0/V;->e(I)V

    .line 79
    .line 80
    .line 81
    add-int/lit8 v13, v13, 0x1

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_3
    add-int/lit8 v11, v11, 0x1

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    invoke-virtual {p0, v12}, LF0/V;->e(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v7}, LF0/V;->d(I)I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    move v8, v3

    .line 95
    move v9, v8

    .line 96
    move v11, v9

    .line 97
    :goto_4
    if-ge v8, v5, :cond_8

    .line 98
    .line 99
    aget v12, v6, v8

    .line 100
    .line 101
    aget v12, v10, v12

    .line 102
    .line 103
    add-int/2addr v9, v12

    .line 104
    :goto_5
    if-ge v11, v9, :cond_5

    .line 105
    .line 106
    invoke-virtual {p0, v7}, LF0/V;->e(I)V

    .line 107
    .line 108
    .line 109
    add-int/lit8 v11, v11, 0x1

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_5
    add-int/lit8 v8, v8, 0x1

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_6
    new-instance p0, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    .line 119
    .line 120
    const-string v0, "floor type greater than 1 not decodable: "

    .line 121
    .line 122
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    const/4 v0, 0x0

    .line 133
    invoke-static {p0, v0}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    throw p0

    .line 138
    :cond_7
    invoke-virtual {p0, v8}, LF0/V;->e(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v5}, LF0/V;->e(I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, v5}, LF0/V;->e(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, v0}, LF0/V;->e(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v8}, LF0/V;->e(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, v7}, LF0/V;->d(I)I

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    add-int/2addr v5, v2

    .line 158
    move v6, v3

    .line 159
    :goto_6
    if-ge v6, v5, :cond_8

    .line 160
    .line 161
    invoke-virtual {p0, v8}, LF0/V;->e(I)V

    .line 162
    .line 163
    .line 164
    add-int/lit8 v6, v6, 0x1

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_9
    return-void
.end method

.method public static g(ILF0/V;)V
    .locals 11

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-virtual {p1, v0}, LF0/V;->d(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/4 v1, 0x1

    .line 7
    add-int/2addr v0, v1

    .line 8
    const/4 v2, 0x0

    .line 9
    move v3, v2

    .line 10
    :goto_0
    if-ge v3, v0, :cond_6

    .line 11
    .line 12
    const/16 v4, 0x10

    .line 13
    .line 14
    invoke-virtual {p1, v4}, LF0/V;->d(I)I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    new-instance v5, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v6, "mapping type other than 0 not supported: "

    .line 26
    .line 27
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const-string v5, "VorbisUtil"

    .line 38
    .line 39
    invoke-static {v5, v4}, Lg0/o;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    goto :goto_5

    .line 43
    :cond_0
    invoke-virtual {p1}, LF0/V;->c()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    const/4 v5, 0x4

    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    invoke-virtual {p1, v5}, LF0/V;->d(I)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    add-int/2addr v4, v1

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move v4, v1

    .line 57
    :goto_1
    invoke-virtual {p1}, LF0/V;->c()Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    const/16 v7, 0x8

    .line 62
    .line 63
    if-eqz v6, :cond_2

    .line 64
    .line 65
    invoke-virtual {p1, v7}, LF0/V;->d(I)I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    add-int/2addr v6, v1

    .line 70
    move v8, v2

    .line 71
    :goto_2
    if-ge v8, v6, :cond_2

    .line 72
    .line 73
    add-int/lit8 v9, p0, -0x1

    .line 74
    .line 75
    invoke-static {v9}, LF0/W;->b(I)I

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    invoke-virtual {p1, v10}, LF0/V;->e(I)V

    .line 80
    .line 81
    .line 82
    invoke-static {v9}, LF0/W;->b(I)I

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    invoke-virtual {p1, v9}, LF0/V;->e(I)V

    .line 87
    .line 88
    .line 89
    add-int/lit8 v8, v8, 0x1

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_2
    const/4 v6, 0x2

    .line 93
    invoke-virtual {p1, v6}, LF0/V;->d(I)I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-nez v6, :cond_5

    .line 98
    .line 99
    if-le v4, v1, :cond_3

    .line 100
    .line 101
    move v6, v2

    .line 102
    :goto_3
    if-ge v6, p0, :cond_3

    .line 103
    .line 104
    invoke-virtual {p1, v5}, LF0/V;->e(I)V

    .line 105
    .line 106
    .line 107
    add-int/lit8 v6, v6, 0x1

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_3
    move v5, v2

    .line 111
    :goto_4
    if-ge v5, v4, :cond_4

    .line 112
    .line 113
    invoke-virtual {p1, v7}, LF0/V;->e(I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v7}, LF0/V;->e(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v7}, LF0/V;->e(I)V

    .line 120
    .line 121
    .line 122
    add-int/lit8 v5, v5, 0x1

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_4
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_5
    const-string p0, "to reserved bits must be zero after mapping coupling steps"

    .line 129
    .line 130
    const/4 p1, 0x0

    .line 131
    invoke-static {p0, p1}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    throw p0

    .line 136
    :cond_6
    return-void
.end method

.method public static h(LF0/V;)[LF0/W$b;
    .locals 8

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-virtual {p0, v0}, LF0/V;->d(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    add-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    new-array v1, v0, [LF0/W$b;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, LF0/V;->c()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/16 v4, 0x10

    .line 18
    .line 19
    invoke-virtual {p0, v4}, LF0/V;->d(I)I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    invoke-virtual {p0, v4}, LF0/V;->d(I)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const/16 v6, 0x8

    .line 28
    .line 29
    invoke-virtual {p0, v6}, LF0/V;->d(I)I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    new-instance v7, LF0/W$b;

    .line 34
    .line 35
    invoke-direct {v7, v3, v5, v4, v6}, LF0/W$b;-><init>(ZIII)V

    .line 36
    .line 37
    .line 38
    aput-object v7, v1, v2

    .line 39
    .line 40
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-object v1
.end method

.method public static i(LF0/V;)V
    .locals 12

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-virtual {p0, v0}, LF0/V;->d(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x1

    .line 7
    add-int/2addr v1, v2

    .line 8
    const/4 v3, 0x0

    .line 9
    move v4, v3

    .line 10
    :goto_0
    if-ge v4, v1, :cond_6

    .line 11
    .line 12
    const/16 v5, 0x10

    .line 13
    .line 14
    invoke-virtual {p0, v5}, LF0/V;->d(I)I

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    const/4 v6, 0x2

    .line 19
    if-gt v5, v6, :cond_5

    .line 20
    .line 21
    const/16 v5, 0x18

    .line 22
    .line 23
    invoke-virtual {p0, v5}, LF0/V;->e(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v5}, LF0/V;->e(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v5}, LF0/V;->e(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, LF0/V;->d(I)I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    add-int/2addr v5, v2

    .line 37
    const/16 v6, 0x8

    .line 38
    .line 39
    invoke-virtual {p0, v6}, LF0/V;->e(I)V

    .line 40
    .line 41
    .line 42
    new-array v7, v5, [I

    .line 43
    .line 44
    move v8, v3

    .line 45
    :goto_1
    if-ge v8, v5, :cond_1

    .line 46
    .line 47
    const/4 v9, 0x3

    .line 48
    invoke-virtual {p0, v9}, LF0/V;->d(I)I

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    invoke-virtual {p0}, LF0/V;->c()Z

    .line 53
    .line 54
    .line 55
    move-result v10

    .line 56
    if-eqz v10, :cond_0

    .line 57
    .line 58
    const/4 v10, 0x5

    .line 59
    invoke-virtual {p0, v10}, LF0/V;->d(I)I

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    goto :goto_2

    .line 64
    :cond_0
    move v10, v3

    .line 65
    :goto_2
    mul-int/2addr v10, v6

    .line 66
    add-int/2addr v10, v9

    .line 67
    aput v10, v7, v8

    .line 68
    .line 69
    add-int/lit8 v8, v8, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    move v8, v3

    .line 73
    :goto_3
    if-ge v8, v5, :cond_4

    .line 74
    .line 75
    move v9, v3

    .line 76
    :goto_4
    if-ge v9, v6, :cond_3

    .line 77
    .line 78
    aget v10, v7, v8

    .line 79
    .line 80
    shl-int v11, v2, v9

    .line 81
    .line 82
    and-int/2addr v10, v11

    .line 83
    if-eqz v10, :cond_2

    .line 84
    .line 85
    invoke-virtual {p0, v6}, LF0/V;->e(I)V

    .line 86
    .line 87
    .line 88
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_3
    add-int/lit8 v8, v8, 0x1

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_5
    const-string p0, "residueType greater than 2 is not decodable"

    .line 98
    .line 99
    const/4 v0, 0x0

    .line 100
    invoke-static {p0, v0}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    throw p0

    .line 105
    :cond_6
    return-void
.end method

.method public static j(Lg0/z;)LF0/W$a;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0, v0}, LF0/W;->k(Lg0/z;ZZ)LF0/W$a;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static k(Lg0/z;ZZ)LF0/W$a;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const/4 p1, 0x3

    .line 5
    invoke-static {p1, p0, v0}, LF0/W;->o(ILg0/z;Z)Z

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Lg0/z;->w()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    long-to-int p1, v1

    .line 13
    invoke-virtual {p0, p1}, Lg0/z;->D(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {p0}, Lg0/z;->w()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    long-to-int v4, v2

    .line 26
    new-array v4, v4, [Ljava/lang/String;

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0xf

    .line 29
    .line 30
    :goto_0
    int-to-long v5, v0

    .line 31
    cmp-long v5, v5, v2

    .line 32
    .line 33
    if-gez v5, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, Lg0/z;->w()J

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    long-to-int v5, v5

    .line 40
    add-int/lit8 v1, v1, 0x4

    .line 41
    .line 42
    invoke-virtual {p0, v5}, Lg0/z;->D(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    aput-object v5, v4, v0

    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    add-int/2addr v1, v5

    .line 53
    add-int/lit8 v0, v0, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    if-eqz p2, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0}, Lg0/z;->G()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    and-int/lit8 p0, p0, 0x1

    .line 63
    .line 64
    if-eqz p0, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    const-string p0, "framing bit expected to be set"

    .line 68
    .line 69
    const/4 p1, 0x0

    .line 70
    invoke-static {p0, p1}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    throw p0

    .line 75
    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 76
    .line 77
    new-instance p0, LF0/W$a;

    .line 78
    .line 79
    invoke-direct {p0, p1, v4, v1}, LF0/W$a;-><init>(Ljava/lang/String;[Ljava/lang/String;I)V

    .line 80
    .line 81
    .line 82
    return-object p0
.end method

.method public static l(Lg0/z;)LF0/W$c;
    .locals 16

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    move-object/from16 v2, p0

    .line 4
    .line 5
    invoke-static {v0, v2, v1}, LF0/W;->o(ILg0/z;Z)Z

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p0 .. p0}, Lg0/z;->x()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    invoke-virtual/range {p0 .. p0}, Lg0/z;->G()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    invoke-virtual/range {p0 .. p0}, Lg0/z;->x()I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    invoke-virtual/range {p0 .. p0}, Lg0/z;->t()I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    const/4 v7, -0x1

    .line 25
    if-gtz v6, :cond_0

    .line 26
    .line 27
    move v6, v7

    .line 28
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lg0/z;->t()I

    .line 29
    .line 30
    .line 31
    move-result v8

    .line 32
    if-gtz v8, :cond_1

    .line 33
    .line 34
    move v8, v7

    .line 35
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lg0/z;->t()I

    .line 36
    .line 37
    .line 38
    move-result v9

    .line 39
    if-gtz v9, :cond_2

    .line 40
    .line 41
    move v9, v7

    .line 42
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lg0/z;->G()I

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    and-int/lit8 v10, v7, 0xf

    .line 47
    .line 48
    int-to-double v10, v10

    .line 49
    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    .line 50
    .line 51
    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->pow(DD)D

    .line 52
    .line 53
    .line 54
    move-result-wide v10

    .line 55
    double-to-int v10, v10

    .line 56
    and-int/lit16 v7, v7, 0xf0

    .line 57
    .line 58
    shr-int/lit8 v7, v7, 0x4

    .line 59
    .line 60
    int-to-double v14, v7

    .line 61
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 62
    .line 63
    .line 64
    move-result-wide v11

    .line 65
    double-to-int v11, v11

    .line 66
    invoke-virtual/range {p0 .. p0}, Lg0/z;->G()I

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    and-int/2addr v7, v0

    .line 71
    if-lez v7, :cond_3

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    move v0, v1

    .line 75
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lg0/z;->e()[B

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual/range {p0 .. p0}, Lg0/z;->g()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 84
    .line 85
    .line 86
    move-result-object v12

    .line 87
    new-instance v1, LF0/W$c;

    .line 88
    .line 89
    move-object v2, v1

    .line 90
    move v7, v8

    .line 91
    move v8, v9

    .line 92
    move v9, v10

    .line 93
    move v10, v11

    .line 94
    move v11, v0

    .line 95
    invoke-direct/range {v2 .. v12}, LF0/W$c;-><init>(IIIIIIIIZ[B)V

    .line 96
    .line 97
    .line 98
    return-object v1
.end method

.method public static m(Lg0/z;I)[LF0/W$b;
    .locals 4

    .line 1
    const/4 v0, 0x5

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {v0, p0, v1}, LF0/W;->o(ILg0/z;Z)Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lg0/z;->G()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    add-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    new-instance v2, LF0/V;

    .line 13
    .line 14
    invoke-virtual {p0}, Lg0/z;->e()[B

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-direct {v2, v3}, LF0/V;-><init>([B)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lg0/z;->f()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    mul-int/lit8 p0, p0, 0x8

    .line 26
    .line 27
    invoke-virtual {v2, p0}, LF0/V;->e(I)V

    .line 28
    .line 29
    .line 30
    move p0, v1

    .line 31
    :goto_0
    if-ge p0, v0, :cond_0

    .line 32
    .line 33
    invoke-static {v2}, LF0/W;->n(LF0/V;)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 p0, p0, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 p0, 0x6

    .line 40
    invoke-virtual {v2, p0}, LF0/V;->d(I)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    add-int/lit8 p0, p0, 0x1

    .line 45
    .line 46
    :goto_1
    const/4 v0, 0x0

    .line 47
    if-ge v1, p0, :cond_2

    .line 48
    .line 49
    const/16 v3, 0x10

    .line 50
    .line 51
    invoke-virtual {v2, v3}, LF0/V;->d(I)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-nez v3, :cond_1

    .line 56
    .line 57
    add-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const-string p0, "placeholder of time domain transforms not zeroed out"

    .line 61
    .line 62
    invoke-static {p0, v0}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    throw p0

    .line 67
    :cond_2
    invoke-static {v2}, LF0/W;->f(LF0/V;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v2}, LF0/W;->i(LF0/V;)V

    .line 71
    .line 72
    .line 73
    invoke-static {p1, v2}, LF0/W;->g(ILF0/V;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v2}, LF0/W;->h(LF0/V;)[LF0/W$b;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {v2}, LF0/V;->c()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_3

    .line 85
    .line 86
    return-object p0

    .line 87
    :cond_3
    const-string p0, "framing bit after modes not set as expected"

    .line 88
    .line 89
    invoke-static {p0, v0}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    throw p0
.end method

.method public static n(LF0/V;)V
    .locals 7

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LF0/V;->d(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, 0x564342

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-ne v1, v2, :cond_9

    .line 12
    .line 13
    const/16 v1, 0x10

    .line 14
    .line 15
    invoke-virtual {p0, v1}, LF0/V;->d(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p0, v0}, LF0/V;->d(I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p0}, LF0/V;->c()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x5

    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0}, LF0/V;->c()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    :goto_0
    if-ge v4, v0, :cond_3

    .line 36
    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, LF0/V;->c()Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-eqz v6, :cond_1

    .line 44
    .line 45
    :cond_0
    invoke-virtual {p0, v5}, LF0/V;->e(I)V

    .line 46
    .line 47
    .line 48
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {p0, v5}, LF0/V;->e(I)V

    .line 52
    .line 53
    .line 54
    :goto_1
    if-ge v4, v0, :cond_3

    .line 55
    .line 56
    sub-int v2, v0, v4

    .line 57
    .line 58
    invoke-static {v2}, LF0/W;->b(I)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-virtual {p0, v2}, LF0/V;->d(I)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    add-int/2addr v4, v2

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    const/4 v2, 0x4

    .line 69
    invoke-virtual {p0, v2}, LF0/V;->d(I)I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    const/4 v5, 0x2

    .line 74
    if-gt v4, v5, :cond_8

    .line 75
    .line 76
    const/4 v3, 0x1

    .line 77
    if-eq v4, v3, :cond_4

    .line 78
    .line 79
    if-ne v4, v5, :cond_7

    .line 80
    .line 81
    :cond_4
    const/16 v5, 0x20

    .line 82
    .line 83
    invoke-virtual {p0, v5}, LF0/V;->e(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v5}, LF0/V;->e(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v2}, LF0/V;->d(I)I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    add-int/2addr v2, v3

    .line 94
    invoke-virtual {p0, v3}, LF0/V;->e(I)V

    .line 95
    .line 96
    .line 97
    if-ne v4, v3, :cond_6

    .line 98
    .line 99
    if-eqz v1, :cond_5

    .line 100
    .line 101
    int-to-long v3, v0

    .line 102
    int-to-long v0, v1

    .line 103
    invoke-static {v3, v4, v0, v1}, LF0/W;->c(JJ)J

    .line 104
    .line 105
    .line 106
    move-result-wide v0

    .line 107
    goto :goto_2

    .line 108
    :cond_5
    const-wide/16 v0, 0x0

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_6
    int-to-long v3, v0

    .line 112
    int-to-long v0, v1

    .line 113
    mul-long/2addr v0, v3

    .line 114
    :goto_2
    int-to-long v2, v2

    .line 115
    mul-long/2addr v0, v2

    .line 116
    long-to-int v0, v0

    .line 117
    invoke-virtual {p0, v0}, LF0/V;->e(I)V

    .line 118
    .line 119
    .line 120
    :cond_7
    return-void

    .line 121
    :cond_8
    new-instance p0, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 124
    .line 125
    .line 126
    const-string v0, "lookup type greater than 2 not decodable: "

    .line 127
    .line 128
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {p0, v3}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    throw p0

    .line 143
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    .line 147
    .line 148
    const-string v1, "expected code book to start with [0x56, 0x43, 0x42] at "

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, LF0/V;->b()I

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-static {p0, v3}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    throw p0
.end method

.method public static o(ILg0/z;Z)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x7

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    if-ge v0, v1, :cond_1

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    return v3

    .line 13
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string p2, "too short header: "

    .line 19
    .line 20
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0, v2}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    throw p0

    .line 39
    :cond_1
    invoke-virtual {p1}, Lg0/z;->G()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eq v0, p0, :cond_3

    .line 44
    .line 45
    if-eqz p2, :cond_2

    .line 46
    .line 47
    return v3

    .line 48
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string p2, "expected header type "

    .line 54
    .line 55
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p0, v2}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    throw p0

    .line 74
    :cond_3
    invoke-virtual {p1}, Lg0/z;->G()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    const/16 v0, 0x76

    .line 79
    .line 80
    if-ne p0, v0, :cond_5

    .line 81
    .line 82
    invoke-virtual {p1}, Lg0/z;->G()I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    const/16 v0, 0x6f

    .line 87
    .line 88
    if-ne p0, v0, :cond_5

    .line 89
    .line 90
    invoke-virtual {p1}, Lg0/z;->G()I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    const/16 v0, 0x72

    .line 95
    .line 96
    if-ne p0, v0, :cond_5

    .line 97
    .line 98
    invoke-virtual {p1}, Lg0/z;->G()I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    const/16 v0, 0x62

    .line 103
    .line 104
    if-ne p0, v0, :cond_5

    .line 105
    .line 106
    invoke-virtual {p1}, Lg0/z;->G()I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    const/16 v0, 0x69

    .line 111
    .line 112
    if-ne p0, v0, :cond_5

    .line 113
    .line 114
    invoke-virtual {p1}, Lg0/z;->G()I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    const/16 p1, 0x73

    .line 119
    .line 120
    if-eq p0, p1, :cond_4

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_4
    const/4 p0, 0x1

    .line 124
    return p0

    .line 125
    :cond_5
    :goto_0
    if-eqz p2, :cond_6

    .line 126
    .line 127
    return v3

    .line 128
    :cond_6
    const-string p0, "expected characters \'vorbis\'"

    .line 129
    .line 130
    invoke-static {p0, v2}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    throw p0
.end method
