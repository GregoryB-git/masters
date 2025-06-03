.class public final LR2/S1;
.super LR2/f1;
.source "SourceFile"


# instance fields
.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:I

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:J

.field public i:J

.field public j:Ljava/util/List;

.field public k:Ljava/lang/String;

.field public l:I

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:J

.field public q:Ljava/lang/String;


# direct methods
.method public constructor <init>(LR2/N2;J)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, LR2/f1;-><init>(LR2/N2;)V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, LR2/S1;->p:J

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, LR2/S1;->q:Ljava/lang/String;

    .line 10
    .line 11
    iput-wide p2, p0, LR2/S1;->i:J

    .line 12
    .line 13
    return-void
.end method

.method private final J()Ljava/lang/String;
    .locals 7

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/F7;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v2, LR2/K;->n0:LR2/P1;

    .line 13
    .line 14
    invoke-virtual {v0, v2}, LR2/g;->s(LR2/P1;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v2, "Disabled IID for tests."

    .line 29
    .line 30
    :goto_0
    invoke-virtual {v0, v2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :cond_0
    :try_start_0
    invoke-virtual {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v2, "com.google.firebase.analytics.FirebaseAnalytics"

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_1
    :try_start_1
    const-string v2, "getInstance"

    .line 52
    .line 53
    const/4 v3, 0x1

    .line 54
    new-array v4, v3, [Ljava/lang/Class;

    .line 55
    .line 56
    const-class v5, Landroid/content/Context;

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    aput-object v5, v4, v6

    .line 60
    .line 61
    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    new-array v3, v3, [Ljava/lang/Object;

    .line 66
    .line 67
    invoke-virtual {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    aput-object v4, v3, v6

    .line 72
    .line 73
    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 77
    if-nez v2, :cond_2

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_2
    :try_start_2
    const-string v3, "getFirebaseInstanceId"

    .line 81
    .line 82
    new-array v4, v6, [Ljava/lang/Class;

    .line 83
    .line 84
    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    new-array v3, v6, [Ljava/lang/Object;

    .line 89
    .line 90
    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 95
    .line 96
    return-object v0

    .line 97
    :catch_0
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, LR2/Y1;->M()LR2/a2;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const-string v2, "Failed to retrieve Firebase Instance Id"

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :catch_1
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, LR2/Y1;->N()LR2/a2;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const-string v2, "Failed to obtain Firebase Analytics instance"

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :catch_2
    return-object v1
.end method


# virtual methods
.method public final A()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final B(Ljava/lang/String;)LR2/W5;
    .locals 45

    .line 1
    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, LR2/m3;->n()V

    invoke-virtual/range {p0 .. p0}, LR2/m3;->i()LR2/l2;

    move-result-object v1

    invoke-virtual {v1}, LR2/l2;->J()LR2/q3;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v2

    sget-object v3, LR2/K;->S0:LR2/P1;

    invoke-virtual {v2, v3}, LR2/g;->s(LR2/P1;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual/range {p0 .. p0}, LR2/m3;->i()LR2/l2;

    move-result-object v2

    invoke-virtual {v2}, LR2/l2;->I()LR2/z;

    move-result-object v2

    invoke-virtual {v2}, LR2/z;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, LR2/q3;->b()I

    move-result v3

    :goto_0
    move-object/from16 v39, v2

    move/from16 v38, v3

    goto :goto_1

    :cond_0
    const-string v2, ""

    const/16 v3, 0x64

    goto :goto_0

    :goto_1
    new-instance v2, LR2/W5;

    invoke-virtual/range {p0 .. p0}, LR2/S1;->F()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, LR2/S1;->G()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, LR2/f1;->v()V

    iget-object v7, v0, LR2/S1;->d:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, LR2/S1;->D()I

    move-result v3

    int-to-long v8, v3

    invoke-virtual/range {p0 .. p0}, LR2/f1;->v()V

    iget-object v3, v0, LR2/S1;->f:Ljava/lang/String;

    invoke-static {v3}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v10, v0, LR2/S1;->f:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, LR2/f1;->v()V

    invoke-virtual/range {p0 .. p0}, LR2/m3;->n()V

    iget-wide v3, v0, LR2/S1;->h:J

    const-wide/16 v11, 0x0

    cmp-long v3, v3, v11

    if-nez v3, :cond_1

    iget-object v3, v0, LR2/m3;->a:LR2/N2;

    invoke-virtual {v3}, LR2/N2;->L()LR2/S5;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, LR2/m3;->a()Landroid/content/Context;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, LR2/m3;->a()Landroid/content/Context;

    move-result-object v13

    invoke-virtual {v13}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v3, v4, v13}, LR2/S5;->A(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v3

    iput-wide v3, v0, LR2/S1;->h:J

    :cond_1
    iget-wide v13, v0, LR2/S1;->h:J

    iget-object v3, v0, LR2/m3;->a:LR2/N2;

    invoke-virtual {v3}, LR2/N2;->p()Z

    move-result v16

    invoke-virtual/range {p0 .. p0}, LR2/m3;->i()LR2/l2;

    move-result-object v3

    iget-boolean v3, v3, LR2/l2;->r:Z

    xor-int/lit8 v17, v3, 0x1

    invoke-virtual/range {p0 .. p0}, LR2/m3;->n()V

    iget-object v3, v0, LR2/m3;->a:LR2/N2;

    invoke-virtual {v3}, LR2/N2;->p()Z

    move-result v3

    if-nez v3, :cond_2

    const/16 v18, 0x0

    goto :goto_2

    :cond_2
    invoke-direct/range {p0 .. p0}, LR2/S1;->J()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v18, v3

    :goto_2
    iget-object v3, v0, LR2/m3;->a:LR2/N2;

    invoke-virtual {v3}, LR2/N2;->F()LR2/l2;

    move-result-object v15

    iget-object v15, v15, LR2/l2;->e:LR2/q2;

    move-object/from16 v21, v5

    invoke-virtual {v15}, LR2/q2;->a()J

    move-result-wide v4

    cmp-long v15, v4, v11

    if-nez v15, :cond_3

    iget-wide v3, v3, LR2/N2;->H:J

    :goto_3
    move-wide/from16 v24, v3

    goto :goto_4

    :cond_3
    iget-wide v11, v3, LR2/N2;->H:J

    invoke-static {v11, v12, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    goto :goto_3

    :goto_4
    invoke-virtual/range {p0 .. p0}, LR2/S1;->C()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v4

    invoke-virtual {v4}, LR2/g;->P()Z

    move-result v26

    invoke-virtual/range {p0 .. p0}, LR2/m3;->i()LR2/l2;

    move-result-object v4

    invoke-virtual {v4}, LR2/m3;->n()V

    invoke-virtual {v4}, LR2/l2;->F()Landroid/content/SharedPreferences;

    move-result-object v4

    const-string v5, "deferred_analytics_collection"

    const/4 v11, 0x0

    invoke-interface {v4, v5, v11}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v27

    invoke-virtual/range {p0 .. p0}, LR2/S1;->E()Ljava/lang/String;

    move-result-object v28

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v4

    const-string v5, "google_analytics_default_allow_ad_personalization_signals"

    invoke-virtual {v4, v5}, LR2/g;->F(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    if-nez v4, :cond_4

    const/16 v29, 0x0

    goto :goto_5

    :cond_4
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    move-object/from16 v29, v4

    :goto_5
    iget-wide v4, v0, LR2/S1;->i:J

    iget-object v15, v0, LR2/S1;->j:Ljava/util/List;

    invoke-virtual {v1}, LR2/q3;->v()Ljava/lang/String;

    move-result-object v32

    iget-object v1, v0, LR2/S1;->k:Ljava/lang/String;

    if-nez v1, :cond_5

    invoke-virtual/range {p0 .. p0}, LR2/m3;->k()LR2/S5;

    move-result-object v1

    invoke-virtual {v1}, LR2/S5;->S0()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, LR2/S1;->k:Ljava/lang/String;

    :cond_5
    iget-object v1, v0, LR2/S1;->k:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/s7;->a()Z

    move-result v12

    if-eqz v12, :cond_9

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v12

    sget-object v11, LR2/K;->x0:LR2/P1;

    invoke-virtual {v12, v11}, LR2/g;->s(LR2/P1;)Z

    move-result v11

    if-eqz v11, :cond_9

    invoke-virtual/range {p0 .. p0}, LR2/m3;->n()V

    iget-wide v11, v0, LR2/S1;->p:J

    const-wide/16 v22, 0x0

    cmp-long v11, v11, v22

    if-eqz v11, :cond_6

    invoke-virtual/range {p0 .. p0}, LR2/m3;->b()LE2/e;

    move-result-object v11

    invoke-interface {v11}, LE2/e;->a()J

    move-result-wide v11

    move-wide/from16 v33, v4

    iget-wide v4, v0, LR2/S1;->p:J

    sub-long/2addr v11, v4

    iget-object v4, v0, LR2/S1;->o:Ljava/lang/String;

    if-eqz v4, :cond_7

    const-wide/32 v4, 0x5265c00

    cmp-long v4, v11, v4

    if-lez v4, :cond_7

    iget-object v4, v0, LR2/S1;->q:Ljava/lang/String;

    if-nez v4, :cond_7

    invoke-virtual/range {p0 .. p0}, LR2/S1;->I()V

    goto :goto_6

    :cond_6
    move-wide/from16 v33, v4

    :cond_7
    :goto_6
    iget-object v4, v0, LR2/S1;->o:Ljava/lang/String;

    if-nez v4, :cond_8

    invoke-virtual/range {p0 .. p0}, LR2/S1;->I()V

    :cond_8
    iget-object v4, v0, LR2/S1;->o:Ljava/lang/String;

    move-object/from16 v35, v4

    goto :goto_7

    :cond_9
    move-wide/from16 v33, v4

    const-wide/16 v22, 0x0

    const/16 v35, 0x0

    :goto_7
    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v4

    const-string v5, "google_analytics_sgtm_upload_enabled"

    invoke-virtual {v4, v5}, LR2/g;->F(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    if-nez v4, :cond_a

    const/16 v36, 0x0

    goto :goto_8

    :cond_a
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move/from16 v36, v4

    :goto_8
    invoke-virtual/range {p0 .. p0}, LR2/m3;->k()LR2/S5;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, LR2/S1;->F()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, LR2/S5;->z0(Ljava/lang/String;)J

    move-result-wide v40

    invoke-static {}, Lcom/google/android/gms/internal/measurement/g7;->a()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v4

    sget-object v5, LR2/K;->M0:LR2/P1;

    invoke-virtual {v4, v5}, LR2/g;->s(LR2/P1;)Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-virtual/range {p0 .. p0}, LR2/m3;->k()LR2/S5;

    invoke-static {}, LR2/S5;->y0()I

    move-result v4

    move/from16 v42, v4

    goto :goto_9

    :cond_b
    const/16 v42, 0x0

    :goto_9
    invoke-static {}, Lcom/google/android/gms/internal/measurement/g7;->a()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v4

    sget-object v5, LR2/K;->M0:LR2/P1;

    invoke-virtual {v4, v5}, LR2/g;->s(LR2/P1;)Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-virtual/range {p0 .. p0}, LR2/m3;->k()LR2/S5;

    move-result-object v4

    invoke-virtual {v4}, LR2/S5;->I0()J

    move-result-wide v4

    move-wide/from16 v43, v4

    goto :goto_a

    :cond_c
    move-wide/from16 v43, v22

    :goto_a
    const-wide/32 v11, 0x14051

    const-wide/16 v19, 0x0

    const/16 v31, 0x0

    move-object v4, v2

    move-object/from16 v5, v21

    move-object/from16 v30, v15

    move-object/from16 v15, p1

    move-wide/from16 v21, v24

    move/from16 v23, v3

    move/from16 v24, v26

    move/from16 v25, v27

    move-object/from16 v26, v28

    move-object/from16 v27, v29

    move-wide/from16 v28, v33

    move-object/from16 v33, v1

    move-object/from16 v34, v35

    move/from16 v35, v36

    move-wide/from16 v36, v40

    move/from16 v40, v42

    move-wide/from16 v41, v43

    invoke-direct/range {v4 .. v42}, LR2/W5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJ)V

    return-object v2
.end method

.method public final C()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, LR2/S1;->l:I

    .line 5
    .line 6
    return v0
.end method

.method public final D()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, LR2/S1;->e:I

    .line 5
    .line 6
    return v0
.end method

.method public final E()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LR2/S1;->n:Ljava/lang/String;

    .line 5
    .line 6
    return-object v0
.end method

.method public final F()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LR2/S1;->c:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LR2/S1;->c:Ljava/lang/String;

    .line 10
    .line 11
    return-object v0
.end method

.method public final G()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/f1;->v()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LR2/S1;->m:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LR2/S1;->m:Ljava/lang/String;

    .line 13
    .line 14
    return-object v0
.end method

.method public final H()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/S1;->j:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final I()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, LR2/m3;->i()LR2/l2;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, LR2/l2;->J()LR2/q3;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, LR2/q3$a;->q:LR2/q3$a;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, LR2/q3;->l(LR2/q3$a;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, LR2/Y1;->F()LR2/a2;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v3, "Analytics Storage consent is not granted"

    .line 31
    .line 32
    invoke-virtual {v1, v3}, LR2/a2;->a(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/16 v1, 0x10

    .line 38
    .line 39
    new-array v1, v1, [B

    .line 40
    .line 41
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, LR2/S5;->U0()Ljava/security/SecureRandom;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 50
    .line 51
    .line 52
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 53
    .line 54
    new-instance v4, Ljava/math/BigInteger;

    .line 55
    .line 56
    invoke-direct {v4, v2, v1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 57
    .line 58
    .line 59
    new-array v1, v2, [Ljava/lang/Object;

    .line 60
    .line 61
    aput-object v4, v1, v0

    .line 62
    .line 63
    const-string v4, "%032x"

    .line 64
    .line 65
    invoke-static {v3, v4, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :goto_0
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3}, LR2/Y1;->F()LR2/a2;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    new-array v2, v2, [Ljava/lang/Object;

    .line 78
    .line 79
    if-nez v1, :cond_1

    .line 80
    .line 81
    const-string v4, "null"

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    const-string v4, "not null"

    .line 85
    .line 86
    :goto_1
    aput-object v4, v2, v0

    .line 87
    .line 88
    const-string v0, "Resetting session stitching token to %s"

    .line 89
    .line 90
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v3, v0}, LR2/a2;->a(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iput-object v1, p0, LR2/S1;->o:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {p0}, LR2/m3;->b()LE2/e;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-interface {v0}, LE2/e;->a()J

    .line 104
    .line 105
    .line 106
    move-result-wide v0

    .line 107
    iput-wide v0, p0, LR2/S1;->p:J

    .line 108
    .line 109
    return-void
.end method

.method public final K(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LR2/S1;->q:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    iput-object p1, p0, LR2/S1;->q:Ljava/lang/String;

    .line 15
    .line 16
    return v0
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

.method public final bridge synthetic l()V
    .locals 0

    .line 1
    invoke-super {p0}, LR2/G1;->l()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public final bridge synthetic n()V
    .locals 0

    .line 1
    invoke-super {p0}, LR2/G1;->n()V

    .line 2
    .line 3
    .line 4
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

.method public final y()V
    .locals 11

    .line 1
    invoke-virtual {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    const-string v3, ""

    .line 19
    .line 20
    const-string v4, "unknown"

    .line 21
    .line 22
    const-string v5, "Unknown"

    .line 23
    .line 24
    const/high16 v6, -0x80000000

    .line 25
    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-virtual {v7}, LR2/Y1;->G()LR2/a2;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    const-string v8, "PackageManager is null, app identity information might be inaccurate. appId"

    .line 37
    .line 38
    invoke-static {v0}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    invoke-virtual {v7, v8, v9}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    move-object v8, v5

    .line 46
    goto :goto_4

    .line 47
    :cond_1
    :try_start_0
    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    goto :goto_0

    .line 52
    :catch_0
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-virtual {v7}, LR2/Y1;->G()LR2/a2;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    const-string v8, "Error retrieving app installer package name. appId"

    .line 61
    .line 62
    invoke-static {v0}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-virtual {v7, v8, v9}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :goto_0
    if-nez v4, :cond_2

    .line 70
    .line 71
    const-string v4, "manual_install"

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    const-string v7, "com.android.vending"

    .line 75
    .line 76
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-eqz v7, :cond_3

    .line 81
    .line 82
    move-object v4, v3

    .line 83
    :cond_3
    :goto_1
    :try_start_1
    invoke-virtual {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-virtual {v1, v7, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    if-eqz v7, :cond_0

    .line 96
    .line 97
    iget-object v8, v7, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 98
    .line 99
    invoke-virtual {v1, v8}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    if-nez v9, :cond_4

    .line 108
    .line 109
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v8
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_2

    .line 113
    goto :goto_2

    .line 114
    :cond_4
    move-object v8, v5

    .line 115
    :goto_2
    :try_start_2
    iget-object v5, v7, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 116
    .line 117
    iget v6, v7, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :catch_1
    move-object v7, v5

    .line 121
    move-object v5, v8

    .line 122
    goto :goto_3

    .line 123
    :catch_2
    move-object v7, v5

    .line 124
    :goto_3
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    invoke-virtual {v8}, LR2/Y1;->G()LR2/a2;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    const-string v9, "Error retrieving package info. appId, appName"

    .line 133
    .line 134
    invoke-static {v0}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    invoke-virtual {v8, v9, v10, v5}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    move-object v8, v5

    .line 142
    move-object v5, v7

    .line 143
    :goto_4
    iput-object v0, p0, LR2/S1;->c:Ljava/lang/String;

    .line 144
    .line 145
    iput-object v4, p0, LR2/S1;->f:Ljava/lang/String;

    .line 146
    .line 147
    iput-object v5, p0, LR2/S1;->d:Ljava/lang/String;

    .line 148
    .line 149
    iput v6, p0, LR2/S1;->e:I

    .line 150
    .line 151
    iput-object v8, p0, LR2/S1;->g:Ljava/lang/String;

    .line 152
    .line 153
    const-wide/16 v4, 0x0

    .line 154
    .line 155
    iput-wide v4, p0, LR2/S1;->h:J

    .line 156
    .line 157
    iget-object v4, p0, LR2/m3;->a:LR2/N2;

    .line 158
    .line 159
    invoke-virtual {v4}, LR2/N2;->M()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    const/4 v5, 0x1

    .line 168
    if-nez v4, :cond_5

    .line 169
    .line 170
    iget-object v4, p0, LR2/m3;->a:LR2/N2;

    .line 171
    .line 172
    invoke-virtual {v4}, LR2/N2;->N()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    const-string v6, "am"

    .line 177
    .line 178
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-eqz v4, :cond_5

    .line 183
    .line 184
    move v4, v5

    .line 185
    goto :goto_5

    .line 186
    :cond_5
    move v4, v2

    .line 187
    :goto_5
    iget-object v6, p0, LR2/m3;->a:LR2/N2;

    .line 188
    .line 189
    invoke-virtual {v6}, LR2/N2;->x()I

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    packed-switch v6, :pswitch_data_0

    .line 198
    .line 199
    .line 200
    invoke-virtual {v7}, LR2/Y1;->J()LR2/a2;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    const-string v8, "App measurement disabled"

    .line 205
    .line 206
    invoke-virtual {v7, v8}, LR2/a2;->a(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    invoke-virtual {v7}, LR2/Y1;->I()LR2/a2;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    const-string v8, "Invalid scion state in identity"

    .line 218
    .line 219
    :goto_6
    invoke-virtual {v7, v8}, LR2/a2;->a(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    goto :goto_7

    .line 223
    :pswitch_0
    invoke-virtual {v7}, LR2/Y1;->J()LR2/a2;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    const-string v8, "App measurement disabled due to denied storage consent"

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :pswitch_1
    invoke-virtual {v7}, LR2/Y1;->J()LR2/a2;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    const-string v8, "App measurement disabled via the global data collection setting"

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :pswitch_2
    invoke-virtual {v7}, LR2/Y1;->M()LR2/a2;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    const-string v8, "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"

    .line 242
    .line 243
    goto :goto_6

    .line 244
    :pswitch_3
    invoke-virtual {v7}, LR2/Y1;->K()LR2/a2;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    const-string v8, "App measurement disabled via the init parameters"

    .line 249
    .line 250
    goto :goto_6

    .line 251
    :pswitch_4
    invoke-virtual {v7}, LR2/Y1;->J()LR2/a2;

    .line 252
    .line 253
    .line 254
    move-result-object v7

    .line 255
    const-string v8, "App measurement disabled via the manifest"

    .line 256
    .line 257
    goto :goto_6

    .line 258
    :pswitch_5
    invoke-virtual {v7}, LR2/Y1;->J()LR2/a2;

    .line 259
    .line 260
    .line 261
    move-result-object v7

    .line 262
    const-string v8, "App measurement disabled by setAnalyticsCollectionEnabled(false)"

    .line 263
    .line 264
    goto :goto_6

    .line 265
    :pswitch_6
    invoke-virtual {v7}, LR2/Y1;->K()LR2/a2;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    const-string v8, "App measurement deactivated via the init parameters"

    .line 270
    .line 271
    goto :goto_6

    .line 272
    :pswitch_7
    invoke-virtual {v7}, LR2/Y1;->J()LR2/a2;

    .line 273
    .line 274
    .line 275
    move-result-object v7

    .line 276
    const-string v8, "App measurement deactivated via the manifest"

    .line 277
    .line 278
    goto :goto_6

    .line 279
    :pswitch_8
    invoke-virtual {v7}, LR2/Y1;->K()LR2/a2;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    const-string v8, "App measurement collection enabled"

    .line 284
    .line 285
    goto :goto_6

    .line 286
    :goto_7
    if-nez v6, :cond_6

    .line 287
    .line 288
    goto :goto_8

    .line 289
    :cond_6
    move v5, v2

    .line 290
    :goto_8
    iput-object v3, p0, LR2/S1;->m:Ljava/lang/String;

    .line 291
    .line 292
    iput-object v3, p0, LR2/S1;->n:Ljava/lang/String;

    .line 293
    .line 294
    if-eqz v4, :cond_7

    .line 295
    .line 296
    iget-object v4, p0, LR2/m3;->a:LR2/N2;

    .line 297
    .line 298
    invoke-virtual {v4}, LR2/N2;->M()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    iput-object v4, p0, LR2/S1;->n:Ljava/lang/String;

    .line 303
    .line 304
    :cond_7
    :try_start_3
    invoke-virtual {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 305
    .line 306
    .line 307
    move-result-object v4

    .line 308
    iget-object v6, p0, LR2/m3;->a:LR2/N2;

    .line 309
    .line 310
    invoke-virtual {v6}, LR2/N2;->P()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    const-string v7, "google_app_id"

    .line 315
    .line 316
    new-instance v8, LR2/H2;

    .line 317
    .line 318
    invoke-direct {v8, v4, v6}, LR2/H2;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v8, v7}, LR2/H2;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v4

    .line 325
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 326
    .line 327
    .line 328
    move-result v6

    .line 329
    if-eqz v6, :cond_8

    .line 330
    .line 331
    goto :goto_9

    .line 332
    :cond_8
    move-object v3, v4

    .line 333
    :goto_9
    iput-object v3, p0, LR2/S1;->m:Ljava/lang/String;

    .line 334
    .line 335
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    if-nez v3, :cond_9

    .line 340
    .line 341
    new-instance v3, LR2/H2;

    .line 342
    .line 343
    invoke-virtual {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    iget-object v6, p0, LR2/m3;->a:LR2/N2;

    .line 348
    .line 349
    invoke-virtual {v6}, LR2/N2;->P()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    invoke-direct {v3, v4, v6}, LR2/H2;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    const-string v4, "admob_app_id"

    .line 357
    .line 358
    invoke-virtual {v3, v4}, LR2/H2;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    iput-object v3, p0, LR2/S1;->n:Ljava/lang/String;

    .line 363
    .line 364
    goto :goto_a

    .line 365
    :catch_3
    move-exception v3

    .line 366
    goto :goto_c

    .line 367
    :cond_9
    :goto_a
    if-eqz v5, :cond_b

    .line 368
    .line 369
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    invoke-virtual {v3}, LR2/Y1;->K()LR2/a2;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    const-string v4, "App measurement enabled for app package, google app id"

    .line 378
    .line 379
    iget-object v5, p0, LR2/S1;->c:Ljava/lang/String;

    .line 380
    .line 381
    iget-object v6, p0, LR2/S1;->m:Ljava/lang/String;

    .line 382
    .line 383
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 384
    .line 385
    .line 386
    move-result v6

    .line 387
    if-eqz v6, :cond_a

    .line 388
    .line 389
    iget-object v6, p0, LR2/S1;->n:Ljava/lang/String;

    .line 390
    .line 391
    goto :goto_b

    .line 392
    :cond_a
    iget-object v6, p0, LR2/S1;->m:Ljava/lang/String;

    .line 393
    .line 394
    :goto_b
    invoke-virtual {v3, v4, v5, v6}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_3

    .line 395
    .line 396
    .line 397
    goto :goto_d

    .line 398
    :goto_c
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    invoke-virtual {v4}, LR2/Y1;->G()LR2/a2;

    .line 403
    .line 404
    .line 405
    move-result-object v4

    .line 406
    const-string v5, "Fetching Google App Id failed with exception. appId"

    .line 407
    .line 408
    invoke-static {v0}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-virtual {v4, v5, v0, v3}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    :cond_b
    :goto_d
    const/4 v0, 0x0

    .line 416
    iput-object v0, p0, LR2/S1;->j:Ljava/util/List;

    .line 417
    .line 418
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    const-string v3, "analytics.safelisted_events"

    .line 423
    .line 424
    invoke-virtual {v0, v3}, LR2/g;->I(Ljava/lang/String;)Ljava/util/List;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    if-eqz v0, :cond_e

    .line 429
    .line 430
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 431
    .line 432
    .line 433
    move-result v3

    .line 434
    if-eqz v3, :cond_c

    .line 435
    .line 436
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    invoke-virtual {v0}, LR2/Y1;->M()LR2/a2;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    const-string v3, "Safelisted event list is empty. Ignoring"

    .line 445
    .line 446
    invoke-virtual {v0, v3}, LR2/a2;->a(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    goto :goto_e

    .line 450
    :cond_c
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    :cond_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 455
    .line 456
    .line 457
    move-result v4

    .line 458
    if-eqz v4, :cond_e

    .line 459
    .line 460
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v4

    .line 464
    check-cast v4, Ljava/lang/String;

    .line 465
    .line 466
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 467
    .line 468
    .line 469
    move-result-object v5

    .line 470
    const-string v6, "safelisted event"

    .line 471
    .line 472
    invoke-virtual {v5, v6, v4}, LR2/S5;->w0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 473
    .line 474
    .line 475
    move-result v4

    .line 476
    if-nez v4, :cond_d

    .line 477
    .line 478
    goto :goto_e

    .line 479
    :cond_e
    iput-object v0, p0, LR2/S1;->j:Ljava/util/List;

    .line 480
    .line 481
    :goto_e
    if-eqz v1, :cond_f

    .line 482
    .line 483
    invoke-virtual {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    invoke-static {v0}, LG2/a;->a(Landroid/content/Context;)Z

    .line 488
    .line 489
    .line 490
    move-result v0

    .line 491
    iput v0, p0, LR2/S1;->l:I

    .line 492
    .line 493
    return-void

    .line 494
    :cond_f
    iput v2, p0, LR2/S1;->l:I

    .line 495
    .line 496
    return-void

    .line 497
    :pswitch_data_0
    .packed-switch 0x0
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
.end method
