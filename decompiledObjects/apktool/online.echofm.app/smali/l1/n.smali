.class public final Ll1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll1/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll1/n$a;
    }
.end annotation


# static fields
.field public static final q:[D


# instance fields
.field public a:Ljava/lang/String;

.field public b:LF0/T;

.field public final c:Ll1/M;

.field public final d:Lg0/z;

.field public final e:Ll1/w;

.field public final f:[Z

.field public final g:Ll1/n$a;

.field public h:J

.field public i:Z

.field public j:Z

.field public k:J

.field public l:J

.field public m:J

.field public n:J

.field public o:Z

.field public p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [D

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Ll1/n;->q:[D

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 8
        0x4037f9dcb5112287L    # 23.976023976023978
        0x4038000000000000L    # 24.0
        0x4039000000000000L    # 25.0
        0x403df853e2556b28L    # 29.97002997002997
        0x403e000000000000L    # 30.0
        0x4049000000000000L    # 50.0
        0x404df853e2556b28L    # 59.94005994005994
        0x404e000000000000L    # 60.0
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ll1/n;-><init>(Ll1/M;)V

    return-void
.end method

.method public constructor <init>(Ll1/M;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/n;->c:Ll1/M;

    const/4 v0, 0x4

    new-array v0, v0, [Z

    iput-object v0, p0, Ll1/n;->f:[Z

    new-instance v0, Ll1/n$a;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ll1/n$a;-><init>(I)V

    iput-object v0, p0, Ll1/n;->g:Ll1/n$a;

    if-eqz p1, :cond_0

    new-instance p1, Ll1/w;

    const/16 v0, 0xb2

    invoke-direct {p1, v0, v1}, Ll1/w;-><init>(II)V

    iput-object p1, p0, Ll1/n;->e:Ll1/w;

    new-instance p1, Lg0/z;

    invoke-direct {p1}, Lg0/z;-><init>()V

    :goto_0
    iput-object p1, p0, Ll1/n;->d:Lg0/z;

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Ll1/n;->e:Ll1/w;

    goto :goto_0

    :goto_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Ll1/n;->l:J

    iput-wide v0, p0, Ll1/n;->n:J

    return-void
.end method

.method public static f(Ll1/n$a;Ljava/lang/String;)Landroid/util/Pair;
    .locals 8

    .line 1
    iget-object v0, p0, Ll1/n$a;->d:[B

    .line 2
    .line 3
    iget v1, p0, Ll1/n$a;->b:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x4

    .line 10
    aget-byte v2, v0, v1

    .line 11
    .line 12
    and-int/lit16 v2, v2, 0xff

    .line 13
    .line 14
    const/4 v3, 0x5

    .line 15
    aget-byte v4, v0, v3

    .line 16
    .line 17
    and-int/lit16 v5, v4, 0xff

    .line 18
    .line 19
    const/4 v6, 0x6

    .line 20
    aget-byte v6, v0, v6

    .line 21
    .line 22
    and-int/lit16 v6, v6, 0xff

    .line 23
    .line 24
    shl-int/2addr v2, v1

    .line 25
    shr-int/2addr v5, v1

    .line 26
    or-int/2addr v2, v5

    .line 27
    and-int/lit8 v4, v4, 0xf

    .line 28
    .line 29
    shl-int/lit8 v4, v4, 0x8

    .line 30
    .line 31
    or-int/2addr v4, v6

    .line 32
    const/4 v5, 0x7

    .line 33
    aget-byte v6, v0, v5

    .line 34
    .line 35
    and-int/lit16 v6, v6, 0xf0

    .line 36
    .line 37
    shr-int/2addr v6, v1

    .line 38
    const/4 v7, 0x2

    .line 39
    if-eq v6, v7, :cond_2

    .line 40
    .line 41
    const/4 v7, 0x3

    .line 42
    if-eq v6, v7, :cond_1

    .line 43
    .line 44
    if-eq v6, v1, :cond_0

    .line 45
    .line 46
    const/high16 v1, 0x3f800000    # 1.0f

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    mul-int/lit8 v1, v4, 0x79

    .line 50
    .line 51
    int-to-float v1, v1

    .line 52
    mul-int/lit8 v6, v2, 0x64

    .line 53
    .line 54
    :goto_0
    int-to-float v6, v6

    .line 55
    div-float/2addr v1, v6

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    mul-int/lit8 v1, v4, 0x10

    .line 58
    .line 59
    int-to-float v1, v1

    .line 60
    mul-int/lit8 v6, v2, 0x9

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    mul-int/lit8 v1, v4, 0x4

    .line 64
    .line 65
    int-to-float v1, v1

    .line 66
    mul-int/lit8 v6, v2, 0x3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :goto_1
    new-instance v6, Ld0/q$b;

    .line 70
    .line 71
    invoke-direct {v6}, Ld0/q$b;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v6, p1}, Ld0/q$b;->a0(Ljava/lang/String;)Ld0/q$b;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const-string v6, "video/mpeg2"

    .line 79
    .line 80
    invoke-virtual {p1, v6}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1, v2}, Ld0/q$b;->v0(I)Ld0/q$b;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1, v4}, Ld0/q$b;->Y(I)Ld0/q$b;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1, v1}, Ld0/q$b;->k0(F)Ld0/q$b;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {p1, v1}, Ld0/q$b;->b0(Ljava/util/List;)Ld0/q$b;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1}, Ld0/q$b;->K()Ld0/q;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    aget-byte v1, v0, v5

    .line 109
    .line 110
    and-int/lit8 v1, v1, 0xf

    .line 111
    .line 112
    add-int/lit8 v1, v1, -0x1

    .line 113
    .line 114
    if-ltz v1, :cond_4

    .line 115
    .line 116
    sget-object v2, Ll1/n;->q:[D

    .line 117
    .line 118
    array-length v4, v2

    .line 119
    if-ge v1, v4, :cond_4

    .line 120
    .line 121
    aget-wide v1, v2, v1

    .line 122
    .line 123
    iget p0, p0, Ll1/n$a;->c:I

    .line 124
    .line 125
    add-int/lit8 p0, p0, 0x9

    .line 126
    .line 127
    aget-byte p0, v0, p0

    .line 128
    .line 129
    and-int/lit8 v0, p0, 0x60

    .line 130
    .line 131
    shr-int/2addr v0, v3

    .line 132
    and-int/lit8 p0, p0, 0x1f

    .line 133
    .line 134
    if-eq v0, p0, :cond_3

    .line 135
    .line 136
    int-to-double v3, v0

    .line 137
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 138
    .line 139
    add-double/2addr v3, v5

    .line 140
    add-int/lit8 p0, p0, 0x1

    .line 141
    .line 142
    int-to-double v5, p0

    .line 143
    div-double/2addr v3, v5

    .line 144
    mul-double/2addr v1, v3

    .line 145
    :cond_3
    const-wide v3, 0x412e848000000000L    # 1000000.0

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    div-double/2addr v3, v1

    .line 151
    double-to-long v0, v3

    .line 152
    goto :goto_2

    .line 153
    :cond_4
    const-wide/16 v0, 0x0

    .line 154
    .line 155
    :goto_2
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-static {p1, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    return-object p0
.end method


# virtual methods
.method public a(Lg0/z;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    iget-object v1, v0, Ll1/n;->b:LF0/T;

    invoke-static {v1}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p1 .. p1}, Lg0/z;->f()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Lg0/z;->g()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lg0/z;->e()[B

    move-result-object v3

    iget-wide v4, v0, Ll1/n;->h:J

    invoke-virtual/range {p1 .. p1}, Lg0/z;->a()I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v4, v6

    iput-wide v4, v0, Ll1/n;->h:J

    iget-object v4, v0, Ll1/n;->b:LF0/T;

    invoke-virtual/range {p1 .. p1}, Lg0/z;->a()I

    move-result v5

    move-object/from16 v6, p1

    invoke-interface {v4, v6, v5}, LF0/T;->e(Lg0/z;I)V

    :goto_0
    iget-object v4, v0, Ll1/n;->f:[Z

    invoke-static {v3, v1, v2, v4}, Lh0/d;->c([BII[Z)I

    move-result v4

    if-ne v4, v2, :cond_2

    iget-boolean v4, v0, Ll1/n;->j:Z

    if-nez v4, :cond_0

    iget-object v4, v0, Ll1/n;->g:Ll1/n$a;

    invoke-virtual {v4, v3, v1, v2}, Ll1/n$a;->a([BII)V

    :cond_0
    iget-object v4, v0, Ll1/n;->e:Ll1/w;

    if-eqz v4, :cond_1

    invoke-virtual {v4, v3, v1, v2}, Ll1/w;->a([BII)V

    :cond_1
    return-void

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lg0/z;->e()[B

    move-result-object v5

    add-int/lit8 v7, v4, 0x3

    aget-byte v5, v5, v7

    and-int/lit16 v5, v5, 0xff

    sub-int v8, v4, v1

    iget-boolean v9, v0, Ll1/n;->j:Z

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-nez v9, :cond_5

    if-lez v8, :cond_3

    iget-object v9, v0, Ll1/n;->g:Ll1/n$a;

    invoke-virtual {v9, v3, v1, v4}, Ll1/n$a;->a([BII)V

    :cond_3
    if-gez v8, :cond_4

    neg-int v9, v8

    goto :goto_1

    :cond_4
    move v9, v10

    :goto_1
    iget-object v12, v0, Ll1/n;->g:Ll1/n$a;

    invoke-virtual {v12, v5, v9}, Ll1/n$a;->b(II)Z

    move-result v9

    if-eqz v9, :cond_5

    iget-object v9, v0, Ll1/n;->g:Ll1/n$a;

    iget-object v12, v0, Ll1/n;->a:Ljava/lang/String;

    invoke-static {v12}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-static {v9, v12}, Ll1/n;->f(Ll1/n$a;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v9

    iget-object v12, v0, Ll1/n;->b:LF0/T;

    iget-object v13, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v13, Ld0/q;

    invoke-interface {v12, v13}, LF0/T;->d(Ld0/q;)V

    iget-object v9, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Long;

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    iput-wide v12, v0, Ll1/n;->k:J

    iput-boolean v11, v0, Ll1/n;->j:Z

    :cond_5
    iget-object v9, v0, Ll1/n;->e:Ll1/w;

    if-eqz v9, :cond_8

    if-lez v8, :cond_6

    invoke-virtual {v9, v3, v1, v4}, Ll1/w;->a([BII)V

    move v1, v10

    goto :goto_2

    :cond_6
    neg-int v1, v8

    :goto_2
    iget-object v8, v0, Ll1/n;->e:Ll1/w;

    invoke-virtual {v8, v1}, Ll1/w;->b(I)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, v0, Ll1/n;->e:Ll1/w;

    iget-object v8, v1, Ll1/w;->d:[B

    iget v1, v1, Ll1/w;->e:I

    invoke-static {v8, v1}, Lh0/d;->r([BI)I

    move-result v1

    iget-object v8, v0, Ll1/n;->d:Lg0/z;

    invoke-static {v8}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg0/z;

    iget-object v9, v0, Ll1/n;->e:Ll1/w;

    iget-object v9, v9, Ll1/w;->d:[B

    invoke-virtual {v8, v9, v1}, Lg0/z;->R([BI)V

    iget-object v1, v0, Ll1/n;->c:Ll1/M;

    invoke-static {v1}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/M;

    iget-wide v8, v0, Ll1/n;->n:J

    iget-object v12, v0, Ll1/n;->d:Lg0/z;

    invoke-virtual {v1, v8, v9, v12}, Ll1/M;->a(JLg0/z;)V

    :cond_7
    const/16 v1, 0xb2

    if-ne v5, v1, :cond_8

    invoke-virtual/range {p1 .. p1}, Lg0/z;->e()[B

    move-result-object v1

    add-int/lit8 v8, v4, 0x2

    aget-byte v1, v1, v8

    if-ne v1, v11, :cond_8

    iget-object v1, v0, Ll1/n;->e:Ll1/w;

    invoke-virtual {v1, v5}, Ll1/w;->e(I)V

    :cond_8
    if-eqz v5, :cond_a

    const/16 v1, 0xb3

    if-ne v5, v1, :cond_9

    goto :goto_3

    :cond_9
    const/16 v1, 0xb8

    if-ne v5, v1, :cond_11

    iput-boolean v11, v0, Ll1/n;->o:Z

    goto :goto_8

    :cond_a
    :goto_3
    sub-int v1, v2, v4

    iget-boolean v4, v0, Ll1/n;->p:Z

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v4, :cond_b

    iget-boolean v4, v0, Ll1/n;->j:Z

    if-eqz v4, :cond_b

    iget-wide v13, v0, Ll1/n;->n:J

    cmp-long v4, v13, v8

    if-eqz v4, :cond_b

    iget-boolean v15, v0, Ll1/n;->o:Z

    iget-wide v11, v0, Ll1/n;->h:J

    move/from16 v19, v5

    iget-wide v4, v0, Ll1/n;->m:J

    sub-long/2addr v11, v4

    long-to-int v4, v11

    sub-int v16, v4, v1

    iget-object v12, v0, Ll1/n;->b:LF0/T;

    const/16 v18, 0x0

    move/from16 v17, v1

    invoke-interface/range {v12 .. v18}, LF0/T;->b(JIIILF0/T$a;)V

    goto :goto_4

    :cond_b
    move/from16 v19, v5

    :goto_4
    iget-boolean v4, v0, Ll1/n;->i:Z

    if-eqz v4, :cond_d

    iget-boolean v4, v0, Ll1/n;->p:Z

    if-eqz v4, :cond_c

    goto :goto_5

    :cond_c
    const/4 v1, 0x1

    goto :goto_7

    :cond_d
    :goto_5
    iget-wide v4, v0, Ll1/n;->h:J

    int-to-long v11, v1

    sub-long/2addr v4, v11

    iput-wide v4, v0, Ll1/n;->m:J

    iget-wide v4, v0, Ll1/n;->l:J

    cmp-long v1, v4, v8

    if-eqz v1, :cond_e

    goto :goto_6

    :cond_e
    iget-wide v4, v0, Ll1/n;->n:J

    cmp-long v1, v4, v8

    if-eqz v1, :cond_f

    iget-wide v11, v0, Ll1/n;->k:J

    add-long/2addr v4, v11

    goto :goto_6

    :cond_f
    move-wide v4, v8

    :goto_6
    iput-wide v4, v0, Ll1/n;->n:J

    iput-boolean v10, v0, Ll1/n;->o:Z

    iput-wide v8, v0, Ll1/n;->l:J

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll1/n;->i:Z

    :goto_7
    if-nez v19, :cond_10

    move v10, v1

    :cond_10
    iput-boolean v10, v0, Ll1/n;->p:Z

    :cond_11
    :goto_8
    move v1, v7

    goto/16 :goto_0
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Ll1/n;->f:[Z

    .line 2
    .line 3
    invoke-static {v0}, Lh0/d;->a([Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll1/n;->g:Ll1/n$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Ll1/n$a;->c()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ll1/n;->e:Ll1/w;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ll1/w;->d()V

    .line 16
    .line 17
    .line 18
    :cond_0
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    iput-wide v0, p0, Ll1/n;->h:J

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Ll1/n;->i:Z

    .line 24
    .line 25
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    iput-wide v0, p0, Ll1/n;->l:J

    .line 31
    .line 32
    iput-wide v0, p0, Ll1/n;->n:J

    .line 33
    .line 34
    return-void
.end method

.method public c(Z)V
    .locals 8

    .line 1
    iget-object v0, p0, Ll1/n;->b:LF0/T;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-boolean v4, p0, Ll1/n;->o:Z

    .line 9
    .line 10
    iget-wide v0, p0, Ll1/n;->h:J

    .line 11
    .line 12
    iget-wide v2, p0, Ll1/n;->m:J

    .line 13
    .line 14
    sub-long/2addr v0, v2

    .line 15
    long-to-int v5, v0

    .line 16
    iget-object v1, p0, Ll1/n;->b:LF0/T;

    .line 17
    .line 18
    iget-wide v2, p0, Ll1/n;->n:J

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    invoke-interface/range {v1 .. v7}, LF0/T;->b(JIIILF0/T$a;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public d(JI)V
    .locals 0

    .line 1
    iput-wide p1, p0, Ll1/n;->l:J

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
    iput-object v0, p0, Ll1/n;->a:Ljava/lang/String;

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
    iput-object v0, p0, Ll1/n;->b:LF0/T;

    .line 20
    .line 21
    iget-object v0, p0, Ll1/n;->c:Ll1/M;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, p1, p2}, Ll1/M;->b(LF0/t;Ll1/K$d;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method
