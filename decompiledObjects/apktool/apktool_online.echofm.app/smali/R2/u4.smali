.class public final LR2/u4;
.super LR2/C5;
.source "SourceFile"


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

.method private static c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/SecurityException;

    .line 2
    .line 3
    const-string p1, "This implementation should not be used."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method


# virtual methods
.method public final x()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final y(LR2/I;Ljava/lang/String;)[B
    .locals 31

    .line 1
    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v15, p2

    const-string v2, "_r"

    invoke-virtual/range {p0 .. p0}, LR2/m3;->n()V

    iget-object v3, v1, LR2/m3;->a:LR2/N2;

    invoke-virtual {v3}, LR2/N2;->Q()V

    invoke-static/range {p1 .. p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v3

    sget-object v4, LR2/K;->f0:LR2/P1;

    invoke-virtual {v3, v15, v4}, LR2/g;->B(Ljava/lang/String;LR2/P1;)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    move-result-object v0

    const-string v2, "Generating ScionPayload disabled. packageName"

    invoke-virtual {v0, v2, v15}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v4, [B

    return-object v0

    :cond_0
    iget-object v3, v0, LR2/I;->o:Ljava/lang/String;

    const-string v5, "_iap"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v14, 0x0

    if-nez v3, :cond_1

    const-string v3, "_iapx"

    iget-object v5, v0, LR2/I;->o:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v2

    invoke-virtual {v2}, LR2/Y1;->F()LR2/a2;

    move-result-object v2

    const-string v3, "Generating a payload for this event is not available. package_name, event_name"

    iget-object v0, v0, LR2/I;->o:Ljava/lang/String;

    invoke-virtual {v2, v3, v15, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v14

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/c2;->J()Lcom/google/android/gms/internal/measurement/c2$a;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v3

    invoke-virtual {v3}, LR2/p;->Q0()V

    :try_start_0
    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v3

    invoke-virtual {v3, v15}, LR2/p;->D0(Ljava/lang/String;)LR2/I2;

    move-result-object v11

    if-nez v11, :cond_2

    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    move-result-object v0

    const-string v2, "Log and bundle not available. package_name"

    invoke-virtual {v0, v2, v15}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v4, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v2

    invoke-virtual {v2}, LR2/p;->R0()V

    return-object v0

    :catchall_0
    move-exception v0

    goto/16 :goto_a

    :cond_2
    :try_start_1
    invoke-virtual {v11}, LR2/I2;->r()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    move-result-object v0

    const-string v2, "Log and bundle disabled. package_name"

    invoke-virtual {v0, v2, v15}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v4, [B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v2

    invoke-virtual {v2}, LR2/p;->R0()V

    return-object v0

    :cond_3
    :try_start_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/d2;->A3()Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v3

    const/4 v12, 0x1

    invoke-virtual {v3, v12}, Lcom/google/android/gms/internal/measurement/d2$a;->m0(I)Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v3

    const-string v5, "android"

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/measurement/d2$a;->O0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v9

    invoke-virtual {v11}, LR2/I2;->t0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v11}, LR2/I2;->t0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v3}, Lcom/google/android/gms/internal/measurement/d2$a;->O(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_4
    invoke-virtual {v11}, LR2/I2;->v0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v11}, LR2/I2;->v0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v9, v3}, Lcom/google/android/gms/internal/measurement/d2$a;->a0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_5
    invoke-virtual {v11}, LR2/I2;->h()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v11}, LR2/I2;->h()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v9, v3}, Lcom/google/android/gms/internal/measurement/d2$a;->g0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_6
    invoke-virtual {v11}, LR2/I2;->z()J

    move-result-wide v5

    const-wide/32 v7, -0x80000000

    cmp-long v3, v5, v7

    if-eqz v3, :cond_7

    invoke-virtual {v11}, LR2/I2;->z()J

    move-result-wide v5

    long-to-int v3, v5

    invoke-virtual {v9, v3}, Lcom/google/android/gms/internal/measurement/d2$a;->d0(I)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_7
    invoke-virtual {v11}, LR2/I2;->g0()J

    move-result-wide v5

    invoke-virtual {v9, v5, v6}, Lcom/google/android/gms/internal/measurement/d2$a;->j0(J)Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v3

    invoke-virtual {v11}, LR2/I2;->c0()J

    move-result-wide v5

    invoke-virtual {v3, v5, v6}, Lcom/google/android/gms/internal/measurement/d2$a;->Y(J)Lcom/google/android/gms/internal/measurement/d2$a;

    invoke-virtual {v11}, LR2/I2;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11}, LR2/I2;->r0()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_8

    invoke-virtual {v9, v3}, Lcom/google/android/gms/internal/measurement/d2$a;->I0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    goto :goto_0

    :cond_8
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_9

    invoke-virtual {v9, v5}, Lcom/google/android/gms/internal/measurement/d2$a;->I(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_9
    :goto_0
    invoke-virtual {v11}, LR2/I2;->p0()J

    move-result-wide v5

    invoke-virtual {v9, v5, v6}, Lcom/google/android/gms/internal/measurement/d2$a;->y0(J)Lcom/google/android/gms/internal/measurement/d2$a;

    iget-object v3, v1, LR2/z5;->b:LR2/D5;

    invoke-virtual {v3, v15}, LR2/D5;->Q(Ljava/lang/String;)LR2/q3;

    move-result-object v3

    invoke-virtual {v11}, LR2/I2;->a0()J

    move-result-wide v5

    invoke-virtual {v9, v5, v6}, Lcom/google/android/gms/internal/measurement/d2$a;->S(J)Lcom/google/android/gms/internal/measurement/d2$a;

    iget-object v5, v1, LR2/m3;->a:LR2/N2;

    invoke-virtual {v5}, LR2/N2;->p()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v5

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/d2$a;->S0()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, LR2/g;->K(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-virtual {v3}, LR2/q3;->x()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_a

    invoke-virtual {v9, v14}, Lcom/google/android/gms/internal/measurement/d2$a;->z0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_a
    invoke-virtual {v3}, LR2/q3;->v()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9, v5}, Lcom/google/android/gms/internal/measurement/d2$a;->o0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    invoke-virtual {v3}, LR2/q3;->x()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual {v11}, LR2/I2;->q()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual/range {p0 .. p0}, LR2/z5;->s()LR2/g5;

    move-result-object v5

    invoke-virtual {v11}, LR2/I2;->t0()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, v3}, LR2/g5;->z(Ljava/lang/String;LR2/q3;)Landroid/util/Pair;

    move-result-object v5

    invoke-virtual {v11}, LR2/I2;->q()Z

    move-result v6

    if-eqz v6, :cond_b

    if-eqz v5, :cond_b

    iget-object v6, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v6, :cond_b

    :try_start_3
    iget-object v6, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-wide v7, v0, LR2/I;->r:J

    invoke-static {v7, v8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, LR2/u4;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9, v6}, Lcom/google/android/gms/internal/measurement/d2$a;->Q0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;
    :try_end_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz v5, :cond_b

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-virtual {v9, v5}, Lcom/google/android/gms/internal/measurement/d2$a;->V(Z)Lcom/google/android/gms/internal/measurement/d2$a;

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v2

    invoke-virtual {v2}, LR2/Y1;->F()LR2/a2;

    move-result-object v2

    const-string v3, "Resettable device id encryption failed"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v4, [B
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v2

    invoke-virtual {v2}, LR2/p;->R0()V

    return-object v0

    :cond_b
    :goto_1
    :try_start_5
    invoke-virtual/range {p0 .. p0}, LR2/m3;->g()LR2/C;

    move-result-object v5

    invoke-virtual {v5}, LR2/l3;->o()V

    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v9, v5}, Lcom/google/android/gms/internal/measurement/d2$a;->w0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, LR2/m3;->g()LR2/C;

    move-result-object v6

    invoke-virtual {v6}, LR2/l3;->o()V

    sget-object v6, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/d2$a;->M0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, LR2/m3;->g()LR2/C;

    move-result-object v6

    invoke-virtual {v6}, LR2/C;->v()J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/d2$a;->u0(I)Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, LR2/m3;->g()LR2/C;

    move-result-object v6

    invoke-virtual {v6}, LR2/C;->w()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/d2$a;->T0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    invoke-virtual {v3}, LR2/q3;->y()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-virtual {v11}, LR2/I2;->u0()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-virtual {v11}, LR2/I2;->u0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-wide v5, v0, LR2/I;->r:J

    invoke-static {v5, v6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, LR2/u4;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v3}, Lcom/google/android/gms/internal/measurement/d2$a;->U(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;
    :try_end_6
    .catch Ljava/lang/SecurityException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_2

    :catch_1
    move-exception v0

    goto/16 :goto_9

    :cond_c
    :goto_2
    :try_start_7
    invoke-virtual {v11}, LR2/I2;->i()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_d

    invoke-virtual {v11}, LR2/I2;->i()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v9, v3}, Lcom/google/android/gms/internal/measurement/d2$a;->G0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_d
    invoke-virtual {v11}, LR2/I2;->t0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v5

    invoke-virtual {v5, v3}, LR2/p;->M0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_f

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LR2/T5;

    const-string v8, "_lte"

    iget-object v10, v7, LR2/T5;->c:Ljava/lang/String;

    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_e

    goto :goto_3

    :cond_f
    move-object v7, v14

    :goto_3
    const-wide/16 v23, 0x0

    if-eqz v7, :cond_10

    iget-object v6, v7, LR2/T5;->e:Ljava/lang/Object;

    if-nez v6, :cond_11

    :cond_10
    new-instance v6, LR2/T5;

    const-string v18, "auto"

    const-string v19, "_lte"

    invoke-virtual/range {p0 .. p0}, LR2/m3;->b()LE2/e;

    move-result-object v7

    invoke-interface {v7}, LE2/e;->a()J

    move-result-wide v20

    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v22

    move-object/from16 v16, v6

    move-object/from16 v17, v3

    invoke-direct/range {v16 .. v22}, LR2/T5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v3

    invoke-virtual {v3, v6}, LR2/p;->d0(LR2/T5;)Z

    :cond_11
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [Lcom/google/android/gms/internal/measurement/h2;

    :goto_4
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    if-ge v4, v6, :cond_12

    invoke-static {}, Lcom/google/android/gms/internal/measurement/h2;->X()Lcom/google/android/gms/internal/measurement/h2$a;

    move-result-object v6

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LR2/T5;

    iget-object v7, v7, LR2/T5;->c:Ljava/lang/String;

    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/measurement/h2$a;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/h2$a;

    move-result-object v6

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LR2/T5;

    iget-wide v7, v7, LR2/T5;->d:J

    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/internal/measurement/h2$a;->B(J)Lcom/google/android/gms/internal/measurement/h2$a;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, LR2/z5;->o()LR2/N5;

    move-result-object v7

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LR2/T5;

    iget-object v8, v8, LR2/T5;->e:Ljava/lang/Object;

    invoke-virtual {v7, v6, v8}, LR2/N5;->U(Lcom/google/android/gms/internal/measurement/h2$a;Ljava/lang/Object;)V

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v6, Lcom/google/android/gms/internal/measurement/h2;

    aput-object v6, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_12
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v9, v3}, Lcom/google/android/gms/internal/measurement/d2$a;->f0(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/d2$a;

    invoke-virtual/range {p0 .. p0}, LR2/z5;->o()LR2/N5;

    move-result-object v3

    invoke-virtual {v3, v9}, LR2/N5;->T(Lcom/google/android/gms/internal/measurement/d2$a;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v3

    sget-object v4, LR2/K;->T0:LR2/P1;

    invoke-virtual {v3, v4}, LR2/g;->s(LR2/P1;)Z

    move-result v3

    if-eqz v3, :cond_13

    iget-object v3, v1, LR2/z5;->b:LR2/D5;

    invoke-virtual {v3, v11, v9}, LR2/D5;->s(LR2/I2;Lcom/google/android/gms/internal/measurement/d2$a;)V

    :cond_13
    invoke-static/range {p1 .. p1}, LR2/c2;->b(LR2/I;)LR2/c2;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, LR2/m3;->k()LR2/S5;

    move-result-object v4

    iget-object v5, v3, LR2/c2;->d:Landroid/os/Bundle;

    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v6

    invoke-virtual {v6, v15}, LR2/p;->B0(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, LR2/S5;->Q(Landroid/os/Bundle;Landroid/os/Bundle;)V

    invoke-virtual/range {p0 .. p0}, LR2/m3;->k()LR2/S5;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v5

    invoke-virtual {v5, v15}, LR2/g;->y(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v4, v3, v5}, LR2/S5;->K(LR2/c2;I)V

    iget-object v10, v3, LR2/c2;->d:Landroid/os/Bundle;

    const-string v3, "_c"

    const-wide/16 v4, 0x1

    invoke-virtual {v10, v3, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v3

    invoke-virtual {v3}, LR2/Y1;->F()LR2/a2;

    move-result-object v3

    const-string v6, "Marking in-app purchase as real-time"

    invoke-virtual {v3, v6}, LR2/a2;->a(Ljava/lang/String;)V

    invoke-virtual {v10, v2, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v3, "_o"

    iget-object v6, v0, LR2/I;->q:Ljava/lang/String;

    invoke-virtual {v10, v3, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LR2/m3;->k()LR2/S5;

    move-result-object v3

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/d2$a;->S0()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, LR2/S5;->F0(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-virtual/range {p0 .. p0}, LR2/m3;->k()LR2/S5;

    move-result-object v3

    const-string v6, "_dbg"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v3, v10, v6, v7}, LR2/S5;->R(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LR2/m3;->k()LR2/S5;

    move-result-object v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v3, v10, v2, v4}, LR2/S5;->R(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_14
    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v2

    iget-object v3, v0, LR2/I;->o:Ljava/lang/String;

    invoke-virtual {v2, v15, v3}, LR2/p;->C0(Ljava/lang/String;Ljava/lang/String;)LR2/E;

    move-result-object v2

    if-nez v2, :cond_15

    new-instance v17, LR2/E;

    iget-object v4, v0, LR2/I;->o:Ljava/lang/String;

    iget-wide v7, v0, LR2/I;->r:J

    const/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v2, v17

    move-object/from16 v3, p2

    move-wide/from16 v27, v7

    move-wide/from16 v7, v19

    move-object/from16 v29, v9

    move-object/from16 v19, v10

    move-wide/from16 v9, v27

    move-object/from16 v20, v11

    move-wide/from16 v11, v21

    move-object/from16 v30, v13

    move-object/from16 v13, v25

    move-object/from16 v21, v14

    move-object/from16 v14, v26

    move-object/from16 v15, v16

    move-object/from16 v16, v18

    invoke-direct/range {v2 .. v16}, LR2/E;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    move-object/from16 v12, v17

    move-wide/from16 v9, v23

    goto :goto_5

    :cond_15
    move-object/from16 v29, v9

    move-object/from16 v19, v10

    move-object/from16 v20, v11

    move-object/from16 v30, v13

    move-object/from16 v21, v14

    iget-wide v3, v2, LR2/E;->f:J

    iget-wide v5, v0, LR2/I;->r:J

    invoke-virtual {v2, v5, v6}, LR2/E;->a(J)LR2/E;

    move-result-object v17

    move-wide v9, v3

    move-object/from16 v12, v17

    :goto_5
    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v2

    invoke-virtual {v2, v12}, LR2/p;->T(LR2/E;)V

    new-instance v13, LR2/A;

    iget-object v3, v1, LR2/m3;->a:LR2/N2;

    iget-object v4, v0, LR2/I;->q:Ljava/lang/String;

    iget-object v6, v0, LR2/I;->o:Ljava/lang/String;

    iget-wide v7, v0, LR2/I;->r:J

    move-object v2, v13

    move-object/from16 v5, p2

    move-object/from16 v11, v19

    invoke-direct/range {v2 .. v11}, LR2/A;-><init>(LR2/N2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/Y1;->Z()Lcom/google/android/gms/internal/measurement/Y1$a;

    move-result-object v2

    iget-wide v3, v13, LR2/A;->d:J

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/Y1$a;->G(J)Lcom/google/android/gms/internal/measurement/Y1$a;

    move-result-object v2

    iget-object v3, v13, LR2/A;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/measurement/Y1$a;->E(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/Y1$a;

    move-result-object v2

    iget-wide v3, v13, LR2/A;->e:J

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/Y1$a;->A(J)Lcom/google/android/gms/internal/measurement/Y1$a;

    move-result-object v2

    iget-object v3, v13, LR2/A;->f:LR2/D;

    invoke-virtual {v3}, LR2/D;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_16
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_17

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/a2;->Z()Lcom/google/android/gms/internal/measurement/a2$a;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/measurement/a2$a;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;

    move-result-object v5

    iget-object v6, v13, LR2/A;->f:LR2/D;

    invoke-virtual {v6, v4}, LR2/D;->k(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_16

    invoke-virtual/range {p0 .. p0}, LR2/z5;->o()LR2/N5;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, LR2/N5;->S(Lcom/google/android/gms/internal/measurement/a2$a;Ljava/lang/Object;)V

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/measurement/Y1$a;->B(Lcom/google/android/gms/internal/measurement/a2$a;)Lcom/google/android/gms/internal/measurement/Y1$a;

    goto :goto_6

    :cond_17
    move-object/from16 v3, v29

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/measurement/d2$a;->D(Lcom/google/android/gms/internal/measurement/Y1$a;)Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/measurement/e2;->G()Lcom/google/android/gms/internal/measurement/e2$b;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/measurement/Z1;->G()Lcom/google/android/gms/internal/measurement/Z1$a;

    move-result-object v6

    iget-wide v7, v12, LR2/E;->c:J

    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/internal/measurement/Z1$a;->w(J)Lcom/google/android/gms/internal/measurement/Z1$a;

    move-result-object v6

    iget-object v0, v0, LR2/I;->o:Ljava/lang/String;

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/measurement/Z1$a;->x(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/Z1$a;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/measurement/e2$b;->w(Lcom/google/android/gms/internal/measurement/Z1$a;)Lcom/google/android/gms/internal/measurement/e2$b;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/measurement/d2$a;->E(Lcom/google/android/gms/internal/measurement/e2$b;)Lcom/google/android/gms/internal/measurement/d2$a;

    invoke-virtual/range {p0 .. p0}, LR2/z5;->p()LR2/b6;

    move-result-object v5

    invoke-virtual/range {v20 .. v20}, LR2/I2;->t0()Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/d2$a;->Z0()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/Y1$a;->I()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/Y1$a;->I()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-virtual/range {v5 .. v10}, LR2/b6;->z(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/measurement/d2$a;->H(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/d2$a;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/Y1$a;->M()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/Y1$a;->I()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/measurement/d2$a;->v0(J)Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v0

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/Y1$a;->I()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/internal/measurement/d2$a;->e0(J)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_18
    invoke-virtual/range {v20 .. v20}, LR2/I2;->i0()J

    move-result-wide v4

    cmp-long v0, v4, v23

    if-eqz v0, :cond_19

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/measurement/d2$a;->n0(J)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_19
    invoke-virtual/range {v20 .. v20}, LR2/I2;->m0()J

    move-result-wide v6

    cmp-long v2, v6, v23

    if-eqz v2, :cond_1a

    invoke-virtual {v3, v6, v7}, Lcom/google/android/gms/internal/measurement/d2$a;->r0(J)Lcom/google/android/gms/internal/measurement/d2$a;

    goto :goto_7

    :cond_1a
    if-eqz v0, :cond_1b

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/measurement/d2$a;->r0(J)Lcom/google/android/gms/internal/measurement/d2$a;

    :cond_1b
    :goto_7
    invoke-virtual/range {v20 .. v20}, LR2/I2;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/s7;->a()Z

    move-result v2

    if-eqz v2, :cond_1c

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v2

    sget-object v4, LR2/K;->y0:LR2/P1;

    move-object/from16 v5, p2

    invoke-virtual {v2, v5, v4}, LR2/g;->B(Ljava/lang/String;LR2/P1;)Z

    move-result v2

    if-eqz v2, :cond_1d

    if-eqz v0, :cond_1d

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/measurement/d2$a;->R0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;

    goto :goto_8

    :cond_1c
    move-object/from16 v5, p2

    :cond_1d
    :goto_8
    invoke-virtual/range {v20 .. v20}, LR2/I2;->p()V

    invoke-virtual/range {v20 .. v20}, LR2/I2;->k0()J

    move-result-wide v6

    long-to-int v0, v6

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/measurement/d2$a;->i0(I)Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v0

    const-wide/32 v6, 0x14051

    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/internal/measurement/d2$a;->F0(J)Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, LR2/m3;->b()LE2/e;

    move-result-object v2

    invoke-interface {v2}, LE2/e;->a()J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/internal/measurement/d2$a;->C0(J)Lcom/google/android/gms/internal/measurement/d2$a;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/d2$a;->b0(Z)Lcom/google/android/gms/internal/measurement/d2$a;

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v0

    sget-object v2, LR2/K;->C0:LR2/P1;

    invoke-virtual {v0, v2}, LR2/g;->s(LR2/P1;)Z

    move-result v0

    if-eqz v0, :cond_1e

    iget-object v0, v1, LR2/z5;->b:LR2/D5;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/d2$a;->S0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v3}, LR2/D5;->E(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/d2$a;)V

    :cond_1e
    move-object/from16 v0, v30

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/c2$a;->x(Lcom/google/android/gms/internal/measurement/d2$a;)Lcom/google/android/gms/internal/measurement/c2$a;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/d2$a;->W()J

    move-result-wide v6

    move-object/from16 v2, v20

    invoke-virtual {v2, v6, v7}, LR2/I2;->j0(J)V

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/d2$a;->Q()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, LR2/I2;->f0(J)V

    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v3

    invoke-virtual {v3, v2}, LR2/p;->U(LR2/I2;)V

    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v2

    invoke-virtual {v2}, LR2/p;->T0()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v2

    invoke-virtual {v2}, LR2/p;->R0()V

    :try_start_8
    invoke-virtual/range {p0 .. p0}, LR2/z5;->o()LR2/N5;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y3;

    check-cast v0, Lcom/google/android/gms/internal/measurement/c2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/j3;->h()[B

    move-result-object v0

    invoke-virtual {v2, v0}, LR2/N5;->g0([B)[B

    move-result-object v0
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    return-object v0

    :catch_2
    move-exception v0

    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v2

    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    move-result-object v2

    const-string v3, "Data loss. Failed to bundle and serialize. appId"

    invoke-static/range {p2 .. p2}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v21

    :goto_9
    :try_start_9
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v2

    invoke-virtual {v2}, LR2/Y1;->F()LR2/a2;

    move-result-object v2

    const-string v3, "app instance id encryption failed"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v4, [B
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v2

    invoke-virtual {v2}, LR2/p;->R0()V

    return-object v0

    :goto_a
    invoke-virtual/range {p0 .. p0}, LR2/z5;->q()LR2/p;

    move-result-object v2

    invoke-virtual {v2}, LR2/p;->R0()V

    throw v0
.end method
