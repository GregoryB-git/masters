.class public abstract Lcom/google/android/gms/internal/measurement/H;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/google/android/gms/internal/measurement/g;Lcom/google/android/gms/internal/measurement/f3;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/g;
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0, v0}, Lcom/google/android/gms/internal/measurement/H;->b(Lcom/google/android/gms/internal/measurement/g;Lcom/google/android/gms/internal/measurement/f3;Lcom/google/android/gms/internal/measurement/n;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/g;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lcom/google/android/gms/internal/measurement/g;Lcom/google/android/gms/internal/measurement/f3;Lcom/google/android/gms/internal/measurement/n;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/g;
    .locals 7

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/g;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/g;->Z()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/measurement/g;->Y(I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/measurement/g;->M(I)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/measurement/k;

    int-to-double v5, v2

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/google/android/gms/internal/measurement/k;-><init>(Ljava/lang/Double;)V

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/google/android/gms/internal/measurement/s;

    const/4 v6, 0x0

    aput-object v3, v5, v6

    const/4 v3, 0x1

    aput-object v4, v5, v3

    const/4 v3, 0x2

    aput-object p0, v5, v3

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {p2, p1, v3}, Lcom/google/android/gms/internal/measurement/n;->b(Lcom/google/android/gms/internal/measurement/f3;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/s;->d()Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4, p3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    return-object v0

    :cond_1
    if-eqz p4, :cond_2

    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/s;->d()Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4, p4}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    :cond_2
    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/measurement/g;->X(ILcom/google/android/gms/internal/measurement/s;)V

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static c(Lcom/google/android/gms/internal/measurement/g;Lcom/google/android/gms/internal/measurement/f3;Ljava/util/List;Z)Lcom/google/android/gms/internal/measurement/s;
    .locals 10

    .line 1
    const-string v0, "reduce"

    const/4 v1, 0x1

    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/measurement/C2;->k(Ljava/lang/String;ILjava/util/List;)V

    const/4 v2, 0x2

    invoke-static {v0, v2, p2}, Lcom/google/android/gms/internal/measurement/C2;->n(Ljava/lang/String;ILjava/util/List;)V

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v3

    instance-of v4, v3, Lcom/google/android/gms/internal/measurement/n;

    if-eqz v4, :cond_a

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v4

    if-ne v4, v2, :cond_1

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object p2

    instance-of v4, p2, Lcom/google/android/gms/internal/measurement/l;

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Failed to parse initial value"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result p2

    if-eqz p2, :cond_9

    const/4 p2, 0x0

    :goto_0
    check-cast v3, Lcom/google/android/gms/internal/measurement/n;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v4

    if-eqz p3, :cond_2

    move v5, v0

    goto :goto_1

    :cond_2
    add-int/lit8 v5, v4, -0x1

    :goto_1
    if-eqz p3, :cond_3

    sub-int/2addr v4, v1

    goto :goto_2

    :cond_3
    move v4, v0

    :goto_2
    if-eqz p3, :cond_4

    move p3, v1

    goto :goto_3

    :cond_4
    const/4 p3, -0x1

    :goto_3
    if-nez p2, :cond_5

    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/measurement/g;->M(I)Lcom/google/android/gms/internal/measurement/s;

    move-result-object p2

    goto :goto_5

    :cond_5
    :goto_4
    sub-int v6, v4, v5

    mul-int/2addr v6, p3

    if-ltz v6, :cond_8

    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/measurement/g;->Y(I)Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/measurement/g;->M(I)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v6

    new-instance v7, Lcom/google/android/gms/internal/measurement/k;

    int-to-double v8, v5

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    invoke-direct {v7, v8}, Lcom/google/android/gms/internal/measurement/k;-><init>(Ljava/lang/Double;)V

    const/4 v8, 0x4

    new-array v8, v8, [Lcom/google/android/gms/internal/measurement/s;

    aput-object p2, v8, v0

    aput-object v6, v8, v1

    aput-object v7, v8, v2

    const/4 p2, 0x3

    aput-object p0, v8, p2

    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {v3, p1, p2}, Lcom/google/android/gms/internal/measurement/n;->b(Lcom/google/android/gms/internal/measurement/f3;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object p2

    instance-of v6, p2, Lcom/google/android/gms/internal/measurement/l;

    if-nez v6, :cond_6

    goto :goto_5

    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Reduce operation failed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    :goto_5
    add-int/2addr v5, p3

    goto :goto_4

    :cond_8
    return-object p2

    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Empty array with no initial value error"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Callback should be a method"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static d(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/g;Lcom/google/android/gms/internal/measurement/f3;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/s;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->hashCode()I

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->hashCode()I

    move-result v5

    const-string v6, "indexOf"

    const-string v7, "reverse"

    const-string v8, "slice"

    const-string v9, "shift"

    const-string v10, "every"

    const-string v11, "sort"

    const-string v12, "some"

    const-string v13, "join"

    const-string v14, "pop"

    const-string v15, "map"

    const-string v4, "lastIndexOf"

    const-string v1, "forEach"

    const-string v2, "filter"

    const-string v3, "toString"

    move-object/from16 v16, v3

    const/16 v17, -0x1

    sparse-switch v5, :sswitch_data_0

    :goto_0
    move-object/from16 v5, v16

    :goto_1
    move/from16 v0, v17

    goto/16 :goto_3

    :sswitch_0
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x13

    :goto_2
    move-object/from16 v5, v16

    goto/16 :goto_3

    :sswitch_1
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0x12

    goto :goto_2

    :sswitch_2
    const-string v5, "reduceRight"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/16 v0, 0x11

    goto :goto_2

    :sswitch_3
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/16 v0, 0x10

    goto :goto_2

    :sswitch_4
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/16 v0, 0xf

    goto :goto_2

    :sswitch_5
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/16 v0, 0xe

    goto :goto_2

    :sswitch_6
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/16 v0, 0xd

    goto :goto_2

    :sswitch_7
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    const/16 v0, 0xc

    goto :goto_2

    :sswitch_8
    const-string v5, "push"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    const/16 v0, 0xb

    goto :goto_2

    :sswitch_9
    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    const/16 v0, 0xa

    goto :goto_2

    :sswitch_a
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_0

    :cond_a
    const/16 v0, 0x9

    goto :goto_2

    :sswitch_b
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v0, 0x8

    goto :goto_2

    :sswitch_c
    const-string v5, "unshift"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_0

    :cond_c
    const/4 v0, 0x7

    goto/16 :goto_2

    :sswitch_d
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_0

    :cond_d
    const/4 v0, 0x6

    goto/16 :goto_2

    :sswitch_e
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_0

    :cond_e
    const/4 v0, 0x5

    goto/16 :goto_2

    :sswitch_f
    const-string v5, "splice"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_0

    :cond_f
    const/4 v0, 0x4

    goto/16 :goto_2

    :sswitch_10
    const-string v5, "reduce"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_0

    :cond_10
    move-object/from16 v5, v16

    const/4 v0, 0x3

    goto :goto_3

    :sswitch_11
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_0

    :cond_11
    move-object/from16 v5, v16

    const/4 v0, 0x2

    goto :goto_3

    :sswitch_12
    const-string v5, "concat"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto/16 :goto_0

    :cond_12
    move-object/from16 v5, v16

    const/4 v0, 0x1

    goto :goto_3

    :sswitch_13
    move-object/from16 v5, v16

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_1

    :cond_13
    const/4 v0, 0x0

    :goto_3
    const-wide/high16 v18, -0x4010000000000000L    # -1.0

    const-string v3, "Callback should be a method"

    move-object/from16 v20, v1

    move-object/from16 v21, v2

    const-wide/16 v1, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Command not supported"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    move-object/from16 v0, p3

    const/4 v3, 0x2

    invoke-static {v6, v3, v0}, Lcom/google/android/gms/internal/measurement/C2;->n(Ljava/lang/String;ILjava/util/List;)V

    sget-object v3, Lcom/google/android/gms/internal/measurement/s;->d:Lcom/google/android/gms/internal/measurement/s;

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_14

    const/4 v4, 0x0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/s;

    move-object/from16 v5, p2

    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v3

    goto :goto_4

    :cond_14
    move-object/from16 v5, p2

    :goto_4
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v4

    const/4 v6, 0x1

    if-le v4, v6, :cond_17

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/s;->f()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/measurement/C2;->a(D)D

    move-result-wide v4

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v0

    int-to-double v6, v0

    cmpl-double v0, v4, v6

    if-ltz v0, :cond_15

    new-instance v0, Lcom/google/android/gms/internal/measurement/k;

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/k;-><init>(Ljava/lang/Double;)V

    return-object v0

    :cond_15
    cmpg-double v0, v4, v1

    if-gez v0, :cond_16

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v0

    int-to-double v0, v0

    add-double v1, v0, v4

    goto :goto_5

    :cond_16
    move-wide v1, v4

    :cond_17
    :goto_5
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->Z()Ljava/util/Iterator;

    move-result-object v0

    :cond_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-double v5, v4

    cmpg-double v7, v5, v1

    move-object/from16 v15, p1

    if-ltz v7, :cond_18

    invoke-virtual {v15, v4}, Lcom/google/android/gms/internal/measurement/g;->M(I)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v4

    invoke-static {v4, v3}, Lcom/google/android/gms/internal/measurement/C2;->h(Lcom/google/android/gms/internal/measurement/s;Lcom/google/android/gms/internal/measurement/s;)Z

    move-result v4

    if-eqz v4, :cond_18

    new-instance v0, Lcom/google/android/gms/internal/measurement/k;

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/k;-><init>(Ljava/lang/Double;)V

    return-object v0

    :cond_19
    new-instance v0, Lcom/google/android/gms/internal/measurement/k;

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/k;-><init>(Ljava/lang/Double;)V

    return-object v0

    :pswitch_1
    move-object/from16 v15, p1

    move-object/from16 v0, p3

    const/4 v1, 0x0

    invoke-static {v7, v1, v0}, Lcom/google/android/gms/internal/measurement/C2;->g(Ljava/lang/String;ILjava/util/List;)V

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v0

    if-eqz v0, :cond_1c

    const/4 v1, 0x2

    const/4 v3, 0x0

    :goto_6
    div-int/lit8 v2, v0, 0x2

    if-ge v3, v2, :cond_1c

    invoke-virtual {v15, v3}, Lcom/google/android/gms/internal/measurement/g;->Y(I)Z

    move-result v1

    if-eqz v1, :cond_1b

    invoke-virtual {v15, v3}, Lcom/google/android/gms/internal/measurement/g;->M(I)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v15, v3, v2}, Lcom/google/android/gms/internal/measurement/g;->X(ILcom/google/android/gms/internal/measurement/s;)V

    const/4 v2, 0x1

    add-int/lit8 v4, v0, -0x1

    sub-int/2addr v4, v3

    invoke-virtual {v15, v4}, Lcom/google/android/gms/internal/measurement/g;->Y(I)Z

    move-result v5

    if-eqz v5, :cond_1a

    invoke-virtual {v15, v4}, Lcom/google/android/gms/internal/measurement/g;->M(I)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v5

    invoke-virtual {v15, v3, v5}, Lcom/google/android/gms/internal/measurement/g;->X(ILcom/google/android/gms/internal/measurement/s;)V

    :cond_1a
    invoke-virtual {v15, v4, v1}, Lcom/google/android/gms/internal/measurement/g;->X(ILcom/google/android/gms/internal/measurement/s;)V

    goto :goto_7

    :cond_1b
    const/4 v2, 0x1

    :goto_7
    add-int/2addr v3, v2

    const/4 v1, 0x2

    goto :goto_6

    :cond_1c
    return-object v15

    :pswitch_2
    move-object/from16 v15, p1

    move-object/from16 v5, p2

    move-object/from16 v0, p3

    const/4 v3, 0x0

    invoke-static {v15, v5, v0, v3}, Lcom/google/android/gms/internal/measurement/H;->c(Lcom/google/android/gms/internal/measurement/g;Lcom/google/android/gms/internal/measurement/f3;Ljava/util/List;Z)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v0

    return-object v0

    :pswitch_3
    move-object/from16 v15, p1

    move-object/from16 v5, p2

    move-object/from16 v0, p3

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v8, v4, v0}, Lcom/google/android/gms/internal/measurement/C2;->n(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1d

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->c()Lcom/google/android/gms/internal/measurement/s;

    move-result-object v0

    return-object v0

    :cond_1d
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v4

    int-to-double v6, v4

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/s;->f()Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/C2;->a(D)D

    move-result-wide v3

    cmpg-double v8, v3, v1

    if-gez v8, :cond_1e

    add-double/2addr v3, v6

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(DD)D

    move-result-wide v3

    goto :goto_8

    :cond_1e
    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->min(DD)D

    move-result-wide v3

    :goto_8
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x2

    if-ne v8, v9, :cond_20

    const/4 v8, 0x1

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/s;->f()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    invoke-static {v8, v9}, Lcom/google/android/gms/internal/measurement/C2;->a(D)D

    move-result-wide v8

    cmpg-double v0, v8, v1

    if-gez v0, :cond_1f

    add-double/2addr v6, v8

    invoke-static {v6, v7, v1, v2}, Ljava/lang/Math;->max(DD)D

    move-result-wide v6

    goto :goto_9

    :cond_1f
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(DD)D

    move-result-wide v6

    :cond_20
    :goto_9
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/g;-><init>()V

    double-to-int v1, v3

    :goto_a
    int-to-double v2, v1

    cmpg-double v2, v2, v6

    if-gez v2, :cond_21

    invoke-virtual {v15, v1}, Lcom/google/android/gms/internal/measurement/g;->M(I)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/g;->T(Lcom/google/android/gms/internal/measurement/s;)V

    const/4 v2, 0x1

    add-int/2addr v1, v2

    goto :goto_a

    :cond_21
    return-object v0

    :pswitch_4
    move-object/from16 v15, p1

    move-object/from16 v0, p3

    const/4 v1, 0x0

    invoke-static {v9, v1, v0}, Lcom/google/android/gms/internal/measurement/C2;->g(Ljava/lang/String;ILjava/util/List;)V

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v0

    if-nez v0, :cond_22

    sget-object v0, Lcom/google/android/gms/internal/measurement/s;->d:Lcom/google/android/gms/internal/measurement/s;

    return-object v0

    :cond_22
    invoke-virtual {v15, v1}, Lcom/google/android/gms/internal/measurement/g;->M(I)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v0

    invoke-virtual {v15, v1}, Lcom/google/android/gms/internal/measurement/g;->W(I)V

    return-object v0

    :pswitch_5
    move-object/from16 v15, p1

    move-object/from16 v5, p2

    move-object/from16 v0, p3

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v10, v2, v0}, Lcom/google/android/gms/internal/measurement/C2;->g(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/t;

    if-eqz v1, :cond_24

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v1

    if-eqz v1, :cond_23

    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v15, v5, v0, v1, v2}, Lcom/google/android/gms/internal/measurement/H;->b(Lcom/google/android/gms/internal/measurement/g;Lcom/google/android/gms/internal/measurement/f3;Lcom/google/android/gms/internal/measurement/n;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v1

    if-eq v0, v1, :cond_23

    sget-object v0, Lcom/google/android/gms/internal/measurement/s;->j:Lcom/google/android/gms/internal/measurement/s;

    return-object v0

    :cond_23
    sget-object v0, Lcom/google/android/gms/internal/measurement/s;->i:Lcom/google/android/gms/internal/measurement/s;

    return-object v0

    :cond_24
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_6
    move-object/from16 v15, p1

    move-object/from16 v5, p2

    move-object/from16 v0, p3

    const/4 v1, 0x1

    invoke-static {v11, v1, v0}, Lcom/google/android/gms/internal/measurement/C2;->n(Ljava/lang/String;ILjava/util/List;)V

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v1

    const/4 v2, 0x2

    if-lt v1, v2, :cond_27

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->a0()Ljava/util/List;

    move-result-object v1

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_26

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v0

    instance-of v2, v0, Lcom/google/android/gms/internal/measurement/n;

    if-eqz v2, :cond_25

    move-object v3, v0

    check-cast v3, Lcom/google/android/gms/internal/measurement/n;

    goto :goto_b

    :cond_25
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Comparator should be a method"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_26
    const/4 v3, 0x0

    :goto_b
    new-instance v0, Lcom/google/android/gms/internal/measurement/K;

    invoke-direct {v0, v3, v5}, Lcom/google/android/gms/internal/measurement/K;-><init>(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/f3;)V

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->b0()V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_27

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/s;

    const/4 v2, 0x1

    add-int/lit8 v4, v3, 0x1

    invoke-virtual {v15, v3, v1}, Lcom/google/android/gms/internal/measurement/g;->X(ILcom/google/android/gms/internal/measurement/s;)V

    move v3, v4

    goto :goto_c

    :cond_27
    return-object v15

    :pswitch_7
    move-object/from16 v15, p1

    move-object/from16 v5, p2

    move-object/from16 v0, p3

    const/4 v2, 0x1

    invoke-static {v12, v2, v0}, Lcom/google/android/gms/internal/measurement/C2;->g(Ljava/lang/String;ILjava/util/List;)V

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/n;

    if-eqz v1, :cond_2b

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v1

    if-eqz v1, :cond_2a

    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->Z()Ljava/util/Iterator;

    move-result-object v1

    :cond_28
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v15, v2}, Lcom/google/android/gms/internal/measurement/g;->Y(I)Z

    move-result v3

    if-eqz v3, :cond_29

    invoke-virtual {v15, v2}, Lcom/google/android/gms/internal/measurement/g;->M(I)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/measurement/k;

    int-to-double v6, v2

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-direct {v4, v2}, Lcom/google/android/gms/internal/measurement/k;-><init>(Ljava/lang/Double;)V

    const/4 v2, 0x3

    new-array v6, v2, [Lcom/google/android/gms/internal/measurement/s;

    const/4 v7, 0x0

    aput-object v3, v6, v7

    const/4 v3, 0x1

    aput-object v4, v6, v3

    const/4 v3, 0x2

    aput-object v15, v6, v3

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, v5, v3}, Lcom/google/android/gms/internal/measurement/n;->b(Lcom/google/android/gms/internal/measurement/f3;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/s;->d()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_28

    sget-object v0, Lcom/google/android/gms/internal/measurement/s;->i:Lcom/google/android/gms/internal/measurement/s;

    return-object v0

    :cond_29
    const/4 v2, 0x3

    goto :goto_d

    :cond_2a
    sget-object v0, Lcom/google/android/gms/internal/measurement/s;->j:Lcom/google/android/gms/internal/measurement/s;

    return-object v0

    :cond_2b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_8
    move-object/from16 v15, p1

    move-object/from16 v5, p2

    move-object/from16 v0, p3

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2c

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v1

    invoke-virtual {v15, v1}, Lcom/google/android/gms/internal/measurement/g;->T(Lcom/google/android/gms/internal/measurement/s;)V

    goto :goto_e

    :cond_2c
    new-instance v0, Lcom/google/android/gms/internal/measurement/k;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v1

    int-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/k;-><init>(Ljava/lang/Double;)V

    return-object v0

    :pswitch_9
    move-object/from16 v15, p1

    move-object/from16 v5, p2

    move-object/from16 v0, p3

    const/4 v1, 0x1

    invoke-static {v13, v1, v0}, Lcom/google/android/gms/internal/measurement/C2;->n(Ljava/lang/String;ILjava/util/List;)V

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v1

    if-nez v1, :cond_2d

    sget-object v0, Lcom/google/android/gms/internal/measurement/s;->k:Lcom/google/android/gms/internal/measurement/s;

    return-object v0

    :cond_2d
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_30

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/q;

    if-nez v1, :cond_2f

    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/z;

    if-eqz v1, :cond_2e

    goto :goto_f

    :cond_2e
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/s;->g()Ljava/lang/String;

    move-result-object v0

    goto :goto_10

    :cond_2f
    :goto_f
    const-string v0, ""

    goto :goto_10

    :cond_30
    const-string v0, ","

    :goto_10
    new-instance v1, Lcom/google/android/gms/internal/measurement/u;

    invoke-virtual {v15, v0}, Lcom/google/android/gms/internal/measurement/g;->V(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/u;-><init>(Ljava/lang/String;)V

    return-object v1

    :pswitch_a
    move-object/from16 v15, p1

    move-object/from16 v0, p3

    const/4 v1, 0x0

    invoke-static {v14, v1, v0}, Lcom/google/android/gms/internal/measurement/C2;->g(Ljava/lang/String;ILjava/util/List;)V

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v0

    if-nez v0, :cond_31

    sget-object v0, Lcom/google/android/gms/internal/measurement/s;->d:Lcom/google/android/gms/internal/measurement/s;

    return-object v0

    :cond_31
    const/4 v2, 0x1

    sub-int/2addr v0, v2

    invoke-virtual {v15, v0}, Lcom/google/android/gms/internal/measurement/g;->M(I)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v1

    invoke-virtual {v15, v0}, Lcom/google/android/gms/internal/measurement/g;->W(I)V

    return-object v1

    :pswitch_b
    move-object/from16 v6, p1

    move-object/from16 v5, p2

    move-object/from16 v0, p3

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v15, v2, v0}, Lcom/google/android/gms/internal/measurement/C2;->g(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/t;

    if-eqz v1, :cond_33

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v1

    if-nez v1, :cond_32

    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/g;-><init>()V

    return-object v0

    :cond_32
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    invoke-static {v6, v5, v0}, Lcom/google/android/gms/internal/measurement/H;->a(Lcom/google/android/gms/internal/measurement/g;Lcom/google/android/gms/internal/measurement/f3;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/g;

    move-result-object v0

    return-object v0

    :cond_33
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_c
    move-object/from16 v6, p1

    move-object/from16 v5, p2

    move-object/from16 v0, p3

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_37

    new-instance v1, Lcom/google/android/gms/internal/measurement/g;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/g;-><init>()V

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_35

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v2

    instance-of v3, v2, Lcom/google/android/gms/internal/measurement/l;

    if-nez v3, :cond_34

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/g;->T(Lcom/google/android/gms/internal/measurement/s;)V

    goto :goto_11

    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Argument evaluation failed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_35
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->Z()Ljava/util/Iterator;

    move-result-object v2

    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_36

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    add-int/2addr v4, v0

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v6, v3}, Lcom/google/android/gms/internal/measurement/g;->M(I)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Lcom/google/android/gms/internal/measurement/g;->X(ILcom/google/android/gms/internal/measurement/s;)V

    goto :goto_12

    :cond_36
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->b0()V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/g;->Z()Ljava/util/Iterator;

    move-result-object v0

    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_37

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/g;->M(I)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v2

    invoke-virtual {v6, v3, v2}, Lcom/google/android/gms/internal/measurement/g;->X(ILcom/google/android/gms/internal/measurement/s;)V

    goto :goto_13

    :cond_37
    new-instance v0, Lcom/google/android/gms/internal/measurement/k;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v1

    int-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/k;-><init>(Ljava/lang/Double;)V

    return-object v0

    :pswitch_d
    move-object/from16 v6, p1

    move-object/from16 v5, p2

    move-object/from16 v0, p3

    const/4 v3, 0x2

    invoke-static {v4, v3, v0}, Lcom/google/android/gms/internal/measurement/C2;->n(Ljava/lang/String;ILjava/util/List;)V

    sget-object v3, Lcom/google/android/gms/internal/measurement/s;->d:Lcom/google/android/gms/internal/measurement/s;

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_38

    const/4 v4, 0x0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v3

    :cond_38
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v4

    const/4 v7, 0x1

    sub-int/2addr v4, v7

    int-to-double v8, v4

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v4

    if-le v4, v7, :cond_3a

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/s;->f()Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    move-result v4

    if-eqz v4, :cond_39

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v0

    sub-int/2addr v0, v7

    int-to-double v4, v0

    :goto_14
    move-wide v8, v4

    goto :goto_15

    :cond_39
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/s;->f()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/measurement/C2;->a(D)D

    move-result-wide v4

    goto :goto_14

    :goto_15
    cmpg-double v0, v8, v1

    if-gez v0, :cond_3a

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v0

    int-to-double v4, v0

    add-double/2addr v8, v4

    :cond_3a
    cmpg-double v0, v8, v1

    if-gez v0, :cond_3b

    new-instance v0, Lcom/google/android/gms/internal/measurement/k;

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/k;-><init>(Ljava/lang/Double;)V

    return-object v0

    :cond_3b
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1, v8, v9}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    double-to-int v0, v0

    :goto_16
    if-ltz v0, :cond_3d

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/measurement/g;->Y(I)Z

    move-result v1

    if-eqz v1, :cond_3c

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/measurement/g;->M(I)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v1

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/C2;->h(Lcom/google/android/gms/internal/measurement/s;Lcom/google/android/gms/internal/measurement/s;)Z

    move-result v1

    if-eqz v1, :cond_3c

    new-instance v1, Lcom/google/android/gms/internal/measurement/k;

    int-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/k;-><init>(Ljava/lang/Double;)V

    return-object v1

    :cond_3c
    add-int/lit8 v0, v0, -0x1

    goto :goto_16

    :cond_3d
    new-instance v0, Lcom/google/android/gms/internal/measurement/k;

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/k;-><init>(Ljava/lang/Double;)V

    return-object v0

    :pswitch_e
    move-object/from16 v6, p1

    move-object/from16 v5, p2

    move-object/from16 v0, p3

    move-object/from16 v1, v20

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/measurement/C2;->g(Ljava/lang/String;ILjava/util/List;)V

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/t;

    if-eqz v1, :cond_3f

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->D()I

    move-result v1

    if-nez v1, :cond_3e

    sget-object v0, Lcom/google/android/gms/internal/measurement/s;->d:Lcom/google/android/gms/internal/measurement/s;

    return-object v0

    :cond_3e
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    invoke-static {v6, v5, v0}, Lcom/google/android/gms/internal/measurement/H;->a(Lcom/google/android/gms/internal/measurement/g;Lcom/google/android/gms/internal/measurement/f3;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/g;

    sget-object v0, Lcom/google/android/gms/internal/measurement/s;->d:Lcom/google/android/gms/internal/measurement/s;

    return-object v0

    :cond_3f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_f
    move-object/from16 v6, p1

    move-object/from16 v5, p2

    move-object/from16 v0, p3

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_40

    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/g;-><init>()V

    return-object v0

    :cond_40
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/s;->f()Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/C2;->a(D)D

    move-result-wide v2

    double-to-int v2, v2

    if-gez v2, :cond_41

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v3

    add-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_17

    :cond_41
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v1

    if-le v2, v1, :cond_42

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v2

    :cond_42
    :goto_17
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v1

    new-instance v3, Lcom/google/android/gms/internal/measurement/g;

    invoke-direct {v3}, Lcom/google/android/gms/internal/measurement/g;-><init>()V

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v4

    const/4 v7, 0x1

    if-le v4, v7, :cond_46

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v4

    invoke-interface {v4}, Lcom/google/android/gms/internal/measurement/s;->f()Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/google/android/gms/internal/measurement/C2;->a(D)D

    move-result-wide v7

    double-to-int v4, v7

    const/4 v7, 0x0

    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    if-lez v4, :cond_43

    move v7, v2

    :goto_18
    add-int v8, v2, v4

    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    if-ge v7, v8, :cond_43

    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/measurement/g;->M(I)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v8

    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/measurement/g;->T(Lcom/google/android/gms/internal/measurement/s;)V

    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/measurement/g;->W(I)V

    const/4 v8, 0x1

    add-int/2addr v7, v8

    goto :goto_18

    :cond_43
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v1

    const/4 v4, 0x2

    if-le v1, v4, :cond_45

    move v1, v4

    :goto_19
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v7

    if-ge v1, v7, :cond_45

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v7

    instance-of v8, v7, Lcom/google/android/gms/internal/measurement/l;

    if-nez v8, :cond_44

    add-int v8, v2, v1

    sub-int/2addr v8, v4

    invoke-virtual {v6, v8, v7}, Lcom/google/android/gms/internal/measurement/g;->S(ILcom/google/android/gms/internal/measurement/s;)V

    const/4 v7, 0x1

    add-int/2addr v1, v7

    goto :goto_19

    :cond_44
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed to parse elements to add"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_45
    return-object v3

    :cond_46
    :goto_1a
    if-ge v2, v1, :cond_47

    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/measurement/g;->M(I)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/measurement/g;->T(Lcom/google/android/gms/internal/measurement/s;)V

    const/4 v0, 0x0

    invoke-virtual {v6, v2, v0}, Lcom/google/android/gms/internal/measurement/g;->X(ILcom/google/android/gms/internal/measurement/s;)V

    const/4 v4, 0x1

    add-int/2addr v2, v4

    goto :goto_1a

    :cond_47
    return-object v3

    :pswitch_10
    move-object/from16 v6, p1

    move-object/from16 v5, p2

    move-object/from16 v0, p3

    const/4 v4, 0x1

    invoke-static {v6, v5, v0, v4}, Lcom/google/android/gms/internal/measurement/H;->c(Lcom/google/android/gms/internal/measurement/g;Lcom/google/android/gms/internal/measurement/f3;Ljava/util/List;Z)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v0

    return-object v0

    :pswitch_11
    move-object/from16 v6, p1

    move-object/from16 v5, p2

    move-object/from16 v0, p3

    move-object/from16 v1, v21

    const/4 v4, 0x1

    invoke-static {v1, v4, v0}, Lcom/google/android/gms/internal/measurement/C2;->g(Ljava/lang/String;ILjava/util/List;)V

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/t;

    if-eqz v1, :cond_4a

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->D()I

    move-result v1

    if-nez v1, :cond_48

    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/g;-><init>()V

    return-object v0

    :cond_48
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->c()Lcom/google/android/gms/internal/measurement/s;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/g;

    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v3, 0x0

    invoke-static {v6, v5, v0, v3, v2}, Lcom/google/android/gms/internal/measurement/H;->b(Lcom/google/android/gms/internal/measurement/g;Lcom/google/android/gms/internal/measurement/f3;Lcom/google/android/gms/internal/measurement/n;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/g;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/measurement/g;

    invoke-direct {v2}, Lcom/google/android/gms/internal/measurement/g;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/g;->Z()Ljava/util/Iterator;

    move-result-object v0

    :goto_1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_49

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/measurement/g;->M(I)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/measurement/g;->T(Lcom/google/android/gms/internal/measurement/s;)V

    goto :goto_1b

    :cond_49
    return-object v2

    :cond_4a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_12
    move-object/from16 v6, p1

    move-object/from16 v5, p2

    move-object/from16 v0, p3

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->c()Lcom/google/android/gms/internal/measurement/s;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/g;

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4e

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4b
    :goto_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v2

    instance-of v3, v2, Lcom/google/android/gms/internal/measurement/l;

    if-nez v3, :cond_4d

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/g;->U()I

    move-result v3

    instance-of v4, v2, Lcom/google/android/gms/internal/measurement/g;

    if-eqz v4, :cond_4c

    check-cast v2, Lcom/google/android/gms/internal/measurement/g;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/g;->Z()Ljava/util/Iterator;

    move-result-object v4

    :goto_1d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v7

    add-int/2addr v7, v3

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/measurement/g;->M(I)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v6

    invoke-virtual {v1, v7, v6}, Lcom/google/android/gms/internal/measurement/g;->X(ILcom/google/android/gms/internal/measurement/s;)V

    goto :goto_1d

    :cond_4c
    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/internal/measurement/g;->X(ILcom/google/android/gms/internal/measurement/s;)V

    goto :goto_1c

    :cond_4d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Failed evaluation of arguments"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4e
    return-object v1

    :pswitch_13
    move-object/from16 v6, p1

    move-object/from16 v0, p3

    move-object v1, v5

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/measurement/C2;->g(Ljava/lang/String;ILjava/util/List;)V

    new-instance v0, Lcom/google/android/gms/internal/measurement/u;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/g;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/u;-><init>(Ljava/lang/String;)V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x69e9ad94 -> :sswitch_13
        -0x50c088ec -> :sswitch_12
        -0x4bf73488 -> :sswitch_11
        -0x37b90a9a -> :sswitch_10
        -0x3565b984 -> :sswitch_f
        -0x28732996 -> :sswitch_e
        -0x1bdda92d -> :sswitch_d
        -0x108c6a77 -> :sswitch_c
        0x1a55c -> :sswitch_b
        0x1b251 -> :sswitch_a
        0x31dd2a -> :sswitch_9
        0x34af1a -> :sswitch_8
        0x35f4f4 -> :sswitch_7
        0x35f59e -> :sswitch_6
        0x5c6731b -> :sswitch_5
        0x6856c82 -> :sswitch_4
        0x6873d92 -> :sswitch_3
        0x398d4c56 -> :sswitch_2
        0x418e52e2 -> :sswitch_1
        0x73d44649 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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
.end method
