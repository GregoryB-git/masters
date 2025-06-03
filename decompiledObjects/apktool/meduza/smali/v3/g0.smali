.class public final Lv3/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Lz4/r$a;
.implements Lr5/o$a;
.implements Lv3/z0$d;
.implements Lv3/k$a;
.implements Lv3/g1$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv3/g0$b;,
        Lv3/g0$a;,
        Lv3/g0$c;,
        Lv3/g0$f;,
        Lv3/g0$g;,
        Lv3/g0$e;,
        Lv3/g0$d;
    }
.end annotation


# instance fields
.field public final A:Lv3/s0;

.field public final B:Lv3/z0;

.field public final C:Lv3/m0;

.field public final D:J

.field public E:Lv3/n1;

.field public F:Lv3/d1;

.field public G:Lv3/g0$d;

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:Z

.field public M:I

.field public N:Z

.field public O:Z

.field public P:Z

.field public Q:Z

.field public R:I

.field public S:Lv3/g0$g;

.field public T:J

.field public U:I

.field public V:Z

.field public W:Lv3/n;

.field public X:J

.field public final a:[Lv3/j1;

.field public final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lv3/j1;",
            ">;"
        }
    .end annotation
.end field

.field public final c:[Lv3/k1;

.field public final d:Lr5/o;

.field public final e:Lr5/p;

.field public final f:Lv3/n0;

.field public final o:Lt5/e;

.field public final p:Lv5/k;

.field public final q:Landroid/os/HandlerThread;

.field public final r:Landroid/os/Looper;

.field public final s:Lv3/r1$c;

.field public final t:Lv3/r1$b;

.field public final u:J

.field public final v:Z

.field public final w:Lv3/k;

.field public final x:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lv3/g0$c;",
            ">;"
        }
    .end annotation
.end field

.field public final y:Lv5/c;

.field public final z:Lv3/g0$e;


# direct methods
.method public constructor <init>([Lv3/j1;Lr5/o;Lr5/p;Lv3/n0;Lt5/e;IZLw3/a;Lv3/n1;Lv3/m0;JZLandroid/os/Looper;Lv5/c;Lio/flutter/plugins/firebase/auth/g;Lw3/a0;)V
    .locals 11

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v3, p5

    move-object/from16 v4, p8

    move-object/from16 v5, p15

    move-object/from16 v6, p17

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v7, p16

    iput-object v7, v0, Lv3/g0;->z:Lv3/g0$e;

    iput-object v1, v0, Lv3/g0;->a:[Lv3/j1;

    iput-object v2, v0, Lv3/g0;->d:Lr5/o;

    move-object v7, p3

    iput-object v7, v0, Lv3/g0;->e:Lr5/p;

    move-object v8, p4

    iput-object v8, v0, Lv3/g0;->f:Lv3/n0;

    iput-object v3, v0, Lv3/g0;->o:Lt5/e;

    move/from16 v9, p6

    iput v9, v0, Lv3/g0;->M:I

    move/from16 v9, p7

    iput-boolean v9, v0, Lv3/g0;->N:Z

    move-object/from16 v9, p9

    iput-object v9, v0, Lv3/g0;->E:Lv3/n1;

    move-object/from16 v9, p10

    iput-object v9, v0, Lv3/g0;->C:Lv3/m0;

    move-wide/from16 v9, p11

    iput-wide v9, v0, Lv3/g0;->D:J

    move/from16 v9, p13

    iput-boolean v9, v0, Lv3/g0;->I:Z

    iput-object v5, v0, Lv3/g0;->y:Lv5/c;

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v9, v0, Lv3/g0;->X:J

    invoke-interface {p4}, Lv3/n0;->c()J

    move-result-wide v9

    iput-wide v9, v0, Lv3/g0;->u:J

    invoke-interface {p4}, Lv3/n0;->b()Z

    move-result v8

    iput-boolean v8, v0, Lv3/g0;->v:Z

    invoke-static {p3}, Lv3/d1;->h(Lr5/p;)Lv3/d1;

    move-result-object v7

    iput-object v7, v0, Lv3/g0;->F:Lv3/d1;

    new-instance v8, Lv3/g0$d;

    invoke-direct {v8, v7}, Lv3/g0$d;-><init>(Lv3/d1;)V

    iput-object v8, v0, Lv3/g0;->G:Lv3/g0$d;

    array-length v7, v1

    new-array v7, v7, [Lv3/k1;

    iput-object v7, v0, Lv3/g0;->c:[Lv3/k1;

    const/4 v7, 0x0

    :goto_0
    array-length v8, v1

    if-ge v7, v8, :cond_0

    aget-object v8, v1, v7

    invoke-interface {v8, v7, v6}, Lv3/j1;->i(ILw3/a0;)V

    iget-object v8, v0, Lv3/g0;->c:[Lv3/k1;

    aget-object v9, v1, v7

    invoke-interface {v9}, Lv3/j1;->k()Lv3/f;

    move-result-object v9

    aput-object v9, v8, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Lv3/k;

    invoke-direct {v1, p0, v5}, Lv3/k;-><init>(Lv3/k$a;Lv5/c;)V

    iput-object v1, v0, Lv3/g0;->w:Lv3/k;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lv3/g0;->x:Ljava/util/ArrayList;

    .line 1
    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 2
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v1

    .line 3
    iput-object v1, v0, Lv3/g0;->b:Ljava/util/Set;

    new-instance v1, Lv3/r1$c;

    invoke-direct {v1}, Lv3/r1$c;-><init>()V

    iput-object v1, v0, Lv3/g0;->s:Lv3/r1$c;

    new-instance v1, Lv3/r1$b;

    invoke-direct {v1}, Lv3/r1$b;-><init>()V

    iput-object v1, v0, Lv3/g0;->t:Lv3/r1$b;

    .line 4
    iput-object v0, v2, Lr5/o;->a:Lr5/o$a;

    .line 5
    iput-object v3, v2, Lr5/o;->b:Lt5/e;

    const/4 v1, 0x1

    .line 6
    iput-boolean v1, v0, Lv3/g0;->V:Z

    const/4 v1, 0x0

    move-object/from16 v2, p14

    invoke-interface {v5, v2, v1}, Lv5/c;->b(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lv5/a0;

    move-result-object v1

    new-instance v2, Lv3/s0;

    invoke-direct {v2, v4, v1}, Lv3/s0;-><init>(Lw3/a;Lv5/k;)V

    iput-object v2, v0, Lv3/g0;->A:Lv3/s0;

    new-instance v2, Lv3/z0;

    invoke-direct {v2, p0, v4, v1, v6}, Lv3/z0;-><init>(Lv3/z0$d;Lw3/a;Lv5/k;Lw3/a0;)V

    iput-object v2, v0, Lv3/g0;->B:Lv3/z0;

    new-instance v1, Landroid/os/HandlerThread;

    const/16 v2, -0x10

    const-string v3, "ExoPlayer:Playback"

    invoke-direct {v1, v3, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object v1, v0, Lv3/g0;->q:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    iput-object v1, v0, Lv3/g0;->r:Landroid/os/Looper;

    invoke-interface {v5, v1, p0}, Lv5/c;->b(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lv5/a0;

    move-result-object v1

    iput-object v1, v0, Lv3/g0;->p:Lv5/k;

    return-void
.end method

.method public static F(Lv3/r1;Lv3/g0$g;ZIZLv3/r1$c;Lv3/r1$b;)Landroid/util/Pair;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/r1;",
            "Lv3/g0$g;",
            "ZIZ",
            "Lv3/r1$c;",
            "Lv3/r1$b;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    move-object v7, p0

    move-object v0, p1

    move-object/from16 v8, p6

    iget-object v1, v0, Lv3/g0$g;->a:Lv3/r1;

    invoke-virtual {p0}, Lv3/r1;->p()Z

    move-result v2

    const/4 v9, 0x0

    if-eqz v2, :cond_0

    return-object v9

    :cond_0
    invoke-virtual {v1}, Lv3/r1;->p()Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v10, v7

    goto :goto_0

    :cond_1
    move-object v10, v1

    :goto_0
    :try_start_0
    iget v4, v0, Lv3/g0$g;->b:I

    iget-wide v5, v0, Lv3/g0$g;->c:J

    move-object v1, v10

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    invoke-virtual/range {v1 .. v6}, Lv3/r1;->i(Lv3/r1$c;Lv3/r1$b;IJ)Landroid/util/Pair;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0, v10}, Lv3/r1;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v1

    :cond_2
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lv3/r1;->b(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_4

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v10, v2, v8}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    move-result-object v2

    iget-boolean v2, v2, Lv3/r1$b;->f:Z

    if-eqz v2, :cond_3

    iget v2, v8, Lv3/r1$b;->c:I

    move-object/from16 v11, p5

    invoke-virtual {v10, v2, v11}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    move-result-object v2

    iget v2, v2, Lv3/r1$c;->w:I

    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v10, v3}, Lv3/r1;->b(Ljava/lang/Object;)I

    move-result v3

    if-ne v2, v3, :cond_3

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p0, v1, v8}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    move-result-object v1

    iget v3, v1, Lv3/r1$b;->c:I

    iget-wide v4, v0, Lv3/g0$g;->c:J

    move-object v0, p0

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    invoke-virtual/range {v0 .. v5}, Lv3/r1;->i(Lv3/r1$c;Lv3/r1$b;IJ)Landroid/util/Pair;

    move-result-object v1

    :cond_3
    return-object v1

    :cond_4
    move-object/from16 v11, p5

    if-eqz p2, :cond_5

    iget-object v4, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object/from16 v0, p5

    move-object/from16 v1, p6

    move v2, p3

    move/from16 v3, p4

    move-object v5, v10

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Lv3/g0;->G(Lv3/r1$c;Lv3/r1$b;IZLjava/lang/Object;Lv3/r1;Lv3/r1;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p0, v0, v8}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    move-result-object v0

    iget v3, v0, Lv3/r1$b;->c:I

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    invoke-virtual/range {v0 .. v5}, Lv3/r1;->i(Lv3/r1$c;Lv3/r1$b;IJ)Landroid/util/Pair;

    move-result-object v0

    return-object v0

    :catch_0
    :cond_5
    return-object v9
.end method

.method public static G(Lv3/r1$c;Lv3/r1$b;IZLjava/lang/Object;Lv3/r1;Lv3/r1;)Ljava/lang/Object;
    .locals 9

    invoke-virtual {p5, p4}, Lv3/r1;->b(Ljava/lang/Object;)I

    move-result p4

    invoke-virtual {p5}, Lv3/r1;->h()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    move v4, p4

    move p4, v1

    :goto_0
    if-ge v2, v0, :cond_1

    if-ne p4, v1, :cond_1

    move-object v3, p5

    move-object v5, p1

    move-object v6, p0

    move v7, p2

    move v8, p3

    invoke-virtual/range {v3 .. v8}, Lv3/r1;->d(ILv3/r1$b;Lv3/r1$c;IZ)I

    move-result v4

    if-ne v4, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p5, v4}, Lv3/r1;->l(I)Ljava/lang/Object;

    move-result-object p4

    invoke-virtual {p6, p4}, Lv3/r1;->b(Ljava/lang/Object;)I

    move-result p4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-ne p4, v1, :cond_2

    const/4 p0, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {p6, p4}, Lv3/r1;->l(I)Ljava/lang/Object;

    move-result-object p0

    :goto_2
    return-object p0
.end method

.method public static N(Lv3/j1;J)V
    .locals 1

    .line 1
    invoke-interface {p0}, Lv3/j1;->j()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Lh5/n;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Lh5/n;

    .line 9
    .line 10
    iget-boolean v0, p0, Lv3/f;->s:Z

    .line 11
    .line 12
    invoke-static {v0}, Lx6/b;->H(Z)V

    .line 13
    .line 14
    .line 15
    iput-wide p1, p0, Lh5/n;->I:J

    .line 16
    .line 17
    :cond_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public static r(Lv3/j1;)Z
    .locals 0

    invoke-interface {p0}, Lv3/j1;->e()I

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public final A()V
    .locals 20

    .line 1
    move-object/from16 v10, p0

    .line 2
    .line 3
    iget-object v0, v10, Lv3/g0;->w:Lv3/k;

    .line 4
    .line 5
    invoke-virtual {v0}, Lv3/k;->f()Lv3/e1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Lv3/e1;->a:F

    .line 10
    .line 11
    iget-object v1, v10, Lv3/g0;->A:Lv3/s0;

    .line 12
    .line 13
    iget-object v2, v1, Lv3/s0;->h:Lv3/q0;

    .line 14
    .line 15
    iget-object v1, v1, Lv3/s0;->i:Lv3/q0;

    .line 16
    .line 17
    move-object v3, v2

    .line 18
    const/4 v2, 0x1

    .line 19
    :goto_0
    if-eqz v3, :cond_f

    .line 20
    .line 21
    iget-boolean v4, v3, Lv3/q0;->d:Z

    .line 22
    .line 23
    if-nez v4, :cond_0

    .line 24
    .line 25
    goto/16 :goto_8

    .line 26
    .line 27
    :cond_0
    iget-object v4, v10, Lv3/g0;->F:Lv3/d1;

    .line 28
    .line 29
    iget-object v4, v4, Lv3/d1;->a:Lv3/r1;

    .line 30
    .line 31
    invoke-virtual {v3, v0, v4}, Lv3/q0;->g(FLv3/r1;)Lr5/p;

    .line 32
    .line 33
    .line 34
    move-result-object v13

    .line 35
    iget-object v4, v3, Lv3/q0;->n:Lr5/p;

    .line 36
    .line 37
    const/16 v18, 0x0

    .line 38
    .line 39
    if-eqz v4, :cond_4

    .line 40
    .line 41
    iget-object v5, v4, Lr5/p;->c:[Lr5/h;

    .line 42
    .line 43
    array-length v5, v5

    .line 44
    iget-object v6, v13, Lr5/p;->c:[Lr5/h;

    .line 45
    .line 46
    array-length v6, v6

    .line 47
    if-eq v5, v6, :cond_1

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    move/from16 v5, v18

    .line 51
    .line 52
    :goto_1
    iget-object v6, v13, Lr5/p;->c:[Lr5/h;

    .line 53
    .line 54
    array-length v6, v6

    .line 55
    if-ge v5, v6, :cond_3

    .line 56
    .line 57
    invoke-virtual {v13, v4, v5}, Lr5/p;->a(Lr5/p;I)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-nez v6, :cond_2

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    const/4 v4, 0x1

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    :goto_2
    move/from16 v4, v18

    .line 70
    .line 71
    :goto_3
    if-nez v4, :cond_d

    .line 72
    .line 73
    iget-object v0, v10, Lv3/g0;->A:Lv3/s0;

    .line 74
    .line 75
    const/4 v9, 0x4

    .line 76
    if-eqz v2, :cond_a

    .line 77
    .line 78
    iget-object v8, v0, Lv3/s0;->h:Lv3/q0;

    .line 79
    .line 80
    invoke-virtual {v0, v8}, Lv3/s0;->l(Lv3/q0;)Z

    .line 81
    .line 82
    .line 83
    move-result v16

    .line 84
    iget-object v0, v10, Lv3/g0;->a:[Lv3/j1;

    .line 85
    .line 86
    array-length v0, v0

    .line 87
    new-array v6, v0, [Z

    .line 88
    .line 89
    iget-object v0, v10, Lv3/g0;->F:Lv3/d1;

    .line 90
    .line 91
    iget-wide v14, v0, Lv3/d1;->r:J

    .line 92
    .line 93
    move-object v12, v8

    .line 94
    move-object/from16 v17, v6

    .line 95
    .line 96
    invoke-virtual/range {v12 .. v17}, Lv3/q0;->a(Lr5/p;JZ[Z)J

    .line 97
    .line 98
    .line 99
    move-result-wide v12

    .line 100
    iget-object v0, v10, Lv3/g0;->F:Lv3/d1;

    .line 101
    .line 102
    iget v1, v0, Lv3/d1;->e:I

    .line 103
    .line 104
    if-eq v1, v9, :cond_5

    .line 105
    .line 106
    iget-wide v0, v0, Lv3/d1;->r:J

    .line 107
    .line 108
    cmp-long v0, v12, v0

    .line 109
    .line 110
    if-eqz v0, :cond_5

    .line 111
    .line 112
    const/4 v14, 0x1

    .line 113
    goto :goto_4

    .line 114
    :cond_5
    move/from16 v14, v18

    .line 115
    .line 116
    :goto_4
    iget-object v0, v10, Lv3/g0;->F:Lv3/d1;

    .line 117
    .line 118
    iget-object v1, v0, Lv3/d1;->b:Lz4/t$b;

    .line 119
    .line 120
    iget-wide v4, v0, Lv3/d1;->c:J

    .line 121
    .line 122
    iget-wide v2, v0, Lv3/d1;->d:J

    .line 123
    .line 124
    const/4 v15, 0x5

    .line 125
    move-object/from16 v0, p0

    .line 126
    .line 127
    move-wide/from16 v16, v2

    .line 128
    .line 129
    move-wide v2, v12

    .line 130
    move-object/from16 v19, v6

    .line 131
    .line 132
    move-wide/from16 v6, v16

    .line 133
    .line 134
    move-object v11, v8

    .line 135
    move v8, v14

    .line 136
    move v9, v15

    .line 137
    invoke-virtual/range {v0 .. v9}, Lv3/g0;->p(Lz4/t$b;JJJZI)Lv3/d1;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    iput-object v0, v10, Lv3/g0;->F:Lv3/d1;

    .line 142
    .line 143
    if-eqz v14, :cond_6

    .line 144
    .line 145
    invoke-virtual {v10, v12, v13}, Lv3/g0;->D(J)V

    .line 146
    .line 147
    .line 148
    :cond_6
    iget-object v0, v10, Lv3/g0;->a:[Lv3/j1;

    .line 149
    .line 150
    array-length v0, v0

    .line 151
    new-array v0, v0, [Z

    .line 152
    .line 153
    move/from16 v1, v18

    .line 154
    .line 155
    :goto_5
    iget-object v2, v10, Lv3/g0;->a:[Lv3/j1;

    .line 156
    .line 157
    array-length v3, v2

    .line 158
    if-ge v1, v3, :cond_9

    .line 159
    .line 160
    aget-object v2, v2, v1

    .line 161
    .line 162
    invoke-static {v2}, Lv3/g0;->r(Lv3/j1;)Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    aput-boolean v3, v0, v1

    .line 167
    .line 168
    iget-object v4, v11, Lv3/q0;->c:[Lz4/c0;

    .line 169
    .line 170
    aget-object v4, v4, v1

    .line 171
    .line 172
    if-eqz v3, :cond_8

    .line 173
    .line 174
    invoke-interface {v2}, Lv3/j1;->r()Lz4/c0;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    if-eq v4, v3, :cond_7

    .line 179
    .line 180
    invoke-virtual {v10, v2}, Lv3/g0;->d(Lv3/j1;)V

    .line 181
    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_7
    aget-boolean v3, v19, v1

    .line 185
    .line 186
    if-eqz v3, :cond_8

    .line 187
    .line 188
    iget-wide v3, v10, Lv3/g0;->T:J

    .line 189
    .line 190
    invoke-interface {v2, v3, v4}, Lv3/j1;->u(J)V

    .line 191
    .line 192
    .line 193
    :cond_8
    :goto_6
    add-int/lit8 v1, v1, 0x1

    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_9
    invoke-virtual {v10, v0}, Lv3/g0;->f([Z)V

    .line 197
    .line 198
    .line 199
    goto :goto_7

    .line 200
    :cond_a
    invoke-virtual {v0, v3}, Lv3/s0;->l(Lv3/q0;)Z

    .line 201
    .line 202
    .line 203
    iget-boolean v0, v3, Lv3/q0;->d:Z

    .line 204
    .line 205
    if-eqz v0, :cond_b

    .line 206
    .line 207
    iget-object v0, v3, Lv3/q0;->f:Lv3/r0;

    .line 208
    .line 209
    iget-wide v0, v0, Lv3/r0;->b:J

    .line 210
    .line 211
    iget-wide v4, v10, Lv3/g0;->T:J

    .line 212
    .line 213
    iget-wide v6, v3, Lv3/q0;->o:J

    .line 214
    .line 215
    sub-long/2addr v4, v6

    .line 216
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 217
    .line 218
    .line 219
    move-result-wide v5

    .line 220
    iget-object v0, v3, Lv3/q0;->i:[Lv3/k1;

    .line 221
    .line 222
    array-length v0, v0

    .line 223
    new-array v8, v0, [Z

    .line 224
    .line 225
    const/4 v7, 0x0

    .line 226
    move-object v4, v13

    .line 227
    invoke-virtual/range {v3 .. v8}, Lv3/q0;->a(Lr5/p;JZ[Z)J

    .line 228
    .line 229
    .line 230
    :cond_b
    :goto_7
    const/4 v4, 0x1

    .line 231
    invoke-virtual {v10, v4}, Lv3/g0;->l(Z)V

    .line 232
    .line 233
    .line 234
    iget-object v0, v10, Lv3/g0;->F:Lv3/d1;

    .line 235
    .line 236
    iget v0, v0, Lv3/d1;->e:I

    .line 237
    .line 238
    const/4 v1, 0x4

    .line 239
    if-eq v0, v1, :cond_c

    .line 240
    .line 241
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->t()V

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->e0()V

    .line 245
    .line 246
    .line 247
    iget-object v0, v10, Lv3/g0;->p:Lv5/k;

    .line 248
    .line 249
    const/4 v1, 0x2

    .line 250
    invoke-interface {v0, v1}, Lv5/k;->i(I)Z

    .line 251
    .line 252
    .line 253
    :cond_c
    return-void

    .line 254
    :cond_d
    const/4 v4, 0x1

    .line 255
    if-ne v3, v1, :cond_e

    .line 256
    .line 257
    move/from16 v2, v18

    .line 258
    .line 259
    :cond_e
    iget-object v3, v3, Lv3/q0;->l:Lv3/q0;

    .line 260
    .line 261
    goto/16 :goto_0

    .line 262
    .line 263
    :cond_f
    :goto_8
    return-void
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method

.method public final B(ZZZZ)V
    .locals 34

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lv3/g0;->p:Lv5/k;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-interface {v0, v2}, Lv5/k;->j(I)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    iput-object v2, v1, Lv3/g0;->W:Lv3/n;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    iput-boolean v3, v1, Lv3/g0;->K:Z

    .line 14
    .line 15
    iget-object v0, v1, Lv3/g0;->w:Lv3/k;

    .line 16
    .line 17
    iput-boolean v3, v0, Lv3/k;->f:Z

    .line 18
    .line 19
    iget-object v0, v0, Lv3/k;->a:Lv5/y;

    .line 20
    .line 21
    iget-boolean v4, v0, Lv5/y;->b:Z

    .line 22
    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Lv5/y;->l()J

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    invoke-virtual {v0, v4, v5}, Lv5/y;->a(J)V

    .line 30
    .line 31
    .line 32
    iput-boolean v3, v0, Lv5/y;->b:Z

    .line 33
    .line 34
    :cond_0
    const-wide v4, 0xe8d4a51000L

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    iput-wide v4, v1, Lv3/g0;->T:J

    .line 40
    .line 41
    iget-object v4, v1, Lv3/g0;->a:[Lv3/j1;

    .line 42
    .line 43
    array-length v5, v4

    .line 44
    move v6, v3

    .line 45
    :goto_0
    const-string v7, "ExoPlayerImplInternal"

    .line 46
    .line 47
    if-ge v6, v5, :cond_1

    .line 48
    .line 49
    aget-object v0, v4, v6

    .line 50
    .line 51
    :try_start_0
    invoke-virtual {v1, v0}, Lv3/g0;->d(Lv3/j1;)V
    :try_end_0
    .catch Lv3/n; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :catch_0
    move-exception v0

    .line 56
    goto :goto_1

    .line 57
    :catch_1
    move-exception v0

    .line 58
    :goto_1
    const-string v8, "Disable failed."

    .line 59
    .line 60
    invoke-static {v7, v8, v0}, Lv5/m;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    if-eqz p1, :cond_3

    .line 67
    .line 68
    iget-object v4, v1, Lv3/g0;->a:[Lv3/j1;

    .line 69
    .line 70
    array-length v5, v4

    .line 71
    move v6, v3

    .line 72
    :goto_3
    if-ge v6, v5, :cond_3

    .line 73
    .line 74
    aget-object v0, v4, v6

    .line 75
    .line 76
    iget-object v8, v1, Lv3/g0;->b:Ljava/util/Set;

    .line 77
    .line 78
    invoke-interface {v8, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    if-eqz v8, :cond_2

    .line 83
    .line 84
    :try_start_1
    invoke-interface {v0}, Lv3/j1;->reset()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 85
    .line 86
    .line 87
    goto :goto_4

    .line 88
    :catch_2
    move-exception v0

    .line 89
    move-object v8, v0

    .line 90
    const-string v0, "Reset failed."

    .line 91
    .line 92
    invoke-static {v7, v0, v8}, Lv5/m;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    :cond_2
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_3
    iput v3, v1, Lv3/g0;->R:I

    .line 99
    .line 100
    iget-object v0, v1, Lv3/g0;->F:Lv3/d1;

    .line 101
    .line 102
    iget-object v4, v0, Lv3/d1;->b:Lz4/t$b;

    .line 103
    .line 104
    iget-wide v5, v0, Lv3/d1;->r:J

    .line 105
    .line 106
    iget-object v0, v1, Lv3/g0;->F:Lv3/d1;

    .line 107
    .line 108
    iget-object v0, v0, Lv3/d1;->b:Lz4/t$b;

    .line 109
    .line 110
    invoke-virtual {v0}, Lz4/s;->a()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    const/4 v7, 0x1

    .line 115
    if-nez v0, :cond_7

    .line 116
    .line 117
    iget-object v0, v1, Lv3/g0;->F:Lv3/d1;

    .line 118
    .line 119
    iget-object v8, v1, Lv3/g0;->t:Lv3/r1$b;

    .line 120
    .line 121
    iget-object v9, v0, Lv3/d1;->b:Lz4/t$b;

    .line 122
    .line 123
    iget-object v0, v0, Lv3/d1;->a:Lv3/r1;

    .line 124
    .line 125
    invoke-virtual {v0}, Lv3/r1;->p()Z

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    if-nez v10, :cond_5

    .line 130
    .line 131
    iget-object v9, v9, Lz4/s;->a:Ljava/lang/Object;

    .line 132
    .line 133
    invoke-virtual {v0, v9, v8}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    iget-boolean v0, v0, Lv3/r1$b;->f:Z

    .line 138
    .line 139
    if-eqz v0, :cond_4

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_4
    move v0, v3

    .line 143
    goto :goto_6

    .line 144
    :cond_5
    :goto_5
    move v0, v7

    .line 145
    :goto_6
    if-eqz v0, :cond_6

    .line 146
    .line 147
    goto :goto_7

    .line 148
    :cond_6
    iget-object v0, v1, Lv3/g0;->F:Lv3/d1;

    .line 149
    .line 150
    iget-wide v8, v0, Lv3/d1;->r:J

    .line 151
    .line 152
    goto :goto_8

    .line 153
    :cond_7
    :goto_7
    iget-object v0, v1, Lv3/g0;->F:Lv3/d1;

    .line 154
    .line 155
    iget-wide v8, v0, Lv3/d1;->c:J

    .line 156
    .line 157
    :goto_8
    if-eqz p2, :cond_8

    .line 158
    .line 159
    iput-object v2, v1, Lv3/g0;->S:Lv3/g0$g;

    .line 160
    .line 161
    iget-object v0, v1, Lv3/g0;->F:Lv3/d1;

    .line 162
    .line 163
    iget-object v0, v0, Lv3/d1;->a:Lv3/r1;

    .line 164
    .line 165
    invoke-virtual {v1, v0}, Lv3/g0;->i(Lv3/r1;)Landroid/util/Pair;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v4, Lz4/t$b;

    .line 172
    .line 173
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v0, Ljava/lang/Long;

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 178
    .line 179
    .line 180
    move-result-wide v5

    .line 181
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    iget-object v0, v1, Lv3/g0;->F:Lv3/d1;

    .line 187
    .line 188
    iget-object v0, v0, Lv3/d1;->b:Lz4/t$b;

    .line 189
    .line 190
    invoke-virtual {v4, v0}, Lz4/s;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-nez v0, :cond_8

    .line 195
    .line 196
    goto :goto_9

    .line 197
    :cond_8
    move v7, v3

    .line 198
    :goto_9
    move-object/from16 v23, v4

    .line 199
    .line 200
    move-wide/from16 v31, v5

    .line 201
    .line 202
    move-wide v13, v8

    .line 203
    iget-object v0, v1, Lv3/g0;->A:Lv3/s0;

    .line 204
    .line 205
    invoke-virtual {v0}, Lv3/s0;->b()V

    .line 206
    .line 207
    .line 208
    iput-boolean v3, v1, Lv3/g0;->L:Z

    .line 209
    .line 210
    new-instance v0, Lv3/d1;

    .line 211
    .line 212
    iget-object v4, v1, Lv3/g0;->F:Lv3/d1;

    .line 213
    .line 214
    iget-object v11, v4, Lv3/d1;->a:Lv3/r1;

    .line 215
    .line 216
    iget v5, v4, Lv3/d1;->e:I

    .line 217
    .line 218
    if-eqz p4, :cond_9

    .line 219
    .line 220
    goto :goto_a

    .line 221
    :cond_9
    iget-object v2, v4, Lv3/d1;->f:Lv3/n;

    .line 222
    .line 223
    :goto_a
    move-object/from16 v18, v2

    .line 224
    .line 225
    const/16 v19, 0x0

    .line 226
    .line 227
    if-eqz v7, :cond_a

    .line 228
    .line 229
    sget-object v2, Lz4/j0;->d:Lz4/j0;

    .line 230
    .line 231
    goto :goto_b

    .line 232
    :cond_a
    iget-object v2, v4, Lv3/d1;->h:Lz4/j0;

    .line 233
    .line 234
    :goto_b
    move-object/from16 v20, v2

    .line 235
    .line 236
    if-eqz v7, :cond_b

    .line 237
    .line 238
    iget-object v2, v1, Lv3/g0;->e:Lr5/p;

    .line 239
    .line 240
    goto :goto_c

    .line 241
    :cond_b
    iget-object v2, v4, Lv3/d1;->i:Lr5/p;

    .line 242
    .line 243
    :goto_c
    move-object/from16 v21, v2

    .line 244
    .line 245
    if-eqz v7, :cond_c

    .line 246
    .line 247
    sget-object v2, Lo7/t;->b:Lo7/t$b;

    .line 248
    .line 249
    sget-object v2, Lo7/l0;->e:Lo7/l0;

    .line 250
    .line 251
    goto :goto_d

    .line 252
    :cond_c
    iget-object v2, v4, Lv3/d1;->j:Ljava/util/List;

    .line 253
    .line 254
    :goto_d
    move-object/from16 v22, v2

    .line 255
    .line 256
    iget-boolean v2, v4, Lv3/d1;->l:Z

    .line 257
    .line 258
    move/from16 v24, v2

    .line 259
    .line 260
    iget v2, v4, Lv3/d1;->m:I

    .line 261
    .line 262
    move/from16 v25, v2

    .line 263
    .line 264
    iget-object v2, v4, Lv3/d1;->n:Lv3/e1;

    .line 265
    .line 266
    move-object/from16 v26, v2

    .line 267
    .line 268
    const-wide/16 v29, 0x0

    .line 269
    .line 270
    const/16 v33, 0x0

    .line 271
    .line 272
    move-object v10, v0

    .line 273
    move-object/from16 v12, v23

    .line 274
    .line 275
    move-wide/from16 v15, v31

    .line 276
    .line 277
    move/from16 v17, v5

    .line 278
    .line 279
    move-wide/from16 v27, v31

    .line 280
    .line 281
    invoke-direct/range {v10 .. v33}, Lv3/d1;-><init>(Lv3/r1;Lz4/t$b;JJILv3/n;ZLz4/j0;Lr5/p;Ljava/util/List;Lz4/t$b;ZILv3/e1;JJJZ)V

    .line 282
    .line 283
    .line 284
    iput-object v0, v1, Lv3/g0;->F:Lv3/d1;

    .line 285
    .line 286
    if-eqz p3, :cond_e

    .line 287
    .line 288
    iget-object v2, v1, Lv3/g0;->B:Lv3/z0;

    .line 289
    .line 290
    iget-object v0, v2, Lv3/z0;->f:Ljava/util/HashMap;

    .line 291
    .line 292
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    if-eqz v0, :cond_d

    .line 305
    .line 306
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    move-object v5, v0

    .line 311
    check-cast v5, Lv3/z0$b;

    .line 312
    .line 313
    :try_start_2
    iget-object v0, v5, Lv3/z0$b;->a:Lz4/t;

    .line 314
    .line 315
    iget-object v6, v5, Lv3/z0$b;->b:Lz4/t$c;

    .line 316
    .line 317
    invoke-interface {v0, v6}, Lz4/t;->a(Lz4/t$c;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3

    .line 318
    .line 319
    .line 320
    goto :goto_f

    .line 321
    :catch_3
    move-exception v0

    .line 322
    const-string v6, "MediaSourceList"

    .line 323
    .line 324
    const-string v7, "Failed to release child source."

    .line 325
    .line 326
    invoke-static {v6, v7, v0}, Lv5/m;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 327
    .line 328
    .line 329
    :goto_f
    iget-object v0, v5, Lv3/z0$b;->a:Lz4/t;

    .line 330
    .line 331
    iget-object v6, v5, Lv3/z0$b;->c:Lv3/z0$a;

    .line 332
    .line 333
    invoke-interface {v0, v6}, Lz4/t;->m(Lz4/w;)V

    .line 334
    .line 335
    .line 336
    iget-object v0, v5, Lv3/z0$b;->a:Lz4/t;

    .line 337
    .line 338
    iget-object v5, v5, Lv3/z0$b;->c:Lv3/z0$a;

    .line 339
    .line 340
    invoke-interface {v0, v5}, Lz4/t;->c(La4/g;)V

    .line 341
    .line 342
    .line 343
    goto :goto_e

    .line 344
    :cond_d
    iget-object v0, v2, Lv3/z0;->f:Ljava/util/HashMap;

    .line 345
    .line 346
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 347
    .line 348
    .line 349
    iget-object v0, v2, Lv3/z0;->g:Ljava/util/HashSet;

    .line 350
    .line 351
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 352
    .line 353
    .line 354
    iput-boolean v3, v2, Lv3/z0;->k:Z

    .line 355
    .line 356
    :cond_e
    return-void
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
.end method

.method public final C()V
    .locals 1

    .line 1
    iget-object v0, p0, Lv3/g0;->A:Lv3/s0;

    .line 2
    .line 3
    iget-object v0, v0, Lv3/s0;->h:Lv3/q0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lv3/q0;->f:Lv3/r0;

    .line 8
    .line 9
    iget-boolean v0, v0, Lv3/r0;->h:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Lv3/g0;->I:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    iput-boolean v0, p0, Lv3/g0;->J:Z

    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
.end method

.method public final D(J)V
    .locals 5

    .line 1
    iget-object v0, p0, Lv3/g0;->A:Lv3/s0;

    .line 2
    .line 3
    iget-object v0, v0, Lv3/s0;->h:Lv3/q0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide v0, 0xe8d4a51000L

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    :goto_0
    add-long/2addr p1, v0

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-wide v0, v0, Lv3/q0;->o:J

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :goto_1
    iput-wide p1, p0, Lv3/g0;->T:J

    .line 18
    .line 19
    iget-object v0, p0, Lv3/g0;->w:Lv3/k;

    .line 20
    .line 21
    iget-object v0, v0, Lv3/k;->a:Lv5/y;

    .line 22
    .line 23
    invoke-virtual {v0, p1, p2}, Lv5/y;->a(J)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lv3/g0;->a:[Lv3/j1;

    .line 27
    .line 28
    array-length p2, p1

    .line 29
    const/4 v0, 0x0

    .line 30
    move v1, v0

    .line 31
    :goto_2
    if-ge v1, p2, :cond_2

    .line 32
    .line 33
    aget-object v2, p1, v1

    .line 34
    .line 35
    invoke-static {v2}, Lv3/g0;->r(Lv3/j1;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    iget-wide v3, p0, Lv3/g0;->T:J

    .line 42
    .line 43
    invoke-interface {v2, v3, v4}, Lv3/j1;->u(J)V

    .line 44
    .line 45
    .line 46
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    iget-object p1, p0, Lv3/g0;->A:Lv3/s0;

    .line 50
    .line 51
    iget-object p1, p1, Lv3/s0;->h:Lv3/q0;

    .line 52
    .line 53
    :goto_3
    if-eqz p1, :cond_5

    .line 54
    .line 55
    iget-object p2, p1, Lv3/q0;->n:Lr5/p;

    .line 56
    .line 57
    iget-object p2, p2, Lr5/p;->c:[Lr5/h;

    .line 58
    .line 59
    array-length v1, p2

    .line 60
    move v2, v0

    .line 61
    :goto_4
    if-ge v2, v1, :cond_4

    .line 62
    .line 63
    aget-object v3, p2, v2

    .line 64
    .line 65
    if-eqz v3, :cond_3

    .line 66
    .line 67
    invoke-interface {v3}, Lr5/h;->t()V

    .line 68
    .line 69
    .line 70
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_4
    iget-object p1, p1, Lv3/q0;->l:Lv3/q0;

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_5
    return-void
    .line 77
.end method

.method public final E(Lv3/r1;Lv3/r1;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lv3/r1;->p()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Lv3/r1;->p()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p1, p0, Lv3/g0;->x:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    add-int/lit8 p1, p1, -0x1

    .line 21
    .line 22
    if-gez p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, Lv3/g0;->x:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget-object p2, p0, Lv3/g0;->x:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lv3/g0$c;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    throw p1
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final H(JJ)V
    .locals 1

    iget-object v0, p0, Lv3/g0;->p:Lv5/k;

    add-long/2addr p1, p3

    invoke-interface {v0, p1, p2}, Lv5/k;->h(J)Z

    return-void
.end method

.method public final I(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lv3/g0;->A:Lv3/s0;

    .line 2
    .line 3
    iget-object v0, v0, Lv3/s0;->h:Lv3/q0;

    .line 4
    .line 5
    iget-object v0, v0, Lv3/q0;->f:Lv3/r0;

    .line 6
    .line 7
    iget-object v0, v0, Lv3/r0;->a:Lz4/t$b;

    .line 8
    .line 9
    iget-object v1, p0, Lv3/g0;->F:Lv3/d1;

    .line 10
    .line 11
    iget-wide v3, v1, Lv3/d1;->r:J

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v1, p0

    .line 16
    move-object v2, v0

    .line 17
    invoke-virtual/range {v1 .. v6}, Lv3/g0;->K(Lz4/t$b;JZZ)J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    iget-object v1, p0, Lv3/g0;->F:Lv3/d1;

    .line 22
    .line 23
    iget-wide v1, v1, Lv3/d1;->r:J

    .line 24
    .line 25
    cmp-long v1, v3, v1

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Lv3/g0;->F:Lv3/d1;

    .line 30
    .line 31
    iget-wide v5, v1, Lv3/d1;->c:J

    .line 32
    .line 33
    iget-wide v7, v1, Lv3/d1;->d:J

    .line 34
    .line 35
    const/4 v10, 0x5

    .line 36
    move-object v1, p0

    .line 37
    move-object v2, v0

    .line 38
    move v9, p1

    .line 39
    invoke-virtual/range {v1 .. v10}, Lv3/g0;->p(Lz4/t$b;JJJZI)Lv3/d1;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Lv3/g0;->F:Lv3/d1;

    .line 44
    .line 45
    :cond_0
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final J(Lv3/g0$g;)V
    .locals 19

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v1, v11, Lv3/g0;->G:Lv3/g0$d;

    .line 6
    .line 7
    const/4 v8, 0x1

    .line 8
    invoke-virtual {v1, v8}, Lv3/g0$d;->a(I)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v11, Lv3/g0;->F:Lv3/d1;

    .line 12
    .line 13
    iget-object v1, v1, Lv3/d1;->a:Lv3/r1;

    .line 14
    .line 15
    iget v4, v11, Lv3/g0;->M:I

    .line 16
    .line 17
    iget-boolean v5, v11, Lv3/g0;->N:Z

    .line 18
    .line 19
    iget-object v6, v11, Lv3/g0;->s:Lv3/r1$c;

    .line 20
    .line 21
    iget-object v7, v11, Lv3/g0;->t:Lv3/r1$b;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    move-object/from16 v2, p1

    .line 25
    .line 26
    invoke-static/range {v1 .. v7}, Lv3/g0;->F(Lv3/r1;Lv3/g0$g;ZIZLv3/r1$c;Lv3/r1$b;)Landroid/util/Pair;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const/4 v7, 0x0

    .line 31
    const-wide/16 v2, 0x0

    .line 32
    .line 33
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    iget-object v6, v11, Lv3/g0;->F:Lv3/d1;

    .line 41
    .line 42
    iget-object v6, v6, Lv3/d1;->a:Lv3/r1;

    .line 43
    .line 44
    invoke-virtual {v11, v6}, Lv3/g0;->i(Lv3/r1;)Landroid/util/Pair;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    iget-object v9, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v9, Lz4/t$b;

    .line 51
    .line 52
    iget-object v6, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v6, Ljava/lang/Long;

    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 57
    .line 58
    .line 59
    move-result-wide v12

    .line 60
    iget-object v6, v11, Lv3/g0;->F:Lv3/d1;

    .line 61
    .line 62
    iget-object v6, v6, Lv3/d1;->a:Lv3/r1;

    .line 63
    .line 64
    invoke-virtual {v6}, Lv3/r1;->p()Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    xor-int/2addr v6, v8

    .line 69
    goto :goto_3

    .line 70
    :cond_0
    iget-object v6, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 71
    .line 72
    iget-object v9, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v9, Ljava/lang/Long;

    .line 75
    .line 76
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 77
    .line 78
    .line 79
    move-result-wide v12

    .line 80
    iget-wide v9, v0, Lv3/g0$g;->c:J

    .line 81
    .line 82
    cmp-long v9, v9, v4

    .line 83
    .line 84
    if-nez v9, :cond_1

    .line 85
    .line 86
    move-wide v9, v4

    .line 87
    goto :goto_0

    .line 88
    :cond_1
    move-wide v9, v12

    .line 89
    :goto_0
    iget-object v14, v11, Lv3/g0;->A:Lv3/s0;

    .line 90
    .line 91
    iget-object v15, v11, Lv3/g0;->F:Lv3/d1;

    .line 92
    .line 93
    iget-object v15, v15, Lv3/d1;->a:Lv3/r1;

    .line 94
    .line 95
    invoke-virtual {v14, v15, v6, v12, v13}, Lv3/s0;->n(Lv3/r1;Ljava/lang/Object;J)Lz4/t$b;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    invoke-virtual {v6}, Lz4/s;->a()Z

    .line 100
    .line 101
    .line 102
    move-result v14

    .line 103
    if-eqz v14, :cond_3

    .line 104
    .line 105
    iget-object v4, v11, Lv3/g0;->F:Lv3/d1;

    .line 106
    .line 107
    iget-object v4, v4, Lv3/d1;->a:Lv3/r1;

    .line 108
    .line 109
    iget-object v5, v6, Lz4/s;->a:Ljava/lang/Object;

    .line 110
    .line 111
    iget-object v12, v11, Lv3/g0;->t:Lv3/r1$b;

    .line 112
    .line 113
    invoke-virtual {v4, v5, v12}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 114
    .line 115
    .line 116
    iget-object v4, v11, Lv3/g0;->t:Lv3/r1$b;

    .line 117
    .line 118
    iget v5, v6, Lz4/s;->b:I

    .line 119
    .line 120
    invoke-virtual {v4, v5}, Lv3/r1$b;->f(I)I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    iget v5, v6, Lz4/s;->c:I

    .line 125
    .line 126
    if-ne v4, v5, :cond_2

    .line 127
    .line 128
    iget-object v4, v11, Lv3/g0;->t:Lv3/r1$b;

    .line 129
    .line 130
    iget-object v4, v4, Lv3/r1$b;->o:La5/a;

    .line 131
    .line 132
    iget-wide v4, v4, La5/a;->c:J

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_2
    move-wide v4, v2

    .line 136
    :goto_1
    move-wide v12, v4

    .line 137
    move-wide v14, v9

    .line 138
    move-object v9, v6

    .line 139
    move v10, v8

    .line 140
    goto :goto_4

    .line 141
    :cond_3
    iget-wide v14, v0, Lv3/g0$g;->c:J

    .line 142
    .line 143
    cmp-long v4, v14, v4

    .line 144
    .line 145
    if-nez v4, :cond_4

    .line 146
    .line 147
    move v4, v8

    .line 148
    goto :goto_2

    .line 149
    :cond_4
    move v4, v7

    .line 150
    :goto_2
    move-object/from16 v18, v6

    .line 151
    .line 152
    move v6, v4

    .line 153
    move-wide v4, v9

    .line 154
    move-object/from16 v9, v18

    .line 155
    .line 156
    :goto_3
    move-wide v14, v4

    .line 157
    move v10, v6

    .line 158
    :goto_4
    :try_start_0
    iget-object v4, v11, Lv3/g0;->F:Lv3/d1;

    .line 159
    .line 160
    iget-object v4, v4, Lv3/d1;->a:Lv3/r1;

    .line 161
    .line 162
    invoke-virtual {v4}, Lv3/r1;->p()Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-eqz v4, :cond_5

    .line 167
    .line 168
    iput-object v0, v11, Lv3/g0;->S:Lv3/g0$g;

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_5
    const/4 v0, 0x4

    .line 172
    if-nez v1, :cond_7

    .line 173
    .line 174
    iget-object v1, v11, Lv3/g0;->F:Lv3/d1;

    .line 175
    .line 176
    iget v1, v1, Lv3/d1;->e:I

    .line 177
    .line 178
    if-eq v1, v8, :cond_6

    .line 179
    .line 180
    invoke-virtual {v11, v0}, Lv3/g0;->X(I)V

    .line 181
    .line 182
    .line 183
    :cond_6
    invoke-virtual {v11, v7, v8, v7, v8}, Lv3/g0;->B(ZZZZ)V

    .line 184
    .line 185
    .line 186
    :goto_5
    move-wide v7, v12

    .line 187
    goto :goto_7

    .line 188
    :cond_7
    iget-object v1, v11, Lv3/g0;->F:Lv3/d1;

    .line 189
    .line 190
    iget-object v1, v1, Lv3/d1;->b:Lz4/t$b;

    .line 191
    .line 192
    invoke-virtual {v9, v1}, Lz4/s;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eqz v1, :cond_b

    .line 197
    .line 198
    iget-object v1, v11, Lv3/g0;->A:Lv3/s0;

    .line 199
    .line 200
    iget-object v1, v1, Lv3/s0;->h:Lv3/q0;

    .line 201
    .line 202
    if-eqz v1, :cond_8

    .line 203
    .line 204
    iget-boolean v4, v1, Lv3/q0;->d:Z

    .line 205
    .line 206
    if-eqz v4, :cond_8

    .line 207
    .line 208
    cmp-long v2, v12, v2

    .line 209
    .line 210
    if-eqz v2, :cond_8

    .line 211
    .line 212
    iget-object v1, v1, Lv3/q0;->a:Lz4/r;

    .line 213
    .line 214
    iget-object v2, v11, Lv3/g0;->E:Lv3/n1;

    .line 215
    .line 216
    invoke-interface {v1, v12, v13, v2}, Lz4/r;->e(JLv3/n1;)J

    .line 217
    .line 218
    .line 219
    move-result-wide v1

    .line 220
    goto :goto_6

    .line 221
    :cond_8
    move-wide v1, v12

    .line 222
    :goto_6
    invoke-static {v1, v2}, Lv5/e0;->R(J)J

    .line 223
    .line 224
    .line 225
    move-result-wide v3

    .line 226
    iget-object v5, v11, Lv3/g0;->F:Lv3/d1;

    .line 227
    .line 228
    iget-wide v5, v5, Lv3/d1;->r:J

    .line 229
    .line 230
    invoke-static {v5, v6}, Lv5/e0;->R(J)J

    .line 231
    .line 232
    .line 233
    move-result-wide v5

    .line 234
    cmp-long v3, v3, v5

    .line 235
    .line 236
    if-nez v3, :cond_a

    .line 237
    .line 238
    iget-object v3, v11, Lv3/g0;->F:Lv3/d1;

    .line 239
    .line 240
    iget v4, v3, Lv3/d1;->e:I

    .line 241
    .line 242
    const/4 v5, 0x2

    .line 243
    if-eq v4, v5, :cond_9

    .line 244
    .line 245
    const/4 v5, 0x3

    .line 246
    if-ne v4, v5, :cond_a

    .line 247
    .line 248
    :cond_9
    iget-wide v7, v3, Lv3/d1;->r:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 249
    .line 250
    :goto_7
    const/4 v0, 0x2

    .line 251
    move-object/from16 v1, p0

    .line 252
    .line 253
    move-object v2, v9

    .line 254
    move-wide v3, v7

    .line 255
    move-wide v5, v14

    .line 256
    move v9, v10

    .line 257
    move v10, v0

    .line 258
    invoke-virtual/range {v1 .. v10}, Lv3/g0;->p(Lz4/t$b;JJJZI)Lv3/d1;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    iput-object v0, v11, Lv3/g0;->F:Lv3/d1;

    .line 263
    .line 264
    return-void

    .line 265
    :cond_a
    move-wide v3, v1

    .line 266
    goto :goto_8

    .line 267
    :cond_b
    move-wide v3, v12

    .line 268
    :goto_8
    :try_start_1
    iget-object v1, v11, Lv3/g0;->F:Lv3/d1;

    .line 269
    .line 270
    iget v1, v1, Lv3/d1;->e:I

    .line 271
    .line 272
    if-ne v1, v0, :cond_c

    .line 273
    .line 274
    move v6, v8

    .line 275
    goto :goto_9

    .line 276
    :cond_c
    move v6, v7

    .line 277
    :goto_9
    iget-object v0, v11, Lv3/g0;->A:Lv3/s0;

    .line 278
    .line 279
    iget-object v1, v0, Lv3/s0;->h:Lv3/q0;

    .line 280
    .line 281
    iget-object v0, v0, Lv3/s0;->i:Lv3/q0;

    .line 282
    .line 283
    if-eq v1, v0, :cond_d

    .line 284
    .line 285
    move v5, v8

    .line 286
    goto :goto_a

    .line 287
    :cond_d
    move v5, v7

    .line 288
    :goto_a
    move-object/from16 v1, p0

    .line 289
    .line 290
    move-object v2, v9

    .line 291
    invoke-virtual/range {v1 .. v6}, Lv3/g0;->K(Lz4/t$b;JZZ)J

    .line 292
    .line 293
    .line 294
    move-result-wide v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 295
    cmp-long v0, v12, v16

    .line 296
    .line 297
    if-eqz v0, :cond_e

    .line 298
    .line 299
    goto :goto_b

    .line 300
    :cond_e
    move v8, v7

    .line 301
    :goto_b
    or-int/2addr v10, v8

    .line 302
    :try_start_2
    iget-object v0, v11, Lv3/g0;->F:Lv3/d1;

    .line 303
    .line 304
    iget-object v4, v0, Lv3/d1;->a:Lv3/r1;

    .line 305
    .line 306
    iget-object v5, v0, Lv3/d1;->b:Lz4/t$b;

    .line 307
    .line 308
    const/4 v8, 0x1

    .line 309
    move-object/from16 v1, p0

    .line 310
    .line 311
    move-object v2, v4

    .line 312
    move-object v3, v9

    .line 313
    move-wide v6, v14

    .line 314
    invoke-virtual/range {v1 .. v8}, Lv3/g0;->f0(Lv3/r1;Lz4/t$b;Lv3/r1;Lz4/t$b;JZ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 315
    .line 316
    .line 317
    move-wide/from16 v7, v16

    .line 318
    .line 319
    goto :goto_7

    .line 320
    :catchall_0
    move-exception v0

    .line 321
    move-wide/from16 v7, v16

    .line 322
    .line 323
    goto :goto_c

    .line 324
    :catchall_1
    move-exception v0

    .line 325
    move-wide v7, v12

    .line 326
    :goto_c
    const/4 v12, 0x2

    .line 327
    move-object/from16 v1, p0

    .line 328
    .line 329
    move-object v2, v9

    .line 330
    move-wide v3, v7

    .line 331
    move-wide v5, v14

    .line 332
    move v9, v10

    .line 333
    move v10, v12

    .line 334
    invoke-virtual/range {v1 .. v10}, Lv3/g0;->p(Lz4/t$b;JJJZI)Lv3/d1;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    iput-object v1, v11, Lv3/g0;->F:Lv3/d1;

    .line 339
    .line 340
    throw v0
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
.end method

.method public final K(Lz4/t$b;JZZ)J
    .locals 5

    .line 1
    invoke-virtual {p0}, Lv3/g0;->c0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lv3/g0;->K:Z

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-nez p5, :cond_0

    .line 9
    .line 10
    iget-object p5, p0, Lv3/g0;->F:Lv3/d1;

    .line 11
    .line 12
    iget p5, p5, Lv3/d1;->e:I

    .line 13
    .line 14
    const/4 v2, 0x3

    .line 15
    if-ne p5, v2, :cond_1

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0, v1}, Lv3/g0;->X(I)V

    .line 18
    .line 19
    .line 20
    :cond_1
    iget-object p5, p0, Lv3/g0;->A:Lv3/s0;

    .line 21
    .line 22
    iget-object p5, p5, Lv3/s0;->h:Lv3/q0;

    .line 23
    .line 24
    move-object v2, p5

    .line 25
    :goto_0
    if-eqz v2, :cond_3

    .line 26
    .line 27
    iget-object v3, v2, Lv3/q0;->f:Lv3/r0;

    .line 28
    .line 29
    iget-object v3, v3, Lv3/r0;->a:Lz4/t$b;

    .line 30
    .line 31
    invoke-virtual {p1, v3}, Lz4/s;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    iget-object v2, v2, Lv3/q0;->l:Lv3/q0;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    :goto_1
    if-nez p4, :cond_4

    .line 42
    .line 43
    if-ne p5, v2, :cond_4

    .line 44
    .line 45
    if-eqz v2, :cond_7

    .line 46
    .line 47
    iget-wide p4, v2, Lv3/q0;->o:J

    .line 48
    .line 49
    add-long/2addr p4, p2

    .line 50
    const-wide/16 v3, 0x0

    .line 51
    .line 52
    cmp-long p1, p4, v3

    .line 53
    .line 54
    if-gez p1, :cond_7

    .line 55
    .line 56
    :cond_4
    iget-object p1, p0, Lv3/g0;->a:[Lv3/j1;

    .line 57
    .line 58
    array-length p4, p1

    .line 59
    move p5, v0

    .line 60
    :goto_2
    if-ge p5, p4, :cond_5

    .line 61
    .line 62
    aget-object v3, p1, p5

    .line 63
    .line 64
    invoke-virtual {p0, v3}, Lv3/g0;->d(Lv3/j1;)V

    .line 65
    .line 66
    .line 67
    add-int/lit8 p5, p5, 0x1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_5
    if-eqz v2, :cond_7

    .line 71
    .line 72
    :goto_3
    iget-object p1, p0, Lv3/g0;->A:Lv3/s0;

    .line 73
    .line 74
    iget-object p4, p1, Lv3/s0;->h:Lv3/q0;

    .line 75
    .line 76
    if-eq p4, v2, :cond_6

    .line 77
    .line 78
    invoke-virtual {p1}, Lv3/s0;->a()Lv3/q0;

    .line 79
    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_6
    invoke-virtual {p1, v2}, Lv3/s0;->l(Lv3/q0;)Z

    .line 83
    .line 84
    .line 85
    const-wide p4, 0xe8d4a51000L

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    iput-wide p4, v2, Lv3/q0;->o:J

    .line 91
    .line 92
    iget-object p1, p0, Lv3/g0;->a:[Lv3/j1;

    .line 93
    .line 94
    array-length p1, p1

    .line 95
    new-array p1, p1, [Z

    .line 96
    .line 97
    invoke-virtual {p0, p1}, Lv3/g0;->f([Z)V

    .line 98
    .line 99
    .line 100
    :cond_7
    iget-object p1, p0, Lv3/g0;->A:Lv3/s0;

    .line 101
    .line 102
    if-eqz v2, :cond_a

    .line 103
    .line 104
    invoke-virtual {p1, v2}, Lv3/s0;->l(Lv3/q0;)Z

    .line 105
    .line 106
    .line 107
    iget-boolean p1, v2, Lv3/q0;->d:Z

    .line 108
    .line 109
    if-nez p1, :cond_8

    .line 110
    .line 111
    iget-object p1, v2, Lv3/q0;->f:Lv3/r0;

    .line 112
    .line 113
    invoke-virtual {p1, p2, p3}, Lv3/r0;->b(J)Lv3/r0;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iput-object p1, v2, Lv3/q0;->f:Lv3/r0;

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_8
    iget-boolean p1, v2, Lv3/q0;->e:Z

    .line 121
    .line 122
    if-eqz p1, :cond_9

    .line 123
    .line 124
    iget-object p1, v2, Lv3/q0;->a:Lz4/r;

    .line 125
    .line 126
    invoke-interface {p1, p2, p3}, Lz4/r;->l(J)J

    .line 127
    .line 128
    .line 129
    move-result-wide p1

    .line 130
    iget-object p3, v2, Lv3/q0;->a:Lz4/r;

    .line 131
    .line 132
    iget-wide p4, p0, Lv3/g0;->u:J

    .line 133
    .line 134
    sub-long p4, p1, p4

    .line 135
    .line 136
    iget-boolean v2, p0, Lv3/g0;->v:Z

    .line 137
    .line 138
    invoke-interface {p3, p4, p5, v2}, Lz4/r;->s(JZ)V

    .line 139
    .line 140
    .line 141
    move-wide p2, p1

    .line 142
    :cond_9
    :goto_4
    invoke-virtual {p0, p2, p3}, Lv3/g0;->D(J)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Lv3/g0;->t()V

    .line 146
    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_a
    invoke-virtual {p1}, Lv3/s0;->b()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, p2, p3}, Lv3/g0;->D(J)V

    .line 153
    .line 154
    .line 155
    :goto_5
    invoke-virtual {p0, v0}, Lv3/g0;->l(Z)V

    .line 156
    .line 157
    .line 158
    iget-object p1, p0, Lv3/g0;->p:Lv5/k;

    .line 159
    .line 160
    invoke-interface {p1, v1}, Lv5/k;->i(I)Z

    .line 161
    .line 162
    .line 163
    return-wide p2
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
.end method

.method public final L(Lv3/g1;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lv3/g1;->f:Landroid/os/Looper;

    .line 2
    .line 3
    iget-object v1, p0, Lv3/g0;->r:Landroid/os/Looper;

    .line 4
    .line 5
    if-ne v0, v1, :cond_1

    .line 6
    .line 7
    monitor-enter p1

    .line 8
    monitor-exit p1

    .line 9
    const/4 v0, 0x1

    .line 10
    :try_start_0
    iget-object v1, p1, Lv3/g1;->a:Lv3/g1$b;

    .line 11
    .line 12
    iget v2, p1, Lv3/g1;->d:I

    .line 13
    .line 14
    iget-object v3, p1, Lv3/g1;->e:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-interface {v1, v2, v3}, Lv3/g1$b;->q(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lv3/g1;->b(Z)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lv3/g0;->F:Lv3/d1;

    .line 23
    .line 24
    iget p1, p1, Lv3/d1;->e:I

    .line 25
    .line 26
    const/4 v0, 0x3

    .line 27
    const/4 v1, 0x2

    .line 28
    if-eq p1, v0, :cond_0

    .line 29
    .line 30
    if-ne p1, v1, :cond_2

    .line 31
    .line 32
    :cond_0
    iget-object p1, p0, Lv3/g0;->p:Lv5/k;

    .line 33
    .line 34
    invoke-interface {p1, v1}, Lv5/k;->i(I)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v1

    .line 39
    invoke-virtual {p1, v0}, Lv3/g1;->b(Z)V

    .line 40
    .line 41
    .line 42
    throw v1

    .line 43
    :cond_1
    iget-object v0, p0, Lv3/g0;->p:Lv5/k;

    .line 44
    .line 45
    const/16 v1, 0xf

    .line 46
    .line 47
    invoke-interface {v0, v1, p1}, Lv5/k;->k(ILjava/lang/Object;)Lv5/a0$a;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Lv5/a0$a;->a()V

    .line 52
    .line 53
    .line 54
    :cond_2
    :goto_0
    return-void
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final M(Lv3/g1;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lv3/g1;->f:Landroid/os/Looper;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const-string v0, "TAG"

    .line 14
    .line 15
    const-string v1, "Trying to send message on a dead thread."

    .line 16
    .line 17
    invoke-static {v0, v1}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p1, v0}, Lv3/g1;->b(Z)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object v1, p0, Lv3/g0;->y:Lv5/c;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-interface {v1, v0, v2}, Lv5/c;->b(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lv5/a0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, Lx0/f;

    .line 33
    .line 34
    const/4 v2, 0x6

    .line 35
    invoke-direct {v1, v2, p0, p1}, Lx0/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lv5/a0;->e(Ljava/lang/Runnable;)Z

    .line 39
    .line 40
    .line 41
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final O(ZLjava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 4

    iget-boolean v0, p0, Lv3/g0;->O:Z

    if-eq v0, p1, :cond_1

    iput-boolean p1, p0, Lv3/g0;->O:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lv3/g0;->a:[Lv3/j1;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    invoke-static {v2}, Lv3/g0;->r(Lv3/j1;)Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, p0, Lv3/g0;->b:Ljava/util/Set;

    invoke-interface {v3, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Lv3/j1;->reset()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    monitor-enter p0

    const/4 p1, 0x1

    :try_start_0
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    :goto_1
    return-void
.end method

.method public final P(Lv3/g0$a;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lv3/g0;->G:Lv3/g0$d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lv3/g0$d;->a(I)V

    .line 5
    .line 6
    .line 7
    iget v0, p1, Lv3/g0$a;->c:I

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    new-instance v0, Lv3/g0$g;

    .line 13
    .line 14
    new-instance v1, Lv3/h1;

    .line 15
    .line 16
    iget-object v2, p1, Lv3/g0$a;->a:Ljava/util/List;

    .line 17
    .line 18
    iget-object v3, p1, Lv3/g0$a;->b:Lz4/e0;

    .line 19
    .line 20
    invoke-direct {v1, v2, v3}, Lv3/h1;-><init>(Ljava/util/List;Lz4/e0;)V

    .line 21
    .line 22
    .line 23
    iget v2, p1, Lv3/g0$a;->c:I

    .line 24
    .line 25
    iget-wide v3, p1, Lv3/g0$a;->d:J

    .line 26
    .line 27
    invoke-direct {v0, v1, v2, v3, v4}, Lv3/g0$g;-><init>(Lv3/r1;IJ)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lv3/g0;->S:Lv3/g0$g;

    .line 31
    .line 32
    :cond_0
    iget-object v0, p0, Lv3/g0;->B:Lv3/z0;

    .line 33
    .line 34
    iget-object v1, p1, Lv3/g0$a;->a:Ljava/util/List;

    .line 35
    .line 36
    iget-object p1, p1, Lv3/g0$a;->b:Lz4/e0;

    .line 37
    .line 38
    iget-object v2, v0, Lv3/z0;->b:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-virtual {v0, v3, v2}, Lv3/z0;->g(II)V

    .line 46
    .line 47
    .line 48
    iget-object v2, v0, Lv3/z0;->b:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-virtual {v0, v2, v1, p1}, Lv3/z0;->a(ILjava/util/List;Lz4/e0;)Lv3/r1;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p0, p1, v3}, Lv3/g0;->m(Lv3/r1;Z)V

    .line 59
    .line 60
    .line 61
    return-void
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final Q(Z)V
    .locals 1

    iget-boolean v0, p0, Lv3/g0;->Q:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lv3/g0;->Q:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lv3/g0;->F:Lv3/d1;

    iget-boolean p1, p1, Lv3/d1;->o:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lv3/g0;->p:Lv5/k;

    const/4 v0, 0x2

    invoke-interface {p1, v0}, Lv5/k;->i(I)Z

    :cond_1
    return-void
.end method

.method public final R(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lv3/g0;->I:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lv3/g0;->C()V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Lv3/g0;->J:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lv3/g0;->A:Lv3/s0;

    .line 11
    .line 12
    iget-object v0, p1, Lv3/s0;->i:Lv3/q0;

    .line 13
    .line 14
    iget-object p1, p1, Lv3/s0;->h:Lv3/q0;

    .line 15
    .line 16
    if-eq v0, p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    invoke-virtual {p0, p1}, Lv3/g0;->I(Z)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p1}, Lv3/g0;->l(Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final S(IIZZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv3/g0;->G:Lv3/g0$d;

    .line 2
    .line 3
    invoke-virtual {v0, p4}, Lv3/g0$d;->a(I)V

    .line 4
    .line 5
    .line 6
    iget-object p4, p0, Lv3/g0;->G:Lv3/g0$d;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p4, Lv3/g0$d;->a:Z

    .line 10
    .line 11
    iput-boolean v0, p4, Lv3/g0$d;->f:Z

    .line 12
    .line 13
    iput p2, p4, Lv3/g0$d;->g:I

    .line 14
    .line 15
    iget-object p2, p0, Lv3/g0;->F:Lv3/d1;

    .line 16
    .line 17
    invoke-virtual {p2, p1, p3}, Lv3/d1;->c(IZ)Lv3/d1;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lv3/g0;->F:Lv3/d1;

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    iput-boolean p1, p0, Lv3/g0;->K:Z

    .line 25
    .line 26
    iget-object p2, p0, Lv3/g0;->A:Lv3/s0;

    .line 27
    .line 28
    iget-object p2, p2, Lv3/s0;->h:Lv3/q0;

    .line 29
    .line 30
    :goto_0
    if-eqz p2, :cond_2

    .line 31
    .line 32
    iget-object p3, p2, Lv3/q0;->n:Lr5/p;

    .line 33
    .line 34
    iget-object p3, p3, Lr5/p;->c:[Lr5/h;

    .line 35
    .line 36
    array-length p4, p3

    .line 37
    move v0, p1

    .line 38
    :goto_1
    if-ge v0, p4, :cond_1

    .line 39
    .line 40
    aget-object v1, p3, v0

    .line 41
    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    invoke-interface {v1}, Lr5/h;->e()V

    .line 45
    .line 46
    .line 47
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    iget-object p2, p2, Lv3/q0;->l:Lv3/q0;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-virtual {p0}, Lv3/g0;->Y()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    invoke-virtual {p0}, Lv3/g0;->c0()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lv3/g0;->e0()V

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    iget-object p1, p0, Lv3/g0;->F:Lv3/d1;

    .line 67
    .line 68
    iget p1, p1, Lv3/d1;->e:I

    .line 69
    .line 70
    const/4 p2, 0x3

    .line 71
    const/4 p3, 0x2

    .line 72
    if-ne p1, p2, :cond_4

    .line 73
    .line 74
    invoke-virtual {p0}, Lv3/g0;->a0()V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    if-ne p1, p3, :cond_5

    .line 79
    .line 80
    :goto_2
    iget-object p1, p0, Lv3/g0;->p:Lv5/k;

    .line 81
    .line 82
    invoke-interface {p1, p3}, Lv5/k;->i(I)Z

    .line 83
    .line 84
    .line 85
    :cond_5
    :goto_3
    return-void
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
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
.end method

.method public final T(Lv3/e1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv3/g0;->p:Lv5/k;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lv5/k;->j(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lv3/g0;->w:Lv3/k;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lv3/k;->c(Lv3/e1;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lv3/g0;->w:Lv3/k;

    .line 14
    .line 15
    invoke-virtual {p1}, Lv3/k;->f()Lv3/e1;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget v0, p1, Lv3/e1;->a:F

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {p0, p1, v0, v1, v1}, Lv3/g0;->o(Lv3/e1;FZZ)V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final U(I)V
    .locals 2

    .line 1
    iput p1, p0, Lv3/g0;->M:I

    .line 2
    .line 3
    iget-object v0, p0, Lv3/g0;->A:Lv3/s0;

    .line 4
    .line 5
    iget-object v1, p0, Lv3/g0;->F:Lv3/d1;

    .line 6
    .line 7
    iget-object v1, v1, Lv3/d1;->a:Lv3/r1;

    .line 8
    .line 9
    iput p1, v0, Lv3/s0;->f:I

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lv3/s0;->o(Lv3/r1;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-virtual {p0, p1}, Lv3/g0;->I(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    invoke-virtual {p0, p1}, Lv3/g0;->l(Z)V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final V(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Lv3/g0;->N:Z

    .line 2
    .line 3
    iget-object v0, p0, Lv3/g0;->A:Lv3/s0;

    .line 4
    .line 5
    iget-object v1, p0, Lv3/g0;->F:Lv3/d1;

    .line 6
    .line 7
    iget-object v1, v1, Lv3/d1;->a:Lv3/r1;

    .line 8
    .line 9
    iput-boolean p1, v0, Lv3/s0;->g:Z

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lv3/s0;->o(Lv3/r1;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-virtual {p0, p1}, Lv3/g0;->I(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    invoke-virtual {p0, p1}, Lv3/g0;->l(Z)V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final W(Lz4/e0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lv3/g0;->G:Lv3/g0$d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lv3/g0$d;->a(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lv3/g0;->B:Lv3/z0;

    .line 8
    .line 9
    iget-object v1, v0, Lv3/z0;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-interface {p1}, Lz4/e0;->getLength()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    if-eq v2, v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Lz4/e0;->g()Lz4/e0$a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1, v3, v1}, Lz4/e0$a;->e(II)Lz4/e0$a;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :cond_0
    iput-object p1, v0, Lv3/z0;->j:Lz4/e0;

    .line 31
    .line 32
    invoke-virtual {v0}, Lv3/z0;->c()Lv3/r1;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p0, p1, v3}, Lv3/g0;->m(Lv3/r1;Z)V

    .line 37
    .line 38
    .line 39
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final X(I)V
    .locals 3

    iget-object v0, p0, Lv3/g0;->F:Lv3/d1;

    iget v1, v0, Lv3/d1;->e:I

    if-eq v1, p1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Lv3/g0;->X:J

    :cond_0
    invoke-virtual {v0, p1}, Lv3/d1;->f(I)Lv3/d1;

    move-result-object p1

    iput-object p1, p0, Lv3/g0;->F:Lv3/d1;

    :cond_1
    return-void
.end method

.method public final Y()Z
    .locals 2

    iget-object v0, p0, Lv3/g0;->F:Lv3/d1;

    iget-boolean v1, v0, Lv3/d1;->l:Z

    if-eqz v1, :cond_0

    iget v0, v0, Lv3/d1;->m:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final Z(Lv3/r1;Lz4/t$b;)Z
    .locals 4

    invoke-virtual {p2}, Lz4/s;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lv3/r1;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p2, Lz4/s;->a:Ljava/lang/Object;

    iget-object v0, p0, Lv3/g0;->t:Lv3/r1$b;

    invoke-virtual {p1, p2, v0}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    move-result-object p2

    iget p2, p2, Lv3/r1$b;->c:I

    iget-object v0, p0, Lv3/g0;->s:Lv3/r1$c;

    invoke-virtual {p1, p2, v0}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    iget-object p1, p0, Lv3/g0;->s:Lv3/r1$c;

    invoke-virtual {p1}, Lv3/r1$c;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lv3/g0;->s:Lv3/r1$c;

    iget-boolean p2, p1, Lv3/r1$c;->q:Z

    if-eqz p2, :cond_1

    iget-wide p1, p1, Lv3/r1$c;->f:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p1, v2

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    :goto_0
    return v1
.end method

.method public final a(Lz4/d0;)V
    .locals 2

    check-cast p1, Lz4/r;

    iget-object v0, p0, Lv3/g0;->p:Lv5/k;

    const/16 v1, 0x9

    invoke-interface {v0, v1, p1}, Lv5/k;->k(ILjava/lang/Object;)Lv5/a0$a;

    move-result-object p1

    invoke-virtual {p1}, Lv5/a0$a;->a()V

    return-void
.end method

.method public final a0()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lv3/g0;->K:Z

    .line 3
    .line 4
    iget-object v1, p0, Lv3/g0;->w:Lv3/k;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    iput-boolean v2, v1, Lv3/k;->f:Z

    .line 8
    .line 9
    iget-object v1, v1, Lv3/k;->a:Lv5/y;

    .line 10
    .line 11
    iget-boolean v3, v1, Lv5/y;->b:Z

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    iget-object v3, v1, Lv5/y;->a:Lv5/c;

    .line 16
    .line 17
    invoke-interface {v3}, Lv5/c;->d()J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    iput-wide v3, v1, Lv5/y;->d:J

    .line 22
    .line 23
    iput-boolean v2, v1, Lv5/y;->b:Z

    .line 24
    .line 25
    :cond_0
    iget-object v1, p0, Lv3/g0;->a:[Lv3/j1;

    .line 26
    .line 27
    array-length v2, v1

    .line 28
    :goto_0
    if-ge v0, v2, :cond_2

    .line 29
    .line 30
    aget-object v3, v1, v0

    .line 31
    .line 32
    invoke-static {v3}, Lv3/g0;->r(Lv3/j1;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    invoke-interface {v3}, Lv3/j1;->start()V

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
.end method

.method public final b(Lz4/r;)V
    .locals 2

    iget-object v0, p0, Lv3/g0;->p:Lv5/k;

    const/16 v1, 0x8

    invoke-interface {v0, v1, p1}, Lv5/k;->k(ILjava/lang/Object;)Lv5/a0$a;

    move-result-object p1

    invoke-virtual {p1}, Lv5/a0$a;->a()V

    return-void
.end method

.method public final b0(ZZ)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lv3/g0;->O:Z

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move p1, v0

    goto :goto_1

    :cond_1
    :goto_0
    move p1, v1

    :goto_1
    invoke-virtual {p0, p1, v0, v1, v0}, Lv3/g0;->B(ZZZZ)V

    iget-object p1, p0, Lv3/g0;->G:Lv3/g0$d;

    invoke-virtual {p1, p2}, Lv3/g0$d;->a(I)V

    iget-object p1, p0, Lv3/g0;->f:Lv3/n0;

    invoke-interface {p1}, Lv3/n0;->i()V

    invoke-virtual {p0, v1}, Lv3/g0;->X(I)V

    return-void
.end method

.method public final c(Lv3/g0$a;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv3/g0;->G:Lv3/g0$d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lv3/g0$d;->a(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lv3/g0;->B:Lv3/z0;

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    if-ne p2, v1, :cond_0

    .line 11
    .line 12
    iget-object p2, v0, Lv3/z0;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    :cond_0
    iget-object v1, p1, Lv3/g0$a;->a:Ljava/util/List;

    .line 19
    .line 20
    iget-object p1, p1, Lv3/g0$a;->b:Lz4/e0;

    .line 21
    .line 22
    invoke-virtual {v0, p2, v1, p1}, Lv3/z0;->a(ILjava/util/List;Lz4/e0;)Lv3/r1;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-virtual {p0, p1, p2}, Lv3/g0;->m(Lv3/r1;Z)V

    .line 28
    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final c0()V
    .locals 6

    .line 1
    iget-object v0, p0, Lv3/g0;->w:Lv3/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lv3/k;->f:Z

    .line 5
    .line 6
    iget-object v0, v0, Lv3/k;->a:Lv5/y;

    .line 7
    .line 8
    iget-boolean v2, v0, Lv5/y;->b:Z

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lv5/y;->l()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-virtual {v0, v2, v3}, Lv5/y;->a(J)V

    .line 17
    .line 18
    .line 19
    iput-boolean v1, v0, Lv5/y;->b:Z

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lv3/g0;->a:[Lv3/j1;

    .line 22
    .line 23
    array-length v2, v0

    .line 24
    :goto_0
    if-ge v1, v2, :cond_2

    .line 25
    .line 26
    aget-object v3, v0, v1

    .line 27
    .line 28
    invoke-static {v3}, Lv3/g0;->r(Lv3/j1;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    invoke-interface {v3}, Lv3/j1;->e()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const/4 v5, 0x2

    .line 39
    if-ne v4, v5, :cond_1

    .line 40
    .line 41
    invoke-interface {v3}, Lv3/j1;->stop()V

    .line 42
    .line 43
    .line 44
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    return-void
    .line 48
    .line 49
    .line 50
    .line 51
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
.end method

.method public final d(Lv3/j1;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Lv3/j1;->e()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move v0, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-nez v0, :cond_1

    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    iget-object v0, p0, Lv3/g0;->w:Lv3/k;

    .line 15
    .line 16
    iget-object v2, v0, Lv3/k;->c:Lv3/j1;

    .line 17
    .line 18
    if-ne p1, v2, :cond_2

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iput-object v2, v0, Lv3/k;->d:Lv5/o;

    .line 22
    .line 23
    iput-object v2, v0, Lv3/k;->c:Lv3/j1;

    .line 24
    .line 25
    iput-boolean v1, v0, Lv3/k;->e:Z

    .line 26
    .line 27
    :cond_2
    invoke-interface {p1}, Lv3/j1;->e()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v2, 0x2

    .line 32
    if-ne v0, v2, :cond_3

    .line 33
    .line 34
    invoke-interface {p1}, Lv3/j1;->stop()V

    .line 35
    .line 36
    .line 37
    :cond_3
    invoke-interface {p1}, Lv3/j1;->g()V

    .line 38
    .line 39
    .line 40
    iget p1, p0, Lv3/g0;->R:I

    .line 41
    .line 42
    sub-int/2addr p1, v1

    .line 43
    iput p1, p0, Lv3/g0;->R:I

    .line 44
    .line 45
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final d0()V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lv3/g0;->A:Lv3/s0;

    .line 4
    .line 5
    iget-object v1, v1, Lv3/s0;->j:Lv3/q0;

    .line 6
    .line 7
    iget-boolean v2, v0, Lv3/g0;->L:Z

    .line 8
    .line 9
    if-nez v2, :cond_1

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, v1, Lv3/q0;->a:Lz4/r;

    .line 14
    .line 15
    invoke-interface {v1}, Lz4/r;->isLoading()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 25
    :goto_1
    move v11, v1

    .line 26
    iget-object v1, v0, Lv3/g0;->F:Lv3/d1;

    .line 27
    .line 28
    iget-boolean v2, v1, Lv3/d1;->g:Z

    .line 29
    .line 30
    if-eq v11, v2, :cond_2

    .line 31
    .line 32
    new-instance v15, Lv3/d1;

    .line 33
    .line 34
    move-object v2, v15

    .line 35
    iget-object v3, v1, Lv3/d1;->a:Lv3/r1;

    .line 36
    .line 37
    iget-object v4, v1, Lv3/d1;->b:Lz4/t$b;

    .line 38
    .line 39
    iget-wide v5, v1, Lv3/d1;->c:J

    .line 40
    .line 41
    iget-wide v7, v1, Lv3/d1;->d:J

    .line 42
    .line 43
    iget v9, v1, Lv3/d1;->e:I

    .line 44
    .line 45
    iget-object v10, v1, Lv3/d1;->f:Lv3/n;

    .line 46
    .line 47
    iget-object v12, v1, Lv3/d1;->h:Lz4/j0;

    .line 48
    .line 49
    iget-object v13, v1, Lv3/d1;->i:Lr5/p;

    .line 50
    .line 51
    iget-object v14, v1, Lv3/d1;->j:Ljava/util/List;

    .line 52
    .line 53
    move-object/from16 v16, v15

    .line 54
    .line 55
    iget-object v15, v1, Lv3/d1;->k:Lz4/t$b;

    .line 56
    .line 57
    move-object/from16 v26, v16

    .line 58
    .line 59
    iget-boolean v0, v1, Lv3/d1;->l:Z

    .line 60
    .line 61
    move/from16 v16, v0

    .line 62
    .line 63
    iget v0, v1, Lv3/d1;->m:I

    .line 64
    .line 65
    move/from16 v17, v0

    .line 66
    .line 67
    iget-object v0, v1, Lv3/d1;->n:Lv3/e1;

    .line 68
    .line 69
    move-object/from16 v18, v0

    .line 70
    .line 71
    move-object v0, v2

    .line 72
    move-object/from16 v27, v3

    .line 73
    .line 74
    iget-wide v2, v1, Lv3/d1;->p:J

    .line 75
    .line 76
    move-wide/from16 v19, v2

    .line 77
    .line 78
    iget-wide v2, v1, Lv3/d1;->q:J

    .line 79
    .line 80
    move-wide/from16 v21, v2

    .line 81
    .line 82
    iget-wide v2, v1, Lv3/d1;->r:J

    .line 83
    .line 84
    move-wide/from16 v23, v2

    .line 85
    .line 86
    iget-boolean v1, v1, Lv3/d1;->o:Z

    .line 87
    .line 88
    move/from16 v25, v1

    .line 89
    .line 90
    move-object v2, v0

    .line 91
    move-object/from16 v3, v27

    .line 92
    .line 93
    invoke-direct/range {v2 .. v25}, Lv3/d1;-><init>(Lv3/r1;Lz4/t$b;JJILv3/n;ZLz4/j0;Lr5/p;Ljava/util/List;Lz4/t$b;ZILv3/e1;JJJZ)V

    .line 94
    .line 95
    .line 96
    move-object/from16 v0, p0

    .line 97
    .line 98
    move-object/from16 v1, v26

    .line 99
    .line 100
    iput-object v1, v0, Lv3/g0;->F:Lv3/d1;

    .line 101
    .line 102
    :cond_2
    return-void
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method

.method public final e()V
    .locals 57

    .line 1
    move-object/from16 v10, p0

    .line 2
    .line 3
    iget-object v0, v10, Lv3/g0;->y:Lv5/c;

    .line 4
    .line 5
    invoke-interface {v0}, Lv5/c;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide v11

    .line 9
    iget-object v0, v10, Lv3/g0;->p:Lv5/k;

    .line 10
    .line 11
    const/4 v13, 0x2

    .line 12
    invoke-interface {v0, v13}, Lv5/k;->j(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v10, Lv3/g0;->F:Lv3/d1;

    .line 16
    .line 17
    iget-object v0, v0, Lv3/d1;->a:Lv3/r1;

    .line 18
    .line 19
    invoke-virtual {v0}, Lv3/r1;->p()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v14, 0x0

    .line 24
    const-wide/high16 v15, -0x8000000000000000L

    .line 25
    .line 26
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    if-nez v0, :cond_33

    .line 32
    .line 33
    iget-object v0, v10, Lv3/g0;->B:Lv3/z0;

    .line 34
    .line 35
    iget-boolean v0, v0, Lv3/z0;->k:Z

    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    goto/16 :goto_1f

    .line 40
    .line 41
    :cond_0
    iget-object v0, v10, Lv3/g0;->A:Lv3/s0;

    .line 42
    .line 43
    iget-wide v1, v10, Lv3/g0;->T:J

    .line 44
    .line 45
    iget-object v0, v0, Lv3/s0;->j:Lv3/q0;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-object v3, v0, Lv3/q0;->l:Lv3/q0;

    .line 50
    .line 51
    if-nez v3, :cond_1

    .line 52
    .line 53
    const/4 v3, 0x1

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const/4 v3, 0x0

    .line 56
    :goto_0
    invoke-static {v3}, Lx6/b;->H(Z)V

    .line 57
    .line 58
    .line 59
    iget-boolean v3, v0, Lv3/q0;->d:Z

    .line 60
    .line 61
    if-eqz v3, :cond_2

    .line 62
    .line 63
    iget-object v3, v0, Lv3/q0;->a:Lz4/r;

    .line 64
    .line 65
    iget-wide v4, v0, Lv3/q0;->o:J

    .line 66
    .line 67
    sub-long/2addr v1, v4

    .line 68
    invoke-interface {v3, v1, v2}, Lz4/r;->h(J)V

    .line 69
    .line 70
    .line 71
    :cond_2
    iget-object v0, v10, Lv3/g0;->A:Lv3/s0;

    .line 72
    .line 73
    iget-object v1, v0, Lv3/s0;->j:Lv3/q0;

    .line 74
    .line 75
    if-eqz v1, :cond_6

    .line 76
    .line 77
    iget-object v2, v1, Lv3/q0;->f:Lv3/r0;

    .line 78
    .line 79
    iget-boolean v2, v2, Lv3/r0;->i:Z

    .line 80
    .line 81
    if-nez v2, :cond_5

    .line 82
    .line 83
    iget-boolean v2, v1, Lv3/q0;->d:Z

    .line 84
    .line 85
    if-eqz v2, :cond_4

    .line 86
    .line 87
    iget-boolean v2, v1, Lv3/q0;->e:Z

    .line 88
    .line 89
    if-eqz v2, :cond_3

    .line 90
    .line 91
    iget-object v1, v1, Lv3/q0;->a:Lz4/r;

    .line 92
    .line 93
    invoke-interface {v1}, Lz4/r;->g()J

    .line 94
    .line 95
    .line 96
    move-result-wide v1

    .line 97
    cmp-long v1, v1, v15

    .line 98
    .line 99
    if-nez v1, :cond_4

    .line 100
    .line 101
    :cond_3
    const/4 v1, 0x1

    .line 102
    goto :goto_1

    .line 103
    :cond_4
    const/4 v1, 0x0

    .line 104
    :goto_1
    if-eqz v1, :cond_5

    .line 105
    .line 106
    iget-object v1, v0, Lv3/s0;->j:Lv3/q0;

    .line 107
    .line 108
    iget-object v1, v1, Lv3/q0;->f:Lv3/r0;

    .line 109
    .line 110
    iget-wide v1, v1, Lv3/r0;->e:J

    .line 111
    .line 112
    cmp-long v1, v1, v17

    .line 113
    .line 114
    if-eqz v1, :cond_5

    .line 115
    .line 116
    iget v0, v0, Lv3/s0;->k:I

    .line 117
    .line 118
    const/16 v1, 0x64

    .line 119
    .line 120
    if-ge v0, v1, :cond_5

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_5
    const/4 v0, 0x0

    .line 124
    goto :goto_3

    .line 125
    :cond_6
    :goto_2
    const/4 v0, 0x1

    .line 126
    :goto_3
    if-eqz v0, :cond_c

    .line 127
    .line 128
    iget-object v1, v10, Lv3/g0;->A:Lv3/s0;

    .line 129
    .line 130
    iget-wide v2, v10, Lv3/g0;->T:J

    .line 131
    .line 132
    iget-object v0, v10, Lv3/g0;->F:Lv3/d1;

    .line 133
    .line 134
    iget-object v4, v1, Lv3/s0;->j:Lv3/q0;

    .line 135
    .line 136
    if-nez v4, :cond_7

    .line 137
    .line 138
    iget-object v2, v0, Lv3/d1;->a:Lv3/r1;

    .line 139
    .line 140
    iget-object v3, v0, Lv3/d1;->b:Lz4/t$b;

    .line 141
    .line 142
    iget-wide v4, v0, Lv3/d1;->c:J

    .line 143
    .line 144
    iget-wide v6, v0, Lv3/d1;->r:J

    .line 145
    .line 146
    invoke-virtual/range {v1 .. v7}, Lv3/s0;->d(Lv3/r1;Lz4/t$b;JJ)Lv3/r0;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    goto :goto_4

    .line 151
    :cond_7
    iget-object v0, v0, Lv3/d1;->a:Lv3/r1;

    .line 152
    .line 153
    invoke-virtual {v1, v0, v4, v2, v3}, Lv3/s0;->c(Lv3/r1;Lv3/q0;J)Lv3/r0;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    :goto_4
    if-eqz v0, :cond_c

    .line 158
    .line 159
    iget-object v1, v10, Lv3/g0;->A:Lv3/s0;

    .line 160
    .line 161
    iget-object v2, v10, Lv3/g0;->c:[Lv3/k1;

    .line 162
    .line 163
    iget-object v3, v10, Lv3/g0;->d:Lr5/o;

    .line 164
    .line 165
    iget-object v4, v10, Lv3/g0;->f:Lv3/n0;

    .line 166
    .line 167
    invoke-interface {v4}, Lv3/n0;->h()Lt5/o;

    .line 168
    .line 169
    .line 170
    move-result-object v24

    .line 171
    iget-object v4, v10, Lv3/g0;->B:Lv3/z0;

    .line 172
    .line 173
    iget-object v5, v10, Lv3/g0;->e:Lr5/p;

    .line 174
    .line 175
    iget-object v6, v1, Lv3/s0;->j:Lv3/q0;

    .line 176
    .line 177
    if-nez v6, :cond_8

    .line 178
    .line 179
    const-wide v6, 0xe8d4a51000L

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    move-wide/from16 v21, v6

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_8
    iget-wide v8, v6, Lv3/q0;->o:J

    .line 188
    .line 189
    iget-object v6, v6, Lv3/q0;->f:Lv3/r0;

    .line 190
    .line 191
    iget-wide v6, v6, Lv3/r0;->e:J

    .line 192
    .line 193
    add-long/2addr v8, v6

    .line 194
    iget-wide v6, v0, Lv3/r0;->b:J

    .line 195
    .line 196
    sub-long/2addr v8, v6

    .line 197
    move-wide/from16 v21, v8

    .line 198
    .line 199
    :goto_5
    new-instance v6, Lv3/q0;

    .line 200
    .line 201
    move-object/from16 v19, v6

    .line 202
    .line 203
    move-object/from16 v20, v2

    .line 204
    .line 205
    move-object/from16 v23, v3

    .line 206
    .line 207
    move-object/from16 v25, v4

    .line 208
    .line 209
    move-object/from16 v26, v0

    .line 210
    .line 211
    move-object/from16 v27, v5

    .line 212
    .line 213
    invoke-direct/range {v19 .. v27}, Lv3/q0;-><init>([Lv3/k1;JLr5/o;Lt5/b;Lv3/z0;Lv3/r0;Lr5/p;)V

    .line 214
    .line 215
    .line 216
    iget-object v2, v1, Lv3/s0;->j:Lv3/q0;

    .line 217
    .line 218
    if-eqz v2, :cond_a

    .line 219
    .line 220
    iget-object v3, v2, Lv3/q0;->l:Lv3/q0;

    .line 221
    .line 222
    if-ne v6, v3, :cond_9

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_9
    invoke-virtual {v2}, Lv3/q0;->b()V

    .line 226
    .line 227
    .line 228
    iput-object v6, v2, Lv3/q0;->l:Lv3/q0;

    .line 229
    .line 230
    invoke-virtual {v2}, Lv3/q0;->c()V

    .line 231
    .line 232
    .line 233
    goto :goto_6

    .line 234
    :cond_a
    iput-object v6, v1, Lv3/s0;->h:Lv3/q0;

    .line 235
    .line 236
    iput-object v6, v1, Lv3/s0;->i:Lv3/q0;

    .line 237
    .line 238
    :goto_6
    iput-object v14, v1, Lv3/s0;->l:Ljava/lang/Object;

    .line 239
    .line 240
    iput-object v6, v1, Lv3/s0;->j:Lv3/q0;

    .line 241
    .line 242
    iget v2, v1, Lv3/s0;->k:I

    .line 243
    .line 244
    const/4 v3, 0x1

    .line 245
    add-int/2addr v2, v3

    .line 246
    iput v2, v1, Lv3/s0;->k:I

    .line 247
    .line 248
    invoke-virtual {v1}, Lv3/s0;->k()V

    .line 249
    .line 250
    .line 251
    iget-object v1, v6, Lv3/q0;->a:Lz4/r;

    .line 252
    .line 253
    iget-wide v2, v0, Lv3/r0;->b:J

    .line 254
    .line 255
    invoke-interface {v1, v10, v2, v3}, Lz4/r;->n(Lz4/r$a;J)V

    .line 256
    .line 257
    .line 258
    iget-object v1, v10, Lv3/g0;->A:Lv3/s0;

    .line 259
    .line 260
    iget-object v1, v1, Lv3/s0;->h:Lv3/q0;

    .line 261
    .line 262
    if-ne v1, v6, :cond_b

    .line 263
    .line 264
    iget-wide v0, v0, Lv3/r0;->b:J

    .line 265
    .line 266
    invoke-virtual {v10, v0, v1}, Lv3/g0;->D(J)V

    .line 267
    .line 268
    .line 269
    :cond_b
    const/4 v8, 0x0

    .line 270
    invoke-virtual {v10, v8}, Lv3/g0;->l(Z)V

    .line 271
    .line 272
    .line 273
    goto :goto_7

    .line 274
    :cond_c
    const/4 v8, 0x0

    .line 275
    :goto_7
    iget-boolean v0, v10, Lv3/g0;->L:Z

    .line 276
    .line 277
    if-eqz v0, :cond_d

    .line 278
    .line 279
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->q()Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    iput-boolean v0, v10, Lv3/g0;->L:Z

    .line 284
    .line 285
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->d0()V

    .line 286
    .line 287
    .line 288
    goto :goto_8

    .line 289
    :cond_d
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->t()V

    .line 290
    .line 291
    .line 292
    :goto_8
    iget-object v0, v10, Lv3/g0;->A:Lv3/s0;

    .line 293
    .line 294
    iget-object v0, v0, Lv3/s0;->i:Lv3/q0;

    .line 295
    .line 296
    if-nez v0, :cond_e

    .line 297
    .line 298
    goto/16 :goto_14

    .line 299
    .line 300
    :cond_e
    iget-object v1, v0, Lv3/q0;->l:Lv3/q0;

    .line 301
    .line 302
    if-eqz v1, :cond_1e

    .line 303
    .line 304
    iget-boolean v1, v10, Lv3/g0;->J:Z

    .line 305
    .line 306
    if-eqz v1, :cond_f

    .line 307
    .line 308
    goto/16 :goto_11

    .line 309
    .line 310
    :cond_f
    iget-boolean v1, v0, Lv3/q0;->d:Z

    .line 311
    .line 312
    if-nez v1, :cond_10

    .line 313
    .line 314
    goto :goto_b

    .line 315
    :cond_10
    move v1, v8

    .line 316
    :goto_9
    iget-object v2, v10, Lv3/g0;->a:[Lv3/j1;

    .line 317
    .line 318
    array-length v3, v2

    .line 319
    if-ge v1, v3, :cond_15

    .line 320
    .line 321
    aget-object v2, v2, v1

    .line 322
    .line 323
    iget-object v3, v0, Lv3/q0;->c:[Lz4/c0;

    .line 324
    .line 325
    aget-object v3, v3, v1

    .line 326
    .line 327
    invoke-interface {v2}, Lv3/j1;->r()Lz4/c0;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    if-ne v4, v3, :cond_14

    .line 332
    .line 333
    if-eqz v3, :cond_13

    .line 334
    .line 335
    invoke-interface {v2}, Lv3/j1;->h()Z

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    if-nez v3, :cond_13

    .line 340
    .line 341
    iget-object v3, v0, Lv3/q0;->l:Lv3/q0;

    .line 342
    .line 343
    iget-object v4, v0, Lv3/q0;->f:Lv3/r0;

    .line 344
    .line 345
    iget-boolean v4, v4, Lv3/r0;->f:Z

    .line 346
    .line 347
    if-eqz v4, :cond_12

    .line 348
    .line 349
    iget-boolean v4, v3, Lv3/q0;->d:Z

    .line 350
    .line 351
    if-eqz v4, :cond_12

    .line 352
    .line 353
    instance-of v4, v2, Lh5/n;

    .line 354
    .line 355
    if-nez v4, :cond_11

    .line 356
    .line 357
    instance-of v4, v2, Lp4/f;

    .line 358
    .line 359
    if-nez v4, :cond_11

    .line 360
    .line 361
    invoke-interface {v2}, Lv3/j1;->t()J

    .line 362
    .line 363
    .line 364
    move-result-wide v4

    .line 365
    invoke-virtual {v3}, Lv3/q0;->e()J

    .line 366
    .line 367
    .line 368
    move-result-wide v2

    .line 369
    cmp-long v2, v4, v2

    .line 370
    .line 371
    if-ltz v2, :cond_12

    .line 372
    .line 373
    :cond_11
    const/4 v2, 0x1

    .line 374
    goto :goto_a

    .line 375
    :cond_12
    move v2, v8

    .line 376
    :goto_a
    if-nez v2, :cond_13

    .line 377
    .line 378
    goto :goto_b

    .line 379
    :cond_13
    add-int/lit8 v1, v1, 0x1

    .line 380
    .line 381
    goto :goto_9

    .line 382
    :cond_14
    :goto_b
    move v1, v8

    .line 383
    goto :goto_c

    .line 384
    :cond_15
    const/4 v1, 0x1

    .line 385
    :goto_c
    if-nez v1, :cond_16

    .line 386
    .line 387
    goto/16 :goto_14

    .line 388
    .line 389
    :cond_16
    iget-object v1, v0, Lv3/q0;->l:Lv3/q0;

    .line 390
    .line 391
    iget-boolean v2, v1, Lv3/q0;->d:Z

    .line 392
    .line 393
    if-nez v2, :cond_17

    .line 394
    .line 395
    iget-wide v2, v10, Lv3/g0;->T:J

    .line 396
    .line 397
    invoke-virtual {v1}, Lv3/q0;->e()J

    .line 398
    .line 399
    .line 400
    move-result-wide v4

    .line 401
    cmp-long v1, v2, v4

    .line 402
    .line 403
    if-gez v1, :cond_17

    .line 404
    .line 405
    goto/16 :goto_14

    .line 406
    .line 407
    :cond_17
    iget-object v9, v0, Lv3/q0;->n:Lr5/p;

    .line 408
    .line 409
    iget-object v1, v10, Lv3/g0;->A:Lv3/s0;

    .line 410
    .line 411
    iget-object v2, v1, Lv3/s0;->i:Lv3/q0;

    .line 412
    .line 413
    if-eqz v2, :cond_18

    .line 414
    .line 415
    iget-object v2, v2, Lv3/q0;->l:Lv3/q0;

    .line 416
    .line 417
    if-eqz v2, :cond_18

    .line 418
    .line 419
    const/4 v2, 0x1

    .line 420
    goto :goto_d

    .line 421
    :cond_18
    move v2, v8

    .line 422
    :goto_d
    invoke-static {v2}, Lx6/b;->H(Z)V

    .line 423
    .line 424
    .line 425
    iget-object v2, v1, Lv3/s0;->i:Lv3/q0;

    .line 426
    .line 427
    iget-object v2, v2, Lv3/q0;->l:Lv3/q0;

    .line 428
    .line 429
    iput-object v2, v1, Lv3/s0;->i:Lv3/q0;

    .line 430
    .line 431
    invoke-virtual {v1}, Lv3/s0;->k()V

    .line 432
    .line 433
    .line 434
    iget-object v7, v1, Lv3/s0;->i:Lv3/q0;

    .line 435
    .line 436
    iget-object v5, v7, Lv3/q0;->n:Lr5/p;

    .line 437
    .line 438
    iget-object v1, v10, Lv3/g0;->F:Lv3/d1;

    .line 439
    .line 440
    iget-object v3, v1, Lv3/d1;->a:Lv3/r1;

    .line 441
    .line 442
    iget-object v1, v7, Lv3/q0;->f:Lv3/r0;

    .line 443
    .line 444
    iget-object v2, v1, Lv3/r0;->a:Lz4/t$b;

    .line 445
    .line 446
    iget-object v0, v0, Lv3/q0;->f:Lv3/r0;

    .line 447
    .line 448
    iget-object v4, v0, Lv3/r0;->a:Lz4/t$b;

    .line 449
    .line 450
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    const/16 v21, 0x0

    .line 456
    .line 457
    move-object/from16 v0, p0

    .line 458
    .line 459
    move-object v1, v3

    .line 460
    move-object v8, v5

    .line 461
    move-wide/from16 v5, v19

    .line 462
    .line 463
    move-object v14, v7

    .line 464
    move/from16 v7, v21

    .line 465
    .line 466
    invoke-virtual/range {v0 .. v7}, Lv3/g0;->f0(Lv3/r1;Lz4/t$b;Lv3/r1;Lz4/t$b;JZ)V

    .line 467
    .line 468
    .line 469
    iget-boolean v0, v14, Lv3/q0;->d:Z

    .line 470
    .line 471
    if-eqz v0, :cond_1a

    .line 472
    .line 473
    iget-object v0, v14, Lv3/q0;->a:Lz4/r;

    .line 474
    .line 475
    invoke-interface {v0}, Lz4/r;->o()J

    .line 476
    .line 477
    .line 478
    move-result-wide v0

    .line 479
    cmp-long v0, v0, v17

    .line 480
    .line 481
    if-eqz v0, :cond_1a

    .line 482
    .line 483
    invoke-virtual {v14}, Lv3/q0;->e()J

    .line 484
    .line 485
    .line 486
    move-result-wide v0

    .line 487
    iget-object v2, v10, Lv3/g0;->a:[Lv3/j1;

    .line 488
    .line 489
    array-length v3, v2

    .line 490
    const/4 v4, 0x0

    .line 491
    :goto_e
    if-ge v4, v3, :cond_22

    .line 492
    .line 493
    aget-object v5, v2, v4

    .line 494
    .line 495
    invoke-interface {v5}, Lv3/j1;->r()Lz4/c0;

    .line 496
    .line 497
    .line 498
    move-result-object v6

    .line 499
    if-eqz v6, :cond_19

    .line 500
    .line 501
    invoke-static {v5, v0, v1}, Lv3/g0;->N(Lv3/j1;J)V

    .line 502
    .line 503
    .line 504
    :cond_19
    add-int/lit8 v4, v4, 0x1

    .line 505
    .line 506
    goto :goto_e

    .line 507
    :cond_1a
    const/4 v0, 0x0

    .line 508
    :goto_f
    iget-object v1, v10, Lv3/g0;->a:[Lv3/j1;

    .line 509
    .line 510
    array-length v1, v1

    .line 511
    if-ge v0, v1, :cond_22

    .line 512
    .line 513
    invoke-virtual {v9, v0}, Lr5/p;->b(I)Z

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    invoke-virtual {v8, v0}, Lr5/p;->b(I)Z

    .line 518
    .line 519
    .line 520
    move-result v2

    .line 521
    if-eqz v1, :cond_1d

    .line 522
    .line 523
    iget-object v1, v10, Lv3/g0;->a:[Lv3/j1;

    .line 524
    .line 525
    aget-object v1, v1, v0

    .line 526
    .line 527
    invoke-interface {v1}, Lv3/j1;->v()Z

    .line 528
    .line 529
    .line 530
    move-result v1

    .line 531
    if-nez v1, :cond_1d

    .line 532
    .line 533
    iget-object v1, v10, Lv3/g0;->c:[Lv3/k1;

    .line 534
    .line 535
    aget-object v1, v1, v0

    .line 536
    .line 537
    check-cast v1, Lv3/f;

    .line 538
    .line 539
    iget v1, v1, Lv3/f;->a:I

    .line 540
    .line 541
    const/4 v3, -0x2

    .line 542
    if-ne v1, v3, :cond_1b

    .line 543
    .line 544
    const/4 v1, 0x1

    .line 545
    goto :goto_10

    .line 546
    :cond_1b
    const/4 v1, 0x0

    .line 547
    :goto_10
    iget-object v3, v9, Lr5/p;->b:[Lv3/l1;

    .line 548
    .line 549
    aget-object v3, v3, v0

    .line 550
    .line 551
    iget-object v4, v8, Lr5/p;->b:[Lv3/l1;

    .line 552
    .line 553
    aget-object v4, v4, v0

    .line 554
    .line 555
    if-eqz v2, :cond_1c

    .line 556
    .line 557
    invoke-virtual {v4, v3}, Lv3/l1;->equals(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result v2

    .line 561
    if-eqz v2, :cond_1c

    .line 562
    .line 563
    if-eqz v1, :cond_1d

    .line 564
    .line 565
    :cond_1c
    iget-object v1, v10, Lv3/g0;->a:[Lv3/j1;

    .line 566
    .line 567
    aget-object v1, v1, v0

    .line 568
    .line 569
    invoke-virtual {v14}, Lv3/q0;->e()J

    .line 570
    .line 571
    .line 572
    move-result-wide v2

    .line 573
    invoke-static {v1, v2, v3}, Lv3/g0;->N(Lv3/j1;J)V

    .line 574
    .line 575
    .line 576
    :cond_1d
    add-int/lit8 v0, v0, 0x1

    .line 577
    .line 578
    goto :goto_f

    .line 579
    :cond_1e
    :goto_11
    iget-object v1, v0, Lv3/q0;->f:Lv3/r0;

    .line 580
    .line 581
    iget-boolean v1, v1, Lv3/r0;->i:Z

    .line 582
    .line 583
    if-nez v1, :cond_1f

    .line 584
    .line 585
    iget-boolean v1, v10, Lv3/g0;->J:Z

    .line 586
    .line 587
    if-eqz v1, :cond_22

    .line 588
    .line 589
    :cond_1f
    const/4 v1, 0x0

    .line 590
    :goto_12
    iget-object v2, v10, Lv3/g0;->a:[Lv3/j1;

    .line 591
    .line 592
    array-length v3, v2

    .line 593
    if-ge v1, v3, :cond_22

    .line 594
    .line 595
    aget-object v2, v2, v1

    .line 596
    .line 597
    iget-object v3, v0, Lv3/q0;->c:[Lz4/c0;

    .line 598
    .line 599
    aget-object v3, v3, v1

    .line 600
    .line 601
    if-eqz v3, :cond_21

    .line 602
    .line 603
    invoke-interface {v2}, Lv3/j1;->r()Lz4/c0;

    .line 604
    .line 605
    .line 606
    move-result-object v4

    .line 607
    if-ne v4, v3, :cond_21

    .line 608
    .line 609
    invoke-interface {v2}, Lv3/j1;->h()Z

    .line 610
    .line 611
    .line 612
    move-result v3

    .line 613
    if-eqz v3, :cond_21

    .line 614
    .line 615
    iget-object v3, v0, Lv3/q0;->f:Lv3/r0;

    .line 616
    .line 617
    iget-wide v3, v3, Lv3/r0;->e:J

    .line 618
    .line 619
    cmp-long v5, v3, v17

    .line 620
    .line 621
    if-eqz v5, :cond_20

    .line 622
    .line 623
    cmp-long v5, v3, v15

    .line 624
    .line 625
    if-eqz v5, :cond_20

    .line 626
    .line 627
    iget-wide v5, v0, Lv3/q0;->o:J

    .line 628
    .line 629
    add-long/2addr v3, v5

    .line 630
    goto :goto_13

    .line 631
    :cond_20
    move-wide/from16 v3, v17

    .line 632
    .line 633
    :goto_13
    invoke-static {v2, v3, v4}, Lv3/g0;->N(Lv3/j1;J)V

    .line 634
    .line 635
    .line 636
    :cond_21
    add-int/lit8 v1, v1, 0x1

    .line 637
    .line 638
    goto :goto_12

    .line 639
    :cond_22
    :goto_14
    iget-object v0, v10, Lv3/g0;->A:Lv3/s0;

    .line 640
    .line 641
    iget-object v1, v0, Lv3/s0;->i:Lv3/q0;

    .line 642
    .line 643
    if-eqz v1, :cond_2c

    .line 644
    .line 645
    iget-object v0, v0, Lv3/s0;->h:Lv3/q0;

    .line 646
    .line 647
    if-eq v0, v1, :cond_2c

    .line 648
    .line 649
    iget-boolean v0, v1, Lv3/q0;->g:Z

    .line 650
    .line 651
    if-eqz v0, :cond_23

    .line 652
    .line 653
    goto/16 :goto_1a

    .line 654
    .line 655
    :cond_23
    iget-object v0, v1, Lv3/q0;->n:Lr5/p;

    .line 656
    .line 657
    const/4 v2, 0x0

    .line 658
    const/4 v3, 0x0

    .line 659
    :goto_15
    iget-object v4, v10, Lv3/g0;->a:[Lv3/j1;

    .line 660
    .line 661
    array-length v5, v4

    .line 662
    if-ge v3, v5, :cond_2b

    .line 663
    .line 664
    aget-object v4, v4, v3

    .line 665
    .line 666
    invoke-static {v4}, Lv3/g0;->r(Lv3/j1;)Z

    .line 667
    .line 668
    .line 669
    move-result v5

    .line 670
    if-nez v5, :cond_24

    .line 671
    .line 672
    goto :goto_19

    .line 673
    :cond_24
    invoke-interface {v4}, Lv3/j1;->r()Lz4/c0;

    .line 674
    .line 675
    .line 676
    move-result-object v5

    .line 677
    iget-object v6, v1, Lv3/q0;->c:[Lz4/c0;

    .line 678
    .line 679
    aget-object v6, v6, v3

    .line 680
    .line 681
    if-eq v5, v6, :cond_25

    .line 682
    .line 683
    const/4 v5, 0x1

    .line 684
    goto :goto_16

    .line 685
    :cond_25
    const/4 v5, 0x0

    .line 686
    :goto_16
    invoke-virtual {v0, v3}, Lr5/p;->b(I)Z

    .line 687
    .line 688
    .line 689
    move-result v6

    .line 690
    if-eqz v6, :cond_26

    .line 691
    .line 692
    if-nez v5, :cond_26

    .line 693
    .line 694
    goto :goto_19

    .line 695
    :cond_26
    invoke-interface {v4}, Lv3/j1;->v()Z

    .line 696
    .line 697
    .line 698
    move-result v5

    .line 699
    if-nez v5, :cond_29

    .line 700
    .line 701
    iget-object v5, v0, Lr5/p;->c:[Lr5/h;

    .line 702
    .line 703
    aget-object v5, v5, v3

    .line 704
    .line 705
    if-eqz v5, :cond_27

    .line 706
    .line 707
    invoke-interface {v5}, Lr5/k;->length()I

    .line 708
    .line 709
    .line 710
    move-result v6

    .line 711
    goto :goto_17

    .line 712
    :cond_27
    const/4 v6, 0x0

    .line 713
    :goto_17
    new-array v7, v6, [Lv3/i0;

    .line 714
    .line 715
    const/4 v8, 0x0

    .line 716
    :goto_18
    if-ge v8, v6, :cond_28

    .line 717
    .line 718
    invoke-interface {v5, v8}, Lr5/k;->b(I)Lv3/i0;

    .line 719
    .line 720
    .line 721
    move-result-object v9

    .line 722
    aput-object v9, v7, v8

    .line 723
    .line 724
    add-int/lit8 v8, v8, 0x1

    .line 725
    .line 726
    goto :goto_18

    .line 727
    :cond_28
    iget-object v5, v1, Lv3/q0;->c:[Lz4/c0;

    .line 728
    .line 729
    aget-object v22, v5, v3

    .line 730
    .line 731
    invoke-virtual {v1}, Lv3/q0;->e()J

    .line 732
    .line 733
    .line 734
    move-result-wide v23

    .line 735
    iget-wide v5, v1, Lv3/q0;->o:J

    .line 736
    .line 737
    move-object/from16 v20, v4

    .line 738
    .line 739
    move-object/from16 v21, v7

    .line 740
    .line 741
    move-wide/from16 v25, v5

    .line 742
    .line 743
    invoke-interface/range {v20 .. v26}, Lv3/j1;->n([Lv3/i0;Lz4/c0;JJ)V

    .line 744
    .line 745
    .line 746
    goto :goto_19

    .line 747
    :cond_29
    invoke-interface {v4}, Lv3/j1;->d()Z

    .line 748
    .line 749
    .line 750
    move-result v5

    .line 751
    if-eqz v5, :cond_2a

    .line 752
    .line 753
    invoke-virtual {v10, v4}, Lv3/g0;->d(Lv3/j1;)V

    .line 754
    .line 755
    .line 756
    goto :goto_19

    .line 757
    :cond_2a
    const/4 v2, 0x1

    .line 758
    :goto_19
    add-int/lit8 v3, v3, 0x1

    .line 759
    .line 760
    goto :goto_15

    .line 761
    :cond_2b
    const/4 v3, 0x1

    .line 762
    xor-int/lit8 v0, v2, 0x1

    .line 763
    .line 764
    if-eqz v0, :cond_2c

    .line 765
    .line 766
    array-length v0, v4

    .line 767
    new-array v0, v0, [Z

    .line 768
    .line 769
    invoke-virtual {v10, v0}, Lv3/g0;->f([Z)V

    .line 770
    .line 771
    .line 772
    :cond_2c
    :goto_1a
    const/4 v3, 0x0

    .line 773
    :goto_1b
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->Y()Z

    .line 774
    .line 775
    .line 776
    move-result v0

    .line 777
    if-nez v0, :cond_2d

    .line 778
    .line 779
    goto :goto_1c

    .line 780
    :cond_2d
    iget-boolean v0, v10, Lv3/g0;->J:Z

    .line 781
    .line 782
    if-eqz v0, :cond_2e

    .line 783
    .line 784
    goto :goto_1c

    .line 785
    :cond_2e
    iget-object v0, v10, Lv3/g0;->A:Lv3/s0;

    .line 786
    .line 787
    iget-object v0, v0, Lv3/s0;->h:Lv3/q0;

    .line 788
    .line 789
    if-nez v0, :cond_2f

    .line 790
    .line 791
    goto :goto_1c

    .line 792
    :cond_2f
    iget-object v0, v0, Lv3/q0;->l:Lv3/q0;

    .line 793
    .line 794
    if-eqz v0, :cond_30

    .line 795
    .line 796
    iget-wide v1, v10, Lv3/g0;->T:J

    .line 797
    .line 798
    invoke-virtual {v0}, Lv3/q0;->e()J

    .line 799
    .line 800
    .line 801
    move-result-wide v4

    .line 802
    cmp-long v1, v1, v4

    .line 803
    .line 804
    if-ltz v1, :cond_30

    .line 805
    .line 806
    iget-boolean v0, v0, Lv3/q0;->g:Z

    .line 807
    .line 808
    if-eqz v0, :cond_30

    .line 809
    .line 810
    const/4 v0, 0x1

    .line 811
    goto :goto_1d

    .line 812
    :cond_30
    :goto_1c
    const/4 v0, 0x0

    .line 813
    :goto_1d
    if-eqz v0, :cond_33

    .line 814
    .line 815
    if-eqz v3, :cond_31

    .line 816
    .line 817
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->u()V

    .line 818
    .line 819
    .line 820
    :cond_31
    iget-object v0, v10, Lv3/g0;->A:Lv3/s0;

    .line 821
    .line 822
    invoke-virtual {v0}, Lv3/s0;->a()Lv3/q0;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 827
    .line 828
    .line 829
    iget-object v1, v10, Lv3/g0;->F:Lv3/d1;

    .line 830
    .line 831
    iget-object v1, v1, Lv3/d1;->b:Lz4/t$b;

    .line 832
    .line 833
    iget-object v1, v1, Lz4/s;->a:Ljava/lang/Object;

    .line 834
    .line 835
    iget-object v2, v0, Lv3/q0;->f:Lv3/r0;

    .line 836
    .line 837
    iget-object v2, v2, Lv3/r0;->a:Lz4/t$b;

    .line 838
    .line 839
    iget-object v2, v2, Lz4/s;->a:Ljava/lang/Object;

    .line 840
    .line 841
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 842
    .line 843
    .line 844
    move-result v1

    .line 845
    if-eqz v1, :cond_32

    .line 846
    .line 847
    iget-object v1, v10, Lv3/g0;->F:Lv3/d1;

    .line 848
    .line 849
    iget-object v1, v1, Lv3/d1;->b:Lz4/t$b;

    .line 850
    .line 851
    iget v2, v1, Lz4/s;->b:I

    .line 852
    .line 853
    const/4 v3, -0x1

    .line 854
    if-ne v2, v3, :cond_32

    .line 855
    .line 856
    iget-object v2, v0, Lv3/q0;->f:Lv3/r0;

    .line 857
    .line 858
    iget-object v2, v2, Lv3/r0;->a:Lz4/t$b;

    .line 859
    .line 860
    iget v4, v2, Lz4/s;->b:I

    .line 861
    .line 862
    if-ne v4, v3, :cond_32

    .line 863
    .line 864
    iget v1, v1, Lz4/s;->e:I

    .line 865
    .line 866
    iget v2, v2, Lz4/s;->e:I

    .line 867
    .line 868
    if-eq v1, v2, :cond_32

    .line 869
    .line 870
    const/4 v3, 0x1

    .line 871
    goto :goto_1e

    .line 872
    :cond_32
    const/4 v3, 0x0

    .line 873
    :goto_1e
    iget-object v0, v0, Lv3/q0;->f:Lv3/r0;

    .line 874
    .line 875
    iget-object v1, v0, Lv3/r0;->a:Lz4/t$b;

    .line 876
    .line 877
    iget-wide v6, v0, Lv3/r0;->b:J

    .line 878
    .line 879
    iget-wide v4, v0, Lv3/r0;->c:J

    .line 880
    .line 881
    const/4 v9, 0x1

    .line 882
    xor-int/lit8 v8, v3, 0x1

    .line 883
    .line 884
    const/4 v14, 0x0

    .line 885
    move-object/from16 v0, p0

    .line 886
    .line 887
    move-wide v2, v6

    .line 888
    const/4 v15, 0x0

    .line 889
    move v13, v9

    .line 890
    move v9, v14

    .line 891
    invoke-virtual/range {v0 .. v9}, Lv3/g0;->p(Lz4/t$b;JJJZI)Lv3/d1;

    .line 892
    .line 893
    .line 894
    move-result-object v0

    .line 895
    iput-object v0, v10, Lv3/g0;->F:Lv3/d1;

    .line 896
    .line 897
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->C()V

    .line 898
    .line 899
    .line 900
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->e0()V

    .line 901
    .line 902
    .line 903
    move v3, v13

    .line 904
    const/4 v13, 0x2

    .line 905
    const-wide/high16 v15, -0x8000000000000000L

    .line 906
    .line 907
    goto/16 :goto_1b

    .line 908
    .line 909
    :cond_33
    :goto_1f
    const/4 v13, 0x1

    .line 910
    const/4 v15, 0x0

    .line 911
    iget-object v0, v10, Lv3/g0;->F:Lv3/d1;

    .line 912
    .line 913
    iget v0, v0, Lv3/d1;->e:I

    .line 914
    .line 915
    if-eq v0, v13, :cond_64

    .line 916
    .line 917
    const/4 v1, 0x4

    .line 918
    if-ne v0, v1, :cond_34

    .line 919
    .line 920
    goto/16 :goto_3f

    .line 921
    .line 922
    :cond_34
    iget-object v0, v10, Lv3/g0;->A:Lv3/s0;

    .line 923
    .line 924
    iget-object v0, v0, Lv3/s0;->h:Lv3/q0;

    .line 925
    .line 926
    const-wide/16 v2, 0xa

    .line 927
    .line 928
    if-nez v0, :cond_35

    .line 929
    .line 930
    invoke-virtual {v10, v11, v12, v2, v3}, Lv3/g0;->H(JJ)V

    .line 931
    .line 932
    .line 933
    return-void

    .line 934
    :cond_35
    const-string v4, "doSomeWork"

    .line 935
    .line 936
    invoke-static {v4}, Lp2/m0;->i(Ljava/lang/String;)V

    .line 937
    .line 938
    .line 939
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->e0()V

    .line 940
    .line 941
    .line 942
    iget-boolean v4, v0, Lv3/q0;->d:Z

    .line 943
    .line 944
    const-wide/16 v5, 0x3e8

    .line 945
    .line 946
    if-eqz v4, :cond_3e

    .line 947
    .line 948
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 949
    .line 950
    .line 951
    move-result-wide v7

    .line 952
    mul-long/2addr v7, v5

    .line 953
    iget-object v4, v0, Lv3/q0;->a:Lz4/r;

    .line 954
    .line 955
    iget-object v9, v10, Lv3/g0;->F:Lv3/d1;

    .line 956
    .line 957
    iget-wide v2, v9, Lv3/d1;->r:J

    .line 958
    .line 959
    iget-wide v5, v10, Lv3/g0;->u:J

    .line 960
    .line 961
    sub-long/2addr v2, v5

    .line 962
    iget-boolean v5, v10, Lv3/g0;->v:Z

    .line 963
    .line 964
    invoke-interface {v4, v2, v3, v5}, Lz4/r;->s(JZ)V

    .line 965
    .line 966
    .line 967
    move v3, v13

    .line 968
    move v9, v3

    .line 969
    move v2, v15

    .line 970
    :goto_20
    iget-object v4, v10, Lv3/g0;->a:[Lv3/j1;

    .line 971
    .line 972
    array-length v5, v4

    .line 973
    if-ge v2, v5, :cond_3f

    .line 974
    .line 975
    aget-object v4, v4, v2

    .line 976
    .line 977
    invoke-static {v4}, Lv3/g0;->r(Lv3/j1;)Z

    .line 978
    .line 979
    .line 980
    move-result v5

    .line 981
    if-nez v5, :cond_36

    .line 982
    .line 983
    goto :goto_27

    .line 984
    :cond_36
    iget-wide v5, v10, Lv3/g0;->T:J

    .line 985
    .line 986
    invoke-interface {v4, v5, v6, v7, v8}, Lv3/j1;->p(JJ)V

    .line 987
    .line 988
    .line 989
    if-eqz v9, :cond_37

    .line 990
    .line 991
    invoke-interface {v4}, Lv3/j1;->d()Z

    .line 992
    .line 993
    .line 994
    move-result v5

    .line 995
    if-eqz v5, :cond_37

    .line 996
    .line 997
    move v9, v13

    .line 998
    goto :goto_21

    .line 999
    :cond_37
    move v9, v15

    .line 1000
    :goto_21
    iget-object v5, v0, Lv3/q0;->c:[Lz4/c0;

    .line 1001
    .line 1002
    aget-object v5, v5, v2

    .line 1003
    .line 1004
    invoke-interface {v4}, Lv3/j1;->r()Lz4/c0;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v6

    .line 1008
    if-eq v5, v6, :cond_38

    .line 1009
    .line 1010
    move v5, v13

    .line 1011
    goto :goto_22

    .line 1012
    :cond_38
    move v5, v15

    .line 1013
    :goto_22
    if-nez v5, :cond_39

    .line 1014
    .line 1015
    invoke-interface {v4}, Lv3/j1;->h()Z

    .line 1016
    .line 1017
    .line 1018
    move-result v6

    .line 1019
    if-eqz v6, :cond_39

    .line 1020
    .line 1021
    move v6, v13

    .line 1022
    goto :goto_23

    .line 1023
    :cond_39
    move v6, v15

    .line 1024
    :goto_23
    if-nez v5, :cond_3b

    .line 1025
    .line 1026
    if-nez v6, :cond_3b

    .line 1027
    .line 1028
    invoke-interface {v4}, Lv3/j1;->b()Z

    .line 1029
    .line 1030
    .line 1031
    move-result v5

    .line 1032
    if-nez v5, :cond_3b

    .line 1033
    .line 1034
    invoke-interface {v4}, Lv3/j1;->d()Z

    .line 1035
    .line 1036
    .line 1037
    move-result v5

    .line 1038
    if-eqz v5, :cond_3a

    .line 1039
    .line 1040
    goto :goto_24

    .line 1041
    :cond_3a
    move v5, v15

    .line 1042
    goto :goto_25

    .line 1043
    :cond_3b
    :goto_24
    move v5, v13

    .line 1044
    :goto_25
    if-eqz v3, :cond_3c

    .line 1045
    .line 1046
    if-eqz v5, :cond_3c

    .line 1047
    .line 1048
    move v3, v13

    .line 1049
    goto :goto_26

    .line 1050
    :cond_3c
    move v3, v15

    .line 1051
    :goto_26
    if-nez v5, :cond_3d

    .line 1052
    .line 1053
    invoke-interface {v4}, Lv3/j1;->s()V

    .line 1054
    .line 1055
    .line 1056
    :cond_3d
    :goto_27
    add-int/lit8 v2, v2, 0x1

    .line 1057
    .line 1058
    goto :goto_20

    .line 1059
    :cond_3e
    iget-object v2, v0, Lv3/q0;->a:Lz4/r;

    .line 1060
    .line 1061
    invoke-interface {v2}, Lz4/r;->j()V

    .line 1062
    .line 1063
    .line 1064
    move v3, v13

    .line 1065
    move v9, v3

    .line 1066
    :cond_3f
    iget-object v2, v0, Lv3/q0;->f:Lv3/r0;

    .line 1067
    .line 1068
    iget-wide v4, v2, Lv3/r0;->e:J

    .line 1069
    .line 1070
    if-eqz v9, :cond_41

    .line 1071
    .line 1072
    iget-boolean v2, v0, Lv3/q0;->d:Z

    .line 1073
    .line 1074
    if-eqz v2, :cond_41

    .line 1075
    .line 1076
    cmp-long v2, v4, v17

    .line 1077
    .line 1078
    if-eqz v2, :cond_40

    .line 1079
    .line 1080
    iget-object v2, v10, Lv3/g0;->F:Lv3/d1;

    .line 1081
    .line 1082
    iget-wide v6, v2, Lv3/d1;->r:J

    .line 1083
    .line 1084
    cmp-long v2, v4, v6

    .line 1085
    .line 1086
    if-gtz v2, :cond_41

    .line 1087
    .line 1088
    :cond_40
    move v9, v13

    .line 1089
    goto :goto_28

    .line 1090
    :cond_41
    move v9, v15

    .line 1091
    :goto_28
    if-eqz v9, :cond_42

    .line 1092
    .line 1093
    iget-boolean v2, v10, Lv3/g0;->J:Z

    .line 1094
    .line 1095
    if-eqz v2, :cond_42

    .line 1096
    .line 1097
    iput-boolean v15, v10, Lv3/g0;->J:Z

    .line 1098
    .line 1099
    iget-object v2, v10, Lv3/g0;->F:Lv3/d1;

    .line 1100
    .line 1101
    iget v2, v2, Lv3/d1;->m:I

    .line 1102
    .line 1103
    const/4 v4, 0x5

    .line 1104
    invoke-virtual {v10, v2, v4, v15, v15}, Lv3/g0;->S(IIZZ)V

    .line 1105
    .line 1106
    .line 1107
    :cond_42
    if-eqz v9, :cond_43

    .line 1108
    .line 1109
    iget-object v4, v0, Lv3/q0;->f:Lv3/r0;

    .line 1110
    .line 1111
    iget-boolean v4, v4, Lv3/r0;->i:Z

    .line 1112
    .line 1113
    if-eqz v4, :cond_43

    .line 1114
    .line 1115
    invoke-virtual {v10, v1}, Lv3/g0;->X(I)V

    .line 1116
    .line 1117
    .line 1118
    goto/16 :goto_33

    .line 1119
    .line 1120
    :cond_43
    iget-object v4, v10, Lv3/g0;->F:Lv3/d1;

    .line 1121
    .line 1122
    iget v5, v4, Lv3/d1;->e:I

    .line 1123
    .line 1124
    const/4 v6, 0x2

    .line 1125
    if-ne v5, v6, :cond_4f

    .line 1126
    .line 1127
    iget v5, v10, Lv3/g0;->R:I

    .line 1128
    .line 1129
    if-nez v5, :cond_44

    .line 1130
    .line 1131
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->s()Z

    .line 1132
    .line 1133
    .line 1134
    move-result v9

    .line 1135
    goto/16 :goto_30

    .line 1136
    .line 1137
    :cond_44
    if-nez v3, :cond_45

    .line 1138
    .line 1139
    goto/16 :goto_2e

    .line 1140
    .line 1141
    :cond_45
    iget-boolean v5, v4, Lv3/d1;->g:Z

    .line 1142
    .line 1143
    if-nez v5, :cond_46

    .line 1144
    .line 1145
    goto/16 :goto_2f

    .line 1146
    .line 1147
    :cond_46
    iget-object v4, v4, Lv3/d1;->a:Lv3/r1;

    .line 1148
    .line 1149
    iget-object v5, v10, Lv3/g0;->A:Lv3/s0;

    .line 1150
    .line 1151
    iget-object v5, v5, Lv3/s0;->h:Lv3/q0;

    .line 1152
    .line 1153
    iget-object v5, v5, Lv3/q0;->f:Lv3/r0;

    .line 1154
    .line 1155
    iget-object v5, v5, Lv3/r0;->a:Lz4/t$b;

    .line 1156
    .line 1157
    invoke-virtual {v10, v4, v5}, Lv3/g0;->Z(Lv3/r1;Lz4/t$b;)Z

    .line 1158
    .line 1159
    .line 1160
    move-result v4

    .line 1161
    if-eqz v4, :cond_47

    .line 1162
    .line 1163
    iget-object v4, v10, Lv3/g0;->C:Lv3/m0;

    .line 1164
    .line 1165
    invoke-interface {v4}, Lv3/m0;->b()J

    .line 1166
    .line 1167
    .line 1168
    move-result-wide v4

    .line 1169
    move-wide/from16 v31, v4

    .line 1170
    .line 1171
    goto :goto_29

    .line 1172
    :cond_47
    move-wide/from16 v31, v17

    .line 1173
    .line 1174
    :goto_29
    iget-object v4, v10, Lv3/g0;->A:Lv3/s0;

    .line 1175
    .line 1176
    iget-object v4, v4, Lv3/s0;->j:Lv3/q0;

    .line 1177
    .line 1178
    iget-boolean v5, v4, Lv3/q0;->d:Z

    .line 1179
    .line 1180
    if-eqz v5, :cond_49

    .line 1181
    .line 1182
    iget-boolean v5, v4, Lv3/q0;->e:Z

    .line 1183
    .line 1184
    if-eqz v5, :cond_48

    .line 1185
    .line 1186
    iget-object v5, v4, Lv3/q0;->a:Lz4/r;

    .line 1187
    .line 1188
    invoke-interface {v5}, Lz4/r;->g()J

    .line 1189
    .line 1190
    .line 1191
    move-result-wide v5

    .line 1192
    const-wide/high16 v7, -0x8000000000000000L

    .line 1193
    .line 1194
    cmp-long v5, v5, v7

    .line 1195
    .line 1196
    if-nez v5, :cond_49

    .line 1197
    .line 1198
    :cond_48
    move v9, v13

    .line 1199
    goto :goto_2a

    .line 1200
    :cond_49
    move v9, v15

    .line 1201
    :goto_2a
    if-eqz v9, :cond_4a

    .line 1202
    .line 1203
    iget-object v5, v4, Lv3/q0;->f:Lv3/r0;

    .line 1204
    .line 1205
    iget-boolean v5, v5, Lv3/r0;->i:Z

    .line 1206
    .line 1207
    if-eqz v5, :cond_4a

    .line 1208
    .line 1209
    move v9, v13

    .line 1210
    goto :goto_2b

    .line 1211
    :cond_4a
    move v9, v15

    .line 1212
    :goto_2b
    iget-object v5, v4, Lv3/q0;->f:Lv3/r0;

    .line 1213
    .line 1214
    iget-object v5, v5, Lv3/r0;->a:Lz4/t$b;

    .line 1215
    .line 1216
    invoke-virtual {v5}, Lz4/s;->a()Z

    .line 1217
    .line 1218
    .line 1219
    move-result v5

    .line 1220
    if-eqz v5, :cond_4b

    .line 1221
    .line 1222
    iget-boolean v4, v4, Lv3/q0;->d:Z

    .line 1223
    .line 1224
    if-nez v4, :cond_4b

    .line 1225
    .line 1226
    move v4, v13

    .line 1227
    goto :goto_2c

    .line 1228
    :cond_4b
    move v4, v15

    .line 1229
    :goto_2c
    if-nez v9, :cond_4e

    .line 1230
    .line 1231
    if-nez v4, :cond_4e

    .line 1232
    .line 1233
    iget-object v4, v10, Lv3/g0;->f:Lv3/n0;

    .line 1234
    .line 1235
    iget-object v5, v10, Lv3/g0;->F:Lv3/d1;

    .line 1236
    .line 1237
    iget-wide v5, v5, Lv3/d1;->p:J

    .line 1238
    .line 1239
    iget-object v7, v10, Lv3/g0;->A:Lv3/s0;

    .line 1240
    .line 1241
    iget-object v7, v7, Lv3/s0;->j:Lv3/q0;

    .line 1242
    .line 1243
    const-wide/16 v8, 0x0

    .line 1244
    .line 1245
    if-nez v7, :cond_4c

    .line 1246
    .line 1247
    move-wide/from16 v27, v8

    .line 1248
    .line 1249
    goto :goto_2d

    .line 1250
    :cond_4c
    iget-wide v13, v10, Lv3/g0;->T:J

    .line 1251
    .line 1252
    iget-wide v1, v7, Lv3/q0;->o:J

    .line 1253
    .line 1254
    sub-long/2addr v13, v1

    .line 1255
    sub-long/2addr v5, v13

    .line 1256
    invoke-static {v8, v9, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 1257
    .line 1258
    .line 1259
    move-result-wide v1

    .line 1260
    move-wide/from16 v27, v1

    .line 1261
    .line 1262
    :goto_2d
    iget-object v1, v10, Lv3/g0;->w:Lv3/k;

    .line 1263
    .line 1264
    invoke-virtual {v1}, Lv3/k;->f()Lv3/e1;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v1

    .line 1268
    iget v1, v1, Lv3/e1;->a:F

    .line 1269
    .line 1270
    iget-boolean v2, v10, Lv3/g0;->K:Z

    .line 1271
    .line 1272
    move-object/from16 v26, v4

    .line 1273
    .line 1274
    move/from16 v29, v1

    .line 1275
    .line 1276
    move/from16 v30, v2

    .line 1277
    .line 1278
    invoke-interface/range {v26 .. v32}, Lv3/n0;->g(JFZJ)Z

    .line 1279
    .line 1280
    .line 1281
    move-result v1

    .line 1282
    if-eqz v1, :cond_4d

    .line 1283
    .line 1284
    goto :goto_2f

    .line 1285
    :cond_4d
    :goto_2e
    move v9, v15

    .line 1286
    goto :goto_30

    .line 1287
    :cond_4e
    :goto_2f
    const/4 v9, 0x1

    .line 1288
    :goto_30
    if-eqz v9, :cond_4f

    .line 1289
    .line 1290
    const/4 v1, 0x3

    .line 1291
    invoke-virtual {v10, v1}, Lv3/g0;->X(I)V

    .line 1292
    .line 1293
    .line 1294
    const/4 v2, 0x0

    .line 1295
    iput-object v2, v10, Lv3/g0;->W:Lv3/n;

    .line 1296
    .line 1297
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->Y()Z

    .line 1298
    .line 1299
    .line 1300
    move-result v2

    .line 1301
    if-eqz v2, :cond_56

    .line 1302
    .line 1303
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->a0()V

    .line 1304
    .line 1305
    .line 1306
    goto :goto_34

    .line 1307
    :cond_4f
    const/4 v1, 0x3

    .line 1308
    iget-object v2, v10, Lv3/g0;->F:Lv3/d1;

    .line 1309
    .line 1310
    iget v2, v2, Lv3/d1;->e:I

    .line 1311
    .line 1312
    if-ne v2, v1, :cond_56

    .line 1313
    .line 1314
    iget v1, v10, Lv3/g0;->R:I

    .line 1315
    .line 1316
    if-nez v1, :cond_50

    .line 1317
    .line 1318
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->s()Z

    .line 1319
    .line 1320
    .line 1321
    move-result v1

    .line 1322
    if-eqz v1, :cond_51

    .line 1323
    .line 1324
    goto :goto_34

    .line 1325
    :cond_50
    if-nez v3, :cond_56

    .line 1326
    .line 1327
    :cond_51
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->Y()Z

    .line 1328
    .line 1329
    .line 1330
    move-result v1

    .line 1331
    iput-boolean v1, v10, Lv3/g0;->K:Z

    .line 1332
    .line 1333
    const/4 v1, 0x2

    .line 1334
    invoke-virtual {v10, v1}, Lv3/g0;->X(I)V

    .line 1335
    .line 1336
    .line 1337
    iget-boolean v1, v10, Lv3/g0;->K:Z

    .line 1338
    .line 1339
    if-eqz v1, :cond_55

    .line 1340
    .line 1341
    iget-object v1, v10, Lv3/g0;->A:Lv3/s0;

    .line 1342
    .line 1343
    iget-object v1, v1, Lv3/s0;->h:Lv3/q0;

    .line 1344
    .line 1345
    :goto_31
    if-eqz v1, :cond_54

    .line 1346
    .line 1347
    iget-object v2, v1, Lv3/q0;->n:Lr5/p;

    .line 1348
    .line 1349
    iget-object v2, v2, Lr5/p;->c:[Lr5/h;

    .line 1350
    .line 1351
    array-length v3, v2

    .line 1352
    move v8, v15

    .line 1353
    :goto_32
    if-ge v8, v3, :cond_53

    .line 1354
    .line 1355
    aget-object v4, v2, v8

    .line 1356
    .line 1357
    if-eqz v4, :cond_52

    .line 1358
    .line 1359
    invoke-interface {v4}, Lr5/h;->u()V

    .line 1360
    .line 1361
    .line 1362
    :cond_52
    add-int/lit8 v8, v8, 0x1

    .line 1363
    .line 1364
    goto :goto_32

    .line 1365
    :cond_53
    iget-object v1, v1, Lv3/q0;->l:Lv3/q0;

    .line 1366
    .line 1367
    goto :goto_31

    .line 1368
    :cond_54
    iget-object v1, v10, Lv3/g0;->C:Lv3/m0;

    .line 1369
    .line 1370
    invoke-interface {v1}, Lv3/m0;->c()V

    .line 1371
    .line 1372
    .line 1373
    :cond_55
    :goto_33
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->c0()V

    .line 1374
    .line 1375
    .line 1376
    :cond_56
    :goto_34
    iget-object v1, v10, Lv3/g0;->F:Lv3/d1;

    .line 1377
    .line 1378
    iget v1, v1, Lv3/d1;->e:I

    .line 1379
    .line 1380
    const/4 v2, 0x2

    .line 1381
    if-ne v1, v2, :cond_59

    .line 1382
    .line 1383
    move v8, v15

    .line 1384
    :goto_35
    iget-object v1, v10, Lv3/g0;->a:[Lv3/j1;

    .line 1385
    .line 1386
    array-length v2, v1

    .line 1387
    if-ge v8, v2, :cond_58

    .line 1388
    .line 1389
    aget-object v1, v1, v8

    .line 1390
    .line 1391
    invoke-static {v1}, Lv3/g0;->r(Lv3/j1;)Z

    .line 1392
    .line 1393
    .line 1394
    move-result v1

    .line 1395
    if-eqz v1, :cond_57

    .line 1396
    .line 1397
    iget-object v1, v10, Lv3/g0;->a:[Lv3/j1;

    .line 1398
    .line 1399
    aget-object v1, v1, v8

    .line 1400
    .line 1401
    invoke-interface {v1}, Lv3/j1;->r()Lz4/c0;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v1

    .line 1405
    iget-object v2, v0, Lv3/q0;->c:[Lz4/c0;

    .line 1406
    .line 1407
    aget-object v2, v2, v8

    .line 1408
    .line 1409
    if-ne v1, v2, :cond_57

    .line 1410
    .line 1411
    iget-object v1, v10, Lv3/g0;->a:[Lv3/j1;

    .line 1412
    .line 1413
    aget-object v1, v1, v8

    .line 1414
    .line 1415
    invoke-interface {v1}, Lv3/j1;->s()V

    .line 1416
    .line 1417
    .line 1418
    :cond_57
    add-int/lit8 v8, v8, 0x1

    .line 1419
    .line 1420
    goto :goto_35

    .line 1421
    :cond_58
    iget-object v0, v10, Lv3/g0;->F:Lv3/d1;

    .line 1422
    .line 1423
    iget-boolean v1, v0, Lv3/d1;->g:Z

    .line 1424
    .line 1425
    if-nez v1, :cond_59

    .line 1426
    .line 1427
    iget-wide v0, v0, Lv3/d1;->q:J

    .line 1428
    .line 1429
    const-wide/32 v2, 0x7a120

    .line 1430
    .line 1431
    .line 1432
    cmp-long v0, v0, v2

    .line 1433
    .line 1434
    if-gez v0, :cond_59

    .line 1435
    .line 1436
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->q()Z

    .line 1437
    .line 1438
    .line 1439
    move-result v0

    .line 1440
    if-eqz v0, :cond_59

    .line 1441
    .line 1442
    const/4 v9, 0x1

    .line 1443
    goto :goto_36

    .line 1444
    :cond_59
    move v9, v15

    .line 1445
    :goto_36
    if-nez v9, :cond_5a

    .line 1446
    .line 1447
    :goto_37
    move-wide/from16 v0, v17

    .line 1448
    .line 1449
    goto :goto_38

    .line 1450
    :cond_5a
    iget-wide v0, v10, Lv3/g0;->X:J

    .line 1451
    .line 1452
    cmp-long v0, v0, v17

    .line 1453
    .line 1454
    if-nez v0, :cond_5b

    .line 1455
    .line 1456
    iget-object v0, v10, Lv3/g0;->y:Lv5/c;

    .line 1457
    .line 1458
    invoke-interface {v0}, Lv5/c;->d()J

    .line 1459
    .line 1460
    .line 1461
    move-result-wide v17

    .line 1462
    goto :goto_37

    .line 1463
    :goto_38
    iput-wide v0, v10, Lv3/g0;->X:J

    .line 1464
    .line 1465
    goto :goto_39

    .line 1466
    :cond_5b
    iget-object v0, v10, Lv3/g0;->y:Lv5/c;

    .line 1467
    .line 1468
    invoke-interface {v0}, Lv5/c;->d()J

    .line 1469
    .line 1470
    .line 1471
    move-result-wide v0

    .line 1472
    iget-wide v2, v10, Lv3/g0;->X:J

    .line 1473
    .line 1474
    sub-long/2addr v0, v2

    .line 1475
    const-wide/16 v2, 0xfa0

    .line 1476
    .line 1477
    cmp-long v0, v0, v2

    .line 1478
    .line 1479
    if-gez v0, :cond_63

    .line 1480
    .line 1481
    :goto_39
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->Y()Z

    .line 1482
    .line 1483
    .line 1484
    move-result v0

    .line 1485
    if-eqz v0, :cond_5c

    .line 1486
    .line 1487
    iget-object v0, v10, Lv3/g0;->F:Lv3/d1;

    .line 1488
    .line 1489
    iget v0, v0, Lv3/d1;->e:I

    .line 1490
    .line 1491
    const/4 v1, 0x3

    .line 1492
    if-ne v0, v1, :cond_5c

    .line 1493
    .line 1494
    const/4 v9, 0x1

    .line 1495
    goto :goto_3a

    .line 1496
    :cond_5c
    move v9, v15

    .line 1497
    :goto_3a
    iget-boolean v0, v10, Lv3/g0;->Q:Z

    .line 1498
    .line 1499
    if-eqz v0, :cond_5d

    .line 1500
    .line 1501
    iget-boolean v0, v10, Lv3/g0;->P:Z

    .line 1502
    .line 1503
    if-eqz v0, :cond_5d

    .line 1504
    .line 1505
    if-eqz v9, :cond_5d

    .line 1506
    .line 1507
    const/4 v0, 0x1

    .line 1508
    goto :goto_3b

    .line 1509
    :cond_5d
    move v0, v15

    .line 1510
    :goto_3b
    iget-object v1, v10, Lv3/g0;->F:Lv3/d1;

    .line 1511
    .line 1512
    iget-boolean v2, v1, Lv3/d1;->o:Z

    .line 1513
    .line 1514
    if-eq v2, v0, :cond_5e

    .line 1515
    .line 1516
    new-instance v2, Lv3/d1;

    .line 1517
    .line 1518
    move-object/from16 v33, v2

    .line 1519
    .line 1520
    iget-object v3, v1, Lv3/d1;->a:Lv3/r1;

    .line 1521
    .line 1522
    move-object/from16 v34, v3

    .line 1523
    .line 1524
    iget-object v3, v1, Lv3/d1;->b:Lz4/t$b;

    .line 1525
    .line 1526
    move-object/from16 v35, v3

    .line 1527
    .line 1528
    iget-wide v3, v1, Lv3/d1;->c:J

    .line 1529
    .line 1530
    move-wide/from16 v36, v3

    .line 1531
    .line 1532
    iget-wide v3, v1, Lv3/d1;->d:J

    .line 1533
    .line 1534
    move-wide/from16 v38, v3

    .line 1535
    .line 1536
    iget v3, v1, Lv3/d1;->e:I

    .line 1537
    .line 1538
    move/from16 v40, v3

    .line 1539
    .line 1540
    iget-object v3, v1, Lv3/d1;->f:Lv3/n;

    .line 1541
    .line 1542
    move-object/from16 v41, v3

    .line 1543
    .line 1544
    iget-boolean v3, v1, Lv3/d1;->g:Z

    .line 1545
    .line 1546
    move/from16 v42, v3

    .line 1547
    .line 1548
    iget-object v3, v1, Lv3/d1;->h:Lz4/j0;

    .line 1549
    .line 1550
    move-object/from16 v43, v3

    .line 1551
    .line 1552
    iget-object v3, v1, Lv3/d1;->i:Lr5/p;

    .line 1553
    .line 1554
    move-object/from16 v44, v3

    .line 1555
    .line 1556
    iget-object v3, v1, Lv3/d1;->j:Ljava/util/List;

    .line 1557
    .line 1558
    move-object/from16 v45, v3

    .line 1559
    .line 1560
    iget-object v3, v1, Lv3/d1;->k:Lz4/t$b;

    .line 1561
    .line 1562
    move-object/from16 v46, v3

    .line 1563
    .line 1564
    iget-boolean v3, v1, Lv3/d1;->l:Z

    .line 1565
    .line 1566
    move/from16 v47, v3

    .line 1567
    .line 1568
    iget v3, v1, Lv3/d1;->m:I

    .line 1569
    .line 1570
    move/from16 v48, v3

    .line 1571
    .line 1572
    iget-object v3, v1, Lv3/d1;->n:Lv3/e1;

    .line 1573
    .line 1574
    move-object/from16 v49, v3

    .line 1575
    .line 1576
    iget-wide v3, v1, Lv3/d1;->p:J

    .line 1577
    .line 1578
    move-wide/from16 v50, v3

    .line 1579
    .line 1580
    iget-wide v3, v1, Lv3/d1;->q:J

    .line 1581
    .line 1582
    move-wide/from16 v52, v3

    .line 1583
    .line 1584
    iget-wide v3, v1, Lv3/d1;->r:J

    .line 1585
    .line 1586
    move-wide/from16 v54, v3

    .line 1587
    .line 1588
    move/from16 v56, v0

    .line 1589
    .line 1590
    invoke-direct/range {v33 .. v56}, Lv3/d1;-><init>(Lv3/r1;Lz4/t$b;JJILv3/n;ZLz4/j0;Lr5/p;Ljava/util/List;Lz4/t$b;ZILv3/e1;JJJZ)V

    .line 1591
    .line 1592
    .line 1593
    iput-object v2, v10, Lv3/g0;->F:Lv3/d1;

    .line 1594
    .line 1595
    :cond_5e
    iput-boolean v15, v10, Lv3/g0;->P:Z

    .line 1596
    .line 1597
    if-nez v0, :cond_62

    .line 1598
    .line 1599
    iget-object v0, v10, Lv3/g0;->F:Lv3/d1;

    .line 1600
    .line 1601
    iget v0, v0, Lv3/d1;->e:I

    .line 1602
    .line 1603
    const/4 v1, 0x4

    .line 1604
    if-ne v0, v1, :cond_5f

    .line 1605
    .line 1606
    goto :goto_3e

    .line 1607
    :cond_5f
    if-nez v9, :cond_61

    .line 1608
    .line 1609
    const/4 v1, 0x2

    .line 1610
    if-ne v0, v1, :cond_60

    .line 1611
    .line 1612
    goto :goto_3c

    .line 1613
    :cond_60
    const/4 v1, 0x3

    .line 1614
    if-ne v0, v1, :cond_62

    .line 1615
    .line 1616
    iget v0, v10, Lv3/g0;->R:I

    .line 1617
    .line 1618
    if-eqz v0, :cond_62

    .line 1619
    .line 1620
    const-wide/16 v2, 0x3e8

    .line 1621
    .line 1622
    goto :goto_3d

    .line 1623
    :cond_61
    :goto_3c
    const-wide/16 v2, 0xa

    .line 1624
    .line 1625
    :goto_3d
    invoke-virtual {v10, v11, v12, v2, v3}, Lv3/g0;->H(JJ)V

    .line 1626
    .line 1627
    .line 1628
    :cond_62
    :goto_3e
    invoke-static {}, Lp2/m0;->B()V

    .line 1629
    .line 1630
    .line 1631
    return-void

    .line 1632
    :cond_63
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1633
    .line 1634
    const-string v1, "Playback stuck buffering and not loading"

    .line 1635
    .line 1636
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1637
    .line 1638
    .line 1639
    throw v0

    .line 1640
    :cond_64
    :goto_3f
    return-void
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
.end method

.method public final e0()V
    .locals 13

    .line 1
    iget-object v0, p0, Lv3/g0;->A:Lv3/s0;

    .line 2
    .line 3
    iget-object v0, v0, Lv3/s0;->h:Lv3/q0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-boolean v1, v0, Lv3/q0;->d:Z

    .line 9
    .line 10
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-object v1, v0, Lv3/q0;->a:Lz4/r;

    .line 18
    .line 19
    invoke-interface {v1}, Lz4/r;->o()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    move-wide v6, v4

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move-wide v6, v2

    .line 26
    :goto_0
    cmp-long v1, v6, v2

    .line 27
    .line 28
    const/16 v2, 0x10

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-virtual {p0, v6, v7}, Lv3/g0;->D(J)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lv3/g0;->F:Lv3/d1;

    .line 37
    .line 38
    iget-wide v0, v0, Lv3/d1;->r:J

    .line 39
    .line 40
    cmp-long v0, v6, v0

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    iget-object v0, p0, Lv3/g0;->F:Lv3/d1;

    .line 45
    .line 46
    iget-object v1, v0, Lv3/d1;->b:Lz4/t$b;

    .line 47
    .line 48
    iget-wide v4, v0, Lv3/d1;->c:J

    .line 49
    .line 50
    const/4 v8, 0x1

    .line 51
    const/4 v9, 0x5

    .line 52
    move-object v0, p0

    .line 53
    move-wide v2, v6

    .line 54
    invoke-virtual/range {v0 .. v9}, Lv3/g0;->p(Lz4/t$b;JJJZI)Lv3/d1;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Lv3/g0;->F:Lv3/d1;

    .line 59
    .line 60
    :cond_2
    move-object v9, p0

    .line 61
    move-object v10, v9

    .line 62
    goto/16 :goto_a

    .line 63
    .line 64
    :cond_3
    iget-object v1, p0, Lv3/g0;->w:Lv3/k;

    .line 65
    .line 66
    iget-object v4, p0, Lv3/g0;->A:Lv3/s0;

    .line 67
    .line 68
    iget-object v4, v4, Lv3/s0;->i:Lv3/q0;

    .line 69
    .line 70
    const/4 v5, 0x1

    .line 71
    if-eq v0, v4, :cond_4

    .line 72
    .line 73
    move v4, v5

    .line 74
    goto :goto_1

    .line 75
    :cond_4
    move v4, v3

    .line 76
    :goto_1
    iget-object v6, v1, Lv3/k;->c:Lv3/j1;

    .line 77
    .line 78
    if-eqz v6, :cond_6

    .line 79
    .line 80
    invoke-interface {v6}, Lv3/j1;->d()Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-nez v6, :cond_6

    .line 85
    .line 86
    iget-object v6, v1, Lv3/k;->c:Lv3/j1;

    .line 87
    .line 88
    invoke-interface {v6}, Lv3/j1;->b()Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-nez v6, :cond_5

    .line 93
    .line 94
    if-nez v4, :cond_6

    .line 95
    .line 96
    iget-object v4, v1, Lv3/k;->c:Lv3/j1;

    .line 97
    .line 98
    invoke-interface {v4}, Lv3/j1;->h()Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-eqz v4, :cond_5

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_5
    move v4, v3

    .line 106
    goto :goto_3

    .line 107
    :cond_6
    :goto_2
    move v4, v5

    .line 108
    :goto_3
    if-eqz v4, :cond_7

    .line 109
    .line 110
    iput-boolean v5, v1, Lv3/k;->e:Z

    .line 111
    .line 112
    iget-boolean v2, v1, Lv3/k;->f:Z

    .line 113
    .line 114
    if-eqz v2, :cond_a

    .line 115
    .line 116
    iget-object v2, v1, Lv3/k;->a:Lv5/y;

    .line 117
    .line 118
    iget-boolean v4, v2, Lv5/y;->b:Z

    .line 119
    .line 120
    if-nez v4, :cond_a

    .line 121
    .line 122
    iget-object v4, v2, Lv5/y;->a:Lv5/c;

    .line 123
    .line 124
    invoke-interface {v4}, Lv5/c;->d()J

    .line 125
    .line 126
    .line 127
    move-result-wide v6

    .line 128
    iput-wide v6, v2, Lv5/y;->d:J

    .line 129
    .line 130
    iput-boolean v5, v2, Lv5/y;->b:Z

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_7
    iget-object v4, v1, Lv3/k;->d:Lv5/o;

    .line 134
    .line 135
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-interface {v4}, Lv5/o;->l()J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    iget-boolean v8, v1, Lv3/k;->e:Z

    .line 143
    .line 144
    if-eqz v8, :cond_9

    .line 145
    .line 146
    iget-object v8, v1, Lv3/k;->a:Lv5/y;

    .line 147
    .line 148
    invoke-virtual {v8}, Lv5/y;->l()J

    .line 149
    .line 150
    .line 151
    move-result-wide v8

    .line 152
    cmp-long v8, v6, v8

    .line 153
    .line 154
    if-gez v8, :cond_8

    .line 155
    .line 156
    iget-object v2, v1, Lv3/k;->a:Lv5/y;

    .line 157
    .line 158
    iget-boolean v4, v2, Lv5/y;->b:Z

    .line 159
    .line 160
    if-eqz v4, :cond_a

    .line 161
    .line 162
    invoke-virtual {v2}, Lv5/y;->l()J

    .line 163
    .line 164
    .line 165
    move-result-wide v4

    .line 166
    invoke-virtual {v2, v4, v5}, Lv5/y;->a(J)V

    .line 167
    .line 168
    .line 169
    iput-boolean v3, v2, Lv5/y;->b:Z

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_8
    iput-boolean v3, v1, Lv3/k;->e:Z

    .line 173
    .line 174
    iget-boolean v8, v1, Lv3/k;->f:Z

    .line 175
    .line 176
    if-eqz v8, :cond_9

    .line 177
    .line 178
    iget-object v8, v1, Lv3/k;->a:Lv5/y;

    .line 179
    .line 180
    iget-boolean v9, v8, Lv5/y;->b:Z

    .line 181
    .line 182
    if-nez v9, :cond_9

    .line 183
    .line 184
    iget-object v9, v8, Lv5/y;->a:Lv5/c;

    .line 185
    .line 186
    invoke-interface {v9}, Lv5/c;->d()J

    .line 187
    .line 188
    .line 189
    move-result-wide v10

    .line 190
    iput-wide v10, v8, Lv5/y;->d:J

    .line 191
    .line 192
    iput-boolean v5, v8, Lv5/y;->b:Z

    .line 193
    .line 194
    :cond_9
    iget-object v5, v1, Lv3/k;->a:Lv5/y;

    .line 195
    .line 196
    invoke-virtual {v5, v6, v7}, Lv5/y;->a(J)V

    .line 197
    .line 198
    .line 199
    invoke-interface {v4}, Lv5/o;->f()Lv3/e1;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    iget-object v5, v1, Lv3/k;->a:Lv5/y;

    .line 204
    .line 205
    iget-object v5, v5, Lv5/y;->e:Lv3/e1;

    .line 206
    .line 207
    invoke-virtual {v4, v5}, Lv3/e1;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    if-nez v5, :cond_a

    .line 212
    .line 213
    iget-object v5, v1, Lv3/k;->a:Lv5/y;

    .line 214
    .line 215
    invoke-virtual {v5, v4}, Lv5/y;->c(Lv3/e1;)V

    .line 216
    .line 217
    .line 218
    iget-object v5, v1, Lv3/k;->b:Lv3/k$a;

    .line 219
    .line 220
    check-cast v5, Lv3/g0;

    .line 221
    .line 222
    iget-object v5, v5, Lv3/g0;->p:Lv5/k;

    .line 223
    .line 224
    invoke-interface {v5, v2, v4}, Lv5/k;->k(ILjava/lang/Object;)Lv5/a0$a;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-virtual {v2}, Lv5/a0$a;->a()V

    .line 229
    .line 230
    .line 231
    :cond_a
    :goto_4
    invoke-virtual {v1}, Lv3/k;->l()J

    .line 232
    .line 233
    .line 234
    move-result-wide v1

    .line 235
    iput-wide v1, p0, Lv3/g0;->T:J

    .line 236
    .line 237
    iget-wide v4, v0, Lv3/q0;->o:J

    .line 238
    .line 239
    sub-long/2addr v1, v4

    .line 240
    iget-object v0, p0, Lv3/g0;->F:Lv3/d1;

    .line 241
    .line 242
    iget-wide v4, v0, Lv3/d1;->r:J

    .line 243
    .line 244
    iget-object v0, p0, Lv3/g0;->x:Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    if-nez v0, :cond_14

    .line 251
    .line 252
    iget-object v0, p0, Lv3/g0;->F:Lv3/d1;

    .line 253
    .line 254
    iget-object v0, v0, Lv3/d1;->b:Lz4/t$b;

    .line 255
    .line 256
    invoke-virtual {v0}, Lz4/s;->a()Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-eqz v0, :cond_b

    .line 261
    .line 262
    goto/16 :goto_8

    .line 263
    .line 264
    :cond_b
    iget-boolean v0, p0, Lv3/g0;->V:Z

    .line 265
    .line 266
    if-eqz v0, :cond_c

    .line 267
    .line 268
    const-wide/16 v6, 0x1

    .line 269
    .line 270
    sub-long/2addr v4, v6

    .line 271
    iput-boolean v3, p0, Lv3/g0;->V:Z

    .line 272
    .line 273
    :cond_c
    iget-object v0, p0, Lv3/g0;->F:Lv3/d1;

    .line 274
    .line 275
    iget-object v3, v0, Lv3/d1;->a:Lv3/r1;

    .line 276
    .line 277
    iget-object v0, v0, Lv3/d1;->b:Lz4/t$b;

    .line 278
    .line 279
    iget-object v0, v0, Lz4/s;->a:Ljava/lang/Object;

    .line 280
    .line 281
    invoke-virtual {v3, v0}, Lv3/r1;->b(Ljava/lang/Object;)I

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    iget v3, p0, Lv3/g0;->U:I

    .line 286
    .line 287
    iget-object v6, p0, Lv3/g0;->x:Ljava/util/ArrayList;

    .line 288
    .line 289
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 290
    .line 291
    .line 292
    move-result v6

    .line 293
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    const/4 v6, 0x0

    .line 298
    if-lez v3, :cond_d

    .line 299
    .line 300
    move-object v8, p0

    .line 301
    move-object v9, v8

    .line 302
    move-object v10, v9

    .line 303
    move-object v7, v6

    .line 304
    goto :goto_7

    .line 305
    :cond_d
    move-object v7, p0

    .line 306
    move-object v8, v7

    .line 307
    move-object v9, v8

    .line 308
    :goto_5
    move-object v10, v9

    .line 309
    move-object v9, v8

    .line 310
    move-object v8, v7

    .line 311
    move-object v7, v6

    .line 312
    :goto_6
    if-eqz v6, :cond_10

    .line 313
    .line 314
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    if-ltz v0, :cond_e

    .line 318
    .line 319
    if-nez v0, :cond_10

    .line 320
    .line 321
    const-wide/16 v11, 0x0

    .line 322
    .line 323
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    cmp-long v6, v11, v4

    .line 327
    .line 328
    if-lez v6, :cond_10

    .line 329
    .line 330
    :cond_e
    add-int/lit8 v3, v3, -0x1

    .line 331
    .line 332
    if-lez v3, :cond_f

    .line 333
    .line 334
    :goto_7
    iget-object v6, v8, Lv3/g0;->x:Ljava/util/ArrayList;

    .line 335
    .line 336
    add-int/lit8 v11, v3, -0x1

    .line 337
    .line 338
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    check-cast v6, Lv3/g0$c;

    .line 343
    .line 344
    goto :goto_6

    .line 345
    :cond_f
    move-object v6, v7

    .line 346
    move-object v7, v8

    .line 347
    move-object v8, v9

    .line 348
    move-object v9, v10

    .line 349
    goto :goto_5

    .line 350
    :cond_10
    iget-object v0, v8, Lv3/g0;->x:Ljava/util/ArrayList;

    .line 351
    .line 352
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-ge v3, v0, :cond_11

    .line 357
    .line 358
    iget-object v0, v8, Lv3/g0;->x:Ljava/util/ArrayList;

    .line 359
    .line 360
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    move-object v7, v0

    .line 365
    check-cast v7, Lv3/g0$c;

    .line 366
    .line 367
    :cond_11
    if-eqz v7, :cond_12

    .line 368
    .line 369
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    :cond_12
    if-eqz v7, :cond_13

    .line 373
    .line 374
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    :cond_13
    iput v3, v8, Lv3/g0;->U:I

    .line 378
    .line 379
    goto :goto_9

    .line 380
    :cond_14
    :goto_8
    move-object v9, p0

    .line 381
    move-object v10, v9

    .line 382
    :goto_9
    iget-object v0, v10, Lv3/g0;->F:Lv3/d1;

    .line 383
    .line 384
    iput-wide v1, v0, Lv3/d1;->r:J

    .line 385
    .line 386
    :goto_a
    iget-object v0, v10, Lv3/g0;->A:Lv3/s0;

    .line 387
    .line 388
    iget-object v0, v0, Lv3/s0;->j:Lv3/q0;

    .line 389
    .line 390
    iget-object v1, v10, Lv3/g0;->F:Lv3/d1;

    .line 391
    .line 392
    invoke-virtual {v0}, Lv3/q0;->d()J

    .line 393
    .line 394
    .line 395
    move-result-wide v2

    .line 396
    iput-wide v2, v1, Lv3/d1;->p:J

    .line 397
    .line 398
    iget-object v0, v10, Lv3/g0;->F:Lv3/d1;

    .line 399
    .line 400
    iget-object v1, v9, Lv3/g0;->F:Lv3/d1;

    .line 401
    .line 402
    iget-wide v1, v1, Lv3/d1;->p:J

    .line 403
    .line 404
    iget-object v3, v9, Lv3/g0;->A:Lv3/s0;

    .line 405
    .line 406
    iget-object v3, v3, Lv3/s0;->j:Lv3/q0;

    .line 407
    .line 408
    const-wide/16 v4, 0x0

    .line 409
    .line 410
    if-nez v3, :cond_15

    .line 411
    .line 412
    move-wide v1, v4

    .line 413
    goto :goto_b

    .line 414
    :cond_15
    iget-wide v6, v9, Lv3/g0;->T:J

    .line 415
    .line 416
    iget-wide v11, v3, Lv3/q0;->o:J

    .line 417
    .line 418
    sub-long/2addr v6, v11

    .line 419
    sub-long/2addr v1, v6

    .line 420
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 421
    .line 422
    .line 423
    move-result-wide v1

    .line 424
    :goto_b
    iput-wide v1, v0, Lv3/d1;->q:J

    .line 425
    .line 426
    iget-object v0, v10, Lv3/g0;->F:Lv3/d1;

    .line 427
    .line 428
    iget-boolean v1, v0, Lv3/d1;->l:Z

    .line 429
    .line 430
    if-eqz v1, :cond_17

    .line 431
    .line 432
    iget v1, v0, Lv3/d1;->e:I

    .line 433
    .line 434
    const/4 v2, 0x3

    .line 435
    if-ne v1, v2, :cond_17

    .line 436
    .line 437
    iget-object v1, v0, Lv3/d1;->a:Lv3/r1;

    .line 438
    .line 439
    iget-object v0, v0, Lv3/d1;->b:Lz4/t$b;

    .line 440
    .line 441
    invoke-virtual {v10, v1, v0}, Lv3/g0;->Z(Lv3/r1;Lz4/t$b;)Z

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    if-eqz v0, :cond_17

    .line 446
    .line 447
    iget-object v0, v10, Lv3/g0;->F:Lv3/d1;

    .line 448
    .line 449
    iget-object v1, v0, Lv3/d1;->n:Lv3/e1;

    .line 450
    .line 451
    iget v1, v1, Lv3/e1;->a:F

    .line 452
    .line 453
    const/high16 v2, 0x3f800000    # 1.0f

    .line 454
    .line 455
    cmpl-float v1, v1, v2

    .line 456
    .line 457
    if-nez v1, :cond_17

    .line 458
    .line 459
    iget-object v1, v10, Lv3/g0;->C:Lv3/m0;

    .line 460
    .line 461
    iget-object v2, v0, Lv3/d1;->a:Lv3/r1;

    .line 462
    .line 463
    iget-object v3, v0, Lv3/d1;->b:Lz4/t$b;

    .line 464
    .line 465
    iget-object v3, v3, Lz4/s;->a:Ljava/lang/Object;

    .line 466
    .line 467
    iget-wide v6, v0, Lv3/d1;->r:J

    .line 468
    .line 469
    invoke-virtual {v10, v2, v3, v6, v7}, Lv3/g0;->g(Lv3/r1;Ljava/lang/Object;J)J

    .line 470
    .line 471
    .line 472
    move-result-wide v2

    .line 473
    iget-object v0, v9, Lv3/g0;->F:Lv3/d1;

    .line 474
    .line 475
    iget-wide v6, v0, Lv3/d1;->p:J

    .line 476
    .line 477
    iget-object v0, v9, Lv3/g0;->A:Lv3/s0;

    .line 478
    .line 479
    iget-object v0, v0, Lv3/s0;->j:Lv3/q0;

    .line 480
    .line 481
    if-nez v0, :cond_16

    .line 482
    .line 483
    goto :goto_c

    .line 484
    :cond_16
    iget-wide v8, v9, Lv3/g0;->T:J

    .line 485
    .line 486
    iget-wide v11, v0, Lv3/q0;->o:J

    .line 487
    .line 488
    sub-long/2addr v8, v11

    .line 489
    sub-long/2addr v6, v8

    .line 490
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 491
    .line 492
    .line 493
    move-result-wide v4

    .line 494
    :goto_c
    invoke-interface {v1, v2, v3, v4, v5}, Lv3/m0;->a(JJ)F

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    iget-object v1, v10, Lv3/g0;->w:Lv3/k;

    .line 499
    .line 500
    invoke-virtual {v1}, Lv3/k;->f()Lv3/e1;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    iget v1, v1, Lv3/e1;->a:F

    .line 505
    .line 506
    cmpl-float v1, v1, v0

    .line 507
    .line 508
    if-eqz v1, :cond_17

    .line 509
    .line 510
    iget-object v1, v10, Lv3/g0;->F:Lv3/d1;

    .line 511
    .line 512
    iget-object v1, v1, Lv3/d1;->n:Lv3/e1;

    .line 513
    .line 514
    new-instance v2, Lv3/e1;

    .line 515
    .line 516
    iget v1, v1, Lv3/e1;->b:F

    .line 517
    .line 518
    invoke-direct {v2, v0, v1}, Lv3/e1;-><init>(FF)V

    .line 519
    .line 520
    .line 521
    iget-object v0, v10, Lv3/g0;->p:Lv5/k;

    .line 522
    .line 523
    const/16 v1, 0x10

    .line 524
    .line 525
    invoke-interface {v0, v1}, Lv5/k;->j(I)V

    .line 526
    .line 527
    .line 528
    iget-object v0, v10, Lv3/g0;->w:Lv3/k;

    .line 529
    .line 530
    invoke-virtual {v0, v2}, Lv3/k;->c(Lv3/e1;)V

    .line 531
    .line 532
    .line 533
    iget-object v0, v10, Lv3/g0;->F:Lv3/d1;

    .line 534
    .line 535
    iget-object v0, v0, Lv3/d1;->n:Lv3/e1;

    .line 536
    .line 537
    iget-object v1, v10, Lv3/g0;->w:Lv3/k;

    .line 538
    .line 539
    invoke-virtual {v1}, Lv3/k;->f()Lv3/e1;

    .line 540
    .line 541
    .line 542
    move-result-object v1

    .line 543
    iget v1, v1, Lv3/e1;->a:F

    .line 544
    .line 545
    const/4 v2, 0x0

    .line 546
    invoke-virtual {v10, v0, v1, v2, v2}, Lv3/g0;->o(Lv3/e1;FZZ)V

    .line 547
    .line 548
    .line 549
    :cond_17
    return-void
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
.end method

.method public final f([Z)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lv3/g0;->A:Lv3/s0;

    .line 4
    .line 5
    iget-object v1, v1, Lv3/s0;->i:Lv3/q0;

    .line 6
    .line 7
    iget-object v2, v1, Lv3/q0;->n:Lr5/p;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    iget-object v5, v0, Lv3/g0;->a:[Lv3/j1;

    .line 12
    .line 13
    array-length v5, v5

    .line 14
    if-ge v4, v5, :cond_1

    .line 15
    .line 16
    invoke-virtual {v2, v4}, Lr5/p;->b(I)Z

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    if-nez v5, :cond_0

    .line 21
    .line 22
    iget-object v5, v0, Lv3/g0;->b:Ljava/util/Set;

    .line 23
    .line 24
    iget-object v6, v0, Lv3/g0;->a:[Lv3/j1;

    .line 25
    .line 26
    aget-object v6, v6, v4

    .line 27
    .line 28
    invoke-interface {v5, v6}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    iget-object v5, v0, Lv3/g0;->a:[Lv3/j1;

    .line 35
    .line 36
    aget-object v5, v5, v4

    .line 37
    .line 38
    invoke-interface {v5}, Lv3/j1;->reset()V

    .line 39
    .line 40
    .line 41
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move v4, v3

    .line 45
    :goto_1
    iget-object v5, v0, Lv3/g0;->a:[Lv3/j1;

    .line 46
    .line 47
    array-length v5, v5

    .line 48
    const/4 v6, 0x1

    .line 49
    if-ge v4, v5, :cond_b

    .line 50
    .line 51
    invoke-virtual {v2, v4}, Lr5/p;->b(I)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_a

    .line 56
    .line 57
    aget-boolean v5, p1, v4

    .line 58
    .line 59
    iget-object v7, v0, Lv3/g0;->a:[Lv3/j1;

    .line 60
    .line 61
    aget-object v7, v7, v4

    .line 62
    .line 63
    invoke-static {v7}, Lv3/g0;->r(Lv3/j1;)Z

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    if-eqz v8, :cond_2

    .line 68
    .line 69
    goto/16 :goto_8

    .line 70
    .line 71
    :cond_2
    iget-object v8, v0, Lv3/g0;->A:Lv3/s0;

    .line 72
    .line 73
    iget-object v9, v8, Lv3/s0;->i:Lv3/q0;

    .line 74
    .line 75
    iget-object v8, v8, Lv3/s0;->h:Lv3/q0;

    .line 76
    .line 77
    if-ne v9, v8, :cond_3

    .line 78
    .line 79
    move v15, v6

    .line 80
    goto :goto_2

    .line 81
    :cond_3
    move v15, v3

    .line 82
    :goto_2
    iget-object v8, v9, Lv3/q0;->n:Lr5/p;

    .line 83
    .line 84
    iget-object v10, v8, Lr5/p;->b:[Lv3/l1;

    .line 85
    .line 86
    aget-object v10, v10, v4

    .line 87
    .line 88
    iget-object v8, v8, Lr5/p;->c:[Lr5/h;

    .line 89
    .line 90
    aget-object v8, v8, v4

    .line 91
    .line 92
    if-eqz v8, :cond_4

    .line 93
    .line 94
    invoke-interface {v8}, Lr5/k;->length()I

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    goto :goto_3

    .line 99
    :cond_4
    move v11, v3

    .line 100
    :goto_3
    new-array v12, v11, [Lv3/i0;

    .line 101
    .line 102
    move v13, v3

    .line 103
    :goto_4
    if-ge v13, v11, :cond_5

    .line 104
    .line 105
    invoke-interface {v8, v13}, Lr5/k;->b(I)Lv3/i0;

    .line 106
    .line 107
    .line 108
    move-result-object v14

    .line 109
    aput-object v14, v12, v13

    .line 110
    .line 111
    add-int/lit8 v13, v13, 0x1

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_5
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->Y()Z

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    if-eqz v8, :cond_6

    .line 119
    .line 120
    iget-object v8, v0, Lv3/g0;->F:Lv3/d1;

    .line 121
    .line 122
    iget v8, v8, Lv3/d1;->e:I

    .line 123
    .line 124
    const/4 v11, 0x3

    .line 125
    if-ne v8, v11, :cond_6

    .line 126
    .line 127
    move/from16 v20, v6

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_6
    move/from16 v20, v3

    .line 131
    .line 132
    :goto_5
    if-nez v5, :cond_7

    .line 133
    .line 134
    if-eqz v20, :cond_7

    .line 135
    .line 136
    move v14, v6

    .line 137
    goto :goto_6

    .line 138
    :cond_7
    move v14, v3

    .line 139
    :goto_6
    iget v5, v0, Lv3/g0;->R:I

    .line 140
    .line 141
    add-int/2addr v5, v6

    .line 142
    iput v5, v0, Lv3/g0;->R:I

    .line 143
    .line 144
    iget-object v5, v0, Lv3/g0;->b:Ljava/util/Set;

    .line 145
    .line 146
    invoke-interface {v5, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    iget-object v5, v9, Lv3/q0;->c:[Lz4/c0;

    .line 150
    .line 151
    aget-object v11, v5, v4

    .line 152
    .line 153
    iget-wide v5, v0, Lv3/g0;->T:J

    .line 154
    .line 155
    invoke-virtual {v9}, Lv3/q0;->e()J

    .line 156
    .line 157
    .line 158
    move-result-wide v16

    .line 159
    iget-wide v8, v9, Lv3/q0;->o:J

    .line 160
    .line 161
    move-wide/from16 v18, v8

    .line 162
    .line 163
    move-object v8, v7

    .line 164
    move-object v9, v10

    .line 165
    move-object v10, v12

    .line 166
    move-wide v12, v5

    .line 167
    invoke-interface/range {v8 .. v19}, Lv3/j1;->y(Lv3/l1;[Lv3/i0;Lz4/c0;JZZJJ)V

    .line 168
    .line 169
    .line 170
    const/16 v5, 0xb

    .line 171
    .line 172
    new-instance v6, Lv3/f0;

    .line 173
    .line 174
    invoke-direct {v6, v0}, Lv3/f0;-><init>(Lv3/g0;)V

    .line 175
    .line 176
    .line 177
    invoke-interface {v7, v5, v6}, Lv3/g1$b;->q(ILjava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    iget-object v5, v0, Lv3/g0;->w:Lv3/k;

    .line 181
    .line 182
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-interface {v7}, Lv3/j1;->w()Lv5/o;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    if-eqz v6, :cond_9

    .line 190
    .line 191
    iget-object v8, v5, Lv3/k;->d:Lv5/o;

    .line 192
    .line 193
    if-eq v6, v8, :cond_9

    .line 194
    .line 195
    if-nez v8, :cond_8

    .line 196
    .line 197
    iput-object v6, v5, Lv3/k;->d:Lv5/o;

    .line 198
    .line 199
    iput-object v7, v5, Lv3/k;->c:Lv3/j1;

    .line 200
    .line 201
    iget-object v5, v5, Lv3/k;->a:Lv5/y;

    .line 202
    .line 203
    iget-object v5, v5, Lv5/y;->e:Lv3/e1;

    .line 204
    .line 205
    invoke-interface {v6, v5}, Lv5/o;->c(Lv3/e1;)V

    .line 206
    .line 207
    .line 208
    goto :goto_7

    .line 209
    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 210
    .line 211
    const-string v2, "Multiple renderer media clocks enabled."

    .line 212
    .line 213
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    const/16 v2, 0x3e8

    .line 217
    .line 218
    new-instance v3, Lv3/n;

    .line 219
    .line 220
    const/4 v4, 0x2

    .line 221
    invoke-direct {v3, v4, v2, v1}, Lv3/n;-><init>(IILjava/lang/Throwable;)V

    .line 222
    .line 223
    .line 224
    throw v3

    .line 225
    :cond_9
    :goto_7
    if-eqz v20, :cond_a

    .line 226
    .line 227
    invoke-interface {v7}, Lv3/j1;->start()V

    .line 228
    .line 229
    .line 230
    :cond_a
    :goto_8
    add-int/lit8 v4, v4, 0x1

    .line 231
    .line 232
    goto/16 :goto_1

    .line 233
    .line 234
    :cond_b
    iput-boolean v6, v1, Lv3/q0;->g:Z

    .line 235
    .line 236
    return-void
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
.end method

.method public final f0(Lv3/r1;Lz4/t$b;Lv3/r1;Lz4/t$b;JZ)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lv3/g0;->Z(Lv3/r1;Lz4/t$b;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p2}, Lz4/s;->a()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    sget-object p1, Lv3/e1;->d:Lv3/e1;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p0, Lv3/g0;->F:Lv3/d1;

    .line 17
    .line 18
    iget-object p1, p1, Lv3/d1;->n:Lv3/e1;

    .line 19
    .line 20
    :goto_0
    iget-object p2, p0, Lv3/g0;->w:Lv3/k;

    .line 21
    .line 22
    invoke-virtual {p2}, Lv3/k;->f()Lv3/e1;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p2, p1}, Lv3/e1;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-nez p2, :cond_1

    .line 31
    .line 32
    iget-object p2, p0, Lv3/g0;->p:Lv5/k;

    .line 33
    .line 34
    const/16 p3, 0x10

    .line 35
    .line 36
    invoke-interface {p2, p3}, Lv5/k;->j(I)V

    .line 37
    .line 38
    .line 39
    iget-object p2, p0, Lv3/g0;->w:Lv3/k;

    .line 40
    .line 41
    invoke-virtual {p2, p1}, Lv3/k;->c(Lv3/e1;)V

    .line 42
    .line 43
    .line 44
    iget-object p2, p0, Lv3/g0;->F:Lv3/d1;

    .line 45
    .line 46
    iget-object p2, p2, Lv3/d1;->n:Lv3/e1;

    .line 47
    .line 48
    iget p1, p1, Lv3/e1;->a:F

    .line 49
    .line 50
    const/4 p3, 0x0

    .line 51
    invoke-virtual {p0, p2, p1, p3, p3}, Lv3/g0;->o(Lv3/e1;FZZ)V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void

    .line 55
    :cond_2
    iget-object v0, p2, Lz4/s;->a:Ljava/lang/Object;

    .line 56
    .line 57
    iget-object v1, p0, Lv3/g0;->t:Lv3/r1$b;

    .line 58
    .line 59
    invoke-virtual {p1, v0, v1}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget v0, v0, Lv3/r1$b;->c:I

    .line 64
    .line 65
    iget-object v1, p0, Lv3/g0;->s:Lv3/r1$c;

    .line 66
    .line 67
    invoke-virtual {p1, v0, v1}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lv3/g0;->C:Lv3/m0;

    .line 71
    .line 72
    iget-object v1, p0, Lv3/g0;->s:Lv3/r1$c;

    .line 73
    .line 74
    iget-object v1, v1, Lv3/r1$c;->s:Lv3/o0$e;

    .line 75
    .line 76
    invoke-interface {v0, v1}, Lv3/m0;->d(Lv3/o0$e;)V

    .line 77
    .line 78
    .line 79
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    cmp-long v2, p5, v0

    .line 85
    .line 86
    if-eqz v2, :cond_3

    .line 87
    .line 88
    iget-object p3, p0, Lv3/g0;->C:Lv3/m0;

    .line 89
    .line 90
    iget-object p2, p2, Lz4/s;->a:Ljava/lang/Object;

    .line 91
    .line 92
    invoke-virtual {p0, p1, p2, p5, p6}, Lv3/g0;->g(Lv3/r1;Ljava/lang/Object;J)J

    .line 93
    .line 94
    .line 95
    move-result-wide p1

    .line 96
    invoke-interface {p3, p1, p2}, Lv3/m0;->e(J)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    iget-object p1, p0, Lv3/g0;->s:Lv3/r1$c;

    .line 101
    .line 102
    iget-object p1, p1, Lv3/r1$c;->a:Ljava/lang/Object;

    .line 103
    .line 104
    const/4 p2, 0x0

    .line 105
    invoke-virtual {p3}, Lv3/r1;->p()Z

    .line 106
    .line 107
    .line 108
    move-result p5

    .line 109
    if-nez p5, :cond_4

    .line 110
    .line 111
    iget-object p2, p4, Lz4/s;->a:Ljava/lang/Object;

    .line 112
    .line 113
    iget-object p4, p0, Lv3/g0;->t:Lv3/r1$b;

    .line 114
    .line 115
    invoke-virtual {p3, p2, p4}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    iget p2, p2, Lv3/r1$b;->c:I

    .line 120
    .line 121
    iget-object p4, p0, Lv3/g0;->s:Lv3/r1$c;

    .line 122
    .line 123
    invoke-virtual {p3, p2, p4}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    iget-object p2, p2, Lv3/r1$c;->a:Ljava/lang/Object;

    .line 128
    .line 129
    :cond_4
    invoke-static {p2, p1}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-eqz p1, :cond_5

    .line 134
    .line 135
    if-eqz p7, :cond_6

    .line 136
    .line 137
    :cond_5
    iget-object p1, p0, Lv3/g0;->C:Lv3/m0;

    .line 138
    .line 139
    invoke-interface {p1, v0, v1}, Lv3/m0;->e(J)V

    .line 140
    .line 141
    .line 142
    :cond_6
    :goto_1
    return-void
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
.end method

.method public final g(Lv3/r1;Ljava/lang/Object;J)J
    .locals 4

    .line 1
    iget-object v0, p0, Lv3/g0;->t:Lv3/r1$b;

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget p2, p2, Lv3/r1$b;->c:I

    .line 8
    .line 9
    iget-object v0, p0, Lv3/g0;->s:Lv3/r1$c;

    .line 10
    .line 11
    invoke-virtual {p1, p2, v0}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lv3/g0;->s:Lv3/r1$c;

    .line 15
    .line 16
    iget-wide v0, p1, Lv3/r1$c;->f:J

    .line 17
    .line 18
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long p2, v0, v2

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1}, Lv3/r1$c;->a()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget-object p1, p0, Lv3/g0;->s:Lv3/r1$c;

    .line 34
    .line 35
    iget-boolean p2, p1, Lv3/r1$c;->q:Z

    .line 36
    .line 37
    if-nez p2, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-wide p1, p1, Lv3/r1$c;->o:J

    .line 41
    .line 42
    invoke-static {p1, p2}, Lv5/e0;->u(J)J

    .line 43
    .line 44
    .line 45
    move-result-wide p1

    .line 46
    iget-object v0, p0, Lv3/g0;->s:Lv3/r1$c;

    .line 47
    .line 48
    iget-wide v0, v0, Lv3/r1$c;->f:J

    .line 49
    .line 50
    sub-long/2addr p1, v0

    .line 51
    invoke-static {p1, p2}, Lv5/e0;->I(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide p1

    .line 55
    iget-object v0, p0, Lv3/g0;->t:Lv3/r1$b;

    .line 56
    .line 57
    iget-wide v0, v0, Lv3/r1$b;->e:J

    .line 58
    .line 59
    add-long/2addr p3, v0

    .line 60
    sub-long/2addr p1, p3

    .line 61
    return-wide p1

    .line 62
    :cond_1
    :goto_0
    return-wide v2
    .line 63
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
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method

.method public final declared-synchronized g0(Le;J)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lv3/g0;->y:Lv5/c;

    invoke-interface {v0}, Lv5/c;->d()J

    move-result-wide v0

    add-long/2addr v0, p2

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p1}, Le;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_0

    const-wide/16 v3, 0x0

    cmp-long v3, p2, v3

    if-lez v3, :cond_0

    :try_start_1
    iget-object v3, p0, Lv3/g0;->y:Lv5/c;

    invoke-interface {v3}, Lv5/c;->c()V

    invoke-virtual {p0, p2, p3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    const/4 p2, 0x1

    move v2, p2

    :goto_1
    :try_start_2
    iget-object p2, p0, Lv3/g0;->y:Lv5/c;

    invoke-interface {p2}, Lv5/c;->d()J

    move-result-wide p2

    sub-long p2, v0, p2

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final h()J
    .locals 9

    .line 1
    iget-object v0, p0, Lv3/g0;->A:Lv3/s0;

    .line 2
    .line 3
    iget-object v0, v0, Lv3/s0;->i:Lv3/q0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-wide v1, v0, Lv3/q0;->o:J

    .line 11
    .line 12
    iget-boolean v3, v0, Lv3/q0;->d:Z

    .line 13
    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    return-wide v1

    .line 17
    :cond_1
    const/4 v3, 0x0

    .line 18
    :goto_0
    iget-object v4, p0, Lv3/g0;->a:[Lv3/j1;

    .line 19
    .line 20
    array-length v5, v4

    .line 21
    if-ge v3, v5, :cond_5

    .line 22
    .line 23
    aget-object v4, v4, v3

    .line 24
    .line 25
    invoke-static {v4}, Lv3/g0;->r(Lv3/j1;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_4

    .line 30
    .line 31
    iget-object v4, p0, Lv3/g0;->a:[Lv3/j1;

    .line 32
    .line 33
    aget-object v4, v4, v3

    .line 34
    .line 35
    invoke-interface {v4}, Lv3/j1;->r()Lz4/c0;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    iget-object v5, v0, Lv3/q0;->c:[Lz4/c0;

    .line 40
    .line 41
    aget-object v5, v5, v3

    .line 42
    .line 43
    if-eq v4, v5, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    iget-object v4, p0, Lv3/g0;->a:[Lv3/j1;

    .line 47
    .line 48
    aget-object v4, v4, v3

    .line 49
    .line 50
    invoke-interface {v4}, Lv3/j1;->t()J

    .line 51
    .line 52
    .line 53
    move-result-wide v4

    .line 54
    const-wide/high16 v6, -0x8000000000000000L

    .line 55
    .line 56
    cmp-long v8, v4, v6

    .line 57
    .line 58
    if-nez v8, :cond_3

    .line 59
    .line 60
    return-wide v6

    .line 61
    :cond_3
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 62
    .line 63
    .line 64
    move-result-wide v1

    .line 65
    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_5
    return-wide v1
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
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 6

    .line 1
    const-string v0, "ExoPlayerImplInternal"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/16 v2, 0x3e8

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    :try_start_0
    iget v4, p1, Landroid/os/Message;->what:I

    .line 8
    .line 9
    packed-switch v4, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    return v3

    .line 13
    :pswitch_0
    invoke-virtual {p0, v1}, Lv3/g0;->I(Z)V

    .line 14
    .line 15
    .line 16
    goto/16 :goto_9

    .line 17
    .line 18
    :pswitch_1
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 19
    .line 20
    if-ne p1, v1, :cond_0

    .line 21
    .line 22
    move p1, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p1, v3

    .line 25
    :goto_0
    invoke-virtual {p0, p1}, Lv3/g0;->Q(Z)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_9

    .line 29
    .line 30
    :pswitch_2
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    move p1, v1

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move p1, v3

    .line 37
    :goto_1
    invoke-virtual {p0, p1}, Lv3/g0;->R(Z)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_9

    .line 41
    .line 42
    :pswitch_3
    invoke-virtual {p0}, Lv3/g0;->v()V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_9

    .line 46
    .line 47
    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lz4/e0;

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Lv3/g0;->W(Lz4/e0;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_9

    .line 55
    .line 56
    :pswitch_5
    iget v4, p1, Landroid/os/Message;->arg1:I

    .line 57
    .line 58
    iget v5, p1, Landroid/os/Message;->arg2:I

    .line 59
    .line 60
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, Lz4/e0;

    .line 63
    .line 64
    invoke-virtual {p0, v4, v5, p1}, Lv3/g0;->z(IILz4/e0;)V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_9

    .line 68
    .line 69
    :pswitch_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, Lv3/g0$b;

    .line 72
    .line 73
    invoke-virtual {p0, p1}, Lv3/g0;->w(Lv3/g0$b;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_9

    .line 77
    .line 78
    :pswitch_7
    iget-object v4, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v4, Lv3/g0$a;

    .line 81
    .line 82
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 83
    .line 84
    invoke-virtual {p0, v4, p1}, Lv3/g0;->c(Lv3/g0$a;I)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_9

    .line 88
    .line 89
    :pswitch_8
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p1, Lv3/g0$a;

    .line 92
    .line 93
    invoke-virtual {p0, p1}, Lv3/g0;->P(Lv3/g0$a;)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_9

    .line 97
    .line 98
    :pswitch_9
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p1, Lv3/e1;

    .line 101
    .line 102
    iget v4, p1, Lv3/e1;->a:F

    .line 103
    .line 104
    invoke-virtual {p0, p1, v4, v1, v3}, Lv3/g0;->o(Lv3/e1;FZZ)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_9

    .line 108
    .line 109
    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p1, Lv3/g1;

    .line 112
    .line 113
    invoke-virtual {p0, p1}, Lv3/g0;->M(Lv3/g1;)V

    .line 114
    .line 115
    .line 116
    goto/16 :goto_9

    .line 117
    .line 118
    :pswitch_b
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p1, Lv3/g1;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, p1}, Lv3/g0;->L(Lv3/g1;)V

    .line 126
    .line 127
    .line 128
    goto/16 :goto_9

    .line 129
    .line 130
    :pswitch_c
    iget v4, p1, Landroid/os/Message;->arg1:I

    .line 131
    .line 132
    if-eqz v4, :cond_2

    .line 133
    .line 134
    move v4, v1

    .line 135
    goto :goto_2

    .line 136
    :cond_2
    move v4, v3

    .line 137
    :goto_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 140
    .line 141
    invoke-virtual {p0, v4, p1}, Lv3/g0;->O(ZLjava/util/concurrent/atomic/AtomicBoolean;)V

    .line 142
    .line 143
    .line 144
    goto/16 :goto_9

    .line 145
    .line 146
    :pswitch_d
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 147
    .line 148
    if-eqz p1, :cond_3

    .line 149
    .line 150
    move p1, v1

    .line 151
    goto :goto_3

    .line 152
    :cond_3
    move p1, v3

    .line 153
    :goto_3
    invoke-virtual {p0, p1}, Lv3/g0;->V(Z)V

    .line 154
    .line 155
    .line 156
    goto/16 :goto_9

    .line 157
    .line 158
    :pswitch_e
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 159
    .line 160
    invoke-virtual {p0, p1}, Lv3/g0;->U(I)V

    .line 161
    .line 162
    .line 163
    goto/16 :goto_9

    .line 164
    .line 165
    :pswitch_f
    invoke-virtual {p0}, Lv3/g0;->A()V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_9

    .line 169
    .line 170
    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast p1, Lz4/r;

    .line 173
    .line 174
    invoke-virtual {p0, p1}, Lv3/g0;->j(Lz4/r;)V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_9

    .line 178
    .line 179
    :pswitch_11
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast p1, Lz4/r;

    .line 182
    .line 183
    invoke-virtual {p0, p1}, Lv3/g0;->n(Lz4/r;)V

    .line 184
    .line 185
    .line 186
    goto/16 :goto_9

    .line 187
    .line 188
    :pswitch_12
    invoke-virtual {p0}, Lv3/g0;->y()V

    .line 189
    .line 190
    .line 191
    return v1

    .line 192
    :pswitch_13
    invoke-virtual {p0, v3, v1}, Lv3/g0;->b0(ZZ)V

    .line 193
    .line 194
    .line 195
    goto/16 :goto_9

    .line 196
    .line 197
    :pswitch_14
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast p1, Lv3/n1;

    .line 200
    .line 201
    iput-object p1, p0, Lv3/g0;->E:Lv3/n1;

    .line 202
    .line 203
    goto/16 :goto_9

    .line 204
    .line 205
    :pswitch_15
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast p1, Lv3/e1;

    .line 208
    .line 209
    invoke-virtual {p0, p1}, Lv3/g0;->T(Lv3/e1;)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_9

    .line 213
    .line 214
    :pswitch_16
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast p1, Lv3/g0$g;

    .line 217
    .line 218
    invoke-virtual {p0, p1}, Lv3/g0;->J(Lv3/g0$g;)V

    .line 219
    .line 220
    .line 221
    goto/16 :goto_9

    .line 222
    .line 223
    :pswitch_17
    invoke-virtual {p0}, Lv3/g0;->e()V

    .line 224
    .line 225
    .line 226
    goto/16 :goto_9

    .line 227
    .line 228
    :pswitch_18
    iget v4, p1, Landroid/os/Message;->arg1:I

    .line 229
    .line 230
    if-eqz v4, :cond_4

    .line 231
    .line 232
    move v4, v1

    .line 233
    goto :goto_4

    .line 234
    :cond_4
    move v4, v3

    .line 235
    :goto_4
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 236
    .line 237
    invoke-virtual {p0, p1, v1, v4, v1}, Lv3/g0;->S(IIZZ)V

    .line 238
    .line 239
    .line 240
    goto/16 :goto_9

    .line 241
    .line 242
    :pswitch_19
    invoke-virtual {p0}, Lv3/g0;->x()V
    :try_end_0
    .catch Lv3/n; {:try_start_0 .. :try_end_0} :catch_6
    .catch La4/e$a; {:try_start_0 .. :try_end_0} :catch_5
    .catch Lv3/a1; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lt5/l; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lz4/b; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 243
    .line 244
    .line 245
    goto/16 :goto_9

    .line 246
    .line 247
    :catch_0
    move-exception p1

    .line 248
    instance-of v4, p1, Ljava/lang/IllegalStateException;

    .line 249
    .line 250
    if-nez v4, :cond_5

    .line 251
    .line 252
    instance-of v4, p1, Ljava/lang/IllegalArgumentException;

    .line 253
    .line 254
    if-eqz v4, :cond_6

    .line 255
    .line 256
    :cond_5
    const/16 v2, 0x3ec

    .line 257
    .line 258
    :cond_6
    new-instance v4, Lv3/n;

    .line 259
    .line 260
    const/4 v5, 0x2

    .line 261
    invoke-direct {v4, v5, v2, p1}, Lv3/n;-><init>(IILjava/lang/Throwable;)V

    .line 262
    .line 263
    .line 264
    goto/16 :goto_8

    .line 265
    .line 266
    :catch_1
    move-exception p1

    .line 267
    const/16 v0, 0x7d0

    .line 268
    .line 269
    goto :goto_7

    .line 270
    :catch_2
    move-exception p1

    .line 271
    const/16 v0, 0x3ea

    .line 272
    .line 273
    goto :goto_7

    .line 274
    :catch_3
    move-exception p1

    .line 275
    iget v0, p1, Lt5/l;->a:I

    .line 276
    .line 277
    goto :goto_7

    .line 278
    :catch_4
    move-exception p1

    .line 279
    iget v0, p1, Lv3/a1;->b:I

    .line 280
    .line 281
    if-ne v0, v1, :cond_8

    .line 282
    .line 283
    iget-boolean v0, p1, Lv3/a1;->a:Z

    .line 284
    .line 285
    if-eqz v0, :cond_7

    .line 286
    .line 287
    const/16 v0, 0xbb9

    .line 288
    .line 289
    goto :goto_5

    .line 290
    :cond_7
    const/16 v0, 0xbbb

    .line 291
    .line 292
    :goto_5
    move v2, v0

    .line 293
    goto :goto_6

    .line 294
    :cond_8
    const/4 v3, 0x4

    .line 295
    if-ne v0, v3, :cond_a

    .line 296
    .line 297
    iget-boolean v0, p1, Lv3/a1;->a:Z

    .line 298
    .line 299
    if-eqz v0, :cond_9

    .line 300
    .line 301
    const/16 v0, 0xbba

    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_9
    const/16 v0, 0xbbc

    .line 305
    .line 306
    goto :goto_5

    .line 307
    :cond_a
    :goto_6
    invoke-virtual {p0, p1, v2}, Lv3/g0;->k(Ljava/io/IOException;I)V

    .line 308
    .line 309
    .line 310
    goto :goto_9

    .line 311
    :catch_5
    move-exception p1

    .line 312
    iget v0, p1, La4/e$a;->a:I

    .line 313
    .line 314
    :goto_7
    invoke-virtual {p0, p1, v0}, Lv3/g0;->k(Ljava/io/IOException;I)V

    .line 315
    .line 316
    .line 317
    goto :goto_9

    .line 318
    :catch_6
    move-exception p1

    .line 319
    iget v2, p1, Lv3/n;->c:I

    .line 320
    .line 321
    if-ne v2, v1, :cond_b

    .line 322
    .line 323
    iget-object v2, p0, Lv3/g0;->A:Lv3/s0;

    .line 324
    .line 325
    iget-object v2, v2, Lv3/s0;->i:Lv3/q0;

    .line 326
    .line 327
    if-eqz v2, :cond_b

    .line 328
    .line 329
    iget-object v2, v2, Lv3/q0;->f:Lv3/r0;

    .line 330
    .line 331
    iget-object v2, v2, Lv3/r0;->a:Lz4/t$b;

    .line 332
    .line 333
    invoke-virtual {p1, v2}, Lv3/n;->a(Lz4/t$b;)Lv3/n;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    :cond_b
    move-object v4, p1

    .line 338
    iget-boolean p1, v4, Lv3/n;->q:Z

    .line 339
    .line 340
    if-eqz p1, :cond_c

    .line 341
    .line 342
    iget-object p1, p0, Lv3/g0;->W:Lv3/n;

    .line 343
    .line 344
    if-nez p1, :cond_c

    .line 345
    .line 346
    const-string p1, "Recoverable renderer error"

    .line 347
    .line 348
    invoke-static {v0, p1, v4}, Lv5/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 349
    .line 350
    .line 351
    iput-object v4, p0, Lv3/g0;->W:Lv3/n;

    .line 352
    .line 353
    iget-object p1, p0, Lv3/g0;->p:Lv5/k;

    .line 354
    .line 355
    const/16 v0, 0x19

    .line 356
    .line 357
    invoke-interface {p1, v0, v4}, Lv5/k;->k(ILjava/lang/Object;)Lv5/a0$a;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-interface {p1, v0}, Lv5/k;->c(Lv5/k$a;)Z

    .line 362
    .line 363
    .line 364
    goto :goto_9

    .line 365
    :cond_c
    iget-object p1, p0, Lv3/g0;->W:Lv3/n;

    .line 366
    .line 367
    if-eqz p1, :cond_d

    .line 368
    .line 369
    invoke-virtual {p1, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 370
    .line 371
    .line 372
    iget-object v4, p0, Lv3/g0;->W:Lv3/n;

    .line 373
    .line 374
    :cond_d
    :goto_8
    const-string p1, "Playback error"

    .line 375
    .line 376
    invoke-static {v0, p1, v4}, Lv5/m;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {p0, v1, v3}, Lv3/g0;->b0(ZZ)V

    .line 380
    .line 381
    .line 382
    iget-object p1, p0, Lv3/g0;->F:Lv3/d1;

    .line 383
    .line 384
    invoke-virtual {p1, v4}, Lv3/d1;->d(Lv3/n;)Lv3/d1;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    iput-object p1, p0, Lv3/g0;->F:Lv3/d1;

    .line 389
    .line 390
    :goto_9
    invoke-virtual {p0}, Lv3/g0;->u()V

    .line 391
    .line 392
    .line 393
    return v1

    .line 394
    nop

    .line 395
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
.end method

.method public final i(Lv3/r1;)Landroid/util/Pair;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/r1;",
            ")",
            "Landroid/util/Pair<",
            "Lz4/t$b;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lv3/r1;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Lv3/d1;->s:Lz4/t$b;

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-boolean v0, p0, Lv3/g0;->N:Z

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lv3/r1;->a(Z)I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    iget-object v4, p0, Lv3/g0;->s:Lv3/r1$c;

    .line 27
    .line 28
    iget-object v5, p0, Lv3/g0;->t:Lv3/r1$b;

    .line 29
    .line 30
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    move-object v3, p1

    .line 36
    invoke-virtual/range {v3 .. v8}, Lv3/r1;->i(Lv3/r1$c;Lv3/r1$b;IJ)Landroid/util/Pair;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v3, p0, Lv3/g0;->A:Lv3/s0;

    .line 41
    .line 42
    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v3, p1, v4, v1, v2}, Lv3/s0;->n(Lv3/r1;Ljava/lang/Object;J)Lz4/t$b;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ljava/lang/Long;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    invoke-virtual {v3}, Lz4/s;->a()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    iget-object v0, v3, Lz4/s;->a:Ljava/lang/Object;

    .line 63
    .line 64
    iget-object v4, p0, Lv3/g0;->t:Lv3/r1$b;

    .line 65
    .line 66
    invoke-virtual {p1, v0, v4}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 67
    .line 68
    .line 69
    iget p1, v3, Lz4/s;->c:I

    .line 70
    .line 71
    iget-object v0, p0, Lv3/g0;->t:Lv3/r1$b;

    .line 72
    .line 73
    iget v4, v3, Lz4/s;->b:I

    .line 74
    .line 75
    invoke-virtual {v0, v4}, Lv3/r1$b;->f(I)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-ne p1, v0, :cond_1

    .line 80
    .line 81
    iget-object p1, p0, Lv3/g0;->t:Lv3/r1$b;

    .line 82
    .line 83
    iget-object p1, p1, Lv3/r1$b;->o:La5/a;

    .line 84
    .line 85
    iget-wide v1, p1, La5/a;->c:J

    .line 86
    .line 87
    :cond_1
    move-wide v4, v1

    .line 88
    :cond_2
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {v3, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method

.method public final j(Lz4/r;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lv3/g0;->A:Lv3/s0;

    .line 2
    .line 3
    iget-object v0, v0, Lv3/s0;->j:Lv3/q0;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v3, v0, Lv3/q0;->a:Lz4/r;

    .line 10
    .line 11
    if-ne v3, p1, :cond_0

    .line 12
    .line 13
    move p1, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move p1, v2

    .line 16
    :goto_0
    if-nez p1, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    iget-wide v3, p0, Lv3/g0;->T:J

    .line 20
    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    iget-object p1, v0, Lv3/q0;->l:Lv3/q0;

    .line 24
    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    move v1, v2

    .line 29
    :goto_1
    invoke-static {v1}, Lx6/b;->H(Z)V

    .line 30
    .line 31
    .line 32
    iget-boolean p1, v0, Lv3/q0;->d:Z

    .line 33
    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    iget-object p1, v0, Lv3/q0;->a:Lz4/r;

    .line 37
    .line 38
    iget-wide v0, v0, Lv3/q0;->o:J

    .line 39
    .line 40
    sub-long/2addr v3, v0

    .line 41
    invoke-interface {p1, v3, v4}, Lz4/r;->h(J)V

    .line 42
    .line 43
    .line 44
    :cond_3
    invoke-virtual {p0}, Lv3/g0;->t()V

    .line 45
    .line 46
    .line 47
    return-void
    .line 48
    .line 49
    .line 50
    .line 51
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final k(Ljava/io/IOException;I)V
    .locals 2

    .line 1
    new-instance v0, Lv3/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p2, p1}, Lv3/n;-><init>(IILjava/lang/Throwable;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lv3/g0;->A:Lv3/s0;

    .line 8
    .line 9
    iget-object p1, p1, Lv3/s0;->h:Lv3/q0;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, Lv3/q0;->f:Lv3/r0;

    .line 14
    .line 15
    iget-object p1, p1, Lv3/r0;->a:Lz4/t$b;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lv3/n;->a(Lz4/t$b;)Lv3/n;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_0
    const-string p1, "ExoPlayerImplInternal"

    .line 22
    .line 23
    const-string p2, "Playback error"

    .line 24
    .line 25
    invoke-static {p1, p2, v0}, Lv5/m;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v1, v1}, Lv3/g0;->b0(ZZ)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lv3/g0;->F:Lv3/d1;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lv3/d1;->d(Lv3/n;)Lv3/d1;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lv3/g0;->F:Lv3/d1;

    .line 38
    .line 39
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final l(Z)V
    .locals 12

    .line 1
    iget-object v0, p0, Lv3/g0;->A:Lv3/s0;

    .line 2
    .line 3
    iget-object v0, v0, Lv3/s0;->j:Lv3/q0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lv3/g0;->F:Lv3/d1;

    .line 8
    .line 9
    iget-object v1, v1, Lv3/d1;->b:Lz4/t$b;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, v0, Lv3/q0;->f:Lv3/r0;

    .line 13
    .line 14
    iget-object v1, v1, Lv3/r0;->a:Lz4/t$b;

    .line 15
    .line 16
    :goto_0
    iget-object v2, p0, Lv3/g0;->F:Lv3/d1;

    .line 17
    .line 18
    iget-object v2, v2, Lv3/d1;->k:Lz4/t$b;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Lz4/s;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    xor-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    iget-object v3, p0, Lv3/g0;->F:Lv3/d1;

    .line 29
    .line 30
    invoke-virtual {v3, v1}, Lv3/d1;->a(Lz4/t$b;)Lv3/d1;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, p0, Lv3/g0;->F:Lv3/d1;

    .line 35
    .line 36
    :cond_1
    iget-object v1, p0, Lv3/g0;->F:Lv3/d1;

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    iget-wide v3, v1, Lv3/d1;->r:J

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-virtual {v0}, Lv3/q0;->d()J

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    :goto_1
    iput-wide v3, v1, Lv3/d1;->p:J

    .line 48
    .line 49
    iget-object v1, p0, Lv3/g0;->F:Lv3/d1;

    .line 50
    .line 51
    iget-wide v3, v1, Lv3/d1;->p:J

    .line 52
    .line 53
    iget-object v5, p0, Lv3/g0;->A:Lv3/s0;

    .line 54
    .line 55
    iget-object v5, v5, Lv3/s0;->j:Lv3/q0;

    .line 56
    .line 57
    const-wide/16 v6, 0x0

    .line 58
    .line 59
    if-nez v5, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    iget-wide v8, p0, Lv3/g0;->T:J

    .line 63
    .line 64
    iget-wide v10, v5, Lv3/q0;->o:J

    .line 65
    .line 66
    sub-long/2addr v8, v10

    .line 67
    sub-long/2addr v3, v8

    .line 68
    invoke-static {v6, v7, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 69
    .line 70
    .line 71
    move-result-wide v6

    .line 72
    :goto_2
    iput-wide v6, v1, Lv3/d1;->q:J

    .line 73
    .line 74
    if-nez v2, :cond_4

    .line 75
    .line 76
    if-eqz p1, :cond_5

    .line 77
    .line 78
    :cond_4
    if-eqz v0, :cond_5

    .line 79
    .line 80
    iget-boolean p1, v0, Lv3/q0;->d:Z

    .line 81
    .line 82
    if-eqz p1, :cond_5

    .line 83
    .line 84
    iget-object p1, v0, Lv3/q0;->n:Lr5/p;

    .line 85
    .line 86
    iget-object v0, p0, Lv3/g0;->f:Lv3/n0;

    .line 87
    .line 88
    iget-object v1, p0, Lv3/g0;->a:[Lv3/j1;

    .line 89
    .line 90
    iget-object p1, p1, Lr5/p;->c:[Lr5/h;

    .line 91
    .line 92
    invoke-interface {v0, v1, p1}, Lv3/n0;->a([Lv3/j1;[Lr5/h;)V

    .line 93
    .line 94
    .line 95
    :cond_5
    return-void
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method

.method public final m(Lv3/r1;Z)V
    .locals 39

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    move-object/from16 v12, p1

    .line 4
    .line 5
    iget-object v0, v11, Lv3/g0;->F:Lv3/d1;

    .line 6
    .line 7
    iget-object v8, v11, Lv3/g0;->S:Lv3/g0$g;

    .line 8
    .line 9
    iget-object v9, v11, Lv3/g0;->A:Lv3/s0;

    .line 10
    .line 11
    iget v4, v11, Lv3/g0;->M:I

    .line 12
    .line 13
    iget-boolean v10, v11, Lv3/g0;->N:Z

    .line 14
    .line 15
    iget-object v13, v11, Lv3/g0;->s:Lv3/r1$c;

    .line 16
    .line 17
    iget-object v14, v11, Lv3/g0;->t:Lv3/r1$b;

    .line 18
    .line 19
    invoke-virtual/range {p1 .. p1}, Lv3/r1;->p()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    new-instance v0, Lv3/g0$f;

    .line 31
    .line 32
    sget-object v18, Lv3/d1;->s:Lz4/t$b;

    .line 33
    .line 34
    const-wide/16 v19, 0x0

    .line 35
    .line 36
    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    const/16 v23, 0x0

    .line 42
    .line 43
    const/16 v24, 0x1

    .line 44
    .line 45
    const/16 v25, 0x0

    .line 46
    .line 47
    move-object/from16 v17, v0

    .line 48
    .line 49
    invoke-direct/range {v17 .. v25}, Lv3/g0$f;-><init>(Lz4/t$b;JJZZZ)V

    .line 50
    .line 51
    .line 52
    move-object v7, v0

    .line 53
    const/4 v8, -0x1

    .line 54
    goto/16 :goto_16

    .line 55
    .line 56
    :cond_0
    iget-object v2, v0, Lv3/d1;->b:Lz4/t$b;

    .line 57
    .line 58
    iget-object v1, v2, Lz4/s;->a:Ljava/lang/Object;

    .line 59
    .line 60
    iget-object v3, v0, Lv3/d1;->a:Lv3/r1;

    .line 61
    .line 62
    invoke-virtual {v3}, Lv3/r1;->p()Z

    .line 63
    .line 64
    .line 65
    move-result v18

    .line 66
    if-nez v18, :cond_2

    .line 67
    .line 68
    iget-object v5, v2, Lz4/s;->a:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {v3, v5, v14}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    iget-boolean v3, v3, Lv3/r1$b;->f:Z

    .line 75
    .line 76
    if-eqz v3, :cond_1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    const/16 v19, 0x0

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    :goto_0
    const/16 v19, 0x1

    .line 83
    .line 84
    :goto_1
    iget-object v3, v0, Lv3/d1;->b:Lz4/t$b;

    .line 85
    .line 86
    invoke-virtual {v3}, Lz4/s;->a()Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-nez v3, :cond_4

    .line 91
    .line 92
    if-eqz v19, :cond_3

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    iget-wide v6, v0, Lv3/d1;->r:J

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_4
    :goto_2
    iget-wide v6, v0, Lv3/d1;->c:J

    .line 99
    .line 100
    :goto_3
    move-wide/from16 v22, v6

    .line 101
    .line 102
    if-eqz v8, :cond_8

    .line 103
    .line 104
    const/4 v3, 0x1

    .line 105
    move-object v7, v1

    .line 106
    move-object/from16 v1, p1

    .line 107
    .line 108
    move-object v6, v2

    .line 109
    move-object v2, v8

    .line 110
    const/4 v5, 0x0

    .line 111
    move v5, v10

    .line 112
    move-object/from16 v26, v6

    .line 113
    .line 114
    move-object v6, v13

    .line 115
    move-object/from16 v27, v7

    .line 116
    .line 117
    move-object v7, v14

    .line 118
    invoke-static/range {v1 .. v7}, Lv3/g0;->F(Lv3/r1;Lv3/g0$g;ZIZLv3/r1$c;Lv3/r1$b;)Landroid/util/Pair;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-nez v1, :cond_5

    .line 123
    .line 124
    invoke-virtual {v12, v10}, Lv3/r1;->a(Z)I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    move-wide/from16 v4, v22

    .line 129
    .line 130
    const/4 v2, 0x0

    .line 131
    const/4 v3, 0x0

    .line 132
    const/4 v6, 0x1

    .line 133
    const/4 v8, 0x4

    .line 134
    goto :goto_6

    .line 135
    :cond_5
    iget-wide v2, v8, Lv3/g0$g;->c:J

    .line 136
    .line 137
    cmp-long v2, v2, v15

    .line 138
    .line 139
    if-nez v2, :cond_6

    .line 140
    .line 141
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 142
    .line 143
    invoke-virtual {v12, v1, v14}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    iget v6, v1, Lv3/r1$b;->c:I

    .line 148
    .line 149
    move-wide/from16 v3, v22

    .line 150
    .line 151
    move-object/from16 v1, v27

    .line 152
    .line 153
    const/4 v5, 0x0

    .line 154
    goto :goto_4

    .line 155
    :cond_6
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 156
    .line 157
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v1, Ljava/lang/Long;

    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 162
    .line 163
    .line 164
    move-result-wide v3

    .line 165
    move-object v1, v2

    .line 166
    const/4 v5, 0x1

    .line 167
    const/4 v6, -0x1

    .line 168
    :goto_4
    iget v2, v0, Lv3/d1;->e:I

    .line 169
    .line 170
    const/4 v8, 0x4

    .line 171
    if-ne v2, v8, :cond_7

    .line 172
    .line 173
    const/4 v2, 0x1

    .line 174
    goto :goto_5

    .line 175
    :cond_7
    const/4 v2, 0x0

    .line 176
    :goto_5
    move-object/from16 v27, v1

    .line 177
    .line 178
    move v1, v6

    .line 179
    const/4 v6, 0x0

    .line 180
    move-wide/from16 v37, v3

    .line 181
    .line 182
    move v3, v5

    .line 183
    move-wide/from16 v4, v37

    .line 184
    .line 185
    :goto_6
    move/from16 v37, v3

    .line 186
    .line 187
    move v3, v2

    .line 188
    move/from16 v2, v37

    .line 189
    .line 190
    goto :goto_7

    .line 191
    :cond_8
    move-object/from16 v27, v1

    .line 192
    .line 193
    move-object/from16 v26, v2

    .line 194
    .line 195
    const/4 v8, 0x4

    .line 196
    iget-object v1, v0, Lv3/d1;->a:Lv3/r1;

    .line 197
    .line 198
    invoke-virtual {v1}, Lv3/r1;->p()Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-eqz v1, :cond_9

    .line 203
    .line 204
    invoke-virtual {v12, v10}, Lv3/r1;->a(Z)I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    move-wide/from16 v4, v22

    .line 209
    .line 210
    const/4 v2, 0x0

    .line 211
    const/4 v3, 0x0

    .line 212
    const/4 v6, 0x0

    .line 213
    :goto_7
    move/from16 v36, v2

    .line 214
    .line 215
    move/from16 v34, v3

    .line 216
    .line 217
    move-wide v2, v4

    .line 218
    move/from16 v35, v6

    .line 219
    .line 220
    move-object/from16 v7, v26

    .line 221
    .line 222
    const/4 v5, -0x1

    .line 223
    move v4, v1

    .line 224
    move-object/from16 v1, v27

    .line 225
    .line 226
    goto/16 :goto_c

    .line 227
    .line 228
    :cond_9
    move-object/from16 v7, v27

    .line 229
    .line 230
    invoke-virtual {v12, v7}, Lv3/r1;->b(Ljava/lang/Object;)I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    const/4 v6, -0x1

    .line 235
    if-ne v1, v6, :cond_b

    .line 236
    .line 237
    iget-object v5, v0, Lv3/d1;->a:Lv3/r1;

    .line 238
    .line 239
    move-object v1, v13

    .line 240
    move-object v2, v14

    .line 241
    move v3, v4

    .line 242
    move v4, v10

    .line 243
    move-object/from16 v17, v5

    .line 244
    .line 245
    move-object v5, v7

    .line 246
    move v8, v6

    .line 247
    move-object/from16 v6, v17

    .line 248
    .line 249
    move-object v8, v7

    .line 250
    move-object/from16 v7, p1

    .line 251
    .line 252
    invoke-static/range {v1 .. v7}, Lv3/g0;->G(Lv3/r1$c;Lv3/r1$b;IZLjava/lang/Object;Lv3/r1;Lv3/r1;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    if-nez v1, :cond_a

    .line 257
    .line 258
    invoke-virtual {v12, v10}, Lv3/r1;->a(Z)I

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    const/4 v5, 0x1

    .line 263
    goto :goto_8

    .line 264
    :cond_a
    invoke-virtual {v12, v1, v14}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    iget v1, v1, Lv3/r1$b;->c:I

    .line 269
    .line 270
    const/4 v5, 0x0

    .line 271
    :goto_8
    move v6, v1

    .line 272
    move v3, v5

    .line 273
    goto :goto_9

    .line 274
    :cond_b
    move-object v8, v7

    .line 275
    cmp-long v1, v22, v15

    .line 276
    .line 277
    if-nez v1, :cond_c

    .line 278
    .line 279
    invoke-virtual {v12, v8, v14}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    iget v1, v1, Lv3/r1$b;->c:I

    .line 284
    .line 285
    move v6, v1

    .line 286
    const/4 v3, 0x0

    .line 287
    :goto_9
    move-object/from16 v7, v26

    .line 288
    .line 289
    goto :goto_b

    .line 290
    :cond_c
    if-eqz v19, :cond_e

    .line 291
    .line 292
    iget-object v1, v0, Lv3/d1;->a:Lv3/r1;

    .line 293
    .line 294
    move-object/from16 v7, v26

    .line 295
    .line 296
    iget-object v2, v7, Lz4/s;->a:Ljava/lang/Object;

    .line 297
    .line 298
    invoke-virtual {v1, v2, v14}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 299
    .line 300
    .line 301
    iget-object v1, v0, Lv3/d1;->a:Lv3/r1;

    .line 302
    .line 303
    iget v2, v14, Lv3/r1$b;->c:I

    .line 304
    .line 305
    invoke-virtual {v1, v2, v13}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    iget v1, v1, Lv3/r1$c;->w:I

    .line 310
    .line 311
    iget-object v2, v0, Lv3/d1;->a:Lv3/r1;

    .line 312
    .line 313
    iget-object v3, v7, Lz4/s;->a:Ljava/lang/Object;

    .line 314
    .line 315
    invoke-virtual {v2, v3}, Lv3/r1;->b(Ljava/lang/Object;)I

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    if-ne v1, v2, :cond_d

    .line 320
    .line 321
    iget-wide v1, v14, Lv3/r1$b;->e:J

    .line 322
    .line 323
    add-long v5, v22, v1

    .line 324
    .line 325
    invoke-virtual {v12, v8, v14}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    iget v4, v1, Lv3/r1$b;->c:I

    .line 330
    .line 331
    move-object/from16 v1, p1

    .line 332
    .line 333
    move-object v2, v13

    .line 334
    move-object v3, v14

    .line 335
    invoke-virtual/range {v1 .. v6}, Lv3/r1;->i(Lv3/r1$c;Lv3/r1$b;IJ)Landroid/util/Pair;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 340
    .line 341
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v1, Ljava/lang/Long;

    .line 344
    .line 345
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 346
    .line 347
    .line 348
    move-result-wide v3

    .line 349
    move-object v1, v2

    .line 350
    move-wide v4, v3

    .line 351
    goto :goto_a

    .line 352
    :cond_d
    move-object v1, v8

    .line 353
    move-wide/from16 v4, v22

    .line 354
    .line 355
    :goto_a
    move-wide v2, v4

    .line 356
    const/4 v4, -0x1

    .line 357
    const/4 v5, -0x1

    .line 358
    const/16 v34, 0x0

    .line 359
    .line 360
    const/16 v35, 0x0

    .line 361
    .line 362
    const/16 v36, 0x1

    .line 363
    .line 364
    goto :goto_c

    .line 365
    :cond_e
    move-object/from16 v7, v26

    .line 366
    .line 367
    const/4 v3, 0x0

    .line 368
    const/4 v6, -0x1

    .line 369
    :goto_b
    move/from16 v35, v3

    .line 370
    .line 371
    move v4, v6

    .line 372
    move-object v1, v8

    .line 373
    move-wide/from16 v2, v22

    .line 374
    .line 375
    const/4 v5, -0x1

    .line 376
    const/16 v34, 0x0

    .line 377
    .line 378
    const/16 v36, 0x0

    .line 379
    .line 380
    :goto_c
    if-eq v4, v5, :cond_f

    .line 381
    .line 382
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    move-object/from16 v1, p1

    .line 388
    .line 389
    move-object v2, v13

    .line 390
    move-object v3, v14

    .line 391
    invoke-virtual/range {v1 .. v6}, Lv3/r1;->i(Lv3/r1$c;Lv3/r1$b;IJ)Landroid/util/Pair;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 396
    .line 397
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v1, Ljava/lang/Long;

    .line 400
    .line 401
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 402
    .line 403
    .line 404
    move-result-wide v3

    .line 405
    move-object v1, v2

    .line 406
    move-wide v2, v3

    .line 407
    move-wide/from16 v32, v15

    .line 408
    .line 409
    goto :goto_d

    .line 410
    :cond_f
    move-wide/from16 v32, v2

    .line 411
    .line 412
    :goto_d
    invoke-virtual {v9, v12, v1, v2, v3}, Lv3/s0;->n(Lv3/r1;Ljava/lang/Object;J)Lz4/t$b;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    iget v5, v4, Lz4/s;->e:I

    .line 417
    .line 418
    const/4 v8, -0x1

    .line 419
    if-eq v5, v8, :cond_11

    .line 420
    .line 421
    iget v6, v7, Lz4/s;->e:I

    .line 422
    .line 423
    if-eq v6, v8, :cond_10

    .line 424
    .line 425
    if-lt v5, v6, :cond_10

    .line 426
    .line 427
    goto :goto_e

    .line 428
    :cond_10
    const/4 v5, 0x0

    .line 429
    goto :goto_f

    .line 430
    :cond_11
    :goto_e
    const/4 v5, 0x1

    .line 431
    :goto_f
    iget-object v6, v7, Lz4/s;->a:Ljava/lang/Object;

    .line 432
    .line 433
    invoke-virtual {v6, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    move-result v6

    .line 437
    if-eqz v6, :cond_12

    .line 438
    .line 439
    invoke-virtual {v7}, Lz4/s;->a()Z

    .line 440
    .line 441
    .line 442
    move-result v6

    .line 443
    if-nez v6, :cond_12

    .line 444
    .line 445
    invoke-virtual {v4}, Lz4/s;->a()Z

    .line 446
    .line 447
    .line 448
    move-result v6

    .line 449
    if-nez v6, :cond_12

    .line 450
    .line 451
    if-eqz v5, :cond_12

    .line 452
    .line 453
    const/4 v5, 0x1

    .line 454
    goto :goto_10

    .line 455
    :cond_12
    const/4 v5, 0x0

    .line 456
    :goto_10
    invoke-virtual {v12, v1, v14}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    if-nez v19, :cond_15

    .line 461
    .line 462
    cmp-long v6, v22, v32

    .line 463
    .line 464
    if-nez v6, :cond_15

    .line 465
    .line 466
    iget-object v6, v7, Lz4/s;->a:Ljava/lang/Object;

    .line 467
    .line 468
    iget-object v9, v4, Lz4/s;->a:Ljava/lang/Object;

    .line 469
    .line 470
    invoke-virtual {v6, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v6

    .line 474
    if-nez v6, :cond_13

    .line 475
    .line 476
    goto :goto_12

    .line 477
    :cond_13
    invoke-virtual {v7}, Lz4/s;->a()Z

    .line 478
    .line 479
    .line 480
    move-result v6

    .line 481
    if-eqz v6, :cond_14

    .line 482
    .line 483
    iget v6, v7, Lz4/s;->b:I

    .line 484
    .line 485
    invoke-virtual {v1, v6}, Lv3/r1$b;->g(I)Z

    .line 486
    .line 487
    .line 488
    move-result v6

    .line 489
    if-eqz v6, :cond_14

    .line 490
    .line 491
    iget v6, v7, Lz4/s;->b:I

    .line 492
    .line 493
    iget v9, v7, Lz4/s;->c:I

    .line 494
    .line 495
    invoke-virtual {v1, v6, v9}, Lv3/r1$b;->e(II)I

    .line 496
    .line 497
    .line 498
    move-result v6

    .line 499
    const/4 v9, 0x4

    .line 500
    if-eq v6, v9, :cond_15

    .line 501
    .line 502
    iget v6, v7, Lz4/s;->b:I

    .line 503
    .line 504
    iget v9, v7, Lz4/s;->c:I

    .line 505
    .line 506
    invoke-virtual {v1, v6, v9}, Lv3/r1$b;->e(II)I

    .line 507
    .line 508
    .line 509
    move-result v1

    .line 510
    const/4 v6, 0x2

    .line 511
    if-eq v1, v6, :cond_15

    .line 512
    .line 513
    goto :goto_11

    .line 514
    :cond_14
    invoke-virtual {v4}, Lz4/s;->a()Z

    .line 515
    .line 516
    .line 517
    move-result v6

    .line 518
    if-eqz v6, :cond_15

    .line 519
    .line 520
    iget v6, v4, Lz4/s;->b:I

    .line 521
    .line 522
    invoke-virtual {v1, v6}, Lv3/r1$b;->g(I)Z

    .line 523
    .line 524
    .line 525
    move-result v1

    .line 526
    if-eqz v1, :cond_15

    .line 527
    .line 528
    :goto_11
    const/4 v1, 0x1

    .line 529
    goto :goto_13

    .line 530
    :cond_15
    :goto_12
    const/4 v1, 0x0

    .line 531
    :goto_13
    if-nez v5, :cond_16

    .line 532
    .line 533
    if-eqz v1, :cond_17

    .line 534
    .line 535
    :cond_16
    move-object v4, v7

    .line 536
    :cond_17
    invoke-virtual {v4}, Lz4/s;->a()Z

    .line 537
    .line 538
    .line 539
    move-result v1

    .line 540
    if-eqz v1, :cond_1a

    .line 541
    .line 542
    invoke-virtual {v4, v7}, Lz4/s;->equals(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    move-result v1

    .line 546
    if-eqz v1, :cond_18

    .line 547
    .line 548
    iget-wide v0, v0, Lv3/d1;->r:J

    .line 549
    .line 550
    goto :goto_14

    .line 551
    :cond_18
    iget-object v0, v4, Lz4/s;->a:Ljava/lang/Object;

    .line 552
    .line 553
    invoke-virtual {v12, v0, v14}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 554
    .line 555
    .line 556
    iget v0, v4, Lz4/s;->c:I

    .line 557
    .line 558
    iget v1, v4, Lz4/s;->b:I

    .line 559
    .line 560
    invoke-virtual {v14, v1}, Lv3/r1$b;->f(I)I

    .line 561
    .line 562
    .line 563
    move-result v1

    .line 564
    if-ne v0, v1, :cond_19

    .line 565
    .line 566
    iget-object v0, v14, Lv3/r1$b;->o:La5/a;

    .line 567
    .line 568
    iget-wide v0, v0, La5/a;->c:J

    .line 569
    .line 570
    goto :goto_14

    .line 571
    :cond_19
    const-wide/16 v0, 0x0

    .line 572
    .line 573
    :goto_14
    move-wide/from16 v30, v0

    .line 574
    .line 575
    goto :goto_15

    .line 576
    :cond_1a
    move-wide/from16 v30, v2

    .line 577
    .line 578
    :goto_15
    new-instance v0, Lv3/g0$f;

    .line 579
    .line 580
    move-object/from16 v28, v0

    .line 581
    .line 582
    move-object/from16 v29, v4

    .line 583
    .line 584
    invoke-direct/range {v28 .. v36}, Lv3/g0$f;-><init>(Lz4/t$b;JJZZZ)V

    .line 585
    .line 586
    .line 587
    move-object v7, v0

    .line 588
    :goto_16
    iget-object v9, v7, Lv3/g0$f;->a:Lz4/t$b;

    .line 589
    .line 590
    iget-wide v13, v7, Lv3/g0$f;->c:J

    .line 591
    .line 592
    iget-boolean v6, v7, Lv3/g0$f;->d:Z

    .line 593
    .line 594
    iget-wide v3, v7, Lv3/g0$f;->b:J

    .line 595
    .line 596
    iget-object v0, v11, Lv3/g0;->F:Lv3/d1;

    .line 597
    .line 598
    iget-object v0, v0, Lv3/d1;->b:Lz4/t$b;

    .line 599
    .line 600
    invoke-virtual {v0, v9}, Lz4/s;->equals(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    move-result v0

    .line 604
    if-eqz v0, :cond_1c

    .line 605
    .line 606
    iget-object v0, v11, Lv3/g0;->F:Lv3/d1;

    .line 607
    .line 608
    iget-wide v0, v0, Lv3/d1;->r:J

    .line 609
    .line 610
    cmp-long v0, v3, v0

    .line 611
    .line 612
    if-eqz v0, :cond_1b

    .line 613
    .line 614
    goto :goto_17

    .line 615
    :cond_1b
    const/4 v10, 0x0

    .line 616
    goto :goto_18

    .line 617
    :cond_1c
    :goto_17
    const/4 v10, 0x1

    .line 618
    :goto_18
    const/16 v17, 0x3

    .line 619
    .line 620
    :try_start_0
    iget-boolean v0, v7, Lv3/g0$f;->e:Z

    .line 621
    .line 622
    if-eqz v0, :cond_1e

    .line 623
    .line 624
    iget-object v0, v11, Lv3/g0;->F:Lv3/d1;

    .line 625
    .line 626
    iget v0, v0, Lv3/d1;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 627
    .line 628
    const/4 v2, 0x1

    .line 629
    const/4 v1, 0x4

    .line 630
    if-eq v0, v2, :cond_1d

    .line 631
    .line 632
    :try_start_1
    invoke-virtual {v11, v1}, Lv3/g0;->X(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 633
    .line 634
    .line 635
    goto :goto_19

    .line 636
    :catchall_0
    move-exception v0

    .line 637
    const/4 v15, 0x0

    .line 638
    goto :goto_1a

    .line 639
    :cond_1d
    :goto_19
    const/4 v15, 0x0

    .line 640
    :try_start_2
    invoke-virtual {v11, v15, v15, v15, v2}, Lv3/g0;->B(ZZZZ)V

    .line 641
    .line 642
    .line 643
    goto :goto_1b

    .line 644
    :goto_1a
    move/from16 v22, v1

    .line 645
    .line 646
    move/from16 v23, v2

    .line 647
    .line 648
    move-wide/from16 v24, v3

    .line 649
    .line 650
    goto/16 :goto_22

    .line 651
    .line 652
    :cond_1e
    const/4 v1, 0x4

    .line 653
    const/4 v2, 0x1

    .line 654
    const/4 v15, 0x0

    .line 655
    :goto_1b
    if-nez v10, :cond_1f

    .line 656
    .line 657
    iget-object v0, v11, Lv3/g0;->A:Lv3/s0;

    .line 658
    .line 659
    iget-wide v5, v11, Lv3/g0;->T:J

    .line 660
    .line 661
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->h()J

    .line 662
    .line 663
    .line 664
    move-result-wide v20
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 665
    move/from16 v22, v1

    .line 666
    .line 667
    move-object v1, v0

    .line 668
    move/from16 v23, v2

    .line 669
    .line 670
    move-object/from16 v2, p1

    .line 671
    .line 672
    move-wide/from16 v24, v3

    .line 673
    .line 674
    move-wide v3, v5

    .line 675
    move-wide/from16 v5, v20

    .line 676
    .line 677
    :try_start_3
    invoke-virtual/range {v1 .. v6}, Lv3/s0;->p(Lv3/r1;JJ)Z

    .line 678
    .line 679
    .line 680
    move-result v0

    .line 681
    if-nez v0, :cond_23

    .line 682
    .line 683
    invoke-virtual {v11, v15}, Lv3/g0;->I(Z)V

    .line 684
    .line 685
    .line 686
    goto :goto_1e

    .line 687
    :catchall_1
    move-exception v0

    .line 688
    goto :goto_1a

    .line 689
    :cond_1f
    move/from16 v22, v1

    .line 690
    .line 691
    move/from16 v23, v2

    .line 692
    .line 693
    move-wide/from16 v24, v3

    .line 694
    .line 695
    invoke-virtual/range {p1 .. p1}, Lv3/r1;->p()Z

    .line 696
    .line 697
    .line 698
    move-result v0

    .line 699
    if-nez v0, :cond_23

    .line 700
    .line 701
    iget-object v0, v11, Lv3/g0;->A:Lv3/s0;

    .line 702
    .line 703
    iget-object v0, v0, Lv3/s0;->h:Lv3/q0;

    .line 704
    .line 705
    :goto_1c
    if-eqz v0, :cond_21

    .line 706
    .line 707
    iget-object v1, v0, Lv3/q0;->f:Lv3/r0;

    .line 708
    .line 709
    iget-object v1, v1, Lv3/r0;->a:Lz4/t$b;

    .line 710
    .line 711
    invoke-virtual {v1, v9}, Lz4/s;->equals(Ljava/lang/Object;)Z

    .line 712
    .line 713
    .line 714
    move-result v1

    .line 715
    if-eqz v1, :cond_20

    .line 716
    .line 717
    iget-object v1, v11, Lv3/g0;->A:Lv3/s0;

    .line 718
    .line 719
    iget-object v2, v0, Lv3/q0;->f:Lv3/r0;

    .line 720
    .line 721
    invoke-virtual {v1, v12, v2}, Lv3/s0;->h(Lv3/r1;Lv3/r0;)Lv3/r0;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    iput-object v1, v0, Lv3/q0;->f:Lv3/r0;

    .line 726
    .line 727
    invoke-virtual {v0}, Lv3/q0;->h()V

    .line 728
    .line 729
    .line 730
    :cond_20
    iget-object v0, v0, Lv3/q0;->l:Lv3/q0;

    .line 731
    .line 732
    goto :goto_1c

    .line 733
    :cond_21
    iget-object v0, v11, Lv3/g0;->A:Lv3/s0;

    .line 734
    .line 735
    iget-object v1, v0, Lv3/s0;->h:Lv3/q0;

    .line 736
    .line 737
    iget-object v0, v0, Lv3/s0;->i:Lv3/q0;

    .line 738
    .line 739
    if-eq v1, v0, :cond_22

    .line 740
    .line 741
    move/from16 v5, v23

    .line 742
    .line 743
    goto :goto_1d

    .line 744
    :cond_22
    move v5, v15

    .line 745
    :goto_1d
    move-object/from16 v1, p0

    .line 746
    .line 747
    move-object v2, v9

    .line 748
    move-wide/from16 v3, v24

    .line 749
    .line 750
    invoke-virtual/range {v1 .. v6}, Lv3/g0;->K(Lz4/t$b;JZZ)J

    .line 751
    .line 752
    .line 753
    move-result-wide v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 754
    move-wide/from16 v24, v0

    .line 755
    .line 756
    :cond_23
    :goto_1e
    iget-object v0, v11, Lv3/g0;->F:Lv3/d1;

    .line 757
    .line 758
    iget-object v4, v0, Lv3/d1;->a:Lv3/r1;

    .line 759
    .line 760
    iget-object v5, v0, Lv3/d1;->b:Lz4/t$b;

    .line 761
    .line 762
    iget-boolean v0, v7, Lv3/g0$f;->f:Z

    .line 763
    .line 764
    if-eqz v0, :cond_24

    .line 765
    .line 766
    move-wide/from16 v6, v24

    .line 767
    .line 768
    goto :goto_1f

    .line 769
    :cond_24
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    :goto_1f
    const/4 v0, 0x0

    .line 775
    move-object/from16 v1, p0

    .line 776
    .line 777
    move-object/from16 v2, p1

    .line 778
    .line 779
    move-object v3, v9

    .line 780
    move v15, v8

    .line 781
    move/from16 v16, v22

    .line 782
    .line 783
    move v8, v0

    .line 784
    invoke-virtual/range {v1 .. v8}, Lv3/g0;->f0(Lv3/r1;Lz4/t$b;Lv3/r1;Lz4/t$b;JZ)V

    .line 785
    .line 786
    .line 787
    if-nez v10, :cond_25

    .line 788
    .line 789
    iget-object v0, v11, Lv3/g0;->F:Lv3/d1;

    .line 790
    .line 791
    iget-wide v0, v0, Lv3/d1;->c:J

    .line 792
    .line 793
    cmp-long v0, v13, v0

    .line 794
    .line 795
    if-eqz v0, :cond_28

    .line 796
    .line 797
    :cond_25
    iget-object v0, v11, Lv3/g0;->F:Lv3/d1;

    .line 798
    .line 799
    iget-object v1, v0, Lv3/d1;->b:Lz4/t$b;

    .line 800
    .line 801
    iget-object v1, v1, Lz4/s;->a:Ljava/lang/Object;

    .line 802
    .line 803
    iget-object v0, v0, Lv3/d1;->a:Lv3/r1;

    .line 804
    .line 805
    if-eqz v10, :cond_26

    .line 806
    .line 807
    if-eqz p2, :cond_26

    .line 808
    .line 809
    invoke-virtual {v0}, Lv3/r1;->p()Z

    .line 810
    .line 811
    .line 812
    move-result v2

    .line 813
    if-nez v2, :cond_26

    .line 814
    .line 815
    iget-object v2, v11, Lv3/g0;->t:Lv3/r1$b;

    .line 816
    .line 817
    invoke-virtual {v0, v1, v2}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    iget-boolean v0, v0, Lv3/r1$b;->f:Z

    .line 822
    .line 823
    if-nez v0, :cond_26

    .line 824
    .line 825
    goto :goto_20

    .line 826
    :cond_26
    const/16 v23, 0x0

    .line 827
    .line 828
    :goto_20
    iget-object v0, v11, Lv3/g0;->F:Lv3/d1;

    .line 829
    .line 830
    iget-wide v7, v0, Lv3/d1;->d:J

    .line 831
    .line 832
    invoke-virtual {v12, v1}, Lv3/r1;->b(Ljava/lang/Object;)I

    .line 833
    .line 834
    .line 835
    move-result v0

    .line 836
    if-ne v0, v15, :cond_27

    .line 837
    .line 838
    move/from16 v10, v16

    .line 839
    .line 840
    goto :goto_21

    .line 841
    :cond_27
    move/from16 v10, v17

    .line 842
    .line 843
    :goto_21
    move-object/from16 v1, p0

    .line 844
    .line 845
    move-object v2, v9

    .line 846
    move-wide/from16 v3, v24

    .line 847
    .line 848
    move-wide v5, v13

    .line 849
    move/from16 v9, v23

    .line 850
    .line 851
    invoke-virtual/range {v1 .. v10}, Lv3/g0;->p(Lz4/t$b;JJJZI)Lv3/d1;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    iput-object v0, v11, Lv3/g0;->F:Lv3/d1;

    .line 856
    .line 857
    :cond_28
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->C()V

    .line 858
    .line 859
    .line 860
    iget-object v0, v11, Lv3/g0;->F:Lv3/d1;

    .line 861
    .line 862
    iget-object v0, v0, Lv3/d1;->a:Lv3/r1;

    .line 863
    .line 864
    invoke-virtual {v11, v12, v0}, Lv3/g0;->E(Lv3/r1;Lv3/r1;)V

    .line 865
    .line 866
    .line 867
    iget-object v0, v11, Lv3/g0;->F:Lv3/d1;

    .line 868
    .line 869
    invoke-virtual {v0, v12}, Lv3/d1;->g(Lv3/r1;)Lv3/d1;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    iput-object v0, v11, Lv3/g0;->F:Lv3/d1;

    .line 874
    .line 875
    invoke-virtual/range {p1 .. p1}, Lv3/r1;->p()Z

    .line 876
    .line 877
    .line 878
    move-result v0

    .line 879
    if-nez v0, :cond_29

    .line 880
    .line 881
    const/4 v8, 0x0

    .line 882
    iput-object v8, v11, Lv3/g0;->S:Lv3/g0$g;

    .line 883
    .line 884
    :cond_29
    const/4 v1, 0x0

    .line 885
    invoke-virtual {v11, v1}, Lv3/g0;->l(Z)V

    .line 886
    .line 887
    .line 888
    return-void

    .line 889
    :catchall_2
    move-exception v0

    .line 890
    :goto_22
    move v15, v8

    .line 891
    move/from16 v16, v22

    .line 892
    .line 893
    const/4 v8, 0x0

    .line 894
    goto :goto_23

    .line 895
    :catchall_3
    move-exception v0

    .line 896
    move-wide/from16 v24, v3

    .line 897
    .line 898
    move v15, v8

    .line 899
    const/4 v8, 0x0

    .line 900
    const/16 v16, 0x4

    .line 901
    .line 902
    const/16 v23, 0x1

    .line 903
    .line 904
    :goto_23
    iget-object v1, v11, Lv3/g0;->F:Lv3/d1;

    .line 905
    .line 906
    iget-object v4, v1, Lv3/d1;->a:Lv3/r1;

    .line 907
    .line 908
    iget-object v5, v1, Lv3/d1;->b:Lz4/t$b;

    .line 909
    .line 910
    iget-boolean v1, v7, Lv3/g0$f;->f:Z

    .line 911
    .line 912
    if-eqz v1, :cond_2a

    .line 913
    .line 914
    move-wide/from16 v6, v24

    .line 915
    .line 916
    goto :goto_24

    .line 917
    :cond_2a
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    :goto_24
    const/16 v18, 0x0

    .line 923
    .line 924
    move-object/from16 v1, p0

    .line 925
    .line 926
    move-object/from16 v2, p1

    .line 927
    .line 928
    move-object v3, v9

    .line 929
    move/from16 v8, v18

    .line 930
    .line 931
    invoke-virtual/range {v1 .. v8}, Lv3/g0;->f0(Lv3/r1;Lz4/t$b;Lv3/r1;Lz4/t$b;JZ)V

    .line 932
    .line 933
    .line 934
    if-nez v10, :cond_2b

    .line 935
    .line 936
    iget-object v1, v11, Lv3/g0;->F:Lv3/d1;

    .line 937
    .line 938
    iget-wide v1, v1, Lv3/d1;->c:J

    .line 939
    .line 940
    cmp-long v1, v13, v1

    .line 941
    .line 942
    if-eqz v1, :cond_2e

    .line 943
    .line 944
    :cond_2b
    iget-object v1, v11, Lv3/g0;->F:Lv3/d1;

    .line 945
    .line 946
    iget-object v2, v1, Lv3/d1;->b:Lz4/t$b;

    .line 947
    .line 948
    iget-object v2, v2, Lz4/s;->a:Ljava/lang/Object;

    .line 949
    .line 950
    iget-object v1, v1, Lv3/d1;->a:Lv3/r1;

    .line 951
    .line 952
    if-eqz v10, :cond_2c

    .line 953
    .line 954
    if-eqz p2, :cond_2c

    .line 955
    .line 956
    invoke-virtual {v1}, Lv3/r1;->p()Z

    .line 957
    .line 958
    .line 959
    move-result v3

    .line 960
    if-nez v3, :cond_2c

    .line 961
    .line 962
    iget-object v3, v11, Lv3/g0;->t:Lv3/r1$b;

    .line 963
    .line 964
    invoke-virtual {v1, v2, v3}, Lv3/r1;->g(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;

    .line 965
    .line 966
    .line 967
    move-result-object v1

    .line 968
    iget-boolean v1, v1, Lv3/r1$b;->f:Z

    .line 969
    .line 970
    if-nez v1, :cond_2c

    .line 971
    .line 972
    goto :goto_25

    .line 973
    :cond_2c
    const/16 v23, 0x0

    .line 974
    .line 975
    :goto_25
    iget-object v1, v11, Lv3/g0;->F:Lv3/d1;

    .line 976
    .line 977
    iget-wide v7, v1, Lv3/d1;->d:J

    .line 978
    .line 979
    invoke-virtual {v12, v2}, Lv3/r1;->b(Ljava/lang/Object;)I

    .line 980
    .line 981
    .line 982
    move-result v1

    .line 983
    if-ne v1, v15, :cond_2d

    .line 984
    .line 985
    move/from16 v10, v16

    .line 986
    .line 987
    goto :goto_26

    .line 988
    :cond_2d
    move/from16 v10, v17

    .line 989
    .line 990
    :goto_26
    move-object/from16 v1, p0

    .line 991
    .line 992
    move-object v2, v9

    .line 993
    move-wide/from16 v3, v24

    .line 994
    .line 995
    move-wide v5, v13

    .line 996
    move/from16 v9, v23

    .line 997
    .line 998
    invoke-virtual/range {v1 .. v10}, Lv3/g0;->p(Lz4/t$b;JJJZI)Lv3/d1;

    .line 999
    .line 1000
    .line 1001
    move-result-object v1

    .line 1002
    iput-object v1, v11, Lv3/g0;->F:Lv3/d1;

    .line 1003
    .line 1004
    :cond_2e
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->C()V

    .line 1005
    .line 1006
    .line 1007
    iget-object v1, v11, Lv3/g0;->F:Lv3/d1;

    .line 1008
    .line 1009
    iget-object v1, v1, Lv3/d1;->a:Lv3/r1;

    .line 1010
    .line 1011
    invoke-virtual {v11, v12, v1}, Lv3/g0;->E(Lv3/r1;Lv3/r1;)V

    .line 1012
    .line 1013
    .line 1014
    iget-object v1, v11, Lv3/g0;->F:Lv3/d1;

    .line 1015
    .line 1016
    invoke-virtual {v1, v12}, Lv3/d1;->g(Lv3/r1;)Lv3/d1;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v1

    .line 1020
    iput-object v1, v11, Lv3/g0;->F:Lv3/d1;

    .line 1021
    .line 1022
    invoke-virtual/range {p1 .. p1}, Lv3/r1;->p()Z

    .line 1023
    .line 1024
    .line 1025
    move-result v1

    .line 1026
    if-nez v1, :cond_2f

    .line 1027
    .line 1028
    const/4 v1, 0x0

    .line 1029
    iput-object v1, v11, Lv3/g0;->S:Lv3/g0$g;

    .line 1030
    .line 1031
    :cond_2f
    const/4 v1, 0x0

    .line 1032
    invoke-virtual {v11, v1}, Lv3/g0;->l(Z)V

    .line 1033
    .line 1034
    .line 1035
    throw v0
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
.end method

.method public final n(Lz4/r;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lv3/g0;->A:Lv3/s0;

    .line 2
    .line 3
    iget-object v0, v0, Lv3/s0;->j:Lv3/q0;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v2, v0, Lv3/q0;->a:Lz4/r;

    .line 9
    .line 10
    if-ne v2, p1, :cond_0

    .line 11
    .line 12
    move p1, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    if-nez p1, :cond_1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    iget-object p1, p0, Lv3/g0;->w:Lv3/k;

    .line 19
    .line 20
    invoke-virtual {p1}, Lv3/k;->f()Lv3/e1;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget p1, p1, Lv3/e1;->a:F

    .line 25
    .line 26
    iget-object v2, p0, Lv3/g0;->F:Lv3/d1;

    .line 27
    .line 28
    iget-object v2, v2, Lv3/d1;->a:Lv3/r1;

    .line 29
    .line 30
    iput-boolean v1, v0, Lv3/q0;->d:Z

    .line 31
    .line 32
    iget-object v1, v0, Lv3/q0;->a:Lz4/r;

    .line 33
    .line 34
    invoke-interface {v1}, Lz4/r;->q()Lz4/j0;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iput-object v1, v0, Lv3/q0;->m:Lz4/j0;

    .line 39
    .line 40
    invoke-virtual {v0, p1, v2}, Lv3/q0;->g(FLv3/r1;)Lr5/p;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object p1, v0, Lv3/q0;->f:Lv3/r0;

    .line 45
    .line 46
    iget-wide v3, p1, Lv3/r0;->b:J

    .line 47
    .line 48
    iget-wide v5, p1, Lv3/r0;->e:J

    .line 49
    .line 50
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    cmp-long p1, v5, v7

    .line 56
    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    cmp-long p1, v3, v5

    .line 60
    .line 61
    if-ltz p1, :cond_2

    .line 62
    .line 63
    const-wide/16 v3, 0x0

    .line 64
    .line 65
    const-wide/16 v7, 0x1

    .line 66
    .line 67
    sub-long/2addr v5, v7

    .line 68
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 69
    .line 70
    .line 71
    move-result-wide v3

    .line 72
    :cond_2
    iget-object p1, v0, Lv3/q0;->i:[Lv3/k1;

    .line 73
    .line 74
    array-length p1, p1

    .line 75
    new-array v6, p1, [Z

    .line 76
    .line 77
    const/4 v5, 0x0

    .line 78
    move-object v1, v0

    .line 79
    invoke-virtual/range {v1 .. v6}, Lv3/q0;->a(Lr5/p;JZ[Z)J

    .line 80
    .line 81
    .line 82
    move-result-wide v1

    .line 83
    iget-wide v3, v0, Lv3/q0;->o:J

    .line 84
    .line 85
    iget-object p1, v0, Lv3/q0;->f:Lv3/r0;

    .line 86
    .line 87
    iget-wide v5, p1, Lv3/r0;->b:J

    .line 88
    .line 89
    sub-long/2addr v5, v1

    .line 90
    add-long/2addr v5, v3

    .line 91
    iput-wide v5, v0, Lv3/q0;->o:J

    .line 92
    .line 93
    invoke-virtual {p1, v1, v2}, Lv3/r0;->b(J)Lv3/r0;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iput-object p1, v0, Lv3/q0;->f:Lv3/r0;

    .line 98
    .line 99
    iget-object p1, v0, Lv3/q0;->n:Lr5/p;

    .line 100
    .line 101
    iget-object v1, p0, Lv3/g0;->f:Lv3/n0;

    .line 102
    .line 103
    iget-object v2, p0, Lv3/g0;->a:[Lv3/j1;

    .line 104
    .line 105
    iget-object p1, p1, Lr5/p;->c:[Lr5/h;

    .line 106
    .line 107
    invoke-interface {v1, v2, p1}, Lv3/n0;->a([Lv3/j1;[Lr5/h;)V

    .line 108
    .line 109
    .line 110
    iget-object p1, p0, Lv3/g0;->A:Lv3/s0;

    .line 111
    .line 112
    iget-object p1, p1, Lv3/s0;->h:Lv3/q0;

    .line 113
    .line 114
    if-ne v0, p1, :cond_3

    .line 115
    .line 116
    iget-object p1, v0, Lv3/q0;->f:Lv3/r0;

    .line 117
    .line 118
    iget-wide v1, p1, Lv3/r0;->b:J

    .line 119
    .line 120
    invoke-virtual {p0, v1, v2}, Lv3/g0;->D(J)V

    .line 121
    .line 122
    .line 123
    iget-object p1, p0, Lv3/g0;->a:[Lv3/j1;

    .line 124
    .line 125
    array-length p1, p1

    .line 126
    new-array p1, p1, [Z

    .line 127
    .line 128
    invoke-virtual {p0, p1}, Lv3/g0;->f([Z)V

    .line 129
    .line 130
    .line 131
    iget-object p1, p0, Lv3/g0;->F:Lv3/d1;

    .line 132
    .line 133
    iget-object v2, p1, Lv3/d1;->b:Lz4/t$b;

    .line 134
    .line 135
    iget-object v0, v0, Lv3/q0;->f:Lv3/r0;

    .line 136
    .line 137
    iget-wide v7, v0, Lv3/r0;->b:J

    .line 138
    .line 139
    iget-wide v5, p1, Lv3/d1;->c:J

    .line 140
    .line 141
    const/4 v9, 0x0

    .line 142
    const/4 v10, 0x5

    .line 143
    move-object v1, p0

    .line 144
    move-wide v3, v7

    .line 145
    invoke-virtual/range {v1 .. v10}, Lv3/g0;->p(Lz4/t$b;JJJZI)Lv3/d1;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    iput-object p1, p0, Lv3/g0;->F:Lv3/d1;

    .line 150
    .line 151
    :cond_3
    invoke-virtual {p0}, Lv3/g0;->t()V

    .line 152
    .line 153
    .line 154
    return-void
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method

.method public final o(Lv3/e1;FZZ)V
    .locals 4

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, Lv3/g0;->G:Lv3/g0$d;

    .line 6
    .line 7
    const/4 p4, 0x1

    .line 8
    invoke-virtual {p3, p4}, Lv3/g0$d;->a(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p3, p0, Lv3/g0;->F:Lv3/d1;

    .line 12
    .line 13
    invoke-virtual {p3, p1}, Lv3/d1;->e(Lv3/e1;)Lv3/d1;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    iput-object p3, p0, Lv3/g0;->F:Lv3/d1;

    .line 18
    .line 19
    :cond_1
    iget p3, p1, Lv3/e1;->a:F

    .line 20
    .line 21
    iget-object p4, p0, Lv3/g0;->A:Lv3/s0;

    .line 22
    .line 23
    iget-object p4, p4, Lv3/s0;->h:Lv3/q0;

    .line 24
    .line 25
    :goto_0
    const/4 v0, 0x0

    .line 26
    if-eqz p4, :cond_4

    .line 27
    .line 28
    iget-object v1, p4, Lv3/q0;->n:Lr5/p;

    .line 29
    .line 30
    iget-object v1, v1, Lr5/p;->c:[Lr5/h;

    .line 31
    .line 32
    array-length v2, v1

    .line 33
    :goto_1
    if-ge v0, v2, :cond_3

    .line 34
    .line 35
    aget-object v3, v1, v0

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    invoke-interface {v3, p3}, Lr5/h;->r(F)V

    .line 40
    .line 41
    .line 42
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    iget-object p4, p4, Lv3/q0;->l:Lv3/q0;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    iget-object p3, p0, Lv3/g0;->a:[Lv3/j1;

    .line 49
    .line 50
    array-length p4, p3

    .line 51
    :goto_2
    if-ge v0, p4, :cond_6

    .line 52
    .line 53
    aget-object v1, p3, v0

    .line 54
    .line 55
    if-eqz v1, :cond_5

    .line 56
    .line 57
    iget v2, p1, Lv3/e1;->a:F

    .line 58
    .line 59
    invoke-interface {v1, p2, v2}, Lv3/j1;->m(FF)V

    .line 60
    .line 61
    .line 62
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_6
    return-void
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
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
.end method

.method public final p(Lz4/t$b;JJJZI)Lv3/d1;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-wide/from16 v5, p4

    .line 6
    .line 7
    move/from16 v1, p9

    .line 8
    .line 9
    iget-boolean v3, v0, Lv3/g0;->V:Z

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    iget-object v3, v0, Lv3/g0;->F:Lv3/d1;

    .line 15
    .line 16
    iget-wide v8, v3, Lv3/d1;->r:J

    .line 17
    .line 18
    cmp-long v3, p2, v8

    .line 19
    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    iget-object v3, v0, Lv3/g0;->F:Lv3/d1;

    .line 23
    .line 24
    iget-object v3, v3, Lv3/d1;->b:Lz4/t$b;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Lz4/s;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v3, v7

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    const/4 v3, 0x1

    .line 36
    :goto_1
    iput-boolean v3, v0, Lv3/g0;->V:Z

    .line 37
    .line 38
    invoke-virtual/range {p0 .. p0}, Lv3/g0;->C()V

    .line 39
    .line 40
    .line 41
    iget-object v3, v0, Lv3/g0;->F:Lv3/d1;

    .line 42
    .line 43
    iget-object v8, v3, Lv3/d1;->h:Lz4/j0;

    .line 44
    .line 45
    iget-object v9, v3, Lv3/d1;->i:Lr5/p;

    .line 46
    .line 47
    iget-object v10, v3, Lv3/d1;->j:Ljava/util/List;

    .line 48
    .line 49
    iget-object v11, v0, Lv3/g0;->B:Lv3/z0;

    .line 50
    .line 51
    iget-boolean v11, v11, Lv3/z0;->k:Z

    .line 52
    .line 53
    if-eqz v11, :cond_9

    .line 54
    .line 55
    iget-object v3, v0, Lv3/g0;->A:Lv3/s0;

    .line 56
    .line 57
    iget-object v3, v3, Lv3/s0;->h:Lv3/q0;

    .line 58
    .line 59
    if-nez v3, :cond_2

    .line 60
    .line 61
    sget-object v8, Lz4/j0;->d:Lz4/j0;

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    iget-object v8, v3, Lv3/q0;->m:Lz4/j0;

    .line 65
    .line 66
    :goto_2
    if-nez v3, :cond_3

    .line 67
    .line 68
    iget-object v9, v0, Lv3/g0;->e:Lr5/p;

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    iget-object v9, v3, Lv3/q0;->n:Lr5/p;

    .line 72
    .line 73
    :goto_3
    iget-object v10, v9, Lr5/p;->c:[Lr5/h;

    .line 74
    .line 75
    new-instance v11, Lo7/t$a;

    .line 76
    .line 77
    invoke-direct {v11}, Lo7/t$a;-><init>()V

    .line 78
    .line 79
    .line 80
    array-length v12, v10

    .line 81
    move v13, v7

    .line 82
    move v14, v13

    .line 83
    :goto_4
    if-ge v13, v12, :cond_6

    .line 84
    .line 85
    aget-object v15, v10, v13

    .line 86
    .line 87
    if-eqz v15, :cond_5

    .line 88
    .line 89
    invoke-interface {v15, v7}, Lr5/k;->b(I)Lv3/i0;

    .line 90
    .line 91
    .line 92
    move-result-object v15

    .line 93
    iget-object v15, v15, Lv3/i0;->r:Lp4/a;

    .line 94
    .line 95
    if-nez v15, :cond_4

    .line 96
    .line 97
    new-instance v15, Lp4/a;

    .line 98
    .line 99
    new-array v4, v7, [Lp4/a$b;

    .line 100
    .line 101
    invoke-direct {v15, v4}, Lp4/a;-><init>([Lp4/a$b;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v11, v15}, Lo7/t$a;->c(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_4
    invoke-virtual {v11, v15}, Lo7/t$a;->c(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    const/4 v14, 0x1

    .line 112
    :cond_5
    :goto_5
    add-int/lit8 v13, v13, 0x1

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_6
    if-eqz v14, :cond_7

    .line 116
    .line 117
    invoke-virtual {v11}, Lo7/t$a;->e()Lo7/l0;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    goto :goto_6

    .line 122
    :cond_7
    sget-object v4, Lo7/t;->b:Lo7/t$b;

    .line 123
    .line 124
    sget-object v4, Lo7/l0;->e:Lo7/l0;

    .line 125
    .line 126
    :goto_6
    if-eqz v3, :cond_8

    .line 127
    .line 128
    iget-object v10, v3, Lv3/q0;->f:Lv3/r0;

    .line 129
    .line 130
    iget-wide v11, v10, Lv3/r0;->c:J

    .line 131
    .line 132
    cmp-long v11, v11, v5

    .line 133
    .line 134
    if-eqz v11, :cond_8

    .line 135
    .line 136
    invoke-virtual {v10, v5, v6}, Lv3/r0;->a(J)Lv3/r0;

    .line 137
    .line 138
    .line 139
    move-result-object v10

    .line 140
    iput-object v10, v3, Lv3/q0;->f:Lv3/r0;

    .line 141
    .line 142
    :cond_8
    move-object v13, v4

    .line 143
    move-object v11, v8

    .line 144
    move-object v12, v9

    .line 145
    goto :goto_7

    .line 146
    :cond_9
    iget-object v3, v3, Lv3/d1;->b:Lz4/t$b;

    .line 147
    .line 148
    invoke-virtual {v2, v3}, Lz4/s;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-nez v3, :cond_a

    .line 153
    .line 154
    sget-object v3, Lz4/j0;->d:Lz4/j0;

    .line 155
    .line 156
    iget-object v4, v0, Lv3/g0;->e:Lr5/p;

    .line 157
    .line 158
    sget-object v8, Lo7/l0;->e:Lo7/l0;

    .line 159
    .line 160
    move-object v11, v3

    .line 161
    move-object v12, v4

    .line 162
    move-object v13, v8

    .line 163
    goto :goto_7

    .line 164
    :cond_a
    move-object v11, v8

    .line 165
    move-object v12, v9

    .line 166
    move-object v13, v10

    .line 167
    :goto_7
    if-eqz p8, :cond_d

    .line 168
    .line 169
    iget-object v3, v0, Lv3/g0;->G:Lv3/g0$d;

    .line 170
    .line 171
    iget-boolean v4, v3, Lv3/g0$d;->d:Z

    .line 172
    .line 173
    if-eqz v4, :cond_c

    .line 174
    .line 175
    iget v4, v3, Lv3/g0$d;->e:I

    .line 176
    .line 177
    const/4 v8, 0x5

    .line 178
    if-eq v4, v8, :cond_c

    .line 179
    .line 180
    if-ne v1, v8, :cond_b

    .line 181
    .line 182
    const/4 v4, 0x1

    .line 183
    goto :goto_8

    .line 184
    :cond_b
    move v4, v7

    .line 185
    :goto_8
    invoke-static {v4}, Lx6/b;->q(Z)V

    .line 186
    .line 187
    .line 188
    goto :goto_9

    .line 189
    :cond_c
    const/4 v4, 0x1

    .line 190
    iput-boolean v4, v3, Lv3/g0$d;->a:Z

    .line 191
    .line 192
    iput-boolean v4, v3, Lv3/g0$d;->d:Z

    .line 193
    .line 194
    iput v1, v3, Lv3/g0$d;->e:I

    .line 195
    .line 196
    :cond_d
    :goto_9
    iget-object v1, v0, Lv3/g0;->F:Lv3/d1;

    .line 197
    .line 198
    iget-wide v3, v1, Lv3/d1;->p:J

    .line 199
    .line 200
    iget-object v7, v0, Lv3/g0;->A:Lv3/s0;

    .line 201
    .line 202
    iget-object v7, v7, Lv3/s0;->j:Lv3/q0;

    .line 203
    .line 204
    if-nez v7, :cond_e

    .line 205
    .line 206
    const-wide/16 v9, 0x0

    .line 207
    .line 208
    goto :goto_a

    .line 209
    :cond_e
    iget-wide v14, v0, Lv3/g0;->T:J

    .line 210
    .line 211
    iget-wide v8, v7, Lv3/q0;->o:J

    .line 212
    .line 213
    sub-long/2addr v14, v8

    .line 214
    sub-long/2addr v3, v14

    .line 215
    const-wide/16 v7, 0x0

    .line 216
    .line 217
    invoke-static {v7, v8, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 218
    .line 219
    .line 220
    move-result-wide v3

    .line 221
    move-wide v9, v3

    .line 222
    :goto_a
    move-object/from16 v2, p1

    .line 223
    .line 224
    move-wide/from16 v3, p2

    .line 225
    .line 226
    move-wide/from16 v5, p4

    .line 227
    .line 228
    move-wide/from16 v7, p6

    .line 229
    .line 230
    invoke-virtual/range {v1 .. v13}, Lv3/d1;->b(Lz4/t$b;JJJJLz4/j0;Lr5/p;Ljava/util/List;)Lv3/d1;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    return-object v1
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
.end method

.method public final q()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lv3/g0;->A:Lv3/s0;

    .line 2
    .line 3
    iget-object v0, v0, Lv3/s0;->j:Lv3/q0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-boolean v2, v0, Lv3/q0;->d:Z

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget-object v0, v0, Lv3/q0;->a:Lz4/r;

    .line 17
    .line 18
    invoke-interface {v0}, Lz4/r;->c()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    :goto_0
    const-wide/high16 v4, -0x8000000000000000L

    .line 23
    .line 24
    cmp-long v0, v2, v4

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    return v1

    .line 29
    :cond_2
    const/4 v0, 0x1

    .line 30
    return v0
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
.end method

.method public final s()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lv3/g0;->A:Lv3/s0;

    .line 2
    .line 3
    iget-object v0, v0, Lv3/s0;->h:Lv3/q0;

    .line 4
    .line 5
    iget-object v1, v0, Lv3/q0;->f:Lv3/r0;

    .line 6
    .line 7
    iget-wide v1, v1, Lv3/r0;->e:J

    .line 8
    .line 9
    iget-boolean v0, v0, Lv3/q0;->d:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmp-long v0, v1, v3

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lv3/g0;->F:Lv3/d1;

    .line 23
    .line 24
    iget-wide v3, v0, Lv3/d1;->r:J

    .line 25
    .line 26
    cmp-long v0, v3, v1

    .line 27
    .line 28
    if-ltz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Lv3/g0;->Y()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    :cond_0
    const/4 v0, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    :goto_0
    return v0
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
.end method

.method public final t()V
    .locals 11

    .line 1
    invoke-virtual {p0}, Lv3/g0;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    move v0, v1

    .line 9
    goto :goto_3

    .line 10
    :cond_0
    iget-object v0, p0, Lv3/g0;->A:Lv3/s0;

    .line 11
    .line 12
    iget-object v0, v0, Lv3/s0;->j:Lv3/q0;

    .line 13
    .line 14
    iget-boolean v2, v0, Lv3/q0;->d:Z

    .line 15
    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    move-wide v5, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object v2, v0, Lv3/q0;->a:Lz4/r;

    .line 23
    .line 24
    invoke-interface {v2}, Lz4/r;->c()J

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    :goto_0
    iget-object v2, p0, Lv3/g0;->A:Lv3/s0;

    .line 29
    .line 30
    iget-object v2, v2, Lv3/s0;->j:Lv3/q0;

    .line 31
    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    move-wide v5, v3

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    iget-wide v7, p0, Lv3/g0;->T:J

    .line 37
    .line 38
    iget-wide v9, v2, Lv3/q0;->o:J

    .line 39
    .line 40
    sub-long/2addr v7, v9

    .line 41
    sub-long/2addr v5, v7

    .line 42
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    :goto_1
    iget-object v2, p0, Lv3/g0;->A:Lv3/s0;

    .line 47
    .line 48
    iget-object v2, v2, Lv3/s0;->h:Lv3/q0;

    .line 49
    .line 50
    if-ne v0, v2, :cond_3

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    iget-object v0, v0, Lv3/q0;->f:Lv3/r0;

    .line 54
    .line 55
    iget-wide v7, v0, Lv3/r0;->b:J

    .line 56
    .line 57
    :goto_2
    iget-object v0, p0, Lv3/g0;->f:Lv3/n0;

    .line 58
    .line 59
    iget-object v2, p0, Lv3/g0;->w:Lv3/k;

    .line 60
    .line 61
    invoke-virtual {v2}, Lv3/k;->f()Lv3/e1;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iget v2, v2, Lv3/e1;->a:F

    .line 66
    .line 67
    invoke-interface {v0, v5, v6, v2}, Lv3/n0;->e(JF)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_5

    .line 72
    .line 73
    const-wide/32 v7, 0x7a120

    .line 74
    .line 75
    .line 76
    cmp-long v2, v5, v7

    .line 77
    .line 78
    if-gez v2, :cond_5

    .line 79
    .line 80
    iget-wide v7, p0, Lv3/g0;->u:J

    .line 81
    .line 82
    cmp-long v2, v7, v3

    .line 83
    .line 84
    if-gtz v2, :cond_4

    .line 85
    .line 86
    iget-boolean v2, p0, Lv3/g0;->v:Z

    .line 87
    .line 88
    if-eqz v2, :cond_5

    .line 89
    .line 90
    :cond_4
    iget-object v0, p0, Lv3/g0;->A:Lv3/s0;

    .line 91
    .line 92
    iget-object v0, v0, Lv3/s0;->h:Lv3/q0;

    .line 93
    .line 94
    iget-object v0, v0, Lv3/q0;->a:Lz4/r;

    .line 95
    .line 96
    iget-object v2, p0, Lv3/g0;->F:Lv3/d1;

    .line 97
    .line 98
    iget-wide v2, v2, Lv3/d1;->r:J

    .line 99
    .line 100
    invoke-interface {v0, v2, v3, v1}, Lz4/r;->s(JZ)V

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, Lv3/g0;->f:Lv3/n0;

    .line 104
    .line 105
    iget-object v2, p0, Lv3/g0;->w:Lv3/k;

    .line 106
    .line 107
    invoke-virtual {v2}, Lv3/k;->f()Lv3/e1;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    iget v2, v2, Lv3/e1;->a:F

    .line 112
    .line 113
    invoke-interface {v0, v5, v6, v2}, Lv3/n0;->e(JF)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    :cond_5
    :goto_3
    iput-boolean v0, p0, Lv3/g0;->L:Z

    .line 118
    .line 119
    if-eqz v0, :cond_7

    .line 120
    .line 121
    iget-object v0, p0, Lv3/g0;->A:Lv3/s0;

    .line 122
    .line 123
    iget-object v0, v0, Lv3/s0;->j:Lv3/q0;

    .line 124
    .line 125
    iget-wide v2, p0, Lv3/g0;->T:J

    .line 126
    .line 127
    iget-object v4, v0, Lv3/q0;->l:Lv3/q0;

    .line 128
    .line 129
    if-nez v4, :cond_6

    .line 130
    .line 131
    const/4 v1, 0x1

    .line 132
    :cond_6
    invoke-static {v1}, Lx6/b;->H(Z)V

    .line 133
    .line 134
    .line 135
    iget-wide v4, v0, Lv3/q0;->o:J

    .line 136
    .line 137
    sub-long/2addr v2, v4

    .line 138
    iget-object v0, v0, Lv3/q0;->a:Lz4/r;

    .line 139
    .line 140
    invoke-interface {v0, v2, v3}, Lz4/r;->d(J)Z

    .line 141
    .line 142
    .line 143
    :cond_7
    invoke-virtual {p0}, Lv3/g0;->d0()V

    .line 144
    .line 145
    .line 146
    return-void
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method

.method public final u()V
    .locals 5

    .line 1
    iget-object v0, p0, Lv3/g0;->G:Lv3/g0$d;

    .line 2
    .line 3
    iget-object v1, p0, Lv3/g0;->F:Lv3/d1;

    .line 4
    .line 5
    iget-boolean v2, v0, Lv3/g0$d;->a:Z

    .line 6
    .line 7
    iget-object v3, v0, Lv3/g0$d;->b:Lv3/d1;

    .line 8
    .line 9
    if-eq v3, v1, :cond_0

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v3, 0x0

    .line 14
    :goto_0
    or-int/2addr v2, v3

    .line 15
    iput-boolean v2, v0, Lv3/g0$d;->a:Z

    .line 16
    .line 17
    iput-object v1, v0, Lv3/g0$d;->b:Lv3/d1;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iget-object v1, p0, Lv3/g0;->z:Lv3/g0$e;

    .line 22
    .line 23
    check-cast v1, Lio/flutter/plugins/firebase/auth/g;

    .line 24
    .line 25
    iget-object v1, v1, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lv3/d0;

    .line 28
    .line 29
    iget-object v2, v1, Lv3/d0;->i:Lv5/k;

    .line 30
    .line 31
    new-instance v3, Lg/q;

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    invoke-direct {v3, v4, v1, v0}, Lg/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v2, v3}, Lv5/k;->e(Ljava/lang/Runnable;)Z

    .line 38
    .line 39
    .line 40
    new-instance v0, Lv3/g0$d;

    .line 41
    .line 42
    iget-object v1, p0, Lv3/g0;->F:Lv3/d1;

    .line 43
    .line 44
    invoke-direct {v0, v1}, Lv3/g0$d;-><init>(Lv3/d1;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lv3/g0;->G:Lv3/g0$d;

    .line 48
    .line 49
    :cond_1
    return-void
    .line 50
    .line 51
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
.end method

.method public final v()V
    .locals 2

    iget-object v0, p0, Lv3/g0;->B:Lv3/z0;

    invoke-virtual {v0}, Lv3/z0;->c()Lv3/r1;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lv3/g0;->m(Lv3/r1;Z)V

    return-void
.end method

.method public final w(Lv3/g0$b;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lv3/g0;->G:Lv3/g0$d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lv3/g0$d;->a(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lv3/g0;->B:Lv3/z0;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p1, v0, Lv3/z0;->b:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/4 v2, 0x0

    .line 22
    if-ltz p1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v1, v2

    .line 26
    :goto_0
    invoke-static {v1}, Lx6/b;->q(Z)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput-object p1, v0, Lv3/z0;->j:Lz4/e0;

    .line 31
    .line 32
    invoke-virtual {v0}, Lv3/z0;->c()Lv3/r1;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p0, p1, v2}, Lv3/g0;->m(Lv3/r1;Z)V

    .line 37
    .line 38
    .line 39
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final x()V
    .locals 6

    .line 1
    iget-object v0, p0, Lv3/g0;->G:Lv3/g0$d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lv3/g0$d;->a(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0, v0, v0, v1}, Lv3/g0;->B(ZZZZ)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lv3/g0;->f:Lv3/n0;

    .line 12
    .line 13
    invoke-interface {v2}, Lv3/n0;->d()V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lv3/g0;->F:Lv3/d1;

    .line 17
    .line 18
    iget-object v2, v2, Lv3/d1;->a:Lv3/r1;

    .line 19
    .line 20
    invoke-virtual {v2}, Lv3/r1;->p()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v2, v3

    .line 30
    :goto_0
    invoke-virtual {p0, v2}, Lv3/g0;->X(I)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lv3/g0;->B:Lv3/z0;

    .line 34
    .line 35
    iget-object v4, p0, Lv3/g0;->o:Lt5/e;

    .line 36
    .line 37
    invoke-interface {v4}, Lt5/e;->f()Lt5/q;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    iget-boolean v5, v2, Lv3/z0;->k:Z

    .line 42
    .line 43
    xor-int/2addr v5, v1

    .line 44
    invoke-static {v5}, Lx6/b;->H(Z)V

    .line 45
    .line 46
    .line 47
    iput-object v4, v2, Lv3/z0;->l:Lt5/l0;

    .line 48
    .line 49
    :goto_1
    iget-object v4, v2, Lv3/z0;->b:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-ge v0, v4, :cond_1

    .line 56
    .line 57
    iget-object v4, v2, Lv3/z0;->b:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Lv3/z0$c;

    .line 64
    .line 65
    invoke-virtual {v2, v4}, Lv3/z0;->f(Lv3/z0$c;)V

    .line 66
    .line 67
    .line 68
    iget-object v5, v2, Lv3/z0;->g:Ljava/util/HashSet;

    .line 69
    .line 70
    invoke-virtual {v5, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    iput-boolean v1, v2, Lv3/z0;->k:Z

    .line 77
    .line 78
    iget-object v0, p0, Lv3/g0;->p:Lv5/k;

    .line 79
    .line 80
    invoke-interface {v0, v3}, Lv5/k;->i(I)Z

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final y()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v0, v1}, Lv3/g0;->B(ZZZZ)V

    iget-object v1, p0, Lv3/g0;->f:Lv3/n0;

    invoke-interface {v1}, Lv3/n0;->f()V

    invoke-virtual {p0, v0}, Lv3/g0;->X(I)V

    iget-object v1, p0, Lv3/g0;->q:Landroid/os/HandlerThread;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/os/HandlerThread;->quit()Z

    :cond_0
    monitor-enter p0

    :try_start_0
    iput-boolean v0, p0, Lv3/g0;->H:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final z(IILz4/e0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lv3/g0;->G:Lv3/g0$d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lv3/g0$d;->a(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lv3/g0;->B:Lv3/z0;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-ltz p1, :cond_0

    .line 14
    .line 15
    if-gt p1, p2, :cond_0

    .line 16
    .line 17
    iget-object v3, v0, Lv3/z0;->b:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-gt p2, v3, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v1, v2

    .line 27
    :goto_0
    invoke-static {v1}, Lx6/b;->q(Z)V

    .line 28
    .line 29
    .line 30
    iput-object p3, v0, Lv3/z0;->j:Lz4/e0;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Lv3/z0;->g(II)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lv3/z0;->c()Lv3/r1;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0, p1, v2}, Lv3/g0;->m(Lv3/r1;Z)V

    .line 40
    .line 41
    .line 42
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method
