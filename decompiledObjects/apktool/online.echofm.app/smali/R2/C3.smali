.class public final LR2/C3;
.super LR2/f1;
.source "SourceFile"


# instance fields
.field public c:LR2/k4;

.field public d:LR2/v3;

.field public final e:Ljava/util/Set;

.field public f:Z

.field public final g:Ljava/util/concurrent/atomic/AtomicReference;

.field public final h:Ljava/lang/Object;

.field public i:Z

.field public j:Ljava/util/PriorityQueue;

.field public k:LR2/q3;

.field public final l:Ljava/util/concurrent/atomic/AtomicLong;

.field public m:J

.field public final n:LR2/c6;

.field public o:Z

.field public p:LR2/x;

.field public final q:LR2/U5;


# direct methods
.method public constructor <init>(LR2/N2;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, LR2/f1;-><init>(LR2/N2;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LR2/C3;->e:Ljava/util/Set;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LR2/C3;->h:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, LR2/C3;->i:Z

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, LR2/C3;->o:Z

    .line 23
    .line 24
    new-instance v0, LR2/c4;

    .line 25
    .line 26
    invoke-direct {v0, p0}, LR2/c4;-><init>(LR2/C3;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, LR2/C3;->q:LR2/U5;

    .line 30
    .line 31
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, LR2/C3;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 37
    .line 38
    sget-object v0, LR2/q3;->c:LR2/q3;

    .line 39
    .line 40
    iput-object v0, p0, LR2/C3;->k:LR2/q3;

    .line 41
    .line 42
    const-wide/16 v0, -0x1

    .line 43
    .line 44
    iput-wide v0, p0, LR2/C3;->m:J

    .line 45
    .line 46
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 47
    .line 48
    const-wide/16 v1, 0x0

    .line 49
    .line 50
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, LR2/C3;->l:Ljava/util/concurrent/atomic/AtomicLong;

    .line 54
    .line 55
    new-instance v0, LR2/c6;

    .line 56
    .line 57
    invoke-direct {v0, p1}, LR2/c6;-><init>(LR2/N2;)V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, LR2/C3;->n:LR2/c6;

    .line 61
    .line 62
    return-void
.end method

.method public static bridge synthetic B(LR2/C3;)LR2/x;
    .locals 0

    .line 1
    iget-object p0, p0, LR2/C3;->p:LR2/x;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic K(LR2/C3;LR2/q3;JZZ)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LR2/l2;->J()LR2/q3;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-wide v1, p0, LR2/C3;->m:J

    .line 16
    .line 17
    cmp-long v1, p2, v1

    .line 18
    .line 19
    if-gtz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, LR2/q3;->b()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p1}, LR2/q3;->b()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {v0, v1}, LR2/q3;->k(II)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, LR2/Y1;->J()LR2/a2;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-string p2, "Dropped out-of-date consent setting, proposed settings"

    .line 44
    .line 45
    invoke-virtual {p0, p2, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0, p1}, LR2/l2;->A(LR2/q3;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    iput-wide p2, p0, LR2/C3;->m:J

    .line 60
    .line 61
    invoke-virtual {p0}, LR2/G1;->t()LR2/D4;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1, p4}, LR2/D4;->U(Z)V

    .line 66
    .line 67
    .line 68
    if-eqz p5, :cond_2

    .line 69
    .line 70
    invoke-virtual {p0}, LR2/G1;->t()LR2/D4;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 75
    .line 76
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p1}, LR2/D4;->Q(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_1
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p0}, LR2/Y1;->J()LR2/a2;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p1}, LR2/q3;->b()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    const-string p2, "Lower precedence consent source ignored, proposed source"

    .line 100
    .line 101
    invoke-virtual {p0, p2, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_2
    return-void
.end method

.method public static synthetic L(LR2/C3;LR2/q3;LR2/q3;)V
    .locals 6

    .line 1
    sget-object v0, LR2/q3$a;->q:LR2/q3$a;

    .line 2
    .line 3
    sget-object v1, LR2/q3$a;->p:LR2/q3$a;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    new-array v3, v2, [LR2/q3$a;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    aput-object v0, v3, v4

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    aput-object v1, v3, v5

    .line 13
    .line 14
    invoke-virtual {p1, p2, v3}, LR2/q3;->m(LR2/q3;[LR2/q3$a;)Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    new-array v2, v2, [LR2/q3$a;

    .line 19
    .line 20
    aput-object v0, v2, v4

    .line 21
    .line 22
    aput-object v1, v2, v5

    .line 23
    .line 24
    invoke-virtual {p1, p2, v2}, LR2/q3;->r(LR2/q3;[LR2/q3$a;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    :cond_0
    invoke-virtual {p0}, LR2/G1;->p()LR2/S1;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, LR2/S1;->I()V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public static bridge synthetic M(LR2/C3;Ljava/lang/Boolean;Z)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    invoke-virtual {p0, p1, p2}, LR2/C3;->S(Ljava/lang/Boolean;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static bridge synthetic N(LR2/C3;Z)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, LR2/C3;->i:Z

    .line 3
    .line 4
    return-void
.end method

.method public static synthetic v0(LR2/C3;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LR2/C3;->t0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final C(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 9

    .line 1
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/G2;->J()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string p2, "Cannot get conditional user properties from analytics worker thread"

    .line 21
    .line 22
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_0
    invoke-static {}, LR2/f;->a()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string p2, "Cannot get conditional user properties from main thread"

    .line 46
    .line 47
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    new-instance p1, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, LR2/m3;->a:LR2/N2;

    .line 62
    .line 63
    invoke-virtual {v1}, LR2/N2;->e()LR2/G2;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    new-instance v8, LR2/b4;

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    move-object v2, v8

    .line 71
    move-object v3, p0

    .line 72
    move-object v4, v0

    .line 73
    move-object v6, p1

    .line 74
    move-object v7, p2

    .line 75
    invoke-direct/range {v2 .. v7}, LR2/b4;-><init>(LR2/C3;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-wide/16 v4, 0x1388

    .line 79
    .line 80
    const-string v6, "get conditional user properties"

    .line 81
    .line 82
    move-object v2, v1

    .line 83
    move-object v3, v0

    .line 84
    move-object v7, v8

    .line 85
    invoke-virtual/range {v2 .. v7}, LR2/G2;->v(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, Ljava/util/List;

    .line 93
    .line 94
    if-nez p1, :cond_2

    .line 95
    .line 96
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    const-string p2, "Timed out waiting for get conditional user properties"

    .line 105
    .line 106
    const/4 v0, 0x0

    .line 107
    invoke-virtual {p1, p2, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    new-instance p1, Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 113
    .line 114
    .line 115
    return-object p1

    .line 116
    :cond_2
    invoke-static {p1}, LR2/S5;->t0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    return-object p1
.end method

.method public final D(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;
    .locals 10

    .line 1
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/G2;->J()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string p2, "Cannot get user properties from analytics worker thread"

    .line 20
    .line 21
    :goto_0
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :goto_1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_0
    invoke-static {}, LR2/f;->a()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string p2, "Cannot get user properties from main thread"

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    new-instance v7, Ljava/util/concurrent/atomic/AtomicReference;

    .line 47
    .line 48
    invoke-direct {v7}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, LR2/m3;->a:LR2/N2;

    .line 52
    .line 53
    invoke-virtual {v0}, LR2/N2;->e()LR2/G2;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    new-instance v9, LR2/a4;

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    move-object v0, v9

    .line 61
    move-object v1, p0

    .line 62
    move-object v2, v7

    .line 63
    move-object v4, p1

    .line 64
    move-object v5, p2

    .line 65
    move v6, p3

    .line 66
    invoke-direct/range {v0 .. v6}, LR2/a4;-><init>(LR2/C3;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-wide/16 v2, 0x1388

    .line 70
    .line 71
    const-string v4, "get user properties"

    .line 72
    .line 73
    move-object v0, v8

    .line 74
    move-object v1, v7

    .line 75
    move-object v5, v9

    .line 76
    invoke-virtual/range {v0 .. v5}, LR2/G2;->v(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Ljava/util/List;

    .line 84
    .line 85
    if-nez p1, :cond_2

    .line 86
    .line 87
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    const-string p3, "Timed out waiting for handle get user properties, includeInternal"

    .line 100
    .line 101
    invoke-virtual {p1, p3, p2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    new-instance p2, Lt/a;

    .line 106
    .line 107
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 108
    .line 109
    .line 110
    move-result p3

    .line 111
    invoke-direct {p2, p3}, Lt/a;-><init>(I)V

    .line 112
    .line 113
    .line 114
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result p3

    .line 122
    if-eqz p3, :cond_4

    .line 123
    .line 124
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p3

    .line 128
    check-cast p3, LR2/R5;

    .line 129
    .line 130
    invoke-virtual {p3}, LR2/R5;->a()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-eqz v0, :cond_3

    .line 135
    .line 136
    iget-object p3, p3, LR2/R5;->p:Ljava/lang/String;

    .line 137
    .line 138
    invoke-interface {p2, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_4
    return-object p2
.end method

.method public final E(JZ)V
    .locals 5

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "Resetting analytics data (FE)"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, LR2/G1;->u()LR2/l5;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 25
    .line 26
    .line 27
    iget-object v0, v0, LR2/l5;->f:LR2/r5;

    .line 28
    .line 29
    invoke-virtual {v0}, LR2/r5;->b()V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lcom/google/android/gms/internal/measurement/s7;->a()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sget-object v1, LR2/K;->x0:LR2/P1;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, LR2/g;->s(LR2/P1;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    invoke-virtual {p0}, LR2/G1;->p()LR2/S1;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, LR2/S1;->I()V

    .line 55
    .line 56
    .line 57
    :cond_0
    iget-object v0, p0, LR2/m3;->a:LR2/N2;

    .line 58
    .line 59
    invoke-virtual {v0}, LR2/N2;->p()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v2, v1, LR2/l2;->e:LR2/q2;

    .line 68
    .line 69
    invoke-virtual {v2, p1, p2}, LR2/q2;->b(J)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, LR2/m3;->i()LR2/l2;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object p1, p1, LR2/l2;->v:LR2/r2;

    .line 77
    .line 78
    invoke-virtual {p1}, LR2/r2;->a()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    const/4 p2, 0x0

    .line 87
    if-nez p1, :cond_1

    .line 88
    .line 89
    iget-object p1, v1, LR2/l2;->v:LR2/r2;

    .line 90
    .line 91
    invoke-virtual {p1, p2}, LR2/r2;->b(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/G6;->a()Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    const-wide/16 v2, 0x0

    .line 99
    .line 100
    if-eqz p1, :cond_2

    .line 101
    .line 102
    invoke-virtual {v1}, LR2/m3;->f()LR2/g;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    sget-object v4, LR2/K;->q0:LR2/P1;

    .line 107
    .line 108
    invoke-virtual {p1, v4}, LR2/g;->s(LR2/P1;)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eqz p1, :cond_2

    .line 113
    .line 114
    iget-object p1, v1, LR2/l2;->p:LR2/q2;

    .line 115
    .line 116
    invoke-virtual {p1, v2, v3}, LR2/q2;->b(J)V

    .line 117
    .line 118
    .line 119
    :cond_2
    iget-object p1, v1, LR2/l2;->q:LR2/q2;

    .line 120
    .line 121
    invoke-virtual {p1, v2, v3}, LR2/q2;->b(J)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, LR2/m3;->f()LR2/g;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p1}, LR2/g;->R()Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-nez p1, :cond_3

    .line 133
    .line 134
    xor-int/lit8 p1, v0, 0x1

    .line 135
    .line 136
    invoke-virtual {v1, p1}, LR2/l2;->E(Z)V

    .line 137
    .line 138
    .line 139
    :cond_3
    iget-object p1, v1, LR2/l2;->w:LR2/r2;

    .line 140
    .line 141
    invoke-virtual {p1, p2}, LR2/r2;->b(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    iget-object p1, v1, LR2/l2;->x:LR2/q2;

    .line 145
    .line 146
    invoke-virtual {p1, v2, v3}, LR2/q2;->b(J)V

    .line 147
    .line 148
    .line 149
    iget-object p1, v1, LR2/l2;->y:LR2/n2;

    .line 150
    .line 151
    invoke-virtual {p1, p2}, LR2/n2;->b(Landroid/os/Bundle;)V

    .line 152
    .line 153
    .line 154
    if-eqz p3, :cond_4

    .line 155
    .line 156
    invoke-virtual {p0}, LR2/G1;->t()LR2/D4;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-virtual {p1}, LR2/D4;->a0()V

    .line 161
    .line 162
    .line 163
    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/G6;->a()Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-eqz p1, :cond_5

    .line 168
    .line 169
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    sget-object p2, LR2/K;->q0:LR2/P1;

    .line 174
    .line 175
    invoke-virtual {p1, p2}, LR2/g;->s(LR2/P1;)Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    if-eqz p1, :cond_5

    .line 180
    .line 181
    invoke-virtual {p0}, LR2/G1;->u()LR2/l5;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    iget-object p1, p1, LR2/l5;->e:LR2/t5;

    .line 186
    .line 187
    invoke-virtual {p1}, LR2/t5;->a()V

    .line 188
    .line 189
    .line 190
    :cond_5
    xor-int/lit8 p1, v0, 0x1

    .line 191
    .line 192
    iput-boolean p1, p0, LR2/C3;->o:Z

    .line 193
    .line 194
    return-void
.end method

.method public final F(LR2/z;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LR2/j4;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, LR2/j4;-><init>(LR2/C3;LR2/z;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final G(LR2/q3;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, LR2/q3;->y()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, LR2/q3;->x()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, LR2/G1;->t()LR2/D4;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, LR2/D4;->e0()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    :cond_1
    const/4 p1, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    move p1, v1

    .line 30
    :goto_0
    iget-object v0, p0, LR2/m3;->a:LR2/N2;

    .line 31
    .line 32
    invoke-virtual {v0}, LR2/N2;->q()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eq p1, v0, :cond_4

    .line 37
    .line 38
    iget-object v0, p0, LR2/m3;->a:LR2/N2;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, LR2/N2;->w(Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, LR2/l2;->L()Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    :cond_3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p0, p1, v1}, LR2/C3;->S(Ljava/lang/Boolean;Z)V

    .line 66
    .line 67
    .line 68
    :cond_4
    return-void
.end method

.method public final H(LR2/q3;J)V
    .locals 12

    .line 1
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, LR2/q3;->b()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, -0xa

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, LR2/q3;->s()Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, LR2/q3;->u()Ljava/lang/Boolean;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, LR2/Y1;->M()LR2/a2;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string p2, "Discarding empty consent settings"

    .line 33
    .line 34
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    iget-object v2, p0, LR2/C3;->h:Ljava/lang/Object;

    .line 39
    .line 40
    monitor-enter v2

    .line 41
    :try_start_0
    iget-object v11, p0, LR2/C3;->k:LR2/q3;

    .line 42
    .line 43
    invoke-virtual {v11}, LR2/q3;->b()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-static {v0, v3}, LR2/q3;->k(II)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v4, 0x0

    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    iget-object v3, p0, LR2/C3;->k:LR2/q3;

    .line 55
    .line 56
    invoke-virtual {p1, v3}, LR2/q3;->t(LR2/q3;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-virtual {p1}, LR2/q3;->y()Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    const/4 v6, 0x1

    .line 65
    if-eqz v5, :cond_1

    .line 66
    .line 67
    iget-object v5, p0, LR2/C3;->k:LR2/q3;

    .line 68
    .line 69
    invoke-virtual {v5}, LR2/q3;->y()Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-nez v5, :cond_1

    .line 74
    .line 75
    move v4, v6

    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception p1

    .line 78
    goto/16 :goto_3

    .line 79
    .line 80
    :cond_1
    :goto_0
    iget-object v5, p0, LR2/C3;->k:LR2/q3;

    .line 81
    .line 82
    invoke-virtual {p1, v5}, LR2/q3;->o(LR2/q3;)LR2/q3;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, p0, LR2/C3;->k:LR2/q3;

    .line 87
    .line 88
    move-object v5, p1

    .line 89
    move p1, v4

    .line 90
    move v4, v6

    .line 91
    goto :goto_1

    .line 92
    :cond_2
    move-object v5, p1

    .line 93
    move p1, v4

    .line 94
    move v3, p1

    .line 95
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    if-nez v4, :cond_3

    .line 97
    .line 98
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p1}, LR2/Y1;->J()LR2/a2;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    const-string p2, "Ignoring lower-priority consent settings, proposed settings"

    .line 107
    .line 108
    invoke-virtual {p1, p2, v5}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_3
    iget-object v2, p0, LR2/C3;->l:Ljava/util/concurrent/atomic/AtomicLong;

    .line 113
    .line 114
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 115
    .line 116
    .line 117
    move-result-wide v8

    .line 118
    if-eqz v3, :cond_4

    .line 119
    .line 120
    const/4 v0, 0x0

    .line 121
    invoke-virtual {p0, v0}, LR2/C3;->T(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    new-instance v1, LR2/i4;

    .line 129
    .line 130
    move-object v3, v1

    .line 131
    move-object v4, p0

    .line 132
    move-wide v6, p2

    .line 133
    move v10, p1

    .line 134
    invoke-direct/range {v3 .. v11}, LR2/i4;-><init>(LR2/C3;LR2/q3;JJZLR2/q3;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v1}, LR2/G2;->G(Ljava/lang/Runnable;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :cond_4
    new-instance p2, LR2/l4;

    .line 142
    .line 143
    move-object v3, p2

    .line 144
    move-object v4, p0

    .line 145
    move-wide v6, v8

    .line 146
    move v8, p1

    .line 147
    move-object v9, v11

    .line 148
    invoke-direct/range {v3 .. v9}, LR2/l4;-><init>(LR2/C3;LR2/q3;JZLR2/q3;)V

    .line 149
    .line 150
    .line 151
    const/16 p1, 0x1e

    .line 152
    .line 153
    if-eq v0, p1, :cond_6

    .line 154
    .line 155
    if-ne v0, v1, :cond_5

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_5
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {p1, p2}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_6
    :goto_2
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-virtual {p1, p2}, LR2/G2;->G(Ljava/lang/Runnable;)V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :goto_3
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 175
    throw p1
.end method

.method public final I(LR2/u3;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LR2/C3;->e:Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, LR2/Y1;->L()LR2/a2;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, "OnEventListener already registered"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, LR2/a2;->a(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final J(LR2/v3;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, LR2/C3;->d:LR2/v3;

    .line 10
    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    const-string v1, "EventInterceptor already set."

    .line 19
    .line 20
    invoke-static {v0, v1}, LA2/n;->m(ZLjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iput-object p1, p0, LR2/C3;->d:LR2/v3;

    .line 24
    .line 25
    return-void
.end method

.method public final synthetic O(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p1, p1, LR2/l2;->y:LR2/n2;

    .line 8
    .line 9
    new-instance v0, Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, LR2/n2;->b(Landroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, LR2/l2;->y:LR2/n2;

    .line 23
    .line 24
    invoke-virtual {v0}, LR2/n2;->a()Landroid/os/Bundle;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    if-eqz v2, :cond_6

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    if-eqz v5, :cond_3

    .line 55
    .line 56
    instance-of v6, v5, Ljava/lang/String;

    .line 57
    .line 58
    if-nez v6, :cond_3

    .line 59
    .line 60
    instance-of v6, v5, Ljava/lang/Long;

    .line 61
    .line 62
    if-nez v6, :cond_3

    .line 63
    .line 64
    instance-of v6, v5, Ljava/lang/Double;

    .line 65
    .line 66
    if-nez v6, :cond_3

    .line 67
    .line 68
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 69
    .line 70
    .line 71
    invoke-static {v5}, LR2/S5;->g0(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_2

    .line 76
    .line 77
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 78
    .line 79
    .line 80
    iget-object v6, p0, LR2/C3;->q:LR2/U5;

    .line 81
    .line 82
    const/16 v7, 0x1b

    .line 83
    .line 84
    invoke-static {v6, v7, v4, v4, v3}, LR2/S5;->M(LR2/U5;ILjava/lang/String;Ljava/lang/String;I)V

    .line 85
    .line 86
    .line 87
    :cond_2
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v3}, LR2/Y1;->M()LR2/a2;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    const-string v4, "Invalid default event parameter type. Name, value"

    .line 96
    .line 97
    invoke-virtual {v3, v4, v2, v5}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    invoke-static {v2}, LR2/S5;->H0(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_4

    .line 106
    .line 107
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-virtual {v3}, LR2/Y1;->M()LR2/a2;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    const-string v4, "Invalid default event parameter name. Name"

    .line 116
    .line 117
    invoke-virtual {v3, v4, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_4
    if-nez v5, :cond_5

    .line 122
    .line 123
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_5
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    iget-object v6, p0, LR2/m3;->a:LR2/N2;

    .line 136
    .line 137
    invoke-virtual {v6}, LR2/N2;->B()LR2/S1;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    invoke-virtual {v6}, LR2/S1;->F()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    invoke-virtual {v4, v6}, LR2/g;->t(Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    const-string v6, "param"

    .line 150
    .line 151
    invoke-virtual {v3, v6, v2, v4, v5}, LR2/S5;->k0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-eqz v3, :cond_1

    .line 156
    .line 157
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v3, v0, v2, v5}, LR2/S5;->R(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :cond_6
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {p1}, LR2/g;->E()I

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    invoke-static {v0, p1}, LR2/S5;->f0(Landroid/os/Bundle;I)Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-eqz p1, :cond_7

    .line 182
    .line 183
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 184
    .line 185
    .line 186
    iget-object p1, p0, LR2/C3;->q:LR2/U5;

    .line 187
    .line 188
    const/16 v1, 0x1a

    .line 189
    .line 190
    invoke-static {p1, v1, v4, v4, v3}, LR2/S5;->M(LR2/U5;ILjava/lang/String;Ljava/lang/String;I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-virtual {p1}, LR2/Y1;->M()LR2/a2;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    const-string v1, "Too many default event parameters set. Discarding beyond event parameter limit"

    .line 202
    .line 203
    invoke-virtual {p1, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    :cond_7
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    iget-object p1, p1, LR2/l2;->y:LR2/n2;

    .line 211
    .line 212
    invoke-virtual {p1, v0}, LR2/n2;->b(Landroid/os/Bundle;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0}, LR2/G1;->t()LR2/D4;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-virtual {p1, v0}, LR2/D4;->K(Landroid/os/Bundle;)V

    .line 220
    .line 221
    .line 222
    return-void
.end method

.method public final P(Landroid/os/Bundle;IJ)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LR2/q3;->i(Landroid/os/Bundle;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, LR2/Y1;->M()LR2/a2;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "Ignoring invalid consent setting"

    .line 19
    .line 20
    invoke-virtual {v1, v2, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, LR2/Y1;->M()LR2/a2;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "Valid consent values are \'granted\', \'denied\'"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-static {p1, p2}, LR2/q3;->d(Landroid/os/Bundle;I)LR2/q3;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_4

    .line 45
    .line 46
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    sget-object v2, LR2/K;->S0:LR2/P1;

    .line 51
    .line 52
    invoke-virtual {v1, v2}, LR2/g;->s(LR2/P1;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    invoke-virtual {v0}, LR2/q3;->z()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_1

    .line 63
    .line 64
    invoke-virtual {p0, v0, p3, p4}, LR2/C3;->H(LR2/q3;J)V

    .line 65
    .line 66
    .line 67
    :cond_1
    invoke-static {p1, p2}, LR2/z;->b(Landroid/os/Bundle;I)LR2/z;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p2}, LR2/z;->j()Z

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    if-eqz p3, :cond_2

    .line 76
    .line 77
    invoke-virtual {p0, p2}, LR2/C3;->F(LR2/z;)V

    .line 78
    .line 79
    .line 80
    :cond_2
    invoke-static {p1}, LR2/z;->d(Landroid/os/Bundle;)Ljava/lang/Boolean;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-eqz p1, :cond_3

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    const/4 p2, 0x0

    .line 91
    const-string p3, "app"

    .line 92
    .line 93
    const-string p4, "allow_personalized_ads"

    .line 94
    .line 95
    invoke-virtual {p0, p3, p4, p1, p2}, LR2/C3;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 96
    .line 97
    .line 98
    :cond_3
    return-void

    .line 99
    :cond_4
    invoke-virtual {p0, v0, p3, p4}, LR2/C3;->H(LR2/q3;J)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final Q(Landroid/os/Bundle;J)V
    .locals 12

    .line 1
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Bundle;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    const-string p1, "app_id"

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, LR2/Y1;->L()LR2/a2;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "Package name should be null when calling setConditionalUserProperty"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    const-class v1, Ljava/lang/String;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-static {v0, p1, v1, v2}, LR2/n3;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    const-string p1, "origin"

    .line 47
    .line 48
    invoke-static {v0, p1, v1, v2}, LR2/n3;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    const-string v3, "name"

    .line 52
    .line 53
    invoke-static {v0, v3, v1, v2}, LR2/n3;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    const-class v4, Ljava/lang/Object;

    .line 57
    .line 58
    const-string v5, "value"

    .line 59
    .line 60
    invoke-static {v0, v5, v4, v2}, LR2/n3;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    const-string v4, "trigger_event_name"

    .line 64
    .line 65
    invoke-static {v0, v4, v1, v2}, LR2/n3;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    const-wide/16 v6, 0x0

    .line 69
    .line 70
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    const-string v9, "trigger_timeout"

    .line 75
    .line 76
    const-class v10, Ljava/lang/Long;

    .line 77
    .line 78
    invoke-static {v0, v9, v10, v8}, LR2/n3;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    const-string v8, "timed_out_event_name"

    .line 82
    .line 83
    invoke-static {v0, v8, v1, v2}, LR2/n3;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    const-string v8, "timed_out_event_params"

    .line 87
    .line 88
    const-class v11, Landroid/os/Bundle;

    .line 89
    .line 90
    invoke-static {v0, v8, v11, v2}, LR2/n3;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    const-string v8, "triggered_event_name"

    .line 94
    .line 95
    invoke-static {v0, v8, v1, v2}, LR2/n3;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    const-string v8, "triggered_event_params"

    .line 99
    .line 100
    invoke-static {v0, v8, v11, v2}, LR2/n3;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    const-string v7, "time_to_live"

    .line 108
    .line 109
    invoke-static {v0, v7, v10, v6}, LR2/n3;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    const-string v6, "expired_event_name"

    .line 113
    .line 114
    invoke-static {v0, v6, v1, v2}, LR2/n3;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    const-string v1, "expired_event_params"

    .line 118
    .line 119
    invoke-static {v0, v1, v11, v2}, LR2/n3;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-static {v1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    const-string p1, "creation_timestamp"

    .line 144
    .line 145
    invoke-virtual {v0, p1, p2, p3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 157
    .line 158
    .line 159
    move-result-object p3

    .line 160
    invoke-virtual {p3, p1}, LR2/S5;->q0(Ljava/lang/String;)I

    .line 161
    .line 162
    .line 163
    move-result p3

    .line 164
    if-eqz p3, :cond_1

    .line 165
    .line 166
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-virtual {p2}, LR2/Y1;->G()LR2/a2;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    invoke-virtual {p0}, LR2/m3;->h()LR2/X1;

    .line 175
    .line 176
    .line 177
    move-result-object p3

    .line 178
    invoke-virtual {p3, p1}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    const-string p3, "Invalid conditional user property name"

    .line 183
    .line 184
    invoke-virtual {p2, p3, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_1
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 189
    .line 190
    .line 191
    move-result-object p3

    .line 192
    invoke-virtual {p3, p1, p2}, LR2/S5;->w(Ljava/lang/String;Ljava/lang/Object;)I

    .line 193
    .line 194
    .line 195
    move-result p3

    .line 196
    if-eqz p3, :cond_2

    .line 197
    .line 198
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 199
    .line 200
    .line 201
    move-result-object p3

    .line 202
    invoke-virtual {p3}, LR2/Y1;->G()LR2/a2;

    .line 203
    .line 204
    .line 205
    move-result-object p3

    .line 206
    invoke-virtual {p0}, LR2/m3;->h()LR2/X1;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v0, p1}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    const-string v0, "Invalid conditional user property value"

    .line 215
    .line 216
    invoke-virtual {p3, v0, p1, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :cond_2
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 221
    .line 222
    .line 223
    move-result-object p3

    .line 224
    invoke-virtual {p3, p1, p2}, LR2/S5;->A0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p3

    .line 228
    if-nez p3, :cond_3

    .line 229
    .line 230
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 231
    .line 232
    .line 233
    move-result-object p3

    .line 234
    invoke-virtual {p3}, LR2/Y1;->G()LR2/a2;

    .line 235
    .line 236
    .line 237
    move-result-object p3

    .line 238
    invoke-virtual {p0}, LR2/m3;->h()LR2/X1;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-virtual {v0, p1}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    const-string v0, "Unable to normalize conditional user property value"

    .line 247
    .line 248
    invoke-virtual {p3, v0, p1, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    return-void

    .line 252
    :cond_3
    invoke-static {v0, p3}, LR2/n3;->b(Landroid/os/Bundle;Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0, v9}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 256
    .line 257
    .line 258
    move-result-wide p2

    .line 259
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    const-wide/16 v2, 0x1

    .line 268
    .line 269
    const-wide v4, 0x39ef8b000L

    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    if-nez v1, :cond_5

    .line 275
    .line 276
    cmp-long v1, p2, v4

    .line 277
    .line 278
    if-gtz v1, :cond_4

    .line 279
    .line 280
    cmp-long v1, p2, v2

    .line 281
    .line 282
    if-gez v1, :cond_5

    .line 283
    .line 284
    :cond_4
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-virtual {p0}, LR2/m3;->h()LR2/X1;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-virtual {v1, p1}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 301
    .line 302
    .line 303
    move-result-object p2

    .line 304
    const-string p3, "Invalid conditional user property timeout"

    .line 305
    .line 306
    invoke-virtual {v0, p3, p1, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :cond_5
    invoke-virtual {v0, v7}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 311
    .line 312
    .line 313
    move-result-wide p2

    .line 314
    cmp-long v1, p2, v4

    .line 315
    .line 316
    if-gtz v1, :cond_7

    .line 317
    .line 318
    cmp-long v1, p2, v2

    .line 319
    .line 320
    if-gez v1, :cond_6

    .line 321
    .line 322
    goto :goto_0

    .line 323
    :cond_6
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    new-instance p2, LR2/Z3;

    .line 328
    .line 329
    invoke-direct {p2, p0, v0}, LR2/Z3;-><init>(LR2/C3;Landroid/os/Bundle;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {p1, p2}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 333
    .line 334
    .line 335
    return-void

    .line 336
    :cond_7
    :goto_0
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-virtual {p0}, LR2/m3;->h()LR2/X1;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    invoke-virtual {v1, p1}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 353
    .line 354
    .line 355
    move-result-object p2

    .line 356
    const-string p3, "Invalid conditional user property time to live"

    .line 357
    .line 358
    invoke-virtual {v0, p3, p1, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    return-void
.end method

.method public final R(Ljava/lang/Boolean;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, LR2/g4;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, LR2/g4;-><init>(LR2/C3;Ljava/lang/Boolean;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final S(Ljava/lang/Boolean;Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "Setting app measurement enabled (FE)"

    .line 16
    .line 17
    invoke-virtual {v0, v1, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, p1}, LR2/l2;->v(Ljava/lang/Boolean;)V

    .line 25
    .line 26
    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p2, p1}, LR2/l2;->C(Ljava/lang/Boolean;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object p2, p0, LR2/m3;->a:LR2/N2;

    .line 37
    .line 38
    invoke-virtual {p2}, LR2/N2;->q()Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-nez p2, :cond_1

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_2

    .line 51
    .line 52
    :cond_1
    invoke-virtual {p0}, LR2/C3;->t0()V

    .line 53
    .line 54
    .line 55
    :cond_2
    return-void
.end method

.method public final T(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, LR2/C3;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final U(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V
    .locals 11

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    move-object v10, p0

    .line 5
    iget-object v0, v10, LR2/C3;->d:LR2/v3;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-static {p2}, LR2/S5;->H0(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    move v7, v0

    .line 18
    goto :goto_2

    .line 19
    :cond_1
    :goto_1
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :goto_2
    const/4 v8, 0x1

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v6, 0x1

    .line 24
    move-object v0, p0

    .line 25
    move-object v1, p1

    .line 26
    move-object v2, p2

    .line 27
    move-wide v3, p3

    .line 28
    move-object/from16 v5, p5

    .line 29
    .line 30
    invoke-virtual/range {v0 .. v9}, LR2/C3;->V(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final V(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V
    .locals 19

    .line 1
    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-wide/from16 v10, p3

    move-object/from16 v12, p5

    invoke-static/range {p1 .. p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static/range {p5 .. p5}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, LR2/m3;->n()V

    invoke-virtual/range {p0 .. p0}, LR2/f1;->v()V

    iget-object v0, v7, LR2/m3;->a:LR2/N2;

    invoke-virtual {v0}, LR2/N2;->p()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    move-result-object v0

    const-string v1, "Event not sent since app measurement is disabled"

    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual/range {p0 .. p0}, LR2/G1;->p()LR2/S1;

    move-result-object v0

    invoke-virtual {v0}, LR2/S1;->H()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    move-result-object v0

    const-string v1, "Dropping non-safelisted event. event name, origin"

    invoke-virtual {v0, v1, v9, v8}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-boolean v0, v7, LR2/C3;->f:Z

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-nez v0, :cond_3

    iput-boolean v15, v7, LR2/C3;->f:Z

    :try_start_0
    iget-object v0, v7, LR2/m3;->a:LR2/N2;

    invoke-virtual {v0}, LR2/N2;->t()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    const-string v1, "com.google.android.gms.tagmanager.TagManagerService"

    if-nez v0, :cond_2

    :try_start_1
    invoke-virtual/range {p0 .. p0}, LR2/m3;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v1, v15, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_0
    :try_start_2
    const-string v1, "initialize"

    new-array v2, v15, [Ljava/lang/Class;

    const-class v3, Landroid/content/Context;

    aput-object v3, v2, v14

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v15, [Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, LR2/m3;->a()Landroid/content/Context;

    move-result-object v2

    aput-object v2, v1, v14

    invoke-virtual {v0, v13, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_3
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v1

    invoke-virtual {v1}, LR2/Y1;->L()LR2/a2;

    move-result-object v1

    const-string v2, "Failed to invoke Tag Manager\'s initialize() method"

    invoke-virtual {v1, v2, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    :catch_1
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->J()LR2/a2;

    move-result-object v0

    const-string v1, "Tag Manager is not found and thus will not be used"

    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    :cond_3
    :goto_1
    const-string v0, "_cmp"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "gclid"

    invoke-virtual {v12, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v12, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, LR2/m3;->b()LE2/e;

    move-result-object v0

    invoke-interface {v0}, LE2/e;->a()J

    move-result-wide v5

    const-string v2, "auto"

    const-string v3, "_lgclid"

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v6}, LR2/C3;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/H6;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v0

    sget-object v1, LR2/K;->Z0:LR2/P1;

    invoke-virtual {v0, v1}, LR2/g;->s(LR2/P1;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "gbraid"

    invoke-virtual {v12, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v12, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, LR2/m3;->b()LE2/e;

    move-result-object v0

    invoke-interface {v0}, LE2/e;->a()J

    move-result-wide v5

    const-string v2, "auto"

    const-string v3, "_gbraid"

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v6}, LR2/C3;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    :cond_5
    if-eqz p6, :cond_6

    invoke-static/range {p2 .. p2}, LR2/S5;->L0(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual/range {p0 .. p0}, LR2/m3;->k()LR2/S5;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, LR2/m3;->i()LR2/l2;

    move-result-object v1

    iget-object v1, v1, LR2/l2;->y:LR2/n2;

    invoke-virtual {v1}, LR2/n2;->a()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v12, v1}, LR2/S5;->Q(Landroid/os/Bundle;Landroid/os/Bundle;)V

    :cond_6
    const/16 v0, 0x28

    if-nez p8, :cond_b

    const-string v1, "_iap"

    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    iget-object v1, v7, LR2/m3;->a:LR2/N2;

    invoke-virtual {v1}, LR2/N2;->L()LR2/S5;

    move-result-object v1

    const-string v2, "event"

    invoke-virtual {v1, v2, v9}, LR2/S5;->C0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x2

    if-nez v3, :cond_7

    goto :goto_2

    :cond_7
    sget-object v3, LR2/r3;->a:[Ljava/lang/String;

    sget-object v5, LR2/r3;->b:[Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v5, v9}, LR2/S5;->o0(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_8

    const/16 v4, 0xd

    goto :goto_2

    :cond_8
    invoke-virtual {v1, v2, v0, v9}, LR2/S5;->i0(Ljava/lang/String;ILjava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_2

    :cond_9
    move v4, v14

    :goto_2
    if-eqz v4, :cond_b

    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v1

    invoke-virtual {v1}, LR2/Y1;->H()LR2/a2;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, LR2/m3;->h()LR2/X1;

    move-result-object v2

    invoke-virtual {v2, v9}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Invalid public event name. Event will not be logged (FE)"

    invoke-virtual {v1, v3, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, v7, LR2/m3;->a:LR2/N2;

    invoke-virtual {v1}, LR2/N2;->L()LR2/S5;

    invoke-static {v9, v0, v15}, LR2/S5;->I(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v0

    if-eqz v9, :cond_a

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v14

    :cond_a
    iget-object v1, v7, LR2/m3;->a:LR2/N2;

    invoke-virtual {v1}, LR2/N2;->L()LR2/S5;

    iget-object v1, v7, LR2/C3;->q:LR2/U5;

    const-string v2, "_ev"

    invoke-static {v1, v4, v2, v0, v14}, LR2/S5;->M(LR2/U5;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_b
    invoke-virtual/range {p0 .. p0}, LR2/G1;->s()LR2/v4;

    move-result-object v1

    invoke-virtual {v1, v14}, LR2/v4;->C(Z)LR2/w4;

    move-result-object v1

    const-string v2, "_sc"

    if-eqz v1, :cond_c

    invoke-virtual {v12, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_c

    iput-boolean v15, v1, LR2/w4;->d:Z

    :cond_c
    if-eqz p6, :cond_d

    if-nez p8, :cond_d

    move v3, v15

    goto :goto_3

    :cond_d
    move v3, v14

    :goto_3
    invoke-static {v1, v12, v3}, LR2/S5;->L(LR2/w4;Landroid/os/Bundle;Z)V

    const-string v1, "am"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    invoke-static/range {p2 .. p2}, LR2/S5;->H0(Ljava/lang/String;)Z

    move-result v1

    if-eqz p6, :cond_e

    iget-object v3, v7, LR2/C3;->d:LR2/v3;

    if-eqz v3, :cond_e

    if-nez v1, :cond_e

    if-nez v16, :cond_e

    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, LR2/m3;->h()LR2/X1;

    move-result-object v1

    invoke-virtual {v1, v9}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, LR2/m3;->h()LR2/X1;

    move-result-object v2

    invoke-virtual {v2, v12}, LR2/X1;->b(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Passing event to registered event handler (FE)"

    invoke-virtual {v0, v3, v1, v2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, v7, LR2/C3;->d:LR2/v3;

    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v7, LR2/C3;->d:LR2/v3;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p5

    move-wide/from16 v5, p3

    invoke-interface/range {v1 .. v6}, LR2/v3;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    return-void

    :cond_e
    iget-object v1, v7, LR2/m3;->a:LR2/N2;

    invoke-virtual {v1}, LR2/N2;->s()Z

    move-result v1

    if-nez v1, :cond_f

    return-void

    :cond_f
    invoke-virtual/range {p0 .. p0}, LR2/m3;->k()LR2/S5;

    move-result-object v1

    invoke-virtual {v1, v9}, LR2/S5;->v(Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_11

    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v2

    invoke-virtual {v2}, LR2/Y1;->H()LR2/a2;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, LR2/m3;->h()LR2/X1;

    move-result-object v3

    invoke-virtual {v3, v9}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Invalid event name. Event will not be logged (FE)"

    invoke-virtual {v2, v4, v3}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LR2/m3;->k()LR2/S5;

    invoke-static {v9, v0, v15}, LR2/S5;->I(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v0

    if-eqz v9, :cond_10

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v14

    :cond_10
    iget-object v2, v7, LR2/m3;->a:LR2/N2;

    invoke-virtual {v2}, LR2/N2;->L()LR2/S5;

    iget-object v2, v7, LR2/C3;->q:LR2/U5;

    const-string v3, "_ev"

    move-object/from16 p1, v2

    move-object/from16 p2, p9

    move/from16 p3, v1

    move-object/from16 p4, v3

    move-object/from16 p5, v0

    move/from16 p6, v14

    invoke-static/range {p1 .. p6}, LR2/S5;->N(LR2/U5;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_11
    const-string v0, "_sn"

    const-string v1, "_si"

    const-string v6, "_o"

    filled-new-array {v6, v0, v2, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LE2/f;->c([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, LR2/m3;->k()LR2/S5;

    move-result-object v1

    move-object/from16 v2, p9

    move-object/from16 v3, p2

    move-object/from16 v4, p5

    move-object v0, v6

    move/from16 v6, p8

    invoke-virtual/range {v1 .. v6}, LR2/S5;->F(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;Z)Landroid/os/Bundle;

    move-result-object v12

    invoke-static {v12}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, LR2/G1;->s()LR2/v4;

    move-result-object v1

    invoke-virtual {v1, v14}, LR2/v4;->C(Z)LR2/w4;

    move-result-object v1

    const-string v5, "_ae"

    const-wide/16 v3, 0x0

    if-eqz v1, :cond_12

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-virtual/range {p0 .. p0}, LR2/G1;->u()LR2/l5;

    move-result-object v1

    iget-object v1, v1, LR2/l5;->f:LR2/r5;

    iget-object v2, v1, LR2/r5;->d:LR2/l5;

    invoke-virtual {v2}, LR2/m3;->b()LE2/e;

    move-result-object v2

    invoke-interface {v2}, LE2/e;->b()J

    move-result-wide v13

    iget-wide v6, v1, LR2/r5;->b:J

    sub-long v6, v13, v6

    iput-wide v13, v1, LR2/r5;->b:J

    cmp-long v1, v6, v3

    if-lez v1, :cond_12

    invoke-virtual/range {p0 .. p0}, LR2/m3;->k()LR2/S5;

    move-result-object v1

    invoke-virtual {v1, v12, v6, v7}, LR2/S5;->P(Landroid/os/Bundle;J)V

    :cond_12
    invoke-static {}, Lcom/google/android/gms/internal/measurement/t6;->a()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v1

    sget-object v2, LR2/K;->p0:LR2/P1;

    invoke-virtual {v1, v2}, LR2/g;->s(LR2/P1;)Z

    move-result v1

    if-eqz v1, :cond_17

    const-string v1, "auto"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "_ffr"

    if-nez v1, :cond_16

    const-string v1, "_ssr"

    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-virtual/range {p0 .. p0}, LR2/m3;->k()LR2/S5;

    move-result-object v1

    invoke-virtual {v12, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LE2/n;->a(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_13

    const/4 v13, 0x0

    goto :goto_4

    :cond_13
    if-eqz v2, :cond_14

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v13

    goto :goto_4

    :cond_14
    move-object v13, v2

    :goto_4
    invoke-virtual {v1}, LR2/m3;->i()LR2/l2;

    move-result-object v2

    iget-object v2, v2, LR2/l2;->v:LR2/r2;

    invoke-virtual {v2}, LR2/r2;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v13, v2}, LR2/V5;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-virtual {v1}, LR2/m3;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    move-result-object v0

    const-string v1, "Not logging duplicate session_start_with_rollout event"

    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    return-void

    :cond_15
    invoke-virtual {v1}, LR2/m3;->i()LR2/l2;

    move-result-object v1

    iget-object v1, v1, LR2/l2;->v:LR2/r2;

    invoke-virtual {v1, v13}, LR2/r2;->b(Ljava/lang/String;)V

    goto :goto_5

    :cond_16
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-virtual/range {p0 .. p0}, LR2/m3;->k()LR2/S5;

    move-result-object v1

    invoke-virtual {v1}, LR2/m3;->i()LR2/l2;

    move-result-object v1

    iget-object v1, v1, LR2/l2;->v:LR2/r2;

    invoke-virtual {v1}, LR2/r2;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_17

    invoke-virtual {v12, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_17
    :goto_5
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v7, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v1

    sget-object v2, LR2/K;->Q0:LR2/P1;

    invoke-virtual {v1, v2}, LR2/g;->s(LR2/P1;)Z

    move-result v1

    if-eqz v1, :cond_18

    invoke-virtual/range {p0 .. p0}, LR2/G1;->u()LR2/l5;

    move-result-object v1

    invoke-virtual {v1}, LR2/l5;->F()Z

    move-result v1

    goto :goto_6

    :cond_18
    invoke-virtual/range {p0 .. p0}, LR2/m3;->i()LR2/l2;

    move-result-object v1

    iget-object v1, v1, LR2/l2;->s:LR2/o2;

    invoke-virtual {v1}, LR2/o2;->b()Z

    move-result v1

    :goto_6
    invoke-virtual/range {p0 .. p0}, LR2/m3;->i()LR2/l2;

    move-result-object v2

    iget-object v2, v2, LR2/l2;->p:LR2/q2;

    invoke-virtual {v2}, LR2/q2;->a()J

    move-result-wide v13

    cmp-long v2, v13, v3

    if-lez v2, :cond_19

    invoke-virtual/range {p0 .. p0}, LR2/m3;->i()LR2/l2;

    move-result-object v2

    invoke-virtual {v2, v10, v11}, LR2/l2;->y(J)Z

    move-result v2

    if-eqz v2, :cond_19

    if-eqz v1, :cond_19

    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v1

    invoke-virtual {v1}, LR2/Y1;->K()LR2/a2;

    move-result-object v1

    const-string v2, "Current session is expired, remove the session number, ID, and engagement time"

    invoke-virtual {v1, v2}, LR2/a2;->a(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LR2/m3;->b()LE2/e;

    move-result-object v1

    invoke-interface {v1}, LE2/e;->a()J

    move-result-wide v13

    const-string v2, "auto"

    const-string v6, "_sid"

    const/16 v17, 0x0

    move-object/from16 v1, p0

    move-wide v8, v3

    move-object v3, v6

    move-object/from16 v4, v17

    move-object/from16 v18, v5

    move-wide v5, v13

    invoke-virtual/range {v1 .. v6}, LR2/C3;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    invoke-virtual/range {p0 .. p0}, LR2/m3;->b()LE2/e;

    move-result-object v1

    invoke-interface {v1}, LE2/e;->a()J

    move-result-wide v5

    const-string v2, "auto"

    const-string v3, "_sno"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v6}, LR2/C3;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    invoke-virtual/range {p0 .. p0}, LR2/m3;->b()LE2/e;

    move-result-object v1

    invoke-interface {v1}, LE2/e;->a()J

    move-result-wide v5

    const-string v2, "auto"

    const-string v3, "_se"

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v6}, LR2/C3;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    invoke-virtual/range {p0 .. p0}, LR2/m3;->i()LR2/l2;

    move-result-object v1

    iget-object v1, v1, LR2/l2;->q:LR2/q2;

    invoke-virtual {v1, v8, v9}, LR2/q2;->b(J)V

    goto :goto_7

    :cond_19
    move-wide v8, v3

    move-object/from16 v18, v5

    :goto_7
    const-string v1, "extend_session"

    invoke-virtual {v12, v1, v8, v9}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    const-wide/16 v3, 0x1

    cmp-long v1, v1, v3

    if-nez v1, :cond_1a

    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v1

    invoke-virtual {v1}, LR2/Y1;->K()LR2/a2;

    move-result-object v1

    const-string v2, "EXTEND_SESSION param attached: initiate a new session or extend the current active session"

    invoke-virtual {v1, v2}, LR2/a2;->a(Ljava/lang/String;)V

    move-object/from16 v8, p0

    iget-object v1, v8, LR2/m3;->a:LR2/N2;

    invoke-virtual {v1}, LR2/N2;->K()LR2/l5;

    move-result-object v1

    iget-object v1, v1, LR2/l5;->e:LR2/t5;

    invoke-virtual {v1, v10, v11, v15}, LR2/t5;->b(JZ)V

    goto :goto_8

    :cond_1a
    move-object/from16 v8, p0

    :goto_8
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v12}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :cond_1b
    :goto_9
    if-ge v3, v2, :cond_1c

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_1b

    invoke-virtual/range {p0 .. p0}, LR2/m3;->k()LR2/S5;

    invoke-virtual {v12, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, LR2/S5;->x0(Ljava/lang/Object;)[Landroid/os/Bundle;

    move-result-object v5

    if-eqz v5, :cond_1b

    invoke-virtual {v12, v4, v5}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    goto :goto_9

    :cond_1c
    const/4 v9, 0x0

    :goto_a
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v1

    if-ge v9, v1, :cond_20

    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    if-eqz v9, :cond_1d

    const-string v2, "_ep"

    move-object/from16 v12, p1

    goto :goto_b

    :cond_1d
    move-object/from16 v12, p1

    move-object/from16 v2, p2

    :goto_b
    invoke-virtual {v1, v0, v12}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p7, :cond_1e

    invoke-virtual/range {p0 .. p0}, LR2/m3;->k()LR2/S5;

    move-result-object v3

    invoke-virtual {v3, v1}, LR2/S5;->r0(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v1

    :cond_1e
    move-object v13, v1

    new-instance v14, LR2/I;

    new-instance v3, LR2/D;

    invoke-direct {v3, v13}, LR2/D;-><init>(Landroid/os/Bundle;)V

    move-object v1, v14

    move-object/from16 v4, p1

    move-wide/from16 v5, p3

    invoke-direct/range {v1 .. v6}, LR2/I;-><init>(Ljava/lang/String;LR2/D;Ljava/lang/String;J)V

    invoke-virtual/range {p0 .. p0}, LR2/G1;->t()LR2/D4;

    move-result-object v1

    move-object/from16 v5, p9

    invoke-virtual {v1, v14, v5}, LR2/D4;->D(LR2/I;Ljava/lang/String;)V

    if-nez v16, :cond_1f

    iget-object v1, v8, LR2/C3;->e:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_c
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1f

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LR2/u3;

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4, v13}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v5, p3

    invoke-interface/range {v1 .. v6}, LR2/u3;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    move-object/from16 v5, p9

    goto :goto_c

    :cond_1f
    add-int/lit8 v9, v9, 0x1

    goto :goto_a

    :cond_20
    invoke-virtual/range {p0 .. p0}, LR2/G1;->s()LR2/v4;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LR2/v4;->C(Z)LR2/w4;

    move-result-object v0

    if-eqz v0, :cond_21

    move-object/from16 v1, p2

    move-object/from16 v0, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-virtual/range {p0 .. p0}, LR2/G1;->u()LR2/l5;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, LR2/m3;->b()LE2/e;

    move-result-object v1

    invoke-interface {v1}, LE2/e;->b()J

    move-result-wide v1

    invoke-virtual {v0, v15, v15, v1, v2}, LR2/l5;->E(ZZJ)Z

    :cond_21
    return-void
.end method

.method public final W(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v8, LR2/T3;

    .line 6
    .line 7
    move-object v1, v8

    .line 8
    move-object v2, p0

    .line 9
    move-object v3, p1

    .line 10
    move-object v4, p2

    .line 11
    move-object v5, p5

    .line 12
    move-wide v6, p3

    .line 13
    invoke-direct/range {v1 .. v7}, LR2/T3;-><init>(LR2/C3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v8}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final X(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LR2/m3;->b()LE2/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LE2/e;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    new-instance v2, Landroid/os/Bundle;

    .line 13
    .line 14
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v3, "name"

    .line 18
    .line 19
    invoke-virtual {v2, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string p1, "creation_timestamp"

    .line 23
    .line 24
    invoke-virtual {v2, p1, v0, v1}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 25
    .line 26
    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    const-string p1, "expired_event_name"

    .line 30
    .line 31
    invoke-virtual {v2, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string p1, "expired_event_params"

    .line 35
    .line 36
    invoke-virtual {v2, p1, p3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance p2, LR2/Y3;

    .line 44
    .line 45
    invoke-direct {p2, p0, v2}, LR2/Y3;-><init>(LR2/C3;Landroid/os/Bundle;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p2}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final Y(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 11

    .line 1
    invoke-virtual {p0}, LR2/m3;->m()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->b()LE2/e;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, LE2/e;->a()J

    .line 9
    .line 10
    .line 11
    move-result-wide v4

    .line 12
    const/4 v8, 0x1

    .line 13
    const/4 v9, 0x1

    .line 14
    const/4 v7, 0x0

    .line 15
    move-object v1, p0

    .line 16
    move-object v2, p1

    .line 17
    move-object v3, p2

    .line 18
    move-object v6, p3

    .line 19
    move-object v10, p4

    .line 20
    invoke-virtual/range {v1 .. v10}, LR2/C3;->x0(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final Z(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V
    .locals 11

    .line 1
    move-object v2, p2

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    const-string v0, "app"

    .line 5
    .line 6
    move-object v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object v1, p1

    .line 9
    :goto_0
    if-nez p3, :cond_1

    .line 10
    .line 11
    new-instance v0, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    move-object v5, v0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move-object v5, p3

    .line 19
    :goto_1
    const-string v0, "screen_view"

    .line 20
    .line 21
    if-eq v2, v0, :cond_2

    .line 22
    .line 23
    if-eqz v2, :cond_3

    .line 24
    .line 25
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    :cond_2
    move-object v10, p0

    .line 32
    goto :goto_5

    .line 33
    :cond_3
    move-object v10, p0

    .line 34
    if-eqz p5, :cond_5

    .line 35
    .line 36
    iget-object v0, v10, LR2/C3;->d:LR2/v3;

    .line 37
    .line 38
    if-eqz v0, :cond_5

    .line 39
    .line 40
    invoke-static {p2}, LR2/S5;->H0(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_4
    const/4 v0, 0x0

    .line 48
    :goto_2
    move v7, v0

    .line 49
    goto :goto_4

    .line 50
    :cond_5
    :goto_3
    const/4 v0, 0x1

    .line 51
    goto :goto_2

    .line 52
    :goto_4
    const/4 v9, 0x0

    .line 53
    move-object v0, p0

    .line 54
    move-object v2, p2

    .line 55
    move-wide/from16 v3, p6

    .line 56
    .line 57
    move/from16 v6, p5

    .line 58
    .line 59
    move v8, p4

    .line 60
    invoke-virtual/range {v0 .. v9}, LR2/C3;->x0(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :goto_5
    invoke-virtual {p0}, LR2/G1;->s()LR2/v4;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    move-wide/from16 v1, p6

    .line 69
    .line 70
    invoke-virtual {v0, v5, v1, v2}, LR2/v4;->O(Landroid/os/Bundle;J)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final bridge synthetic a()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V
    .locals 8

    .line 1
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 11
    .line 12
    .line 13
    const-string v0, "allow_personalized_ads"

    .line 14
    .line 15
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    instance-of v0, p3, Ljava/lang/String;

    .line 22
    .line 23
    const-string v1, "_npa"

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    move-object v0, p3

    .line 28
    check-cast v0, Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_2

    .line 35
    .line 36
    sget-object p2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 37
    .line 38
    invoke-virtual {v0, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    const-string p3, "false"

    .line 43
    .line 44
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    const-wide/16 v2, 0x1

    .line 49
    .line 50
    if-eqz p2, :cond_0

    .line 51
    .line 52
    move-wide v4, v2

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const-wide/16 v4, 0x0

    .line 55
    .line 56
    :goto_0
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v0, v0, LR2/l2;->m:LR2/r2;

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 67
    .line 68
    .line 69
    move-result-wide v4

    .line 70
    cmp-long v2, v4, v2

    .line 71
    .line 72
    if-nez v2, :cond_1

    .line 73
    .line 74
    const-string p3, "true"

    .line 75
    .line 76
    :cond_1
    invoke-virtual {v0, p3}, LR2/r2;->b(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    move-object v6, p2

    .line 80
    :goto_1
    move-object v3, v1

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    if-nez p3, :cond_3

    .line 83
    .line 84
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    iget-object p2, p2, LR2/l2;->m:LR2/r2;

    .line 89
    .line 90
    const-string v0, "unset"

    .line 91
    .line 92
    invoke-virtual {p2, v0}, LR2/r2;->b(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    move-object v6, p3

    .line 96
    goto :goto_1

    .line 97
    :cond_3
    move-object v3, p2

    .line 98
    move-object v6, p3

    .line 99
    :goto_2
    iget-object p2, p0, LR2/m3;->a:LR2/N2;

    .line 100
    .line 101
    invoke-virtual {p2}, LR2/N2;->p()Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    if-nez p2, :cond_4

    .line 106
    .line 107
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p1}, LR2/Y1;->K()LR2/a2;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    const-string p2, "User property not set since app measurement is disabled"

    .line 116
    .line 117
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_4
    iget-object p2, p0, LR2/m3;->a:LR2/N2;

    .line 122
    .line 123
    invoke-virtual {p2}, LR2/N2;->s()Z

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    if-nez p2, :cond_5

    .line 128
    .line 129
    return-void

    .line 130
    :cond_5
    new-instance p2, LR2/R5;

    .line 131
    .line 132
    move-object v2, p2

    .line 133
    move-wide v4, p4

    .line 134
    move-object v7, p1

    .line 135
    invoke-direct/range {v2 .. v7}, LR2/R5;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, LR2/G1;->t()LR2/D4;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p1, p2}, LR2/D4;->J(LR2/R5;)V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method public final bridge synthetic b()LE2/e;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->b()LE2/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 8

    .line 1
    invoke-virtual {p0}, LR2/m3;->b()LE2/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LE2/e;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide v6

    .line 9
    move-object v1, p0

    .line 10
    move-object v2, p1

    .line 11
    move-object v3, p2

    .line 12
    move-object v4, p3

    .line 13
    move v5, p4

    .line 14
    invoke-virtual/range {v1 .. v7}, LR2/C3;->c0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final c0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p1, "app"

    .line 4
    .line 5
    :cond_0
    move-object v1, p1

    .line 6
    const/4 p1, 0x0

    .line 7
    const/16 v0, 0x18

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 12
    .line 13
    .line 14
    move-result-object p4

    .line 15
    invoke-virtual {p4, p2}, LR2/S5;->q0(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result p4

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 21
    .line 22
    .line 23
    move-result-object p4

    .line 24
    const-string v2, "user property"

    .line 25
    .line 26
    invoke-virtual {p4, v2, p2}, LR2/S5;->C0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const/4 v4, 0x6

    .line 31
    if-nez v3, :cond_2

    .line 32
    .line 33
    :goto_0
    move p4, v4

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    sget-object v3, LR2/s3;->a:[Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p4, v2, v3, p2}, LR2/S5;->n0(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-nez v3, :cond_3

    .line 42
    .line 43
    const/16 p4, 0xf

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    invoke-virtual {p4, v2, v0, p2}, LR2/S5;->i0(Ljava/lang/String;ILjava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result p4

    .line 50
    if-nez p4, :cond_4

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_4
    move p4, p1

    .line 54
    :goto_1
    const-string v2, "_ev"

    .line 55
    .line 56
    const/4 v3, 0x1

    .line 57
    if-eqz p4, :cond_6

    .line 58
    .line 59
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 60
    .line 61
    .line 62
    invoke-static {p2, v0, v3}, LR2/S5;->I(Ljava/lang/String;IZ)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    if-eqz p2, :cond_5

    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    :cond_5
    iget-object p2, p0, LR2/m3;->a:LR2/N2;

    .line 73
    .line 74
    invoke-virtual {p2}, LR2/N2;->L()LR2/S5;

    .line 75
    .line 76
    .line 77
    iget-object p2, p0, LR2/C3;->q:LR2/U5;

    .line 78
    .line 79
    invoke-static {p2, p4, v2, p3, p1}, LR2/S5;->M(LR2/U5;ILjava/lang/String;Ljava/lang/String;I)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_6
    if-eqz p3, :cond_b

    .line 84
    .line 85
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 86
    .line 87
    .line 88
    move-result-object p4

    .line 89
    invoke-virtual {p4, p2, p3}, LR2/S5;->w(Ljava/lang/String;Ljava/lang/Object;)I

    .line 90
    .line 91
    .line 92
    move-result p4

    .line 93
    if-eqz p4, :cond_9

    .line 94
    .line 95
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 96
    .line 97
    .line 98
    invoke-static {p2, v0, v3}, LR2/S5;->I(Ljava/lang/String;IZ)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    instance-of p5, p3, Ljava/lang/String;

    .line 103
    .line 104
    if-nez p5, :cond_7

    .line 105
    .line 106
    instance-of p5, p3, Ljava/lang/CharSequence;

    .line 107
    .line 108
    if-eqz p5, :cond_8

    .line 109
    .line 110
    :cond_7
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    :cond_8
    iget-object p3, p0, LR2/m3;->a:LR2/N2;

    .line 119
    .line 120
    invoke-virtual {p3}, LR2/N2;->L()LR2/S5;

    .line 121
    .line 122
    .line 123
    iget-object p3, p0, LR2/C3;->q:LR2/U5;

    .line 124
    .line 125
    invoke-static {p3, p4, v2, p2, p1}, LR2/S5;->M(LR2/U5;ILjava/lang/String;Ljava/lang/String;I)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_9
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p1, p2, p3}, LR2/S5;->A0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    if-eqz v5, :cond_a

    .line 138
    .line 139
    move-object v0, p0

    .line 140
    move-object v2, p2

    .line 141
    move-wide v3, p5

    .line 142
    invoke-virtual/range {v0 .. v5}, LR2/C3;->W(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_a
    return-void

    .line 146
    :cond_b
    const/4 v5, 0x0

    .line 147
    move-object v0, p0

    .line 148
    move-object v2, p2

    .line 149
    move-wide v3, p5

    .line 150
    invoke-virtual/range {v0 .. v5}, LR2/C3;->W(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    return-void
.end method

.method public final bridge synthetic d()LR2/f;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->d()LR2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final synthetic d0(Ljava/util/List;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1e

    .line 7
    .line 8
    if-lt v0, v1, :cond_3

    .line 9
    .line 10
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, LR2/l2;->H()Landroid/util/SparseArray;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, LR2/v5;

    .line 33
    .line 34
    iget v2, v1, LR2/v5;->q:I

    .line 35
    .line 36
    invoke-static {v0, v2}, LR2/z3;->a(Landroid/util/SparseArray;I)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    iget v2, v1, LR2/v5;->q:I

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Ljava/lang/Long;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    iget-wide v4, v1, LR2/v5;->p:J

    .line 55
    .line 56
    cmp-long v2, v2, v4

    .line 57
    .line 58
    if-gez v2, :cond_0

    .line 59
    .line 60
    :cond_1
    invoke-virtual {p0}, LR2/C3;->s0()Ljava/util/PriorityQueue;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2, v1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    invoke-virtual {p0}, LR2/C3;->r0()V

    .line 69
    .line 70
    .line 71
    :cond_3
    return-void
.end method

.method public final bridge synthetic e()LR2/G2;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final e0()Ljava/lang/Boolean;
    .locals 6

    .line 1
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v5, LR2/O3;

    .line 11
    .line 12
    invoke-direct {v5, p0, v1}, LR2/O3;-><init>(LR2/C3;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 13
    .line 14
    .line 15
    const-wide/16 v2, 0x3a98

    .line 16
    .line 17
    const-string v4, "boolean test flag value"

    .line 18
    .line 19
    invoke-virtual/range {v0 .. v5}, LR2/G2;->v(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/Boolean;

    .line 24
    .line 25
    return-object v0
.end method

.method public final bridge synthetic f()LR2/g;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->f()LR2/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final f0()Ljava/lang/Double;
    .locals 6

    .line 1
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v5, LR2/h4;

    .line 11
    .line 12
    invoke-direct {v5, p0, v1}, LR2/h4;-><init>(LR2/C3;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 13
    .line 14
    .line 15
    const-wide/16 v2, 0x3a98

    .line 16
    .line 17
    const-string v4, "double test flag value"

    .line 18
    .line 19
    invoke-virtual/range {v0 .. v5}, LR2/G2;->v(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/Double;

    .line 24
    .line 25
    return-object v0
.end method

.method public final bridge synthetic g()LR2/C;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->g()LR2/C;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final g0()Ljava/lang/Integer;
    .locals 6

    .line 1
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v5, LR2/e4;

    .line 11
    .line 12
    invoke-direct {v5, p0, v1}, LR2/e4;-><init>(LR2/C3;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 13
    .line 14
    .line 15
    const-wide/16 v2, 0x3a98

    .line 16
    .line 17
    const-string v4, "int test flag value"

    .line 18
    .line 19
    invoke-virtual/range {v0 .. v5}, LR2/G2;->v(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/Integer;

    .line 24
    .line 25
    return-object v0
.end method

.method public final bridge synthetic h()LR2/X1;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->h()LR2/X1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final h0()Ljava/lang/Long;
    .locals 6

    .line 1
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v5, LR2/f4;

    .line 11
    .line 12
    invoke-direct {v5, p0, v1}, LR2/f4;-><init>(LR2/C3;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 13
    .line 14
    .line 15
    const-wide/16 v2, 0x3a98

    .line 16
    .line 17
    const-string v4, "long test flag value"

    .line 18
    .line 19
    invoke-virtual/range {v0 .. v5}, LR2/G2;->v(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/Long;

    .line 24
    .line 25
    return-object v0
.end method

.method public final bridge synthetic i()LR2/l2;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->i()LR2/l2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final i0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/C3;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0
.end method

.method public final bridge synthetic j()LR2/Y1;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->j()LR2/Y1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final j0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/m3;->a:LR2/N2;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/N2;->I()LR2/v4;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LR2/v4;->P()LR2/w4;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, LR2/w4;->b:Ljava/lang/String;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method

.method public final bridge synthetic k()LR2/S5;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/m3;->k()LR2/S5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final k0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/m3;->a:LR2/N2;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/N2;->I()LR2/v4;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LR2/v4;->P()LR2/w4;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, LR2/w4;->a:Ljava/lang/String;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method

.method public final bridge synthetic l()V
    .locals 0

    .line 1
    invoke-super {p0}, LR2/G1;->l()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final l0()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, LR2/m3;->a:LR2/N2;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/N2;->M()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LR2/m3;->a:LR2/N2;

    .line 10
    .line 11
    invoke-virtual {v0}, LR2/N2;->M()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    :try_start_0
    invoke-virtual {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, LR2/m3;->a:LR2/N2;

    .line 21
    .line 22
    invoke-virtual {v1}, LR2/N2;->P()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "google_app_id"

    .line 27
    .line 28
    new-instance v3, LR2/H2;

    .line 29
    .line 30
    invoke-direct {v3, v0, v1}, LR2/H2;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v2}, LR2/H2;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    return-object v0

    .line 38
    :catch_0
    move-exception v0

    .line 39
    iget-object v1, p0, LR2/m3;->a:LR2/N2;

    .line 40
    .line 41
    invoke-virtual {v1}, LR2/N2;->j()LR2/Y1;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "getGoogleAppId failed with exception"

    .line 50
    .line 51
    invoke-virtual {v1, v2, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    return-object v0
.end method

.method public final bridge synthetic m()V
    .locals 0

    .line 1
    invoke-super {p0}, LR2/G1;->m()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final m0()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v5, LR2/W3;

    .line 11
    .line 12
    invoke-direct {v5, p0, v1}, LR2/W3;-><init>(LR2/C3;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 13
    .line 14
    .line 15
    const-wide/16 v2, 0x3a98

    .line 16
    .line 17
    const-string v4, "String test flag value"

    .line 18
    .line 19
    invoke-virtual/range {v0 .. v5}, LR2/G2;->v(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/String;

    .line 24
    .line 25
    return-object v0
.end method

.method public final bridge synthetic n()V
    .locals 0

    .line 1
    invoke-super {p0}, LR2/G1;->n()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final n0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LR2/m3;->a:LR2/N2;

    .line 8
    .line 9
    invoke-virtual {v0}, LR2/N2;->s()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, LR2/K;->k0:LR2/P1;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, LR2/g;->s(LR2/P1;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "google_analytics_deferred_deep_link_enabled"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, LR2/g;->F(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, "Deferred Deep Link feature enabled."

    .line 55
    .line 56
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-instance v1, LR2/H3;

    .line 64
    .line 65
    invoke-direct {v1, p0}, LR2/H3;-><init>(LR2/C3;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    invoke-virtual {p0}, LR2/G1;->t()LR2/D4;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, LR2/D4;->X()V

    .line 76
    .line 77
    .line 78
    const/4 v0, 0x0

    .line 79
    iput-boolean v0, p0, LR2/C3;->o:Z

    .line 80
    .line 81
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, LR2/l2;->N()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_2

    .line 94
    .line 95
    invoke-virtual {p0}, LR2/m3;->g()LR2/C;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, LR2/l3;->o()V

    .line 100
    .line 101
    .line 102
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-nez v1, :cond_2

    .line 109
    .line 110
    new-instance v1, Landroid/os/Bundle;

    .line 111
    .line 112
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 113
    .line 114
    .line 115
    const-string v2, "_po"

    .line 116
    .line 117
    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const-string v0, "auto"

    .line 121
    .line 122
    const-string v2, "_ou"

    .line 123
    .line 124
    invoke-virtual {p0, v0, v2, v1}, LR2/C3;->z0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 125
    .line 126
    .line 127
    :cond_2
    return-void
.end method

.method public final bridge synthetic o()LR2/B;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->o()LR2/B;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final o0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v0, v0, Landroid/app/Application;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LR2/C3;->c:LR2/k4;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/app/Application;

    .line 26
    .line 27
    iget-object v1, p0, LR2/C3;->c:LR2/k4;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final bridge synthetic p()LR2/S1;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->p()LR2/S1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final p0()V
    .locals 8

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/g7;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, LR2/K;->M0:LR2/P1;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, LR2/g;->s(LR2/P1;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, LR2/G2;->J()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "Cannot get trigger URIs from analytics worker thread"

    .line 39
    .line 40
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    invoke-static {}, LR2/f;->a()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v1, "Cannot get trigger URIs from main thread"

    .line 59
    .line 60
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-string v1, "Getting trigger URIs (FE)"

    .line 76
    .line 77
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 81
    .line 82
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    new-instance v7, LR2/D3;

    .line 90
    .line 91
    invoke-direct {v7, p0, v0}, LR2/D3;-><init>(LR2/C3;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 92
    .line 93
    .line 94
    const-wide/16 v4, 0x1388

    .line 95
    .line 96
    const-string v6, "get trigger URIs"

    .line 97
    .line 98
    move-object v3, v0

    .line 99
    invoke-virtual/range {v2 .. v7}, LR2/G2;->v(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Ljava/util/List;

    .line 107
    .line 108
    if-nez v0, :cond_3

    .line 109
    .line 110
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    const-string v1, "Timed out waiting for get trigger URIs"

    .line 119
    .line 120
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_3
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    new-instance v2, LR2/G3;

    .line 129
    .line 130
    invoke-direct {v2, p0, v0}, LR2/G3;-><init>(LR2/C3;Ljava/util/List;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v2}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 134
    .line 135
    .line 136
    :cond_4
    :goto_0
    return-void
.end method

.method public final bridge synthetic q()LR2/V1;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->q()LR2/V1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final q0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, LR2/l2;->t:LR2/o2;

    .line 9
    .line 10
    invoke-virtual {v0}, LR2/o2;->b()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "Deferred Deep Link already retrieved. Not fetching again."

    .line 25
    .line 26
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v0, v0, LR2/l2;->u:LR2/q2;

    .line 35
    .line 36
    invoke-virtual {v0}, LR2/q2;->a()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object v2, v2, LR2/l2;->u:LR2/q2;

    .line 45
    .line 46
    const-wide/16 v3, 0x1

    .line 47
    .line 48
    add-long/2addr v3, v0

    .line 49
    invoke-virtual {v2, v3, v4}, LR2/q2;->b(J)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v2, 0x5

    .line 53
    .line 54
    cmp-long v0, v0, v2

    .line 55
    .line 56
    if-ltz v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, LR2/Y1;->L()LR2/a2;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v1, "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries."

    .line 67
    .line 68
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object v0, v0, LR2/l2;->t:LR2/o2;

    .line 76
    .line 77
    const/4 v1, 0x1

    .line 78
    invoke-virtual {v0, v1}, LR2/o2;->a(Z)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    sget-object v1, LR2/K;->U0:LR2/P1;

    .line 93
    .line 94
    invoke-virtual {v0, v1}, LR2/g;->s(LR2/P1;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_3

    .line 99
    .line 100
    iget-object v0, p0, LR2/C3;->p:LR2/x;

    .line 101
    .line 102
    if-nez v0, :cond_2

    .line 103
    .line 104
    new-instance v0, LR2/V3;

    .line 105
    .line 106
    iget-object v1, p0, LR2/m3;->a:LR2/N2;

    .line 107
    .line 108
    invoke-direct {v0, p0, v1}, LR2/V3;-><init>(LR2/C3;LR2/o3;)V

    .line 109
    .line 110
    .line 111
    iput-object v0, p0, LR2/C3;->p:LR2/x;

    .line 112
    .line 113
    :cond_2
    iget-object v0, p0, LR2/C3;->p:LR2/x;

    .line 114
    .line 115
    const-wide/16 v1, 0x0

    .line 116
    .line 117
    invoke-virtual {v0, v1, v2}, LR2/x;->b(J)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_3
    iget-object v0, p0, LR2/m3;->a:LR2/N2;

    .line 122
    .line 123
    invoke-virtual {v0}, LR2/N2;->u()Z

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public final bridge synthetic r()LR2/C3;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->r()LR2/C3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final r0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/C3;->s0()Ljava/util/PriorityQueue;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_5

    .line 13
    .line 14
    iget-boolean v0, p0, LR2/C3;->i:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_1

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, LR2/C3;->s0()Ljava/util/PriorityQueue;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, LR2/v5;

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, LR2/S5;->Q0()Lq1/a;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    const/4 v2, 0x1

    .line 45
    iput-boolean v2, p0, LR2/C3;->i:Z

    .line 46
    .line 47
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2}, LR2/Y1;->K()LR2/a2;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const-string v3, "Registering trigger URI"

    .line 56
    .line 57
    iget-object v4, v0, LR2/v5;->o:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v2, v3, v4}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object v2, v0, LR2/v5;->o:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v1, v2}, Lq1/a;->c(Landroid/net/Uri;)Lb3/e;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const/4 v2, 0x0

    .line 73
    if-nez v1, :cond_3

    .line 74
    .line 75
    iput-boolean v2, p0, LR2/C3;->i:Z

    .line 76
    .line 77
    invoke-virtual {p0}, LR2/C3;->s0()Ljava/util/PriorityQueue;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1, v0}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_3
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v3}, LR2/l2;->H()Landroid/util/SparseArray;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    iget v4, v0, LR2/v5;->q:I

    .line 94
    .line 95
    iget-wide v5, v0, LR2/v5;->p:J

    .line 96
    .line 97
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {v3, v4, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    new-array v5, v5, [I

    .line 113
    .line 114
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    new-array v6, v6, [J

    .line 119
    .line 120
    :goto_0
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    if-ge v2, v7, :cond_4

    .line 125
    .line 126
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    aput v7, v5, v2

    .line 131
    .line 132
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    check-cast v7, Ljava/lang/Long;

    .line 137
    .line 138
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 139
    .line 140
    .line 141
    move-result-wide v7

    .line 142
    aput-wide v7, v6, v2

    .line 143
    .line 144
    add-int/lit8 v2, v2, 0x1

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_4
    new-instance v2, Landroid/os/Bundle;

    .line 148
    .line 149
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 150
    .line 151
    .line 152
    const-string v3, "uriSources"

    .line 153
    .line 154
    invoke-virtual {v2, v3, v5}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 155
    .line 156
    .line 157
    const-string v3, "uriTimestamps"

    .line 158
    .line 159
    invoke-virtual {v2, v3, v6}, Landroid/os/BaseBundle;->putLongArray(Ljava/lang/String;[J)V

    .line 160
    .line 161
    .line 162
    iget-object v3, v4, LR2/l2;->n:LR2/n2;

    .line 163
    .line 164
    invoke-virtual {v3, v2}, LR2/n2;->b(Landroid/os/Bundle;)V

    .line 165
    .line 166
    .line 167
    new-instance v2, LR2/M3;

    .line 168
    .line 169
    invoke-direct {v2, p0}, LR2/M3;-><init>(LR2/C3;)V

    .line 170
    .line 171
    .line 172
    new-instance v3, LR2/Q3;

    .line 173
    .line 174
    invoke-direct {v3, p0, v0}, LR2/Q3;-><init>(LR2/C3;LR2/v5;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v1, v3, v2}, Lb3/c;->a(Lb3/e;Lb3/b;Ljava/util/concurrent/Executor;)V

    .line 178
    .line 179
    .line 180
    :cond_5
    :goto_1
    return-void
.end method

.method public final bridge synthetic s()LR2/v4;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->s()LR2/v4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final s0()Ljava/util/PriorityQueue;
    .locals 2

    .line 1
    iget-object v0, p0, LR2/C3;->j:Ljava/util/PriorityQueue;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, LR2/B3;->a()V

    .line 6
    .line 7
    .line 8
    sget-object v0, LR2/y3;->a:LR2/y3;

    .line 9
    .line 10
    sget-object v1, LR2/E3;->o:LR2/E3;

    .line 11
    .line 12
    invoke-static {v0, v1}, LR2/K3;->a(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, LR2/A3;->a(Ljava/util/Comparator;)Ljava/util/PriorityQueue;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, LR2/C3;->j:Ljava/util/PriorityQueue;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, LR2/C3;->j:Ljava/util/PriorityQueue;

    .line 23
    .line 24
    return-object v0
.end method

.method public final bridge synthetic t()LR2/D4;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->t()LR2/D4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final t0()V
    .locals 8

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, LR2/l2;->m:LR2/r2;

    .line 9
    .line 10
    invoke-virtual {v0}, LR2/r2;->a()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    const-string v1, "unset"

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, LR2/m3;->b()LE2/e;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, LE2/e;->a()J

    .line 29
    .line 30
    .line 31
    move-result-wide v5

    .line 32
    const-string v2, "app"

    .line 33
    .line 34
    const-string v3, "_npa"

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    move-object v1, p0

    .line 38
    invoke-virtual/range {v1 .. v6}, LR2/C3;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    const-string v1, "true"

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    const-wide/16 v0, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const-wide/16 v0, 0x0

    .line 54
    .line 55
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {p0}, LR2/m3;->b()LE2/e;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-interface {v0}, LE2/e;->a()J

    .line 64
    .line 65
    .line 66
    move-result-wide v6

    .line 67
    const-string v3, "app"

    .line 68
    .line 69
    const-string v4, "_npa"

    .line 70
    .line 71
    move-object v2, p0

    .line 72
    invoke-virtual/range {v2 .. v7}, LR2/C3;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    .line 73
    .line 74
    .line 75
    :cond_2
    :goto_1
    iget-object v0, p0, LR2/m3;->a:LR2/N2;

    .line 76
    .line 77
    invoke-virtual {v0}, LR2/N2;->p()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    iget-boolean v0, p0, LR2/C3;->o:Z

    .line 84
    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const-string v1, "Recording app launch after enabling measurement for the first time (FE)"

    .line 96
    .line 97
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, LR2/C3;->n0()V

    .line 101
    .line 102
    .line 103
    invoke-static {}, Lcom/google/android/gms/internal/measurement/G6;->a()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_3

    .line 108
    .line 109
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    sget-object v1, LR2/K;->q0:LR2/P1;

    .line 114
    .line 115
    invoke-virtual {v0, v1}, LR2/g;->s(LR2/P1;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_3

    .line 120
    .line 121
    invoke-virtual {p0}, LR2/G1;->u()LR2/l5;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iget-object v0, v0, LR2/l5;->e:LR2/t5;

    .line 126
    .line 127
    invoke-virtual {v0}, LR2/t5;->a()V

    .line 128
    .line 129
    .line 130
    :cond_3
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    new-instance v1, LR2/S3;

    .line 135
    .line 136
    invoke-direct {v1, p0}, LR2/S3;-><init>(LR2/C3;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v1}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_4
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    const-string v1, "Updating Scion state (FE)"

    .line 152
    .line 153
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0}, LR2/G1;->t()LR2/D4;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v0}, LR2/D4;->b0()V

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public final bridge synthetic u()LR2/l5;
    .locals 1

    .line 1
    invoke-super {p0}, LR2/G1;->u()LR2/l5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final u0(LR2/u3;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LR2/C3;->e:Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, LR2/Y1;->L()LR2/a2;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, "OnEventListener had not been registered"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, LR2/a2;->a(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final w0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/m3;->b()LE2/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LE2/e;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p0, p1, v0, v1}, LR2/C3;->Q(Landroid/os/Bundle;J)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final x0(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V
    .locals 13

    .line 1
    invoke-static/range {p5 .. p5}, LR2/S5;->E(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v6

    .line 5
    invoke-virtual {p0}, LR2/m3;->e()LR2/G2;

    .line 6
    .line 7
    .line 8
    move-result-object v11

    .line 9
    new-instance v12, LR2/U3;

    .line 10
    .line 11
    move-object v0, v12

    .line 12
    move-object v1, p0

    .line 13
    move-object v2, p1

    .line 14
    move-object v3, p2

    .line 15
    move-wide/from16 v4, p3

    .line 16
    .line 17
    move/from16 v7, p6

    .line 18
    .line 19
    move/from16 v8, p7

    .line 20
    .line 21
    move/from16 v9, p8

    .line 22
    .line 23
    move-object/from16 v10, p9

    .line 24
    .line 25
    invoke-direct/range {v0 .. v10}, LR2/U3;-><init>(LR2/C3;Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v11, v12}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final y0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, LR2/m3;->b()LE2/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LE2/e;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide v7

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x1

    .line 11
    move-object v1, p0

    .line 12
    move-object v2, p1

    .line 13
    move-object v3, p2

    .line 14
    move-object v4, p3

    .line 15
    invoke-virtual/range {v1 .. v8}, LR2/C3;->Z(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final z0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->b()LE2/e;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, LE2/e;->a()J

    .line 9
    .line 10
    .line 11
    move-result-wide v4

    .line 12
    move-object v1, p0

    .line 13
    move-object v2, p1

    .line 14
    move-object v3, p2

    .line 15
    move-object v6, p3

    .line 16
    invoke-virtual/range {v1 .. v6}, LR2/C3;->U(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
