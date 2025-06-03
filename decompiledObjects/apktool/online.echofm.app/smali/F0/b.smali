.class public abstract LF0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF0/b$b;
    }
.end annotation


# static fields
.field public static final a:[I

.field public static final b:[I

.field public static final c:[I

.field public static final d:[I

.field public static final e:[I

.field public static final f:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x6

    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v3, 0x2

    .line 5
    filled-new-array {v2, v3, v0, v1}, [I

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LF0/b;->a:[I

    .line 10
    .line 11
    const v0, 0xac44

    .line 12
    .line 13
    .line 14
    const/16 v1, 0x7d00

    .line 15
    .line 16
    const v2, 0xbb80

    .line 17
    .line 18
    .line 19
    filled-new-array {v2, v0, v1}, [I

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, LF0/b;->b:[I

    .line 24
    .line 25
    const/16 v0, 0x5622

    .line 26
    .line 27
    const/16 v1, 0x3e80

    .line 28
    .line 29
    const/16 v2, 0x5dc0

    .line 30
    .line 31
    filled-new-array {v2, v0, v1}, [I

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, LF0/b;->c:[I

    .line 36
    .line 37
    const/16 v0, 0x8

    .line 38
    .line 39
    new-array v0, v0, [I

    .line 40
    .line 41
    fill-array-data v0, :array_0

    .line 42
    .line 43
    .line 44
    sput-object v0, LF0/b;->d:[I

    .line 45
    .line 46
    const/16 v0, 0x13

    .line 47
    .line 48
    new-array v1, v0, [I

    .line 49
    .line 50
    fill-array-data v1, :array_1

    .line 51
    .line 52
    .line 53
    sput-object v1, LF0/b;->e:[I

    .line 54
    .line 55
    new-array v0, v0, [I

    .line 56
    .line 57
    fill-array-data v0, :array_2

    .line 58
    .line 59
    .line 60
    sput-object v0, LF0/b;->f:[I

    .line 61
    .line 62
    return-void

    .line 63
    :array_0
    .array-data 4
        0x2
        0x1
        0x2
        0x3
        0x3
        0x4
        0x4
        0x5
    .end array-data

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
    :array_1
    .array-data 4
        0x20
        0x28
        0x30
        0x38
        0x40
        0x50
        0x60
        0x70
        0x80
        0xa0
        0xc0
        0xe0
        0x100
        0x140
        0x180
        0x1c0
        0x200
        0x240
        0x280
    .end array-data

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
    :array_2
    .array-data 4
        0x45
        0x57
        0x68
        0x79
        0x8b
        0xae
        0xd0
        0xf3
        0x116
        0x15c
        0x1a1
        0x1e7
        0x22d
        0x2b8
        0x343
        0x3cf
        0x45a
        0x4e5
        0x571
    .end array-data
.end method

.method public static a(III)I
    .locals 0

    .line 1
    mul-int/2addr p0, p1

    .line 2
    mul-int/lit8 p2, p2, 0x20

    .line 3
    .line 4
    div-int/2addr p0, p2

    .line 5
    return p0
.end method

.method public static b(Ljava/nio/ByteBuffer;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, -0xa

    .line 10
    .line 11
    move v2, v0

    .line 12
    :goto_0
    if-gt v2, v1, :cond_1

    .line 13
    .line 14
    add-int/lit8 v3, v2, 0x4

    .line 15
    .line 16
    invoke-static {p0, v3}, Lg0/M;->O(Ljava/nio/ByteBuffer;I)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    and-int/lit8 v3, v3, -0x2

    .line 21
    .line 22
    const v4, -0x78d9046

    .line 23
    .line 24
    .line 25
    if-ne v3, v4, :cond_0

    .line 26
    .line 27
    sub-int/2addr v2, v0

    .line 28
    return v2

    .line 29
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 p0, -0x1

    .line 33
    return p0
.end method

.method public static c(II)I
    .locals 4

    .line 1
    div-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    if-ltz p0, :cond_3

    .line 4
    .line 5
    sget-object v1, LF0/b;->b:[I

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    if-ge p0, v2, :cond_3

    .line 9
    .line 10
    if-ltz p1, :cond_3

    .line 11
    .line 12
    sget-object v2, LF0/b;->f:[I

    .line 13
    .line 14
    array-length v3, v2

    .line 15
    if-lt v0, v3, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    aget p0, v1, p0

    .line 19
    .line 20
    const v1, 0xac44

    .line 21
    .line 22
    .line 23
    if-ne p0, v1, :cond_1

    .line 24
    .line 25
    aget p0, v2, v0

    .line 26
    .line 27
    rem-int/lit8 p1, p1, 0x2

    .line 28
    .line 29
    add-int/2addr p0, p1

    .line 30
    mul-int/lit8 p0, p0, 0x2

    .line 31
    .line 32
    return p0

    .line 33
    :cond_1
    sget-object p1, LF0/b;->e:[I

    .line 34
    .line 35
    aget p1, p1, v0

    .line 36
    .line 37
    const/16 v0, 0x7d00

    .line 38
    .line 39
    if-ne p0, v0, :cond_2

    .line 40
    .line 41
    mul-int/lit8 p1, p1, 0x6

    .line 42
    .line 43
    return p1

    .line 44
    :cond_2
    mul-int/lit8 p1, p1, 0x4

    .line 45
    .line 46
    return p1

    .line 47
    :cond_3
    :goto_0
    const/4 p0, -0x1

    .line 48
    return p0
.end method

.method public static d(Lg0/z;Ljava/lang/String;Ljava/lang/String;Ld0/m;)Ld0/q;
    .locals 5

    .line 1
    new-instance v0, Lg0/y;

    .line 2
    .line 3
    invoke-direct {v0}, Lg0/y;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lg0/y;->m(Lg0/z;)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-virtual {v0, v1}, Lg0/y;->h(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    sget-object v2, LF0/b;->b:[I

    .line 15
    .line 16
    aget v1, v2, v1

    .line 17
    .line 18
    const/16 v2, 0x8

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Lg0/y;->r(I)V

    .line 21
    .line 22
    .line 23
    sget-object v2, LF0/b;->d:[I

    .line 24
    .line 25
    const/4 v3, 0x3

    .line 26
    invoke-virtual {v0, v3}, Lg0/y;->h(I)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    aget v2, v2, v3

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-virtual {v0, v3}, Lg0/y;->h(I)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    :cond_0
    const/4 v3, 0x5

    .line 42
    invoke-virtual {v0, v3}, Lg0/y;->h(I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    sget-object v4, LF0/b;->e:[I

    .line 47
    .line 48
    aget v3, v4, v3

    .line 49
    .line 50
    mul-int/lit16 v3, v3, 0x3e8

    .line 51
    .line 52
    invoke-virtual {v0}, Lg0/y;->c()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lg0/y;->d()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 60
    .line 61
    .line 62
    new-instance p0, Ld0/q$b;

    .line 63
    .line 64
    invoke-direct {p0}, Ld0/q$b;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, p1}, Ld0/q$b;->a0(Ljava/lang/String;)Ld0/q$b;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    const-string p1, "audio/ac3"

    .line 72
    .line 73
    invoke-virtual {p0, p1}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p0, v2}, Ld0/q$b;->N(I)Ld0/q$b;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0, v1}, Ld0/q$b;->p0(I)Ld0/q$b;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0, p3}, Ld0/q$b;->U(Ld0/m;)Ld0/q$b;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p0, p2}, Ld0/q$b;->e0(Ljava/lang/String;)Ld0/q$b;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p0, v3}, Ld0/q$b;->M(I)Ld0/q$b;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0, v3}, Ld0/q$b;->j0(I)Ld0/q$b;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p0}, Ld0/q$b;->K()Ld0/q;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0
.end method

.method public static e(Ljava/nio/ByteBuffer;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, 0x5

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    and-int/lit16 v0, v0, 0xf8

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    shr-int/2addr v0, v1

    .line 15
    const/16 v2, 0xa

    .line 16
    .line 17
    if-le v0, v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    add-int/lit8 v0, v0, 0x4

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    and-int/lit16 v0, v0, 0xc0

    .line 30
    .line 31
    shr-int/lit8 v0, v0, 0x6

    .line 32
    .line 33
    if-ne v0, v1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    add-int/lit8 v0, v0, 0x4

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    and-int/lit8 p0, p0, 0x30

    .line 47
    .line 48
    shr-int/lit8 v1, p0, 0x4

    .line 49
    .line 50
    :goto_0
    sget-object p0, LF0/b;->a:[I

    .line 51
    .line 52
    aget p0, p0, v1

    .line 53
    .line 54
    mul-int/lit16 p0, p0, 0x100

    .line 55
    .line 56
    return p0

    .line 57
    :cond_1
    const/16 p0, 0x600

    .line 58
    .line 59
    return p0
.end method

.method public static f(Lg0/y;)LF0/b$b;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Lg0/y;->e()I

    move-result v1

    const/16 v2, 0x28

    invoke-virtual {v0, v2}, Lg0/y;->r(I)V

    const/4 v2, 0x5

    invoke-virtual {v0, v2}, Lg0/y;->h(I)I

    move-result v3

    const/4 v5, 0x1

    const/16 v6, 0xa

    if-le v3, v6, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lg0/y;->p(I)V

    const/4 v1, -0x1

    const/16 v7, 0x8

    const/4 v9, 0x3

    const/4 v10, 0x2

    if-eqz v3, :cond_2a

    const/16 v3, 0x10

    invoke-virtual {v0, v3}, Lg0/y;->r(I)V

    invoke-virtual {v0, v10}, Lg0/y;->h(I)I

    move-result v11

    if-eqz v11, :cond_3

    if-eq v11, v5, :cond_2

    if-eq v11, v10, :cond_1

    goto :goto_1

    :cond_1
    move v1, v10

    goto :goto_1

    :cond_2
    move v1, v5

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v9}, Lg0/y;->r(I)V

    const/16 v11, 0xb

    invoke-virtual {v0, v11}, Lg0/y;->h(I)I

    move-result v11

    add-int/2addr v11, v5

    mul-int/2addr v11, v10

    invoke-virtual {v0, v10}, Lg0/y;->h(I)I

    move-result v12

    if-ne v12, v9, :cond_4

    sget-object v13, LF0/b;->c:[I

    invoke-virtual {v0, v10}, Lg0/y;->h(I)I

    move-result v14

    aget v13, v13, v14

    move v14, v9

    const/4 v15, 0x6

    goto :goto_2

    :cond_4
    invoke-virtual {v0, v10}, Lg0/y;->h(I)I

    move-result v13

    sget-object v14, LF0/b;->a:[I

    aget v14, v14, v13

    sget-object v15, LF0/b;->b:[I

    aget v15, v15, v12

    move/from16 v29, v14

    move v14, v13

    move v13, v15

    move/from16 v15, v29

    :goto_2
    mul-int/lit16 v4, v15, 0x100

    invoke-static {v11, v13, v15}, LF0/b;->a(III)I

    move-result v16

    invoke-virtual {v0, v9}, Lg0/y;->h(I)I

    move-result v8

    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v18

    sget-object v19, LF0/b;->d:[I

    aget v19, v19, v8

    add-int v19, v19, v18

    invoke-virtual {v0, v6}, Lg0/y;->r(I)V

    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v0, v7}, Lg0/y;->r(I)V

    :cond_5
    if-nez v8, :cond_6

    invoke-virtual {v0, v2}, Lg0/y;->r(I)V

    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-virtual {v0, v7}, Lg0/y;->r(I)V

    :cond_6
    if-ne v1, v5, :cond_7

    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-virtual {v0, v3}, Lg0/y;->r(I)V

    :cond_7
    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v3

    const/4 v6, 0x4

    if-eqz v3, :cond_20

    if-le v8, v10, :cond_8

    invoke-virtual {v0, v10}, Lg0/y;->r(I)V

    :cond_8
    and-int/lit8 v3, v8, 0x1

    if-eqz v3, :cond_9

    if-le v8, v10, :cond_9

    const/4 v3, 0x6

    invoke-virtual {v0, v3}, Lg0/y;->r(I)V

    goto :goto_3

    :cond_9
    const/4 v3, 0x6

    :goto_3
    and-int/lit8 v17, v8, 0x4

    if-eqz v17, :cond_a

    invoke-virtual {v0, v3}, Lg0/y;->r(I)V

    :cond_a
    if-eqz v18, :cond_b

    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-virtual {v0, v2}, Lg0/y;->r(I)V

    :cond_b
    if-nez v1, :cond_20

    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v3

    if-eqz v3, :cond_c

    const/4 v3, 0x6

    invoke-virtual {v0, v3}, Lg0/y;->r(I)V

    goto :goto_4

    :cond_c
    const/4 v3, 0x6

    :goto_4
    if-nez v8, :cond_d

    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v17

    if-eqz v17, :cond_d

    invoke-virtual {v0, v3}, Lg0/y;->r(I)V

    :cond_d
    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v17

    if-eqz v17, :cond_e

    invoke-virtual {v0, v3}, Lg0/y;->r(I)V

    :cond_e
    invoke-virtual {v0, v10}, Lg0/y;->h(I)I

    move-result v3

    if-ne v3, v5, :cond_f

    invoke-virtual {v0, v2}, Lg0/y;->r(I)V

    goto/16 :goto_5

    :cond_f
    if-ne v3, v10, :cond_10

    const/16 v3, 0xc

    invoke-virtual {v0, v3}, Lg0/y;->r(I)V

    goto/16 :goto_5

    :cond_10
    if-ne v3, v9, :cond_1b

    invoke-virtual {v0, v2}, Lg0/y;->h(I)I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v18

    if-eqz v18, :cond_19

    invoke-virtual {v0, v2}, Lg0/y;->r(I)V

    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v18

    if-eqz v18, :cond_11

    invoke-virtual {v0, v6}, Lg0/y;->r(I)V

    :cond_11
    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v18

    if-eqz v18, :cond_12

    invoke-virtual {v0, v6}, Lg0/y;->r(I)V

    :cond_12
    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v18

    if-eqz v18, :cond_13

    invoke-virtual {v0, v6}, Lg0/y;->r(I)V

    :cond_13
    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v18

    if-eqz v18, :cond_14

    invoke-virtual {v0, v6}, Lg0/y;->r(I)V

    :cond_14
    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v18

    if-eqz v18, :cond_15

    invoke-virtual {v0, v6}, Lg0/y;->r(I)V

    :cond_15
    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v18

    if-eqz v18, :cond_16

    invoke-virtual {v0, v6}, Lg0/y;->r(I)V

    :cond_16
    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v18

    if-eqz v18, :cond_17

    invoke-virtual {v0, v6}, Lg0/y;->r(I)V

    :cond_17
    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v18

    if-eqz v18, :cond_19

    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v18

    if-eqz v18, :cond_18

    invoke-virtual {v0, v6}, Lg0/y;->r(I)V

    :cond_18
    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v18

    if-eqz v18, :cond_19

    invoke-virtual {v0, v6}, Lg0/y;->r(I)V

    :cond_19
    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v18

    if-eqz v18, :cond_1a

    invoke-virtual {v0, v2}, Lg0/y;->r(I)V

    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v18

    if-eqz v18, :cond_1a

    const/4 v5, 0x7

    invoke-virtual {v0, v5}, Lg0/y;->r(I)V

    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v5

    if-eqz v5, :cond_1a

    invoke-virtual {v0, v7}, Lg0/y;->r(I)V

    :cond_1a
    add-int/2addr v3, v10

    mul-int/2addr v3, v7

    invoke-virtual {v0, v3}, Lg0/y;->r(I)V

    invoke-virtual/range {p0 .. p0}, Lg0/y;->c()V

    :cond_1b
    :goto_5
    if-ge v8, v10, :cond_1d

    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v3

    const/16 v5, 0xe

    if-eqz v3, :cond_1c

    invoke-virtual {v0, v5}, Lg0/y;->r(I)V

    :cond_1c
    if-nez v8, :cond_1d

    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v3

    if-eqz v3, :cond_1d

    invoke-virtual {v0, v5}, Lg0/y;->r(I)V

    :cond_1d
    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v3

    if-eqz v3, :cond_20

    if-nez v14, :cond_1e

    invoke-virtual {v0, v2}, Lg0/y;->r(I)V

    goto :goto_7

    :cond_1e
    const/4 v3, 0x0

    :goto_6
    if-ge v3, v15, :cond_20

    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v5

    if-eqz v5, :cond_1f

    invoke-virtual {v0, v2}, Lg0/y;->r(I)V

    :cond_1f
    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_20
    :goto_7
    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v3

    if-eqz v3, :cond_25

    invoke-virtual {v0, v2}, Lg0/y;->r(I)V

    if-ne v8, v10, :cond_21

    invoke-virtual {v0, v6}, Lg0/y;->r(I)V

    :cond_21
    const/4 v2, 0x6

    if-lt v8, v2, :cond_22

    invoke-virtual {v0, v10}, Lg0/y;->r(I)V

    :cond_22
    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v2

    if-eqz v2, :cond_23

    invoke-virtual {v0, v7}, Lg0/y;->r(I)V

    :cond_23
    if-nez v8, :cond_24

    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-virtual {v0, v7}, Lg0/y;->r(I)V

    :cond_24
    if-ge v12, v9, :cond_25

    invoke-virtual/range {p0 .. p0}, Lg0/y;->q()V

    :cond_25
    if-nez v1, :cond_26

    if-eq v14, v9, :cond_26

    invoke-virtual/range {p0 .. p0}, Lg0/y;->q()V

    :cond_26
    if-ne v1, v10, :cond_28

    if-eq v14, v9, :cond_27

    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v2

    if-eqz v2, :cond_28

    :cond_27
    const/4 v2, 0x6

    goto :goto_8

    :cond_28
    const/4 v2, 0x6

    goto :goto_9

    :goto_8
    invoke-virtual {v0, v2}, Lg0/y;->r(I)V

    :goto_9
    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v3

    if-eqz v3, :cond_29

    invoke-virtual {v0, v2}, Lg0/y;->h(I)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_29

    invoke-virtual {v0, v7}, Lg0/y;->h(I)I

    move-result v0

    if-ne v0, v3, :cond_29

    const-string v0, "audio/eac3-joc"

    goto :goto_a

    :cond_29
    const-string v0, "audio/eac3"

    :goto_a
    move-object/from16 v21, v0

    move/from16 v22, v1

    move/from16 v26, v4

    move/from16 v25, v11

    move/from16 v24, v13

    move/from16 v27, v16

    :goto_b
    move/from16 v23, v19

    goto :goto_f

    :cond_2a
    const/16 v2, 0x20

    invoke-virtual {v0, v2}, Lg0/y;->r(I)V

    invoke-virtual {v0, v10}, Lg0/y;->h(I)I

    move-result v2

    if-ne v2, v9, :cond_2b

    const/4 v3, 0x0

    :goto_c
    const/4 v4, 0x6

    goto :goto_d

    :cond_2b
    const-string v3, "audio/ac3"

    goto :goto_c

    :goto_d
    invoke-virtual {v0, v4}, Lg0/y;->h(I)I

    move-result v4

    sget-object v5, LF0/b;->e:[I

    div-int/lit8 v6, v4, 0x2

    aget v5, v5, v6

    mul-int/lit16 v5, v5, 0x3e8

    invoke-static {v2, v4}, LF0/b;->c(II)I

    move-result v11

    invoke-virtual {v0, v7}, Lg0/y;->r(I)V

    invoke-virtual {v0, v9}, Lg0/y;->h(I)I

    move-result v4

    and-int/lit8 v6, v4, 0x1

    if-eqz v6, :cond_2c

    const/4 v6, 0x1

    if-eq v4, v6, :cond_2c

    invoke-virtual {v0, v10}, Lg0/y;->r(I)V

    :cond_2c
    and-int/lit8 v6, v4, 0x4

    if-eqz v6, :cond_2d

    invoke-virtual {v0, v10}, Lg0/y;->r(I)V

    :cond_2d
    if-ne v4, v10, :cond_2e

    invoke-virtual {v0, v10}, Lg0/y;->r(I)V

    :cond_2e
    sget-object v6, LF0/b;->b:[I

    array-length v7, v6

    if-ge v2, v7, :cond_2f

    aget v2, v6, v2

    move v13, v2

    goto :goto_e

    :cond_2f
    move v13, v1

    :goto_e
    invoke-virtual/range {p0 .. p0}, Lg0/y;->g()Z

    move-result v0

    sget-object v2, LF0/b;->d:[I

    aget v2, v2, v4

    add-int v19, v2, v0

    const/16 v4, 0x600

    move/from16 v22, v1

    move-object/from16 v21, v3

    move/from16 v26, v4

    move/from16 v27, v5

    move/from16 v25, v11

    move/from16 v24, v13

    goto :goto_b

    :goto_f
    new-instance v0, LF0/b$b;

    const/16 v28, 0x0

    move-object/from16 v20, v0

    invoke-direct/range {v20 .. v28}, LF0/b$b;-><init>(Ljava/lang/String;IIIIIILF0/b$a;)V

    return-object v0
.end method

.method public static g([B)I
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x6

    .line 3
    if-ge v0, v1, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 v0, 0x5

    .line 8
    aget-byte v0, p0, v0

    .line 9
    .line 10
    and-int/lit16 v0, v0, 0xf8

    .line 11
    .line 12
    const/4 v2, 0x3

    .line 13
    shr-int/2addr v0, v2

    .line 14
    const/16 v3, 0xa

    .line 15
    .line 16
    if-le v0, v3, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    aget-byte v1, p0, v0

    .line 20
    .line 21
    and-int/lit8 v1, v1, 0x7

    .line 22
    .line 23
    shl-int/lit8 v1, v1, 0x8

    .line 24
    .line 25
    aget-byte p0, p0, v2

    .line 26
    .line 27
    and-int/lit16 p0, p0, 0xff

    .line 28
    .line 29
    or-int/2addr p0, v1

    .line 30
    add-int/lit8 p0, p0, 0x1

    .line 31
    .line 32
    mul-int/2addr p0, v0

    .line 33
    return p0

    .line 34
    :cond_1
    const/4 v0, 0x4

    .line 35
    aget-byte p0, p0, v0

    .line 36
    .line 37
    and-int/lit16 v0, p0, 0xc0

    .line 38
    .line 39
    shr-int/2addr v0, v1

    .line 40
    and-int/lit8 p0, p0, 0x3f

    .line 41
    .line 42
    invoke-static {v0, p0}, LF0/b;->c(II)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0
.end method

.method public static h(Lg0/z;Ljava/lang/String;Ljava/lang/String;Ld0/m;)Ld0/q;
    .locals 7

    .line 1
    new-instance v0, Lg0/y;

    .line 2
    .line 3
    invoke-direct {v0}, Lg0/y;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lg0/y;->m(Lg0/z;)V

    .line 7
    .line 8
    .line 9
    const/16 v1, 0xd

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lg0/y;->h(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    mul-int/lit16 v1, v1, 0x3e8

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    invoke-virtual {v0, v2}, Lg0/y;->r(I)V

    .line 19
    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    invoke-virtual {v0, v3}, Lg0/y;->h(I)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    sget-object v4, LF0/b;->b:[I

    .line 27
    .line 28
    aget v3, v4, v3

    .line 29
    .line 30
    const/16 v4, 0xa

    .line 31
    .line 32
    invoke-virtual {v0, v4}, Lg0/y;->r(I)V

    .line 33
    .line 34
    .line 35
    sget-object v4, LF0/b;->d:[I

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Lg0/y;->h(I)I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    aget v4, v4, v5

    .line 42
    .line 43
    const/4 v5, 0x1

    .line 44
    invoke-virtual {v0, v5}, Lg0/y;->h(I)I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_0

    .line 49
    .line 50
    add-int/lit8 v4, v4, 0x1

    .line 51
    .line 52
    :cond_0
    invoke-virtual {v0, v2}, Lg0/y;->r(I)V

    .line 53
    .line 54
    .line 55
    const/4 v2, 0x4

    .line 56
    invoke-virtual {v0, v2}, Lg0/y;->h(I)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-virtual {v0, v5}, Lg0/y;->r(I)V

    .line 61
    .line 62
    .line 63
    if-lez v2, :cond_2

    .line 64
    .line 65
    const/4 v2, 0x6

    .line 66
    invoke-virtual {v0, v2}, Lg0/y;->r(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v5}, Lg0/y;->h(I)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_1

    .line 74
    .line 75
    add-int/lit8 v4, v4, 0x2

    .line 76
    .line 77
    :cond_1
    invoke-virtual {v0, v5}, Lg0/y;->r(I)V

    .line 78
    .line 79
    .line 80
    :cond_2
    invoke-virtual {v0}, Lg0/y;->b()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    const/4 v6, 0x7

    .line 85
    if-le v2, v6, :cond_3

    .line 86
    .line 87
    invoke-virtual {v0, v6}, Lg0/y;->r(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v5}, Lg0/y;->h(I)I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_3

    .line 95
    .line 96
    const-string v2, "audio/eac3-joc"

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_3
    const-string v2, "audio/eac3"

    .line 100
    .line 101
    :goto_0
    invoke-virtual {v0}, Lg0/y;->c()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Lg0/y;->d()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 109
    .line 110
    .line 111
    new-instance p0, Ld0/q$b;

    .line 112
    .line 113
    invoke-direct {p0}, Ld0/q$b;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, p1}, Ld0/q$b;->a0(Ljava/lang/String;)Ld0/q$b;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p0, v2}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-virtual {p0, v4}, Ld0/q$b;->N(I)Ld0/q$b;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-virtual {p0, v3}, Ld0/q$b;->p0(I)Ld0/q$b;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {p0, p3}, Ld0/q$b;->U(Ld0/m;)Ld0/q$b;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {p0, p2}, Ld0/q$b;->e0(Ljava/lang/String;)Ld0/q$b;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-virtual {p0, v1}, Ld0/q$b;->j0(I)Ld0/q$b;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-virtual {p0}, Ld0/q$b;->K()Ld0/q;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0
.end method

.method public static i(Ljava/nio/ByteBuffer;I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/2addr v0, p1

    .line 6
    add-int/lit8 v0, v0, 0x7

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    and-int/lit16 v0, v0, 0xff

    .line 13
    .line 14
    const/16 v1, 0xbb

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    add-int/2addr v1, p1

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const/16 p1, 0x9

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/16 p1, 0x8

    .line 32
    .line 33
    :goto_1
    add-int/2addr v1, p1

    .line 34
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    shr-int/lit8 p0, p0, 0x4

    .line 39
    .line 40
    and-int/lit8 p0, p0, 0x7

    .line 41
    .line 42
    const/16 p1, 0x28

    .line 43
    .line 44
    shl-int p0, p1, p0

    .line 45
    .line 46
    return p0
.end method

.method public static j([B)I
    .locals 6

    .line 1
    const/4 v0, 0x4

    .line 2
    aget-byte v1, p0, v0

    .line 3
    .line 4
    const/4 v2, -0x8

    .line 5
    const/4 v3, 0x0

    .line 6
    if-ne v1, v2, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x5

    .line 9
    aget-byte v1, p0, v1

    .line 10
    .line 11
    const/16 v2, 0x72

    .line 12
    .line 13
    if-ne v1, v2, :cond_3

    .line 14
    .line 15
    const/4 v1, 0x6

    .line 16
    aget-byte v1, p0, v1

    .line 17
    .line 18
    const/16 v2, 0x6f

    .line 19
    .line 20
    if-ne v1, v2, :cond_3

    .line 21
    .line 22
    const/4 v1, 0x7

    .line 23
    aget-byte v2, p0, v1

    .line 24
    .line 25
    and-int/lit16 v4, v2, 0xfe

    .line 26
    .line 27
    const/16 v5, 0xba

    .line 28
    .line 29
    if-eq v4, v5, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    and-int/lit16 v2, v2, 0xff

    .line 33
    .line 34
    const/16 v4, 0xbb

    .line 35
    .line 36
    if-ne v2, v4, :cond_1

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    :cond_1
    if-eqz v3, :cond_2

    .line 40
    .line 41
    const/16 v2, 0x9

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/16 v2, 0x8

    .line 45
    .line 46
    :goto_0
    aget-byte p0, p0, v2

    .line 47
    .line 48
    shr-int/2addr p0, v0

    .line 49
    and-int/2addr p0, v1

    .line 50
    const/16 v0, 0x28

    .line 51
    .line 52
    shl-int p0, v0, p0

    .line 53
    .line 54
    return p0

    .line 55
    :cond_3
    :goto_1
    return v3
.end method
