.class public final LR2/c;
.super LR2/d;
.source "SourceFile"


# instance fields
.field public g:Lcom/google/android/gms/internal/measurement/A1;

.field public final synthetic h:LR2/b6;


# direct methods
.method public constructor <init>(LR2/b6;Ljava/lang/String;ILcom/google/android/gms/internal/measurement/A1;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/c;->h:LR2/b6;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, LR2/d;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    iput-object p4, p0, LR2/c;->g:Lcom/google/android/gms/internal/measurement/A1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, LR2/c;->g:Lcom/google/android/gms/internal/measurement/A1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/A1;->k()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final j()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final k(Ljava/lang/Long;Ljava/lang/Long;Lcom/google/android/gms/internal/measurement/h2;Z)Z
    .locals 10

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/A6;->a()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LR2/c;->h:LR2/b6;

    invoke-virtual {v0}, LR2/m3;->f()LR2/g;

    move-result-object v0

    iget-object v3, p0, LR2/d;->a:Ljava/lang/String;

    sget-object v4, LR2/K;->h0:LR2/P1;

    invoke-virtual {v0, v3, v4}, LR2/g;->D(Ljava/lang/String;LR2/P1;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v3, p0, LR2/c;->g:Lcom/google/android/gms/internal/measurement/A1;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/A1;->M()Z

    move-result v3

    iget-object v4, p0, LR2/c;->g:Lcom/google/android/gms/internal/measurement/A1;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/A1;->N()Z

    move-result v4

    iget-object v5, p0, LR2/c;->g:Lcom/google/android/gms/internal/measurement/A1;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/A1;->O()Z

    move-result v5

    if-nez v3, :cond_2

    if-nez v4, :cond_2

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    move v3, v1

    goto :goto_2

    :cond_2
    :goto_1
    move v3, v2

    :goto_2
    const/4 v4, 0x0

    if-eqz p4, :cond_4

    if-nez v3, :cond_4

    iget-object p1, p0, LR2/c;->h:LR2/b6;

    invoke-virtual {p1}, LR2/m3;->j()LR2/Y1;

    move-result-object p1

    invoke-virtual {p1}, LR2/Y1;->K()LR2/a2;

    move-result-object p1

    iget p2, p0, LR2/d;->b:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object p3, p0, LR2/c;->g:Lcom/google/android/gms/internal/measurement/A1;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/A1;->P()Z

    move-result p3

    if-eqz p3, :cond_3

    iget-object p3, p0, LR2/c;->g:Lcom/google/android/gms/internal/measurement/A1;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/A1;->k()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :cond_3
    const-string p3, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"

    invoke-virtual {p1, p3, p2, v4}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return v2

    :cond_4
    iget-object v6, p0, LR2/c;->g:Lcom/google/android/gms/internal/measurement/A1;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/A1;->I()Lcom/google/android/gms/internal/measurement/y1;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/y1;->N()Z

    move-result v7

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/h2;->d0()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/y1;->P()Z

    move-result v8

    if-nez v8, :cond_5

    iget-object v6, p0, LR2/c;->h:LR2/b6;

    invoke-virtual {v6}, LR2/m3;->j()LR2/Y1;

    move-result-object v6

    invoke-virtual {v6}, LR2/Y1;->L()LR2/a2;

    move-result-object v6

    iget-object v7, p0, LR2/c;->h:LR2/b6;

    invoke-virtual {v7}, LR2/m3;->h()LR2/X1;

    move-result-object v7

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/h2;->Z()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "No number filter for long property. property"

    :goto_3
    invoke-virtual {v6, v8, v7}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_5
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/h2;->U()J

    move-result-wide v8

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/y1;->K()Lcom/google/android/gms/internal/measurement/z1;

    move-result-object v4

    invoke-static {v8, v9, v4}, LR2/d;->c(JLcom/google/android/gms/internal/measurement/z1;)Ljava/lang/Boolean;

    move-result-object v4

    :goto_4
    invoke-static {v4, v7}, LR2/d;->d(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object v4

    goto/16 :goto_5

    :cond_6
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/h2;->b0()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/y1;->P()Z

    move-result v8

    if-nez v8, :cond_7

    iget-object v6, p0, LR2/c;->h:LR2/b6;

    invoke-virtual {v6}, LR2/m3;->j()LR2/Y1;

    move-result-object v6

    invoke-virtual {v6}, LR2/Y1;->L()LR2/a2;

    move-result-object v6

    iget-object v7, p0, LR2/c;->h:LR2/b6;

    invoke-virtual {v7}, LR2/m3;->h()LR2/X1;

    move-result-object v7

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/h2;->Z()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "No number filter for double property. property"

    goto :goto_3

    :cond_7
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/h2;->G()D

    move-result-wide v8

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/y1;->K()Lcom/google/android/gms/internal/measurement/z1;

    move-result-object v4

    invoke-static {v8, v9, v4}, LR2/d;->b(DLcom/google/android/gms/internal/measurement/z1;)Ljava/lang/Boolean;

    move-result-object v4

    goto :goto_4

    :cond_8
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/h2;->f0()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/y1;->R()Z

    move-result v8

    if-nez v8, :cond_b

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/y1;->P()Z

    move-result v8

    if-nez v8, :cond_9

    iget-object v6, p0, LR2/c;->h:LR2/b6;

    invoke-virtual {v6}, LR2/m3;->j()LR2/Y1;

    move-result-object v6

    invoke-virtual {v6}, LR2/Y1;->L()LR2/a2;

    move-result-object v6

    iget-object v7, p0, LR2/c;->h:LR2/b6;

    invoke-virtual {v7}, LR2/m3;->h()LR2/X1;

    move-result-object v7

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/h2;->Z()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "No string or number filter defined. property"

    goto :goto_3

    :cond_9
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/h2;->a0()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, LR2/N5;->f0(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/h2;->a0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/y1;->K()Lcom/google/android/gms/internal/measurement/z1;

    move-result-object v6

    invoke-static {v4, v6}, LR2/d;->e(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/z1;)Ljava/lang/Boolean;

    move-result-object v4

    goto :goto_4

    :cond_a
    iget-object v6, p0, LR2/c;->h:LR2/b6;

    invoke-virtual {v6}, LR2/m3;->j()LR2/Y1;

    move-result-object v6

    invoke-virtual {v6}, LR2/Y1;->L()LR2/a2;

    move-result-object v6

    iget-object v7, p0, LR2/c;->h:LR2/b6;

    invoke-virtual {v7}, LR2/m3;->h()LR2/X1;

    move-result-object v7

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/h2;->Z()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/h2;->a0()Ljava/lang/String;

    move-result-object v8

    const-string v9, "Invalid user property value for Numeric number filter. property, value"

    invoke-virtual {v6, v9, v7, v8}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :cond_b
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/h2;->a0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/y1;->L()Lcom/google/android/gms/internal/measurement/B1;

    move-result-object v6

    iget-object v8, p0, LR2/c;->h:LR2/b6;

    invoke-virtual {v8}, LR2/m3;->j()LR2/Y1;

    move-result-object v8

    invoke-static {v4, v6, v8}, LR2/d;->g(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/B1;LR2/Y1;)Ljava/lang/Boolean;

    move-result-object v4

    goto/16 :goto_4

    :cond_c
    iget-object v6, p0, LR2/c;->h:LR2/b6;

    invoke-virtual {v6}, LR2/m3;->j()LR2/Y1;

    move-result-object v6

    invoke-virtual {v6}, LR2/Y1;->L()LR2/a2;

    move-result-object v6

    iget-object v7, p0, LR2/c;->h:LR2/b6;

    invoke-virtual {v7}, LR2/m3;->h()LR2/X1;

    move-result-object v7

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/h2;->Z()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "User property has no value, property"

    goto/16 :goto_3

    :goto_5
    iget-object v6, p0, LR2/c;->h:LR2/b6;

    invoke-virtual {v6}, LR2/m3;->j()LR2/Y1;

    move-result-object v6

    invoke-virtual {v6}, LR2/Y1;->K()LR2/a2;

    move-result-object v6

    if-nez v4, :cond_d

    const-string v7, "null"

    goto :goto_6

    :cond_d
    move-object v7, v4

    :goto_6
    const-string v8, "Property filter result"

    invoke-virtual {v6, v8, v7}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    if-nez v4, :cond_e

    return v1

    :cond_e
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, p0, LR2/d;->c:Ljava/lang/Boolean;

    if-eqz v5, :cond_f

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    if-eqz p4, :cond_10

    iget-object p4, p0, LR2/c;->g:Lcom/google/android/gms/internal/measurement/A1;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/measurement/A1;->M()Z

    move-result p4

    if-eqz p4, :cond_11

    :cond_10
    iput-object v4, p0, LR2/d;->d:Ljava/lang/Boolean;

    :cond_11
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-eqz p4, :cond_15

    if-eqz v3, :cond_15

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/h2;->e0()Z

    move-result p4

    if-eqz p4, :cond_15

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/h2;->W()J

    move-result-wide p3

    if-eqz p1, :cond_12

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    :cond_12
    if-eqz v0, :cond_13

    iget-object p1, p0, LR2/c;->g:Lcom/google/android/gms/internal/measurement/A1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/A1;->M()Z

    move-result p1

    if-eqz p1, :cond_13

    iget-object p1, p0, LR2/c;->g:Lcom/google/android/gms/internal/measurement/A1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/A1;->N()Z

    move-result p1

    if-nez p1, :cond_13

    if-eqz p2, :cond_13

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    :cond_13
    iget-object p1, p0, LR2/c;->g:Lcom/google/android/gms/internal/measurement/A1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/A1;->N()Z

    move-result p1

    if-eqz p1, :cond_14

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LR2/d;->f:Ljava/lang/Long;

    goto :goto_7

    :cond_14
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LR2/d;->e:Ljava/lang/Long;

    :cond_15
    :goto_7
    return v2
.end method
