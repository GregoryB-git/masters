.class public final LR2/b6;
.super LR2/C5;
.source "SourceFile"


# instance fields
.field public d:Ljava/lang/String;

.field public e:Ljava/util/Set;

.field public f:Ljava/util/Map;

.field public g:Ljava/lang/Long;

.field public h:Ljava/lang/Long;


# direct methods
.method public constructor <init>(LR2/D5;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LR2/C5;-><init>(LR2/D5;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final A(II)Z
    .locals 1

    .line 1
    iget-object v0, p0, LR2/b6;->f:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, LR2/d6;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return p1

    .line 17
    :cond_0
    invoke-static {p1}, LR2/d6;->b(LR2/d6;)Ljava/util/BitSet;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1, p2}, Ljava/util/BitSet;->get(I)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1
.end method

.method public final x()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final y(Ljava/lang/Integer;)LR2/d6;
    .locals 3

    .line 1
    iget-object v0, p0, LR2/b6;->f:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LR2/b6;->f:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, LR2/d6;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    new-instance v0, LR2/d6;

    .line 19
    .line 20
    iget-object v1, p0, LR2/b6;->d:Ljava/lang/String;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v0, p0, v1, v2}, LR2/d6;-><init>(LR2/b6;Ljava/lang/String;LR2/g6;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, LR2/b6;->f:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public final z(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Ljava/util/List;
    .locals 52

    .line 1
    move-object/from16 v10, p0

    invoke-static/range {p1 .. p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static/range {p2 .. p2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p3 .. p3}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p1

    iput-object v0, v10, LR2/b6;->d:Ljava/lang/String;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, v10, LR2/b6;->e:Ljava/util/Set;

    new-instance v0, Lt/a;

    invoke-direct {v0}, Lt/a;-><init>()V

    iput-object v0, v10, LR2/b6;->f:Ljava/util/Map;

    move-object/from16 v0, p4

    iput-object v0, v10, LR2/b6;->g:Ljava/lang/Long;

    move-object/from16 v0, p5

    iput-object v0, v10, LR2/b6;->h:Ljava/lang/Long;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v11, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/Y1;

    const-string v2, "_s"

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/Y1;->b0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v11

    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/A6;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v0

    iget-object v2, v10, LR2/b6;->d:Ljava/lang/String;

    sget-object v3, LR2/K;->j0:LR2/P1;

    invoke-virtual {v0, v2, v3}, LR2/g;->D(Ljava/lang/String;LR2/P1;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v13, 0x1

    goto :goto_1

    :cond_2
    move v13, v11

    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/A6;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v0

    iget-object v2, v10, LR2/b6;->d:Ljava/lang/String;

    sget-object v3, LR2/K;->i0:LR2/P1;

    invoke-virtual {v0, v2, v3}, LR2/g;->D(Ljava/lang/String;LR2/P1;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v14, 0x1

    goto :goto_2

    :cond_3
    move v14, v11

    :goto_2
    if-eqz v1, :cond_4

    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v2

    iget-object v3, v10, LR2/b6;->d:Ljava/lang/String;

    invoke-virtual {v2}, LR2/C5;->u()V

    invoke-virtual {v2}, LR2/m3;->n()V

    invoke-static {v3}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "current_session_count"

    invoke-virtual {v0, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    :try_start_0
    invoke-virtual {v2}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    const-string v5, "events"

    const-string v6, "app_id = ?"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v5, v0, v6, v7}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    invoke-virtual {v2}, LR2/m3;->j()LR2/Y1;

    move-result-object v2

    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    move-result-object v2

    const-string v4, "Error resetting session-scoped event counts. appId"

    invoke-static {v3}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v4, v3, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_4
    :goto_3
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    if-eqz v14, :cond_5

    if-eqz v13, :cond_5

    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v0

    iget-object v2, v10, LR2/b6;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, LR2/p;->O0(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    :cond_5
    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v2

    iget-object v3, v10, LR2/b6;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, LR2/p;->N0(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v15

    invoke-interface {v15}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1e

    new-instance v2, Ljava/util/HashSet;

    invoke-interface {v15}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    if-eqz v1, :cond_e

    iget-object v1, v10, LR2/b6;->d:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v3

    iget-object v4, v10, LR2/b6;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, LR2/p;->P0(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    invoke-static {v1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v15}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lt/a;

    invoke-direct {v1}, Lt/a;-><init>()V

    invoke-interface {v15}, Ljava/util/Map;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_d

    invoke-interface {v15}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    invoke-interface {v15, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/f2;

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    if-eqz v7, :cond_7

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_8

    :cond_7
    move-object/from16 v17, v3

    goto/16 :goto_8

    :cond_8
    invoke-virtual/range {p0 .. p0}, LR2/z5;->o()LR2/N5;

    move-result-object v8

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/f2;->Z()Ljava/util/List;

    move-result-object v9

    invoke-virtual {v8, v9, v7}, LR2/N5;->N(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/Y3;->x()Lcom/google/android/gms/internal/measurement/Y3$b;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/f2$a;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/f2$a;->y()Lcom/google/android/gms/internal/measurement/f2$a;

    move-result-object v9

    invoke-virtual {v9, v8}, Lcom/google/android/gms/internal/measurement/f2$a;->z(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/f2$a;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, LR2/z5;->o()LR2/N5;

    move-result-object v9

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/f2;->b0()Ljava/util/List;

    move-result-object v11

    invoke-virtual {v9, v11, v7}, LR2/N5;->N(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/f2$a;->C()Lcom/google/android/gms/internal/measurement/f2$a;

    move-result-object v11

    invoke-virtual {v11, v9}, Lcom/google/android/gms/internal/measurement/f2$a;->D(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/f2$a;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/f2;->Y()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_5
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_a

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v12, v16

    check-cast v12, Lcom/google/android/gms/internal/measurement/X1;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/X1;->k()I

    move-result v16

    move-object/from16 v17, v3

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v7, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    invoke-interface {v9, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    move-object/from16 v3, v17

    goto :goto_5

    :cond_a
    move-object/from16 v17, v3

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/f2$a;->w()Lcom/google/android/gms/internal/measurement/f2$a;

    move-result-object v3

    invoke-virtual {v3, v9}, Lcom/google/android/gms/internal/measurement/f2$a;->x(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/f2$a;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/f2;->a0()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_b
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/g2;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/g2;->K()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v7, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_b

    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_c
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/f2$a;->A()Lcom/google/android/gms/internal/measurement/f2$a;

    move-result-object v6

    invoke-virtual {v6, v3}, Lcom/google/android/gms/internal/measurement/f2$a;->B(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/f2$a;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v3, Lcom/google/android/gms/internal/measurement/f2;

    invoke-interface {v1, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_7
    move-object/from16 v3, v17

    const/4 v11, 0x0

    goto/16 :goto_4

    :goto_8
    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_d
    move-object v11, v1

    goto :goto_9

    :cond_e
    move-object v11, v15

    :goto_9
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_a
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1e

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/f2;

    new-instance v5, Ljava/util/BitSet;

    invoke-direct {v5}, Ljava/util/BitSet;-><init>()V

    new-instance v6, Ljava/util/BitSet;

    invoke-direct {v6}, Ljava/util/BitSet;-><init>()V

    new-instance v7, Lt/a;

    invoke-direct {v7}, Lt/a;-><init>()V

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/f2;->k()I

    move-result v2

    if-nez v2, :cond_f

    goto :goto_d

    :cond_f
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/f2;->Y()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_10
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/X1;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/X1;->O()Z

    move-result v4

    if-eqz v4, :cond_10

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/X1;->k()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/X1;->N()Z

    move-result v8

    if-eqz v8, :cond_11

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/X1;->K()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_c

    :cond_11
    const/4 v3, 0x0

    :goto_c
    invoke-interface {v7, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    :cond_12
    :goto_d
    new-instance v8, Lt/a;

    invoke-direct {v8}, Lt/a;-><init>()V

    if-eqz v1, :cond_15

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/f2;->N()I

    move-result v2

    if-nez v2, :cond_13

    goto :goto_10

    :cond_13
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/f2;->a0()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/g2;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/g2;->P()Z

    move-result v4

    if-eqz v4, :cond_14

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/g2;->k()I

    move-result v4

    if-lez v4, :cond_14

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/g2;->K()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/g2;->k()I

    move-result v16

    move-object/from16 p5, v2

    const/16 v17, 0x1

    add-int/lit8 v2, v16, -0x1

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/measurement/g2;->G(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v8, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_f

    :cond_14
    move-object/from16 p5, v2

    const/16 v17, 0x1

    :goto_f
    move-object/from16 v2, p5

    goto :goto_e

    :cond_15
    :goto_10
    const/16 v17, 0x1

    if-eqz v1, :cond_18

    const/4 v2, 0x0

    :goto_11
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/f2;->R()I

    move-result v3

    shl-int/lit8 v3, v3, 0x6

    if-ge v2, v3, :cond_18

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/f2;->b0()Ljava/util/List;

    move-result-object v3

    invoke-static {v3, v2}, LR2/N5;->d0(Ljava/util/List;I)Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v3

    invoke-virtual {v3}, LR2/Y1;->K()LR2/a2;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v16, v11

    const-string v11, "Filter already evaluated. audience ID, filter ID"

    invoke-virtual {v3, v11, v9, v4}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v2}, Ljava/util/BitSet;->set(I)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/f2;->Z()Ljava/util/List;

    move-result-object v3

    invoke-static {v3, v2}, LR2/N5;->d0(Ljava/util/List;I)Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-virtual {v5, v2}, Ljava/util/BitSet;->set(I)V

    goto :goto_12

    :cond_16
    move-object/from16 v16, v11

    :cond_17
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v7, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_12
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v11, v16

    goto :goto_11

    :cond_18
    move-object/from16 v16, v11

    invoke-interface {v15, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/google/android/gms/internal/measurement/f2;

    if-eqz v14, :cond_1d

    if-eqz v13, :cond_1d

    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_1d

    iget-object v2, v10, LR2/b6;->h:Ljava/lang/Long;

    if-eqz v2, :cond_1d

    iget-object v2, v10, LR2/b6;->g:Ljava/lang/Long;

    if-nez v2, :cond_19

    goto :goto_14

    :cond_19
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1a
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/x1;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/x1;->L()I

    move-result v3

    iget-object v11, v10, LR2/b6;->h:Ljava/lang/Long;

    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v18

    const-wide/16 v20, 0x3e8

    div-long v18, v18, v20

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/x1;->S()Z

    move-result v2

    if-eqz v2, :cond_1b

    iget-object v2, v10, LR2/b6;->g:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v18

    div-long v18, v18, v20

    :cond_1b
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v7, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1c

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-interface {v7, v2, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1c
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v8, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v8, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_13

    :cond_1d
    :goto_14
    new-instance v11, LR2/d6;

    iget-object v3, v10, LR2/b6;->d:Ljava/lang/String;

    const/16 v18, 0x0

    move-object v1, v11

    move-object/from16 v2, p0

    move-object/from16 p5, v12

    move-object v12, v9

    move-object/from16 v9, v18

    invoke-direct/range {v1 .. v9}, LR2/d6;-><init>(LR2/b6;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/f2;Ljava/util/BitSet;Ljava/util/BitSet;Ljava/util/Map;Ljava/util/Map;LR2/g6;)V

    iget-object v1, v10, LR2/b6;->f:Ljava/util/Map;

    invoke-interface {v1, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v12, p5

    move-object/from16 v11, v16

    goto/16 :goto_a

    :cond_1e
    const/16 v17, 0x1

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const-string v1, "Skipping failed audience ID"

    if-nez v0, :cond_26

    new-instance v0, LR2/f6;

    const/4 v2, 0x0

    invoke-direct {v0, v10, v2}, LR2/f6;-><init>(LR2/b6;LR2/b;)V

    new-instance v2, Lt/a;

    invoke-direct {v2}, Lt/a;-><init>()V

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_26

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/Y1;

    iget-object v5, v10, LR2/b6;->d:Ljava/lang/String;

    invoke-virtual {v0, v5, v4}, LR2/f6;->a(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/Y1;)Lcom/google/android/gms/internal/measurement/Y1;

    move-result-object v5

    if-eqz v5, :cond_1f

    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v6

    iget-object v7, v10, LR2/b6;->d:Ljava/lang/String;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/Y1;->b0()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/Y1;->b0()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v7, v9}, LR2/p;->C0(Ljava/lang/String;Ljava/lang/String;)LR2/E;

    move-result-object v9

    if-nez v9, :cond_20

    invoke-virtual {v6}, LR2/m3;->j()LR2/Y1;

    move-result-object v9

    invoke-virtual {v9}, LR2/Y1;->L()LR2/a2;

    move-result-object v9

    invoke-static {v7}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v6}, LR2/m3;->h()LR2/X1;

    move-result-object v6

    invoke-virtual {v6, v8}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "Event aggregate wasn\'t created during raw event logging. appId, event"

    invoke-virtual {v9, v8, v11, v6}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, LR2/E;

    move-object/from16 v18, v6

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/Y1;->b0()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/Y1;->Y()J

    move-result-wide v27

    const/16 v33, 0x0

    const/16 v34, 0x0

    const-wide/16 v21, 0x1

    const-wide/16 v23, 0x1

    const-wide/16 v25, 0x1

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    move-object/from16 v19, v7

    invoke-direct/range {v18 .. v34}, LR2/E;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    goto :goto_15

    :cond_20
    new-instance v6, LR2/E;

    move-object/from16 v35, v6

    iget-object v4, v9, LR2/E;->a:Ljava/lang/String;

    move-object/from16 v36, v4

    iget-object v4, v9, LR2/E;->b:Ljava/lang/String;

    move-object/from16 v37, v4

    iget-wide v7, v9, LR2/E;->c:J

    const-wide/16 v11, 0x1

    add-long v38, v7, v11

    iget-wide v7, v9, LR2/E;->d:J

    add-long v40, v7, v11

    iget-wide v7, v9, LR2/E;->e:J

    add-long v42, v7, v11

    iget-wide v7, v9, LR2/E;->f:J

    move-wide/from16 v44, v7

    iget-wide v7, v9, LR2/E;->g:J

    move-wide/from16 v46, v7

    iget-object v4, v9, LR2/E;->h:Ljava/lang/Long;

    move-object/from16 v48, v4

    iget-object v4, v9, LR2/E;->i:Ljava/lang/Long;

    move-object/from16 v49, v4

    iget-object v4, v9, LR2/E;->j:Ljava/lang/Long;

    move-object/from16 v50, v4

    iget-object v4, v9, LR2/E;->k:Ljava/lang/Boolean;

    move-object/from16 v51, v4

    invoke-direct/range {v35 .. v51}, LR2/E;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    :goto_15
    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v4

    invoke-virtual {v4, v6}, LR2/p;->T(LR2/E;)V

    iget-wide v7, v6, LR2/E;->c:J

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/Y1;->b0()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map;

    if-nez v9, :cond_21

    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v9

    iget-object v11, v10, LR2/b6;->d:Ljava/lang/String;

    invoke-virtual {v9, v11, v4}, LR2/p;->H0(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v9

    invoke-interface {v2, v4, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_21
    invoke-interface {v9}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_16
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v13, v10, LR2/b6;->e:Ljava/util/Set;

    invoke-interface {v13, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_22

    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v12

    invoke-virtual {v12}, LR2/Y1;->K()LR2/a2;

    move-result-object v12

    invoke-virtual {v12, v1, v11}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_16

    :cond_22
    invoke-interface {v9, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    move/from16 v14, v17

    :goto_17
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_24

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/google/android/gms/internal/measurement/x1;

    new-instance v15, LR2/h6;

    move-object/from16 p4, v0

    iget-object v0, v10, LR2/b6;->d:Ljava/lang/String;

    invoke-direct {v15, v10, v0, v12, v14}, LR2/h6;-><init>(LR2/b6;Ljava/lang/String;ILcom/google/android/gms/internal/measurement/x1;)V

    iget-object v0, v10, LR2/b6;->g:Ljava/lang/Long;

    move-object/from16 p5, v2

    iget-object v2, v10, LR2/b6;->h:Ljava/lang/Long;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/x1;->L()I

    move-result v14

    invoke-virtual {v10, v12, v14}, LR2/b6;->A(II)Z

    move-result v25

    move-object/from16 v18, v15

    move-object/from16 v19, v0

    move-object/from16 v20, v2

    move-object/from16 v21, v5

    move-wide/from16 v22, v7

    move-object/from16 v24, v6

    invoke-virtual/range {v18 .. v25}, LR2/h6;->k(Ljava/lang/Long;Ljava/lang/Long;Lcom/google/android/gms/internal/measurement/Y1;JLR2/E;Z)Z

    move-result v14

    if-eqz v14, :cond_23

    invoke-virtual {v10, v11}, LR2/b6;->y(Ljava/lang/Integer;)LR2/d6;

    move-result-object v0

    invoke-virtual {v0, v15}, LR2/d6;->c(LR2/d;)V

    move-object/from16 v0, p4

    move-object/from16 v2, p5

    goto :goto_17

    :cond_23
    iget-object v0, v10, LR2/b6;->e:Ljava/util/Set;

    invoke-interface {v0, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_18

    :cond_24
    move-object/from16 p4, v0

    move-object/from16 p5, v2

    :goto_18
    if-nez v14, :cond_25

    iget-object v0, v10, LR2/b6;->e:Ljava/util/Set;

    invoke-interface {v0, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_25
    move-object/from16 v0, p4

    move-object/from16 v2, p5

    goto/16 :goto_16

    :cond_26
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_32

    new-instance v0, Lt/a;

    invoke-direct {v0}, Lt/a;-><init>()V

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_27
    :goto_19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_32

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/h2;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/h2;->Z()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    if-nez v5, :cond_28

    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v5

    iget-object v6, v10, LR2/b6;->d:Ljava/lang/String;

    invoke-virtual {v5, v6, v4}, LR2/p;->J0(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_28
    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_29
    :goto_1a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_27

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v8, v10, LR2/b6;->e:Ljava/util/Set;

    invoke-interface {v8, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2a

    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v3

    invoke-virtual {v3}, LR2/Y1;->K()LR2/a2;

    move-result-object v3

    invoke-virtual {v3, v1, v6}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_19

    :cond_2a
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move/from16 v9, v17

    :goto_1b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_31

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/A1;

    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v11

    const/4 v12, 0x2

    invoke-virtual {v11, v12}, LR2/Y1;->C(I)Z

    move-result v11

    if-eqz v11, :cond_2c

    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v11

    invoke-virtual {v11}, LR2/Y1;->K()LR2/a2;

    move-result-object v11

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/A1;->P()Z

    move-result v12

    if-eqz v12, :cond_2b

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/A1;->k()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    goto :goto_1c

    :cond_2b
    const/4 v12, 0x0

    :goto_1c
    invoke-virtual/range {p0 .. p0}, LR2/m3;->h()LR2/X1;

    move-result-object v13

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/A1;->L()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v14, "Evaluating filter. audience, filter, property"

    invoke-virtual {v11, v14, v6, v12, v13}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v11

    invoke-virtual {v11}, LR2/Y1;->K()LR2/a2;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, LR2/z5;->o()LR2/N5;

    move-result-object v12

    invoke-virtual {v12, v9}, LR2/N5;->J(Lcom/google/android/gms/internal/measurement/A1;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "Filter definition"

    invoke-virtual {v11, v13, v12}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2c
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/A1;->P()Z

    move-result v11

    if-eqz v11, :cond_2f

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/A1;->k()I

    move-result v11

    const/16 v12, 0x100

    if-le v11, v12, :cond_2d

    goto :goto_1d

    :cond_2d
    new-instance v11, LR2/c;

    iget-object v12, v10, LR2/b6;->d:Ljava/lang/String;

    invoke-direct {v11, v10, v12, v7, v9}, LR2/c;-><init>(LR2/b6;Ljava/lang/String;ILcom/google/android/gms/internal/measurement/A1;)V

    iget-object v12, v10, LR2/b6;->g:Ljava/lang/Long;

    iget-object v13, v10, LR2/b6;->h:Ljava/lang/Long;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/A1;->k()I

    move-result v9

    invoke-virtual {v10, v7, v9}, LR2/b6;->A(II)Z

    move-result v9

    invoke-virtual {v11, v12, v13, v3, v9}, LR2/c;->k(Ljava/lang/Long;Ljava/lang/Long;Lcom/google/android/gms/internal/measurement/h2;Z)Z

    move-result v9

    if-eqz v9, :cond_2e

    invoke-virtual {v10, v6}, LR2/b6;->y(Ljava/lang/Integer;)LR2/d6;

    move-result-object v12

    invoke-virtual {v12, v11}, LR2/d6;->c(LR2/d;)V

    goto/16 :goto_1b

    :cond_2e
    iget-object v7, v10, LR2/b6;->e:Ljava/util/Set;

    invoke-interface {v7, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1f

    :cond_2f
    :goto_1d
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v7

    invoke-virtual {v7}, LR2/Y1;->L()LR2/a2;

    move-result-object v7

    iget-object v8, v10, LR2/b6;->d:Ljava/lang/String;

    invoke-static {v8}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/A1;->P()Z

    move-result v11

    if-eqz v11, :cond_30

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/A1;->k()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    goto :goto_1e

    :cond_30
    const/4 v9, 0x0

    :goto_1e
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const-string v11, "Invalid property filter ID. appId, id"

    invoke-virtual {v7, v11, v8, v9}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_20

    :cond_31
    :goto_1f
    if-nez v9, :cond_29

    :goto_20
    iget-object v7, v10, LR2/b6;->e:Ljava/util/Set;

    invoke-interface {v7, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1a

    :cond_32
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, v10, LR2/b6;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    iget-object v2, v10, LR2/b6;->e:Ljava/util/Set;

    invoke-interface {v0, v2}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_33
    :goto_21
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_34

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, v10, LR2/b6;->f:Ljava/util/Map;

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LR2/d6;

    invoke-static {v4}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4, v3}, LR2/d6;->a(I)Lcom/google/android/gms/internal/measurement/W1;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v4

    iget-object v5, v10, LR2/b6;->d:Ljava/lang/String;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/W1;->Q()Lcom/google/android/gms/internal/measurement/f2;

    move-result-object v3

    invoke-virtual {v4}, LR2/C5;->u()V

    invoke-virtual {v4}, LR2/m3;->n()V

    invoke-static {v5}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v3}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/j3;->h()[B

    move-result-object v3

    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    const-string v7, "app_id"

    invoke-virtual {v6, v7, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "audience_id"

    invoke-virtual {v6, v7, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v0, "current_results"

    invoke-virtual {v6, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    :try_start_1
    invoke-virtual {v4}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v3, "audience_filter_values"
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_2

    const/4 v7, 0x5

    const/4 v8, 0x0

    :try_start_2
    invoke-virtual {v0, v3, v8, v6, v7}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v6

    const-wide/16 v11, -0x1

    cmp-long v0, v6, v11

    if-nez v0, :cond_33

    invoke-virtual {v4}, LR2/m3;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    move-result-object v0

    const-string v3, "Failed to insert filter results (got -1). appId"

    invoke-static {v5}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, v3, v6}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_21

    :catch_1
    move-exception v0

    goto :goto_22

    :catch_2
    move-exception v0

    const/4 v8, 0x0

    :goto_22
    invoke-virtual {v4}, LR2/m3;->j()LR2/Y1;

    move-result-object v3

    invoke-virtual {v3}, LR2/Y1;->G()LR2/a2;

    move-result-object v3

    const-string v4, "Error storing filter results. appId"

    invoke-static {v5}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v4, v5, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_21

    :cond_34
    return-object v1
.end method
