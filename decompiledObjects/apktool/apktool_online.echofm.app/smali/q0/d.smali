.class public final Lq0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/h;


# static fields
.field public static final f:[I


# instance fields
.field public final b:I

.field public c:Lc1/t$a;

.field public d:Z

.field public final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lq0/d;->f:[I

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 4
        0x8
        0xd
        0xb
        0x2
        0x0
        0x1
        0x7
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lq0/d;-><init>(IZ)V

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lq0/d;->b:I

    iput-boolean p2, p0, Lq0/d;->e:Z

    new-instance p1, Lc1/h;

    invoke-direct {p1}, Lc1/h;-><init>()V

    iput-object p1, p0, Lq0/d;->c:Lc1/t$a;

    return-void
.end method

.method public static d(ILjava/util/List;)V
    .locals 2

    .line 1
    sget-object v0, Lq0/d;->f:[I

    .line 2
    .line 3
    invoke-static {v0, p0}, La3/f;->j([II)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_1
    :goto_0
    return-void
.end method

.method public static g(Lc1/t$a;ZLg0/E;Ld0/q;Ljava/util/List;)LZ0/h;
    .locals 7

    .line 1
    invoke-static {p3}, Lq0/d;->j(Ld0/q;)Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p3, 0x4

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p3, 0x0

    .line 10
    :goto_0
    if-nez p1, :cond_1

    .line 11
    .line 12
    sget-object p0, Lc1/t$a;->a:Lc1/t$a;

    .line 13
    .line 14
    or-int/lit8 p3, p3, 0x20

    .line 15
    .line 16
    :cond_1
    move-object v1, p0

    .line 17
    move v2, p3

    .line 18
    new-instance p0, LZ0/h;

    .line 19
    .line 20
    if-eqz p4, :cond_2

    .line 21
    .line 22
    :goto_1
    move-object v5, p4

    .line 23
    goto :goto_2

    .line 24
    :cond_2
    invoke-static {}, LX2/v;->Y()LX2/v;

    .line 25
    .line 26
    .line 27
    move-result-object p4

    .line 28
    goto :goto_1

    .line 29
    :goto_2
    const/4 v6, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    move-object v0, p0

    .line 32
    move-object v3, p2

    .line 33
    invoke-direct/range {v0 .. v6}, LZ0/h;-><init>(Lc1/t$a;ILg0/E;LZ0/s;Ljava/util/List;LF0/T;)V

    .line 34
    .line 35
    .line 36
    return-object p0
.end method

.method public static h(IZLd0/q;Ljava/util/List;Lg0/E;Lc1/t$a;Z)Ll1/J;
    .locals 8

    .line 1
    or-int/lit8 v0, p0, 0x10

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    or-int/lit8 v0, p0, 0x30

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    if-eqz p1, :cond_1

    .line 9
    .line 10
    new-instance p0, Ld0/q$b;

    .line 11
    .line 12
    invoke-direct {p0}, Ld0/q$b;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string p1, "application/cea-608"

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ld0/q$b;->K()Ld0/q;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    :goto_0
    iget-object p0, p2, Ld0/q;->j:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_3

    .line 41
    .line 42
    const-string p1, "audio/mp4a-latm"

    .line 43
    .line 44
    invoke-static {p0, p1}, Ld0/z;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-nez p1, :cond_2

    .line 49
    .line 50
    or-int/lit8 v0, v0, 0x2

    .line 51
    .line 52
    :cond_2
    const-string p1, "video/avc"

    .line 53
    .line 54
    invoke-static {p0, p1}, Ld0/z;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-nez p0, :cond_3

    .line 59
    .line 60
    or-int/lit8 v0, v0, 0x4

    .line 61
    .line 62
    :cond_3
    if-nez p6, :cond_4

    .line 63
    .line 64
    sget-object p5, Lc1/t$a;->a:Lc1/t$a;

    .line 65
    .line 66
    const/4 p0, 0x1

    .line 67
    :goto_1
    move v3, p0

    .line 68
    move-object v4, p5

    .line 69
    goto :goto_2

    .line 70
    :cond_4
    const/4 p0, 0x0

    .line 71
    goto :goto_1

    .line 72
    :goto_2
    new-instance p0, Ll1/J;

    .line 73
    .line 74
    new-instance v6, Ll1/j;

    .line 75
    .line 76
    invoke-direct {v6, v0, p3}, Ll1/j;-><init>(ILjava/util/List;)V

    .line 77
    .line 78
    .line 79
    const v7, 0x1b8a0

    .line 80
    .line 81
    .line 82
    const/4 v2, 0x2

    .line 83
    move-object v1, p0

    .line 84
    move-object v5, p4

    .line 85
    invoke-direct/range {v1 .. v7}, Ll1/J;-><init>(IILc1/t$a;Lg0/E;Ll1/K$c;I)V

    .line 86
    .line 87
    .line 88
    return-object p0
.end method

.method public static j(Ld0/q;)Z
    .locals 4

    .line 1
    iget-object p0, p0, Ld0/q;->k:Ld0/x;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    move v1, v0

    .line 8
    :goto_0
    invoke-virtual {p0}, Ld0/x;->e()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-ge v1, v2, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Ld0/x;->d(I)Ld0/x$b;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    instance-of v3, v2, Lq0/t;

    .line 19
    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    check-cast v2, Lq0/t;

    .line 23
    .line 24
    iget-object p0, v2, Lq0/t;->q:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    xor-int/lit8 p0, p0, 0x1

    .line 31
    .line 32
    return p0

    .line 33
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    return v0
.end method

.method public static k(LF0/r;LF0/s;)Z
    .locals 0

    .line 1
    :try_start_0
    invoke-interface {p0, p1}, LF0/r;->e(LF0/s;)Z

    .line 2
    .line 3
    .line 4
    move-result p0
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    invoke-interface {p1}, LF0/s;->h()V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    invoke-interface {p1}, LF0/s;->h()V

    .line 11
    .line 12
    .line 13
    throw p0

    .line 14
    :catch_0
    invoke-interface {p1}, LF0/s;->h()V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    :goto_0
    return p0
.end method


# virtual methods
.method public bridge synthetic a(Z)Lq0/h;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lq0/d;->i(Z)Lq0/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(Ld0/q;)Ld0/q;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lq0/d;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lq0/d;->c:Lc1/t$a;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lc1/t$a;->a(Ld0/q;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Ld0/q;->a()Ld0/q$b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "application/x-media3-cues"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lq0/d;->c:Lc1/t$a;

    .line 24
    .line 25
    invoke-interface {v1, p1}, Lc1/t$a;->c(Ld0/q;)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {v0, v1}, Ld0/q$b;->S(I)Ld0/q$b;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    iget-object v2, p1, Ld0/q;->n:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget-object v2, p1, Ld0/q;->j:Ljava/lang/String;

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    new-instance v2, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string v3, " "

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object p1, p1, Ld0/q;->j:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    const-string p1, ""

    .line 68
    .line 69
    :goto_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {v0, p1}, Ld0/q$b;->O(Ljava/lang/String;)Ld0/q$b;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const-wide v0, 0x7fffffffffffffffL

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v0, v1}, Ld0/q$b;->s0(J)Ld0/q$b;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, Ld0/q$b;->K()Ld0/q;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    :cond_1
    return-object p1
.end method

.method public bridge synthetic c(Landroid/net/Uri;Ld0/q;Ljava/util/List;Lg0/E;Ljava/util/Map;LF0/s;Ll0/y1;)Lq0/k;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p7}, Lq0/d;->e(Landroid/net/Uri;Ld0/q;Ljava/util/List;Lg0/E;Ljava/util/Map;LF0/s;Ll0/y1;)Lq0/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public e(Landroid/net/Uri;Ld0/q;Ljava/util/List;Lg0/E;Ljava/util/Map;LF0/s;Ll0/y1;)Lq0/b;
    .locals 14

    .line 1
    move-object v0, p0

    .line 2
    move-object/from16 v3, p2

    .line 3
    .line 4
    iget-object v1, v3, Ld0/q;->n:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v1}, Ld0/o;->a(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static/range {p5 .. p5}, Ld0/o;->b(Ljava/util/Map;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-static {p1}, Ld0/o;->c(Landroid/net/Uri;)I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    new-instance v5, Ljava/util/ArrayList;

    .line 19
    .line 20
    sget-object v6, Lq0/d;->f:[I

    .line 21
    .line 22
    array-length v7, v6

    .line 23
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v5}, Lq0/d;->d(ILjava/util/List;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v2, v5}, Lq0/d;->d(ILjava/util/List;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v4, v5}, Lq0/d;->d(ILjava/util/List;)V

    .line 33
    .line 34
    .line 35
    array-length v7, v6

    .line 36
    const/4 v8, 0x0

    .line 37
    move v9, v8

    .line 38
    :goto_0
    if-ge v9, v7, :cond_0

    .line 39
    .line 40
    aget v10, v6, v9

    .line 41
    .line 42
    invoke-static {v10, v5}, Lq0/d;->d(ILjava/util/List;)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v9, v9, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-interface/range {p6 .. p6}, LF0/s;->h()V

    .line 49
    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    :goto_1
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-ge v8, v7, :cond_4

    .line 57
    .line 58
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    check-cast v7, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    move-object/from16 v9, p3

    .line 69
    .line 70
    move-object/from16 v10, p4

    .line 71
    .line 72
    invoke-virtual {p0, v7, v3, v9, v10}, Lq0/d;->f(ILd0/q;Ljava/util/List;Lg0/E;)LF0/r;

    .line 73
    .line 74
    .line 75
    move-result-object v11

    .line 76
    invoke-static {v11}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    check-cast v11, LF0/r;

    .line 81
    .line 82
    move-object/from16 v12, p6

    .line 83
    .line 84
    invoke-static {v11, v12}, Lq0/d;->k(LF0/r;LF0/s;)Z

    .line 85
    .line 86
    .line 87
    move-result v13

    .line 88
    if-eqz v13, :cond_1

    .line 89
    .line 90
    new-instance v7, Lq0/b;

    .line 91
    .line 92
    iget-object v5, v0, Lq0/d;->c:Lc1/t$a;

    .line 93
    .line 94
    iget-boolean v6, v0, Lq0/d;->d:Z

    .line 95
    .line 96
    move-object v1, v7

    .line 97
    move-object v2, v11

    .line 98
    move-object/from16 v3, p2

    .line 99
    .line 100
    move-object/from16 v4, p4

    .line 101
    .line 102
    invoke-direct/range {v1 .. v6}, Lq0/b;-><init>(LF0/r;Ld0/q;Lg0/E;Lc1/t$a;Z)V

    .line 103
    .line 104
    .line 105
    return-object v7

    .line 106
    :cond_1
    if-nez v6, :cond_3

    .line 107
    .line 108
    if-eq v7, v1, :cond_2

    .line 109
    .line 110
    if-eq v7, v2, :cond_2

    .line 111
    .line 112
    if-eq v7, v4, :cond_2

    .line 113
    .line 114
    const/16 v13, 0xb

    .line 115
    .line 116
    if-ne v7, v13, :cond_3

    .line 117
    .line 118
    :cond_2
    move-object v6, v11

    .line 119
    :cond_3
    add-int/lit8 v8, v8, 0x1

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_4
    move-object/from16 v10, p4

    .line 123
    .line 124
    new-instance v7, Lq0/b;

    .line 125
    .line 126
    invoke-static {v6}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    move-object v2, v1

    .line 131
    check-cast v2, LF0/r;

    .line 132
    .line 133
    iget-object v5, v0, Lq0/d;->c:Lc1/t$a;

    .line 134
    .line 135
    iget-boolean v6, v0, Lq0/d;->d:Z

    .line 136
    .line 137
    move-object v1, v7

    .line 138
    move-object/from16 v3, p2

    .line 139
    .line 140
    move-object/from16 v4, p4

    .line 141
    .line 142
    invoke-direct/range {v1 .. v6}, Lq0/b;-><init>(LF0/r;Ld0/q;Lg0/E;Lc1/t$a;Z)V

    .line 143
    .line 144
    .line 145
    return-object v7
.end method

.method public final f(ILd0/q;Ljava/util/List;Lg0/E;)LF0/r;
    .locals 8

    .line 1
    if-eqz p1, :cond_6

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_5

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_4

    .line 8
    .line 9
    const/4 v0, 0x7

    .line 10
    if-eq p1, v0, :cond_3

    .line 11
    .line 12
    const/16 v0, 0x8

    .line 13
    .line 14
    if-eq p1, v0, :cond_2

    .line 15
    .line 16
    const/16 v0, 0xb

    .line 17
    .line 18
    if-eq p1, v0, :cond_1

    .line 19
    .line 20
    const/16 p3, 0xd

    .line 21
    .line 22
    if-eq p1, p3, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    return-object p1

    .line 26
    :cond_0
    new-instance p1, Lq0/w;

    .line 27
    .line 28
    iget-object p2, p2, Ld0/q;->d:Ljava/lang/String;

    .line 29
    .line 30
    iget-object p3, p0, Lq0/d;->c:Lc1/t$a;

    .line 31
    .line 32
    iget-boolean v0, p0, Lq0/d;->d:Z

    .line 33
    .line 34
    invoke-direct {p1, p2, p4, p3, v0}, Lq0/w;-><init>(Ljava/lang/String;Lg0/E;Lc1/t$a;Z)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    iget v1, p0, Lq0/d;->b:I

    .line 39
    .line 40
    iget-boolean v2, p0, Lq0/d;->e:Z

    .line 41
    .line 42
    iget-object v6, p0, Lq0/d;->c:Lc1/t$a;

    .line 43
    .line 44
    iget-boolean v7, p0, Lq0/d;->d:Z

    .line 45
    .line 46
    move-object v3, p2

    .line 47
    move-object v4, p3

    .line 48
    move-object v5, p4

    .line 49
    invoke-static/range {v1 .. v7}, Lq0/d;->h(IZLd0/q;Ljava/util/List;Lg0/E;Lc1/t$a;Z)Ll1/J;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    :cond_2
    iget-object p1, p0, Lq0/d;->c:Lc1/t$a;

    .line 55
    .line 56
    iget-boolean v0, p0, Lq0/d;->d:Z

    .line 57
    .line 58
    invoke-static {p1, v0, p4, p2, p3}, Lq0/d;->g(Lc1/t$a;ZLg0/E;Ld0/q;Ljava/util/List;)LZ0/h;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :cond_3
    new-instance p1, LY0/f;

    .line 64
    .line 65
    const/4 p2, 0x0

    .line 66
    const-wide/16 p3, 0x0

    .line 67
    .line 68
    invoke-direct {p1, p2, p3, p4}, LY0/f;-><init>(IJ)V

    .line 69
    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_4
    new-instance p1, Ll1/h;

    .line 73
    .line 74
    invoke-direct {p1}, Ll1/h;-><init>()V

    .line 75
    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_5
    new-instance p1, Ll1/e;

    .line 79
    .line 80
    invoke-direct {p1}, Ll1/e;-><init>()V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_6
    new-instance p1, Ll1/b;

    .line 85
    .line 86
    invoke-direct {p1}, Ll1/b;-><init>()V

    .line 87
    .line 88
    .line 89
    return-object p1
.end method

.method public i(Z)Lq0/d;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lq0/d;->d:Z

    .line 2
    .line 3
    return-object p0
.end method
