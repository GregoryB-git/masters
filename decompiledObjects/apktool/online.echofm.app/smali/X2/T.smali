.class public final LX2/T;
.super LX2/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX2/T$b;,
        LX2/T$c;,
        LX2/T$a;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J

.field public static final v:LX2/w;


# instance fields
.field public final transient s:Ljava/lang/Object;

.field public final transient t:[Ljava/lang/Object;

.field public final transient u:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LX2/T;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v3, v2, v1}, LX2/T;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    sput-object v0, LX2/T;->v:LX2/w;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;[Ljava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, LX2/w;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LX2/T;->s:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, LX2/T;->t:[Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, LX2/T;->u:I

    .line 9
    .line 10
    return-void
.end method

.method public static l(I[Ljava/lang/Object;LX2/w$a;)LX2/T;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, LX2/T;->v:LX2/w;

    .line 4
    .line 5
    check-cast p0, LX2/T;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne p0, v1, :cond_1

    .line 11
    .line 12
    aget-object p0, p1, v0

    .line 13
    .line 14
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    aget-object p2, p1, v1

    .line 18
    .line 19
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-static {p0, p2}, LX2/i;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance p0, LX2/T;

    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    invoke-direct {p0, p2, p1, v1}, LX2/T;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_1
    array-length v2, p1

    .line 33
    shr-int/2addr v2, v1

    .line 34
    invoke-static {p0, v2}, LW2/m;->l(II)I

    .line 35
    .line 36
    .line 37
    invoke-static {p0}, LX2/y;->M(I)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-static {p1, p0, v2, v0}, LX2/T;->m([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    instance-of v3, v2, [Ljava/lang/Object;

    .line 46
    .line 47
    if-eqz v3, :cond_3

    .line 48
    .line 49
    check-cast v2, [Ljava/lang/Object;

    .line 50
    .line 51
    const/4 p0, 0x2

    .line 52
    aget-object p0, v2, p0

    .line 53
    .line 54
    check-cast p0, LX2/w$a$a;

    .line 55
    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    iput-object p0, p2, LX2/w$a;->e:LX2/w$a$a;

    .line 59
    .line 60
    aget-object p0, v2, v0

    .line 61
    .line 62
    aget-object p2, v2, v1

    .line 63
    .line 64
    check-cast p2, Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    mul-int/lit8 v0, p2, 0x2

    .line 71
    .line 72
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    move-object v2, p0

    .line 77
    move p0, p2

    .line 78
    goto :goto_0

    .line 79
    :cond_2
    invoke-virtual {p0}, LX2/w$a$a;->a()Ljava/lang/IllegalArgumentException;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    throw p0

    .line 84
    :cond_3
    :goto_0
    new-instance p2, LX2/T;

    .line 85
    .line 86
    invoke-direct {p2, v2, p1, p0}, LX2/T;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    .line 87
    .line 88
    .line 89
    return-object p2
.end method

.method public static m([Ljava/lang/Object;III)Ljava/lang/Object;
    .locals 16

    .line 1
    move/from16 v0, p1

    move/from16 v1, p2

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v0, v6, :cond_0

    aget-object v0, p0, p3

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    xor-int/lit8 v1, p3, 0x1

    aget-object v1, p0, v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0, v1}, LX2/i;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v5

    :cond_0
    add-int/lit8 v7, v1, -0x1

    const/16 v8, 0x80

    const/4 v9, -0x1

    if-gt v1, v8, :cond_6

    new-array v1, v1, [B

    invoke-static {v1, v9}, Ljava/util/Arrays;->fill([BB)V

    move v8, v3

    move v9, v8

    :goto_0
    if-ge v8, v0, :cond_4

    mul-int/lit8 v10, v8, 0x2

    add-int v10, v10, p3

    mul-int/lit8 v11, v9, 0x2

    add-int v11, v11, p3

    aget-object v12, p0, v10

    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    xor-int/2addr v10, v6

    aget-object v10, p0, v10

    invoke-static {v10}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v12, v10}, LX2/i;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12}, Ljava/lang/Object;->hashCode()I

    move-result v13

    invoke-static {v13}, LX2/s;->b(I)I

    move-result v13

    :goto_1
    and-int/2addr v13, v7

    aget-byte v14, v1, v13

    const/16 v15, 0xff

    and-int/2addr v14, v15

    if-ne v14, v15, :cond_2

    int-to-byte v14, v11

    aput-byte v14, v1, v13

    if-ge v9, v8, :cond_1

    aput-object v12, p0, v11

    xor-int/2addr v11, v6

    aput-object v10, p0, v11

    :cond_1
    add-int/2addr v9, v6

    goto :goto_2

    :cond_2
    aget-object v15, p0, v14

    invoke-virtual {v12, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_3

    new-instance v5, LX2/w$a$a;

    xor-int/lit8 v11, v14, 0x1

    aget-object v13, p0, v11

    invoke-static {v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v5, v12, v10, v13}, LX2/w$a$a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v10, p0, v11

    :goto_2
    add-int/2addr v8, v6

    goto :goto_0

    :cond_3
    add-int/2addr v13, v6

    goto :goto_1

    :cond_4
    if-ne v9, v0, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v1, v2, v3

    aput-object v0, v2, v6

    aput-object v5, v2, v4

    move-object v1, v2

    :goto_3
    return-object v1

    :cond_6
    const v8, 0x8000

    if-gt v1, v8, :cond_c

    new-array v1, v1, [S

    invoke-static {v1, v9}, Ljava/util/Arrays;->fill([SS)V

    move v8, v3

    move v9, v8

    :goto_4
    if-ge v8, v0, :cond_a

    mul-int/lit8 v10, v8, 0x2

    add-int v10, v10, p3

    mul-int/lit8 v11, v9, 0x2

    add-int v11, v11, p3

    aget-object v12, p0, v10

    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    xor-int/2addr v10, v6

    aget-object v10, p0, v10

    invoke-static {v10}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v12, v10}, LX2/i;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12}, Ljava/lang/Object;->hashCode()I

    move-result v13

    invoke-static {v13}, LX2/s;->b(I)I

    move-result v13

    :goto_5
    and-int/2addr v13, v7

    aget-short v14, v1, v13

    const v15, 0xffff

    and-int/2addr v14, v15

    if-ne v14, v15, :cond_8

    int-to-short v14, v11

    aput-short v14, v1, v13

    if-ge v9, v8, :cond_7

    aput-object v12, p0, v11

    xor-int/2addr v11, v6

    aput-object v10, p0, v11

    :cond_7
    add-int/2addr v9, v6

    goto :goto_6

    :cond_8
    aget-object v15, p0, v14

    invoke-virtual {v12, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_9

    new-instance v5, LX2/w$a$a;

    xor-int/lit8 v11, v14, 0x1

    aget-object v13, p0, v11

    invoke-static {v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v5, v12, v10, v13}, LX2/w$a$a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v10, p0, v11

    :goto_6
    add-int/2addr v8, v6

    goto :goto_4

    :cond_9
    add-int/2addr v13, v6

    goto :goto_5

    :cond_a
    if-ne v9, v0, :cond_b

    goto :goto_7

    :cond_b
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v1, v2, v3

    aput-object v0, v2, v6

    aput-object v5, v2, v4

    move-object v1, v2

    :goto_7
    return-object v1

    :cond_c
    new-array v1, v1, [I

    invoke-static {v1, v9}, Ljava/util/Arrays;->fill([II)V

    move v8, v3

    move v10, v8

    :goto_8
    if-ge v8, v0, :cond_10

    mul-int/lit8 v11, v8, 0x2

    add-int v11, v11, p3

    mul-int/lit8 v12, v10, 0x2

    add-int v12, v12, p3

    aget-object v13, p0, v11

    invoke-static {v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    xor-int/2addr v11, v6

    aget-object v11, p0, v11

    invoke-static {v11}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v13, v11}, LX2/i;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13}, Ljava/lang/Object;->hashCode()I

    move-result v14

    invoke-static {v14}, LX2/s;->b(I)I

    move-result v14

    :goto_9
    and-int/2addr v14, v7

    aget v15, v1, v14

    if-ne v15, v9, :cond_e

    aput v12, v1, v14

    if-ge v10, v8, :cond_d

    aput-object v13, p0, v12

    xor-int/2addr v12, v6

    aput-object v11, p0, v12

    :cond_d
    add-int/2addr v10, v6

    goto :goto_a

    :cond_e
    aget-object v9, p0, v15

    invoke-virtual {v13, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_f

    new-instance v5, LX2/w$a$a;

    xor-int/lit8 v9, v15, 0x1

    aget-object v12, p0, v9

    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v5, v13, v11, v12}, LX2/w$a$a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v11, p0, v9

    :goto_a
    add-int/2addr v8, v6

    const/4 v9, -0x1

    goto :goto_8

    :cond_f
    add-int/2addr v14, v6

    const/4 v9, -0x1

    goto :goto_9

    :cond_10
    if-ne v10, v0, :cond_11

    goto :goto_b

    :cond_11
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v1, v2, v3

    aput-object v0, v2, v6

    aput-object v5, v2, v4

    move-object v1, v2

    :goto_b
    return-object v1
.end method

.method public static n(Ljava/lang/Object;[Ljava/lang/Object;IILjava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p4, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    if-ne p2, v1, :cond_2

    .line 7
    .line 8
    aget-object p0, p1, p3

    .line 9
    .line 10
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    xor-int/lit8 p0, p3, 0x1

    .line 20
    .line 21
    aget-object v0, p1, p0

    .line 22
    .line 23
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    :cond_1
    return-object v0

    .line 27
    :cond_2
    if-nez p0, :cond_3

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_3
    instance-of p2, p0, [B

    .line 31
    .line 32
    if-eqz p2, :cond_6

    .line 33
    .line 34
    move-object p2, p0

    .line 35
    check-cast p2, [B

    .line 36
    .line 37
    array-length p0, p2

    .line 38
    add-int/lit8 p3, p0, -0x1

    .line 39
    .line 40
    invoke-virtual {p4}, Ljava/lang/Object;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    invoke-static {p0}, LX2/s;->b(I)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    :goto_0
    and-int/2addr p0, p3

    .line 49
    aget-byte v2, p2, p0

    .line 50
    .line 51
    const/16 v3, 0xff

    .line 52
    .line 53
    and-int/2addr v2, v3

    .line 54
    if-ne v2, v3, :cond_4

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_4
    aget-object v3, p1, v2

    .line 58
    .line 59
    invoke-virtual {p4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_5

    .line 64
    .line 65
    xor-int/lit8 p0, v2, 0x1

    .line 66
    .line 67
    aget-object p0, p1, p0

    .line 68
    .line 69
    return-object p0

    .line 70
    :cond_5
    add-int/lit8 p0, p0, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_6
    instance-of p2, p0, [S

    .line 74
    .line 75
    if-eqz p2, :cond_9

    .line 76
    .line 77
    move-object p2, p0

    .line 78
    check-cast p2, [S

    .line 79
    .line 80
    array-length p0, p2

    .line 81
    add-int/lit8 p3, p0, -0x1

    .line 82
    .line 83
    invoke-virtual {p4}, Ljava/lang/Object;->hashCode()I

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    invoke-static {p0}, LX2/s;->b(I)I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    :goto_1
    and-int/2addr p0, p3

    .line 92
    aget-short v2, p2, p0

    .line 93
    .line 94
    const v3, 0xffff

    .line 95
    .line 96
    .line 97
    and-int/2addr v2, v3

    .line 98
    if-ne v2, v3, :cond_7

    .line 99
    .line 100
    return-object v0

    .line 101
    :cond_7
    aget-object v3, p1, v2

    .line 102
    .line 103
    invoke-virtual {p4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_8

    .line 108
    .line 109
    xor-int/lit8 p0, v2, 0x1

    .line 110
    .line 111
    aget-object p0, p1, p0

    .line 112
    .line 113
    return-object p0

    .line 114
    :cond_8
    add-int/lit8 p0, p0, 0x1

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_9
    check-cast p0, [I

    .line 118
    .line 119
    array-length p2, p0

    .line 120
    sub-int/2addr p2, v1

    .line 121
    invoke-virtual {p4}, Ljava/lang/Object;->hashCode()I

    .line 122
    .line 123
    .line 124
    move-result p3

    .line 125
    invoke-static {p3}, LX2/s;->b(I)I

    .line 126
    .line 127
    .line 128
    move-result p3

    .line 129
    :goto_2
    and-int/2addr p3, p2

    .line 130
    aget v2, p0, p3

    .line 131
    .line 132
    const/4 v3, -0x1

    .line 133
    if-ne v2, v3, :cond_a

    .line 134
    .line 135
    return-object v0

    .line 136
    :cond_a
    aget-object v3, p1, v2

    .line 137
    .line 138
    invoke-virtual {p4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-eqz v3, :cond_b

    .line 143
    .line 144
    xor-int/lit8 p0, v2, 0x1

    .line 145
    .line 146
    aget-object p0, p1, p0

    .line 147
    .line 148
    return-object p0

    .line 149
    :cond_b
    add-int/lit8 p3, p3, 0x1

    .line 150
    .line 151
    goto :goto_2
.end method


# virtual methods
.method public d()LX2/y;
    .locals 4

    .line 1
    new-instance v0, LX2/T$a;

    .line 2
    .line 3
    iget-object v1, p0, LX2/T;->t:[Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget v3, p0, LX2/T;->u:I

    .line 7
    .line 8
    invoke-direct {v0, p0, v1, v2, v3}, LX2/T$a;-><init>(LX2/w;[Ljava/lang/Object;II)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public e()LX2/y;
    .locals 4

    .line 1
    new-instance v0, LX2/T$c;

    .line 2
    .line 3
    iget-object v1, p0, LX2/T;->t:[Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget v3, p0, LX2/T;->u:I

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v3}, LX2/T$c;-><init>([Ljava/lang/Object;II)V

    .line 9
    .line 10
    .line 11
    new-instance v1, LX2/T$b;

    .line 12
    .line 13
    invoke-direct {v1, p0, v0}, LX2/T$b;-><init>(LX2/w;LX2/v;)V

    .line 14
    .line 15
    .line 16
    return-object v1
.end method

.method public f()LX2/t;
    .locals 4

    .line 1
    new-instance v0, LX2/T$c;

    .line 2
    .line 3
    iget-object v1, p0, LX2/T;->t:[Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget v3, p0, LX2/T;->u:I

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v3}, LX2/T$c;-><init>([Ljava/lang/Object;II)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LX2/T;->s:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, LX2/T;->t:[Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, LX2/T;->u:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static {v0, v1, v2, v3, p1}, LX2/T;->n(Ljava/lang/Object;[Ljava/lang/Object;IILjava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    :cond_0
    return-object p1
.end method

.method public h()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, LX2/T;->u:I

    .line 2
    .line 3
    return v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, LX2/w;->writeReplace()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
