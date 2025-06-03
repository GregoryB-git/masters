.class public Lq0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq0/f$d;,
        Lq0/f$b;,
        Lq0/f$e;,
        Lq0/f$a;,
        Lq0/f$c;
    }
.end annotation


# instance fields
.field public final a:Lq0/h;

.field public final b:Li0/g;

.field public final c:Li0/g;

.field public final d:Lq0/v;

.field public final e:[Landroid/net/Uri;

.field public final f:[Ld0/q;

.field public final g:Lr0/k;

.field public final h:Ld0/J;

.field public final i:Ljava/util/List;

.field public final j:Lq0/e;

.field public final k:Ll0/y1;

.field public final l:J

.field public m:Z

.field public n:[B

.field public o:Ljava/io/IOException;

.field public p:Landroid/net/Uri;

.field public q:Z

.field public r:LA0/y;

.field public s:J

.field public t:Z

.field public u:J


# direct methods
.method public constructor <init>(Lq0/h;Lr0/k;[Landroid/net/Uri;[Ld0/q;Lq0/g;Li0/y;Lq0/v;JLjava/util/List;Ll0/y1;LB0/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/f;->a:Lq0/h;

    iput-object p2, p0, Lq0/f;->g:Lr0/k;

    iput-object p3, p0, Lq0/f;->e:[Landroid/net/Uri;

    iput-object p4, p0, Lq0/f;->f:[Ld0/q;

    iput-object p7, p0, Lq0/f;->d:Lq0/v;

    iput-wide p8, p0, Lq0/f;->l:J

    iput-object p10, p0, Lq0/f;->i:Ljava/util/List;

    iput-object p11, p0, Lq0/f;->k:Ll0/y1;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lq0/f;->u:J

    new-instance p7, Lq0/e;

    const/4 p8, 0x4

    invoke-direct {p7, p8}, Lq0/e;-><init>(I)V

    iput-object p7, p0, Lq0/f;->j:Lq0/e;

    sget-object p7, Lg0/M;->f:[B

    iput-object p7, p0, Lq0/f;->n:[B

    iput-wide p1, p0, Lq0/f;->s:J

    const/4 p1, 0x1

    invoke-interface {p5, p1}, Lq0/g;->a(I)Li0/g;

    move-result-object p1

    iput-object p1, p0, Lq0/f;->b:Li0/g;

    if-eqz p6, :cond_0

    invoke-interface {p1, p6}, Li0/g;->c(Li0/y;)V

    :cond_0
    const/4 p1, 0x3

    invoke-interface {p5, p1}, Lq0/g;->a(I)Li0/g;

    move-result-object p1

    iput-object p1, p0, Lq0/f;->c:Li0/g;

    new-instance p1, Ld0/J;

    invoke-direct {p1, p4}, Ld0/J;-><init>([Ld0/q;)V

    iput-object p1, p0, Lq0/f;->h:Ld0/J;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 p2, 0x0

    :goto_0
    array-length p5, p3

    if-ge p2, p5, :cond_2

    aget-object p5, p4, p2

    iget p5, p5, Ld0/q;->f:I

    and-int/lit16 p5, p5, 0x4000

    if-nez p5, :cond_1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    new-instance p2, Lq0/f$d;

    iget-object p3, p0, Lq0/f;->h:Ld0/J;

    invoke-static {p1}, La3/f;->n(Ljava/util/Collection;)[I

    move-result-object p1

    invoke-direct {p2, p3, p1}, Lq0/f$d;-><init>(Ld0/J;[I)V

    iput-object p2, p0, Lq0/f;->r:LA0/y;

    return-void
.end method

.method public static e(Lr0/f;Lr0/f$e;)Landroid/net/Uri;
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object p1, p1, Lr0/f$e;->u:Ljava/lang/String;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object p0, p0, Lr0/h;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {p0, p1}, Lg0/G;->f(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public static h(Lr0/f;JI)Lq0/f$e;
    .locals 7

    .line 1
    iget-wide v0, p0, Lr0/f;->k:J

    .line 2
    .line 3
    sub-long v0, p1, v0

    .line 4
    .line 5
    long-to-int v0, v0

    .line 6
    iget-object v1, p0, Lr0/f;->r:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, -0x1

    .line 15
    if-ne v0, v1, :cond_2

    .line 16
    .line 17
    if-eq p3, v4, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move p3, v3

    .line 21
    :goto_0
    iget-object v0, p0, Lr0/f;->s:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-ge p3, v0, :cond_1

    .line 28
    .line 29
    new-instance v2, Lq0/f$e;

    .line 30
    .line 31
    iget-object p0, p0, Lr0/f;->s:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lr0/f$e;

    .line 38
    .line 39
    invoke-direct {v2, p0, p1, p2, p3}, Lq0/f$e;-><init>(Lr0/f$e;JI)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-object v2

    .line 43
    :cond_2
    iget-object v1, p0, Lr0/f;->r:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Lr0/f$d;

    .line 50
    .line 51
    if-ne p3, v4, :cond_3

    .line 52
    .line 53
    new-instance p0, Lq0/f$e;

    .line 54
    .line 55
    invoke-direct {p0, v1, p1, p2, v4}, Lq0/f$e;-><init>(Lr0/f$e;JI)V

    .line 56
    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_3
    iget-object v5, v1, Lr0/f$d;->A:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-ge p3, v5, :cond_4

    .line 66
    .line 67
    new-instance p0, Lq0/f$e;

    .line 68
    .line 69
    iget-object v0, v1, Lr0/f$d;->A:Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Lr0/f$e;

    .line 76
    .line 77
    invoke-direct {p0, v0, p1, p2, p3}, Lq0/f$e;-><init>(Lr0/f$e;JI)V

    .line 78
    .line 79
    .line 80
    return-object p0

    .line 81
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 82
    .line 83
    iget-object p3, p0, Lr0/f;->r:Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 86
    .line 87
    .line 88
    move-result p3

    .line 89
    const-wide/16 v5, 0x1

    .line 90
    .line 91
    if-ge v0, p3, :cond_5

    .line 92
    .line 93
    new-instance p3, Lq0/f$e;

    .line 94
    .line 95
    iget-object p0, p0, Lr0/f;->r:Ljava/util/List;

    .line 96
    .line 97
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    check-cast p0, Lr0/f$e;

    .line 102
    .line 103
    add-long/2addr p1, v5

    .line 104
    invoke-direct {p3, p0, p1, p2, v4}, Lq0/f$e;-><init>(Lr0/f$e;JI)V

    .line 105
    .line 106
    .line 107
    return-object p3

    .line 108
    :cond_5
    iget-object p3, p0, Lr0/f;->s:Ljava/util/List;

    .line 109
    .line 110
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result p3

    .line 114
    if-nez p3, :cond_6

    .line 115
    .line 116
    new-instance p3, Lq0/f$e;

    .line 117
    .line 118
    iget-object p0, p0, Lr0/f;->s:Ljava/util/List;

    .line 119
    .line 120
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    check-cast p0, Lr0/f$e;

    .line 125
    .line 126
    add-long/2addr p1, v5

    .line 127
    invoke-direct {p3, p0, p1, p2, v3}, Lq0/f$e;-><init>(Lr0/f$e;JI)V

    .line 128
    .line 129
    .line 130
    return-object p3

    .line 131
    :cond_6
    return-object v2
.end method

.method public static j(Lr0/f;JI)Ljava/util/List;
    .locals 7

    .line 1
    iget-wide v0, p0, Lr0/f;->k:J

    .line 2
    .line 3
    sub-long/2addr p1, v0

    .line 4
    long-to-int p1, p1

    .line 5
    if-ltz p1, :cond_7

    .line 6
    .line 7
    iget-object p2, p0, Lr0/f;->r:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-ge p2, p1, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lr0/f;->r:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x0

    .line 28
    const/4 v2, -0x1

    .line 29
    if-ge p1, v0, :cond_4

    .line 30
    .line 31
    if-eq p3, v2, :cond_3

    .line 32
    .line 33
    iget-object v0, p0, Lr0/f;->r:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lr0/f$d;

    .line 40
    .line 41
    if-nez p3, :cond_1

    .line 42
    .line 43
    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object v3, v0, Lr0/f$d;->A:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-ge p3, v3, :cond_2

    .line 54
    .line 55
    iget-object v0, v0, Lr0/f$d;->A:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-interface {v0, p3, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    invoke-interface {p2, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 66
    .line 67
    .line 68
    :cond_2
    :goto_0
    add-int/lit8 p1, p1, 0x1

    .line 69
    .line 70
    :cond_3
    iget-object p3, p0, Lr0/f;->r:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-interface {p3, p1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 81
    .line 82
    .line 83
    move p3, v1

    .line 84
    :cond_4
    iget-wide v3, p0, Lr0/f;->n:J

    .line 85
    .line 86
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    cmp-long p1, v3, v5

    .line 92
    .line 93
    if-eqz p1, :cond_6

    .line 94
    .line 95
    if-ne p3, v2, :cond_5

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_5
    move v1, p3

    .line 99
    :goto_1
    iget-object p1, p0, Lr0/f;->s:Ljava/util/List;

    .line 100
    .line 101
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-ge v1, p1, :cond_6

    .line 106
    .line 107
    iget-object p0, p0, Lr0/f;->s:Ljava/util/List;

    .line 108
    .line 109
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    invoke-interface {p0, v1, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-interface {p2, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 118
    .line 119
    .line 120
    :cond_6
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :cond_7
    :goto_2
    invoke-static {}, LX2/v;->Y()LX2/v;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    return-object p0
.end method


# virtual methods
.method public a(Lq0/j;J)[Ly0/n;
    .locals 17

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    move-object/from16 v9, p1

    .line 4
    .line 5
    if-nez v9, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    :goto_0
    move v10, v0

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget-object v0, v8, Lq0/f;->h:Ld0/J;

    .line 11
    .line 12
    iget-object v1, v9, Ly0/e;->d:Ld0/q;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ld0/J;->b(Ld0/q;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    goto :goto_0

    .line 19
    :goto_1
    iget-object v0, v8, Lq0/f;->r:LA0/y;

    .line 20
    .line 21
    invoke-interface {v0}, LA0/B;->length()I

    .line 22
    .line 23
    .line 24
    move-result v11

    .line 25
    new-array v12, v11, [Ly0/n;

    .line 26
    .line 27
    const/4 v13, 0x0

    .line 28
    move v14, v13

    .line 29
    :goto_2
    if-ge v14, v11, :cond_3

    .line 30
    .line 31
    iget-object v0, v8, Lq0/f;->r:LA0/y;

    .line 32
    .line 33
    invoke-interface {v0, v14}, LA0/B;->c(I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v1, v8, Lq0/f;->e:[Landroid/net/Uri;

    .line 38
    .line 39
    aget-object v1, v1, v0

    .line 40
    .line 41
    iget-object v2, v8, Lq0/f;->g:Lr0/k;

    .line 42
    .line 43
    invoke-interface {v2, v1}, Lr0/k;->d(Landroid/net/Uri;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_1

    .line 48
    .line 49
    sget-object v0, Ly0/n;->a:Ly0/n;

    .line 50
    .line 51
    aput-object v0, v12, v14

    .line 52
    .line 53
    move/from16 v16, v14

    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_1
    iget-object v2, v8, Lq0/f;->g:Lr0/k;

    .line 57
    .line 58
    invoke-interface {v2, v1, v13}, Lr0/k;->k(Landroid/net/Uri;Z)Lr0/f;

    .line 59
    .line 60
    .line 61
    move-result-object v15

    .line 62
    invoke-static {v15}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    iget-wide v1, v15, Lr0/f;->h:J

    .line 66
    .line 67
    iget-object v3, v8, Lq0/f;->g:Lr0/k;

    .line 68
    .line 69
    invoke-interface {v3}, Lr0/k;->m()J

    .line 70
    .line 71
    .line 72
    move-result-wide v3

    .line 73
    sub-long v6, v1, v3

    .line 74
    .line 75
    if-eq v0, v10, :cond_2

    .line 76
    .line 77
    const/4 v0, 0x1

    .line 78
    move v2, v0

    .line 79
    goto :goto_3

    .line 80
    :cond_2
    move v2, v13

    .line 81
    :goto_3
    move-object/from16 v0, p0

    .line 82
    .line 83
    move-object/from16 v1, p1

    .line 84
    .line 85
    move-object v3, v15

    .line 86
    move-wide v4, v6

    .line 87
    move/from16 v16, v14

    .line 88
    .line 89
    move-wide v13, v6

    .line 90
    move-wide/from16 v6, p2

    .line 91
    .line 92
    invoke-virtual/range {v0 .. v7}, Lq0/f;->g(Lq0/j;ZLr0/f;JJ)Landroid/util/Pair;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v1, Ljava/lang/Long;

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 101
    .line 102
    .line 103
    move-result-wide v1

    .line 104
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Ljava/lang/Integer;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    new-instance v3, Lq0/f$c;

    .line 113
    .line 114
    iget-object v4, v15, Lr0/h;->a:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v15, v1, v2, v0}, Lq0/f;->j(Lr0/f;JI)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-direct {v3, v4, v13, v14, v0}, Lq0/f$c;-><init>(Ljava/lang/String;JLjava/util/List;)V

    .line 121
    .line 122
    .line 123
    aput-object v3, v12, v16

    .line 124
    .line 125
    :goto_4
    add-int/lit8 v14, v16, 0x1

    .line 126
    .line 127
    const/4 v13, 0x0

    .line 128
    goto :goto_2

    .line 129
    :cond_3
    return-object v12
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lq0/f;->r:LA0/y;

    .line 2
    .line 3
    invoke-interface {v0}, LA0/y;->l()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lq0/f;->g:Lr0/k;

    .line 8
    .line 9
    iget-object v2, p0, Lq0/f;->e:[Landroid/net/Uri;

    .line 10
    .line 11
    aget-object v0, v2, v0

    .line 12
    .line 13
    invoke-interface {v1, v0}, Lr0/k;->g(Landroid/net/Uri;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public c(JLk0/d1;)J
    .locals 11

    .line 1
    iget-object v0, p0, Lq0/f;->r:LA0/y;

    .line 2
    .line 3
    invoke-interface {v0}, LA0/y;->o()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lq0/f;->e:[Landroid/net/Uri;

    .line 8
    .line 9
    array-length v2, v1

    .line 10
    const/4 v3, 0x1

    .line 11
    if-ge v0, v2, :cond_0

    .line 12
    .line 13
    const/4 v2, -0x1

    .line 14
    if-eq v0, v2, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lq0/f;->g:Lr0/k;

    .line 17
    .line 18
    iget-object v2, p0, Lq0/f;->r:LA0/y;

    .line 19
    .line 20
    invoke-interface {v2}, LA0/y;->l()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    aget-object v1, v1, v2

    .line 25
    .line 26
    invoke-interface {v0, v1, v3}, Lr0/k;->k(Landroid/net/Uri;Z)Lr0/f;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-object v1, v0, Lr0/f;->r:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    iget-boolean v1, v0, Lr0/h;->c:Z

    .line 43
    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    iget-wide v1, v0, Lr0/f;->h:J

    .line 48
    .line 49
    iget-object v4, p0, Lq0/f;->g:Lr0/k;

    .line 50
    .line 51
    invoke-interface {v4}, Lr0/k;->m()J

    .line 52
    .line 53
    .line 54
    move-result-wide v4

    .line 55
    sub-long/2addr v1, v4

    .line 56
    sub-long v5, p1, v1

    .line 57
    .line 58
    iget-object p1, v0, Lr0/f;->r:Ljava/util/List;

    .line 59
    .line 60
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-static {p1, p2, v3, v3}, Lg0/M;->f(Ljava/util/List;Ljava/lang/Comparable;ZZ)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    iget-object p2, v0, Lr0/f;->r:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    check-cast p2, Lr0/f$d;

    .line 75
    .line 76
    iget-wide v7, p2, Lr0/f$e;->s:J

    .line 77
    .line 78
    iget-object p2, v0, Lr0/f;->r:Ljava/util/List;

    .line 79
    .line 80
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    sub-int/2addr p2, v3

    .line 85
    if-eq p1, p2, :cond_2

    .line 86
    .line 87
    iget-object p2, v0, Lr0/f;->r:Ljava/util/List;

    .line 88
    .line 89
    add-int/2addr p1, v3

    .line 90
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    check-cast p1, Lr0/f$d;

    .line 95
    .line 96
    iget-wide p1, p1, Lr0/f$e;->s:J

    .line 97
    .line 98
    move-wide v9, p1

    .line 99
    goto :goto_1

    .line 100
    :cond_2
    move-wide v9, v7

    .line 101
    :goto_1
    move-object v4, p3

    .line 102
    invoke-virtual/range {v4 .. v10}, Lk0/d1;->a(JJJ)J

    .line 103
    .line 104
    .line 105
    move-result-wide p1

    .line 106
    add-long/2addr p1, v1

    .line 107
    :cond_3
    :goto_2
    return-wide p1
.end method

.method public d(Lq0/j;)I
    .locals 8

    .line 1
    iget v0, p1, Lq0/j;->o:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return v2

    .line 8
    :cond_0
    iget-object v0, p0, Lq0/f;->e:[Landroid/net/Uri;

    .line 9
    .line 10
    iget-object v1, p0, Lq0/f;->h:Ld0/J;

    .line 11
    .line 12
    iget-object v3, p1, Ly0/e;->d:Ld0/q;

    .line 13
    .line 14
    invoke-virtual {v1, v3}, Ld0/J;->b(Ld0/q;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    aget-object v0, v0, v1

    .line 19
    .line 20
    iget-object v1, p0, Lq0/f;->g:Lr0/k;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-interface {v1, v0, v3}, Lr0/k;->k(Landroid/net/Uri;Z)Lr0/f;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lr0/f;

    .line 32
    .line 33
    iget-wide v4, p1, Ly0/m;->j:J

    .line 34
    .line 35
    iget-wide v6, v0, Lr0/f;->k:J

    .line 36
    .line 37
    sub-long/2addr v4, v6

    .line 38
    long-to-int v1, v4

    .line 39
    if-gez v1, :cond_1

    .line 40
    .line 41
    return v2

    .line 42
    :cond_1
    iget-object v4, v0, Lr0/f;->r:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-ge v1, v4, :cond_2

    .line 49
    .line 50
    iget-object v4, v0, Lr0/f;->r:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Lr0/f$d;

    .line 57
    .line 58
    iget-object v1, v1, Lr0/f$d;->A:Ljava/util/List;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    iget-object v1, v0, Lr0/f;->s:Ljava/util/List;

    .line 62
    .line 63
    :goto_0
    iget v4, p1, Lq0/j;->o:I

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    const/4 v6, 0x2

    .line 70
    if-lt v4, v5, :cond_3

    .line 71
    .line 72
    return v6

    .line 73
    :cond_3
    iget v4, p1, Lq0/j;->o:I

    .line 74
    .line 75
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Lr0/f$b;

    .line 80
    .line 81
    iget-boolean v4, v1, Lr0/f$b;->A:Z

    .line 82
    .line 83
    if-eqz v4, :cond_4

    .line 84
    .line 85
    return v3

    .line 86
    :cond_4
    iget-object v0, v0, Lr0/h;->a:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v1, v1, Lr0/f$e;->o:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v0, v1}, Lg0/G;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iget-object p1, p1, Ly0/e;->b:Li0/k;

    .line 99
    .line 100
    iget-object p1, p1, Li0/k;->a:Landroid/net/Uri;

    .line 101
    .line 102
    invoke-static {v0, p1}, Lg0/M;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_5

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_5
    move v2, v6

    .line 110
    :goto_1
    return v2
.end method

.method public f(Lk0/y0;JLjava/util/List;ZLq0/f$b;)V
    .locals 34

    .line 1
    move-object/from16 v8, p0

    move-wide/from16 v9, p2

    move-object/from16 v11, p6

    invoke-interface/range {p4 .. p4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v15, 0x0

    goto :goto_0

    :cond_0
    invoke-static/range {p4 .. p4}, LX2/B;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq0/j;

    move-object v15, v0

    :goto_0
    if-nez v15, :cond_1

    move-object/from16 v0, p1

    const/4 v14, -0x1

    goto :goto_1

    :cond_1
    iget-object v0, v8, Lq0/f;->h:Ld0/J;

    iget-object v1, v15, Ly0/e;->d:Ld0/q;

    invoke-virtual {v0, v1}, Ld0/J;->b(Ld0/q;)I

    move-result v0

    move v14, v0

    move-object/from16 v0, p1

    :goto_1
    iget-wide v0, v0, Lk0/y0;->a:J

    sub-long v2, v9, v0

    invoke-virtual {v8, v0, v1}, Lq0/f;->u(J)J

    move-result-wide v4

    if-eqz v15, :cond_2

    iget-boolean v6, v8, Lq0/f;->q:Z

    if-nez v6, :cond_2

    invoke-virtual {v15}, Ly0/e;->d()J

    move-result-wide v6

    sub-long/2addr v2, v6

    const-wide/16 v12, 0x0

    invoke-static {v12, v13, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v16, v4, v16

    if-eqz v16, :cond_2

    sub-long/2addr v4, v6

    invoke-static {v12, v13, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    :cond_2
    move-wide/from16 v19, v2

    move-wide/from16 v21, v4

    invoke-virtual {v8, v15, v9, v10}, Lq0/f;->a(Lq0/j;J)[Ly0/n;

    move-result-object v24

    iget-object v2, v8, Lq0/f;->r:LA0/y;

    move-object/from16 v16, v2

    move-wide/from16 v17, v0

    move-object/from16 v23, p4

    invoke-interface/range {v16 .. v24}, LA0/y;->v(JJJLjava/util/List;[Ly0/n;)V

    iget-object v0, v8, Lq0/f;->r:LA0/y;

    invoke-interface {v0}, LA0/y;->l()I

    move-result v12

    const/4 v6, 0x1

    if-eq v14, v12, :cond_3

    move/from16 v16, v6

    goto :goto_2

    :cond_3
    const/16 v16, 0x0

    :goto_2
    iget-object v0, v8, Lq0/f;->e:[Landroid/net/Uri;

    aget-object v7, v0, v12

    iget-object v0, v8, Lq0/f;->g:Lr0/k;

    invoke-interface {v0, v7}, Lr0/k;->d(Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_4

    iput-object v7, v11, Lq0/f$b;->c:Landroid/net/Uri;

    iget-boolean v0, v8, Lq0/f;->t:Z

    iget-object v1, v8, Lq0/f;->p:Landroid/net/Uri;

    invoke-virtual {v7, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v1

    and-int/2addr v0, v1

    iput-boolean v0, v8, Lq0/f;->t:Z

    iput-object v7, v8, Lq0/f;->p:Landroid/net/Uri;

    return-void

    :cond_4
    iget-object v0, v8, Lq0/f;->g:Lr0/k;

    invoke-interface {v0, v7, v6}, Lr0/k;->k(Landroid/net/Uri;Z)Lr0/f;

    move-result-object v4

    invoke-static {v4}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, v4, Lr0/h;->c:Z

    iput-boolean v0, v8, Lq0/f;->q:Z

    invoke-virtual {v8, v4}, Lq0/f;->y(Lr0/f;)V

    iget-wide v0, v4, Lr0/f;->h:J

    iget-object v2, v8, Lq0/f;->g:Lr0/k;

    invoke-interface {v2}, Lr0/k;->m()J

    move-result-wide v2

    sub-long v17, v0, v2

    move-object/from16 v0, p0

    move-object v1, v15

    move/from16 v2, v16

    move-object v3, v4

    move-object v13, v4

    move-wide/from16 v4, v17

    move v9, v6

    move-object v10, v7

    move-wide/from16 v6, p2

    invoke-virtual/range {v0 .. v7}, Lq0/f;->g(Lq0/j;ZLr0/f;JJ)Landroid/util/Pair;

    move-result-object v0

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-wide v3, v13, Lr0/f;->k:J

    cmp-long v3, v1, v3

    if-gez v3, :cond_5

    if-eqz v15, :cond_5

    if-eqz v16, :cond_5

    iget-object v0, v8, Lq0/f;->e:[Landroid/net/Uri;

    aget-object v10, v0, v14

    iget-object v0, v8, Lq0/f;->g:Lr0/k;

    invoke-interface {v0, v10, v9}, Lr0/k;->k(Landroid/net/Uri;Z)Lr0/f;

    move-result-object v12

    invoke-static {v12}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v0, v12, Lr0/f;->h:J

    iget-object v2, v8, Lq0/f;->g:Lr0/k;

    invoke-interface {v2}, Lr0/k;->m()J

    move-result-wide v2

    sub-long v16, v0, v2

    const/4 v2, 0x0

    move-object/from16 v0, p0

    move-object v1, v15

    move-object v3, v12

    move-wide/from16 v4, v16

    move-wide/from16 v6, p2

    invoke-virtual/range {v0 .. v7}, Lq0/f;->g(Lq0/j;ZLr0/f;JJ)Landroid/util/Pair;

    move-result-object v0

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move-object v7, v12

    move v12, v14

    goto :goto_3

    :cond_5
    move-object v7, v13

    move-wide/from16 v16, v17

    :goto_3
    if-eq v12, v14, :cond_6

    const/4 v3, -0x1

    if-eq v14, v3, :cond_6

    iget-object v3, v8, Lq0/f;->e:[Landroid/net/Uri;

    aget-object v3, v3, v14

    iget-object v4, v8, Lq0/f;->g:Lr0/k;

    invoke-interface {v4, v3}, Lr0/k;->g(Landroid/net/Uri;)V

    :cond_6
    iget-wide v3, v7, Lr0/f;->k:J

    cmp-long v3, v1, v3

    if-gez v3, :cond_7

    new-instance v0, Lx0/b;

    invoke-direct {v0}, Lx0/b;-><init>()V

    iput-object v0, v8, Lq0/f;->o:Ljava/io/IOException;

    return-void

    :cond_7
    invoke-static {v7, v1, v2, v0}, Lq0/f;->h(Lr0/f;JI)Lq0/f$e;

    move-result-object v0

    if-nez v0, :cond_a

    iget-boolean v0, v7, Lr0/f;->o:Z

    if-nez v0, :cond_8

    iput-object v10, v11, Lq0/f$b;->c:Landroid/net/Uri;

    iget-boolean v0, v8, Lq0/f;->t:Z

    iget-object v1, v8, Lq0/f;->p:Landroid/net/Uri;

    invoke-virtual {v10, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v1

    and-int/2addr v0, v1

    iput-boolean v0, v8, Lq0/f;->t:Z

    iput-object v10, v8, Lq0/f;->p:Landroid/net/Uri;

    return-void

    :cond_8
    if-nez p5, :cond_b

    iget-object v0, v7, Lr0/f;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_4

    :cond_9
    new-instance v0, Lq0/f$e;

    iget-object v1, v7, Lr0/f;->r:Ljava/util/List;

    invoke-static {v1}, LX2/B;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr0/f$e;

    iget-wide v2, v7, Lr0/f;->k:J

    iget-object v4, v7, Lr0/f;->r:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    int-to-long v4, v4

    add-long/2addr v2, v4

    const-wide/16 v4, 0x1

    sub-long/2addr v2, v4

    const/4 v4, -0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lq0/f$e;-><init>(Lr0/f$e;JI)V

    :cond_a
    const/4 v1, 0x0

    goto :goto_5

    :cond_b
    :goto_4
    iput-boolean v9, v11, Lq0/f$b;->b:Z

    return-void

    :goto_5
    iput-boolean v1, v8, Lq0/f;->t:Z

    const/4 v1, 0x0

    iput-object v1, v8, Lq0/f;->p:Landroid/net/Uri;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iput-wide v1, v8, Lq0/f;->u:J

    iget-object v1, v0, Lq0/f$e;->a:Lr0/f$e;

    iget-object v1, v1, Lr0/f$e;->p:Lr0/f$d;

    invoke-static {v7, v1}, Lq0/f;->e(Lr0/f;Lr0/f$e;)Landroid/net/Uri;

    move-result-object v14

    const/4 v13, 0x0

    invoke-virtual {v8, v14, v12, v9, v13}, Lq0/f;->n(Landroid/net/Uri;IZLB0/g$a;)Ly0/e;

    move-result-object v1

    iput-object v1, v11, Lq0/f$b;->a:Ly0/e;

    if-eqz v1, :cond_c

    return-void

    :cond_c
    iget-object v1, v0, Lq0/f$e;->a:Lr0/f$e;

    invoke-static {v7, v1}, Lq0/f;->e(Lr0/f;Lr0/f$e;)Landroid/net/Uri;

    move-result-object v9

    const/4 v1, 0x0

    invoke-virtual {v8, v9, v12, v1, v13}, Lq0/f;->n(Landroid/net/Uri;IZLB0/g$a;)Ly0/e;

    move-result-object v1

    iput-object v1, v11, Lq0/f$b;->a:Ly0/e;

    if-eqz v1, :cond_d

    return-void

    :cond_d
    move-object v1, v15

    move-object v2, v10

    move-object v3, v7

    move-object v4, v0

    move-wide/from16 v5, v16

    invoke-static/range {v1 .. v6}, Lq0/j;->w(Lq0/j;Landroid/net/Uri;Lr0/f;Lq0/f$e;J)Z

    move-result v31

    if-eqz v31, :cond_e

    iget-boolean v1, v0, Lq0/f$e;->d:Z

    if-eqz v1, :cond_e

    return-void

    :cond_e
    iget-object v1, v8, Lq0/f;->a:Lq0/h;

    move-object v2, v13

    move-object v13, v1

    iget-object v1, v8, Lq0/f;->b:Li0/g;

    move-object v3, v14

    move-object v14, v1

    iget-object v1, v8, Lq0/f;->f:[Ld0/q;

    aget-object v1, v1, v12

    move-object v12, v15

    move-object v15, v1

    iget-object v1, v8, Lq0/f;->i:Ljava/util/List;

    move-object/from16 v21, v1

    iget-object v1, v8, Lq0/f;->r:LA0/y;

    invoke-interface {v1}, LA0/y;->n()I

    move-result v22

    iget-object v1, v8, Lq0/f;->r:LA0/y;

    invoke-interface {v1}, LA0/y;->s()Ljava/lang/Object;

    move-result-object v23

    iget-boolean v1, v8, Lq0/f;->m:Z

    move/from16 v24, v1

    iget-object v1, v8, Lq0/f;->d:Lq0/v;

    move-object/from16 v25, v1

    iget-wide v4, v8, Lq0/f;->l:J

    move-wide/from16 v26, v4

    iget-object v1, v8, Lq0/f;->j:Lq0/e;

    invoke-virtual {v1, v9}, Lq0/e;->a(Landroid/net/Uri;)[B

    move-result-object v29

    iget-object v1, v8, Lq0/f;->j:Lq0/e;

    invoke-virtual {v1, v3}, Lq0/e;->a(Landroid/net/Uri;)[B

    move-result-object v30

    iget-object v1, v8, Lq0/f;->k:Ll0/y1;

    move-object/from16 v32, v1

    move-object/from16 v18, v7

    move-object/from16 v19, v0

    move-object/from16 v20, v10

    move-object/from16 v28, v12

    move-object/from16 v33, v2

    invoke-static/range {v13 .. v33}, Lq0/j;->j(Lq0/h;Li0/g;Ld0/q;JLr0/f;Lq0/f$e;Landroid/net/Uri;Ljava/util/List;ILjava/lang/Object;ZLq0/v;JLq0/j;[B[BZLl0/y1;LB0/g$a;)Lq0/j;

    move-result-object v0

    iput-object v0, v11, Lq0/f$b;->a:Ly0/e;

    return-void
.end method

.method public final g(Lq0/j;ZLr0/f;JJ)Landroid/util/Pair;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, -0x1

    .line 3
    if-eqz p1, :cond_4

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    goto :goto_3

    .line 8
    :cond_0
    invoke-virtual {p1}, Lq0/j;->h()Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-eqz p2, :cond_3

    .line 13
    .line 14
    new-instance p2, Landroid/util/Pair;

    .line 15
    .line 16
    iget p3, p1, Lq0/j;->o:I

    .line 17
    .line 18
    if-ne p3, v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Ly0/m;->g()J

    .line 21
    .line 22
    .line 23
    move-result-wide p3

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-wide p3, p1, Ly0/m;->j:J

    .line 26
    .line 27
    :goto_0
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    iget p1, p1, Lq0/j;->o:I

    .line 32
    .line 33
    if-ne p1, v1, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    add-int/lit8 v1, p1, 0x1

    .line 37
    .line 38
    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {p2, p3, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_3
    new-instance p2, Landroid/util/Pair;

    .line 47
    .line 48
    iget-wide p3, p1, Ly0/m;->j:J

    .line 49
    .line 50
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    iget p1, p1, Lq0/j;->o:I

    .line 55
    .line 56
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {p2, p3, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :goto_2
    return-object p2

    .line 64
    :cond_4
    :goto_3
    iget-wide v2, p3, Lr0/f;->u:J

    .line 65
    .line 66
    add-long/2addr v2, p4

    .line 67
    if-eqz p1, :cond_6

    .line 68
    .line 69
    iget-boolean p2, p0, Lq0/f;->q:Z

    .line 70
    .line 71
    if-eqz p2, :cond_5

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_5
    iget-wide p6, p1, Ly0/e;->g:J

    .line 75
    .line 76
    :cond_6
    :goto_4
    iget-boolean p2, p3, Lr0/f;->o:Z

    .line 77
    .line 78
    if-nez p2, :cond_7

    .line 79
    .line 80
    cmp-long p2, p6, v2

    .line 81
    .line 82
    if-ltz p2, :cond_7

    .line 83
    .line 84
    new-instance p1, Landroid/util/Pair;

    .line 85
    .line 86
    iget-wide p4, p3, Lr0/f;->k:J

    .line 87
    .line 88
    iget-object p2, p3, Lr0/f;->r:Ljava/util/List;

    .line 89
    .line 90
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    int-to-long p2, p2

    .line 95
    add-long/2addr p4, p2

    .line 96
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    return-object p1

    .line 108
    :cond_7
    sub-long/2addr p6, p4

    .line 109
    iget-object p2, p3, Lr0/f;->r:Ljava/util/List;

    .line 110
    .line 111
    invoke-static {p6, p7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 112
    .line 113
    .line 114
    move-result-object p4

    .line 115
    iget-object p5, p0, Lq0/f;->g:Lr0/k;

    .line 116
    .line 117
    invoke-interface {p5}, Lr0/k;->a()Z

    .line 118
    .line 119
    .line 120
    move-result p5

    .line 121
    const/4 v2, 0x0

    .line 122
    if-eqz p5, :cond_9

    .line 123
    .line 124
    if-nez p1, :cond_8

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_8
    move p1, v2

    .line 128
    goto :goto_6

    .line 129
    :cond_9
    :goto_5
    move p1, v0

    .line 130
    :goto_6
    invoke-static {p2, p4, v0, p1}, Lg0/M;->f(Ljava/util/List;Ljava/lang/Comparable;ZZ)I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    int-to-long p4, p1

    .line 135
    iget-wide v3, p3, Lr0/f;->k:J

    .line 136
    .line 137
    add-long/2addr p4, v3

    .line 138
    if-ltz p1, :cond_d

    .line 139
    .line 140
    iget-object p2, p3, Lr0/f;->r:Ljava/util/List;

    .line 141
    .line 142
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    check-cast p1, Lr0/f$d;

    .line 147
    .line 148
    iget-wide v3, p1, Lr0/f$e;->s:J

    .line 149
    .line 150
    iget-wide v5, p1, Lr0/f$e;->q:J

    .line 151
    .line 152
    add-long/2addr v3, v5

    .line 153
    cmp-long p2, p6, v3

    .line 154
    .line 155
    if-gez p2, :cond_a

    .line 156
    .line 157
    iget-object p1, p1, Lr0/f$d;->A:Ljava/util/List;

    .line 158
    .line 159
    goto :goto_7

    .line 160
    :cond_a
    iget-object p1, p3, Lr0/f;->s:Ljava/util/List;

    .line 161
    .line 162
    :goto_7
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    if-ge v2, p2, :cond_d

    .line 167
    .line 168
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    check-cast p2, Lr0/f$b;

    .line 173
    .line 174
    iget-wide v3, p2, Lr0/f$e;->s:J

    .line 175
    .line 176
    iget-wide v5, p2, Lr0/f$e;->q:J

    .line 177
    .line 178
    add-long/2addr v3, v5

    .line 179
    cmp-long v0, p6, v3

    .line 180
    .line 181
    if-gez v0, :cond_c

    .line 182
    .line 183
    iget-boolean p2, p2, Lr0/f$b;->z:Z

    .line 184
    .line 185
    if-eqz p2, :cond_d

    .line 186
    .line 187
    iget-object p2, p3, Lr0/f;->s:Ljava/util/List;

    .line 188
    .line 189
    if-ne p1, p2, :cond_b

    .line 190
    .line 191
    const-wide/16 p1, 0x1

    .line 192
    .line 193
    goto :goto_8

    .line 194
    :cond_b
    const-wide/16 p1, 0x0

    .line 195
    .line 196
    :goto_8
    add-long/2addr p4, p1

    .line 197
    move v1, v2

    .line 198
    goto :goto_9

    .line 199
    :cond_c
    add-int/lit8 v2, v2, 0x1

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_d
    :goto_9
    new-instance p1, Landroid/util/Pair;

    .line 203
    .line 204
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object p3

    .line 212
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    return-object p1
.end method

.method public i(JLjava/util/List;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lq0/f;->o:Ljava/io/IOException;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lq0/f;->r:LA0/y;

    .line 6
    .line 7
    invoke-interface {v0}, LA0/B;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lq0/f;->r:LA0/y;

    .line 16
    .line 17
    invoke-interface {v0, p1, p2, p3}, LA0/y;->k(JLjava/util/List;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
.end method

.method public k()Ld0/J;
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/f;->h:Ld0/J;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()LA0/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/f;->r:LA0/y;

    .line 2
    .line 3
    return-object v0
.end method

.method public m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq0/f;->q:Z

    .line 2
    .line 3
    return v0
.end method

.method public final n(Landroid/net/Uri;IZLB0/g$a;)Ly0/e;
    .locals 7

    .line 1
    const/4 p3, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object p3

    .line 5
    :cond_0
    iget-object p4, p0, Lq0/f;->j:Lq0/e;

    .line 6
    .line 7
    invoke-virtual {p4, p1}, Lq0/e;->c(Landroid/net/Uri;)[B

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    if-eqz p4, :cond_1

    .line 12
    .line 13
    iget-object p2, p0, Lq0/f;->j:Lq0/e;

    .line 14
    .line 15
    invoke-virtual {p2, p1, p4}, Lq0/e;->b(Landroid/net/Uri;[B)[B

    .line 16
    .line 17
    .line 18
    return-object p3

    .line 19
    :cond_1
    new-instance p3, Li0/k$b;

    .line 20
    .line 21
    invoke-direct {p3}, Li0/k$b;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p3, p1}, Li0/k$b;->i(Landroid/net/Uri;)Li0/k$b;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 p3, 0x1

    .line 29
    invoke-virtual {p1, p3}, Li0/k$b;->b(I)Li0/k$b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Li0/k$b;->a()Li0/k;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance p1, Lq0/f$a;

    .line 38
    .line 39
    iget-object v1, p0, Lq0/f;->c:Li0/g;

    .line 40
    .line 41
    iget-object p3, p0, Lq0/f;->f:[Ld0/q;

    .line 42
    .line 43
    aget-object v3, p3, p2

    .line 44
    .line 45
    iget-object p2, p0, Lq0/f;->r:LA0/y;

    .line 46
    .line 47
    invoke-interface {p2}, LA0/y;->n()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    iget-object p2, p0, Lq0/f;->r:LA0/y;

    .line 52
    .line 53
    invoke-interface {p2}, LA0/y;->s()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    iget-object v6, p0, Lq0/f;->n:[B

    .line 58
    .line 59
    move-object v0, p1

    .line 60
    invoke-direct/range {v0 .. v6}, Lq0/f$a;-><init>(Li0/g;Li0/k;Ld0/q;ILjava/lang/Object;[B)V

    .line 61
    .line 62
    .line 63
    return-object p1
.end method

.method public o(Ly0/e;J)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lq0/f;->r:LA0/y;

    .line 2
    .line 3
    iget-object v1, p0, Lq0/f;->h:Ld0/J;

    .line 4
    .line 5
    iget-object p1, p1, Ly0/e;->d:Ld0/q;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Ld0/J;->b(Ld0/q;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-interface {v0, p1}, LA0/B;->e(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-interface {v0, p1, p2, p3}, LA0/y;->p(IJ)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
.end method

.method public p()V
    .locals 2

    .line 1
    iget-object v0, p0, Lq0/f;->o:Ljava/io/IOException;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lq0/f;->p:Landroid/net/Uri;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-boolean v1, p0, Lq0/f;->t:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lq0/f;->g:Lr0/k;

    .line 14
    .line 15
    invoke-interface {v1, v0}, Lr0/k;->h(Landroid/net/Uri;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void

    .line 19
    :cond_1
    throw v0
.end method

.method public q(Landroid/net/Uri;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/f;->e:[Landroid/net/Uri;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lg0/M;->s([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public r(Ly0/e;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lq0/f$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lq0/f$a;

    .line 6
    .line 7
    invoke-virtual {p1}, Ly0/k;->h()[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lq0/f;->n:[B

    .line 12
    .line 13
    iget-object v0, p0, Lq0/f;->j:Lq0/e;

    .line 14
    .line 15
    iget-object v1, p1, Ly0/e;->b:Li0/k;

    .line 16
    .line 17
    iget-object v1, v1, Li0/k;->a:Landroid/net/Uri;

    .line 18
    .line 19
    invoke-virtual {p1}, Lq0/f$a;->j()[B

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, [B

    .line 28
    .line 29
    invoke-virtual {v0, v1, p1}, Lq0/e;->b(Landroid/net/Uri;[B)[B

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public s(Landroid/net/Uri;J)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lq0/f;->e:[Landroid/net/Uri;

    .line 4
    .line 5
    array-length v3, v2

    .line 6
    const/4 v4, -0x1

    .line 7
    if-ge v1, v3, :cond_1

    .line 8
    .line 9
    aget-object v2, v2, v1

    .line 10
    .line 11
    invoke-virtual {v2, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move v1, v4

    .line 22
    :goto_1
    const/4 v2, 0x1

    .line 23
    if-ne v1, v4, :cond_2

    .line 24
    .line 25
    return v2

    .line 26
    :cond_2
    iget-object v3, p0, Lq0/f;->r:LA0/y;

    .line 27
    .line 28
    invoke-interface {v3, v1}, LA0/B;->e(I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-ne v1, v4, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-boolean v3, p0, Lq0/f;->t:Z

    .line 36
    .line 37
    iget-object v4, p0, Lq0/f;->p:Landroid/net/Uri;

    .line 38
    .line 39
    invoke-virtual {p1, v4}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    or-int/2addr v3, v4

    .line 44
    iput-boolean v3, p0, Lq0/f;->t:Z

    .line 45
    .line 46
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    cmp-long v3, p2, v3

    .line 52
    .line 53
    if-eqz v3, :cond_4

    .line 54
    .line 55
    iget-object v3, p0, Lq0/f;->r:LA0/y;

    .line 56
    .line 57
    invoke-interface {v3, v1, p2, p3}, LA0/y;->p(IJ)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_5

    .line 62
    .line 63
    iget-object v1, p0, Lq0/f;->g:Lr0/k;

    .line 64
    .line 65
    invoke-interface {v1, p1, p2, p3}, Lr0/k;->c(Landroid/net/Uri;J)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_5

    .line 70
    .line 71
    :cond_4
    move v0, v2

    .line 72
    :cond_5
    return v0
.end method

.method public t()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lq0/f;->b()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lq0/f;->o:Ljava/io/IOException;

    .line 6
    .line 7
    return-void
.end method

.method public final u(J)J
    .locals 5

    .line 1
    iget-wide v0, p0, Lq0/f;->s:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    if-eqz v4, :cond_0

    .line 11
    .line 12
    sub-long v2, v0, p1

    .line 13
    .line 14
    :cond_0
    return-wide v2
.end method

.method public v(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lq0/f;->m:Z

    .line 2
    .line 3
    return-void
.end method

.method public w(LA0/y;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lq0/f;->b()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq0/f;->r:LA0/y;

    .line 5
    .line 6
    return-void
.end method

.method public x(JLy0/e;Ljava/util/List;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/f;->o:Ljava/io/IOException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    iget-object v0, p0, Lq0/f;->r:LA0/y;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3, p4}, LA0/y;->q(JLy0/e;Ljava/util/List;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final y(Lr0/f;)V
    .locals 4

    .line 1
    iget-boolean v0, p1, Lr0/f;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p1}, Lr0/f;->e()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-object p1, p0, Lq0/f;->g:Lr0/k;

    .line 16
    .line 17
    invoke-interface {p1}, Lr0/k;->m()J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    sub-long/2addr v0, v2

    .line 22
    :goto_0
    iput-wide v0, p0, Lq0/f;->s:J

    .line 23
    .line 24
    return-void
.end method
