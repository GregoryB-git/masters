.class public LR2/D5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR2/o3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR2/D5$b;,
        LR2/D5$a;
    }
.end annotation


# static fields
.field public static volatile H:LR2/D5;


# instance fields
.field public A:J

.field public final B:Ljava/util/Map;

.field public final C:Ljava/util/Map;

.field public final D:Ljava/util/Map;

.field public E:LR2/w4;

.field public F:Ljava/lang/String;

.field public final G:LR2/U5;

.field public a:LR2/x2;

.field public b:LR2/f2;

.field public c:LR2/p;

.field public d:LR2/j2;

.field public e:LR2/x5;

.field public f:LR2/b6;

.field public final g:LR2/N5;

.field public h:LR2/u4;

.field public i:LR2/g5;

.field public final j:LR2/B5;

.field public k:LR2/u2;

.field public final l:LR2/N2;

.field public m:Z

.field public n:Z

.field public o:J

.field public p:Ljava/util/List;

.field public final q:Ljava/util/Set;

.field public r:I

.field public s:I

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:Ljava/nio/channels/FileLock;

.field public x:Ljava/nio/channels/FileChannel;

.field public y:Ljava/util/List;

.field public z:Ljava/util/List;


# direct methods
.method public constructor <init>(LR2/P5;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LR2/D5;-><init>(LR2/P5;LR2/N2;)V

    return-void
.end method

.method public constructor <init>(LR2/P5;LR2/N2;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x0

    iput-boolean p2, p0, LR2/D5;->m:Z

    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    iput-object p2, p0, LR2/D5;->q:Ljava/util/Set;

    new-instance p2, LR2/K5;

    invoke-direct {p2, p0}, LR2/K5;-><init>(LR2/D5;)V

    iput-object p2, p0, LR2/D5;->G:LR2/U5;

    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p1, LR2/P5;->a:Landroid/content/Context;

    const/4 v0, 0x0

    invoke-static {p2, v0, v0}, LR2/N2;->c(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/H0;Ljava/lang/Long;)LR2/N2;

    move-result-object p2

    iput-object p2, p0, LR2/D5;->l:LR2/N2;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LR2/D5;->A:J

    new-instance p2, LR2/B5;

    invoke-direct {p2, p0}, LR2/B5;-><init>(LR2/D5;)V

    iput-object p2, p0, LR2/D5;->j:LR2/B5;

    new-instance p2, LR2/N5;

    invoke-direct {p2, p0}, LR2/N5;-><init>(LR2/D5;)V

    invoke-virtual {p2}, LR2/C5;->v()V

    iput-object p2, p0, LR2/D5;->g:LR2/N5;

    new-instance p2, LR2/f2;

    invoke-direct {p2, p0}, LR2/f2;-><init>(LR2/D5;)V

    invoke-virtual {p2}, LR2/C5;->v()V

    iput-object p2, p0, LR2/D5;->b:LR2/f2;

    new-instance p2, LR2/x2;

    invoke-direct {p2, p0}, LR2/x2;-><init>(LR2/D5;)V

    invoke-virtual {p2}, LR2/C5;->v()V

    iput-object p2, p0, LR2/D5;->a:LR2/x2;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, LR2/D5;->B:Ljava/util/Map;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, LR2/D5;->C:Ljava/util/Map;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, LR2/D5;->D:Ljava/util/Map;

    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    move-result-object p2

    new-instance v0, LR2/G5;

    invoke-direct {v0, p0, p1}, LR2/G5;-><init>(LR2/D5;LR2/P5;)V

    invoke-virtual {p2, v0}, LR2/G2;->D(Ljava/lang/Runnable;)V

    return-void
.end method

.method private final G(Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-static {v0}, LA2/n;->a(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LR2/D5;->y:Ljava/util/List;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v0, "Set uploading progress before finishing the previous upload"

    .line 23
    .line 24
    invoke-virtual {p1, v0}, LR2/a2;->a(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, LR2/D5;->y:Ljava/util/List;

    .line 34
    .line 35
    return-void
.end method

.method private final M()V
    .locals 5

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, LR2/D5;->t:Z

    .line 9
    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    iget-boolean v0, p0, LR2/D5;->u:Z

    .line 13
    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    iget-boolean v0, p0, LR2/D5;->v:Z

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "Stopping uploading service(s)"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, LR2/D5;->p:Ljava/util/List;

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Ljava/lang/Runnable;

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    iget-object v0, p0, LR2/D5;->p:Ljava/util/List;

    .line 60
    .line 61
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_3
    :goto_1
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-boolean v1, p0, LR2/D5;->t:Z

    .line 80
    .line 81
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iget-boolean v2, p0, LR2/D5;->u:Z

    .line 86
    .line 87
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    iget-boolean v3, p0, LR2/D5;->v:Z

    .line 92
    .line 93
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    const-string v4, "Not stopping services. fetch, network, upload"

    .line 98
    .line 99
    invoke-virtual {v0, v4, v1, v2, v3}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method private final N()V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e()LR2/G2;

    move-result-object v1

    invoke-virtual {v1}, LR2/m3;->n()V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->p0()V

    iget-wide v1, v0, LR2/D5;->o:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_1

    invoke-virtual/range {p0 .. p0}, LR2/D5;->b()LE2/e;

    move-result-object v1

    invoke-interface {v1}, LE2/e;->b()J

    move-result-wide v1

    iget-wide v5, v0, LR2/D5;->o:J

    sub-long/2addr v1, v5

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    const-wide/32 v5, 0x36ee80

    sub-long/2addr v5, v1

    cmp-long v1, v5, v3

    if-lez v1, :cond_0

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v1

    invoke-virtual {v1}, LR2/Y1;->K()LR2/a2;

    move-result-object v1

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "Upload has been suspended. Will update scheduling later in approximately ms"

    invoke-virtual {v1, v3, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->v0()LR2/j2;

    move-result-object v1

    invoke-virtual {v1}, LR2/j2;->c()V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->w0()LR2/x5;

    move-result-object v1

    invoke-virtual {v1}, LR2/x5;->z()V

    return-void

    :cond_0
    iput-wide v3, v0, LR2/D5;->o:J

    :cond_1
    iget-object v1, v0, LR2/D5;->l:LR2/N2;

    invoke-virtual {v1}, LR2/N2;->s()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-direct/range {p0 .. p0}, LR2/D5;->O()Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_6

    :cond_2
    invoke-virtual/range {p0 .. p0}, LR2/D5;->b()LE2/e;

    move-result-object v1

    invoke-interface {v1}, LE2/e;->a()J

    move-result-wide v1

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    sget-object v5, LR2/K;->C:LR2/P1;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, LR2/P1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v5

    invoke-virtual {v5}, LR2/p;->W0()Z

    move-result v5

    if-nez v5, :cond_4

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v5

    invoke-virtual {v5}, LR2/p;->V0()Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_0

    :cond_3
    const/4 v5, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v5, 0x1

    :goto_1
    if-eqz v5, :cond_6

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v10

    invoke-virtual {v10}, LR2/g;->N()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_5

    const-string v11, ".none."

    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    sget-object v10, LR2/K;->x:LR2/P1;

    :goto_2
    invoke-virtual {v10, v6}, LR2/P1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Long;

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    invoke-static {v3, v4, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    goto :goto_3

    :cond_5
    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    sget-object v10, LR2/K;->w:LR2/P1;

    goto :goto_2

    :cond_6
    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    sget-object v10, LR2/K;->v:LR2/P1;

    goto :goto_2

    :goto_3
    iget-object v12, v0, LR2/D5;->i:LR2/g5;

    iget-object v12, v12, LR2/g5;->g:LR2/q2;

    invoke-virtual {v12}, LR2/q2;->a()J

    move-result-wide v12

    iget-object v14, v0, LR2/D5;->i:LR2/g5;

    iget-object v14, v14, LR2/g5;->h:LR2/q2;

    invoke-virtual {v14}, LR2/q2;->a()J

    move-result-wide v14

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v16

    move-wide/from16 v17, v10

    invoke-virtual/range {v16 .. v16}, LR2/p;->z()J

    move-result-wide v9

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v11

    move-wide/from16 v19, v7

    invoke-virtual {v11}, LR2/p;->A()J

    move-result-wide v6

    invoke-static {v9, v10, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    cmp-long v8, v6, v3

    if-nez v8, :cond_8

    :cond_7
    move-wide v10, v3

    goto/16 :goto_5

    :cond_8
    sub-long/2addr v6, v1

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(J)J

    move-result-wide v6

    sub-long v6, v1, v6

    sub-long/2addr v12, v1

    invoke-static {v12, v13}, Ljava/lang/Math;->abs(J)J

    move-result-wide v8

    sub-long v8, v1, v8

    sub-long/2addr v14, v1

    invoke-static {v14, v15}, Ljava/lang/Math;->abs(J)J

    move-result-wide v10

    sub-long/2addr v1, v10

    invoke-static {v8, v9, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    add-long v10, v6, v19

    if-eqz v5, :cond_9

    cmp-long v5, v8, v3

    if-lez v5, :cond_9

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v10

    add-long v10, v10, v17

    :cond_9
    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    move-result-object v5

    move-wide/from16 v12, v17

    invoke-virtual {v5, v8, v9, v12, v13}, LR2/N5;->b0(JJ)Z

    move-result v5

    if-nez v5, :cond_a

    add-long v10, v8, v12

    :cond_a
    cmp-long v5, v1, v3

    if-eqz v5, :cond_c

    cmp-long v5, v1, v6

    if-ltz v5, :cond_c

    const/4 v5, 0x0

    :goto_4
    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    sget-object v6, LR2/K;->E:LR2/P1;

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, LR2/P1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/4 v8, 0x0

    invoke-static {v8, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    const/16 v9, 0x14

    invoke-static {v9, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    if-ge v5, v6, :cond_7

    const-wide/16 v12, 0x1

    shl-long/2addr v12, v5

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    sget-object v6, LR2/K;->D:LR2/P1;

    invoke-virtual {v6, v7}, LR2/P1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    mul-long/2addr v6, v12

    add-long/2addr v10, v6

    cmp-long v6, v10, v1

    if-lez v6, :cond_b

    goto :goto_5

    :cond_b
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_c
    :goto_5
    cmp-long v1, v10, v3

    if-nez v1, :cond_d

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v1

    invoke-virtual {v1}, LR2/Y1;->K()LR2/a2;

    move-result-object v1

    const-string v2, "Next upload time is 0"

    invoke-virtual {v1, v2}, LR2/a2;->a(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->v0()LR2/j2;

    move-result-object v1

    invoke-virtual {v1}, LR2/j2;->c()V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->w0()LR2/x5;

    move-result-object v1

    invoke-virtual {v1}, LR2/x5;->z()V

    return-void

    :cond_d
    invoke-virtual/range {p0 .. p0}, LR2/D5;->g0()LR2/f2;

    move-result-object v1

    invoke-virtual {v1}, LR2/f2;->A()Z

    move-result v1

    if-nez v1, :cond_e

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v1

    invoke-virtual {v1}, LR2/Y1;->K()LR2/a2;

    move-result-object v1

    const-string v2, "No network"

    invoke-virtual {v1, v2}, LR2/a2;->a(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->v0()LR2/j2;

    move-result-object v1

    invoke-virtual {v1}, LR2/j2;->b()V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->w0()LR2/x5;

    move-result-object v1

    invoke-virtual {v1}, LR2/x5;->z()V

    return-void

    :cond_e
    iget-object v1, v0, LR2/D5;->i:LR2/g5;

    iget-object v1, v1, LR2/g5;->f:LR2/q2;

    invoke-virtual {v1}, LR2/q2;->a()J

    move-result-wide v1

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    sget-object v5, LR2/K;->t:LR2/P1;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, LR2/P1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    move-result-object v7

    invoke-virtual {v7, v1, v2, v5, v6}, LR2/N5;->b0(JJ)Z

    move-result v7

    if-nez v7, :cond_f

    add-long/2addr v1, v5

    invoke-static {v10, v11, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    :cond_f
    invoke-virtual/range {p0 .. p0}, LR2/D5;->v0()LR2/j2;

    move-result-object v1

    invoke-virtual {v1}, LR2/j2;->c()V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->b()LE2/e;

    move-result-object v1

    invoke-interface {v1}, LE2/e;->a()J

    move-result-wide v1

    sub-long/2addr v10, v1

    cmp-long v1, v10, v3

    if-gtz v1, :cond_10

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    sget-object v1, LR2/K;->y:LR2/P1;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, LR2/P1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    iget-object v1, v0, LR2/D5;->i:LR2/g5;

    iget-object v1, v1, LR2/g5;->g:LR2/q2;

    invoke-virtual/range {p0 .. p0}, LR2/D5;->b()LE2/e;

    move-result-object v2

    invoke-interface {v2}, LE2/e;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LR2/q2;->b(J)V

    :cond_10
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v1

    invoke-virtual {v1}, LR2/Y1;->K()LR2/a2;

    move-result-object v1

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "Upload scheduled in approximately ms"

    invoke-virtual {v1, v3, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->w0()LR2/x5;

    move-result-object v1

    invoke-virtual {v1, v10, v11}, LR2/x5;->y(J)V

    return-void

    :cond_11
    :goto_6
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v1

    invoke-virtual {v1}, LR2/Y1;->K()LR2/a2;

    move-result-object v1

    const-string v2, "Nothing to upload or uploading impossible"

    invoke-virtual {v1, v2}, LR2/a2;->a(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->v0()LR2/j2;

    move-result-object v1

    invoke-virtual {v1}, LR2/j2;->c()V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->w0()LR2/x5;

    move-result-object v1

    invoke-virtual {v1}, LR2/x5;->z()V

    return-void
.end method

.method private final O()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LR2/D5;->p0()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, LR2/p;->U0()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, LR2/p;->C()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v0, 0x0

    .line 37
    return v0

    .line 38
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 39
    return v0
.end method

.method private final P()Z
    .locals 5

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LR2/D5;->w:Ljava/nio/channels/FileLock;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const-string v2, "Storage concurrent access okay"

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/nio/channels/FileLock;->isValid()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return v1

    .line 33
    :cond_0
    iget-object v0, p0, LR2/D5;->l:LR2/N2;

    .line 34
    .line 35
    invoke-virtual {v0}, LR2/N2;->a()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v3, Ljava/io/File;

    .line 44
    .line 45
    const-string v4, "google_app_measurement.db"

    .line 46
    .line 47
    invoke-direct {v3, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    .line 51
    .line 52
    const-string v4, "rw"

    .line 53
    .line 54
    invoke-direct {v0, v3, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, LR2/D5;->x:Ljava/nio/channels/FileChannel;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, LR2/D5;->w:Ljava/nio/channels/FileLock;

    .line 68
    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0, v2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return v1

    .line 83
    :catch_0
    move-exception v0

    .line 84
    goto :goto_0

    .line 85
    :catch_1
    move-exception v0

    .line 86
    goto :goto_2

    .line 87
    :catch_2
    move-exception v0

    .line 88
    goto :goto_3

    .line 89
    :cond_1
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const-string v1, "Storage concurrent data access panic"

    .line 98
    .line 99
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/nio/channels/OverlappingFileLockException; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    .line 101
    .line 102
    goto :goto_4

    .line 103
    :goto_0
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1}, LR2/Y1;->L()LR2/a2;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    const-string v2, "Storage lock already acquired"

    .line 112
    .line 113
    :goto_1
    invoke-virtual {v1, v2, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto :goto_4

    .line 117
    :goto_2
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    const-string v2, "Failed to access storage lock file"

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :goto_3
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    const-string v2, "Failed to acquire storage lock"

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :goto_4
    const/4 v0, 0x0

    .line 140
    return v0
.end method

.method public static d0(LR2/W5;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LR2/W5;->p:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, LR2/W5;->E:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public static bridge synthetic h(LR2/D5;)LR2/N2;
    .locals 0

    .line 1
    iget-object p0, p0, LR2/D5;->l:LR2/N2;

    .line 2
    .line 3
    return-object p0
.end method

.method public static i(LR2/C5;)LR2/C5;
    .locals 3

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, LR2/C5;->w()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, "Component not initialized: "

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string v0, "Upload Component not created"

    .line 41
    .line 42
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p0
.end method

.method public static k(Landroid/content/Context;)LR2/D5;
    .locals 2

    .line 1
    invoke-static {p0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    sget-object v0, LR2/D5;->H:LR2/D5;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    const-class v0, LR2/D5;

    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    sget-object v1, LR2/D5;->H:LR2/D5;

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    new-instance v1, LR2/P5;

    .line 23
    .line 24
    invoke-direct {v1, p0}, LR2/P5;-><init>(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, LR2/P5;

    .line 32
    .line 33
    new-instance v1, LR2/D5;

    .line 34
    .line 35
    invoke-direct {v1, p0}, LR2/D5;-><init>(LR2/P5;)V

    .line 36
    .line 37
    .line 38
    sput-object v1, LR2/D5;->H:LR2/D5;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    :goto_0
    monitor-exit v0

    .line 44
    goto :goto_2

    .line 45
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    throw p0

    .line 47
    :cond_1
    :goto_2
    sget-object p0, LR2/D5;->H:LR2/D5;

    .line 48
    .line 49
    return-object p0
.end method

.method public static synthetic t(LR2/D5;LR2/P5;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    new-instance p1, LR2/u2;

    .line 9
    .line 10
    invoke-direct {p1, p0}, LR2/u2;-><init>(LR2/D5;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LR2/D5;->k:LR2/u2;

    .line 14
    .line 15
    new-instance p1, LR2/p;

    .line 16
    .line 17
    invoke-direct {p1, p0}, LR2/p;-><init>(LR2/D5;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, LR2/C5;->v()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, LR2/D5;->c:LR2/p;

    .line 24
    .line 25
    invoke-virtual {p0}, LR2/D5;->c0()LR2/g;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object v0, p0, LR2/D5;->a:LR2/x2;

    .line 30
    .line 31
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, LR2/i;

    .line 36
    .line 37
    invoke-virtual {p1, v0}, LR2/g;->r(LR2/i;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, LR2/g5;

    .line 41
    .line 42
    invoke-direct {p1, p0}, LR2/g5;-><init>(LR2/D5;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, LR2/C5;->v()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, LR2/D5;->i:LR2/g5;

    .line 49
    .line 50
    new-instance p1, LR2/b6;

    .line 51
    .line 52
    invoke-direct {p1, p0}, LR2/b6;-><init>(LR2/D5;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, LR2/C5;->v()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, LR2/D5;->f:LR2/b6;

    .line 59
    .line 60
    new-instance p1, LR2/u4;

    .line 61
    .line 62
    invoke-direct {p1, p0}, LR2/u4;-><init>(LR2/D5;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, LR2/C5;->v()V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, LR2/D5;->h:LR2/u4;

    .line 69
    .line 70
    new-instance p1, LR2/x5;

    .line 71
    .line 72
    invoke-direct {p1, p0}, LR2/x5;-><init>(LR2/D5;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, LR2/C5;->v()V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, LR2/D5;->e:LR2/x5;

    .line 79
    .line 80
    new-instance p1, LR2/j2;

    .line 81
    .line 82
    invoke-direct {p1, p0}, LR2/j2;-><init>(LR2/D5;)V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, LR2/D5;->d:LR2/j2;

    .line 86
    .line 87
    iget p1, p0, LR2/D5;->r:I

    .line 88
    .line 89
    iget v0, p0, LR2/D5;->s:I

    .line 90
    .line 91
    if-eq p1, v0, :cond_0

    .line 92
    .line 93
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iget v0, p0, LR2/D5;->r:I

    .line 102
    .line 103
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget v1, p0, LR2/D5;->s:I

    .line 108
    .line 109
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    const-string v2, "Not all upload components initialized"

    .line 114
    .line 115
    invoke-virtual {p1, v2, v0, v1}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_0
    const/4 p1, 0x1

    .line 119
    iput-boolean p1, p0, LR2/D5;->m:Z

    .line 120
    .line 121
    return-void
.end method

.method public static v(Lcom/google/android/gms/internal/measurement/Y1$a;ILjava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y1$a;->L()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const-string v3, "_err"

    .line 11
    .line 12
    if-ge v1, v2, :cond_1

    .line 13
    .line 14
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lcom/google/android/gms/internal/measurement/a2;

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/a2;->c0()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/a2;->Z()Lcom/google/android/gms/internal/measurement/a2$a;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/a2$a;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    int-to-long v1, p1

    .line 43
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/a2$a;->y(J)Lcom/google/android/gms/internal/measurement/a2$a;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Lcom/google/android/gms/internal/measurement/Y3;

    .line 52
    .line 53
    check-cast p1, Lcom/google/android/gms/internal/measurement/a2;

    .line 54
    .line 55
    invoke-static {}, Lcom/google/android/gms/internal/measurement/a2;->Z()Lcom/google/android/gms/internal/measurement/a2$a;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v1, "_ev"

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/a2$a;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/measurement/a2$a;->D(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    check-cast p2, Lcom/google/android/gms/internal/measurement/Y3;

    .line 74
    .line 75
    check-cast p2, Lcom/google/android/gms/internal/measurement/a2;

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/Y1$a;->C(Lcom/google/android/gms/internal/measurement/a2;)Lcom/google/android/gms/internal/measurement/Y1$a;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/Y1$a;->C(Lcom/google/android/gms/internal/measurement/a2;)Lcom/google/android/gms/internal/measurement/Y1$a;

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public static w(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y1$a;->L()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-ge v1, v2, :cond_1

    .line 11
    .line 12
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lcom/google/android/gms/internal/measurement/a2;

    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/a2;->c0()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/Y1$a;->x(I)Lcom/google/android/gms/internal/measurement/Y1$a;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;LR2/z;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LR2/D5;->p0()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, LR2/D5;->C:Ljava/util/Map;

    .line 18
    .line 19
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0, p1, p2}, LR2/p;->W(Ljava/lang/String;LR2/z;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final B(Ljava/lang/String;LR2/q3;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LR2/D5;->p0()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LR2/D5;->B:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0, p1, p2}, LR2/p;->X(Ljava/lang/String;LR2/q3;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final C(Ljava/lang/String;LR2/w4;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LR2/D5;->F:Ljava/lang/String;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    :cond_0
    iput-object p1, p0, LR2/D5;->F:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p2, p0, LR2/D5;->E:LR2/w4;

    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public final D(Ljava/lang/String;LR2/W5;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LR2/D5;->p0()V

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, LR2/D5;->d0(LR2/W5;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-boolean v0, p2, LR2/W5;->v:Z

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, p2}, LR2/D5;->g(LR2/W5;)LR2/I2;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const-string v0, "_npa"

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-object v0, p2, LR2/W5;->F:Ljava/lang/Boolean;

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, LR2/Y1;->F()LR2/a2;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string v0, "Falling back to manifest metadata value for ad personalization"

    .line 47
    .line 48
    invoke-virtual {p1, v0}, LR2/a2;->a(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance p1, LR2/R5;

    .line 52
    .line 53
    invoke-virtual {p0}, LR2/D5;->b()LE2/e;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {v0}, LE2/e;->a()J

    .line 58
    .line 59
    .line 60
    move-result-wide v3

    .line 61
    iget-object v0, p2, LR2/W5;->F:Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    const-wide/16 v0, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    const-wide/16 v0, 0x0

    .line 73
    .line 74
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    const-string v6, "auto"

    .line 79
    .line 80
    const-string v2, "_npa"

    .line 81
    .line 82
    move-object v1, p1

    .line 83
    invoke-direct/range {v1 .. v6}, LR2/R5;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p1, p2}, LR2/D5;->u(LR2/R5;LR2/W5;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_3
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iget-object v1, p0, LR2/D5;->l:LR2/N2;

    .line 99
    .line 100
    invoke-virtual {v1}, LR2/N2;->D()LR2/X1;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v1, p1}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    const-string v2, "Removing user property"

    .line 109
    .line 110
    invoke-virtual {v0, v2, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v0}, LR2/p;->Q0()V

    .line 118
    .line 119
    .line 120
    :try_start_0
    invoke-virtual {p0, p2}, LR2/D5;->g(LR2/W5;)LR2/I2;

    .line 121
    .line 122
    .line 123
    const-string v0, "_id"

    .line 124
    .line 125
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_4

    .line 130
    .line 131
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iget-object v1, p2, LR2/W5;->o:Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {v1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    check-cast v1, Ljava/lang/String;

    .line 142
    .line 143
    const-string v2, "_lair"

    .line 144
    .line 145
    invoke-virtual {v0, v1, v2}, LR2/p;->L0(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :catchall_0
    move-exception p1

    .line 150
    goto :goto_2

    .line 151
    :cond_4
    :goto_1
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget-object p2, p2, LR2/W5;->o:Ljava/lang/String;

    .line 156
    .line 157
    invoke-static {p2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    check-cast p2, Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v0, p2, p1}, LR2/p;->L0(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-virtual {p2}, LR2/p;->T0()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    invoke-virtual {p2}, LR2/Y1;->F()LR2/a2;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    const-string v0, "User property removed"

    .line 182
    .line 183
    iget-object v1, p0, LR2/D5;->l:LR2/N2;

    .line 184
    .line 185
    invoke-virtual {v1}, LR2/N2;->D()LR2/X1;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-virtual {v1, p1}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-virtual {p2, v0, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {p1}, LR2/p;->R0()V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :goto_2
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    invoke-virtual {p2}, LR2/p;->R0()V

    .line 209
    .line 210
    .line 211
    throw p1
.end method

.method public final E(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/d2$a;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, LR2/D5;->h0()LR2/x2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LR2/x2;->R(Ljava/lang/String;)Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/d2$a;->Z(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/d2$a;

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, LR2/D5;->h0()LR2/x2;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p1}, LR2/x2;->b0(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/d2$a;->l0()Lcom/google/android/gms/internal/measurement/d2$a;

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0}, LR2/D5;->h0()LR2/x2;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0, p1}, LR2/x2;->e0(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v1, -0x1

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0}, LR2/D5;->c0()LR2/g;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sget-object v2, LR2/K;->B0:LR2/P1;

    .line 43
    .line 44
    invoke-virtual {v0, p1, v2}, LR2/g;->B(Ljava/lang/String;LR2/P1;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/d2$a;->W0()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    const-string v2, "."

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eq v2, v1, :cond_3

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/d2$a;->M0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/d2$a;->E0()Lcom/google/android/gms/internal/measurement/d2$a;

    .line 78
    .line 79
    .line 80
    :cond_3
    :goto_0
    invoke-virtual {p0}, LR2/D5;->h0()LR2/x2;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0, p1}, LR2/x2;->f0(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    const-string v0, "_id"

    .line 91
    .line 92
    invoke-static {p2, v0}, LR2/N5;->y(Lcom/google/android/gms/internal/measurement/d2$a;Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eq v0, v1, :cond_4

    .line 97
    .line 98
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/d2$a;->R(I)Lcom/google/android/gms/internal/measurement/d2$a;

    .line 99
    .line 100
    .line 101
    :cond_4
    invoke-virtual {p0}, LR2/D5;->h0()LR2/x2;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0, p1}, LR2/x2;->d0(Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_5

    .line 110
    .line 111
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/d2$a;->p0()Lcom/google/android/gms/internal/measurement/d2$a;

    .line 112
    .line 113
    .line 114
    :cond_5
    invoke-virtual {p0}, LR2/D5;->h0()LR2/x2;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0, p1}, LR2/x2;->a0(Ljava/lang/String;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_8

    .line 123
    .line 124
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/d2$a;->c0()Lcom/google/android/gms/internal/measurement/d2$a;

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, LR2/D5;->D:Ljava/util/Map;

    .line 128
    .line 129
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, LR2/D5$b;

    .line 134
    .line 135
    if-eqz v0, :cond_6

    .line 136
    .line 137
    iget-wide v1, v0, LR2/D5$b;->b:J

    .line 138
    .line 139
    invoke-virtual {p0}, LR2/D5;->c0()LR2/g;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    sget-object v4, LR2/K;->W:LR2/P1;

    .line 144
    .line 145
    invoke-virtual {v3, p1, v4}, LR2/g;->x(Ljava/lang/String;LR2/P1;)J

    .line 146
    .line 147
    .line 148
    move-result-wide v3

    .line 149
    add-long/2addr v1, v3

    .line 150
    invoke-virtual {p0}, LR2/D5;->b()LE2/e;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-interface {v3}, LE2/e;->b()J

    .line 155
    .line 156
    .line 157
    move-result-wide v3

    .line 158
    cmp-long v1, v1, v3

    .line 159
    .line 160
    if-gez v1, :cond_7

    .line 161
    .line 162
    :cond_6
    new-instance v0, LR2/D5$b;

    .line 163
    .line 164
    const/4 v1, 0x0

    .line 165
    invoke-direct {v0, p0, v1}, LR2/D5$b;-><init>(LR2/D5;LR2/M5;)V

    .line 166
    .line 167
    .line 168
    iget-object v1, p0, LR2/D5;->D:Ljava/util/Map;

    .line 169
    .line 170
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    :cond_7
    iget-object v0, v0, LR2/D5$b;->a:Ljava/lang/String;

    .line 174
    .line 175
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/d2$a;->D0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    .line 176
    .line 177
    .line 178
    :cond_8
    invoke-virtual {p0}, LR2/D5;->h0()LR2/x2;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {v0, p1}, LR2/x2;->c0(Ljava/lang/String;)Z

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    if-eqz p1, :cond_9

    .line 187
    .line 188
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/d2$a;->N0()Lcom/google/android/gms/internal/measurement/d2$a;

    .line 189
    .line 190
    .line 191
    :cond_9
    return-void
.end method

.method public final F(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LR2/p;->D0(Ljava/lang/String;)LR2/I2;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, p2}, LR2/I2;->G(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, LR2/I2;->s()Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p2, p1}, LR2/p;->U(LR2/I2;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final H(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, LR2/D5;->N()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final I(ZILjava/lang/Throwable;[BLjava/lang/String;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    move-result-object p5

    invoke-virtual {p5}, LR2/m3;->n()V

    invoke-virtual {p0}, LR2/D5;->p0()V

    const/4 p5, 0x0

    if-nez p4, :cond_0

    :try_start_0
    new-array p4, p5, [B

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_9

    :cond_0
    :goto_0
    iget-object v0, p0, LR2/D5;->y:Ljava/util/List;

    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v1, 0x0

    iput-object v1, p0, LR2/D5;->y:Ljava/util/List;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/i6;->a()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, LR2/D5;->c0()LR2/g;

    move-result-object v2

    sget-object v3, LR2/K;->Y0:LR2/P1;

    invoke-virtual {v2, v3}, LR2/g;->s(LR2/P1;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    if-eqz p1, :cond_3

    :cond_1
    const/16 v2, 0xc8

    if-eq p2, v2, :cond_2

    const/16 v2, 0xcc

    if-ne p2, v2, :cond_d

    :cond_2
    if-nez p3, :cond_d

    :cond_3
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/i6;->a()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-virtual {p0}, LR2/D5;->c0()LR2/g;

    move-result-object p3

    sget-object v2, LR2/K;->Y0:LR2/P1;

    invoke-virtual {p3, v2}, LR2/g;->s(LR2/P1;)Z

    move-result p3

    if-eqz p3, :cond_4

    if-eqz p1, :cond_5

    goto :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_7

    :cond_4
    :goto_1
    iget-object p3, p0, LR2/D5;->i:LR2/g5;

    iget-object p3, p3, LR2/g5;->g:LR2/q2;

    invoke-virtual {p0}, LR2/D5;->b()LE2/e;

    move-result-object v2

    invoke-interface {v2}, LE2/e;->a()J

    move-result-wide v2

    invoke-virtual {p3, v2, v3}, LR2/q2;->b(J)V

    :cond_5
    iget-object p3, p0, LR2/D5;->i:LR2/g5;

    iget-object p3, p3, LR2/g5;->h:LR2/q2;

    const-wide/16 v2, 0x0

    invoke-virtual {p3, v2, v3}, LR2/q2;->b(J)V

    invoke-direct {p0}, LR2/D5;->N()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/i6;->a()Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-virtual {p0}, LR2/D5;->c0()LR2/g;

    move-result-object p3

    sget-object v4, LR2/K;->Y0:LR2/P1;

    invoke-virtual {p3, v4}, LR2/g;->s(LR2/P1;)Z

    move-result p3

    if-eqz p3, :cond_7

    if-eqz p1, :cond_6

    goto :goto_2

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/measurement/i6;->a()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p0}, LR2/D5;->c0()LR2/g;

    move-result-object p1

    invoke-virtual {p1, v4}, LR2/g;->s(LR2/P1;)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    move-result-object p1

    invoke-virtual {p1}, LR2/Y1;->K()LR2/a2;

    move-result-object p1

    const-string p2, "Purged empty bundles"

    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    goto :goto_3

    :cond_7
    :goto_2
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    move-result-object p1

    invoke-virtual {p1}, LR2/Y1;->K()LR2/a2;

    move-result-object p1

    const-string p3, "Successful upload. Got network response. code, size"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    array-length p4, p4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p1, p3, p2, p4}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_8
    :goto_3
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    move-result-object p1

    invoke-virtual {p1}, LR2/p;->Q0()V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    move-result-object p3

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {p3}, LR2/m3;->n()V

    invoke-virtual {p3}, LR2/C5;->u()V

    invoke-virtual {p3}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p4

    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v6, p5
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    const-string v4, "queue"

    const-string v5, "rowid=?"

    invoke-virtual {p4, v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p4

    if-ne p4, v0, :cond_9

    goto :goto_4

    :cond_9
    new-instance p4, Landroid/database/sqlite/SQLiteException;

    const-string v0, "Deleted fewer rows from queue than expected"

    invoke-direct {p4, v0}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V

    throw p4
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    goto :goto_6

    :catch_1
    move-exception p4

    :try_start_5
    invoke-virtual {p3}, LR2/m3;->j()LR2/Y1;

    move-result-object p3

    invoke-virtual {p3}, LR2/Y1;->G()LR2/a2;

    move-result-object p3

    const-string v0, "Failed to delete a bundle in a queue table"

    invoke-virtual {p3, v0, p4}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    throw p4
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catch_2
    move-exception p3

    :try_start_6
    iget-object p4, p0, LR2/D5;->z:Ljava/util/List;

    if-eqz p4, :cond_a

    invoke-interface {p4, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    goto :goto_4

    :cond_a
    throw p3

    :cond_b
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    move-result-object p1

    invoke-virtual {p1}, LR2/p;->T0()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    move-result-object p1

    invoke-virtual {p1}, LR2/p;->R0()V

    iput-object v1, p0, LR2/D5;->z:Ljava/util/List;

    invoke-virtual {p0}, LR2/D5;->g0()LR2/f2;

    move-result-object p1

    invoke-virtual {p1}, LR2/f2;->A()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-direct {p0}, LR2/D5;->O()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {p0}, LR2/D5;->t0()V

    goto :goto_5

    :cond_c
    const-wide/16 p1, -0x1

    iput-wide p1, p0, LR2/D5;->A:J

    invoke-direct {p0}, LR2/D5;->N()V

    :goto_5
    iput-wide v2, p0, LR2/D5;->o:J

    goto :goto_8

    :goto_6
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    move-result-object p2

    invoke-virtual {p2}, LR2/p;->R0()V

    throw p1
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_7
    :try_start_8
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    move-result-object p2

    invoke-virtual {p2}, LR2/Y1;->G()LR2/a2;

    move-result-object p2

    const-string p3, "Database error while trying to delete uploaded bundles"

    invoke-virtual {p2, p3, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, LR2/D5;->b()LE2/e;

    move-result-object p1

    invoke-interface {p1}, LE2/e;->b()J

    move-result-wide p1

    iput-wide p1, p0, LR2/D5;->o:J

    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    move-result-object p1

    invoke-virtual {p1}, LR2/Y1;->K()LR2/a2;

    move-result-object p1

    const-string p2, "Disable upload, time"

    iget-wide p3, p0, LR2/D5;->o:J

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_8

    :cond_d
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    move-result-object p1

    invoke-virtual {p1}, LR2/Y1;->K()LR2/a2;

    move-result-object p1

    const-string p4, "Network upload failed. Will retry later. code, error"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, p4, v1, p3}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, LR2/D5;->i:LR2/g5;

    iget-object p1, p1, LR2/g5;->h:LR2/q2;

    invoke-virtual {p0}, LR2/D5;->b()LE2/e;

    move-result-object p3

    invoke-interface {p3}, LE2/e;->a()J

    move-result-wide p3

    invoke-virtual {p1, p3, p4}, LR2/q2;->b(J)V

    const/16 p1, 0x1f7

    if-eq p2, p1, :cond_e

    const/16 p1, 0x1ad

    if-ne p2, p1, :cond_f

    :cond_e
    iget-object p1, p0, LR2/D5;->i:LR2/g5;

    iget-object p1, p1, LR2/g5;->f:LR2/q2;

    invoke-virtual {p0}, LR2/D5;->b()LE2/e;

    move-result-object p2

    invoke-interface {p2}, LE2/e;->a()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, LR2/q2;->b(J)V

    :cond_f
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    move-result-object p1

    invoke-virtual {p1, v0}, LR2/p;->a0(Ljava/util/List;)V

    invoke-direct {p0}, LR2/D5;->N()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_8
    iput-boolean p5, p0, LR2/D5;->u:Z

    invoke-direct {p0}, LR2/D5;->M()V

    return-void

    :goto_9
    iput-boolean p5, p0, LR2/D5;->u:Z

    invoke-direct {p0}, LR2/D5;->M()V

    throw p1
.end method

.method public final J(ILjava/nio/channels/FileChannel;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p2, :cond_2

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    const/4 v1, 0x4

    .line 19
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 27
    .line 28
    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    :try_start_0
    invoke-virtual {p2, v2, v3}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, v1}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    invoke-virtual {p2, p1}, Ljava/nio/channels/FileChannel;->force(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/nio/channels/FileChannel;->size()J

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    const-wide/16 v3, 0x4

    .line 46
    .line 47
    cmp-long v1, v1, v3

    .line 48
    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const-string v2, "Error writing to channel. Bytes written"

    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/nio/channels/FileChannel;->size()J

    .line 62
    .line 63
    .line 64
    move-result-wide v3

    .line 65
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {v1, v2, p2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catch_0
    move-exception p1

    .line 74
    goto :goto_1

    .line 75
    :cond_1
    :goto_0
    return p1

    .line 76
    :goto_1
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-virtual {p2}, LR2/Y1;->G()LR2/a2;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    const-string v1, "Failed to write to channel"

    .line 85
    .line 86
    invoke-virtual {p2, v1, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    return v0

    .line 90
    :cond_2
    :goto_2
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    const-string p2, "Bad channel to read from"

    .line 99
    .line 100
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return v0
.end method

.method public final K(Lcom/google/android/gms/internal/measurement/Y1$a;Lcom/google/android/gms/internal/measurement/Y1$a;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "_e"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, LA2/n;->a(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, LR2/D5;->m0()LR2/N5;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/google/android/gms/internal/measurement/Y3;

    .line 22
    .line 23
    check-cast v0, Lcom/google/android/gms/internal/measurement/Y1;

    .line 24
    .line 25
    const-string v2, "_sc"

    .line 26
    .line 27
    invoke-static {v0, v2}, LR2/N5;->G(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v2, 0x0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    move-object v0, v2

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a2;->d0()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :goto_0
    invoke-virtual {p0}, LR2/D5;->m0()LR2/N5;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Lcom/google/android/gms/internal/measurement/Y3;

    .line 48
    .line 49
    check-cast v3, Lcom/google/android/gms/internal/measurement/Y1;

    .line 50
    .line 51
    const-string v4, "_pc"

    .line 52
    .line 53
    invoke-static {v3, v4}, LR2/N5;->G(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-nez v3, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/a2;->d0()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    :goto_1
    if-eqz v2, :cond_5

    .line 65
    .line 66
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-static {v0}, LA2/n;->a(Z)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, LR2/D5;->m0()LR2/N5;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Lcom/google/android/gms/internal/measurement/Y3;

    .line 91
    .line 92
    check-cast v0, Lcom/google/android/gms/internal/measurement/Y1;

    .line 93
    .line 94
    const-string v1, "_et"

    .line 95
    .line 96
    invoke-static {v0, v1}, LR2/N5;->G(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a2;->h0()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_4

    .line 107
    .line 108
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a2;->X()J

    .line 109
    .line 110
    .line 111
    move-result-wide v2

    .line 112
    const-wide/16 v4, 0x0

    .line 113
    .line 114
    cmp-long v2, v2, v4

    .line 115
    .line 116
    if-gtz v2, :cond_2

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a2;->X()J

    .line 120
    .line 121
    .line 122
    move-result-wide v2

    .line 123
    invoke-virtual {p0}, LR2/D5;->m0()LR2/N5;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, Lcom/google/android/gms/internal/measurement/Y3;

    .line 131
    .line 132
    check-cast v0, Lcom/google/android/gms/internal/measurement/Y1;

    .line 133
    .line 134
    invoke-static {v0, v1}, LR2/N5;->G(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    if-eqz v0, :cond_3

    .line 139
    .line 140
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a2;->X()J

    .line 141
    .line 142
    .line 143
    move-result-wide v6

    .line 144
    cmp-long v4, v6, v4

    .line 145
    .line 146
    if-lez v4, :cond_3

    .line 147
    .line 148
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a2;->X()J

    .line 149
    .line 150
    .line 151
    move-result-wide v4

    .line 152
    add-long/2addr v2, v4

    .line 153
    :cond_3
    invoke-virtual {p0}, LR2/D5;->m0()LR2/N5;

    .line 154
    .line 155
    .line 156
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-static {p2, v1, v0}, LR2/N5;->R(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0}, LR2/D5;->m0()LR2/N5;

    .line 164
    .line 165
    .line 166
    const-wide/16 v0, 0x1

    .line 167
    .line 168
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    const-string v0, "_fr"

    .line 173
    .line 174
    invoke-static {p1, v0, p2}, LR2/N5;->R(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_4
    :goto_2
    const/4 p1, 0x1

    .line 178
    return p1

    .line 179
    :cond_5
    const/4 p1, 0x0

    .line 180
    return p1
.end method

.method public final L(Ljava/lang/String;J)Z
    .locals 42

    .line 1
    move-object/from16 v1, p0

    const-string v2, "_ai"

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v3

    invoke-virtual {v3}, LR2/p;->Q0()V

    :try_start_0
    new-instance v3, LR2/D5$a;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v4}, LR2/D5$a;-><init>(LR2/D5;LR2/L5;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v5

    iget-wide v6, v1, LR2/D5;->A:J

    invoke-static {v3}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5}, LR2/m3;->n()V

    invoke-virtual {v5}, LR2/C5;->u()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const-wide/16 v9, -0x1

    const/4 v11, 0x1

    const/4 v12, 0x0

    :try_start_1
    invoke-virtual {v5}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v15

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v14, ""

    const/4 v8, 0x2

    if-eqz v13, :cond_3

    cmp-long v13, v6, v9

    if-eqz v13, :cond_0

    :try_start_2
    new-array v4, v8, [Ljava/lang/String;

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v16

    aput-object v16, v4, v12

    invoke-static/range {p2 .. p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v16

    aput-object v16, v4, v11

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v1, v0

    const/4 v4, 0x0

    goto/16 :goto_41

    :catch_0
    move-exception v0

    move-object v6, v0

    const/4 v4, 0x0

    :goto_0
    const/4 v8, 0x0

    goto/16 :goto_9

    :cond_0
    new-array v4, v11, [Ljava/lang/String;

    invoke-static/range {p2 .. p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v16

    aput-object v16, v4, v12

    :goto_1
    if-eqz v13, :cond_1

    const-string v14, "rowid <= ? and "

    :cond_1
    new-instance v13, Ljava/lang/StringBuilder;

    const-string v8, "select app_id, metadata_fingerprint from raw_events where "

    invoke-direct {v13, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v15, v8, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v8
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-nez v8, :cond_2

    :goto_2
    :try_start_4
    invoke-interface {v4}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto/16 :goto_a

    :catchall_1
    move-exception v0

    move-object v1, v0

    goto/16 :goto_42

    :cond_2
    :try_start_5
    invoke-interface {v4, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-interface {v4}, Landroid/database/Cursor;->close()V
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    move-object/from16 v22, v4

    move-object v4, v13

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object v1, v0

    goto/16 :goto_41

    :catch_1
    move-exception v0

    :goto_3
    move-object v6, v0

    goto/16 :goto_9

    :catch_2
    move-exception v0

    move-object v6, v0

    goto :goto_0

    :cond_3
    cmp-long v4, v6, v9

    if-eqz v4, :cond_4

    const/4 v8, 0x2

    :try_start_7
    new-array v13, v8, [Ljava/lang/String;

    const/4 v8, 0x0

    aput-object v8, v13, v12

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v13, v11

    goto :goto_4

    :cond_4
    const/4 v8, 0x0

    filled-new-array {v8}, [Ljava/lang/String;

    move-result-object v13

    :goto_4
    if-eqz v4, :cond_5

    const-string v14, " and rowid <= ?"

    :cond_5
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v8, "select metadata_fingerprint from raw_events where app_id = ?"

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " order by rowid limit 1;"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15, v4, v13}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v8

    if-nez v8, :cond_6

    goto :goto_2

    :cond_6
    invoke-interface {v4, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-interface {v4}, Landroid/database/Cursor;->close()V
    :try_end_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    move-object/from16 v22, v4

    move-object v4, v13

    const/4 v8, 0x0

    :goto_5
    :try_start_9
    const-string v14, "raw_events_metadata"

    new-array v13, v11, [Ljava/lang/String;

    const-string v16, "metadata"

    aput-object v16, v13, v12

    const-string v16, "app_id = ? and metadata_fingerprint = ?"

    filled-new-array {v8, v4}, [Ljava/lang/String;

    move-result-object v17

    const-string v20, "rowid"

    const-string v21, "2"

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v23, v13

    move-object v13, v15

    move-object/from16 v24, v15

    move-object/from16 v15, v23

    invoke-virtual/range {v13 .. v21}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v15
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_8
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    :try_start_a
    invoke-interface {v15}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v13
    :try_end_a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_a .. :try_end_a} :catch_6
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    if-nez v13, :cond_7

    :try_start_b
    invoke-virtual {v5}, LR2/m3;->j()LR2/Y1;

    move-result-object v4

    invoke-virtual {v4}, LR2/Y1;->G()LR2/a2;

    move-result-object v4

    const-string v6, "Raw event metadata record is missing. appId"

    invoke-static {v8}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v4, v6, v7}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :try_start_c
    invoke-interface {v15}, Landroid/database/Cursor;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    goto/16 :goto_a

    :catchall_3
    move-exception v0

    move-object v1, v0

    move-object v4, v15

    goto/16 :goto_41

    :catch_3
    move-exception v0

    move-object v6, v0

    move-object v4, v15

    goto/16 :goto_9

    :cond_7
    :try_start_d
    invoke-interface {v15, v12}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v13
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_6
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    :try_start_e
    invoke-static {}, Lcom/google/android/gms/internal/measurement/d2;->A3()Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v14

    invoke-static {v14, v13}, LR2/N5;->H(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/measurement/d2$a;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v13, Lcom/google/android/gms/internal/measurement/d2;
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_e .. :try_end_e} :catch_6
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    :try_start_f
    invoke-interface {v15}, Landroid/database/Cursor;->moveToNext()Z

    move-result v14
    :try_end_f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_6
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    if-eqz v14, :cond_8

    :try_start_10
    invoke-virtual {v5}, LR2/m3;->j()LR2/Y1;

    move-result-object v14

    invoke-virtual {v14}, LR2/Y1;->L()LR2/a2;

    move-result-object v14

    const-string v11, "Get multiple raw event metadata records, expected one. appId"

    invoke-static {v8}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v14, v11, v12}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_10
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_10 .. :try_end_10} :catch_3
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    :cond_8
    :try_start_11
    invoke-interface {v15}, Landroid/database/Cursor;->close()V

    invoke-interface {v3, v13}, LR2/t;->a(Lcom/google/android/gms/internal/measurement/d2;)V
    :try_end_11
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_11 .. :try_end_11} :catch_6
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    cmp-long v11, v6, v9

    if-eqz v11, :cond_9

    :try_start_12
    const-string v11, "app_id = ? and metadata_fingerprint = ? and rowid <= ?"

    const/4 v12, 0x3

    new-array v13, v12, [Ljava/lang/String;

    const/4 v12, 0x0

    aput-object v8, v13, v12

    const/4 v12, 0x1

    aput-object v4, v13, v12

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x2

    aput-object v4, v13, v6
    :try_end_12
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_12 .. :try_end_12} :catch_3
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    move-object/from16 v16, v11

    move-object/from16 v17, v13

    goto :goto_6

    :cond_9
    :try_start_13
    const-string v6, "app_id = ? and metadata_fingerprint = ?"

    filled-new-array {v8, v4}, [Ljava/lang/String;

    move-result-object v4

    move-object/from16 v17, v4

    move-object/from16 v16, v6

    :goto_6
    const-string v14, "raw_events"

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/String;

    const-string v6, "rowid"

    const/4 v7, 0x0

    aput-object v6, v4, v7

    const-string v6, "name"

    const/4 v7, 0x1

    aput-object v6, v4, v7

    const-string v6, "timestamp"

    const/4 v7, 0x2

    aput-object v6, v4, v7

    const-string v6, "data"

    const/4 v7, 0x3

    aput-object v6, v4, v7

    const-string v20, "rowid"
    :try_end_13
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_13 .. :try_end_13} :catch_6
    .catchall {:try_start_13 .. :try_end_13} :catchall_5

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v13, v24

    move-object v6, v15

    move-object v15, v4

    :try_start_14
    invoke-virtual/range {v13 .. v21}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4
    :try_end_14
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_14 .. :try_end_14} :catch_5
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    :try_start_15
    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v6

    if-nez v6, :cond_a

    invoke-virtual {v5}, LR2/m3;->j()LR2/Y1;

    move-result-object v6

    invoke-virtual {v6}, LR2/Y1;->L()LR2/a2;

    move-result-object v6

    const-string v7, "Raw event data disappeared while in transaction. appId"

    invoke-static {v8}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v6, v7, v11}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_a
    const/4 v6, 0x0

    invoke-interface {v4, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v11

    const/4 v6, 0x3

    invoke-interface {v4, v6}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v7
    :try_end_15
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_15 .. :try_end_15} :catch_1
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    :try_start_16
    invoke-static {}, Lcom/google/android/gms/internal/measurement/Y1;->Z()Lcom/google/android/gms/internal/measurement/Y1$a;

    move-result-object v6

    invoke-static {v6, v7}, LR2/N5;->H(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/Y1$a;
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_16 .. :try_end_16} :catch_1
    .catchall {:try_start_16 .. :try_end_16} :catchall_2

    const/4 v7, 0x1

    :try_start_17
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6, v13}, Lcom/google/android/gms/internal/measurement/Y1$a;->E(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/Y1$a;

    move-result-object v7

    const/4 v13, 0x2

    invoke-interface {v4, v13}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v14

    invoke-virtual {v7, v14, v15}, Lcom/google/android/gms/internal/measurement/Y1$a;->G(J)Lcom/google/android/gms/internal/measurement/Y1$a;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v6, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-interface {v3, v11, v12, v6}, LR2/t;->b(JLcom/google/android/gms/internal/measurement/Y1;)Z

    move-result v6

    if-nez v6, :cond_b

    goto/16 :goto_2

    :catch_4
    move-exception v0

    const/4 v13, 0x2

    move-object v6, v0

    invoke-virtual {v5}, LR2/m3;->j()LR2/Y1;

    move-result-object v7

    invoke-virtual {v7}, LR2/Y1;->G()LR2/a2;

    move-result-object v7

    const-string v11, "Data loss. Failed to merge raw event. appId"

    invoke-static {v8}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v7, v11, v12, v6}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_b
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v6
    :try_end_17
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_17 .. :try_end_17} :catch_1
    .catchall {:try_start_17 .. :try_end_17} :catchall_2

    if-nez v6, :cond_a

    goto/16 :goto_2

    :catchall_4
    move-exception v0

    :goto_7
    move-object v1, v0

    move-object v4, v6

    goto/16 :goto_41

    :catch_5
    move-exception v0

    :goto_8
    move-object v4, v6

    goto/16 :goto_3

    :catchall_5
    move-exception v0

    move-object v6, v15

    goto :goto_7

    :catch_6
    move-exception v0

    move-object v6, v15

    goto :goto_8

    :catch_7
    move-exception v0

    move-object v6, v15

    move-object v4, v0

    :try_start_18
    invoke-virtual {v5}, LR2/m3;->j()LR2/Y1;

    move-result-object v7

    invoke-virtual {v7}, LR2/Y1;->G()LR2/a2;

    move-result-object v7

    const-string v11, "Data loss. Failed to merge raw event metadata. appId"

    invoke-static {v8}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v7, v11, v12, v4}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_18
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_18 .. :try_end_18} :catch_5
    .catchall {:try_start_18 .. :try_end_18} :catchall_4

    :try_start_19
    invoke-interface {v6}, Landroid/database/Cursor;->close()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_1

    goto :goto_a

    :catchall_6
    move-exception v0

    move-object v1, v0

    move-object/from16 v4, v22

    goto/16 :goto_41

    :catch_8
    move-exception v0

    move-object v6, v0

    move-object/from16 v4, v22

    :goto_9
    :try_start_1a
    invoke-virtual {v5}, LR2/m3;->j()LR2/Y1;

    move-result-object v5

    invoke-virtual {v5}, LR2/Y1;->G()LR2/a2;

    move-result-object v5

    const-string v7, "Data loss. Error selecting raw event. appId"

    invoke-static {v8}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v5, v7, v8, v6}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_2

    if-eqz v4, :cond_c

    goto/16 :goto_2

    :cond_c
    :goto_a
    :try_start_1b
    iget-object v4, v3, LR2/D5$a;->c:Ljava/util/List;

    if-eqz v4, :cond_6a

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_d

    goto/16 :goto_40

    :cond_d
    iget-object v4, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/Y3;->x()Lcom/google/android/gms/internal/measurement/Y3$b;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/d2$a;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/d2$a;->t0()Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, -0x1

    const/4 v14, -0x1

    :goto_b
    iget-object v15, v3, LR2/D5$a;->c:Ljava/util/List;

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v15
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_1

    const-string v9, "_et"

    const-string v10, "_fr"

    const-string v5, "_e"

    move/from16 v18, v12

    const-string v12, "_c"

    move/from16 v19, v13

    move/from16 v20, v14

    if-ge v8, v15, :cond_31

    :try_start_1c
    iget-object v15, v3, LR2/D5$a;->c:Ljava/util/List;

    invoke-interface {v15, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y3;->x()Lcom/google/android/gms/internal/measurement/Y3$b;

    move-result-object v15

    check-cast v15, Lcom/google/android/gms/internal/measurement/Y1$a;

    invoke-virtual/range {p0 .. p0}, LR2/D5;->h0()LR2/x2;

    move-result-object v13

    iget-object v14, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v14

    move/from16 p3, v11

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v13, v14, v11}, LR2/x2;->O(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v11
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_1

    const-string v13, "_err"

    if-eqz v11, :cond_10

    :try_start_1d
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v5

    invoke-virtual {v5}, LR2/Y1;->L()LR2/a2;

    move-result-object v5

    const-string v9, "Dropping blocked raw event. appId"

    iget-object v10, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    iget-object v11, v1, LR2/D5;->l:LR2/N2;

    invoke-virtual {v11}, LR2/N2;->D()LR2/X1;

    move-result-object v11

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5, v9, v10, v11}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->h0()LR2/x2;

    move-result-object v5

    iget-object v9, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, LR2/x2;->X(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_f

    invoke-virtual/range {p0 .. p0}, LR2/D5;->h0()LR2/x2;

    move-result-object v5

    iget-object v9, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, LR2/x2;->Z(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_e

    goto :goto_c

    :cond_e
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_f

    invoke-virtual/range {p0 .. p0}, LR2/D5;->n0()LR2/S5;

    iget-object v9, v1, LR2/D5;->G:LR2/U5;

    iget-object v5, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v10

    const-string v12, "_ev"

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    const/16 v11, 0xb

    invoke-static/range {v9 .. v14}, LR2/S5;->N(LR2/U5;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    :cond_f
    :goto_c
    move/from16 v11, p3

    move-object/from16 v24, v2

    move-object/from16 v25, v6

    move/from16 v12, v18

    move/from16 v13, v19

    move/from16 v14, v20

    const/4 v6, -0x1

    const/4 v9, 0x3

    goto/16 :goto_20

    :cond_10
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v11

    invoke-static {v2}, LR2/r3;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_12

    invoke-virtual {v15, v2}, Lcom/google/android/gms/internal/measurement/Y1$a;->E(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/Y1$a;

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v11

    invoke-virtual {v11}, LR2/Y1;->K()LR2/a2;

    move-result-object v11

    const-string v14, "Renaming ad_impression to _ai"

    invoke-virtual {v11, v14}, LR2/a2;->a(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v11

    const/4 v14, 0x5

    invoke-virtual {v11, v14}, LR2/Y1;->C(I)Z

    move-result v11

    if-eqz v11, :cond_12

    const/4 v11, 0x0

    :goto_d
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y1$a;->w()I

    move-result v14

    if-ge v11, v14, :cond_12

    const-string v14, "ad_platform"

    invoke-virtual {v15, v11}, Lcom/google/android/gms/internal/measurement/Y1$a;->H(I)Lcom/google/android/gms/internal/measurement/a2;

    move-result-object v21

    move-object/from16 v24, v2

    invoke-virtual/range {v21 .. v21}, Lcom/google/android/gms/internal/measurement/a2;->c0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-virtual {v15, v11}, Lcom/google/android/gms/internal/measurement/Y1$a;->H(I)Lcom/google/android/gms/internal/measurement/a2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/a2;->d0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_11

    const-string v2, "admob"

    invoke-virtual {v15, v11}, Lcom/google/android/gms/internal/measurement/Y1$a;->H(I)Lcom/google/android/gms/internal/measurement/a2;

    move-result-object v14

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/a2;->d0()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v2, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v2

    invoke-virtual {v2}, LR2/Y1;->M()LR2/a2;

    move-result-object v2

    const-string v14, "AdMob ad impression logged from app. Potentially duplicative."

    invoke-virtual {v2, v14}, LR2/a2;->a(Ljava/lang/String;)V

    :cond_11
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v2, v24

    goto :goto_d

    :cond_12
    move-object/from16 v24, v2

    invoke-virtual/range {p0 .. p0}, LR2/D5;->h0()LR2/x2;

    move-result-object v2

    iget-object v11, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v2, v11, v14}, LR2/x2;->M(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_15

    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    move-result v14

    move/from16 v21, v8

    const v8, 0x17333

    if-eq v14, v8, :cond_13

    goto :goto_e

    :cond_13
    const-string v8, "_ui"

    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_14

    goto :goto_f

    :cond_14
    :goto_e
    move-object/from16 v25, v6

    move-object v14, v7

    move-object/from16 v26, v9

    move-object/from16 v27, v10

    goto/16 :goto_16

    :cond_15
    move/from16 v21, v8

    :goto_f
    move-object/from16 v25, v6

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    :goto_10
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y1$a;->w()I

    move-result v6
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_1

    move-object/from16 v26, v9

    const-string v9, "_r"

    if-ge v14, v6, :cond_18

    :try_start_1e
    invoke-virtual {v15, v14}, Lcom/google/android/gms/internal/measurement/Y1$a;->H(I)Lcom/google/android/gms/internal/measurement/a2;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/a2;->c0()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-virtual {v15, v14}, Lcom/google/android/gms/internal/measurement/Y1$a;->H(I)Lcom/google/android/gms/internal/measurement/a2;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/Y3;->x()Lcom/google/android/gms/internal/measurement/Y3$b;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/a2$a;

    const-wide/16 v8, 0x1

    invoke-virtual {v6, v8, v9}, Lcom/google/android/gms/internal/measurement/a2$a;->y(J)Lcom/google/android/gms/internal/measurement/a2$a;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v6, Lcom/google/android/gms/internal/measurement/a2;

    invoke-virtual {v15, v14, v6}, Lcom/google/android/gms/internal/measurement/Y1$a;->z(ILcom/google/android/gms/internal/measurement/a2;)Lcom/google/android/gms/internal/measurement/Y1$a;

    move-object/from16 v27, v10

    const/4 v8, 0x1

    goto :goto_11

    :cond_16
    invoke-virtual {v15, v14}, Lcom/google/android/gms/internal/measurement/Y1$a;->H(I)Lcom/google/android/gms/internal/measurement/a2;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/a2;->c0()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-virtual {v15, v14}, Lcom/google/android/gms/internal/measurement/Y1$a;->H(I)Lcom/google/android/gms/internal/measurement/a2;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/Y3;->x()Lcom/google/android/gms/internal/measurement/Y3$b;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/a2$a;

    move-object/from16 v27, v10

    const-wide/16 v9, 0x1

    invoke-virtual {v6, v9, v10}, Lcom/google/android/gms/internal/measurement/a2$a;->y(J)Lcom/google/android/gms/internal/measurement/a2$a;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v6, Lcom/google/android/gms/internal/measurement/a2;

    invoke-virtual {v15, v14, v6}, Lcom/google/android/gms/internal/measurement/Y1$a;->z(ILcom/google/android/gms/internal/measurement/a2;)Lcom/google/android/gms/internal/measurement/Y1$a;

    const/4 v11, 0x1

    goto :goto_11

    :cond_17
    move-object/from16 v27, v10

    :goto_11
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v9, v26

    move-object/from16 v10, v27

    goto :goto_10

    :cond_18
    move-object/from16 v27, v10

    if-nez v8, :cond_19

    if-eqz v2, :cond_19

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v6

    invoke-virtual {v6}, LR2/Y1;->K()LR2/a2;

    move-result-object v6

    const-string v8, "Marking event as conversion"

    iget-object v10, v1, LR2/D5;->l:LR2/N2;

    invoke-virtual {v10}, LR2/N2;->D()LR2/X1;

    move-result-object v10

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v10, v14}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v8, v10}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/a2;->Z()Lcom/google/android/gms/internal/measurement/a2$a;

    move-result-object v6

    invoke-virtual {v6, v12}, Lcom/google/android/gms/internal/measurement/a2$a;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;

    move-result-object v6

    move-object v10, v7

    const-wide/16 v7, 0x1

    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/internal/measurement/a2$a;->y(J)Lcom/google/android/gms/internal/measurement/a2$a;

    move-result-object v6

    invoke-virtual {v15, v6}, Lcom/google/android/gms/internal/measurement/Y1$a;->B(Lcom/google/android/gms/internal/measurement/a2$a;)Lcom/google/android/gms/internal/measurement/Y1$a;

    goto :goto_12

    :cond_19
    move-object v10, v7

    :goto_12
    if-nez v11, :cond_1a

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v6

    invoke-virtual {v6}, LR2/Y1;->K()LR2/a2;

    move-result-object v6

    const-string v7, "Marking event as real-time"

    iget-object v8, v1, LR2/D5;->l:LR2/N2;

    invoke-virtual {v8}, LR2/N2;->D()LR2/X1;

    move-result-object v8

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v11}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/a2;->Z()Lcom/google/android/gms/internal/measurement/a2$a;

    move-result-object v6

    invoke-virtual {v6, v9}, Lcom/google/android/gms/internal/measurement/a2$a;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;

    move-result-object v6

    const-wide/16 v7, 0x1

    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/internal/measurement/a2$a;->y(J)Lcom/google/android/gms/internal/measurement/a2$a;

    move-result-object v6

    invoke-virtual {v15, v6}, Lcom/google/android/gms/internal/measurement/Y1$a;->B(Lcom/google/android/gms/internal/measurement/a2$a;)Lcom/google/android/gms/internal/measurement/Y1$a;

    :cond_1a
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v28

    invoke-virtual/range {p0 .. p0}, LR2/D5;->u0()J

    move-result-wide v29

    iget-object v6, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v31

    const/16 v35, 0x0

    const/16 v36, 0x1

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-virtual/range {v28 .. v36}, LR2/p;->I(JLjava/lang/String;ZZZZZ)LR2/q;

    move-result-object v6

    iget-wide v6, v6, LR2/q;->e:J

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v8

    iget-object v11, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v11}, LR2/g;->A(Ljava/lang/String;)I

    move-result v8

    move-object v14, v10

    int-to-long v10, v8

    cmp-long v6, v6, v10

    if-lez v6, :cond_1b

    invoke-static {v15, v9}, LR2/D5;->w(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;)V

    goto :goto_13

    :cond_1b
    const/16 v18, 0x1

    :goto_13
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, LR2/S5;->J0(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_21

    if-eqz v2, :cond_21

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v28

    invoke-virtual/range {p0 .. p0}, LR2/D5;->u0()J

    move-result-wide v29

    iget-object v6, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v31

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x1

    invoke-virtual/range {v28 .. v36}, LR2/p;->I(JLjava/lang/String;ZZZZZ)LR2/q;

    move-result-object v6

    iget-wide v6, v6, LR2/q;->c:J

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v8

    iget-object v9, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v9

    sget-object v10, LR2/K;->p:LR2/P1;

    invoke-virtual {v8, v9, v10}, LR2/g;->u(Ljava/lang/String;LR2/P1;)I

    move-result v8

    int-to-long v8, v8

    cmp-long v6, v6, v8

    if-lez v6, :cond_21

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v6

    invoke-virtual {v6}, LR2/Y1;->L()LR2/a2;

    move-result-object v6

    const-string v7, "Too many conversions. Not logging as conversion. appId"

    iget-object v8, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_14
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y1$a;->w()I

    move-result v10

    if-ge v9, v10, :cond_1e

    invoke-virtual {v15, v9}, Lcom/google/android/gms/internal/measurement/Y1$a;->H(I)Lcom/google/android/gms/internal/measurement/a2;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/a2;->c0()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1c

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/Y3;->x()Lcom/google/android/gms/internal/measurement/Y3$b;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/a2$a;

    move-object v7, v6

    move v6, v9

    goto :goto_15

    :cond_1c
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/a2;->c0()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1d

    const/4 v8, 0x1

    :cond_1d
    :goto_15
    add-int/lit8 v9, v9, 0x1

    goto :goto_14

    :cond_1e
    if-eqz v8, :cond_1f

    if-eqz v7, :cond_1f

    invoke-virtual {v15, v6}, Lcom/google/android/gms/internal/measurement/Y1$a;->x(I)Lcom/google/android/gms/internal/measurement/Y1$a;

    goto :goto_16

    :cond_1f
    if-eqz v7, :cond_20

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/k3;->clone()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/Y3$b;

    check-cast v7, Lcom/google/android/gms/internal/measurement/a2$a;

    invoke-virtual {v7, v13}, Lcom/google/android/gms/internal/measurement/a2$a;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;

    move-result-object v7

    const-wide/16 v8, 0xa

    invoke-virtual {v7, v8, v9}, Lcom/google/android/gms/internal/measurement/a2$a;->y(J)Lcom/google/android/gms/internal/measurement/a2$a;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v7, Lcom/google/android/gms/internal/measurement/a2;

    invoke-virtual {v15, v6, v7}, Lcom/google/android/gms/internal/measurement/Y1$a;->z(ILcom/google/android/gms/internal/measurement/a2;)Lcom/google/android/gms/internal/measurement/Y1$a;

    goto :goto_16

    :cond_20
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v6

    invoke-virtual {v6}, LR2/Y1;->G()LR2/a2;

    move-result-object v6

    const-string v7, "Did not find conversion parameter. appId"

    iget-object v8, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_21
    :goto_16
    if-eqz v2, :cond_25

    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y1$a;->L()Ljava/util/List;

    move-result-object v6

    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v6, 0x0

    const/4 v7, -0x1

    const/4 v8, -0x1

    :goto_17
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v9
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_1

    const-string v10, "currency"

    const-string v11, "value"

    if-ge v6, v9, :cond_24

    :try_start_1f
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/a2;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/a2;->c0()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_22

    move v7, v6

    goto :goto_18

    :cond_22
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/a2;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/a2;->c0()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_23

    move v8, v6

    :cond_23
    :goto_18
    add-int/lit8 v6, v6, 0x1

    goto :goto_17

    :cond_24
    const/4 v6, -0x1

    if-eq v7, v6, :cond_26

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/a2;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/a2;->h0()Z

    move-result v6

    if-nez v6, :cond_27

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/a2;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/a2;->f0()Z

    move-result v6

    if-nez v6, :cond_27

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v2

    invoke-virtual {v2}, LR2/Y1;->M()LR2/a2;

    move-result-object v2

    const-string v6, "Value must be specified with a numeric type."

    invoke-virtual {v2, v6}, LR2/a2;->a(Ljava/lang/String;)V

    invoke-virtual {v15, v7}, Lcom/google/android/gms/internal/measurement/Y1$a;->x(I)Lcom/google/android/gms/internal/measurement/Y1$a;

    invoke-static {v15, v12}, LR2/D5;->w(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;)V

    const/16 v2, 0x12

    invoke-static {v15, v2, v11}, LR2/D5;->v(Lcom/google/android/gms/internal/measurement/Y1$a;ILjava/lang/String;)V

    :cond_25
    const/4 v6, -0x1

    :cond_26
    const/4 v9, 0x3

    goto :goto_1b

    :cond_27
    const/4 v6, -0x1

    if-ne v8, v6, :cond_28

    const/4 v9, 0x3

    goto :goto_1a

    :cond_28
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/a2;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/a2;->d0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v9, 0x3

    if-eq v8, v9, :cond_29

    goto :goto_1a

    :cond_29
    const/4 v8, 0x0

    :goto_19
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v11

    if-ge v8, v11, :cond_2b

    invoke-virtual {v2, v8}, Ljava/lang/String;->codePointAt(I)I

    move-result v11

    invoke-static {v11}, Ljava/lang/Character;->isLetter(I)Z

    move-result v13

    if-nez v13, :cond_2a

    :goto_1a
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v2

    invoke-virtual {v2}, LR2/Y1;->M()LR2/a2;

    move-result-object v2

    const-string v8, "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."

    invoke-virtual {v2, v8}, LR2/a2;->a(Ljava/lang/String;)V

    invoke-virtual {v15, v7}, Lcom/google/android/gms/internal/measurement/Y1$a;->x(I)Lcom/google/android/gms/internal/measurement/Y1$a;

    invoke-static {v15, v12}, LR2/D5;->w(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;)V

    const/16 v2, 0x13

    invoke-static {v15, v2, v10}, LR2/D5;->v(Lcom/google/android/gms/internal/measurement/Y1$a;ILjava/lang/String;)V

    goto :goto_1b

    :cond_2a
    invoke-static {v11}, Ljava/lang/Character;->charCount(I)I

    move-result v11

    add-int/2addr v8, v11

    goto :goto_19

    :cond_2b
    :goto_1b
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-wide/16 v7, 0x3e8

    if-eqz v2, :cond_2f

    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v2, Lcom/google/android/gms/internal/measurement/Y1;

    move-object/from16 v10, v27

    invoke-static {v2, v10}, LR2/N5;->G(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2;

    move-result-object v2

    if-nez v2, :cond_2d

    if-eqz v14, :cond_2c

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/Y1$a;->I()J

    move-result-wide v10

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y1$a;->I()J

    move-result-wide v12

    sub-long/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->abs(J)J

    move-result-wide v10

    cmp-long v2, v10, v7

    if-gtz v2, :cond_2c

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/k3;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/Y3$b;

    check-cast v2, Lcom/google/android/gms/internal/measurement/Y1$a;

    invoke-virtual {v1, v15, v2}, LR2/D5;->K(Lcom/google/android/gms/internal/measurement/Y1$a;Lcom/google/android/gms/internal/measurement/Y1$a;)Z

    move-result v5

    if-eqz v5, :cond_2c

    move/from16 v5, v20

    invoke-virtual {v4, v5, v2}, Lcom/google/android/gms/internal/measurement/d2$a;->y(ILcom/google/android/gms/internal/measurement/Y1$a;)Lcom/google/android/gms/internal/measurement/d2$a;

    move v14, v5

    move/from16 v13, v19

    :goto_1c
    const/4 v2, 0x0

    const/16 v25, 0x0

    goto/16 :goto_1f

    :cond_2c
    move/from16 v5, v20

    move/from16 v13, p3

    move-object v2, v14

    move-object/from16 v25, v15

    :goto_1d
    move v14, v5

    goto :goto_1f

    :cond_2d
    move/from16 v5, v20

    :cond_2e
    move/from16 v7, v19

    goto :goto_1e

    :cond_2f
    move/from16 v5, v20

    const-string v2, "_vs"

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2e

    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v2, Lcom/google/android/gms/internal/measurement/Y1;

    move-object/from16 v11, v26

    invoke-static {v2, v11}, LR2/N5;->G(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2;

    move-result-object v2

    if-nez v2, :cond_2e

    if-eqz v25, :cond_30

    invoke-virtual/range {v25 .. v25}, Lcom/google/android/gms/internal/measurement/Y1$a;->I()J

    move-result-wide v10

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y1$a;->I()J

    move-result-wide v12

    sub-long/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->abs(J)J

    move-result-wide v10

    cmp-long v2, v10, v7

    if-gtz v2, :cond_30

    invoke-virtual/range {v25 .. v25}, Lcom/google/android/gms/internal/measurement/k3;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/Y3$b;

    check-cast v2, Lcom/google/android/gms/internal/measurement/Y1$a;

    invoke-virtual {v1, v2, v15}, LR2/D5;->K(Lcom/google/android/gms/internal/measurement/Y1$a;Lcom/google/android/gms/internal/measurement/Y1$a;)Z

    move-result v7

    if-eqz v7, :cond_30

    move/from16 v7, v19

    invoke-virtual {v4, v7, v2}, Lcom/google/android/gms/internal/measurement/d2$a;->y(ILcom/google/android/gms/internal/measurement/Y1$a;)Lcom/google/android/gms/internal/measurement/d2$a;

    move v14, v5

    move v13, v7

    goto :goto_1c

    :cond_30
    move/from16 v7, v19

    move/from16 v14, p3

    move v13, v7

    move-object v2, v15

    goto :goto_1f

    :goto_1e
    move v13, v7

    move-object v2, v14

    goto :goto_1d

    :goto_1f
    iget-object v5, v3, LR2/D5$a;->c:Ljava/util/List;

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v7, Lcom/google/android/gms/internal/measurement/Y1;

    move/from16 v8, v21

    invoke-interface {v5, v8, v7}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v11, p3, 0x1

    invoke-virtual {v4, v15}, Lcom/google/android/gms/internal/measurement/d2$a;->D(Lcom/google/android/gms/internal/measurement/Y1$a;)Lcom/google/android/gms/internal/measurement/d2$a;

    move-object v7, v2

    move/from16 v12, v18

    :goto_20
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v2, v24

    move-object/from16 v6, v25

    const-wide/16 v9, -0x1

    goto/16 :goto_b

    :cond_31
    move/from16 p3, v11

    move-object v11, v9

    const-wide/16 v6, 0x0

    move/from16 v2, p3

    move-wide v13, v6

    const/4 v8, 0x0

    :goto_21
    if-ge v8, v2, :cond_35

    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/measurement/d2$a;->x(I)Lcom/google/android/gms/internal/measurement/Y1;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y1;->b0()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_33

    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    invoke-static {v9, v10}, LR2/N5;->G(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2;

    move-result-object v15

    if-eqz v15, :cond_33

    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/measurement/d2$a;->L(I)Lcom/google/android/gms/internal/measurement/d2$a;

    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v8, v8, -0x1

    :cond_32
    :goto_22
    const/4 v9, 0x1

    goto :goto_24

    :cond_33
    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    invoke-static {v9, v11}, LR2/N5;->G(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2;

    move-result-object v9

    if-eqz v9, :cond_32

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/a2;->h0()Z

    move-result v15

    if-eqz v15, :cond_34

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/a2;->X()J

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    goto :goto_23

    :cond_34
    const/4 v9, 0x0

    :goto_23
    if-eqz v9, :cond_32

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v19

    cmp-long v15, v19, v6

    if-lez v15, :cond_32

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v19

    add-long v13, v13, v19

    goto :goto_22

    :goto_24
    add-int/2addr v8, v9

    goto :goto_21

    :cond_35
    const/4 v2, 0x0

    invoke-virtual {v1, v4, v13, v14, v2}, LR2/D5;->x(Lcom/google/android/gms/internal/measurement/d2$a;JZ)V

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/d2$a;->Y0()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_36
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_1

    const-string v8, "_se"

    if-eqz v5, :cond_37

    :try_start_20
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/Y1;

    const-string v9, "_s"

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/Y1;->b0()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_36

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v2

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/d2$a;->S0()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5, v8}, LR2/p;->L0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_37
    const-string v2, "_sid"

    invoke-static {v4, v2}, LR2/N5;->y(Lcom/google/android/gms/internal/measurement/d2$a;Ljava/lang/String;)I

    move-result v2

    if-ltz v2, :cond_38

    const/4 v2, 0x1

    invoke-virtual {v1, v4, v13, v14, v2}, LR2/D5;->x(Lcom/google/android/gms/internal/measurement/d2$a;JZ)V

    goto :goto_25

    :cond_38
    invoke-static {v4, v8}, LR2/N5;->y(Lcom/google/android/gms/internal/measurement/d2$a;Ljava/lang/String;)I

    move-result v2

    if-ltz v2, :cond_39

    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/measurement/d2$a;->R(I)Lcom/google/android/gms/internal/measurement/d2$a;

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v2

    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    move-result-object v2

    const-string v5, "Session engagement user property is in the bundle without session ID. appId"

    iget-object v8, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v2, v5, v8}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_39
    :goto_25
    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    move-result-object v2

    invoke-virtual {v2, v4}, LR2/N5;->T(Lcom/google/android/gms/internal/measurement/d2$a;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    move-result v2

    if-eqz v2, :cond_3b

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v2

    sget-object v5, LR2/K;->T0:LR2/P1;

    invoke-virtual {v2, v5}, LR2/g;->s(LR2/P1;)Z

    move-result v2

    if-eqz v2, :cond_3b

    iget-object v2, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e()LR2/G2;

    move-result-object v5

    invoke-virtual {v5}, LR2/m3;->n()V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->p0()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    move-result v5

    if-eqz v5, :cond_3b

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v5

    invoke-virtual {v5, v2}, LR2/p;->D0(Ljava/lang/String;)LR2/I2;

    move-result-object v5

    if-nez v5, :cond_3a

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v5

    invoke-virtual {v5}, LR2/Y1;->G()LR2/a2;

    move-result-object v5

    const-string v8, "Cannot fix consent fields without appInfo. appId"

    invoke-static {v2}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v5, v8, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_26

    :cond_3a
    invoke-virtual {v1, v5, v4}, LR2/D5;->s(LR2/I2;Lcom/google/android/gms/internal/measurement/d2$a;)V

    :cond_3b
    :goto_26
    const-wide v8, 0x7fffffffffffffffL

    invoke-virtual {v4, v8, v9}, Lcom/google/android/gms/internal/measurement/d2$a;->v0(J)Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v2

    const-wide/high16 v8, -0x8000000000000000L

    invoke-virtual {v2, v8, v9}, Lcom/google/android/gms/internal/measurement/d2$a;->e0(J)Lcom/google/android/gms/internal/measurement/d2$a;

    const/4 v2, 0x0

    :goto_27
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/d2$a;->w()I

    move-result v5

    if-ge v2, v5, :cond_3e

    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/measurement/d2$a;->x(I)Lcom/google/android/gms/internal/measurement/Y1;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/Y1;->Y()J

    move-result-wide v8

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/d2$a;->W()J

    move-result-wide v10

    cmp-long v8, v8, v10

    if-gez v8, :cond_3c

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/Y1;->Y()J

    move-result-wide v8

    invoke-virtual {v4, v8, v9}, Lcom/google/android/gms/internal/measurement/d2$a;->v0(J)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_3c
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/Y1;->Y()J

    move-result-wide v8

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/d2$a;->Q()J

    move-result-wide v10

    cmp-long v8, v8, v10

    if-lez v8, :cond_3d

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/Y1;->Y()J

    move-result-wide v8

    invoke-virtual {v4, v8, v9}, Lcom/google/android/gms/internal/measurement/d2$a;->e0(J)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_3d
    add-int/lit8 v2, v2, 0x1

    goto :goto_27

    :cond_3e
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/d2$a;->P0()Lcom/google/android/gms/internal/measurement/d2$a;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/g7;->a()Z

    move-result v2

    if-eqz v2, :cond_43

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v2

    iget-object v5, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v5

    sget-object v8, LR2/K;->L0:LR2/P1;

    invoke-virtual {v2, v5, v8}, LR2/g;->B(Ljava/lang/String;LR2/P1;)Z

    move-result v2

    if-eqz v2, :cond_43

    invoke-virtual/range {p0 .. p0}, LR2/D5;->n0()LR2/S5;

    iget-object v2, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LR2/S5;->D0(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_43

    iget-object v2, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LR2/D5;->Q(Ljava/lang/String;)LR2/q3;

    move-result-object v2

    invoke-virtual {v2}, LR2/q3;->x()Z

    move-result v2

    if-eqz v2, :cond_43

    iget-object v2, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d2;->u0()Z

    move-result v2

    if-eqz v2, :cond_43

    const/4 v2, 0x0

    :goto_28
    iget-object v5, v3, LR2/D5$a;->c:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v2, v5, :cond_43

    iget-object v5, v3, LR2/D5$a;->c:Ljava/util/List;

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/Y3;->x()Lcom/google/android/gms/internal/measurement/Y3$b;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/Y1$a;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/Y1$a;->L()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_3f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_42

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/a2;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/a2;->c0()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3f

    iget-object v8, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/d2;->k()I

    move-result v8

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v9

    iget-object v10, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v10

    sget-object v11, LR2/K;->X:LR2/P1;

    invoke-virtual {v9, v10, v11}, LR2/g;->u(Ljava/lang/String;LR2/P1;)I

    move-result v9

    if-lt v8, v9, :cond_41

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v8

    iget-object v9, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v9

    sget-object v10, LR2/K;->N0:LR2/P1;

    invoke-virtual {v8, v9, v10}, LR2/g;->B(Ljava/lang/String;LR2/P1;)Z

    move-result v8

    if-eqz v8, :cond_40

    invoke-virtual/range {p0 .. p0}, LR2/D5;->n0()LR2/S5;

    move-result-object v8

    invoke-virtual {v8}, LR2/S5;->S0()Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Lcom/google/android/gms/internal/measurement/a2;->Z()Lcom/google/android/gms/internal/measurement/a2$a;

    move-result-object v9

    const-string v10, "_tu"

    invoke-virtual {v9, v10}, Lcom/google/android/gms/internal/measurement/a2$a;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;

    move-result-object v9

    invoke-virtual {v9, v8}, Lcom/google/android/gms/internal/measurement/a2$a;->D(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v9, Lcom/google/android/gms/internal/measurement/a2;

    invoke-virtual {v5, v9}, Lcom/google/android/gms/internal/measurement/Y1$a;->C(Lcom/google/android/gms/internal/measurement/a2;)Lcom/google/android/gms/internal/measurement/Y1$a;

    goto :goto_29

    :cond_40
    const/4 v8, 0x0

    :goto_29
    invoke-static {}, Lcom/google/android/gms/internal/measurement/a2;->Z()Lcom/google/android/gms/internal/measurement/a2$a;

    move-result-object v9

    const-string v10, "_tr"

    invoke-virtual {v9, v10}, Lcom/google/android/gms/internal/measurement/a2$a;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;

    move-result-object v9

    const-wide/16 v10, 0x1

    invoke-virtual {v9, v10, v11}, Lcom/google/android/gms/internal/measurement/a2$a;->y(J)Lcom/google/android/gms/internal/measurement/a2$a;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v9, Lcom/google/android/gms/internal/measurement/a2;

    invoke-virtual {v5, v9}, Lcom/google/android/gms/internal/measurement/Y1$a;->C(Lcom/google/android/gms/internal/measurement/a2;)Lcom/google/android/gms/internal/measurement/Y1$a;

    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    move-result-object v9

    iget-object v10, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v10

    iget-object v11, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v9, v10, v11, v5, v8}, LR2/N5;->C(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/d2;Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;)LR2/v5;

    move-result-object v8

    if-eqz v8, :cond_41

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v9

    invoke-virtual {v9}, LR2/Y1;->K()LR2/a2;

    move-result-object v9

    const-string v10, "Generated trigger URI. appId, uri"

    iget-object v11, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v11

    iget-object v13, v8, LR2/v5;->o:Ljava/lang/String;

    invoke-virtual {v9, v10, v11, v13}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v9

    iget-object v10, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10, v8}, LR2/p;->h0(Ljava/lang/String;LR2/v5;)Z

    iget-object v8, v1, LR2/D5;->q:Ljava/util/Set;

    iget-object v9, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_41
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v5, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-virtual {v4, v2, v5}, Lcom/google/android/gms/internal/measurement/d2$a;->z(ILcom/google/android/gms/internal/measurement/Y1;)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_42
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_28

    :cond_43
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/d2$a;->h0()Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, LR2/D5;->X()LR2/b6;

    move-result-object v8

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/d2$a;->S0()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/d2$a;->Y0()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/d2$a;->Z0()Ljava/util/List;

    move-result-object v11

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/d2$a;->W()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/d2$a;->Q()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-virtual/range {v8 .. v13}, LR2/b6;->z(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/measurement/d2$a;->H(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/d2$a;

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v2

    iget-object v5, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, LR2/g;->L(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5c

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->n0()LR2/S5;

    move-result-object v8

    invoke-virtual {v8}, LR2/S5;->U0()Ljava/security/SecureRandom;

    move-result-object v8

    const/4 v12, 0x0

    :goto_2a
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/d2$a;->w()I

    move-result v9

    if-ge v12, v9, :cond_59

    invoke-virtual {v4, v12}, Lcom/google/android/gms/internal/measurement/d2$a;->x(I)Lcom/google/android/gms/internal/measurement/Y1;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y3;->x()Lcom/google/android/gms/internal/measurement/Y3$b;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/Y1$a;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v10

    const-string v11, "_ep"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_1

    const-string v11, "_sr"

    if-eqz v10, :cond_48

    :try_start_21
    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v10, Lcom/google/android/gms/internal/measurement/Y1;

    const-string v13, "_en"

    invoke-static {v10, v13}, LR2/N5;->e0(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v2, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LR2/E;

    if-nez v13, :cond_44

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v13

    iget-object v14, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v14

    invoke-static {v10}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v13, v14, v15}, LR2/p;->C0(Ljava/lang/String;Ljava/lang/String;)LR2/E;

    move-result-object v13

    if-eqz v13, :cond_44

    invoke-interface {v2, v10, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_44
    if-eqz v13, :cond_47

    iget-object v10, v13, LR2/E;->i:Ljava/lang/Long;

    if-nez v10, :cond_47

    iget-object v10, v13, LR2/E;->j:Ljava/lang/Long;

    if-eqz v10, :cond_45

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    const-wide/16 v19, 0x1

    cmp-long v10, v14, v19

    if-lez v10, :cond_45

    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    iget-object v10, v13, LR2/E;->j:Ljava/lang/Long;

    invoke-static {v9, v11, v10}, LR2/N5;->R(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_45
    iget-object v10, v13, LR2/E;->k:Ljava/lang/Boolean;

    if-eqz v10, :cond_46

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-eqz v10, :cond_46

    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    const-string v10, "_efs"

    const-wide/16 v13, 0x1

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-static {v9, v10, v11}, LR2/N5;->R(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_46
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v10, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-interface {v5, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_47
    :goto_2b
    invoke-virtual {v4, v12, v9}, Lcom/google/android/gms/internal/measurement/d2$a;->y(ILcom/google/android/gms/internal/measurement/Y1$a;)Lcom/google/android/gms/internal/measurement/d2$a;

    move-object v15, v3

    move-object v1, v4

    move v3, v12

    const-wide/16 v12, 0x1

    goto/16 :goto_34

    :cond_48
    invoke-virtual/range {p0 .. p0}, LR2/D5;->h0()LR2/x2;

    move-result-object v10

    iget-object v13, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, LR2/x2;->y(Ljava/lang/String;)J

    move-result-wide v13

    invoke-virtual/range {p0 .. p0}, LR2/D5;->n0()LR2/S5;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y1$a;->I()J

    move-result-wide v6

    invoke-static {v6, v7, v13, v14}, LR2/S5;->y(JJ)J

    move-result-wide v6

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v10, Lcom/google/android/gms/internal/measurement/Y1;

    const-string v15, "_dbg"

    const-wide/16 v19, 0x1

    invoke-static/range {v19 .. v20}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v19

    if-nez v19, :cond_4c

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/Y1;->c0()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2c
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_4c

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Lcom/google/android/gms/internal/measurement/a2;

    move-object/from16 p3, v10

    invoke-virtual/range {v19 .. v19}, Lcom/google/android/gms/internal/measurement/a2;->c0()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v15, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4b

    invoke-virtual/range {v19 .. v19}, Lcom/google/android/gms/internal/measurement/a2;->X()J

    move-result-wide v20

    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-virtual {v1, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_4a

    instance-of v10, v1, Ljava/lang/String;

    if-eqz v10, :cond_49

    invoke-virtual/range {v19 .. v19}, Lcom/google/android/gms/internal/measurement/a2;->d0()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_4a

    :cond_49
    instance-of v10, v1, Ljava/lang/Double;

    if-eqz v10, :cond_4c

    invoke-virtual/range {v19 .. v19}, Lcom/google/android/gms/internal/measurement/a2;->G()D

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    invoke-virtual {v1, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4c

    :cond_4a
    const/4 v1, 0x1

    goto :goto_2d

    :cond_4b
    move-object/from16 v10, p3

    goto :goto_2c

    :cond_4c
    invoke-virtual/range {p0 .. p0}, LR2/D5;->h0()LR2/x2;

    move-result-object v1

    iget-object v10, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1, v10, v15}, LR2/x2;->I(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    :goto_2d
    if-gtz v1, :cond_4d

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v6

    invoke-virtual {v6}, LR2/Y1;->L()LR2/a2;

    move-result-object v6

    const-string v7, "Sample rate must be positive. event, rate"

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v10

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v7, v10, v1}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v1, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2b

    :cond_4d
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v2, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LR2/E;

    if-nez v10, :cond_4e

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v10

    iget-object v15, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v15

    move-wide/from16 v19, v13

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v15, v13}, LR2/p;->C0(Ljava/lang/String;Ljava/lang/String;)LR2/E;

    move-result-object v10

    if-nez v10, :cond_4f

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v10

    invoke-virtual {v10}, LR2/Y1;->L()LR2/a2;

    move-result-object v10

    const-string v13, "Event being bundled has no eventAggregate. appId, eventName"

    iget-object v14, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v10, v13, v14, v15}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v10, LR2/E;

    iget-object v13, v3, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v26

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v27

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y1$a;->I()J

    move-result-wide v34

    const/16 v40, 0x0

    const/16 v41, 0x0

    const-wide/16 v28, 0x1

    const-wide/16 v30, 0x1

    const-wide/16 v32, 0x1

    const-wide/16 v36, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    move-object/from16 v25, v10

    invoke-direct/range {v25 .. v41}, LR2/E;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    goto :goto_2e

    :cond_4e
    move-wide/from16 v19, v13

    :cond_4f
    :goto_2e
    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v13, Lcom/google/android/gms/internal/measurement/Y1;

    const-string v14, "_eid"

    invoke-static {v13, v14}, LR2/N5;->e0(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Long;

    if-eqz v13, :cond_50

    const/4 v14, 0x1

    :goto_2f
    const/4 v15, 0x1

    goto :goto_30

    :cond_50
    const/4 v14, 0x0

    goto :goto_2f

    :goto_30
    if-ne v1, v15, :cond_52

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v1, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v14, :cond_47

    iget-object v1, v10, LR2/E;->i:Ljava/lang/Long;

    if-nez v1, :cond_51

    iget-object v1, v10, LR2/E;->j:Ljava/lang/Long;

    if-nez v1, :cond_51

    iget-object v1, v10, LR2/E;->k:Ljava/lang/Boolean;

    if-eqz v1, :cond_47

    :cond_51
    const/4 v1, 0x0

    invoke-virtual {v10, v1, v1, v1}, LR2/E;->c(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)LR2/E;

    move-result-object v6

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2b

    :cond_52
    invoke-virtual {v8, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v15

    if-nez v15, :cond_54

    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    move-object v15, v3

    move-object/from16 p3, v4

    int-to-long v3, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v9, v11, v1}, LR2/N5;->R(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v1, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v14, :cond_53

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v10, v3, v1, v3}, LR2/E;->c(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)LR2/E;

    move-result-object v10

    :cond_53
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y1$a;->I()J

    move-result-wide v3

    invoke-virtual {v10, v3, v4, v6, v7}, LR2/E;->b(JJ)LR2/E;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, p3

    move v3, v12

    const-wide/16 v12, 0x1

    goto/16 :goto_33

    :cond_54
    move-object v15, v3

    move-object/from16 p3, v4

    iget-object v3, v10, LR2/E;->h:Ljava/lang/Long;

    if-eqz v3, :cond_55

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    move/from16 v21, v12

    move-object/from16 v24, v13

    goto :goto_31

    :cond_55
    invoke-virtual/range {p0 .. p0}, LR2/D5;->n0()LR2/S5;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y1$a;->F()J

    move-result-wide v3

    move/from16 v21, v12

    move-object/from16 v24, v13

    move-wide/from16 v12, v19

    invoke-static {v3, v4, v12, v13}, LR2/S5;->y(JJ)J

    move-result-wide v3

    :goto_31
    cmp-long v3, v3, v6

    if-eqz v3, :cond_58

    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    const-string v3, "_efs"

    const-wide/16 v12, 0x1

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v9, v3, v4}, LR2/N5;->R(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    int-to-long v3, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v9, v11, v1}, LR2/N5;->R(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v1, Lcom/google/android/gms/internal/measurement/Y1;

    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v14, :cond_56

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v4, 0x0

    invoke-virtual {v10, v4, v1, v3}, LR2/E;->c(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)LR2/E;

    move-result-object v10

    :cond_56
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y1$a;->I()J

    move-result-wide v3

    invoke-virtual {v10, v3, v4, v6, v7}, LR2/E;->b(JJ)LR2/E;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_57
    :goto_32
    move-object/from16 v1, p3

    move/from16 v3, v21

    goto :goto_33

    :cond_58
    const-wide/16 v12, 0x1

    if-eqz v14, :cond_57

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y1$a;->K()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v4, v24

    const/4 v3, 0x0

    invoke-virtual {v10, v4, v3, v3}, LR2/E;->c(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)LR2/E;

    move-result-object v4

    invoke-interface {v2, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_32

    :goto_33
    invoke-virtual {v1, v3, v9}, Lcom/google/android/gms/internal/measurement/d2$a;->y(ILcom/google/android/gms/internal/measurement/Y1$a;)Lcom/google/android/gms/internal/measurement/d2$a;

    :goto_34
    add-int/lit8 v3, v3, 0x1

    move-object v4, v1

    move v12, v3

    move-object v3, v15

    const-wide/16 v6, 0x0

    move-object/from16 v1, p0

    goto/16 :goto_2a

    :cond_59
    move-object v15, v3

    move-object v1, v4

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d2$a;->w()I

    move-result v4

    if-ge v3, v4, :cond_5a

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d2$a;->t0()Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/measurement/d2$a;->N(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_5a
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_35
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LR2/E;

    invoke-virtual {v4, v3}, LR2/p;->T(LR2/E;)V

    goto :goto_35

    :cond_5b
    move-object v2, v15

    goto :goto_36

    :cond_5c
    move-object v1, v4

    move-object v2, v3

    :goto_36
    iget-object v3, v2, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v4

    invoke-virtual {v4, v3}, LR2/p;->D0(Ljava/lang/String;)LR2/I2;

    move-result-object v4

    if-nez v4, :cond_5d

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v4

    invoke-virtual {v4}, LR2/Y1;->G()LR2/a2;

    move-result-object v4

    const-string v5, "Bundling raw events w/o app info. appId"

    iget-object v6, v2, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_3b

    :cond_5d
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d2$a;->w()I

    move-result v5

    if-lez v5, :cond_62

    invoke-virtual {v4}, LR2/I2;->i0()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    if-eqz v9, :cond_5e

    invoke-virtual {v1, v5, v6}, Lcom/google/android/gms/internal/measurement/d2$a;->n0(J)Lcom/google/android/gms/internal/measurement/d2$a;

    goto :goto_37

    :cond_5e
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d2$a;->H0()Lcom/google/android/gms/internal/measurement/d2$a;

    :goto_37
    invoke-virtual {v4}, LR2/I2;->m0()J

    move-result-wide v7

    const-wide/16 v9, 0x0

    cmp-long v11, v7, v9

    if-nez v11, :cond_5f

    goto :goto_38

    :cond_5f
    move-wide v5, v7

    :goto_38
    cmp-long v7, v5, v9

    if-eqz v7, :cond_60

    invoke-virtual {v1, v5, v6}, Lcom/google/android/gms/internal/measurement/d2$a;->r0(J)Lcom/google/android/gms/internal/measurement/d2$a;

    goto :goto_39

    :cond_60
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d2$a;->J0()Lcom/google/android/gms/internal/measurement/d2$a;

    :goto_39
    invoke-virtual {v4}, LR2/I2;->p()V

    invoke-virtual {v4}, LR2/I2;->k0()J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/measurement/d2$a;->i0(I)Lcom/google/android/gms/internal/measurement/d2$a;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d2$a;->W()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, LR2/I2;->j0(J)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d2$a;->Q()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, LR2/I2;->f0(J)V

    invoke-virtual {v4}, LR2/I2;->s0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_61

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/measurement/d2$a;->K0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    goto :goto_3a

    :cond_61
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d2$a;->x0()Lcom/google/android/gms/internal/measurement/d2$a;

    :goto_3a
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v5

    invoke-virtual {v5, v4}, LR2/p;->U(LR2/I2;)V

    :cond_62
    :goto_3b
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d2$a;->w()I

    move-result v4

    if-lez v4, :cond_66

    invoke-virtual/range {p0 .. p0}, LR2/D5;->h0()LR2/x2;

    move-result-object v4

    iget-object v5, v2, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, LR2/x2;->L(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/L1;

    move-result-object v4

    if-eqz v4, :cond_64

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/L1;->b0()Z

    move-result v5

    if-nez v5, :cond_63

    goto :goto_3c

    :cond_63
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/L1;->L()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/internal/measurement/d2$a;->M(J)Lcom/google/android/gms/internal/measurement/d2$a;

    goto :goto_3d

    :cond_64
    :goto_3c
    iget-object v4, v2, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/d2;->k0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_65

    const-wide/16 v4, -0x1

    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/internal/measurement/d2$a;->M(J)Lcom/google/android/gms/internal/measurement/d2$a;

    goto :goto_3d

    :cond_65
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v4

    invoke-virtual {v4}, LR2/Y1;->L()LR2/a2;

    move-result-object v4

    const-string v5, "Did not find measurement config or missing version info. appId"

    iget-object v6, v2, LR2/D5$a;->a:Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_3d
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v4

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v1, Lcom/google/android/gms/internal/measurement/d2;

    move/from16 v12, v18

    invoke-virtual {v4, v1, v12}, LR2/p;->e0(Lcom/google/android/gms/internal/measurement/d2;Z)Z

    :cond_66
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v1

    iget-object v2, v2, LR2/D5$a;->b:Ljava/util/List;

    invoke-static {v2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, LR2/m3;->n()V

    invoke-virtual {v1}, LR2/C5;->u()V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "rowid in ("

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v12, 0x0

    :goto_3e
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    if-ge v12, v5, :cond_68

    if-eqz v12, :cond_67

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_67
    invoke-interface {v2, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    add-int/lit8 v12, v12, 0x1

    goto :goto_3e

    :cond_68
    const-string v5, ")"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    const-string v6, "raw_events"

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v4, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    if-eq v4, v5, :cond_69

    invoke-virtual {v1}, LR2/m3;->j()LR2/Y1;

    move-result-object v1

    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    move-result-object v1

    const-string v5, "Deleted fewer rows from raw events table than expected"

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v5, v4, v2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_69
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v1

    invoke-virtual {v1}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_1

    :try_start_22
    const-string v4, "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"

    filled-new-array {v3, v3}, [Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_22
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_22 .. :try_end_22} :catch_9
    .catchall {:try_start_22 .. :try_end_22} :catchall_1

    goto :goto_3f

    :catch_9
    move-exception v0

    move-object v2, v0

    :try_start_23
    invoke-virtual {v1}, LR2/m3;->j()LR2/Y1;

    move-result-object v1

    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    move-result-object v1

    const-string v4, "Failed to remove unused event metadata. appId"

    invoke-static {v3}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v4, v3, v2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3f
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v1

    invoke-virtual {v1}, LR2/p;->T0()V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_1

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v1

    invoke-virtual {v1}, LR2/p;->R0()V

    const/4 v1, 0x1

    return v1

    :cond_6a
    :goto_40
    :try_start_24
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v1

    invoke-virtual {v1}, LR2/p;->T0()V
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_1

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v1

    invoke-virtual {v1}, LR2/p;->R0()V

    const/4 v1, 0x0

    return v1

    :goto_41
    if-eqz v4, :cond_6b

    :try_start_25
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    :cond_6b
    throw v1
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_1

    :goto_42
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v2

    invoke-virtual {v2}, LR2/p;->R0()V

    throw v1
.end method

.method public final Q(Ljava/lang/String;)LR2/q3;
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LR2/D5;->p0()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LR2/D5;->B:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, LR2/q3;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, LR2/p;->I0(Ljava/lang/String;)LR2/q3;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    sget-object v0, LR2/q3;->c:LR2/q3;

    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0, p1, v0}, LR2/D5;->B(Ljava/lang/String;LR2/q3;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-object v0
.end method

.method public final R(LR2/W5;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LR2/H5;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, LR2/H5;-><init>(LR2/D5;LR2/W5;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, LR2/G2;->w(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 15
    .line 16
    const-wide/16 v2, 0x7530

    .line 17
    .line 18
    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    return-object v0

    .line 25
    :catch_0
    move-exception v0

    .line 26
    goto :goto_0

    .line 27
    :catch_1
    move-exception v0

    .line 28
    goto :goto_0

    .line 29
    :catch_2
    move-exception v0

    .line 30
    :goto_0
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object p1, p1, LR2/W5;->o:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string v2, "Failed to get app instance id. appId"

    .line 45
    .line 46
    invoke-virtual {v1, v2, p1, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    return-object p1
.end method

.method public final S(LR2/e;)V
    .locals 1

    .line 1
    iget-object v0, p1, LR2/e;->o:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, LR2/D5;->W(Ljava/lang/String;)LR2/W5;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1, v0}, LR2/D5;->T(LR2/e;LR2/W5;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final T(LR2/e;LR2/W5;)V
    .locals 10

    .line 1
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, LR2/e;->o:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iget-object v0, p1, LR2/e;->p:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, LR2/e;->q:LR2/R5;

    .line 15
    .line 16
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iget-object v0, p1, LR2/e;->q:LR2/R5;

    .line 20
    .line 21
    iget-object v0, v0, LR2/R5;->p:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, LR2/D5;->p0()V

    .line 34
    .line 35
    .line 36
    invoke-static {p2}, LR2/D5;->d0(LR2/W5;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    iget-boolean v0, p2, LR2/W5;->v:Z

    .line 44
    .line 45
    if-nez v0, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0, p2}, LR2/D5;->g(LR2/W5;)LR2/I2;

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    new-instance v0, LR2/e;

    .line 52
    .line 53
    invoke-direct {v0, p1}, LR2/e;-><init>(LR2/e;)V

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    iput-boolean p1, v0, LR2/e;->s:Z

    .line 58
    .line 59
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, LR2/p;->Q0()V

    .line 64
    .line 65
    .line 66
    :try_start_0
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object v2, v0, LR2/e;->o:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, Ljava/lang/String;

    .line 77
    .line 78
    iget-object v3, v0, LR2/e;->q:LR2/R5;

    .line 79
    .line 80
    iget-object v3, v3, LR2/R5;->p:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v1, v2, v3}, LR2/p;->A0(Ljava/lang/String;Ljava/lang/String;)LR2/e;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    if-eqz v1, :cond_2

    .line 87
    .line 88
    iget-object v2, v1, LR2/e;->p:Ljava/lang/String;

    .line 89
    .line 90
    iget-object v3, v0, LR2/e;->p:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_2

    .line 97
    .line 98
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v2}, LR2/Y1;->L()LR2/a2;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    const-string v3, "Updating a conditional user property with different origin. name, origin, origin (from DB)"

    .line 107
    .line 108
    iget-object v4, p0, LR2/D5;->l:LR2/N2;

    .line 109
    .line 110
    invoke-virtual {v4}, LR2/N2;->D()LR2/X1;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    iget-object v5, v0, LR2/e;->q:LR2/R5;

    .line 115
    .line 116
    iget-object v5, v5, LR2/R5;->p:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v4, v5}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    iget-object v5, v0, LR2/e;->p:Ljava/lang/String;

    .line 123
    .line 124
    iget-object v6, v1, LR2/e;->p:Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {v2, v3, v4, v5, v6}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :catchall_0
    move-exception p1

    .line 131
    goto/16 :goto_6

    .line 132
    .line 133
    :cond_2
    :goto_0
    if-eqz v1, :cond_3

    .line 134
    .line 135
    iget-boolean v2, v1, LR2/e;->s:Z

    .line 136
    .line 137
    if-eqz v2, :cond_3

    .line 138
    .line 139
    iget-object v3, v1, LR2/e;->p:Ljava/lang/String;

    .line 140
    .line 141
    iput-object v3, v0, LR2/e;->p:Ljava/lang/String;

    .line 142
    .line 143
    iget-wide v3, v1, LR2/e;->r:J

    .line 144
    .line 145
    iput-wide v3, v0, LR2/e;->r:J

    .line 146
    .line 147
    iget-wide v3, v1, LR2/e;->v:J

    .line 148
    .line 149
    iput-wide v3, v0, LR2/e;->v:J

    .line 150
    .line 151
    iget-object v3, v1, LR2/e;->t:Ljava/lang/String;

    .line 152
    .line 153
    iput-object v3, v0, LR2/e;->t:Ljava/lang/String;

    .line 154
    .line 155
    iget-object v3, v1, LR2/e;->w:LR2/I;

    .line 156
    .line 157
    iput-object v3, v0, LR2/e;->w:LR2/I;

    .line 158
    .line 159
    iput-boolean v2, v0, LR2/e;->s:Z

    .line 160
    .line 161
    new-instance v2, LR2/R5;

    .line 162
    .line 163
    iget-object v3, v0, LR2/e;->q:LR2/R5;

    .line 164
    .line 165
    iget-object v5, v3, LR2/R5;->p:Ljava/lang/String;

    .line 166
    .line 167
    iget-object v4, v1, LR2/e;->q:LR2/R5;

    .line 168
    .line 169
    iget-wide v6, v4, LR2/R5;->q:J

    .line 170
    .line 171
    invoke-virtual {v3}, LR2/R5;->a()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    iget-object v1, v1, LR2/e;->q:LR2/R5;

    .line 176
    .line 177
    iget-object v9, v1, LR2/R5;->u:Ljava/lang/String;

    .line 178
    .line 179
    move-object v4, v2

    .line 180
    invoke-direct/range {v4 .. v9}, LR2/R5;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    iput-object v2, v0, LR2/e;->q:LR2/R5;

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_3
    iget-object v1, v0, LR2/e;->t:Ljava/lang/String;

    .line 187
    .line 188
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_4

    .line 193
    .line 194
    new-instance p1, LR2/R5;

    .line 195
    .line 196
    iget-object v1, v0, LR2/e;->q:LR2/R5;

    .line 197
    .line 198
    iget-object v3, v1, LR2/R5;->p:Ljava/lang/String;

    .line 199
    .line 200
    iget-wide v4, v0, LR2/e;->r:J

    .line 201
    .line 202
    invoke-virtual {v1}, LR2/R5;->a()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    iget-object v1, v0, LR2/e;->q:LR2/R5;

    .line 207
    .line 208
    iget-object v7, v1, LR2/R5;->u:Ljava/lang/String;

    .line 209
    .line 210
    move-object v2, p1

    .line 211
    invoke-direct/range {v2 .. v7}, LR2/R5;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    iput-object p1, v0, LR2/e;->q:LR2/R5;

    .line 215
    .line 216
    const/4 p1, 0x1

    .line 217
    iput-boolean p1, v0, LR2/e;->s:Z

    .line 218
    .line 219
    :cond_4
    :goto_1
    iget-boolean v1, v0, LR2/e;->s:Z

    .line 220
    .line 221
    if-eqz v1, :cond_6

    .line 222
    .line 223
    iget-object v1, v0, LR2/e;->q:LR2/R5;

    .line 224
    .line 225
    new-instance v9, LR2/T5;

    .line 226
    .line 227
    iget-object v2, v0, LR2/e;->o:Ljava/lang/String;

    .line 228
    .line 229
    invoke-static {v2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    move-object v3, v2

    .line 234
    check-cast v3, Ljava/lang/String;

    .line 235
    .line 236
    iget-object v4, v0, LR2/e;->p:Ljava/lang/String;

    .line 237
    .line 238
    iget-object v5, v1, LR2/R5;->p:Ljava/lang/String;

    .line 239
    .line 240
    iget-wide v6, v1, LR2/R5;->q:J

    .line 241
    .line 242
    invoke-virtual {v1}, LR2/R5;->a()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-static {v1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v8

    .line 250
    move-object v2, v9

    .line 251
    invoke-direct/range {v2 .. v8}, LR2/T5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-virtual {v1, v9}, LR2/p;->d0(LR2/T5;)Z

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    if-eqz v1, :cond_5

    .line 263
    .line 264
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-virtual {v1}, LR2/Y1;->F()LR2/a2;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    const-string v2, "User property updated immediately"

    .line 273
    .line 274
    iget-object v3, v0, LR2/e;->o:Ljava/lang/String;

    .line 275
    .line 276
    iget-object v4, p0, LR2/D5;->l:LR2/N2;

    .line 277
    .line 278
    invoke-virtual {v4}, LR2/N2;->D()LR2/X1;

    .line 279
    .line 280
    .line 281
    move-result-object v4

    .line 282
    iget-object v5, v9, LR2/T5;->c:Ljava/lang/String;

    .line 283
    .line 284
    invoke-virtual {v4, v5}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    iget-object v5, v9, LR2/T5;->e:Ljava/lang/Object;

    .line 289
    .line 290
    :goto_2
    invoke-virtual {v1, v2, v3, v4, v5}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    goto :goto_3

    .line 294
    :cond_5
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    const-string v2, "(2)Too many active user properties, ignoring"

    .line 303
    .line 304
    iget-object v3, v0, LR2/e;->o:Ljava/lang/String;

    .line 305
    .line 306
    invoke-static {v3}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    iget-object v4, p0, LR2/D5;->l:LR2/N2;

    .line 311
    .line 312
    invoke-virtual {v4}, LR2/N2;->D()LR2/X1;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    iget-object v5, v9, LR2/T5;->c:Ljava/lang/String;

    .line 317
    .line 318
    invoke-virtual {v4, v5}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    iget-object v5, v9, LR2/T5;->e:Ljava/lang/Object;

    .line 323
    .line 324
    goto :goto_2

    .line 325
    :goto_3
    if-eqz p1, :cond_6

    .line 326
    .line 327
    iget-object p1, v0, LR2/e;->w:LR2/I;

    .line 328
    .line 329
    if-eqz p1, :cond_6

    .line 330
    .line 331
    new-instance p1, LR2/I;

    .line 332
    .line 333
    iget-object v1, v0, LR2/e;->w:LR2/I;

    .line 334
    .line 335
    iget-wide v2, v0, LR2/e;->r:J

    .line 336
    .line 337
    invoke-direct {p1, v1, v2, v3}, LR2/I;-><init>(LR2/I;J)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {p0, p1, p2}, LR2/D5;->Y(LR2/I;LR2/W5;)V

    .line 341
    .line 342
    .line 343
    :cond_6
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 344
    .line 345
    .line 346
    move-result-object p1

    .line 347
    invoke-virtual {p1, v0}, LR2/p;->b0(LR2/e;)Z

    .line 348
    .line 349
    .line 350
    move-result p1

    .line 351
    if-eqz p1, :cond_7

    .line 352
    .line 353
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    invoke-virtual {p1}, LR2/Y1;->F()LR2/a2;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    const-string p2, "Conditional property added"

    .line 362
    .line 363
    iget-object v1, v0, LR2/e;->o:Ljava/lang/String;

    .line 364
    .line 365
    iget-object v2, p0, LR2/D5;->l:LR2/N2;

    .line 366
    .line 367
    invoke-virtual {v2}, LR2/N2;->D()LR2/X1;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    iget-object v3, v0, LR2/e;->q:LR2/R5;

    .line 372
    .line 373
    iget-object v3, v3, LR2/R5;->p:Ljava/lang/String;

    .line 374
    .line 375
    invoke-virtual {v2, v3}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    iget-object v0, v0, LR2/e;->q:LR2/R5;

    .line 380
    .line 381
    invoke-virtual {v0}, LR2/R5;->a()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    :goto_4
    invoke-virtual {p1, p2, v1, v2, v0}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    goto :goto_5

    .line 389
    :cond_7
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    const-string p2, "Too many conditional properties, ignoring"

    .line 398
    .line 399
    iget-object v1, v0, LR2/e;->o:Ljava/lang/String;

    .line 400
    .line 401
    invoke-static {v1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    iget-object v2, p0, LR2/D5;->l:LR2/N2;

    .line 406
    .line 407
    invoke-virtual {v2}, LR2/N2;->D()LR2/X1;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    iget-object v3, v0, LR2/e;->q:LR2/R5;

    .line 412
    .line 413
    iget-object v3, v3, LR2/R5;->p:Ljava/lang/String;

    .line 414
    .line 415
    invoke-virtual {v2, v3}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    iget-object v0, v0, LR2/e;->q:LR2/R5;

    .line 420
    .line 421
    invoke-virtual {v0}, LR2/R5;->a()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    goto :goto_4

    .line 426
    :goto_5
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 427
    .line 428
    .line 429
    move-result-object p1

    .line 430
    invoke-virtual {p1}, LR2/p;->T0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 431
    .line 432
    .line 433
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 434
    .line 435
    .line 436
    move-result-object p1

    .line 437
    invoke-virtual {p1}, LR2/p;->R0()V

    .line 438
    .line 439
    .line 440
    return-void

    .line 441
    :goto_6
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 442
    .line 443
    .line 444
    move-result-object p2

    .line 445
    invoke-virtual {p2}, LR2/p;->R0()V

    .line 446
    .line 447
    .line 448
    throw p1
.end method

.method public final U(LR2/I;LR2/W5;)V
    .locals 11

    .line 1
    iget-object v0, p2, LR2/W5;->o:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LR2/c2;->b(LR2/I;)LR2/c2;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0}, LR2/D5;->n0()LR2/S5;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p1, LR2/c2;->d:Landroid/os/Bundle;

    .line 15
    .line 16
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v3, p2, LR2/W5;->o:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v2, v3}, LR2/p;->B0(Ljava/lang/String;)Landroid/os/Bundle;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0, v1, v2}, LR2/S5;->Q(Landroid/os/Bundle;Landroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, LR2/D5;->n0()LR2/S5;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p0}, LR2/D5;->c0()LR2/g;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v2, p2, LR2/W5;->o:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, LR2/g;->y(Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {v0, p1, v1}, LR2/S5;->K(LR2/c2;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, LR2/c2;->a()LR2/I;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object v0, p1, LR2/I;->o:Ljava/lang/String;

    .line 51
    .line 52
    const-string v1, "_cmp"

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const-string v2, "_cis"

    .line 59
    .line 60
    const-string v3, "referrer API v2"

    .line 61
    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    iget-object v0, p1, LR2/I;->p:LR2/D;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, LR2/D;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_0

    .line 75
    .line 76
    iget-object v0, p1, LR2/I;->p:LR2/D;

    .line 77
    .line 78
    const-string v4, "gclid"

    .line 79
    .line 80
    invoke-virtual {v0, v4}, LR2/D;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_0

    .line 89
    .line 90
    new-instance v0, LR2/R5;

    .line 91
    .line 92
    iget-wide v7, p1, LR2/I;->r:J

    .line 93
    .line 94
    const-string v10, "auto"

    .line 95
    .line 96
    const-string v6, "_lgclid"

    .line 97
    .line 98
    move-object v5, v0

    .line 99
    invoke-direct/range {v5 .. v10}, LR2/R5;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v0, p2}, LR2/D5;->u(LR2/R5;LR2/W5;)V

    .line 103
    .line 104
    .line 105
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/H6;->a()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_1

    .line 110
    .line 111
    invoke-static {}, Lcom/google/android/gms/internal/measurement/H6;->c()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_1

    .line 116
    .line 117
    iget-object v0, p1, LR2/I;->o:Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_1

    .line 124
    .line 125
    iget-object v0, p1, LR2/I;->p:LR2/D;

    .line 126
    .line 127
    invoke-virtual {v0, v2}, LR2/D;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_1

    .line 136
    .line 137
    iget-object v0, p1, LR2/I;->p:LR2/D;

    .line 138
    .line 139
    const-string v1, "gbraid"

    .line 140
    .line 141
    invoke-virtual {v0, v1}, LR2/D;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-nez v0, :cond_1

    .line 150
    .line 151
    new-instance v0, LR2/R5;

    .line 152
    .line 153
    iget-wide v4, p1, LR2/I;->r:J

    .line 154
    .line 155
    const-string v7, "auto"

    .line 156
    .line 157
    const-string v3, "_gbraid"

    .line 158
    .line 159
    move-object v2, v0

    .line 160
    invoke-direct/range {v2 .. v7}, LR2/R5;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0, v0, p2}, LR2/D5;->u(LR2/R5;LR2/W5;)V

    .line 164
    .line 165
    .line 166
    :cond_1
    invoke-virtual {p0, p1, p2}, LR2/D5;->q(LR2/I;LR2/W5;)V

    .line 167
    .line 168
    .line 169
    return-void
.end method

.method public final V(LR2/I2;)V
    .locals 11

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, LR2/I2;->j()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, LR2/I2;->r0()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1}, LR2/I2;->t0()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    move-object v1, p1

    .line 37
    check-cast v1, Ljava/lang/String;

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x0

    .line 41
    const/16 v2, 0xcc

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    move-object v0, p0

    .line 45
    invoke-virtual/range {v0 .. v5}, LR2/D5;->z(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    new-instance v0, Landroid/net/Uri$Builder;

    .line 50
    .line 51
    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, LR2/I2;->j()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    invoke-virtual {p1}, LR2/I2;->r0()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    :cond_1
    sget-object v2, LR2/K;->g:LR2/P1;

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    invoke-virtual {v2, v3}, LR2/P1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    sget-object v4, LR2/K;->h:LR2/P1;

    .line 82
    .line 83
    invoke-virtual {v4, v3}, LR2/P1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    check-cast v4, Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroid/net/Uri$Builder;->encodedAuthority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    new-instance v4, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const-string v5, "config/app/"

    .line 96
    .line 97
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v2, v1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    const-string v2, "platform"

    .line 112
    .line 113
    const-string v4, "android"

    .line 114
    .line 115
    invoke-virtual {v1, v2, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    const-string v2, "gmp_version"

    .line 120
    .line 121
    const-string v4, "82001"

    .line 122
    .line 123
    invoke-virtual {v1, v2, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    const-string v2, "runtime_version"

    .line 128
    .line 129
    const-string v4, "0"

    .line 130
    .line 131
    invoke-virtual {v1, v2, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    :try_start_0
    invoke-virtual {p1}, LR2/I2;->t0()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-static {v1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    move-object v6, v1

    .line 151
    check-cast v6, Ljava/lang/String;

    .line 152
    .line 153
    new-instance v7, Ljava/net/URL;

    .line 154
    .line 155
    invoke-direct {v7, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v1}, LR2/Y1;->K()LR2/a2;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    const-string v2, "Fetching remote configuration"

    .line 167
    .line 168
    invoke-virtual {v1, v2, v6}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, LR2/D5;->h0()LR2/x2;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-virtual {v1, v6}, LR2/x2;->L(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/L1;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {p0}, LR2/D5;->h0()LR2/x2;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-virtual {v2, v6}, LR2/x2;->P(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    if-eqz v1, :cond_4

    .line 188
    .line 189
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-nez v1, :cond_2

    .line 194
    .line 195
    new-instance v3, Lt/a;

    .line 196
    .line 197
    invoke-direct {v3}, Lt/a;-><init>()V

    .line 198
    .line 199
    .line 200
    const-string v1, "If-Modified-Since"

    .line 201
    .line 202
    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    :cond_2
    invoke-virtual {p0}, LR2/D5;->h0()LR2/x2;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {v1, v6}, LR2/x2;->N(Ljava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    if-nez v2, :cond_4

    .line 218
    .line 219
    if-nez v3, :cond_3

    .line 220
    .line 221
    new-instance v2, Lt/a;

    .line 222
    .line 223
    invoke-direct {v2}, Lt/a;-><init>()V

    .line 224
    .line 225
    .line 226
    move-object v3, v2

    .line 227
    :cond_3
    const-string v2, "If-None-Match"

    .line 228
    .line 229
    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    :cond_4
    move-object v9, v3

    .line 233
    const/4 v1, 0x1

    .line 234
    iput-boolean v1, p0, LR2/D5;->t:Z

    .line 235
    .line 236
    invoke-virtual {p0}, LR2/D5;->g0()LR2/f2;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    new-instance v10, LR2/I5;

    .line 241
    .line 242
    invoke-direct {v10, p0}, LR2/I5;-><init>(LR2/D5;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5}, LR2/m3;->n()V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v5}, LR2/C5;->u()V

    .line 249
    .line 250
    .line 251
    invoke-static {v7}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    invoke-static {v10}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v5}, LR2/m3;->e()LR2/G2;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    new-instance v2, LR2/k2;

    .line 262
    .line 263
    const/4 v8, 0x0

    .line 264
    move-object v4, v2

    .line 265
    invoke-direct/range {v4 .. v10}, LR2/k2;-><init>(LR2/f2;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;LR2/e2;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v1, v2}, LR2/G2;->z(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    :catch_0
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-virtual {p1}, LR2/I2;->t0()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    const-string v2, "Failed to parse config URL. Not fetching. appId"

    .line 289
    .line 290
    invoke-virtual {v1, v2, p1, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    return-void
.end method

.method public final W(Ljava/lang/String;)LR2/W5;
    .locals 40

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, v1}, LR2/p;->D0(Ljava/lang/String;)LR2/I2;

    .line 8
    .line 9
    .line 10
    move-result-object v11

    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz v11, :cond_3

    .line 13
    .line 14
    invoke-virtual {v11}, LR2/I2;->h()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_0
    move-object/from16 v13, p0

    .line 27
    .line 28
    invoke-virtual {v13, v11}, LR2/D5;->m(LR2/I2;)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_1

    .line 39
    .line 40
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const-string v3, "App version does not match; dropping. appId"

    .line 49
    .line 50
    invoke-static/range {p1 .. p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :goto_0
    invoke-virtual {v2, v3, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_1
    invoke-virtual/range {p0 .. p1}, LR2/D5;->Q(Ljava/lang/String;)LR2/q3;

    .line 59
    .line 60
    .line 61
    move-result-object v17

    .line 62
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sget-object v2, LR2/K;->T0:LR2/P1;

    .line 73
    .line 74
    invoke-virtual {v0, v2}, LR2/g;->s(LR2/P1;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    invoke-virtual/range {p0 .. p1}, LR2/D5;->a0(Ljava/lang/String;)LR2/z;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, LR2/z;->i()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual/range {v17 .. v17}, LR2/q3;->b()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    :goto_1
    move-object/from16 v35, v0

    .line 93
    .line 94
    move/from16 v34, v2

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_2
    const-string v0, ""

    .line 98
    .line 99
    const/16 v2, 0x64

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :goto_2
    new-instance v39, LR2/W5;

    .line 103
    .line 104
    move-object/from16 v0, v39

    .line 105
    .line 106
    invoke-virtual {v11}, LR2/I2;->j()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {v11}, LR2/I2;->h()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v11}, LR2/I2;->z()J

    .line 115
    .line 116
    .line 117
    move-result-wide v4

    .line 118
    invoke-virtual {v11}, LR2/I2;->v0()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-virtual {v11}, LR2/I2;->g0()J

    .line 123
    .line 124
    .line 125
    move-result-wide v7

    .line 126
    invoke-virtual {v11}, LR2/I2;->a0()J

    .line 127
    .line 128
    .line 129
    move-result-wide v9

    .line 130
    invoke-virtual {v11}, LR2/I2;->r()Z

    .line 131
    .line 132
    .line 133
    move-result v12

    .line 134
    invoke-virtual {v11}, LR2/I2;->i()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v14

    .line 138
    invoke-virtual {v11}, LR2/I2;->v()J

    .line 139
    .line 140
    .line 141
    move-result-wide v15

    .line 142
    invoke-virtual {v11}, LR2/I2;->q()Z

    .line 143
    .line 144
    .line 145
    move-result v20

    .line 146
    invoke-virtual {v11}, LR2/I2;->r0()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v22

    .line 150
    invoke-virtual {v11}, LR2/I2;->q0()Ljava/lang/Boolean;

    .line 151
    .line 152
    .line 153
    move-result-object v23

    .line 154
    invoke-virtual {v11}, LR2/I2;->c0()J

    .line 155
    .line 156
    .line 157
    move-result-wide v24

    .line 158
    invoke-virtual {v11}, LR2/I2;->n()Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v26

    .line 162
    invoke-virtual/range {v17 .. v17}, LR2/q3;->v()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v28

    .line 166
    invoke-virtual {v11}, LR2/I2;->t()Z

    .line 167
    .line 168
    .line 169
    move-result v31

    .line 170
    invoke-virtual {v11}, LR2/I2;->p0()J

    .line 171
    .line 172
    .line 173
    move-result-wide v32

    .line 174
    invoke-virtual {v11}, LR2/I2;->a()I

    .line 175
    .line 176
    .line 177
    move-result v36

    .line 178
    invoke-virtual {v11}, LR2/I2;->D()J

    .line 179
    .line 180
    .line 181
    move-result-wide v37

    .line 182
    const/4 v11, 0x0

    .line 183
    const/16 v17, 0x0

    .line 184
    .line 185
    move/from16 v13, v17

    .line 186
    .line 187
    const-wide/16 v17, 0x0

    .line 188
    .line 189
    const/16 v19, 0x0

    .line 190
    .line 191
    const/16 v21, 0x0

    .line 192
    .line 193
    const/16 v27, 0x0

    .line 194
    .line 195
    const-string v29, ""

    .line 196
    .line 197
    const/16 v30, 0x0

    .line 198
    .line 199
    move-object/from16 v1, p1

    .line 200
    .line 201
    invoke-direct/range {v0 .. v38}, LR2/W5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJ)V

    .line 202
    .line 203
    .line 204
    return-object v39

    .line 205
    :cond_3
    :goto_3
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-virtual {v2}, LR2/Y1;->F()LR2/a2;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    const-string v3, "No app data available; dropping"

    .line 214
    .line 215
    goto/16 :goto_0
.end method

.method public final X()LR2/b6;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/D5;->f:LR2/b6;

    .line 2
    .line 3
    invoke-static {v0}, LR2/D5;->i(LR2/C5;)LR2/C5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LR2/b6;

    .line 8
    .line 9
    return-object v0
.end method

.method public final Y(LR2/I;LR2/W5;)V
    .locals 28

    .line 1
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    const-string v4, "_fx"

    const-string v5, "_sno"

    invoke-static/range {p2 .. p2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v6, v3, LR2/W5;->o:Ljava/lang/String;

    invoke-static {v6}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e()LR2/G2;

    move-result-object v8

    invoke-virtual {v8}, LR2/m3;->n()V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->p0()V

    iget-object v8, v3, LR2/W5;->o:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    invoke-static/range {p1 .. p2}, LR2/N5;->c0(LR2/I;LR2/W5;)Z

    move-result v9

    if-nez v9, :cond_0

    return-void

    :cond_0
    iget-boolean v9, v3, LR2/W5;->v:Z

    if-nez v9, :cond_1

    invoke-virtual {v1, v3}, LR2/D5;->g(LR2/W5;)LR2/I2;

    return-void

    :cond_1
    invoke-virtual/range {p0 .. p0}, LR2/D5;->h0()LR2/x2;

    move-result-object v9

    iget-object v10, v2, LR2/I;->o:Ljava/lang/String;

    invoke-virtual {v9, v8, v10}, LR2/x2;->O(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v9

    const-string v15, "_err"

    const/4 v14, 0x0

    if-eqz v9, :cond_6

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v3

    invoke-virtual {v3}, LR2/Y1;->L()LR2/a2;

    move-result-object v3

    invoke-static {v8}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, v1, LR2/D5;->l:LR2/N2;

    invoke-virtual {v5}, LR2/N2;->D()LR2/X1;

    move-result-object v5

    iget-object v6, v2, LR2/I;->o:Ljava/lang/String;

    invoke-virtual {v5, v6}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Dropping blocked event. appId"

    invoke-virtual {v3, v6, v4, v5}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->h0()LR2/x2;

    move-result-object v3

    invoke-virtual {v3, v8}, LR2/x2;->X(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual/range {p0 .. p0}, LR2/D5;->h0()LR2/x2;

    move-result-object v3

    invoke-virtual {v3, v8}, LR2/x2;->Z(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v3, 0x1

    :goto_1
    if-nez v3, :cond_4

    iget-object v4, v2, LR2/I;->o:Ljava/lang/String;

    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual/range {p0 .. p0}, LR2/D5;->n0()LR2/S5;

    iget-object v9, v1, LR2/D5;->G:LR2/U5;

    iget-object v13, v2, LR2/I;->o:Ljava/lang/String;

    const/4 v2, 0x0

    const/16 v11, 0xb

    const-string v12, "_ev"

    move-object v10, v8

    move-object v4, v14

    move v14, v2

    invoke-static/range {v9 .. v14}, LR2/S5;->N(LR2/U5;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    goto :goto_2

    :cond_4
    move-object v4, v14

    :goto_2
    if-eqz v3, :cond_5

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v2

    invoke-virtual {v2, v8}, LR2/p;->D0(Ljava/lang/String;)LR2/I2;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, LR2/I2;->e0()J

    move-result-wide v5

    invoke-virtual {v2}, LR2/I2;->H()J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    invoke-virtual/range {p0 .. p0}, LR2/D5;->b()LE2/e;

    move-result-object v3

    invoke-interface {v3}, LE2/e;->a()J

    move-result-wide v7

    sub-long/2addr v7, v5

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    sget-object v3, LR2/K;->B:LR2/P1;

    invoke-virtual {v3, v4}, LR2/P1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long v3, v5, v3

    if-lez v3, :cond_5

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v3

    invoke-virtual {v3}, LR2/Y1;->F()LR2/a2;

    move-result-object v3

    const-string v4, "Fetching config for blocked app"

    invoke-virtual {v3, v4}, LR2/a2;->a(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LR2/D5;->V(LR2/I2;)V

    :cond_5
    return-void

    :cond_6
    invoke-static/range {p1 .. p1}, LR2/c2;->b(LR2/I;)LR2/c2;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, LR2/D5;->n0()LR2/S5;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v10

    invoke-virtual {v10, v8}, LR2/g;->y(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v9, v2, v10}, LR2/S5;->K(LR2/c2;I)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/S6;->a()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v9

    sget-object v10, LR2/K;->J0:LR2/P1;

    invoke-virtual {v9, v10}, LR2/g;->s(LR2/P1;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v9

    sget-object v10, LR2/K;->S:LR2/P1;

    const/16 v11, 0xa

    const/16 v12, 0x23

    invoke-virtual {v9, v8, v10, v11, v12}, LR2/g;->q(Ljava/lang/String;LR2/P1;II)I

    move-result v9

    goto :goto_3

    :cond_7
    const/4 v9, 0x0

    :goto_3
    new-instance v10, Ljava/util/TreeSet;

    iget-object v11, v2, LR2/c2;->d:Landroid/os/Bundle;

    invoke-virtual {v11}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    const-string v12, "items"

    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    invoke-virtual/range {p0 .. p0}, LR2/D5;->n0()LR2/S5;

    move-result-object v12

    iget-object v13, v2, LR2/c2;->d:Landroid/os/Bundle;

    invoke-virtual {v13, v11}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v11

    invoke-static {}, Lcom/google/android/gms/internal/measurement/S6;->a()Z

    move-result v13

    if-eqz v13, :cond_8

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v13

    sget-object v14, LR2/K;->J0:LR2/P1;

    invoke-virtual {v13, v14}, LR2/g;->s(LR2/P1;)Z

    move-result v13

    if-eqz v13, :cond_8

    const/4 v13, 0x1

    goto :goto_5

    :cond_8
    const/4 v13, 0x0

    :goto_5
    invoke-virtual {v12, v11, v9, v13}, LR2/S5;->a0([Landroid/os/Parcelable;IZ)V

    :cond_9
    const/4 v14, 0x0

    goto :goto_4

    :cond_a
    invoke-virtual {v2}, LR2/c2;->a()LR2/I;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v9

    const/4 v10, 0x2

    invoke-virtual {v9, v10}, LR2/Y1;->C(I)Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v9

    invoke-virtual {v9}, LR2/Y1;->K()LR2/a2;

    move-result-object v9

    iget-object v11, v1, LR2/D5;->l:LR2/N2;

    invoke-virtual {v11}, LR2/N2;->D()LR2/X1;

    move-result-object v11

    invoke-virtual {v11, v2}, LR2/X1;->a(LR2/I;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "Logging event"

    invoke-virtual {v9, v12, v11}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_b
    invoke-static {}, Lcom/google/android/gms/internal/measurement/M6;->a()Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v9

    sget-object v11, LR2/K;->G0:LR2/P1;

    invoke-virtual {v9, v11}, LR2/g;->s(LR2/P1;)Z

    :cond_c
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v9

    invoke-virtual {v9}, LR2/p;->Q0()V

    :try_start_0
    invoke-virtual {v1, v3}, LR2/D5;->g(LR2/W5;)LR2/I2;

    const-string v9, "ecommerce_purchase"

    iget-object v11, v2, LR2/I;->o:Ljava/lang/String;

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v11, "refund"

    if-nez v9, :cond_e

    :try_start_1
    const-string v9, "purchase"

    iget-object v12, v2, LR2/I;->o:Ljava/lang/String;

    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_e

    iget-object v9, v2, LR2/I;->o:Ljava/lang/String;

    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    goto :goto_6

    :cond_d
    const/4 v9, 0x0

    goto :goto_7

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto/16 :goto_1e

    :cond_e
    :goto_6
    const/4 v9, 0x1

    :goto_7
    const-string v12, "_iap"

    iget-object v13, v2, LR2/I;->o:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_10

    if-eqz v9, :cond_f

    goto :goto_8

    :cond_f
    move-wide/from16 v24, v6

    move-object/from16 v26, v15

    const/4 v7, 0x0

    goto/16 :goto_e

    :cond_10
    :goto_8
    iget-object v12, v2, LR2/I;->p:LR2/D;

    const-string v13, "currency"

    invoke-virtual {v12, v13}, LR2/D;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v13, "value"

    if-eqz v9, :cond_13

    :try_start_2
    iget-object v9, v2, LR2/I;->p:LR2/D;

    invoke-virtual {v9, v13}, LR2/D;->f(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v19

    const-wide v21, 0x412e848000000000L    # 1000000.0

    mul-double v19, v19, v21

    const-wide/16 v23, 0x0

    cmpl-double v9, v19, v23

    if-nez v9, :cond_11

    iget-object v9, v2, LR2/I;->p:LR2/D;

    invoke-virtual {v9, v13}, LR2/D;->i(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    long-to-double v13, v13

    mul-double v19, v13, v21

    :cond_11
    const-wide/high16 v13, 0x43e0000000000000L    # 9.223372036854776E18

    cmpg-double v9, v19, v13

    if-gtz v9, :cond_12

    const-wide/high16 v13, -0x3c20000000000000L    # -9.223372036854776E18

    cmpl-double v9, v19, v13

    if-ltz v9, :cond_12

    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->round(D)J

    move-result-wide v13

    iget-object v9, v2, LR2/I;->o:Ljava/lang/String;

    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_14

    neg-long v13, v13

    goto :goto_9

    :cond_12
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v2

    invoke-virtual {v2}, LR2/Y1;->L()LR2/a2;

    move-result-object v2

    const-string v3, "Data lost. Currency value is too big. appId"

    invoke-static {v8}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-static/range {v19 .. v20}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v2

    invoke-virtual {v2}, LR2/p;->T0()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v2

    invoke-virtual {v2}, LR2/p;->R0()V

    return-void

    :cond_13
    :try_start_3
    iget-object v9, v2, LR2/I;->p:LR2/D;

    invoke-virtual {v9, v13}, LR2/D;->i(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    :cond_14
    :goto_9
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_f

    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v12, v9}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v11, "[A-Z]{3}"

    invoke-virtual {v9, v11}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_f

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "_ltv_"

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v9

    invoke-virtual {v9, v8, v12}, LR2/p;->F0(Ljava/lang/String;Ljava/lang/String;)LR2/T5;

    move-result-object v9

    if-eqz v9, :cond_15

    iget-object v9, v9, LR2/T5;->e:Ljava/lang/Object;

    instance-of v11, v9, Ljava/lang/Long;

    if-nez v11, :cond_16

    :cond_15
    move-wide/from16 v24, v6

    move-object/from16 v26, v15

    const/4 v6, 0x1

    const/4 v7, 0x0

    goto :goto_b

    :cond_16
    check-cast v9, Ljava/lang/Long;

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    new-instance v19, LR2/T5;

    iget-object v11, v2, LR2/I;->q:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, LR2/D5;->b()LE2/e;

    move-result-object v20

    invoke-interface/range {v20 .. v20}, LE2/e;->a()J

    move-result-wide v20

    add-long/2addr v9, v13

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v22

    move-object/from16 v9, v19

    move-object v10, v8

    const/4 v13, 0x0

    move-wide/from16 v24, v6

    move v7, v13

    const/4 v6, 0x1

    move-wide/from16 v13, v20

    move-object/from16 v26, v15

    move-object/from16 v15, v22

    invoke-direct/range {v9 .. v15}, LR2/T5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    :goto_a
    move-object/from16 v6, v19

    goto :goto_d

    :goto_b
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v11

    sget-object v15, LR2/K;->G:LR2/P1;

    invoke-virtual {v11, v8, v15}, LR2/g;->u(Ljava/lang/String;LR2/P1;)I

    move-result v11

    sub-int/2addr v11, v6

    invoke-static {v8}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v9}, LR2/m3;->n()V

    invoke-virtual {v9}, LR2/C5;->u()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v9}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v15

    const-string v10, "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like \'_ltv_%\' order by set_timestamp desc limit ?,10);"

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/String;

    aput-object v8, v6, v7

    const/16 v17, 0x1

    aput-object v8, v6, v17

    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v11

    const/16 v16, 0x2

    aput-object v11, v6, v16

    invoke-virtual {v15, v10, v6}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_c

    :catch_0
    move-exception v0

    move-object v6, v0

    :try_start_5
    invoke-virtual {v9}, LR2/m3;->j()LR2/Y1;

    move-result-object v9

    invoke-virtual {v9}, LR2/Y1;->G()LR2/a2;

    move-result-object v9

    const-string v10, "Error pruning currencies. appId"

    invoke-static {v8}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v9, v10, v11, v6}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_c
    new-instance v19, LR2/T5;

    iget-object v11, v2, LR2/I;->q:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, LR2/D5;->b()LE2/e;

    move-result-object v6

    invoke-interface {v6}, LE2/e;->a()J

    move-result-wide v15

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    move-object/from16 v9, v19

    move-object v10, v8

    move-wide v13, v15

    move-object v15, v6

    invoke-direct/range {v9 .. v15}, LR2/T5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    goto :goto_a

    :goto_d
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v9

    invoke-virtual {v9, v6}, LR2/p;->d0(LR2/T5;)Z

    move-result v9

    if-nez v9, :cond_17

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v9

    invoke-virtual {v9}, LR2/Y1;->G()LR2/a2;

    move-result-object v9

    const-string v10, "Too many unique user properties are set. Ignoring user property. appId"

    invoke-static {v8}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    iget-object v12, v1, LR2/D5;->l:LR2/N2;

    invoke-virtual {v12}, LR2/N2;->D()LR2/X1;

    move-result-object v12

    iget-object v13, v6, LR2/T5;->c:Ljava/lang/String;

    invoke-virtual {v12, v13}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    iget-object v6, v6, LR2/T5;->e:Ljava/lang/Object;

    invoke-virtual {v9, v10, v11, v12, v6}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->n0()LR2/S5;

    iget-object v9, v1, LR2/D5;->G:LR2/U5;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v11, 0x9

    const/4 v12, 0x0

    move-object v10, v8

    invoke-static/range {v9 .. v14}, LR2/S5;->N(LR2/U5;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    :cond_17
    :goto_e
    iget-object v6, v2, LR2/I;->o:Ljava/lang/String;

    invoke-static {v6}, LR2/S5;->J0(Ljava/lang/String;)Z

    move-result v6

    iget-object v9, v2, LR2/I;->o:Ljava/lang/String;

    move-object/from16 v10, v26

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v20

    invoke-virtual/range {p0 .. p0}, LR2/D5;->n0()LR2/S5;

    iget-object v9, v2, LR2/I;->p:LR2/D;

    invoke-static {v9}, LR2/S5;->z(LR2/D;)J

    move-result-wide v9

    const-wide/16 v13, 0x1

    add-long v15, v9, v13

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, LR2/D5;->u0()J

    move-result-wide v10

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v18, 0x1

    move-object v12, v8

    move-object/from16 v21, v8

    move-wide v7, v13

    move-wide v13, v15

    move/from16 v15, v18

    move/from16 v16, v6

    move/from16 v18, v20

    invoke-virtual/range {v9 .. v19}, LR2/p;->H(JLjava/lang/String;JZZZZZ)LR2/q;

    move-result-object v9

    iget-wide v10, v9, LR2/q;->b:J

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    sget-object v12, LR2/K;->m:LR2/P1;

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, LR2/P1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    int-to-long v12, v12

    sub-long/2addr v10, v12

    const-wide/16 v14, 0x0

    cmp-long v12, v10, v14

    const-wide/16 v16, 0x3e8

    if-lez v12, :cond_19

    rem-long v10, v10, v16

    cmp-long v2, v10, v7

    if-nez v2, :cond_18

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v2

    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    move-result-object v2

    const-string v3, "Data loss. Too many events logged. appId, count"

    invoke-static/range {v21 .. v21}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-wide v5, v9, LR2/q;->b:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_18
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v2

    invoke-virtual {v2}, LR2/p;->T0()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v2

    invoke-virtual {v2}, LR2/p;->R0()V

    return-void

    :cond_19
    if-eqz v6, :cond_1b

    :try_start_6
    iget-wide v10, v9, LR2/q;->a:J

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    sget-object v12, LR2/K;->o:LR2/P1;

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, LR2/P1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    int-to-long v12, v12

    sub-long/2addr v10, v12

    cmp-long v12, v10, v14

    if-lez v12, :cond_1b

    rem-long v10, v10, v16

    cmp-long v3, v10, v7

    if-nez v3, :cond_1a

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v3

    invoke-virtual {v3}, LR2/Y1;->G()LR2/a2;

    move-result-object v3

    const-string v4, "Data loss. Too many public events logged. appId, count"

    invoke-static/range {v21 .. v21}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    iget-wide v6, v9, LR2/q;->a:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v3, v4, v5, v6}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1a
    invoke-virtual/range {p0 .. p0}, LR2/D5;->n0()LR2/S5;

    iget-object v9, v1, LR2/D5;->G:LR2/U5;

    const-string v12, "_ev"

    iget-object v13, v2, LR2/I;->o:Ljava/lang/String;

    const/4 v14, 0x0

    const/16 v11, 0x10

    move-object/from16 v10, v21

    invoke-static/range {v9 .. v14}, LR2/S5;->N(LR2/U5;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v2

    invoke-virtual {v2}, LR2/p;->T0()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v2

    invoke-virtual {v2}, LR2/p;->R0()V

    return-void

    :cond_1b
    if-eqz v20, :cond_1d

    :try_start_7
    iget-wide v10, v9, LR2/q;->d:J

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v12

    iget-object v13, v3, LR2/W5;->o:Ljava/lang/String;

    sget-object v7, LR2/K;->n:LR2/P1;

    invoke-virtual {v12, v13, v7}, LR2/g;->u(Ljava/lang/String;LR2/P1;)I

    move-result v7

    const v8, 0xf4240

    invoke-static {v8, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    const/4 v8, 0x0

    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    int-to-long v7, v7

    sub-long/2addr v10, v7

    cmp-long v7, v10, v14

    if-lez v7, :cond_1d

    const-wide/16 v7, 0x1

    cmp-long v2, v10, v7

    if-nez v2, :cond_1c

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v2

    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    move-result-object v2

    const-string v3, "Too many error events logged. appId, count"

    invoke-static/range {v21 .. v21}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-wide v5, v9, LR2/q;->d:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1c
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v2

    invoke-virtual {v2}, LR2/p;->T0()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v2

    invoke-virtual {v2}, LR2/p;->R0()V

    return-void

    :cond_1d
    :try_start_8
    iget-object v7, v2, LR2/I;->p:LR2/D;

    invoke-virtual {v7}, LR2/D;->g()Landroid/os/Bundle;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, LR2/D5;->n0()LR2/S5;

    move-result-object v8

    const-string v9, "_o"

    iget-object v10, v2, LR2/I;->q:Ljava/lang/String;

    invoke-virtual {v8, v7, v9, v10}, LR2/S5;->R(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->n0()LR2/S5;

    move-result-object v8

    move-object/from16 v13, v21

    invoke-virtual {v8, v13}, LR2/S5;->F0(Ljava/lang/String;)Z

    move-result v8
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    const-string v12, "_r"

    if-eqz v8, :cond_1e

    :try_start_9
    invoke-virtual/range {p0 .. p0}, LR2/D5;->n0()LR2/S5;

    move-result-object v8

    const-string v9, "_dbg"

    const-wide/16 v10, 0x1

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    invoke-virtual {v8, v7, v9, v14}, LR2/S5;->R(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->n0()LR2/S5;

    move-result-object v8

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v8, v7, v12, v9}, LR2/S5;->R(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1e
    const-string v8, "_s"

    iget-object v9, v2, LR2/I;->o:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1f

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v8

    iget-object v9, v3, LR2/W5;->o:Ljava/lang/String;

    invoke-virtual {v8, v9, v5}, LR2/p;->F0(Ljava/lang/String;Ljava/lang/String;)LR2/T5;

    move-result-object v8

    if-eqz v8, :cond_1f

    iget-object v9, v8, LR2/T5;->e:Ljava/lang/Object;

    instance-of v9, v9, Ljava/lang/Long;

    if-eqz v9, :cond_1f

    invoke-virtual/range {p0 .. p0}, LR2/D5;->n0()LR2/S5;

    move-result-object v9

    iget-object v8, v8, LR2/T5;->e:Ljava/lang/Object;

    invoke-virtual {v9, v7, v5, v8}, LR2/S5;->R(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1f
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v5

    invoke-virtual {v5, v13}, LR2/p;->F(Ljava/lang/String;)J

    move-result-wide v8

    const-wide/16 v14, 0x0

    cmp-long v5, v8, v14

    if-lez v5, :cond_20

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v5

    invoke-virtual {v5}, LR2/Y1;->L()LR2/a2;

    move-result-object v5

    const-string v10, "Data lost. Too many events stored on disk, deleted. appId"

    invoke-static {v13}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v5, v10, v11, v8}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_20
    new-instance v5, LR2/A;

    iget-object v10, v1, LR2/D5;->l:LR2/N2;

    iget-object v11, v2, LR2/I;->q:Ljava/lang/String;

    iget-object v8, v2, LR2/I;->o:Ljava/lang/String;

    iget-wide v14, v2, LR2/I;->r:J

    const-wide/16 v18, 0x0

    move-object v9, v5

    move-object v2, v12

    move-object v12, v13

    move-object/from16 v27, v2

    move-object v2, v13

    move-object v13, v8

    move-wide/from16 v16, v18

    move-object/from16 v18, v7

    invoke-direct/range {v9 .. v18}, LR2/A;-><init>(LR2/N2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v7

    iget-object v8, v5, LR2/A;->b:Ljava/lang/String;

    invoke-virtual {v7, v2, v8}, LR2/p;->C0(Ljava/lang/String;Ljava/lang/String;)LR2/E;

    move-result-object v7

    if-nez v7, :cond_22

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v7

    invoke-virtual {v7, v2}, LR2/p;->v0(Ljava/lang/String;)J

    move-result-wide v7

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v9

    invoke-virtual {v9, v2}, LR2/g;->p(Ljava/lang/String;)I

    move-result v9

    int-to-long v9, v9

    cmp-long v7, v7, v9

    if-ltz v7, :cond_21

    if-eqz v6, :cond_21

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v3

    invoke-virtual {v3}, LR2/Y1;->G()LR2/a2;

    move-result-object v3

    const-string v4, "Too many event names used, ignoring event. appId, name, supported count"

    invoke-static {v2}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    iget-object v7, v1, LR2/D5;->l:LR2/N2;

    invoke-virtual {v7}, LR2/N2;->D()LR2/X1;

    move-result-object v7

    iget-object v5, v5, LR2/A;->b:Ljava/lang/String;

    invoke-virtual {v7, v5}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v7

    invoke-virtual {v7, v2}, LR2/g;->p(Ljava/lang/String;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v3, v4, v6, v5, v7}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->n0()LR2/S5;

    iget-object v9, v1, LR2/D5;->G:LR2/U5;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v11, 0x8

    const/4 v12, 0x0

    move-object v10, v2

    invoke-static/range {v9 .. v14}, LR2/S5;->N(LR2/U5;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v2

    invoke-virtual {v2}, LR2/p;->R0()V

    return-void

    :cond_21
    :try_start_a
    new-instance v6, LR2/E;

    iget-object v11, v5, LR2/A;->b:Ljava/lang/String;

    iget-wide v7, v5, LR2/A;->d:J

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object v9, v6

    move-object v10, v2

    move-wide/from16 v16, v7

    invoke-direct/range {v9 .. v23}, LR2/E;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    goto :goto_f

    :cond_22
    iget-object v2, v1, LR2/D5;->l:LR2/N2;

    iget-wide v8, v7, LR2/E;->f:J

    invoke-virtual {v5, v2, v8, v9}, LR2/A;->a(LR2/N2;J)LR2/A;

    move-result-object v5

    iget-wide v8, v5, LR2/A;->d:J

    invoke-virtual {v7, v8, v9}, LR2/E;->a(J)LR2/E;

    move-result-object v6

    :goto_f
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v2

    invoke-virtual {v2, v6}, LR2/p;->T(LR2/E;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e()LR2/G2;

    move-result-object v2

    invoke-virtual {v2}, LR2/m3;->n()V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->p0()V

    invoke-static {v5}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v5, LR2/A;->a:Ljava/lang/String;

    invoke-static {v2}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v2, v5, LR2/A;->a:Ljava/lang/String;

    iget-object v6, v3, LR2/W5;->o:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, LA2/n;->a(Z)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/d2;->A3()Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v2

    const/4 v6, 0x1

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/measurement/d2$a;->m0(I)Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v2

    const-string v7, "android"

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/d2$a;->O0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v2

    iget-object v7, v3, LR2/W5;->o:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_23

    iget-object v7, v3, LR2/W5;->o:Ljava/lang/String;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/d2$a;->O(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_23
    iget-object v7, v3, LR2/W5;->r:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_24

    iget-object v7, v3, LR2/W5;->r:Ljava/lang/String;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/d2$a;->a0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_24
    iget-object v7, v3, LR2/W5;->q:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_25

    iget-object v7, v3, LR2/W5;->q:Ljava/lang/String;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/d2$a;->g0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_25
    invoke-static {}, Lcom/google/android/gms/internal/measurement/s7;->a()Z

    move-result v7

    if-eqz v7, :cond_27

    iget-object v7, v3, LR2/W5;->L:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_27

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v7

    sget-object v8, LR2/K;->w0:LR2/P1;

    invoke-virtual {v7, v8}, LR2/g;->s(LR2/P1;)Z

    move-result v7

    if-nez v7, :cond_26

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v7

    iget-object v8, v3, LR2/W5;->o:Ljava/lang/String;

    sget-object v9, LR2/K;->y0:LR2/P1;

    invoke-virtual {v7, v8, v9}, LR2/g;->B(Ljava/lang/String;LR2/P1;)Z

    move-result v7

    if-eqz v7, :cond_27

    :cond_26
    iget-object v7, v3, LR2/W5;->L:Ljava/lang/String;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/d2$a;->R0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_27
    iget-wide v7, v3, LR2/W5;->x:J

    const-wide/32 v9, -0x80000000

    cmp-long v9, v7, v9

    if-eqz v9, :cond_28

    long-to-int v7, v7

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/d2$a;->d0(I)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_28
    iget-wide v7, v3, LR2/W5;->s:J

    invoke-virtual {v2, v7, v8}, Lcom/google/android/gms/internal/measurement/d2$a;->j0(J)Lcom/google/android/gms/internal/measurement/d2$a;

    iget-object v7, v3, LR2/W5;->p:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_29

    iget-object v7, v3, LR2/W5;->p:Ljava/lang/String;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/d2$a;->I0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_29
    iget-object v7, v3, LR2/W5;->o:Ljava/lang/String;

    invoke-static {v7}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v1, v7}, LR2/D5;->Q(Ljava/lang/String;)LR2/q3;

    move-result-object v7

    iget-object v8, v3, LR2/W5;->J:Ljava/lang/String;

    invoke-static {v8}, LR2/q3;->e(Ljava/lang/String;)LR2/q3;

    move-result-object v8

    invoke-virtual {v7, v8}, LR2/q3;->c(LR2/q3;)LR2/q3;

    move-result-object v7

    invoke-virtual {v7}, LR2/q3;->v()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/d2$a;->o0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d2$a;->V0()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_2a

    iget-object v8, v3, LR2/W5;->E:Ljava/lang/String;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_2a

    iget-object v8, v3, LR2/W5;->E:Ljava/lang/String;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/d2$a;->I(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_2a
    invoke-static {}, Lcom/google/android/gms/internal/measurement/g7;->a()Z

    move-result v8

    if-eqz v8, :cond_34

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v8

    iget-object v9, v3, LR2/W5;->o:Ljava/lang/String;

    sget-object v10, LR2/K;->L0:LR2/P1;

    invoke-virtual {v8, v9, v10}, LR2/g;->B(Ljava/lang/String;LR2/P1;)Z

    move-result v8

    if-eqz v8, :cond_34

    invoke-virtual/range {p0 .. p0}, LR2/D5;->n0()LR2/S5;

    iget-object v8, v3, LR2/W5;->o:Ljava/lang/String;

    invoke-static {v8}, LR2/S5;->D0(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_34

    iget v8, v3, LR2/W5;->Q:I

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/d2$a;->X(I)Lcom/google/android/gms/internal/measurement/d2$a;

    iget-wide v8, v3, LR2/W5;->R:J

    invoke-virtual {v7}, LR2/q3;->x()Z

    move-result v7

    const-wide/16 v10, 0x20

    const-wide/16 v12, 0x0

    if-nez v7, :cond_2b

    cmp-long v7, v8, v12

    if-eqz v7, :cond_2b

    const-wide/16 v14, -0x2

    and-long v7, v8, v14

    or-long v8, v7, v10

    :cond_2b
    const-wide/16 v14, 0x1

    cmp-long v7, v8, v14

    if-nez v7, :cond_2c

    move v7, v6

    goto :goto_10

    :cond_2c
    const/4 v7, 0x0

    :goto_10
    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/d2$a;->J(Z)Lcom/google/android/gms/internal/measurement/d2$a;

    cmp-long v7, v8, v12

    if-eqz v7, :cond_35

    invoke-static {}, Lcom/google/android/gms/internal/measurement/V1;->G()Lcom/google/android/gms/internal/measurement/V1$a;

    move-result-object v7

    and-long v16, v8, v14

    cmp-long v14, v16, v12

    if-eqz v14, :cond_2d

    move v14, v6

    goto :goto_11

    :cond_2d
    const/4 v14, 0x0

    :goto_11
    invoke-virtual {v7, v14}, Lcom/google/android/gms/internal/measurement/V1$a;->y(Z)Lcom/google/android/gms/internal/measurement/V1$a;

    const-wide/16 v14, 0x2

    and-long/2addr v14, v8

    cmp-long v14, v14, v12

    if-eqz v14, :cond_2e

    move v14, v6

    goto :goto_12

    :cond_2e
    const/4 v14, 0x0

    :goto_12
    invoke-virtual {v7, v14}, Lcom/google/android/gms/internal/measurement/V1$a;->A(Z)Lcom/google/android/gms/internal/measurement/V1$a;

    const-wide/16 v14, 0x4

    and-long/2addr v14, v8

    cmp-long v14, v14, v12

    if-eqz v14, :cond_2f

    move v14, v6

    goto :goto_13

    :cond_2f
    const/4 v14, 0x0

    :goto_13
    invoke-virtual {v7, v14}, Lcom/google/android/gms/internal/measurement/V1$a;->B(Z)Lcom/google/android/gms/internal/measurement/V1$a;

    const-wide/16 v14, 0x8

    and-long/2addr v14, v8

    cmp-long v14, v14, v12

    if-eqz v14, :cond_30

    move v14, v6

    goto :goto_14

    :cond_30
    const/4 v14, 0x0

    :goto_14
    invoke-virtual {v7, v14}, Lcom/google/android/gms/internal/measurement/V1$a;->C(Z)Lcom/google/android/gms/internal/measurement/V1$a;

    const-wide/16 v14, 0x10

    and-long/2addr v14, v8

    cmp-long v14, v14, v12

    if-eqz v14, :cond_31

    move v14, v6

    goto :goto_15

    :cond_31
    const/4 v14, 0x0

    :goto_15
    invoke-virtual {v7, v14}, Lcom/google/android/gms/internal/measurement/V1$a;->x(Z)Lcom/google/android/gms/internal/measurement/V1$a;

    and-long/2addr v10, v8

    cmp-long v10, v10, v12

    if-eqz v10, :cond_32

    move v10, v6

    goto :goto_16

    :cond_32
    const/4 v10, 0x0

    :goto_16
    invoke-virtual {v7, v10}, Lcom/google/android/gms/internal/measurement/V1$a;->w(Z)Lcom/google/android/gms/internal/measurement/V1$a;

    const-wide/16 v10, 0x40

    and-long/2addr v8, v10

    cmp-long v8, v8, v12

    if-eqz v8, :cond_33

    move v8, v6

    goto :goto_17

    :cond_33
    const/4 v8, 0x0

    :goto_17
    invoke-virtual {v7, v8}, Lcom/google/android/gms/internal/measurement/V1$a;->z(Z)Lcom/google/android/gms/internal/measurement/V1$a;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v7, Lcom/google/android/gms/internal/measurement/V1;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/d2$a;->C(Lcom/google/android/gms/internal/measurement/V1;)Lcom/google/android/gms/internal/measurement/d2$a;

    goto :goto_18

    :cond_34
    const-wide/16 v12, 0x0

    :cond_35
    :goto_18
    iget-wide v7, v3, LR2/W5;->t:J

    cmp-long v9, v7, v12

    if-eqz v9, :cond_36

    invoke-virtual {v2, v7, v8}, Lcom/google/android/gms/internal/measurement/d2$a;->S(J)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_36
    iget-wide v7, v3, LR2/W5;->G:J

    invoke-virtual {v2, v7, v8}, Lcom/google/android/gms/internal/measurement/d2$a;->Y(J)Lcom/google/android/gms/internal/measurement/d2$a;

    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    move-result-object v7

    invoke-virtual {v7}, LR2/N5;->j0()Ljava/util/List;

    move-result-object v7

    if-eqz v7, :cond_37

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/d2$a;->T(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_37
    iget-object v7, v3, LR2/W5;->o:Ljava/lang/String;

    invoke-static {v7}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v1, v7}, LR2/D5;->Q(Ljava/lang/String;)LR2/q3;

    move-result-object v7

    iget-object v8, v3, LR2/W5;->J:Ljava/lang/String;

    invoke-static {v8}, LR2/q3;->e(Ljava/lang/String;)LR2/q3;

    move-result-object v8

    invoke-virtual {v7, v8}, LR2/q3;->c(LR2/q3;)LR2/q3;

    move-result-object v7

    invoke-virtual {v7}, LR2/q3;->x()Z

    move-result v8

    if-eqz v8, :cond_39

    iget-boolean v8, v3, LR2/W5;->C:Z

    if-eqz v8, :cond_39

    iget-object v8, v1, LR2/D5;->i:LR2/g5;

    iget-object v9, v3, LR2/W5;->o:Ljava/lang/String;

    invoke-virtual {v8, v9, v7}, LR2/g5;->z(Ljava/lang/String;LR2/q3;)Landroid/util/Pair;

    move-result-object v8

    if-eqz v8, :cond_39

    iget-object v9, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Ljava/lang/CharSequence;

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_39

    iget-boolean v9, v3, LR2/W5;->C:Z

    if-eqz v9, :cond_39

    iget-object v9, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/measurement/d2$a;->Q0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    iget-object v9, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz v9, :cond_38

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/measurement/d2$a;->V(Z)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_38
    invoke-static {}, Lcom/google/android/gms/internal/measurement/i6;->a()Z

    move-result v9

    if-eqz v9, :cond_39

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v9

    sget-object v10, LR2/K;->Y0:LR2/P1;

    invoke-virtual {v9, v10}, LR2/g;->s(LR2/P1;)Z

    move-result v9

    if-eqz v9, :cond_39

    iget-object v9, v5, LR2/A;->b:Ljava/lang/String;

    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_39

    iget-object v8, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    const-string v9, "00000000-0000-0000-0000-000000000000"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_39

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v8

    iget-object v9, v3, LR2/W5;->o:Ljava/lang/String;

    invoke-virtual {v8, v9}, LR2/p;->D0(Ljava/lang/String;)LR2/I2;

    move-result-object v8

    if-eqz v8, :cond_39

    invoke-virtual {v8}, LR2/I2;->u()Z

    move-result v8

    if-eqz v8, :cond_39

    iget-object v8, v3, LR2/W5;->o:Ljava/lang/String;

    const/4 v9, 0x0

    invoke-virtual {v1, v8, v9}, LR2/D5;->F(Ljava/lang/String;Z)V

    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    move-object/from16 v14, v27

    const-wide/16 v10, 0x1

    invoke-virtual {v8, v14, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    iget-object v10, v1, LR2/D5;->G:LR2/U5;

    iget-object v11, v3, LR2/W5;->o:Ljava/lang/String;

    invoke-interface {v10, v11, v4, v8}, LR2/U5;->r(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_19

    :cond_39
    move-object/from16 v14, v27

    const/4 v9, 0x0

    :goto_19
    iget-object v4, v1, LR2/D5;->l:LR2/N2;

    invoke-virtual {v4}, LR2/N2;->A()LR2/C;

    move-result-object v4

    invoke-virtual {v4}, LR2/l3;->o()V

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/measurement/d2$a;->w0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v4

    iget-object v8, v1, LR2/D5;->l:LR2/N2;

    invoke-virtual {v8}, LR2/N2;->A()LR2/C;

    move-result-object v8

    invoke-virtual {v8}, LR2/l3;->o()V

    sget-object v8, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/measurement/d2$a;->M0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v4

    iget-object v8, v1, LR2/D5;->l:LR2/N2;

    invoke-virtual {v8}, LR2/N2;->A()LR2/C;

    move-result-object v8

    invoke-virtual {v8}, LR2/C;->v()J

    move-result-wide v10

    long-to-int v8, v10

    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/measurement/d2$a;->u0(I)Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v4

    iget-object v8, v1, LR2/D5;->l:LR2/N2;

    invoke-virtual {v8}, LR2/N2;->A()LR2/C;

    move-result-object v8

    invoke-virtual {v8}, LR2/C;->w()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/measurement/d2$a;->T0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    iget-wide v10, v3, LR2/W5;->N:J

    invoke-virtual {v2, v10, v11}, Lcom/google/android/gms/internal/measurement/d2$a;->y0(J)Lcom/google/android/gms/internal/measurement/d2$a;

    iget-object v4, v1, LR2/D5;->l:LR2/N2;

    invoke-virtual {v4}, LR2/N2;->p()Z

    move-result v4

    if-eqz v4, :cond_3a

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d2$a;->S0()Ljava/lang/String;

    const/4 v4, 0x0

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_3a

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/measurement/d2$a;->z0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_3a
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v4

    iget-object v8, v3, LR2/W5;->o:Ljava/lang/String;

    invoke-virtual {v4, v8}, LR2/p;->D0(Ljava/lang/String;)LR2/I2;

    move-result-object v4

    if-nez v4, :cond_3c

    new-instance v4, LR2/I2;

    iget-object v8, v1, LR2/D5;->l:LR2/N2;

    iget-object v10, v3, LR2/W5;->o:Ljava/lang/String;

    invoke-direct {v4, v8, v10}, LR2/I2;-><init>(LR2/N2;Ljava/lang/String;)V

    invoke-virtual {v1, v7}, LR2/D5;->n(LR2/q3;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, LR2/I2;->x(Ljava/lang/String;)V

    iget-object v8, v3, LR2/W5;->y:Ljava/lang/String;

    invoke-virtual {v4, v8}, LR2/I2;->J(Ljava/lang/String;)V

    iget-object v8, v3, LR2/W5;->p:Ljava/lang/String;

    invoke-virtual {v4, v8}, LR2/I2;->M(Ljava/lang/String;)V

    invoke-virtual {v7}, LR2/q3;->x()Z

    move-result v8

    if-eqz v8, :cond_3b

    iget-object v8, v1, LR2/D5;->i:LR2/g5;

    iget-object v10, v3, LR2/W5;->o:Ljava/lang/String;

    iget-boolean v11, v3, LR2/W5;->C:Z

    invoke-virtual {v8, v10, v11}, LR2/g5;->A(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, LR2/I2;->S(Ljava/lang/String;)V

    :cond_3b
    invoke-virtual {v4, v12, v13}, LR2/I2;->h0(J)V

    invoke-virtual {v4, v12, v13}, LR2/I2;->j0(J)V

    invoke-virtual {v4, v12, v13}, LR2/I2;->f0(J)V

    iget-object v8, v3, LR2/W5;->q:Ljava/lang/String;

    invoke-virtual {v4, v8}, LR2/I2;->F(Ljava/lang/String;)V

    iget-wide v10, v3, LR2/W5;->x:J

    invoke-virtual {v4, v10, v11}, LR2/I2;->c(J)V

    iget-object v8, v3, LR2/W5;->r:Ljava/lang/String;

    invoke-virtual {v4, v8}, LR2/I2;->B(Ljava/lang/String;)V

    iget-wide v10, v3, LR2/W5;->s:J

    invoke-virtual {v4, v10, v11}, LR2/I2;->d0(J)V

    iget-wide v10, v3, LR2/W5;->t:J

    invoke-virtual {v4, v10, v11}, LR2/I2;->X(J)V

    iget-boolean v8, v3, LR2/W5;->v:Z

    invoke-virtual {v4, v8}, LR2/I2;->y(Z)V

    iget-wide v10, v3, LR2/W5;->G:J

    invoke-virtual {v4, v10, v11}, LR2/I2;->Z(J)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v8

    invoke-virtual {v8, v4}, LR2/p;->U(LR2/I2;)V

    :cond_3c
    invoke-virtual {v7}, LR2/q3;->y()Z

    move-result v7

    if-eqz v7, :cond_3d

    invoke-virtual {v4}, LR2/I2;->u0()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_3d

    invoke-virtual {v4}, LR2/I2;->u0()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/d2$a;->U(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_3d
    invoke-virtual {v4}, LR2/I2;->i()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_3e

    invoke-virtual {v4}, LR2/I2;->i()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/d2$a;->G0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_3e
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v7

    iget-object v8, v3, LR2/W5;->o:Ljava/lang/String;

    invoke-virtual {v7, v8}, LR2/p;->M0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    move v8, v9

    :goto_1a
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v10

    if-ge v8, v10, :cond_40

    invoke-static {}, Lcom/google/android/gms/internal/measurement/h2;->X()Lcom/google/android/gms/internal/measurement/h2$a;

    move-result-object v10

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LR2/T5;

    iget-object v11, v11, LR2/T5;->c:Ljava/lang/String;

    invoke-virtual {v10, v11}, Lcom/google/android/gms/internal/measurement/h2$a;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/h2$a;

    move-result-object v10

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LR2/T5;

    iget-wide v12, v11, LR2/T5;->d:J

    invoke-virtual {v10, v12, v13}, Lcom/google/android/gms/internal/measurement/h2$a;->B(J)Lcom/google/android/gms/internal/measurement/h2$a;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    move-result-object v11

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LR2/T5;

    iget-object v12, v12, LR2/T5;->e:Ljava/lang/Object;

    invoke-virtual {v11, v10, v12}, LR2/N5;->U(Lcom/google/android/gms/internal/measurement/h2$a;Ljava/lang/Object;)V

    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/measurement/d2$a;->F(Lcom/google/android/gms/internal/measurement/h2$a;)Lcom/google/android/gms/internal/measurement/d2$a;

    const-string v10, "_sid"

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LR2/T5;

    iget-object v11, v11, LR2/T5;->c:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3f

    invoke-virtual {v4}, LR2/I2;->o0()J

    move-result-wide v10

    const-wide/16 v12, 0x0

    cmp-long v10, v10, v12

    if-eqz v10, :cond_3f

    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    move-result-object v10

    iget-object v11, v3, LR2/W5;->L:Ljava/lang/String;

    invoke-virtual {v10, v11}, LR2/N5;->z(Ljava/lang/String;)J

    move-result-wide v10

    invoke-virtual {v4}, LR2/I2;->o0()J

    move-result-wide v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_3f

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d2$a;->N0()Lcom/google/android/gms/internal/measurement/d2$a;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :cond_3f
    add-int/lit8 v8, v8, 0x1

    const-wide/16 v12, 0x0

    goto :goto_1a

    :cond_40
    :try_start_b
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v4, Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v3, v4}, LR2/p;->E(Lcom/google/android/gms/internal/measurement/d2;)J

    move-result-wide v2
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :try_start_c
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v4

    iget-object v7, v5, LR2/A;->f:LR2/D;

    if-eqz v7, :cond_43

    invoke-virtual {v7}, LR2/D;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_41
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_42

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v14, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_41

    :goto_1b
    move v13, v6

    goto :goto_1c

    :cond_42
    invoke-virtual/range {p0 .. p0}, LR2/D5;->h0()LR2/x2;

    move-result-object v7

    iget-object v8, v5, LR2/A;->a:Ljava/lang/String;

    iget-object v10, v5, LR2/A;->b:Ljava/lang/String;

    invoke-virtual {v7, v8, v10}, LR2/x2;->M(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, LR2/D5;->u0()J

    move-result-wide v11

    iget-object v13, v5, LR2/A;->a:Ljava/lang/String;

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-virtual/range {v10 .. v18}, LR2/p;->I(JLjava/lang/String;ZZZZZ)LR2/q;

    move-result-object v8

    if-eqz v7, :cond_43

    iget-wide v7, v8, LR2/q;->e:J

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v10

    iget-object v11, v5, LR2/A;->a:Ljava/lang/String;

    invoke-virtual {v10, v11}, LR2/g;->A(Ljava/lang/String;)I

    move-result v10

    int-to-long v10, v10

    cmp-long v7, v7, v10

    if-gez v7, :cond_43

    goto :goto_1b

    :cond_43
    move v13, v9

    :goto_1c
    invoke-virtual {v4, v5, v2, v3, v13}, LR2/p;->c0(LR2/A;JZ)Z

    move-result v2

    if-eqz v2, :cond_44

    const-wide/16 v2, 0x0

    iput-wide v2, v1, LR2/D5;->o:J

    goto :goto_1d

    :catch_1
    move-exception v0

    move-object v3, v0

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v4

    invoke-virtual {v4}, LR2/Y1;->G()LR2/a2;

    move-result-object v4

    const-string v5, "Data loss. Failed to insert raw event metadata. appId"

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d2$a;->S0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4, v5, v2, v3}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_44
    :goto_1d
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v2

    invoke-virtual {v2}, LR2/p;->T0()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v2

    invoke-virtual {v2}, LR2/p;->R0()V

    invoke-direct/range {p0 .. p0}, LR2/D5;->N()V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v2

    invoke-virtual {v2}, LR2/Y1;->K()LR2/a2;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    sub-long v3, v3, v24

    const-wide/32 v5, 0x7a120

    add-long/2addr v3, v5

    const-wide/32 v5, 0xf4240

    div-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "Background event processing time, ms"

    invoke-virtual {v2, v4, v3}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :goto_1e
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v3

    invoke-virtual {v3}, LR2/p;->R0()V

    throw v2
.end method

.method public final Z(LR2/W5;)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v3, "_sysu"

    const-string v4, "_sys"

    const-string v5, "_pfo"

    const-string v6, "com.android.vending"

    const-string v0, "_npa"

    const-string v7, "_uwa"

    const-string v8, "app_id=?"

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e()LR2/G2;

    move-result-object v9

    invoke-virtual {v9}, LR2/m3;->n()V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->p0()V

    invoke-static/range {p1 .. p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v9, v2, LR2/W5;->o:Ljava/lang/String;

    invoke-static {v9}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static/range {p1 .. p1}, LR2/D5;->d0(LR2/W5;)Z

    move-result v9

    if-nez v9, :cond_0

    return-void

    :cond_0
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v9

    iget-object v10, v2, LR2/W5;->o:Ljava/lang/String;

    invoke-virtual {v9, v10}, LR2/p;->D0(Ljava/lang/String;)LR2/I2;

    move-result-object v9

    const-wide/16 v10, 0x0

    if-eqz v9, :cond_1

    invoke-virtual {v9}, LR2/I2;->j()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_1

    iget-object v12, v2, LR2/W5;->p:Ljava/lang/String;

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_1

    invoke-virtual {v9, v10, v11}, LR2/I2;->A(J)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v12

    invoke-virtual {v12, v9}, LR2/p;->U(LR2/I2;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->h0()LR2/x2;

    move-result-object v9

    iget-object v12, v2, LR2/W5;->o:Ljava/lang/String;

    invoke-virtual {v9, v12}, LR2/x2;->U(Ljava/lang/String;)V

    :cond_1
    iget-boolean v9, v2, LR2/W5;->v:Z

    if-nez v9, :cond_2

    invoke-virtual/range {p0 .. p1}, LR2/D5;->g(LR2/W5;)LR2/I2;

    return-void

    :cond_2
    iget-wide v12, v2, LR2/W5;->A:J

    cmp-long v9, v12, v10

    if-nez v9, :cond_3

    invoke-virtual/range {p0 .. p0}, LR2/D5;->b()LE2/e;

    move-result-object v9

    invoke-interface {v9}, LE2/e;->a()J

    move-result-wide v12

    :cond_3
    iget-object v9, v1, LR2/D5;->l:LR2/N2;

    invoke-virtual {v9}, LR2/N2;->A()LR2/C;

    move-result-object v9

    invoke-virtual {v9}, LR2/C;->x()V

    iget v9, v2, LR2/W5;->B:I

    const/4 v14, 0x1

    if-eqz v9, :cond_4

    if-eq v9, v14, :cond_4

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, LR2/Y1;->L()LR2/a2;

    move-result-object v14

    iget-object v15, v2, LR2/W5;->o:Ljava/lang/String;

    invoke-static {v15}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v15

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const-string v10, "Incorrect app type, assuming installed app. appId, appType"

    invoke-virtual {v14, v10, v15, v9}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v9, 0x0

    :cond_4
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v10

    invoke-virtual {v10}, LR2/p;->Q0()V

    :try_start_0
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v10

    iget-object v11, v2, LR2/W5;->o:Ljava/lang/String;

    invoke-virtual {v10, v11, v0}, LR2/p;->F0(Ljava/lang/String;Ljava/lang/String;)LR2/T5;

    move-result-object v10

    if-eqz v10, :cond_6

    const-string v11, "auto"

    iget-object v14, v10, LR2/T5;->b:Ljava/lang/String;

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    goto :goto_0

    :cond_5
    move-object/from16 v21, v3

    move-object/from16 v22, v4

    const/4 v3, 0x1

    const/4 v4, 0x0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_17

    :cond_6
    :goto_0
    iget-object v11, v2, LR2/W5;->F:Ljava/lang/Boolean;

    if-eqz v11, :cond_9

    new-instance v0, LR2/R5;

    const-string v15, "_npa"

    iget-object v11, v2, LR2/W5;->F:Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_7

    const-wide/16 v20, 0x1

    goto :goto_1

    :cond_7
    const-wide/16 v20, 0x0

    :goto_1
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    const-string v20, "auto"

    move-object/from16 v21, v3

    move-object/from16 v22, v4

    const/4 v3, 0x1

    move-object v14, v0

    const/4 v4, 0x0

    move-wide/from16 v16, v12

    move-object/from16 v18, v11

    move-object/from16 v19, v20

    invoke-direct/range {v14 .. v19}, LR2/R5;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    if-eqz v10, :cond_8

    iget-object v10, v10, LR2/T5;->e:Ljava/lang/Object;

    iget-object v11, v0, LR2/R5;->r:Ljava/lang/Long;

    invoke-virtual {v10, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_a

    :cond_8
    invoke-virtual {v1, v0, v2}, LR2/D5;->u(LR2/R5;LR2/W5;)V

    goto :goto_2

    :cond_9
    move-object/from16 v21, v3

    move-object/from16 v22, v4

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v10, :cond_a

    invoke-virtual {v1, v0, v2}, LR2/D5;->D(Ljava/lang/String;LR2/W5;)V

    :cond_a
    :goto_2
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v0

    iget-object v10, v2, LR2/W5;->o:Ljava/lang/String;

    invoke-static {v10}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v0, v10}, LR2/p;->D0(Ljava/lang/String;)LR2/I2;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual/range {p0 .. p0}, LR2/D5;->n0()LR2/S5;

    iget-object v11, v2, LR2/W5;->p:Ljava/lang/String;

    invoke-virtual {v0}, LR2/I2;->j()Ljava/lang/String;

    move-result-object v14

    iget-object v15, v2, LR2/W5;->E:Ljava/lang/String;

    invoke-virtual {v0}, LR2/I2;->r0()Ljava/lang/String;

    move-result-object v10

    invoke-static {v11, v14, v15, v10}, LR2/S5;->l0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v10

    invoke-virtual {v10}, LR2/Y1;->L()LR2/a2;

    move-result-object v10

    const-string v11, "New GMP App Id passed in. Removing cached database data. appId"

    invoke-virtual {v0}, LR2/I2;->t0()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v10, v11, v14}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v10

    invoke-virtual {v0}, LR2/I2;->t0()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10}, LR2/C5;->u()V

    invoke-virtual {v10}, LR2/m3;->n()V

    invoke-static {v11}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v10}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    filled-new-array {v11}, [Ljava/lang/String;

    move-result-object v14

    const-string v15, "events"

    invoke-virtual {v0, v15, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    const-string v4, "user_attributes"

    invoke-virtual {v0, v4, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    add-int/2addr v15, v4

    const-string v4, "conditional_properties"

    invoke-virtual {v0, v4, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    add-int/2addr v15, v4

    const-string v4, "apps"

    invoke-virtual {v0, v4, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    add-int/2addr v15, v4

    const-string v4, "raw_events"

    invoke-virtual {v0, v4, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    add-int/2addr v15, v4

    const-string v4, "raw_events_metadata"

    invoke-virtual {v0, v4, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    add-int/2addr v15, v4

    const-string v4, "event_filters"

    invoke-virtual {v0, v4, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    add-int/2addr v15, v4

    const-string v4, "property_filters"

    invoke-virtual {v0, v4, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    add-int/2addr v15, v4

    const-string v4, "audience_filter_values"

    invoke-virtual {v0, v4, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    add-int/2addr v15, v4

    const-string v4, "consent_settings"

    invoke-virtual {v0, v4, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    add-int/2addr v15, v4

    const-string v4, "default_event_params"

    invoke-virtual {v0, v4, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    add-int/2addr v15, v4

    const-string v4, "trigger_uris"

    invoke-virtual {v0, v4, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    add-int/2addr v15, v0

    if-lez v15, :cond_b

    invoke-virtual {v10}, LR2/m3;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    move-result-object v0

    const-string v4, "Deleted application data. app, records"

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v0, v4, v11, v8}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v10}, LR2/m3;->j()LR2/Y1;

    move-result-object v4

    invoke-virtual {v4}, LR2/Y1;->G()LR2/a2;

    move-result-object v4

    const-string v8, "Error deleting application data. appId, error"

    invoke-static {v11}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v4, v8, v10, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_b
    :goto_3
    const/4 v0, 0x0

    :cond_c
    if-eqz v0, :cond_f

    invoke-virtual {v0}, LR2/I2;->z()J

    move-result-wide v10

    const-wide/32 v14, -0x80000000

    cmp-long v4, v10, v14

    if-eqz v4, :cond_d

    invoke-virtual {v0}, LR2/I2;->z()J

    move-result-wide v10

    iget-wide v3, v2, LR2/W5;->x:J

    cmp-long v3, v10, v3

    if-eqz v3, :cond_d

    const/4 v3, 0x1

    goto :goto_4

    :cond_d
    const/4 v3, 0x0

    :goto_4
    invoke-virtual {v0}, LR2/I2;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, LR2/I2;->z()J

    move-result-wide v10

    cmp-long v0, v10, v14

    if-nez v0, :cond_e

    if-eqz v4, :cond_e

    iget-object v0, v2, LR2/W5;->q:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    const/4 v15, 0x1

    goto :goto_5

    :cond_e
    const/4 v15, 0x0

    :goto_5
    or-int v0, v3, v15

    if-eqz v0, :cond_f

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v3, "_pv"

    invoke-virtual {v0, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, LR2/I;

    const-string v15, "_au"

    new-instance v4, LR2/D;

    invoke-direct {v4, v0}, LR2/D;-><init>(Landroid/os/Bundle;)V

    const-string v17, "auto"

    move-object v14, v3

    move-object/from16 v16, v4

    move-wide/from16 v18, v12

    invoke-direct/range {v14 .. v19}, LR2/I;-><init>(Ljava/lang/String;LR2/D;Ljava/lang/String;J)V

    invoke-virtual {v1, v3, v2}, LR2/D5;->q(LR2/I;LR2/W5;)V

    :cond_f
    invoke-virtual/range {p0 .. p1}, LR2/D5;->g(LR2/W5;)LR2/I2;

    if-nez v9, :cond_10

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v0

    iget-object v3, v2, LR2/W5;->o:Ljava/lang/String;

    const-string v4, "_f"

    :goto_6
    invoke-virtual {v0, v3, v4}, LR2/p;->C0(Ljava/lang/String;Ljava/lang/String;)LR2/E;

    move-result-object v0

    goto :goto_7

    :cond_10
    const/4 v3, 0x1

    if-ne v9, v3, :cond_11

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v0

    iget-object v3, v2, LR2/W5;->o:Ljava/lang/String;

    const-string v4, "_v"

    goto :goto_6

    :cond_11
    const/4 v0, 0x0

    :goto_7
    if-nez v0, :cond_26

    const-wide/32 v3, 0x36ee80

    div-long v10, v12, v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-wide/16 v14, 0x1

    add-long/2addr v10, v14

    mul-long/2addr v10, v3

    const-string v3, "_dac"

    const-string v4, "_et"

    const-string v15, "_r"

    const-string v14, "_c"

    if-nez v9, :cond_24

    :try_start_3
    new-instance v0, LR2/R5;

    const-string v9, "_fot"

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v18

    const-string v19, "auto"

    move-object v10, v14

    move-object v14, v0

    move-object v11, v15

    move-object v15, v9

    move-wide/from16 v16, v12

    invoke-direct/range {v14 .. v19}, LR2/R5;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, LR2/D5;->u(LR2/R5;LR2/W5;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e()LR2/G2;

    move-result-object v0

    invoke-virtual {v0}, LR2/m3;->n()V

    iget-object v0, v1, LR2/D5;->k:LR2/u2;

    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, LR2/u2;

    iget-object v0, v2, LR2/W5;->o:Ljava/lang/String;

    if-eqz v0, :cond_18

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_12

    goto/16 :goto_b

    :cond_12
    iget-object v14, v9, LR2/u2;->a:LR2/N2;

    invoke-virtual {v14}, LR2/N2;->e()LR2/G2;

    move-result-object v14

    invoke-virtual {v14}, LR2/m3;->n()V

    invoke-virtual {v9}, LR2/u2;->b()Z

    move-result v14

    if-nez v14, :cond_13

    iget-object v0, v9, LR2/u2;->a:LR2/N2;

    invoke-virtual {v0}, LR2/N2;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->J()LR2/a2;

    move-result-object v0

    const-string v6, "Install Referrer Reporter is not available"

    :goto_8
    invoke-virtual {v0, v6}, LR2/a2;->a(Ljava/lang/String;)V

    goto/16 :goto_c

    :cond_13
    new-instance v14, LR2/t2;

    invoke-direct {v14, v9, v0}, LR2/t2;-><init>(LR2/u2;Ljava/lang/String;)V

    iget-object v0, v9, LR2/u2;->a:LR2/N2;

    invoke-virtual {v0}, LR2/N2;->e()LR2/G2;

    move-result-object v0

    invoke-virtual {v0}, LR2/m3;->n()V

    new-instance v0, Landroid/content/Intent;

    const-string v15, "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"

    invoke-direct {v0, v15}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v15, Landroid/content/ComponentName;

    const-string v8, "com.google.android.finsky.externalreferrer.GetInstallReferrerService"

    invoke-direct {v15, v6, v8}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v15}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v8, v9, LR2/u2;->a:LR2/N2;

    invoke-virtual {v8}, LR2/N2;->a()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v8

    if-nez v8, :cond_14

    iget-object v0, v9, LR2/u2;->a:LR2/N2;

    invoke-virtual {v0}, LR2/N2;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->N()LR2/a2;

    move-result-object v0

    const-string v6, "Failed to obtain Package Manager to verify binding conditions for Install Referrer"

    goto :goto_8

    :cond_14
    const/4 v15, 0x0

    invoke-virtual {v8, v0, v15}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v8

    if-eqz v8, :cond_17

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v16

    if-nez v16, :cond_17

    invoke-interface {v8, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/content/pm/ResolveInfo;

    iget-object v8, v8, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    if-eqz v8, :cond_19

    iget-object v15, v8, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v8, v8, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    if-eqz v8, :cond_16

    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-virtual {v9}, LR2/u2;->b()Z

    move-result v6

    if-eqz v6, :cond_16

    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-static {}, LD2/b;->b()LD2/b;

    move-result-object v0

    iget-object v8, v9, LR2/u2;->a:LR2/N2;

    invoke-virtual {v8}, LR2/N2;->a()Landroid/content/Context;

    move-result-object v8

    const/4 v15, 0x1

    invoke-virtual {v0, v8, v6, v14, v15}, LD2/b;->a(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    iget-object v6, v9, LR2/u2;->a:LR2/N2;

    invoke-virtual {v6}, LR2/N2;->j()LR2/Y1;

    move-result-object v6

    invoke-virtual {v6}, LR2/Y1;->K()LR2/a2;

    move-result-object v6

    const-string v14, "Install Referrer Service is"

    if-eqz v0, :cond_15

    const-string v0, "available"

    goto :goto_9

    :catch_1
    move-exception v0

    goto :goto_a

    :cond_15
    const-string v0, "not available"

    :goto_9
    invoke-virtual {v6, v14, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_c

    :goto_a
    :try_start_5
    iget-object v6, v9, LR2/u2;->a:LR2/N2;

    invoke-virtual {v6}, LR2/N2;->j()LR2/Y1;

    move-result-object v6

    invoke-virtual {v6}, LR2/Y1;->G()LR2/a2;

    move-result-object v6

    const-string v9, "Exception occurred while binding to Install Referrer Service"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v9, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_c

    :cond_16
    iget-object v0, v9, LR2/u2;->a:LR2/N2;

    invoke-virtual {v0}, LR2/N2;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->L()LR2/a2;

    move-result-object v0

    const-string v6, "Play Store version 8.3.73 or higher required for Install Referrer"

    goto/16 :goto_8

    :cond_17
    iget-object v0, v9, LR2/u2;->a:LR2/N2;

    invoke-virtual {v0}, LR2/N2;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->J()LR2/a2;

    move-result-object v0

    const-string v6, "Play Service for fetching Install Referrer is unavailable on device"

    goto/16 :goto_8

    :cond_18
    :goto_b
    iget-object v0, v9, LR2/u2;->a:LR2/N2;

    invoke-virtual {v0}, LR2/N2;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->N()LR2/a2;

    move-result-object v0

    const-string v6, "Install Referrer Reporter was called with invalid app package name"

    goto/16 :goto_8

    :cond_19
    :goto_c
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e()LR2/G2;

    move-result-object v0

    invoke-virtual {v0}, LR2/m3;->n()V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->p0()V

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    const-wide/16 v14, 0x1

    invoke-virtual {v6, v10, v14, v15}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v6, v11, v14, v15}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-wide/16 v9, 0x0

    invoke-virtual {v6, v7, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v6, v5, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    move-object/from16 v11, v22

    invoke-virtual {v6, v11, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    move-object/from16 v8, v21

    invoke-virtual {v6, v8, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v6, v4, v14, v15}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    iget-boolean v0, v2, LR2/W5;->D:Z

    if-eqz v0, :cond_1a

    invoke-virtual {v6, v3, v14, v15}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_1a
    iget-object v0, v2, LR2/W5;->o:Ljava/lang/String;

    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v0

    invoke-static {v3}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0}, LR2/m3;->n()V

    invoke-virtual {v0}, LR2/C5;->u()V

    const-string v4, "first_open_count"

    invoke-virtual {v0, v3, v4}, LR2/p;->w0(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v9

    iget-object v0, v1, LR2/D5;->l:LR2/N2;

    invoke-virtual {v0}, LR2/N2;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    if-nez v0, :cond_1c

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    move-result-object v0

    const-string v4, "PackageManager is null, first open report might be inaccurate. appId"

    invoke-static {v3}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v4, v3}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object/from16 v21, v5

    :cond_1b
    :goto_d
    const-wide/16 v3, 0x0

    goto/16 :goto_14

    :cond_1c
    :try_start_6
    iget-object v0, v1, LR2/D5;->l:LR2/N2;

    invoke-virtual {v0}, LR2/N2;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LG2/d;->a(Landroid/content/Context;)LG2/c;

    move-result-object v0

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, LG2/c;->e(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_6
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_e

    :catch_2
    move-exception v0

    :try_start_7
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v4

    invoke-virtual {v4}, LR2/Y1;->G()LR2/a2;

    move-result-object v4

    const-string v14, "Package info is null, first open report might be inaccurate. appId"

    invoke-static {v3}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v4, v14, v15, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_e
    if-eqz v0, :cond_21

    iget-wide v14, v0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    const-wide/16 v16, 0x0

    cmp-long v4, v14, v16

    if-eqz v4, :cond_21

    move-object/from16 v21, v5

    iget-wide v4, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    cmp-long v0, v14, v4

    if-eqz v0, :cond_1f

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v0

    sget-object v4, LR2/K;->o0:LR2/P1;

    invoke-virtual {v0, v4}, LR2/g;->s(LR2/P1;)Z

    move-result v0

    if-eqz v0, :cond_1d

    const-wide/16 v4, 0x0

    cmp-long v0, v9, v4

    if-nez v0, :cond_1e

    :cond_1d
    const-wide/16 v4, 0x1

    invoke-virtual {v6, v7, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_1e
    const/4 v15, 0x0

    goto :goto_f

    :cond_1f
    const/4 v15, 0x1

    :goto_f
    new-instance v0, LR2/R5;

    const-string v4, "_fi"

    if-eqz v15, :cond_20

    const-wide/16 v14, 0x1

    goto :goto_10

    :cond_20
    const-wide/16 v14, 0x0

    :goto_10
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v18

    const-string v19, "auto"

    move-object v14, v0

    move-object v15, v4

    move-wide/from16 v16, v12

    invoke-direct/range {v14 .. v19}, LR2/R5;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, LR2/D5;->u(LR2/R5;LR2/W5;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_11

    :cond_21
    move-object/from16 v21, v5

    :goto_11
    :try_start_8
    iget-object v0, v1, LR2/D5;->l:LR2/N2;

    invoke-virtual {v0}, LR2/N2;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LG2/d;->a(Landroid/content/Context;)LG2/c;

    move-result-object v0

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, LG2/c;->c(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0
    :try_end_8
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_12

    :catch_3
    move-exception v0

    :try_start_9
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v4

    invoke-virtual {v4}, LR2/Y1;->G()LR2/a2;

    move-result-object v4

    const-string v5, "Application info is null, first open report might be inaccurate. appId"

    invoke-static {v3}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v4, v5, v3, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_12
    if-eqz v0, :cond_1b

    iget v3, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    const/4 v4, 0x1

    and-int/2addr v3, v4

    if-eqz v3, :cond_22

    const-wide/16 v3, 0x1

    invoke-virtual {v6, v11, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    goto :goto_13

    :cond_22
    const-wide/16 v3, 0x1

    :goto_13
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_1b

    invoke-virtual {v6, v8, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    goto/16 :goto_d

    :goto_14
    cmp-long v0, v9, v3

    if-ltz v0, :cond_23

    move-object/from16 v3, v21

    invoke-virtual {v6, v3, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_23
    new-instance v0, LR2/I;

    const-string v15, "_f"

    new-instance v3, LR2/D;

    invoke-direct {v3, v6}, LR2/D;-><init>(Landroid/os/Bundle;)V

    const-string v17, "auto"

    move-object v14, v0

    move-object/from16 v16, v3

    move-wide/from16 v18, v12

    invoke-direct/range {v14 .. v19}, LR2/I;-><init>(Ljava/lang/String;LR2/D;Ljava/lang/String;J)V

    invoke-virtual {v1, v0, v2}, LR2/D5;->U(LR2/I;LR2/W5;)V

    goto/16 :goto_16

    :cond_24
    move-object v7, v14

    move-object v6, v15

    const/4 v5, 0x1

    if-ne v9, v5, :cond_27

    new-instance v0, LR2/R5;

    const-string v15, "_fvt"

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v18

    const-string v19, "auto"

    move-object v14, v0

    move-wide/from16 v16, v12

    invoke-direct/range {v14 .. v19}, LR2/R5;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, LR2/D5;->u(LR2/R5;LR2/W5;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e()LR2/G2;

    move-result-object v0

    invoke-virtual {v0}, LR2/m3;->n()V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->p0()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-wide/16 v8, 0x1

    invoke-virtual {v0, v7, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v0, v6, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v0, v4, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    iget-boolean v4, v2, LR2/W5;->D:Z

    if-eqz v4, :cond_25

    invoke-virtual {v0, v3, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_25
    new-instance v3, LR2/I;

    const-string v15, "_v"

    new-instance v4, LR2/D;

    invoke-direct {v4, v0}, LR2/D;-><init>(Landroid/os/Bundle;)V

    const-string v17, "auto"

    move-object v14, v3

    move-object/from16 v16, v4

    move-wide/from16 v18, v12

    invoke-direct/range {v14 .. v19}, LR2/I;-><init>(Ljava/lang/String;LR2/D;Ljava/lang/String;J)V

    :goto_15
    invoke-virtual {v1, v3, v2}, LR2/D5;->U(LR2/I;LR2/W5;)V

    goto :goto_16

    :cond_26
    iget-boolean v0, v2, LR2/W5;->w:Z

    if-eqz v0, :cond_27

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    new-instance v3, LR2/I;

    const-string v15, "_cd"

    new-instance v4, LR2/D;

    invoke-direct {v4, v0}, LR2/D;-><init>(Landroid/os/Bundle;)V

    const-string v17, "auto"

    move-object v14, v3

    move-object/from16 v16, v4

    move-wide/from16 v18, v12

    invoke-direct/range {v14 .. v19}, LR2/I;-><init>(Ljava/lang/String;LR2/D;Ljava/lang/String;J)V

    goto :goto_15

    :cond_27
    :goto_16
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v0

    invoke-virtual {v0}, LR2/p;->T0()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v0

    invoke-virtual {v0}, LR2/p;->R0()V

    return-void

    :goto_17
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v2

    invoke-virtual {v2}, LR2/p;->R0()V

    throw v0
.end method

.method public final a()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/D5;->l:LR2/N2;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/N2;->a()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final a0(Ljava/lang/String;)LR2/z;
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LR2/D5;->p0()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, LR2/D5;->C:Ljava/util/Map;

    .line 18
    .line 19
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, LR2/z;

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0, p1}, LR2/p;->G0(Ljava/lang/String;)LR2/z;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v1, p0, LR2/D5;->C:Ljava/util/Map;

    .line 36
    .line 37
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    :cond_0
    return-object v0

    .line 41
    :cond_1
    sget-object p1, LR2/z;->f:LR2/z;

    .line 42
    .line 43
    return-object p1
.end method

.method public final b()LE2/e;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/D5;->l:LR2/N2;

    .line 2
    .line 3
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LR2/N2;

    .line 8
    .line 9
    invoke-virtual {v0}, LR2/N2;->b()LE2/e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final b0(LR2/W5;)V
    .locals 7

    .line 1
    const-string v0, "app_id=?"

    .line 2
    .line 3
    iget-object v1, p0, LR2/D5;->y:Ljava/util/List;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, LR2/D5;->z:Ljava/util/List;

    .line 13
    .line 14
    iget-object v2, p0, LR2/D5;->y:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v2, p1, LR2/W5;->o:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v2}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, LR2/m3;->n()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, LR2/C5;->u()V

    .line 38
    .line 39
    .line 40
    :try_start_0
    invoke-virtual {v1}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    filled-new-array {v2}, [Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const-string v5, "apps"

    .line 49
    .line 50
    invoke-virtual {v3, v5, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    const-string v6, "events"

    .line 55
    .line 56
    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    add-int/2addr v5, v6

    .line 61
    const-string v6, "user_attributes"

    .line 62
    .line 63
    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    add-int/2addr v5, v6

    .line 68
    const-string v6, "conditional_properties"

    .line 69
    .line 70
    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    add-int/2addr v5, v6

    .line 75
    const-string v6, "raw_events"

    .line 76
    .line 77
    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    add-int/2addr v5, v6

    .line 82
    const-string v6, "raw_events_metadata"

    .line 83
    .line 84
    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    add-int/2addr v5, v6

    .line 89
    const-string v6, "queue"

    .line 90
    .line 91
    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    add-int/2addr v5, v6

    .line 96
    const-string v6, "audience_filter_values"

    .line 97
    .line 98
    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    add-int/2addr v5, v6

    .line 103
    const-string v6, "main_event_params"

    .line 104
    .line 105
    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    add-int/2addr v5, v6

    .line 110
    const-string v6, "default_event_params"

    .line 111
    .line 112
    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    add-int/2addr v5, v6

    .line 117
    const-string v6, "trigger_uris"

    .line 118
    .line 119
    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    add-int/2addr v5, v0

    .line 124
    if-lez v5, :cond_1

    .line 125
    .line 126
    invoke-virtual {v1}, LR2/m3;->j()LR2/Y1;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    const-string v3, "Reset analytics data. app, records"

    .line 135
    .line 136
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-virtual {v0, v3, v2, v4}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :catch_0
    move-exception v0

    .line 145
    invoke-virtual {v1}, LR2/m3;->j()LR2/Y1;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    const-string v3, "Error resetting analytics data. appId, error"

    .line 154
    .line 155
    invoke-static {v2}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {v1, v3, v2, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    :cond_1
    :goto_0
    iget-boolean v0, p1, LR2/W5;->v:Z

    .line 163
    .line 164
    if-eqz v0, :cond_2

    .line 165
    .line 166
    invoke-virtual {p0, p1}, LR2/D5;->Z(LR2/W5;)V

    .line 167
    .line 168
    .line 169
    :cond_2
    return-void
.end method

.method public final c(Ljava/nio/channels/FileChannel;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_3

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto :goto_3

    .line 18
    :cond_0
    const/4 v1, 0x4

    .line 19
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-wide/16 v3, 0x0

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {p1, v3, v4}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v2}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eq p1, v1, :cond_2

    .line 33
    .line 34
    const/4 v1, -0x1

    .line 35
    if-eq p1, v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, LR2/Y1;->L()LR2/a2;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "Unexpected data length. Bytes read"

    .line 46
    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v1, v2, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catch_0
    move-exception p1

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    :goto_0
    return v0

    .line 58
    :cond_2
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 62
    .line 63
    .line 64
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    goto :goto_2

    .line 66
    :goto_1
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const-string v2, "Failed to read from channel"

    .line 75
    .line 76
    invoke-virtual {v1, v2, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :goto_2
    return v0

    .line 80
    :cond_3
    :goto_3
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    const-string v1, "Bad channel to read from"

    .line 89
    .line 90
    invoke-virtual {p1, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    return v0
.end method

.method public final c0()LR2/g;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/D5;->l:LR2/N2;

    .line 2
    .line 3
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LR2/N2;

    .line 8
    .line 9
    invoke-virtual {v0}, LR2/N2;->z()LR2/g;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final d()LR2/f;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/D5;->l:LR2/N2;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/N2;->d()LR2/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final e()LR2/G2;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/D5;->l:LR2/N2;

    .line 2
    .line 3
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LR2/N2;

    .line 8
    .line 9
    invoke-virtual {v0}, LR2/N2;->e()LR2/G2;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final e0()LR2/p;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/D5;->c:LR2/p;

    .line 2
    .line 3
    invoke-static {v0}, LR2/D5;->i(LR2/C5;)LR2/C5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LR2/p;

    .line 8
    .line 9
    return-object v0
.end method

.method public final f(Ljava/lang/String;LR2/z;LR2/q3;LR2/l;)LR2/z;
    .locals 5

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    invoke-virtual {p0}, LR2/D5;->h0()LR2/x2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, LR2/x2;->J(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/I1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "-"

    .line 16
    .line 17
    const/16 v2, 0x5a

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p2}, LR2/z;->f()Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 26
    .line 27
    if-ne p1, p3, :cond_0

    .line 28
    .line 29
    invoke-virtual {p2}, LR2/z;->a()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    sget-object p1, LR2/q3$a;->r:LR2/q3$a;

    .line 34
    .line 35
    invoke-virtual {p4, p1, v2}, LR2/l;->c(LR2/q3$a;I)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    sget-object p1, LR2/q3$a;->r:LR2/q3$a;

    .line 40
    .line 41
    sget-object p2, LR2/k;->w:LR2/k;

    .line 42
    .line 43
    invoke-virtual {p4, p1, p2}, LR2/l;->d(LR2/q3$a;LR2/k;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    new-instance p1, LR2/z;

    .line 47
    .line 48
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-direct {p1, p3, v2, p2, v1}, LR2/z;-><init>(Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_1
    invoke-virtual {p2}, LR2/z;->f()Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    invoke-virtual {p2}, LR2/z;->a()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    sget-object p2, LR2/q3$a;->r:LR2/q3$a;

    .line 65
    .line 66
    invoke-virtual {p4, p2, v2}, LR2/l;->c(LR2/q3$a;I)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    iget-object p2, p0, LR2/D5;->a:LR2/x2;

    .line 71
    .line 72
    sget-object v3, LR2/q3$a;->r:LR2/q3$a;

    .line 73
    .line 74
    invoke-virtual {p2, p1, v3}, LR2/x2;->A(Ljava/lang/String;LR2/q3$a;)LR2/q3$a;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    sget-object v4, LR2/q3$a;->p:LR2/q3$a;

    .line 79
    .line 80
    if-ne p2, v4, :cond_3

    .line 81
    .line 82
    invoke-virtual {p3}, LR2/q3;->s()Ljava/lang/Boolean;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    if-eqz p2, :cond_3

    .line 87
    .line 88
    invoke-virtual {p3}, LR2/q3;->s()Ljava/lang/Boolean;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    sget-object p2, LR2/k;->r:LR2/k;

    .line 93
    .line 94
    invoke-virtual {p4, v3, p2}, LR2/l;->d(LR2/q3$a;LR2/k;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    if-nez v0, :cond_4

    .line 98
    .line 99
    iget-object p2, p0, LR2/D5;->a:LR2/x2;

    .line 100
    .line 101
    invoke-virtual {p2, p1, v3}, LR2/x2;->K(Ljava/lang/String;LR2/q3$a;)Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    sget-object p2, LR2/k;->q:LR2/k;

    .line 110
    .line 111
    invoke-virtual {p4, v3, p2}, LR2/l;->d(LR2/q3$a;LR2/k;)V

    .line 112
    .line 113
    .line 114
    :cond_4
    :goto_1
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    iget-object p2, p0, LR2/D5;->a:LR2/x2;

    .line 118
    .line 119
    invoke-virtual {p2, p1}, LR2/x2;->Y(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    invoke-virtual {p0}, LR2/D5;->h0()LR2/x2;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    invoke-virtual {p3, p1}, LR2/x2;->S(Ljava/lang/String;)Ljava/util/SortedSet;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 132
    .line 133
    .line 134
    move-result p3

    .line 135
    if-eqz p3, :cond_7

    .line 136
    .line 137
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 138
    .line 139
    .line 140
    move-result p3

    .line 141
    if-eqz p3, :cond_5

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_5
    new-instance p3, LR2/z;

    .line 145
    .line 146
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 147
    .line 148
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    const-string v1, ""

    .line 153
    .line 154
    if-eqz p2, :cond_6

    .line 155
    .line 156
    invoke-static {v1, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    :cond_6
    invoke-direct {p3, p4, v2, v0, v1}, LR2/z;-><init>(Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return-object p3

    .line 164
    :cond_7
    :goto_2
    new-instance p1, LR2/z;

    .line 165
    .line 166
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 167
    .line 168
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    invoke-direct {p1, p3, v2, p2, v1}, LR2/z;-><init>(Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    return-object p1

    .line 176
    :cond_8
    sget-object p1, LR2/z;->f:LR2/z;

    .line 177
    .line 178
    return-object p1
.end method

.method public final f0()LR2/X1;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/D5;->l:LR2/N2;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/N2;->D()LR2/X1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final g(LR2/W5;)LR2/I2;
    .locals 10

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    move-result-object v0

    invoke-virtual {v0}, LR2/m3;->n()V

    invoke-virtual {p0}, LR2/D5;->p0()V

    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, LR2/W5;->o:Ljava/lang/String;

    invoke-static {v0}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, LR2/W5;->K:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, LR2/D5;->D:Ljava/util/Map;

    iget-object v2, p1, LR2/W5;->o:Ljava/lang/String;

    new-instance v3, LR2/D5$b;

    iget-object v4, p1, LR2/W5;->K:Ljava/lang/String;

    invoke-direct {v3, p0, v4, v1}, LR2/D5$b;-><init>(LR2/D5;Ljava/lang/String;LR2/M5;)V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    move-result-object v0

    iget-object v2, p1, LR2/W5;->o:Ljava/lang/String;

    invoke-virtual {v0, v2}, LR2/p;->D0(Ljava/lang/String;)LR2/I2;

    move-result-object v0

    iget-object v2, p1, LR2/W5;->o:Ljava/lang/String;

    invoke-virtual {p0, v2}, LR2/D5;->Q(Ljava/lang/String;)LR2/q3;

    move-result-object v2

    iget-object v3, p1, LR2/W5;->J:Ljava/lang/String;

    invoke-static {v3}, LR2/q3;->e(Ljava/lang/String;)LR2/q3;

    move-result-object v3

    invoke-virtual {v2, v3}, LR2/q3;->c(LR2/q3;)LR2/q3;

    move-result-object v2

    invoke-virtual {v2}, LR2/q3;->x()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, LR2/D5;->i:LR2/g5;

    iget-object v4, p1, LR2/W5;->o:Ljava/lang/String;

    iget-boolean v5, p1, LR2/W5;->C:Z

    invoke-virtual {v3, v4, v5}, LR2/g5;->A(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    const-string v3, ""

    :goto_0
    if-nez v0, :cond_3

    new-instance v0, LR2/I2;

    iget-object v4, p0, LR2/D5;->l:LR2/N2;

    iget-object v5, p1, LR2/W5;->o:Ljava/lang/String;

    invoke-direct {v0, v4, v5}, LR2/I2;-><init>(LR2/N2;Ljava/lang/String;)V

    invoke-virtual {v2}, LR2/q3;->y()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p0, v2}, LR2/D5;->n(LR2/q3;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, LR2/I2;->x(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v2}, LR2/q3;->x()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v0, v3}, LR2/I2;->S(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_3
    invoke-virtual {v2}, LR2/q3;->x()Z

    move-result v4

    if-eqz v4, :cond_4

    if-eqz v3, :cond_4

    invoke-virtual {v0}, LR2/I2;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v0, v3}, LR2/I2;->S(Ljava/lang/String;)V

    iget-boolean v3, p1, LR2/W5;->C:Z

    if-eqz v3, :cond_5

    iget-object v3, p0, LR2/D5;->i:LR2/g5;

    iget-object v4, p1, LR2/W5;->o:Ljava/lang/String;

    invoke-virtual {v3, v4, v2}, LR2/g5;->z(Ljava/lang/String;LR2/q3;)Landroid/util/Pair;

    move-result-object v3

    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    const-string v4, "00000000-0000-0000-0000-000000000000"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {p0, v2}, LR2/D5;->n(LR2/q3;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LR2/I2;->x(Ljava/lang/String;)V

    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    move-result-object v2

    iget-object v3, p1, LR2/W5;->o:Ljava/lang/String;

    const-string v4, "_id"

    invoke-virtual {v2, v3, v4}, LR2/p;->F0(Ljava/lang/String;Ljava/lang/String;)LR2/T5;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    move-result-object v2

    iget-object v3, p1, LR2/W5;->o:Ljava/lang/String;

    const-string v4, "_lair"

    invoke-virtual {v2, v3, v4}, LR2/p;->F0(Ljava/lang/String;Ljava/lang/String;)LR2/T5;

    move-result-object v2

    if-nez v2, :cond_5

    invoke-virtual {p0}, LR2/D5;->b()LE2/e;

    move-result-object v2

    invoke-interface {v2}, LE2/e;->a()J

    move-result-wide v7

    new-instance v2, LR2/T5;

    iget-object v4, p1, LR2/W5;->o:Ljava/lang/String;

    const-wide/16 v5, 0x1

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    const-string v5, "auto"

    const-string v6, "_lair"

    move-object v3, v2

    invoke-direct/range {v3 .. v9}, LR2/T5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    move-result-object v3

    invoke-virtual {v3, v2}, LR2/p;->d0(LR2/T5;)Z

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, LR2/I2;->u0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v2}, LR2/q3;->y()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p0, v2}, LR2/D5;->n(LR2/q3;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LR2/I2;->x(Ljava/lang/String;)V

    :cond_5
    :goto_1
    iget-object v2, p1, LR2/W5;->p:Ljava/lang/String;

    invoke-virtual {v0, v2}, LR2/I2;->M(Ljava/lang/String;)V

    iget-object v2, p1, LR2/W5;->E:Ljava/lang/String;

    invoke-virtual {v0, v2}, LR2/I2;->e(Ljava/lang/String;)V

    iget-object v2, p1, LR2/W5;->y:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, p1, LR2/W5;->y:Ljava/lang/String;

    invoke-virtual {v0, v2}, LR2/I2;->J(Ljava/lang/String;)V

    :cond_6
    iget-wide v2, p1, LR2/W5;->s:J

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-eqz v4, :cond_7

    invoke-virtual {v0, v2, v3}, LR2/I2;->d0(J)V

    :cond_7
    iget-object v2, p1, LR2/W5;->q:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_8

    iget-object v2, p1, LR2/W5;->q:Ljava/lang/String;

    invoke-virtual {v0, v2}, LR2/I2;->F(Ljava/lang/String;)V

    :cond_8
    iget-wide v2, p1, LR2/W5;->x:J

    invoke-virtual {v0, v2, v3}, LR2/I2;->c(J)V

    iget-object v2, p1, LR2/W5;->r:Ljava/lang/String;

    if-eqz v2, :cond_9

    invoke-virtual {v0, v2}, LR2/I2;->B(Ljava/lang/String;)V

    :cond_9
    iget-wide v2, p1, LR2/W5;->t:J

    invoke-virtual {v0, v2, v3}, LR2/I2;->X(J)V

    iget-boolean v2, p1, LR2/W5;->v:Z

    invoke-virtual {v0, v2}, LR2/I2;->y(Z)V

    iget-object v2, p1, LR2/W5;->u:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_a

    iget-object v2, p1, LR2/W5;->u:Ljava/lang/String;

    invoke-virtual {v0, v2}, LR2/I2;->P(Ljava/lang/String;)V

    :cond_a
    iget-boolean v2, p1, LR2/W5;->C:Z

    invoke-virtual {v0, v2}, LR2/I2;->g(Z)V

    iget-object v2, p1, LR2/W5;->F:Ljava/lang/Boolean;

    invoke-virtual {v0, v2}, LR2/I2;->d(Ljava/lang/Boolean;)V

    iget-wide v2, p1, LR2/W5;->G:J

    invoke-virtual {v0, v2, v3}, LR2/I2;->Z(J)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/s7;->a()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual {p0}, LR2/D5;->c0()LR2/g;

    move-result-object v2

    sget-object v3, LR2/K;->w0:LR2/P1;

    invoke-virtual {v2, v3}, LR2/g;->s(LR2/P1;)Z

    move-result v2

    if-nez v2, :cond_b

    invoke-virtual {p0}, LR2/D5;->c0()LR2/g;

    move-result-object v2

    iget-object v3, p1, LR2/W5;->o:Ljava/lang/String;

    sget-object v4, LR2/K;->y0:LR2/P1;

    invoke-virtual {v2, v3, v4}, LR2/g;->B(Ljava/lang/String;LR2/P1;)Z

    move-result v2

    if-eqz v2, :cond_c

    :cond_b
    iget-object v2, p1, LR2/W5;->L:Ljava/lang/String;

    invoke-virtual {v0, v2}, LR2/I2;->V(Ljava/lang/String;)V

    :cond_c
    invoke-static {}, Lcom/google/android/gms/internal/measurement/o6;->a()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {p0}, LR2/D5;->c0()LR2/g;

    move-result-object v2

    sget-object v3, LR2/K;->v0:LR2/P1;

    invoke-virtual {v2, v3}, LR2/g;->s(LR2/P1;)Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object v1, p1, LR2/W5;->H:Ljava/util/List;

    :goto_2
    invoke-virtual {v0, v1}, LR2/I2;->f(Ljava/util/List;)V

    goto :goto_3

    :cond_d
    invoke-static {}, Lcom/google/android/gms/internal/measurement/o6;->a()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-virtual {p0}, LR2/D5;->c0()LR2/g;

    move-result-object v2

    sget-object v3, LR2/K;->u0:LR2/P1;

    invoke-virtual {v2, v3}, LR2/g;->s(LR2/P1;)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_2

    :cond_e
    :goto_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/E7;->a()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-virtual {p0}, LR2/D5;->c0()LR2/g;

    move-result-object v1

    sget-object v2, LR2/K;->A0:LR2/P1;

    invoke-virtual {v1, v2}, LR2/g;->s(LR2/P1;)Z

    move-result v1

    if-eqz v1, :cond_f

    iget-boolean v1, p1, LR2/W5;->M:Z

    invoke-virtual {v0, v1}, LR2/I2;->C(Z)V

    :cond_f
    invoke-static {}, Lcom/google/android/gms/internal/measurement/g7;->a()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-virtual {p0}, LR2/D5;->c0()LR2/g;

    move-result-object v1

    sget-object v2, LR2/K;->L0:LR2/P1;

    invoke-virtual {v1, v2}, LR2/g;->s(LR2/P1;)Z

    move-result v1

    if-eqz v1, :cond_10

    iget v1, p1, LR2/W5;->Q:I

    invoke-virtual {v0, v1}, LR2/I2;->b(I)V

    :cond_10
    iget-wide v1, p1, LR2/W5;->N:J

    invoke-virtual {v0, v1, v2}, LR2/I2;->n0(J)V

    invoke-virtual {v0}, LR2/I2;->s()Z

    move-result p1

    if-eqz p1, :cond_11

    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    move-result-object p1

    invoke-virtual {p1, v0}, LR2/p;->U(LR2/I2;)V

    :cond_11
    return-object v0
.end method

.method public final g0()LR2/f2;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/D5;->b:LR2/f2;

    .line 2
    .line 3
    invoke-static {v0}, LR2/D5;->i(LR2/C5;)LR2/C5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LR2/f2;

    .line 8
    .line 9
    return-object v0
.end method

.method public final h0()LR2/x2;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/D5;->a:LR2/x2;

    .line 2
    .line 3
    invoke-static {v0}, LR2/D5;->i(LR2/C5;)LR2/C5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LR2/x2;

    .line 8
    .line 9
    return-object v0
.end method

.method public final i0()LR2/N2;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/D5;->l:LR2/N2;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()LR2/Y1;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/D5;->l:LR2/N2;

    .line 2
    .line 3
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LR2/N2;

    .line 8
    .line 9
    invoke-virtual {v0}, LR2/N2;->j()LR2/Y1;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final j0()LR2/u4;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/D5;->h:LR2/u4;

    .line 2
    .line 3
    invoke-static {v0}, LR2/D5;->i(LR2/C5;)LR2/C5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LR2/u4;

    .line 8
    .line 9
    return-object v0
.end method

.method public final k0()LR2/g5;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/D5;->i:LR2/g5;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 5

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LR2/D5;->p0()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    invoke-virtual {p0}, LR2/D5;->h0()LR2/x2;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0, p1}, LR2/x2;->J(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/I1;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 30
    .line 31
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, LR2/D5;->Q(Ljava/lang/String;)LR2/q3;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, LR2/q3;->p()Landroid/os/Bundle;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1}, LR2/D5;->a0(Ljava/lang/String;)LR2/z;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    new-instance v3, LR2/l;

    .line 50
    .line 51
    invoke-direct {v3}, LR2/l;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1, v2, v1, v3}, LR2/D5;->f(Ljava/lang/String;LR2/z;LR2/q3;LR2/l;)LR2/z;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, LR2/z;->e()Landroid/os/Bundle;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, LR2/D5;->m0()LR2/N5;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1, p1}, LR2/N5;->h0(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    const/4 v2, 0x1

    .line 74
    if-nez v1, :cond_2

    .line 75
    .line 76
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const-string v3, "_npa"

    .line 81
    .line 82
    invoke-virtual {v1, p1, v3}, LR2/p;->F0(Ljava/lang/String;Ljava/lang/String;)LR2/T5;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    if-eqz v1, :cond_1

    .line 87
    .line 88
    iget-object p1, v1, LR2/T5;->e:Ljava/lang/Object;

    .line 89
    .line 90
    const-wide/16 v3, 0x1

    .line 91
    .line 92
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    goto :goto_0

    .line 101
    :cond_1
    iget-object v1, p0, LR2/D5;->a:LR2/x2;

    .line 102
    .line 103
    sget-object v3, LR2/q3$a;->s:LR2/q3$a;

    .line 104
    .line 105
    invoke-virtual {v1, p1, v3}, LR2/x2;->K(Ljava/lang/String;LR2/q3$a;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_2

    .line 110
    .line 111
    const/4 p1, 0x0

    .line 112
    goto :goto_0

    .line 113
    :cond_2
    move p1, v2

    .line 114
    :goto_0
    if-ne p1, v2, :cond_3

    .line 115
    .line 116
    const-string p1, "denied"

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    const-string p1, "granted"

    .line 120
    .line 121
    :goto_1
    const-string v1, "ad_personalization"

    .line 122
    .line 123
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-object v0

    .line 127
    :cond_4
    return-object v1
.end method

.method public final l0()LR2/B5;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/D5;->j:LR2/B5;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m(LR2/I2;)Ljava/lang/Boolean;
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p1}, LR2/I2;->z()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/32 v2, -0x80000000

    .line 6
    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LR2/D5;->l:LR2/N2;

    .line 14
    .line 15
    invoke-virtual {v0}, LR2/N2;->a()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, LG2/d;->a(Landroid/content/Context;)LG2/c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p1}, LR2/I2;->t0()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0, v2, v1}, LG2/c;->e(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 32
    .line 33
    invoke-virtual {p1}, LR2/I2;->z()J

    .line 34
    .line 35
    .line 36
    move-result-wide v1

    .line 37
    int-to-long v3, v0

    .line 38
    cmp-long p1, v1, v3

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_0
    iget-object v0, p0, LR2/D5;->l:LR2/N2;

    .line 46
    .line 47
    invoke-virtual {v0}, LR2/N2;->a()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, LG2/d;->a(Landroid/content/Context;)LG2/c;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p1}, LR2/I2;->t0()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v0, v2, v1}, LG2/c;->e(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {p1}, LR2/I2;->h()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_1

    .line 76
    .line 77
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    return-object p1

    .line 80
    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 81
    .line 82
    return-object p1

    .line 83
    :catch_0
    const/4 p1, 0x0

    .line 84
    return-object p1
.end method

.method public final m0()LR2/N5;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/D5;->g:LR2/N5;

    .line 2
    .line 3
    invoke-static {v0}, LR2/D5;->i(LR2/C5;)LR2/C5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LR2/N5;

    .line 8
    .line 9
    return-object v0
.end method

.method public final n(LR2/q3;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1}, LR2/q3;->y()Z

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/16 p1, 0x10

    .line 9
    .line 10
    new-array p1, p1, [B

    .line 11
    .line 12
    invoke-virtual {p0}, LR2/D5;->n0()LR2/S5;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, LR2/S5;->U0()Ljava/security/SecureRandom;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1, p1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 21
    .line 22
    .line 23
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 24
    .line 25
    new-instance v2, Ljava/math/BigInteger;

    .line 26
    .line 27
    invoke-direct {v2, v0, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 28
    .line 29
    .line 30
    new-array p1, v0, [Ljava/lang/Object;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    aput-object v2, p1, v0

    .line 34
    .line 35
    const-string v0, "%032x"

    .line 36
    .line 37
    invoke-static {v1, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_0
    const/4 p1, 0x0

    .line 43
    return-object p1
.end method

.method public final n0()LR2/S5;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/D5;->l:LR2/N2;

    .line 2
    .line 3
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LR2/N2;

    .line 8
    .line 9
    invoke-virtual {v0}, LR2/N2;->L()LR2/S5;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final o(LR2/e;)V
    .locals 1

    .line 1
    iget-object v0, p1, LR2/e;->o:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, LR2/D5;->W(Ljava/lang/String;)LR2/W5;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1, v0}, LR2/D5;->p(LR2/e;LR2/W5;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final o0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LR2/D5;->p0()V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, LR2/D5;->n:Z

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, LR2/D5;->n:Z

    .line 17
    .line 18
    invoke-direct {p0}, LR2/D5;->P()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, LR2/D5;->x:Ljava/nio/channels/FileChannel;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, LR2/D5;->c(Ljava/nio/channels/FileChannel;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v1, p0, LR2/D5;->l:LR2/N2;

    .line 31
    .line 32
    invoke-virtual {v1}, LR2/N2;->B()LR2/S1;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, LR2/S1;->D()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, LR2/m3;->n()V

    .line 45
    .line 46
    .line 47
    if-le v0, v1, :cond_0

    .line 48
    .line 49
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const-string v3, "Panic: can\'t downgrade version. Previous, current version"

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    if-ge v0, v1, :cond_2

    .line 69
    .line 70
    iget-object v2, p0, LR2/D5;->x:Ljava/nio/channels/FileChannel;

    .line 71
    .line 72
    invoke-virtual {p0, v1, v2}, LR2/D5;->J(ILjava/nio/channels/FileChannel;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_1

    .line 77
    .line 78
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v2}, LR2/Y1;->K()LR2/a2;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    const-string v3, "Storage version upgraded. Previous, current version"

    .line 95
    .line 96
    :goto_0
    invoke-virtual {v2, v3, v0, v1}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    const-string v3, "Storage version upgrade failed. Previous, current version"

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_2
    :goto_1
    return-void
.end method

.method public final p(LR2/e;LR2/W5;)V
    .locals 10

    .line 1
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, LR2/e;->o:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iget-object v0, p1, LR2/e;->q:LR2/R5;

    .line 10
    .line 11
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, LR2/e;->q:LR2/R5;

    .line 15
    .line 16
    iget-object v0, v0, LR2/R5;->p:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, LR2/D5;->p0()V

    .line 29
    .line 30
    .line 31
    invoke-static {p2}, LR2/D5;->d0(LR2/W5;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    iget-boolean v0, p2, LR2/W5;->v:Z

    .line 39
    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    invoke-virtual {p0, p2}, LR2/D5;->g(LR2/W5;)LR2/I2;

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, LR2/p;->Q0()V

    .line 51
    .line 52
    .line 53
    :try_start_0
    invoke-virtual {p0, p2}, LR2/D5;->g(LR2/W5;)LR2/I2;

    .line 54
    .line 55
    .line 56
    iget-object v0, p1, LR2/e;->o:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    move-object v2, v0

    .line 63
    check-cast v2, Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object v1, p1, LR2/e;->q:LR2/R5;

    .line 70
    .line 71
    iget-object v1, v1, LR2/R5;->p:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v0, v2, v1}, LR2/p;->A0(Ljava/lang/String;Ljava/lang/String;)LR2/e;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1}, LR2/Y1;->F()LR2/a2;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const-string v3, "Removing conditional user property"

    .line 88
    .line 89
    iget-object v4, p1, LR2/e;->o:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v5, p0, LR2/D5;->l:LR2/N2;

    .line 92
    .line 93
    invoke-virtual {v5}, LR2/N2;->D()LR2/X1;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    iget-object v6, p1, LR2/e;->q:LR2/R5;

    .line 98
    .line 99
    iget-object v6, v6, LR2/R5;->p:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v5, v6}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {v1, v3, v4, v5}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    iget-object v3, p1, LR2/e;->q:LR2/R5;

    .line 113
    .line 114
    iget-object v3, v3, LR2/R5;->p:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {v1, v2, v3}, LR2/p;->D(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    iget-boolean v1, v0, LR2/e;->s:Z

    .line 120
    .line 121
    if-eqz v1, :cond_2

    .line 122
    .line 123
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    iget-object v3, p1, LR2/e;->q:LR2/R5;

    .line 128
    .line 129
    iget-object v3, v3, LR2/R5;->p:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v1, v2, v3}, LR2/p;->L0(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :catchall_0
    move-exception p1

    .line 136
    goto :goto_4

    .line 137
    :cond_2
    :goto_0
    iget-object v1, p1, LR2/e;->y:LR2/I;

    .line 138
    .line 139
    if-eqz v1, :cond_5

    .line 140
    .line 141
    iget-object v1, v1, LR2/I;->p:LR2/D;

    .line 142
    .line 143
    if-eqz v1, :cond_3

    .line 144
    .line 145
    invoke-virtual {v1}, LR2/D;->g()Landroid/os/Bundle;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    :goto_1
    move-object v4, v1

    .line 150
    goto :goto_2

    .line 151
    :cond_3
    const/4 v1, 0x0

    .line 152
    goto :goto_1

    .line 153
    :goto_2
    invoke-virtual {p0}, LR2/D5;->n0()LR2/S5;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    iget-object v3, p1, LR2/e;->y:LR2/I;

    .line 158
    .line 159
    invoke-static {v3}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    check-cast v3, LR2/I;

    .line 164
    .line 165
    iget-object v3, v3, LR2/I;->o:Ljava/lang/String;

    .line 166
    .line 167
    iget-object v5, v0, LR2/e;->p:Ljava/lang/String;

    .line 168
    .line 169
    iget-object p1, p1, LR2/e;->y:LR2/I;

    .line 170
    .line 171
    iget-wide v6, p1, LR2/I;->r:J

    .line 172
    .line 173
    const/4 v8, 0x1

    .line 174
    const/4 v9, 0x1

    .line 175
    invoke-virtual/range {v1 .. v9}, LR2/S5;->C(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZZ)LR2/I;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    check-cast p1, LR2/I;

    .line 184
    .line 185
    invoke-virtual {p0, p1, p2}, LR2/D5;->Y(LR2/I;LR2/W5;)V

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_4
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    invoke-virtual {p2}, LR2/Y1;->L()LR2/a2;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    const-string v0, "Conditional user property doesn\'t exist"

    .line 198
    .line 199
    iget-object v1, p1, LR2/e;->o:Ljava/lang/String;

    .line 200
    .line 201
    invoke-static {v1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    iget-object v2, p0, LR2/D5;->l:LR2/N2;

    .line 206
    .line 207
    invoke-virtual {v2}, LR2/N2;->D()LR2/X1;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    iget-object p1, p1, LR2/e;->q:LR2/R5;

    .line 212
    .line 213
    iget-object p1, p1, LR2/R5;->p:Ljava/lang/String;

    .line 214
    .line 215
    invoke-virtual {v2, p1}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-virtual {p2, v0, v1, p1}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    :cond_5
    :goto_3
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-virtual {p1}, LR2/p;->T0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-virtual {p1}, LR2/p;->R0()V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :goto_4
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 238
    .line 239
    .line 240
    move-result-object p2

    .line 241
    invoke-virtual {p2}, LR2/p;->R0()V

    .line 242
    .line 243
    .line 244
    throw p1
.end method

.method public final p0()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LR2/D5;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "UploadController is not initialized"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final q(LR2/I;LR2/W5;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    move-object/from16 v0, p2

    invoke-static/range {p2 .. p2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, LR2/W5;->o:Ljava/lang/String;

    invoke-static {v2}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e()LR2/G2;

    move-result-object v2

    invoke-virtual {v2}, LR2/m3;->n()V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->p0()V

    iget-object v2, v0, LR2/W5;->o:Ljava/lang/String;

    move-object/from16 v3, p1

    iget-wide v10, v3, LR2/I;->r:J

    invoke-static/range {p1 .. p1}, LR2/c2;->b(LR2/I;)LR2/c2;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e()LR2/G2;

    move-result-object v4

    invoke-virtual {v4}, LR2/m3;->n()V

    iget-object v4, v1, LR2/D5;->E:LR2/w4;

    if-eqz v4, :cond_1

    iget-object v4, v1, LR2/D5;->F:Ljava/lang/String;

    if-eqz v4, :cond_1

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v4, v1, LR2/D5;->E:LR2/w4;

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v4, 0x0

    :goto_1
    iget-object v5, v3, LR2/c2;->d:Landroid/os/Bundle;

    const/4 v12, 0x0

    invoke-static {v4, v5, v12}, LR2/S5;->L(LR2/w4;Landroid/os/Bundle;Z)V

    invoke-virtual {v3}, LR2/c2;->a()LR2/I;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    invoke-static {v3, v0}, LR2/N5;->c0(LR2/I;LR2/W5;)Z

    move-result v4

    if-nez v4, :cond_2

    return-void

    :cond_2
    iget-boolean v4, v0, LR2/W5;->v:Z

    if-nez v4, :cond_3

    invoke-virtual {v1, v0}, LR2/D5;->g(LR2/W5;)LR2/I2;

    return-void

    :cond_3
    iget-object v4, v0, LR2/W5;->H:Ljava/util/List;

    if-eqz v4, :cond_5

    iget-object v5, v3, LR2/I;->o:Ljava/lang/String;

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v4, v3, LR2/I;->p:LR2/D;

    invoke-virtual {v4}, LR2/D;->g()Landroid/os/Bundle;

    move-result-object v4

    const-string v5, "ga_safelisted"

    const-wide/16 v6, 0x1

    invoke-virtual {v4, v5, v6, v7}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    new-instance v5, LR2/I;

    iget-object v14, v3, LR2/I;->o:Ljava/lang/String;

    new-instance v15, LR2/D;

    invoke-direct {v15, v4}, LR2/D;-><init>(Landroid/os/Bundle;)V

    iget-object v4, v3, LR2/I;->q:Ljava/lang/String;

    iget-wide v6, v3, LR2/I;->r:J

    move-object v13, v5

    move-object/from16 v16, v4

    move-wide/from16 v17, v6

    invoke-direct/range {v13 .. v18}, LR2/I;-><init>(Ljava/lang/String;LR2/D;Ljava/lang/String;J)V

    goto :goto_2

    :cond_4
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    move-result-object v0

    iget-object v4, v3, LR2/I;->o:Ljava/lang/String;

    iget-object v3, v3, LR2/I;->q:Ljava/lang/String;

    const-string v5, "Dropping non-safelisted event. appId, event name, origin"

    invoke-virtual {v0, v5, v2, v4, v3}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_5
    move-object v13, v3

    :goto_2
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v3

    invoke-virtual {v3}, LR2/p;->Q0()V

    :try_start_0
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v3

    invoke-static {v2}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v3}, LR2/m3;->n()V

    invoke-virtual {v3}, LR2/C5;->u()V

    const-wide/16 v4, 0x0

    cmp-long v4, v10, v4

    const/4 v5, 0x2

    const/4 v14, 0x1

    if-gez v4, :cond_6

    invoke-virtual {v3}, LR2/m3;->j()LR2/Y1;

    move-result-object v3

    invoke-virtual {v3}, LR2/Y1;->L()LR2/a2;

    move-result-object v3

    const-string v6, "Invalid time querying timed out conditional properties"

    invoke-static {v2}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v3, v6, v7, v8}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_d

    :cond_6
    const-string v6, "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout"

    new-array v7, v5, [Ljava/lang/String;

    aput-object v2, v7, v12

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v14

    invoke-virtual {v3, v6, v7}, LR2/p;->S(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_7
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LR2/e;

    if-eqz v6, :cond_7

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v7

    invoke-virtual {v7}, LR2/Y1;->K()LR2/a2;

    move-result-object v7

    const-string v8, "User property timed out"

    iget-object v9, v6, LR2/e;->o:Ljava/lang/String;

    iget-object v15, v1, LR2/D5;->l:LR2/N2;

    invoke-virtual {v15}, LR2/N2;->D()LR2/X1;

    move-result-object v15

    iget-object v14, v6, LR2/e;->q:LR2/R5;

    iget-object v14, v14, LR2/R5;->p:Ljava/lang/String;

    invoke-virtual {v15, v14}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    iget-object v15, v6, LR2/e;->q:LR2/R5;

    invoke-virtual {v15}, LR2/R5;->a()Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v7, v8, v9, v14, v15}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v7, v6, LR2/e;->u:LR2/I;

    if-eqz v7, :cond_8

    new-instance v7, LR2/I;

    iget-object v8, v6, LR2/e;->u:LR2/I;

    invoke-direct {v7, v8, v10, v11}, LR2/I;-><init>(LR2/I;J)V

    invoke-virtual {v1, v7, v0}, LR2/D5;->Y(LR2/I;LR2/W5;)V

    :cond_8
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v7

    iget-object v6, v6, LR2/e;->q:LR2/R5;

    iget-object v6, v6, LR2/R5;->p:Ljava/lang/String;

    invoke-virtual {v7, v2, v6}, LR2/p;->D(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v14, 0x1

    goto :goto_4

    :cond_9
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v3

    invoke-static {v2}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v3}, LR2/m3;->n()V

    invoke-virtual {v3}, LR2/C5;->u()V

    if-gez v4, :cond_a

    invoke-virtual {v3}, LR2/m3;->j()LR2/Y1;

    move-result-object v3

    invoke-virtual {v3}, LR2/Y1;->L()LR2/a2;

    move-result-object v3

    const-string v6, "Invalid time querying expired conditional properties"

    invoke-static {v2}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v3, v6, v7, v8}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    goto :goto_5

    :cond_a
    const-string v6, "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live"

    new-array v7, v5, [Ljava/lang/String;

    aput-object v2, v7, v12

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x1

    aput-object v8, v7, v9

    invoke-virtual {v3, v6, v7}, LR2/p;->S(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    :goto_5
    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LR2/e;

    if-eqz v7, :cond_b

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v8

    invoke-virtual {v8}, LR2/Y1;->K()LR2/a2;

    move-result-object v8

    const-string v9, "User property expired"

    iget-object v14, v7, LR2/e;->o:Ljava/lang/String;

    iget-object v15, v1, LR2/D5;->l:LR2/N2;

    invoke-virtual {v15}, LR2/N2;->D()LR2/X1;

    move-result-object v15

    iget-object v5, v7, LR2/e;->q:LR2/R5;

    iget-object v5, v5, LR2/R5;->p:Ljava/lang/String;

    invoke-virtual {v15, v5}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v15, v7, LR2/e;->q:LR2/R5;

    invoke-virtual {v15}, LR2/R5;->a()Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v8, v9, v14, v5, v15}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v5

    iget-object v8, v7, LR2/e;->q:LR2/R5;

    iget-object v8, v8, LR2/R5;->p:Ljava/lang/String;

    invoke-virtual {v5, v2, v8}, LR2/p;->L0(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, v7, LR2/e;->y:LR2/I;

    if-eqz v5, :cond_c

    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_c
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v5

    iget-object v7, v7, LR2/e;->q:LR2/R5;

    iget-object v7, v7, LR2/R5;->p:Ljava/lang/String;

    invoke-virtual {v5, v2, v7}, LR2/p;->D(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v5, 0x2

    goto :goto_6

    :cond_d
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v5, v12

    :goto_7
    if-ge v5, v3, :cond_e

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v5, v5, 0x1

    check-cast v7, LR2/I;

    new-instance v8, LR2/I;

    invoke-direct {v8, v7, v10, v11}, LR2/I;-><init>(LR2/I;J)V

    invoke-virtual {v1, v8, v0}, LR2/D5;->Y(LR2/I;LR2/W5;)V

    goto :goto_7

    :cond_e
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v3

    iget-object v5, v13, LR2/I;->o:Ljava/lang/String;

    invoke-static {v2}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v5}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v3}, LR2/m3;->n()V

    invoke-virtual {v3}, LR2/C5;->u()V

    if-gez v4, :cond_f

    invoke-virtual {v3}, LR2/m3;->j()LR2/Y1;

    move-result-object v4

    invoke-virtual {v4}, LR2/Y1;->L()LR2/a2;

    move-result-object v4

    const-string v6, "Invalid time querying triggered conditional properties"

    invoke-static {v2}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3}, LR2/m3;->h()LR2/X1;

    move-result-object v3

    invoke-virtual {v3, v5}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4, v6, v2, v3, v5}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    goto :goto_8

    :cond_f
    const-string v4, "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout"

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/String;

    aput-object v2, v6, v12

    const/4 v2, 0x1

    aput-object v5, v6, v2

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x2

    aput-object v2, v6, v5

    invoke-virtual {v3, v4, v6}, LR2/p;->S(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    :goto_8
    new-instance v14, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v14, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_10
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    check-cast v15, LR2/e;

    if-eqz v15, :cond_10

    iget-object v3, v15, LR2/e;->q:LR2/R5;

    new-instance v9, LR2/T5;

    iget-object v4, v15, LR2/e;->o:Ljava/lang/String;

    invoke-static {v4}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, v15, LR2/e;->p:Ljava/lang/String;

    iget-object v6, v3, LR2/R5;->p:Ljava/lang/String;

    invoke-virtual {v3}, LR2/R5;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    move-object v3, v9

    move-wide v7, v10

    move-object v12, v9

    move-object/from16 v9, v16

    invoke-direct/range {v3 .. v9}, LR2/T5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v3

    invoke-virtual {v3, v12}, LR2/p;->d0(LR2/T5;)Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v3

    invoke-virtual {v3}, LR2/Y1;->K()LR2/a2;

    move-result-object v3

    const-string v4, "User property triggered"

    iget-object v5, v15, LR2/e;->o:Ljava/lang/String;

    iget-object v6, v1, LR2/D5;->l:LR2/N2;

    invoke-virtual {v6}, LR2/N2;->D()LR2/X1;

    move-result-object v6

    iget-object v7, v12, LR2/T5;->c:Ljava/lang/String;

    invoke-virtual {v6, v7}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, v12, LR2/T5;->e:Ljava/lang/Object;

    :goto_a
    invoke-virtual {v3, v4, v5, v6, v7}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_b

    :cond_11
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v3

    invoke-virtual {v3}, LR2/Y1;->G()LR2/a2;

    move-result-object v3

    const-string v4, "Too many active user properties, ignoring"

    iget-object v5, v15, LR2/e;->o:Ljava/lang/String;

    invoke-static {v5}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    iget-object v6, v1, LR2/D5;->l:LR2/N2;

    invoke-virtual {v6}, LR2/N2;->D()LR2/X1;

    move-result-object v6

    iget-object v7, v12, LR2/T5;->c:Ljava/lang/String;

    invoke-virtual {v6, v7}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, v12, LR2/T5;->e:Ljava/lang/Object;

    goto :goto_a

    :goto_b
    iget-object v3, v15, LR2/e;->w:LR2/I;

    if-eqz v3, :cond_12

    invoke-interface {v14, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_12
    new-instance v3, LR2/R5;

    invoke-direct {v3, v12}, LR2/R5;-><init>(LR2/T5;)V

    iput-object v3, v15, LR2/e;->q:LR2/R5;

    const/4 v3, 0x1

    iput-boolean v3, v15, LR2/e;->s:Z

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v4

    invoke-virtual {v4, v15}, LR2/p;->b0(LR2/e;)Z

    const/4 v12, 0x0

    goto/16 :goto_9

    :cond_13
    invoke-virtual {v1, v13, v0}, LR2/D5;->Y(LR2/I;LR2/W5;)V

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v12, 0x0

    :goto_c
    if-ge v12, v2, :cond_14

    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v12, v12, 0x1

    check-cast v3, LR2/I;

    new-instance v4, LR2/I;

    invoke-direct {v4, v3, v10, v11}, LR2/I;-><init>(LR2/I;J)V

    invoke-virtual {v1, v4, v0}, LR2/D5;->Y(LR2/I;LR2/W5;)V

    goto :goto_c

    :cond_14
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v0

    invoke-virtual {v0}, LR2/p;->T0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v0

    invoke-virtual {v0}, LR2/p;->R0()V

    return-void

    :goto_d
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v2

    invoke-virtual {v2}, LR2/p;->R0()V

    throw v0
.end method

.method public final q0()V
    .locals 1

    .line 1
    iget v0, p0, LR2/D5;->s:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, LR2/D5;->s:I

    .line 6
    .line 7
    return-void
.end method

.method public final r(LR2/I;Ljava/lang/String;)V
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2, v3}, LR2/p;->D0(Ljava/lang/String;)LR2/I2;

    .line 12
    .line 13
    .line 14
    move-result-object v13

    .line 15
    if-eqz v13, :cond_4

    .line 16
    .line 17
    invoke-virtual {v13}, LR2/I2;->h()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_0
    invoke-virtual {v0, v13}, LR2/D5;->m(LR2/I2;)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    const-string v2, "_ui"

    .line 36
    .line 37
    iget-object v4, v1, LR2/I;->o:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, LR2/Y1;->L()LR2/a2;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const-string v4, "Could not find package. appId"

    .line 54
    .line 55
    invoke-static/range {p2 .. p2}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {v2, v4, v5}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-nez v2, :cond_2

    .line 68
    .line 69
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const-string v2, "App version does not match; dropping event. appId"

    .line 78
    .line 79
    invoke-static/range {p2 .. p2}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v1, v2, v3}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_2
    :goto_0
    invoke-virtual {v0, v3}, LR2/D5;->Q(Ljava/lang/String;)LR2/q3;

    .line 88
    .line 89
    .line 90
    move-result-object v15

    .line 91
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    sget-object v4, LR2/K;->T0:LR2/P1;

    .line 102
    .line 103
    invoke-virtual {v2, v4}, LR2/g;->s(LR2/P1;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_3

    .line 108
    .line 109
    invoke-virtual {v0, v3}, LR2/D5;->a0(Ljava/lang/String;)LR2/z;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v2}, LR2/z;->i()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v15}, LR2/q3;->b()I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    :goto_1
    move-object/from16 v37, v2

    .line 122
    .line 123
    move/from16 v36, v4

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_3
    const-string v2, ""

    .line 127
    .line 128
    const/16 v4, 0x64

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :goto_2
    new-instance v14, LR2/W5;

    .line 132
    .line 133
    move-object v2, v14

    .line 134
    invoke-virtual {v13}, LR2/I2;->j()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-virtual {v13}, LR2/I2;->h()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {v13}, LR2/I2;->z()J

    .line 143
    .line 144
    .line 145
    move-result-wide v6

    .line 146
    invoke-virtual {v13}, LR2/I2;->v0()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    invoke-virtual {v13}, LR2/I2;->g0()J

    .line 151
    .line 152
    .line 153
    move-result-wide v9

    .line 154
    invoke-virtual {v13}, LR2/I2;->a0()J

    .line 155
    .line 156
    .line 157
    move-result-wide v11

    .line 158
    invoke-virtual {v13}, LR2/I2;->r()Z

    .line 159
    .line 160
    .line 161
    move-result v16

    .line 162
    move-object/from16 v41, v14

    .line 163
    .line 164
    move/from16 v14, v16

    .line 165
    .line 166
    invoke-virtual {v13}, LR2/I2;->i()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v16

    .line 170
    invoke-virtual {v13}, LR2/I2;->v()J

    .line 171
    .line 172
    .line 173
    move-result-wide v17

    .line 174
    invoke-virtual {v13}, LR2/I2;->q()Z

    .line 175
    .line 176
    .line 177
    move-result v22

    .line 178
    invoke-virtual {v13}, LR2/I2;->r0()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v24

    .line 182
    invoke-virtual {v13}, LR2/I2;->q0()Ljava/lang/Boolean;

    .line 183
    .line 184
    .line 185
    move-result-object v25

    .line 186
    invoke-virtual {v13}, LR2/I2;->c0()J

    .line 187
    .line 188
    .line 189
    move-result-wide v26

    .line 190
    invoke-virtual {v13}, LR2/I2;->n()Ljava/util/List;

    .line 191
    .line 192
    .line 193
    move-result-object v28

    .line 194
    invoke-virtual {v15}, LR2/q3;->v()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v30

    .line 198
    invoke-virtual {v13}, LR2/I2;->t()Z

    .line 199
    .line 200
    .line 201
    move-result v33

    .line 202
    invoke-virtual {v13}, LR2/I2;->p0()J

    .line 203
    .line 204
    .line 205
    move-result-wide v34

    .line 206
    invoke-virtual {v13}, LR2/I2;->a()I

    .line 207
    .line 208
    .line 209
    move-result v38

    .line 210
    invoke-virtual {v13}, LR2/I2;->D()J

    .line 211
    .line 212
    .line 213
    move-result-wide v39

    .line 214
    const/4 v13, 0x0

    .line 215
    const/4 v15, 0x0

    .line 216
    const-wide/16 v19, 0x0

    .line 217
    .line 218
    const/16 v21, 0x0

    .line 219
    .line 220
    const/16 v23, 0x0

    .line 221
    .line 222
    const/16 v29, 0x0

    .line 223
    .line 224
    const-string v31, ""

    .line 225
    .line 226
    const/16 v32, 0x0

    .line 227
    .line 228
    move-object/from16 v3, p2

    .line 229
    .line 230
    invoke-direct/range {v2 .. v40}, LR2/W5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJ)V

    .line 231
    .line 232
    .line 233
    move-object/from16 v2, v41

    .line 234
    .line 235
    invoke-virtual {v0, v1, v2}, LR2/D5;->U(LR2/I;LR2/W5;)V

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :cond_4
    :goto_3
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-virtual {v1}, LR2/Y1;->F()LR2/a2;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    const-string v2, "No app data available; dropping event"

    .line 248
    .line 249
    invoke-virtual {v1, v2, v3}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    return-void
.end method

.method public final r0()V
    .locals 1

    .line 1
    iget v0, p0, LR2/D5;->r:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, LR2/D5;->r:I

    .line 6
    .line 7
    return-void
.end method

.method public final s(LR2/I2;Lcom/google/android/gms/internal/measurement/d2$a;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LR2/D5;->p0()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_d

    .line 16
    .line 17
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/d2$a;->U0()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, LR2/l;->b(Ljava/lang/String;)LR2/l;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1}, LR2/I2;->t0()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, LR2/m3;->n()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, LR2/D5;->p0()V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0, v1}, LR2/D5;->Q(Ljava/lang/String;)LR2/q3;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_0

    .line 54
    .line 55
    invoke-virtual {p0}, LR2/D5;->c0()LR2/g;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    sget-object v3, LR2/K;->V0:LR2/P1;

    .line 60
    .line 61
    invoke-virtual {v2, v3}, LR2/g;->s(LR2/P1;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_0

    .line 66
    .line 67
    invoke-virtual {v1}, LR2/q3;->w()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/d2$a;->o0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    .line 72
    .line 73
    .line 74
    :cond_0
    invoke-virtual {v1}, LR2/q3;->s()Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    if-eqz v2, :cond_1

    .line 79
    .line 80
    sget-object v2, LR2/q3$a;->p:LR2/q3$a;

    .line 81
    .line 82
    invoke-virtual {v1}, LR2/q3;->b()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    invoke-virtual {v0, v2, v3}, LR2/l;->c(LR2/q3$a;I)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    sget-object v2, LR2/q3$a;->p:LR2/q3$a;

    .line 91
    .line 92
    sget-object v3, LR2/k;->w:LR2/k;

    .line 93
    .line 94
    invoke-virtual {v0, v2, v3}, LR2/l;->d(LR2/q3$a;LR2/k;)V

    .line 95
    .line 96
    .line 97
    :goto_0
    invoke-virtual {v1}, LR2/q3;->u()Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    if-eqz v2, :cond_2

    .line 102
    .line 103
    sget-object v2, LR2/q3$a;->q:LR2/q3$a;

    .line 104
    .line 105
    invoke-virtual {v1}, LR2/q3;->b()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    invoke-virtual {v0, v2, v1}, LR2/l;->c(LR2/q3$a;I)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    sget-object v1, LR2/q3$a;->q:LR2/q3$a;

    .line 114
    .line 115
    sget-object v2, LR2/k;->w:LR2/k;

    .line 116
    .line 117
    invoke-virtual {v0, v1, v2}, LR2/l;->d(LR2/q3$a;LR2/k;)V

    .line 118
    .line 119
    .line 120
    :cond_3
    :goto_1
    invoke-virtual {p1}, LR2/I2;->t0()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v2}, LR2/m3;->n()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, LR2/D5;->p0()V

    .line 132
    .line 133
    .line 134
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-eqz v2, :cond_4

    .line 139
    .line 140
    invoke-virtual {p0, v1}, LR2/D5;->a0(Ljava/lang/String;)LR2/z;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-virtual {p0, v1}, LR2/D5;->Q(Ljava/lang/String;)LR2/q3;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-virtual {p0, v1, v2, v3, v0}, LR2/D5;->f(Ljava/lang/String;LR2/z;LR2/q3;LR2/l;)LR2/z;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1}, LR2/z;->g()Ljava/lang/Boolean;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-static {v2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    check-cast v2, Ljava/lang/Boolean;

    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/d2$a;->P(Z)Lcom/google/android/gms/internal/measurement/d2$a;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1}, LR2/z;->h()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-nez v2, :cond_4

    .line 178
    .line 179
    invoke-virtual {v1}, LR2/z;->h()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/measurement/d2$a;->s0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    .line 184
    .line 185
    .line 186
    :cond_4
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {v1}, LR2/m3;->n()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, LR2/D5;->p0()V

    .line 194
    .line 195
    .line 196
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    if-eqz v1, :cond_c

    .line 201
    .line 202
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/d2$a;->Z0()Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    const-string v3, "_npa"

    .line 215
    .line 216
    if-eqz v2, :cond_6

    .line 217
    .line 218
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    check-cast v2, Lcom/google/android/gms/internal/measurement/h2;

    .line 223
    .line 224
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/h2;->Z()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-eqz v4, :cond_5

    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_6
    const/4 v2, 0x0

    .line 236
    :goto_2
    if-eqz v2, :cond_a

    .line 237
    .line 238
    sget-object v1, LR2/q3$a;->s:LR2/q3$a;

    .line 239
    .line 240
    invoke-virtual {v0, v1}, LR2/l;->a(LR2/q3$a;)LR2/k;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    sget-object v4, LR2/k;->p:LR2/k;

    .line 245
    .line 246
    if-ne v3, v4, :cond_c

    .line 247
    .line 248
    invoke-virtual {p1}, LR2/I2;->q0()Ljava/lang/Boolean;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    if-eqz p1, :cond_9

    .line 253
    .line 254
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 255
    .line 256
    if-ne p1, v3, :cond_7

    .line 257
    .line 258
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/h2;->U()J

    .line 259
    .line 260
    .line 261
    move-result-wide v3

    .line 262
    const-wide/16 v5, 0x1

    .line 263
    .line 264
    cmp-long v3, v3, v5

    .line 265
    .line 266
    if-nez v3, :cond_9

    .line 267
    .line 268
    :cond_7
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 269
    .line 270
    if-ne p1, v3, :cond_8

    .line 271
    .line 272
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/h2;->U()J

    .line 273
    .line 274
    .line 275
    move-result-wide v2

    .line 276
    const-wide/16 v4, 0x0

    .line 277
    .line 278
    cmp-long p1, v2, v4

    .line 279
    .line 280
    if-eqz p1, :cond_8

    .line 281
    .line 282
    goto :goto_4

    .line 283
    :cond_8
    sget-object p1, LR2/k;->s:LR2/k;

    .line 284
    .line 285
    :goto_3
    invoke-virtual {v0, v1, p1}, LR2/l;->d(LR2/q3$a;LR2/k;)V

    .line 286
    .line 287
    .line 288
    goto :goto_6

    .line 289
    :cond_9
    :goto_4
    sget-object p1, LR2/k;->u:LR2/k;

    .line 290
    .line 291
    goto :goto_3

    .line 292
    :cond_a
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 293
    .line 294
    .line 295
    move-result v1

    .line 296
    if-eqz v1, :cond_c

    .line 297
    .line 298
    invoke-virtual {p0}, LR2/D5;->c0()LR2/g;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    sget-object v2, LR2/K;->W0:LR2/P1;

    .line 303
    .line 304
    invoke-virtual {v1, v2}, LR2/g;->s(LR2/P1;)Z

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    if-eqz v1, :cond_c

    .line 309
    .line 310
    iget-object v1, p0, LR2/D5;->a:LR2/x2;

    .line 311
    .line 312
    invoke-virtual {p1}, LR2/I2;->t0()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    invoke-virtual {v1, v2}, LR2/x2;->J(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/I1;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    const/4 v2, 0x1

    .line 321
    if-nez v1, :cond_b

    .line 322
    .line 323
    sget-object p1, LR2/q3$a;->s:LR2/q3$a;

    .line 324
    .line 325
    sget-object v1, LR2/k;->w:LR2/k;

    .line 326
    .line 327
    invoke-virtual {v0, p1, v1}, LR2/l;->d(LR2/q3$a;LR2/k;)V

    .line 328
    .line 329
    .line 330
    goto :goto_5

    .line 331
    :cond_b
    iget-object v1, p0, LR2/D5;->a:LR2/x2;

    .line 332
    .line 333
    invoke-virtual {p1}, LR2/I2;->t0()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    sget-object v4, LR2/q3$a;->s:LR2/q3$a;

    .line 338
    .line 339
    invoke-virtual {v1, p1, v4}, LR2/x2;->K(Ljava/lang/String;LR2/q3$a;)Z

    .line 340
    .line 341
    .line 342
    move-result p1

    .line 343
    xor-int/2addr v2, p1

    .line 344
    sget-object p1, LR2/k;->q:LR2/k;

    .line 345
    .line 346
    invoke-virtual {v0, v4, p1}, LR2/l;->d(LR2/q3$a;LR2/k;)V

    .line 347
    .line 348
    .line 349
    :goto_5
    invoke-static {}, Lcom/google/android/gms/internal/measurement/h2;->X()Lcom/google/android/gms/internal/measurement/h2$a;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/measurement/h2$a;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/h2$a;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    invoke-virtual {p0}, LR2/D5;->b()LE2/e;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    invoke-interface {v1}, LE2/e;->a()J

    .line 362
    .line 363
    .line 364
    move-result-wide v3

    .line 365
    invoke-virtual {p1, v3, v4}, Lcom/google/android/gms/internal/measurement/h2$a;->B(J)Lcom/google/android/gms/internal/measurement/h2$a;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    int-to-long v1, v2

    .line 370
    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/measurement/h2$a;->y(J)Lcom/google/android/gms/internal/measurement/h2$a;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    check-cast p1, Lcom/google/android/gms/internal/measurement/Y3;

    .line 379
    .line 380
    check-cast p1, Lcom/google/android/gms/internal/measurement/h2;

    .line 381
    .line 382
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/d2$a;->G(Lcom/google/android/gms/internal/measurement/h2;)Lcom/google/android/gms/internal/measurement/d2$a;

    .line 383
    .line 384
    .line 385
    :cond_c
    :goto_6
    invoke-virtual {v0}, LR2/l;->toString()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/d2$a;->k0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    .line 390
    .line 391
    .line 392
    :cond_d
    return-void
.end method

.method public final s0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, LR2/p;->S0()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, LR2/D5;->i:LR2/g5;

    .line 16
    .line 17
    iget-object v0, v0, LR2/g5;->g:LR2/q2;

    .line 18
    .line 19
    invoke-virtual {v0}, LR2/q2;->a()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, LR2/D5;->i:LR2/g5;

    .line 30
    .line 31
    iget-object v0, v0, LR2/g5;->g:LR2/q2;

    .line 32
    .line 33
    invoke-virtual {p0}, LR2/D5;->b()LE2/e;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, LE2/e;->a()J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    invoke-virtual {v0, v1, v2}, LR2/q2;->b(J)V

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-direct {p0}, LR2/D5;->N()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final t0()V
    .locals 21

    .line 1
    move-object/from16 v7, p0

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e()LR2/G2;

    move-result-object v0

    invoke-virtual {v0}, LR2/m3;->n()V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->p0()V

    const/4 v0, 0x1

    iput-boolean v0, v7, LR2/D5;->v:Z

    const/4 v8, 0x0

    :try_start_0
    iget-object v1, v7, LR2/D5;->l:LR2/N2;

    invoke-virtual {v1}, LR2/N2;->J()LR2/D4;

    move-result-object v1

    invoke-virtual {v1}, LR2/D4;->W()Ljava/lang/Boolean;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v1, :cond_0

    :try_start_1
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->L()LR2/a2;

    move-result-object v0

    const-string v1, "Upload data called on the client side before use of service was decided"

    :goto_0
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    iput-boolean v8, v7, LR2/D5;->v:Z

    :goto_2
    invoke-direct/range {p0 .. p0}, LR2/D5;->M()V

    return-void

    :catchall_0
    move-exception v0

    move v1, v8

    goto/16 :goto_14

    :cond_0
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v1, :cond_1

    :try_start_3
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    move-result-object v0

    const-string v1, "Upload called in the client side when service should be used"
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :cond_1
    :try_start_4
    iget-wide v1, v7, LR2/D5;->o:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_2

    :goto_3
    :try_start_5
    invoke-direct/range {p0 .. p0}, LR2/D5;->N()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_1

    :cond_2
    :try_start_6
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e()LR2/G2;

    move-result-object v1

    invoke-virtual {v1}, LR2/m3;->n()V

    iget-object v1, v7, LR2/D5;->y:Ljava/util/List;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eqz v1, :cond_3

    :try_start_7
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    move-result-object v0

    const-string v1, "Uploading requested multiple times"
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_0

    :cond_3
    :try_start_8
    invoke-virtual/range {p0 .. p0}, LR2/D5;->g0()LR2/f2;

    move-result-object v1

    invoke-virtual {v1}, LR2/f2;->A()Z

    move-result v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    if-nez v1, :cond_4

    :try_start_9
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    move-result-object v0

    const-string v1, "Network not connected, ignoring upload request"

    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_3

    :cond_4
    :try_start_a
    invoke-virtual/range {p0 .. p0}, LR2/D5;->b()LE2/e;

    move-result-object v1

    invoke-interface {v1}, LE2/e;->a()J

    move-result-wide v1

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v5

    sget-object v6, LR2/K;->U:LR2/P1;

    const/4 v9, 0x0

    invoke-virtual {v5, v9, v6}, LR2/g;->u(Ljava/lang/String;LR2/P1;)I

    move-result v5

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    invoke-static {}, LR2/g;->G()J

    move-result-wide v10
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    sub-long v10, v1, v10

    move v6, v8

    :goto_4
    if-ge v6, v5, :cond_5

    :try_start_b
    invoke-virtual {v7, v9, v10, v11}, LR2/D5;->L(Ljava/lang/String;J)Z

    move-result v12
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    if-eqz v12, :cond_5

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_5
    :try_start_c
    invoke-static {}, Lcom/google/android/gms/internal/measurement/g7;->a()Z

    move-result v5
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    if-eqz v5, :cond_8

    :try_start_d
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e()LR2/G2;

    move-result-object v5

    invoke-virtual {v5}, LR2/m3;->n()V

    iget-object v5, v7, LR2/D5;->q:Ljava/util/Set;

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/g7;->a()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v10

    sget-object v11, LR2/K;->L0:LR2/P1;

    invoke-virtual {v10, v6, v11}, LR2/g;->B(Ljava/lang/String;LR2/P1;)Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v10

    invoke-virtual {v10}, LR2/Y1;->F()LR2/a2;

    move-result-object v10

    const-string v11, "Notifying app that trigger URIs are available. App ID"

    invoke-virtual {v10, v11, v6}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v10, Landroid/content/Intent;

    invoke-direct {v10}, Landroid/content/Intent;-><init>()V

    const-string v11, "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"

    invoke-virtual {v10, v11}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v10, v6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v6, v7, LR2/D5;->l:LR2/N2;

    invoke-virtual {v6}, LR2/N2;->a()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6, v10}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_5

    :cond_7
    iget-object v5, v7, LR2/D5;->q:Ljava/util/Set;

    invoke-interface {v5}, Ljava/util/Set;->clear()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    :cond_8
    :try_start_e
    iget-object v5, v7, LR2/D5;->i:LR2/g5;

    iget-object v5, v5, LR2/g5;->g:LR2/q2;

    invoke-virtual {v5}, LR2/q2;->a()J

    move-result-wide v5
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    cmp-long v3, v5, v3

    if-eqz v3, :cond_9

    :try_start_f
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v3

    invoke-virtual {v3}, LR2/Y1;->F()LR2/a2;

    move-result-object v3

    const-string v4, "Uploading events. Elapsed time since last upload attempt (ms)"

    sub-long v5, v1, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    :cond_9
    :try_start_10
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v3

    invoke-virtual {v3}, LR2/p;->C()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    const-wide/16 v4, -0x1

    if-nez v3, :cond_24

    iget-wide v10, v7, LR2/D5;->A:J
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    cmp-long v3, v10, v4

    if-nez v3, :cond_a

    :try_start_11
    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v3

    invoke-virtual {v3}, LR2/p;->y()J

    move-result-wide v3

    iput-wide v3, v7, LR2/D5;->A:J
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    :cond_a
    :try_start_12
    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v3

    sget-object v4, LR2/K;->i:LR2/P1;

    invoke-virtual {v3, v6, v4}, LR2/g;->u(Ljava/lang/String;LR2/P1;)I

    move-result v3

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v4

    sget-object v5, LR2/K;->j:LR2/P1;

    invoke-virtual {v4, v6, v5}, LR2/g;->u(Ljava/lang/String;LR2/P1;)I

    move-result v4

    invoke-static {v8, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v5

    invoke-virtual {v5, v6, v3, v4}, LR2/p;->Q(Ljava/lang/String;II)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_23

    invoke-virtual {v7, v6}, LR2/D5;->Q(Ljava/lang/String;)LR2/q3;

    move-result-object v4

    invoke-virtual {v4}, LR2/q3;->x()Z

    move-result v4
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    if-eqz v4, :cond_e

    :try_start_13
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/util/Pair;

    iget-object v5, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d2;->o0()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_b

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d2;->o0()Ljava/lang/String;

    move-result-object v4

    goto :goto_6

    :cond_c
    move-object v4, v9

    :goto_6
    if-eqz v4, :cond_e

    move v5, v8

    :goto_7
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v10

    if-ge v5, v10, :cond_e

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/util/Pair;

    iget-object v10, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d2;->o0()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_d

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d2;->o0()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_d

    invoke-interface {v3, v8, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v3
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    goto :goto_8

    :cond_d
    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    :cond_e
    :goto_8
    :try_start_14
    invoke-static {}, Lcom/google/android/gms/internal/measurement/c2;->J()Lcom/google/android/gms/internal/measurement/c2$a;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    new-instance v10, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v11

    invoke-virtual {v11, v6}, LR2/g;->K(Ljava/lang/String;)Z

    move-result v11
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_1

    if-eqz v11, :cond_f

    :try_start_15
    invoke-virtual {v7, v6}, LR2/D5;->Q(Ljava/lang/String;)LR2/q3;

    move-result-object v11

    invoke-virtual {v11}, LR2/q3;->x()Z

    move-result v11
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    if-eqz v11, :cond_f

    move v11, v0

    goto :goto_9

    :cond_f
    move v11, v8

    :goto_9
    :try_start_16
    invoke-virtual {v7, v6}, LR2/D5;->Q(Ljava/lang/String;)LR2/q3;

    move-result-object v12

    invoke-virtual {v12}, LR2/q3;->x()Z

    move-result v12

    invoke-virtual {v7, v6}, LR2/D5;->Q(Ljava/lang/String;)LR2/q3;

    move-result-object v13

    invoke-virtual {v13}, LR2/q3;->y()Z

    move-result v13

    invoke-static {}, Lcom/google/android/gms/internal/measurement/s7;->a()Z

    move-result v14
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_1

    if-eqz v14, :cond_10

    :try_start_17
    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v14

    sget-object v15, LR2/K;->y0:LR2/P1;

    invoke-virtual {v14, v6, v15}, LR2/g;->B(Ljava/lang/String;LR2/P1;)Z

    move-result v14
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    if-eqz v14, :cond_10

    move v14, v0

    goto :goto_a

    :cond_10
    move v14, v8

    :goto_a
    move v15, v8

    :goto_b
    if-ge v15, v5, :cond_1f

    :try_start_18
    invoke-interface {v3, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v9, v16

    check-cast v9, Landroid/util/Pair;

    iget-object v9, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y3;->x()Lcom/google/android/gms/internal/measurement/Y3$b;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/d2$a;

    invoke-interface {v3, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v0, v16

    check-cast v0, Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-object v0, v3

    move-object/from16 v16, v4

    const-wide/32 v3, 0x14051

    invoke-virtual {v9, v3, v4}, Lcom/google/android/gms/internal/measurement/d2$a;->F0(J)Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Lcom/google/android/gms/internal/measurement/d2$a;->C0(J)Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v3

    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/measurement/d2$a;->b0(Z)Lcom/google/android/gms/internal/measurement/d2$a;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_1

    if-nez v11, :cond_11

    :try_start_19
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/d2$a;->p0()Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_11
    if-nez v12, :cond_12

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/d2$a;->L0()Lcom/google/android/gms/internal/measurement/d2$a;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/d2$a;->B0()Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_12
    if-nez v13, :cond_13

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/d2$a;->c0()Lcom/google/android/gms/internal/measurement/d2$a;
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_0

    :cond_13
    :try_start_1a
    invoke-virtual {v7, v6, v9}, LR2/D5;->E(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/d2$a;)V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_1

    if-nez v14, :cond_14

    :try_start_1b
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/d2$a;->N0()Lcom/google/android/gms/internal/measurement/d2$a;
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_0

    :cond_14
    :try_start_1c
    invoke-static {}, Lcom/google/android/gms/internal/measurement/i6;->a()Z

    move-result v3

    if-eqz v3, :cond_1d

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v3

    sget-object v4, LR2/K;->Y0:LR2/P1;

    invoke-virtual {v3, v4}, LR2/g;->s(LR2/P1;)Z

    move-result v3

    if-eqz v3, :cond_1d

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/d2$a;->X0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_1

    if-nez v4, :cond_16

    :try_start_1d
    const-string v4, "00000000-0000-0000-0000-000000000000"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_0

    if-eqz v3, :cond_15

    goto :goto_c

    :cond_15
    move-object/from16 v20, v0

    goto :goto_e

    :cond_16
    :goto_c
    :try_start_1e
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/d2$a;->Y0()Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move/from16 v17, v8

    move/from16 v18, v17

    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_19

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Lcom/google/android/gms/internal/measurement/Y1;

    const-string v8, "_fx"

    move-object/from16 v20, v0

    invoke-virtual/range {v19 .. v19}, Lcom/google/android/gms/internal/measurement/Y1;->b0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    move-object/from16 v0, v20

    const/4 v8, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x1

    goto :goto_d

    :catchall_1
    move-exception v0

    const/4 v1, 0x0

    goto/16 :goto_14

    :cond_17
    const-string v0, "_f"

    invoke-virtual/range {v19 .. v19}, Lcom/google/android/gms/internal/measurement/Y1;->b0()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    const/16 v18, 0x1

    :cond_18
    move-object/from16 v0, v20

    const/4 v8, 0x0

    goto :goto_d

    :cond_19
    move-object/from16 v20, v0

    if-eqz v17, :cond_1a

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/d2$a;->t0()Lcom/google/android/gms/internal/measurement/d2$a;

    invoke-virtual {v9, v3}, Lcom/google/android/gms/internal/measurement/d2$a;->N(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_1a
    if-eqz v18, :cond_1b

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/d2$a;->S0()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x1

    invoke-virtual {v7, v0, v3}, LR2/D5;->F(Ljava/lang/String;Z)V

    :cond_1b
    :goto_e
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/d2$a;->w()I

    move-result v0

    if-eqz v0, :cond_1c

    goto :goto_f

    :cond_1c
    move-object/from16 v0, v16

    goto :goto_10

    :cond_1d
    move-object/from16 v20, v0

    :goto_f
    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v0

    sget-object v3, LR2/K;->g0:LR2/P1;

    invoke-virtual {v0, v6, v3}, LR2/g;->B(Ljava/lang/String;LR2/P1;)Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/d2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/j3;->h()[B

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    move-result-object v3

    invoke-virtual {v3, v0}, LR2/N5;->A([B)J

    move-result-wide v3

    invoke-virtual {v9, v3, v4}, Lcom/google/android/gms/internal/measurement/d2$a;->B(J)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_1e
    move-object/from16 v0, v16

    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/measurement/c2$a;->x(Lcom/google/android/gms/internal/measurement/d2$a;)Lcom/google/android/gms/internal/measurement/c2$a;

    :goto_10
    add-int/lit8 v15, v15, 0x1

    move-object v4, v0

    move-object/from16 v3, v20

    const/4 v0, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    goto/16 :goto_b

    :cond_1f
    move-object v0, v4

    invoke-static {}, Lcom/google/android/gms/internal/measurement/i6;->a()Z

    move-result v3

    if-eqz v3, :cond_20

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    move-result-object v3

    sget-object v4, LR2/K;->Y0:LR2/P1;

    invoke-virtual {v3, v4}, LR2/g;->s(LR2/P1;)Z

    move-result v3

    if-eqz v3, :cond_20

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/c2$a;->w()I

    move-result v3

    if-nez v3, :cond_20

    invoke-direct {v7, v10}, LR2/D5;->G(Ljava/util/List;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/16 v3, 0xcc

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v6}, LR2/D5;->I(ZILjava/lang/Throwable;[BLjava/lang/String;)V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_1

    const/4 v1, 0x0

    :goto_11
    iput-boolean v1, v7, LR2/D5;->v:Z

    goto/16 :goto_2

    :cond_20
    :try_start_1f
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v3

    const/4 v4, 0x2

    invoke-virtual {v3, v4}, LR2/Y1;->C(I)Z

    move-result v3

    if-eqz v3, :cond_21

    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v4, Lcom/google/android/gms/internal/measurement/c2;

    invoke-virtual {v3, v4}, LR2/N5;->K(Lcom/google/android/gms/internal/measurement/c2;)Ljava/lang/String;

    move-result-object v9

    goto :goto_12

    :cond_21
    const/4 v9, 0x0

    :goto_12
    invoke-virtual/range {p0 .. p0}, LR2/D5;->m0()LR2/N5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v3, Lcom/google/android/gms/internal/measurement/c2;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/j3;->h()[B

    move-result-object v14

    iget-object v3, v7, LR2/D5;->j:LR2/B5;

    invoke-virtual {v3, v6}, LR2/B5;->u(Ljava/lang/String;)LR2/E5;

    move-result-object v3
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_1

    :try_start_20
    invoke-direct {v7, v10}, LR2/D5;->G(Ljava/util/List;)V

    iget-object v4, v7, LR2/D5;->i:LR2/g5;

    iget-object v4, v4, LR2/g5;->h:LR2/q2;

    invoke-virtual {v4, v1, v2}, LR2/q2;->b(J)V

    const-string v1, "?"

    if-lez v5, :cond_22

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/c2$a;->y(I)Lcom/google/android/gms/internal/measurement/d2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    move-result-object v1

    :cond_22
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    move-result-object v0

    const-string v2, "Uploading data. app, uncompressed size, data"

    array-length v4, v14

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v2, v1, v4, v9}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, v7, LR2/D5;->u:Z

    invoke-virtual/range {p0 .. p0}, LR2/D5;->g0()LR2/f2;

    move-result-object v11

    new-instance v13, Ljava/net/URL;

    invoke-virtual {v3}, LR2/E5;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v13, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, LR2/E5;->b()Ljava/util/Map;

    move-result-object v15

    new-instance v0, LR2/F5;

    invoke-direct {v0, v7, v6}, LR2/F5;-><init>(LR2/D5;Ljava/lang/String;)V

    invoke-virtual {v11}, LR2/m3;->n()V

    invoke-virtual {v11}, LR2/C5;->u()V

    invoke-static {v13}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v14}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v11}, LR2/m3;->e()LR2/G2;

    move-result-object v1

    new-instance v2, LR2/k2;

    move-object v10, v2

    move-object v12, v6

    move-object/from16 v16, v0

    invoke-direct/range {v10 .. v16}, LR2/k2;-><init>(LR2/f2;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;LR2/e2;)V

    invoke-virtual {v1, v2}, LR2/G2;->z(Ljava/lang/Runnable;)V
    :try_end_20
    .catch Ljava/net/MalformedURLException; {:try_start_20 .. :try_end_20} :catch_0
    .catchall {:try_start_20 .. :try_end_20} :catchall_1

    :cond_23
    :goto_13
    const/4 v1, 0x0

    goto/16 :goto_11

    :catch_0
    :try_start_21
    invoke-virtual/range {p0 .. p0}, LR2/D5;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    move-result-object v0

    const-string v1, "Failed to parse upload URL. Not uploading. appId"

    invoke-static {v6}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3}, LR2/E5;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_13

    :cond_24
    iput-wide v4, v7, LR2/D5;->A:J

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, LR2/D5;->c0()LR2/g;

    invoke-static {}, LR2/g;->G()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, LR2/p;->O(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_23

    invoke-virtual/range {p0 .. p0}, LR2/D5;->e0()LR2/p;

    move-result-object v1

    invoke-virtual {v1, v0}, LR2/p;->D0(Ljava/lang/String;)LR2/I2;

    move-result-object v0

    if-eqz v0, :cond_23

    invoke-virtual {v7, v0}, LR2/D5;->V(LR2/I2;)V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_1

    goto :goto_13

    :goto_14
    iput-boolean v1, v7, LR2/D5;->v:Z

    invoke-direct/range {p0 .. p0}, LR2/D5;->M()V

    throw v0
.end method

.method public final u(LR2/R5;LR2/W5;)V
    .locals 13

    .line 1
    const-string v0, "_id"

    .line 2
    .line 3
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, LR2/m3;->n()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LR2/D5;->p0()V

    .line 11
    .line 12
    .line 13
    invoke-static {p2}, LR2/D5;->d0(LR2/W5;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-boolean v1, p2, LR2/W5;->v:Z

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, p2}, LR2/D5;->g(LR2/W5;)LR2/I2;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-virtual {p0}, LR2/D5;->n0()LR2/S5;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v2, p1, LR2/R5;->p:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v1, v2}, LR2/S5;->q0(Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    const/4 v1, 0x0

    .line 39
    const/4 v2, 0x1

    .line 40
    const/16 v3, 0x18

    .line 41
    .line 42
    if-eqz v5, :cond_3

    .line 43
    .line 44
    invoke-virtual {p0}, LR2/D5;->n0()LR2/S5;

    .line 45
    .line 46
    .line 47
    iget-object v0, p1, LR2/R5;->p:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p0}, LR2/D5;->c0()LR2/g;

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v3, v2}, LR2/S5;->I(Ljava/lang/String;IZ)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    iget-object p1, p1, LR2/R5;->p:Ljava/lang/String;

    .line 57
    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    move v8, p1

    .line 65
    goto :goto_0

    .line 66
    :cond_2
    move v8, v1

    .line 67
    :goto_0
    invoke-virtual {p0}, LR2/D5;->n0()LR2/S5;

    .line 68
    .line 69
    .line 70
    iget-object v3, p0, LR2/D5;->G:LR2/U5;

    .line 71
    .line 72
    iget-object v4, p2, LR2/W5;->o:Ljava/lang/String;

    .line 73
    .line 74
    const-string v6, "_ev"

    .line 75
    .line 76
    invoke-static/range {v3 .. v8}, LR2/S5;->N(LR2/U5;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_3
    invoke-virtual {p0}, LR2/D5;->n0()LR2/S5;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    iget-object v5, p1, LR2/R5;->p:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {p1}, LR2/R5;->a()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-virtual {v4, v5, v6}, LR2/S5;->w(Ljava/lang/String;Ljava/lang/Object;)I

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-eqz v9, :cond_6

    .line 95
    .line 96
    invoke-virtual {p0}, LR2/D5;->n0()LR2/S5;

    .line 97
    .line 98
    .line 99
    iget-object v0, p1, LR2/R5;->p:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {p0}, LR2/D5;->c0()LR2/g;

    .line 102
    .line 103
    .line 104
    invoke-static {v0, v3, v2}, LR2/S5;->I(Ljava/lang/String;IZ)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    invoke-virtual {p1}, LR2/R5;->a()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-eqz p1, :cond_5

    .line 113
    .line 114
    instance-of v0, p1, Ljava/lang/String;

    .line 115
    .line 116
    if-nez v0, :cond_4

    .line 117
    .line 118
    instance-of v0, p1, Ljava/lang/CharSequence;

    .line 119
    .line 120
    if-eqz v0, :cond_5

    .line 121
    .line 122
    :cond_4
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    :cond_5
    move v12, v1

    .line 131
    invoke-virtual {p0}, LR2/D5;->n0()LR2/S5;

    .line 132
    .line 133
    .line 134
    iget-object v7, p0, LR2/D5;->G:LR2/U5;

    .line 135
    .line 136
    iget-object v8, p2, LR2/W5;->o:Ljava/lang/String;

    .line 137
    .line 138
    const-string v10, "_ev"

    .line 139
    .line 140
    invoke-static/range {v7 .. v12}, LR2/S5;->N(LR2/U5;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_6
    invoke-virtual {p0}, LR2/D5;->n0()LR2/S5;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    iget-object v2, p1, LR2/R5;->p:Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {p1}, LR2/R5;->a()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-virtual {v1, v2, v3}, LR2/S5;->A0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    if-nez v1, :cond_7

    .line 159
    .line 160
    return-void

    .line 161
    :cond_7
    iget-object v2, p1, LR2/R5;->p:Ljava/lang/String;

    .line 162
    .line 163
    const-string v3, "_sid"

    .line 164
    .line 165
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-eqz v2, :cond_b

    .line 170
    .line 171
    iget-wide v6, p1, LR2/R5;->q:J

    .line 172
    .line 173
    iget-object v9, p1, LR2/R5;->u:Ljava/lang/String;

    .line 174
    .line 175
    iget-object v2, p2, LR2/W5;->o:Ljava/lang/String;

    .line 176
    .line 177
    invoke-static {v2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    check-cast v2, Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    const-string v5, "_sno"

    .line 188
    .line 189
    invoke-virtual {v4, v2, v5}, LR2/p;->F0(Ljava/lang/String;Ljava/lang/String;)LR2/T5;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    if-eqz v4, :cond_8

    .line 194
    .line 195
    iget-object v5, v4, LR2/T5;->e:Ljava/lang/Object;

    .line 196
    .line 197
    instance-of v8, v5, Ljava/lang/Long;

    .line 198
    .line 199
    if-eqz v8, :cond_8

    .line 200
    .line 201
    check-cast v5, Ljava/lang/Long;

    .line 202
    .line 203
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 204
    .line 205
    .line 206
    move-result-wide v4

    .line 207
    goto :goto_1

    .line 208
    :cond_8
    if-eqz v4, :cond_9

    .line 209
    .line 210
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    invoke-virtual {v5}, LR2/Y1;->L()LR2/a2;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    const-string v8, "Retrieved last session number from database does not contain a valid (long) value"

    .line 219
    .line 220
    iget-object v4, v4, LR2/T5;->e:Ljava/lang/Object;

    .line 221
    .line 222
    invoke-virtual {v5, v8, v4}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    :cond_9
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    const-string v5, "_s"

    .line 230
    .line 231
    invoke-virtual {v4, v2, v5}, LR2/p;->C0(Ljava/lang/String;Ljava/lang/String;)LR2/E;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    if-eqz v2, :cond_a

    .line 236
    .line 237
    iget-wide v4, v2, LR2/E;->c:J

    .line 238
    .line 239
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-virtual {v2}, LR2/Y1;->K()LR2/a2;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 248
    .line 249
    .line 250
    move-result-object v8

    .line 251
    const-string v10, "Backfill the session number. Last used session number"

    .line 252
    .line 253
    invoke-virtual {v2, v10, v8}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    goto :goto_1

    .line 257
    :cond_a
    const-wide/16 v4, 0x0

    .line 258
    .line 259
    :goto_1
    const-wide/16 v10, 0x1

    .line 260
    .line 261
    add-long/2addr v4, v10

    .line 262
    new-instance v2, LR2/R5;

    .line 263
    .line 264
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 265
    .line 266
    .line 267
    move-result-object v8

    .line 268
    const-string v5, "_sno"

    .line 269
    .line 270
    move-object v4, v2

    .line 271
    invoke-direct/range {v4 .. v9}, LR2/R5;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p0, v2, p2}, LR2/D5;->u(LR2/R5;LR2/W5;)V

    .line 275
    .line 276
    .line 277
    :cond_b
    new-instance v2, LR2/T5;

    .line 278
    .line 279
    iget-object v4, p2, LR2/W5;->o:Ljava/lang/String;

    .line 280
    .line 281
    invoke-static {v4}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    move-object v5, v4

    .line 286
    check-cast v5, Ljava/lang/String;

    .line 287
    .line 288
    iget-object v4, p1, LR2/R5;->u:Ljava/lang/String;

    .line 289
    .line 290
    invoke-static {v4}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    move-object v6, v4

    .line 295
    check-cast v6, Ljava/lang/String;

    .line 296
    .line 297
    iget-object v7, p1, LR2/R5;->p:Ljava/lang/String;

    .line 298
    .line 299
    iget-wide v8, p1, LR2/R5;->q:J

    .line 300
    .line 301
    move-object v4, v2

    .line 302
    move-object v10, v1

    .line 303
    invoke-direct/range {v4 .. v10}, LR2/T5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    invoke-virtual {v4}, LR2/Y1;->K()LR2/a2;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    iget-object v5, p0, LR2/D5;->l:LR2/N2;

    .line 315
    .line 316
    invoke-virtual {v5}, LR2/N2;->D()LR2/X1;

    .line 317
    .line 318
    .line 319
    move-result-object v5

    .line 320
    iget-object v6, v2, LR2/T5;->c:Ljava/lang/String;

    .line 321
    .line 322
    invoke-virtual {v5, v6}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    const-string v6, "Setting user property"

    .line 327
    .line 328
    invoke-virtual {v4, v6, v5, v1}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-virtual {v1}, LR2/p;->Q0()V

    .line 336
    .line 337
    .line 338
    :try_start_0
    iget-object v1, v2, LR2/T5;->c:Ljava/lang/String;

    .line 339
    .line 340
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    if-eqz v1, :cond_c

    .line 345
    .line 346
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    iget-object v4, p2, LR2/W5;->o:Ljava/lang/String;

    .line 351
    .line 352
    invoke-virtual {v1, v4, v0}, LR2/p;->F0(Ljava/lang/String;Ljava/lang/String;)LR2/T5;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    if-eqz v0, :cond_c

    .line 357
    .line 358
    iget-object v1, v2, LR2/T5;->e:Ljava/lang/Object;

    .line 359
    .line 360
    iget-object v0, v0, LR2/T5;->e:Ljava/lang/Object;

    .line 361
    .line 362
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    if-nez v0, :cond_c

    .line 367
    .line 368
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    iget-object v1, p2, LR2/W5;->o:Ljava/lang/String;

    .line 373
    .line 374
    const-string v4, "_lair"

    .line 375
    .line 376
    invoke-virtual {v0, v1, v4}, LR2/p;->L0(Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    goto :goto_2

    .line 380
    :catchall_0
    move-exception p1

    .line 381
    goto :goto_3

    .line 382
    :cond_c
    :goto_2
    invoke-virtual {p0, p2}, LR2/D5;->g(LR2/W5;)LR2/I2;

    .line 383
    .line 384
    .line 385
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-virtual {v0, v2}, LR2/p;->d0(LR2/T5;)Z

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    iget-object p1, p1, LR2/R5;->p:Ljava/lang/String;

    .line 394
    .line 395
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result p1

    .line 399
    if-eqz p1, :cond_d

    .line 400
    .line 401
    invoke-virtual {p0}, LR2/D5;->m0()LR2/N5;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    iget-object v1, p2, LR2/W5;->L:Ljava/lang/String;

    .line 406
    .line 407
    invoke-virtual {p1, v1}, LR2/N5;->z(Ljava/lang/String;)J

    .line 408
    .line 409
    .line 410
    move-result-wide v3

    .line 411
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 412
    .line 413
    .line 414
    move-result-object p1

    .line 415
    iget-object v1, p2, LR2/W5;->o:Ljava/lang/String;

    .line 416
    .line 417
    invoke-virtual {p1, v1}, LR2/p;->D0(Ljava/lang/String;)LR2/I2;

    .line 418
    .line 419
    .line 420
    move-result-object p1

    .line 421
    if-eqz p1, :cond_d

    .line 422
    .line 423
    invoke-virtual {p1, v3, v4}, LR2/I2;->l0(J)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {p1}, LR2/I2;->s()Z

    .line 427
    .line 428
    .line 429
    move-result v1

    .line 430
    if-eqz v1, :cond_d

    .line 431
    .line 432
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    invoke-virtual {v1, p1}, LR2/p;->U(LR2/I2;)V

    .line 437
    .line 438
    .line 439
    :cond_d
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 440
    .line 441
    .line 442
    move-result-object p1

    .line 443
    invoke-virtual {p1}, LR2/p;->T0()V

    .line 444
    .line 445
    .line 446
    if-nez v0, :cond_e

    .line 447
    .line 448
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 449
    .line 450
    .line 451
    move-result-object p1

    .line 452
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 453
    .line 454
    .line 455
    move-result-object p1

    .line 456
    const-string v0, "Too many unique user properties are set. Ignoring user property"

    .line 457
    .line 458
    iget-object v1, p0, LR2/D5;->l:LR2/N2;

    .line 459
    .line 460
    invoke-virtual {v1}, LR2/N2;->D()LR2/X1;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    iget-object v3, v2, LR2/T5;->c:Ljava/lang/String;

    .line 465
    .line 466
    invoke-virtual {v1, v3}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    iget-object v2, v2, LR2/T5;->e:Ljava/lang/Object;

    .line 471
    .line 472
    invoke-virtual {p1, v0, v1, v2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {p0}, LR2/D5;->n0()LR2/S5;

    .line 476
    .line 477
    .line 478
    iget-object v3, p0, LR2/D5;->G:LR2/U5;

    .line 479
    .line 480
    iget-object v4, p2, LR2/W5;->o:Ljava/lang/String;

    .line 481
    .line 482
    const/4 v7, 0x0

    .line 483
    const/4 v8, 0x0

    .line 484
    const/16 v5, 0x9

    .line 485
    .line 486
    const/4 v6, 0x0

    .line 487
    invoke-static/range {v3 .. v8}, LR2/S5;->N(LR2/U5;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 488
    .line 489
    .line 490
    :cond_e
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 491
    .line 492
    .line 493
    move-result-object p1

    .line 494
    invoke-virtual {p1}, LR2/p;->R0()V

    .line 495
    .line 496
    .line 497
    return-void

    .line 498
    :goto_3
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 499
    .line 500
    .line 501
    move-result-object p2

    .line 502
    invoke-virtual {p2}, LR2/p;->R0()V

    .line 503
    .line 504
    .line 505
    throw p1
.end method

.method public final u0()J
    .locals 7

    .line 1
    invoke-virtual {p0}, LR2/D5;->b()LE2/e;

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
    iget-object v2, p0, LR2/D5;->i:LR2/g5;

    .line 10
    .line 11
    invoke-virtual {v2}, LR2/C5;->u()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, LR2/m3;->n()V

    .line 15
    .line 16
    .line 17
    iget-object v3, v2, LR2/g5;->i:LR2/q2;

    .line 18
    .line 19
    invoke-virtual {v3}, LR2/q2;->a()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    const-wide/16 v5, 0x0

    .line 24
    .line 25
    cmp-long v5, v3, v5

    .line 26
    .line 27
    if-nez v5, :cond_0

    .line 28
    .line 29
    invoke-virtual {v2}, LR2/m3;->k()LR2/S5;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3}, LR2/S5;->U0()Ljava/security/SecureRandom;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const v4, 0x5265c00

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    int-to-long v3, v3

    .line 45
    const-wide/16 v5, 0x1

    .line 46
    .line 47
    add-long/2addr v3, v5

    .line 48
    iget-object v2, v2, LR2/g5;->i:LR2/q2;

    .line 49
    .line 50
    invoke-virtual {v2, v3, v4}, LR2/q2;->b(J)V

    .line 51
    .line 52
    .line 53
    :cond_0
    add-long/2addr v0, v3

    .line 54
    const-wide/16 v2, 0x3e8

    .line 55
    .line 56
    div-long/2addr v0, v2

    .line 57
    const-wide/16 v2, 0x3c

    .line 58
    .line 59
    div-long/2addr v0, v2

    .line 60
    div-long/2addr v0, v2

    .line 61
    const-wide/16 v2, 0x18

    .line 62
    .line 63
    div-long/2addr v0, v2

    .line 64
    return-wide v0
.end method

.method public final v0()LR2/j2;
    .locals 2

    .line 1
    iget-object v0, p0, LR2/D5;->d:LR2/j2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Network broadcast receiver not created"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final w0()LR2/x5;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/D5;->e:LR2/x5;

    .line 2
    .line 3
    invoke-static {v0}, LR2/D5;->i(LR2/C5;)LR2/C5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LR2/x5;

    .line 8
    .line 9
    return-object v0
.end method

.method public final x(Lcom/google/android/gms/internal/measurement/d2$a;JZ)V
    .locals 9

    .line 1
    if-eqz p4, :cond_0

    .line 2
    .line 3
    const-string v0, "_se"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string v0, "_lte"

    .line 7
    .line 8
    :goto_0
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d2$a;->S0()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, v2, v0}, LR2/p;->F0(Ljava/lang/String;Ljava/lang/String;)LR2/T5;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    iget-object v2, v1, LR2/T5;->e:Ljava/lang/Object;

    .line 23
    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    new-instance v8, LR2/T5;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d2$a;->S0()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {p0}, LR2/D5;->b()LE2/e;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-interface {v3}, LE2/e;->a()J

    .line 38
    .line 39
    .line 40
    move-result-wide v5

    .line 41
    iget-object v1, v1, LR2/T5;->e:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Ljava/lang/Long;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 46
    .line 47
    .line 48
    move-result-wide v3

    .line 49
    add-long/2addr v3, p2

    .line 50
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    const-string v3, "auto"

    .line 55
    .line 56
    move-object v1, v8

    .line 57
    move-object v4, v0

    .line 58
    invoke-direct/range {v1 .. v7}, LR2/T5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    :goto_1
    new-instance v8, LR2/T5;

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d2$a;->S0()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {p0}, LR2/D5;->b()LE2/e;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-interface {v1}, LE2/e;->a()J

    .line 73
    .line 74
    .line 75
    move-result-wide v5

    .line 76
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    const-string v3, "auto"

    .line 81
    .line 82
    move-object v1, v8

    .line 83
    move-object v4, v0

    .line 84
    invoke-direct/range {v1 .. v7}, LR2/T5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :goto_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/h2;->X()Lcom/google/android/gms/internal/measurement/h2$a;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/h2$a;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/h2$a;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {p0}, LR2/D5;->b()LE2/e;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-interface {v2}, LE2/e;->a()J

    .line 100
    .line 101
    .line 102
    move-result-wide v2

    .line 103
    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/h2$a;->B(J)Lcom/google/android/gms/internal/measurement/h2$a;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    iget-object v2, v8, LR2/T5;->e:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v2, Ljava/lang/Long;

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 112
    .line 113
    .line 114
    move-result-wide v2

    .line 115
    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/h2$a;->y(J)Lcom/google/android/gms/internal/measurement/h2$a;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    check-cast v1, Lcom/google/android/gms/internal/measurement/Y3;

    .line 124
    .line 125
    check-cast v1, Lcom/google/android/gms/internal/measurement/h2;

    .line 126
    .line 127
    invoke-static {p1, v0}, LR2/N5;->y(Lcom/google/android/gms/internal/measurement/d2$a;Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-ltz v0, :cond_3

    .line 132
    .line 133
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/d2$a;->A(ILcom/google/android/gms/internal/measurement/h2;)Lcom/google/android/gms/internal/measurement/d2$a;

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_3
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/d2$a;->G(Lcom/google/android/gms/internal/measurement/h2;)Lcom/google/android/gms/internal/measurement/d2$a;

    .line 138
    .line 139
    .line 140
    :goto_3
    const-wide/16 v0, 0x0

    .line 141
    .line 142
    cmp-long p1, p2, v0

    .line 143
    .line 144
    if-lez p1, :cond_5

    .line 145
    .line 146
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p1, v8}, LR2/p;->d0(LR2/T5;)Z

    .line 151
    .line 152
    .line 153
    if-eqz p4, :cond_4

    .line 154
    .line 155
    const-string p1, "session-scoped"

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_4
    const-string p1, "lifetime"

    .line 159
    .line 160
    :goto_4
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    invoke-virtual {p2}, LR2/Y1;->K()LR2/a2;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    const-string p3, "Updated engagement user property. scope, value"

    .line 169
    .line 170
    iget-object p4, v8, LR2/T5;->e:Ljava/lang/Object;

    .line 171
    .line 172
    invoke-virtual {p2, p3, p1, p4}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    :cond_5
    return-void
.end method

.method public final y(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LR2/D5;->p:Ljava/util/List;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, LR2/D5;->p:Ljava/util/List;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, LR2/D5;->p:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final z(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, LR2/D5;->e()LR2/G2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LR2/D5;->p0()V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    if-nez p4, :cond_0

    .line 16
    .line 17
    :try_start_0
    new-array p4, v0, [B

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto/16 :goto_c

    .line 22
    .line 23
    :cond_0
    :goto_0
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, LR2/Y1;->K()LR2/a2;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "onConfigFetched. Response size"

    .line 32
    .line 33
    array-length v3, p4

    .line 34
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v1, v2, v3}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, LR2/p;->Q0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    :try_start_1
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1, p1}, LR2/p;->D0(Ljava/lang/String;)LR2/I2;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const/16 v2, 0xc8

    .line 57
    .line 58
    const/16 v3, 0x130

    .line 59
    .line 60
    if-eq p2, v2, :cond_1

    .line 61
    .line 62
    const/16 v2, 0xcc

    .line 63
    .line 64
    if-eq p2, v2, :cond_1

    .line 65
    .line 66
    if-ne p2, v3, :cond_2

    .line 67
    .line 68
    :cond_1
    if-nez p3, :cond_2

    .line 69
    .line 70
    const/4 v2, 0x1

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    move v2, v0

    .line 73
    :goto_1
    if-nez v1, :cond_3

    .line 74
    .line 75
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-virtual {p2}, LR2/Y1;->L()LR2/a2;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    const-string p3, "App does not exist in onConfigFetched. appId"

    .line 84
    .line 85
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p2, p3, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto/16 :goto_a

    .line 93
    .line 94
    :catchall_1
    move-exception p1

    .line 95
    goto/16 :goto_b

    .line 96
    .line 97
    :cond_3
    const/16 v4, 0x194

    .line 98
    .line 99
    if-nez v2, :cond_7

    .line 100
    .line 101
    if-ne p2, v4, :cond_4

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    invoke-virtual {p0}, LR2/D5;->b()LE2/e;

    .line 105
    .line 106
    .line 107
    move-result-object p4

    .line 108
    invoke-interface {p4}, LE2/e;->a()J

    .line 109
    .line 110
    .line 111
    move-result-wide p4

    .line 112
    invoke-virtual {v1, p4, p5}, LR2/I2;->b0(J)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 116
    .line 117
    .line 118
    move-result-object p4

    .line 119
    invoke-virtual {p4, v1}, LR2/p;->U(LR2/I2;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 123
    .line 124
    .line 125
    move-result-object p4

    .line 126
    invoke-virtual {p4}, LR2/Y1;->K()LR2/a2;

    .line 127
    .line 128
    .line 129
    move-result-object p4

    .line 130
    const-string p5, "Fetching config failed. code, error"

    .line 131
    .line 132
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {p4, p5, v1, p3}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, LR2/D5;->h0()LR2/x2;

    .line 140
    .line 141
    .line 142
    move-result-object p3

    .line 143
    invoke-virtual {p3, p1}, LR2/x2;->T(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    iget-object p1, p0, LR2/D5;->i:LR2/g5;

    .line 147
    .line 148
    iget-object p1, p1, LR2/g5;->h:LR2/q2;

    .line 149
    .line 150
    invoke-virtual {p0}, LR2/D5;->b()LE2/e;

    .line 151
    .line 152
    .line 153
    move-result-object p3

    .line 154
    invoke-interface {p3}, LE2/e;->a()J

    .line 155
    .line 156
    .line 157
    move-result-wide p3

    .line 158
    invoke-virtual {p1, p3, p4}, LR2/q2;->b(J)V

    .line 159
    .line 160
    .line 161
    const/16 p1, 0x1f7

    .line 162
    .line 163
    if-eq p2, p1, :cond_5

    .line 164
    .line 165
    const/16 p1, 0x1ad

    .line 166
    .line 167
    if-ne p2, p1, :cond_6

    .line 168
    .line 169
    :cond_5
    iget-object p1, p0, LR2/D5;->i:LR2/g5;

    .line 170
    .line 171
    iget-object p1, p1, LR2/g5;->f:LR2/q2;

    .line 172
    .line 173
    invoke-virtual {p0}, LR2/D5;->b()LE2/e;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    invoke-interface {p2}, LE2/e;->a()J

    .line 178
    .line 179
    .line 180
    move-result-wide p2

    .line 181
    invoke-virtual {p1, p2, p3}, LR2/q2;->b(J)V

    .line 182
    .line 183
    .line 184
    :cond_6
    invoke-direct {p0}, LR2/D5;->N()V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_a

    .line 188
    .line 189
    :cond_7
    :goto_2
    const/4 p3, 0x0

    .line 190
    if-eqz p5, :cond_8

    .line 191
    .line 192
    const-string v2, "Last-Modified"

    .line 193
    .line 194
    invoke-interface {p5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    check-cast v2, Ljava/util/List;

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_8
    move-object v2, p3

    .line 202
    :goto_3
    if-eqz v2, :cond_9

    .line 203
    .line 204
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    if-nez v5, :cond_9

    .line 209
    .line 210
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    check-cast v2, Ljava/lang/String;

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_9
    move-object v2, p3

    .line 218
    :goto_4
    if-eqz p5, :cond_a

    .line 219
    .line 220
    const-string v5, "ETag"

    .line 221
    .line 222
    invoke-interface {p5, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p5

    .line 226
    check-cast p5, Ljava/util/List;

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_a
    move-object p5, p3

    .line 230
    :goto_5
    if-eqz p5, :cond_b

    .line 231
    .line 232
    invoke-interface {p5}, Ljava/util/List;->isEmpty()Z

    .line 233
    .line 234
    .line 235
    move-result v5

    .line 236
    if-nez v5, :cond_b

    .line 237
    .line 238
    invoke-interface {p5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p5

    .line 242
    check-cast p5, Ljava/lang/String;

    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_b
    move-object p5, p3

    .line 246
    :goto_6
    if-eq p2, v4, :cond_d

    .line 247
    .line 248
    if-ne p2, v3, :cond_c

    .line 249
    .line 250
    goto :goto_8

    .line 251
    :cond_c
    invoke-virtual {p0}, LR2/D5;->h0()LR2/x2;

    .line 252
    .line 253
    .line 254
    move-result-object p3

    .line 255
    invoke-virtual {p3, p1, p4, v2, p5}, LR2/x2;->H(Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;)Z

    .line 256
    .line 257
    .line 258
    move-result p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 259
    if-nez p3, :cond_e

    .line 260
    .line 261
    :try_start_2
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    :goto_7
    invoke-virtual {p1}, LR2/p;->R0()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 266
    .line 267
    .line 268
    iput-boolean v0, p0, LR2/D5;->t:Z

    .line 269
    .line 270
    invoke-direct {p0}, LR2/D5;->M()V

    .line 271
    .line 272
    .line 273
    return-void

    .line 274
    :cond_d
    :goto_8
    :try_start_3
    invoke-virtual {p0}, LR2/D5;->h0()LR2/x2;

    .line 275
    .line 276
    .line 277
    move-result-object p5

    .line 278
    invoke-virtual {p5, p1}, LR2/x2;->L(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/L1;

    .line 279
    .line 280
    .line 281
    move-result-object p5

    .line 282
    if-nez p5, :cond_e

    .line 283
    .line 284
    invoke-virtual {p0}, LR2/D5;->h0()LR2/x2;

    .line 285
    .line 286
    .line 287
    move-result-object p5

    .line 288
    invoke-virtual {p5, p1, p3, p3, p3}, LR2/x2;->H(Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;)Z

    .line 289
    .line 290
    .line 291
    move-result p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 292
    if-nez p3, :cond_e

    .line 293
    .line 294
    :try_start_4
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 295
    .line 296
    .line 297
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 298
    goto :goto_7

    .line 299
    :cond_e
    :try_start_5
    invoke-virtual {p0}, LR2/D5;->b()LE2/e;

    .line 300
    .line 301
    .line 302
    move-result-object p3

    .line 303
    invoke-interface {p3}, LE2/e;->a()J

    .line 304
    .line 305
    .line 306
    move-result-wide v2

    .line 307
    invoke-virtual {v1, v2, v3}, LR2/I2;->A(J)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 311
    .line 312
    .line 313
    move-result-object p3

    .line 314
    invoke-virtual {p3, v1}, LR2/p;->U(LR2/I2;)V

    .line 315
    .line 316
    .line 317
    if-ne p2, v4, :cond_f

    .line 318
    .line 319
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 320
    .line 321
    .line 322
    move-result-object p2

    .line 323
    invoke-virtual {p2}, LR2/Y1;->M()LR2/a2;

    .line 324
    .line 325
    .line 326
    move-result-object p2

    .line 327
    const-string p3, "Config not found. Using empty config. appId"

    .line 328
    .line 329
    invoke-virtual {p2, p3, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    goto :goto_9

    .line 333
    :cond_f
    invoke-virtual {p0}, LR2/D5;->j()LR2/Y1;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    invoke-virtual {p1}, LR2/Y1;->K()LR2/a2;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    const-string p3, "Successfully fetched config. Got network response. code, size"

    .line 342
    .line 343
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 344
    .line 345
    .line 346
    move-result-object p2

    .line 347
    array-length p4, p4

    .line 348
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 349
    .line 350
    .line 351
    move-result-object p4

    .line 352
    invoke-virtual {p1, p3, p2, p4}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    :goto_9
    invoke-virtual {p0}, LR2/D5;->g0()LR2/f2;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    invoke-virtual {p1}, LR2/f2;->A()Z

    .line 360
    .line 361
    .line 362
    move-result p1

    .line 363
    if-eqz p1, :cond_6

    .line 364
    .line 365
    invoke-direct {p0}, LR2/D5;->O()Z

    .line 366
    .line 367
    .line 368
    move-result p1

    .line 369
    if-eqz p1, :cond_6

    .line 370
    .line 371
    invoke-virtual {p0}, LR2/D5;->t0()V

    .line 372
    .line 373
    .line 374
    :goto_a
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    invoke-virtual {p1}, LR2/p;->T0()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 379
    .line 380
    .line 381
    :try_start_6
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    goto :goto_7

    .line 386
    :goto_b
    invoke-virtual {p0}, LR2/D5;->e0()LR2/p;

    .line 387
    .line 388
    .line 389
    move-result-object p2

    .line 390
    invoke-virtual {p2}, LR2/p;->R0()V

    .line 391
    .line 392
    .line 393
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 394
    :goto_c
    iput-boolean v0, p0, LR2/D5;->t:Z

    .line 395
    .line 396
    invoke-direct {p0}, LR2/D5;->M()V

    .line 397
    .line 398
    .line 399
    throw p1
.end method
