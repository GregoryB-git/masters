.class public LV3/F;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:LY3/i;


# instance fields
.field public a:LV3/b;

.field public b:Ljava/util/List;

.field public c:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LV3/F$b;

    .line 2
    .line 3
    invoke-direct {v0}, LV3/F$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LV3/F;->d:LY3/i;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LV3/b;->s()LV3/b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LV3/F;->a:LV3/b;

    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, LV3/F;->b:Ljava/util/List;

    .line 16
    .line 17
    const-wide/16 v0, -0x1

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, LV3/F;->c:Ljava/lang/Long;

    .line 24
    .line 25
    return-void
.end method

.method public static j(Ljava/util/List;LY3/i;LV3/k;)LV3/b;
    .locals 4

    .line 1
    invoke-static {}, LV3/b;->s()LV3/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_5

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, LV3/B;

    .line 20
    .line 21
    invoke-interface {p1, v1}, LY3/i;->a(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1}, LV3/B;->c()LV3/k;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v1}, LV3/B;->e()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    invoke-virtual {p2, v2}, LV3/k;->W(LV3/k;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-static {p2, v2}, LV3/k;->b0(LV3/k;LV3/k;)LV3/k;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v1}, LV3/B;->b()Ld4/n;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :goto_1
    invoke-virtual {v0, v2, v1}, LV3/b;->a(LV3/k;Ld4/n;)LV3/b;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {v2, p2}, LV3/k;->W(LV3/k;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_0

    .line 61
    .line 62
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v1}, LV3/B;->b()Ld4/n;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-static {v2, p2}, LV3/k;->b0(LV3/k;LV3/k;)LV3/k;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-interface {v1, v2}, Ld4/n;->A(LV3/k;)Ld4/n;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v0, v3, v1}, LV3/b;->a(LV3/k;Ld4/n;)LV3/b;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    goto :goto_0

    .line 83
    :cond_2
    invoke-virtual {p2, v2}, LV3/k;->W(LV3/k;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_3

    .line 88
    .line 89
    invoke-static {p2, v2}, LV3/k;->b0(LV3/k;LV3/k;)LV3/k;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    :goto_2
    invoke-virtual {v1}, LV3/B;->a()LV3/b;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v0, v2, v1}, LV3/b;->f(LV3/k;LV3/b;)LV3/b;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    goto :goto_0

    .line 102
    :cond_3
    invoke-virtual {v2, p2}, LV3/k;->W(LV3/k;)Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_0

    .line 107
    .line 108
    invoke-static {v2, p2}, LV3/k;->b0(LV3/k;LV3/k;)LV3/k;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v2}, LV3/k;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eqz v3, :cond_4

    .line 117
    .line 118
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    goto :goto_2

    .line 123
    :cond_4
    invoke-virtual {v1}, LV3/B;->a()LV3/b;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v1, v2}, LV3/b;->T(LV3/k;)Ld4/n;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    if-eqz v1, :cond_0

    .line 132
    .line 133
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    goto :goto_1

    .line 138
    :cond_5
    return-object v0
.end method


# virtual methods
.method public a(LV3/k;LV3/b;Ljava/lang/Long;)V
    .locals 4

    .line 1
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, LV3/F;->c:Ljava/lang/Long;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    if-lez v0, :cond_0

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
    invoke-static {v0}, LY3/m;->f(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, LV3/F;->b:Ljava/util/List;

    .line 22
    .line 23
    new-instance v1, LV3/B;

    .line 24
    .line 25
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    invoke-direct {v1, v2, v3, p1, p2}, LV3/B;-><init>(JLV3/k;LV3/b;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, LV3/F;->a:LV3/b;

    .line 36
    .line 37
    invoke-virtual {v0, p1, p2}, LV3/b;->f(LV3/k;LV3/b;)LV3/b;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, LV3/F;->a:LV3/b;

    .line 42
    .line 43
    iput-object p3, p0, LV3/F;->c:Ljava/lang/Long;

    .line 44
    .line 45
    return-void
.end method

.method public b(LV3/k;Ld4/n;Ljava/lang/Long;Z)V
    .locals 8

    .line 1
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, LV3/F;->c:Ljava/lang/Long;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    if-lez v0, :cond_0

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
    invoke-static {v0}, LY3/m;->f(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, LV3/F;->b:Ljava/util/List;

    .line 22
    .line 23
    new-instance v7, LV3/B;

    .line 24
    .line 25
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    move-object v1, v7

    .line 30
    move-object v4, p1

    .line 31
    move-object v5, p2

    .line 32
    move v6, p4

    .line 33
    invoke-direct/range {v1 .. v6}, LV3/B;-><init>(JLV3/k;Ld4/n;Z)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    if-eqz p4, :cond_1

    .line 40
    .line 41
    iget-object p4, p0, LV3/F;->a:LV3/b;

    .line 42
    .line 43
    invoke-virtual {p4, p1, p2}, LV3/b;->a(LV3/k;Ld4/n;)LV3/b;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, LV3/F;->a:LV3/b;

    .line 48
    .line 49
    :cond_1
    iput-object p3, p0, LV3/F;->c:Ljava/lang/Long;

    .line 50
    .line 51
    return-void
.end method

.method public c(LV3/k;Ld4/b;La4/a;)Ld4/n;
    .locals 1

    .line 1
    invoke-virtual {p1, p2}, LV3/k;->U(Ld4/b;)LV3/k;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, LV3/F;->a:LV3/b;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, LV3/b;->T(LV3/k;)Ld4/n;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {p3, p2}, La4/a;->c(Ld4/b;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, LV3/F;->a:LV3/b;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, LV3/b;->k(LV3/k;)LV3/b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p3}, La4/a;->b()Ld4/n;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    invoke-interface {p3, p2}, Ld4/n;->v(Ld4/b;)Ld4/n;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p1, p2}, LV3/b;->g(Ld4/n;)Ld4/n;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :cond_1
    const/4 p1, 0x0

    .line 40
    return-object p1
.end method

.method public d(LV3/k;Ld4/n;Ljava/util/List;Z)Ld4/n;
    .locals 3

    .line 1
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    if-nez p4, :cond_4

    .line 9
    .line 10
    iget-object p3, p0, LV3/F;->a:LV3/b;

    .line 11
    .line 12
    invoke-virtual {p3, p1}, LV3/b;->T(LV3/k;)Ld4/n;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    return-object p3

    .line 19
    :cond_0
    iget-object p3, p0, LV3/F;->a:LV3/b;

    .line 20
    .line 21
    invoke-virtual {p3, p1}, LV3/b;->k(LV3/k;)LV3/b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, LV3/b;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    if-eqz p3, :cond_1

    .line 30
    .line 31
    return-object p2

    .line 32
    :cond_1
    if-nez p2, :cond_2

    .line 33
    .line 34
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    invoke-virtual {p1, p3}, LV3/b;->V(LV3/k;)Z

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    if-nez p3, :cond_2

    .line 43
    .line 44
    return-object v1

    .line 45
    :cond_2
    if-eqz p2, :cond_3

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-static {}, Ld4/g;->W()Ld4/g;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    :goto_0
    invoke-virtual {p1, p2}, LV3/b;->g(Ld4/n;)Ld4/n;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :cond_4
    iget-object v0, p0, LV3/F;->a:LV3/b;

    .line 58
    .line 59
    invoke-virtual {v0, p1}, LV3/b;->k(LV3/k;)LV3/b;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-nez p4, :cond_5

    .line 64
    .line 65
    invoke-virtual {v0}, LV3/b;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_5

    .line 70
    .line 71
    return-object p2

    .line 72
    :cond_5
    if-nez p4, :cond_6

    .line 73
    .line 74
    if-nez p2, :cond_6

    .line 75
    .line 76
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v0, v2}, LV3/b;->V(LV3/k;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_6

    .line 85
    .line 86
    return-object v1

    .line 87
    :cond_6
    new-instance v0, LV3/F$a;

    .line 88
    .line 89
    invoke-direct {v0, p0, p4, p3, p1}, LV3/F$a;-><init>(LV3/F;ZLjava/util/List;LV3/k;)V

    .line 90
    .line 91
    .line 92
    iget-object p3, p0, LV3/F;->b:Ljava/util/List;

    .line 93
    .line 94
    invoke-static {p3, v0, p1}, LV3/F;->j(Ljava/util/List;LY3/i;LV3/k;)LV3/b;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-eqz p2, :cond_7

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_7
    invoke-static {}, Ld4/g;->W()Ld4/g;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    :goto_1
    invoke-virtual {p1, p2}, LV3/b;->g(Ld4/n;)Ld4/n;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    return-object p1
.end method

.method public e(LV3/k;Ld4/n;)Ld4/n;
    .locals 6

    .line 1
    invoke-static {}, Ld4/g;->W()Ld4/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LV3/F;->a:LV3/b;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, LV3/b;->T(LV3/k;)Ld4/n;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v1}, Ld4/n;->B()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Ld4/m;

    .line 34
    .line 35
    invoke-virtual {p2}, Ld4/m;->c()Ld4/b;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p2}, Ld4/m;->d()Ld4/n;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-interface {v0, v1, p2}, Ld4/n;->N(Ld4/b;Ld4/n;)Ld4/n;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    return-object v0

    .line 49
    :cond_1
    iget-object v1, p0, LV3/F;->a:LV3/b;

    .line 50
    .line 51
    invoke-virtual {v1, p1}, LV3/b;->k(LV3/k;)LV3/b;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Ld4/m;

    .line 70
    .line 71
    new-instance v2, LV3/k;

    .line 72
    .line 73
    invoke-virtual {v1}, Ld4/m;->c()Ld4/b;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    const/4 v4, 0x1

    .line 78
    new-array v4, v4, [Ld4/b;

    .line 79
    .line 80
    const/4 v5, 0x0

    .line 81
    aput-object v3, v4, v5

    .line 82
    .line 83
    invoke-direct {v2, v4}, LV3/k;-><init>([Ld4/b;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v2}, LV3/b;->k(LV3/k;)LV3/b;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v1}, Ld4/m;->d()Ld4/n;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {v2, v3}, LV3/b;->g(Ld4/n;)Ld4/n;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v1}, Ld4/m;->c()Ld4/b;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-interface {v0, v1, v2}, Ld4/n;->N(Ld4/b;Ld4/n;)Ld4/n;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    goto :goto_1

    .line 107
    :cond_2
    invoke-virtual {p1}, LV3/b;->S()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    if-eqz p2, :cond_3

    .line 120
    .line 121
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    check-cast p2, Ld4/m;

    .line 126
    .line 127
    invoke-virtual {p2}, Ld4/m;->c()Ld4/b;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {p2}, Ld4/m;->d()Ld4/n;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-interface {v0, v1, p2}, Ld4/n;->N(Ld4/b;Ld4/n;)Ld4/n;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    goto :goto_2

    .line 140
    :cond_3
    return-object v0
.end method

.method public f(LV3/k;LV3/k;Ld4/n;Ld4/n;)Ld4/n;
    .locals 1

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 p3, 0x0

    .line 7
    goto :goto_1

    .line 8
    :cond_1
    :goto_0
    const/4 p3, 0x1

    .line 9
    :goto_1
    const-string v0, "Either existingEventSnap or existingServerSnap must exist"

    .line 10
    .line 11
    invoke-static {p3, v0}, LY3/m;->g(ZLjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, LV3/k;->T(LV3/k;)LV3/k;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p3, p0, LV3/F;->a:LV3/b;

    .line 19
    .line 20
    invoke-virtual {p3, p1}, LV3/b;->V(LV3/k;)Z

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    if-eqz p3, :cond_2

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    return-object p1

    .line 28
    :cond_2
    iget-object p3, p0, LV3/F;->a:LV3/b;

    .line 29
    .line 30
    invoke-virtual {p3, p1}, LV3/b;->k(LV3/k;)LV3/b;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, LV3/b;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    if-eqz p3, :cond_3

    .line 39
    .line 40
    invoke-interface {p4, p2}, Ld4/n;->A(LV3/k;)Ld4/n;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_3
    invoke-interface {p4, p2}, Ld4/n;->A(LV3/k;)Ld4/n;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p1, p2}, LV3/b;->g(Ld4/n;)Ld4/n;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1
.end method

.method public g(LV3/k;Ld4/n;Ld4/m;ZLd4/h;)Ld4/m;
    .locals 2

    .line 1
    iget-object v0, p0, LV3/F;->a:LV3/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LV3/b;->k(LV3/k;)LV3/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, LV3/b;->T(LV3/k;)Ld4/n;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    if-eqz p2, :cond_3

    .line 20
    .line 21
    invoke-virtual {p1, p2}, LV3/b;->g(Ld4/n;)Ld4/n;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_3

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    check-cast p2, Ld4/m;

    .line 40
    .line 41
    invoke-virtual {p5, p2, p3, p4}, Ld4/h;->a(Ld4/m;Ld4/m;Z)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-lez v0, :cond_1

    .line 46
    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    invoke-virtual {p5, p2, v1, p4}, Ld4/h;->a(Ld4/m;Ld4/m;Z)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-gez v0, :cond_1

    .line 54
    .line 55
    :cond_2
    move-object v1, p2

    .line 56
    goto :goto_1

    .line 57
    :cond_3
    return-object v1
.end method

.method public h(LV3/k;)LV3/G;
    .locals 1

    .line 1
    new-instance v0, LV3/G;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, LV3/G;-><init>(LV3/k;LV3/F;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public i(J)LV3/B;
    .locals 4

    .line 1
    iget-object v0, p0, LV3/F;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, LV3/B;

    .line 18
    .line 19
    invoke-virtual {v1}, LV3/B;->d()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    cmp-long v2, v2, p1

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    return-object p1
.end method

.method public k()Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, LV3/F;->b:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, LV3/b;->s()LV3/b;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iput-object v1, p0, LV3/F;->a:LV3/b;

    .line 13
    .line 14
    new-instance v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, LV3/F;->b:Ljava/util/List;

    .line 20
    .line 21
    return-object v0
.end method

.method public final l(LV3/B;LV3/k;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, LV3/B;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, LV3/B;->c()LV3/k;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1, p2}, LV3/k;->W(LV3/k;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-virtual {p1}, LV3/B;->a()LV3/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, LV3/b;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/util/Map$Entry;

    .line 35
    .line 36
    invoke-virtual {p1}, LV3/B;->c()LV3/k;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, LV3/k;

    .line 45
    .line 46
    invoke-virtual {v2, v1}, LV3/k;->T(LV3/k;)LV3/k;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1, p2}, LV3/k;->W(LV3/k;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    return p1

    .line 58
    :cond_2
    const/4 p1, 0x0

    .line 59
    return p1
.end method

.method public m(J)Z
    .locals 7

    .line 1
    iget-object v0, p0, LV3/F;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, LV3/B;

    .line 20
    .line 21
    invoke-virtual {v3}, LV3/B;->d()J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    cmp-long v4, v4, p1

    .line 26
    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v3, 0x0

    .line 34
    :goto_1
    const/4 p1, 0x1

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    move p2, p1

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    move p2, v1

    .line 40
    :goto_2
    const-string v0, "removeWrite called with nonexistent writeId"

    .line 41
    .line 42
    invoke-static {p2, v0}, LY3/m;->g(ZLjava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object p2, p0, LV3/F;->b:Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {p2, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, LV3/B;->f()Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    iget-object v0, p0, LV3/F;->b:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    sub-int/2addr v0, p1

    .line 61
    move v4, v1

    .line 62
    :goto_3
    if-eqz p2, :cond_5

    .line 63
    .line 64
    if-ltz v0, :cond_5

    .line 65
    .line 66
    iget-object v5, p0, LV3/F;->b:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    check-cast v5, LV3/B;

    .line 73
    .line 74
    invoke-virtual {v5}, LV3/B;->f()Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_4

    .line 79
    .line 80
    if-lt v0, v2, :cond_3

    .line 81
    .line 82
    invoke-virtual {v3}, LV3/B;->c()LV3/k;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-virtual {p0, v5, v6}, LV3/F;->l(LV3/B;LV3/k;)Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-eqz v6, :cond_3

    .line 91
    .line 92
    move p2, v1

    .line 93
    goto :goto_4

    .line 94
    :cond_3
    invoke-virtual {v3}, LV3/B;->c()LV3/k;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-virtual {v5}, LV3/B;->c()LV3/k;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-virtual {v6, v5}, LV3/k;->W(LV3/k;)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-eqz v5, :cond_4

    .line 107
    .line 108
    move v4, p1

    .line 109
    :cond_4
    :goto_4
    add-int/lit8 v0, v0, -0x1

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    if-nez p2, :cond_6

    .line 113
    .line 114
    return v1

    .line 115
    :cond_6
    if-eqz v4, :cond_7

    .line 116
    .line 117
    invoke-virtual {p0}, LV3/F;->n()V

    .line 118
    .line 119
    .line 120
    return p1

    .line 121
    :cond_7
    invoke-virtual {v3}, LV3/B;->e()Z

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    if-eqz p2, :cond_8

    .line 126
    .line 127
    iget-object p2, p0, LV3/F;->a:LV3/b;

    .line 128
    .line 129
    invoke-virtual {v3}, LV3/B;->c()LV3/k;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {p2, v0}, LV3/b;->W(LV3/k;)LV3/b;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    iput-object p2, p0, LV3/F;->a:LV3/b;

    .line 138
    .line 139
    goto :goto_6

    .line 140
    :cond_8
    invoke-virtual {v3}, LV3/B;->a()LV3/b;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    invoke-virtual {p2}, LV3/b;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_9

    .line 153
    .line 154
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, Ljava/util/Map$Entry;

    .line 159
    .line 160
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    check-cast v0, LV3/k;

    .line 165
    .line 166
    iget-object v1, p0, LV3/F;->a:LV3/b;

    .line 167
    .line 168
    invoke-virtual {v3}, LV3/B;->c()LV3/k;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-virtual {v2, v0}, LV3/k;->T(LV3/k;)LV3/k;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v1, v0}, LV3/b;->W(LV3/k;)LV3/b;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    iput-object v0, p0, LV3/F;->a:LV3/b;

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_9
    :goto_6
    return p1
.end method

.method public final n()V
    .locals 3

    .line 1
    iget-object v0, p0, LV3/F;->b:Ljava/util/List;

    .line 2
    .line 3
    sget-object v1, LV3/F;->d:LY3/i;

    .line 4
    .line 5
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {v0, v1, v2}, LV3/F;->j(Ljava/util/List;LY3/i;LV3/k;)LV3/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, LV3/F;->a:LV3/b;

    .line 14
    .line 15
    iget-object v0, p0, LV3/F;->b:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-lez v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, LV3/F;->b:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    add-int/lit8 v1, v1, -0x1

    .line 30
    .line 31
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, LV3/B;

    .line 36
    .line 37
    invoke-virtual {v0}, LV3/B;->d()J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, LV3/F;->c:Ljava/lang/Long;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    const-wide/16 v0, -0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :goto_1
    return-void
.end method

.method public o(LV3/k;)Ld4/n;
    .locals 1

    .line 1
    iget-object v0, p0, LV3/F;->a:LV3/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LV3/b;->T(LV3/k;)Ld4/n;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
