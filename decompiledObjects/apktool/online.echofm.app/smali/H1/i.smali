.class public final LH1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LH1/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LH1/i;

    .line 2
    .line 3
    invoke-direct {v0}, LH1/i;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LH1/i;->a:LH1/i;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(LH1/a;LH1/a;)V
    .locals 13

    .line 1
    const-class v0, LH1/i;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    const-string v1, "x"

    .line 11
    .line 12
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "b"

    .line 16
    .line 17
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p0, v1}, LH1/a;->b(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x1

    .line 26
    invoke-virtual {p0, v3}, LH1/a;->b(I)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const/4 v4, 0x2

    .line 31
    invoke-virtual {p0, v4}, LH1/a;->b(I)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-virtual {p0}, LH1/a;->a()[F

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p1}, LH1/a;->a()[F

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-lez v2, :cond_6

    .line 44
    .line 45
    move v5, v1

    .line 46
    :goto_0
    add-int/lit8 v6, v5, 0x1

    .line 47
    .line 48
    if-lez v3, :cond_4

    .line 49
    .line 50
    move v7, v1

    .line 51
    :goto_1
    add-int/lit8 v8, v7, 0x1

    .line 52
    .line 53
    if-lez v4, :cond_2

    .line 54
    .line 55
    move v9, v1

    .line 56
    :goto_2
    add-int/lit8 v10, v9, 0x1

    .line 57
    .line 58
    mul-int v11, v5, v3

    .line 59
    .line 60
    mul-int/2addr v11, v4

    .line 61
    mul-int v12, v7, v4

    .line 62
    .line 63
    add-int/2addr v11, v12

    .line 64
    add-int/2addr v11, v9

    .line 65
    aget v12, p0, v11

    .line 66
    .line 67
    aget v9, p1, v9

    .line 68
    .line 69
    add-float/2addr v12, v9

    .line 70
    aput v12, p0, v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    if-lt v10, v4, :cond_1

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_1
    move v9, v10

    .line 76
    goto :goto_2

    .line 77
    :catchall_0
    move-exception p0

    .line 78
    goto :goto_6

    .line 79
    :cond_2
    :goto_3
    if-lt v8, v3, :cond_3

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_3
    move v7, v8

    .line 83
    goto :goto_1

    .line 84
    :cond_4
    :goto_4
    if-lt v6, v2, :cond_5

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_5
    move v5, v6

    .line 88
    goto :goto_0

    .line 89
    :cond_6
    :goto_5
    return-void

    .line 90
    :goto_6
    invoke-static {p0, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public static final b([LH1/a;)LH1/a;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-class v1, LH1/i;

    .line 4
    .line 5
    invoke-static {v1}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    return-object v3

    .line 13
    :cond_0
    :try_start_0
    const-string v2, "tensors"

    .line 14
    .line 15
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    aget-object v4, v0, v2

    .line 20
    .line 21
    invoke-virtual {v4, v2}, LH1/a;->b(I)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    array-length v5, v0

    .line 26
    add-int/lit8 v5, v5, -0x1

    .line 27
    .line 28
    const/4 v6, 0x1

    .line 29
    if-ltz v5, :cond_2

    .line 30
    .line 31
    move v7, v2

    .line 32
    move v8, v7

    .line 33
    :goto_0
    add-int/lit8 v9, v7, 0x1

    .line 34
    .line 35
    aget-object v7, v0, v7

    .line 36
    .line 37
    invoke-virtual {v7, v6}, LH1/a;->b(I)I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    add-int/2addr v8, v7

    .line 42
    if-le v9, v5, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move v7, v9

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto :goto_6

    .line 49
    :cond_2
    move v8, v2

    .line 50
    :goto_1
    new-instance v5, LH1/a;

    .line 51
    .line 52
    filled-new-array {v4, v8}, [I

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-direct {v5, v7}, LH1/a;-><init>([I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5}, LH1/a;->a()[F

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    if-lez v4, :cond_6

    .line 64
    .line 65
    move v9, v2

    .line 66
    :goto_2
    add-int/lit8 v10, v9, 0x1

    .line 67
    .line 68
    mul-int v11, v9, v8

    .line 69
    .line 70
    array-length v12, v0

    .line 71
    add-int/lit8 v12, v12, -0x1

    .line 72
    .line 73
    if-ltz v12, :cond_4

    .line 74
    .line 75
    move v13, v2

    .line 76
    :goto_3
    add-int/lit8 v14, v13, 0x1

    .line 77
    .line 78
    aget-object v15, v0, v13

    .line 79
    .line 80
    invoke-virtual {v15}, LH1/a;->a()[F

    .line 81
    .line 82
    .line 83
    move-result-object v15

    .line 84
    aget-object v13, v0, v13

    .line 85
    .line 86
    invoke-virtual {v13, v6}, LH1/a;->b(I)I

    .line 87
    .line 88
    .line 89
    move-result v13

    .line 90
    mul-int v2, v9, v13

    .line 91
    .line 92
    invoke-static {v15, v2, v7, v11, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    .line 95
    add-int/2addr v11, v13

    .line 96
    if-le v14, v12, :cond_3

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_3
    move v13, v14

    .line 100
    const/4 v2, 0x0

    .line 101
    goto :goto_3

    .line 102
    :cond_4
    :goto_4
    if-lt v10, v4, :cond_5

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_5
    move v9, v10

    .line 106
    const/4 v2, 0x0

    .line 107
    goto :goto_2

    .line 108
    :cond_6
    :goto_5
    return-object v5

    .line 109
    :goto_6
    invoke-static {v0, v1}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-object v3
.end method

.method public static final c(LH1/a;LH1/a;)LH1/a;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-class v2, LH1/i;

    .line 6
    .line 7
    invoke-static {v2}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    return-object v4

    .line 15
    :cond_0
    :try_start_0
    const-string v3, "x"

    .line 16
    .line 17
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v3, "w"

    .line 21
    .line 22
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v0, v3}, LH1/a;->b(I)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    const/4 v6, 0x1

    .line 31
    invoke-virtual {v0, v6}, LH1/a;->b(I)I

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    const/4 v8, 0x2

    .line 36
    invoke-virtual {v0, v8}, LH1/a;->b(I)I

    .line 37
    .line 38
    .line 39
    move-result v9

    .line 40
    invoke-virtual {v1, v3}, LH1/a;->b(I)I

    .line 41
    .line 42
    .line 43
    move-result v10

    .line 44
    sub-int v11, v7, v10

    .line 45
    .line 46
    add-int/2addr v11, v6

    .line 47
    invoke-virtual {v1, v8}, LH1/a;->b(I)I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    new-instance v8, LH1/a;

    .line 52
    .line 53
    filled-new-array {v5, v11, v6}, [I

    .line 54
    .line 55
    .line 56
    move-result-object v12

    .line 57
    invoke-direct {v8, v12}, LH1/a;-><init>([I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual/range {p0 .. p0}, LH1/a;->a()[F

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v8}, LH1/a;->a()[F

    .line 65
    .line 66
    .line 67
    move-result-object v12

    .line 68
    invoke-virtual/range {p1 .. p1}, LH1/a;->a()[F

    .line 69
    .line 70
    .line 71
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 72
    if-lez v5, :cond_a

    .line 73
    .line 74
    move v13, v3

    .line 75
    :goto_0
    add-int/lit8 v14, v13, 0x1

    .line 76
    .line 77
    if-lez v6, :cond_8

    .line 78
    .line 79
    move v15, v3

    .line 80
    :goto_1
    add-int/lit8 v3, v15, 0x1

    .line 81
    .line 82
    if-lez v11, :cond_6

    .line 83
    .line 84
    const/16 v16, 0x0

    .line 85
    .line 86
    :goto_2
    add-int/lit8 v4, v16, 0x1

    .line 87
    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    if-lez v10, :cond_4

    .line 91
    .line 92
    const/16 v18, 0x0

    .line 93
    .line 94
    :goto_3
    move-object/from16 v19, v2

    .line 95
    .line 96
    add-int/lit8 v2, v18, 0x1

    .line 97
    .line 98
    if-lez v9, :cond_2

    .line 99
    .line 100
    const/16 v20, 0x0

    .line 101
    .line 102
    :goto_4
    move-object/from16 v21, v8

    .line 103
    .line 104
    add-int/lit8 v8, v20, 0x1

    .line 105
    .line 106
    mul-int v22, v7, v9

    .line 107
    .line 108
    mul-int v22, v22, v13

    .line 109
    .line 110
    add-int v23, v18, v16

    .line 111
    .line 112
    mul-int v23, v23, v9

    .line 113
    .line 114
    add-int v22, v22, v23

    .line 115
    .line 116
    add-int v22, v22, v20

    .line 117
    .line 118
    :try_start_1
    aget v22, v0, v22

    .line 119
    .line 120
    mul-int v23, v18, v9

    .line 121
    .line 122
    add-int v23, v23, v20

    .line 123
    .line 124
    mul-int v23, v23, v6

    .line 125
    .line 126
    add-int v23, v23, v15

    .line 127
    .line 128
    aget v20, v1, v23

    .line 129
    .line 130
    mul-float v22, v22, v20

    .line 131
    .line 132
    add-float v17, v17, v22

    .line 133
    .line 134
    if-lt v8, v9, :cond_1

    .line 135
    .line 136
    goto :goto_6

    .line 137
    :cond_1
    move/from16 v20, v8

    .line 138
    .line 139
    move-object/from16 v8, v21

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :catchall_0
    move-exception v0

    .line 143
    :goto_5
    move-object/from16 v1, v19

    .line 144
    .line 145
    goto :goto_b

    .line 146
    :cond_2
    move-object/from16 v21, v8

    .line 147
    .line 148
    :goto_6
    if-lt v2, v10, :cond_3

    .line 149
    .line 150
    goto :goto_7

    .line 151
    :cond_3
    move/from16 v18, v2

    .line 152
    .line 153
    move-object/from16 v2, v19

    .line 154
    .line 155
    move-object/from16 v8, v21

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_4
    move-object/from16 v19, v2

    .line 159
    .line 160
    move-object/from16 v21, v8

    .line 161
    .line 162
    :goto_7
    mul-int v2, v11, v6

    .line 163
    .line 164
    mul-int/2addr v2, v13

    .line 165
    mul-int v16, v16, v6

    .line 166
    .line 167
    add-int v2, v2, v16

    .line 168
    .line 169
    add-int/2addr v2, v15

    .line 170
    aput v17, v12, v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 171
    .line 172
    if-lt v4, v11, :cond_5

    .line 173
    .line 174
    goto :goto_8

    .line 175
    :cond_5
    move/from16 v16, v4

    .line 176
    .line 177
    move-object/from16 v2, v19

    .line 178
    .line 179
    move-object/from16 v8, v21

    .line 180
    .line 181
    const/4 v4, 0x0

    .line 182
    goto :goto_2

    .line 183
    :cond_6
    move-object/from16 v19, v2

    .line 184
    .line 185
    move-object/from16 v21, v8

    .line 186
    .line 187
    :goto_8
    if-lt v3, v6, :cond_7

    .line 188
    .line 189
    goto :goto_9

    .line 190
    :cond_7
    move v15, v3

    .line 191
    move-object/from16 v2, v19

    .line 192
    .line 193
    move-object/from16 v8, v21

    .line 194
    .line 195
    const/4 v3, 0x0

    .line 196
    const/4 v4, 0x0

    .line 197
    goto :goto_1

    .line 198
    :cond_8
    move-object/from16 v19, v2

    .line 199
    .line 200
    move-object/from16 v21, v8

    .line 201
    .line 202
    :goto_9
    if-lt v14, v5, :cond_9

    .line 203
    .line 204
    goto :goto_a

    .line 205
    :cond_9
    move v13, v14

    .line 206
    move-object/from16 v2, v19

    .line 207
    .line 208
    move-object/from16 v8, v21

    .line 209
    .line 210
    const/4 v3, 0x0

    .line 211
    const/4 v4, 0x0

    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :cond_a
    move-object/from16 v21, v8

    .line 215
    .line 216
    :goto_a
    return-object v21

    .line 217
    :catchall_1
    move-exception v0

    .line 218
    move-object/from16 v19, v2

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :goto_b
    invoke-static {v0, v1}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    const/4 v1, 0x0

    .line 225
    return-object v1
.end method

.method public static final d(LH1/a;LH1/a;LH1/a;)LH1/a;
    .locals 11

    .line 1
    const-class v0, LH1/i;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_0
    :try_start_0
    const-string v1, "x"

    .line 12
    .line 13
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "w"

    .line 17
    .line 18
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v1, "b"

    .line 22
    .line 23
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {p0, v1}, LH1/a;->b(I)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-virtual {p2, v1}, LH1/a;->b(I)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-static {p0, p1}, LH1/i;->h(LH1/a;LH1/a;)LH1/a;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p2}, LH1/a;->a()[F

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p0}, LH1/a;->a()[F

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    if-lez v3, :cond_4

    .line 48
    .line 49
    move v5, v1

    .line 50
    :goto_0
    add-int/lit8 v6, v5, 0x1

    .line 51
    .line 52
    if-lez v4, :cond_2

    .line 53
    .line 54
    move v7, v1

    .line 55
    :goto_1
    add-int/lit8 v8, v7, 0x1

    .line 56
    .line 57
    mul-int v9, v5, v4

    .line 58
    .line 59
    add-int/2addr v9, v7

    .line 60
    aget v10, p2, v9

    .line 61
    .line 62
    aget v7, p1, v7

    .line 63
    .line 64
    add-float/2addr v10, v7

    .line 65
    aput v10, p2, v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    if-lt v8, v4, :cond_1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_1
    move v7, v8

    .line 71
    goto :goto_1

    .line 72
    :catchall_0
    move-exception p0

    .line 73
    goto :goto_4

    .line 74
    :cond_2
    :goto_2
    if-lt v6, v3, :cond_3

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    move v5, v6

    .line 78
    goto :goto_0

    .line 79
    :cond_4
    :goto_3
    return-object p0

    .line 80
    :goto_4
    invoke-static {p0, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-object v2
.end method

.method public static final e([Ljava/lang/String;ILH1/a;)LH1/a;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-class v3, LH1/i;

    .line 8
    .line 9
    invoke-static {v3}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    const/4 v5, 0x0

    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    return-object v5

    .line 17
    :cond_0
    :try_start_0
    const-string v4, "texts"

    .line 18
    .line 19
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v4, "w"

    .line 23
    .line 24
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    array-length v4, v0

    .line 28
    const/4 v6, 0x1

    .line 29
    invoke-virtual {v2, v6}, LH1/a;->b(I)I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    new-instance v7, LH1/a;

    .line 34
    .line 35
    filled-new-array {v4, v1, v6}, [I

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    invoke-direct {v7, v8}, LH1/a;-><init>([I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v7}, LH1/a;->a()[F

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    invoke-virtual/range {p2 .. p2}, LH1/a;->a()[F

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-lez v4, :cond_4

    .line 51
    .line 52
    const/4 v9, 0x0

    .line 53
    move v10, v9

    .line 54
    :goto_0
    add-int/lit8 v11, v10, 0x1

    .line 55
    .line 56
    sget-object v12, LH1/j;->a:LH1/j;

    .line 57
    .line 58
    aget-object v13, v0, v10

    .line 59
    .line 60
    invoke-virtual {v12, v13, v1}, LH1/j;->d(Ljava/lang/String;I)[I

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    if-lez v1, :cond_2

    .line 65
    .line 66
    move v13, v9

    .line 67
    :goto_1
    add-int/lit8 v14, v13, 0x1

    .line 68
    .line 69
    aget v15, v12, v13

    .line 70
    .line 71
    mul-int/2addr v15, v6

    .line 72
    mul-int v16, v6, v1

    .line 73
    .line 74
    mul-int v16, v16, v10

    .line 75
    .line 76
    mul-int/2addr v13, v6

    .line 77
    add-int v13, v16, v13

    .line 78
    .line 79
    invoke-static {v2, v15, v8, v13, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    if-lt v14, v1, :cond_1

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_1
    move v13, v14

    .line 86
    goto :goto_1

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    goto :goto_4

    .line 89
    :cond_2
    :goto_2
    if-lt v11, v4, :cond_3

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_3
    move v10, v11

    .line 93
    goto :goto_0

    .line 94
    :cond_4
    :goto_3
    return-object v7

    .line 95
    :goto_4
    invoke-static {v0, v3}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-object v5
.end method

.method public static final f(LH1/a;I)V
    .locals 6

    .line 1
    const-class v0, LH1/i;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    const-string v1, "x"

    .line 11
    .line 12
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, LH1/a;->c()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-lt p1, v1, :cond_1

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    invoke-virtual {p0}, LH1/a;->c()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x1

    .line 27
    if-ge p1, v1, :cond_3

    .line 28
    .line 29
    move v3, p1

    .line 30
    :goto_0
    add-int/lit8 v4, v3, 0x1

    .line 31
    .line 32
    invoke-virtual {p0, v3}, LH1/a;->b(I)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    mul-int/2addr v2, v3

    .line 37
    if-lt v4, v1, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v3, v4

    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_4

    .line 44
    :cond_3
    :goto_1
    add-int/lit8 v1, p1, 0x1

    .line 45
    .line 46
    new-array v1, v1, [I

    .line 47
    .line 48
    if-lez p1, :cond_5

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    :goto_2
    add-int/lit8 v4, v3, 0x1

    .line 52
    .line 53
    invoke-virtual {p0, v3}, LH1/a;->b(I)I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    aput v5, v1, v3

    .line 58
    .line 59
    if-lt v4, p1, :cond_4

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_4
    move v3, v4

    .line 63
    goto :goto_2

    .line 64
    :cond_5
    :goto_3
    aput v2, v1, p1

    .line 65
    .line 66
    invoke-virtual {p0, v1}, LH1/a;->d([I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :goto_4
    invoke-static {p0, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public static final g(LH1/a;I)LH1/a;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    const-class v2, LH1/i;

    .line 6
    .line 7
    invoke-static {v2}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    return-object v4

    .line 15
    :cond_0
    :try_start_0
    const-string v3, "x"

    .line 16
    .line 17
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-virtual {v0, v3}, LH1/a;->b(I)I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    const/4 v6, 0x1

    .line 26
    invoke-virtual {v0, v6}, LH1/a;->b(I)I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    const/4 v8, 0x2

    .line 31
    invoke-virtual {v0, v8}, LH1/a;->b(I)I

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    sub-int v9, v7, v1

    .line 36
    .line 37
    add-int/2addr v9, v6

    .line 38
    new-instance v6, LH1/a;

    .line 39
    .line 40
    filled-new-array {v5, v9, v8}, [I

    .line 41
    .line 42
    .line 43
    move-result-object v10

    .line 44
    invoke-direct {v6, v10}, LH1/a;-><init>([I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual/range {p0 .. p0}, LH1/a;->a()[F

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v6}, LH1/a;->a()[F

    .line 52
    .line 53
    .line 54
    move-result-object v10

    .line 55
    if-lez v5, :cond_8

    .line 56
    .line 57
    move v11, v3

    .line 58
    :goto_0
    add-int/lit8 v12, v11, 0x1

    .line 59
    .line 60
    if-lez v8, :cond_6

    .line 61
    .line 62
    move v13, v3

    .line 63
    :goto_1
    add-int/lit8 v14, v13, 0x1

    .line 64
    .line 65
    if-lez v9, :cond_4

    .line 66
    .line 67
    move v15, v3

    .line 68
    :goto_2
    add-int/lit8 v3, v15, 0x1

    .line 69
    .line 70
    mul-int v16, v11, v9

    .line 71
    .line 72
    mul-int v16, v16, v8

    .line 73
    .line 74
    mul-int/2addr v15, v8

    .line 75
    add-int v16, v16, v15

    .line 76
    .line 77
    add-int v16, v16, v13

    .line 78
    .line 79
    mul-int v17, v11, v7

    .line 80
    .line 81
    mul-int v17, v17, v8

    .line 82
    .line 83
    add-int v17, v17, v15

    .line 84
    .line 85
    add-int v17, v17, v13

    .line 86
    .line 87
    const/4 v15, 0x1

    .line 88
    aput v15, v10, v16

    .line 89
    .line 90
    if-lez v1, :cond_2

    .line 91
    .line 92
    const/4 v15, 0x0

    .line 93
    :goto_3
    add-int/lit8 v4, v15, 0x1

    .line 94
    .line 95
    move/from16 v18, v7

    .line 96
    .line 97
    aget v7, v10, v16

    .line 98
    .line 99
    mul-int/2addr v15, v8

    .line 100
    add-int v15, v17, v15

    .line 101
    .line 102
    aget v15, v0, v15

    .line 103
    .line 104
    invoke-static {v7, v15}, Ljava/lang/Math;->max(FF)F

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    aput v7, v10, v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    if-lt v4, v1, :cond_1

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_1
    move v15, v4

    .line 114
    move/from16 v7, v18

    .line 115
    .line 116
    const/4 v4, 0x0

    .line 117
    goto :goto_3

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    goto :goto_8

    .line 120
    :cond_2
    move/from16 v18, v7

    .line 121
    .line 122
    :goto_4
    if-lt v3, v9, :cond_3

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_3
    move v15, v3

    .line 126
    move/from16 v7, v18

    .line 127
    .line 128
    const/4 v3, 0x0

    .line 129
    const/4 v4, 0x0

    .line 130
    goto :goto_2

    .line 131
    :cond_4
    move/from16 v18, v7

    .line 132
    .line 133
    :goto_5
    if-lt v14, v8, :cond_5

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_5
    move v13, v14

    .line 137
    move/from16 v7, v18

    .line 138
    .line 139
    const/4 v3, 0x0

    .line 140
    const/4 v4, 0x0

    .line 141
    goto :goto_1

    .line 142
    :cond_6
    move/from16 v18, v7

    .line 143
    .line 144
    :goto_6
    if-lt v12, v5, :cond_7

    .line 145
    .line 146
    goto :goto_7

    .line 147
    :cond_7
    move v11, v12

    .line 148
    move/from16 v7, v18

    .line 149
    .line 150
    const/4 v3, 0x0

    .line 151
    const/4 v4, 0x0

    .line 152
    goto :goto_0

    .line 153
    :cond_8
    :goto_7
    return-object v6

    .line 154
    :goto_8
    invoke-static {v0, v2}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    const/4 v1, 0x0

    .line 158
    return-object v1
.end method

.method public static final h(LH1/a;LH1/a;)LH1/a;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-class v2, LH1/i;

    .line 6
    .line 7
    invoke-static {v2}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    return-object v4

    .line 15
    :cond_0
    :try_start_0
    const-string v3, "x"

    .line 16
    .line 17
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v3, "w"

    .line 21
    .line 22
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v0, v3}, LH1/a;->b(I)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-virtual {v1, v3}, LH1/a;->b(I)I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    const/4 v7, 0x1

    .line 35
    invoke-virtual {v1, v7}, LH1/a;->b(I)I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    new-instance v8, LH1/a;

    .line 40
    .line 41
    filled-new-array {v5, v7}, [I

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    invoke-direct {v8, v9}, LH1/a;-><init>([I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual/range {p0 .. p0}, LH1/a;->a()[F

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual/range {p1 .. p1}, LH1/a;->a()[F

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v8}, LH1/a;->a()[F

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    if-lez v5, :cond_6

    .line 61
    .line 62
    move v10, v3

    .line 63
    :goto_0
    add-int/lit8 v11, v10, 0x1

    .line 64
    .line 65
    if-lez v7, :cond_4

    .line 66
    .line 67
    move v12, v3

    .line 68
    :goto_1
    add-int/lit8 v13, v12, 0x1

    .line 69
    .line 70
    mul-int v14, v10, v7

    .line 71
    .line 72
    add-int/2addr v14, v12

    .line 73
    const/4 v15, 0x0

    .line 74
    aput v15, v9, v14

    .line 75
    .line 76
    if-lez v6, :cond_2

    .line 77
    .line 78
    move v15, v3

    .line 79
    :goto_2
    add-int/lit8 v3, v15, 0x1

    .line 80
    .line 81
    aget v16, v9, v14

    .line 82
    .line 83
    mul-int v17, v10, v6

    .line 84
    .line 85
    add-int v17, v17, v15

    .line 86
    .line 87
    aget v17, v0, v17

    .line 88
    .line 89
    mul-int/2addr v15, v7

    .line 90
    add-int/2addr v15, v12

    .line 91
    aget v15, v1, v15

    .line 92
    .line 93
    mul-float v17, v17, v15

    .line 94
    .line 95
    add-float v16, v16, v17

    .line 96
    .line 97
    aput v16, v9, v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    .line 99
    if-lt v3, v6, :cond_1

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_1
    move v15, v3

    .line 103
    const/4 v3, 0x0

    .line 104
    goto :goto_2

    .line 105
    :catchall_0
    move-exception v0

    .line 106
    goto :goto_6

    .line 107
    :cond_2
    :goto_3
    if-lt v13, v7, :cond_3

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_3
    move v12, v13

    .line 111
    const/4 v3, 0x0

    .line 112
    goto :goto_1

    .line 113
    :cond_4
    :goto_4
    if-lt v11, v5, :cond_5

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_5
    move v10, v11

    .line 117
    const/4 v3, 0x0

    .line 118
    goto :goto_0

    .line 119
    :cond_6
    :goto_5
    return-object v8

    .line 120
    :goto_6
    invoke-static {v0, v2}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    return-object v4
.end method

.method public static final i(LH1/a;)V
    .locals 6

    .line 1
    const-class v0, LH1/i;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    const-string v1, "x"

    .line 11
    .line 12
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, LH1/a;->a()[F

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    array-length v1, p0

    .line 20
    add-int/lit8 v1, v1, -0x1

    .line 21
    .line 22
    if-ltz v1, :cond_3

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    :goto_0
    add-int/lit8 v3, v2, 0x1

    .line 26
    .line 27
    aget v4, p0, v2

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    cmpg-float v4, v4, v5

    .line 31
    .line 32
    if-gez v4, :cond_1

    .line 33
    .line 34
    aput v5, p0, v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    goto :goto_3

    .line 39
    :cond_1
    :goto_1
    if-le v3, v1, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move v2, v3

    .line 43
    goto :goto_0

    .line 44
    :cond_3
    :goto_2
    return-void

    .line 45
    :goto_3
    invoke-static {p0, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static final j(LH1/a;)V
    .locals 12

    .line 1
    const-class v0, LH1/i;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    const-string v1, "x"

    .line 11
    .line 12
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p0, v1}, LH1/a;->b(I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x1

    .line 21
    invoke-virtual {p0, v3}, LH1/a;->b(I)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-virtual {p0}, LH1/a;->a()[F

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-lez v2, :cond_9

    .line 30
    .line 31
    :goto_0
    add-int/lit8 v4, v1, 0x1

    .line 32
    .line 33
    mul-int/2addr v1, v3

    .line 34
    add-int v5, v1, v3

    .line 35
    .line 36
    const/4 v6, 0x1

    .line 37
    if-ge v1, v5, :cond_3

    .line 38
    .line 39
    move v7, v1

    .line 40
    :goto_1
    add-int/lit8 v8, v7, 0x1

    .line 41
    .line 42
    aget v7, p0, v7

    .line 43
    .line 44
    cmpl-float v9, v7, v6

    .line 45
    .line 46
    if-lez v9, :cond_1

    .line 47
    .line 48
    move v6, v7

    .line 49
    :cond_1
    if-lt v8, v5, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move v7, v8

    .line 53
    goto :goto_1

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    goto :goto_8

    .line 56
    :cond_3
    :goto_2
    const/4 v7, 0x0

    .line 57
    if-ge v1, v5, :cond_5

    .line 58
    .line 59
    move v8, v1

    .line 60
    :goto_3
    add-int/lit8 v9, v8, 0x1

    .line 61
    .line 62
    aget v10, p0, v8

    .line 63
    .line 64
    sub-float/2addr v10, v6

    .line 65
    float-to-double v10, v10

    .line 66
    invoke-static {v10, v11}, Ljava/lang/Math;->exp(D)D

    .line 67
    .line 68
    .line 69
    move-result-wide v10

    .line 70
    double-to-float v10, v10

    .line 71
    aput v10, p0, v8

    .line 72
    .line 73
    add-float/2addr v7, v10

    .line 74
    if-lt v9, v5, :cond_4

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_4
    move v8, v9

    .line 78
    goto :goto_3

    .line 79
    :cond_5
    :goto_4
    if-ge v1, v5, :cond_7

    .line 80
    .line 81
    :goto_5
    add-int/lit8 v6, v1, 0x1

    .line 82
    .line 83
    aget v8, p0, v1

    .line 84
    .line 85
    div-float/2addr v8, v7

    .line 86
    aput v8, p0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    if-lt v6, v5, :cond_6

    .line 89
    .line 90
    goto :goto_6

    .line 91
    :cond_6
    move v1, v6

    .line 92
    goto :goto_5

    .line 93
    :cond_7
    :goto_6
    if-lt v4, v2, :cond_8

    .line 94
    .line 95
    goto :goto_7

    .line 96
    :cond_8
    move v1, v4

    .line 97
    goto :goto_0

    .line 98
    :cond_9
    :goto_7
    return-void

    .line 99
    :goto_8
    invoke-static {p0, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public static final k(LH1/a;)LH1/a;
    .locals 13

    .line 1
    const-class v0, LH1/i;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_0
    :try_start_0
    const-string v1, "x"

    .line 12
    .line 13
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p0, v1}, LH1/a;->b(I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x1

    .line 22
    invoke-virtual {p0, v4}, LH1/a;->b(I)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    new-instance v5, LH1/a;

    .line 27
    .line 28
    filled-new-array {v4, v3}, [I

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-direct {v5, v6}, LH1/a;-><init>([I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, LH1/a;->a()[F

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v5}, LH1/a;->a()[F

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    if-lez v3, :cond_4

    .line 44
    .line 45
    move v7, v1

    .line 46
    :goto_0
    add-int/lit8 v8, v7, 0x1

    .line 47
    .line 48
    if-lez v4, :cond_2

    .line 49
    .line 50
    move v9, v1

    .line 51
    :goto_1
    add-int/lit8 v10, v9, 0x1

    .line 52
    .line 53
    mul-int v11, v9, v3

    .line 54
    .line 55
    add-int/2addr v11, v7

    .line 56
    mul-int v12, v7, v4

    .line 57
    .line 58
    add-int/2addr v12, v9

    .line 59
    aget v9, p0, v12

    .line 60
    .line 61
    aput v9, v6, v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    if-lt v10, v4, :cond_1

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_1
    move v9, v10

    .line 67
    goto :goto_1

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    goto :goto_4

    .line 70
    :cond_2
    :goto_2
    if-lt v8, v3, :cond_3

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    move v7, v8

    .line 74
    goto :goto_0

    .line 75
    :cond_4
    :goto_3
    return-object v5

    .line 76
    :goto_4
    invoke-static {p0, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    return-object v2
.end method

.method public static final l(LH1/a;)LH1/a;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-class v1, LH1/i;

    .line 4
    .line 5
    invoke-static {v1}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    return-object v3

    .line 13
    :cond_0
    :try_start_0
    const-string v2, "x"

    .line 14
    .line 15
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v0, v2}, LH1/a;->b(I)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/4 v5, 0x1

    .line 24
    invoke-virtual {v0, v5}, LH1/a;->b(I)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    const/4 v6, 0x2

    .line 29
    invoke-virtual {v0, v6}, LH1/a;->b(I)I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    new-instance v7, LH1/a;

    .line 34
    .line 35
    filled-new-array {v6, v5, v4}, [I

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    invoke-direct {v7, v8}, LH1/a;-><init>([I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual/range {p0 .. p0}, LH1/a;->a()[F

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v7}, LH1/a;->a()[F

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    if-lez v4, :cond_6

    .line 51
    .line 52
    move v9, v2

    .line 53
    :goto_0
    add-int/lit8 v10, v9, 0x1

    .line 54
    .line 55
    if-lez v5, :cond_4

    .line 56
    .line 57
    move v11, v2

    .line 58
    :goto_1
    add-int/lit8 v12, v11, 0x1

    .line 59
    .line 60
    if-lez v6, :cond_2

    .line 61
    .line 62
    move v13, v2

    .line 63
    :goto_2
    add-int/lit8 v14, v13, 0x1

    .line 64
    .line 65
    mul-int v15, v13, v4

    .line 66
    .line 67
    mul-int/2addr v15, v5

    .line 68
    mul-int v16, v11, v4

    .line 69
    .line 70
    add-int v15, v15, v16

    .line 71
    .line 72
    add-int/2addr v15, v9

    .line 73
    mul-int v16, v9, v5

    .line 74
    .line 75
    mul-int v16, v16, v6

    .line 76
    .line 77
    mul-int v17, v11, v6

    .line 78
    .line 79
    add-int v16, v16, v17

    .line 80
    .line 81
    add-int v16, v16, v13

    .line 82
    .line 83
    aget v13, v0, v16

    .line 84
    .line 85
    aput v13, v8, v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    if-lt v14, v6, :cond_1

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_1
    move v13, v14

    .line 91
    goto :goto_2

    .line 92
    :catchall_0
    move-exception v0

    .line 93
    goto :goto_6

    .line 94
    :cond_2
    :goto_3
    if-lt v12, v5, :cond_3

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_3
    move v11, v12

    .line 98
    goto :goto_1

    .line 99
    :cond_4
    :goto_4
    if-lt v10, v4, :cond_5

    .line 100
    .line 101
    goto :goto_5

    .line 102
    :cond_5
    move v9, v10

    .line 103
    goto :goto_0

    .line 104
    :cond_6
    :goto_5
    return-object v7

    .line 105
    :goto_6
    invoke-static {v0, v1}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return-object v3
.end method
