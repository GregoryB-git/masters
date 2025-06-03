.class public final Lcom/google/android/gms/measurement/a;
.super Lcom/google/android/gms/measurement/AppMeasurement$a;
.source "SourceFile"


# instance fields
.field public final a:LR2/N2;

.field public final b:LR2/C3;


# direct methods
.method public constructor <init>(LR2/N2;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/AppMeasurement$a;-><init>(LP2/a;)V

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/android/gms/measurement/a;->a:LR2/N2;

    .line 9
    .line 10
    invoke-virtual {p1}, LR2/N2;->H()LR2/C3;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/google/android/gms/measurement/a;->b:LR2/C3;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->a:LR2/N2;

    invoke-virtual {v0}, LR2/N2;->L()LR2/S5;

    move-result-object v0

    invoke-virtual {v0}, LR2/S5;->P0()J

    move-result-wide v0

    return-wide v0
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->b:LR2/C3;

    invoke-virtual {v0, p1, p2}, LR2/C3;->C(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->b:LR2/C3;

    invoke-virtual {v0}, LR2/C3;->i0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->b:LR2/C3;

    invoke-virtual {v0}, LR2/C3;->i0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final i(Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    const/16 p1, 0x19

    return p1
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->b:LR2/C3;

    invoke-virtual {v0}, LR2/C3;->k0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final l(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->b:LR2/C3;

    invoke-virtual {v0, p1}, LR2/C3;->w0(Landroid/os/Bundle;)V

    return-void
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->b:LR2/C3;

    invoke-virtual {v0}, LR2/C3;->j0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final q(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->a:LR2/N2;

    invoke-virtual {v0}, LR2/N2;->y()LR2/B;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/a;->a:LR2/N2;

    invoke-virtual {v1}, LR2/N2;->b()LE2/e;

    move-result-object v1

    invoke-interface {v1}, LE2/e;->b()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, LR2/B;->D(Ljava/lang/String;J)V

    return-void
.end method

.method public final r(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->a:LR2/N2;

    invoke-virtual {v0}, LR2/N2;->H()LR2/C3;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, LR2/C3;->X(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final s(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->a:LR2/N2;

    invoke-virtual {v0}, LR2/N2;->y()LR2/B;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/a;->a:LR2/N2;

    invoke-virtual {v1}, LR2/N2;->b()LE2/e;

    move-result-object v1

    invoke-interface {v1}, LE2/e;->b()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, LR2/B;->z(Ljava/lang/String;J)V

    return-void
.end method

.method public final t(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->b:LR2/C3;

    invoke-virtual {v0, p1, p2, p3}, LR2/C3;->D(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final u(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->b:LR2/C3;

    invoke-virtual {v0, p1, p2, p3}, LR2/C3;->y0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
