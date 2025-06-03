.class public final Lq0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/v;
.implements Lr0/k$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq0/m$b;
    }
.end annotation


# instance fields
.field public final A:Z

.field public final B:I

.field public final C:Z

.field public final D:Ll0/y1;

.field public final E:Lq0/s$b;

.field public final F:J

.field public G:Lx0/v$a;

.field public H:I

.field public I:Lx0/Z;

.field public J:[Lq0/s;

.field public K:[Lq0/s;

.field public L:[[I

.field public M:I

.field public N:Lx0/S;

.field public final o:Lq0/h;

.field public final p:Lr0/k;

.field public final q:Lq0/g;

.field public final r:Li0/y;

.field public final s:Lp0/x;

.field public final t:Lp0/v$a;

.field public final u:LB0/m;

.field public final v:Lx0/E$a;

.field public final w:LB0/b;

.field public final x:Ljava/util/IdentityHashMap;

.field public final y:Lq0/v;

.field public final z:Lx0/j;


# direct methods
.method public constructor <init>(Lq0/h;Lr0/k;Lq0/g;Li0/y;LB0/f;Lp0/x;Lp0/v$a;LB0/m;Lx0/E$a;LB0/b;Lx0/j;ZIZLl0/y1;J)V
    .locals 4

    .line 1
    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lq0/m;->o:Lq0/h;

    move-object v1, p2

    iput-object v1, v0, Lq0/m;->p:Lr0/k;

    move-object v1, p3

    iput-object v1, v0, Lq0/m;->q:Lq0/g;

    move-object v1, p4

    iput-object v1, v0, Lq0/m;->r:Li0/y;

    move-object v1, p6

    iput-object v1, v0, Lq0/m;->s:Lp0/x;

    move-object v1, p7

    iput-object v1, v0, Lq0/m;->t:Lp0/v$a;

    move-object v1, p8

    iput-object v1, v0, Lq0/m;->u:LB0/m;

    move-object v1, p9

    iput-object v1, v0, Lq0/m;->v:Lx0/E$a;

    move-object v1, p10

    iput-object v1, v0, Lq0/m;->w:LB0/b;

    move-object v1, p11

    iput-object v1, v0, Lq0/m;->z:Lx0/j;

    move/from16 v2, p12

    iput-boolean v2, v0, Lq0/m;->A:Z

    move/from16 v2, p13

    iput v2, v0, Lq0/m;->B:I

    move/from16 v2, p14

    iput-boolean v2, v0, Lq0/m;->C:Z

    move-object/from16 v2, p15

    iput-object v2, v0, Lq0/m;->D:Ll0/y1;

    move-wide/from16 v2, p16

    iput-wide v2, v0, Lq0/m;->F:J

    new-instance v2, Lq0/m$b;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lq0/m$b;-><init>(Lq0/m;Lq0/m$a;)V

    iput-object v2, v0, Lq0/m;->E:Lq0/s$b;

    invoke-interface {p11}, Lx0/j;->a()Lx0/S;

    move-result-object v1

    iput-object v1, v0, Lq0/m;->N:Lx0/S;

    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v1, v0, Lq0/m;->x:Ljava/util/IdentityHashMap;

    new-instance v1, Lq0/v;

    invoke-direct {v1}, Lq0/v;-><init>()V

    iput-object v1, v0, Lq0/m;->y:Lq0/v;

    const/4 v1, 0x0

    new-array v2, v1, [Lq0/s;

    iput-object v2, v0, Lq0/m;->J:[Lq0/s;

    new-array v2, v1, [Lq0/s;

    iput-object v2, v0, Lq0/m;->K:[Lq0/s;

    new-array v1, v1, [[I

    iput-object v1, v0, Lq0/m;->L:[[I

    return-void
.end method

.method public static A(Ljava/util/List;)Ljava/util/Map;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v2, v3, :cond_2

    .line 17
    .line 18
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Ld0/m;

    .line 23
    .line 24
    iget-object v4, v3, Ld0/m;->q:Ljava/lang/String;

    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    move v5, v2

    .line 29
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-ge v5, v6, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    check-cast v6, Ld0/m;

    .line 40
    .line 41
    iget-object v7, v6, Ld0/m;->q:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v7, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_0

    .line 48
    .line 49
    invoke-virtual {v3, v6}, Ld0/m;->f(Ld0/m;)Ld0/m;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    return-object v1
.end method

.method public static B(Ld0/q;)Ld0/q;
    .locals 4

    .line 1
    iget-object v0, p0, Ld0/q;->j:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Lg0/M;->Q(Ljava/lang/String;I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Ld0/z;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Ld0/q$b;

    .line 13
    .line 14
    invoke-direct {v2}, Ld0/q$b;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, Ld0/q;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ld0/q$b;->a0(Ljava/lang/String;)Ld0/q$b;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v3, p0, Ld0/q;->b:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ld0/q$b;->c0(Ljava/lang/String;)Ld0/q$b;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object v3, p0, Ld0/q;->c:Ljava/util/List;

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ld0/q$b;->d0(Ljava/util/List;)Ld0/q$b;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-object v3, p0, Ld0/q;->m:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ld0/q$b;->Q(Ljava/lang/String;)Ld0/q$b;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2, v1}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1, v0}, Ld0/q$b;->O(Ljava/lang/String;)Ld0/q$b;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v1, p0, Ld0/q;->k:Ld0/x;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ld0/q$b;->h0(Ld0/x;)Ld0/q$b;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget v1, p0, Ld0/q;->g:I

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ld0/q$b;->M(I)Ld0/q$b;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget v1, p0, Ld0/q;->h:I

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ld0/q$b;->j0(I)Ld0/q$b;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget v1, p0, Ld0/q;->t:I

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ld0/q$b;->v0(I)Ld0/q$b;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget v1, p0, Ld0/q;->u:I

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ld0/q$b;->Y(I)Ld0/q$b;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget v1, p0, Ld0/q;->v:F

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ld0/q$b;->X(F)Ld0/q$b;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget v1, p0, Ld0/q;->e:I

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ld0/q$b;->q0(I)Ld0/q$b;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget p0, p0, Ld0/q;->f:I

    .line 92
    .line 93
    invoke-virtual {v0, p0}, Ld0/q$b;->m0(I)Ld0/q$b;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0}, Ld0/q$b;->K()Ld0/q;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0
.end method

.method public static synthetic C(Lq0/s;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lq0/s;->n()Lx0/Z;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lx0/Z;->c()LX2/v;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static synthetic j(Lq0/s;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lq0/m;->C(Lq0/s;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic k(Lq0/m;)I
    .locals 1

    .line 1
    iget v0, p0, Lq0/m;->H:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lq0/m;->H:I

    .line 6
    .line 7
    return v0
.end method

.method public static synthetic m(Lq0/m;)[Lq0/s;
    .locals 0

    .line 1
    iget-object p0, p0, Lq0/m;->J:[Lq0/s;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic o(Lq0/m;Lx0/Z;)Lx0/Z;
    .locals 0

    .line 1
    iput-object p1, p0, Lq0/m;->I:Lx0/Z;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic r(Lq0/m;)Lx0/v$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lq0/m;->G:Lx0/v$a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic t(Lq0/m;)Lr0/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lq0/m;->p:Lr0/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static z(Ld0/q;Ld0/q;Z)Ld0/q;
    .locals 12

    .line 1
    invoke-static {}, LX2/v;->Y()LX2/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, Ld0/q;->j:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p1, Ld0/q;->k:Ld0/x;

    .line 11
    .line 12
    iget v3, p1, Ld0/q;->B:I

    .line 13
    .line 14
    iget v4, p1, Ld0/q;->e:I

    .line 15
    .line 16
    iget v5, p1, Ld0/q;->f:I

    .line 17
    .line 18
    iget-object v6, p1, Ld0/q;->d:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v7, p1, Ld0/q;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget-object p1, p1, Ld0/q;->c:Ljava/util/List;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    iget-object p1, p0, Ld0/q;->j:Ljava/lang/String;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-static {p1, v2}, Lg0/M;->Q(Ljava/lang/String;I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object v2, p0, Ld0/q;->k:Ld0/x;

    .line 33
    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    iget v3, p0, Ld0/q;->B:I

    .line 37
    .line 38
    iget v4, p0, Ld0/q;->e:I

    .line 39
    .line 40
    iget v5, p0, Ld0/q;->f:I

    .line 41
    .line 42
    iget-object v6, p0, Ld0/q;->d:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v7, p0, Ld0/q;->b:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v0, p0, Ld0/q;->c:Ljava/util/List;

    .line 47
    .line 48
    :goto_0
    move-object v11, v0

    .line 49
    move-object v0, p1

    .line 50
    move-object p1, v11

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const/4 v4, 0x0

    .line 53
    const/4 v6, 0x0

    .line 54
    move v3, v1

    .line 55
    move v5, v4

    .line 56
    move-object v7, v6

    .line 57
    goto :goto_0

    .line 58
    :goto_1
    invoke-static {v0}, Ld0/z;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    if-eqz p2, :cond_2

    .line 63
    .line 64
    iget v9, p0, Ld0/q;->g:I

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    move v9, v1

    .line 68
    :goto_2
    if-eqz p2, :cond_3

    .line 69
    .line 70
    iget v1, p0, Ld0/q;->h:I

    .line 71
    .line 72
    :cond_3
    new-instance p2, Ld0/q$b;

    .line 73
    .line 74
    invoke-direct {p2}, Ld0/q$b;-><init>()V

    .line 75
    .line 76
    .line 77
    iget-object v10, p0, Ld0/q;->a:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {p2, v10}, Ld0/q$b;->a0(Ljava/lang/String;)Ld0/q$b;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-virtual {p2, v7}, Ld0/q$b;->c0(Ljava/lang/String;)Ld0/q$b;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {p2, p1}, Ld0/q$b;->d0(Ljava/util/List;)Ld0/q$b;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iget-object p0, p0, Ld0/q;->m:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {p1, p0}, Ld0/q$b;->Q(Ljava/lang/String;)Ld0/q$b;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0, v8}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p0, v0}, Ld0/q$b;->O(Ljava/lang/String;)Ld0/q$b;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {p0, v2}, Ld0/q$b;->h0(Ld0/x;)Ld0/q$b;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {p0, v9}, Ld0/q$b;->M(I)Ld0/q$b;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-virtual {p0, v1}, Ld0/q$b;->j0(I)Ld0/q$b;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p0, v3}, Ld0/q$b;->N(I)Ld0/q$b;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {p0, v4}, Ld0/q$b;->q0(I)Ld0/q$b;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {p0, v5}, Ld0/q$b;->m0(I)Ld0/q$b;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-virtual {p0, v6}, Ld0/q$b;->e0(Ljava/lang/String;)Ld0/q$b;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-virtual {p0}, Ld0/q$b;->K()Ld0/q;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0
.end method


# virtual methods
.method public D()V
    .locals 4

    .line 1
    iget-object v0, p0, Lq0/m;->p:Lr0/k;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Lr0/k;->l(Lr0/k$b;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq0/m;->J:[Lq0/s;

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    aget-object v3, v0, v2

    .line 13
    .line 14
    invoke-virtual {v3}, Lq0/s;->h0()V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lq0/m;->G:Lx0/v$a;

    .line 22
    .line 23
    return-void
.end method

.method public a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lq0/m;->J:[Lq0/s;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3}, Lq0/s;->d0()V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lq0/m;->G:Lx0/v$a;

    .line 16
    .line 17
    invoke-interface {v0, p0}, Lx0/S$a;->e(Lx0/S;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/m;->N:Lx0/S;

    .line 2
    .line 3
    invoke-interface {v0}, Lx0/S;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public c()J
    .locals 2

    .line 1
    iget-object v0, p0, Lq0/m;->N:Lx0/S;

    .line 2
    .line 3
    invoke-interface {v0}, Lx0/S;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public d(JLk0/d1;)J
    .locals 5

    .line 1
    iget-object v0, p0, Lq0/m;->K:[Lq0/s;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3}, Lq0/s;->S()Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    invoke-virtual {v3, p1, p2, p3}, Lq0/s;->d(JLk0/d1;)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    :goto_1
    return-wide p1
.end method

.method public e(Landroid/net/Uri;LB0/m$c;Z)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lq0/m;->J:[Lq0/s;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    :goto_0
    if-ge v3, v1, :cond_0

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    invoke-virtual {v4, p1, p2, p3}, Lq0/s;->c0(Landroid/net/Uri;LB0/m$c;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    and-int/2addr v2, v4

    .line 15
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p1, p0, Lq0/m;->G:Lx0/v$a;

    .line 19
    .line 20
    invoke-interface {p1, p0}, Lx0/S$a;->e(Lx0/S;)V

    .line 21
    .line 22
    .line 23
    return v2
.end method

.method public f()J
    .locals 2

    .line 1
    iget-object v0, p0, Lq0/m;->N:Lx0/S;

    .line 2
    .line 3
    invoke-interface {v0}, Lx0/S;->f()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public g(Lk0/y0;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lq0/m;->I:Lx0/Z;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Lq0/m;->J:[Lq0/s;

    .line 6
    .line 7
    array-length v0, p1

    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    if-ge v2, v0, :cond_0

    .line 11
    .line 12
    aget-object v3, p1, v2

    .line 13
    .line 14
    invoke-virtual {v3}, Lq0/s;->C()V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return v1

    .line 21
    :cond_1
    iget-object v0, p0, Lq0/m;->N:Lx0/S;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Lx0/S;->g(Lk0/y0;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
.end method

.method public h(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/m;->N:Lx0/S;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lx0/S;->h(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public i([LA0/y;[Z[Lx0/Q;[ZJ)J
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    new-array v3, v3, [I

    .line 9
    .line 10
    array-length v4, v1

    .line 11
    new-array v4, v4, [I

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    :goto_0
    array-length v7, v1

    .line 15
    if-ge v6, v7, :cond_3

    .line 16
    .line 17
    aget-object v7, v2, v6

    .line 18
    .line 19
    const/4 v8, -0x1

    .line 20
    if-nez v7, :cond_0

    .line 21
    .line 22
    move v7, v8

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v9, v0, Lq0/m;->x:Ljava/util/IdentityHashMap;

    .line 25
    .line 26
    invoke-virtual {v9, v7}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    check-cast v7, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    :goto_1
    aput v7, v3, v6

    .line 37
    .line 38
    aput v8, v4, v6

    .line 39
    .line 40
    aget-object v7, v1, v6

    .line 41
    .line 42
    if-eqz v7, :cond_2

    .line 43
    .line 44
    invoke-interface {v7}, LA0/B;->d()Ld0/J;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    const/4 v9, 0x0

    .line 49
    :goto_2
    iget-object v10, v0, Lq0/m;->J:[Lq0/s;

    .line 50
    .line 51
    array-length v11, v10

    .line 52
    if-ge v9, v11, :cond_2

    .line 53
    .line 54
    aget-object v10, v10, v9

    .line 55
    .line 56
    invoke-virtual {v10}, Lq0/s;->n()Lx0/Z;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    invoke-virtual {v10, v7}, Lx0/Z;->d(Ld0/J;)I

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    if-eq v10, v8, :cond_1

    .line 65
    .line 66
    aput v9, v4, v6

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    iget-object v6, v0, Lq0/m;->x:Ljava/util/IdentityHashMap;

    .line 76
    .line 77
    invoke-virtual {v6}, Ljava/util/IdentityHashMap;->clear()V

    .line 78
    .line 79
    .line 80
    array-length v6, v1

    .line 81
    new-array v7, v6, [Lx0/Q;

    .line 82
    .line 83
    array-length v8, v1

    .line 84
    new-array v8, v8, [Lx0/Q;

    .line 85
    .line 86
    array-length v9, v1

    .line 87
    new-array v14, v9, [LA0/y;

    .line 88
    .line 89
    iget-object v9, v0, Lq0/m;->J:[Lq0/s;

    .line 90
    .line 91
    array-length v9, v9

    .line 92
    new-array v15, v9, [Lq0/s;

    .line 93
    .line 94
    const/4 v12, 0x0

    .line 95
    const/4 v13, 0x0

    .line 96
    const/16 v17, 0x0

    .line 97
    .line 98
    :goto_4
    iget-object v9, v0, Lq0/m;->J:[Lq0/s;

    .line 99
    .line 100
    array-length v9, v9

    .line 101
    if-ge v13, v9, :cond_10

    .line 102
    .line 103
    const/4 v9, 0x0

    .line 104
    :goto_5
    array-length v10, v1

    .line 105
    if-ge v9, v10, :cond_6

    .line 106
    .line 107
    aget v10, v3, v9

    .line 108
    .line 109
    const/4 v11, 0x0

    .line 110
    if-ne v10, v13, :cond_4

    .line 111
    .line 112
    aget-object v10, v2, v9

    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_4
    move-object v10, v11

    .line 116
    :goto_6
    aput-object v10, v8, v9

    .line 117
    .line 118
    aget v10, v4, v9

    .line 119
    .line 120
    if-ne v10, v13, :cond_5

    .line 121
    .line 122
    aget-object v11, v1, v9

    .line 123
    .line 124
    :cond_5
    aput-object v11, v14, v9

    .line 125
    .line 126
    add-int/lit8 v9, v9, 0x1

    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_6
    iget-object v9, v0, Lq0/m;->J:[Lq0/s;

    .line 130
    .line 131
    aget-object v11, v9, v13

    .line 132
    .line 133
    move-object v9, v11

    .line 134
    move-object v10, v14

    .line 135
    move-object v5, v11

    .line 136
    move-object/from16 v11, p2

    .line 137
    .line 138
    move v2, v12

    .line 139
    move-object v12, v8

    .line 140
    move/from16 v18, v6

    .line 141
    .line 142
    move v6, v13

    .line 143
    move-object/from16 v13, p4

    .line 144
    .line 145
    move-object/from16 v19, v14

    .line 146
    .line 147
    move-object/from16 v20, v15

    .line 148
    .line 149
    move-wide/from16 v14, p5

    .line 150
    .line 151
    move/from16 v16, v17

    .line 152
    .line 153
    invoke-virtual/range {v9 .. v16}, Lq0/s;->l0([LA0/y;[Z[Lx0/Q;[ZJZ)Z

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    const/4 v10, 0x0

    .line 158
    const/4 v11, 0x0

    .line 159
    :goto_7
    array-length v12, v1

    .line 160
    const/4 v13, 0x1

    .line 161
    if-ge v10, v12, :cond_a

    .line 162
    .line 163
    aget-object v12, v8, v10

    .line 164
    .line 165
    aget v14, v4, v10

    .line 166
    .line 167
    if-ne v14, v6, :cond_7

    .line 168
    .line 169
    invoke-static {v12}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    aput-object v12, v7, v10

    .line 173
    .line 174
    iget-object v11, v0, Lq0/m;->x:Ljava/util/IdentityHashMap;

    .line 175
    .line 176
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object v14

    .line 180
    invoke-virtual {v11, v12, v14}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move v11, v13

    .line 184
    goto :goto_9

    .line 185
    :cond_7
    aget v14, v3, v10

    .line 186
    .line 187
    if-ne v14, v6, :cond_9

    .line 188
    .line 189
    if-nez v12, :cond_8

    .line 190
    .line 191
    goto :goto_8

    .line 192
    :cond_8
    const/4 v13, 0x0

    .line 193
    :goto_8
    invoke-static {v13}, Lg0/a;->f(Z)V

    .line 194
    .line 195
    .line 196
    :cond_9
    :goto_9
    add-int/lit8 v10, v10, 0x1

    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_a
    move-object/from16 v10, v20

    .line 200
    .line 201
    if-eqz v11, :cond_e

    .line 202
    .line 203
    aput-object v5, v10, v2

    .line 204
    .line 205
    add-int/lit8 v12, v2, 0x1

    .line 206
    .line 207
    if-nez v2, :cond_c

    .line 208
    .line 209
    invoke-virtual {v5, v13}, Lq0/s;->o0(Z)V

    .line 210
    .line 211
    .line 212
    if-nez v9, :cond_b

    .line 213
    .line 214
    iget-object v2, v0, Lq0/m;->K:[Lq0/s;

    .line 215
    .line 216
    array-length v9, v2

    .line 217
    if-eqz v9, :cond_b

    .line 218
    .line 219
    const/4 v9, 0x0

    .line 220
    aget-object v2, v2, v9

    .line 221
    .line 222
    if-eq v5, v2, :cond_f

    .line 223
    .line 224
    :cond_b
    iget-object v2, v0, Lq0/m;->y:Lq0/v;

    .line 225
    .line 226
    invoke-virtual {v2}, Lq0/v;->b()V

    .line 227
    .line 228
    .line 229
    move/from16 v17, v13

    .line 230
    .line 231
    goto :goto_b

    .line 232
    :cond_c
    iget v2, v0, Lq0/m;->M:I

    .line 233
    .line 234
    if-ge v6, v2, :cond_d

    .line 235
    .line 236
    goto :goto_a

    .line 237
    :cond_d
    const/4 v13, 0x0

    .line 238
    :goto_a
    invoke-virtual {v5, v13}, Lq0/s;->o0(Z)V

    .line 239
    .line 240
    .line 241
    goto :goto_b

    .line 242
    :cond_e
    move v12, v2

    .line 243
    :cond_f
    :goto_b
    add-int/lit8 v13, v6, 0x1

    .line 244
    .line 245
    move-object/from16 v2, p3

    .line 246
    .line 247
    move-object v15, v10

    .line 248
    move/from16 v6, v18

    .line 249
    .line 250
    move-object/from16 v14, v19

    .line 251
    .line 252
    goto/16 :goto_4

    .line 253
    .line 254
    :cond_10
    move-object v10, v15

    .line 255
    const/4 v5, 0x0

    .line 256
    invoke-static {v7, v5, v2, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 257
    .line 258
    .line 259
    invoke-static {v10, v12}, Lg0/M;->O0([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    check-cast v1, [Lq0/s;

    .line 264
    .line 265
    iput-object v1, v0, Lq0/m;->K:[Lq0/s;

    .line 266
    .line 267
    invoke-static {v1}, LX2/v;->V([Ljava/lang/Object;)LX2/v;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    iget-object v2, v0, Lq0/m;->z:Lx0/j;

    .line 272
    .line 273
    new-instance v3, Lq0/l;

    .line 274
    .line 275
    invoke-direct {v3}, Lq0/l;-><init>()V

    .line 276
    .line 277
    .line 278
    invoke-static {v1, v3}, LX2/E;->k(Ljava/util/List;LW2/g;)Ljava/util/List;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    invoke-interface {v2, v1, v3}, Lx0/j;->b(Ljava/util/List;Ljava/util/List;)Lx0/S;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    iput-object v1, v0, Lq0/m;->N:Lx0/S;

    .line 287
    .line 288
    return-wide p5
.end method

.method public l()J
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide v0
.end method

.method public n()Lx0/Z;
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/m;->I:Lx0/Z;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lx0/Z;

    .line 8
    .line 9
    return-object v0
.end method

.method public p()V
    .locals 4

    .line 1
    iget-object v0, p0, Lq0/m;->J:[Lq0/s;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3}, Lq0/s;->p()V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public q(JZ)V
    .locals 4

    .line 1
    iget-object v0, p0, Lq0/m;->K:[Lq0/s;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3, p1, p2, p3}, Lq0/s;->q(JZ)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public s(J)J
    .locals 4

    .line 1
    iget-object v0, p0, Lq0/m;->K:[Lq0/s;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-lez v1, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, v1}, Lq0/s;->k0(JZ)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    :goto_0
    iget-object v2, p0, Lq0/m;->K:[Lq0/s;

    .line 15
    .line 16
    array-length v3, v2

    .line 17
    if-ge v1, v3, :cond_0

    .line 18
    .line 19
    aget-object v2, v2, v1

    .line 20
    .line 21
    invoke-virtual {v2, p1, p2, v0}, Lq0/s;->k0(JZ)Z

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lq0/m;->y:Lq0/v;

    .line 30
    .line 31
    invoke-virtual {v0}, Lq0/v;->b()V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-wide p1
.end method

.method public u(Lx0/v$a;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq0/m;->G:Lx0/v$a;

    .line 2
    .line 3
    iget-object p1, p0, Lq0/m;->p:Lr0/k;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Lr0/k;->j(Lr0/k$b;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p2, p3}, Lq0/m;->x(J)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final v(JLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V
    .locals 22

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-instance v2, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance v3, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, Ljava/util/HashSet;

    .line 32
    .line 33
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 34
    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    move v7, v6

    .line 38
    :goto_0
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    if-ge v7, v8, :cond_5

    .line 43
    .line 44
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    check-cast v8, Lr0/g$a;

    .line 49
    .line 50
    iget-object v8, v8, Lr0/g$a;->d:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v5, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    if-nez v9, :cond_0

    .line 57
    .line 58
    move-object/from16 v13, p0

    .line 59
    .line 60
    move-object/from16 v11, p4

    .line 61
    .line 62
    move-object/from16 v12, p5

    .line 63
    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 73
    .line 74
    .line 75
    move v10, v1

    .line 76
    move v9, v6

    .line 77
    :goto_1
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 78
    .line 79
    .line 80
    move-result v11

    .line 81
    if-ge v9, v11, :cond_3

    .line 82
    .line 83
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    check-cast v11, Lr0/g$a;

    .line 88
    .line 89
    iget-object v11, v11, Lr0/g$a;->d:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v8, v11}, Lg0/M;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v11

    .line 95
    if-eqz v11, :cond_2

    .line 96
    .line 97
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    check-cast v11, Lr0/g$a;

    .line 102
    .line 103
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    iget-object v12, v11, Lr0/g$a;->a:Landroid/net/Uri;

    .line 111
    .line 112
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    iget-object v12, v11, Lr0/g$a;->b:Ld0/q;

    .line 116
    .line 117
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    iget-object v11, v11, Lr0/g$a;->b:Ld0/q;

    .line 121
    .line 122
    iget-object v11, v11, Ld0/q;->j:Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {v11, v1}, Lg0/M;->P(Ljava/lang/String;I)I

    .line 125
    .line 126
    .line 127
    move-result v11

    .line 128
    if-ne v11, v1, :cond_1

    .line 129
    .line 130
    move v11, v1

    .line 131
    goto :goto_2

    .line 132
    :cond_1
    move v11, v6

    .line 133
    :goto_2
    and-int/2addr v10, v11

    .line 134
    :cond_2
    add-int/2addr v9, v1

    .line 135
    goto :goto_1

    .line 136
    :cond_3
    new-instance v9, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 139
    .line 140
    .line 141
    const-string v11, "audio:"

    .line 142
    .line 143
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    new-array v9, v6, [Landroid/net/Uri;

    .line 154
    .line 155
    invoke-static {v9}, Lg0/M;->j([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    check-cast v9, [Landroid/net/Uri;

    .line 160
    .line 161
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    move-object v15, v9

    .line 166
    check-cast v15, [Landroid/net/Uri;

    .line 167
    .line 168
    new-array v9, v6, [Ld0/q;

    .line 169
    .line 170
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    move-object/from16 v16, v9

    .line 175
    .line 176
    check-cast v16, [Ld0/q;

    .line 177
    .line 178
    const/16 v17, 0x0

    .line 179
    .line 180
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v18

    .line 184
    const/4 v14, 0x1

    .line 185
    move-object/from16 v12, p0

    .line 186
    .line 187
    move-object v13, v8

    .line 188
    move-object/from16 v19, p6

    .line 189
    .line 190
    move-wide/from16 v20, p1

    .line 191
    .line 192
    invoke-virtual/range {v12 .. v21}, Lq0/m;->y(Ljava/lang/String;I[Landroid/net/Uri;[Ld0/q;Ld0/q;Ljava/util/List;Ljava/util/Map;J)Lq0/s;

    .line 193
    .line 194
    .line 195
    move-result-object v9

    .line 196
    invoke-static {v4}, La3/f;->n(Ljava/util/Collection;)[I

    .line 197
    .line 198
    .line 199
    move-result-object v11

    .line 200
    move-object/from16 v12, p5

    .line 201
    .line 202
    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-object/from16 v11, p4

    .line 206
    .line 207
    invoke-interface {v11, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-object/from16 v13, p0

    .line 211
    .line 212
    iget-boolean v14, v13, Lq0/m;->A:Z

    .line 213
    .line 214
    if-eqz v14, :cond_4

    .line 215
    .line 216
    if-eqz v10, :cond_4

    .line 217
    .line 218
    new-array v10, v6, [Ld0/q;

    .line 219
    .line 220
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v10

    .line 224
    check-cast v10, [Ld0/q;

    .line 225
    .line 226
    new-instance v14, Ld0/J;

    .line 227
    .line 228
    invoke-direct {v14, v8, v10}, Ld0/J;-><init>(Ljava/lang/String;[Ld0/q;)V

    .line 229
    .line 230
    .line 231
    new-array v8, v1, [Ld0/J;

    .line 232
    .line 233
    aput-object v14, v8, v6

    .line 234
    .line 235
    new-array v10, v6, [I

    .line 236
    .line 237
    invoke-virtual {v9, v8, v6, v10}, Lq0/s;->f0([Ld0/J;I[I)V

    .line 238
    .line 239
    .line 240
    :cond_4
    :goto_3
    add-int/2addr v7, v1

    .line 241
    goto/16 :goto_0

    .line 242
    .line 243
    :cond_5
    move-object/from16 v13, p0

    .line 244
    .line 245
    return-void
.end method

.method public final w(Lr0/g;JLjava/util/List;Ljava/util/List;Ljava/util/Map;)V
    .locals 19

    .line 1
    move-object/from16 v10, p0

    move-object/from16 v11, p1

    const/4 v12, 0x1

    iget-object v0, v11, Lr0/g;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [I

    const/4 v13, 0x0

    move v2, v13

    move v3, v2

    move v4, v3

    :goto_0
    iget-object v5, v11, Lr0/g;->e:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x2

    if-ge v2, v5, :cond_3

    iget-object v5, v11, Lr0/g;->e:Ljava/util/List;

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr0/g$b;

    iget-object v5, v5, Lr0/g$b;->b:Ld0/q;

    iget v7, v5, Ld0/q;->u:I

    if-gtz v7, :cond_2

    iget-object v7, v5, Ld0/q;->j:Ljava/lang/String;

    invoke-static {v7, v6}, Lg0/M;->Q(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    iget-object v5, v5, Ld0/q;->j:Ljava/lang/String;

    invoke-static {v5, v12}, Lg0/M;->Q(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    aput v12, v1, v2

    add-int/2addr v4, v12

    goto :goto_2

    :cond_1
    const/4 v5, -0x1

    aput v5, v1, v2

    goto :goto_2

    :cond_2
    :goto_1
    aput v6, v1, v2

    add-int/2addr v3, v12

    :goto_2
    add-int/2addr v2, v12

    goto :goto_0

    :cond_3
    if-lez v3, :cond_4

    move v14, v3

    move v0, v12

    move v2, v13

    goto :goto_3

    :cond_4
    if-ge v4, v0, :cond_5

    sub-int/2addr v0, v4

    move v14, v0

    move v2, v12

    move v0, v13

    goto :goto_3

    :cond_5
    move v14, v0

    move v0, v13

    move v2, v0

    :goto_3
    new-array v3, v14, [Landroid/net/Uri;

    new-array v15, v14, [Ld0/q;

    new-array v8, v14, [I

    move v4, v13

    move v5, v4

    :goto_4
    iget-object v7, v11, Lr0/g;->e:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v4, v7, :cond_9

    if-eqz v0, :cond_6

    aget v7, v1, v4

    if-ne v7, v6, :cond_8

    :cond_6
    if-eqz v2, :cond_7

    aget v7, v1, v4

    if-eq v7, v12, :cond_8

    :cond_7
    iget-object v7, v11, Lr0/g;->e:Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lr0/g$b;

    iget-object v9, v7, Lr0/g$b;->a:Landroid/net/Uri;

    aput-object v9, v3, v5

    iget-object v7, v7, Lr0/g$b;->b:Ld0/q;

    aput-object v7, v15, v5

    add-int/lit8 v7, v5, 0x1

    aput v4, v8, v5

    move v5, v7

    :cond_8
    add-int/2addr v4, v12

    goto :goto_4

    :cond_9
    aget-object v1, v15, v13

    iget-object v1, v1, Ld0/q;->j:Ljava/lang/String;

    invoke-static {v1, v6}, Lg0/M;->P(Ljava/lang/String;I)I

    move-result v9

    invoke-static {v1, v12}, Lg0/M;->P(Ljava/lang/String;I)I

    move-result v7

    if-eq v7, v12, :cond_a

    if-nez v7, :cond_b

    iget-object v1, v11, Lr0/g;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_b

    :cond_a
    if-gt v9, v12, :cond_b

    add-int v1, v7, v9

    if-lez v1, :cond_b

    move/from16 v16, v12

    goto :goto_5

    :cond_b
    move/from16 v16, v13

    :goto_5
    if-nez v0, :cond_c

    if-lez v7, :cond_c

    move v2, v12

    goto :goto_6

    :cond_c
    move v2, v13

    :goto_6
    iget-object v5, v11, Lr0/g;->j:Ld0/q;

    iget-object v6, v11, Lr0/g;->k:Ljava/util/List;

    const-string v4, "main"

    move-object/from16 v0, p0

    move-object v1, v4

    move-object v13, v4

    move-object v4, v15

    move/from16 v17, v7

    move-object/from16 v7, p6

    move-object v12, v8

    move/from16 v18, v9

    move-wide/from16 v8, p2

    invoke-virtual/range {v0 .. v9}, Lq0/m;->y(Ljava/lang/String;I[Landroid/net/Uri;[Ld0/q;Ld0/q;Ljava/util/List;Ljava/util/Map;J)Lq0/s;

    move-result-object v0

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p5

    invoke-interface {v1, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-boolean v1, v10, Lq0/m;->A:Z

    if-eqz v1, :cond_13

    if-eqz v16, :cond_13

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-lez v18, :cond_11

    new-array v2, v14, [Ld0/q;

    const/4 v3, 0x0

    :goto_7
    if-ge v3, v14, :cond_d

    aget-object v4, v15, v3

    invoke-static {v4}, Lq0/m;->B(Ld0/q;)Ld0/q;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v4, 0x1

    add-int/2addr v3, v4

    goto :goto_7

    :cond_d
    new-instance v3, Ld0/J;

    invoke-direct {v3, v13, v2}, Ld0/J;-><init>(Ljava/lang/String;[Ld0/q;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-lez v17, :cond_f

    iget-object v2, v11, Lr0/g;->j:Ld0/q;

    if-nez v2, :cond_e

    iget-object v2, v11, Lr0/g;->g:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_f

    :cond_e
    new-instance v2, Ld0/J;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ":audio"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aget-object v5, v15, v4

    iget-object v6, v11, Lr0/g;->j:Ld0/q;

    invoke-static {v5, v6, v4}, Lq0/m;->z(Ld0/q;Ld0/q;Z)Ld0/q;

    move-result-object v5

    const/4 v6, 0x1

    new-array v7, v6, [Ld0/q;

    aput-object v5, v7, v4

    invoke-direct {v2, v3, v7}, Ld0/J;-><init>(Ljava/lang/String;[Ld0/q;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_f
    iget-object v2, v11, Lr0/g;->k:Ljava/util/List;

    if-eqz v2, :cond_10

    const/4 v4, 0x0

    :goto_8
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v4, v3, :cond_10

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ":cc:"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ld0/J;

    iget-object v6, v10, Lq0/m;->o:Lq0/h;

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ld0/q;

    invoke-interface {v6, v7}, Lq0/h;->b(Ld0/q;)Ld0/q;

    move-result-object v6

    const/4 v7, 0x1

    new-array v8, v7, [Ld0/q;

    const/4 v9, 0x0

    aput-object v6, v8, v9

    invoke-direct {v5, v3, v8}, Ld0/J;-><init>(Ljava/lang/String;[Ld0/q;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v4, v7

    goto :goto_8

    :cond_10
    const/4 v7, 0x1

    goto :goto_a

    :cond_11
    const/4 v7, 0x1

    new-array v2, v14, [Ld0/q;

    const/4 v4, 0x0

    :goto_9
    if-ge v4, v14, :cond_12

    aget-object v3, v15, v4

    iget-object v5, v11, Lr0/g;->j:Ld0/q;

    invoke-static {v3, v5, v7}, Lq0/m;->z(Ld0/q;Ld0/q;Z)Ld0/q;

    move-result-object v3

    aput-object v3, v2, v4

    add-int/2addr v4, v7

    goto :goto_9

    :cond_12
    new-instance v3, Ld0/J;

    invoke-direct {v3, v13, v2}, Ld0/J;-><init>(Ljava/lang/String;[Ld0/q;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_a
    new-instance v2, Ld0/J;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ":id3"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ld0/q$b;

    invoke-direct {v4}, Ld0/q$b;-><init>()V

    const-string v5, "ID3"

    invoke-virtual {v4, v5}, Ld0/q$b;->a0(Ljava/lang/String;)Ld0/q$b;

    move-result-object v4

    const-string v5, "application/id3"

    invoke-virtual {v4, v5}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    move-result-object v4

    invoke-virtual {v4}, Ld0/q$b;->K()Ld0/q;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ld0/q;

    const/4 v6, 0x0

    aput-object v4, v5, v6

    invoke-direct {v2, v3, v5}, Ld0/J;-><init>(Ljava/lang/String;[Ld0/q;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-array v3, v6, [Ld0/J;

    invoke-interface {v1, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ld0/J;

    invoke-interface {v1, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    filled-new-array {v1}, [I

    move-result-object v1

    invoke-virtual {v0, v3, v6, v1}, Lq0/s;->f0([Ld0/J;I[I)V

    :cond_13
    return-void
.end method

.method public final x(J)V
    .locals 19

    .line 1
    move-object/from16 v10, p0

    .line 2
    .line 3
    const/4 v11, 0x0

    .line 4
    const/4 v12, 0x1

    .line 5
    iget-object v0, v10, Lq0/m;->p:Lr0/k;

    .line 6
    .line 7
    invoke-interface {v0}, Lr0/k;->b()Lr0/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    move-object v1, v0

    .line 16
    check-cast v1, Lr0/g;

    .line 17
    .line 18
    iget-boolean v0, v10, Lq0/m;->C:Z

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, v1, Lr0/g;->m:Ljava/util/List;

    .line 23
    .line 24
    invoke-static {v0}, Lq0/m;->A(Ljava/util/List;)Ljava/util/Map;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    move-object v13, v0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object v0, v1, Lr0/g;->e:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    xor-int/2addr v0, v12

    .line 42
    iget-object v7, v1, Lr0/g;->g:Ljava/util/List;

    .line 43
    .line 44
    iget-object v14, v1, Lr0/g;->h:Ljava/util/List;

    .line 45
    .line 46
    iput v11, v10, Lq0/m;->H:I

    .line 47
    .line 48
    new-instance v15, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    new-instance v8, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    move-object/from16 v0, p0

    .line 61
    .line 62
    move-wide/from16 v2, p1

    .line 63
    .line 64
    move-object v4, v15

    .line 65
    move-object v5, v8

    .line 66
    move-object v6, v13

    .line 67
    invoke-virtual/range {v0 .. v6}, Lq0/m;->w(Lr0/g;JLjava/util/List;Ljava/util/List;Ljava/util/Map;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    move-object/from16 v0, p0

    .line 71
    .line 72
    move-wide/from16 v1, p1

    .line 73
    .line 74
    move-object v3, v7

    .line 75
    move-object v4, v15

    .line 76
    move-object v5, v8

    .line 77
    move-object v6, v13

    .line 78
    invoke-virtual/range {v0 .. v6}, Lq0/m;->v(JLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iput v0, v10, Lq0/m;->M:I

    .line 86
    .line 87
    move v9, v11

    .line 88
    :goto_2
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-ge v9, v0, :cond_2

    .line 93
    .line 94
    invoke-interface {v14, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Lr0/g$a;

    .line 99
    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    const-string v2, "subtitle:"

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v2, ":"

    .line 114
    .line 115
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget-object v2, v0, Lr0/g$a;->d:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    iget-object v6, v0, Lr0/g$a;->b:Ld0/q;

    .line 128
    .line 129
    iget-object v0, v0, Lr0/g$a;->a:Landroid/net/Uri;

    .line 130
    .line 131
    new-array v3, v12, [Landroid/net/Uri;

    .line 132
    .line 133
    aput-object v0, v3, v11

    .line 134
    .line 135
    new-array v4, v12, [Ld0/q;

    .line 136
    .line 137
    aput-object v6, v4, v11

    .line 138
    .line 139
    const/4 v5, 0x0

    .line 140
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v16

    .line 144
    const/4 v2, 0x3

    .line 145
    move-object/from16 v0, p0

    .line 146
    .line 147
    move-object v1, v7

    .line 148
    move-object v11, v6

    .line 149
    move-object/from16 v6, v16

    .line 150
    .line 151
    move-object/from16 v17, v7

    .line 152
    .line 153
    move-object v7, v13

    .line 154
    move-object v12, v8

    .line 155
    move/from16 v18, v9

    .line 156
    .line 157
    move-wide/from16 v8, p1

    .line 158
    .line 159
    invoke-virtual/range {v0 .. v9}, Lq0/m;->y(Ljava/lang/String;I[Landroid/net/Uri;[Ld0/q;Ld0/q;Ljava/util/List;Ljava/util/Map;J)Lq0/s;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    filled-new-array/range {v18 .. v18}, [I

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    new-instance v1, Ld0/J;

    .line 174
    .line 175
    iget-object v2, v10, Lq0/m;->o:Lq0/h;

    .line 176
    .line 177
    invoke-interface {v2, v11}, Lq0/h;->b(Ld0/q;)Ld0/q;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    const/4 v3, 0x1

    .line 182
    new-array v4, v3, [Ld0/q;

    .line 183
    .line 184
    const/4 v5, 0x0

    .line 185
    aput-object v2, v4, v5

    .line 186
    .line 187
    move-object/from16 v2, v17

    .line 188
    .line 189
    invoke-direct {v1, v2, v4}, Ld0/J;-><init>(Ljava/lang/String;[Ld0/q;)V

    .line 190
    .line 191
    .line 192
    new-array v2, v3, [Ld0/J;

    .line 193
    .line 194
    aput-object v1, v2, v5

    .line 195
    .line 196
    new-array v1, v5, [I

    .line 197
    .line 198
    invoke-virtual {v0, v2, v5, v1}, Lq0/s;->f0([Ld0/J;I[I)V

    .line 199
    .line 200
    .line 201
    add-int/lit8 v9, v18, 0x1

    .line 202
    .line 203
    move v11, v5

    .line 204
    move-object v8, v12

    .line 205
    move v12, v3

    .line 206
    goto :goto_2

    .line 207
    :cond_2
    move-object v12, v8

    .line 208
    move v5, v11

    .line 209
    new-array v0, v5, [Lq0/s;

    .line 210
    .line 211
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    check-cast v0, [Lq0/s;

    .line 216
    .line 217
    iput-object v0, v10, Lq0/m;->J:[Lq0/s;

    .line 218
    .line 219
    new-array v0, v5, [[I

    .line 220
    .line 221
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    check-cast v0, [[I

    .line 226
    .line 227
    iput-object v0, v10, Lq0/m;->L:[[I

    .line 228
    .line 229
    iget-object v0, v10, Lq0/m;->J:[Lq0/s;

    .line 230
    .line 231
    array-length v0, v0

    .line 232
    iput v0, v10, Lq0/m;->H:I

    .line 233
    .line 234
    move v0, v5

    .line 235
    :goto_3
    iget v1, v10, Lq0/m;->M:I

    .line 236
    .line 237
    if-ge v0, v1, :cond_3

    .line 238
    .line 239
    iget-object v1, v10, Lq0/m;->J:[Lq0/s;

    .line 240
    .line 241
    aget-object v1, v1, v0

    .line 242
    .line 243
    const/4 v2, 0x1

    .line 244
    invoke-virtual {v1, v2}, Lq0/s;->o0(Z)V

    .line 245
    .line 246
    .line 247
    add-int/2addr v0, v2

    .line 248
    goto :goto_3

    .line 249
    :cond_3
    const/4 v2, 0x1

    .line 250
    iget-object v0, v10, Lq0/m;->J:[Lq0/s;

    .line 251
    .line 252
    array-length v1, v0

    .line 253
    move v11, v5

    .line 254
    :goto_4
    if-ge v11, v1, :cond_4

    .line 255
    .line 256
    aget-object v3, v0, v11

    .line 257
    .line 258
    invoke-virtual {v3}, Lq0/s;->C()V

    .line 259
    .line 260
    .line 261
    add-int/2addr v11, v2

    .line 262
    goto :goto_4

    .line 263
    :cond_4
    iget-object v0, v10, Lq0/m;->J:[Lq0/s;

    .line 264
    .line 265
    iput-object v0, v10, Lq0/m;->K:[Lq0/s;

    .line 266
    .line 267
    return-void
.end method

.method public final y(Ljava/lang/String;I[Landroid/net/Uri;[Ld0/q;Ld0/q;Ljava/util/List;Ljava/util/Map;J)Lq0/s;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v14, Lq0/f;

    .line 4
    .line 5
    iget-object v2, v0, Lq0/m;->o:Lq0/h;

    .line 6
    .line 7
    iget-object v3, v0, Lq0/m;->p:Lr0/k;

    .line 8
    .line 9
    iget-object v6, v0, Lq0/m;->q:Lq0/g;

    .line 10
    .line 11
    iget-object v7, v0, Lq0/m;->r:Li0/y;

    .line 12
    .line 13
    iget-object v8, v0, Lq0/m;->y:Lq0/v;

    .line 14
    .line 15
    iget-wide v9, v0, Lq0/m;->F:J

    .line 16
    .line 17
    iget-object v12, v0, Lq0/m;->D:Ll0/y1;

    .line 18
    .line 19
    const/4 v13, 0x0

    .line 20
    move-object v1, v14

    .line 21
    move-object/from16 v4, p3

    .line 22
    .line 23
    move-object/from16 v5, p4

    .line 24
    .line 25
    move-object/from16 v11, p6

    .line 26
    .line 27
    invoke-direct/range {v1 .. v13}, Lq0/f;-><init>(Lq0/h;Lr0/k;[Landroid/net/Uri;[Ld0/q;Lq0/g;Li0/y;Lq0/v;JLjava/util/List;Ll0/y1;LB0/f;)V

    .line 28
    .line 29
    .line 30
    new-instance v16, Lq0/s;

    .line 31
    .line 32
    iget-object v4, v0, Lq0/m;->E:Lq0/s$b;

    .line 33
    .line 34
    iget-object v7, v0, Lq0/m;->w:LB0/b;

    .line 35
    .line 36
    iget-object v11, v0, Lq0/m;->s:Lp0/x;

    .line 37
    .line 38
    iget-object v12, v0, Lq0/m;->t:Lp0/v$a;

    .line 39
    .line 40
    iget-object v13, v0, Lq0/m;->u:LB0/m;

    .line 41
    .line 42
    iget-object v15, v0, Lq0/m;->v:Lx0/E$a;

    .line 43
    .line 44
    iget v10, v0, Lq0/m;->B:I

    .line 45
    .line 46
    move-object/from16 v1, v16

    .line 47
    .line 48
    move-object/from16 v2, p1

    .line 49
    .line 50
    move/from16 v3, p2

    .line 51
    .line 52
    move-object v5, v14

    .line 53
    move-object/from16 v6, p7

    .line 54
    .line 55
    move-wide/from16 v8, p8

    .line 56
    .line 57
    move/from16 v17, v10

    .line 58
    .line 59
    move-object/from16 v10, p5

    .line 60
    .line 61
    move-object v14, v15

    .line 62
    move/from16 v15, v17

    .line 63
    .line 64
    invoke-direct/range {v1 .. v15}, Lq0/s;-><init>(Ljava/lang/String;ILq0/s$b;Lq0/f;Ljava/util/Map;LB0/b;JLd0/q;Lp0/x;Lp0/v$a;LB0/m;Lx0/E$a;I)V

    .line 65
    .line 66
    .line 67
    return-object v16
.end method
